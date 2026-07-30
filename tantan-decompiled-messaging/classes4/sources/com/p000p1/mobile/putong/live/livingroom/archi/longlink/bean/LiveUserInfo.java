package com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean;

import com.p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveUserInfo {
    public List<VoiceMicEmoji.EmojiPlayResult> emojiResult;
    public String emojiType;
    public long grade;
    public boolean isMaskMode;
    public String mid;
    public String userId;
    public String userIdentity;
    public String userImage;
    public BLiveUserMask userMask;
    public String userName;

    public LiveUserInfo(String str, String str2, long j) {
        this.userId = str;
        this.userName = str2;
        this.grade = j;
    }

    public LiveUserInfo(String str, String str2) {
        this.userId = str;
        this.userName = str2;
    }

    public LiveUserInfo(String str, String str2, String str3) {
        this.userId = str;
        this.userName = str2;
        this.userImage = str3;
    }

    public LiveUserInfo(String str, String str2, BLiveUserMask bLiveUserMask) {
        this.userId = str;
        this.userName = str2;
        this.userMask = bLiveUserMask;
    }
}
