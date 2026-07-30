package com.immomo.utils.sensors;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import p153l.riw;

/* JADX INFO: loaded from: classes7.dex */
public class MotionDetector {

    /* JADX INFO: renamed from: a */
    private final SensorManager f14815a;

    /* JADX INFO: renamed from: b */
    private final Sensor f14816b;

    /* JADX INFO: renamed from: c */
    private long f14817c;

    /* JADX INFO: renamed from: h */
    private float f14822h;

    /* JADX INFO: renamed from: i */
    private float f14823i;

    /* JADX INFO: renamed from: j */
    private float f14824j;

    /* JADX INFO: renamed from: d */
    private volatile boolean f14818d = false;

    /* JADX INFO: renamed from: e */
    private volatile boolean f14819e = true;

    /* JADX INFO: renamed from: f */
    private volatile DeviceMotionState f14820f = DeviceMotionState.UNKNOWN;

    /* JADX INFO: renamed from: g */
    private final Object f14821g = new Object();

    /* JADX INFO: renamed from: k */
    private int f14825k = 0;

    /* JADX INFO: renamed from: l */
    private final SensorEventListener f14826l = new C4125a();

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
    public class C4125a implements SensorEventListener {
        public C4125a() {
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
            synchronized (MotionDetector.this.f14821g) {
                try {
                    DeviceMotionState deviceMotionState = MotionDetector.this.f14820f;
                    DeviceMotionState deviceMotionState2 = DeviceMotionState.MOVING;
                    if (deviceMotionState == deviceMotionState2) {
                        return;
                    }
                    boolean z = MotionDetector.this.f14819e;
                    MotionDetector motionDetector = MotionDetector.this;
                    if (z) {
                        motionDetector.f14822h = f;
                        MotionDetector.this.f14823i = f2;
                        MotionDetector.this.f14824j = f3;
                        MotionDetector.this.f14819e = false;
                        return;
                    }
                    float fAbs = Math.abs(motionDetector.f14822h - f) + Math.abs(MotionDetector.this.f14823i - f2) + Math.abs(MotionDetector.this.f14824j - f3);
                    if (fAbs > 0.5f) {
                        MotionDetector.this.f14820f = deviceMotionState2;
                        MotionDetector.this.f14825k = 0;
                    } else {
                        MotionDetector motionDetector2 = MotionDetector.this;
                        if (fAbs <= 0.2f) {
                            MotionDetector.m20493n(motionDetector2);
                            if (MotionDetector.this.f14825k >= 10 && MotionDetector.this.f14820f == DeviceMotionState.UNKNOWN) {
                                MotionDetector.this.f14820f = DeviceMotionState.STILL;
                            }
                        } else if (motionDetector2.f14820f == DeviceMotionState.STILL || MotionDetector.this.f14820f == DeviceMotionState.UNKNOWN) {
                            MotionDetector.this.f14820f = DeviceMotionState.VIBRATING;
                            MotionDetector.this.f14825k = 0;
                        }
                    }
                    MotionDetector.this.f14822h = f;
                    MotionDetector.this.f14823i = f2;
                    MotionDetector.this.f14824j = f3;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public MotionDetector(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService(riw.m181611a(new byte[]{67, 3, 95, 68, 14, 20}));
        this.f14815a = sensorManager;
        this.f14816b = sensorManager != null ? sensorManager.getDefaultSensor(1) : null;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ int m20493n(MotionDetector motionDetector) {
        int i = motionDetector.f14825k;
        motionDetector.f14825k = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: r */
    private void m20494r() {
        SensorManager sensorManager = this.f14815a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f14826l);
            this.f14818d = false;
        }
    }

    /* JADX INFO: renamed from: o */
    public DeviceMotionState m20495o() {
        DeviceMotionState deviceMotionState;
        if (!this.f14818d) {
            return DeviceMotionState.UNKNOWN;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f14817c;
        while (true) {
            long j = 2000 - jCurrentTimeMillis;
            if (j <= 0 || this.f14820f == DeviceMotionState.MOVING) {
                break;
            }
            try {
                Thread.sleep(Math.min(100L, j));
            } catch (InterruptedException unused) {
            }
            jCurrentTimeMillis = System.currentTimeMillis() - this.f14817c;
        }
        synchronized (this.f14821g) {
            deviceMotionState = this.f14820f;
        }
        m20494r();
        return deviceMotionState;
    }

    /* JADX INFO: renamed from: p */
    public void m20496p() {
        m20494r();
    }

    /* JADX INFO: renamed from: q */
    public void m20497q() {
        if (this.f14815a == null || this.f14816b == null) {
            return;
        }
        if (this.f14818d) {
            m20494r();
        }
        synchronized (this.f14821g) {
            this.f14820f = DeviceMotionState.UNKNOWN;
            this.f14819e = true;
            this.f14825k = 0;
        }
        if (this.f14815a.registerListener(this.f14826l, this.f14816b, 3)) {
            this.f14817c = System.currentTimeMillis();
            this.f14818d = true;
        }
    }
}
