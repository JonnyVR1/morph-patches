package p153l;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.android.gms.internal.ads.zzdzc;

/* JADX INFO: loaded from: classes6.dex */
public final class r2v0 extends flw0 {

    /* JADX INFO: renamed from: b */
    public final Context f160980b;

    /* JADX INFO: renamed from: c */
    public SensorManager f160981c;

    /* JADX INFO: renamed from: d */
    public Sensor f160982d;

    /* JADX INFO: renamed from: e */
    public long f160983e;

    /* JADX INFO: renamed from: f */
    public int f160984f;

    /* JADX INFO: renamed from: g */
    public q2v0 f160985g;

    /* JADX INFO: renamed from: h */
    public boolean f160986h;

    public r2v0(Context context) {
        super("ShakeDetector", "ads");
        this.f160980b = context;
    }

    @Override // p153l.flw0
    /* JADX INFO: renamed from: a */
    public final void mo126170a(SensorEvent sensorEvent) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168128R8)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0] / 9.80665f;
            float f2 = fArr[1] / 9.80665f;
            float f3 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3))) >= ((Float) jas0.m144075c().m176505a(sgs0.f168140S8)).floatValue()) {
                long jCurrentTimeMillis = bxy0.m106918b().currentTimeMillis();
                if (this.f160983e + ((long) ((Integer) jas0.m144075c().m176505a(sgs0.f168152T8)).intValue()) <= jCurrentTimeMillis) {
                    if (this.f160983e + ((long) ((Integer) jas0.m144075c().m176505a(sgs0.f168164U8)).intValue()) < jCurrentTimeMillis) {
                        this.f160984f = 0;
                    }
                    d2v0.m113737k("Shake detected.");
                    this.f160983e = jCurrentTimeMillis;
                    int i = this.f160984f + 1;
                    this.f160984f = i;
                    q2v0 q2v0Var = this.f160985g;
                    if (q2v0Var != null) {
                        if (i == ((Integer) jas0.m144075c().m176505a(sgs0.f168176V8)).intValue()) {
                            j0v0 j0v0Var = (j0v0) q2v0Var;
                            j0v0Var.m143043h(new h0v0(j0v0Var), zzdzc.GESTURE);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m179568b() {
        synchronized (this) {
            try {
                if (this.f160986h) {
                    SensorManager sensorManager = this.f160981c;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.f160982d);
                        d2v0.m113737k("Stopped listening for shake gestures.");
                    }
                    this.f160986h = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m179569c() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168128R8)).booleanValue()) {
                    if (this.f160981c == null) {
                        SensorManager sensorManager2 = (SensorManager) this.f160980b.getSystemService("sensor");
                        this.f160981c = sensorManager2;
                        if (sensorManager2 == null) {
                            dct0.m115298g("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.f160982d = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.f160986h && (sensorManager = this.f160981c) != null && (sensor = this.f160982d) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f160983e = bxy0.m106918b().currentTimeMillis() - ((long) ((Integer) jas0.m144075c().m176505a(sgs0.f168152T8)).intValue());
                        this.f160986h = true;
                        d2v0.m113737k("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m179570d(q2v0 q2v0Var) {
        this.f160985g = q2v0Var;
    }
}
