package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.data.FeedSeeMoreFollowingMomentInfo;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import l.j760;
import l.osi0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p007l.f3c0;
import p007l.lxh;
import p007l.n7c;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedSeeMoreFollowingMomentView extends VRelative {

    /* JADX INFO: renamed from: d */
    public LinearLayout f3949d;

    /* JADX INFO: renamed from: e */
    public VText f3950e;

    /* JADX INFO: renamed from: f */
    public ImageView f3951f;

    /* JADX INFO: renamed from: g */
    public FeedSeeMoreFollowingMomentInfo f3952g;

    /* JADX INFO: renamed from: h */
    public boolean f3953h;

    public FeedSeeMoreFollowingMomentView(Context context) {
        super(context);
    }

    private String getTrackingMoreType() {
        FeedSeeMoreFollowingMomentInfo feedSeeMoreFollowingMomentInfo = this.f3952g;
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
    public final boolean m6304B() {
        FeedSeeMoreFollowingMomentInfo feedSeeMoreFollowingMomentInfo = this.f3952g;
        return feedSeeMoreFollowingMomentInfo == null || feedSeeMoreFollowingMomentInfo.action == 3;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m6305H(PhotoAlbumBaseFrag photoAlbumBaseFrag, View view) {
        if (m6304B()) {
            return;
        }
        zvf0.u("e_follow_more", "p_discover_dating", new j760[]{new j760("more_type", getTrackingMoreType())});
        FeedSeeMoreFollowingMomentInfo feedSeeMoreFollowingMomentInfo = this.f3952g;
        int i = feedSeeMoreFollowingMomentInfo.action;
        if (i != 1) {
            if (i == 2) {
                n7c.m12098e().m12101c(feedSeeMoreFollowingMomentInfo.followingMoments.size() > 3 ? ((DbObject) this.f3952g.followingMoments.get(2)).id : "");
                return;
            } else {
                osi0.b("数据异常");
                return;
            }
        }
        if (photoAlbumBaseFrag == null) {
            osi0.b("frag数据异常");
            return;
        }
        ArrayList arrayList = new ArrayList();
        FeedSeeMoreFollowingMomentInfo feedSeeMoreFollowingMomentInfo2 = this.f3952g;
        int i2 = feedSeeMoreFollowingMomentInfo2.unReadfollowingFeeds;
        if (i2 <= 3) {
            feedSeeMoreFollowingMomentInfo2.action = 3;
        } else {
            feedSeeMoreFollowingMomentInfo2.action = 2;
        }
        int iMin = Math.min(i2, 3);
        if (!vwb.J(this.f3952g.followingMoments) && this.f3952g.followingMoments.size() >= iMin && iMin > 1) {
            arrayList.addAll(this.f3952g.followingMoments.subList(1, iMin));
        }
        if (vwb.J(arrayList)) {
            return;
        }
        photoAlbumBaseFrag.m5059W4(1, arrayList);
    }

    /* JADX INFO: renamed from: I */
    public void m6306I(final PhotoAlbumBaseFrag photoAlbumBaseFrag, FeedSeeMoreFollowingMomentInfo feedSeeMoreFollowingMomentInfo) {
        this.f3952g = feedSeeMoreFollowingMomentInfo;
        xdl0.M(this.f3949d, true);
        LinearLayout linearLayout = this.f3949d;
        int i = t100.j;
        linearLayout.setPadding(i, 0, t100.i, 0);
        int i2 = this.f3952g.action;
        if (i2 == 1) {
            this.f3950e.setText("更多关注人的新动态");
            this.f3951f.setImageResource(f3c0.f7690Q4);
            xdl0.M(this.f3951f, true);
        } else if (i2 == 2) {
            this.f3950e.setText("查看更多关注人的动态");
            this.f3951f.setImageResource(f3c0.f7697R4);
            xdl0.M(this.f3951f, true);
            if (!this.f3953h) {
                this.f3953h = true;
                m6308z();
            }
        } else {
            LinearLayout linearLayout2 = this.f3949d;
            if (i2 == 3) {
                linearLayout2.setPadding(i, 0, i, 0);
                this.f3950e.setText("关注的新动态都看完了，向下查看更多");
                xdl0.M(this.f3951f, false);
            } else {
                xdl0.M(linearLayout2, false);
            }
        }
        xdl0.E0(this.f3949d, new View.OnClickListener() { // from class: l.kxh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9815a.m6305H(photoAlbumBaseFrag, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6307q(this);
    }

    /* JADX INFO: renamed from: q */
    public final void m6307q(View view) {
        lxh.m11713a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public void m6308z() {
        if (m6304B()) {
            return;
        }
        zvf0.A("e_follow_more", "p_discover_dating", new j760[]{new j760("more_type", getTrackingMoreType())});
    }

    public FeedSeeMoreFollowingMomentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedSeeMoreFollowingMomentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
