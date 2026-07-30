package com.idv.identity.platform.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.idv.identity.platform.config.DeviceSetting;
import p153l.dql;
import p153l.h0e;
import p153l.hfm;
import p153l.x5e;
import p153l.yn0;
import p153l.zpl;

/* JADX INFO: loaded from: classes7.dex */
public class CameraSurfaceView extends SurfaceView implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: f */
    static dql f13464f;

    /* JADX INFO: renamed from: a */
    Context f13465a;

    /* JADX INFO: renamed from: b */
    SurfaceHolder f13466b;

    /* JADX INFO: renamed from: c */
    float f13467c;

    /* JADX INFO: renamed from: d */
    zpl f13468d;

    /* JADX INFO: renamed from: e */
    private DeviceSetting f13469e;

    public CameraSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context applicationContext = context.getApplicationContext();
        this.f13465a = applicationContext;
        this.f13467c = x5e.m209359c(applicationContext, false);
        SurfaceHolder holder = getHolder();
        this.f13466b = holder;
        holder.setFormat(-2);
        this.f13466b.setType(3);
        this.f13466b.addCallback(this);
        setTag(getClass().getSimpleName() + ":" + getClass());
    }

    public static synchronized dql getCameraImpl() {
        try {
            if (f13464f == null) {
                f13464f = yn0.m216751G();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f13464f;
    }

    public static String getCameraName() {
        return "Android";
    }

    /* JADX INFO: renamed from: a */
    public void m19198a(boolean z) {
        if (z) {
            f13464f.mo117548q();
        } else {
            f13464f.mo117538g();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m19199b(Context context, boolean z, boolean z2, DeviceSetting[] deviceSettingArr) {
        this.f13469e = h0e.m133149a(deviceSettingArr);
        dql cameraImpl = getCameraImpl();
        f13464f = cameraImpl;
        if (cameraImpl != null) {
            m19200c();
            this.f13467c = x5e.m209359c(this.f13465a, z);
            f13464f.mo117547p(context, z, z2, this.f13469e);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m19200c() {
        dql dqlVar = f13464f;
        if (dqlVar != null) {
            dqlVar.mo117532a();
            f13464f.mo117550s();
            f13464f.mo117537f();
            f13464f.mo117549r();
            f13464f.mo117536e(null);
            this.f13468d = null;
        }
    }

    public dql getCameraInterface() {
        return f13464f;
    }

    public SurfaceHolder getSurfaceHolder() {
        return this.f13466b;
    }

    public void setCameraCallback(zpl zplVar) {
        this.f13468d = zplVar;
    }

    public void setFocusModes(String str) {
        dql dqlVar = f13464f;
        if (dqlVar != null) {
            dqlVar.mo117542k(str);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        dql dqlVar = f13464f;
        if (dqlVar != null) {
            dqlVar.mo117535d(this.f13466b, this.f13467c, i2, i3);
            if (this.f13468d != null) {
                int iMo117546o = f13464f.mo117546o();
                if (iMo117546o == 90 || iMo117546o == 270) {
                    i2 = f13464f.mo117541j();
                    i3 = f13464f.mo117544m();
                } else if (iMo117546o == 0 || iMo117546o == 180) {
                    i2 = f13464f.mo117544m();
                    i3 = f13464f.mo117541j();
                }
                this.f13468d.mo18967g0(i2, i3);
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        dql dqlVar = f13464f;
        if (dqlVar != null) {
            dqlVar.mo117536e(this.f13468d);
        }
        dql dqlVar2 = f13464f;
        if (dqlVar2 != null) {
            dqlVar2.mo117545n();
        }
        zpl zplVar = this.f13468d;
        if (zplVar != null) {
            zplVar.mo18961b0();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        boolean z = hfm.f109319d;
        dql dqlVar = f13464f;
        if (dqlVar != null && z) {
            dqlVar.mo117550s();
            f13464f.mo117536e(null);
            f13464f.mo117549r();
        }
        zpl zplVar = this.f13468d;
        if (zplVar != null) {
            zplVar.mo18965e0();
        }
    }
}
