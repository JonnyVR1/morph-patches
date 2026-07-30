package com.p000p1.mobile.putong.feed.p005ui.moments;

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
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.e30;
import l.i0e;
import l.i0g0;
import l.mqi0;
import l.q860;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import p007l.b5c0;
import p007l.e1c0;
import p007l.f3c0;
import p007l.gc00;
import p007l.kjb0;
import p007l.o6c0;
import p007l.sd00;
import v.VDraweeView;
import v.VImage;
import v.VProgressBar;
import v.VText;
import v.VText_Expandable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentDetailHeaderView extends LinearLayout implements gc00 {

    /* JADX INFO: renamed from: A */
    public VDraweeView f5174A;

    /* JADX INFO: renamed from: B */
    public VImage f5175B;

    /* JADX INFO: renamed from: C */
    public FrameLayout f5176C;

    /* JADX INFO: renamed from: D */
    public VText f5177D;

    /* JADX INFO: renamed from: E */
    public View f5178E;

    /* JADX INFO: renamed from: F */
    public FrameLayout f5179F;

    /* JADX INFO: renamed from: G */
    public VText f5180G;

    /* JADX INFO: renamed from: H */
    public VProgressBar f5181H;

    /* JADX INFO: renamed from: I */
    public Moment f5182I;

    /* JADX INFO: renamed from: J */
    public String f5183J;

    /* JADX INFO: renamed from: K */
    public String f5184K;

    /* JADX INFO: renamed from: L */
    public boolean f5185L;

    /* JADX INFO: renamed from: M */
    public boolean f5186M;

    /* JADX INFO: renamed from: N */
    public ArrayList<VDraweeView> f5187N;

    /* JADX INFO: renamed from: O */
    public ArrayList<VImage> f5188O;

    /* JADX INFO: renamed from: P */
    public VDraweeView[] f5189P;

    /* JADX INFO: renamed from: a */
    public FrameLayout f5190a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f5191b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f5192c;

    /* JADX INFO: renamed from: d */
    public VImage f5193d;

    /* JADX INFO: renamed from: e */
    public VText f5194e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f5195f;

    /* JADX INFO: renamed from: g */
    public VImage f5196g;

    /* JADX INFO: renamed from: h */
    public VText_Expandable f5197h;

    /* JADX INFO: renamed from: i */
    public VText f5198i;

    /* JADX INFO: renamed from: j */
    public VText f5199j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f5200k;

    /* JADX INFO: renamed from: l */
    public ImageView f5201l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f5202m;

    /* JADX INFO: renamed from: n */
    public View f5203n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f5204o;

    /* JADX INFO: renamed from: p */
    public ImageView f5205p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f5206q;

    /* JADX INFO: renamed from: r */
    public VImage f5207r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f5208s;

    /* JADX INFO: renamed from: t */
    public VImage f5209t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f5210u;

    /* JADX INFO: renamed from: v */
    public VImage f5211v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f5212w;

    /* JADX INFO: renamed from: x */
    public VImage f5213x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f5214y;

    /* JADX INFO: renamed from: z */
    public VImage f5215z;

    public MomentDetailHeaderView(Context context) {
        super(context);
        this.f5189P = new VDraweeView[4];
    }

    /* JADX INFO: renamed from: r */
    private Act m7884r() {
        return getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public /* synthetic */ void m7885t(View view) {
        mo7860b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m7886u(String str, String str2, View view) {
        m7884r().startActivity(LikesDetailAct.m7831V1(m7884r(), str, str2));
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m7887A(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.nd00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f10744a.m7897z(view2);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m7888B(User user, View view) {
        m7884r().startActivity(MomentsInProfileAct.m8110V1(m7884r(), ((DbObject) user).id, "from_MomentDetailAct"));
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m7889C(User user, View view) {
        m7884r().startActivity(MomentsInProfileAct.m8110V1(m7884r(), ((DbObject) user).id, "from_MomentDetailAct"));
    }

    /* JADX INFO: renamed from: D */
    public final void m7890D(Moment moment) {
        int iMin = NullChecker.b(moment.media) ? (moment.media.size() <= 0 || !(moment.media.get(0) instanceof Video)) ? Math.min(moment.media.size(), 4) : 5 : 0;
        this.f5202m.removeAllViews();
        if (iMin == 1) {
            m7892s().inflate(o6c0.f11092M4, this.f5202m);
        } else if (iMin == 2) {
            m7892s().inflate(o6c0.f11104O4, this.f5202m);
        } else if (iMin == 3) {
            m7892s().inflate(o6c0.f11098N4, this.f5202m);
        } else if (iMin != 5) {
            m7892s().inflate(o6c0.f11080K4, this.f5202m);
        } else {
            m7892s().inflate(o6c0.f11122R4, this.f5202m);
        }
        this.f5189P[0] = (VDraweeView) this.f5202m.findViewById(b5c0.f6076o0);
        this.f5189P[1] = (VDraweeView) this.f5202m.findViewById(b5c0.f6082q0);
        this.f5189P[2] = (VDraweeView) this.f5202m.findViewById(b5c0.f6079p0);
        this.f5189P[3] = (VDraweeView) this.f5202m.findViewById(b5c0.f6073n0);
        this.f5202m.findViewById(b5c0.f6083q1);
        if (iMin == 5) {
            iMin = 1;
        }
        for (int i = 0; i < iMin; i++) {
            Media media = moment.media.get(i);
            Picture picture = media instanceof Video ? ((Video) media).cover : media instanceof Picture ? (Picture) media : null;
            if (NullChecker.b(picture)) {
                qib0.G.Q0(this.f5189P[i], picture.momentPictureSmall());
            } else {
                qib0.G.o(this.f5189P[i]);
            }
        }
    }

    @Override // p007l.gc00
    /* JADX INFO: renamed from: a */
    public void mo7859a(final User user, int i) {
        VDraweeView vDraweeView = this.f5187N.get(i);
        VImage vImage = this.f5188O.get(i);
        if (user == null) {
            qib0.G.o(vDraweeView);
            vDraweeView.setOnClickListener(null);
            xdl0.M0(vDraweeView, false);
            xdl0.M0(vImage, false);
            return;
        }
        xdl0.M0(vDraweeView, true);
        qib0.G.Q0(vDraweeView, user.m1042fp().profileSmall());
        qib0.b0.b.showUserVerificationLogo(m7884r(), user, vImage);
        if (User.isTeamAccount(this.f5183J)) {
            vDraweeView.setOnClickListener(null);
            vImage.setOnClickListener(null);
        } else {
            vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.kd00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9677a.m7888B(user, view);
                }
            });
            vImage.setOnClickListener(new View.OnClickListener() { // from class: l.ld00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10004a.m7889C(user, view);
                }
            });
        }
    }

    @Override // p007l.gc00
    /* JADX INFO: renamed from: b */
    public void mo7860b() {
        FeedModule.f315c.m1638Z2(this.f5183J, this.f5184K);
        this.f5180G.setVisibility(4);
        this.f5181H.setVisibility(0);
        this.f5179F.setEnabled(false);
    }

    @Override // p007l.gc00
    /* JADX INFO: renamed from: c */
    public void mo7861c(final Moment moment) {
        this.f5182I = moment;
        int i = moment.likes.count;
        this.f5177D.setText(i0g0.h0(i));
        xdl0.M(this.f5203n, i != 0);
        xdl0.M(this.f5204o, i != 0);
        FrameLayout frameLayout = this.f5176C;
        int i2 = MomentView.f5226T0;
        xdl0.M(frameLayout, i > i2);
        while (i2 < this.f5187N.size()) {
            this.f5187N.get(i2).setVisibility(8);
            this.f5188O.get(i2).setVisibility(8);
            i2++;
        }
        this.f5197h.o(moment.value, this.f5185L);
        this.f5199j.setText(mqi0.G(moment.createdTime));
        this.f5201l.setImageResource(moment.haveLiked ? f3c0.f7782d2 : f3c0.f7874o6);
        this.f5200k.setOnClickListener(new View.OnClickListener() { // from class: l.id00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8988a.m7895x(moment, view);
            }
        });
        if (!NullChecker.b(moment.media) || moment.media.size() == 0) {
            this.f5202m.setVisibility(8);
            xdl0.e0(this.f5191b, t100.d(52.0f));
        } else {
            m7890D(moment);
            this.f5202m.setOnClickListener(new View.OnClickListener() { // from class: l.jd00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9314a.m7896y(view);
                }
            });
            this.f5202m.setBackgroundColor(0);
        }
    }

    @Override // p007l.gc00
    /* JADX INFO: renamed from: d */
    public void mo7862d(q860<MomentMessage> q860Var) {
        this.f5181H.setVisibility(4);
        xdl0.M(this.f5178E, q860Var.a.size() != 0);
        if (!q860Var.c() || User.isTeamAccount(this.f5183J)) {
            this.f5179F.setVisibility(8);
            return;
        }
        this.f5179F.setVisibility(0);
        this.f5180G.setVisibility(0);
        this.f5179F.setEnabled(true);
    }

    @Override // p007l.gc00
    /* JADX INFO: renamed from: e */
    public void mo7863e(final String str, final String str2, boolean z, boolean z2) {
        this.f5183J = str;
        this.f5184K = str2;
        this.f5185L = z;
        this.f5186M = z2;
        m7891q(this);
        this.f5187N = vwb.f0(new VDraweeView[]{this.f5206q, this.f5208s, this.f5210u, this.f5212w, this.f5214y, this.f5174A});
        this.f5188O = vwb.f0(new VImage[]{this.f5207r, this.f5209t, this.f5211v, this.f5213x, this.f5215z, this.f5175B});
        this.f5179F.setOnClickListener(new View.OnClickListener() { // from class: l.od00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11426a.m7885t(view);
            }
        });
        boolean zIsTeamAccount = User.isTeamAccount(str);
        FrameLayout frameLayout = this.f5176C;
        if (zIsTeamAccount) {
            frameLayout.setOnClickListener(null);
        } else {
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: l.pd00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11791a.m7886u(str2, str, view);
                }
            });
        }
        this.f5197h.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.qd00
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f12207a.m7893v(view);
            }
        });
        this.f5197h.setOnExpandStateChangeListener(new VText_Expandable.c() { // from class: l.rd00
            /* JADX INFO: renamed from: a */
            public final void m13894a(TextView textView, boolean z3) {
                this.f12593a.m7894w(textView, z3);
            }
        });
    }

    @Override // p007l.gc00
    /* JADX INFO: renamed from: f */
    public void mo7864f(User user) {
        qib0.G.Q0(this.f5192c, user.m1042fp().profileSmall());
        if (!this.f5186M) {
            vwb.z(vwb.f0(new View[]{this.f5192c, this.f5194e}), new e30() { // from class: l.md00
                public final void call(Object obj) {
                    this.f10428a.m7887A((View) obj);
                }
            });
        }
        this.f5194e.setText(user.name);
        String gPMemo = FeedModule.m1140H().getGPMemo(((DbObject) user).id);
        if (!TextUtils.isEmpty(gPMemo)) {
            this.f5194e.setText(gPMemo);
        }
        if (!user.isVIP() || user.gpHideVip() || user.isHideIconFromSVip()) {
            this.f5194e.setTextColor(m7884r().color(e1c0.f7151l0));
        } else {
            this.f5194e.setTextColor(m7884r().color(e1c0.f7149k0));
        }
        kjb0.m11473y(m7884r(), user, this.f5196g, true, false);
        this.f5198i.setVisibility(8);
        qib0.b0.b.showUserVerificationLogo(m7884r(), user, this.f5193d);
        boolean zJ = vwb.J(user.profile.extensions.interest.emoji);
        VDraweeView vDraweeView = this.f5195f;
        if (zJ) {
            xdl0.M(vDraweeView, false);
            return;
        }
        xdl0.M(vDraweeView, true);
        qib0.G.L0(this.f5195f, qib0.X.n(user.profile.extensions.interest.emoji.get(0)) + ".png");
    }

    /* JADX INFO: renamed from: q */
    public final void m7891q(View view) {
        sd00.m14125a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public final LayoutInflater m7892s() {
        return m7884r().getLayoutInflater();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ boolean m7893v(View view) {
        i0e.b(m7884r(), this.f5182I.value);
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m7894w(TextView textView, boolean z) {
        this.f5185L = z;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m7895x(Moment moment, View view) {
        MomentView.m7928h0(moment, this.f5201l, true);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m7896y(View view) {
        m7884r().startActivity(MomentsFeedPreviewAct.m8063X1(m7884r(), this.f5184K, 0));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m7897z(View view) {
        m7884r().startActivity(MomentsInProfileAct.m8110V1(m7884r(), this.f5183J, "from_MomentDetailAct"));
    }

    public MomentDetailHeaderView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5189P = new VDraweeView[4];
    }

    public MomentDetailHeaderView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5189P = new VDraweeView[4];
    }
}
