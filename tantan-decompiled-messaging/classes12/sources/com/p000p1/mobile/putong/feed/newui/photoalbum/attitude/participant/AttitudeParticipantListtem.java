package com.p000p1.mobile.putong.feed.newui.photoalbum.attitude.participant;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.data.Followship;
import com.p000p1.mobile.putong.data.FollowshipStatus;
import com.p000p1.mobile.putong.data.MatchScData;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.photoalbum.attitude.participant.AttitudeParticipantListtem;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.j760;
import l.mkd0;
import l.qib0;
import l.t100;
import l.xdl0;
import p007l.e1c0;
import p007l.f3c0;
import p007l.m41;
import p007l.p6j0;
import p007l.v1h;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class AttitudeParticipantListtem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f2877a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f2878b;

    /* JADX INFO: renamed from: c */
    public VText f2879c;

    /* JADX INFO: renamed from: d */
    public VText f2880d;

    public AttitudeParticipantListtem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m4992f(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m4995i(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public final void m4996j(View view) {
        m41.m11784a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public final void m4997k(Act act, String str) {
        act.startActivity(PhotoAlbumFeedAct.m5428V1(act, str, "p_position_user", -1, 2));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m4998l(Act act, User user, View view) {
        m4997k(act, ((DbObject) user).id);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m4999m(Act act, User user, View view) {
        m4997k(act, ((DbObject) user).id);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m5001o(User user, final Act act) {
        FeedModule.f316d.m16683m7(FeedModule.m1139F().userId(), user, false, "p_position_user").subscribe(mkd0.H(new e30() { // from class: l.g41
            public final void call(Object obj) {
                this.f8343a.m5000n(act, (Followship) obj);
            }
        }, new e30() { // from class: l.h41
            public final void call(Object obj) {
                AttitudeParticipantListtem.m4995i((Throwable) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4996j(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m5002p(final User user, final Act act, View view) {
        p6j0.m12913c("e_cancelfollow", "p_position_user", j760.a("owner_id", ((DbObject) user).id), j760.a("receiver_user_id", ((DbObject) user).id));
        v1h.m15267v0(act, FeedModule.f313a.getResources().getString(R$string.f644z), new d30() { // from class: l.f41
            public final void call() {
                this.f7974a.m5001o(user, act);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m5003q(Act act, Followship followship) {
        m5008v(act);
        this.f2880d.setOnClickListener(null);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m5004r(User user, final Act act, View view) {
        p6j0.m12913c(MatchScData.ModuleId.mid_e_follow, "p_position_user", j760.a("owner_id", ((DbObject) user).id), j760.a("receiver_user_id", ((DbObject) user).id));
        act.duringCreated(FeedModule.f316d.m16683m7(FeedModule.m1139F().userId(), user, true, "p_position_user")).subscribe(mkd0.H(new e30() { // from class: l.d41
            public final void call(Object obj) {
                this.f6804a.m5003q(act, (Followship) obj);
            }
        }, new e30() { // from class: l.e41
            public final void call(Object obj) {
                AttitudeParticipantListtem.m4992f((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public void m5005s(final Act act, final User user) {
        qib0.G.Q0(this.f2877a, user.m1042fp().profileSmall());
        this.f2879c.setText(user.name);
        this.f2879c.getPaint().setFakeBoldText(true);
        this.f2880d.getPaint().setFakeBoldText(true);
        xdl0.E0(this.f2877a, new View.OnClickListener() { // from class: l.i41
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8887a.m4998l(act, user, view);
            }
        });
        xdl0.E0(this.f2879c, new View.OnClickListener() { // from class: l.j41
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9215a.m4999m(act, user, view);
            }
        });
        m5006t(act, user);
    }

    /* JADX INFO: renamed from: t */
    public void m5006t(final Act act, final User user) {
        boolean zIsMe = user.isMe();
        VText vText = this.f2880d;
        if (zIsMe) {
            xdl0.M0(vText, false);
            this.f2880d.setOnClickListener(null);
            return;
        }
        xdl0.M0(vText, true);
        User user2 = FeedModule.f316d.f14910A0.get(((DbObject) user).id);
        if (user2 == null) {
            user2 = user;
        }
        if (NullChecker.a(user2.localFollowship) && (TEnum.equals(user2.localFollowship.state, FollowshipStatus.following) || TEnum.equals(user2.localFollowship.state, "matched"))) {
            m5008v(act);
            xdl0.E0(this.f2880d, new View.OnClickListener() { // from class: l.k41
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9594a.m5002p(user, act, view);
                }
            });
        } else {
            m5000n(act, user2.localFollowship);
            xdl0.E0(this.f2880d, new View.OnClickListener() { // from class: l.l41
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9869a.m5004r(user, act, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void m5000n(Act act, Followship followship) {
        this.f2880d.setBackgroundResource(f3c0.f7734X);
        this.f2880d.setTextColor(act.getResources().getColor(e1c0.f7159p0));
        VText vText = this.f2880d;
        int i = t100.l;
        int i2 = t100.h;
        vText.setPadding(i, i2, i, i2);
        if (followship == null || !TEnum.equals(followship.state, FollowshipStatus.followed)) {
            this.f2880d.setText("关注");
        } else {
            this.f2880d.setText("回关");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2880d.getLayoutParams();
        marginLayoutParams.rightMargin = t100.o;
        this.f2880d.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: v */
    public final void m5008v(Act act) {
        this.f2880d.setBackground(null);
        this.f2880d.setTextColor(act.getResources().getColor(e1c0.f7160q));
        VText vText = this.f2880d;
        int i = t100.i;
        int i2 = t100.h;
        vText.setPadding(i, i2, i, i2);
        this.f2880d.setText("已关注");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2880d.getLayoutParams();
        marginLayoutParams.rightMargin = t100.l;
        this.f2880d.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: w */
    public void m5009w(Act act, User user) {
        if (user.isMe()) {
            return;
        }
        User user2 = FeedModule.f316d.f14910A0.get(((DbObject) user).id);
        if (user2 == null) {
            user2 = user;
        }
        Followship followship = user2.localFollowship;
        if (followship == null || !(TEnum.equals(followship.state, FollowshipStatus.following) || TEnum.equals(user2.localFollowship.state, "matched"))) {
            p6j0.m12915e(MatchScData.ModuleId.mid_e_follow, "p_position_user", j760.a("owner_id", ((DbObject) user).id), j760.a("receiver_user_id", ((DbObject) user).id));
        }
    }

    public AttitudeParticipantListtem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AttitudeParticipantListtem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AttitudeParticipantListtem(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
