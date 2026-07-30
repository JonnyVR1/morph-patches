package com.p051p1.mobile.putong.core;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.Toast;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.LauncherAct;
import com.p051p1.mobile.putong.core.p058ui.AutoReleaseVideoAct;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.Locale;
import p137rx.C22421c;
import p153l.jxd0;
import p153l.jyb;
import p153l.o1j0;
import p153l.psd0;
import p153l.qcj;
import p153l.uqb0;
import p153l.wyd0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public abstract class LauncherAct extends AutoReleaseVideoAct {

    /* JADX INFO: renamed from: c */
    public long f18278c;

    /* JADX INFO: renamed from: d */
    public volatile Toast f18279d;

    /* JADX INFO: renamed from: e */
    public jxd0 f18280e = new jxd0("has_show_vivo_start_app_tips", Boolean.FALSE);

    /* JADX INFO: renamed from: f */
    public wyd0 f18281f = new wyd0("local_language_sp", "");

    /* JADX INFO: renamed from: b2 */
    public static /* synthetic */ void m30942b2() {
        try {
            Process processExec = Runtime.getRuntime().exec("am start --user 0 -a com.vivo.appfilter.activity.StartupManagerActivityRom30 -n com.vivo.appfilter/.activity.StartupManagerActivityRom30");
            processExec.waitFor();
            processExec.destroy();
        } catch (IOException e) {
            CrashHelper.m82479c(e);
        } catch (InterruptedException e2) {
            CrashHelper.m82479c(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m30944g2(C4470c c4470c) {
        if (c4470c == C4470c.f16269k) {
            this.f18278c = 0L;
            if (NullChecker.m82486a(this.f18279d)) {
                this.f18279d.cancel();
                this.f18279d = null;
                return;
            }
            return;
        }
        if (c4470c == C4470c.f16268j) {
            String language = Locale.getDefault().getLanguage();
            if (TextUtils.equals(this.f18281f.get(), language)) {
                return;
            }
            this.f18281f.put(language);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m30945h2(Boolean bool) {
        if (bool.booleanValue() && !this.f18280e.get().booleanValue() && jyb.m147507f0("vivo Y66", "vivo X9", "vivo X20A").contains(Build.MODEL)) {
            act().dialog().m21502E0(R$string.f19475mt).m21555t0(R$string.f19506nt, new Runnable() { // from class: l.l9r
                @Override // java.lang.Runnable
                public final void run() {
                    LauncherAct.m30942b2();
                }
            }).m21567z0();
            this.f18280e.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: d2 */
    public final void m30946d2(Bundle bundle) {
        String language = Locale.getDefault().getLanguage();
        String str = this.f18281f.get();
        if (TextUtils.isEmpty(str) || TextUtils.equals(language, str)) {
            return;
        }
        this.f18281f.put(language);
        CoreModule.f18264c.f20381e0.m116527W9(User.ID_TEAM_ACCOUNT);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            this.f18278c = 0L;
            if (NullChecker.m82486a(this.f18279d)) {
                this.f18279d.cancel();
                this.f18279d = null;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e2 */
    public final boolean m30947e2() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f18278c > jUptimeMillis - 2000) {
            this.f18278c = 0L;
            return true;
        }
        this.f18278c = jUptimeMillis;
        if (this.f18279d == null) {
            this.f18279d = o1j0.m165646t(getString(R$string.f19745vk));
        }
        this.f18279d.show();
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new y20() { // from class: l.k9r
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124570a.m30946d2((Bundle) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.h9r
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108428a.m30944g2((C4470c) obj);
            }
        }));
        duringCreated((C22421c) uqb0.f180420v0.switchMap(new qcj() { // from class: l.i9r
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return u17.f176976d;
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.j9r
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118900a.m30945h2((Boolean) obj);
            }
        }));
    }

    @Override // android.app.Activity
    public boolean moveTaskToBack(boolean z) {
        if (m30947e2()) {
            try {
                boolean zMoveTaskToBack = super.moveTaskToBack(z);
                Act.isFromBackStack = true;
                if (NullChecker.m82486a(CoreModule.f18264c)) {
                    CoreModule.f18264c.f20405m0.f20127X = 0;
                }
                return zMoveTaskToBack;
            } catch (Throwable th) {
                try {
                    CrashHelper.m82479c(th);
                    m68056e2();
                } finally {
                    Act.isFromBackStack = true;
                    if (NullChecker.m82486a(CoreModule.f18264c)) {
                        CoreModule.f18264c.f20405m0.f20127X = 0;
                    }
                }
            }
        }
        return false;
    }
}
