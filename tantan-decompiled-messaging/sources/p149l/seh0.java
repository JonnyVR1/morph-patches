package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.account.SwitchAccountAct;
import com.p046p1.mobile.putong.core.p053ui.account.view.AccountView;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.RememberUserInfo;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton_FakeShadowSmall;
import p147v.VLinear;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class seh0 implements s7m<leh0>, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VLinear f164006a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f164007b;

    /* JADX INFO: renamed from: c */
    public TextView f164008c;

    /* JADX INFO: renamed from: d */
    public TextView f164009d;

    /* JADX INFO: renamed from: e */
    public AccountView f164010e;

    /* JADX INFO: renamed from: f */
    public AccountView f164011f;

    /* JADX INFO: renamed from: g */
    public VButton_FakeShadowSmall f164012g;

    /* JADX INFO: renamed from: h */
    public SwitchAccountAct f164013h;

    /* JADX INFO: renamed from: i */
    public boolean f164014i = false;

    /* JADX INFO: renamed from: j */
    public leh0 f164015j;

    public seh0(SwitchAccountAct switchAccountAct) {
        this.f164013h = switchAccountAct;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m183637d() {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m183638e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m183640n(View view) {
        act().onBackPressed();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f164013h;
    }

    /* JADX INFO: renamed from: i */
    public View m183641i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return teh0.m188500b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m183641i(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public SwitchAccountAct act() {
        return this.f164013h;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(leh0 leh0Var) {
        this.f164015j = leh0Var;
    }

    /* JADX INFO: renamed from: l */
    public void m183644l(boolean z) {
        if (z) {
            this.f164014i = false;
        }
        this.f164010e.setClickable(z);
        this.f164011f.setClickable(z);
        this.f164012g.setClickable(z);
    }

    /* JADX INFO: renamed from: m */
    public void m183645m(final RememberUserInfo rememberUserInfo, RememberUserInfo rememberUserInfo2) {
        this.f164007b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.meh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133420a.m183640n(view);
            }
        });
        this.f164010e.setData(rememberUserInfo);
        this.f164010e.setOnClickListener(this);
        this.f164011f.setData(rememberUserInfo2);
        this.f164011f.setOnClickListener(this);
        if (NullChecker.m81303a(rememberUserInfo2)) {
            this.f164012g.setVisibility(0);
            xdl0.m208329E0(this.f164012g, new View.OnClickListener() { // from class: l.neh0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f138615a.m183648s(rememberUserInfo, view);
                }
            });
        }
        m183649u(rememberUserInfo, rememberUserInfo2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m183644l(false);
        if (this.f164014i) {
            return;
        }
        this.f164014i = true;
        if (view == this.f164010e) {
            this.f164015j.m149537o0();
        } else if (view == this.f164011f) {
            this.f164015j.m149538p0();
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m183646p() {
        RememberUserInfo rememberUserInfoM149541s0 = this.f164015j.m149541s0();
        m183651w(this.f164010e.m44201d(new d30() { // from class: l.reh0
            @Override // p149l.d30
            public final void call() {
                seh0.m183638e();
            }
        }));
        this.f164010e.setData(rememberUserInfoM149541s0);
        this.f164011f.setData(null);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m183647q() {
        this.f164015j.m149542t0();
        m183651w(this.f164011f.m44201d(new d30() { // from class: l.qeh0
            @Override // p149l.d30
            public final void call() {
                seh0.m183637d();
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m183648s(RememberUserInfo rememberUserInfo, View view) {
        m183651w(!this.f164015j.m149539q0(rememberUserInfo) ? this.f164010e.m44201d(new d30() { // from class: l.oeh0
            @Override // p149l.d30
            public final void call() {
                this.f143315a.m183646p();
            }
        }) : this.f164011f.m44201d(new d30() { // from class: l.peh0
            @Override // p149l.d30
            public final void call() {
                this.f148439a.m183647q();
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public void m183649u(RememberUserInfo rememberUserInfo, RememberUserInfo rememberUserInfo2) {
        if (act().toolbar() == null) {
            return;
        }
        if (this.f164015j.m149539q0(rememberUserInfo) || this.f164015j.m149539q0(rememberUserInfo2)) {
            xdl0.m208345M0(this.f164007b, true);
        } else {
            xdl0.m208345M0(this.f164007b, false);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m183650v(RememberUserInfo rememberUserInfo, RememberUserInfo rememberUserInfo2) {
        act().setSwipeBackEnable(false);
        this.f164010e.setData(rememberUserInfo);
        this.f164011f.setData(rememberUserInfo2);
        m183649u(rememberUserInfo, rememberUserInfo2);
    }

    /* JADX INFO: renamed from: w */
    public final void m183651w(boolean z) {
        TextView textView = this.f164008c;
        if (z) {
            textView.setText(act().getResources().getText(R$string.f27789U3));
            this.f164012g.setText(act().getResources().getText(R$string.f27795W));
            this.f164009d.setVisibility(0);
            this.f164010e.setClickable(false);
            this.f164011f.setClickable(false);
            return;
        }
        textView.setText(act().getResources().getText(R$string.f27784T3));
        this.f164009d.setVisibility(4);
        this.f164010e.setClickable(true);
        this.f164011f.setClickable(true);
        boolean zM149544x0 = this.f164015j.m149544x0();
        VButton_FakeShadowSmall vButton_FakeShadowSmall = this.f164012g;
        if (zM149544x0) {
            vButton_FakeShadowSmall.setVisibility(8);
        } else {
            vButton_FakeShadowSmall.setVisibility(0);
            this.f164012g.setText(act().getResources().getText(R$string.f27789U3));
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
