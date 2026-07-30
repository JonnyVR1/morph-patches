package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.account.SwitchAccountV2Act;
import com.p046p1.mobile.putong.core.p053ui.account.view.AccountViewV2;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.RememberUserInfo;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton_FakeShadowSmall;
import p147v.VImage;
import p147v.VLinear;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class lfh0 implements s7m<efh0>, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VLinear f127886a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f127887b;

    /* JADX INFO: renamed from: c */
    public VImage f127888c;

    /* JADX INFO: renamed from: d */
    public TextView f127889d;

    /* JADX INFO: renamed from: e */
    public TextView f127890e;

    /* JADX INFO: renamed from: f */
    public AccountViewV2 f127891f;

    /* JADX INFO: renamed from: g */
    public AccountViewV2 f127892g;

    /* JADX INFO: renamed from: h */
    public VButton_FakeShadowSmall f127893h;

    /* JADX INFO: renamed from: i */
    public SwitchAccountV2Act f127894i;

    /* JADX INFO: renamed from: j */
    public boolean f127895j = false;

    /* JADX INFO: renamed from: k */
    public efh0 f127896k;

    public lfh0(SwitchAccountV2Act switchAccountV2Act) {
        this.f127894i = switchAccountV2Act;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m149680a() {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m149681b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m149686n(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m149687p() {
        RememberUserInfo rememberUserInfoM116065s0 = this.f127896k.m116065s0();
        m149690w(this.f127891f.m44207d(new d30() { // from class: l.jfh0
            @Override // p149l.d30
            public final void call() {
                lfh0.m149680a();
            }
        }));
        this.f127891f.setData(rememberUserInfoM116065s0);
        this.f127892g.setData(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m149688q() {
        this.f127896k.m116066t0();
        m149690w(this.f127892g.m44207d(new d30() { // from class: l.kfh0
            @Override // p149l.d30
            public final void call() {
                lfh0.m149681b();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m149689s(RememberUserInfo rememberUserInfo, View view) {
        m149690w(!this.f127896k.m116064q0(rememberUserInfo) ? this.f127891f.m44207d(new d30() { // from class: l.hfh0
            @Override // p149l.d30
            public final void call() {
                this.f107481a.m149687p();
            }
        }) : this.f127892g.m44207d(new d30() { // from class: l.ifh0
            @Override // p149l.d30
            public final void call() {
                this.f113019a.m149688q();
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    private void m149690w(boolean z) {
        TextView textView = this.f127889d;
        if (z) {
            textView.setText(act().getResources().getText(R$string.f27789U3));
            this.f127893h.setText(act().getResources().getText(R$string.f27795W));
            this.f127890e.setVisibility(0);
            this.f127891f.setClickable(false);
            this.f127892g.setClickable(false);
            return;
        }
        textView.setText(act().getResources().getText(R$string.f27784T3));
        this.f127890e.setVisibility(4);
        this.f127891f.setClickable(true);
        this.f127892g.setClickable(true);
        boolean zM116068x0 = this.f127896k.m116068x0();
        VButton_FakeShadowSmall vButton_FakeShadowSmall = this.f127893h;
        if (zM116068x0) {
            vButton_FakeShadowSmall.setVisibility(8);
        } else {
            vButton_FakeShadowSmall.setVisibility(0);
            this.f127893h.setText(act().getResources().getText(R$string.f27789U3));
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f127894i;
    }

    /* JADX INFO: renamed from: i */
    public View m149691i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mfh0.m154390b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m149691i(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public SwitchAccountV2Act act() {
        return this.f127894i;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(efh0 efh0Var) {
        this.f127896k = efh0Var;
    }

    /* JADX INFO: renamed from: l */
    public void m149694l(boolean z) {
        if (z) {
            this.f127895j = false;
        }
        this.f127891f.setClickable(z);
        this.f127892g.setClickable(z);
        this.f127893h.setClickable(z);
    }

    /* JADX INFO: renamed from: m */
    public void m149695m(final RememberUserInfo rememberUserInfo, RememberUserInfo rememberUserInfo2) {
        this.f127887b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ffh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97266a.m149686n(view);
            }
        });
        this.f127891f.setData(rememberUserInfo);
        this.f127891f.setOnClickListener(this);
        this.f127892g.setData(rememberUserInfo2);
        this.f127892g.setOnClickListener(this);
        if (NullChecker.m81303a(rememberUserInfo2)) {
            this.f127893h.setVisibility(0);
            xdl0.m208329E0(this.f127893h, new View.OnClickListener() { // from class: l.gfh0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f102396a.m149689s(rememberUserInfo, view);
                }
            });
        }
        m149696u(rememberUserInfo, rememberUserInfo2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m149694l(false);
        if (this.f127895j) {
            return;
        }
        this.f127895j = true;
        if (view == this.f127891f) {
            this.f127896k.m116062o0();
        } else if (view == this.f127892g) {
            this.f127896k.m116063p0();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m149696u(RememberUserInfo rememberUserInfo, RememberUserInfo rememberUserInfo2) {
        if (act().toolbar() == null) {
            return;
        }
        if (this.f127896k.m116064q0(rememberUserInfo) || this.f127896k.m116064q0(rememberUserInfo2)) {
            xdl0.m208345M0(this.f127887b, true);
        } else {
            xdl0.m208345M0(this.f127887b, false);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m149697v(RememberUserInfo rememberUserInfo, RememberUserInfo rememberUserInfo2) {
        act().setSwipeBackEnable(false);
        this.f127891f.setData(rememberUserInfo);
        this.f127892g.setData(rememberUserInfo2);
        m149696u(rememberUserInfo, rememberUserInfo2);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
