package io.agora.meta;

import android.content.Context;
import io.agora.meta.internal.MetaServiceImpl;

/* JADX INFO: loaded from: classes2.dex */
public abstract class IMetaService {
    private static IMetaService mInstance;

    public static synchronized IMetaService create() {
        try {
            if (mInstance == null) {
                mInstance = new MetaServiceImpl();
            }
        } catch (Throwable th) {
            throw th;
        }
        return mInstance;
    }

    public static synchronized void destroy() {
        IMetaService iMetaService = mInstance;
        if (iMetaService == null) {
            return;
        }
        iMetaService.doDestroy();
        mInstance = null;
    }

    public abstract int addEventHandler(IMetaServiceEventHandler iMetaServiceEventHandler);

    public abstract int cancelDownloadSceneAssets(long j);

    public abstract int cleanSceneAssets(long j);

    public abstract int createScene(MetaSceneConfig metaSceneConfig);

    public abstract int doDestroy();

    public abstract int downloadSceneAssets(long j);

    public abstract String getLauncherVersion(Context context);

    public abstract int getSceneAssetsInfo();

    public abstract int initialize(MetaServiceConfig metaServiceConfig);

    public abstract int isSceneAssetsDownloaded(long j);

    public abstract int removeEventHandler(IMetaServiceEventHandler iMetaServiceEventHandler);

    public abstract int renewToken(String str);
}
