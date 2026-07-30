package com.p000p1.mobile.putong.safety;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.app.TantanApp;
import com.p1.mobile.putong.common.R;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.data.SafetyModeConfig;
import com.tantanapp.common.utils.CrashHelper;
import l.au2;
import l.e30;
import l.mr4;
import l.rx0;
import p009l.dr4;
import p009l.eyc0;
import p009l.o8q0;
import p009l.ox0;
import p009l.qod0;
import p009l.vuw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class WizardUpgradeDialog extends AppCompatActivity {

    /* JADX INFO: renamed from: c */
    public SafetyModeConfig f7876c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O0 */
    public final void m9681O0() {
        if (this.f7876c.resetUserData) {
            qod0.m21122c(this);
        }
        rx0.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P0 */
    public final void m9682P0(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(Intent.createChooser(intent, "请选择浏览器"));
        }
        rx0.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q0 */
    public final void m9683Q0() {
        try {
            vuw.m23737d(this);
        } catch (Exception e) {
            CrashHelper.c(e);
            au2.w(e);
        }
        rx0.d();
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m9684R0(Throwable th) {
        m9690X0();
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m9685S0(ox0 ox0Var) {
        m9682P0(ox0Var.m20040c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m9686T0() {
        m9688V0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m9687U0() {
        m9688V0(this);
    }

    /* JADX INFO: renamed from: V0 */
    public final void m9688V0(Activity activity) {
        try {
            eyc0.m14167k(activity, (AuthData) TantanApp.e.b());
        } catch (Exception unused) {
            rx0.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W0 */
    public final void m9689W0(final ox0 ox0Var) {
        Dialog.e eVarT = new Dialog.e(this).E0(R.string.F2).q(false).B(false).p(new dr4(this, ox0Var.m20038a(), ox0Var.m20039b())).p0(R.string.a, new o8q0(this)).t();
        Dialog.e eVarT0 = (mr4.a() || !vuw.m23735b()) ? eVarT.t0(R.string.E2, new Runnable() { // from class: l.q8q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f19070a.m9685S0(ox0Var);
            }
        }) : eVarT.t0(R.string.G2, new Runnable() { // from class: l.p8q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f18430a.m9683Q0();
            }
        });
        if (eyc0.m14166j() && this.f7876c.resetUserData) {
            eVarT0.l0(R.string.j2, new Runnable() { // from class: l.r8q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19697a.m9686T0();
                }
            });
        }
        eVarT0.z0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X0 */
    public final void m9690X0() {
        boolean zM14166j = eyc0.m14166j();
        SafetyModeConfig safetyModeConfig = this.f7876c;
        if (!zM14166j) {
            if (safetyModeConfig.resetAppData) {
                rx0.a(this);
            }
            rx0.d();
        } else if (safetyModeConfig.resetUserData) {
            new Dialog.e(this).D(R.string.i2).q(false).B(false).p0(R.string.a, new o8q0(this)).t0(R.string.j2, new Runnable() { // from class: l.s8q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20134a.m9687U0();
                }
            }).t().z0();
        } else {
            rx0.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        super/*android.app.Activity*/.finish();
        overridePendingTransition(0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        setContentView(new View(this));
        UpgradePolicy.checkUpdate(this, new e30() { // from class: l.m8q0
            public final void call(Object obj) {
                this.f16758a.m9689W0((ox0) obj);
            }
        }, new e30() { // from class: l.n8q0
            public final void call(Object obj) {
                this.f17358a.m9684R0((Throwable) obj);
            }
        });
        eyc0.m14168l();
        this.f7876c = qod0.m21124e();
    }
}
