import React from 'react';
import 'bootstrap/dist/css/bootstrap.css';
import { Link } from 'react-router-dom';

export class NavigationBar extends React.Component{
    render() {
        return(
            <nav>
                    <ul>
                        <Link to="/">Home</Link>
                        {/*<li className="nav-item active">*/}
                        {/*    <a className="nav-link" href="#">Home</a>*/}
                        {/*</li>*/}
                        <Link to="/albums">Albums</Link>
                        {/*<li className="nav-item">*/}
                        {/*    <a className="nav-link" href="#">Albums</a>*/}
                        {/*</li>*/}
                        {/*<li className="nav-item">*/}
                        {/*    <a className="nav-link" href="#">Profile</a>*/}
                        {/*</li>*/}
                    </ul>
            </nav>
        )
    }
}