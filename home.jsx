import React from "react";
import Footer from "../components/footer";
import Account from "../images/account.jpg";
import CreditCard from "../images/creditcard.jpg";
import Customer from "../images/customer.jpg";
//import Payment from "../components/payment";
import Pic from "../images/img1.jpg";
import Pic2 from "../images/img2.jpg";
import Pic3 from "../images/img4.jpg";
import { Link } from "react-router-dom";
//import SimpleImageSlider from "react-simple-image-slider";

class Home extends React.Component {
  render() {
    return (
      <div>
        <div className="container-fluid bg-dark">
          <div
            id="carouselExampleFade"
            class="carousel slide carousel-fade opacity-50"
            data-bs-ride="carousel" >
            <div class="carousel-inner pt-5 padding 20px">
              <div class="carousel-item active mx auto" data-bs-interval="1000">
                <img src={Pic} class="rounded w-76" height="450 " alt="..." />
              </div>
              <div class="carousel-item" data-bs-interval="1000">
                <img
                  src={Pic2} class="rounded w-100" height="450" width="850" alt="..." />
              </div>
              <div class="carousel-item" data-bs-interval="1000">
                <img src={Pic3} class="rounded w-90" height="450" width="765" alt="..." />
              </div>
            </div>
            <button
              class="carousel-control-prev"
              type="button"
              data-bs-target="#carouselExampleFade"
              data-bs-slide="prev">
              <span
                class="carousel-control-prev-icon"
                aria-hidden="true"
              ></span>
              <span class="visually-hidden">Previous</span>
            </button>
            <button
              class="carousel-control-next"
              type="button"
              data-bs-target="#carouselExampleFade"
              data-bs-slide="next"
            >
              <span
                class="carousel-control-next-icon"
                aria-hidden="true"
              ></span>
              <span class="visually-hidden">Next</span>
            </button>
          </div>
          <div class=" row mt-5 " style={{ margin: "10px" }}>
            <div class="card" style={{ width: "16rem", margin: "10px" }}>
              <img src={Account} class="card-img-top" width="200px" alt="..." />
              <div class="card-body">
                {/*<a href="#" class="btn btn-primary">*/} 
                <Link to="/account" className="btn btn-success">
                  Account
                </Link>
              </div>
            </div>
            <div class="card " style={{ width: "16rem", margin: "10px" }}>
              <img src={CreditCard} class="card-img-top" width="200px" alt="..." />
              <div class="card-body">
                {/* <a href="#" class="btn btn-primary"> */}
                <Link to="/creditcard" className="btn btn-success">
                  CreditCard
                </Link>
              </div>
            </div>
            <div class="card " style={{ width: "16rem", margin: "10px" }}>
              <img src={Customer} class="card-img-top" width="200px" height="190px" alt="..." />
              <div class="card-body">
                {/* <a href="#" class="btn btn-primary"> */}
                <Link to="/customer" className="btn btn-success">
                  Customer
                </Link>
              </div>
            </div>
          </div>
          <Footer />
        </div>
        </div>
    );
  }
}

export default Home;
