package com.p046p1.mobile.putong.feed.newui.photoalbum.attitude.participant;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
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
import com.p046p1.mobile.putong.feed.newui.photoalbum.attitude.participant.AttitudeParticipantListtem;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VText;
import p149l.d30;
import p149l.e1c0;
import p149l.e30;
import p149l.f3c0;
import p149l.j760;
import p149l.m41;
import p149l.mkd0;
import p149l.p6j0;
import p149l.qib0;
import p149l.t100;
import p149l.v1h;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class AttitudeParticipantListtem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f41416a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f41417b;

    /* JADX INFO: renamed from: c */
    public VText f41418c;

    /* JADX INFO: renamed from: d */
    public VText f41419d;

    public AttitudeParticipantListtem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m63953f(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m63956i(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public final void m63957j(View view) {
        m41.m152987a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public final void m63958k(Act act, String str) {
        act.startActivity(PhotoAlbumFeedAct.m64355V1(act, str, "p_position_user", -1, 2));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m63959l(Act act, User user, View view) {
        m63958k(act, user.f56011id);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m63960m(Act act, User user, View view) {
        m63958k(act, user.f56011id);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m63962o(User user, final Act act) {
        FeedModule.f38855d.m209502m7(FeedModule.m60221F().userId(), user, false, "p_position_user").subscribe(mkd0.m154956H(new e30() { // from class: l.g41
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100536a.m63961n(act, (Followship) obj);
            }
        }, new e30() { // from class: l.h41
            @Override // p149l.e30
            public final void call(Object obj) {
                AttitudeParticipantListtem.m63956i((Throwable) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m63957j(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m63963p(final User user, final Act act, View view) {
        p6j0.m167669c("e_cancelfollow", "p_position_user", j760.m140076a("owner_id", user.f56011id), j760.m140076a("receiver_user_id", user.f56011id));
        v1h.m196628v0(act, FeedModule.f38852a.getResources().getString(R$string.f39183z), new d30() { // from class: l.f41
            @Override // p149l.d30
            public final void call() {
                this.f94731a.m63962o(user, act);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m63964q(Act act, Followship followship) {
        m63969v(act);
        this.f41419d.setOnClickListener(null);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m63965r(User user, final Act act, View view) {
        p6j0.m167669c(MatchScData.ModuleId.mid_e_follow, "p_position_user", j760.m140076a("owner_id", user.f56011id), j760.m140076a("receiver_user_id", user.f56011id));
        act.duringCreated(FeedModule.f38855d.m209502m7(FeedModule.m60221F().userId(), user, true, "p_position_user")).subscribe(mkd0.m154956H(new e30() { // from class: l.d41
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84275a.m63964q(act, (Followship) obj);
            }
        }, new e30() { // from class: l.e41
            @Override // p149l.e30
            public final void call(Object obj) {
                AttitudeParticipantListtem.m63953f((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public void m63966s(final Act act, final User user) {
        qib0.f154691G.m102341Q0(this.f41416a, user.m60124fp().profileSmall());
        this.f41418c.setText(user.name);
        this.f41418c.getPaint().setFakeBoldText(true);
        this.f41419d.getPaint().setFakeBoldText(true);
        xdl0.m208329E0(this.f41416a, new View.OnClickListener() { // from class: l.i41
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111395a.m63959l(act, user, view);
            }
        });
        xdl0.m208329E0(this.f41418c, new View.OnClickListener() { // from class: l.j41
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116131a.m63960m(act, user, view);
            }
        });
        m63967t(act, user);
    }

    /* JADX INFO: renamed from: t */
    public void m63967t(final Act act, final User user) {
        boolean zIsMe = user.isMe();
        VText vText = this.f41419d;
        if (zIsMe) {
            xdl0.m208345M0(vText, false);
            this.f41419d.setOnClickListener(null);
            return;
        }
        xdl0.m208345M0(vText, true);
        User user2 = FeedModule.f38855d.f192975A0.get(user.f56011id);
        if (user2 == null) {
            user2 = user;
        }
        if (NullChecker.m81303a(user2.localFollowship) && (TEnum.equals(user2.localFollowship.state, FollowshipStatus.following) || TEnum.equals(user2.localFollowship.state, "matched"))) {
            m63969v(act);
            xdl0.m208329E0(this.f41419d, new View.OnClickListener() { // from class: l.k41
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f120924a.m63963p(user, act, view);
                }
            });
        } else {
            m63961n(act, user2.localFollowship);
            xdl0.m208329E0(this.f41419d, new View.OnClickListener() { // from class: l.l41
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f125958a.m63965r(user, act, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void m63961n(Act act, Followship followship) {
        this.f41419d.setBackgroundResource(f3c0.f94451X);
        this.f41419d.setTextColor(act.getResources().getColor(e1c0.f88803p0));
        VText vText = this.f41419d;
        int i = t100.f167263l;
        int i2 = t100.f167259h;
        vText.setPadding(i, i2, i, i2);
        if (followship == null || !TEnum.equals(followship.state, FollowshipStatus.followed)) {
            this.f41419d.setText("关注");
        } else {
            this.f41419d.setText("回关");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f41419d.getLayoutParams();
        marginLayoutParams.rightMargin = t100.f167266o;
        this.f41419d.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: v */
    public final void m63969v(Act act) {
        this.f41419d.setBackground(null);
        this.f41419d.setTextColor(act.getResources().getColor(e1c0.f88804q));
        VText vText = this.f41419d;
        int i = t100.f167260i;
        int i2 = t100.f167259h;
        vText.setPadding(i, i2, i, i2);
        this.f41419d.setText("已关注");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f41419d.getLayoutParams();
        marginLayoutParams.rightMargin = t100.f167263l;
        this.f41419d.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: w */
    public void m63970w(Act act, User user) {
        if (user.isMe()) {
            return;
        }
        User user2 = FeedModule.f38855d.f192975A0.get(user.f56011id);
        if (user2 == null) {
            user2 = user;
        }
        Followship followship = user2.localFollowship;
        if (followship == null || !(TEnum.equals(followship.state, FollowshipStatus.following) || TEnum.equals(user2.localFollowship.state, "matched"))) {
            p6j0.m167671e(MatchScData.ModuleId.mid_e_follow, "p_position_user", j760.m140076a("owner_id", user.f56011id), j760.m140076a("receiver_user_id", user.f56011id));
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
