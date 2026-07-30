package com.p046p1.mobile.putong.core.p053ui.onlinematch;

import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.data.User;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
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
        this.userId = (zEquals || zEquals2) ? pushMessage.messageCustom.otherID : pushMessage.content.f38804id;
        this.isSpeedMatch = zEquals;
        this.isSquareMatch = zEquals2;
        this.tracker = pushMessageCustom.tracker;
    }
}
