package com.tencent.could.aicamare.entity;

import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.could.aicamare.enums.CameraZoom;

/* JADX INFO: loaded from: classes2.dex */
public class CameraConfig {
    public boolean isSupportZoom = false;
    public boolean isBackCamera = false;
    public boolean isByteDataBuffer = true;
    public boolean isMainThread = false;
    public boolean isLand = false;
    public int preWidth = WBConstants.SDK_NEW_PAY_VERSION;
    public int preHeight = 1080;
    public int minFps = 24;
    public int maxFps = 30;
    public boolean mustDiffMinAndMaxFps = false;
    public CameraZoom zoom = CameraZoom.ZOOM_1X;

    public int getMaxFps() {
        return this.maxFps;
    }

    public int getMinFps() {
        return this.minFps;
    }

    public int getPreHeight() {
        return this.preHeight;
    }

    public int getPreWidth() {
        return this.preWidth;
    }

    public CameraZoom getZoom() {
        return this.zoom;
    }

    public boolean isBackCamera() {
        return this.isBackCamera;
    }

    public boolean isByteDataBuffer() {
        return this.isByteDataBuffer;
    }

    public boolean isLand() {
        return this.isLand;
    }

    public boolean isMainThread() {
        return this.isMainThread;
    }

    public boolean isMustDiffMinAndMaxFps() {
        return this.mustDiffMinAndMaxFps;
    }

    public boolean isSupportZoom() {
        return this.isSupportZoom;
    }

    public void setBackCamera(boolean z) {
        this.isBackCamera = z;
    }

    public void setByteDataBuffer(boolean z) {
        this.isByteDataBuffer = z;
    }

    public void setLand(boolean z) {
        this.isLand = z;
    }

    public void setMainThread(boolean z) {
        this.isMainThread = z;
    }

    public void setMaxFps(int i) {
        this.maxFps = i;
    }

    public void setMinFps(int i) {
        this.minFps = i;
    }

    public void setMustDiffMinAndMaxFps(boolean z) {
        this.mustDiffMinAndMaxFps = z;
    }

    public void setPreHeight(int i) {
        this.preHeight = i;
    }

    public void setPreWidth(int i) {
        this.preWidth = i;
    }

    public void setSupportZoom(boolean z) {
        this.isSupportZoom = z;
    }

    public void setZoom(CameraZoom cameraZoom) {
        this.zoom = cameraZoom;
    }
}
