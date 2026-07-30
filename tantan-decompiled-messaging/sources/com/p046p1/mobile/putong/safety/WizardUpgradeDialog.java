package com.p046p1.mobile.putong.safety;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.data.SafetyModeConfig;
import com.tantanapp.common.utils.CrashHelper;
import p149l.au2;
import p149l.dr4;
import p149l.e30;
import p149l.eyc0;
import p149l.mr4;
import p149l.o8q0;
import p149l.ox0;
import p149l.qod0;
import p149l.rx0;
import p149l.vuw;

/* JADX INFO: loaded from: classes11.dex */
public class WizardUpgradeDialog extends AppCompatActivity {

    /* JADX INFO: renamed from: c */
    public SafetyModeConfig f54270c;

    /* JADX INFO: renamed from: O0 */
    public final void m79360O0() {
        if (this.f54270c.resetUserData) {
            qod0.m175733c(this);
        }
        rx0.m181467d();
    }

    /* JADX INFO: renamed from: P0 */
    public final void m79361P0(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(Intent.createChooser(intent, "请选择浏览器"));
        }
        rx0.m181467d();
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m79362Q0() {
        try {
            vuw.m200138d(this);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            au2.m98935w(e);
        }
        rx0.m181467d();
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m79363R0(Throwable th) {
        m79369X0();
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m79364S0(ox0 ox0Var) {
        m79361P0(ox0Var.m166457c());
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m79365T0() {
        m79367V0(this);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m79366U0() {
        m79367V0(this);
    }

    /* JADX INFO: renamed from: V0 */
    public final void m79367V0(Activity activity) {
        try {
            eyc0.m118762k(activity, TantanApp.f17182e.mo108248b());
        } catch (Exception unused) {
            rx0.m181467d();
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final void m79368W0(final ox0 ox0Var) {
        Dialog.C4309e c4309eM20555t = new Dialog.C4309e(this).m20503E0(R$string.f17324F2).m20549q(false).m20496B(false).m20547p(new dr4(this, ox0Var.m166455a(), ox0Var.m166456b())).m20548p0(R$string.f17405a, new o8q0(this)).m20555t();
        Dialog.C4309e c4309eM20556t0 = (mr4.m156014a() || !vuw.m200136b()) ? c4309eM20555t.m20556t0(R$string.f17320E2, new Runnable() { // from class: l.q8q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f153209a.m79364S0(ox0Var);
            }
        }) : c4309eM20555t.m20556t0(R$string.f17328G2, new Runnable() { // from class: l.p8q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f147628a.m79362Q0();
            }
        });
        if (eyc0.m118761j() && this.f54270c.resetUserData) {
            c4309eM20556t0.m20542l0(R$string.f17453j2, new Runnable() { // from class: l.r8q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f158246a.m79365T0();
                }
            });
        }
        c4309eM20556t0.m20568z0();
    }

    /* JADX INFO: renamed from: X0 */
    public final void m79369X0() {
        boolean zM118761j = eyc0.m118761j();
        SafetyModeConfig safetyModeConfig = this.f54270c;
        if (!zM118761j) {
            if (safetyModeConfig.resetAppData) {
                rx0.m181464a(this);
            }
            rx0.m181467d();
        } else if (safetyModeConfig.resetUserData) {
            new Dialog.C4309e(this).m20500D(R$string.f17448i2).m20549q(false).m20496B(false).m20548p0(R$string.f17405a, new o8q0(this)).m20556t0(R$string.f17453j2, new Runnable() { // from class: l.s8q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f163099a.m79366U0();
                }
            }).m20555t().m20568z0();
        } else {
            rx0.m181467d();
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
        UpgradePolicy.checkUpdate(this, new e30() { // from class: l.m8q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f132610a.m79368W0((ox0) obj);
            }
        }, new e30() { // from class: l.n8q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137672a.m79363R0((Throwable) obj);
            }
        });
        eyc0.m118763l();
        this.f54270c = qod0.m175735e();
    }
}
