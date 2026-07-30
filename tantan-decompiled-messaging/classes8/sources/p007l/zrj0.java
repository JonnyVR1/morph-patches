package p007l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.core.content.FileProvider;
import com.p003p1.mobile.android.app.Act;
import com.p003p1.mobile.android.app.C0231c;
import com.p003p1.mobile.android.app.Dialog;
import com.p003p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.data.UpdateApiResult;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.ui.download.DownloadTask;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import l.bvv;
import l.cwf0;
import l.e30;
import l.i0e;
import l.ic50;
import l.j760;
import l.mr4;
import l.qib0;
import l.u4e;
import l.vuw;
import l.vwb;
import l.w9j;
import l.xxf0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class zrj0 {

    /* JADX INFO: renamed from: a */
    public static long f5536a;

    /* JADX INFO: renamed from: b */
    public static final long f5537b = 3600000;

    /* JADX INFO: renamed from: c */
    public static final long f5538c = 43200000;

    /* JADX INFO: renamed from: d */
    public static long f5539d = 3600000;

    /* JADX INFO: renamed from: e */
    public static String f5540e = "";

    /* JADX INFO: renamed from: f */
    public static a<Boolean> f5541f = a.b();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m12040c(boolean z, final Act act, final UpdateApiResult updateApiResult) {
        int i;
        if (updateApiResult == null) {
            f5541f.onNext(Boolean.FALSE);
            return;
        }
        f5541f.onNext(Boolean.valueOf(updateApiResult.hasUpdate));
        if (updateApiResult.hasUpdate && z) {
            if (!NullChecker.a(f5540e) || !f5540e.equals(updateApiResult.appVersion)) {
                f5540e = updateApiResult.appVersion;
                f5536a = 0L;
                f5539d = f5537b;
            }
            if (System.currentTimeMillis() - f5536a >= f5539d) {
                f5536a = System.currentTimeMillis();
                final cwf0 cwf0VarC = i0e.c("p_alert_version_upgrade_popup", "updateDlg");
                cwf0VarC.o(ic50.j().f().U(OmsDialog.p_alert_version_upgrade_popup.getIdentifier(), u4e.b("passive", "alert", "alert_system", "null", "swipe_page", "version_upgrade")));
                Dialog.C0221e c0221eM819p0 = new Dialog.C0221e(act).m774E0(R.string.Iq).m818p(act.adapterChangeLog(vwb.f0(new j760[]{vwb.Y(updateApiResult.appVersion, updateApiResult.changelog)}))).m819p0(R.string.c, new Runnable() { // from class: l.srj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        zrj0.m12060w(updateApiResult);
                    }
                });
                boolean z2 = false;
                boolean z3 = !mr4.a() && vuw.b();
                if (mr4.a() && !updateApiResult.forceGoToMarket) {
                    z2 = true;
                }
                if (mr4.a()) {
                    z2 = true;
                }
                if (z3) {
                    c0221eM819p0 = c0221eM819p0.m813l0(R.string.Jq, new Runnable() { // from class: l.trj0
                        @Override // java.lang.Runnable
                        public final void run() {
                            zrj0.m12046i(act);
                        }
                    });
                }
                if (z2) {
                    boolean zL = ConnectivityReceiver.l();
                    boolean zS = RemoteConfig.x().s("auto_update_apk_in_wifi_mode");
                    com.p1.mobile.putong.ui.download.a.u().n(com.p1.mobile.putong.ui.download.a.u().s(updateApiResult.url));
                    if (zL && zS && ((i = Build.VERSION.SDK_INT) < 30 || (i >= 30 && act.getPackageManager().canRequestPackageInstalls()))) {
                        m12055r(updateApiResult, xxf0.a(), true, act);
                    }
                    c0221eM819p0 = c0221eM819p0.m827t0(R.string.Hq, new Runnable() { // from class: l.urj0
                        @Override // java.lang.Runnable
                        public final void run() {
                            zrj0.m12047j(act, updateApiResult);
                        }
                    });
                }
                c0221eM819p0.m767B(true).m765A(new DialogInterface.OnCancelListener() { // from class: l.vrj0
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        zrj0.m12060w(updateApiResult);
                    }
                }).m797V(new DialogInterface.OnDismissListener() { // from class: l.wrj0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        i0e.e(cwf0VarC);
                    }
                }).m839z0();
                i0e.f(cwf0VarC);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m12046i(Act act) {
        f5539d = f5537b;
        try {
            vuw.d(act);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m12047j(final Act act, final UpdateApiResult updateApiResult) {
        f5539d = f5537b;
        if (Build.VERSION.SDK_INT < 26 || act.getPackageManager().canRequestPackageInstalls()) {
            m12057t(updateApiResult, xxf0.a(), act);
        } else {
            m12062y(act);
            act.lifecycle().filter(new w9j() { // from class: l.xrj0
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C0231c) obj) == C0231c.f1247i);
                }
            }).take(1).subscribe(mkd0.m9874G(new e30() { // from class: l.yrj0
                public final void call(Object obj) {
                    zrj0.m12057t(updateApiResult, xxf0.a(), act);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m12048k(Throwable th) {
    }

    /* JADX INFO: renamed from: m */
    public static boolean m12050m(UpdateApiResult updateApiResult, File file, Act act) {
        return m12051n(updateApiResult, file, act, true);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m12051n(UpdateApiResult updateApiResult, final File file, final Act act, boolean z) {
        if (!z || m12053p(updateApiResult.md5, file)) {
            e51.m9024G(new Runnable() { // from class: l.prj0
                @Override // java.lang.Runnable
                public final void run() {
                    zrj0.m12059v(act, file);
                }
            });
            return true;
        }
        if (file.exists()) {
            file.delete();
        }
        lsi0.m9834h(R.string.o4);
        return false;
    }

    /* JADX INFO: renamed from: o */
    public static String m12052o(File file) {
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
                                    CrashHelper.c(e);
                                    return strReplace;
                                }
                            }
                            messageDigest.update(bArr, 0, i);
                        } catch (IOException e2) {
                            CrashHelper.c(e2);
                            throw new RuntimeException("Unable to process file for MD5", e2);
                        }
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e3) {
                            CrashHelper.c(e3);
                        }
                        throw th;
                    }
                }
            } catch (FileNotFoundException e4) {
                CrashHelper.c(e4);
                return null;
            }
        } catch (NoSuchAlgorithmException e5) {
            CrashHelper.c(e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m12053p(String str, File file) {
        String strM12052o;
        if (TextUtils.isEmpty(str) || file == null || (strM12052o = m12052o(file)) == null) {
            return false;
        }
        return strM12052o.equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: q */
    public static void m12054q(final Act act, final boolean z) {
        if (f5536a >= System.currentTimeMillis()) {
            f5536a = System.currentTimeMillis();
        }
        if (f5541f.e() == null || System.currentTimeMillis() - f5536a >= f5539d) {
            CoreModule.e.a3().subscribe(mkd0.m9875H(new e30() { // from class: l.qrj0
                public final void call(Object obj) {
                    zrj0.m12040c(z, act, (UpdateApiResult) obj);
                }
            }, new e30() { // from class: l.rrj0
                public final void call(Object obj) {
                    zrj0.m12048k((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m12055r(UpdateApiResult updateApiResult, String str, boolean z, Act act) {
        m12056s(updateApiResult, str, z, act, true);
    }

    /* JADX INFO: renamed from: s */
    public static void m12056s(final UpdateApiResult updateApiResult, String str, boolean z, final Act act, final boolean z2) {
        com.p1.mobile.putong.ui.download.a.u().q(qib0.H.getDownloadHttp(), updateApiResult.url, str, z, new e30() { // from class: l.nrj0
            public final void call(Object obj) {
                zrj0.m12051n(updateApiResult, (File) obj, act, z2);
            }
        }, new e30() { // from class: l.orj0
            public final void call(Object obj) {
                lsi0.m9834h(R.string.n4);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public static void m12057t(UpdateApiResult updateApiResult, String str, Act act) {
        DownloadTask downloadTaskS = com.p1.mobile.putong.ui.download.a.u().s(updateApiResult.url);
        Objects.toString(downloadTaskS);
        if (downloadTaskS == null) {
            if (new File(str).exists() && m12050m(updateApiResult, new File(str), act)) {
                return;
            }
            if (bvv.b()) {
                lsi0.m9851y("开始下载");
            }
            m12055r(updateApiResult, str, false, act);
            return;
        }
        if (downloadTaskS.F()) {
            m12050m(updateApiResult, new File(downloadTaskS.v()), act);
        } else if (downloadTaskS.A()) {
            lsi0.m9834h(R.string.n4);
        } else {
            downloadTaskS.R(false);
            lsi0.m9834h(R.string.Gq);
        }
    }

    /* JADX INFO: renamed from: u */
    public static Uri m12058u(Context context, File file) {
        return FileProvider.getUriForFile(context, "files." + context.getPackageName(), file);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public static void m12059v(Act act, File file) {
        try {
            Intent intentAddFlags = new Intent().setAction("android.intent.action.VIEW").setDataAndType(m12058u(act, file), "application/vnd.android.package-archive").addFlags(268435456);
            intentAddFlags.addFlags(1);
            act.startActivity(intentAddFlags);
        } catch (Exception e) {
            CrashHelper.d(new Exception("UpdateChecker exception:" + e.getMessage(), e), LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m12060w(UpdateApiResult updateApiResult) {
        m12063z();
        com.p1.mobile.putong.ui.download.a.u().n(com.p1.mobile.putong.ui.download.a.u().s(updateApiResult.url));
    }

    /* JADX INFO: renamed from: x */
    public static void m12061x(Act act) {
        f5536a = 0L;
        f5539d = f5537b;
        m12054q(act, true);
    }

    @RequiresApi(api = 26)
    /* JADX INFO: renamed from: y */
    public static void m12062y(Context context) {
        Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName()));
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: z */
    public static void m12063z() {
        f5539d = Math.min(f5539d * 2, f5538c);
    }
}
