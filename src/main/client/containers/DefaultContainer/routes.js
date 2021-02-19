import React from 'react';
import { Switch, Route } from 'react-router-dom';

import Home from '../HomeContainer';
import Setting from '../SettingContainer';
import Cloth from '../ClothContainer';
import LotsContainer from '../Lots/index';
import Retailer from '../RetailerContainer';
import RetailerBills from '../RetailerBills';
import configureStore from '../../store';

const RoutesToRender = () => (
  <Switch>
    <Route
      exact
      path="/home"
      component={Home}
    />
    <Route
      exact
      path="/setting"
      component={Setting}
    />
    <Route
      exact
      path="/Lots"
      component={LotsContainer}
    />
    <Route
      exact
      path="/RetailerBills"
      render={() => <RetailerBills store1={configureStore()} />}
    />
    <Route
      exact
      path="/cloth-setting"
      component={Cloth}
    />
    <Route
      exact
      path="/retailer-setting"
      component={Retailer}
    />
  </Switch>
);

export default RoutesToRender;
