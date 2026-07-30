package io.agora.musiccontentcenter;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public interface IMusicContentCenterEventHandler {
    @CalledByNative
    void onLyricResult(String str, long j, String str2, int i);

    @CalledByNative
    void onMusicChartsResult(String str, MusicChartInfo[] musicChartInfoArr, int i);

    @CalledByNative
    void onMusicCollectionResult(String str, int i, int i2, int i3, Music[] musicArr, int i4);

    @CalledByNative
    void onPreLoadEvent(String str, long j, int i, String str2, int i2, int i3);

    @CalledByNative
    void onSongSimpleInfoResult(String str, long j, String str2, int i);
}
