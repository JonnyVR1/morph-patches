package com.immomo.utils.sensors;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import p149l.sgw;

/* JADX INFO: loaded from: classes7.dex */
public class MotionDetector {

    /* JADX INFO: renamed from: a */
    private final SensorManager f14096a;

    /* JADX INFO: renamed from: b */
    private final Sensor f14097b;

    /* JADX INFO: renamed from: c */
    private long f14098c;

    /* JADX INFO: renamed from: h */
    private float f14103h;

    /* JADX INFO: renamed from: i */
    private float f14104i;

    /* JADX INFO: renamed from: j */
    private float f14105j;

    /* JADX INFO: renamed from: d */
    private volatile boolean f14099d = false;

    /* JADX INFO: renamed from: e */
    private volatile boolean f14100e = true;

    /* JADX INFO: renamed from: f */
    private volatile DeviceMotionState f14101f = DeviceMotionState.UNKNOWN;

    /* JADX INFO: renamed from: g */
    private final Object f14102g = new Object();

    /* JADX INFO: renamed from: k */
    private int f14106k = 0;

    /* JADX INFO: renamed from: l */
    private final SensorEventListener f14107l = new C3974a();

    public enum DeviceMotionState {
        UNKNOWN(-1),
        STILL(0),
        VIBRATING(1),
        MOVING(2);

        private final int value;

        DeviceMotionState(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* JADX INFO: renamed from: com.immomo.utils.sensors.MotionDetector$a */
    public class C3974a implements SensorEventListener {
        public C3974a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr = sensorEvent.values;
            if (fArr == null || fArr.length < 3) {
                return;
            }
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            synchronized (MotionDetector.this.f14102g) {
                try {
                    DeviceMotionState deviceMotionState = MotionDetector.this.f14101f;
                    DeviceMotionState deviceMotionState2 = DeviceMotionState.MOVING;
                    if (deviceMotionState == deviceMotionState2) {
                        return;
                    }
                    boolean z = MotionDetector.this.f14100e;
                    MotionDetector motionDetector = MotionDetector.this;
                    if (z) {
                        motionDetector.f14103h = f;
                        MotionDetector.this.f14104i = f2;
                        MotionDetector.this.f14105j = f3;
                        MotionDetector.this.f14100e = false;
                        return;
                    }
                    float fAbs = Math.abs(motionDetector.f14103h - f) + Math.abs(MotionDetector.this.f14104i - f2) + Math.abs(MotionDetector.this.f14105j - f3);
                    if (fAbs > 0.5f) {
                        MotionDetector.this.f14101f = deviceMotionState2;
                        MotionDetector.this.f14106k = 0;
                    } else {
                        MotionDetector motionDetector2 = MotionDetector.this;
                        if (fAbs <= 0.2f) {
                            MotionDetector.m19494n(motionDetector2);
                            if (MotionDetector.this.f14106k >= 10 && MotionDetector.this.f14101f == DeviceMotionState.UNKNOWN) {
                                MotionDetector.this.f14101f = DeviceMotionState.STILL;
                            }
                        } else if (motionDetector2.f14101f == DeviceMotionState.STILL || MotionDetector.this.f14101f == DeviceMotionState.UNKNOWN) {
                            MotionDetector.this.f14101f = DeviceMotionState.VIBRATING;
                            MotionDetector.this.f14106k = 0;
                        }
                    }
                    MotionDetector.this.f14103h = f;
                    MotionDetector.this.f14104i = f2;
                    MotionDetector.this.f14105j = f3;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public MotionDetector(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService(sgw.m184137a(new byte[]{67, 3, 95, 68, 14, 20}));
        this.f14096a = sensorManager;
        this.f14097b = sensorManager != null ? sensorManager.getDefaultSensor(1) : null;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ int m19494n(MotionDetector motionDetector) {
        int i = motionDetector.f14106k;
        motionDetector.f14106k = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: r */
    private void m19495r() {
        SensorManager sensorManager = this.f14096a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f14107l);
            this.f14099d = false;
        }
    }

    /* JADX INFO: renamed from: o */
    public DeviceMotionState m19496o() {
        DeviceMotionState deviceMotionState;
        if (!this.f14099d) {
            return DeviceMotionState.UNKNOWN;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f14098c;
        while (true) {
            long j = 2000 - jCurrentTimeMillis;
            if (j <= 0 || this.f14101f == DeviceMotionState.MOVING) {
                break;
            }
            try {
                Thread.sleep(Math.min(100L, j));
            } catch (InterruptedException unused) {
            }
            jCurrentTimeMillis = System.currentTimeMillis() - this.f14098c;
        }
        synchronized (this.f14102g) {
            deviceMotionState = this.f14101f;
        }
        m19495r();
        return deviceMotionState;
    }

    /* JADX INFO: renamed from: p */
    public void m19497p() {
        m19495r();
    }

    /* JADX INFO: renamed from: q */
    public void m19498q() {
        if (this.f14096a == null || this.f14097b == null) {
            return;
        }
        if (this.f14099d) {
            m19495r();
        }
        synchronized (this.f14102g) {
            this.f14101f = DeviceMotionState.UNKNOWN;
            this.f14100e = true;
            this.f14106k = 0;
        }
        if (this.f14096a.registerListener(this.f14107l, this.f14097b, 3)) {
            this.f14098c = System.currentTimeMillis();
            this.f14099d = true;
        }
    }
}
