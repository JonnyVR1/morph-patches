package io.agora.rtc2;

import android.content.Context;
import io.agora.base.internal.CalledByNative;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class RtcEngineConfig {
    public String mNativeLibPath;
    public IRtcEngineEventHandler mEventHandler = null;
    public Context mContext = null;
    public String mAppId = "";
    public int mChannelProfile = 1;
    public String mLicense = "";
    public int mAudioScenario = 0;
    public int mAreaCode = -1;
    public List<String> mExtensionList = new ArrayList();
    public IMediaExtensionObserver mExtensionObserver = null;
    public LogConfig mLogConfig = new LogConfig();
    public Integer mThreadPriority = null;
    public boolean mDomainLimit = false;
    public boolean mAutoRegisterAgoraExtensions = true;

    public static class AreaCode {
        public static final int AREA_CODE_AS = 8;
        public static final int AREA_CODE_CN = 1;
        public static final int AREA_CODE_EU = 4;
        public static final int AREA_CODE_GLOB = -1;
        public static final int AREA_CODE_IN = 32;
        public static final int AREA_CODE_JP = 16;
        public static final int AREA_CODE_NA = 2;
        public static final int AREA_CODE_NONE = 0;
        public static final int AREA_CODE_RU = 4096;

        private AreaCode() {
        }
    }

    public static class LogConfig {
        public String filePath;
        public int fileSizeInKB;
        public int level = Constants.LogLevel.getValue(Constants.LogLevel.LOG_LEVEL_INFO);

        @CalledByNative("LogConfig")
        public String getFilePath() {
            return this.filePath;
        }

        @CalledByNative("LogConfig")
        public int getFileSize() {
            return this.fileSizeInKB;
        }

        @CalledByNative("LogConfig")
        public int getLevel() {
            return this.level;
        }
    }

    public void addExtension(String str) {
        this.mExtensionList.add(str);
    }

    @CalledByNative
    public String getAppId() {
        return this.mAppId;
    }

    @CalledByNative
    public int getAreaCode() {
        return this.mAreaCode;
    }

    @CalledByNative
    public int getAudioScenario() {
        return this.mAudioScenario;
    }

    @CalledByNative
    public boolean getAutoRegisterAgoraExtensions() {
        return this.mAutoRegisterAgoraExtensions;
    }

    @CalledByNative
    public int getChannelProfile() {
        return this.mChannelProfile;
    }

    @CalledByNative
    public Context getContext() {
        return this.mContext;
    }

    @CalledByNative
    public boolean getDomainLimit() {
        return this.mDomainLimit;
    }

    @CalledByNative
    public IMediaExtensionObserver getExtensionObserver() {
        return this.mExtensionObserver;
    }

    @CalledByNative
    public String getLicense() {
        return this.mLicense;
    }

    @CalledByNative
    public LogConfig getLogConfig() {
        return this.mLogConfig;
    }

    @CalledByNative
    public Integer getThreadPriority() {
        return this.mThreadPriority;
    }
}
