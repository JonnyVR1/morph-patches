package p009l;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.p008ss.android.ttvecamera.C0743g;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class vtk {

    /* JADX INFO: renamed from: a */
    private final SensorManager f21781a;

    /* JADX INFO: renamed from: b */
    private final Sensor f21782b;

    /* JADX INFO: renamed from: d */
    private float f21784d;

    /* JADX INFO: renamed from: c */
    private final float[] f21783c = new float[3];

    /* JADX INFO: renamed from: e */
    private final CopyOnWriteArrayList<InterfaceC1275b> f21785e = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: f */
    private final SensorEventListener f21786f = new C1274a();

    /* JADX INFO: renamed from: l.vtk$b */
    public interface InterfaceC1275b {
        /* JADX INFO: renamed from: a */
        void mo11161a();
    }

    public vtk(Context context) {
        C0743g.m11165a("Gyro", "Gyro");
        if (context != null) {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            this.f21781a = sensorManager;
            this.f21782b = sensorManager.getDefaultSensor(4);
        } else {
            this.f21781a = null;
            this.f21782b = null;
            C0743g.m11166b("Gyro", "Gyro init failed, no context");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m23726f() {
        C0743g.m11165a("Gyro", "clearAngle");
        float[] fArr = this.f21783c;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
    }

    /* JADX INFO: renamed from: g */
    public void m23727g() {
        C0743g.m11169e("Gyro", "destroy");
        this.f21785e.clear();
        m23726f();
        SensorManager sensorManager = this.f21781a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f21786f, this.f21782b);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m23728h(InterfaceC1275b interfaceC1275b, Handler handler) {
        if (this.f21781a == null || this.f21785e.contains(interfaceC1275b)) {
            return;
        }
        C0743g.m11169e("Gyro", "register");
        this.f21785e.add(interfaceC1275b);
        if (this.f21785e.size() == 1) {
            try {
                this.f21781a.registerListener(this.f21786f, this.f21782b, 3, handler);
            } catch (RuntimeException e) {
                C0743g.m11175k("Gyro", "sensorManager register listener exception occurred.", e);
                this.f21785e.remove(interfaceC1275b);
            }
            C0743g.m11165a("Gyro", "sensorManager register listener");
        }
        m23726f();
    }

    /* JADX INFO: renamed from: i */
    public void m23729i(InterfaceC1275b interfaceC1275b) {
        if (this.f21781a == null) {
            return;
        }
        C0743g.m11169e("Gyro", "unregister");
        this.f21785e.remove(interfaceC1275b);
        if (this.f21785e.isEmpty()) {
            this.f21781a.unregisterListener(this.f21786f, this.f21782b);
            C0743g.m11165a("Gyro", "sensorManager unregister listener");
        }
        m23726f();
    }

    /* JADX INFO: renamed from: l.vtk$a */
    public class C1274a implements SensorEventListener {
        public C1274a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (vtk.this.f21784d != 0.0f) {
                float f = (sensorEvent.timestamp - vtk.this.f21784d) * 1.0E-9f;
                float[] fArr = sensorEvent.values;
                float f2 = fArr[0];
                float f3 = fArr[1];
                float f4 = fArr[2];
                float fSqrt = (float) Math.sqrt((f2 * f2) + (f3 * f3) + (f4 * f4));
                float[] fArr2 = vtk.this.f21783c;
                fArr2[0] = fArr2[0] + (sensorEvent.values[0] * f);
                float[] fArr3 = vtk.this.f21783c;
                fArr3[1] = fArr3[1] + (sensorEvent.values[1] * f);
                float[] fArr4 = vtk.this.f21783c;
                fArr4[2] = fArr4[2] + (sensorEvent.values[2] * f);
                float fSqrt2 = (float) Math.sqrt((vtk.this.f21783c[0] * vtk.this.f21783c[0]) + (vtk.this.f21783c[1] * vtk.this.f21783c[1]) + (vtk.this.f21783c[2] * vtk.this.f21783c[2]));
                if (fSqrt > 0.5f || fSqrt2 > 0.5f) {
                    C0743g.m11165a("Gyro", "onSensorChanged omegaMagnitude = " + fSqrt + " angle = " + fSqrt2);
                    Iterator it = vtk.this.f21785e.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1275b) it.next()).mo11161a();
                    }
                    vtk.this.m23726f();
                }
            }
            vtk.this.f21784d = sensorEvent.timestamp;
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    }
}
