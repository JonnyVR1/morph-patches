package com.p051p1.mobile.putong.live.external.internal.vchat;

import com.p051p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatLive;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatRandomMatch;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class VChatStartData implements Serializable {
    public BLiveVideoChat chat;
    public boolean isFromWindow;
    public BLiveVideoChatLive live;
    public BLiveVideoChatRandomMatch randomMatch;
    public String recallId;
    public String source;
    public int type;

    public VChatStartData(BLiveVideoChatLive bLiveVideoChatLive, String str, String str2) {
        this.live = bLiveVideoChatLive;
        this.source = str;
        this.recallId = str2;
        this.type = 1;
    }

    public boolean isFakeCall() {
        return this.type == 1;
    }

    public boolean isRandomMatch() {
        return this.type == 2;
    }

    public VChatStartData(BLiveVideoChat bLiveVideoChat, String str) {
        this.chat = bLiveVideoChat;
        this.source = str;
        this.type = 0;
    }

    public VChatStartData(BLiveVideoChatRandomMatch bLiveVideoChatRandomMatch, String str) {
        this.randomMatch = bLiveVideoChatRandomMatch;
        this.source = str;
        this.type = 2;
    }

    public VChatStartData() {
    }
}
