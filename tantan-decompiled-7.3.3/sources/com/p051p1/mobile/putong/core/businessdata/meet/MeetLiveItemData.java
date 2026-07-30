package com.p051p1.mobile.putong.core.businessdata.meet;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.data.LiveType;
import com.p051p1.mobile.putong.core.data.MyMeetLiveItem;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p153l.jyb;

/* JADX INFO: loaded from: classes9.dex */
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
        return this.item.anonymous && NullChecker.m82486a(this.user) && !jyb.m147479J(this.user.profile.extensions.live.voiceImgUrl);
    }

    public boolean isFollowed() {
        return TEnum.equals(this.item.liveType, LiveType.liveVoice) && TextUtils.equals(this.item.follow.status, FollowshipStatus.following);
    }

    @Override // com.p051p1.mobile.putong.core.businessdata.meet.AbsMeetUserItemData
    public boolean isLikedUser() {
        return TEnum.equals(this.item.relation.status, RelationshipStatus.get("liked")) || TEnum.equals(this.item.relation.status, RelationshipStatus.get("superliked")) || TEnum.equals(this.item.relation.status, RelationshipStatus.get("lettered"));
    }

    public boolean isMatched() {
        return isLikedUser() && isSeeUser();
    }

    @Override // com.p051p1.mobile.putong.core.businessdata.meet.AbsMeetUserItemData
    public boolean isPicksUser() {
        return this.item.picksUser;
    }

    @Override // com.p051p1.mobile.putong.core.businessdata.meet.AbsMeetUserItemData
    public boolean isSeeUser() {
        return TEnum.equals(this.item.relation.otherStatus, RelationshipStatus.get("liked")) || TEnum.equals(this.item.relation.otherStatus, RelationshipStatus.get("superliked")) || TEnum.equals(this.item.relation.otherStatus, RelationshipStatus.get("lettered"));
    }

    public boolean isSuperLikedMe() {
        return TEnum.equals(this.item.relation.otherStatus, RelationshipStatus.get("superliked")) || TEnum.equals(this.item.relation.status, RelationshipStatus.get("superliked"));
    }
}
