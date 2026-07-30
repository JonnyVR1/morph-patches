package com.p046p1.mobile.putong.safety;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.core.data.UserId;
import com.tantanapp.beatles.safety.core.AbsSafetyPolicy;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import p149l.cll;
import p149l.dyd;
import p149l.e30;
import p149l.epd0;
import p149l.exc0;
import p149l.k850;
import p149l.m850;
import p149l.mr4;
import p149l.ox0;
import p149l.stc0;
import p149l.sx3;
import p149l.x74;
import p149l.xh5;
import p149l.zri0;

/* JADX INFO: loaded from: classes11.dex */
public class UpgradePolicy extends AbsSafetyPolicy {
    private static final String CHECK_UPDATE_RUL = xh5.UPDATE_URL + "/android/version";

    /* JADX INFO: renamed from: com.p1.mobile.putong.safety.UpgradePolicy$a */
    public class C13100a implements x74 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f54267a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ e30 f54268b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ e30 f54269c;

        public C13100a(Activity activity, e30 e30Var, e30 e30Var2) {
            this.f54267a = activity;
            this.f54268b = e30Var;
            this.f54269c = e30Var2;
        }

        @Override // p149l.x74
        public void onFailure(@NotNull sx3 sx3Var, @NotNull final IOException iOException) {
            Activity activity = this.f54267a;
            final e30 e30Var = this.f54268b;
            activity.runOnUiThread(new Runnable() { // from class: l.wtj0
                @Override // java.lang.Runnable
                public final void run() {
                    e30Var.call(iOException);
                }
            });
        }

        @Override // p149l.x74
        public void onResponse(@NotNull sx3 sx3Var, @NotNull exc0 exc0Var) {
            final ox0 ox0VarM166454e = ox0.m166454e(exc0Var);
            if (NullChecker.m81303a(ox0VarM166454e) && ox0VarM166454e.m166458d()) {
                Activity activity = this.f54267a;
                final e30 e30Var = this.f54269c;
                activity.runOnUiThread(new Runnable() { // from class: l.utj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        e30Var.call(ox0VarM166454e);
                    }
                });
            } else {
                Activity activity2 = this.f54267a;
                final e30 e30Var2 = this.f54268b;
                activity2.runOnUiThread(new Runnable() { // from class: l.vtj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        e30Var2.call(new IOException("It's the latest version！"));
                    }
                });
            }
        }
    }

    public UpgradePolicy(int i) {
        super(i);
    }

    public static void checkUpdate(@NotNull Activity activity, @NotNull e30<ox0> e30Var, @NotNull e30<Throwable> e30Var2) {
        k850.C17954b c17954b = new k850.C17954b();
        c17954b.m144889j(m850.m153455i());
        stc0 stc0VarM185883b = new stc0.C20027a().m185900s(getUpgradeUrl()).m185883b();
        try {
            stc0VarM185883b = Network.addHMC(stc0VarM185883b);
        } catch (Exception unused) {
        }
        zri0.m219951a(c17954b).m144882c().mo144849a(stc0VarM185883b).mo96077h(new C13100a(activity, e30Var2, e30Var));
    }

    private static cll getUpgradeUrl() {
        String str = mr4.f135329a;
        String strM114055a = dyd.m114055a();
        String userId = getUserId();
        cll.C16188a c16188aM107536c = cll.m107501r(CHECK_UPDATE_RUL).m107524p().m107536c("appversion", "7.2.7").m107536c("deviceid", strM114055a).m107536c("affiliate", str);
        if (!TextUtils.isEmpty(userId)) {
            c16188aM107536c.m107536c(UserId.TYPE, userId);
        }
        return c16188aM107536c.m107537d();
    }

    private static String getUserId() {
        epd0 epd0Var = TantanApp.f17182e;
        return epd0Var.mo108248b() == null ? "" : epd0Var.mo108248b().userId;
    }

    @Override // com.tantanapp.beatles.safety.core.AbsSafetyPolicy
    public boolean localProcess() {
        Intent intent = new Intent();
        intent.setClass(this.context, WizardUpgradeDialog.class);
        intent.addFlags(268435456);
        intent.addFlags(32768);
        this.context.startActivity(intent);
        CrashHelper.m81300g(new ContinuousCrashException("The system is crash for many times, and the recovery strategy is activated"));
        return true;
    }

    @Override // com.tantanapp.beatles.safety.core.AbsSafetyPolicy
    public void remoteProcess() {
        Activity activity = this.remoteActivity;
        if (activity != null) {
            activity.finish();
        }
    }
}
