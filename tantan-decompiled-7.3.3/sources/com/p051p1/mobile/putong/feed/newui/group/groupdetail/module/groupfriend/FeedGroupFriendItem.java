package com.p051p1.mobile.putong.feed.newui.group.groupdetail.module.groupfriend;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.module.groupfriend.FeedGroupFriendItem;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedLinearWithExtraIconsView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.cmg;
import p153l.e7h;
import p153l.k9c0;
import p153l.ksg;
import p153l.lbc0;
import p153l.o1j0;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.q8g0;
import p153l.tfj0;
import p153l.th0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedGroupFriendItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f40939a;

    /* JADX INFO: renamed from: b */
    public View f40940b;

    /* JADX INFO: renamed from: c */
    public FeedLinearWithExtraIconsView f40941c;

    /* JADX INFO: renamed from: d */
    public TextView f40942d;

    /* JADX INFO: renamed from: e */
    public TextView f40943e;

    /* JADX INFO: renamed from: f */
    public TextView f40944f;

    /* JADX INFO: renamed from: g */
    public String f40945g;

    /* JADX INFO: renamed from: h */
    public th0 f40946h;

    public FeedGroupFriendItem(@NonNull Context context) {
        super(context);
        m63193j(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m63185b(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m63187d(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m63190g(Followship followship) {
    }

    /* JADX INFO: renamed from: h */
    public View m63191h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e7h.m119709b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i */
    public Act m63192i() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: j */
    public final void m63193j(Context context) {
        addView(m63191h(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: k */
    public void m63194k(final User user) {
        bnl0.m105509E0(this.f40944f, new View.OnClickListener() { // from class: l.x6h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192585a.m63195l(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m63195l(User user, View view) {
        if (NullChecker.m82487b(user)) {
            Followship followship = user.localFollowship;
            if (followship == null || TEnum.equals(followship.state, "default") || TEnum.equals(user.localFollowship.state, FollowshipStatus.followed) || TEnum.equals(user.localFollowship.state, FollowshipStatus.unfollow) || TEnum.equals(user.localFollowship.state, "unknown_")) {
                if (user.profile.moments.hidePublicMoments) {
                    o1j0.m165649w(R$string.f39977q);
                    return;
                } else {
                    tfj0.m190940c(MatchScData.ModuleId.mid_e_follow, this.f40945g, pf60.m172085a("owner_id", user.f56859id), pf60.m172085a("receiver_user_id", user.f56859id));
                    FeedModule.f39703d.m145694f7(FeedModule.m61405F().userId(), user, true).subscribe(psd0.m173597H(new y20() { // from class: l.y6h
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            FeedGroupFriendItem.m63190g((Followship) obj);
                        }
                    }, new y20() { // from class: l.z6h
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            FeedGroupFriendItem.m63187d((Throwable) obj);
                        }
                    }));
                    return;
                }
            }
            if (NullChecker.m82486a(user.localFollowship)) {
                if (TEnum.equals(user.localFollowship.state, FollowshipStatus.following) || TEnum.equals(user.localFollowship.state, "matched")) {
                    tfj0.m190940c("e_cancelfollow", this.f40945g, pf60.m172085a("owner_id", user.f56859id), pf60.m172085a("receiver_user_id", user.f56859id));
                    m63205v(getResources().getString(R$string.f40031z), user);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m63196m(User user, Followship followship) {
        m63200q(user);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m63197n(final User user, View view) {
        this.f40946h.m191137c();
        m63192i().duringCreated(FeedModule.f39703d.m145694f7(FeedModule.m61405F().userId(), user, false)).subscribe(psd0.m173597H(new y20() { // from class: l.c7h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80114a.m63196m(user, (Followship) obj);
            }
        }, new y20() { // from class: l.d7h
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedGroupFriendItem.m63185b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m63198o(View view) {
        this.f40946h.m191137c();
    }

    /* JADX INFO: renamed from: p */
    public void m63199p(User user) {
        if (user == null) {
            return;
        }
        m63204u(user);
        m63203t(user);
        m63202s(user);
        m63200q(user);
        m63201r(user);
        m63194k(user);
        if (cmg.m111187O()) {
            bnl0.m105524M(this.f40944f, ksg.m151185T("from_group_friend"));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m63200q(User user) {
        if (NullChecker.m82486a(user.localFollowship) && TEnum.equals(user.localFollowship.state, FollowshipStatus.following)) {
            this.f40944f.setBackgroundResource(lbc0.f131099n4);
            this.f40944f.setTextColor(Color.parseColor("#bfbfbf"));
            this.f40944f.setText(R$string.f39802P2);
            this.f40944f.setSelected(true);
            return;
        }
        if (!NullChecker.m82486a(user.localFollowship) || !TEnum.equals(user.localFollowship.state, "matched")) {
            this.f40944f.setBackgroundResource(lbc0.f131016d1);
            this.f40944f.setTextColor(Color.parseColor("#ffffff"));
            this.f40944f.setText(R$string.f39814R2);
        } else {
            this.f40944f.setBackgroundResource(lbc0.f131099n4);
            this.f40944f.setText(R$string.f39796O2);
            this.f40944f.setTextColor(Color.parseColor("#bfbfbf"));
            this.f40944f.setSelected(true);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m63201r(User user) {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = user.location.distance;
        if (i != 0 && i < 30000) {
            sb.append(q8g0.m175811p(i, true));
            sb.append(", ");
        }
        if (FeedModule.m61406H().hideAge(user)) {
            str = "";
        } else {
            str = user.age + FeedModule.f39700a.getString(R$string.f39822S4) + ",  ";
        }
        this.f40943e.setText(String.format("%s%s%s", sb, str, q8g0.m175804j0(user.profile.zodiac)));
    }

    /* JADX INFO: renamed from: s */
    public void m63202s(User user) {
        uqb0.f180374G.m127125Q0(this.f40939a, user.m61308fp().profileSmall());
        this.f40942d.setText(user.name);
    }

    public void setPageId(String str) {
        this.f40945g = str;
    }

    /* JADX INFO: renamed from: t */
    public final void m63203t(User user) {
        double dM174454o = pzi0.m174454o() - user.location.updatedTime;
        View view = this.f40940b;
        if (dM174454o <= 300000.0d) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m63204u(User user) {
        User userMe_ = FeedModule.m61406H().me_();
        this.f40941c.m66316h();
        if (TextUtils.equals(userMe_.f56859id, user.f56859id) || !TextUtils.equals(userMe_.location.region.city, user.location.region.city)) {
            return;
        }
        this.f40941c.m66319k();
    }

    /* JADX INFO: renamed from: v */
    public void m63205v(String str, final User user) {
        th0.C20312a c20312a = new th0.C20312a(getContext());
        c20312a.m191151j(str).m191158q(R$string.f39983r).m191157p(k9c0.f124521n).m191156o(new View.OnClickListener() { // from class: l.a7h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68818a.m63197n(user, view);
            }
        }).m191146e(R$string.f39865a).m191144c(new View.OnClickListener() { // from class: l.b7h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75302a.m63198o(view);
            }
        });
        th0 th0VarM191142a = c20312a.m191142a();
        this.f40946h = th0VarM191142a;
        th0VarM191142a.m191141g();
    }

    public FeedGroupFriendItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m63193j(context);
    }

    public FeedGroupFriendItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m63193j(context);
    }
}
