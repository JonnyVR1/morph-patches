package com.p051p1.mobile.putong.safety;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.core.data.UserId;
import com.tantanapp.beatles.safety.core.AbsSafetyPolicy;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import p153l.c1j0;
import p153l.gxd0;
import p153l.i5d0;
import p153l.ls4;
import p153l.qzd;
import p153l.rg50;
import p153l.rnl;
import p153l.ry3;
import p153l.tg50;
import p153l.vx0;
import p153l.w84;
import p153l.x1d0;
import p153l.xi5;
import p153l.y20;

/* JADX INFO: loaded from: classes10.dex */
public class UpgradePolicy extends AbsSafetyPolicy {
    private static final String CHECK_UPDATE_RUL = xi5.UPDATE_URL + "/android/version";

    /* JADX INFO: renamed from: com.p1.mobile.putong.safety.UpgradePolicy$a */
    public class C13263a implements w84 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f55115a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ y20 f55116b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ y20 f55117c;

        public C13263a(Activity activity, y20 y20Var, y20 y20Var2) {
            this.f55115a = activity;
            this.f55116b = y20Var;
            this.f55117c = y20Var2;
        }

        @Override // p153l.w84
        public void onFailure(@NotNull ry3 ry3Var, @NotNull final IOException iOException) {
            Activity activity = this.f55115a;
            final y20 y20Var = this.f55116b;
            activity.runOnUiThread(new Runnable() { // from class: l.z2k0
                @Override // java.lang.Runnable
                public final void run() {
                    y20Var.call(iOException);
                }
            });
        }

        @Override // p153l.w84
        public void onResponse(@NotNull ry3 ry3Var, @NotNull i5d0 i5d0Var) {
            final vx0 vx0VarM203824e = vx0.m203824e(i5d0Var);
            if (NullChecker.m82486a(vx0VarM203824e) && vx0VarM203824e.m203828d()) {
                Activity activity = this.f55115a;
                final y20 y20Var = this.f55117c;
                activity.runOnUiThread(new Runnable() { // from class: l.x2k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        y20Var.call(vx0VarM203824e);
                    }
                });
            } else {
                Activity activity2 = this.f55115a;
                final y20 y20Var2 = this.f55116b;
                activity2.runOnUiThread(new Runnable() { // from class: l.y2k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        y20Var2.call(new IOException("It's the latest version！"));
                    }
                });
            }
        }
    }

    public UpgradePolicy(int i) {
        super(i);
    }

    public static void checkUpdate(@NotNull Activity activity, @NotNull y20<vx0> y20Var, @NotNull y20<Throwable> y20Var2) {
        rg50.C19837b c19837b = new rg50.C19837b();
        c19837b.m181372j(tg50.m191018g());
        x1d0 x1d0VarM209028b = new x1d0.C21228a().m209045s(getUpgradeUrl()).m209028b();
        try {
            x1d0VarM209028b = Network.addHMC(x1d0VarM209028b);
        } catch (Exception unused) {
        }
        c1j0.m107617a(c19837b).m181365c().mo181341a(x1d0VarM209028b).mo135840h(new C13263a(activity, y20Var2, y20Var));
    }

    private static rnl getUpgradeUrl() {
        String str = ls4.f133389a;
        String strM178768a = qzd.m178768a();
        String userId = getUserId();
        rnl.C19886a c19886aM182300c = rnl.m182265r(CHECK_UPDATE_RUL).m182288p().m182300c("appversion", "7.3.3").m182300c("deviceid", strM178768a).m182300c("affiliate", str);
        if (!TextUtils.isEmpty(userId)) {
            c19886aM182300c.m182300c(UserId.TYPE, userId);
        }
        return c19886aM182300c.m182301d();
    }

    private static String getUserId() {
        gxd0 gxd0Var = TantanApp.f17901e;
        return gxd0Var.mo107143b() == null ? "" : gxd0Var.mo107143b().userId;
    }

    @Override // com.tantanapp.beatles.safety.core.AbsSafetyPolicy
    public boolean localProcess() {
        Intent intent = new Intent();
        intent.setClass(this.context, WizardUpgradeDialog.class);
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        intent.addFlags(32768);
        this.context.startActivity(intent);
        CrashHelper.m82483g(new ContinuousCrashException("The system is crash for many times, and the recovery strategy is activated"));
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
