package p007l;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.IntRange;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class z4e0 {

    /* JADX INFO: renamed from: g */
    public static volatile z4e0 f15583g;

    /* JADX INFO: renamed from: a */
    public SensorManager f15584a;

    /* JADX INFO: renamed from: b */
    public Sensor f15585b;

    /* JADX INFO: renamed from: c */
    public SensorEventListener f15586c;

    /* JADX INFO: renamed from: d */
    public HandlerC2544b f15587d;

    /* JADX INFO: renamed from: e */
    public InterfaceC2543a f15588e;

    /* JADX INFO: renamed from: f */
    public boolean f15589f = false;

    /* JADX INFO: renamed from: l.z4e0$a */
    public interface InterfaceC2543a {
        /* JADX INFO: renamed from: a */
        void mo15179a(@IntRange(from = 0, to = 359) int i);
    }

    /* JADX INFO: renamed from: l.z4e0$b */
    public class HandlerC2544b extends Handler {
        public HandlerC2544b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 17 && NullChecker.a(z4e0.this.f15588e)) {
                z4e0.this.f15588e.mo15179a(message.arg1);
            }
        }
    }

    public z4e0(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f15584a = sensorManager;
        if (sensorManager == null) {
            return;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        this.f15585b = defaultSensor;
        if (defaultSensor == null) {
            return;
        }
        this.f15587d = new HandlerC2544b();
        this.f15586c = new C2545c();
    }

    /* JADX INFO: renamed from: c */
    public static z4e0 m17215c(Context context) {
        if (f15583g == null) {
            synchronized (z4e0.class) {
                try {
                    if (f15583g == null) {
                        f15583g = new z4e0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f15583g;
    }

    /* JADX INFO: renamed from: e */
    public static void m17216e() {
        if (NullChecker.a(f15583g)) {
            f15583g.m17218f();
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m17217d() {
        return this.f15589f;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m17218f() {
        m17221i();
        this.f15584a = null;
        this.f15586c = null;
        this.f15585b = null;
        this.f15587d = null;
        this.f15588e = null;
        f15583g = null;
    }

    /* JADX INFO: renamed from: g */
    public void m17219g(InterfaceC2543a interfaceC2543a) {
        if (this.f15585b == null || this.f15584a == null) {
            return;
        }
        this.f15588e = interfaceC2543a;
    }

    /* JADX INFO: renamed from: h */
    public void m17220h() {
        SensorManager sensorManager;
        Sensor sensor = this.f15585b;
        if (sensor == null || (sensorManager = this.f15584a) == null) {
            return;
        }
        this.f15589f = true;
        sensorManager.registerListener(this.f15586c, sensor, 2);
    }

    /* JADX INFO: renamed from: i */
    public void m17221i() {
        SensorManager sensorManager;
        if (this.f15585b == null || (sensorManager = this.f15584a) == null) {
            return;
        }
        this.f15589f = false;
        sensorManager.unregisterListener(this.f15586c);
    }

    /* JADX INFO: renamed from: l.z4e0$c */
    public class C2545c implements SensorEventListener {
        public C2545c() {
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
            if (NullChecker.a(z4e0.this.f15587d)) {
                z4e0.this.f15587d.obtainMessage(17, iRound, 0).sendToTarget();
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    }
}
