package p149l;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.android.gms.internal.ads.zzdzc;

/* JADX INFO: loaded from: classes6.dex */
public final class mqu0 extends zbw0 {

    /* JADX INFO: renamed from: b */
    public final SensorManager f135294b;

    /* JADX INFO: renamed from: c */
    public final Sensor f135295c;

    /* JADX INFO: renamed from: d */
    public float f135296d;

    /* JADX INFO: renamed from: e */
    public Float f135297e;

    /* JADX INFO: renamed from: f */
    public long f135298f;

    /* JADX INFO: renamed from: g */
    public int f135299g;

    /* JADX INFO: renamed from: h */
    public boolean f135300h;

    /* JADX INFO: renamed from: i */
    public boolean f135301i;

    /* JADX INFO: renamed from: j */
    public lqu0 f135302j;

    /* JADX INFO: renamed from: k */
    public boolean f135303k;

    public mqu0(Context context) {
        super("FlickDetector", "ads");
        this.f135296d = 0.0f;
        this.f135297e = Float.valueOf(0.0f);
        this.f135298f = vny0.m199064b().currentTimeMillis();
        this.f135299g = 0;
        this.f135300h = false;
        this.f135301i = false;
        this.f135302j = null;
        this.f135303k = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f135294b = sensorManager;
        if (sensorManager != null) {
            this.f135295c = sensorManager.getDefaultSensor(4);
        } else {
            this.f135295c = null;
        }
    }

    @Override // p149l.zbw0
    /* JADX INFO: renamed from: a */
    public final void mo151719a(SensorEvent sensorEvent) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132117W8)).booleanValue()) {
            long jCurrentTimeMillis = vny0.m199064b().currentTimeMillis();
            if (this.f135298f + ((long) ((Integer) d1s0.m109677c().m144697a(m7s0.f132141Y8)).intValue()) < jCurrentTimeMillis) {
                this.f135299g = 0;
                this.f135298f = jCurrentTimeMillis;
                this.f135300h = false;
                this.f135301i = false;
                this.f135296d = this.f135297e.floatValue();
            }
            Float fValueOf = Float.valueOf(this.f135297e.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.f135297e = fValueOf;
            float fFloatValue = fValueOf.floatValue();
            float f = this.f135296d;
            x6s0 x6s0Var = m7s0.f132129X8;
            float fFloatValue2 = f + ((Float) d1s0.m109677c().m144697a(x6s0Var)).floatValue();
            Float f2 = this.f135297e;
            if (fFloatValue > fFloatValue2) {
                this.f135296d = f2.floatValue();
                this.f135301i = true;
            } else if (f2.floatValue() < this.f135296d - ((Float) d1s0.m109677c().m144697a(x6s0Var)).floatValue()) {
                this.f135296d = this.f135297e.floatValue();
                this.f135300h = true;
            }
            if (this.f135297e.isInfinite()) {
                this.f135297e = Float.valueOf(0.0f);
                this.f135296d = 0.0f;
            }
            if (this.f135300h && this.f135301i) {
                xsu0.m210834k("Flick detected.");
                this.f135298f = jCurrentTimeMillis;
                int i = this.f135299g + 1;
                this.f135299g = i;
                this.f135300h = false;
                this.f135301i = false;
                lqu0 lqu0Var = this.f135302j;
                if (lqu0Var != null) {
                    if (i == ((Integer) d1s0.m109677c().m144697a(m7s0.f132153Z8)).intValue()) {
                        dru0 dru0Var = (dru0) lqu0Var;
                        dru0Var.m113346h(new cru0(dru0Var), zzdzc.GESTURE);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m155995b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (this.f135303k && (sensorManager = this.f135294b) != null && (sensor = this.f135295c) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.f135303k = false;
                    xsu0.m210834k("Stopped listening for flick gestures.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m155996c() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132117W8)).booleanValue()) {
                    if (!this.f135303k && (sensorManager = this.f135294b) != null && (sensor = this.f135295c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f135303k = true;
                        xsu0.m210834k("Listening for flick gestures.");
                    }
                    if (this.f135294b == null || this.f135295c == null) {
                        x2t0.m206869g("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m155997d(lqu0 lqu0Var) {
        this.f135302j = lqu0Var;
    }
}
