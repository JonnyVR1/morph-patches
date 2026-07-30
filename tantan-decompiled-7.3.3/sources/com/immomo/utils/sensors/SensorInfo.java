package com.immomo.utils.sensors;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.io.File;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONObject;
import p153l.jj5;
import p153l.riw;

/* JADX INFO: loaded from: classes7.dex */
public class SensorInfo {

    /* JADX INFO: renamed from: a */
    public Sensor f14841a;

    /* JADX INFO: renamed from: b */
    public Sensor f14842b;

    /* JADX INFO: renamed from: c */
    private SensorManager f14843c;

    /* JADX INFO: renamed from: d */
    private int f14844d = 0;

    /* JADX INFO: renamed from: e */
    C4127b f14845e;

    /* JADX INFO: renamed from: f */
    C4127b f14846f;

    /* JADX INFO: renamed from: s */
    private static final String f14840s = riw.m181611a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 89, 86, 19, 2, 71, 7, 67, 82, 79, 19, 67, 4, 31, 86, 2, 18, 89, 9, 95, 25, 52, 53, 114, 57, 98, 99, HttpTokens.SPACE, 50, 117});

    /* JADX INFO: renamed from: g */
    public static int f14828g = 0;

    /* JADX INFO: renamed from: h */
    public static float f14829h = 0.0f;

    /* JADX INFO: renamed from: i */
    public static float f14830i = 0.0f;

    /* JADX INFO: renamed from: j */
    public static float f14831j = 0.0f;

    /* JADX INFO: renamed from: k */
    public static float f14832k = 0.0f;

    /* JADX INFO: renamed from: l */
    public static float f14833l = 0.0f;

    /* JADX INFO: renamed from: m */
    public static float f14834m = 0.0f;

    /* JADX INFO: renamed from: n */
    public static float f14835n = 0.0f;

    /* JADX INFO: renamed from: o */
    public static float f14836o = 0.0f;

    /* JADX INFO: renamed from: p */
    public static float f14837p = 0.0f;

    /* JADX INFO: renamed from: q */
    private static boolean f14838q = false;

    /* JADX INFO: renamed from: r */
    private static boolean f14839r = false;

    public class MyBroadcastReceiver extends BroadcastReceiver {
        private MyBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals(riw.m181611a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 89, 86, 19, 2, 71, 7, 67, 82, 79, 19, 67, 4, 31, 86, 2, 18, 89, 9, 95, 25, 52, 53, 114, 57, 98, 99, HttpTokens.SPACE, 50, 117})) && intent.getExtras().getBoolean(riw.m181611a(new byte[]{83, 9, 95, 89, 4, 5, 68, 3, 85}))) {
                SensorInfo.this.f14844d = 1;
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.utils.sensors.SensorInfo$b */
    public class C4127b implements SensorEventListener {
        private C4127b() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            int type = sensorEvent.sensor.getType();
            if (type != 1) {
                if (type != 4) {
                    return;
                }
                boolean unused = SensorInfo.f14839r = true;
                float[] fArr = sensorEvent.values;
                SensorInfo.f14835n = fArr[0];
                SensorInfo.f14836o = fArr[1];
                SensorInfo.f14837p = fArr[2];
                return;
            }
            if (SensorInfo.f14829h == 0.0f && SensorInfo.f14830i == 0.0f && SensorInfo.f14831j == 0.0f) {
                SensorInfo.f14829h = Math.abs(sensorEvent.values[0]);
                SensorInfo.f14830i = Math.abs(sensorEvent.values[1]);
                SensorInfo.f14831j = Math.abs(sensorEvent.values[2]);
                return;
            }
            SensorInfo.f14832k = Math.abs(sensorEvent.values[0]);
            SensorInfo.f14833l = Math.abs(sensorEvent.values[1]);
            SensorInfo.f14834m = Math.abs(sensorEvent.values[2]);
            if (SensorInfo.f14829h != SensorInfo.f14832k || SensorInfo.f14830i != SensorInfo.f14833l || SensorInfo.f14831j != SensorInfo.f14834m) {
                boolean unused2 = SensorInfo.f14838q = true;
                SensorInfo.this.m20515q();
            } else {
                if (SensorInfo.f14828g > 3) {
                    SensorInfo.this.m20515q();
                }
                SensorInfo.f14828g++;
            }
        }
    }

    public SensorInfo(Context context) {
        this.f14841a = null;
        this.f14842b = null;
        this.f14843c = null;
        this.f14845e = new C4127b();
        this.f14846f = new C4127b();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(riw.m181611a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 89, 86, 19, 2, 71, 7, 67, 82, 79, 19, 67, 4, 31, 86, 2, 18, 89, 9, 95, 25, 52, 53, 114, 57, 98, 99, HttpTokens.SPACE, 50, 117}));
        MyBroadcastReceiver myBroadcastReceiver = new MyBroadcastReceiver();
        jj5.m145018l(context, myBroadcastReceiver, intentFilter);
        SensorManager sensorManager = (SensorManager) context.getSystemService(riw.m181611a(new byte[]{67, 3, 95, 68, 14, 20}));
        this.f14843c = sensorManager;
        this.f14841a = sensorManager.getDefaultSensor(1);
        this.f14842b = this.f14843c.getDefaultSensor(4);
        if (f14828g <= 3) {
            this.f14843c.registerListener(this.f14845e, this.f14841a, 3);
            this.f14843c.registerListener(this.f14846f, this.f14842b, 3);
        }
        context.unregisterReceiver(myBroadcastReceiver);
    }

    /* JADX INFO: renamed from: d */
    private String m20501d() {
        try {
            String[] strArr = {riw.m181611a(new byte[]{31, 2, 84, 65, 78, 21, 95, 5, 90, 82, 21, 73, 65, 3, 92, 66, 5}), riw.m181611a(new byte[]{31, 2, 84, 65, 78, 23, 85, 11, 68, 104, 17, 15, 64, 3}), riw.m181611a(new byte[]{31, 21, 72, 68, 21, 3, 93, 73, 93, 94, 3, 73, 92, 15, 83, 84, 62, 11, 81, 10, 93, 88, 2, 57, 84, 3, 83, 66, 6, 57, 65, 3, 92, 66, 79, 21, 95}), riw.m181611a(new byte[]{31, 21, 72, 68, 78, 23, 85, 11, 68, 104, 21, 20, 81, 5, 84}), riw.m181611a(new byte[]{31, 21, 72, 68, 21, 3, 93, 73, 83, 94, 15, 73, 65, 3, 92, 66, 76, 22, 66, 9, 65, 68})};
            for (int i = 0; i < 5; i++) {
                if (new File(strArr[i]).exists()) {
                    return riw.m181611a(new byte[]{97, 3, 0, 19});
                }
            }
        } catch (Throwable unused) {
        }
        return riw.m181611a(new byte[]{97, 3, 1, 19});
    }

    /* JADX INFO: renamed from: g */
    private String m20502g() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(m20503i() ? riw.m181611a(new byte[]{119, 87, 21}) : riw.m181611a(new byte[]{119, 86, 21}));
        } catch (Throwable unused) {
            sb.append(riw.m181611a(new byte[]{119, 84}));
        }
        try {
            sb.append(m20504j() ? riw.m181611a(new byte[]{100, 87, 21}) : riw.m181611a(new byte[]{100, 86, 21}));
        } catch (Throwable unused2) {
            sb.append(riw.m181611a(new byte[]{100, 84}));
        }
        try {
            sb.append(m20505k() ? riw.m181611a(new byte[]{124, 87, 21}) : riw.m181611a(new byte[]{124, 86, 21}));
        } catch (Throwable unused3) {
            sb.append(riw.m181611a(new byte[]{124, 84}));
        }
        try {
            sb.append(m20506l() ? riw.m181611a(new byte[]{113, 87, 21}) : riw.m181611a(new byte[]{113, 86, 21}));
        } catch (Throwable unused4) {
            sb.append(riw.m181611a(new byte[]{113, 84}));
        }
        try {
            sb.append(m20507m() ? riw.m181611a(new byte[]{125, 87, 21}) : riw.m181611a(new byte[]{125, 86, 21}));
        } catch (Throwable unused5) {
            sb.append(riw.m181611a(new byte[]{125, 84}));
        }
        try {
            sb.append(m20509o() ? riw.m181611a(new byte[]{116, 87, 21}) : riw.m181611a(new byte[]{116, 86, 21}));
        } catch (Throwable unused6) {
            sb.append(riw.m181611a(new byte[]{116, 84}));
        }
        try {
            sb.append(m20510p() ? riw.m181611a(new byte[]{103, 87, 21}) : riw.m181611a(new byte[]{103, 86, 21}));
        } catch (Throwable unused7) {
            sb.append(riw.m181611a(new byte[]{103, 84}));
        }
        try {
            sb.append(m20508n() ? riw.m181611a(new byte[]{96, 87, 21}) : riw.m181611a(new byte[]{96, 86, 21}));
        } catch (Throwable unused8) {
            sb.append(riw.m181611a(new byte[]{96, 84}));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    private boolean m20503i() {
        try {
            List<Sensor> sensorList = this.f14843c.getSensorList(9);
            return sensorList != null && sensorList.size() > 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    private boolean m20504j() {
        List<Sensor> sensorList = this.f14843c.getSensorList(4);
        return sensorList != null && sensorList.size() > 0;
    }

    /* JADX INFO: renamed from: k */
    private boolean m20505k() {
        List<Sensor> sensorList = this.f14843c.getSensorList(5);
        return sensorList != null && sensorList.size() > 0;
    }

    /* JADX INFO: renamed from: l */
    private boolean m20506l() {
        try {
            List<Sensor> sensorList = this.f14843c.getSensorList(10);
            return sensorList != null && sensorList.size() > 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: m */
    private boolean m20507m() {
        List<Sensor> sensorList = this.f14843c.getSensorList(2);
        return sensorList != null && sensorList.size() > 0;
    }

    /* JADX INFO: renamed from: n */
    private boolean m20508n() {
        List<Sensor> sensorList = this.f14843c.getSensorList(6);
        return sensorList != null && sensorList.size() > 0;
    }

    /* JADX INFO: renamed from: o */
    private boolean m20509o() {
        List<Sensor> sensorList = this.f14843c.getSensorList(8);
        return sensorList != null && sensorList.size() > 0;
    }

    /* JADX INFO: renamed from: p */
    private boolean m20510p() {
        List<Sensor> sensorList = this.f14843c.getSensorList(7);
        return sensorList != null && sensorList.size() > 0;
    }

    /* JADX INFO: renamed from: r */
    private String m20511r() {
        try {
            if (new File(riw.m181611a(new byte[]{31, 21, 72, 68, 78, 5, 92, 7, 66, 68, 78, 18, 89, 11, 84, 83, 62, 9, 69, 18, 65, 66, 21, 73, 70, 15, 83, 69, 0, 18, 95, 20, 30, 82, 15, 7, 82, 10, 84})).exists()) {
                return riw.m181611a(new byte[]{70, 4, 0, 19});
            }
        } catch (Throwable unused) {
        }
        return riw.m181611a(new byte[]{70, 4, 1, 19});
    }

    /* JADX INFO: renamed from: e */
    public String m20512e() throws Exception {
        if (!f14839r) {
            return riw.m181611a(new byte[]{126, 9, 95, 82});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(riw.m181611a(new byte[]{72}), f14835n);
        jSONObject.put(riw.m181611a(new byte[]{73}), f14836o);
        jSONObject.put(riw.m181611a(new byte[]{74}), f14837p);
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: f */
    public String m20513f() {
        if (f14838q) {
            return m20502g() + m20501d() + m20511r() + riw.m181611a(new byte[]{1, 66});
        }
        return m20502g() + m20501d() + m20511r() + riw.m181611a(new byte[]{0, 66});
    }

    /* JADX INFO: renamed from: h */
    public int m20514h() {
        return this.f14844d;
    }

    /* JADX INFO: renamed from: q */
    public void m20515q() {
        try {
            SensorManager sensorManager = this.f14843c;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this.f14845e);
                this.f14843c.unregisterListener(this.f14846f);
            }
        } catch (Throwable unused) {
        }
    }
}
