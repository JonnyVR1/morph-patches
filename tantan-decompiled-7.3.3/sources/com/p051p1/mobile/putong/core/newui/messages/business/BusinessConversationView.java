package com.p051p1.mobile.putong.core.newui.messages.business;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.PicksHelper;
import com.p051p1.mobile.putong.core.p058ui.vip.widget.SwitchVerticalFrameLayout;
import com.p051p1.mobile.putong.core.view.LookUpView;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;
import p151v.VText_AutoFit;
import p153l.b8d0;
import p153l.bhe0;
import p153l.bnl0;
import p153l.dbc0;
import p153l.dq1;
import p153l.gk3;
import p153l.gra;
import p153l.ner;
import p153l.qa00;
import p153l.rbb0;
import p153l.rpl;
import p153l.sj6;
import p153l.ue6;
import p153l.v83;
import p153l.zu80;

/* JADX INFO: loaded from: classes11.dex */
public class BusinessConversationView extends ConstraintLayout {

    /* JADX INFO: renamed from: A */
    public VText f26471A;

    /* JADX INFO: renamed from: d */
    public rpl f26472d;

    /* JADX INFO: renamed from: e */
    public LookUpView f26473e;

    /* JADX INFO: renamed from: f */
    public View f26474f;

    /* JADX INFO: renamed from: g */
    public SwitchVerticalFrameLayout f26475g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f26476h;

    /* JADX INFO: renamed from: i */
    public ImageView f26477i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f26478j;

    /* JADX INFO: renamed from: k */
    public ViewStub f26479k;

    /* JADX INFO: renamed from: l */
    public ViewStub f26480l;

    /* JADX INFO: renamed from: m */
    public SVGAnimationView f26481m;

    /* JADX INFO: renamed from: n */
    public VFrame f26482n;

    /* JADX INFO: renamed from: o */
    public VText_AutoFit f26483o;

    /* JADX INFO: renamed from: p */
    public TextView f26484p;

    /* JADX INFO: renamed from: q */
    public View f26485q;

    /* JADX INFO: renamed from: r */
    public SVGAnimationView f26486r;

    /* JADX INFO: renamed from: s */
    public VImage f26487s;

    /* JADX INFO: renamed from: t */
    public ViewStub f26488t;

    /* JADX INFO: renamed from: u */
    public VImage f26489u;

    /* JADX INFO: renamed from: v */
    public VText f26490v;

    /* JADX INFO: renamed from: w */
    public VText f26491w;

    /* JADX INFO: renamed from: x */
    public View f26492x;

    /* JADX INFO: renamed from: y */
    public VText f26493y;

    /* JADX INFO: renamed from: z */
    public VText f26494z;

    public BusinessConversationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        boolean z = true;
        boolean zM200283c = v83.m200283c(1);
        boolean zM102970g = b8d0.m102963b().m102970g();
        if ((!zM200283c || !rbb0.m180744q()) && !zM102970g) {
            z = false;
        }
        v83.f182846a = z;
        b8d0.m102963b().m102971i();
        if (v83.f182846a) {
            if (zM200283c && zM102970g) {
                CoreModule.f18264c.f20318J0.f134511a0.put(Boolean.TRUE);
            }
            if (zM102970g) {
                CoreModule.f18264c.f20318J0.f134512b0.clear();
                CoreModule.f18264c.f20318J0.f134513c0.clear();
                CoreModule.f18264c.f20318J0.f134514d0.clear();
                PicksHelper.INSTANCE.m57923b().getGuideToUsePicksCounterInToday().clear();
            }
            b8d0.m102963b().m102973l(false);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m43307h0(View view) {
        gk3.m130566a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m43308i0(ner nerVar, dq1<Conversation> dq1Var) {
        this.f26472d.mo43331b(nerVar, dq1Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        bhe0.m104333f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43307h0(this);
        this.f26490v.setTypeface(Typeface.DEFAULT_BOLD);
        this.f26476h.setImageResource(bhe0.m104328a().intValue());
        this.f26481m.setVisibility(8);
        if (this.f26472d == null) {
            this.f26472d = zu80.m221600d(this).m221602c();
        }
        this.f26472d.mo43330a();
        if (gra.m131778z()) {
            bnl0.m105505C0(this, sj6.f168906R);
            ue6.m195676v(qa00.m175859d(70.0f), this.f26476h);
            ue6.m195676v(qa00.m175859d(60.0f), this.f26478j);
            VDraweeView vDraweeView = this.f26476h;
            int i = qa00.f156319f;
            bnl0.m105554f0(vDraweeView, i);
            bnl0.m105548c0(this.f26476h, i);
            ue6.m195671k0(this.f26490v, this.f26471A);
            ue6.m195667e0(this.f26493y);
            bnl0.m105540X(this.f26471A, qa00.f156326m);
            bnl0.m105538V(this.f26489u, qa00.m175859d(47.0f));
            bnl0.m105537U(this.f26489u, qa00.m175859d(50.0f));
            bnl0.m105538V(this.f26482n, qa00.m175859d(38.0f));
            bnl0.m105537U(this.f26482n, qa00.m175859d(47.0f));
            this.f26477i.setImageResource(dbc0.f87482ug);
        }
    }

    public void setLookUpViewVisibility(boolean z) {
        if (NullChecker.m82486a(this.f26473e) && (bnl0.m105529O0(this.f26473e) ^ z)) {
            bnl0.m105524M(this.f26473e, z);
        }
    }

    public BusinessConversationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BusinessConversationView(Context context) {
        this(context, null);
    }
}
