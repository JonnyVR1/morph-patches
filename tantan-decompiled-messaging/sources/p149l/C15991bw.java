package p149l;

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
/* JADX INFO: loaded from: classes9.dex */
public class C15991bw {

    /* JADX INFO: renamed from: g */
    public static volatile C15991bw f77545g;

    /* JADX INFO: renamed from: a */
    public SensorManager f77546a;

    /* JADX INFO: renamed from: b */
    public Sensor f77547b;

    /* JADX INFO: renamed from: c */
    public SensorEventListener f77548c;

    /* JADX INFO: renamed from: d */
    public b f77549d;

    /* JADX INFO: renamed from: e */
    public a f77550e;

    /* JADX INFO: renamed from: f */
    public boolean f77551f = false;

    /* JADX INFO: renamed from: l.bw$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo104111a(@IntRange(from = 0, to = 359) int i);
    }

    /* JADX INFO: renamed from: l.bw$b */
    public class b extends Handler {
        public b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 17 && NullChecker.m81303a(C15991bw.this.f77550e)) {
                C15991bw.this.f77550e.mo104111a(message.arg1);
            }
        }
    }

    public C15991bw(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f77546a = sensorManager;
        if (sensorManager == null) {
            return;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        this.f77547b = defaultSensor;
        if (defaultSensor == null) {
            return;
        }
        this.f77549d = new b();
        this.f77548c = new c();
    }

    /* JADX INFO: renamed from: c */
    public static C15991bw m104104c(Context context) {
        if (f77545g == null) {
            synchronized (C15991bw.class) {
                try {
                    if (f77545g == null) {
                        f77545g = new C15991bw(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f77545g;
    }

    /* JADX INFO: renamed from: e */
    public static void m104105e() {
        if (NullChecker.m81303a(f77545g)) {
            f77545g.m104107f();
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m104106d() {
        return this.f77551f;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m104107f() {
        m104110i();
        this.f77546a = null;
        this.f77548c = null;
        this.f77547b = null;
        this.f77549d = null;
        this.f77550e = null;
        f77545g = null;
    }

    /* JADX INFO: renamed from: g */
    public void m104108g(a aVar) {
        if (this.f77547b == null || this.f77546a == null) {
            return;
        }
        this.f77550e = aVar;
    }

    /* JADX INFO: renamed from: h */
    public void m104109h() {
        SensorManager sensorManager;
        Sensor sensor = this.f77547b;
        if (sensor == null || (sensorManager = this.f77546a) == null) {
            return;
        }
        this.f77551f = true;
        sensorManager.registerListener(this.f77548c, sensor, 2);
    }

    /* JADX INFO: renamed from: i */
    public void m104110i() {
        SensorManager sensorManager;
        if (this.f77547b == null || (sensorManager = this.f77546a) == null) {
            return;
        }
        this.f77551f = false;
        sensorManager.unregisterListener(this.f77548c);
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
            if (NullChecker.m81303a(C15991bw.this.f77549d)) {
                C15991bw.this.f77549d.obtainMessage(17, iRound, 0).sendToTarget();
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    }
}
