package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p004ui.account.view.AccountView;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.core.ui.account.SwitchAccountAct;
import com.p1.mobile.putong.data.RememberUserInfo;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.s7m;
import l.teh0;
import l.xdl0;
import v.VButton_FakeShadowSmall;
import v.VLinear;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class seh0 implements s7m<leh0>, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VLinear f21273a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f21274b;

    /* JADX INFO: renamed from: c */
    public TextView f21275c;

    /* JADX INFO: renamed from: d */
    public TextView f21276d;

    /* JADX INFO: renamed from: e */
    public AccountView f21277e;

    /* JADX INFO: renamed from: f */
    public AccountView f21278f;

    /* JADX INFO: renamed from: g */
    public VButton_FakeShadowSmall f21279g;

    /* JADX INFO: renamed from: h */
    public SwitchAccountAct f21280h;

    /* JADX INFO: renamed from: i */
    public boolean f21281i = false;

    /* JADX INFO: renamed from: j */
    public leh0 f21282j;

    public seh0(SwitchAccountAct switchAccountAct) {
        this.f21280h = switchAccountAct;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m23725d() {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m23726e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m23728n(View view) {
        act().onBackPressed();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m23729C0() {
        return this.f21280h;
    }

    /* JADX INFO: renamed from: i */
    public View m23730i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return teh0.b(this, layoutInflater, viewGroup);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m23730i(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public SwitchAccountAct act() {
        return this.f21280h;
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m23731i1(leh0 leh0Var) {
        this.f21282j = leh0Var;
    }

    /* JADX INFO: renamed from: l */
    public void m23734l(boolean z) {
        if (z) {
            this.f21281i = false;
        }
        this.f21277e.setClickable(z);
        this.f21278f.setClickable(z);
        this.f21279g.setClickable(z);
    }

    /* JADX INFO: renamed from: m */
    public void m23735m(final RememberUserInfo rememberUserInfo, RememberUserInfo rememberUserInfo2) {
        this.f21274b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.meh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16943a.m23728n(view);
            }
        });
        this.f21277e.setData(rememberUserInfo);
        this.f21277e.setOnClickListener(this);
        this.f21278f.setData(rememberUserInfo2);
        this.f21278f.setOnClickListener(this);
        if (NullChecker.a(rememberUserInfo2)) {
            this.f21279g.setVisibility(0);
            xdl0.E0(this.f21279g, new View.OnClickListener() { // from class: l.neh0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f17631a.m23738s(rememberUserInfo, view);
                }
            });
        }
        m23739u(rememberUserInfo, rememberUserInfo2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m23734l(false);
        if (this.f21281i) {
            return;
        }
        this.f21281i = true;
        if (view == this.f21277e) {
            this.f21282j.m18721o0();
        } else if (view == this.f21278f) {
            this.f21282j.m18722p0();
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m23736p() {
        RememberUserInfo rememberUserInfoM18725s0 = this.f21282j.m18725s0();
        m23741w(this.f21277e.m7149d(new d30() { // from class: l.reh0
            public final void call() {
                seh0.m23726e();
            }
        }));
        this.f21277e.setData(rememberUserInfoM18725s0);
        this.f21278f.setData(null);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m23737q() {
        this.f21282j.m18726t0();
        m23741w(this.f21278f.m7149d(new d30() { // from class: l.qeh0
            public final void call() {
                seh0.m23725d();
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m23738s(RememberUserInfo rememberUserInfo, View view) {
        m23741w(!this.f21282j.m18723q0(rememberUserInfo) ? this.f21277e.m7149d(new d30() { // from class: l.oeh0
            public final void call() {
                this.f18181a.m23736p();
            }
        }) : this.f21278f.m7149d(new d30() { // from class: l.peh0
            public final void call() {
                this.f18700a.m23737q();
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public void m23739u(RememberUserInfo rememberUserInfo, RememberUserInfo rememberUserInfo2) {
        if (act().toolbar() == null) {
            return;
        }
        if (this.f21282j.m18723q0(rememberUserInfo) || this.f21282j.m18723q0(rememberUserInfo2)) {
            xdl0.M0(this.f21274b, true);
        } else {
            xdl0.M0(this.f21274b, false);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m23740v(RememberUserInfo rememberUserInfo, RememberUserInfo rememberUserInfo2) {
        act().setSwipeBackEnable(false);
        this.f21277e.setData(rememberUserInfo);
        this.f21278f.setData(rememberUserInfo2);
        m23739u(rememberUserInfo, rememberUserInfo2);
    }

    /* JADX INFO: renamed from: w */
    public final void m23741w(boolean z) {
        TextView textView = this.f21275c;
        if (z) {
            textView.setText(act().getResources().getText(R.string.U3));
            this.f21279g.setText(act().getResources().getText(R.string.W));
            this.f21276d.setVisibility(0);
            this.f21277e.setClickable(false);
            this.f21278f.setClickable(false);
            return;
        }
        textView.setText(act().getResources().getText(R.string.T3));
        this.f21276d.setVisibility(4);
        this.f21277e.setClickable(true);
        this.f21278f.setClickable(true);
        boolean zM18728x0 = this.f21282j.m18728x0();
        VButton_FakeShadowSmall vButton_FakeShadowSmall = this.f21279g;
        if (zM18728x0) {
            vButton_FakeShadowSmall.setVisibility(8);
        } else {
            vButton_FakeShadowSmall.setVisibility(0);
            this.f21279g.setText(act().getResources().getText(R.string.U3));
        }
    }

    public void destroy() {
    }
}
