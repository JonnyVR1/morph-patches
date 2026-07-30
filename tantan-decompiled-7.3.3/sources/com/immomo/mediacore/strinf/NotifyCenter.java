package com.immomo.mediacore.strinf;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes7.dex */
public interface NotifyCenter {
    PointF getPreviewScale();

    float getPreviewZoom();

    int getStreamerCaptureType(int i);

    int getStreamerType();

    VideoQuality getVideoQuality();

    Object getWriter();

    void notify(int i, int i2, int i3, Object obj);

    void notifyAdjustAef(int i, boolean z);

    void notifyAdjustEQ(int i, boolean z);

    void notifyAdjustEf(int i, int i2);

    void notifyAdjustTune(int i, boolean z);

    void notifyEffectReset();

    void notifyEffectSet(int i, int i2, float f);

    void notifyEnableExtralAudio(boolean z);

    void notifyExtralAudioLoss();

    void notifyExtralAudioReady();

    void notifyRecording();

    void notifyResumeRecording();

    void notifyUpdateResolution();

    void setSourceSucess();

    void setStreamerCaptureType(int i, int i2);

    void startSurroundMusic(String str, int i, long j);

    void stopSurroundMusic();
}
