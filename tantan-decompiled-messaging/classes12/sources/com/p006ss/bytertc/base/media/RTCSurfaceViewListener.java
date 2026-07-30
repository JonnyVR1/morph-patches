package com.p006ss.bytertc.base.media;

import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.bytedance.realx.base.RXLogging;
import com.p006ss.bytertc.base.media.RTCSurfaceViewListener;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class RTCSurfaceViewListener implements SurfaceHolder.Callback {
    private final String key;
    private long nativeSurfaceHelperHandle;
    private SurfaceView surfaceView;

    public RTCSurfaceViewListener(SurfaceView surfaceView, final long j, final String str) {
        SurfaceHolder holder;
        Surface surface;
        this.nativeSurfaceHelperHandle = j;
        this.surfaceView = surfaceView;
        this.key = str;
        final Surface surface2 = (surfaceView == null || surfaceView.getHolder() == null || (holder = this.surfaceView.getHolder()) == null || holder.getSurface() == null || (surface = holder.getSurface()) == null || !surface.isValid()) ? null : holder.getSurface();
        if (surface2 == null || this.nativeSurfaceHelperHandle == 0) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: l.cbc0
            @Override // java.lang.Runnable
            public final void run() {
                RTCSurfaceViewListener.m8351a(this.f6596a, surface2, j, str);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8351a(RTCSurfaceViewListener rTCSurfaceViewListener, Surface surface, long j, String str) {
        Surface surface2 = rTCSurfaceViewListener.surfaceView.getHolder().getSurface();
        if (surface2 != null && surface2.isValid() && surface2 == surface) {
            RTCSurfaceHelper.nativeSetRenderTarget(j, surface2, str);
        }
    }

    public void resetCallback() {
        this.nativeSurfaceHelperHandle = 0L;
        SurfaceView surfaceView = this.surfaceView;
        if (surfaceView != null) {
            surfaceView.getHolder().removeCallback(this);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.nativeSurfaceHelperHandle == 0 || surfaceHolder == null || surfaceHolder.getSurface() == null || !surfaceHolder.getSurface().isValid()) {
            return;
        }
        RXLogging.i("RTCSurfaceViewListener", "surfaceCreated key:" + this.key);
        RTCSurfaceHelper.nativeSetRenderTarget(this.nativeSurfaceHelperHandle, surfaceHolder.getSurface(), this.key);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.nativeSurfaceHelperHandle != 0) {
            RXLogging.i("RTCSurfaceViewListener", "surfaceDestroyed key:" + this.key);
            RTCSurfaceHelper.nativeSetRenderTarget(this.nativeSurfaceHelperHandle, null, this.key);
        }
    }
}
