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

/* JADX INFO: loaded from: classes12.dex */
public class z4e0 {

    /* JADX INFO: renamed from: g */
    public static volatile z4e0 f201581g;

    /* JADX INFO: renamed from: a */
    public SensorManager f201582a;

    /* JADX INFO: renamed from: b */
    public Sensor f201583b;

    /* JADX INFO: renamed from: c */
    public SensorEventListener f201584c;

    /* JADX INFO: renamed from: d */
    public HandlerC21619b f201585d;

    /* JADX INFO: renamed from: e */
    public InterfaceC21618a f201586e;

    /* JADX INFO: renamed from: f */
    public boolean f201587f = false;

    /* JADX INFO: renamed from: l.z4e0$a */
    public interface InterfaceC21618a {
        /* JADX INFO: renamed from: a */
        void mo196149a(@IntRange(from = 0, to = 359) int i);
    }

    /* JADX INFO: renamed from: l.z4e0$b */
    public class HandlerC21619b extends Handler {
        public HandlerC21619b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 17 && NullChecker.m81303a(z4e0.this.f201586e)) {
                z4e0.this.f201586e.mo196149a(message.arg1);
            }
        }
    }

    public z4e0(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f201582a = sensorManager;
        if (sensorManager == null) {
            return;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        this.f201583b = defaultSensor;
        if (defaultSensor == null) {
            return;
        }
        this.f201585d = new HandlerC21619b();
        this.f201584c = new C21620c();
    }

    /* JADX INFO: renamed from: c */
    public static z4e0 m217067c(Context context) {
        if (f201581g == null) {
            synchronized (z4e0.class) {
                try {
                    if (f201581g == null) {
                        f201581g = new z4e0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f201581g;
    }

    /* JADX INFO: renamed from: e */
    public static void m217068e() {
        if (NullChecker.m81303a(f201581g)) {
            f201581g.m217070f();
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m217069d() {
        return this.f201587f;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m217070f() {
        m217073i();
        this.f201582a = null;
        this.f201584c = null;
        this.f201583b = null;
        this.f201585d = null;
        this.f201586e = null;
        f201581g = null;
    }

    /* JADX INFO: renamed from: g */
    public void m217071g(InterfaceC21618a interfaceC21618a) {
        if (this.f201583b == null || this.f201582a == null) {
            return;
        }
        this.f201586e = interfaceC21618a;
    }

    /* JADX INFO: renamed from: h */
    public void m217072h() {
        SensorManager sensorManager;
        Sensor sensor = this.f201583b;
        if (sensor == null || (sensorManager = this.f201582a) == null) {
            return;
        }
        this.f201587f = true;
        sensorManager.registerListener(this.f201584c, sensor, 2);
    }

    /* JADX INFO: renamed from: i */
    public void m217073i() {
        SensorManager sensorManager;
        if (this.f201583b == null || (sensorManager = this.f201582a) == null) {
            return;
        }
        this.f201587f = false;
        sensorManager.unregisterListener(this.f201584c);
    }

    /* JADX INFO: renamed from: l.z4e0$c */
    public class C21620c implements SensorEventListener {
        public C21620c() {
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
            if (NullChecker.m81303a(z4e0.this.f201585d)) {
                z4e0.this.f201585d.obtainMessage(17, iRound, 0).sendToTarget();
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    }
}
