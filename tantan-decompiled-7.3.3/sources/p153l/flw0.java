package p153l;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: loaded from: classes6.dex */
public abstract class flw0 implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public final vkw0 f99696a;

    public flw0(String str, String str2) {
        alw0.m98734a();
        xkw0.m211456a();
        this.f99696a = xkw0.f194825a;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo126170a(SensorEvent sensorEvent);

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        mo126170a(sensorEvent);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
