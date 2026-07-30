package com.p000p1.mobile.putong.core.businessdata.meet;

import android.text.TextUtils;
import com.p1.mobile.putong.core.data.MyMeetLiveItem;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class MeetLiveItemData extends AbsMeetUserItemData {
    private final MyMeetLiveItem item;

    public MeetLiveItemData(User user, MyMeetLiveItem myMeetLiveItem) {
        this.user = user;
        this.item = myMeetLiveItem;
    }

    public MyMeetLiveItem getItem() {
        return this.item;
    }

    public boolean isAnonymous() {
        return this.item.anonymous && NullChecker.a(this.user) && !vwb.J(this.user.profile.extensions.live.voiceImgUrl);
    }

    public boolean isFollowed() {
        return TEnum.equals(this.item.liveType, "liveVoice") && TextUtils.equals(this.item.follow.status, "following");
    }

    @Override // com.p000p1.mobile.putong.core.businessdata.meet.AbsMeetUserItemData
    public boolean isLikedUser() {
        return TEnum.equals(this.item.relation.status, RelationshipStatus.get("liked")) || TEnum.equals(this.item.relation.status, RelationshipStatus.get("superliked")) || TEnum.equals(this.item.relation.status, RelationshipStatus.get("lettered"));
    }

    public boolean isMatched() {
        return isLikedUser() && isSeeUser();
    }

    @Override // com.p000p1.mobile.putong.core.businessdata.meet.AbsMeetUserItemData
    public boolean isPicksUser() {
        return this.item.picksUser;
    }

    @Override // com.p000p1.mobile.putong.core.businessdata.meet.AbsMeetUserItemData
    public boolean isSeeUser() {
        return TEnum.equals(this.item.relation.otherStatus, RelationshipStatus.get("liked")) || TEnum.equals(this.item.relation.otherStatus, RelationshipStatus.get("superliked")) || TEnum.equals(this.item.relation.otherStatus, RelationshipStatus.get("lettered"));
    }

    public boolean isSuperLikedMe() {
        return TEnum.equals(this.item.relation.otherStatus, RelationshipStatus.get("superliked")) || TEnum.equals(this.item.relation.status, RelationshipStatus.get("superliked"));
    }
}
