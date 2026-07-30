package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.data.FeedSeeMoreFollowingMomentInfo;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import java.util.ArrayList;
import p151v.VRelative;
import p151v.VText;
import p153l.azh;
import p153l.bnl0;
import p153l.i4g0;
import p153l.jyb;
import p153l.lbc0;
import p153l.pf60;
import p153l.qa00;
import p153l.r1j0;
import p153l.t8c;

/* JADX INFO: loaded from: classes13.dex */
public class FeedSeeMoreFollowingMomentView extends VRelative {

    /* JADX INFO: renamed from: d */
    public LinearLayout f43336d;

    /* JADX INFO: renamed from: e */
    public VText f43337e;

    /* JADX INFO: renamed from: f */
    public ImageView f43338f;

    /* JADX INFO: renamed from: g */
    public FeedSeeMoreFollowingMomentInfo f43339g;

    /* JADX INFO: renamed from: h */
    public boolean f43340h;

    public FeedSeeMoreFollowingMomentView(Context context) {
        super(context);
    }

    private String getTrackingMoreType() {
        FeedSeeMoreFollowingMomentInfo feedSeeMoreFollowingMomentInfo = this.f43339g;
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
    public final boolean m66386B() {
        FeedSeeMoreFollowingMomentInfo feedSeeMoreFollowingMomentInfo = this.f43339g;
        return feedSeeMoreFollowingMomentInfo == null || feedSeeMoreFollowingMomentInfo.action == 3;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m66387H(PhotoAlbumBaseFrag photoAlbumBaseFrag, View view) {
        if (m66386B()) {
            return;
        }
        i4g0.m138523u("e_follow_more", "p_discover_dating", new pf60("more_type", getTrackingMoreType()));
        FeedSeeMoreFollowingMomentInfo feedSeeMoreFollowingMomentInfo = this.f43339g;
        int i = feedSeeMoreFollowingMomentInfo.action;
        if (i != 1) {
            if (i == 2) {
                t8c.m189652e().m189655c(feedSeeMoreFollowingMomentInfo.followingMoments.size() > 3 ? this.f43339g.followingMoments.get(2).f56859id : "");
                return;
            } else {
                r1j0.m179415b("数据异常");
                return;
            }
        }
        if (photoAlbumBaseFrag == null) {
            r1j0.m179415b("frag数据异常");
            return;
        }
        ArrayList arrayList = new ArrayList();
        FeedSeeMoreFollowingMomentInfo feedSeeMoreFollowingMomentInfo2 = this.f43339g;
        int i2 = feedSeeMoreFollowingMomentInfo2.unReadfollowingFeeds;
        if (i2 <= 3) {
            feedSeeMoreFollowingMomentInfo2.action = 3;
        } else {
            feedSeeMoreFollowingMomentInfo2.action = 2;
        }
        int iMin = Math.min(i2, 3);
        if (!jyb.m147479J(this.f43339g.followingMoments) && this.f43339g.followingMoments.size() >= iMin && iMin > 1) {
            arrayList.addAll(this.f43339g.followingMoments.subList(1, iMin));
        }
        if (jyb.m147479J(arrayList)) {
            return;
        }
        photoAlbumBaseFrag.m65199W4(1, arrayList);
    }

    /* JADX INFO: renamed from: I */
    public void m66388I(final PhotoAlbumBaseFrag photoAlbumBaseFrag, FeedSeeMoreFollowingMomentInfo feedSeeMoreFollowingMomentInfo) {
        this.f43339g = feedSeeMoreFollowingMomentInfo;
        bnl0.m105524M(this.f43336d, true);
        LinearLayout linearLayout = this.f43336d;
        int i = qa00.f156323j;
        linearLayout.setPadding(i, 0, qa00.f156322i, 0);
        int i2 = this.f43339g.action;
        if (i2 == 1) {
            this.f43337e.setText("更多关注人的新动态");
            this.f43338f.setImageResource(lbc0.f130925Q4);
            bnl0.m105524M(this.f43338f, true);
        } else if (i2 == 2) {
            this.f43337e.setText("查看更多关注人的动态");
            this.f43338f.setImageResource(lbc0.f130932R4);
            bnl0.m105524M(this.f43338f, true);
            if (!this.f43340h) {
                this.f43340h = true;
                m66390z();
            }
        } else {
            LinearLayout linearLayout2 = this.f43336d;
            if (i2 == 3) {
                linearLayout2.setPadding(i, 0, i, 0);
                this.f43337e.setText("关注的新动态都看完了，向下查看更多");
                bnl0.m105524M(this.f43338f, false);
            } else {
                bnl0.m105524M(linearLayout2, false);
            }
        }
        bnl0.m105509E0(this.f43336d, new View.OnClickListener() { // from class: l.zyh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f206591a.m66387H(photoAlbumBaseFrag, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66389q(this);
    }

    /* JADX INFO: renamed from: q */
    public final void m66389q(View view) {
        azh.m101071a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public void m66390z() {
        if (m66386B()) {
            return;
        }
        i4g0.m138492A("e_follow_more", "p_discover_dating", new pf60("more_type", getTrackingMoreType()));
    }

    public FeedSeeMoreFollowingMomentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedSeeMoreFollowingMomentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
