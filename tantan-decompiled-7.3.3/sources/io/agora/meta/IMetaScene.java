package io.agora.meta;

import android.view.TextureView;
import io.agora.base.VideoFrame;
import io.agora.rtc2.video.AgoraVideoFrame;

/* JADX INFO: loaded from: classes2.dex */
public abstract class IMetaScene {
    public abstract int addEventHandler(IMetaSceneEventHandler iMetaSceneEventHandler);

    public abstract int addSceneView(TextureView textureView, SceneDisplayConfig sceneDisplayConfig);

    public abstract int enableFaceCapture(boolean z);

    public abstract int enableSceneVideoCapture(TextureView textureView, boolean z);

    public abstract int enableVideoDisplay(String str, boolean z);

    public abstract int enterScene(EnterSceneConfig enterSceneConfig);

    public abstract ILocalUserAvatar getLocalUserAvatar();

    public abstract int leaveScene();

    public abstract int pushVideoFrameToDisplay(String str, VideoFrame videoFrame);

    public abstract int pushVideoFrameToDisplay(String str, AgoraVideoFrame agoraVideoFrame);

    public abstract int release();

    public abstract int removeEventHandler(IMetaSceneEventHandler iMetaSceneEventHandler);

    public abstract int removeSceneView(TextureView textureView);

    public abstract int sendSceneMessage(byte[] bArr);

    public abstract int setSceneParameters(String str);
}
