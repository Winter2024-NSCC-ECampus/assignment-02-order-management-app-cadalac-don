// Grab the elements we'll be working with
const addToCartButtons = document.querySelectorAll('.add-to-cart');
const cartItems = document.getElementById('cart-items');
const totalPriceElem = document.getElementById('total-price');

// Store cart data
let cart = [];
let totalPrice = 0;


if(document.cookie === ""){
    const cartList = [];
    setCart(cart);
}
else{
    cart = getCart();
    console.log(cart);

    cart.forEach(p => totalPrice += p.price*p.quantity);
}
updateCart();

function setCart(cart) {
    document.cookie = `cart=${JSON.stringify(cart)}; path=/`;
}

function getCart(){
    const cookieWorks = document.cookie.split('=')[1].split(';')[0];
    console.log(document.cookie);
    return JSON.parse(cookieWorks);
}

// Function to update the cart
function updateCart() {

    cart = getCart();

    // Clear current cart items in HTML
    cartItems.innerHTML = '';

    // Add cart items to the HTML
    cart.forEach(item => {
        const li = document.createElement('li');
        li.textContent = `${item.name} - $${item.price} - Quantity ${item.quantity}`;
        cartItems.appendChild(li);
    });

    // Update the total price
    totalPriceElem.textContent = totalPrice;

}

// Add event listeners to all "Add to Cart" buttons
addToCartButtons.forEach(button => {
    button.addEventListener('click', () => {

        console.log(button.getAttribute('data-product'));
        const productID = button.getAttribute('data-id');
        const productName = button.getAttribute('data-name');
        const productPrice = parseFloat(button.getAttribute('data-price'));

        let cart = getCart();
        let product = false;
        cart.forEach(p => {
            if(p.id === productID){
                p.quantity++;
                product = p;
            }
        })
        totalPrice += productPrice;

        if(!product) {
            product = {
                name: productName,
                price: productPrice,
                id: productID,
                quantity: 1
            }

            cart.push(product);
        }
        console.log(cart);
        setCart(cart);
        updateCart();
    });
});

function redirectPage() {
    console.log("Purchase");
    window.location.href = '/information';
}

function displayCookies() {

    let displayCookies = document.getElementById("display");
    displayCookies.innerHTML = getCart();
}

function clearCookies() {

    setCart("[]");
    totalPrice = 0;
    console.log("Cookies after clearing:", document.cookie);
    updateCart();
}