package p149l;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.p069ss.android.ttvecamera.C13341g;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class vtk {

    /* JADX INFO: renamed from: a */
    private final SensorManager f182971a;

    /* JADX INFO: renamed from: b */
    private final Sensor f182972b;

    /* JADX INFO: renamed from: d */
    private float f182974d;

    /* JADX INFO: renamed from: c */
    private final float[] f182973c = new float[3];

    /* JADX INFO: renamed from: e */
    private final CopyOnWriteArrayList<InterfaceC20728b> f182975e = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: f */
    private final SensorEventListener f182976f = new C20727a();

    /* JADX INFO: renamed from: l.vtk$b */
    public interface InterfaceC20728b {
        /* JADX INFO: renamed from: a */
        void mo80810a();
    }

    public vtk(Context context) {
        C13341g.m80814a("Gyro", "Gyro");
        if (context != null) {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            this.f182971a = sensorManager;
            this.f182972b = sensorManager.getDefaultSensor(4);
        } else {
            this.f182971a = null;
            this.f182972b = null;
            C13341g.m80815b("Gyro", "Gyro init failed, no context");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m200034f() {
        C13341g.m80814a("Gyro", "clearAngle");
        float[] fArr = this.f182973c;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
    }

    /* JADX INFO: renamed from: g */
    public void m200035g() {
        C13341g.m80818e("Gyro", "destroy");
        this.f182975e.clear();
        m200034f();
        SensorManager sensorManager = this.f182971a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f182976f, this.f182972b);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m200036h(InterfaceC20728b interfaceC20728b, Handler handler) {
        if (this.f182971a == null || this.f182975e.contains(interfaceC20728b)) {
            return;
        }
        C13341g.m80818e("Gyro", "register");
        this.f182975e.add(interfaceC20728b);
        if (this.f182975e.size() == 1) {
            try {
                this.f182971a.registerListener(this.f182976f, this.f182972b, 3, handler);
            } catch (RuntimeException e) {
                C13341g.m80824k("Gyro", "sensorManager register listener exception occurred.", e);
                this.f182975e.remove(interfaceC20728b);
            }
            C13341g.m80814a("Gyro", "sensorManager register listener");
        }
        m200034f();
    }

    /* JADX INFO: renamed from: i */
    public void m200037i(InterfaceC20728b interfaceC20728b) {
        if (this.f182971a == null) {
            return;
        }
        C13341g.m80818e("Gyro", MiPushClient.COMMAND_UNREGISTER);
        this.f182975e.remove(interfaceC20728b);
        if (this.f182975e.isEmpty()) {
            this.f182971a.unregisterListener(this.f182976f, this.f182972b);
            C13341g.m80814a("Gyro", "sensorManager unregister listener");
        }
        m200034f();
    }

    /* JADX INFO: renamed from: l.vtk$a */
    public class C20727a implements SensorEventListener {
        public C20727a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (vtk.this.f182974d != 0.0f) {
                float f = (sensorEvent.timestamp - vtk.this.f182974d) * 1.0E-9f;
                float[] fArr = sensorEvent.values;
                float f2 = fArr[0];
                float f3 = fArr[1];
                float f4 = fArr[2];
                float fSqrt = (float) Math.sqrt((f2 * f2) + (f3 * f3) + (f4 * f4));
                float[] fArr2 = vtk.this.f182973c;
                fArr2[0] = fArr2[0] + (sensorEvent.values[0] * f);
                float[] fArr3 = vtk.this.f182973c;
                fArr3[1] = fArr3[1] + (sensorEvent.values[1] * f);
                float[] fArr4 = vtk.this.f182973c;
                fArr4[2] = fArr4[2] + (sensorEvent.values[2] * f);
                float fSqrt2 = (float) Math.sqrt((vtk.this.f182973c[0] * vtk.this.f182973c[0]) + (vtk.this.f182973c[1] * vtk.this.f182973c[1]) + (vtk.this.f182973c[2] * vtk.this.f182973c[2]));
                if (fSqrt > 0.5f || fSqrt2 > 0.5f) {
                    C13341g.m80814a("Gyro", "onSensorChanged omegaMagnitude = " + fSqrt + " angle = " + fSqrt2);
                    Iterator it = vtk.this.f182975e.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC20728b) it.next()).mo80810a();
                    }
                    vtk.this.m200034f();
                }
            }
            vtk.this.f182974d = sensorEvent.timestamp;
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    }
}
