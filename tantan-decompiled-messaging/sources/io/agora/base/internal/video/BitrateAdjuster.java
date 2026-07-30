package io.agora.base.internal.video;

/* JADX INFO: loaded from: classes2.dex */
interface BitrateAdjuster {
    int getAdjustedBitrateBps();

    int getCodecConfigFramerate();

    void reportEncodedFrame(int i);

    void setTargets(int i, int i2);
}
