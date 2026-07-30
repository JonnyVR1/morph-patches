package com.p051p1.mobile.putong.feed.p065ui.moments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import java.util.ArrayList;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VProgressBar;
import p151v.VText;
import p153l.bnl0;
import p153l.jyb;
import p153l.lbc0;
import p153l.pk00;
import p153l.q8g0;
import p153l.ql00;
import p153l.uqb0;
import p153l.vg60;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class MomentDetailHeaderLargeView extends LinearLayout implements pk00 {

    /* JADX INFO: renamed from: A */
    public VText f44528A;

    /* JADX INFO: renamed from: B */
    public VProgressBar f44529B;

    /* JADX INFO: renamed from: C */
    public String f44530C;

    /* JADX INFO: renamed from: D */
    public String f44531D;

    /* JADX INFO: renamed from: E */
    public boolean f44532E;

    /* JADX INFO: renamed from: F */
    public ArrayList<VDraweeView> f44533F;

    /* JADX INFO: renamed from: G */
    public ArrayList<VImage> f44534G;

    /* JADX INFO: renamed from: a */
    public FrameLayout f44535a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f44536b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f44537c;

    /* JADX INFO: renamed from: d */
    public VImage f44538d;

    /* JADX INFO: renamed from: e */
    public MomentHeaderLargeView f44539e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f44540f;

    /* JADX INFO: renamed from: g */
    public ImageView f44541g;

    /* JADX INFO: renamed from: h */
    public View f44542h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f44543i;

    /* JADX INFO: renamed from: j */
    public ImageView f44544j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f44545k;

    /* JADX INFO: renamed from: l */
    public VImage f44546l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f44547m;

    /* JADX INFO: renamed from: n */
    public VImage f44548n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f44549o;

    /* JADX INFO: renamed from: p */
    public VImage f44550p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f44551q;

    /* JADX INFO: renamed from: r */
    public VImage f44552r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f44553s;

    /* JADX INFO: renamed from: t */
    public VImage f44554t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f44555u;

    /* JADX INFO: renamed from: v */
    public VImage f44556v;

    /* JADX INFO: renamed from: w */
    public FrameLayout f44557w;

    /* JADX INFO: renamed from: x */
    public VText f44558x;

    /* JADX INFO: renamed from: y */
    public View f44559y;

    /* JADX INFO: renamed from: z */
    public FrameLayout f44560z;

    public MomentDetailHeaderLargeView(Context context) {
        super(context);
    }

    @Override // p153l.pk00
    /* JADX INFO: renamed from: a */
    public void mo67851a(final User user, int i) {
        VDraweeView vDraweeView = this.f44533F.get(i);
        if (user == null) {
            uqb0.f180374G.m98798o(vDraweeView);
            vDraweeView.setOnClickListener(null);
            bnl0.m105525M0(vDraweeView, false);
            return;
        }
        bnl0.m105525M0(vDraweeView, true);
        uqb0.f180374G.m127125Q0(vDraweeView, user.m61308fp().profileSmall());
        uqb0.f180396b0.f170325b.showUserVerificationLogo(m67858o(), user, this.f44534G.get(i));
        if (User.isTeamAccount(this.f44530C)) {
            vDraweeView.setOnClickListener(null);
            this.f44534G.get(i).setOnClickListener(null);
        } else {
            vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.ll00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f132513a.m67864u(user, view);
                }
            });
            this.f44534G.get(i).setOnClickListener(new View.OnClickListener() { // from class: l.ml00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f137352a.m67865v(user, view);
                }
            });
        }
    }

    @Override // p153l.pk00
    /* JADX INFO: renamed from: b */
    public void mo67852b() {
        FeedModule.f39702c.m61896Z2(this.f44530C, this.f44531D);
        this.f44528A.setVisibility(4);
        this.f44529B.setVisibility(0);
        this.f44560z.setEnabled(false);
    }

    @Override // p153l.pk00
    /* JADX INFO: renamed from: c */
    public void mo67853c(final Moment moment) {
        int i = moment.likes.count;
        this.f44539e.m67903u0(moment);
        this.f44558x.setText(q8g0.m175802h0(i));
        bnl0.m105524M(this.f44542h, i != 0);
        bnl0.m105524M(this.f44543i, i != 0);
        FrameLayout frameLayout = this.f44557w;
        int i2 = MomentView.f44613T0;
        bnl0.m105524M(frameLayout, i > i2);
        while (i2 < this.f44533F.size()) {
            this.f44533F.get(i2).setVisibility(8);
            this.f44534G.get(i2).setVisibility(8);
            i2++;
        }
        this.f44541g.setImageResource(moment.haveLiked ? lbc0.f131017d2 : lbc0.f131109o6);
        this.f44540f.setOnClickListener(new View.OnClickListener() { // from class: l.kl00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127320a.m67861r(moment, view);
            }
        });
    }

    @Override // p153l.pk00
    /* JADX INFO: renamed from: d */
    public void mo67854d(vg60<MomentMessage> vg60Var) {
        this.f44529B.setVisibility(4);
        bnl0.m105524M(this.f44559y, vg60Var.f184001a.size() != 0);
        if (!vg60Var.m201221c() || User.isTeamAccount(this.f44530C)) {
            this.f44560z.setVisibility(8);
            return;
        }
        this.f44560z.setVisibility(0);
        this.f44528A.setVisibility(0);
        this.f44560z.setEnabled(true);
    }

    @Override // p153l.pk00
    /* JADX INFO: renamed from: e */
    public void mo67855e(final String str, final String str2, boolean z, boolean z2) {
        this.f44530C = str;
        this.f44531D = str2;
        this.f44532E = z2;
        this.f44533F = jyb.m147507f0(this.f44545k, this.f44547m, this.f44549o, this.f44551q, this.f44553s, this.f44555u);
        this.f44534G = jyb.m147507f0(this.f44546l, this.f44548n, this.f44550p, this.f44552r, this.f44554t, this.f44556v);
        this.f44560z.setOnClickListener(new View.OnClickListener() { // from class: l.ol00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147806a.m67859p(view);
            }
        });
        boolean zIsTeamAccount = User.isTeamAccount(str);
        FrameLayout frameLayout = this.f44557w;
        if (zIsTeamAccount) {
            frameLayout.setOnClickListener(null);
        } else {
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: l.pl00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f152977a.m67860q(str2, str, view);
                }
            });
        }
        this.f44539e.m67902t0(z);
    }

    @Override // p153l.pk00
    /* JADX INFO: renamed from: f */
    public void mo67856f(User user) {
        this.f44539e.m67904v0(user);
        uqb0.f180374G.m127125Q0(this.f44537c, user.m61308fp().profileSmall());
        if (!this.f44532E) {
            jyb.m147537z(jyb.m147507f0(this.f44537c, this.f44539e.f44604e), new y20() { // from class: l.jl00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f121461a.m67863t((View) obj);
                }
            });
        }
        uqb0.f180396b0.f170325b.showUserVerificationLogo(m67858o(), user, this.f44538d);
    }

    /* JADX INFO: renamed from: n */
    public final void m67857n(View view) {
        ql00.m176978a(this, view);
    }

    /* JADX INFO: renamed from: o */
    public final Act m67858o() {
        return (Act) getContext();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m67857n(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m67859p(View view) {
        mo67852b();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m67860q(String str, String str2, View view) {
        m67858o().startActivity(LikesDetailAct.m67823X1(m67858o(), str, str2));
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m67861r(Moment moment, View view) {
        MomentView.m67920h0(moment, this.f44541g, true);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m67862s(View view) {
        m67858o().startActivity(MomentsInProfileAct.m68095X1(m67858o(), this.f44530C, "from_MomentDetailAct"));
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m67863t(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.nl00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f142502a.m67862s(view2);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m67864u(User user, View view) {
        m67858o().startActivity(MomentsInProfileAct.m68095X1(m67858o(), user.f56859id, "from_MomentDetailAct"));
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m67865v(User user, View view) {
        m67858o().startActivity(MomentsInProfileAct.m68095X1(m67858o(), user.f56859id, "from_MomentDetailAct"));
    }

    public MomentDetailHeaderLargeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MomentDetailHeaderLargeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
