package tech.sud.gip.core;

/* JADX INFO: loaded from: classes3.dex */
public interface ISudListenerPreloadMGPkg {
    void onPreloadFailure(long j, int i, String str);

    void onPreloadStatus(long j, long j2, long j3, PkgDownloadStatus pkgDownloadStatus);

    void onPreloadSuccess(long j);
}
