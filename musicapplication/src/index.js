// import React from 'react';
// import ReactDOM from 'react-dom';
// import './index.css';
// import {WelcomePage} from './WelcomePage.js';
// import {BrowserRouter as Router, Route, Switch } from 'react-router-dom';
// import {Albums} from "./Albums";
//
// class Index extends React.Component{
//     constructor(props){
//         super(props);
//
//         this.state = {
//             albums: []
//         }
//     }
//
//     render() {
//         return (
//                 <Router>
//                     <WelcomePage />
//
//                     <Switch>
//                         <Route exact path="/" render={(props) => (
//                             <WelcomePage />
//                         )}/>
//                         <Route exact path="/albums" component={Albums} />
//
//                     </Switch>
//                 </Router>
//             )
//
//     }
// }
// // const myFirstElement = <h1 className="dislay-4">Welcome to Tempo</h1>
// ReactDOM.render(<Index />, document.getElementById('albums'));
//
// // If you want your app to work offline and load faster, you can change
// // unregister() to register() below. Note this comes with some pitfalls.
// // Learn more about service workers: https://bit.ly/CRA-PWA
// // serviceWorker.unregister();
import React from 'react';
import ReactDom from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';

ReactDom.render(<App />, document.getElementById('albums'));

serviceWorker.unregister();