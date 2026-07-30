package tech.sud.runtime.core;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;
import android.view.SurfaceHolder;

/* JADX INFO: renamed from: tech.sud.runtime.core.e */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
class C1239e extends GLSurfaceView implements InterfaceC1237c {

    /* JADX INFO: renamed from: a */
    private final C1238d f11538a;

    public C1239e(C1241g c1241g, Context context, boolean z) {
        super(context);
        if (z) {
            getHolder().setFormat(-3);
            setZOrderOnTop(true);
        }
        setPreserveEGLContextOnPause(true);
        this.f11538a = new C1238d(c1241g, this);
    }

    @Override // tech.sud.runtime.core.InterfaceC1237c
    /* JADX INFO: renamed from: a */
    public C1238d mo10431a() {
        return this.f11538a;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        this.f11538a.m10447b(true);
        super.onDetachedFromWindow();
        this.f11538a.m10447b(false);
    }

    @Override // android.opengl.GLSurfaceView, tech.sud.runtime.core.InterfaceC1237c
    public void onPause() {
        if (this.f11538a.m10449d()) {
            return;
        }
        super.onPause();
        this.f11538a.m10448c();
    }

    @Override // android.opengl.GLSurfaceView, tech.sud.runtime.core.InterfaceC1237c
    public void onResume() {
        if (this.f11538a.m10449d()) {
            return;
        }
        super.onResume();
        this.f11538a.m10446b();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f11538a.m10447b(true);
        super.onSizeChanged(i, i2, i3, i4);
        this.f11538a.m10447b(false);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f11538a.m10443a(motionEvent);
        return true;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f11538a.m10445a(false);
        super.surfaceCreated(surfaceHolder);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f11538a.m10445a(true);
        this.f11538a.m10447b(true);
        super.surfaceDestroyed(surfaceHolder);
        this.f11538a.m10447b(false);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        this.f11538a.m10447b(true);
        super.surfaceRedrawNeeded(surfaceHolder);
        this.f11538a.m10447b(false);
    }
}
