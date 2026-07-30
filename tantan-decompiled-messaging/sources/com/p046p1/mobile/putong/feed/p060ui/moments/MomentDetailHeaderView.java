package com.p046p1.mobile.putong.feed.p060ui.moments;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VText;
import p147v.VText_Expandable;
import p149l.b5c0;
import p149l.e1c0;
import p149l.e30;
import p149l.f3c0;
import p149l.gc00;
import p149l.i0e;
import p149l.i0g0;
import p149l.kjb0;
import p149l.mqi0;
import p149l.o6c0;
import p149l.q860;
import p149l.qib0;
import p149l.sd00;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class MomentDetailHeaderView extends LinearLayout implements gc00 {

    /* JADX INFO: renamed from: A */
    public VDraweeView f43713A;

    /* JADX INFO: renamed from: B */
    public VImage f43714B;

    /* JADX INFO: renamed from: C */
    public FrameLayout f43715C;

    /* JADX INFO: renamed from: D */
    public VText f43716D;

    /* JADX INFO: renamed from: E */
    public View f43717E;

    /* JADX INFO: renamed from: F */
    public FrameLayout f43718F;

    /* JADX INFO: renamed from: G */
    public VText f43719G;

    /* JADX INFO: renamed from: H */
    public VProgressBar f43720H;

    /* JADX INFO: renamed from: I */
    public Moment f43721I;

    /* JADX INFO: renamed from: J */
    public String f43722J;

    /* JADX INFO: renamed from: K */
    public String f43723K;

    /* JADX INFO: renamed from: L */
    public boolean f43724L;

    /* JADX INFO: renamed from: M */
    public boolean f43725M;

    /* JADX INFO: renamed from: N */
    public ArrayList<VDraweeView> f43726N;

    /* JADX INFO: renamed from: O */
    public ArrayList<VImage> f43727O;

    /* JADX INFO: renamed from: P */
    public VDraweeView[] f43728P;

    /* JADX INFO: renamed from: a */
    public FrameLayout f43729a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f43730b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f43731c;

    /* JADX INFO: renamed from: d */
    public VImage f43732d;

    /* JADX INFO: renamed from: e */
    public VText f43733e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f43734f;

    /* JADX INFO: renamed from: g */
    public VImage f43735g;

    /* JADX INFO: renamed from: h */
    public VText_Expandable f43736h;

    /* JADX INFO: renamed from: i */
    public VText f43737i;

    /* JADX INFO: renamed from: j */
    public VText f43738j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f43739k;

    /* JADX INFO: renamed from: l */
    public ImageView f43740l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f43741m;

    /* JADX INFO: renamed from: n */
    public View f43742n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f43743o;

    /* JADX INFO: renamed from: p */
    public ImageView f43744p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f43745q;

    /* JADX INFO: renamed from: r */
    public VImage f43746r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f43747s;

    /* JADX INFO: renamed from: t */
    public VImage f43748t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f43749u;

    /* JADX INFO: renamed from: v */
    public VImage f43750v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f43751w;

    /* JADX INFO: renamed from: x */
    public VImage f43752x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f43753y;

    /* JADX INFO: renamed from: z */
    public VImage f43754z;

    public MomentDetailHeaderView(Context context) {
        super(context);
        this.f43728P = new VDraweeView[4];
    }

    /* JADX INFO: renamed from: r */
    private Act m66693r() {
        return (Act) getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public /* synthetic */ void m66694t(View view) {
        mo66669b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m66695u(String str, String str2, View view) {
        m66693r().startActivity(LikesDetailAct.m66640V1(m66693r(), str, str2));
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m66696A(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.nd00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f138245a.m66706z(view2);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m66697B(User user, View view) {
        m66693r().startActivity(MomentsInProfileAct.m66912V1(m66693r(), user.f56011id, "from_MomentDetailAct"));
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m66698C(User user, View view) {
        m66693r().startActivity(MomentsInProfileAct.m66912V1(m66693r(), user.f56011id, "from_MomentDetailAct"));
    }

    /* JADX INFO: renamed from: D */
    public final void m66699D(Moment moment) {
        int iMin = NullChecker.m81304b(moment.media) ? (moment.media.size() <= 0 || !(moment.media.get(0) instanceof Video)) ? Math.min(moment.media.size(), 4) : 5 : 0;
        this.f43741m.removeAllViews();
        if (iMin == 1) {
            m66701s().inflate(o6c0.f142073M4, this.f43741m);
        } else if (iMin == 2) {
            m66701s().inflate(o6c0.f142085O4, this.f43741m);
        } else if (iMin == 3) {
            m66701s().inflate(o6c0.f142079N4, this.f43741m);
        } else if (iMin != 5) {
            m66701s().inflate(o6c0.f142061K4, this.f43741m);
        } else {
            m66701s().inflate(o6c0.f142103R4, this.f43741m);
        }
        this.f43728P[0] = (VDraweeView) this.f43741m.findViewById(b5c0.f73595o0);
        this.f43728P[1] = (VDraweeView) this.f43741m.findViewById(b5c0.f73601q0);
        this.f43728P[2] = (VDraweeView) this.f43741m.findViewById(b5c0.f73598p0);
        this.f43728P[3] = (VDraweeView) this.f43741m.findViewById(b5c0.f73592n0);
        this.f43741m.findViewById(b5c0.f73602q1);
        if (iMin == 5) {
            iMin = 1;
        }
        for (int i = 0; i < iMin; i++) {
            Media media = moment.media.get(i);
            Picture picture = media instanceof Video ? ((Video) media).cover : media instanceof Picture ? (Picture) media : null;
            if (NullChecker.m81304b(picture)) {
                qib0.f154691G.m102341Q0(this.f43728P[i], picture.momentPictureSmall());
            } else {
                qib0.f154691G.m184725o(this.f43728P[i]);
            }
        }
    }

    @Override // p149l.gc00
    /* JADX INFO: renamed from: a */
    public void mo66668a(final User user, int i) {
        VDraweeView vDraweeView = this.f43726N.get(i);
        VImage vImage = this.f43727O.get(i);
        if (user == null) {
            qib0.f154691G.m184725o(vDraweeView);
            vDraweeView.setOnClickListener(null);
            xdl0.m208345M0(vDraweeView, false);
            xdl0.m208345M0(vImage, false);
            return;
        }
        xdl0.m208345M0(vDraweeView, true);
        qib0.f154691G.m102341Q0(vDraweeView, user.m60124fp().profileSmall());
        qib0.f154713b0.f139231b.showUserVerificationLogo(m66693r(), user, vImage);
        if (User.isTeamAccount(this.f43722J)) {
            vDraweeView.setOnClickListener(null);
            vImage.setOnClickListener(null);
        } else {
            vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.kd00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f122527a.m66697B(user, view);
                }
            });
            vImage.setOnClickListener(new View.OnClickListener() { // from class: l.ld00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f127487a.m66698C(user, view);
                }
            });
        }
    }

    @Override // p149l.gc00
    /* JADX INFO: renamed from: b */
    public void mo66669b() {
        FeedModule.f38854c.m60712Z2(this.f43722J, this.f43723K);
        this.f43719G.setVisibility(4);
        this.f43720H.setVisibility(0);
        this.f43718F.setEnabled(false);
    }

    @Override // p149l.gc00
    /* JADX INFO: renamed from: c */
    public void mo66670c(final Moment moment) {
        this.f43721I = moment;
        int i = moment.likes.count;
        this.f43716D.setText(i0g0.m133867h0(i));
        xdl0.m208344M(this.f43742n, i != 0);
        xdl0.m208344M(this.f43743o, i != 0);
        FrameLayout frameLayout = this.f43715C;
        int i2 = MomentView.f43765T0;
        xdl0.m208344M(frameLayout, i > i2);
        while (i2 < this.f43726N.size()) {
            this.f43726N.get(i2).setVisibility(8);
            this.f43727O.get(i2).setVisibility(8);
            i2++;
        }
        this.f43736h.m223284o(moment.value, this.f43724L);
        this.f43738j.setText(mqi0.m155932G(moment.createdTime));
        this.f43740l.setImageResource(moment.haveLiked ? f3c0.f94499d2 : f3c0.f94591o6);
        this.f43739k.setOnClickListener(new View.OnClickListener() { // from class: l.id00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112501a.m66704x(moment, view);
            }
        });
        if (!NullChecker.m81304b(moment.media) || moment.media.size() == 0) {
            this.f43741m.setVisibility(8);
            xdl0.m208372e0(this.f43730b, t100.m186890d(52.0f));
        } else {
            m66699D(moment);
            this.f43741m.setOnClickListener(new View.OnClickListener() { // from class: l.jd00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f117363a.m66705y(view);
                }
            });
            this.f43741m.setBackgroundColor(0);
        }
    }

    @Override // p149l.gc00
    /* JADX INFO: renamed from: d */
    public void mo66671d(q860<MomentMessage> q860Var) {
        this.f43720H.setVisibility(4);
        xdl0.m208344M(this.f43717E, q860Var.f153135a.size() != 0);
        if (!q860Var.m173343c() || User.isTeamAccount(this.f43722J)) {
            this.f43718F.setVisibility(8);
            return;
        }
        this.f43718F.setVisibility(0);
        this.f43719G.setVisibility(0);
        this.f43718F.setEnabled(true);
    }

    @Override // p149l.gc00
    /* JADX INFO: renamed from: e */
    public void mo66672e(final String str, final String str2, boolean z, boolean z2) {
        this.f43722J = str;
        this.f43723K = str2;
        this.f43724L = z;
        this.f43725M = z2;
        m66700q(this);
        this.f43726N = vwb.m200324f0(this.f43745q, this.f43747s, this.f43749u, this.f43751w, this.f43753y, this.f43713A);
        this.f43727O = vwb.m200324f0(this.f43746r, this.f43748t, this.f43750v, this.f43752x, this.f43754z, this.f43714B);
        this.f43718F.setOnClickListener(new View.OnClickListener() { // from class: l.od00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143140a.m66694t(view);
            }
        });
        boolean zIsTeamAccount = User.isTeamAccount(str);
        FrameLayout frameLayout = this.f43715C;
        if (zIsTeamAccount) {
            frameLayout.setOnClickListener(null);
        } else {
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: l.pd00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f148248a.m66695u(str2, str, view);
                }
            });
        }
        this.f43736h.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.qd00
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f153859a.m66702v(view);
            }
        });
        this.f43736h.setOnExpandStateChangeListener(new VText_Expandable.InterfaceC22581c() { // from class: l.rd00
            @Override // p147v.VText_Expandable.InterfaceC22581c
            /* JADX INFO: renamed from: a */
            public final void mo116115a(TextView textView, boolean z3) {
                this.f158850a.m66703w(textView, z3);
            }
        });
    }

    @Override // p149l.gc00
    /* JADX INFO: renamed from: f */
    public void mo66673f(User user) {
        qib0.f154691G.m102341Q0(this.f43731c, user.m60124fp().profileSmall());
        if (!this.f43725M) {
            vwb.m200354z(vwb.m200324f0(this.f43731c, this.f43733e), new e30() { // from class: l.md00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f133202a.m66696A((View) obj);
                }
            });
        }
        this.f43733e.setText(user.name);
        String gPMemo = FeedModule.m60222H().getGPMemo(user.f56011id);
        if (!TextUtils.isEmpty(gPMemo)) {
            this.f43733e.setText(gPMemo);
        }
        if (!user.isVIP() || user.gpHideVip() || user.isHideIconFromSVip()) {
            this.f43733e.setTextColor(m66693r().color(e1c0.f88795l0));
        } else {
            this.f43733e.setTextColor(m66693r().color(e1c0.f88793k0));
        }
        kjb0.m146214y(m66693r(), user, this.f43735g, true, false);
        this.f43737i.setVisibility(8);
        qib0.f154713b0.f139231b.showUserVerificationLogo(m66693r(), user, this.f43732d);
        boolean zM200296J = vwb.m200296J(user.profile.extensions.interest.emoji);
        VDraweeView vDraweeView = this.f43734f;
        if (zM200296J) {
            xdl0.m208344M(vDraweeView, false);
            return;
        }
        xdl0.m208344M(vDraweeView, true);
        qib0.f154691G.m102331L0(this.f43734f, qib0.f154709X.m126254n(user.profile.extensions.interest.emoji.get(0)) + ".png");
    }

    /* JADX INFO: renamed from: q */
    public final void m66700q(View view) {
        sd00.m183442a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public final LayoutInflater m66701s() {
        return m66693r().getLayoutInflater();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ boolean m66702v(View view) {
        i0e.m133793b(m66693r(), this.f43721I.value);
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m66703w(TextView textView, boolean z) {
        this.f43724L = z;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m66704x(Moment moment, View view) {
        MomentView.m66737h0(moment, this.f43740l, true);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m66705y(View view) {
        m66693r().startActivity(MomentsFeedPreviewAct.m66869X1(m66693r(), this.f43723K, 0));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m66706z(View view) {
        m66693r().startActivity(MomentsInProfileAct.m66912V1(m66693r(), this.f43722J, "from_MomentDetailAct"));
    }

    public MomentDetailHeaderView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43728P = new VDraweeView[4];
    }

    public MomentDetailHeaderView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43728P = new VDraweeView[4];
    }
}
