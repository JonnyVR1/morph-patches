package com.p046p1.mobile.putong.core;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.Toast;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.LauncherAct;
import com.p046p1.mobile.putong.core.p053ui.AutoReleaseVideoAct;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.Locale;
import p133rx.C22306c;
import p149l.e30;
import p149l.hpd0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.qib0;
import p149l.uqd0;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes9.dex */
public abstract class LauncherAct extends AutoReleaseVideoAct {

    /* JADX INFO: renamed from: c */
    public long f17559c;

    /* JADX INFO: renamed from: d */
    public volatile Toast f17560d;

    /* JADX INFO: renamed from: e */
    public hpd0 f17561e = new hpd0("has_show_vivo_start_app_tips", Boolean.FALSE);

    /* JADX INFO: renamed from: f */
    public uqd0 f17562f = new uqd0("local_language_sp", "");

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ void m29944a2() {
        try {
            Process processExec = Runtime.getRuntime().exec("am start --user 0 -a com.vivo.appfilter.activity.StartupManagerActivityRom30 -n com.vivo.appfilter/.activity.StartupManagerActivityRom30");
            processExec.waitFor();
            processExec.destroy();
        } catch (IOException e) {
            CrashHelper.m81296c(e);
        } catch (InterruptedException e2) {
            CrashHelper.m81296c(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m29946e2(C4319c c4319c) {
        if (c4319c == C4319c.f15550k) {
            this.f17559c = 0L;
            if (NullChecker.m81303a(this.f17560d)) {
                this.f17560d.cancel();
                this.f17560d = null;
                return;
            }
            return;
        }
        if (c4319c == C4319c.f15549j) {
            String language = Locale.getDefault().getLanguage();
            if (TextUtils.equals(this.f17562f.get(), language)) {
                return;
            }
            this.f17562f.put(language);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m29947g2(Boolean bool) {
        if (bool.booleanValue() && !this.f17561e.get().booleanValue() && vwb.m200324f0("vivo Y66", "vivo X9", "vivo X20A").contains(Build.MODEL)) {
            act().dialog().m20503E0(R$string.f18045Ps).m20556t0(R$string.f18075Qs, new Runnable() { // from class: l.k7r
                @Override // java.lang.Runnable
                public final void run() {
                    LauncherAct.m29944a2();
                }
            }).m20568z0();
            this.f17561e.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: c2 */
    public final void m29948c2(Bundle bundle) {
        String language = Locale.getDefault().getLanguage();
        String str = this.f17562f.get();
        if (TextUtils.isEmpty(str) || TextUtils.equals(language, str)) {
            return;
        }
        this.f17562f.put(language);
        CoreModule.f17545c.f19639e0.m169454W9(User.ID_TEAM_ACCOUNT);
    }

    /* JADX INFO: renamed from: d2 */
    public final boolean m29949d2() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f17559c > jUptimeMillis - 2000) {
            this.f17559c = 0L;
            return true;
        }
        this.f17559c = jUptimeMillis;
        if (this.f17560d == null) {
            this.f17560d = lsi0.m151590t(getString(R$string.f18336Zj));
        }
        this.f17560d.show();
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            this.f17559c = 0L;
            if (NullChecker.m81303a(this.f17560d)) {
                this.f17560d.cancel();
                this.f17560d = null;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.j7r
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116627a.m29948c2((Bundle) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.g7r
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101427a.m29946e2((C4319c) obj);
            }
        }));
        duringCreated((C22306c) qib0.f154737v0.switchMap(new w9j() { // from class: l.h7r
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return r07.f157144d;
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.i7r
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111934a.m29947g2((Boolean) obj);
            }
        }));
    }

    @Override // android.app.Activity
    public boolean moveTaskToBack(boolean z) {
        if (m29949d2()) {
            try {
                boolean zMoveTaskToBack = super.moveTaskToBack(z);
                Act.isFromBackStack = true;
                if (NullChecker.m81303a(CoreModule.f17545c)) {
                    CoreModule.f17545c.f19663m0.f19385X = 0;
                }
                return zMoveTaskToBack;
            } catch (Throwable th) {
                try {
                    CrashHelper.m81296c(th);
                    m66873d2();
                } finally {
                    Act.isFromBackStack = true;
                    if (NullChecker.m81303a(CoreModule.f17545c)) {
                        CoreModule.f17545c.f19663m0.f19385X = 0;
                    }
                }
            }
        }
        return false;
    }
}
