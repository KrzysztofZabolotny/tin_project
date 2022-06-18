# Getting Started with Crypto Currency Price Analysis App

This project was bootstrapped with [Create React App](https://github.com/facebook/create-react-app).


## Frontend ( React )

### Before running you need to install

In the project directory, you can run:


### `npm install react-bootstrap bootstrap`
### `npm install axios@0.22.0`
### `npm i react-chartjs-2 chart.js`
### `npm install react-router-dom@5`
### `npm install autoprefixer@10.4.5 --save-exact`

### Now you can run

### `npm start`

Runs the app in the development mode.\

Open [http://localhost:3000](http://localhost:3000) to view it in your browser.

The page will reload when you make changes.\
You may also see any lint errors in the console.


## Backend ( Spring-Boot )

### Open the project in Intellij Ultimate

#### On windows
### `Shift+F10`

#### Server will start up and will be ready to take in requests

# Functionality

The application allows you to check cryptocurrency prices from the Coinmarketcap website\
[https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest](https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest) \
\
The currency prices are shown in the coins tab.
[http://localhost:3000/coins](http://localhost:3000/coins)

The user can also see the historical price chart thirty days back.\
[http://localhost:3000/chart](http://localhost:3000/chart)

The application allows you to save a new user in the database. \
[http://localhost:3000/register](http://localhost:3000/register) \
\
It allows you to generate a JSON Web Token and store it in localstorage. \
[http://localhost:3000/authenticate](http://localhost:3000/authenticate)


