package com.momo.xeengine.xnative;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;
import androidx.annotation.Keep;
import com.momo.xeengine.XELogger;
import com.momo.xeengine.XEnginePreferences;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public final class XEMotionManager {
    private SensorManager mSensorManager;
    private final float[] mRMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private final SensorEventListener mListener = new SensorEventListener() { // from class: com.momo.xeengine.xnative.XEMotionManager.1
        private final float[] rotationMatrix = new float[16];

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            int rotation = XEDevice.getRotation();
            long j = sensorEvent.timestamp;
            if (sensorEvent.sensor.getType() == 15) {
                SensorManager.getRotationMatrixFromVector(this.rotationMatrix, sensorEvent.values);
                synchronized (XEMotionManager.this.mRMatrix) {
                    try {
                        if (rotation == 0) {
                            XEMotionManager.this.mRMatrix[0] = this.rotationMatrix[0];
                            XEMotionManager.this.mRMatrix[1] = this.rotationMatrix[1];
                            XEMotionManager.this.mRMatrix[2] = -this.rotationMatrix[2];
                            XEMotionManager.this.mRMatrix[4] = this.rotationMatrix[8];
                            XEMotionManager.this.mRMatrix[5] = this.rotationMatrix[9];
                            XEMotionManager.this.mRMatrix[6] = -this.rotationMatrix[10];
                            XEMotionManager.this.mRMatrix[8] = this.rotationMatrix[4];
                            XEMotionManager.this.mRMatrix[9] = this.rotationMatrix[5];
                            XEMotionManager.this.mRMatrix[10] = -this.rotationMatrix[6];
                        } else if (rotation == 1) {
                            XEMotionManager.this.mRMatrix[0] = -this.rotationMatrix[1];
                            XEMotionManager.this.mRMatrix[1] = this.rotationMatrix[0];
                            XEMotionManager.this.mRMatrix[2] = -this.rotationMatrix[2];
                            XEMotionManager.this.mRMatrix[4] = -this.rotationMatrix[9];
                            XEMotionManager.this.mRMatrix[5] = this.rotationMatrix[8];
                            XEMotionManager.this.mRMatrix[6] = -this.rotationMatrix[10];
                            XEMotionManager.this.mRMatrix[8] = -this.rotationMatrix[5];
                            XEMotionManager.this.mRMatrix[9] = this.rotationMatrix[4];
                            XEMotionManager.this.mRMatrix[10] = -this.rotationMatrix[6];
                        } else if (rotation == 2) {
                            XEMotionManager.this.mRMatrix[0] = this.rotationMatrix[0];
                            XEMotionManager.this.mRMatrix[1] = this.rotationMatrix[1];
                            XEMotionManager.this.mRMatrix[2] = -this.rotationMatrix[2];
                            XEMotionManager.this.mRMatrix[4] = this.rotationMatrix[8];
                            XEMotionManager.this.mRMatrix[5] = this.rotationMatrix[9];
                            XEMotionManager.this.mRMatrix[6] = -this.rotationMatrix[10];
                            XEMotionManager.this.mRMatrix[8] = this.rotationMatrix[4];
                            XEMotionManager.this.mRMatrix[9] = this.rotationMatrix[5];
                            XEMotionManager.this.mRMatrix[10] = -this.rotationMatrix[6];
                        } else if (rotation == 3) {
                            XEMotionManager.this.mRMatrix[0] = this.rotationMatrix[1];
                            XEMotionManager.this.mRMatrix[1] = -this.rotationMatrix[0];
                            XEMotionManager.this.mRMatrix[2] = -this.rotationMatrix[2];
                            XEMotionManager.this.mRMatrix[4] = this.rotationMatrix[9];
                            XEMotionManager.this.mRMatrix[5] = -this.rotationMatrix[8];
                            XEMotionManager.this.mRMatrix[6] = -this.rotationMatrix[10];
                            XEMotionManager.this.mRMatrix[8] = this.rotationMatrix[5];
                            XEMotionManager.this.mRMatrix[9] = -this.rotationMatrix[4];
                            XEMotionManager.this.mRMatrix[10] = -this.rotationMatrix[6];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    };
    private final float[] viewMatrix = new float[16];

    private SensorManager getSensorManager() {
        try {
            return (SensorManager) XEnginePreferences.getContext().getSystemService("sensor");
        } catch (Exception e) {
            Log.e(XELogger.ENGINE_TAG, "getSensorManager: " + e);
            return null;
        }
    }

    private void printMatrix(float[] fArr) {
        String.format("矩阵:\n[%f,%f,%f,%f]\n[%f,%f,%f,%f]\n[%f,%f,%f,%f]\n[%f,%f,%f,%f]", Float.valueOf(fArr[0]), Float.valueOf(fArr[1]), Float.valueOf(fArr[2]), Float.valueOf(fArr[3]), Float.valueOf(fArr[4]), Float.valueOf(fArr[5]), Float.valueOf(fArr[6]), Float.valueOf(fArr[7]), Float.valueOf(fArr[8]), Float.valueOf(fArr[9]), Float.valueOf(fArr[10]), Float.valueOf(fArr[11]), Float.valueOf(fArr[12]), Float.valueOf(fArr[13]), Float.valueOf(fArr[14]), Float.valueOf(fArr[15]));
    }

    private void registerListener(int i) {
        this.mSensorManager.registerListener(this.mListener, this.mSensorManager.getDefaultSensor(i), 1);
    }

    public void close() {
        SensorManager sensorManager = this.mSensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.mListener);
            this.mSensorManager = null;
        }
    }

    public float[] getAcceleration() {
        return null;
    }

    public float[] getDeviceMotion() {
        return null;
    }

    public float[] getRotation() {
        return null;
    }

    public float[] getViewMatrix() {
        synchronized (this.mRMatrix) {
            System.arraycopy(this.mRMatrix, 0, this.viewMatrix, 0, 16);
        }
        return this.viewMatrix;
    }

    public void open() {
        if (this.mSensorManager == null) {
            SensorManager sensorManager = getSensorManager();
            this.mSensorManager = sensorManager;
            if (sensorManager == null) {
                return;
            }
            registerListener(15);
        }
    }
}
