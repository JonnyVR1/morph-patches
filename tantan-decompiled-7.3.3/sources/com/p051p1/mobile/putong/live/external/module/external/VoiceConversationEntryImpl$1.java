package com.p051p1.mobile.putong.live.external.module.external;

import java.util.LinkedHashMap;
import p153l.qan0;

/* JADX INFO: loaded from: classes9.dex */
class VoiceConversationEntryImpl$1 extends LinkedHashMap<String, String> {
    final /* synthetic */ qan0 this$0;

    public VoiceConversationEntryImpl$1(qan0 qan0Var) {
        this.this$0 = qan0Var;
        put("全部可见", "all");
        put("仅喜欢过的人可见", "only-like");
        put("仅好友可见", "only-friend");
        put("任何人不可见", "none");
    }
}
