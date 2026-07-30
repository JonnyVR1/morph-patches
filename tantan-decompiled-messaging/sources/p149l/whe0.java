package p149l;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class whe0 {

    /* JADX INFO: renamed from: r */
    private JSONObject f186414r;

    /* JADX INFO: renamed from: a */
    private SensorManager f186397a = null;

    /* JADX INFO: renamed from: b */
    private Sensor f186398b = null;

    /* JADX INFO: renamed from: c */
    private Sensor f186399c = null;

    /* JADX INFO: renamed from: d */
    private Sensor f186400d = null;

    /* JADX INFO: renamed from: e */
    private Sensor f186401e = null;

    /* JADX INFO: renamed from: f */
    private boolean f186402f = true;

    /* JADX INFO: renamed from: g */
    private double f186403g = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: h */
    private double f186404h = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: i */
    private double f186405i = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: j */
    private boolean f186406j = true;

    /* JADX INFO: renamed from: k */
    private double f186407k = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: l */
    private double f186408l = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: m */
    private double f186409m = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: n */
    private boolean f186410n = true;

    /* JADX INFO: renamed from: o */
    private double f186411o = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: p */
    private double f186412p = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: q */
    private double f186413q = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: s */
    private final SensorEventListener f186415s = new C20876a();

    public whe0() {
        this.f186414r = null;
        JSONObject jSONObject = new JSONObject();
        this.f186414r = jSONObject;
        try {
            jSONObject.put(sgw.m184137a(new byte[]{67, 18, 84, 71, 62, 2, 85, 18, 84, 84, 21, 9, 66}), 0);
            this.f186414r.put(sgw.m184137a(new byte[]{95, 20, 88, 82, 15, 18, 81, 18, 88, 88, 15}), 0);
            this.f186414r.put(sgw.m184137a(new byte[]{87, 31, 67, 88, 18, 5, 95, 22, 84}), 0);
            this.f186414r.put(sgw.m184137a(new byte[]{81, 5, 82, 82, HttpTokens.CARRIAGE_RETURN, 3, 66, 9, 92, 82, 21, 3, 66}), 0);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: y */
    private void m203160y(int i, String str) {
        Sensor defaultSensor = this.f186397a.getDefaultSensor(i);
        if (defaultSensor != null) {
            this.f186397a.registerListener(this.f186415s, defaultSensor, 3);
        } else {
            try {
                this.f186414r.put(str, -1);
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public void m203161A() {
        try {
            SensorManager sensorManager = this.f186397a;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this.f186415s);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: w */
    public String m203162w() {
        return this.f186414r.toString();
    }

    /* JADX INFO: renamed from: x */
    public double m203163x(float f, float f2, float f3) {
        return Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
    }

    /* JADX INFO: renamed from: z */
    public void m203164z(Context context) {
        this.f186397a = (SensorManager) context.getSystemService(sgw.m184137a(new byte[]{67, 3, 95, 68, 14, 20}));
        m203160y(18, sgw.m184137a(new byte[]{67, 18, 84, 71, 62, 2, 85, 18, 84, 84, 21, 9, 66}));
        m203160y(4, sgw.m184137a(new byte[]{87, 31, 67, 88, 18, 5, 95, 22, 84}));
        m203160y(1, sgw.m184137a(new byte[]{81, 5, 82, 82, HttpTokens.CARRIAGE_RETURN, 3, 66, 9, 92, 82, 21, 3, 66}));
        m203160y(3, sgw.m184137a(new byte[]{95, 20, 88, 82, 15, 18, 81, 18, 88, 88, 15}));
    }

    /* JADX INFO: renamed from: l.whe0$a */
    public class C20876a implements SensorEventListener {
        public C20876a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr;
            int type = sensorEvent.sensor.getType();
            if (type == 1) {
                float[] fArr2 = sensorEvent.values;
                if (fArr2 == null || fArr2.length < 3) {
                    return;
                }
                whe0 whe0Var = whe0.this;
                whe0Var.f186409m = whe0Var.m203163x(fArr2[0], fArr2[1], fArr2[2]);
                if (whe0.this.f186406j) {
                    double d = whe0.this.f186409m;
                    double d2 = whe0.this.f186408l;
                    whe0 whe0Var2 = whe0.this;
                    if (d >= d2) {
                        whe0Var2.f186408l = whe0Var2.f186409m;
                    } else if (Math.abs(whe0Var2.f186409m - whe0.this.f186408l) > 1.0d) {
                        whe0 whe0Var3 = whe0.this;
                        whe0Var3.f186407k = whe0Var3.f186409m;
                        whe0.this.f186406j = false;
                        try {
                            whe0.this.f186414r.put(sgw.m184137a(new byte[]{81, 5, 82, 82, HttpTokens.CARRIAGE_RETURN, 3, 66, 9, 92, 82, 21, 3, 66}), Math.abs(whe0.this.f186409m - whe0.this.f186408l));
                        } catch (JSONException unused) {
                        }
                    }
                }
                if (whe0.this.f186406j) {
                    return;
                }
                double d3 = whe0.this.f186409m;
                double d4 = whe0.this.f186408l;
                whe0 whe0Var4 = whe0.this;
                if (d3 <= d4) {
                    whe0Var4.f186408l = whe0Var4.f186409m;
                    return;
                } else {
                    if (Math.abs(whe0Var4.f186409m - whe0.this.f186408l) > 1.0d) {
                        whe0 whe0Var5 = whe0.this;
                        whe0Var5.f186407k = whe0Var5.f186409m;
                        whe0.this.f186406j = true;
                        return;
                    }
                    return;
                }
            }
            if (type == 18) {
                float[] fArr3 = sensorEvent.values;
                if (fArr3 == null || fArr3.length < 1) {
                    return;
                }
                try {
                    whe0.this.f186414r.put(sgw.m184137a(new byte[]{67, 18, 84, 71, 62, 2, 85, 18, 84, 84, 21, 9, 66}), fArr3[0]);
                    return;
                } catch (JSONException unused2) {
                    return;
                }
            }
            if (type == 3) {
                float[] fArr4 = sensorEvent.values;
                if (fArr4 == null || fArr4.length < 3) {
                    return;
                }
                whe0 whe0Var6 = whe0.this;
                whe0Var6.f186411o = whe0Var6.m203163x(fArr4[0], fArr4[1], fArr4[2]);
                if (whe0.this.f186410n) {
                    if (whe0.this.f186411o >= whe0.this.f186412p) {
                        whe0 whe0Var7 = whe0.this;
                        whe0Var7.f186412p = whe0Var7.f186411o;
                    }
                    if (Math.abs(whe0.this.f186411o - whe0.this.f186412p) > 0.5d) {
                        whe0 whe0Var8 = whe0.this;
                        whe0Var8.f186413q = whe0Var8.f186411o;
                        whe0.this.f186410n = false;
                        try {
                            whe0.this.f186414r.put(sgw.m184137a(new byte[]{95, 20, 88, 82, 15, 18, 81, 18, 88, 88, 15}), Math.abs(whe0.this.f186411o - whe0.this.f186412p));
                        } catch (JSONException unused3) {
                        }
                    }
                }
                if (whe0.this.f186410n) {
                    return;
                }
                if (whe0.this.f186411o <= whe0.this.f186412p) {
                    whe0 whe0Var9 = whe0.this;
                    whe0Var9.f186412p = whe0Var9.f186411o;
                }
                if (Math.abs(whe0.this.f186411o - whe0.this.f186412p) > 0.5d) {
                    whe0 whe0Var10 = whe0.this;
                    whe0Var10.f186413q = whe0Var10.f186411o;
                    whe0.this.f186410n = true;
                    return;
                }
                return;
            }
            if (type == 4 && (fArr = sensorEvent.values) != null && fArr.length >= 3) {
                float degrees = (float) Math.toDegrees(fArr[0]);
                float degrees2 = (float) Math.toDegrees(sensorEvent.values[1]);
                float degrees3 = (float) Math.toDegrees(sensorEvent.values[2]);
                whe0 whe0Var11 = whe0.this;
                whe0Var11.f186405i = whe0Var11.m203163x(degrees, degrees2, degrees3);
                if (whe0.this.f186402f) {
                    double d5 = whe0.this.f186405i;
                    double d6 = whe0.this.f186404h;
                    whe0 whe0Var12 = whe0.this;
                    if (d5 >= d6) {
                        whe0Var12.f186404h = whe0Var12.f186405i;
                    } else if (Math.abs(whe0Var12.f186405i - whe0.this.f186404h) > 10.0d) {
                        whe0 whe0Var13 = whe0.this;
                        whe0Var13.f186403g = whe0Var13.f186405i;
                        whe0.this.f186402f = false;
                        try {
                            whe0.this.f186414r.put(sgw.m184137a(new byte[]{87, 31, 67, 88, 18, 5, 95, 22, 84}), Math.abs(whe0.this.f186405i - whe0.this.f186404h));
                        } catch (JSONException unused4) {
                        }
                    }
                }
                if (whe0.this.f186402f) {
                    return;
                }
                double d7 = whe0.this.f186405i;
                double d8 = whe0.this.f186404h;
                whe0 whe0Var14 = whe0.this;
                if (d7 <= d8) {
                    whe0Var14.f186404h = whe0Var14.f186405i;
                } else if (Math.abs(whe0Var14.f186405i - whe0.this.f186404h) > 10.0d) {
                    whe0 whe0Var15 = whe0.this;
                    whe0Var15.f186403g = whe0Var15.f186405i;
                    whe0.this.f186402f = true;
                }
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    }
}
