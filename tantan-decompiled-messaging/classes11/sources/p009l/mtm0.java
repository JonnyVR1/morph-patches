package p009l;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.User;
import l.c3c0;
import l.d30;
import l.e16;
import l.lsi0;
import l.ntm0;
import l.o6j0;
import l.qib0;
import l.s7m;
import l.xdl0;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class mtm0 implements s7m<lsm0> {

    /* JADX INFO: renamed from: a */
    public ImageView f17091a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f17092b;

    /* JADX INFO: renamed from: c */
    public VText f17093c;

    /* JADX INFO: renamed from: d */
    public VText f17094d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f17095e;

    /* JADX INFO: renamed from: f */
    public VImage f17096f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f17097g;

    /* JADX INFO: renamed from: h */
    public VImage f17098h;

    /* JADX INFO: renamed from: i */
    public VImage f17099i;

    /* JADX INFO: renamed from: j */
    public ConstraintLayout f17100j;

    /* JADX INFO: renamed from: k */
    public VImage f17101k;

    /* JADX INFO: renamed from: l */
    public VImage f17102l;

    /* JADX INFO: renamed from: m */
    public VImage f17103m;

    /* JADX INFO: renamed from: n */
    public final PutongAct f17104n;

    /* JADX INFO: renamed from: o */
    public lsm0 f17105o;

    public mtm0(PutongAct putongAct) {
        this.f17104n = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m18605p(View view) {
        this.f17105o.m18035O0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m18607s(View view) {
        Pair<Boolean, Integer> pairM18040s0 = this.f17105o.m18040s0();
        if (((Boolean) pairM18040s0.first).booleanValue()) {
            lsi0.w(((Integer) pairM18040s0.second).intValue());
        } else {
            if (this.f17105o.m18030H0(new d30() { // from class: l.ltm0
                public final void call() {
                    this.f16411a.m18606q();
                }
            })) {
                return;
            }
            m18606q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m18608u(View view) {
        o6j0.c("e_voice_hang_up", "p_voice_call", new o6j0.a[0]);
        this.f17105o.m18038q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m18609v(View view) {
        o6j0.c("e_voice_callme_no", "p_voice_callme", new o6j0.a[0]);
        this.f17105o.m18037p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m18610w(View view) {
        o6j0.c("e_voice_talking_hangup", "p_voice_talking", new o6j0.a[0]);
        this.f17105o.m18039r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m18611x(View view) {
        this.f17105o.m18029G0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m18612y(View view) {
        this.f17105o.m18041u0();
    }

    /* JADX INFO: renamed from: A */
    public void m18613A() {
        this.f17097g.setVisibility(8);
        this.f17095e.setVisibility(0);
        this.f17100j.setVisibility(8);
        this.f17094d.setText(R.string.I6);
    }

    /* JADX INFO: renamed from: B */
    public void m18614B() {
        this.f17097g.setVisibility(8);
        this.f17095e.setVisibility(8);
        this.f17100j.setVisibility(0);
    }

    /* JADX INFO: renamed from: C */
    public void m18615C(User user) {
        qib0.G.L0(this.f17092b, user.picture(0).profileMiddle().formatted());
        this.f17093c.setText(user.name);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m18616C0() {
        return this.f17104n;
    }

    /* JADX INFO: renamed from: E */
    public void m18617E(String str) {
        this.f17094d.setText(str);
    }

    /* JADX INFO: renamed from: F */
    public void m18618F(boolean z) {
        VImage vImage = this.f17103m;
        if (z) {
            vImage.setImageDrawable(e16.e(this.f17104n, c3c0.L0));
        } else {
            vImage.setImageDrawable(e16.e(this.f17104n, c3c0.M0));
        }
    }

    /* JADX INFO: renamed from: G */
    public void m18619G(boolean z) {
        VImage vImage = this.f17101k;
        if (z) {
            vImage.setImageDrawable(e16.e(this.f17104n, c3c0.N0));
        } else {
            vImage.setImageDrawable(e16.e(this.f17104n, c3c0.O0));
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m18621k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m18621k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ntm0.b(this, layoutInflater, viewGroup);
    }

    @NonNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f17104n;
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m18620i1(lsm0 lsm0Var) {
        this.f17105o = lsm0Var;
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void m18606q() {
        o6j0.c("e_voice_callme_yes", "p_voice_callme", new o6j0.a[]{o6j0.a.h("channel", tqm0.m22637p().m22644j())});
        this.f17105o.m18042x0();
    }

    /* JADX INFO: renamed from: r */
    public void m18625r() {
        xdl0.E0(this.f17091a, new View.OnClickListener() { // from class: l.etm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12685a.m18605p(view);
            }
        });
        xdl0.E0(this.f17099i, new View.OnClickListener() { // from class: l.ftm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13161a.m18607s(view);
            }
        });
        xdl0.E0(this.f17096f, new View.OnClickListener() { // from class: l.gtm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13747a.m18608u(view);
            }
        });
        xdl0.E0(this.f17098h, new View.OnClickListener() { // from class: l.htm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14248a.m18609v(view);
            }
        });
        xdl0.E0(this.f17102l, new View.OnClickListener() { // from class: l.itm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14802a.m18610w(view);
            }
        });
        xdl0.E0(this.f17101k, new View.OnClickListener() { // from class: l.jtm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15324a.m18611x(view);
            }
        });
        xdl0.E0(this.f17103m, new View.OnClickListener() { // from class: l.ktm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15854a.m18612y(view);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public void m18626z() {
        this.f17097g.setVisibility(0);
        this.f17095e.setVisibility(8);
        this.f17100j.setVisibility(8);
        this.f17094d.setText(R.string.M6);
    }

    public void destroy() {
    }
}
