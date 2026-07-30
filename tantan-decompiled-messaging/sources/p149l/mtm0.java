package p149l;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.User;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class mtm0 implements s7m<lsm0> {

    /* JADX INFO: renamed from: a */
    public ImageView f135625a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f135626b;

    /* JADX INFO: renamed from: c */
    public VText f135627c;

    /* JADX INFO: renamed from: d */
    public VText f135628d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f135629e;

    /* JADX INFO: renamed from: f */
    public VImage f135630f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f135631g;

    /* JADX INFO: renamed from: h */
    public VImage f135632h;

    /* JADX INFO: renamed from: i */
    public VImage f135633i;

    /* JADX INFO: renamed from: j */
    public ConstraintLayout f135634j;

    /* JADX INFO: renamed from: k */
    public VImage f135635k;

    /* JADX INFO: renamed from: l */
    public VImage f135636l;

    /* JADX INFO: renamed from: m */
    public VImage f135637m;

    /* JADX INFO: renamed from: n */
    public final PutongAct f135638n;

    /* JADX INFO: renamed from: o */
    public lsm0 f135639o;

    public mtm0(PutongAct putongAct) {
        this.f135638n = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m156289p(View view) {
        this.f135639o.m151621O0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m156291s(View view) {
        Pair<Boolean, Integer> pairM151625s0 = this.f135639o.m151625s0();
        if (((Boolean) pairM151625s0.first).booleanValue()) {
            lsi0.m151593w(((Integer) pairM151625s0.second).intValue());
        } else {
            if (this.f135639o.m151616H0(new d30() { // from class: l.ltm0
                @Override // p149l.d30
                public final void call() {
                    this.f129981a.m156290q();
                }
            })) {
                return;
            }
            m156290q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m156292u(View view) {
        o6j0.m162859c("e_voice_hang_up", "p_voice_call", new o6j0.C18854a[0]);
        this.f135639o.m151623q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m156293v(View view) {
        o6j0.m162859c("e_voice_callme_no", "p_voice_callme", new o6j0.C18854a[0]);
        this.f135639o.m151622p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m156294w(View view) {
        o6j0.m162859c("e_voice_talking_hangup", "p_voice_talking", new o6j0.C18854a[0]);
        this.f135639o.m151624r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m156295x(View view) {
        this.f135639o.m151615G0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m156296y(View view) {
        this.f135639o.m151626u0();
    }

    /* JADX INFO: renamed from: A */
    public void m156297A() {
        this.f135631g.setVisibility(8);
        this.f135629e.setVisibility(0);
        this.f135634j.setVisibility(8);
        this.f135628d.setText(R$string.f20779I6);
    }

    /* JADX INFO: renamed from: B */
    public void m156298B() {
        this.f135631g.setVisibility(8);
        this.f135629e.setVisibility(8);
        this.f135634j.setVisibility(0);
    }

    /* JADX INFO: renamed from: C */
    public void m156299C(User user) {
        qib0.f154691G.m102331L0(this.f135626b, user.picture(0).profileMiddle().formatted());
        this.f135627c.setText(user.name);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f135638n;
    }

    /* JADX INFO: renamed from: E */
    public void m156300E(String str) {
        this.f135628d.setText(str);
    }

    /* JADX INFO: renamed from: F */
    public void m156301F(boolean z) {
        VImage vImage = this.f135637m;
        if (z) {
            vImage.setImageDrawable(e16.m114377e(this.f135638n, c3c0.f78567L0));
        } else {
            vImage.setImageDrawable(e16.m114377e(this.f135638n, c3c0.f78576M0));
        }
    }

    /* JADX INFO: renamed from: G */
    public void m156302G(boolean z) {
        VImage vImage = this.f135635k;
        if (z) {
            vImage.setImageDrawable(e16.m114377e(this.f135638n, c3c0.f78585N0));
        } else {
            vImage.setImageDrawable(e16.m114377e(this.f135638n, c3c0.f78594O0));
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m156303k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m156303k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ntm0.m161395b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @NonNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f135638n;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(lsm0 lsm0Var) {
        this.f135639o = lsm0Var;
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void m156290q() {
        o6j0.m162859c("e_voice_callme_yes", "p_voice_callme", o6j0.C18854a.m162878h("channel", tqm0.m190131p().m190138j()));
        this.f135639o.m151627x0();
    }

    /* JADX INFO: renamed from: r */
    public void m156307r() {
        xdl0.m208329E0(this.f135625a, new View.OnClickListener() { // from class: l.etm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93160a.m156289p(view);
            }
        });
        xdl0.m208329E0(this.f135633i, new View.OnClickListener() { // from class: l.ftm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99224a.m156291s(view);
            }
        });
        xdl0.m208329E0(this.f135630f, new View.OnClickListener() { // from class: l.gtm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104325a.m156292u(view);
            }
        });
        xdl0.m208329E0(this.f135632h, new View.OnClickListener() { // from class: l.htm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109402a.m156293v(view);
            }
        });
        xdl0.m208329E0(this.f135636l, new View.OnClickListener() { // from class: l.itm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114893a.m156294w(view);
            }
        });
        xdl0.m208329E0(this.f135635k, new View.OnClickListener() { // from class: l.jtm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119651a.m156295x(view);
            }
        });
        xdl0.m208329E0(this.f135637m, new View.OnClickListener() { // from class: l.ktm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124599a.m156296y(view);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public void m156308z() {
        this.f135631g.setVisibility(0);
        this.f135629e.setVisibility(8);
        this.f135634j.setVisibility(8);
        this.f135628d.setText(R$string.f20811M6);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
