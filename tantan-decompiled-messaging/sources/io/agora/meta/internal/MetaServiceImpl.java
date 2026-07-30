package io.agora.meta.internal;

import android.content.Context;
import android.text.TextUtils;
import io.agora.meta.IMetaService;
import io.agora.meta.IMetaServiceEventHandler;
import io.agora.meta.MetaSceneConfig;
import io.agora.meta.MetaServiceConfig;
import io.agora.utils2.internal.Logging;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class MetaServiceImpl extends IMetaService {
    private static final String TAG = "MetaServiceImpl";
    private String mLauncherVersion;
    private long mNativeHandle = 0;
    private final AtomicBoolean mIsDestroying = new AtomicBoolean(false);

    private native int nativeAddEventHandler(long j, Object obj);

    private native int nativeCancelDownloadSceneAssets(long j, long j2);

    private native int nativeCleanSceneAssets(long j, long j2);

    private native int nativeCreateScene(long j, MetaSceneConfig metaSceneConfig);

    private static native int nativeDestroy(long j);

    private native int nativeDownloadSceneAssets(long j, long j2);

    private native int nativeGetSceneAssetsInfo(long j);

    private native int nativeIsSceneAssetsDownloaded(long j, long j2);

    private native long nativeObjectInit(MetaServiceConfig metaServiceConfig, long j);

    private native int nativeRemoveEventHandler(long j, Object obj);

    private native int nativeRenewToken(long j, String str);

    private void readLauncherVersion(Context context) {
        try {
            InputStream inputStreamOpen = context.getAssets().open("LauncherVersion.txt", 3);
            byte[] bytes = new byte[inputStreamOpen.available()];
            if (inputStreamOpen.read(bytes) <= 0) {
                bytes = "unknown".getBytes();
            }
            inputStreamOpen.close();
            this.mLauncherVersion = new String(bytes, "UTF-8");
        } catch (IOException e) {
            Logging.m87219e(TAG, "get launcher version failed, " + e.getMessage());
        }
    }

    @Override // io.agora.meta.IMetaService
    public int addEventHandler(IMetaServiceEventHandler iMetaServiceEventHandler) {
        if (this.mIsDestroying.get()) {
            Logging.m87219e(TAG, "MetaService is destroying(addEventHandler)");
            return -8;
        }
        synchronized (this) {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    Logging.m87219e(TAG, "MetaService does not initialize or it may be destroyed (addEventHandler)");
                    return -7;
                }
                return nativeAddEventHandler(j, iMetaServiceEventHandler);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.meta.IMetaService
    public int cancelDownloadSceneAssets(long j) {
        if (this.mIsDestroying.get()) {
            Logging.m87219e(TAG, "MetaService is destroying(cancelDownloadSceneAssets)");
            return -8;
        }
        synchronized (this) {
            try {
                long j2 = this.mNativeHandle;
                if (j2 == 0) {
                    Logging.m87219e(TAG, "MetaService does not initialize or it may be destroyed (cancelDownloadSceneAssets)");
                    return -7;
                }
                return nativeCancelDownloadSceneAssets(j2, j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.meta.IMetaService
    public int cleanSceneAssets(long j) {
        if (this.mIsDestroying.get()) {
            Logging.m87219e(TAG, "MetaService is destroying(cleanSceneAssets)");
            return -8;
        }
        synchronized (this) {
            try {
                long j2 = this.mNativeHandle;
                if (j2 == 0) {
                    Logging.m87219e(TAG, "MetaService does not initialize or it may be destroyed (cleanSceneAssets)");
                    return -7;
                }
                return nativeCleanSceneAssets(j2, j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.meta.IMetaService
    public int createScene(MetaSceneConfig metaSceneConfig) {
        if (this.mIsDestroying.get()) {
            Logging.m87219e(TAG, "MetaService is destroying(createScene)");
            return -8;
        }
        synchronized (this) {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    Logging.m87219e(TAG, "MetaService does not initialize or it may be destroyed (createScene)");
                    return -7;
                }
                if (metaSceneConfig.mActivityContext == null) {
                    return -2;
                }
                return nativeCreateScene(j, metaSceneConfig);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.meta.IMetaService
    public int doDestroy() {
        if (this.mNativeHandle == 0) {
            Logging.m87219e(TAG, "MetaService does not initialize or it may be destroyed (doDestroy)");
            return -7;
        }
        this.mIsDestroying.set(true);
        nativeDestroy(this.mNativeHandle);
        this.mNativeHandle = 0L;
        this.mIsDestroying.set(false);
        return 0;
    }

    @Override // io.agora.meta.IMetaService
    public int downloadSceneAssets(long j) {
        if (this.mIsDestroying.get()) {
            Logging.m87219e(TAG, "MetaService is destroying(downloadSceneAssets)");
            return -8;
        }
        synchronized (this) {
            try {
                long j2 = this.mNativeHandle;
                if (j2 == 0) {
                    Logging.m87219e(TAG, "MetaService does not initialize or it may be destroyed (downloadSceneAssets)");
                    return -7;
                }
                return nativeDownloadSceneAssets(j2, j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.meta.IMetaService
    public String getLauncherVersion(Context context) {
        if (context == null) {
            return "unknown";
        }
        if (TextUtils.isEmpty(this.mLauncherVersion)) {
            readLauncherVersion(context);
        }
        return this.mLauncherVersion;
    }

    @Override // io.agora.meta.IMetaService
    public int getSceneAssetsInfo() {
        if (this.mIsDestroying.get()) {
            Logging.m87219e(TAG, "MetaService is destroying(getSceneAssetsInfo)");
            return -8;
        }
        synchronized (this) {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    Logging.m87219e(TAG, "MetaService does not initialize or it may be destroyed (getSceneAssetsInfo)");
                    return -7;
                }
                return nativeGetSceneAssetsInfo(j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.meta.IMetaService
    public int initialize(MetaServiceConfig metaServiceConfig) {
        if (this.mIsDestroying.get()) {
            Logging.m87219e(TAG, "MetaService is destroying(initialize)");
            return -8;
        }
        synchronized (this) {
            try {
                if (metaServiceConfig.mRtcEngine != null && !TextUtils.isEmpty(metaServiceConfig.mAppId)) {
                    if (metaServiceConfig.mRtcEngine.loadExtensionProvider("agora_rtm_loader") != 0) {
                        Logging.m87219e(TAG, "Rtm extension is not loaded");
                    }
                    long jNativeObjectInit = nativeObjectInit(metaServiceConfig, metaServiceConfig.mRtcEngine.getNativeHandle());
                    this.mNativeHandle = jNativeObjectInit;
                    return jNativeObjectInit == 0 ? -7 : 0;
                }
                return -2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.meta.IMetaService
    public int isSceneAssetsDownloaded(long j) {
        if (this.mIsDestroying.get()) {
            Logging.m87219e(TAG, "MetaService is destroying(isSceneAssetsDownloaded)");
            return -8;
        }
        synchronized (this) {
            try {
                long j2 = this.mNativeHandle;
                if (j2 == 0) {
                    Logging.m87219e(TAG, "MetaService does not initialize or it may be destroyed (isSceneAssetsDownloaded)");
                    return -7;
                }
                return nativeIsSceneAssetsDownloaded(j2, j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.meta.IMetaService
    public int removeEventHandler(IMetaServiceEventHandler iMetaServiceEventHandler) {
        if (this.mIsDestroying.get()) {
            Logging.m87219e(TAG, "MetaService is destroying(removeEventHandler)");
            return -8;
        }
        synchronized (this) {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    Logging.m87219e(TAG, "MetaService does not initialize or it may be destroyed (removeEventHandler)");
                    return -7;
                }
                return nativeRemoveEventHandler(j, iMetaServiceEventHandler);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.meta.IMetaService
    public int renewToken(String str) {
        if (this.mIsDestroying.get()) {
            Logging.m87219e(TAG, "MetaService is destroying(renewToken)");
            return -8;
        }
        synchronized (this) {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    Logging.m87219e(TAG, "MetaService does not initialize or it may be destroyed (renewToken)");
                    return -7;
                }
                return nativeRenewToken(j, str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
