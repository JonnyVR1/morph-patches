package com.p069ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public class SubtitleMessage {
    public boolean definite;
    public String language;
    public SubtitleMode mode;
    public int sequence;
    public String text;
    public String userId;

    public SubtitleMessage(String str, String str2, String str3, SubtitleMode subtitleMode, int i, boolean z) {
        this.userId = str;
        this.text = str2;
        this.language = str3;
        this.mode = subtitleMode;
        this.sequence = i;
        this.definite = z;
    }

    @CalledByNative
    public static SubtitleMessage create(String str, String str2, String str3, int i, int i2, boolean z) {
        return new SubtitleMessage(str, str2, str3, SubtitleMode.fromId(i), i2, z);
    }
}
