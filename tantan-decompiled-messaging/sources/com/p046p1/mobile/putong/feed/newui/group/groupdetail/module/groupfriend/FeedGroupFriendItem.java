package com.p046p1.mobile.putong.feed.newui.group.groupdetail.module.groupfriend;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.module.groupfriend.FeedGroupFriendItem;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedLinearWithExtraIconsView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p149l.e1c0;
import p149l.e30;
import p149l.f3c0;
import p149l.i0g0;
import p149l.j760;
import p149l.lsi0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.nkg;
import p149l.p5h;
import p149l.p6j0;
import p149l.qib0;
import p149l.vqg;
import p149l.xdl0;
import p149l.xh0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedGroupFriendItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f40091a;

    /* JADX INFO: renamed from: b */
    public View f40092b;

    /* JADX INFO: renamed from: c */
    public FeedLinearWithExtraIconsView f40093c;

    /* JADX INFO: renamed from: d */
    public TextView f40094d;

    /* JADX INFO: renamed from: e */
    public TextView f40095e;

    /* JADX INFO: renamed from: f */
    public TextView f40096f;

    /* JADX INFO: renamed from: g */
    public String f40097g;

    /* JADX INFO: renamed from: h */
    public xh0 f40098h;

    public FeedGroupFriendItem(@NonNull Context context) {
        super(context);
        m62010j(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m62002b(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m62004d(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m62007g(Followship followship) {
    }

    /* JADX INFO: renamed from: h */
    public View m62008h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return p5h.m167485b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i */
    public Act m62009i() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: j */
    public final void m62010j(Context context) {
        addView(m62008h(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: k */
    public void m62011k(final User user) {
        xdl0.m208329E0(this.f40096f, new View.OnClickListener() { // from class: l.i5h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111589a.m62012l(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m62012l(User user, View view) {
        if (NullChecker.m81304b(user)) {
            Followship followship = user.localFollowship;
            if (followship == null || TEnum.equals(followship.state, "default") || TEnum.equals(user.localFollowship.state, FollowshipStatus.followed) || TEnum.equals(user.localFollowship.state, FollowshipStatus.unfollow) || TEnum.equals(user.localFollowship.state, "unknown_")) {
                if (user.profile.moments.hidePublicMoments) {
                    lsi0.m151593w(R$string.f39129q);
                    return;
                } else {
                    p6j0.m167669c(MatchScData.ModuleId.mid_e_follow, this.f40097g, j760.m140076a("owner_id", user.f56011id), j760.m140076a("receiver_user_id", user.f56011id));
                    FeedModule.f38855d.m209453f7(FeedModule.m60221F().userId(), user, true).subscribe(mkd0.m154956H(new e30() { // from class: l.j5h
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            FeedGroupFriendItem.m62007g((Followship) obj);
                        }
                    }, new e30() { // from class: l.k5h
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            FeedGroupFriendItem.m62004d((Throwable) obj);
                        }
                    }));
                    return;
                }
            }
            if (NullChecker.m81303a(user.localFollowship)) {
                if (TEnum.equals(user.localFollowship.state, FollowshipStatus.following) || TEnum.equals(user.localFollowship.state, "matched")) {
                    p6j0.m167669c("e_cancelfollow", this.f40097g, j760.m140076a("owner_id", user.f56011id), j760.m140076a("receiver_user_id", user.f56011id));
                    m62022v(getResources().getString(R$string.f39183z), user);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m62013m(User user, Followship followship) {
        m62017q(user);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m62014n(final User user, View view) {
        this.f40098h.m208717c();
        m62009i().duringCreated(FeedModule.f38855d.m209453f7(FeedModule.m60221F().userId(), user, false)).subscribe(mkd0.m154956H(new e30() { // from class: l.n5h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137211a.m62013m(user, (Followship) obj);
            }
        }, new e30() { // from class: l.o5h
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedGroupFriendItem.m62002b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m62015o(View view) {
        this.f40098h.m208717c();
    }

    /* JADX INFO: renamed from: p */
    public void m62016p(User user) {
        if (user == null) {
            return;
        }
        m62021u(user);
        m62020t(user);
        m62019s(user);
        m62017q(user);
        m62018r(user);
        m62011k(user);
        if (nkg.m159858O()) {
            xdl0.m208344M(this.f40096f, vqg.m199526T("from_group_friend"));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m62017q(User user) {
        if (NullChecker.m81303a(user.localFollowship) && TEnum.equals(user.localFollowship.state, FollowshipStatus.following)) {
            this.f40096f.setBackgroundResource(f3c0.f94581n4);
            this.f40096f.setTextColor(Color.parseColor("#bfbfbf"));
            this.f40096f.setText(R$string.f38954P2);
            this.f40096f.setSelected(true);
            return;
        }
        if (!NullChecker.m81303a(user.localFollowship) || !TEnum.equals(user.localFollowship.state, "matched")) {
            this.f40096f.setBackgroundResource(f3c0.f94498d1);
            this.f40096f.setTextColor(Color.parseColor("#ffffff"));
            this.f40096f.setText(R$string.f38966R2);
        } else {
            this.f40096f.setBackgroundResource(f3c0.f94581n4);
            this.f40096f.setText(R$string.f38948O2);
            this.f40096f.setTextColor(Color.parseColor("#bfbfbf"));
            this.f40096f.setSelected(true);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m62018r(User user) {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = user.location.distance;
        if (i != 0 && i < 30000) {
            sb.append(i0g0.m133876p(i, true));
            sb.append(", ");
        }
        if (FeedModule.m60222H().hideAge(user)) {
            str = "";
        } else {
            str = user.age + FeedModule.f38852a.getString(R$string.f38974S4) + ",  ";
        }
        this.f40095e.setText(String.format("%s%s%s", sb, str, i0g0.m133869j0(user.profile.zodiac)));
    }

    /* JADX INFO: renamed from: s */
    public void m62019s(User user) {
        qib0.f154691G.m102341Q0(this.f40091a, user.m60124fp().profileSmall());
        this.f40094d.setText(user.name);
    }

    public void setPageId(String str) {
        this.f40097g = str;
    }

    /* JADX INFO: renamed from: t */
    public final void m62020t(User user) {
        double dM155944o = mqi0.m155944o() - user.location.updatedTime;
        View view = this.f40092b;
        if (dM155944o <= 300000.0d) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m62021u(User user) {
        User userMe_ = FeedModule.m60222H().me_();
        this.f40093c.m65133h();
        if (TextUtils.equals(userMe_.f56011id, user.f56011id) || !TextUtils.equals(userMe_.location.region.city, user.location.region.city)) {
            return;
        }
        this.f40093c.m65136k();
    }

    /* JADX INFO: renamed from: v */
    public void m62022v(String str, final User user) {
        xh0.C21150a c21150a = new xh0.C21150a(getContext());
        c21150a.m208731j(str).m208738q(R$string.f39135r).m208737p(e1c0.f88798n).m208736o(new View.OnClickListener() { // from class: l.l5h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126170a.m62014n(user, view);
            }
        }).m208726e(R$string.f39017a).m208724c(new View.OnClickListener() { // from class: l.m5h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131393a.m62015o(view);
            }
        });
        xh0 xh0VarM208722a = c21150a.m208722a();
        this.f40098h = xh0VarM208722a;
        xh0VarM208722a.m208721g();
    }

    public FeedGroupFriendItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m62010j(context);
    }

    public FeedGroupFriendItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m62010j(context);
    }
}
