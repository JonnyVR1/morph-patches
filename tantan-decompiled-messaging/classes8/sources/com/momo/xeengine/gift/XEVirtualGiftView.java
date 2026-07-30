package com.momo.xeengine.gift;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import androidx.annotation.Keep;
import com.momo.xeengine.IXEngine;
import com.momo.xeengine.game.XEGameViewCallback;
import com.momo.xeengine.game.XEVirtualGameView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public final class XEVirtualGiftView {
    private XEGameViewCallback callback;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private int renderHeight;
    private int renderWidth;
    private Surface targetSurface;
    private XEVirtualGameView virtualGameView;

    public XEVirtualGiftView(Surface surface, int i, int i2) {
        this.targetSurface = surface;
        this.renderWidth = i;
        this.renderHeight = i2;
        setupVirtualGameView();
    }

    private void setupVirtualGameView() {
        XEVirtualGameView xEVirtualGameView = new XEVirtualGameView(this.targetSurface, this.renderWidth, this.renderHeight);
        this.virtualGameView = xEVirtualGameView;
        xEVirtualGameView.setCallback(new XEGameViewCallback() { // from class: com.momo.xeengine.gift.XEVirtualGiftView.1
            @Override // com.momo.xeengine.game.XEGameViewCallback
            public void onEngineDynamicLinkLibraryDownloadProcess(int i, double d) {
                if (XEVirtualGiftView.this.callback != null) {
                    XEVirtualGiftView.this.callback.onEngineDynamicLinkLibraryDownloadProcess(i, d);
                }
            }

            @Override // com.momo.xeengine.game.XEGameViewCallback
            public void onRenderSizeChanged(int i, int i2) {
                if (XEVirtualGiftView.this.callback != null) {
                    XEVirtualGiftView.this.callback.onRenderSizeChanged(i, i2);
                }
            }

            @Override // com.momo.xeengine.game.XEGameViewCallback
            public void onRenderViewCreate(View view) {
            }

            @Override // com.momo.xeengine.game.XEGameViewCallback
            public void onStart(IXEngine iXEngine) {
                if (XEVirtualGiftView.this.callback != null) {
                    XEVirtualGiftView.this.callback.onStart(iXEngine);
                }
            }

            @Override // com.momo.xeengine.game.XEGameViewCallback
            public void onStartFailed(String str) {
                if (XEVirtualGiftView.this.callback != null) {
                    XEVirtualGiftView.this.callback.onStartFailed(str);
                }
            }
        });
    }

    public int getPreferredFramesPerSecond() {
        return this.virtualGameView.getPreferredFramesPerSecond();
    }

    public int getRenderHeight() {
        return this.renderHeight;
    }

    public int getRenderWidth() {
        return this.renderWidth;
    }

    public Surface getTargetSurface() {
        return this.targetSurface;
    }

    public XEVirtualGameView getVirtualGameView() {
        return this.virtualGameView;
    }

    public boolean handleTouchEvent(MotionEvent motionEvent) {
        return this.virtualGameView.handleTouchEvent(motionEvent);
    }

    public boolean isPaused() {
        return this.virtualGameView.isPaused();
    }

    public void pause() {
        this.virtualGameView.pause();
    }

    public void post(Runnable runnable) {
        Handler handler = this.mainHandler;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public void resetSurface(Surface surface, int i, int i2) {
        this.targetSurface = surface;
        this.renderWidth = i;
        this.renderHeight = i2;
        this.virtualGameView.setSurface(surface, i, i2);
    }

    public void resume() {
        this.virtualGameView.resume();
    }

    public void setCallback(XEGameViewCallback xEGameViewCallback) {
        this.callback = xEGameViewCallback;
    }

    public void setPreferredFramesPerSecond(int i) {
        this.virtualGameView.setPreferredFramesPerSecond(i);
    }

    public void setSafeArea(float f, float f2, float f3, float f4) {
        this.virtualGameView.setSafeArea(f, f2, f3, f4);
    }

    public void start() {
        this.virtualGameView.start();
    }

    public void stop() {
        this.virtualGameView.stop();
    }

    public void updateRenderSize(int i, int i2) {
        this.renderWidth = i;
        this.renderHeight = i2;
        this.virtualGameView.updateRenderSize(i, i2);
    }
}
