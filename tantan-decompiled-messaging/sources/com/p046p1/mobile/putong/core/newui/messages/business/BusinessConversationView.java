package com.p046p1.mobile.putong.core.newui.messages.business;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.PicksHelper;
import com.p046p1.mobile.putong.core.p053ui.vip.widget.SwitchVerticalFrameLayout;
import com.p046p1.mobile.putong.core.view.LookUpView;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;
import p147v.VText_AutoFit;
import p149l.g83;
import p149l.gnl;
import p149l.mcr;
import p149l.n3b0;
import p149l.oj3;
import p149l.pi6;
import p149l.rd6;
import p149l.t100;
import p149l.upa;
import p149l.vm80;
import p149l.w8e0;
import p149l.wp1;
import p149l.x2c0;
import p149l.xdl0;
import p149l.yzc0;

/* JADX INFO: loaded from: classes11.dex */
public class BusinessConversationView extends ConstraintLayout {

    /* JADX INFO: renamed from: A */
    public VText f25729A;

    /* JADX INFO: renamed from: d */
    public gnl f25730d;

    /* JADX INFO: renamed from: e */
    public LookUpView f25731e;

    /* JADX INFO: renamed from: f */
    public View f25732f;

    /* JADX INFO: renamed from: g */
    public SwitchVerticalFrameLayout f25733g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f25734h;

    /* JADX INFO: renamed from: i */
    public ImageView f25735i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f25736j;

    /* JADX INFO: renamed from: k */
    public ViewStub f25737k;

    /* JADX INFO: renamed from: l */
    public ViewStub f25738l;

    /* JADX INFO: renamed from: m */
    public SVGAnimationView f25739m;

    /* JADX INFO: renamed from: n */
    public VFrame f25740n;

    /* JADX INFO: renamed from: o */
    public VText_AutoFit f25741o;

    /* JADX INFO: renamed from: p */
    public TextView f25742p;

    /* JADX INFO: renamed from: q */
    public View f25743q;

    /* JADX INFO: renamed from: r */
    public SVGAnimationView f25744r;

    /* JADX INFO: renamed from: s */
    public VImage f25745s;

    /* JADX INFO: renamed from: t */
    public ViewStub f25746t;

    /* JADX INFO: renamed from: u */
    public VImage f25747u;

    /* JADX INFO: renamed from: v */
    public VText f25748v;

    /* JADX INFO: renamed from: w */
    public VText f25749w;

    /* JADX INFO: renamed from: x */
    public View f25750x;

    /* JADX INFO: renamed from: y */
    public VText f25751y;

    /* JADX INFO: renamed from: z */
    public VText f25752z;

    public BusinessConversationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        boolean z = true;
        boolean zM124740c = g83.m124740c(1);
        boolean zM216641g = yzc0.m216634b().m216641g();
        if ((!zM124740c || !n3b0.m157742q()) && !zM216641g) {
            z = false;
        }
        g83.f101470a = z;
        yzc0.m216634b().m216642i();
        if (g83.f101470a) {
            if (zM124740c && zM216641g) {
                CoreModule.f17545c.f19576J0.f115749a0.put(Boolean.TRUE);
            }
            if (zM216641g) {
                CoreModule.f17545c.f19576J0.f115750b0.clear();
                CoreModule.f17545c.f19576J0.f115751c0.clear();
                CoreModule.f17545c.f19576J0.f115752d0.clear();
                PicksHelper.INSTANCE.m56740b().getGuideToUsePicksCounterInToday().clear();
            }
            yzc0.m216634b().m216644l(false);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m42296h0(View view) {
        oj3.m164606a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m42297i0(mcr mcrVar, wp1<Conversation> wp1Var) {
        this.f25730d.mo42320b(mcrVar, wp1Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        w8e0.m202168f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42296h0(this);
        this.f25748v.setTypeface(Typeface.DEFAULT_BOLD);
        this.f25734h.setImageResource(w8e0.m202163a().intValue());
        this.f25739m.setVisibility(8);
        if (this.f25730d == null) {
            this.f25730d = vm80.m198900d(this).m198902c();
        }
        this.f25730d.mo42319a();
        if (upa.m194847z()) {
            xdl0.m208325C0(this, pi6.f149081R);
            rd6.m178882v(t100.m186890d(70.0f), this.f25734h);
            rd6.m178882v(t100.m186890d(60.0f), this.f25736j);
            VDraweeView vDraweeView = this.f25734h;
            int i = t100.f167257f;
            xdl0.m208374f0(vDraweeView, i);
            xdl0.m208368c0(this.f25734h, i);
            rd6.m178877k0(this.f25748v, this.f25729A);
            rd6.m178873e0(this.f25751y);
            xdl0.m208360X(this.f25729A, t100.f167264m);
            xdl0.m208358V(this.f25747u, t100.m186890d(47.0f));
            xdl0.m208357U(this.f25747u, t100.m186890d(50.0f));
            xdl0.m208358V(this.f25740n, t100.m186890d(38.0f));
            xdl0.m208357U(this.f25740n, t100.m186890d(47.0f));
            this.f25735i.setImageResource(x2c0.f189361Gf);
        }
    }

    public void setLookUpViewVisibility(boolean z) {
        if (NullChecker.m81303a(this.f25731e) && (xdl0.m208349O0(this.f25731e) ^ z)) {
            xdl0.m208344M(this.f25731e, z);
        }
    }

    public BusinessConversationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BusinessConversationView(Context context) {
        this(context, null);
    }
}
