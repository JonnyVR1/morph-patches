package com.p046p1.mobile.putong.feed.p060ui.moments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import java.util.ArrayList;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VText;
import p149l.e30;
import p149l.f3c0;
import p149l.gc00;
import p149l.hd00;
import p149l.i0g0;
import p149l.q860;
import p149l.qib0;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class MomentDetailHeaderLargeView extends LinearLayout implements gc00 {

    /* JADX INFO: renamed from: A */
    public VText f43680A;

    /* JADX INFO: renamed from: B */
    public VProgressBar f43681B;

    /* JADX INFO: renamed from: C */
    public String f43682C;

    /* JADX INFO: renamed from: D */
    public String f43683D;

    /* JADX INFO: renamed from: E */
    public boolean f43684E;

    /* JADX INFO: renamed from: F */
    public ArrayList<VDraweeView> f43685F;

    /* JADX INFO: renamed from: G */
    public ArrayList<VImage> f43686G;

    /* JADX INFO: renamed from: a */
    public FrameLayout f43687a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f43688b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f43689c;

    /* JADX INFO: renamed from: d */
    public VImage f43690d;

    /* JADX INFO: renamed from: e */
    public MomentHeaderLargeView f43691e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f43692f;

    /* JADX INFO: renamed from: g */
    public ImageView f43693g;

    /* JADX INFO: renamed from: h */
    public View f43694h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f43695i;

    /* JADX INFO: renamed from: j */
    public ImageView f43696j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f43697k;

    /* JADX INFO: renamed from: l */
    public VImage f43698l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f43699m;

    /* JADX INFO: renamed from: n */
    public VImage f43700n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f43701o;

    /* JADX INFO: renamed from: p */
    public VImage f43702p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f43703q;

    /* JADX INFO: renamed from: r */
    public VImage f43704r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f43705s;

    /* JADX INFO: renamed from: t */
    public VImage f43706t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f43707u;

    /* JADX INFO: renamed from: v */
    public VImage f43708v;

    /* JADX INFO: renamed from: w */
    public FrameLayout f43709w;

    /* JADX INFO: renamed from: x */
    public VText f43710x;

    /* JADX INFO: renamed from: y */
    public View f43711y;

    /* JADX INFO: renamed from: z */
    public FrameLayout f43712z;

    public MomentDetailHeaderLargeView(Context context) {
        super(context);
    }

    @Override // p149l.gc00
    /* JADX INFO: renamed from: a */
    public void mo66668a(final User user, int i) {
        VDraweeView vDraweeView = this.f43685F.get(i);
        if (user == null) {
            qib0.f154691G.m184725o(vDraweeView);
            vDraweeView.setOnClickListener(null);
            xdl0.m208345M0(vDraweeView, false);
            return;
        }
        xdl0.m208345M0(vDraweeView, true);
        qib0.f154691G.m102341Q0(vDraweeView, user.m60124fp().profileSmall());
        qib0.f154713b0.f139231b.showUserVerificationLogo(m66675o(), user, this.f43686G.get(i));
        if (User.isTeamAccount(this.f43682C)) {
            vDraweeView.setOnClickListener(null);
            this.f43686G.get(i).setOnClickListener(null);
        } else {
            vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.cd00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f80342a.m66681u(user, view);
                }
            });
            this.f43686G.get(i).setOnClickListener(new View.OnClickListener() { // from class: l.dd00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f85525a.m66682v(user, view);
                }
            });
        }
    }

    @Override // p149l.gc00
    /* JADX INFO: renamed from: b */
    public void mo66669b() {
        FeedModule.f38854c.m60712Z2(this.f43682C, this.f43683D);
        this.f43680A.setVisibility(4);
        this.f43681B.setVisibility(0);
        this.f43712z.setEnabled(false);
    }

    @Override // p149l.gc00
    /* JADX INFO: renamed from: c */
    public void mo66670c(final Moment moment) {
        int i = moment.likes.count;
        this.f43691e.m66720u0(moment);
        this.f43710x.setText(i0g0.m133867h0(i));
        xdl0.m208344M(this.f43694h, i != 0);
        xdl0.m208344M(this.f43695i, i != 0);
        FrameLayout frameLayout = this.f43709w;
        int i2 = MomentView.f43765T0;
        xdl0.m208344M(frameLayout, i > i2);
        while (i2 < this.f43685F.size()) {
            this.f43685F.get(i2).setVisibility(8);
            this.f43686G.get(i2).setVisibility(8);
            i2++;
        }
        this.f43693g.setImageResource(moment.haveLiked ? f3c0.f94499d2 : f3c0.f94591o6);
        this.f43692f.setOnClickListener(new View.OnClickListener() { // from class: l.bd00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74993a.m66678r(moment, view);
            }
        });
    }

    @Override // p149l.gc00
    /* JADX INFO: renamed from: d */
    public void mo66671d(q860<MomentMessage> q860Var) {
        this.f43681B.setVisibility(4);
        xdl0.m208344M(this.f43711y, q860Var.f153135a.size() != 0);
        if (!q860Var.m173343c() || User.isTeamAccount(this.f43682C)) {
            this.f43712z.setVisibility(8);
            return;
        }
        this.f43712z.setVisibility(0);
        this.f43680A.setVisibility(0);
        this.f43712z.setEnabled(true);
    }

    @Override // p149l.gc00
    /* JADX INFO: renamed from: e */
    public void mo66672e(final String str, final String str2, boolean z, boolean z2) {
        this.f43682C = str;
        this.f43683D = str2;
        this.f43684E = z2;
        this.f43685F = vwb.m200324f0(this.f43697k, this.f43699m, this.f43701o, this.f43703q, this.f43705s, this.f43707u);
        this.f43686G = vwb.m200324f0(this.f43698l, this.f43700n, this.f43702p, this.f43704r, this.f43706t, this.f43708v);
        this.f43712z.setOnClickListener(new View.OnClickListener() { // from class: l.fd00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96946a.m66676p(view);
            }
        });
        boolean zIsTeamAccount = User.isTeamAccount(str);
        FrameLayout frameLayout = this.f43709w;
        if (zIsTeamAccount) {
            frameLayout.setOnClickListener(null);
        } else {
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: l.gd00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f102069a.m66677q(str2, str, view);
                }
            });
        }
        this.f43691e.m66719t0(z);
    }

    @Override // p149l.gc00
    /* JADX INFO: renamed from: f */
    public void mo66673f(User user) {
        this.f43691e.m66721v0(user);
        qib0.f154691G.m102341Q0(this.f43689c, user.m60124fp().profileSmall());
        if (!this.f43684E) {
            vwb.m200354z(vwb.m200324f0(this.f43689c, this.f43691e.f43756e), new e30() { // from class: l.ad00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f68892a.m66680t((View) obj);
                }
            });
        }
        qib0.f154713b0.f139231b.showUserVerificationLogo(m66675o(), user, this.f43690d);
    }

    /* JADX INFO: renamed from: n */
    public final void m66674n(View view) {
        hd00.m130529a(this, view);
    }

    /* JADX INFO: renamed from: o */
    public final Act m66675o() {
        return (Act) getContext();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66674n(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m66676p(View view) {
        mo66669b();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m66677q(String str, String str2, View view) {
        m66675o().startActivity(LikesDetailAct.m66640V1(m66675o(), str, str2));
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m66678r(Moment moment, View view) {
        MomentView.m66737h0(moment, this.f43693g, true);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m66679s(View view) {
        m66675o().startActivity(MomentsInProfileAct.m66912V1(m66675o(), this.f43682C, "from_MomentDetailAct"));
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m66680t(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ed00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f90581a.m66679s(view2);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m66681u(User user, View view) {
        m66675o().startActivity(MomentsInProfileAct.m66912V1(m66675o(), user.f56011id, "from_MomentDetailAct"));
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m66682v(User user, View view) {
        m66675o().startActivity(MomentsInProfileAct.m66912V1(m66675o(), user.f56011id, "from_MomentDetailAct"));
    }

    public MomentDetailHeaderLargeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MomentDetailHeaderLargeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
