package com.effectsar.labcv.effectsdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.view.OrientationEventListener;

/* JADX INFO: loaded from: classes.dex */
public class SensorHelper {
    private static final int BEF_REQUIREMENT_SKY_SEG = 16384;
    private static final int RENDER_MSG_EVENT_DID_SWITCH_EFFECT = 6;
    private static final int RENDER_MSG_TYPE_EFFECT = 20;
    private static final String TAG = "SensorHelper";
    private AcceleratorListener acceleratorListener;
    private Sensor acceleratorSeneor;
    private GravityListener gravityListener;
    private Sensor gravitySensor;
    private GyroscopeListener gyroscopeListener;
    private Sensor gyroscopeSensor;
    private Accelerometer mAccelerometer;
    private ISensorListener mListener;
    private SensorManager mSensorManager;
    private Sensor rotationSensor;
    private RotationSensorListener rotationSensorListener;

    public class AcceleratorListener implements SensorEventListener {
        private AcceleratorListener() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (SensorHelper.this.mListener == null) {
                return;
            }
            double timestamp = SensorHelper.this.getTimestamp(sensorEvent);
            ISensorListener iSensorListener = SensorHelper.this.mListener;
            float[] fArr = sensorEvent.values;
            iSensorListener.onAcceleratorChanged(fArr[0], fArr[1], fArr[2], timestamp);
        }
    }

    public class GravityListener implements SensorEventListener {
        private GravityListener() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (SensorHelper.this.mListener == null) {
                return;
            }
            double timestamp = SensorHelper.this.getTimestamp(sensorEvent);
            ISensorListener iSensorListener = SensorHelper.this.mListener;
            float[] fArr = sensorEvent.values;
            iSensorListener.onGravityChanged(fArr[0], fArr[1], fArr[2], timestamp);
        }
    }

    public class GyroscopeListener implements SensorEventListener {
        private GyroscopeListener() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (SensorHelper.this.mListener == null) {
                return;
            }
            double timestamp = SensorHelper.this.getTimestamp(sensorEvent);
            ISensorListener iSensorListener = SensorHelper.this.mListener;
            float[] fArr = sensorEvent.values;
            iSensorListener.onGyroscopeChanged(fArr[0], fArr[1], fArr[2], timestamp);
        }
    }

    public interface ISensorListener {
        void deviceConfig(boolean z, boolean z2, boolean z3, boolean z4);

        void onAcceleratorChanged(double d, double d2, double d3, double d4);

        void onGravityChanged(double d, double d2, double d3, double d4);

        void onGyroscopeChanged(double d, double d2, double d3, double d4);

        void onOrientationChanged(double[] dArr, int i, double d);

        void setDeviceRotation(float[] fArr);
    }

    public class RotationSensorListener implements SensorEventListener {
        private RotationSensorListener() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (SensorHelper.this.mListener == null) {
                return;
            }
            double timestamp = SensorHelper.this.getTimestamp(sensorEvent);
            float[] fArr = new float[9];
            SensorManager unused = SensorHelper.this.mSensorManager;
            SensorManager.getRotationMatrixFromVector(fArr, sensorEvent.values);
            double[] dArr = new double[9];
            for (int i = 0; i < 9; i++) {
                dArr[i] = fArr[i];
            }
            SensorHelper.this.mListener.onOrientationChanged(dArr, 9, timestamp / 1.0E9d);
            float[] fArr2 = sensorEvent.values;
            SensorHelper.this.mListener.setDeviceRotation(new float[]{fArr2[0], fArr2[1], fArr2[2], fArr2[3]});
        }
    }

    public SensorHelper(Context context, ISensorListener iSensorListener) {
        this.mListener = iSensorListener;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.mSensorManager = sensorManager;
        this.gyroscopeSensor = sensorManager.getDefaultSensor(4);
        this.acceleratorSeneor = this.mSensorManager.getDefaultSensor(1);
        this.gravitySensor = this.mSensorManager.getDefaultSensor(9);
        Sensor defaultSensor = this.mSensorManager.getDefaultSensor(15);
        this.rotationSensor = defaultSensor;
        if (defaultSensor == null) {
            this.rotationSensor = this.mSensorManager.getDefaultSensor(11);
        }
        this.rotationSensorListener = new RotationSensorListener();
        this.acceleratorListener = new AcceleratorListener();
        this.gyroscopeListener = new GyroscopeListener();
        this.gravityListener = new GravityListener();
        this.mAccelerometer = new Accelerometer(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double getTimestamp(SensorEvent sensorEvent) {
        long jNanoTime = System.nanoTime();
        return jNanoTime - Math.min(Math.abs(jNanoTime - sensorEvent.timestamp), Math.abs(SystemClock.elapsedRealtimeNanos() - sensorEvent.timestamp));
    }

    public void registerSensor() {
        ISensorListener iSensorListener = this.mListener;
        if (iSensorListener != null) {
            iSensorListener.deviceConfig(this.acceleratorSeneor != null, this.gyroscopeSensor != null, this.gravitySensor != null, this.rotationSensor != null);
        }
        this.mSensorManager.registerListener(this.rotationSensorListener, this.rotationSensor, 0);
        this.mSensorManager.registerListener(this.acceleratorListener, this.acceleratorSeneor, 0);
        this.mSensorManager.registerListener(this.gyroscopeListener, this.gyroscopeSensor, 0);
        this.mSensorManager.registerListener(this.gravityListener, this.gravitySensor, 0);
    }

    public void unRegisterSensor() {
        this.mSensorManager.unregisterListener(this.rotationSensorListener);
        this.mSensorManager.unregisterListener(this.acceleratorListener);
        this.mSensorManager.unregisterListener(this.gyroscopeListener);
        this.mSensorManager.unregisterListener(this.gravityListener);
    }

    public class Accelerometer {
        private static final String TAG = "Accelerometer";
        private AlbumOrientationEventListener mAlbumOrientationEventListener;
        private int mOrientation = 0;

        public Accelerometer(Context context) {
            AlbumOrientationEventListener albumOrientationEventListener = new AlbumOrientationEventListener(context, 3);
            this.mAlbumOrientationEventListener = albumOrientationEventListener;
            if (albumOrientationEventListener.canDetectOrientation()) {
                this.mAlbumOrientationEventListener.enable();
            }
        }

        public int getDirection() {
            return this.mOrientation;
        }

        public class AlbumOrientationEventListener extends OrientationEventListener {
            public AlbumOrientationEventListener(Context context) {
                super(context);
            }

            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int i) {
                int i2;
                if (i == -1 || (i2 = (((i + 45) / 90) * 90) % 360) == Accelerometer.this.mOrientation) {
                    return;
                }
                Accelerometer.this.mOrientation = i2;
            }

            public AlbumOrientationEventListener(Context context, int i) {
                super(context, i);
            }
        }
    }
}
