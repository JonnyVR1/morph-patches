package com.p051p1.mobile.putong.safety;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.data.SafetyModeConfig;
import com.tantanapp.common.utils.CrashHelper;
import p153l.cs4;
import p153l.h6d0;
import p153l.ls4;
import p153l.qu2;
import p153l.swd0;
import p153l.thq0;
import p153l.uxw;
import p153l.vx0;
import p153l.y20;
import p153l.yx0;

/* JADX INFO: loaded from: classes10.dex */
public class WizardUpgradeDialog extends AppCompatActivity {

    /* JADX INFO: renamed from: c */
    public SafetyModeConfig f55118c;

    /* JADX INFO: renamed from: P0 */
    public final void m80543P0() {
        if (this.f55118c.resetUserData) {
            swd0.m188275c(this);
        }
        yx0.m217669d();
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m80544Q0(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(Intent.createChooser(intent, "请选择浏览器"));
        }
        yx0.m217669d();
    }

    /* JADX INFO: renamed from: R0 */
    public final void m80545R0() {
        try {
            uxw.m198548d(this);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            qu2.m178128w(e);
        }
        yx0.m217669d();
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m80546S0(Throwable th) {
        m80552Y0();
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m80547T0(vx0 vx0Var) {
        m80544Q0(vx0Var.m203827c());
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m80548U0() {
        m80550W0(this);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m80549V0() {
        m80550W0(this);
    }

    /* JADX INFO: renamed from: W0 */
    public final void m80550W0(Activity activity) {
        try {
            h6d0.m133694k(activity, TantanApp.f17901e.mo107143b());
        } catch (Exception unused) {
            yx0.m217669d();
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final void m80551X0(final vx0 vx0Var) {
        Dialog.C4460e c4460eM21554t = new Dialog.C4460e(this).m21502E0(R$string.f18043F2).m21548q(false).m21495B(false).m21546p(new cs4(this, vx0Var.m203825a(), vx0Var.m203826b())).m21547p0(R$string.f18124a, new thq0(this)).m21554t();
        Dialog.C4460e c4460eM21555t0 = (ls4.m155670a() || !uxw.m198546b()) ? c4460eM21554t.m21555t0(R$string.f18039E2, new Runnable() { // from class: l.vhq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f184185a.m80547T0(vx0Var);
            }
        }) : c4460eM21554t.m21555t0(R$string.f18047G2, new Runnable() { // from class: l.uhq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f179049a.m80545R0();
            }
        });
        if (h6d0.m133693j() && this.f55118c.resetUserData) {
            c4460eM21555t0.m21541l0(R$string.f18172j2, new Runnable() { // from class: l.whq0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f189188a.m80548U0();
                }
            });
        }
        c4460eM21555t0.m21567z0();
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m80552Y0() {
        boolean zM133693j = h6d0.m133693j();
        SafetyModeConfig safetyModeConfig = this.f55118c;
        if (!zM133693j) {
            if (safetyModeConfig.resetAppData) {
                yx0.m217666a(this);
            }
            yx0.m217669d();
        } else if (safetyModeConfig.resetUserData) {
            new Dialog.C4460e(this).m21499D(R$string.f18167i2).m21548q(false).m21495B(false).m21547p0(R$string.f18124a, new thq0(this)).m21555t0(R$string.f18172j2, new Runnable() { // from class: l.xhq0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f194396a.m80549V0();
                }
            }).m21554t().m21567z0();
        } else {
            yx0.m217669d();
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        setContentView(new View(this));
        UpgradePolicy.checkUpdate(this, new y20() { // from class: l.rhq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163191a.m80551X0((vx0) obj);
            }
        }, new y20() { // from class: l.shq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f168738a.m80546S0((Throwable) obj);
            }
        });
        h6d0.m133695l();
        this.f55118c = swd0.m188277e();
    }
}
