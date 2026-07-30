package p153l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.verification.remind.view.SimpleUpdateAvatarView;
import p151v.VCheckBox;
import p151v.VLinear;
import p151v.VText;
import p151v.VText_NoTopPadding;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class rl1 implements iam<ll1> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f163668a;

    /* JADX INFO: renamed from: b */
    public VText_Default_Bold f163669b;

    /* JADX INFO: renamed from: c */
    public SimpleUpdateAvatarView f163670c;

    /* JADX INFO: renamed from: d */
    public VText f163671d;

    /* JADX INFO: renamed from: e */
    public VText f163672e;

    /* JADX INFO: renamed from: f */
    public VText f163673f;

    /* JADX INFO: renamed from: g */
    public VText_Medium f163674g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f163675h;

    /* JADX INFO: renamed from: i */
    public VLinear f163676i;

    /* JADX INFO: renamed from: j */
    public VCheckBox f163677j;

    /* JADX INFO: renamed from: k */
    public VText_NoTopPadding f163678k;

    /* JADX INFO: renamed from: l */
    public bm5 f163679l;

    /* JADX INFO: renamed from: m */
    public ll1 f163680m;

    /* JADX INFO: renamed from: n */
    public Act f163681n;

    /* JADX INFO: renamed from: l.rl1$a */
    public class ViewOnClickListenerC19861a implements View.OnClickListener {
        public ViewOnClickListenerC19861a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            rl1.this.f163677j.setChecked(true);
            rl1.this.f163679l.dismiss();
        }
    }

    public rl1(Act act) {
        this.f163681n = act;
    }

    /* JADX INFO: renamed from: k */
    private void m181892k() {
        this.f163668a.setLeftIconAsBack(this.f163681n);
        this.f163668a.setTitle(this.f163680m.m154691o0());
    }

    /* JADX INFO: renamed from: l */
    private void m181893l() {
        this.f163668a.setLeftIconResource(dbc0.f86282Jh);
        this.f163669b.setTextColor(Color.parseColor(Constants.BLACK));
        this.f163671d.setTextColor(Color.parseColor(Constants.BLACK));
        this.f163672e.setTextColor(Color.parseColor(Constants.BLACK));
        this.f163673f.setTextColor(Color.parseColor(Constants.BLACK));
        this.f163671d.setCompoundDrawablesWithIntrinsicBounds(0, dbc0.f87530w0, 0, 0);
        this.f163672e.setCompoundDrawablesWithIntrinsicBounds(0, dbc0.f87562x0, 0, 0);
        this.f163673f.setCompoundDrawablesWithIntrinsicBounds(0, dbc0.f87594y0, 0, 0);
        this.f163677j.setBackgroundResource(dbc0.f87625z);
        this.f163674g.setBackgroundResource(dbc0.f86314Kh);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f163681n;
    }

    /* JADX INFO: renamed from: i */
    public View m181894i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return sl1.m186551b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m181894i(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ll1 ll1Var) {
        this.f163680m = ll1Var;
    }

    /* JADX INFO: renamed from: m */
    public void m181896m() {
        m181892k();
        this.f163678k.setText("我同意腾讯、阿里、火山采集我的面部信息并与头像比对，详见《真实头像认证协议》");
        fsj0.m127200b(this.f163678k, "《真实头像认证协议》", 855638016, new x20() { // from class: l.ml1
            @Override // p153l.x20
            public final void call() {
                this.f137354a.m181898p();
            }
        }, true);
        bnl0.m105509E0(this.f163677j, new View.OnClickListener() { // from class: l.nl1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142503a.m181900s(view);
            }
        });
        bnl0.m105509E0(this.f163674g, new View.OnClickListener() { // from class: l.ol1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147807a.m181901u(view);
            }
        });
        bnl0.m105509E0(this.f163675h, new View.OnClickListener() { // from class: l.pl1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152980a.m181902v(view);
            }
        });
        if (this.f163680m.m154692p0() == 2) {
            bnl0.m105524M(this.f163676i, false);
        }
        if (gra.m131778z()) {
            m181893l();
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m181897n() {
        return this.f163677j.isChecked();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m181899q() {
        i4g0.m138523u("e_verify_privacy_agreement", "p_photo_confirmation_verification", pf60.m172085a("is_selected", Boolean.valueOf(this.f163677j.isChecked())));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m181900s(View view) {
        view.post(new Runnable() { // from class: l.ql1
            @Override // java.lang.Runnable
            public final void run() {
                this.f158195a.m181899q();
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m181901u(View view) {
        this.f163680m.m154693q0();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m181902v(View view) {
        this.f163680m.m154690n0();
        i4g0.m138520r("e_change_photo_verification", "p_photo_confirmation_verification");
    }

    /* JADX INFO: renamed from: w */
    public void m181903w(p0k0.C19267b c19267b) {
        this.f163670c.m57275v(c19267b);
    }

    /* JADX INFO: renamed from: x */
    public void m181904x(boolean z) {
        if (z) {
            this.f163675h.setTextColor(-1);
            this.f163674g.setTextColor(1711276032);
            this.f163675h.setBackgroundResource(dbc0.f86314Kh);
            this.f163674g.setBackgroundResource(dbc0.f86227Hq);
            return;
        }
        this.f163674g.setTextColor(-1);
        this.f163675h.setTextColor(1711276032);
        this.f163674g.setBackgroundResource(dbc0.f86314Kh);
        this.f163675h.setBackgroundResource(dbc0.f86227Hq);
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void m181898p() {
        bm5 bm5Var = new bm5(getAct(), 1);
        this.f163679l = bm5Var;
        bm5Var.m104999D(new ViewOnClickListenerC19861a());
        this.f163679l.show();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
