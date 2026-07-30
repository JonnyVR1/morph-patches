package p149l;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import com.momo.momortc.MMConstants;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;

/* JADX INFO: loaded from: classes6.dex */
public final class s5t0 extends zbw0 {

    /* JADX INFO: renamed from: b */
    public final SensorManager f162584b;

    /* JADX INFO: renamed from: c */
    public final Object f162585c;

    /* JADX INFO: renamed from: d */
    public final Display f162586d;

    /* JADX INFO: renamed from: e */
    public final float[] f162587e;

    /* JADX INFO: renamed from: f */
    public final float[] f162588f;

    /* JADX INFO: renamed from: g */
    public float[] f162589g;

    /* JADX INFO: renamed from: h */
    public Handler f162590h;

    /* JADX INFO: renamed from: i */
    public r5t0 f162591i;

    public s5t0(Context context) {
        super("OrientationMonitor", "ads");
        this.f162584b = (SensorManager) context.getSystemService("sensor");
        this.f162586d = ((WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay();
        this.f162587e = new float[9];
        this.f162588f = new float[9];
        this.f162585c = new Object();
    }

    @Override // p149l.zbw0
    /* JADX INFO: renamed from: a */
    public final void mo151719a(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f162585c) {
            try {
                if (this.f162589g == null) {
                    this.f162589g = new float[9];
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        SensorManager.getRotationMatrixFromVector(this.f162587e, fArr);
        int rotation = this.f162586d.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.f162587e, 2, MMConstants.ERR_WATERMARK_READ, this.f162588f);
        } else if (rotation != 2) {
            float[] fArr2 = this.f162587e;
            if (rotation != 3) {
                System.arraycopy(fArr2, 0, this.f162588f, 0, 9);
            } else {
                SensorManager.remapCoordinateSystem(fArr2, 130, 1, this.f162588f);
            }
        } else {
            SensorManager.remapCoordinateSystem(this.f162587e, MMConstants.ERR_WATERMARK_READ, 130, this.f162588f);
        }
        float[] fArr3 = this.f162588f;
        float f = fArr3[1];
        fArr3[1] = fArr3[3];
        fArr3[3] = f;
        float f2 = fArr3[2];
        fArr3[2] = fArr3[6];
        fArr3[6] = f2;
        float f3 = fArr3[5];
        fArr3[5] = fArr3[7];
        fArr3[7] = f3;
        synchronized (this.f162585c) {
            System.arraycopy(this.f162588f, 0, this.f162589g, 0, 9);
        }
        r5t0 r5t0Var = this.f162591i;
        if (r5t0Var != null) {
            r5t0Var.zza();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m182374b(r5t0 r5t0Var) {
        this.f162591i = r5t0Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m182375c() {
        if (this.f162590h != null) {
            return;
        }
        Sensor defaultSensor = this.f162584b.getDefaultSensor(11);
        if (defaultSensor == null) {
            x2t0.m206866d("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        obw0 obw0Var = new obw0(handlerThread.getLooper());
        this.f162590h = obw0Var;
        if (this.f162584b.registerListener(this, defaultSensor, 0, obw0Var)) {
            return;
        }
        x2t0.m206866d("SensorManager.registerListener failed.");
        m182376d();
    }

    /* JADX INFO: renamed from: d */
    public final void m182376d() {
        if (this.f162590h == null) {
            return;
        }
        this.f162584b.unregisterListener(this);
        this.f162590h.post(new q5t0(this));
        this.f162590h = null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m182377e(float[] fArr) {
        synchronized (this.f162585c) {
            try {
                float[] fArr2 = this.f162589g;
                if (fArr2 == null) {
                    return false;
                }
                System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
