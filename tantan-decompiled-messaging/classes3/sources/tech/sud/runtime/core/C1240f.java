package tech.sud.runtime.core;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import tech.sud.runtime.component.p021c.TextureViewSurfaceTextureListenerC1203d;

/* JADX INFO: renamed from: tech.sud.runtime.core.f */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
class C1240f extends TextureViewSurfaceTextureListenerC1203d implements InterfaceC1237c {

    /* JADX INFO: renamed from: a */
    private final C1238d f11539a;

    public C1240f(C1241g c1241g, Context context) {
        super(context);
        setPreserveEGLContextOnPause(true);
        this.f11539a = new C1238d(c1241g, this);
    }

    @Override // tech.sud.runtime.component.p021c.TextureViewSurfaceTextureListenerC1203d
    /* JADX INFO: renamed from: a */
    public void mo10115a(SurfaceTexture surfaceTexture) {
        this.f11539a.m10445a(false);
        super.mo10115a(surfaceTexture);
    }

    @Override // tech.sud.runtime.component.p021c.TextureViewSurfaceTextureListenerC1203d
    /* JADX INFO: renamed from: b */
    public void mo10119b(SurfaceTexture surfaceTexture) {
        this.f11539a.m10445a(true);
        this.f11539a.m10447b(true);
        super.mo10119b(surfaceTexture);
        this.f11539a.m10447b(false);
    }

    @Override // tech.sud.runtime.component.p021c.TextureViewSurfaceTextureListenerC1203d, android.view.View
    public void onDetachedFromWindow() {
        this.f11539a.m10447b(true);
        super.onDetachedFromWindow();
        this.f11539a.m10447b(false);
    }

    @Override // tech.sud.runtime.component.p021c.TextureViewSurfaceTextureListenerC1203d, tech.sud.runtime.core.InterfaceC1237c
    public void onPause() {
        if (this.f11539a.m10449d()) {
            return;
        }
        super.onPause();
        this.f11539a.m10448c();
    }

    @Override // tech.sud.runtime.component.p021c.TextureViewSurfaceTextureListenerC1203d, tech.sud.runtime.core.InterfaceC1237c
    public void onResume() {
        if (this.f11539a.m10449d()) {
            return;
        }
        super.onResume();
        this.f11539a.m10446b();
    }

    @Override // android.view.TextureView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f11539a.m10447b(true);
        super.onSizeChanged(i, i2, i3, i4);
        this.f11539a.m10447b(false);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f11539a.m10443a(motionEvent);
        return true;
    }

    @Override // tech.sud.runtime.core.InterfaceC1237c
    /* JADX INFO: renamed from: a */
    public C1238d mo10431a() {
        return this.f11539a;
    }

    @Override // tech.sud.runtime.component.p021c.TextureViewSurfaceTextureListenerC1203d
    /* JADX INFO: renamed from: b */
    public void mo10118b() {
        this.f11539a.m10450e();
    }
}
