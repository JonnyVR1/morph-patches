package cn.shuzilm.core;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* JADX INFO: renamed from: cn.shuzilm.core.b */
/* JADX INFO: loaded from: classes.dex */
class C0809b implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f3766a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ SensorManager f3767b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ DUHelper f3768c;

    public C0809b(DUHelper dUHelper, Context context, SensorManager sensorManager) {
        this.f3768c = dUHelper;
        this.f3766a = context;
        this.f3767b = sensorManager;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        try {
            float[] fArr = sensorEvent.values;
            sensorEvent.sensor.getType();
            for (float f : fArr) {
            }
            DUHelper.onSensorChanged(this.f3766a, sensorEvent);
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
        this.f3767b.unregisterListener(this);
    }
}
