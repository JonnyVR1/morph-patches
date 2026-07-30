package com.p051p1.mobile.putong.feed.p065ui.moments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentActivity;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.dq1;
import p153l.hdc0;
import p153l.ih00;
import p153l.jyb;
import p153l.k3h;
import p153l.k9c0;
import p153l.lbc0;
import p153l.mrb0;
import p153l.o1j0;
import p153l.orb0;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.tec0;
import p153l.uqb0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class MomentActivitiesView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f44511a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f44512b;

    /* JADX INFO: renamed from: c */
    public VImage f44513c;

    /* JADX INFO: renamed from: d */
    public VText f44514d;

    /* JADX INFO: renamed from: e */
    public VText f44515e;

    /* JADX INFO: renamed from: f */
    public VText f44516f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f44517g;

    /* JADX INFO: renamed from: h */
    public VButton f44518h;

    /* JADX INFO: renamed from: i */
    public View f44519i;

    /* JADX INFO: renamed from: j */
    public VDraweeView[] f44520j;

    /* JADX INFO: renamed from: k */
    public View f44521k;

    /* JADX INFO: renamed from: l */
    public MomentActivity f44522l;

    public MomentActivitiesView(Context context) {
        super(context);
        this.f44520j = new VDraweeView[4];
    }

    public pf60<User, Moment> getUserAndMoment() {
        return new pf60<>(FeedModule.f39703d.m145688e8(this.f44522l.actors), FeedModule.f39703d.f121357i0.get(this.f44522l.reference.f40080id));
    }

    /* JADX INFO: renamed from: h */
    public final void m67833h(View view) {
        ih00.m139967a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public Act m67834i() {
        return (Act) getContext();
    }

    @SuppressLint({"MissingInflatedId"})
    /* JADX INFO: renamed from: j */
    public void m67835j(int i) {
        int i2 = tec0.f173518I4;
        if (i != 0) {
            if (i == 1) {
                i2 = tec0.f173542M4;
            } else if (i == 2) {
                i2 = tec0.f173554O4;
            } else if (i == 3) {
                i2 = tec0.f173548N4;
            } else if (i == 4) {
                i2 = tec0.f173530K4;
            } else if (i == 6) {
                i2 = tec0.f173572R4;
            }
        }
        View viewInflate = m67834i().inflater().inflate(i2, (ViewGroup) this.f44517g, false);
        this.f44520j[0] = (VDraweeView) viewInflate.findViewById(hdc0.f108948o0);
        this.f44520j[1] = (VDraweeView) viewInflate.findViewById(hdc0.f108954q0);
        this.f44520j[2] = (VDraweeView) viewInflate.findViewById(hdc0.f108951p0);
        this.f44520j[3] = (VDraweeView) viewInflate.findViewById(hdc0.f108945n0);
        this.f44521k = viewInflate.findViewById(hdc0.f108955q1);
        this.f44517g.addView(viewInflate, 0);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m67836k(User user) {
        uqb0.f180374G.m127125Q0(this.f44512b, user.m61308fp().profileSmall());
        this.f44514d.setText(user.name);
        String gPMemo = FeedModule.m61406H().getGPMemo(user.f56859id);
        if (!TextUtils.isEmpty(gPMemo)) {
            this.f44514d.setText(gPMemo);
        }
        uqb0.f180396b0.f170325b.showUserVerificationLogo(m67834i(), user, this.f44513c);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m67837l(Moment moment, MomentActivity momentActivity, View view) {
        if (NullChecker.m82486a(moment)) {
            if (moment.media.size() != 0) {
                m67834i().startActivity(MomentsFeedPreviewAct.m68052Y1(m67834i(), momentActivity.reference.f40080id, 0));
            } else {
                m67834i().startActivity(MomentsSimpleTextAct.m68205b2(m67834i(), momentActivity.reference.f40080id, FeedModule.m61405F().userId()));
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m67838m(MomentActivity momentActivity, View view) {
        m67834i().startActivity(MomentsInProfileAct.m68095X1(m67834i(), momentActivity.actors, "from_MomentActivitiesAct"));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m67839n(final MomentActivity momentActivity, View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.bh00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f76704a.m67838m(momentActivity, view2);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m67840o(Moment moment, MomentActivity momentActivity, View view) {
        if (NullChecker.m82486a(moment) && uqb0.f180396b0.f170325b.mo31822sg(momentActivity.actors)) {
            m67834i().startActivity(orb0.m168886c(m67834i(), momentActivity.actors, false, false));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m67833h(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m67841p(View view) {
        final User userMo225055clone = FeedModule.f39703d.m145688e8(this.f44522l.actors).mo225055clone();
        if (NullChecker.m82487b(userMo225055clone)) {
            if (!NullChecker.m82486a(userMo225055clone.localFollowship)) {
                FeedModule.f39703d.m145743m7(FeedModule.m61405F().userId(), userMo225055clone, true, "p_my_interactions_notification_view");
                return;
            }
            FollowshipStatus followshipStatus = userMo225055clone.localFollowship.state;
            if (TEnum.equals(followshipStatus, "matched") || TEnum.equals(followshipStatus, FollowshipStatus.following)) {
                k3h.m148105v0(m67834i(), getResources().getString(R$string.f40031z), new x20() { // from class: l.ch00
                    @Override // p153l.x20
                    public final void call() {
                        FeedModule.f39703d.m145743m7(FeedModule.m61405F().userId(), userMo225055clone, false, "p_my_interactions_notification_view");
                    }
                });
            } else if (userMo225055clone.profile.moments.hidePublicMoments) {
                o1j0.m165649w(R$string.f39977q);
            } else {
                FeedModule.f39703d.m145743m7(FeedModule.m61405F().userId(), userMo225055clone, true, "p_my_interactions_notification_view");
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m67842q(dq1<MomentActivity> dq1Var, final MomentActivity momentActivity, int i, boolean z) {
        this.f44522l = momentActivity;
        User user = getUserAndMoment().f152156a;
        setBackgroundResource(!momentActivity.read ? k9c0.f124487S : k9c0.f124526p0);
        dq1Var.mo68557c(m67834i(), mrb0.m159645W(momentActivity.actors)).subscribe(psd0.m173596G(new y20() { // from class: l.wg00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188906a.m67836k((User) obj);
            }
        }));
        this.f44519i.setVisibility(!z ? 0 : 8);
        final Moment momentM61893X3 = FeedModule.f39702c.m61893X3(momentActivity.reference.f40080id);
        if (TEnum.equals(momentActivity.action, "comment")) {
            this.f44515e.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f44515e.setText(momentActivity.value);
            bnl0.m105524M(this.f44518h, false);
            bnl0.m105524M(this.f44517g, true);
        } else {
            boolean zEquals = TEnum.equals(momentActivity.action, "follow");
            VButton vButton = this.f44518h;
            if (zEquals) {
                bnl0.m105524M(vButton, true);
                bnl0.m105524M(this.f44517g, false);
                if (NullChecker.m82486a(user.localFollowship) && (TEnum.equals(user.localFollowship.state, "matched") || TEnum.equals(user.localFollowship.state, FollowshipStatus.following))) {
                    this.f44518h.setBackgroundDrawable(getResources().getDrawable(lbc0.f131006c));
                    this.f44518h.setTextColor(Color.parseColor("#cccccc"));
                    boolean zEquals2 = TEnum.equals(user.localFollowship.state, "matched");
                    VButton vButton2 = this.f44518h;
                    if (zEquals2) {
                        vButton2.setText(R$string.f39790N2);
                        this.f44518h.setTextColor(Color.parseColor("#bfbfbf"));
                    } else {
                        vButton2.setText(R$string.f39802P2);
                        this.f44518h.setTextColor(Color.parseColor("#bfbfbf"));
                    }
                } else {
                    this.f44518h.setBackgroundDrawable(getResources().getDrawable(lbc0.f131123q4));
                    this.f44518h.setText(R$string.f39808Q2);
                    this.f44518h.setTextColor(-1);
                }
                this.f44515e.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                this.f44515e.setText(R$string.f39778L2);
            } else {
                bnl0.m105524M(vButton, false);
                this.f44515e.setCompoundDrawablesWithIntrinsicBounds(lbc0.f131017d2, 0, 0, 0);
                VText vText = this.f44515e;
                if (momentM61893X3 == null) {
                    vText.setText("");
                } else {
                    vText.setText(R$string.f39719B3);
                }
            }
        }
        this.f44516f.setText(pzi0.m174449N(momentActivity.createdTime));
        for (int i2 = 0; i2 < i; i2++) {
            if (momentM61893X3 == null) {
                uqb0.f180374G.m98798o(this.f44520j[i2]);
            } else {
                Media media = momentM61893X3.media.get(i2);
                Picture picture = media instanceof Video ? ((Video) media).cover : media instanceof Picture ? (Picture) media : null;
                if (NullChecker.m82486a(picture)) {
                    uqb0.f180374G.m127125Q0(this.f44520j[i2], picture.momentPictureSmall());
                } else {
                    uqb0.f180374G.m98798o(this.f44520j[i2]);
                }
            }
        }
        this.f44517g.setOnClickListener(new View.OnClickListener() { // from class: l.xg00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194125a.m67837l(momentM61893X3, momentActivity, view);
            }
        });
        jyb.m147537z(jyb.m147507f0(this.f44512b, this.f44514d), new y20() { // from class: l.yg00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f199695a.m67839n(momentActivity, (View) obj);
            }
        });
        this.f44511a.setOnClickListener(new View.OnClickListener() { // from class: l.zg00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204247a.m67840o(momentM61893X3, momentActivity, view);
            }
        });
        this.f44518h.setOnClickListener(new View.OnClickListener() { // from class: l.ah00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71301a.m67841p(view);
            }
        });
    }

    public MomentActivitiesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44520j = new VDraweeView[4];
    }

    public MomentActivitiesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44520j = new VDraweeView[4];
    }
}
