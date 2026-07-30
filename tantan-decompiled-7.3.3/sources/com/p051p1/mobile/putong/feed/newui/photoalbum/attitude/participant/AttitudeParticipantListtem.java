package com.p051p1.mobile.putong.feed.newui.photoalbum.attitude.participant;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
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
import com.p051p1.mobile.putong.feed.newui.photoalbum.attitude.participant.AttitudeParticipantListtem;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.k3h;
import p153l.k9c0;
import p153l.lbc0;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.t41;
import p153l.tfj0;
import p153l.uqb0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class AttitudeParticipantListtem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f42264a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f42265b;

    /* JADX INFO: renamed from: c */
    public VText f42266c;

    /* JADX INFO: renamed from: d */
    public VText f42267d;

    public AttitudeParticipantListtem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m65136f(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m65139i(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public final void m65140j(View view) {
        t41.m189138a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public final void m65141k(Act act, String str) {
        act.startActivity(PhotoAlbumFeedAct.m65538X1(act, str, "p_position_user", -1, 2));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m65142l(Act act, User user, View view) {
        m65141k(act, user.f56859id);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m65143m(Act act, User user, View view) {
        m65141k(act, user.f56859id);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m65145o(User user, final Act act) {
        FeedModule.f39703d.m145743m7(FeedModule.m61405F().userId(), user, false, "p_position_user").subscribe(psd0.m173597H(new y20() { // from class: l.n41
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140052a.m65144n(act, (Followship) obj);
            }
        }, new y20() { // from class: l.o41
            @Override // p153l.y20
            public final void call(Object obj) {
                AttitudeParticipantListtem.m65139i((Throwable) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65140j(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m65146p(final User user, final Act act, View view) {
        tfj0.m190940c("e_cancelfollow", "p_position_user", pf60.m172085a("owner_id", user.f56859id), pf60.m172085a("receiver_user_id", user.f56859id));
        k3h.m148105v0(act, FeedModule.f39700a.getResources().getString(R$string.f40031z), new x20() { // from class: l.m41
            @Override // p153l.x20
            public final void call() {
                this.f134726a.m65145o(user, act);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m65147q(Act act, Followship followship) {
        m65152v(act);
        this.f42267d.setOnClickListener(null);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m65148r(User user, final Act act, View view) {
        tfj0.m190940c(MatchScData.ModuleId.mid_e_follow, "p_position_user", pf60.m172085a("owner_id", user.f56859id), pf60.m172085a("receiver_user_id", user.f56859id));
        act.duringCreated(FeedModule.f39703d.m145743m7(FeedModule.m61405F().userId(), user, true, "p_position_user")).subscribe(psd0.m173597H(new y20() { // from class: l.k41
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123807a.m65147q(act, (Followship) obj);
            }
        }, new y20() { // from class: l.l41
            @Override // p153l.y20
            public final void call(Object obj) {
                AttitudeParticipantListtem.m65136f((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public void m65149s(final Act act, final User user) {
        uqb0.f180374G.m127125Q0(this.f42264a, user.m61308fp().profileSmall());
        this.f42266c.setText(user.name);
        this.f42266c.getPaint().setFakeBoldText(true);
        this.f42267d.getPaint().setFakeBoldText(true);
        bnl0.m105509E0(this.f42264a, new View.OnClickListener() { // from class: l.p41
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150485a.m65142l(act, user, view);
            }
        });
        bnl0.m105509E0(this.f42266c, new View.OnClickListener() { // from class: l.q41
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155510a.m65143m(act, user, view);
            }
        });
        m65150t(act, user);
    }

    /* JADX INFO: renamed from: t */
    public void m65150t(final Act act, final User user) {
        boolean zIsMe = user.isMe();
        VText vText = this.f42267d;
        if (zIsMe) {
            bnl0.m105525M0(vText, false);
            this.f42267d.setOnClickListener(null);
            return;
        }
        bnl0.m105525M0(vText, true);
        User user2 = FeedModule.f39703d.f121285A0.get(user.f56859id);
        if (user2 == null) {
            user2 = user;
        }
        if (NullChecker.m82486a(user2.localFollowship) && (TEnum.equals(user2.localFollowship.state, FollowshipStatus.following) || TEnum.equals(user2.localFollowship.state, "matched"))) {
            m65152v(act);
            bnl0.m105509E0(this.f42267d, new View.OnClickListener() { // from class: l.r41
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f161133a.m65146p(user, act, view);
                }
            });
        } else {
            m65144n(act, user2.localFollowship);
            bnl0.m105509E0(this.f42267d, new View.OnClickListener() { // from class: l.s41
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f166049a.m65148r(user, act, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void m65144n(Act act, Followship followship) {
        this.f42267d.setBackgroundResource(lbc0.f130969X);
        this.f42267d.setTextColor(act.getResources().getColor(k9c0.f124526p0));
        VText vText = this.f42267d;
        int i = qa00.f156325l;
        int i2 = qa00.f156321h;
        vText.setPadding(i, i2, i, i2);
        if (followship == null || !TEnum.equals(followship.state, FollowshipStatus.followed)) {
            this.f42267d.setText("关注");
        } else {
            this.f42267d.setText("回关");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f42267d.getLayoutParams();
        marginLayoutParams.rightMargin = qa00.f156328o;
        this.f42267d.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: v */
    public final void m65152v(Act act) {
        this.f42267d.setBackground(null);
        this.f42267d.setTextColor(act.getResources().getColor(k9c0.f124527q));
        VText vText = this.f42267d;
        int i = qa00.f156322i;
        int i2 = qa00.f156321h;
        vText.setPadding(i, i2, i, i2);
        this.f42267d.setText("已关注");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f42267d.getLayoutParams();
        marginLayoutParams.rightMargin = qa00.f156325l;
        this.f42267d.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: w */
    public void m65153w(Act act, User user) {
        if (user.isMe()) {
            return;
        }
        User user2 = FeedModule.f39703d.f121285A0.get(user.f56859id);
        if (user2 == null) {
            user2 = user;
        }
        Followship followship = user2.localFollowship;
        if (followship == null || !(TEnum.equals(followship.state, FollowshipStatus.following) || TEnum.equals(user2.localFollowship.state, "matched"))) {
            tfj0.m190942e(MatchScData.ModuleId.mid_e_follow, "p_position_user", pf60.m172085a("owner_id", user.f56859id), pf60.m172085a("receiver_user_id", user.f56859id));
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
