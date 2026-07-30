package com.p000p1.mobile.putong.core.newui.messages.business;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.ui.vip.picks.PicksHelper;
import com.p1.mobile.putong.core.ui.vip.widget.SwitchVerticalFrameLayout;
import com.p1.mobile.putong.core.view.LookUpView;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import l.g83;
import l.mcr;
import l.n3b0;
import l.oj3;
import l.t100;
import l.upa;
import l.wp1;
import l.x2c0;
import l.xdl0;
import p009l.gnl;
import p009l.pi6;
import p009l.rd6;
import p009l.vm80;
import p009l.w8e0;
import p009l.yzc0;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VText;
import v.VText_AutoFit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class BusinessConversationView extends ConstraintLayout {

    /* JADX INFO: renamed from: A */
    public VText f4507A;

    /* JADX INFO: renamed from: d */
    public gnl f4508d;

    /* JADX INFO: renamed from: e */
    public LookUpView f4509e;

    /* JADX INFO: renamed from: f */
    public View f4510f;

    /* JADX INFO: renamed from: g */
    public SwitchVerticalFrameLayout f4511g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f4512h;

    /* JADX INFO: renamed from: i */
    public ImageView f4513i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f4514j;

    /* JADX INFO: renamed from: k */
    public ViewStub f4515k;

    /* JADX INFO: renamed from: l */
    public ViewStub f4516l;

    /* JADX INFO: renamed from: m */
    public SVGAnimationView f4517m;

    /* JADX INFO: renamed from: n */
    public VFrame f4518n;

    /* JADX INFO: renamed from: o */
    public VText_AutoFit f4519o;

    /* JADX INFO: renamed from: p */
    public TextView f4520p;

    /* JADX INFO: renamed from: q */
    public View f4521q;

    /* JADX INFO: renamed from: r */
    public SVGAnimationView f4522r;

    /* JADX INFO: renamed from: s */
    public VImage f4523s;

    /* JADX INFO: renamed from: t */
    public ViewStub f4524t;

    /* JADX INFO: renamed from: u */
    public VImage f4525u;

    /* JADX INFO: renamed from: v */
    public VText f4526v;

    /* JADX INFO: renamed from: w */
    public VText f4527w;

    /* JADX INFO: renamed from: x */
    public View f4528x;

    /* JADX INFO: renamed from: y */
    public VText f4529y;

    /* JADX INFO: renamed from: z */
    public VText f4530z;

    public BusinessConversationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        boolean z = true;
        boolean zC = g83.c(1);
        boolean zM25573g = yzc0.m25566b().m25573g();
        if ((!zC || !n3b0.q()) && !zM25573g) {
            z = false;
        }
        g83.a = z;
        yzc0.m25566b().m25574i();
        if (g83.a) {
            if (zC && zM25573g) {
                CoreModule.c.J0.a0.put(Boolean.TRUE);
            }
            if (zM25573g) {
                CoreModule.c.J0.b0.clear();
                CoreModule.c.J0.c0.clear();
                CoreModule.c.J0.d0.clear();
                PicksHelper.Companion.b().g().clear();
            }
            yzc0.m25566b().m25576l(false);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m6448h0(View view) {
        oj3.a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m6449i0(mcr mcrVar, wp1<Conversation> wp1Var) {
        this.f4508d.mo6472b(mcrVar, wp1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        w8e0.m24009f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6448h0(this);
        this.f4526v.setTypeface(Typeface.DEFAULT_BOLD);
        this.f4512h.setImageResource(w8e0.m24004a().intValue());
        this.f4517m.setVisibility(8);
        if (this.f4508d == null) {
            this.f4508d = vm80.m23444d(this).m23446c();
        }
        this.f4508d.mo6471a();
        if (upa.z()) {
            xdl0.C0(this, pi6.f18602R);
            rd6.m21523v(t100.d(70.0f), this.f4512h);
            rd6.m21523v(t100.d(60.0f), this.f4514j);
            VDraweeView vDraweeView = this.f4512h;
            int i = t100.f;
            xdl0.f0(vDraweeView, i);
            xdl0.c0(this.f4512h, i);
            rd6.m21518k0(this.f4526v, this.f4507A);
            rd6.m21514e0(this.f4529y);
            xdl0.X(this.f4507A, t100.m);
            xdl0.V(this.f4525u, t100.d(47.0f));
            xdl0.U(this.f4525u, t100.d(50.0f));
            xdl0.V(this.f4518n, t100.d(38.0f));
            xdl0.U(this.f4518n, t100.d(47.0f));
            this.f4513i.setImageResource(x2c0.Gf);
        }
    }

    public void setLookUpViewVisibility(boolean z) {
        if (NullChecker.a(this.f4509e) && (xdl0.O0(this.f4509e) ^ z)) {
            xdl0.M(this.f4509e, z);
        }
    }

    public BusinessConversationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BusinessConversationView(Context context) {
        this(context, null);
    }
}
