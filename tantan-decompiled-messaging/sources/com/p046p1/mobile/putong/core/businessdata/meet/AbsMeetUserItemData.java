package com.p046p1.mobile.putong.core.businessdata.meet;

import com.p046p1.mobile.putong.core.data.FeedType;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbsMeetUserItemData extends AbsMeetListData {
    public User user;

    public boolean isLikedUser() {
        return isMeLikedUser() || isMomentLikeUser() || isMomentBeLikeUser();
    }

    public boolean isLikedUserType() {
        return TEnum.equals(this.item.type, FeedType.get("likedUser"));
    }

    public boolean isLocalLikersUser() {
        return TEnum.equals(this.item.type, FeedType.get(FeedType.localLikersUser));
    }

    public boolean isLowSeeSingleUser() {
        return TEnum.equals(this.item.type, FeedType.get(FeedType.lowSeeUser));
    }

    public boolean isMeLikedUser() {
        return TEnum.equals(this.item.relation.status, RelationshipStatus.get("liked")) || TEnum.equals(this.item.relation.status, RelationshipStatus.get("superliked")) || TEnum.equals(this.item.relation.status, RelationshipStatus.get("lettered")) || TEnum.equals(this.item.type, FeedType.get("likedUser"));
    }

    public boolean isMomentBeLikeUser() {
        return TEnum.equals(this.item.type, FeedType.get(FeedType.momentBeLikeUser));
    }

    public boolean isMomentLikeUser() {
        return TEnum.equals(this.item.type, FeedType.get(FeedType.momentLikeUser));
    }

    public boolean isPicksUser() {
        return TEnum.equals(this.item.type, FeedType.get(FeedType.pickUser)) || TEnum.equals(this.item.type, FeedType.get(FeedType.pickMoment));
    }

    public boolean isSeePortraitUser() {
        return TEnum.equals(this.item.type, FeedType.get(FeedType.seePortraitUser));
    }

    public boolean isSeeUser() {
        return TEnum.equals(this.item.relation.otherStatus, RelationshipStatus.get("liked")) || TEnum.equals(this.item.relation.otherStatus, RelationshipStatus.get("superliked")) || TEnum.equals(this.item.relation.otherStatus, RelationshipStatus.get("lettered"));
    }

    public boolean isSuperLikeUser() {
        return TEnum.equals(this.item.relation.status, RelationshipStatus.get("superliked"));
    }
}
