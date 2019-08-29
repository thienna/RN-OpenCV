/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, {Fragment} from 'react';
import {SafeAreaView, StatusBar} from 'react-native';

import {Toast} from './src/ScanImage';
import Container from './src/Container';

const App = () => {
  Toast.show('LOL', Toast.SHORT);
  return (
    <SafeAreaView style={{flex: 1}}>
      <Container />
    </SafeAreaView>
  );
};

export default App;
