package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p004ui.account.SwitchAccountV2Act;
import com.p000p1.mobile.putong.core.p004ui.account.view.AccountViewV2;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.RememberUserInfo;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.mfh0;
import l.s7m;
import l.xdl0;
import v.VButton_FakeShadowSmall;
import v.VImage;
import v.VLinear;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class lfh0 implements s7m<efh0>, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VLinear f16392a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f16393b;

    /* JADX INFO: renamed from: c */
    public VImage f16394c;

    /* JADX INFO: renamed from: d */
    public TextView f16395d;

    /* JADX INFO: renamed from: e */
    public TextView f16396e;

    /* JADX INFO: renamed from: f */
    public AccountViewV2 f16397f;

    /* JADX INFO: renamed from: g */
    public AccountViewV2 f16398g;

    /* JADX INFO: renamed from: h */
    public VButton_FakeShadowSmall f16399h;

    /* JADX INFO: renamed from: i */
    public SwitchAccountV2Act f16400i;

    /* JADX INFO: renamed from: j */
    public boolean f16401j = false;

    /* JADX INFO: renamed from: k */
    public efh0 f16402k;

    public lfh0(SwitchAccountV2Act switchAccountV2Act) {
        this.f16400i = switchAccountV2Act;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18753a() {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m18754b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m18759n(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m18760p() {
        RememberUserInfo rememberUserInfoM14533s0 = this.f16402k.m14533s0();
        m18763w(this.f16397f.m7155d(new d30() { // from class: l.jfh0
            public final void call() {
                lfh0.m18753a();
            }
        }));
        this.f16397f.setData(rememberUserInfoM14533s0);
        this.f16398g.setData(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m18761q() {
        this.f16402k.m14534t0();
        m18763w(this.f16398g.m7155d(new d30() { // from class: l.kfh0
            public final void call() {
                lfh0.m18754b();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m18762s(RememberUserInfo rememberUserInfo, View view) {
        m18763w(!this.f16402k.m14532q0(rememberUserInfo) ? this.f16397f.m7155d(new d30() { // from class: l.hfh0
            public final void call() {
                this.f13865a.m18760p();
            }
        }) : this.f16398g.m7155d(new d30() { // from class: l.ifh0
            public final void call() {
                this.f14430a.m18761q();
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    private void m18763w(boolean z) {
        TextView textView = this.f16395d;
        if (z) {
            textView.setText(act().getResources().getText(R.string.U3));
            this.f16399h.setText(act().getResources().getText(R.string.W));
            this.f16396e.setVisibility(0);
            this.f16397f.setClickable(false);
            this.f16398g.setClickable(false);
            return;
        }
        textView.setText(act().getResources().getText(R.string.T3));
        this.f16396e.setVisibility(4);
        this.f16397f.setClickable(true);
        this.f16398g.setClickable(true);
        boolean zM14536x0 = this.f16402k.m14536x0();
        VButton_FakeShadowSmall vButton_FakeShadowSmall = this.f16399h;
        if (zM14536x0) {
            vButton_FakeShadowSmall.setVisibility(8);
        } else {
            vButton_FakeShadowSmall.setVisibility(0);
            this.f16399h.setText(act().getResources().getText(R.string.U3));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m18764C0() {
        return this.f16400i;
    }

    /* JADX INFO: renamed from: i */
    public View m18765i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mfh0.b(this, layoutInflater, viewGroup);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m18765i(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public SwitchAccountV2Act act() {
        return this.f16400i;
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m18766i1(efh0 efh0Var) {
        this.f16402k = efh0Var;
    }

    /* JADX INFO: renamed from: l */
    public void m18769l(boolean z) {
        if (z) {
            this.f16401j = false;
        }
        this.f16397f.setClickable(z);
        this.f16398g.setClickable(z);
        this.f16399h.setClickable(z);
    }

    /* JADX INFO: renamed from: m */
    public void m18770m(final RememberUserInfo rememberUserInfo, RememberUserInfo rememberUserInfo2) {
        this.f16393b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ffh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12706a.m18759n(view);
            }
        });
        this.f16397f.setData(rememberUserInfo);
        this.f16397f.setOnClickListener(this);
        this.f16398g.setData(rememberUserInfo2);
        this.f16398g.setOnClickListener(this);
        if (NullChecker.a(rememberUserInfo2)) {
            this.f16399h.setVisibility(0);
            xdl0.E0(this.f16399h, new View.OnClickListener() { // from class: l.gfh0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13304a.m18762s(rememberUserInfo, view);
                }
            });
        }
        m18771u(rememberUserInfo, rememberUserInfo2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m18769l(false);
        if (this.f16401j) {
            return;
        }
        this.f16401j = true;
        if (view == this.f16397f) {
            this.f16402k.m14530o0();
        } else if (view == this.f16398g) {
            this.f16402k.m14531p0();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m18771u(RememberUserInfo rememberUserInfo, RememberUserInfo rememberUserInfo2) {
        if (act().toolbar() == null) {
            return;
        }
        if (this.f16402k.m14532q0(rememberUserInfo) || this.f16402k.m14532q0(rememberUserInfo2)) {
            xdl0.M0(this.f16393b, true);
        } else {
            xdl0.M0(this.f16393b, false);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m18772v(RememberUserInfo rememberUserInfo, RememberUserInfo rememberUserInfo2) {
        act().setSwipeBackEnable(false);
        this.f16397f.setData(rememberUserInfo);
        this.f16398g.setData(rememberUserInfo2);
        m18771u(rememberUserInfo, rememberUserInfo2);
    }

    public void destroy() {
    }
}
