package com.p000p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.data.Followship;
import com.p000p1.mobile.putong.data.FollowshipStatus;
import com.p000p1.mobile.putong.data.MatchScData;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.d30;
import l.e30;
import l.j760;
import l.lsi0;
import l.mqi0;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.xh0;
import p007l.d570;
import p007l.f3c0;
import p007l.nkg;
import p007l.p6j0;
import p007l.x7h;
import v.VButton;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PhotoAlbumFansView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public PhotoAlbumFansView f2682a;

    /* JADX INFO: renamed from: b */
    public VButton f2683b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f2684c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f2685d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f2686e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f2687f;

    /* JADX INFO: renamed from: g */
    public VText f2688g;

    /* JADX INFO: renamed from: h */
    public VImage f2689h;

    /* JADX INFO: renamed from: i */
    public VText f2690i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f2691j;

    /* JADX INFO: renamed from: k */
    public View f2692k;

    /* JADX INFO: renamed from: l */
    public VImage f2693l;

    /* JADX INFO: renamed from: m */
    public User f2694m;

    /* JADX INFO: renamed from: n */
    public boolean f2695n;

    /* JADX INFO: renamed from: o */
    public xh0 f2696o;

    public PhotoAlbumFansView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m4659g(View view) {
        d570.m9305a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public Act m4660h() {
        return getContext();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m4661i() {
        if (NullChecker.a(this.f2696o) && this.f2696o.d()) {
            this.f2696o.c();
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m4662j(View view) {
        if (NullChecker.a(this.f2694m) && NullChecker.a(this.f2694m.localFollowship)) {
            FollowshipStatus followshipStatus = this.f2694m.localFollowship.state;
            if (TEnum.equals(followshipStatus, FollowshipStatus.followed) || TEnum.equals(followshipStatus, "default") || TEnum.equals(followshipStatus, FollowshipStatus.unfollow)) {
                if (this.f2694m.profile.moments.hidePublicMoments) {
                    lsi0.w(R$string.f590q);
                    return;
                } else {
                    FeedModule.f316d.m16683m7(FeedModule.m1139F().userId(), this.f2694m, true, this.f2695n ? "p_fans" : "p_follow_list");
                    return;
                }
            }
            if (TEnum.equals(followshipStatus, "matched") || TEnum.equals(followshipStatus, FollowshipStatus.following)) {
                m4668p();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m4663k(View view) {
        if (NullChecker.a(this.f2694m)) {
            m4660h().startActivity(PhotoAlbumFeedAct.m5428V1(m4660h(), ((DbObject) this.f2694m).id, "fan_list", -1, 2));
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m4664l(View view) {
        this.f2696o.c();
        FeedModule.f316d.m16683m7(FeedModule.m1139F().userId(), this.f2694m, false, this.f2695n ? "p_fans" : "p_follow_list");
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m4665m(View view) {
        this.f2696o.c();
    }

    /* JADX INFO: renamed from: n */
    public void m4666n(User user, boolean z, String str) {
        this.f2695n = z;
        this.f2694m = user.m19150clone();
        qib0.G.Q0(this.f2686e, x7h.m16033a(user));
        this.f2691j.setVisibility(8);
        List<Double> list = user.profile.extensions.headFrame.expiredTime;
        if (!vwb.J(list) && list.get(0).doubleValue() > mqi0.o() && !vwb.J(user.profile.extensions.headFrame.url)) {
            this.f2691j.setVisibility(0);
            qib0.G.L0(this.f2691j, user.profile.extensions.headFrame.url.get(0));
        }
        this.f2688g.setText(user.name);
        qib0.b0.b.showUserVerificationLogo(m4660h(), user, this.f2689h);
        if (NullChecker.b(user) && NullChecker.a(user.localFollowship)) {
            VText vText = this.f2690i;
            if (z) {
                vText.setText(mqi0.G(user.localFollowship.otherUserTime));
            } else {
                vText.setText(mqi0.G(user.localFollowship.userTime));
            }
            this.f2683b.setVisibility(nkg.m12213K() ? 8 : 0);
            this.f2693l.setVisibility(8);
            Followship followship = user.localFollowship;
            if (NullChecker.b(followship) && !nkg.m12213K()) {
                if (TextUtils.equals(str, FollowshipStatus.following) && TEnum.equals(followship.state, "default")) {
                    this.f2683b.setBackgroundResource(f3c0.f7594D6);
                    this.f2683b.setTextColor(Color.parseColor("#ffffff"));
                    this.f2683b.setSelected(false);
                    this.f2683b.setText(R$string.f421Q2);
                } else if (TEnum.equals(followship.state, FollowshipStatus.followed) || TEnum.equals(followship.state, FollowshipStatus.following)) {
                    this.f2683b.setBackgroundResource(f3c0.f7594D6);
                    boolean zEquals = TEnum.equals(followship.state, FollowshipStatus.followed);
                    VButton vButton = this.f2683b;
                    if (zEquals) {
                        vButton.setTextColor(Color.parseColor("#ffffff"));
                        this.f2683b.setSelected(false);
                        this.f2683b.setText(R$string.f421Q2);
                    } else {
                        vButton.setTextColor(Color.parseColor("#bfbfbf"));
                        this.f2683b.setSelected(true);
                        this.f2683b.setText(R$string.f415P2);
                    }
                    p6j0.m12915e(MatchScData.ModuleId.mid_e_follow, this.f2695n ? "p_fans" : "p_follow_list", j760.a("owner_id", ((DbObject) this.f2694m).id), j760.a("receiver_user_id", ((DbObject) this.f2694m).id));
                } else if (TEnum.equals(followship.state, "matched")) {
                    this.f2683b.setTextColor(Color.parseColor("#61000000"));
                    this.f2683b.setBackgroundDrawable(m4660h().getResources().getDrawable(f3c0.f7586C6));
                    this.f2683b.setText(R$string.f409O2);
                }
            }
        }
        post(new Runnable() { // from class: l.a570
            @Override // java.lang.Runnable
            public final void run() {
                this.f5586a.m4667o();
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m4667o() {
        if (this.f2688g.getWidth() > 0) {
            this.f2688g.setMaxWidth((((((((xdl0.y0() - t100.d(16.0f)) - this.f2685d.getWidth()) - t100.d(10.0f)) - t100.d(18.0f)) - t100.d(10.0f)) - this.f2683b.getWidth()) - t100.d(16.0f)) - t100.d(1.0f));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4659g(this);
        m4660h().creates((e30) null, new d30() { // from class: l.v470
            public final void call() {
                this.f14062a.m4661i();
            }
        });
        xdl0.E0(this.f2683b, new View.OnClickListener() { // from class: l.w470
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14400a.m4662j(view);
            }
        });
        xdl0.E0(this.f2684c, new View.OnClickListener() { // from class: l.x470
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14765a.m4663k(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m4668p() {
        xh0.a aVar = new xh0.a(m4660h());
        aVar.i(R$string.f644z).q(R$string.f596r).o(new View.OnClickListener() { // from class: l.y470
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15252a.m4664l(view);
            }
        }).e(R$string.f478a).c(new View.OnClickListener() { // from class: l.z470
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15582a.m4665m(view);
            }
        });
        xh0 xh0VarA = aVar.a();
        this.f2696o = xh0VarA;
        xh0VarA.g();
    }

    public PhotoAlbumFansView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PhotoAlbumFansView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
