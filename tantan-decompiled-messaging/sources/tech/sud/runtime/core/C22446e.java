package tech.sud.runtime.core;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;
import android.view.SurfaceHolder;

/* JADX INFO: renamed from: tech.sud.runtime.core.e */
/* JADX INFO: loaded from: classes3.dex */
class C22446e extends GLSurfaceView implements InterfaceC22444c {

    /* JADX INFO: renamed from: a */
    private final C22445d f207913a;

    public C22446e(C22448g c22448g, Context context, boolean z) {
        super(context);
        if (z) {
            getHolder().setFormat(-3);
            setZOrderOnTop(true);
        }
        setPreserveEGLContextOnPause(true);
        this.f207913a = new C22445d(c22448g, this);
    }

    @Override // tech.sud.runtime.core.InterfaceC22444c
    /* JADX INFO: renamed from: a */
    public C22445d mo221960a() {
        return this.f207913a;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        this.f207913a.m221976b(true);
        super.onDetachedFromWindow();
        this.f207913a.m221976b(false);
    }

    @Override // android.opengl.GLSurfaceView, tech.sud.runtime.core.InterfaceC22444c
    public void onPause() {
        if (this.f207913a.m221978d()) {
            return;
        }
        super.onPause();
        this.f207913a.m221977c();
    }

    @Override // android.opengl.GLSurfaceView, tech.sud.runtime.core.InterfaceC22444c
    public void onResume() {
        if (this.f207913a.m221978d()) {
            return;
        }
        super.onResume();
        this.f207913a.m221975b();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f207913a.m221976b(true);
        super.onSizeChanged(i, i2, i3, i4);
        this.f207913a.m221976b(false);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f207913a.m221972a(motionEvent);
        return true;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f207913a.m221974a(false);
        super.surfaceCreated(surfaceHolder);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f207913a.m221974a(true);
        this.f207913a.m221976b(true);
        super.surfaceDestroyed(surfaceHolder);
        this.f207913a.m221976b(false);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        this.f207913a.m221976b(true);
        super.surfaceRedrawNeeded(surfaceHolder);
        this.f207913a.m221976b(false);
    }
}
