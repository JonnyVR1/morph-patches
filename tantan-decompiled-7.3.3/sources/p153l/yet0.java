package p153l;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import com.momo.momortc.MMConstants;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;

/* JADX INFO: loaded from: classes6.dex */
public final class yet0 extends flw0 {

    /* JADX INFO: renamed from: b */
    public final SensorManager f199397b;

    /* JADX INFO: renamed from: c */
    public final Object f199398c;

    /* JADX INFO: renamed from: d */
    public final Display f199399d;

    /* JADX INFO: renamed from: e */
    public final float[] f199400e;

    /* JADX INFO: renamed from: f */
    public final float[] f199401f;

    /* JADX INFO: renamed from: g */
    public float[] f199402g;

    /* JADX INFO: renamed from: h */
    public Handler f199403h;

    /* JADX INFO: renamed from: i */
    public xet0 f199404i;

    public yet0(Context context) {
        super("OrientationMonitor", "ads");
        this.f199397b = (SensorManager) context.getSystemService("sensor");
        this.f199399d = ((WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay();
        this.f199400e = new float[9];
        this.f199401f = new float[9];
        this.f199398c = new Object();
    }

    @Override // p153l.flw0
    /* JADX INFO: renamed from: a */
    public final void mo126170a(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f199398c) {
            try {
                if (this.f199402g == null) {
                    this.f199402g = new float[9];
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        SensorManager.getRotationMatrixFromVector(this.f199400e, fArr);
        int rotation = this.f199399d.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.f199400e, 2, MMConstants.ERR_WATERMARK_READ, this.f199401f);
        } else if (rotation != 2) {
            float[] fArr2 = this.f199400e;
            if (rotation != 3) {
                System.arraycopy(fArr2, 0, this.f199401f, 0, 9);
            } else {
                SensorManager.remapCoordinateSystem(fArr2, 130, 1, this.f199401f);
            }
        } else {
            SensorManager.remapCoordinateSystem(this.f199400e, MMConstants.ERR_WATERMARK_READ, 130, this.f199401f);
        }
        float[] fArr3 = this.f199401f;
        float f = fArr3[1];
        fArr3[1] = fArr3[3];
        fArr3[3] = f;
        float f2 = fArr3[2];
        fArr3[2] = fArr3[6];
        fArr3[6] = f2;
        float f3 = fArr3[5];
        fArr3[5] = fArr3[7];
        fArr3[7] = f3;
        synchronized (this.f199398c) {
            System.arraycopy(this.f199401f, 0, this.f199402g, 0, 9);
        }
        xet0 xet0Var = this.f199404i;
        if (xet0Var != null) {
            xet0Var.zza();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m215448b(xet0 xet0Var) {
        this.f199404i = xet0Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m215449c() {
        if (this.f199403h != null) {
            return;
        }
        Sensor defaultSensor = this.f199397b.getDefaultSensor(11);
        if (defaultSensor == null) {
            dct0.m115295d("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        ukw0 ukw0Var = new ukw0(handlerThread.getLooper());
        this.f199403h = ukw0Var;
        if (this.f199397b.registerListener(this, defaultSensor, 0, ukw0Var)) {
            return;
        }
        dct0.m115295d("SensorManager.registerListener failed.");
        m215450d();
    }

    /* JADX INFO: renamed from: d */
    public final void m215450d() {
        if (this.f199403h == null) {
            return;
        }
        this.f199397b.unregisterListener(this);
        this.f199403h.post(new wet0(this));
        this.f199403h = null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m215451e(float[] fArr) {
        synchronized (this.f199398c) {
            try {
                float[] fArr2 = this.f199402g;
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
