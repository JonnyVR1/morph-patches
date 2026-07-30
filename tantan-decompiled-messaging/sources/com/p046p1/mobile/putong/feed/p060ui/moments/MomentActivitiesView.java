package com.p046p1.mobile.putong.feed.p060ui.moments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentActivity;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.b5c0;
import p149l.d30;
import p149l.e1c0;
import p149l.e30;
import p149l.f3c0;
import p149l.ijb0;
import p149l.j760;
import p149l.kjb0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.o6c0;
import p149l.qib0;
import p149l.v1h;
import p149l.vwb;
import p149l.wp1;
import p149l.xdl0;
import p149l.z800;

/* JADX INFO: loaded from: classes12.dex */
public class MomentActivitiesView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f43663a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f43664b;

    /* JADX INFO: renamed from: c */
    public VImage f43665c;

    /* JADX INFO: renamed from: d */
    public VText f43666d;

    /* JADX INFO: renamed from: e */
    public VText f43667e;

    /* JADX INFO: renamed from: f */
    public VText f43668f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f43669g;

    /* JADX INFO: renamed from: h */
    public VButton f43670h;

    /* JADX INFO: renamed from: i */
    public View f43671i;

    /* JADX INFO: renamed from: j */
    public VDraweeView[] f43672j;

    /* JADX INFO: renamed from: k */
    public View f43673k;

    /* JADX INFO: renamed from: l */
    public MomentActivity f43674l;

    public MomentActivitiesView(Context context) {
        super(context);
        this.f43672j = new VDraweeView[4];
    }

    public j760<User, Moment> getUserAndMoment() {
        return new j760<>(FeedModule.f38855d.m209447e8(this.f43674l.actors), FeedModule.f38855d.f193047i0.get(this.f43674l.reference.f39232id));
    }

    /* JADX INFO: renamed from: h */
    public final void m66650h(View view) {
        z800.m217553a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public Act m66651i() {
        return (Act) getContext();
    }

    @SuppressLint({"MissingInflatedId"})
    /* JADX INFO: renamed from: j */
    public void m66652j(int i) {
        int i2 = o6c0.f142049I4;
        if (i != 0) {
            if (i == 1) {
                i2 = o6c0.f142073M4;
            } else if (i == 2) {
                i2 = o6c0.f142085O4;
            } else if (i == 3) {
                i2 = o6c0.f142079N4;
            } else if (i == 4) {
                i2 = o6c0.f142061K4;
            } else if (i == 6) {
                i2 = o6c0.f142103R4;
            }
        }
        View viewInflate = m66651i().inflater().inflate(i2, (ViewGroup) this.f43669g, false);
        this.f43672j[0] = (VDraweeView) viewInflate.findViewById(b5c0.f73595o0);
        this.f43672j[1] = (VDraweeView) viewInflate.findViewById(b5c0.f73601q0);
        this.f43672j[2] = (VDraweeView) viewInflate.findViewById(b5c0.f73598p0);
        this.f43672j[3] = (VDraweeView) viewInflate.findViewById(b5c0.f73592n0);
        this.f43673k = viewInflate.findViewById(b5c0.f73602q1);
        this.f43669g.addView(viewInflate, 0);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m66653k(User user) {
        qib0.f154691G.m102341Q0(this.f43664b, user.m60124fp().profileSmall());
        this.f43666d.setText(user.name);
        String gPMemo = FeedModule.m60222H().getGPMemo(user.f56011id);
        if (!TextUtils.isEmpty(gPMemo)) {
            this.f43666d.setText(gPMemo);
        }
        qib0.f154713b0.f139231b.showUserVerificationLogo(m66651i(), user, this.f43665c);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m66654l(Moment moment, MomentActivity momentActivity, View view) {
        if (NullChecker.m81303a(moment)) {
            if (moment.media.size() != 0) {
                m66651i().startActivity(MomentsFeedPreviewAct.m66869X1(m66651i(), momentActivity.reference.f39232id, 0));
            } else {
                m66651i().startActivity(MomentsSimpleTextAct.m67022a2(m66651i(), momentActivity.reference.f39232id, FeedModule.m60221F().userId()));
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m66655m(MomentActivity momentActivity, View view) {
        m66651i().startActivity(MomentsInProfileAct.m66912V1(m66651i(), momentActivity.actors, "from_MomentActivitiesAct"));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m66656n(final MomentActivity momentActivity, View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.s800
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f162978a.m66655m(momentActivity, view2);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m66657o(Moment moment, MomentActivity momentActivity, View view) {
        if (NullChecker.m81303a(moment) && qib0.f154713b0.f139231b.mo30819sg(momentActivity.actors)) {
            m66651i().startActivity(kjb0.m146192c(m66651i(), momentActivity.actors, false, false));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66650h(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m66658p(View view) {
        final User userMo223809clone = FeedModule.f38855d.m209447e8(this.f43674l.actors).mo223809clone();
        if (NullChecker.m81304b(userMo223809clone)) {
            if (!NullChecker.m81303a(userMo223809clone.localFollowship)) {
                FeedModule.f38855d.m209502m7(FeedModule.m60221F().userId(), userMo223809clone, true, "p_my_interactions_notification_view");
                return;
            }
            FollowshipStatus followshipStatus = userMo223809clone.localFollowship.state;
            if (TEnum.equals(followshipStatus, "matched") || TEnum.equals(followshipStatus, FollowshipStatus.following)) {
                v1h.m196628v0(m66651i(), getResources().getString(R$string.f39183z), new d30() { // from class: l.t800
                    @Override // p149l.d30
                    public final void call() {
                        FeedModule.f38855d.m209502m7(FeedModule.m60221F().userId(), userMo223809clone, false, "p_my_interactions_notification_view");
                    }
                });
            } else if (userMo223809clone.profile.moments.hidePublicMoments) {
                lsi0.m151593w(R$string.f39129q);
            } else {
                FeedModule.f38855d.m209502m7(FeedModule.m60221F().userId(), userMo223809clone, true, "p_my_interactions_notification_view");
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m66659q(wp1<MomentActivity> wp1Var, final MomentActivity momentActivity, int i, boolean z) {
        this.f43674l = momentActivity;
        User user = getUserAndMoment().f116564a;
        setBackgroundResource(!momentActivity.read ? e1c0.f88764S : e1c0.f88803p0);
        wp1Var.mo67374c(m66651i(), ijb0.m136559W(momentActivity.actors)).subscribe(mkd0.m154955G(new e30() { // from class: l.n800
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137570a.m66653k((User) obj);
            }
        }));
        this.f43671i.setVisibility(!z ? 0 : 8);
        final Moment momentM60709X3 = FeedModule.f38854c.m60709X3(momentActivity.reference.f39232id);
        if (TEnum.equals(momentActivity.action, "comment")) {
            this.f43667e.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f43667e.setText(momentActivity.value);
            xdl0.m208344M(this.f43670h, false);
            xdl0.m208344M(this.f43669g, true);
        } else {
            boolean zEquals = TEnum.equals(momentActivity.action, "follow");
            VButton vButton = this.f43670h;
            if (zEquals) {
                xdl0.m208344M(vButton, true);
                xdl0.m208344M(this.f43669g, false);
                if (NullChecker.m81303a(user.localFollowship) && (TEnum.equals(user.localFollowship.state, "matched") || TEnum.equals(user.localFollowship.state, FollowshipStatus.following))) {
                    this.f43670h.setBackgroundDrawable(getResources().getDrawable(f3c0.f94488c));
                    this.f43670h.setTextColor(Color.parseColor("#cccccc"));
                    boolean zEquals2 = TEnum.equals(user.localFollowship.state, "matched");
                    VButton vButton2 = this.f43670h;
                    if (zEquals2) {
                        vButton2.setText(R$string.f38942N2);
                        this.f43670h.setTextColor(Color.parseColor("#bfbfbf"));
                    } else {
                        vButton2.setText(R$string.f38954P2);
                        this.f43670h.setTextColor(Color.parseColor("#bfbfbf"));
                    }
                } else {
                    this.f43670h.setBackgroundDrawable(getResources().getDrawable(f3c0.f94605q4));
                    this.f43670h.setText(R$string.f38960Q2);
                    this.f43670h.setTextColor(-1);
                }
                this.f43667e.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                this.f43667e.setText(R$string.f38930L2);
            } else {
                xdl0.m208344M(vButton, false);
                this.f43667e.setCompoundDrawablesWithIntrinsicBounds(f3c0.f94499d2, 0, 0, 0);
                VText vText = this.f43667e;
                if (momentM60709X3 == null) {
                    vText.setText("");
                } else {
                    vText.setText(R$string.f38871B3);
                }
            }
        }
        this.f43668f.setText(mqi0.m155939N(momentActivity.createdTime));
        for (int i2 = 0; i2 < i; i2++) {
            if (momentM60709X3 == null) {
                qib0.f154691G.m184725o(this.f43672j[i2]);
            } else {
                Media media = momentM60709X3.media.get(i2);
                Picture picture = media instanceof Video ? ((Video) media).cover : media instanceof Picture ? (Picture) media : null;
                if (NullChecker.m81303a(picture)) {
                    qib0.f154691G.m102341Q0(this.f43672j[i2], picture.momentPictureSmall());
                } else {
                    qib0.f154691G.m184725o(this.f43672j[i2]);
                }
            }
        }
        this.f43669g.setOnClickListener(new View.OnClickListener() { // from class: l.o800
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142589a.m66654l(momentM60709X3, momentActivity, view);
            }
        });
        vwb.m200354z(vwb.m200324f0(this.f43664b, this.f43666d), new e30() { // from class: l.p800
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147557a.m66656n(momentActivity, (View) obj);
            }
        });
        this.f43663a.setOnClickListener(new View.OnClickListener() { // from class: l.q800
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153107a.m66657o(momentM60709X3, momentActivity, view);
            }
        });
        this.f43670h.setOnClickListener(new View.OnClickListener() { // from class: l.r800
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158113a.m66658p(view);
            }
        });
    }

    public MomentActivitiesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43672j = new VDraweeView[4];
    }

    public MomentActivitiesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43672j = new VDraweeView[4];
    }
}
