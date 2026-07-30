package io.agora.meta;

import android.content.Context;
import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class MetaSceneConfig {
    public int mSyncMode = 1;
    public Context mActivityContext = null;
    public boolean mEnableFaceCapture = false;
    public String mFaceCaptureAppId = "";
    public String mFaceCaptureCertificate = "";

    public static class StateSyncMode {
        public static final int STATE_SYNC_MODE_NONE = 0;
        public static final int STATE_SYNC_MODE_NORMAL = 1;

        private StateSyncMode() {
        }
    }

    @CalledByNative
    public Context getActivityContext() {
        return this.mActivityContext;
    }

    @CalledByNative
    public String getFaceCaptureAppId() {
        return this.mFaceCaptureAppId;
    }

    @CalledByNative
    public String getFaceCaptureCertificate() {
        return this.mFaceCaptureCertificate;
    }

    @CalledByNative
    public int getSyncMode() {
        return this.mSyncMode;
    }

    @CalledByNative
    public boolean isEnableFaceCapture() {
        return this.mEnableFaceCapture;
    }

    public String toString() {
        return "MetaSceneConfig{mSyncMode=" + this.mSyncMode + ", mActivityContext=" + this.mActivityContext + ", mEnableFaceCapture=" + this.mEnableFaceCapture + ", mFaceCaptureAppId='" + this.mFaceCaptureAppId + "', mFaceCaptureCertificate='" + this.mFaceCaptureCertificate + "'}";
    }
}
