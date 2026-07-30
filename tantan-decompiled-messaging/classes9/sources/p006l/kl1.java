package p006l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p004ui.verification.remind.view.SimpleUpdateAvatarView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.VText_Default_Bold;
import com.p1.mobile.putong.core.ui.VText_Medium;
import l.cjj0;
import l.d30;
import l.j760;
import l.ll1;
import l.lrj0;
import l.s7m;
import l.xdl0;
import l.yk5;
import l.zvf0;
import v.VCheckBox;
import v.VLinear;
import v.VText;
import v.VText_NoTopPadding;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class kl1 implements s7m<el1> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f15872a;

    /* JADX INFO: renamed from: b */
    public VText_Default_Bold f15873b;

    /* JADX INFO: renamed from: c */
    public SimpleUpdateAvatarView f15874c;

    /* JADX INFO: renamed from: d */
    public VText f15875d;

    /* JADX INFO: renamed from: e */
    public VText f15876e;

    /* JADX INFO: renamed from: f */
    public VText f15877f;

    /* JADX INFO: renamed from: g */
    public VText_Medium f15878g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f15879h;

    /* JADX INFO: renamed from: i */
    public VLinear f15880i;

    /* JADX INFO: renamed from: j */
    public VCheckBox f15881j;

    /* JADX INFO: renamed from: k */
    public VText_NoTopPadding f15882k;

    /* JADX INFO: renamed from: l */
    public yk5 f15883l;

    /* JADX INFO: renamed from: m */
    public el1 f15884m;

    /* JADX INFO: renamed from: n */
    public Act f15885n;

    /* JADX INFO: renamed from: l.kl1$a */
    public class ViewOnClickListenerC0937a implements View.OnClickListener {
        public ViewOnClickListenerC0937a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            kl1.this.f15881j.setChecked(true);
            kl1.this.f15883l.dismiss();
        }
    }

    public kl1(Act act) {
        this.f15885n = act;
    }

    /* JADX INFO: renamed from: k */
    private void m18169k() {
        this.f15872a.setLeftIconAsBack(this.f15885n);
        this.f15872a.setTitle(this.f15884m.m14656o0());
    }

    /* JADX INFO: renamed from: l */
    private void m18170l() {
        this.f15872a.setLeftIconResource(x2c0.f26363Vg);
        this.f15873b.setTextColor(Color.parseColor("#000000"));
        this.f15875d.setTextColor(Color.parseColor("#000000"));
        this.f15876e.setTextColor(Color.parseColor("#000000"));
        this.f15877f.setTextColor(Color.parseColor("#000000"));
        this.f15875d.setCompoundDrawablesWithIntrinsicBounds(0, x2c0.f27171v0, 0, 0);
        this.f15876e.setCompoundDrawablesWithIntrinsicBounds(0, x2c0.f27203w0, 0, 0);
        this.f15877f.setCompoundDrawablesWithIntrinsicBounds(0, x2c0.f27235x0, 0, 0);
        this.f15881j.setBackgroundResource(x2c0.f27266y);
        this.f15878g.setBackgroundResource(x2c0.f26394Wg);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m18171C0() {
        return this.f15885n;
    }

    /* JADX INFO: renamed from: i */
    public View m18172i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ll1.b(this, layoutInflater, viewGroup);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m18172i(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m18173i1(el1 el1Var) {
        this.f15884m = el1Var;
    }

    /* JADX INFO: renamed from: m */
    public void m18175m() {
        m18169k();
        this.f15882k.setText("我同意腾讯、阿里、火山采集我的面部信息并与头像比对，详见《真实头像认证协议》");
        cjj0.b(this.f15882k, "《真实头像认证协议》", 855638016, new d30() { // from class: l.fl1
            public final void call() {
                this.f12752a.m18177p();
            }
        }, true);
        xdl0.E0(this.f15881j, new View.OnClickListener() { // from class: l.gl1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13353a.m18179s(view);
            }
        });
        xdl0.E0(this.f15878g, new View.OnClickListener() { // from class: l.hl1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13930a.m18180u(view);
            }
        });
        xdl0.E0(this.f15879h, new View.OnClickListener() { // from class: l.il1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14539a.m18181v(view);
            }
        });
        if (this.f15884m.m14657p0() == 2) {
            xdl0.M(this.f15880i, false);
        }
        if (upa.m25545z()) {
            m18170l();
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m18176n() {
        return this.f15881j.isChecked();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m18178q() {
        zvf0.u("e_verify_privacy_agreement", "p_photo_confirmation_verification", new j760[]{j760.a("is_selected", Boolean.valueOf(this.f15881j.isChecked()))});
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m18179s(View view) {
        view.post(new Runnable() { // from class: l.jl1
            @Override // java.lang.Runnable
            public final void run() {
                this.f15207a.m18178q();
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m18180u(View view) {
        this.f15884m.m14658q0();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m18181v(View view) {
        this.f15884m.m14655n0();
        zvf0.r("e_change_photo_verification", "p_photo_confirmation_verification");
    }

    /* JADX INFO: renamed from: w */
    public void m18182w(lrj0.b bVar) {
        this.f15874c.m9517v(bVar);
    }

    /* JADX INFO: renamed from: x */
    public void m18183x(boolean z) {
        if (z) {
            this.f15879h.setTextColor(-1);
            this.f15878g.setTextColor(1711276032);
            this.f15879h.setBackgroundResource(x2c0.f26394Wg);
            this.f15878g.setBackgroundResource(x2c0.f26310Tp);
            return;
        }
        this.f15878g.setTextColor(-1);
        this.f15879h.setTextColor(1711276032);
        this.f15878g.setBackgroundResource(x2c0.f26394Wg);
        this.f15879h.setBackgroundResource(x2c0.f26310Tp);
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void m18177p() {
        yk5 yk5Var = new yk5(act(), 1);
        this.f15883l = yk5Var;
        yk5Var.D(new ViewOnClickListenerC0937a());
        this.f15883l.show();
    }

    public void destroy() {
    }
}
