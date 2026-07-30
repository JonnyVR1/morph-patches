package tech.sud.gip.core;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface ISudGamePkgPreload {
    void cancelPreloadMGPkgList(List<Long> list);

    void pausePreloadMGPkgList(List<Long> list);

    void preloadMGPkgList(Context context, List<Long> list, ISudListenerPreloadMGPkg iSudListenerPreloadMGPkg);

    void resumePreloadMGPkgList(List<Long> list);
}
