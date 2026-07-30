package com.p051p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.cmg;
import p153l.jd70;
import p153l.jyb;
import p153l.lbc0;
import p153l.m9h;
import p153l.o1j0;
import p153l.pf60;
import p153l.pzi0;
import p153l.qa00;
import p153l.tfj0;
import p153l.th0;
import p153l.uqb0;
import p153l.x20;

/* JADX INFO: loaded from: classes13.dex */
public class PhotoAlbumFansView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public PhotoAlbumFansView f42069a;

    /* JADX INFO: renamed from: b */
    public VButton f42070b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f42071c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f42072d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f42073e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f42074f;

    /* JADX INFO: renamed from: g */
    public VText f42075g;

    /* JADX INFO: renamed from: h */
    public VImage f42076h;

    /* JADX INFO: renamed from: i */
    public VText f42077i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f42078j;

    /* JADX INFO: renamed from: k */
    public View f42079k;

    /* JADX INFO: renamed from: l */
    public VImage f42080l;

    /* JADX INFO: renamed from: m */
    public User f42081m;

    /* JADX INFO: renamed from: n */
    public boolean f42082n;

    /* JADX INFO: renamed from: o */
    public th0 f42083o;

    public PhotoAlbumFansView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m64820g(View view) {
        jd70.m144404a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public Act m64821h() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m64822i() {
        if (NullChecker.m82486a(this.f42083o) && this.f42083o.m191138d()) {
            this.f42083o.m191137c();
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m64823j(View view) {
        if (NullChecker.m82486a(this.f42081m) && NullChecker.m82486a(this.f42081m.localFollowship)) {
            FollowshipStatus followshipStatus = this.f42081m.localFollowship.state;
            if (TEnum.equals(followshipStatus, FollowshipStatus.followed) || TEnum.equals(followshipStatus, "default") || TEnum.equals(followshipStatus, FollowshipStatus.unfollow)) {
                if (this.f42081m.profile.moments.hidePublicMoments) {
                    o1j0.m165649w(R$string.f39977q);
                    return;
                } else {
                    FeedModule.f39703d.m145743m7(FeedModule.m61405F().userId(), this.f42081m, true, this.f42082n ? "p_fans" : "p_follow_list");
                    return;
                }
            }
            if (TEnum.equals(followshipStatus, "matched") || TEnum.equals(followshipStatus, FollowshipStatus.following)) {
                m64829p();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m64824k(View view) {
        if (NullChecker.m82486a(this.f42081m)) {
            m64821h().startActivity(PhotoAlbumFeedAct.m65538X1(m64821h(), this.f42081m.f56859id, "fan_list", -1, 2));
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m64825l(View view) {
        this.f42083o.m191137c();
        FeedModule.f39703d.m145743m7(FeedModule.m61405F().userId(), this.f42081m, false, this.f42082n ? "p_fans" : "p_follow_list");
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m64826m(View view) {
        this.f42083o.m191137c();
    }

    /* JADX INFO: renamed from: n */
    public void m64827n(User user, boolean z, String str) {
        this.f42082n = z;
        this.f42081m = user.mo225055clone();
        uqb0.f180374G.m127125Q0(this.f42073e, m9h.m157566a(user));
        this.f42078j.setVisibility(8);
        List<Double> list = user.profile.extensions.headFrame.expiredTime;
        if (!jyb.m147479J(list) && list.get(0).doubleValue() > pzi0.m174454o() && !jyb.m147479J(user.profile.extensions.headFrame.url)) {
            this.f42078j.setVisibility(0);
            uqb0.f180374G.m127115L0(this.f42078j, user.profile.extensions.headFrame.url.get(0));
        }
        this.f42075g.setText(user.name);
        uqb0.f180396b0.f170325b.showUserVerificationLogo(m64821h(), user, this.f42076h);
        if (NullChecker.m82487b(user) && NullChecker.m82486a(user.localFollowship)) {
            VText vText = this.f42077i;
            if (z) {
                vText.setText(pzi0.m174442G(user.localFollowship.otherUserTime));
            } else {
                vText.setText(pzi0.m174442G(user.localFollowship.userTime));
            }
            this.f42070b.setVisibility(cmg.m111183K() ? 8 : 0);
            this.f42080l.setVisibility(8);
            Followship followship = user.localFollowship;
            if (NullChecker.m82487b(followship) && !cmg.m111183K()) {
                if (TextUtils.equals(str, FollowshipStatus.following) && TEnum.equals(followship.state, "default")) {
                    this.f42070b.setBackgroundResource(lbc0.f130829D6);
                    this.f42070b.setTextColor(Color.parseColor("#ffffff"));
                    this.f42070b.setSelected(false);
                    this.f42070b.setText(R$string.f39808Q2);
                } else if (TEnum.equals(followship.state, FollowshipStatus.followed) || TEnum.equals(followship.state, FollowshipStatus.following)) {
                    this.f42070b.setBackgroundResource(lbc0.f130829D6);
                    boolean zEquals = TEnum.equals(followship.state, FollowshipStatus.followed);
                    VButton vButton = this.f42070b;
                    if (zEquals) {
                        vButton.setTextColor(Color.parseColor("#ffffff"));
                        this.f42070b.setSelected(false);
                        this.f42070b.setText(R$string.f39808Q2);
                    } else {
                        vButton.setTextColor(Color.parseColor("#bfbfbf"));
                        this.f42070b.setSelected(true);
                        this.f42070b.setText(R$string.f39802P2);
                    }
                    tfj0.m190942e(MatchScData.ModuleId.mid_e_follow, this.f42082n ? "p_fans" : "p_follow_list", pf60.m172085a("owner_id", this.f42081m.f56859id), pf60.m172085a("receiver_user_id", this.f42081m.f56859id));
                } else if (TEnum.equals(followship.state, "matched")) {
                    this.f42070b.setTextColor(Color.parseColor("#61000000"));
                    this.f42070b.setBackgroundDrawable(m64821h().getResources().getDrawable(lbc0.f130821C6));
                    this.f42070b.setText(R$string.f39796O2);
                }
            }
        }
        post(new Runnable() { // from class: l.gd70
            @Override // java.lang.Runnable
            public final void run() {
                this.f103635a.m64828o();
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m64828o() {
        if (this.f42075g.getWidth() > 0) {
            this.f42075g.setMaxWidth((((((((bnl0.m105592y0() - qa00.m175859d(16.0f)) - this.f42072d.getWidth()) - qa00.m175859d(10.0f)) - qa00.m175859d(18.0f)) - qa00.m175859d(10.0f)) - this.f42070b.getWidth()) - qa00.m175859d(16.0f)) - qa00.m175859d(1.0f));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64820g(this);
        m64821h().creates(null, new x20() { // from class: l.bd70
            @Override // p153l.x20
            public final void call() {
                this.f76229a.m64822i();
            }
        });
        bnl0.m105509E0(this.f42070b, new View.OnClickListener() { // from class: l.cd70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81110a.m64823j(view);
            }
        });
        bnl0.m105509E0(this.f42071c, new View.OnClickListener() { // from class: l.dd70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87862a.m64824k(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m64829p() {
        th0.C20312a c20312a = new th0.C20312a(m64821h());
        c20312a.m191150i(R$string.f40031z).m191158q(R$string.f39983r).m191156o(new View.OnClickListener() { // from class: l.ed70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93147a.m64825l(view);
            }
        }).m191146e(R$string.f39865a).m191144c(new View.OnClickListener() { // from class: l.fd70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98323a.m64826m(view);
            }
        });
        th0 th0VarM191142a = c20312a.m191142a();
        this.f42083o = th0VarM191142a;
        th0VarM191142a.m191141g();
    }

    public PhotoAlbumFansView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PhotoAlbumFansView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
