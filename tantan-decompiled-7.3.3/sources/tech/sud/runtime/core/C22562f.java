package tech.sud.runtime.core;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import tech.sud.runtime.component.p144c.TextureViewSurfaceTextureListenerC22525d;

/* JADX INFO: renamed from: tech.sud.runtime.core.f */
/* JADX INFO: loaded from: classes3.dex */
class C22562f extends TextureViewSurfaceTextureListenerC22525d implements InterfaceC22559c {

    /* JADX INFO: renamed from: a */
    private final C22560d f208836a;

    public C22562f(C22563g c22563g, Context context) {
        super(context);
        setPreserveEGLContextOnPause(true);
        this.f208836a = new C22560d(c22563g, this);
    }

    @Override // tech.sud.runtime.component.p144c.TextureViewSurfaceTextureListenerC22525d
    /* JADX INFO: renamed from: a */
    public void mo222890a(SurfaceTexture surfaceTexture) {
        this.f208836a.m223220a(false);
        super.mo222890a(surfaceTexture);
    }

    @Override // tech.sud.runtime.component.p144c.TextureViewSurfaceTextureListenerC22525d
    /* JADX INFO: renamed from: b */
    public void mo222894b(SurfaceTexture surfaceTexture) {
        this.f208836a.m223220a(true);
        this.f208836a.m223222b(true);
        super.mo222894b(surfaceTexture);
        this.f208836a.m223222b(false);
    }

    @Override // tech.sud.runtime.component.p144c.TextureViewSurfaceTextureListenerC22525d, android.view.View
    public void onDetachedFromWindow() {
        this.f208836a.m223222b(true);
        super.onDetachedFromWindow();
        this.f208836a.m223222b(false);
    }

    @Override // tech.sud.runtime.component.p144c.TextureViewSurfaceTextureListenerC22525d, tech.sud.runtime.core.InterfaceC22559c
    public void onPause() {
        if (this.f208836a.m223224d()) {
            return;
        }
        super.onPause();
        this.f208836a.m223223c();
    }

    @Override // tech.sud.runtime.component.p144c.TextureViewSurfaceTextureListenerC22525d, tech.sud.runtime.core.InterfaceC22559c
    public void onResume() {
        if (this.f208836a.m223224d()) {
            return;
        }
        super.onResume();
        this.f208836a.m223221b();
    }

    @Override // android.view.TextureView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f208836a.m223222b(true);
        super.onSizeChanged(i, i2, i3, i4);
        this.f208836a.m223222b(false);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f208836a.m223218a(motionEvent);
        return true;
    }

    @Override // tech.sud.runtime.core.InterfaceC22559c
    /* JADX INFO: renamed from: a */
    public C22560d mo223206a() {
        return this.f208836a;
    }

    @Override // tech.sud.runtime.component.p144c.TextureViewSurfaceTextureListenerC22525d
    /* JADX INFO: renamed from: b */
    public void mo222893b() {
        this.f208836a.m223225e();
    }
}
