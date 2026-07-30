package p153l;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.p074ss.android.ttvecamera.C13504g;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class lwk {

    /* JADX INFO: renamed from: a */
    private final SensorManager f133820a;

    /* JADX INFO: renamed from: b */
    private final Sensor f133821b;

    /* JADX INFO: renamed from: d */
    private float f133823d;

    /* JADX INFO: renamed from: c */
    private final float[] f133822c = new float[3];

    /* JADX INFO: renamed from: e */
    private final CopyOnWriteArrayList<InterfaceC18472b> f133824e = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: f */
    private final SensorEventListener f133825f = new C18471a();

    /* JADX INFO: renamed from: l.lwk$b */
    public interface InterfaceC18472b {
        /* JADX INFO: renamed from: a */
        void mo81993a();
    }

    public lwk(Context context) {
        C13504g.m81997a("Gyro", "Gyro");
        if (context != null) {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            this.f133820a = sensorManager;
            this.f133821b = sensorManager.getDefaultSensor(4);
        } else {
            this.f133820a = null;
            this.f133821b = null;
            C13504g.m81998b("Gyro", "Gyro init failed, no context");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m156062f() {
        C13504g.m81997a("Gyro", "clearAngle");
        float[] fArr = this.f133822c;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
    }

    /* JADX INFO: renamed from: g */
    public void m156063g() {
        C13504g.m82001e("Gyro", "destroy");
        this.f133824e.clear();
        m156062f();
        SensorManager sensorManager = this.f133820a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f133825f, this.f133821b);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m156064h(InterfaceC18472b interfaceC18472b, Handler handler) {
        if (this.f133820a == null || this.f133824e.contains(interfaceC18472b)) {
            return;
        }
        C13504g.m82001e("Gyro", "register");
        this.f133824e.add(interfaceC18472b);
        if (this.f133824e.size() == 1) {
            try {
                this.f133820a.registerListener(this.f133825f, this.f133821b, 3, handler);
            } catch (RuntimeException e) {
                C13504g.m82007k("Gyro", "sensorManager register listener exception occurred.", e);
                this.f133824e.remove(interfaceC18472b);
            }
            C13504g.m81997a("Gyro", "sensorManager register listener");
        }
        m156062f();
    }

    /* JADX INFO: renamed from: i */
    public void m156065i(InterfaceC18472b interfaceC18472b) {
        if (this.f133820a == null) {
            return;
        }
        C13504g.m82001e("Gyro", MiPushClient.COMMAND_UNREGISTER);
        this.f133824e.remove(interfaceC18472b);
        if (this.f133824e.isEmpty()) {
            this.f133820a.unregisterListener(this.f133825f, this.f133821b);
            C13504g.m81997a("Gyro", "sensorManager unregister listener");
        }
        m156062f();
    }

    /* JADX INFO: renamed from: l.lwk$a */
    public class C18471a implements SensorEventListener {
        public C18471a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (lwk.this.f133823d != 0.0f) {
                float f = (sensorEvent.timestamp - lwk.this.f133823d) * 1.0E-9f;
                float[] fArr = sensorEvent.values;
                float f2 = fArr[0];
                float f3 = fArr[1];
                float f4 = fArr[2];
                float fSqrt = (float) Math.sqrt((f2 * f2) + (f3 * f3) + (f4 * f4));
                float[] fArr2 = lwk.this.f133822c;
                fArr2[0] = fArr2[0] + (sensorEvent.values[0] * f);
                float[] fArr3 = lwk.this.f133822c;
                fArr3[1] = fArr3[1] + (sensorEvent.values[1] * f);
                float[] fArr4 = lwk.this.f133822c;
                fArr4[2] = fArr4[2] + (sensorEvent.values[2] * f);
                float fSqrt2 = (float) Math.sqrt((lwk.this.f133822c[0] * lwk.this.f133822c[0]) + (lwk.this.f133822c[1] * lwk.this.f133822c[1]) + (lwk.this.f133822c[2] * lwk.this.f133822c[2]));
                if (fSqrt > 0.5f || fSqrt2 > 0.5f) {
                    C13504g.m81997a("Gyro", "onSensorChanged omegaMagnitude = " + fSqrt + " angle = " + fSqrt2);
                    Iterator it = lwk.this.f133824e.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC18472b) it.next()).mo81993a();
                    }
                    lwk.this.m156062f();
                }
            }
            lwk.this.f133823d = sensorEvent.timestamp;
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    }
}
