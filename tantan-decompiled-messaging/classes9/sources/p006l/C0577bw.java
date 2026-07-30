package p006l;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.IntRange;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: l.bw */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0577bw {

    /* JADX INFO: renamed from: g */
    public static volatile C0577bw f9112g;

    /* JADX INFO: renamed from: a */
    public SensorManager f9113a;

    /* JADX INFO: renamed from: b */
    public Sensor f9114b;

    /* JADX INFO: renamed from: c */
    public SensorEventListener f9115c;

    /* JADX INFO: renamed from: d */
    public b f9116d;

    /* JADX INFO: renamed from: e */
    public a f9117e;

    /* JADX INFO: renamed from: f */
    public boolean f9118f = false;

    /* JADX INFO: renamed from: l.bw$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo12916a(@IntRange(from = 0, to = 359) int i);
    }

    /* JADX INFO: renamed from: l.bw$b */
    public class b extends Handler {
        public b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 17 && NullChecker.a(C0577bw.this.f9117e)) {
                C0577bw.this.f9117e.mo12916a(message.arg1);
            }
        }
    }

    public C0577bw(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f9113a = sensorManager;
        if (sensorManager == null) {
            return;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        this.f9114b = defaultSensor;
        if (defaultSensor == null) {
            return;
        }
        this.f9116d = new b();
        this.f9115c = new c();
    }

    /* JADX INFO: renamed from: c */
    public static C0577bw m12909c(Context context) {
        if (f9112g == null) {
            synchronized (C0577bw.class) {
                try {
                    if (f9112g == null) {
                        f9112g = new C0577bw(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f9112g;
    }

    /* JADX INFO: renamed from: e */
    public static void m12910e() {
        if (NullChecker.a(f9112g)) {
            f9112g.m12912f();
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m12911d() {
        return this.f9118f;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m12912f() {
        m12915i();
        this.f9113a = null;
        this.f9115c = null;
        this.f9114b = null;
        this.f9116d = null;
        this.f9117e = null;
        f9112g = null;
    }

    /* JADX INFO: renamed from: g */
    public void m12913g(a aVar) {
        if (this.f9114b == null || this.f9113a == null) {
            return;
        }
        this.f9117e = aVar;
    }

    /* JADX INFO: renamed from: h */
    public void m12914h() {
        SensorManager sensorManager;
        Sensor sensor = this.f9114b;
        if (sensor == null || (sensorManager = this.f9113a) == null) {
            return;
        }
        this.f9118f = true;
        sensorManager.registerListener(this.f9115c, sensor, 2);
    }

    /* JADX INFO: renamed from: i */
    public void m12915i() {
        SensorManager sensorManager;
        if (this.f9114b == null || (sensorManager = this.f9113a) == null) {
            return;
        }
        this.f9118f = false;
        sensorManager.unregisterListener(this.f9115c);
    }

    /* JADX INFO: renamed from: l.bw$c */
    public class c implements SensorEventListener {
        public c() {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            int iRound;
            float[] fArr = sensorEvent.values;
            float f = -fArr[0];
            float f2 = -fArr[1];
            float f3 = -fArr[2];
            if (((f * f) + (f2 * f2)) * 4.0f >= f3 * f3) {
                iRound = (int) (90 - Math.round(Math.atan2(-f2, f) * 57.29577951308232d));
                while (iRound >= 360) {
                    iRound -= 360;
                }
                while (iRound < 0) {
                    iRound += 360;
                }
            } else {
                iRound = 0;
            }
            if (NullChecker.a(C0577bw.this.f9116d)) {
                C0577bw.this.f9116d.obtainMessage(17, iRound, 0).sendToTarget();
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    }
}
