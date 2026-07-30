package io.agora.meta;

import android.view.TextureView;
import io.agora.base.VideoFrame;
import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public interface IMetaSceneEventHandler {
    @CalledByNative
    void onAddSceneViewResult(TextureView textureView, int i);

    @CalledByNative
    void onEnterSceneResult(int i);

    @CalledByNative
    void onLeaveSceneResult(int i);

    @CalledByNative
    void onReleasedScene(int i);

    @CalledByNative
    void onRemoveSceneViewResult(TextureView textureView, int i);

    @CalledByNative
    void onSceneMessageReceived(byte[] bArr);

    @CalledByNative
    void onSceneVideoFrameCaptured(TextureView textureView, VideoFrame videoFrame);

    @CalledByNative
    void onUserPositionChanged(String str, MetaUserPositionInfo metaUserPositionInfo);
}
