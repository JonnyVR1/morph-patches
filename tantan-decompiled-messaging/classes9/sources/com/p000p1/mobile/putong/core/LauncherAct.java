package com.p000p1.mobile.putong.core;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.Toast;
import com.p000p1.mobile.putong.core.LauncherAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.ui.AutoReleaseVideoAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.Locale;
import l.e30;
import l.hpd0;
import l.lsi0;
import l.mkd0;
import l.r07;
import l.uqd0;
import l.vwb;
import l.w9j;
import p006l.qib0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public abstract class LauncherAct extends AutoReleaseVideoAct {

    /* JADX INFO: renamed from: c */
    public long f1548c;

    /* JADX INFO: renamed from: d */
    public volatile Toast f1549d;

    /* JADX INFO: renamed from: e */
    public hpd0 f1550e = new hpd0("has_show_vivo_start_app_tips", Boolean.FALSE);

    /* JADX INFO: renamed from: f */
    public uqd0 f1551f = new uqd0("local_language_sp", "");

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ void m1872a2() {
        try {
            Process processExec = Runtime.getRuntime().exec("am start --user 0 -a com.vivo.appfilter.activity.StartupManagerActivityRom30 -n com.vivo.appfilter/.activity.StartupManagerActivityRom30");
            processExec.waitFor();
            processExec.destroy();
        } catch (IOException e) {
            CrashHelper.c(e);
        } catch (InterruptedException e2) {
            CrashHelper.c(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m1874e2(c cVar) {
        if (cVar == c.k) {
            this.f1548c = 0L;
            if (NullChecker.a(this.f1549d)) {
                this.f1549d.cancel();
                this.f1549d = null;
                return;
            }
            return;
        }
        if (cVar == c.j) {
            String language = Locale.getDefault().getLanguage();
            if (TextUtils.equals((CharSequence) this.f1551f.get(), language)) {
                return;
            }
            this.f1551f.put(language);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m1875g2(Boolean bool) {
        if (bool.booleanValue() && !((Boolean) this.f1550e.get()).booleanValue() && vwb.f0(new String[]{"vivo Y66", "vivo X9", "vivo X20A"}).contains(Build.MODEL)) {
            act().dialog().E0(R$string.f2034Ps).t0(R$string.f2064Qs, new Runnable() { // from class: l.k7r
                @Override // java.lang.Runnable
                public final void run() {
                    LauncherAct.m1872a2();
                }
            }).z0();
            this.f1550e.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: c2 */
    public final void m1876c2(Bundle bundle) {
        String language = Locale.getDefault().getLanguage();
        String str = (String) this.f1551f.get();
        if (TextUtils.isEmpty(str) || TextUtils.equals(language, str)) {
            return;
        }
        this.f1551f.put(language);
        CoreModule.f1534c.f3628e0.m21417W9("-1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d2 */
    public final boolean m1877d2() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f1548c > jUptimeMillis - 2000) {
            this.f1548c = 0L;
            return true;
        }
        this.f1548c = jUptimeMillis;
        if (this.f1549d == null) {
            this.f1549d = lsi0.t(getString(R$string.f2325Zj));
        }
        this.f1549d.show();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            this.f1548c = 0L;
            if (NullChecker.a(this.f1549d)) {
                this.f1549d.cancel();
                this.f1549d = null;
            }
        }
        return super/*com.p1.mobile.putong.app.PutongAct*/.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initDataOnCreate();
        creates(new e30() { // from class: l.j7r
            public final void call(Object obj) {
                this.f15050a.m1876c2((Bundle) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initSubscription() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initSubscription();
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.g7r
            public final void call(Object obj) {
                this.f13104a.m1874e2((c) obj);
            }
        }));
        duringCreated(qib0.f19828v0.switchMap(new w9j() { // from class: l.h7r
            public final Object call(Object obj) {
                return r07.d;
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.i7r
            public final void call(Object obj) {
                this.f14296a.m1875g2((Boolean) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean moveTaskToBack(boolean z) {
        if (m1877d2()) {
            try {
                boolean zMoveTaskToBack = super/*android.app.Activity*/.moveTaskToBack(z);
                Act.isFromBackStack = true;
                if (NullChecker.a(CoreModule.f1534c)) {
                    CoreModule.f1534c.f3652m0.f3374X = 0;
                }
                return zMoveTaskToBack;
            } catch (Throwable th) {
                try {
                    CrashHelper.c(th);
                    finish();
                } finally {
                    Act.isFromBackStack = true;
                    if (NullChecker.a(CoreModule.f1534c)) {
                        CoreModule.f1534c.f3652m0.f3374X = 0;
                    }
                }
            }
        }
        return false;
    }
}
