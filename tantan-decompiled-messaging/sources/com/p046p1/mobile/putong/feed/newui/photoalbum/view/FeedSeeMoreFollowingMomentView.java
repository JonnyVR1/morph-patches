package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.feed.data.FeedSeeMoreFollowingMomentInfo;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import java.util.ArrayList;
import p147v.VRelative;
import p147v.VText;
import p149l.f3c0;
import p149l.j760;
import p149l.lxh;
import p149l.n7c;
import p149l.osi0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedSeeMoreFollowingMomentView extends VRelative {

    /* JADX INFO: renamed from: d */
    public LinearLayout f42488d;

    /* JADX INFO: renamed from: e */
    public VText f42489e;

    /* JADX INFO: renamed from: f */
    public ImageView f42490f;

    /* JADX INFO: renamed from: g */
    public FeedSeeMoreFollowingMomentInfo f42491g;

    /* JADX INFO: renamed from: h */
    public boolean f42492h;

    public FeedSeeMoreFollowingMomentView(Context context) {
        super(context);
    }

    private String getTrackingMoreType() {
        FeedSeeMoreFollowingMomentInfo feedSeeMoreFollowingMomentInfo = this.f42491g;
        if (feedSeeMoreFollowingMomentInfo == null) {
            return "error";
        }
        int i = feedSeeMoreFollowingMomentInfo.action;
        if (i == 1) {
            return "expand";
        }
        return i == 2 ? "jump" : "other";
    }

    /* JADX INFO: renamed from: B */
    public final boolean m65203B() {
        FeedSeeMoreFollowingMomentInfo feedSeeMoreFollowingMomentInfo = this.f42491g;
        return feedSeeMoreFollowingMomentInfo == null || feedSeeMoreFollowingMomentInfo.action == 3;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m65204H(PhotoAlbumBaseFrag photoAlbumBaseFrag, View view) {
        if (m65203B()) {
            return;
        }
        zvf0.m220399u("e_follow_more", "p_discover_dating", new j760("more_type", getTrackingMoreType()));
        FeedSeeMoreFollowingMomentInfo feedSeeMoreFollowingMomentInfo = this.f42491g;
        int i = feedSeeMoreFollowingMomentInfo.action;
        if (i != 1) {
            if (i == 2) {
                n7c.m158118e().m158121c(feedSeeMoreFollowingMomentInfo.followingMoments.size() > 3 ? this.f42491g.followingMoments.get(2).f56011id : "");
                return;
            } else {
                osi0.m165778b("数据异常");
                return;
            }
        }
        if (photoAlbumBaseFrag == null) {
            osi0.m165778b("frag数据异常");
            return;
        }
        ArrayList arrayList = new ArrayList();
        FeedSeeMoreFollowingMomentInfo feedSeeMoreFollowingMomentInfo2 = this.f42491g;
        int i2 = feedSeeMoreFollowingMomentInfo2.unReadfollowingFeeds;
        if (i2 <= 3) {
            feedSeeMoreFollowingMomentInfo2.action = 3;
        } else {
            feedSeeMoreFollowingMomentInfo2.action = 2;
        }
        int iMin = Math.min(i2, 3);
        if (!vwb.m200296J(this.f42491g.followingMoments) && this.f42491g.followingMoments.size() >= iMin && iMin > 1) {
            arrayList.addAll(this.f42491g.followingMoments.subList(1, iMin));
        }
        if (vwb.m200296J(arrayList)) {
            return;
        }
        photoAlbumBaseFrag.m64016W4(1, arrayList);
    }

    /* JADX INFO: renamed from: I */
    public void m65205I(final PhotoAlbumBaseFrag photoAlbumBaseFrag, FeedSeeMoreFollowingMomentInfo feedSeeMoreFollowingMomentInfo) {
        this.f42491g = feedSeeMoreFollowingMomentInfo;
        xdl0.m208344M(this.f42488d, true);
        LinearLayout linearLayout = this.f42488d;
        int i = t100.f167261j;
        linearLayout.setPadding(i, 0, t100.f167260i, 0);
        int i2 = this.f42491g.action;
        if (i2 == 1) {
            this.f42489e.setText("更多关注人的新动态");
            this.f42490f.setImageResource(f3c0.f94407Q4);
            xdl0.m208344M(this.f42490f, true);
        } else if (i2 == 2) {
            this.f42489e.setText("查看更多关注人的动态");
            this.f42490f.setImageResource(f3c0.f94414R4);
            xdl0.m208344M(this.f42490f, true);
            if (!this.f42492h) {
                this.f42492h = true;
                m65207z();
            }
        } else {
            LinearLayout linearLayout2 = this.f42488d;
            if (i2 == 3) {
                linearLayout2.setPadding(i, 0, i, 0);
                this.f42489e.setText("关注的新动态都看完了，向下查看更多");
                xdl0.m208344M(this.f42490f, false);
            } else {
                xdl0.m208344M(linearLayout2, false);
            }
        }
        xdl0.m208329E0(this.f42488d, new View.OnClickListener() { // from class: l.kxh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125117a.m65204H(photoAlbumBaseFrag, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65206q(this);
    }

    /* JADX INFO: renamed from: q */
    public final void m65206q(View view) {
        lxh.m152063a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public void m65207z() {
        if (m65203B()) {
            return;
        }
        zvf0.m220368A("e_follow_more", "p_discover_dating", new j760("more_type", getTrackingMoreType()));
    }

    public FeedSeeMoreFollowingMomentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedSeeMoreFollowingMomentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
