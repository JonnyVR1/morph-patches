package p153l;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.User;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class q2n0 implements iam<p1n0> {

    /* JADX INFO: renamed from: a */
    public ImageView f155359a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f155360b;

    /* JADX INFO: renamed from: c */
    public VText f155361c;

    /* JADX INFO: renamed from: d */
    public VText f155362d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f155363e;

    /* JADX INFO: renamed from: f */
    public VImage f155364f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f155365g;

    /* JADX INFO: renamed from: h */
    public VImage f155366h;

    /* JADX INFO: renamed from: i */
    public VImage f155367i;

    /* JADX INFO: renamed from: j */
    public ConstraintLayout f155368j;

    /* JADX INFO: renamed from: k */
    public VImage f155369k;

    /* JADX INFO: renamed from: l */
    public VImage f155370l;

    /* JADX INFO: renamed from: m */
    public VImage f155371m;

    /* JADX INFO: renamed from: n */
    public final PutongAct f155372n;

    /* JADX INFO: renamed from: o */
    public p1n0 f155373o;

    public q2n0(PutongAct putongAct) {
        this.f155372n = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m175068p(View view) {
        this.f155373o.m170241O0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m175070s(View view) {
        Pair<Boolean, Integer> pairM170245s0 = this.f155373o.m170245s0();
        if (((Boolean) pairM170245s0.first).booleanValue()) {
            o1j0.m165649w(((Integer) pairM170245s0.second).intValue());
        } else {
            if (this.f155373o.m170236H0(new x20() { // from class: l.p2n0
                @Override // p153l.x20
                public final void call() {
                    this.f150283a.m175069q();
                }
            })) {
                return;
            }
            m175069q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m175071u(View view) {
        sfj0.m185596c("e_voice_hang_up", "p_voice_call", new sfj0.C20032a[0]);
        this.f155373o.m170243q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m175072v(View view) {
        sfj0.m185596c("e_voice_callme_no", "p_voice_callme", new sfj0.C20032a[0]);
        this.f155373o.m170242p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m175073w(View view) {
        sfj0.m185596c("e_voice_talking_hangup", "p_voice_talking", new sfj0.C20032a[0]);
        this.f155373o.m170244r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m175074x(View view) {
        this.f155373o.m170235G0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m175075y(View view) {
        this.f155373o.m170246u0();
    }

    /* JADX INFO: renamed from: A */
    public void m175076A() {
        this.f155365g.setVisibility(8);
        this.f155363e.setVisibility(0);
        this.f155368j.setVisibility(8);
        this.f155362d.setText(R$string.f21521I6);
    }

    /* JADX INFO: renamed from: B */
    public void m175077B() {
        this.f155365g.setVisibility(8);
        this.f155363e.setVisibility(8);
        this.f155368j.setVisibility(0);
    }

    /* JADX INFO: renamed from: C */
    public void m175078C(User user) {
        uqb0.f180374G.m127115L0(this.f155360b, user.picture(0).profileMiddle().formatted());
        this.f155361c.setText(user.name);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f155372n;
    }

    /* JADX INFO: renamed from: E */
    public void m175079E(String str) {
        this.f155362d.setText(str);
    }

    /* JADX INFO: renamed from: F */
    public void m175080F(boolean z) {
        VImage vImage = this.f155371m;
        if (z) {
            vImage.setImageDrawable(j26.m143192e(this.f155372n, ibc0.f113842L0));
        } else {
            vImage.setImageDrawable(j26.m143192e(this.f155372n, ibc0.f113851M0));
        }
    }

    /* JADX INFO: renamed from: G */
    public void m175081G(boolean z) {
        VImage vImage = this.f155369k;
        if (z) {
            vImage.setImageDrawable(j26.m143192e(this.f155372n, ibc0.f113860N0));
        } else {
            vImage.setImageDrawable(j26.m143192e(this.f155372n, ibc0.f113869O0));
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m175082k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m175082k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return r2n0.m179544b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @NonNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f155372n;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(p1n0 p1n0Var) {
        this.f155373o = p1n0Var;
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void m175069q() {
        sfj0.m185596c("e_voice_callme_yes", "p_voice_callme", sfj0.C20032a.m185615h("channel", xzm0.m213760p().m213767j()));
        this.f155373o.m170247x0();
    }

    /* JADX INFO: renamed from: r */
    public void m175086r() {
        bnl0.m105509E0(this.f155359a, new View.OnClickListener() { // from class: l.i2n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112659a.m175068p(view);
            }
        });
        bnl0.m105509E0(this.f155367i, new View.OnClickListener() { // from class: l.j2n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118073a.m175070s(view);
            }
        });
        bnl0.m105509E0(this.f155364f, new View.OnClickListener() { // from class: l.k2n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123625a.m175071u(view);
            }
        });
        bnl0.m105509E0(this.f155366h, new View.OnClickListener() { // from class: l.l2n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129787a.m175072v(view);
            }
        });
        bnl0.m105509E0(this.f155370l, new View.OnClickListener() { // from class: l.m2n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134590a.m175073w(view);
            }
        });
        bnl0.m105509E0(this.f155369k, new View.OnClickListener() { // from class: l.n2n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139877a.m175074x(view);
            }
        });
        bnl0.m105509E0(this.f155371m, new View.OnClickListener() { // from class: l.o2n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f144756a.m175075y(view);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public void m175087z() {
        this.f155365g.setVisibility(0);
        this.f155363e.setVisibility(8);
        this.f155368j.setVisibility(8);
        this.f155362d.setText(R$string.f21553M6);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
