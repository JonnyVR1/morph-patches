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

/* JADX INFO: loaded from: classes13.dex */
public class dde0 {

    /* JADX INFO: renamed from: g */
    public static volatile dde0 f87923g;

    /* JADX INFO: renamed from: a */
    public SensorManager f87924a;

    /* JADX INFO: renamed from: b */
    public Sensor f87925b;

    /* JADX INFO: renamed from: c */
    public SensorEventListener f87926c;

    /* JADX INFO: renamed from: d */
    public HandlerC16501b f87927d;

    /* JADX INFO: renamed from: e */
    public InterfaceC16500a f87928e;

    /* JADX INFO: renamed from: f */
    public boolean f87929f = false;

    /* JADX INFO: renamed from: l.dde0$a */
    public interface InterfaceC16500a {
        /* JADX INFO: renamed from: a */
        void mo115338a(@IntRange(from = 0, to = 359) int i);
    }

    /* JADX INFO: renamed from: l.dde0$b */
    public class HandlerC16501b extends Handler {
        public HandlerC16501b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 17 && NullChecker.m82486a(dde0.this.f87928e)) {
                dde0.this.f87928e.mo115338a(message.arg1);
            }
        }
    }

    public dde0(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f87924a = sensorManager;
        if (sensorManager == null) {
            return;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        this.f87925b = defaultSensor;
        if (defaultSensor == null) {
            return;
        }
        this.f87927d = new HandlerC16501b();
        this.f87926c = new C16502c();
    }

    /* JADX INFO: renamed from: c */
    public static dde0 m115331c(Context context) {
        if (f87923g == null) {
            synchronized (dde0.class) {
                try {
                    if (f87923g == null) {
                        f87923g = new dde0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f87923g;
    }

    /* JADX INFO: renamed from: e */
    public static void m115332e() {
        if (NullChecker.m82486a(f87923g)) {
            f87923g.m115334f();
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m115333d() {
        return this.f87929f;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m115334f() {
        m115337i();
        this.f87924a = null;
        this.f87926c = null;
        this.f87925b = null;
        this.f87927d = null;
        this.f87928e = null;
        f87923g = null;
    }

    /* JADX INFO: renamed from: g */
    public void m115335g(InterfaceC16500a interfaceC16500a) {
        if (this.f87925b == null || this.f87924a == null) {
            return;
        }
        this.f87928e = interfaceC16500a;
    }

    /* JADX INFO: renamed from: h */
    public void m115336h() {
        SensorManager sensorManager;
        Sensor sensor = this.f87925b;
        if (sensor == null || (sensorManager = this.f87924a) == null) {
            return;
        }
        this.f87929f = true;
        sensorManager.registerListener(this.f87926c, sensor, 2);
    }

    /* JADX INFO: renamed from: i */
    public void m115337i() {
        SensorManager sensorManager;
        if (this.f87925b == null || (sensorManager = this.f87924a) == null) {
            return;
        }
        this.f87929f = false;
        sensorManager.unregisterListener(this.f87926c);
    }

    /* JADX INFO: renamed from: l.dde0$c */
    public class C16502c implements SensorEventListener {
        public C16502c() {
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
            if (NullChecker.m82486a(dde0.this.f87927d)) {
                dde0.this.f87927d.obtainMessage(17, iRound, 0).sendToTarget();
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    }
}
