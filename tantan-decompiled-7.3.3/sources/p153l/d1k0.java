package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.core.content.FileProvider;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.data.UpdateApiResult;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes6.dex */
public class d1k0 {

    /* JADX INFO: renamed from: a */
    public static long f84693a;

    /* JADX INFO: renamed from: b */
    public static final long f84694b = 3600000;

    /* JADX INFO: renamed from: c */
    public static final long f84695c = 43200000;

    /* JADX INFO: renamed from: d */
    public static long f84696d = 3600000;

    /* JADX INFO: renamed from: e */
    public static String f84697e = "";

    /* JADX INFO: renamed from: f */
    public static C22507a<Boolean> f84698f = C22507a.m222758b();

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m113592c(boolean z, final Act act, final UpdateApiResult updateApiResult) {
        int i;
        if (updateApiResult == null) {
            f84698f.m137019l(Boolean.FALSE);
            return;
        }
        f84698f.m137019l(Boolean.valueOf(updateApiResult.hasUpdate));
        if (updateApiResult.hasUpdate && z) {
            if (!NullChecker.m82486a(f84697e) || !f84697e.equals(updateApiResult.appVersion)) {
                f84697e = updateApiResult.appVersion;
                f84693a = 0L;
                f84696d = f84694b;
            }
            if (System.currentTimeMillis() - f84693a >= f84696d) {
                f84693a = System.currentTimeMillis();
                final l4g0 l4g0VarM204399c = w1e.m204399c("p_alert_version_upgrade_popup", "updateDlg");
                l4g0VarM204399c.m152780o(pk50.m172568j().m172574f().m181657U(OmsDialog.p_alert_version_upgrade_popup.getIdentifier(), i6e.m138810b("passive", "alert", "alert_system", "null", "swipe_page", "version_upgrade")));
                Dialog.C4460e c4460eM21547p0 = new Dialog.C4460e(act).m21502E0(R$string.f19196dr).m21546p(act.adapterChangeLog(jyb.m147507f0(jyb.m147494Y(updateApiResult.appVersion, updateApiResult.changelog)))).m21547p0(R$string.f19138c, new Runnable() { // from class: l.w0k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        d1k0.m113612w(updateApiResult);
                    }
                });
                boolean z2 = false;
                boolean z3 = !ls4.m155670a() && uxw.m198546b();
                if (ls4.m155670a() && !updateApiResult.forceGoToMarket) {
                    z2 = true;
                }
                if (ls4.m155670a()) {
                    z2 = true;
                }
                if (z3) {
                    c4460eM21547p0 = c4460eM21547p0.m21541l0(R$string.f19227er, new Runnable() { // from class: l.x0k0
                        @Override // java.lang.Runnable
                        public final void run() {
                            d1k0.m113598i(act);
                        }
                    });
                }
                if (z2) {
                    boolean zM82472l = ConnectivityReceiver.m82472l();
                    boolean zM80513s = RemoteConfig.m80481x().m80513s("auto_update_apk_in_wifi_mode");
                    C13274a.m80837u().m80847n(C13274a.m80837u().m80852s(updateApiResult.url));
                    if (zM82472l && zM80513s && ((i = Build.VERSION.SDK_INT) < 30 || (i >= 30 && act.getPackageManager().canRequestPackageInstalls()))) {
                        m113607r(updateApiResult, f6g0.m124270a(), true, act);
                    }
                    c4460eM21547p0 = c4460eM21547p0.m21555t0(R$string.f19166cr, new Runnable() { // from class: l.y0k0
                        @Override // java.lang.Runnable
                        public final void run() {
                            d1k0.m113599j(act, updateApiResult);
                        }
                    });
                }
                c4460eM21547p0.m21495B(true).m21493A(new DialogInterface.OnCancelListener() { // from class: l.z0k0
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        d1k0.m113612w(updateApiResult);
                    }
                }).m21525V(new DialogInterface.OnDismissListener() { // from class: l.a1k0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        w1e.m204401e(l4g0VarM204399c);
                    }
                }).m21567z0();
                w1e.m204402f(l4g0VarM204399c);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m113598i(Act act) {
        f84696d = f84694b;
        try {
            uxw.m198548d(act);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m113599j(final Act act, final UpdateApiResult updateApiResult) {
        f84696d = f84694b;
        if (Build.VERSION.SDK_INT < 26 || act.getPackageManager().canRequestPackageInstalls()) {
            m113609t(updateApiResult, f6g0.m124270a(), act);
        } else {
            m113614y(act);
            act.lifecycle().filter(new qcj() { // from class: l.b1k0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
                }
            }).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.c1k0
                @Override // p153l.y20
                public final void call(Object obj) {
                    d1k0.m113609t(updateApiResult, f6g0.m124270a(), act);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m113600k(Throwable th) {
    }

    /* JADX INFO: renamed from: m */
    public static boolean m113602m(UpdateApiResult updateApiResult, File file, Act act) {
        return m113603n(updateApiResult, file, act, true);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m113603n(UpdateApiResult updateApiResult, final File file, final Act act, boolean z) {
        if (!z || m113605p(updateApiResult.md5, file)) {
            l51.m152887G(new Runnable() { // from class: l.t0k0
                @Override // java.lang.Runnable
                public final void run() {
                    d1k0.m113611v(act, file);
                }
            });
            return true;
        }
        if (file.exists()) {
            file.delete();
        }
        o1j0.m165634h(R$string.f19574q4);
        return false;
    }

    /* JADX INFO: renamed from: o */
    public static String m113604o(File file) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[8192];
                while (true) {
                    try {
                        try {
                            int i = fileInputStream.read(bArr);
                            if (i <= 0) {
                                String strReplace = String.format("%32s", new BigInteger(1, messageDigest.digest()).toString(16)).replace(' ', '0');
                                try {
                                    fileInputStream.close();
                                    return strReplace;
                                } catch (IOException e) {
                                    CrashHelper.m82479c(e);
                                    return strReplace;
                                }
                            }
                            messageDigest.update(bArr, 0, i);
                        } catch (IOException e2) {
                            CrashHelper.m82479c(e2);
                            throw new RuntimeException("Unable to process file for MD5", e2);
                        }
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e3) {
                            CrashHelper.m82479c(e3);
                        }
                        throw th;
                    }
                }
            } catch (FileNotFoundException e4) {
                CrashHelper.m82479c(e4);
                return null;
            }
        } catch (NoSuchAlgorithmException e5) {
            CrashHelper.m82479c(e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m113605p(String str, File file) {
        String strM113604o;
        if (TextUtils.isEmpty(str) || file == null || (strM113604o = m113604o(file)) == null) {
            return false;
        }
        return strM113604o.equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: q */
    public static void m113606q(final Act act, final boolean z) {
        if (f84693a >= System.currentTimeMillis()) {
            f84693a = System.currentTimeMillis();
        }
        if (f84698f.m222761e() == null || System.currentTimeMillis() - f84693a >= f84696d) {
            CoreModule.f18266e.m34228a3().subscribe(psd0.m173597H(new y20() { // from class: l.u0k0
                @Override // p153l.y20
                public final void call(Object obj) {
                    d1k0.m113592c(z, act, (UpdateApiResult) obj);
                }
            }, new y20() { // from class: l.v0k0
                @Override // p153l.y20
                public final void call(Object obj) {
                    d1k0.m113600k((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m113607r(UpdateApiResult updateApiResult, String str, boolean z, Act act) {
        m113608s(updateApiResult, str, z, act, true);
    }

    /* JADX INFO: renamed from: s */
    public static void m113608s(final UpdateApiResult updateApiResult, String str, boolean z, final Act act, final boolean z2) {
        C13274a.m80837u().m80850q(uqb0.f180376H.getDownloadHttp(), updateApiResult.url, str, z, new y20() { // from class: l.r0k0
            @Override // p153l.y20
            public final void call(Object obj) {
                d1k0.m113603n(updateApiResult, (File) obj, act, z2);
            }
        }, new y20() { // from class: l.s0k0
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165634h(R$string.f19543p4);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public static void m113609t(UpdateApiResult updateApiResult, String str, Act act) {
        DownloadTask downloadTaskM80852s = C13274a.m80837u().m80852s(updateApiResult.url);
        Objects.toString(downloadTaskM80852s);
        if (downloadTaskM80852s == null) {
            if (new File(str).exists() && m113602m(updateApiResult, new File(str), act)) {
                return;
            }
            if (cxv.m113070b()) {
                o1j0.m165651y("开始下载");
            }
            m113607r(updateApiResult, str, false, act);
            return;
        }
        if (downloadTaskM80852s.m80784F()) {
            m113602m(updateApiResult, new File(downloadTaskM80852s.m80804v()), act);
        } else if (downloadTaskM80852s.m80779A()) {
            o1j0.m165634h(R$string.f19543p4);
        } else {
            downloadTaskM80852s.m80796R(false);
            o1j0.m165634h(R$string.f19135br);
        }
    }

    /* JADX INFO: renamed from: u */
    public static Uri m113610u(Context context, File file) {
        return FileProvider.getUriForFile(context, "files." + context.getPackageName(), file);
    }

    /* JADX INFO: renamed from: v */
    public static void m113611v(Act act, File file) {
        try {
            Intent intentAddFlags = new Intent().setAction("android.intent.action.VIEW").setDataAndType(m113610u(act, file), "application/vnd.android.package-archive").addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            intentAddFlags.addFlags(1);
            act.startActivity(intentAddFlags);
        } catch (Exception e) {
            CrashHelper.m82480d(new Exception("UpdateChecker exception:" + e.getMessage(), e), 1000);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m113612w(UpdateApiResult updateApiResult) {
        m113615z();
        C13274a.m80837u().m80847n(C13274a.m80837u().m80852s(updateApiResult.url));
    }

    /* JADX INFO: renamed from: x */
    public static void m113613x(Act act) {
        f84693a = 0L;
        f84696d = f84694b;
        m113606q(act, true);
    }

    @RequiresApi(api = 26)
    /* JADX INFO: renamed from: y */
    public static void m113614y(Context context) {
        Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName()));
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: z */
    public static void m113615z() {
        f84696d = Math.min(f84696d * 2, f84695c);
    }
}
