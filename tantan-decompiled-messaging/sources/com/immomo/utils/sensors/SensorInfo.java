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
import p149l.ii5;
import p149l.sgw;

/* JADX INFO: loaded from: classes7.dex */
public class SensorInfo {

    /* JADX INFO: renamed from: a */
    public Sensor f14122a;

    /* JADX INFO: renamed from: b */
    public Sensor f14123b;

    /* JADX INFO: renamed from: c */
    private SensorManager f14124c;

    /* JADX INFO: renamed from: d */
    private int f14125d = 0;

    /* JADX INFO: renamed from: e */
    C3976b f14126e;

    /* JADX INFO: renamed from: f */
    C3976b f14127f;

    /* JADX INFO: renamed from: s */
    private static final String f14121s = sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 89, 86, 19, 2, 71, 7, 67, 82, 79, 19, 67, 4, 31, 86, 2, 18, 89, 9, 95, 25, 52, 53, 114, 57, 98, 99, HttpTokens.SPACE, 50, 117});

    /* JADX INFO: renamed from: g */
    public static int f14109g = 0;

    /* JADX INFO: renamed from: h */
    public static float f14110h = 0.0f;

    /* JADX INFO: renamed from: i */
    public static float f14111i = 0.0f;

    /* JADX INFO: renamed from: j */
    public static float f14112j = 0.0f;

    /* JADX INFO: renamed from: k */
    public static float f14113k = 0.0f;

    /* JADX INFO: renamed from: l */
    public static float f14114l = 0.0f;

    /* JADX INFO: renamed from: m */
    public static float f14115m = 0.0f;

    /* JADX INFO: renamed from: n */
    public static float f14116n = 0.0f;

    /* JADX INFO: renamed from: o */
    public static float f14117o = 0.0f;

    /* JADX INFO: renamed from: p */
    public static float f14118p = 0.0f;

    /* JADX INFO: renamed from: q */
    private static boolean f14119q = false;

    /* JADX INFO: renamed from: r */
    private static boolean f14120r = false;

    public class MyBroadcastReceiver extends BroadcastReceiver {
        private MyBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals(sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 89, 86, 19, 2, 71, 7, 67, 82, 79, 19, 67, 4, 31, 86, 2, 18, 89, 9, 95, 25, 52, 53, 114, 57, 98, 99, HttpTokens.SPACE, 50, 117})) && intent.getExtras().getBoolean(sgw.m184137a(new byte[]{83, 9, 95, 89, 4, 5, 68, 3, 85}))) {
                SensorInfo.this.f14125d = 1;
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.utils.sensors.SensorInfo$b */
    public class C3976b implements SensorEventListener {
        private C3976b() {
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
                boolean unused = SensorInfo.f14120r = true;
                float[] fArr = sensorEvent.values;
                SensorInfo.f14116n = fArr[0];
                SensorInfo.f14117o = fArr[1];
                SensorInfo.f14118p = fArr[2];
                return;
            }
            if (SensorInfo.f14110h == 0.0f && SensorInfo.f14111i == 0.0f && SensorInfo.f14112j == 0.0f) {
                SensorInfo.f14110h = Math.abs(sensorEvent.values[0]);
                SensorInfo.f14111i = Math.abs(sensorEvent.values[1]);
                SensorInfo.f14112j = Math.abs(sensorEvent.values[2]);
                return;
            }
            SensorInfo.f14113k = Math.abs(sensorEvent.values[0]);
            SensorInfo.f14114l = Math.abs(sensorEvent.values[1]);
            SensorInfo.f14115m = Math.abs(sensorEvent.values[2]);
            if (SensorInfo.f14110h != SensorInfo.f14113k || SensorInfo.f14111i != SensorInfo.f14114l || SensorInfo.f14112j != SensorInfo.f14115m) {
                boolean unused2 = SensorInfo.f14119q = true;
                SensorInfo.this.m19516q();
            } else {
                if (SensorInfo.f14109g > 3) {
                    SensorInfo.this.m19516q();
                }
                SensorInfo.f14109g++;
            }
        }
    }

    public SensorInfo(Context context) {
        this.f14122a = null;
        this.f14123b = null;
        this.f14124c = null;
        this.f14126e = new C3976b();
        this.f14127f = new C3976b();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 89, 86, 19, 2, 71, 7, 67, 82, 79, 19, 67, 4, 31, 86, 2, 18, 89, 9, 95, 25, 52, 53, 114, 57, 98, 99, HttpTokens.SPACE, 50, 117}));
        MyBroadcastReceiver myBroadcastReceiver = new MyBroadcastReceiver();
        ii5.m136342l(context, myBroadcastReceiver, intentFilter);
        SensorManager sensorManager = (SensorManager) context.getSystemService(sgw.m184137a(new byte[]{67, 3, 95, 68, 14, 20}));
        this.f14124c = sensorManager;
        this.f14122a = sensorManager.getDefaultSensor(1);
        this.f14123b = this.f14124c.getDefaultSensor(4);
        if (f14109g <= 3) {
            this.f14124c.registerListener(this.f14126e, this.f14122a, 3);
            this.f14124c.registerListener(this.f14127f, this.f14123b, 3);
        }
        context.unregisterReceiver(myBroadcastReceiver);
    }

    /* JADX INFO: renamed from: d */
    private String m19502d() {
        try {
            String[] strArr = {sgw.m184137a(new byte[]{31, 2, 84, 65, 78, 21, 95, 5, 90, 82, 21, 73, 65, 3, 92, 66, 5}), sgw.m184137a(new byte[]{31, 2, 84, 65, 78, 23, 85, 11, 68, 104, 17, 15, 64, 3}), sgw.m184137a(new byte[]{31, 21, 72, 68, 21, 3, 93, 73, 93, 94, 3, 73, 92, 15, 83, 84, 62, 11, 81, 10, 93, 88, 2, 57, 84, 3, 83, 66, 6, 57, 65, 3, 92, 66, 79, 21, 95}), sgw.m184137a(new byte[]{31, 21, 72, 68, 78, 23, 85, 11, 68, 104, 21, 20, 81, 5, 84}), sgw.m184137a(new byte[]{31, 21, 72, 68, 21, 3, 93, 73, 83, 94, 15, 73, 65, 3, 92, 66, 76, 22, 66, 9, 65, 68})};
            for (int i = 0; i < 5; i++) {
                if (new File(strArr[i]).exists()) {
                    return sgw.m184137a(new byte[]{97, 3, 0, 19});
                }
            }
        } catch (Throwable unused) {
        }
        return sgw.m184137a(new byte[]{97, 3, 1, 19});
    }

    /* JADX INFO: renamed from: g */
    private String m19503g() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(m19504i() ? sgw.m184137a(new byte[]{119, 87, 21}) : sgw.m184137a(new byte[]{119, 86, 21}));
        } catch (Throwable unused) {
            sb.append(sgw.m184137a(new byte[]{119, 84}));
        }
        try {
            sb.append(m19505j() ? sgw.m184137a(new byte[]{100, 87, 21}) : sgw.m184137a(new byte[]{100, 86, 21}));
        } catch (Throwable unused2) {
            sb.append(sgw.m184137a(new byte[]{100, 84}));
        }
        try {
            sb.append(m19506k() ? sgw.m184137a(new byte[]{124, 87, 21}) : sgw.m184137a(new byte[]{124, 86, 21}));
        } catch (Throwable unused3) {
            sb.append(sgw.m184137a(new byte[]{124, 84}));
        }
        try {
            sb.append(m19507l() ? sgw.m184137a(new byte[]{113, 87, 21}) : sgw.m184137a(new byte[]{113, 86, 21}));
        } catch (Throwable unused4) {
            sb.append(sgw.m184137a(new byte[]{113, 84}));
        }
        try {
            sb.append(m19508m() ? sgw.m184137a(new byte[]{125, 87, 21}) : sgw.m184137a(new byte[]{125, 86, 21}));
        } catch (Throwable unused5) {
            sb.append(sgw.m184137a(new byte[]{125, 84}));
        }
        try {
            sb.append(m19510o() ? sgw.m184137a(new byte[]{116, 87, 21}) : sgw.m184137a(new byte[]{116, 86, 21}));
        } catch (Throwable unused6) {
            sb.append(sgw.m184137a(new byte[]{116, 84}));
        }
        try {
            sb.append(m19511p() ? sgw.m184137a(new byte[]{103, 87, 21}) : sgw.m184137a(new byte[]{103, 86, 21}));
        } catch (Throwable unused7) {
            sb.append(sgw.m184137a(new byte[]{103, 84}));
        }
        try {
            sb.append(m19509n() ? sgw.m184137a(new byte[]{96, 87, 21}) : sgw.m184137a(new byte[]{96, 86, 21}));
        } catch (Throwable unused8) {
            sb.append(sgw.m184137a(new byte[]{96, 84}));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    private boolean m19504i() {
        try {
            List<Sensor> sensorList = this.f14124c.getSensorList(9);
            return sensorList != null && sensorList.size() > 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    private boolean m19505j() {
        List<Sensor> sensorList = this.f14124c.getSensorList(4);
        return sensorList != null && sensorList.size() > 0;
    }

    /* JADX INFO: renamed from: k */
    private boolean m19506k() {
        List<Sensor> sensorList = this.f14124c.getSensorList(5);
        return sensorList != null && sensorList.size() > 0;
    }

    /* JADX INFO: renamed from: l */
    private boolean m19507l() {
        try {
            List<Sensor> sensorList = this.f14124c.getSensorList(10);
            return sensorList != null && sensorList.size() > 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: m */
    private boolean m19508m() {
        List<Sensor> sensorList = this.f14124c.getSensorList(2);
        return sensorList != null && sensorList.size() > 0;
    }

    /* JADX INFO: renamed from: n */
    private boolean m19509n() {
        List<Sensor> sensorList = this.f14124c.getSensorList(6);
        return sensorList != null && sensorList.size() > 0;
    }

    /* JADX INFO: renamed from: o */
    private boolean m19510o() {
        List<Sensor> sensorList = this.f14124c.getSensorList(8);
        return sensorList != null && sensorList.size() > 0;
    }

    /* JADX INFO: renamed from: p */
    private boolean m19511p() {
        List<Sensor> sensorList = this.f14124c.getSensorList(7);
        return sensorList != null && sensorList.size() > 0;
    }

    /* JADX INFO: renamed from: r */
    private String m19512r() {
        try {
            if (new File(sgw.m184137a(new byte[]{31, 21, 72, 68, 78, 5, 92, 7, 66, 68, 78, 18, 89, 11, 84, 83, 62, 9, 69, 18, 65, 66, 21, 73, 70, 15, 83, 69, 0, 18, 95, 20, 30, 82, 15, 7, 82, 10, 84})).exists()) {
                return sgw.m184137a(new byte[]{70, 4, 0, 19});
            }
        } catch (Throwable unused) {
        }
        return sgw.m184137a(new byte[]{70, 4, 1, 19});
    }

    /* JADX INFO: renamed from: e */
    public String m19513e() throws Exception {
        if (!f14120r) {
            return sgw.m184137a(new byte[]{126, 9, 95, 82});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(sgw.m184137a(new byte[]{72}), f14116n);
        jSONObject.put(sgw.m184137a(new byte[]{73}), f14117o);
        jSONObject.put(sgw.m184137a(new byte[]{74}), f14118p);
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: f */
    public String m19514f() {
        if (f14119q) {
            return m19503g() + m19502d() + m19512r() + sgw.m184137a(new byte[]{1, 66});
        }
        return m19503g() + m19502d() + m19512r() + sgw.m184137a(new byte[]{0, 66});
    }

    /* JADX INFO: renamed from: h */
    public int m19515h() {
        return this.f14125d;
    }

    /* JADX INFO: renamed from: q */
    public void m19516q() {
        try {
            SensorManager sensorManager = this.f14124c;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this.f14126e);
                this.f14124c.unregisterListener(this.f14127f);
            }
        } catch (Throwable unused) {
        }
    }
}
