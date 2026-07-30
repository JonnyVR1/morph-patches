package p153l;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.android.gms.internal.ads.zzdzc;

/* JADX INFO: loaded from: classes6.dex */
public final class szu0 extends flw0 {

    /* JADX INFO: renamed from: b */
    public final SensorManager f171419b;

    /* JADX INFO: renamed from: c */
    public final Sensor f171420c;

    /* JADX INFO: renamed from: d */
    public float f171421d;

    /* JADX INFO: renamed from: e */
    public Float f171422e;

    /* JADX INFO: renamed from: f */
    public long f171423f;

    /* JADX INFO: renamed from: g */
    public int f171424g;

    /* JADX INFO: renamed from: h */
    public boolean f171425h;

    /* JADX INFO: renamed from: i */
    public boolean f171426i;

    /* JADX INFO: renamed from: j */
    public rzu0 f171427j;

    /* JADX INFO: renamed from: k */
    public boolean f171428k;

    public szu0(Context context) {
        super("FlickDetector", "ads");
        this.f171421d = 0.0f;
        this.f171422e = Float.valueOf(0.0f);
        this.f171423f = bxy0.m106918b().currentTimeMillis();
        this.f171424g = 0;
        this.f171425h = false;
        this.f171426i = false;
        this.f171427j = null;
        this.f171428k = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f171419b = sensorManager;
        if (sensorManager != null) {
            this.f171420c = sensorManager.getDefaultSensor(4);
        } else {
            this.f171420c = null;
        }
    }

    @Override // p153l.flw0
    /* JADX INFO: renamed from: a */
    public final void mo126170a(SensorEvent sensorEvent) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168188W8)).booleanValue()) {
            long jCurrentTimeMillis = bxy0.m106918b().currentTimeMillis();
            if (this.f171423f + ((long) ((Integer) jas0.m144075c().m176505a(sgs0.f168212Y8)).intValue()) < jCurrentTimeMillis) {
                this.f171424g = 0;
                this.f171423f = jCurrentTimeMillis;
                this.f171425h = false;
                this.f171426i = false;
                this.f171421d = this.f171422e.floatValue();
            }
            Float fValueOf = Float.valueOf(this.f171422e.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.f171422e = fValueOf;
            float fFloatValue = fValueOf.floatValue();
            float f = this.f171421d;
            dgs0 dgs0Var = sgs0.f168200X8;
            float fFloatValue2 = f + ((Float) jas0.m144075c().m176505a(dgs0Var)).floatValue();
            Float f2 = this.f171422e;
            if (fFloatValue > fFloatValue2) {
                this.f171421d = f2.floatValue();
                this.f171426i = true;
            } else if (f2.floatValue() < this.f171421d - ((Float) jas0.m144075c().m176505a(dgs0Var)).floatValue()) {
                this.f171421d = this.f171422e.floatValue();
                this.f171425h = true;
            }
            if (this.f171422e.isInfinite()) {
                this.f171422e = Float.valueOf(0.0f);
                this.f171421d = 0.0f;
            }
            if (this.f171425h && this.f171426i) {
                d2v0.m113737k("Flick detected.");
                this.f171423f = jCurrentTimeMillis;
                int i = this.f171424g + 1;
                this.f171424g = i;
                this.f171425h = false;
                this.f171426i = false;
                rzu0 rzu0Var = this.f171427j;
                if (rzu0Var != null) {
                    if (i == ((Integer) jas0.m144075c().m176505a(sgs0.f168224Z8)).intValue()) {
                        j0v0 j0v0Var = (j0v0) rzu0Var;
                        j0v0Var.m143043h(new i0v0(j0v0Var), zzdzc.GESTURE);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m188680b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (this.f171428k && (sensorManager = this.f171419b) != null && (sensor = this.f171420c) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.f171428k = false;
                    d2v0.m113737k("Stopped listening for flick gestures.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m188681c() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168188W8)).booleanValue()) {
                    if (!this.f171428k && (sensorManager = this.f171419b) != null && (sensor = this.f171420c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f171428k = true;
                        d2v0.m113737k("Listening for flick gestures.");
                    }
                    if (this.f171419b == null || this.f171420c == null) {
                        dct0.m115298g("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m188682d(rzu0 rzu0Var) {
        this.f171427j = rzu0Var;
    }
}
