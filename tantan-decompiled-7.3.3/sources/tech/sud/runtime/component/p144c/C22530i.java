package tech.sud.runtime.component.p144c;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import org.json.JSONException;
import org.json.JSONObject;
import tech.sud.runtime.core.C22558b;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.i */
/* JADX INFO: loaded from: classes3.dex */
public class C22530i {

    /* JADX INFO: renamed from: a */
    private C22558b f208579a;

    /* JADX INFO: renamed from: b */
    private SensorManager f208580b = null;

    /* JADX INFO: renamed from: c */
    private a f208581c = null;

    /* JADX INFO: renamed from: d */
    private a f208582d = null;

    /* JADX INFO: renamed from: e */
    private a f208583e = null;

    /* JADX INFO: renamed from: f */
    private a f208584f = null;

    public C22530i(C22558b c22558b) {
        this.f208579a = c22558b;
    }

    /* JADX INFO: renamed from: a */
    public void m222973a(int i, int i2) {
        Context contextM223200d;
        C22558b c22558b = this.f208579a;
        if (c22558b == null || (contextM223200d = c22558b.m223200d()) == null) {
            return;
        }
        if (this.f208580b == null) {
            this.f208580b = (SensorManager) contextM223200d.getSystemService("sensor");
        }
        int iM222970b = m222970b(i2);
        if (i == 1) {
            if (this.f208581c == null) {
                a aVar = new a(c22558b, this.f208580b, 1, iM222970b);
                this.f208581c = aVar;
                aVar.m222976a(this.f208580b);
                return;
            }
            return;
        }
        if (i == 2) {
            if (this.f208582d == null) {
                a aVar2 = new a(c22558b, this.f208580b, 3, 3);
                this.f208582d = aVar2;
                aVar2.m222976a(this.f208580b);
                return;
            }
            return;
        }
        if (i == 3) {
            if (this.f208584f == null) {
                a aVar3 = new a(c22558b, this.f208580b, 3, iM222970b, 3);
                this.f208584f = aVar3;
                aVar3.m222976a(this.f208580b);
                return;
            }
            return;
        }
        if (i == 4 && this.f208583e == null) {
            a aVar4 = new a(c22558b, this.f208580b, 4, iM222970b);
            this.f208583e = aVar4;
            aVar4.m222976a(this.f208580b);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m222974b() {
        SensorManager sensorManager = this.f208580b;
        if (sensorManager != null) {
            a aVar = this.f208581c;
            if (aVar != null) {
                aVar.m222978b(sensorManager);
            }
            a aVar2 = this.f208582d;
            if (aVar2 != null) {
                aVar2.m222978b(this.f208580b);
            }
            a aVar3 = this.f208583e;
            if (aVar3 != null) {
                aVar3.m222978b(this.f208580b);
            }
            a aVar4 = this.f208584f;
            if (aVar4 != null) {
                aVar4.m222978b(this.f208580b);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m222975c() {
        SensorManager sensorManager = this.f208580b;
        if (sensorManager != null) {
            a aVar = this.f208581c;
            if (aVar != null) {
                aVar.m222976a(sensorManager);
            }
            a aVar2 = this.f208582d;
            if (aVar2 != null) {
                aVar2.m222976a(this.f208580b);
            }
            a aVar3 = this.f208583e;
            if (aVar3 != null) {
                aVar3.m222976a(this.f208580b);
            }
            a aVar4 = this.f208584f;
            if (aVar4 != null) {
                aVar4.m222976a(this.f208580b);
            }
        }
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.i$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private Sensor f208585a;

        /* JADX INFO: renamed from: b */
        private SensorEventListener f208586b;

        /* JADX INFO: renamed from: c */
        private int f208587c;

        private a(C22558b c22558b, SensorManager sensorManager, int i, int i2) {
            this.f208585a = sensorManager.getDefaultSensor(i);
            this.f208586b = new b(c22558b);
            this.f208587c = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m222976a(SensorManager sensorManager) {
            sensorManager.registerListener(this.f208586b, this.f208585a, this.f208587c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public void m222978b(SensorManager sensorManager) {
            sensorManager.unregisterListener(this.f208586b, this.f208585a);
        }

        private a(C22558b c22558b, SensorManager sensorManager, int i, int i2, int i3) {
            this.f208585a = sensorManager.getDefaultSensor(i);
            this.f208586b = new b(c22558b, i3);
            this.f208587c = i2;
        }
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.i$b */
    public static class b implements SensorEventListener {

        /* JADX INFO: renamed from: a */
        private C22558b f208588a;

        /* JADX INFO: renamed from: b */
        private int f208589b;

        /* JADX INFO: renamed from: c */
        private String f208590c = "low";

        public b(C22558b c22558b, int i) {
            this.f208588a = c22558b;
            this.f208589b = i;
        }

        /* JADX INFO: renamed from: a */
        private void m222980a(String str, JSONObject jSONObject) {
            C22558b c22558b = this.f208588a;
            if (c22558b == null) {
                return;
            }
            c22558b.m223197a(str, jSONObject);
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
            if (sensor.getType() == 3) {
                if (i == 2) {
                    this.f208590c = "medium";
                } else if (i != 3) {
                    this.f208590c = "low";
                } else {
                    this.f208590c = Constants.PRIORITY_HIGH;
                }
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            int type = sensorEvent.sensor.getType();
            if (type == 1) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(BaseSei.f14624X, ((double) sensorEvent.values[0]) * (-0.1d));
                    jSONObject.put(BaseSei.f14625Y, ((double) sensorEvent.values[1]) * (-0.1d));
                    jSONObject.put(BaseSei.f14626Z, ((double) sensorEvent.values[2]) * (-0.1d));
                } catch (JSONException unused) {
                }
                m222980a("AccelerometerChange", jSONObject);
                return;
            }
            if (type != 3) {
                if (type != 4) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(BaseSei.f14624X, sensorEvent.values[0]);
                    jSONObject2.put(BaseSei.f14625Y, sensorEvent.values[1]);
                    jSONObject2.put(BaseSei.f14626Z, sensorEvent.values[2]);
                } catch (JSONException unused2) {
                }
                m222980a("GyroscopeChange", jSONObject2);
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            if (this.f208589b != 3) {
                try {
                    jSONObject3.put("direction", sensorEvent.values[0]);
                    jSONObject3.put("accuracy", this.f208590c);
                } catch (JSONException unused3) {
                }
                m222980a("CompassChange", jSONObject3);
            } else {
                try {
                    jSONObject3.put("alpha", sensorEvent.values[0]);
                    jSONObject3.put("beta", sensorEvent.values[1]);
                    jSONObject3.put("gamma", sensorEvent.values[2]);
                } catch (JSONException unused4) {
                }
                m222980a("DeviceMotionChange", jSONObject3);
            }
        }

        public b(C22558b c22558b) {
            this.f208588a = c22558b;
        }
    }

    /* JADX INFO: renamed from: b */
    private static int m222970b(int i) {
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
    public void m222971a() {
        this.f208579a = null;
        a aVar = this.f208581c;
        if (aVar != null) {
            aVar.m222978b(this.f208580b);
            this.f208581c = null;
        }
        a aVar2 = this.f208582d;
        if (aVar2 != null) {
            aVar2.m222978b(this.f208580b);
            this.f208582d = null;
        }
        a aVar3 = this.f208583e;
        if (aVar3 != null) {
            aVar3.m222978b(this.f208580b);
            this.f208583e = null;
        }
        a aVar4 = this.f208584f;
        if (aVar4 != null) {
            aVar4.m222978b(this.f208580b);
            this.f208584f = null;
        }
        this.f208580b = null;
    }

    /* JADX INFO: renamed from: a */
    public void m222972a(int i) {
        a aVar;
        if (i == 1) {
            a aVar2 = this.f208581c;
            if (aVar2 != null) {
                aVar2.m222978b(this.f208580b);
                this.f208581c = null;
                return;
            }
            return;
        }
        if (i == 2) {
            a aVar3 = this.f208582d;
            if (aVar3 != null) {
                aVar3.m222978b(this.f208580b);
                this.f208582d = null;
                return;
            }
            return;
        }
        if (i != 3) {
            if (i == 4 && (aVar = this.f208583e) != null) {
                aVar.m222978b(this.f208580b);
                this.f208583e = null;
                return;
            }
            return;
        }
        a aVar4 = this.f208584f;
        if (aVar4 != null) {
            aVar4.m222978b(this.f208580b);
            this.f208584f = null;
        }
    }
}
