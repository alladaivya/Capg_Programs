import React from "react";
import {NavLink} from 'react-router-dom';
import HomeIcon from "@mui/icons-material/Home";
//import SignUpIcon from "@mui/icons-material/SignUp";
//import CardIcon from "@mui/icons-material/";
//import LogOutIcon from "@mui/icons-material/LogOut";
//import ContactUsIcon from "@mui/icons-material/ContactUs";

class NavBar extends React.Component {
    render() {
        return (
            <div>
                <nav className="navbar navbar-expand-sm navbar-dark bg-dark text-white">
                    <div className="container-fluid">
                        <NavLink className="navbar-brand" to='/'>
                           <b>CreditCard App</b>
                        </NavLink>
                        <button
                            className="navbar-toggler"
                            type="button"
                            data-bs-toggle="collapse"
                            data-bs-target="#navbarSupportedContent"
                            aria-controls="navbarSupportedContent"
                            aria-expanded="false"
                            aria-label="Toggle navigation"
                        >
                            <span className="navbar-toggler-icon"></span>
                        </button>
                        <div
                            className="collapse navbar-collapse"
                            id="navbarSupportedContent"
                        >
                            <ul className="navbar-nav nav-pills me-auto mb-2 mb-md-0">
                                <li className="nav-item">
                                    <NavLink className="nav-link" aria-current="page" to='/home'>                               
                                        <i className="fa fa-fw fa-home"/>
                                        Home
                                        <HomeIcon />
                                    </NavLink>
                                </li>
                                <li className="nav-item">
                                    <NavLink className="nav-link" to='/creditcard'>
                                        <i className="fa fa-fw fa-card"/>
                                        CreditCard
                                    </NavLink>
                                </li>
                                <li className="nav-item">
                                    <NavLink className="nav-link" to='/about'>
                                        <i className="fa fa-fw fa-book-open"/>
                                        
                                    </NavLink>
                                </li>
                                <li className="nav-item">
                                    <NavLink className="nav-link" to="/customer">
                                        <i className="fa fa-fw fa-"/>
                                        Customer
                                    </NavLink>
                                </li>
                            </ul>
                            <form className="d-flex">
                                <input
                                    className="form-control form-sm me-2"
                                    type="search"
                                    placeholder="Search"
                                    aria-label="Search"
                                />
                                <button
                                    className="btn btn-sm btn-dark"
                                    type="submit"
                                >
                                    Search
                                </button>
                            </form>
                            <ul className="navbar-nav nav-pills ms-auto mb-2 mb-lg-0">
                                <li className="nav-item">
                                    <NavLink className="nav-link" to="/user">
                                        <i className="fa fa-fw fa-user-plus"/>
                                        User
                                    </NavLink>
                                </li>
                                <li className="nav-item">
                                    <NavLink className="nav-link" to="/signup">
                                        <i className="fa fa-fw fa-sign-un-alt"/>
                                        SignUp
                                        
                                    </NavLink>
                                </li>
                                <li className="nav-item">
                                    <NavLink className="nav-link" to="/login">
                                        <i className="fa fa-fw fa-user-plus"/>
                                        LogIn
                                        
                                    </NavLink>
                                </li>
                                {/* <li className="nav-item">
                                    <a className="nav-link" href="#">
                                        Logout
                                    </a>
                                </li> */}
                                <li className="nav-item">
                                    <NavLink className="nav-link" to="/contactus">
                                        <i className="bi bi-telephone"/>
                                        ContactUs
                                    </NavLink>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>
            </div>
        );
    }
}

export default NavBar; 