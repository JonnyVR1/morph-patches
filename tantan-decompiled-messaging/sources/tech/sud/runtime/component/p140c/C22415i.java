package tech.sud.runtime.component.p140c;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import org.json.JSONException;
import org.json.JSONObject;
import tech.sud.runtime.core.C22443b;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.i */
/* JADX INFO: loaded from: classes3.dex */
public class C22415i {

    /* JADX INFO: renamed from: a */
    private C22443b f207657a;

    /* JADX INFO: renamed from: b */
    private SensorManager f207658b = null;

    /* JADX INFO: renamed from: c */
    private a f207659c = null;

    /* JADX INFO: renamed from: d */
    private a f207660d = null;

    /* JADX INFO: renamed from: e */
    private a f207661e = null;

    /* JADX INFO: renamed from: f */
    private a f207662f = null;

    public C22415i(C22443b c22443b) {
        this.f207657a = c22443b;
    }

    /* JADX INFO: renamed from: a */
    public void m221727a(int i, int i2) {
        Context contextM221954d;
        C22443b c22443b = this.f207657a;
        if (c22443b == null || (contextM221954d = c22443b.m221954d()) == null) {
            return;
        }
        if (this.f207658b == null) {
            this.f207658b = (SensorManager) contextM221954d.getSystemService("sensor");
        }
        int iM221724b = m221724b(i2);
        if (i == 1) {
            if (this.f207659c == null) {
                a aVar = new a(c22443b, this.f207658b, 1, iM221724b);
                this.f207659c = aVar;
                aVar.m221730a(this.f207658b);
                return;
            }
            return;
        }
        if (i == 2) {
            if (this.f207660d == null) {
                a aVar2 = new a(c22443b, this.f207658b, 3, 3);
                this.f207660d = aVar2;
                aVar2.m221730a(this.f207658b);
                return;
            }
            return;
        }
        if (i == 3) {
            if (this.f207662f == null) {
                a aVar3 = new a(c22443b, this.f207658b, 3, iM221724b, 3);
                this.f207662f = aVar3;
                aVar3.m221730a(this.f207658b);
                return;
            }
            return;
        }
        if (i == 4 && this.f207661e == null) {
            a aVar4 = new a(c22443b, this.f207658b, 4, iM221724b);
            this.f207661e = aVar4;
            aVar4.m221730a(this.f207658b);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m221728b() {
        SensorManager sensorManager = this.f207658b;
        if (sensorManager != null) {
            a aVar = this.f207659c;
            if (aVar != null) {
                aVar.m221732b(sensorManager);
            }
            a aVar2 = this.f207660d;
            if (aVar2 != null) {
                aVar2.m221732b(this.f207658b);
            }
            a aVar3 = this.f207661e;
            if (aVar3 != null) {
                aVar3.m221732b(this.f207658b);
            }
            a aVar4 = this.f207662f;
            if (aVar4 != null) {
                aVar4.m221732b(this.f207658b);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m221729c() {
        SensorManager sensorManager = this.f207658b;
        if (sensorManager != null) {
            a aVar = this.f207659c;
            if (aVar != null) {
                aVar.m221730a(sensorManager);
            }
            a aVar2 = this.f207660d;
            if (aVar2 != null) {
                aVar2.m221730a(this.f207658b);
            }
            a aVar3 = this.f207661e;
            if (aVar3 != null) {
                aVar3.m221730a(this.f207658b);
            }
            a aVar4 = this.f207662f;
            if (aVar4 != null) {
                aVar4.m221730a(this.f207658b);
            }
        }
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.i$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private Sensor f207663a;

        /* JADX INFO: renamed from: b */
        private SensorEventListener f207664b;

        /* JADX INFO: renamed from: c */
        private int f207665c;

        private a(C22443b c22443b, SensorManager sensorManager, int i, int i2) {
            this.f207663a = sensorManager.getDefaultSensor(i);
            this.f207664b = new b(c22443b);
            this.f207665c = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m221730a(SensorManager sensorManager) {
            sensorManager.registerListener(this.f207664b, this.f207663a, this.f207665c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public void m221732b(SensorManager sensorManager) {
            sensorManager.unregisterListener(this.f207664b, this.f207663a);
        }

        private a(C22443b c22443b, SensorManager sensorManager, int i, int i2, int i3) {
            this.f207663a = sensorManager.getDefaultSensor(i);
            this.f207664b = new b(c22443b, i3);
            this.f207665c = i2;
        }
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.i$b */
    public static class b implements SensorEventListener {

        /* JADX INFO: renamed from: a */
        private C22443b f207666a;

        /* JADX INFO: renamed from: b */
        private int f207667b;

        /* JADX INFO: renamed from: c */
        private String f207668c = "low";

        public b(C22443b c22443b, int i) {
            this.f207666a = c22443b;
            this.f207667b = i;
        }

        /* JADX INFO: renamed from: a */
        private void m221734a(String str, JSONObject jSONObject) {
            C22443b c22443b = this.f207666a;
            if (c22443b == null) {
                return;
            }
            c22443b.m221951a(str, jSONObject);
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
            if (sensor.getType() == 3) {
                if (i == 2) {
                    this.f207668c = "medium";
                } else if (i != 3) {
                    this.f207668c = "low";
                } else {
                    this.f207668c = Constants.PRIORITY_HIGH;
                }
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            int type = sensorEvent.sensor.getType();
            if (type == 1) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(BaseSei.f13930X, ((double) sensorEvent.values[0]) * (-0.1d));
                    jSONObject.put(BaseSei.f13931Y, ((double) sensorEvent.values[1]) * (-0.1d));
                    jSONObject.put(BaseSei.f13932Z, ((double) sensorEvent.values[2]) * (-0.1d));
                } catch (JSONException unused) {
                }
                m221734a("AccelerometerChange", jSONObject);
                return;
            }
            if (type != 3) {
                if (type != 4) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(BaseSei.f13930X, sensorEvent.values[0]);
                    jSONObject2.put(BaseSei.f13931Y, sensorEvent.values[1]);
                    jSONObject2.put(BaseSei.f13932Z, sensorEvent.values[2]);
                } catch (JSONException unused2) {
                }
                m221734a("GyroscopeChange", jSONObject2);
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            if (this.f207667b != 3) {
                try {
                    jSONObject3.put("direction", sensorEvent.values[0]);
                    jSONObject3.put("accuracy", this.f207668c);
                } catch (JSONException unused3) {
                }
                m221734a("CompassChange", jSONObject3);
            } else {
                try {
                    jSONObject3.put("alpha", sensorEvent.values[0]);
                    jSONObject3.put("beta", sensorEvent.values[1]);
                    jSONObject3.put("gamma", sensorEvent.values[2]);
                } catch (JSONException unused4) {
                }
                m221734a("DeviceMotionChange", jSONObject3);
            }
        }

        public b(C22443b c22443b) {
            this.f207666a = c22443b;
        }
    }

    /* JADX INFO: renamed from: b */
    private static int m221724b(int i) {
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
    public void m221725a() {
        this.f207657a = null;
        a aVar = this.f207659c;
        if (aVar != null) {
            aVar.m221732b(this.f207658b);
            this.f207659c = null;
        }
        a aVar2 = this.f207660d;
        if (aVar2 != null) {
            aVar2.m221732b(this.f207658b);
            this.f207660d = null;
        }
        a aVar3 = this.f207661e;
        if (aVar3 != null) {
            aVar3.m221732b(this.f207658b);
            this.f207661e = null;
        }
        a aVar4 = this.f207662f;
        if (aVar4 != null) {
            aVar4.m221732b(this.f207658b);
            this.f207662f = null;
        }
        this.f207658b = null;
    }

    /* JADX INFO: renamed from: a */
    public void m221726a(int i) {
        a aVar;
        if (i == 1) {
            a aVar2 = this.f207659c;
            if (aVar2 != null) {
                aVar2.m221732b(this.f207658b);
                this.f207659c = null;
                return;
            }
            return;
        }
        if (i == 2) {
            a aVar3 = this.f207660d;
            if (aVar3 != null) {
                aVar3.m221732b(this.f207658b);
                this.f207660d = null;
                return;
            }
            return;
        }
        if (i != 3) {
            if (i == 4 && (aVar = this.f207661e) != null) {
                aVar.m221732b(this.f207658b);
                this.f207661e = null;
                return;
            }
            return;
        }
        a aVar4 = this.f207662f;
        if (aVar4 != null) {
            aVar4.m221732b(this.f207658b);
            this.f207662f = null;
        }
    }
}
