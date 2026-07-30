package com.p000p1.mobile.putong.feed.p005ui.moments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import l.e30;
import l.i0g0;
import l.q860;
import l.qib0;
import l.vwb;
import l.xdl0;
import p007l.f3c0;
import p007l.gc00;
import p007l.hd00;
import v.VDraweeView;
import v.VImage;
import v.VProgressBar;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentDetailHeaderLargeView extends LinearLayout implements gc00 {

    /* JADX INFO: renamed from: A */
    public VText f5141A;

    /* JADX INFO: renamed from: B */
    public VProgressBar f5142B;

    /* JADX INFO: renamed from: C */
    public String f5143C;

    /* JADX INFO: renamed from: D */
    public String f5144D;

    /* JADX INFO: renamed from: E */
    public boolean f5145E;

    /* JADX INFO: renamed from: F */
    public ArrayList<VDraweeView> f5146F;

    /* JADX INFO: renamed from: G */
    public ArrayList<VImage> f5147G;

    /* JADX INFO: renamed from: a */
    public FrameLayout f5148a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f5149b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f5150c;

    /* JADX INFO: renamed from: d */
    public VImage f5151d;

    /* JADX INFO: renamed from: e */
    public MomentHeaderLargeView f5152e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f5153f;

    /* JADX INFO: renamed from: g */
    public ImageView f5154g;

    /* JADX INFO: renamed from: h */
    public View f5155h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f5156i;

    /* JADX INFO: renamed from: j */
    public ImageView f5157j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f5158k;

    /* JADX INFO: renamed from: l */
    public VImage f5159l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f5160m;

    /* JADX INFO: renamed from: n */
    public VImage f5161n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f5162o;

    /* JADX INFO: renamed from: p */
    public VImage f5163p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f5164q;

    /* JADX INFO: renamed from: r */
    public VImage f5165r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f5166s;

    /* JADX INFO: renamed from: t */
    public VImage f5167t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f5168u;

    /* JADX INFO: renamed from: v */
    public VImage f5169v;

    /* JADX INFO: renamed from: w */
    public FrameLayout f5170w;

    /* JADX INFO: renamed from: x */
    public VText f5171x;

    /* JADX INFO: renamed from: y */
    public View f5172y;

    /* JADX INFO: renamed from: z */
    public FrameLayout f5173z;

    public MomentDetailHeaderLargeView(Context context) {
        super(context);
    }

    @Override // p007l.gc00
    /* JADX INFO: renamed from: a */
    public void mo7859a(final User user, int i) {
        VDraweeView vDraweeView = this.f5146F.get(i);
        if (user == null) {
            qib0.G.o(vDraweeView);
            vDraweeView.setOnClickListener(null);
            xdl0.M0(vDraweeView, false);
            return;
        }
        xdl0.M0(vDraweeView, true);
        qib0.G.Q0(vDraweeView, user.m1042fp().profileSmall());
        qib0.b0.b.showUserVerificationLogo(m7866o(), user, this.f5147G.get(i));
        if (User.isTeamAccount(this.f5143C)) {
            vDraweeView.setOnClickListener(null);
            this.f5147G.get(i).setOnClickListener(null);
        } else {
            vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.cd00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f6609a.m7872u(user, view);
                }
            });
            this.f5147G.get(i).setOnClickListener(new View.OnClickListener() { // from class: l.dd00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f6894a.m7873v(user, view);
                }
            });
        }
    }

    @Override // p007l.gc00
    /* JADX INFO: renamed from: b */
    public void mo7860b() {
        FeedModule.f315c.m1638Z2(this.f5143C, this.f5144D);
        this.f5141A.setVisibility(4);
        this.f5142B.setVisibility(0);
        this.f5173z.setEnabled(false);
    }

    @Override // p007l.gc00
    /* JADX INFO: renamed from: c */
    public void mo7861c(final Moment moment) {
        int i = moment.likes.count;
        this.f5152e.m7911u0(moment);
        this.f5171x.setText(i0g0.h0(i));
        xdl0.M(this.f5155h, i != 0);
        xdl0.M(this.f5156i, i != 0);
        FrameLayout frameLayout = this.f5170w;
        int i2 = MomentView.f5226T0;
        xdl0.M(frameLayout, i > i2);
        while (i2 < this.f5146F.size()) {
            this.f5146F.get(i2).setVisibility(8);
            this.f5147G.get(i2).setVisibility(8);
            i2++;
        }
        this.f5154g.setImageResource(moment.haveLiked ? f3c0.f7782d2 : f3c0.f7874o6);
        this.f5153f.setOnClickListener(new View.OnClickListener() { // from class: l.bd00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6264a.m7869r(moment, view);
            }
        });
    }

    @Override // p007l.gc00
    /* JADX INFO: renamed from: d */
    public void mo7862d(q860<MomentMessage> q860Var) {
        this.f5142B.setVisibility(4);
        xdl0.M(this.f5172y, q860Var.a.size() != 0);
        if (!q860Var.c() || User.isTeamAccount(this.f5143C)) {
            this.f5173z.setVisibility(8);
            return;
        }
        this.f5173z.setVisibility(0);
        this.f5141A.setVisibility(0);
        this.f5173z.setEnabled(true);
    }

    @Override // p007l.gc00
    /* JADX INFO: renamed from: e */
    public void mo7863e(final String str, final String str2, boolean z, boolean z2) {
        this.f5143C = str;
        this.f5144D = str2;
        this.f5145E = z2;
        this.f5146F = vwb.f0(new VDraweeView[]{this.f5158k, this.f5160m, this.f5162o, this.f5164q, this.f5166s, this.f5168u});
        this.f5147G = vwb.f0(new VImage[]{this.f5159l, this.f5161n, this.f5163p, this.f5165r, this.f5167t, this.f5169v});
        this.f5173z.setOnClickListener(new View.OnClickListener() { // from class: l.fd00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8068a.m7867p(view);
            }
        });
        boolean zIsTeamAccount = User.isTeamAccount(str);
        FrameLayout frameLayout = this.f5170w;
        if (zIsTeamAccount) {
            frameLayout.setOnClickListener(null);
        } else {
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: l.gd00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8422a.m7868q(str2, str, view);
                }
            });
        }
        this.f5152e.m7910t0(z);
    }

    @Override // p007l.gc00
    /* JADX INFO: renamed from: f */
    public void mo7864f(User user) {
        this.f5152e.m7912v0(user);
        qib0.G.Q0(this.f5150c, user.m1042fp().profileSmall());
        if (!this.f5145E) {
            vwb.z(vwb.f0(new View[]{this.f5150c, this.f5152e.f5217e}), new e30() { // from class: l.ad00
                public final void call(Object obj) {
                    this.f5712a.m7871t((View) obj);
                }
            });
        }
        qib0.b0.b.showUserVerificationLogo(m7866o(), user, this.f5151d);
    }

    /* JADX INFO: renamed from: n */
    public final void m7865n(View view) {
        hd00.m10599a(this, view);
    }

    /* JADX INFO: renamed from: o */
    public final Act m7866o() {
        return getContext();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7865n(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m7867p(View view) {
        mo7860b();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m7868q(String str, String str2, View view) {
        m7866o().startActivity(LikesDetailAct.m7831V1(m7866o(), str, str2));
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m7869r(Moment moment, View view) {
        MomentView.m7928h0(moment, this.f5154g, true);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m7870s(View view) {
        m7866o().startActivity(MomentsInProfileAct.m8110V1(m7866o(), this.f5143C, "from_MomentDetailAct"));
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m7871t(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ed00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f7329a.m7870s(view2);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m7872u(User user, View view) {
        m7866o().startActivity(MomentsInProfileAct.m8110V1(m7866o(), ((DbObject) user).id, "from_MomentDetailAct"));
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m7873v(User user, View view) {
        m7866o().startActivity(MomentsInProfileAct.m8110V1(m7866o(), ((DbObject) user).id, "from_MomentDetailAct"));
    }

    public MomentDetailHeaderLargeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MomentDetailHeaderLargeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
