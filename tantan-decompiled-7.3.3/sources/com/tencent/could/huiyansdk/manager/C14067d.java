package com.tencent.could.huiyansdk.manager;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.d */
/* JADX INFO: loaded from: classes12.dex */
public class C14067d {

    /* JADX INFO: renamed from: a */
    public SensorManager f58283a;

    /* JADX INFO: renamed from: b */
    public a f58284b;

    /* JADX INFO: renamed from: c */
    public boolean f58285c = false;

    /* JADX INFO: renamed from: d */
    public c f58286d;

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
                c cVar = C14067d.this.f58286d;
                if (cVar != null) {
                    cVar.mo83518a(f);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.d$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final C14067d f58288a = new C14067d();
    }

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.d$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo83518a(float f);
    }

    /* JADX INFO: renamed from: a */
    public void m83517a() {
        SensorManager sensorManager;
        if (!this.f58285c || (sensorManager = this.f58283a) == null) {
            return;
        }
        this.f58285c = false;
        sensorManager.unregisterListener(this.f58284b);
        this.f58286d = null;
    }
}
