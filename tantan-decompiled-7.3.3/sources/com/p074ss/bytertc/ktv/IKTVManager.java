package com.p074ss.bytertc.ktv;

import androidx.annotation.NonNull;
import com.p074ss.bytertc.ktv.data.DownloadLyricType;
import com.p074ss.bytertc.ktv.data.MusicFilterType;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class IKTVManager {
    public abstract void cancelDownload(int i);

    public abstract void clearCache();

    public abstract int downloadLyric(@NonNull String str, @NonNull DownloadLyricType downloadLyricType);

    public abstract int downloadMidi(@NonNull String str);

    public abstract int downloadMusic(@NonNull String str);

    public abstract void getHotMusic(@NonNull List<String> list, @NonNull MusicFilterType[] musicFilterTypeArr);

    public abstract IKTVPlayer getKTVPlayer();

    public abstract void getMusicDetail(@NonNull String str);

    public abstract void getMusicList(int i, int i2, @NonNull MusicFilterType[] musicFilterTypeArr);

    public abstract void searchMusic(@NonNull String str, int i, int i2, @NonNull MusicFilterType[] musicFilterTypeArr);

    public abstract void setKTVManagerEventHandler(IKTVManagerEventHandler iKTVManagerEventHandler);

    public abstract void setMaxCacheSize(int i);
}
