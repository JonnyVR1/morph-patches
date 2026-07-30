package com.idv.identity.platform.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.idv.identity.platform.config.DeviceSetting;
import p149l.co0;
import p149l.j4e;
import p149l.onl;
import p149l.rcm;
import p149l.snl;
import p149l.uyd;

/* JADX INFO: loaded from: classes7.dex */
public class CameraSurfaceView extends SurfaceView implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: f */
    static snl f12723f;

    /* JADX INFO: renamed from: a */
    Context f12724a;

    /* JADX INFO: renamed from: b */
    SurfaceHolder f12725b;

    /* JADX INFO: renamed from: c */
    float f12726c;

    /* JADX INFO: renamed from: d */
    onl f12727d;

    /* JADX INFO: renamed from: e */
    private DeviceSetting f12728e;

    public CameraSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context applicationContext = context.getApplicationContext();
        this.f12724a = applicationContext;
        this.f12726c = j4e.m139645c(applicationContext, false);
        SurfaceHolder holder = getHolder();
        this.f12725b = holder;
        holder.setFormat(-2);
        this.f12725b.setType(3);
        this.f12725b.addCallback(this);
        setTag(getClass().getSimpleName() + ":" + getClass());
    }

    public static synchronized snl getCameraImpl() {
        try {
            if (f12723f == null) {
                f12723f = co0.m107844G();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f12723f;
    }

    public static String getCameraName() {
        return "Android";
    }

    /* JADX INFO: renamed from: a */
    public void m18121a(boolean z) {
        if (z) {
            f12723f.mo107870q();
        } else {
            f12723f.mo107860g();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m18122b(Context context, boolean z, boolean z2, DeviceSetting[] deviceSettingArr) {
        this.f12728e = uyd.m196284a(deviceSettingArr);
        snl cameraImpl = getCameraImpl();
        f12723f = cameraImpl;
        if (cameraImpl != null) {
            m18123c();
            this.f12726c = j4e.m139645c(this.f12724a, z);
            f12723f.mo107869p(context, z, z2, this.f12728e);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m18123c() {
        snl snlVar = f12723f;
        if (snlVar != null) {
            snlVar.mo107854a();
            f12723f.mo107872s();
            f12723f.mo107859f();
            f12723f.mo107871r();
            f12723f.mo107858e(null);
            this.f12727d = null;
        }
    }

    public snl getCameraInterface() {
        return f12723f;
    }

    public SurfaceHolder getSurfaceHolder() {
        return this.f12725b;
    }

    public void setCameraCallback(onl onlVar) {
        this.f12727d = onlVar;
    }

    public void setFocusModes(String str) {
        snl snlVar = f12723f;
        if (snlVar != null) {
            snlVar.mo107864k(str);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        snl snlVar = f12723f;
        if (snlVar != null) {
            snlVar.mo107857d(this.f12725b, this.f12726c, i2, i3);
            if (this.f12727d != null) {
                int iMo107868o = f12723f.mo107868o();
                if (iMo107868o == 90 || iMo107868o == 270) {
                    i2 = f12723f.mo107863j();
                    i3 = f12723f.mo107866m();
                } else if (iMo107868o == 0 || iMo107868o == 180) {
                    i2 = f12723f.mo107866m();
                    i3 = f12723f.mo107863j();
                }
                this.f12727d.mo17892f0(i2, i3);
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        snl snlVar = f12723f;
        if (snlVar != null) {
            snlVar.mo107858e(this.f12727d);
        }
        snl snlVar2 = f12723f;
        if (snlVar2 != null) {
            snlVar2.mo107867n();
        }
        onl onlVar = this.f12727d;
        if (onlVar != null) {
            onlVar.mo17884a0();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        boolean z = rcm.f158789d;
        snl snlVar = f12723f;
        if (snlVar != null && z) {
            snlVar.mo107872s();
            f12723f.mo107858e(null);
            f12723f.mo107871r();
        }
        onl onlVar = this.f12727d;
        if (onlVar != null) {
            onlVar.mo17888d0();
        }
    }
}
