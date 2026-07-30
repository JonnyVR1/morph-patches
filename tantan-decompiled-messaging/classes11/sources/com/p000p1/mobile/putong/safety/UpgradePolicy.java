package com.p000p1.mobile.putong.safety;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.app.TantanApp;
import com.p1.mobile.putong.data.AuthData;
import com.tantanapp.beatles.safety.core.AbsSafetyPolicy;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import l.cll;
import l.e30;
import l.exc0;
import l.k850;
import l.m850;
import l.mr4;
import l.stc0;
import l.sx3;
import l.x74;
import l.xh5;
import l.zri0;
import org.jetbrains.annotations.NotNull;
import p009l.dyd;
import p009l.epd0;
import p009l.ox0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class UpgradePolicy extends AbsSafetyPolicy {
    private static final String CHECK_UPDATE_RUL = xh5.UPDATE_URL + "/android/version";

    /* JADX INFO: renamed from: com.p1.mobile.putong.safety.UpgradePolicy$a */
    public class C0502a implements x74 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f7873a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ e30 f7874b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ e30 f7875c;

        public C0502a(Activity activity, e30 e30Var, e30 e30Var2) {
            this.f7873a = activity;
            this.f7874b = e30Var;
            this.f7875c = e30Var2;
        }

        public void onFailure(@NotNull sx3 sx3Var, @NotNull final IOException iOException) {
            Activity activity = this.f7873a;
            final e30 e30Var = this.f7874b;
            activity.runOnUiThread(new Runnable() { // from class: l.wtj0
                @Override // java.lang.Runnable
                public final void run() {
                    e30Var.call(iOException);
                }
            });
        }

        public void onResponse(@NotNull sx3 sx3Var, @NotNull exc0 exc0Var) {
            final ox0 ox0VarM20037e = ox0.m20037e(exc0Var);
            if (NullChecker.a(ox0VarM20037e) && ox0VarM20037e.m20041d()) {
                Activity activity = this.f7873a;
                final e30 e30Var = this.f7875c;
                activity.runOnUiThread(new Runnable() { // from class: l.utj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        e30Var.call(ox0VarM20037e);
                    }
                });
            } else {
                Activity activity2 = this.f7873a;
                final e30 e30Var2 = this.f7874b;
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
        k850.b bVar = new k850.b();
        bVar.j(m850.i());
        stc0 stc0VarB = new stc0.a().s(getUpgradeUrl()).b();
        try {
            stc0VarB = Network.addHMC(stc0VarB);
        } catch (Exception unused) {
        }
        zri0.a(bVar).c().a(stc0VarB).h(new C0502a(activity, e30Var2, e30Var));
    }

    private static cll getUpgradeUrl() {
        String str = mr4.a;
        String strM13507a = dyd.m13507a();
        String userId = getUserId();
        cll.a aVarC = cll.r(CHECK_UPDATE_RUL).p().c("appversion", "7.2.7").c("deviceid", strM13507a).c("affiliate", str);
        if (!TextUtils.isEmpty(userId)) {
            aVarC.c("userid", userId);
        }
        return aVarC.d();
    }

    private static String getUserId() {
        epd0 epd0Var = TantanApp.e;
        return epd0Var.b() == null ? "" : ((AuthData) epd0Var.b()).userId;
    }

    public boolean localProcess() {
        Intent intent = new Intent();
        intent.setClass(((AbsSafetyPolicy) this).context, WizardUpgradeDialog.class);
        intent.addFlags(268435456);
        intent.addFlags(32768);
        ((AbsSafetyPolicy) this).context.startActivity(intent);
        CrashHelper.g(new ContinuousCrashException("The system is crash for many times, and the recovery strategy is activated"));
        return true;
    }

    public void remoteProcess() {
        Activity activity = ((AbsSafetyPolicy) this).remoteActivity;
        if (activity != null) {
            activity.finish();
        }
    }
}
