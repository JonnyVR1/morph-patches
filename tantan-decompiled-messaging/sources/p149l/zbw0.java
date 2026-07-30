package p149l;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zbw0 implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public final pbw0 f202495a;

    public zbw0(String str, String str2) {
        ubw0.m192936a();
        rbw0.m178722a();
        this.f202495a = rbw0.f158691a;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo151719a(SensorEvent sensorEvent);

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        mo151719a(sensorEvent);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
