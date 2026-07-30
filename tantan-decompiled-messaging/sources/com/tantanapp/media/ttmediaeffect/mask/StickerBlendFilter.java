package com.tantanapp.media.ttmediaeffect.mask;

/* JADX INFO: loaded from: classes13.dex */
public interface StickerBlendFilter {

    public interface TTStickerStateChangeListener {
        void distortionStateChanged(boolean z, float f, float f2, float f3, float f4);

        void faceDetected(boolean z);

        void playStateChanged(int i, boolean z);

        void stickerGestureTypeChanged(String str, boolean z);

        void stickerStateChanged(int i, int i2);
    }
}
