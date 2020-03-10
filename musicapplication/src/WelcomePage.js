import React from "react";
import {NavigationBar} from "./NavigationBar";
import 'bootstrap/dist/css/bootstrap.css';

export class WelcomePage extends React.Component{
    render() {
        return (
            <div className="container-fluid">
                <header>
                    <NavigationBar />
                    <div className="parallax">
                        <div className="main-container">
                            <div id="root"></div>
                            <p className="lead">The app that let's you listen to music, follow your favorite artists,
                                and save your favorite songs and albums.</p>
                            <p className="lead">Keep scrolling for more info or sign up for an account.</p>
                        </div>
                    </div>
                </header>

                <main>
                    <div className="register">
                        <p>Test body to see if it works</p>
                    </div>
                </main>
            </div>
        )
    }

}