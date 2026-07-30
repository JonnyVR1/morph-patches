package com.p046p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.d30;
import p149l.d570;
import p149l.f3c0;
import p149l.j760;
import p149l.lsi0;
import p149l.mqi0;
import p149l.nkg;
import p149l.p6j0;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.x7h;
import p149l.xdl0;
import p149l.xh0;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoAlbumFansView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public PhotoAlbumFansView f41221a;

    /* JADX INFO: renamed from: b */
    public VButton f41222b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f41223c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f41224d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f41225e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f41226f;

    /* JADX INFO: renamed from: g */
    public VText f41227g;

    /* JADX INFO: renamed from: h */
    public VImage f41228h;

    /* JADX INFO: renamed from: i */
    public VText f41229i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f41230j;

    /* JADX INFO: renamed from: k */
    public View f41231k;

    /* JADX INFO: renamed from: l */
    public VImage f41232l;

    /* JADX INFO: renamed from: m */
    public User f41233m;

    /* JADX INFO: renamed from: n */
    public boolean f41234n;

    /* JADX INFO: renamed from: o */
    public xh0 f41235o;

    public PhotoAlbumFansView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m63637g(View view) {
        d570.m110020a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public Act m63638h() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m63639i() {
        if (NullChecker.m81303a(this.f41235o) && this.f41235o.m208718d()) {
            this.f41235o.m208717c();
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m63640j(View view) {
        if (NullChecker.m81303a(this.f41233m) && NullChecker.m81303a(this.f41233m.localFollowship)) {
            FollowshipStatus followshipStatus = this.f41233m.localFollowship.state;
            if (TEnum.equals(followshipStatus, FollowshipStatus.followed) || TEnum.equals(followshipStatus, "default") || TEnum.equals(followshipStatus, FollowshipStatus.unfollow)) {
                if (this.f41233m.profile.moments.hidePublicMoments) {
                    lsi0.m151593w(R$string.f39129q);
                    return;
                } else {
                    FeedModule.f38855d.m209502m7(FeedModule.m60221F().userId(), this.f41233m, true, this.f41234n ? "p_fans" : "p_follow_list");
                    return;
                }
            }
            if (TEnum.equals(followshipStatus, "matched") || TEnum.equals(followshipStatus, FollowshipStatus.following)) {
                m63646p();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m63641k(View view) {
        if (NullChecker.m81303a(this.f41233m)) {
            m63638h().startActivity(PhotoAlbumFeedAct.m64355V1(m63638h(), this.f41233m.f56011id, "fan_list", -1, 2));
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m63642l(View view) {
        this.f41235o.m208717c();
        FeedModule.f38855d.m209502m7(FeedModule.m60221F().userId(), this.f41233m, false, this.f41234n ? "p_fans" : "p_follow_list");
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m63643m(View view) {
        this.f41235o.m208717c();
    }

    /* JADX INFO: renamed from: n */
    public void m63644n(User user, boolean z, String str) {
        this.f41234n = z;
        this.f41233m = user.mo223809clone();
        qib0.f154691G.m102341Q0(this.f41225e, x7h.m207300a(user));
        this.f41230j.setVisibility(8);
        List<Double> list = user.profile.extensions.headFrame.expiredTime;
        if (!vwb.m200296J(list) && list.get(0).doubleValue() > mqi0.m155944o() && !vwb.m200296J(user.profile.extensions.headFrame.url)) {
            this.f41230j.setVisibility(0);
            qib0.f154691G.m102331L0(this.f41230j, user.profile.extensions.headFrame.url.get(0));
        }
        this.f41227g.setText(user.name);
        qib0.f154713b0.f139231b.showUserVerificationLogo(m63638h(), user, this.f41228h);
        if (NullChecker.m81304b(user) && NullChecker.m81303a(user.localFollowship)) {
            VText vText = this.f41229i;
            if (z) {
                vText.setText(mqi0.m155932G(user.localFollowship.otherUserTime));
            } else {
                vText.setText(mqi0.m155932G(user.localFollowship.userTime));
            }
            this.f41222b.setVisibility(nkg.m159854K() ? 8 : 0);
            this.f41232l.setVisibility(8);
            Followship followship = user.localFollowship;
            if (NullChecker.m81304b(followship) && !nkg.m159854K()) {
                if (TextUtils.equals(str, FollowshipStatus.following) && TEnum.equals(followship.state, "default")) {
                    this.f41222b.setBackgroundResource(f3c0.f94311D6);
                    this.f41222b.setTextColor(Color.parseColor("#ffffff"));
                    this.f41222b.setSelected(false);
                    this.f41222b.setText(R$string.f38960Q2);
                } else if (TEnum.equals(followship.state, FollowshipStatus.followed) || TEnum.equals(followship.state, FollowshipStatus.following)) {
                    this.f41222b.setBackgroundResource(f3c0.f94311D6);
                    boolean zEquals = TEnum.equals(followship.state, FollowshipStatus.followed);
                    VButton vButton = this.f41222b;
                    if (zEquals) {
                        vButton.setTextColor(Color.parseColor("#ffffff"));
                        this.f41222b.setSelected(false);
                        this.f41222b.setText(R$string.f38960Q2);
                    } else {
                        vButton.setTextColor(Color.parseColor("#bfbfbf"));
                        this.f41222b.setSelected(true);
                        this.f41222b.setText(R$string.f38954P2);
                    }
                    p6j0.m167671e(MatchScData.ModuleId.mid_e_follow, this.f41234n ? "p_fans" : "p_follow_list", j760.m140076a("owner_id", this.f41233m.f56011id), j760.m140076a("receiver_user_id", this.f41233m.f56011id));
                } else if (TEnum.equals(followship.state, "matched")) {
                    this.f41222b.setTextColor(Color.parseColor("#61000000"));
                    this.f41222b.setBackgroundDrawable(m63638h().getResources().getDrawable(f3c0.f94303C6));
                    this.f41222b.setText(R$string.f38948O2);
                }
            }
        }
        post(new Runnable() { // from class: l.a570
            @Override // java.lang.Runnable
            public final void run() {
                this.f67636a.m63645o();
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m63645o() {
        if (this.f41227g.getWidth() > 0) {
            this.f41227g.setMaxWidth((((((((xdl0.m208412y0() - t100.m186890d(16.0f)) - this.f41224d.getWidth()) - t100.m186890d(10.0f)) - t100.m186890d(18.0f)) - t100.m186890d(10.0f)) - this.f41222b.getWidth()) - t100.m186890d(16.0f)) - t100.m186890d(1.0f));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m63637g(this);
        m63638h().creates(null, new d30() { // from class: l.v470
            @Override // p149l.d30
            public final void call() {
                this.f179885a.m63639i();
            }
        });
        xdl0.m208329E0(this.f41222b, new View.OnClickListener() { // from class: l.w470
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184481a.m63640j(view);
            }
        });
        xdl0.m208329E0(this.f41223c, new View.OnClickListener() { // from class: l.x470
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190946a.m63641k(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m63646p() {
        xh0.C21150a c21150a = new xh0.C21150a(m63638h());
        c21150a.m208730i(R$string.f39183z).m208738q(R$string.f39135r).m208736o(new View.OnClickListener() { // from class: l.y470
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195917a.m63642l(view);
            }
        }).m208726e(R$string.f39017a).m208724c(new View.OnClickListener() { // from class: l.z470
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201442a.m63643m(view);
            }
        });
        xh0 xh0VarM208722a = c21150a.m208722a();
        this.f41235o = xh0VarM208722a;
        xh0VarM208722a.m208721g();
    }

    public PhotoAlbumFansView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PhotoAlbumFansView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
