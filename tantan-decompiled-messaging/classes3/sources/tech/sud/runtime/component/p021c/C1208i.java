package tech.sud.runtime.component.p021c;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONException;
import org.json.JSONObject;
import tech.sud.runtime.core.C1236b;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.i */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1208i {

    /* JADX INFO: renamed from: a */
    private C1236b f11282a;

    /* JADX INFO: renamed from: b */
    private SensorManager f11283b = null;

    /* JADX INFO: renamed from: c */
    private a f11284c = null;

    /* JADX INFO: renamed from: d */
    private a f11285d = null;

    /* JADX INFO: renamed from: e */
    private a f11286e = null;

    /* JADX INFO: renamed from: f */
    private a f11287f = null;

    public C1208i(C1236b c1236b) {
        this.f11282a = c1236b;
    }

    /* JADX INFO: renamed from: a */
    public void m10198a(int i, int i2) {
        Context contextM10425d;
        C1236b c1236b = this.f11282a;
        if (c1236b == null || (contextM10425d = c1236b.m10425d()) == null) {
            return;
        }
        if (this.f11283b == null) {
            this.f11283b = (SensorManager) contextM10425d.getSystemService("sensor");
        }
        int iM10195b = m10195b(i2);
        if (i == 1) {
            if (this.f11284c == null) {
                a aVar = new a(c1236b, this.f11283b, 1, iM10195b);
                this.f11284c = aVar;
                aVar.m10201a(this.f11283b);
                return;
            }
            return;
        }
        if (i == 2) {
            if (this.f11285d == null) {
                a aVar2 = new a(c1236b, this.f11283b, 3, 3);
                this.f11285d = aVar2;
                aVar2.m10201a(this.f11283b);
                return;
            }
            return;
        }
        if (i == 3) {
            if (this.f11287f == null) {
                a aVar3 = new a(c1236b, this.f11283b, 3, iM10195b, 3);
                this.f11287f = aVar3;
                aVar3.m10201a(this.f11283b);
                return;
            }
            return;
        }
        if (i == 4 && this.f11286e == null) {
            a aVar4 = new a(c1236b, this.f11283b, 4, iM10195b);
            this.f11286e = aVar4;
            aVar4.m10201a(this.f11283b);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m10199b() {
        SensorManager sensorManager = this.f11283b;
        if (sensorManager != null) {
            a aVar = this.f11284c;
            if (aVar != null) {
                aVar.m10203b(sensorManager);
            }
            a aVar2 = this.f11285d;
            if (aVar2 != null) {
                aVar2.m10203b(this.f11283b);
            }
            a aVar3 = this.f11286e;
            if (aVar3 != null) {
                aVar3.m10203b(this.f11283b);
            }
            a aVar4 = this.f11287f;
            if (aVar4 != null) {
                aVar4.m10203b(this.f11283b);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m10200c() {
        SensorManager sensorManager = this.f11283b;
        if (sensorManager != null) {
            a aVar = this.f11284c;
            if (aVar != null) {
                aVar.m10201a(sensorManager);
            }
            a aVar2 = this.f11285d;
            if (aVar2 != null) {
                aVar2.m10201a(this.f11283b);
            }
            a aVar3 = this.f11286e;
            if (aVar3 != null) {
                aVar3.m10201a(this.f11283b);
            }
            a aVar4 = this.f11287f;
            if (aVar4 != null) {
                aVar4.m10201a(this.f11283b);
            }
        }
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.i$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private Sensor f11288a;

        /* JADX INFO: renamed from: b */
        private SensorEventListener f11289b;

        /* JADX INFO: renamed from: c */
        private int f11290c;

        private a(C1236b c1236b, SensorManager sensorManager, int i, int i2) {
            this.f11288a = sensorManager.getDefaultSensor(i);
            this.f11289b = new b(c1236b);
            this.f11290c = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m10201a(SensorManager sensorManager) {
            sensorManager.registerListener(this.f11289b, this.f11288a, this.f11290c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public void m10203b(SensorManager sensorManager) {
            sensorManager.unregisterListener(this.f11289b, this.f11288a);
        }

        private a(C1236b c1236b, SensorManager sensorManager, int i, int i2, int i3) {
            this.f11288a = sensorManager.getDefaultSensor(i);
            this.f11289b = new b(c1236b, i3);
            this.f11290c = i2;
        }
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.i$b */
    public static class b implements SensorEventListener {

        /* JADX INFO: renamed from: a */
        private C1236b f11291a;

        /* JADX INFO: renamed from: b */
        private int f11292b;

        /* JADX INFO: renamed from: c */
        private String f11293c = "low";

        public b(C1236b c1236b, int i) {
            this.f11291a = c1236b;
            this.f11292b = i;
        }

        /* JADX INFO: renamed from: a */
        private void m10205a(String str, JSONObject jSONObject) {
            C1236b c1236b = this.f11291a;
            if (c1236b == null) {
                return;
            }
            c1236b.m10422a(str, jSONObject);
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
            if (sensor.getType() == 3) {
                if (i == 2) {
                    this.f11293c = "medium";
                } else if (i != 3) {
                    this.f11293c = "low";
                } else {
                    this.f11293c = "high";
                }
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            int type = sensorEvent.sensor.getType();
            if (type == 1) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("x", ((double) sensorEvent.values[0]) * (-0.1d));
                    jSONObject.put("y", ((double) sensorEvent.values[1]) * (-0.1d));
                    jSONObject.put("z", ((double) sensorEvent.values[2]) * (-0.1d));
                } catch (JSONException unused) {
                }
                m10205a("AccelerometerChange", jSONObject);
                return;
            }
            if (type != 3) {
                if (type != 4) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("x", sensorEvent.values[0]);
                    jSONObject2.put("y", sensorEvent.values[1]);
                    jSONObject2.put("z", sensorEvent.values[2]);
                } catch (JSONException unused2) {
                }
                m10205a("GyroscopeChange", jSONObject2);
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            if (this.f11292b != 3) {
                try {
                    jSONObject3.put("direction", sensorEvent.values[0]);
                    jSONObject3.put("accuracy", this.f11293c);
                } catch (JSONException unused3) {
                }
                m10205a("CompassChange", jSONObject3);
            } else {
                try {
                    jSONObject3.put("alpha", sensorEvent.values[0]);
                    jSONObject3.put("beta", sensorEvent.values[1]);
                    jSONObject3.put("gamma", sensorEvent.values[2]);
                } catch (JSONException unused4) {
                }
                m10205a("DeviceMotionChange", jSONObject3);
            }
        }

        public b(C1236b c1236b) {
            this.f11291a = c1236b;
        }
    }

    /* JADX INFO: renamed from: b */
    private static int m10195b(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 3;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public void m10196a() {
        this.f11282a = null;
        a aVar = this.f11284c;
        if (aVar != null) {
            aVar.m10203b(this.f11283b);
            this.f11284c = null;
        }
        a aVar2 = this.f11285d;
        if (aVar2 != null) {
            aVar2.m10203b(this.f11283b);
            this.f11285d = null;
        }
        a aVar3 = this.f11286e;
        if (aVar3 != null) {
            aVar3.m10203b(this.f11283b);
            this.f11286e = null;
        }
        a aVar4 = this.f11287f;
        if (aVar4 != null) {
            aVar4.m10203b(this.f11283b);
            this.f11287f = null;
        }
        this.f11283b = null;
    }

    /* JADX INFO: renamed from: a */
    public void m10197a(int i) {
        a aVar;
        if (i == 1) {
            a aVar2 = this.f11284c;
            if (aVar2 != null) {
                aVar2.m10203b(this.f11283b);
                this.f11284c = null;
                return;
            }
            return;
        }
        if (i == 2) {
            a aVar3 = this.f11285d;
            if (aVar3 != null) {
                aVar3.m10203b(this.f11283b);
                this.f11285d = null;
                return;
            }
            return;
        }
        if (i != 3) {
            if (i == 4 && (aVar = this.f11286e) != null) {
                aVar.m10203b(this.f11283b);
                this.f11286e = null;
                return;
            }
            return;
        }
        a aVar4 = this.f11287f;
        if (aVar4 != null) {
            aVar4.m10203b(this.f11283b);
            this.f11287f = null;
        }
    }
}
