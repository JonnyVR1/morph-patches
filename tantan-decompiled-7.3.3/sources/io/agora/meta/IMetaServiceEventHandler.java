package io.agora.meta;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public interface IMetaServiceEventHandler {

    public static class ConnectionChangedReason {
        public static final int META_CONNECTION_CHANGED_DEFAULT = 0;

        private ConnectionChangedReason() {
        }
    }

    public static class ConnectionState {
        public static final int META_CONNECTION_STATE_ABORTED = 5;
        public static final int META_CONNECTION_STATE_CONNECTED = 3;
        public static final int META_CONNECTION_STATE_CONNECTING = 2;
        public static final int META_CONNECTION_STATE_DISCONNECTED = 1;
        public static final int META_CONNECTION_STATE_RECONNECTING = 4;

        private ConnectionState() {
        }
    }

    public static class SceneDownloadState {
        public static final int META_SCENE_DOWNLOAD_STATE_DOWNLOADED = 2;
        public static final int META_SCENE_DOWNLOAD_STATE_DOWNLOADING = 1;
        public static final int META_SCENE_DOWNLOAD_STATE_FAILED = 3;
        public static final int META_SCENE_DOWNLOAD_STATE_IDLE = 0;

        private SceneDownloadState() {
        }
    }

    @CalledByNative
    void onConnectionStateChanged(String str, int i, int i2);

    @CalledByNative
    void onCreateSceneResult(IMetaScene iMetaScene, int i);

    @CalledByNative
    void onDownloadSceneAssetsProgress(long j, int i, int i2);

    @CalledByNative
    void onGetSceneAssetsInfoResult(MetaSceneAssetsInfo[] metaSceneAssetsInfoArr, int i);

    @CalledByNative
    void onTokenWillExpire();
}
