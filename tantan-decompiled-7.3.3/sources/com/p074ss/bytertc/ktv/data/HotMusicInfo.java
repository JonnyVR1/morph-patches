package com.p074ss.bytertc.ktv.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public class HotMusicInfo {
    public String hotName;
    public MusicInfo[] musics;

    @CalledByNative
    public HotMusicInfo(String str, MusicInfo[] musicInfoArr) {
        this.hotName = str;
        this.musics = musicInfoArr;
    }
}
