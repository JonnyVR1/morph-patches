package com.p051p1.mobile.putong.feed.p065ui.moments;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VProgressBar;
import p151v.VText;
import p151v.VText_Expandable;
import p153l.bm00;
import p153l.bnl0;
import p153l.hdc0;
import p153l.jyb;
import p153l.k9c0;
import p153l.lbc0;
import p153l.orb0;
import p153l.pk00;
import p153l.pzi0;
import p153l.q8g0;
import p153l.qa00;
import p153l.tec0;
import p153l.uqb0;
import p153l.vg60;
import p153l.w1e;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class MomentDetailHeaderView extends LinearLayout implements pk00 {

    /* JADX INFO: renamed from: A */
    public VDraweeView f44561A;

    /* JADX INFO: renamed from: B */
    public VImage f44562B;

    /* JADX INFO: renamed from: C */
    public FrameLayout f44563C;

    /* JADX INFO: renamed from: D */
    public VText f44564D;

    /* JADX INFO: renamed from: E */
    public View f44565E;

    /* JADX INFO: renamed from: F */
    public FrameLayout f44566F;

    /* JADX INFO: renamed from: G */
    public VText f44567G;

    /* JADX INFO: renamed from: H */
    public VProgressBar f44568H;

    /* JADX INFO: renamed from: I */
    public Moment f44569I;

    /* JADX INFO: renamed from: J */
    public String f44570J;

    /* JADX INFO: renamed from: K */
    public String f44571K;

    /* JADX INFO: renamed from: L */
    public boolean f44572L;

    /* JADX INFO: renamed from: M */
    public boolean f44573M;

    /* JADX INFO: renamed from: N */
    public ArrayList<VDraweeView> f44574N;

    /* JADX INFO: renamed from: O */
    public ArrayList<VImage> f44575O;

    /* JADX INFO: renamed from: P */
    public VDraweeView[] f44576P;

    /* JADX INFO: renamed from: a */
    public FrameLayout f44577a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f44578b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f44579c;

    /* JADX INFO: renamed from: d */
    public VImage f44580d;

    /* JADX INFO: renamed from: e */
    public VText f44581e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f44582f;

    /* JADX INFO: renamed from: g */
    public VImage f44583g;

    /* JADX INFO: renamed from: h */
    public VText_Expandable f44584h;

    /* JADX INFO: renamed from: i */
    public VText f44585i;

    /* JADX INFO: renamed from: j */
    public VText f44586j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f44587k;

    /* JADX INFO: renamed from: l */
    public ImageView f44588l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f44589m;

    /* JADX INFO: renamed from: n */
    public View f44590n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f44591o;

    /* JADX INFO: renamed from: p */
    public ImageView f44592p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f44593q;

    /* JADX INFO: renamed from: r */
    public VImage f44594r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f44595s;

    /* JADX INFO: renamed from: t */
    public VImage f44596t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f44597u;

    /* JADX INFO: renamed from: v */
    public VImage f44598v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f44599w;

    /* JADX INFO: renamed from: x */
    public VImage f44600x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f44601y;

    /* JADX INFO: renamed from: z */
    public VImage f44602z;

    public MomentDetailHeaderView(Context context) {
        super(context);
        this.f44576P = new VDraweeView[4];
    }

    /* JADX INFO: renamed from: r */
    private Act m67876r() {
        return (Act) getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public /* synthetic */ void m67877t(View view) {
        mo67852b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m67878u(String str, String str2, View view) {
        m67876r().startActivity(LikesDetailAct.m67823X1(m67876r(), str, str2));
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m67879A(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.wl00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f189626a.m67889z(view2);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m67880B(User user, View view) {
        m67876r().startActivity(MomentsInProfileAct.m68095X1(m67876r(), user.f56859id, "from_MomentDetailAct"));
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m67881C(User user, View view) {
        m67876r().startActivity(MomentsInProfileAct.m68095X1(m67876r(), user.f56859id, "from_MomentDetailAct"));
    }

    /* JADX INFO: renamed from: D */
    public final void m67882D(Moment moment) {
        int iMin = NullChecker.m82487b(moment.media) ? (moment.media.size() <= 0 || !(moment.media.get(0) instanceof Video)) ? Math.min(moment.media.size(), 4) : 5 : 0;
        this.f44589m.removeAllViews();
        if (iMin == 1) {
            m67884s().inflate(tec0.f173542M4, this.f44589m);
        } else if (iMin == 2) {
            m67884s().inflate(tec0.f173554O4, this.f44589m);
        } else if (iMin == 3) {
            m67884s().inflate(tec0.f173548N4, this.f44589m);
        } else if (iMin != 5) {
            m67884s().inflate(tec0.f173530K4, this.f44589m);
        } else {
            m67884s().inflate(tec0.f173572R4, this.f44589m);
        }
        this.f44576P[0] = (VDraweeView) this.f44589m.findViewById(hdc0.f108948o0);
        this.f44576P[1] = (VDraweeView) this.f44589m.findViewById(hdc0.f108954q0);
        this.f44576P[2] = (VDraweeView) this.f44589m.findViewById(hdc0.f108951p0);
        this.f44576P[3] = (VDraweeView) this.f44589m.findViewById(hdc0.f108945n0);
        this.f44589m.findViewById(hdc0.f108955q1);
        if (iMin == 5) {
            iMin = 1;
        }
        for (int i = 0; i < iMin; i++) {
            Media media = moment.media.get(i);
            Picture picture = media instanceof Video ? ((Video) media).cover : media instanceof Picture ? (Picture) media : null;
            if (NullChecker.m82487b(picture)) {
                uqb0.f180374G.m127125Q0(this.f44576P[i], picture.momentPictureSmall());
            } else {
                uqb0.f180374G.m98798o(this.f44576P[i]);
            }
        }
    }

    @Override // p153l.pk00
    /* JADX INFO: renamed from: a */
    public void mo67851a(final User user, int i) {
        VDraweeView vDraweeView = this.f44574N.get(i);
        VImage vImage = this.f44575O.get(i);
        if (user == null) {
            uqb0.f180374G.m98798o(vDraweeView);
            vDraweeView.setOnClickListener(null);
            bnl0.m105525M0(vDraweeView, false);
            bnl0.m105525M0(vImage, false);
            return;
        }
        bnl0.m105525M0(vDraweeView, true);
        uqb0.f180374G.m127125Q0(vDraweeView, user.m61308fp().profileSmall());
        uqb0.f180396b0.f170325b.showUserVerificationLogo(m67876r(), user, vImage);
        if (User.isTeamAccount(this.f44570J)) {
            vDraweeView.setOnClickListener(null);
            vImage.setOnClickListener(null);
        } else {
            vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.tl00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f174777a.m67880B(user, view);
                }
            });
            vImage.setOnClickListener(new View.OnClickListener() { // from class: l.ul00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f179473a.m67881C(user, view);
                }
            });
        }
    }

    @Override // p153l.pk00
    /* JADX INFO: renamed from: b */
    public void mo67852b() {
        FeedModule.f39702c.m61896Z2(this.f44570J, this.f44571K);
        this.f44567G.setVisibility(4);
        this.f44568H.setVisibility(0);
        this.f44566F.setEnabled(false);
    }

    @Override // p153l.pk00
    /* JADX INFO: renamed from: c */
    public void mo67853c(final Moment moment) {
        this.f44569I = moment;
        int i = moment.likes.count;
        this.f44564D.setText(q8g0.m175802h0(i));
        bnl0.m105524M(this.f44590n, i != 0);
        bnl0.m105524M(this.f44591o, i != 0);
        FrameLayout frameLayout = this.f44563C;
        int i2 = MomentView.f44613T0;
        bnl0.m105524M(frameLayout, i > i2);
        while (i2 < this.f44574N.size()) {
            this.f44574N.get(i2).setVisibility(8);
            this.f44575O.get(i2).setVisibility(8);
            i2++;
        }
        this.f44584h.m224530o(moment.value, this.f44572L);
        this.f44586j.setText(pzi0.m174442G(moment.createdTime));
        this.f44588l.setImageResource(moment.haveLiked ? lbc0.f131017d2 : lbc0.f131109o6);
        this.f44587k.setOnClickListener(new View.OnClickListener() { // from class: l.rl00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163666a.m67887x(moment, view);
            }
        });
        if (!NullChecker.m82487b(moment.media) || moment.media.size() == 0) {
            this.f44589m.setVisibility(8);
            bnl0.m105552e0(this.f44578b, qa00.m175859d(52.0f));
        } else {
            m67882D(moment);
            this.f44589m.setOnClickListener(new View.OnClickListener() { // from class: l.sl00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f169345a.m67888y(view);
                }
            });
            this.f44589m.setBackgroundColor(0);
        }
    }

    @Override // p153l.pk00
    /* JADX INFO: renamed from: d */
    public void mo67854d(vg60<MomentMessage> vg60Var) {
        this.f44568H.setVisibility(4);
        bnl0.m105524M(this.f44565E, vg60Var.f184001a.size() != 0);
        if (!vg60Var.m201221c() || User.isTeamAccount(this.f44570J)) {
            this.f44566F.setVisibility(8);
            return;
        }
        this.f44566F.setVisibility(0);
        this.f44567G.setVisibility(0);
        this.f44566F.setEnabled(true);
    }

    @Override // p153l.pk00
    /* JADX INFO: renamed from: e */
    public void mo67855e(final String str, final String str2, boolean z, boolean z2) {
        this.f44570J = str;
        this.f44571K = str2;
        this.f44572L = z;
        this.f44573M = z2;
        m67883q(this);
        this.f44574N = jyb.m147507f0(this.f44593q, this.f44595s, this.f44597u, this.f44599w, this.f44601y, this.f44561A);
        this.f44575O = jyb.m147507f0(this.f44594r, this.f44596t, this.f44598v, this.f44600x, this.f44602z, this.f44562B);
        this.f44566F.setOnClickListener(new View.OnClickListener() { // from class: l.xl00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194835a.m67877t(view);
            }
        });
        boolean zIsTeamAccount = User.isTeamAccount(str);
        FrameLayout frameLayout = this.f44563C;
        if (zIsTeamAccount) {
            frameLayout.setOnClickListener(null);
        } else {
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: l.yl00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f200512a.m67878u(str2, str, view);
                }
            });
        }
        this.f44584h.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.zl00
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f204872a.m67885v(view);
            }
        });
        this.f44584h.setOnExpandStateChangeListener(new VText_Expandable.InterfaceC22696c() { // from class: l.am00
            @Override // p151v.VText_Expandable.InterfaceC22696c
            /* JADX INFO: renamed from: a */
            public final void mo98783a(TextView textView, boolean z3) {
                this.f72183a.m67886w(textView, z3);
            }
        });
    }

    @Override // p153l.pk00
    /* JADX INFO: renamed from: f */
    public void mo67856f(User user) {
        uqb0.f180374G.m127125Q0(this.f44579c, user.m61308fp().profileSmall());
        if (!this.f44573M) {
            jyb.m147537z(jyb.m147507f0(this.f44579c, this.f44581e), new y20() { // from class: l.vl00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f184536a.m67879A((View) obj);
                }
            });
        }
        this.f44581e.setText(user.name);
        String gPMemo = FeedModule.m61406H().getGPMemo(user.f56859id);
        if (!TextUtils.isEmpty(gPMemo)) {
            this.f44581e.setText(gPMemo);
        }
        if (!user.isVIP() || user.gpHideVip() || user.isHideIconFromSVip()) {
            this.f44581e.setTextColor(m67876r().color(k9c0.f124518l0));
        } else {
            this.f44581e.setTextColor(m67876r().color(k9c0.f124516k0));
        }
        orb0.m168908y(m67876r(), user, this.f44583g, true, false);
        this.f44585i.setVisibility(8);
        uqb0.f180396b0.f170325b.showUserVerificationLogo(m67876r(), user, this.f44580d);
        boolean zM147479J = jyb.m147479J(user.profile.extensions.interest.emoji);
        VDraweeView vDraweeView = this.f44582f;
        if (zM147479J) {
            bnl0.m105524M(vDraweeView, false);
            return;
        }
        bnl0.m105524M(vDraweeView, true);
        uqb0.f180374G.m127115L0(this.f44582f, uqb0.f180392X.m135325n(user.profile.extensions.interest.emoji.get(0)) + ".png");
    }

    /* JADX INFO: renamed from: q */
    public final void m67883q(View view) {
        bm00.m104953a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public final LayoutInflater m67884s() {
        return m67876r().getLayoutInflater();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ boolean m67885v(View view) {
        w1e.m204398b(m67876r(), this.f44569I.value);
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m67886w(TextView textView, boolean z) {
        this.f44572L = z;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m67887x(Moment moment, View view) {
        MomentView.m67920h0(moment, this.f44588l, true);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m67888y(View view) {
        m67876r().startActivity(MomentsFeedPreviewAct.m68052Y1(m67876r(), this.f44571K, 0));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m67889z(View view) {
        m67876r().startActivity(MomentsInProfileAct.m68095X1(m67876r(), this.f44570J, "from_MomentDetailAct"));
    }

    public MomentDetailHeaderView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44576P = new VDraweeView[4];
    }

    public MomentDetailHeaderView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44576P = new VDraweeView[4];
    }
}
