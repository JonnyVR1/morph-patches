package com.tencent.could.huiyansdk.manager;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.d */
/* JADX INFO: loaded from: classes2.dex */
public class C13904d {

    /* JADX INFO: renamed from: a */
    public SensorManager f57435a;

    /* JADX INFO: renamed from: b */
    public a f57436b;

    /* JADX INFO: renamed from: c */
    public boolean f57437c = false;

    /* JADX INFO: renamed from: d */
    public c f57438d;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.d$a */
    public class a implements SensorEventListener {
        public a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 5) {
                float f = sensorEvent.values[0];
                c cVar = C13904d.this.f57438d;
                if (cVar != null) {
                    cVar.mo82335a(f);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.d$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final C13904d f57440a = new C13904d();
    }

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.d$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo82335a(float f);
    }

    /* JADX INFO: renamed from: a */
    public void m82334a() {
        SensorManager sensorManager;
        if (!this.f57437c || (sensorManager = this.f57435a) == null) {
            return;
        }
        this.f57437c = false;
        sensorManager.unregisterListener(this.f57436b);
        this.f57438d = null;
    }
}
