package com.p046p1.mobile.putong.core.businessdata.meet;

import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.MyMeetFeedItem;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes9.dex */
public class MeetFeedUserItemData extends AbsMeetUserItemData {
    public int picIndex = 0;
    public boolean isAllShow = false;
    public CoreMomentInfo moment = null;

    public MeetFeedUserItemData(User user, MyMeetFeedItem myMeetFeedItem) {
        this.user = user;
        this.item = myMeetFeedItem;
    }

    public CoreMomentInfo getCoreMomentInfo() {
        return this.moment;
    }

    public void setCoreMomentInfo(CoreMomentInfo coreMomentInfo) {
        this.moment = coreMomentInfo;
    }
}
