package io.agora.meta;

import android.view.TextureView;
import io.agora.base.internal.CalledByNative;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class EnterSceneConfig {
    public String mRoomName = "";
    public TextureView mSceneView = null;
    public long mSceneId = 0;
    public String mScenePath = "";
    public byte[] mExtraInfo = null;

    @CalledByNative
    public byte[] getExtraInfo() {
        return this.mExtraInfo;
    }

    @CalledByNative
    public String getRoomName() {
        return this.mRoomName;
    }

    @CalledByNative
    public long getSceneId() {
        return this.mSceneId;
    }

    @CalledByNative
    public String getScenePath() {
        return this.mScenePath;
    }

    @CalledByNative
    public TextureView getSceneView() {
        return this.mSceneView;
    }

    public String toString() {
        return "EnterSceneConfig{mRoomName='" + this.mRoomName + "', mSceneView=" + this.mSceneView + ", mSceneId=" + this.mSceneId + ", mScenePath='" + this.mScenePath + "', mExtraCustomInfo=" + Arrays.toString(this.mExtraInfo) + '}';
    }
}
