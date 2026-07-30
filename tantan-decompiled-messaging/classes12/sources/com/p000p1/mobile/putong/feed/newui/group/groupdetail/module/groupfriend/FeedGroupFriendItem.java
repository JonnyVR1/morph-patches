package com.p000p1.mobile.putong.feed.newui.group.groupdetail.module.groupfriend;

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
import com.p000p1.mobile.putong.data.Followship;
import com.p000p1.mobile.putong.data.FollowshipStatus;
import com.p000p1.mobile.putong.data.MatchScData;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.module.groupfriend.FeedGroupFriendItem;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedLinearWithExtraIconsView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.i0g0;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.qib0;
import l.xdl0;
import l.xh0;
import p007l.e1c0;
import p007l.f3c0;
import p007l.nkg;
import p007l.p5h;
import p007l.p6j0;
import p007l.vqg;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedGroupFriendItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f1552a;

    /* JADX INFO: renamed from: b */
    public View f1553b;

    /* JADX INFO: renamed from: c */
    public FeedLinearWithExtraIconsView f1554c;

    /* JADX INFO: renamed from: d */
    public TextView f1555d;

    /* JADX INFO: renamed from: e */
    public TextView f1556e;

    /* JADX INFO: renamed from: f */
    public TextView f1557f;

    /* JADX INFO: renamed from: g */
    public String f1558g;

    /* JADX INFO: renamed from: h */
    public xh0 f1559h;

    public FeedGroupFriendItem(@NonNull Context context) {
        super(context);
        m2985j(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2977b(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m2979d(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m2982g(Followship followship) {
    }

    /* JADX INFO: renamed from: h */
    public View m2983h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return p5h.m12910b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i */
    public Act m2984i() {
        return getContext();
    }

    /* JADX INFO: renamed from: j */
    public final void m2985j(Context context) {
        addView(m2983h(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: k */
    public void m2986k(final User user) {
        xdl0.E0(this.f1557f, new View.OnClickListener() { // from class: l.i5h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8906a.m2987l(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m2987l(User user, View view) {
        if (NullChecker.b(user)) {
            Followship followship = user.localFollowship;
            if (followship == null || TEnum.equals(followship.state, "default") || TEnum.equals(user.localFollowship.state, FollowshipStatus.followed) || TEnum.equals(user.localFollowship.state, FollowshipStatus.unfollow) || TEnum.equals(user.localFollowship.state, "unknown_")) {
                if (user.profile.moments.hidePublicMoments) {
                    lsi0.w(R$string.f590q);
                    return;
                } else {
                    p6j0.m12913c(MatchScData.ModuleId.mid_e_follow, this.f1558g, j760.a("owner_id", ((DbObject) user).id), j760.a("receiver_user_id", ((DbObject) user).id));
                    FeedModule.f316d.m16634f7(FeedModule.m1139F().userId(), user, true).subscribe(mkd0.H(new e30() { // from class: l.j5h
                        public final void call(Object obj) {
                            FeedGroupFriendItem.m2982g((Followship) obj);
                        }
                    }, new e30() { // from class: l.k5h
                        public final void call(Object obj) {
                            FeedGroupFriendItem.m2979d((Throwable) obj);
                        }
                    }));
                    return;
                }
            }
            if (NullChecker.a(user.localFollowship)) {
                if (TEnum.equals(user.localFollowship.state, FollowshipStatus.following) || TEnum.equals(user.localFollowship.state, "matched")) {
                    p6j0.m12913c("e_cancelfollow", this.f1558g, j760.a("owner_id", ((DbObject) user).id), j760.a("receiver_user_id", ((DbObject) user).id));
                    m2997v(getResources().getString(R$string.f644z), user);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m2988m(User user, Followship followship) {
        m2992q(user);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m2989n(final User user, View view) {
        this.f1559h.c();
        m2984i().duringCreated(FeedModule.f316d.m16634f7(FeedModule.m1139F().userId(), user, false)).subscribe(mkd0.H(new e30() { // from class: l.n5h
            public final void call(Object obj) {
                this.f10672a.m2988m(user, (Followship) obj);
            }
        }, new e30() { // from class: l.o5h
            public final void call(Object obj) {
                FeedGroupFriendItem.m2977b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m2990o(View view) {
        this.f1559h.c();
    }

    /* JADX INFO: renamed from: p */
    public void m2991p(User user) {
        if (user == null) {
            return;
        }
        m2996u(user);
        m2995t(user);
        m2994s(user);
        m2992q(user);
        m2993r(user);
        m2986k(user);
        if (nkg.m12217O()) {
            xdl0.M(this.f1557f, vqg.m15496T("from_group_friend"));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m2992q(User user) {
        if (NullChecker.a(user.localFollowship) && TEnum.equals(user.localFollowship.state, FollowshipStatus.following)) {
            this.f1557f.setBackgroundResource(f3c0.f7864n4);
            this.f1557f.setTextColor(Color.parseColor("#bfbfbf"));
            this.f1557f.setText(R$string.f415P2);
            this.f1557f.setSelected(true);
            return;
        }
        if (!NullChecker.a(user.localFollowship) || !TEnum.equals(user.localFollowship.state, "matched")) {
            this.f1557f.setBackgroundResource(f3c0.f7781d1);
            this.f1557f.setTextColor(Color.parseColor("#ffffff"));
            this.f1557f.setText(R$string.f427R2);
        } else {
            this.f1557f.setBackgroundResource(f3c0.f7864n4);
            this.f1557f.setText(R$string.f409O2);
            this.f1557f.setTextColor(Color.parseColor("#bfbfbf"));
            this.f1557f.setSelected(true);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m2993r(User user) {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = user.location.distance;
        if (i != 0 && i < 30000) {
            sb.append(i0g0.p(i, true));
            sb.append(", ");
        }
        if (FeedModule.m1140H().hideAge(user)) {
            str = "";
        } else {
            str = user.age + FeedModule.f313a.getString(R$string.f435S4) + ",  ";
        }
        this.f1556e.setText(String.format("%s%s%s", sb, str, i0g0.j0(user.profile.zodiac)));
    }

    /* JADX INFO: renamed from: s */
    public void m2994s(User user) {
        qib0.G.Q0(this.f1552a, user.m1042fp().profileSmall());
        this.f1555d.setText(user.name);
    }

    public void setPageId(String str) {
        this.f1558g = str;
    }

    /* JADX INFO: renamed from: t */
    public final void m2995t(User user) {
        double dO = mqi0.o() - user.location.updatedTime;
        View view = this.f1553b;
        if (dO <= 300000.0d) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m2996u(User user) {
        User userMe_ = FeedModule.m1140H().me_();
        this.f1554c.m6234h();
        if (TextUtils.equals(((DbObject) userMe_).id, ((DbObject) user).id) || !TextUtils.equals(userMe_.location.region.city, user.location.region.city)) {
            return;
        }
        this.f1554c.m6237k();
    }

    /* JADX INFO: renamed from: v */
    public void m2997v(String str, final User user) {
        xh0.a aVar = new xh0.a(getContext());
        aVar.j(str).q(R$string.f596r).p(e1c0.f7154n).o(new View.OnClickListener() { // from class: l.l5h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9889a.m2989n(user, view);
            }
        }).e(R$string.f478a).c(new View.OnClickListener() { // from class: l.m5h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10237a.m2990o(view);
            }
        });
        xh0 xh0VarA = aVar.a();
        this.f1559h = xh0VarA;
        xh0VarA.g();
    }

    public FeedGroupFriendItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m2985j(context);
    }

    public FeedGroupFriendItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2985j(context);
    }
}
