package p153l;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.IntRange;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: l.vv */
/* JADX INFO: loaded from: classes9.dex */
public class C20939vv {

    /* JADX INFO: renamed from: g */
    public static volatile C20939vv f185873g;

    /* JADX INFO: renamed from: a */
    public SensorManager f185874a;

    /* JADX INFO: renamed from: b */
    public Sensor f185875b;

    /* JADX INFO: renamed from: c */
    public SensorEventListener f185876c;

    /* JADX INFO: renamed from: d */
    public b f185877d;

    /* JADX INFO: renamed from: e */
    public a f185878e;

    /* JADX INFO: renamed from: f */
    public boolean f185879f = false;

    /* JADX INFO: renamed from: l.vv$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo155828a(@IntRange(from = 0, to = 359) int i);
    }

    /* JADX INFO: renamed from: l.vv$b */
    public class b extends Handler {
        public b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 17 && NullChecker.m82486a(C20939vv.this.f185878e)) {
                C20939vv.this.f185878e.mo155828a(message.arg1);
            }
        }
    }

    public C20939vv(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f185874a = sensorManager;
        if (sensorManager == null) {
            return;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        this.f185875b = defaultSensor;
        if (defaultSensor == null) {
            return;
        }
        this.f185877d = new b();
        this.f185876c = new c();
    }

    /* JADX INFO: renamed from: c */
    public static C20939vv m202984c(Context context) {
        if (f185873g == null) {
            synchronized (C20939vv.class) {
                try {
                    if (f185873g == null) {
                        f185873g = new C20939vv(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f185873g;
    }

    /* JADX INFO: renamed from: e */
    public static void m202985e() {
        if (NullChecker.m82486a(f185873g)) {
            f185873g.m202987f();
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m202986d() {
        return this.f185879f;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m202987f() {
        m202990i();
        this.f185874a = null;
        this.f185876c = null;
        this.f185875b = null;
        this.f185877d = null;
        this.f185878e = null;
        f185873g = null;
    }

    /* JADX INFO: renamed from: g */
    public void m202988g(a aVar) {
        if (this.f185875b == null || this.f185874a == null) {
            return;
        }
        this.f185878e = aVar;
    }

    /* JADX INFO: renamed from: h */
    public void m202989h() {
        SensorManager sensorManager;
        Sensor sensor = this.f185875b;
        if (sensor == null || (sensorManager = this.f185874a) == null) {
            return;
        }
        this.f185879f = true;
        sensorManager.registerListener(this.f185876c, sensor, 2);
    }

    /* JADX INFO: renamed from: i */
    public void m202990i() {
        SensorManager sensorManager;
        if (this.f185875b == null || (sensorManager = this.f185874a) == null) {
            return;
        }
        this.f185879f = false;
        sensorManager.unregisterListener(this.f185876c);
    }

    /* JADX INFO: renamed from: l.vv$c */
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
            if (NullChecker.m82486a(C20939vv.this.f185877d)) {
                C20939vv.this.f185877d.obtainMessage(17, iRound, 0).sendToTarget();
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    }
}
