package com.p000p1.mobile.putong.core.p001ui.onlinematch;

import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.PushMessageCustom;
import com.p1.mobile.putong.data.User;
import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class OnlineMatchMatchUser implements Serializable {
    private static final String TAG = "OnlineMatchMatchUser";
    public boolean isSpeedMatch;
    public boolean isSquareMatch;
    public String tracker;
    public User user;
    public String userId;

    public void transDataFromPush(PushMessage pushMessage) {
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        boolean zEquals = "quickchat.speed-match".equals(pushMessage.intent);
        boolean zEquals2 = "quickchat_state.match".equals(pushMessage.intent);
        this.userId = (zEquals || zEquals2) ? pushMessage.messageCustom.otherID : pushMessage.content.id;
        this.isSpeedMatch = zEquals;
        this.isSquareMatch = zEquals2;
        this.tracker = pushMessageCustom.tracker;
    }
}
