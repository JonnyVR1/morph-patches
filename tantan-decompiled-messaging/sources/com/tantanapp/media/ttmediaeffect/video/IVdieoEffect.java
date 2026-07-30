package com.tantanapp.media.ttmediaeffect.video;

/* JADX INFO: loaded from: classes13.dex */
public interface IVdieoEffect {

    public interface OnCompletionListener {
        void onCompletion();
    }

    public interface OnErrorListener {
        boolean onError(int i, int i2);
    }

    public interface OnRenderPositionChangedListener {
        void onRenderPositionChanged(long j);
    }
}
