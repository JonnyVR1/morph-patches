package p153l;

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
public class bqe0 {

    /* JADX INFO: renamed from: r */
    private JSONObject f77893r;

    /* JADX INFO: renamed from: a */
    private SensorManager f77876a = null;

    /* JADX INFO: renamed from: b */
    private Sensor f77877b = null;

    /* JADX INFO: renamed from: c */
    private Sensor f77878c = null;

    /* JADX INFO: renamed from: d */
    private Sensor f77879d = null;

    /* JADX INFO: renamed from: e */
    private Sensor f77880e = null;

    /* JADX INFO: renamed from: f */
    private boolean f77881f = true;

    /* JADX INFO: renamed from: g */
    private double f77882g = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: h */
    private double f77883h = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: i */
    private double f77884i = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: j */
    private boolean f77885j = true;

    /* JADX INFO: renamed from: k */
    private double f77886k = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: l */
    private double f77887l = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: m */
    private double f77888m = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: n */
    private boolean f77889n = true;

    /* JADX INFO: renamed from: o */
    private double f77890o = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: p */
    private double f77891p = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: q */
    private double f77892q = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: s */
    private final SensorEventListener f77894s = new C16081a();

    public bqe0() {
        this.f77893r = null;
        JSONObject jSONObject = new JSONObject();
        this.f77893r = jSONObject;
        try {
            jSONObject.put(riw.m181611a(new byte[]{67, 18, 84, 71, 62, 2, 85, 18, 84, 84, 21, 9, 66}), 0);
            this.f77893r.put(riw.m181611a(new byte[]{95, 20, 88, 82, 15, 18, 81, 18, 88, 88, 15}), 0);
            this.f77893r.put(riw.m181611a(new byte[]{87, 31, 67, 88, 18, 5, 95, 22, 84}), 0);
            this.f77893r.put(riw.m181611a(new byte[]{81, 5, 82, 82, HttpTokens.CARRIAGE_RETURN, 3, 66, 9, 92, 82, 21, 3, 66}), 0);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: y */
    private void m105910y(int i, String str) {
        Sensor defaultSensor = this.f77876a.getDefaultSensor(i);
        if (defaultSensor != null) {
            this.f77876a.registerListener(this.f77894s, defaultSensor, 3);
        } else {
            try {
                this.f77893r.put(str, -1);
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public void m105911A() {
        try {
            SensorManager sensorManager = this.f77876a;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this.f77894s);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: w */
    public String m105912w() {
        return this.f77893r.toString();
    }

    /* JADX INFO: renamed from: x */
    public double m105913x(float f, float f2, float f3) {
        return Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
    }

    /* JADX INFO: renamed from: z */
    public void m105914z(Context context) {
        this.f77876a = (SensorManager) context.getSystemService(riw.m181611a(new byte[]{67, 3, 95, 68, 14, 20}));
        m105910y(18, riw.m181611a(new byte[]{67, 18, 84, 71, 62, 2, 85, 18, 84, 84, 21, 9, 66}));
        m105910y(4, riw.m181611a(new byte[]{87, 31, 67, 88, 18, 5, 95, 22, 84}));
        m105910y(1, riw.m181611a(new byte[]{81, 5, 82, 82, HttpTokens.CARRIAGE_RETURN, 3, 66, 9, 92, 82, 21, 3, 66}));
        m105910y(3, riw.m181611a(new byte[]{95, 20, 88, 82, 15, 18, 81, 18, 88, 88, 15}));
    }

    /* JADX INFO: renamed from: l.bqe0$a */
    public class C16081a implements SensorEventListener {
        public C16081a() {
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
                bqe0 bqe0Var = bqe0.this;
                bqe0Var.f77888m = bqe0Var.m105913x(fArr2[0], fArr2[1], fArr2[2]);
                if (bqe0.this.f77885j) {
                    double d = bqe0.this.f77888m;
                    double d2 = bqe0.this.f77887l;
                    bqe0 bqe0Var2 = bqe0.this;
                    if (d >= d2) {
                        bqe0Var2.f77887l = bqe0Var2.f77888m;
                    } else if (Math.abs(bqe0Var2.f77888m - bqe0.this.f77887l) > 1.0d) {
                        bqe0 bqe0Var3 = bqe0.this;
                        bqe0Var3.f77886k = bqe0Var3.f77888m;
                        bqe0.this.f77885j = false;
                        try {
                            bqe0.this.f77893r.put(riw.m181611a(new byte[]{81, 5, 82, 82, HttpTokens.CARRIAGE_RETURN, 3, 66, 9, 92, 82, 21, 3, 66}), Math.abs(bqe0.this.f77888m - bqe0.this.f77887l));
                        } catch (JSONException unused) {
                        }
                    }
                }
                if (bqe0.this.f77885j) {
                    return;
                }
                double d3 = bqe0.this.f77888m;
                double d4 = bqe0.this.f77887l;
                bqe0 bqe0Var4 = bqe0.this;
                if (d3 <= d4) {
                    bqe0Var4.f77887l = bqe0Var4.f77888m;
                    return;
                } else {
                    if (Math.abs(bqe0Var4.f77888m - bqe0.this.f77887l) > 1.0d) {
                        bqe0 bqe0Var5 = bqe0.this;
                        bqe0Var5.f77886k = bqe0Var5.f77888m;
                        bqe0.this.f77885j = true;
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
                    bqe0.this.f77893r.put(riw.m181611a(new byte[]{67, 18, 84, 71, 62, 2, 85, 18, 84, 84, 21, 9, 66}), fArr3[0]);
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
                bqe0 bqe0Var6 = bqe0.this;
                bqe0Var6.f77890o = bqe0Var6.m105913x(fArr4[0], fArr4[1], fArr4[2]);
                if (bqe0.this.f77889n) {
                    if (bqe0.this.f77890o >= bqe0.this.f77891p) {
                        bqe0 bqe0Var7 = bqe0.this;
                        bqe0Var7.f77891p = bqe0Var7.f77890o;
                    }
                    if (Math.abs(bqe0.this.f77890o - bqe0.this.f77891p) > 0.5d) {
                        bqe0 bqe0Var8 = bqe0.this;
                        bqe0Var8.f77892q = bqe0Var8.f77890o;
                        bqe0.this.f77889n = false;
                        try {
                            bqe0.this.f77893r.put(riw.m181611a(new byte[]{95, 20, 88, 82, 15, 18, 81, 18, 88, 88, 15}), Math.abs(bqe0.this.f77890o - bqe0.this.f77891p));
                        } catch (JSONException unused3) {
                        }
                    }
                }
                if (bqe0.this.f77889n) {
                    return;
                }
                if (bqe0.this.f77890o <= bqe0.this.f77891p) {
                    bqe0 bqe0Var9 = bqe0.this;
                    bqe0Var9.f77891p = bqe0Var9.f77890o;
                }
                if (Math.abs(bqe0.this.f77890o - bqe0.this.f77891p) > 0.5d) {
                    bqe0 bqe0Var10 = bqe0.this;
                    bqe0Var10.f77892q = bqe0Var10.f77890o;
                    bqe0.this.f77889n = true;
                    return;
                }
                return;
            }
            if (type == 4 && (fArr = sensorEvent.values) != null && fArr.length >= 3) {
                float degrees = (float) Math.toDegrees(fArr[0]);
                float degrees2 = (float) Math.toDegrees(sensorEvent.values[1]);
                float degrees3 = (float) Math.toDegrees(sensorEvent.values[2]);
                bqe0 bqe0Var11 = bqe0.this;
                bqe0Var11.f77884i = bqe0Var11.m105913x(degrees, degrees2, degrees3);
                if (bqe0.this.f77881f) {
                    double d5 = bqe0.this.f77884i;
                    double d6 = bqe0.this.f77883h;
                    bqe0 bqe0Var12 = bqe0.this;
                    if (d5 >= d6) {
                        bqe0Var12.f77883h = bqe0Var12.f77884i;
                    } else if (Math.abs(bqe0Var12.f77884i - bqe0.this.f77883h) > 10.0d) {
                        bqe0 bqe0Var13 = bqe0.this;
                        bqe0Var13.f77882g = bqe0Var13.f77884i;
                        bqe0.this.f77881f = false;
                        try {
                            bqe0.this.f77893r.put(riw.m181611a(new byte[]{87, 31, 67, 88, 18, 5, 95, 22, 84}), Math.abs(bqe0.this.f77884i - bqe0.this.f77883h));
                        } catch (JSONException unused4) {
                        }
                    }
                }
                if (bqe0.this.f77881f) {
                    return;
                }
                double d7 = bqe0.this.f77884i;
                double d8 = bqe0.this.f77883h;
                bqe0 bqe0Var14 = bqe0.this;
                if (d7 <= d8) {
                    bqe0Var14.f77883h = bqe0Var14.f77884i;
                } else if (Math.abs(bqe0Var14.f77884i - bqe0.this.f77883h) > 10.0d) {
                    bqe0 bqe0Var15 = bqe0.this;
                    bqe0Var15.f77882g = bqe0Var15.f77884i;
                    bqe0.this.f77881f = true;
                }
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    }
}
