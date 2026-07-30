package p149l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.verification.remind.view.SimpleUpdateAvatarView;
import p147v.VCheckBox;
import p147v.VLinear;
import p147v.VText;
import p147v.VText_NoTopPadding;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class kl1 implements s7m<el1> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f123618a;

    /* JADX INFO: renamed from: b */
    public VText_Default_Bold f123619b;

    /* JADX INFO: renamed from: c */
    public SimpleUpdateAvatarView f123620c;

    /* JADX INFO: renamed from: d */
    public VText f123621d;

    /* JADX INFO: renamed from: e */
    public VText f123622e;

    /* JADX INFO: renamed from: f */
    public VText f123623f;

    /* JADX INFO: renamed from: g */
    public VText_Medium f123624g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f123625h;

    /* JADX INFO: renamed from: i */
    public VLinear f123626i;

    /* JADX INFO: renamed from: j */
    public VCheckBox f123627j;

    /* JADX INFO: renamed from: k */
    public VText_NoTopPadding f123628k;

    /* JADX INFO: renamed from: l */
    public yk5 f123629l;

    /* JADX INFO: renamed from: m */
    public el1 f123630m;

    /* JADX INFO: renamed from: n */
    public Act f123631n;

    /* JADX INFO: renamed from: l.kl1$a */
    public class ViewOnClickListenerC18042a implements View.OnClickListener {
        public ViewOnClickListenerC18042a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            kl1.this.f123627j.setChecked(true);
            kl1.this.f123629l.dismiss();
        }
    }

    public kl1(Act act) {
        this.f123631n = act;
    }

    /* JADX INFO: renamed from: k */
    private void m146368k() {
        this.f123618a.setLeftIconAsBack(this.f123631n);
        this.f123618a.setTitle(this.f123630m.m117061o0());
    }

    /* JADX INFO: renamed from: l */
    private void m146369l() {
        this.f123618a.setLeftIconResource(x2c0.f189827Vg);
        this.f123619b.setTextColor(Color.parseColor(Constants.BLACK));
        this.f123621d.setTextColor(Color.parseColor(Constants.BLACK));
        this.f123622e.setTextColor(Color.parseColor(Constants.BLACK));
        this.f123623f.setTextColor(Color.parseColor(Constants.BLACK));
        this.f123621d.setCompoundDrawablesWithIntrinsicBounds(0, x2c0.f190635v0, 0, 0);
        this.f123622e.setCompoundDrawablesWithIntrinsicBounds(0, x2c0.f190667w0, 0, 0);
        this.f123623f.setCompoundDrawablesWithIntrinsicBounds(0, x2c0.f190699x0, 0, 0);
        this.f123627j.setBackgroundResource(x2c0.f190730y);
        this.f123624g.setBackgroundResource(x2c0.f189858Wg);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f123631n;
    }

    /* JADX INFO: renamed from: i */
    public View m146370i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ll1.m150402b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m146370i(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(el1 el1Var) {
        this.f123630m = el1Var;
    }

    /* JADX INFO: renamed from: m */
    public void m146372m() {
        m146368k();
        this.f123628k.setText("我同意腾讯、阿里、火山采集我的面部信息并与头像比对，详见《真实头像认证协议》");
        cjj0.m107174b(this.f123628k, "《真实头像认证协议》", 855638016, new d30() { // from class: l.fl1
            @Override // p149l.d30
            public final void call() {
                this.f98117a.m146374p();
            }
        }, true);
        xdl0.m208329E0(this.f123627j, new View.OnClickListener() { // from class: l.gl1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103276a.m146376s(view);
            }
        });
        xdl0.m208329E0(this.f123624g, new View.OnClickListener() { // from class: l.hl1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108304a.m146377u(view);
            }
        });
        xdl0.m208329E0(this.f123625h, new View.OnClickListener() { // from class: l.il1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113760a.m146378v(view);
            }
        });
        if (this.f123630m.m117062p0() == 2) {
            xdl0.m208344M(this.f123626i, false);
        }
        if (upa.m194847z()) {
            m146369l();
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m146373n() {
        return this.f123627j.isChecked();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m146375q() {
        zvf0.m220399u("e_verify_privacy_agreement", "p_photo_confirmation_verification", j760.m140076a("is_selected", Boolean.valueOf(this.f123627j.isChecked())));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m146376s(View view) {
        view.post(new Runnable() { // from class: l.jl1
            @Override // java.lang.Runnable
            public final void run() {
                this.f118443a.m146375q();
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m146377u(View view) {
        this.f123630m.m117063q0();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m146378v(View view) {
        this.f123630m.m117060n0();
        zvf0.m220396r("e_change_photo_verification", "p_photo_confirmation_verification");
    }

    /* JADX INFO: renamed from: w */
    public void m146379w(lrj0.C18309b c18309b) {
        this.f123620c.m56092v(c18309b);
    }

    /* JADX INFO: renamed from: x */
    public void m146380x(boolean z) {
        if (z) {
            this.f123625h.setTextColor(-1);
            this.f123624g.setTextColor(1711276032);
            this.f123625h.setBackgroundResource(x2c0.f189858Wg);
            this.f123624g.setBackgroundResource(x2c0.f189774Tp);
            return;
        }
        this.f123624g.setTextColor(-1);
        this.f123625h.setTextColor(1711276032);
        this.f123624g.setBackgroundResource(x2c0.f189858Wg);
        this.f123625h.setBackgroundResource(x2c0.f189774Tp);
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void m146374p() {
        yk5 yk5Var = new yk5(getAct(), 1);
        this.f123629l = yk5Var;
        yk5Var.m215118D(new ViewOnClickListenerC18042a());
        this.f123629l.show();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
