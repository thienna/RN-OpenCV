package com.scanbillapp;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nonnull;

public class ScanImageModule extends ReactContextBaseJavaModule {

    public ScanImageModule(@Nonnull ReactApplicationContext reactContext) {
        super(reactContext);
    }

    private static final String DURATION_SHORT = "SHORT";
    private static final String DURATION_LONG = "LONg";

    @Nonnull
    @Override
    public String getName() {
        return "ScanImage";
    }

    @Override
    public Map<String, Object> getConstants() {
        final Map<String, Object> constants = new HashMap<>();
        constants.put(DURATION_SHORT, Toast.LENGTH_SHORT);
        constants.put(DURATION_LONG, Toast.LENGTH_LONG);
        return constants;
    }

    @ReactMethod
    public void show(String message, int duration) {
        Toast.makeText(getReactApplicationContext(), message, duration).show();
    }
}
