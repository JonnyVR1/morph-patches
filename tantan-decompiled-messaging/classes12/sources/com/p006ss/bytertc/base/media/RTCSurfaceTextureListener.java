package com.p006ss.bytertc.base.media;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.TextureView;
import com.bytedance.realx.base.RXLogging;
import com.p006ss.bytertc.base.media.RTCSurfaceTextureListener;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class RTCSurfaceTextureListener implements TextureView.SurfaceTextureListener {
    private final String key;
    private long nativeSurfaceHelperHandle;
    private TextureView textureView;

    public RTCSurfaceTextureListener(TextureView textureView, final long j, final String str) {
        this.nativeSurfaceHelperHandle = 0L;
        this.textureView = textureView;
        this.key = str;
        final SurfaceTexture surfaceTexture = textureView != null ? textureView.getSurfaceTexture() : null;
        this.nativeSurfaceHelperHandle = j;
        if (surfaceTexture == null || j == 0) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: l.bbc0
            @Override // java.lang.Runnable
            public final void run() {
                RTCSurfaceTextureListener.m8350a(this.f6219a, surfaceTexture, j, str);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8350a(RTCSurfaceTextureListener rTCSurfaceTextureListener, SurfaceTexture surfaceTexture, long j, String str) {
        SurfaceTexture surfaceTexture2 = rTCSurfaceTextureListener.textureView.getSurfaceTexture();
        if (surfaceTexture2 == null || surfaceTexture2 != surfaceTexture) {
            return;
        }
        RTCSurfaceHelper.nativeSetRenderTarget(j, new Surface(surfaceTexture2), str);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.nativeSurfaceHelperHandle != 0) {
            RXLogging.i("RTCSurfaceTextureListener", "onSurfaceTextureAvailable key:" + this.key);
            RTCSurfaceHelper.nativeSetRenderTarget(this.nativeSurfaceHelperHandle, new Surface(surfaceTexture), this.key);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (this.nativeSurfaceHelperHandle == 0) {
            return true;
        }
        RXLogging.i("RTCSurfaceTextureListener", "onSurfaceTextureDestroyed key:" + this.key);
        RTCSurfaceHelper.nativeSetRenderTarget(this.nativeSurfaceHelperHandle, null, this.key);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void resetCallback() {
        this.nativeSurfaceHelperHandle = 0L;
        TextureView textureView = this.textureView;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(null);
        }
    }
}
