package tech.sud.runtime.core;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;
import android.view.SurfaceHolder;

/* JADX INFO: renamed from: tech.sud.runtime.core.e */
/* JADX INFO: loaded from: classes3.dex */
class C22561e extends GLSurfaceView implements InterfaceC22559c {

    /* JADX INFO: renamed from: a */
    private final C22560d f208835a;

    public C22561e(C22563g c22563g, Context context, boolean z) {
        super(context);
        if (z) {
            getHolder().setFormat(-3);
            setZOrderOnTop(true);
        }
        setPreserveEGLContextOnPause(true);
        this.f208835a = new C22560d(c22563g, this);
    }

    @Override // tech.sud.runtime.core.InterfaceC22559c
    /* JADX INFO: renamed from: a */
    public C22560d mo223206a() {
        return this.f208835a;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        this.f208835a.m223222b(true);
        super.onDetachedFromWindow();
        this.f208835a.m223222b(false);
    }

    @Override // android.opengl.GLSurfaceView, tech.sud.runtime.core.InterfaceC22559c
    public void onPause() {
        if (this.f208835a.m223224d()) {
            return;
        }
        super.onPause();
        this.f208835a.m223223c();
    }

    @Override // android.opengl.GLSurfaceView, tech.sud.runtime.core.InterfaceC22559c
    public void onResume() {
        if (this.f208835a.m223224d()) {
            return;
        }
        super.onResume();
        this.f208835a.m223221b();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f208835a.m223222b(true);
        super.onSizeChanged(i, i2, i3, i4);
        this.f208835a.m223222b(false);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f208835a.m223218a(motionEvent);
        return true;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f208835a.m223220a(false);
        super.surfaceCreated(surfaceHolder);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f208835a.m223220a(true);
        this.f208835a.m223222b(true);
        super.surfaceDestroyed(surfaceHolder);
        this.f208835a.m223222b(false);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        this.f208835a.m223222b(true);
        super.surfaceRedrawNeeded(surfaceHolder);
        this.f208835a.m223222b(false);
    }
}
