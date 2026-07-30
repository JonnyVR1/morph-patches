package tech.sud.runtime.core;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import tech.sud.runtime.component.p140c.TextureViewSurfaceTextureListenerC22410d;

/* JADX INFO: renamed from: tech.sud.runtime.core.f */
/* JADX INFO: loaded from: classes3.dex */
class C22447f extends TextureViewSurfaceTextureListenerC22410d implements InterfaceC22444c {

    /* JADX INFO: renamed from: a */
    private final C22445d f207914a;

    public C22447f(C22448g c22448g, Context context) {
        super(context);
        setPreserveEGLContextOnPause(true);
        this.f207914a = new C22445d(c22448g, this);
    }

    @Override // tech.sud.runtime.component.p140c.TextureViewSurfaceTextureListenerC22410d
    /* JADX INFO: renamed from: a */
    public void mo221644a(SurfaceTexture surfaceTexture) {
        this.f207914a.m221974a(false);
        super.mo221644a(surfaceTexture);
    }

    @Override // tech.sud.runtime.component.p140c.TextureViewSurfaceTextureListenerC22410d
    /* JADX INFO: renamed from: b */
    public void mo221648b(SurfaceTexture surfaceTexture) {
        this.f207914a.m221974a(true);
        this.f207914a.m221976b(true);
        super.mo221648b(surfaceTexture);
        this.f207914a.m221976b(false);
    }

    @Override // tech.sud.runtime.component.p140c.TextureViewSurfaceTextureListenerC22410d, android.view.View
    public void onDetachedFromWindow() {
        this.f207914a.m221976b(true);
        super.onDetachedFromWindow();
        this.f207914a.m221976b(false);
    }

    @Override // tech.sud.runtime.component.p140c.TextureViewSurfaceTextureListenerC22410d, tech.sud.runtime.core.InterfaceC22444c
    public void onPause() {
        if (this.f207914a.m221978d()) {
            return;
        }
        super.onPause();
        this.f207914a.m221977c();
    }

    @Override // tech.sud.runtime.component.p140c.TextureViewSurfaceTextureListenerC22410d, tech.sud.runtime.core.InterfaceC22444c
    public void onResume() {
        if (this.f207914a.m221978d()) {
            return;
        }
        super.onResume();
        this.f207914a.m221975b();
    }

    @Override // android.view.TextureView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f207914a.m221976b(true);
        super.onSizeChanged(i, i2, i3, i4);
        this.f207914a.m221976b(false);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f207914a.m221972a(motionEvent);
        return true;
    }

    @Override // tech.sud.runtime.core.InterfaceC22444c
    /* JADX INFO: renamed from: a */
    public C22445d mo221960a() {
        return this.f207914a;
    }

    @Override // tech.sud.runtime.component.p140c.TextureViewSurfaceTextureListenerC22410d
    /* JADX INFO: renamed from: b */
    public void mo221647b() {
        this.f207914a.m221979e();
    }
}
