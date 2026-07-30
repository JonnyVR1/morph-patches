package com.google.android.exoplayer2.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import androidx.annotation.BinderThread;
import com.momo.momortc.MMConstants;
import p149l.ohg0;
import p149l.y4j;

/* JADX INFO: renamed from: com.google.android.exoplayer2.video.spherical.a */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2063a implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public final float[] f9618a = new float[16];

    /* JADX INFO: renamed from: b */
    public final float[] f9619b = new float[16];

    /* JADX INFO: renamed from: c */
    public final float[] f9620c = new float[16];

    /* JADX INFO: renamed from: d */
    public final float[] f9621d = new float[3];

    /* JADX INFO: renamed from: e */
    public final Display f9622e;

    /* JADX INFO: renamed from: f */
    public final a[] f9623f;

    /* JADX INFO: renamed from: g */
    public boolean f9624g;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.spherical.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo12194a(float[] fArr, float f);
    }

    public C2063a(Display display, a... aVarArr) {
        this.f9622e = display;
        this.f9623f = aVarArr;
    }

    /* JADX INFO: renamed from: e */
    public static void m12198e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: a */
    public final float m12199a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f9619b);
        SensorManager.getOrientation(this.f9619b, this.f9621d);
        return this.f9621d[2];
    }

    /* JADX INFO: renamed from: b */
    public final void m12200b(float[] fArr, float f) {
        for (a aVar : this.f9623f) {
            aVar.mo12194a(fArr, f);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12201c(float[] fArr) {
        if (!this.f9624g) {
            y4j.m212911a(this.f9620c, fArr);
            this.f9624g = true;
        }
        float[] fArr2 = this.f9619b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f9619b, 0, this.f9620c, 0);
    }

    /* JADX INFO: renamed from: d */
    public final void m12202d(float[] fArr, int i) {
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
                    ohg0.m164364a();
                    return;
                }
                i2 = 130;
            }
            float[] fArr2 = this.f9619b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f9619b, i2, i3, fArr);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    @BinderThread
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f9618a, sensorEvent.values);
        m12202d(this.f9618a, this.f9622e.getRotation());
        float fM12199a = m12199a(this.f9618a);
        m12198e(this.f9618a);
        m12201c(this.f9618a);
        m12200b(this.f9618a, fM12199a);
    }
}
