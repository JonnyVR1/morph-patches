package com.p000p1.mobile.putong.feed.p005ui.moments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.data.FollowshipStatus;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentActivity;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.qib0;
import l.vwb;
import l.wp1;
import l.xdl0;
import p007l.b5c0;
import p007l.e1c0;
import p007l.f3c0;
import p007l.ijb0;
import p007l.kjb0;
import p007l.o6c0;
import p007l.v1h;
import p007l.z800;
import v.VButton;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentActivitiesView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f5124a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f5125b;

    /* JADX INFO: renamed from: c */
    public VImage f5126c;

    /* JADX INFO: renamed from: d */
    public VText f5127d;

    /* JADX INFO: renamed from: e */
    public VText f5128e;

    /* JADX INFO: renamed from: f */
    public VText f5129f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f5130g;

    /* JADX INFO: renamed from: h */
    public VButton f5131h;

    /* JADX INFO: renamed from: i */
    public View f5132i;

    /* JADX INFO: renamed from: j */
    public VDraweeView[] f5133j;

    /* JADX INFO: renamed from: k */
    public View f5134k;

    /* JADX INFO: renamed from: l */
    public MomentActivity f5135l;

    public MomentActivitiesView(Context context) {
        super(context);
        this.f5133j = new VDraweeView[4];
    }

    public j760<User, Moment> getUserAndMoment() {
        return new j760<>(FeedModule.f316d.m16628e8(this.f5135l.actors), FeedModule.f316d.f14982i0.get(this.f5135l.reference.f693id));
    }

    /* JADX INFO: renamed from: h */
    public final void m7841h(View view) {
        z800.m17267a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public Act m7842i() {
        return getContext();
    }

    @SuppressLint({"MissingInflatedId"})
    /* JADX INFO: renamed from: j */
    public void m7843j(int i) {
        int i2 = o6c0.f11068I4;
        if (i != 0) {
            if (i == 1) {
                i2 = o6c0.f11092M4;
            } else if (i == 2) {
                i2 = o6c0.f11104O4;
            } else if (i == 3) {
                i2 = o6c0.f11098N4;
            } else if (i == 4) {
                i2 = o6c0.f11080K4;
            } else if (i == 6) {
                i2 = o6c0.f11122R4;
            }
        }
        View viewInflate = m7842i().inflater().inflate(i2, (ViewGroup) this.f5130g, false);
        this.f5133j[0] = (VDraweeView) viewInflate.findViewById(b5c0.f6076o0);
        this.f5133j[1] = (VDraweeView) viewInflate.findViewById(b5c0.f6082q0);
        this.f5133j[2] = (VDraweeView) viewInflate.findViewById(b5c0.f6079p0);
        this.f5133j[3] = (VDraweeView) viewInflate.findViewById(b5c0.f6073n0);
        this.f5134k = viewInflate.findViewById(b5c0.f6083q1);
        this.f5130g.addView(viewInflate, 0);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m7844k(User user) {
        qib0.G.Q0(this.f5125b, user.m1042fp().profileSmall());
        this.f5127d.setText(user.name);
        String gPMemo = FeedModule.m1140H().getGPMemo(((DbObject) user).id);
        if (!TextUtils.isEmpty(gPMemo)) {
            this.f5127d.setText(gPMemo);
        }
        qib0.b0.b.showUserVerificationLogo(m7842i(), user, this.f5126c);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m7845l(Moment moment, MomentActivity momentActivity, View view) {
        if (NullChecker.a(moment)) {
            if (moment.media.size() != 0) {
                m7842i().startActivity(MomentsFeedPreviewAct.m8063X1(m7842i(), momentActivity.reference.f693id, 0));
            } else {
                m7842i().startActivity(MomentsSimpleTextAct.m8225a2(m7842i(), momentActivity.reference.f693id, FeedModule.m1139F().userId()));
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m7846m(MomentActivity momentActivity, View view) {
        m7842i().startActivity(MomentsInProfileAct.m8110V1(m7842i(), momentActivity.actors, "from_MomentActivitiesAct"));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m7847n(final MomentActivity momentActivity, View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.s800
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f12820a.m7846m(momentActivity, view2);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m7848o(Moment moment, MomentActivity momentActivity, View view) {
        if (NullChecker.a(moment) && qib0.b0.b.sg(momentActivity.actors)) {
            m7842i().startActivity(kjb0.m11451c(m7842i(), momentActivity.actors, false, false));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7841h(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m7849p(View view) {
        final User userM19150clone = FeedModule.f316d.m16628e8(this.f5135l.actors).m19150clone();
        if (NullChecker.b(userM19150clone)) {
            if (!NullChecker.a(userM19150clone.localFollowship)) {
                FeedModule.f316d.m16683m7(FeedModule.m1139F().userId(), userM19150clone, true, "p_my_interactions_notification_view");
                return;
            }
            FollowshipStatus followshipStatus = userM19150clone.localFollowship.state;
            if (TEnum.equals(followshipStatus, "matched") || TEnum.equals(followshipStatus, FollowshipStatus.following)) {
                v1h.m15267v0(m7842i(), getResources().getString(R$string.f644z), new d30() { // from class: l.t800
                    public final void call() {
                        FeedModule.f316d.m16683m7(FeedModule.m1139F().userId(), userM19150clone, false, "p_my_interactions_notification_view");
                    }
                });
            } else if (userM19150clone.profile.moments.hidePublicMoments) {
                lsi0.w(R$string.f590q);
            } else {
                FeedModule.f316d.m16683m7(FeedModule.m1139F().userId(), userM19150clone, true, "p_my_interactions_notification_view");
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m7850q(wp1<MomentActivity> wp1Var, final MomentActivity momentActivity, int i, boolean z) {
        this.f5135l = momentActivity;
        User user = (User) getUserAndMoment().a;
        setBackgroundResource(!momentActivity.read ? e1c0.f7120S : e1c0.f7159p0);
        wp1Var.c(m7842i(), ijb0.m10912W(momentActivity.actors)).subscribe(mkd0.G(new e30() { // from class: l.n800
            public final void call(Object obj) {
                this.f10696a.m7844k((User) obj);
            }
        }));
        this.f5132i.setVisibility(!z ? 0 : 8);
        final Moment momentM1635X3 = FeedModule.f315c.m1635X3(momentActivity.reference.f693id);
        if (TEnum.equals(momentActivity.action, "comment")) {
            this.f5128e.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f5128e.setText(momentActivity.value);
            xdl0.M(this.f5131h, false);
            xdl0.M(this.f5130g, true);
        } else {
            boolean zEquals = TEnum.equals(momentActivity.action, "follow");
            VButton vButton = this.f5131h;
            if (zEquals) {
                xdl0.M(vButton, true);
                xdl0.M(this.f5130g, false);
                if (NullChecker.a(user.localFollowship) && (TEnum.equals(user.localFollowship.state, "matched") || TEnum.equals(user.localFollowship.state, FollowshipStatus.following))) {
                    this.f5131h.setBackgroundDrawable(getResources().getDrawable(f3c0.f7771c));
                    this.f5131h.setTextColor(Color.parseColor("#cccccc"));
                    boolean zEquals2 = TEnum.equals(user.localFollowship.state, "matched");
                    VButton vButton2 = this.f5131h;
                    if (zEquals2) {
                        vButton2.setText(R$string.f403N2);
                        this.f5131h.setTextColor(Color.parseColor("#bfbfbf"));
                    } else {
                        vButton2.setText(R$string.f415P2);
                        this.f5131h.setTextColor(Color.parseColor("#bfbfbf"));
                    }
                } else {
                    this.f5131h.setBackgroundDrawable(getResources().getDrawable(f3c0.f7888q4));
                    this.f5131h.setText(R$string.f421Q2);
                    this.f5131h.setTextColor(-1);
                }
                this.f5128e.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                this.f5128e.setText(R$string.f391L2);
            } else {
                xdl0.M(vButton, false);
                this.f5128e.setCompoundDrawablesWithIntrinsicBounds(f3c0.f7782d2, 0, 0, 0);
                VText vText = this.f5128e;
                if (momentM1635X3 == null) {
                    vText.setText("");
                } else {
                    vText.setText(R$string.f332B3);
                }
            }
        }
        this.f5129f.setText(mqi0.N(momentActivity.createdTime));
        for (int i2 = 0; i2 < i; i2++) {
            if (momentM1635X3 == null) {
                qib0.G.o(this.f5133j[i2]);
            } else {
                Media media = momentM1635X3.media.get(i2);
                Picture picture = media instanceof Video ? ((Video) media).cover : media instanceof Picture ? (Picture) media : null;
                if (NullChecker.a(picture)) {
                    qib0.G.Q0(this.f5133j[i2], picture.momentPictureSmall());
                } else {
                    qib0.G.o(this.f5133j[i2]);
                }
            }
        }
        this.f5130g.setOnClickListener(new View.OnClickListener() { // from class: l.o800
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11376a.m7845l(momentM1635X3, momentActivity, view);
            }
        });
        vwb.z(vwb.f0(new View[]{this.f5125b, this.f5127d}), new e30() { // from class: l.p800
            public final void call(Object obj) {
                this.f11723a.m7847n(momentActivity, (View) obj);
            }
        });
        this.f5124a.setOnClickListener(new View.OnClickListener() { // from class: l.q800
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12146a.m7848o(momentM1635X3, momentActivity, view);
            }
        });
        this.f5131h.setOnClickListener(new View.OnClickListener() { // from class: l.r800
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12514a.m7849p(view);
            }
        });
    }

    public MomentActivitiesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5133j = new VDraweeView[4];
    }

    public MomentActivitiesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5133j = new VDraweeView[4];
    }
}
