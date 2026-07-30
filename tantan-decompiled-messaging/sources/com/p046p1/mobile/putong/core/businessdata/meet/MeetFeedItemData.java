package com.p046p1.mobile.putong.core.businessdata.meet;

import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.MyMeetFeedItem;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes9.dex */
public class MeetFeedItemData extends AbsMeetUserItemData {
    public CoreMomentInfo moment;
    public Object originalMoment;
    public MeetFeedItemType type;
    public int picIndex = 0;
    public boolean isAllShow = false;

    public enum MeetFeedItemType {
        picks,
        likedUser,
        unknown
    }

    public MeetFeedItemData(CoreMomentInfo coreMomentInfo, User user, Object obj, MyMeetFeedItem myMeetFeedItem) {
        this.moment = coreMomentInfo;
        this.user = user;
        this.originalMoment = obj;
        this.item = myMeetFeedItem;
    }
}
