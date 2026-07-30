package p149l;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.android.gms.internal.ads.zzdzc;

/* JADX INFO: loaded from: classes6.dex */
public final class ltu0 extends zbw0 {

    /* JADX INFO: renamed from: b */
    public final Context f129999b;

    /* JADX INFO: renamed from: c */
    public SensorManager f130000c;

    /* JADX INFO: renamed from: d */
    public Sensor f130001d;

    /* JADX INFO: renamed from: e */
    public long f130002e;

    /* JADX INFO: renamed from: f */
    public int f130003f;

    /* JADX INFO: renamed from: g */
    public ktu0 f130004g;

    /* JADX INFO: renamed from: h */
    public boolean f130005h;

    public ltu0(Context context) {
        super("ShakeDetector", "ads");
        this.f129999b = context;
    }

    @Override // p149l.zbw0
    /* JADX INFO: renamed from: a */
    public final void mo151719a(SensorEvent sensorEvent) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132057R8)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0] / 9.80665f;
            float f2 = fArr[1] / 9.80665f;
            float f3 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3))) >= ((Float) d1s0.m109677c().m144697a(m7s0.f132069S8)).floatValue()) {
                long jCurrentTimeMillis = vny0.m199064b().currentTimeMillis();
                if (this.f130002e + ((long) ((Integer) d1s0.m109677c().m144697a(m7s0.f132081T8)).intValue()) <= jCurrentTimeMillis) {
                    if (this.f130002e + ((long) ((Integer) d1s0.m109677c().m144697a(m7s0.f132093U8)).intValue()) < jCurrentTimeMillis) {
                        this.f130003f = 0;
                    }
                    xsu0.m210834k("Shake detected.");
                    this.f130002e = jCurrentTimeMillis;
                    int i = this.f130003f + 1;
                    this.f130003f = i;
                    ktu0 ktu0Var = this.f130004g;
                    if (ktu0Var != null) {
                        if (i == ((Integer) d1s0.m109677c().m144697a(m7s0.f132105V8)).intValue()) {
                            dru0 dru0Var = (dru0) ktu0Var;
                            dru0Var.m113346h(new bru0(dru0Var), zzdzc.GESTURE);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m151720b() {
        synchronized (this) {
            try {
                if (this.f130005h) {
                    SensorManager sensorManager = this.f130000c;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.f130001d);
                        xsu0.m210834k("Stopped listening for shake gestures.");
                    }
                    this.f130005h = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m151721c() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132057R8)).booleanValue()) {
                    if (this.f130000c == null) {
                        SensorManager sensorManager2 = (SensorManager) this.f129999b.getSystemService("sensor");
                        this.f130000c = sensorManager2;
                        if (sensorManager2 == null) {
                            x2t0.m206869g("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.f130001d = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.f130005h && (sensorManager = this.f130000c) != null && (sensor = this.f130001d) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f130002e = vny0.m199064b().currentTimeMillis() - ((long) ((Integer) d1s0.m109677c().m144697a(m7s0.f132081T8)).intValue());
                        this.f130005h = true;
                        xsu0.m210834k("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m151722d(ktu0 ktu0Var) {
        this.f130004g = ktu0Var;
    }
}
