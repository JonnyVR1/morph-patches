package com.p000p1.mobile.putong.feed.data;

import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedSeeMoreFollowingMomentInfo {
    public static final int ACTION_EXPAND_MORE = 1;
    public static final int ACTION_INVALID = -1;
    public static final int ACTION_JUMP_TO_FOLLOW = 2;
    public static final int ACTION_SHOW_DEADLINE = 3;
    public int action;
    public List<Moment> followingMoments;
    public int unReadfollowingFeeds;
}
