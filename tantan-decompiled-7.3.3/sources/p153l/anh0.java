package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.account.SwitchAccountAct;
import com.p051p1.mobile.putong.core.p058ui.account.view.AccountView;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.RememberUserInfo;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton_FakeShadowSmall;
import p151v.VLinear;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class anh0 implements iam<tmh0>, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VLinear f72347a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f72348b;

    /* JADX INFO: renamed from: c */
    public TextView f72349c;

    /* JADX INFO: renamed from: d */
    public TextView f72350d;

    /* JADX INFO: renamed from: e */
    public AccountView f72351e;

    /* JADX INFO: renamed from: f */
    public AccountView f72352f;

    /* JADX INFO: renamed from: g */
    public VButton_FakeShadowSmall f72353g;

    /* JADX INFO: renamed from: h */
    public SwitchAccountAct f72354h;

    /* JADX INFO: renamed from: i */
    public boolean f72355i = false;

    /* JADX INFO: renamed from: j */
    public tmh0 f72356j;

    public anh0(SwitchAccountAct switchAccountAct) {
        this.f72354h = switchAccountAct;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m98967d() {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m98968e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m98970n(View view) {
        act().onBackPressed();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f72354h;
    }

    /* JADX INFO: renamed from: i */
    public View m98971i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bnh0.m105397b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m98971i(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public SwitchAccountAct act() {
        return this.f72354h;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(tmh0 tmh0Var) {
        this.f72356j = tmh0Var;
    }

    /* JADX INFO: renamed from: l */
    public void m98974l(boolean z) {
        if (z) {
            this.f72355i = false;
        }
        this.f72351e.setClickable(z);
        this.f72352f.setClickable(z);
        this.f72353g.setClickable(z);
    }

    /* JADX INFO: renamed from: m */
    public void m98975m(final RememberUserInfo rememberUserInfo, RememberUserInfo rememberUserInfo2) {
        this.f72348b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.umh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179647a.m98970n(view);
            }
        });
        this.f72351e.setData(rememberUserInfo);
        this.f72351e.setOnClickListener(this);
        this.f72352f.setData(rememberUserInfo2);
        this.f72352f.setOnClickListener(this);
        if (NullChecker.m82486a(rememberUserInfo2)) {
            this.f72353g.setVisibility(0);
            bnl0.m105509E0(this.f72353g, new View.OnClickListener() { // from class: l.vmh0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f184716a.m98978s(rememberUserInfo, view);
                }
            });
        }
        m98979u(rememberUserInfo, rememberUserInfo2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m98974l(false);
        if (this.f72355i) {
            return;
        }
        this.f72355i = true;
        if (view == this.f72351e) {
            this.f72356j.m191757o0();
        } else if (view == this.f72352f) {
            this.f72356j.m191758p0();
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m98976p() {
        RememberUserInfo rememberUserInfoM191761s0 = this.f72356j.m191761s0();
        m98981w(this.f72351e.m45384d(new x20() { // from class: l.zmh0
            @Override // p153l.x20
            public final void call() {
                anh0.m98968e();
            }
        }));
        this.f72351e.setData(rememberUserInfoM191761s0);
        this.f72352f.setData(null);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m98977q() {
        this.f72356j.m191762t0();
        m98981w(this.f72352f.m45384d(new x20() { // from class: l.ymh0
            @Override // p153l.x20
            public final void call() {
                anh0.m98967d();
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m98978s(RememberUserInfo rememberUserInfo, View view) {
        m98981w(!this.f72356j.m191759q0(rememberUserInfo) ? this.f72351e.m45384d(new x20() { // from class: l.wmh0
            @Override // p153l.x20
            public final void call() {
                this.f189796a.m98976p();
            }
        }) : this.f72352f.m45384d(new x20() { // from class: l.xmh0
            @Override // p153l.x20
            public final void call() {
                this.f195084a.m98977q();
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public void m98979u(RememberUserInfo rememberUserInfo, RememberUserInfo rememberUserInfo2) {
        if (act().toolbar() == null) {
            return;
        }
        if (this.f72356j.m191759q0(rememberUserInfo) || this.f72356j.m191759q0(rememberUserInfo2)) {
            bnl0.m105525M0(this.f72348b, true);
        } else {
            bnl0.m105525M0(this.f72348b, false);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m98980v(RememberUserInfo rememberUserInfo, RememberUserInfo rememberUserInfo2) {
        act().setSwipeBackEnable(false);
        this.f72351e.setData(rememberUserInfo);
        this.f72352f.setData(rememberUserInfo2);
        m98979u(rememberUserInfo, rememberUserInfo2);
    }

    /* JADX INFO: renamed from: w */
    public final void m98981w(boolean z) {
        TextView textView = this.f72349c;
        if (z) {
            textView.setText(act().getResources().getText(R$string.f28637U3));
            this.f72353g.setText(act().getResources().getText(R$string.f28643W));
            this.f72350d.setVisibility(0);
            this.f72351e.setClickable(false);
            this.f72352f.setClickable(false);
            return;
        }
        textView.setText(act().getResources().getText(R$string.f28632T3));
        this.f72350d.setVisibility(4);
        this.f72351e.setClickable(true);
        this.f72352f.setClickable(true);
        boolean zM191764x0 = this.f72356j.m191764x0();
        VButton_FakeShadowSmall vButton_FakeShadowSmall = this.f72353g;
        if (zM191764x0) {
            vButton_FakeShadowSmall.setVisibility(8);
        } else {
            vButton_FakeShadowSmall.setVisibility(0);
            this.f72353g.setText(act().getResources().getText(R$string.f28637U3));
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
