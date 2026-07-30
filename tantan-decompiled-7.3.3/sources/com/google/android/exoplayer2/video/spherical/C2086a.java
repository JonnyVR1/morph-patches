package com.google.android.exoplayer2.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import androidx.annotation.BinderThread;
import com.momo.momortc.MMConstants;
import p153l.t7j;
import p153l.wpg0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.video.spherical.a */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2086a implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public final float[] f9655a = new float[16];

    /* JADX INFO: renamed from: b */
    public final float[] f9656b = new float[16];

    /* JADX INFO: renamed from: c */
    public final float[] f9657c = new float[16];

    /* JADX INFO: renamed from: d */
    public final float[] f9658d = new float[3];

    /* JADX INFO: renamed from: e */
    public final Display f9659e;

    /* JADX INFO: renamed from: f */
    public final a[] f9660f;

    /* JADX INFO: renamed from: g */
    public boolean f9661g;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.spherical.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo12248a(float[] fArr, float f);
    }

    public C2086a(Display display, a... aVarArr) {
        this.f9659e = display;
        this.f9660f = aVarArr;
    }

    /* JADX INFO: renamed from: e */
    public static void m12252e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: a */
    public final float m12253a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f9656b);
        SensorManager.getOrientation(this.f9656b, this.f9658d);
        return this.f9658d[2];
    }

    /* JADX INFO: renamed from: b */
    public final void m12254b(float[] fArr, float f) {
        for (a aVar : this.f9660f) {
            aVar.mo12248a(fArr, f);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12255c(float[] fArr) {
        if (!this.f9661g) {
            t7j.m189611a(this.f9657c, fArr);
            this.f9661g = true;
        }
        float[] fArr2 = this.f9656b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f9656b, 0, this.f9657c, 0);
    }

    /* JADX INFO: renamed from: d */
    public final void m12256d(float[] fArr, int i) {
        if (i != 0) {
            int i2 = MMConstants.ERR_WATERMARK_READ;
            int i3 = 1;
            if (i == 1) {
                i3 = 129;
                i2 = 2;
            } else if (i == 2) {
                i3 = 130;
            } else {
                if (i != 3) {
                    wpg0.m207458a();
                    return;
                }
                i2 = 130;
            }
            float[] fArr2 = this.f9656b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f9656b, i2, i3, fArr);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    @BinderThread
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f9655a, sensorEvent.values);
        m12256d(this.f9655a, this.f9659e.getRotation());
        float fM12253a = m12253a(this.f9655a);
        m12252e(this.f9655a);
        m12255c(this.f9655a);
        m12254b(this.f9655a, fM12253a);
    }
}
