package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.core.content.FileProvider;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.data.UpdateApiResult;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
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
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes8.dex */
public class zrj0 {

    /* JADX INFO: renamed from: a */
    public static long f204519a;

    /* JADX INFO: renamed from: b */
    public static final long f204520b = 3600000;

    /* JADX INFO: renamed from: c */
    public static final long f204521c = 43200000;

    /* JADX INFO: renamed from: d */
    public static long f204522d = 3600000;

    /* JADX INFO: renamed from: e */
    public static String f204523e = "";

    /* JADX INFO: renamed from: f */
    public static C22392a<Boolean> f204524f = C22392a.m221512b();

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m219954c(boolean z, final Act act, final UpdateApiResult updateApiResult) {
        int i;
        if (updateApiResult == null) {
            f204524f.m132487l(Boolean.FALSE);
            return;
        }
        f204524f.m132487l(Boolean.valueOf(updateApiResult.hasUpdate));
        if (updateApiResult.hasUpdate && z) {
            if (!NullChecker.m81303a(f204523e) || !f204523e.equals(updateApiResult.appVersion)) {
                f204523e = updateApiResult.appVersion;
                f204519a = 0L;
                f204522d = f204520b;
            }
            if (System.currentTimeMillis() - f204519a >= f204522d) {
                f204519a = System.currentTimeMillis();
                final cwf0 cwf0VarM133794c = i0e.m133794c("p_alert_version_upgrade_popup", "updateDlg");
                cwf0VarM133794c.m109039o(ic50.m135327j().m135333f().m145234U(OmsDialog.p_alert_version_upgrade_popup.getIdentifier(), u4e.m191727b("passive", "alert", "alert_system", "null", "swipe_page", "version_upgrade")));
                Dialog.C4309e c4309eM20548p0 = new Dialog.C4309e(act).m20503E0(R$string.f17833Iq).m20547p(act.adapterChangeLog(vwb.m200324f0(vwb.m200311Y(updateApiResult.appVersion, updateApiResult.changelog)))).m20548p0(R$string.f18408c, new Runnable() { // from class: l.srj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        zrj0.m219974w(updateApiResult);
                    }
                });
                boolean z2 = false;
                boolean z3 = !mr4.m156014a() && vuw.m200136b();
                if (mr4.m156014a() && !updateApiResult.forceGoToMarket) {
                    z2 = true;
                }
                if (mr4.m156014a()) {
                    z2 = true;
                }
                if (z3) {
                    c4309eM20548p0 = c4309eM20548p0.m20542l0(R$string.f17863Jq, new Runnable() { // from class: l.trj0
                        @Override // java.lang.Runnable
                        public final void run() {
                            zrj0.m219960i(act);
                        }
                    });
                }
                if (z2) {
                    boolean zM81289l = ConnectivityReceiver.m81289l();
                    boolean zM79330s = RemoteConfig.m79298x().m79330s("auto_update_apk_in_wifi_mode");
                    C13111a.m79654u().m79664n(C13111a.m79654u().m79669s(updateApiResult.url));
                    if (zM81289l && zM79330s && ((i = Build.VERSION.SDK_INT) < 30 || (i >= 30 && act.getPackageManager().canRequestPackageInstalls()))) {
                        m219969r(updateApiResult, xxf0.m211477a(), true, act);
                    }
                    c4309eM20548p0 = c4309eM20548p0.m20556t0(R$string.f17803Hq, new Runnable() { // from class: l.urj0
                        @Override // java.lang.Runnable
                        public final void run() {
                            zrj0.m219961j(act, updateApiResult);
                        }
                    });
                }
                c4309eM20548p0.m20496B(true).m20494A(new DialogInterface.OnCancelListener() { // from class: l.vrj0
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        zrj0.m219974w(updateApiResult);
                    }
                }).m20526V(new DialogInterface.OnDismissListener() { // from class: l.wrj0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        i0e.m133796e(cwf0VarM133794c);
                    }
                }).m20568z0();
                i0e.m133797f(cwf0VarM133794c);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m219960i(Act act) {
        f204522d = f204520b;
        try {
            vuw.m200138d(act);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m219961j(final Act act, final UpdateApiResult updateApiResult) {
        f204522d = f204520b;
        if (Build.VERSION.SDK_INT < 26 || act.getPackageManager().canRequestPackageInstalls()) {
            m219971t(updateApiResult, xxf0.m211477a(), act);
        } else {
            m219976y(act);
            act.lifecycle().filter(new w9j() { // from class: l.xrj0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
                }
            }).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.yrj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    zrj0.m219971t(updateApiResult, xxf0.m211477a(), act);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m219962k(Throwable th) {
    }

    /* JADX INFO: renamed from: m */
    public static boolean m219964m(UpdateApiResult updateApiResult, File file, Act act) {
        return m219965n(updateApiResult, file, act, true);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m219965n(UpdateApiResult updateApiResult, final File file, final Act act, boolean z) {
        if (!z || m219967p(updateApiResult.md5, file)) {
            e51.m114742G(new Runnable() { // from class: l.prj0
                @Override // java.lang.Runnable
                public final void run() {
                    zrj0.m219973v(act, file);
                }
            });
            return true;
        }
        if (file.exists()) {
            file.delete();
        }
        lsi0.m151578h(R$string.f18782o4);
        return false;
    }

    /* JADX INFO: renamed from: o */
    public static String m219966o(File file) {
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
                                    CrashHelper.m81296c(e);
                                    return strReplace;
                                }
                            }
                            messageDigest.update(bArr, 0, i);
                        } catch (IOException e2) {
                            CrashHelper.m81296c(e2);
                            throw new RuntimeException("Unable to process file for MD5", e2);
                        }
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e3) {
                            CrashHelper.m81296c(e3);
                        }
                        throw th;
                    }
                }
            } catch (FileNotFoundException e4) {
                CrashHelper.m81296c(e4);
                return null;
            }
        } catch (NoSuchAlgorithmException e5) {
            CrashHelper.m81296c(e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m219967p(String str, File file) {
        String strM219966o;
        if (TextUtils.isEmpty(str) || file == null || (strM219966o = m219966o(file)) == null) {
            return false;
        }
        return strM219966o.equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: q */
    public static void m219968q(final Act act, final boolean z) {
        if (f204519a >= System.currentTimeMillis()) {
            f204519a = System.currentTimeMillis();
        }
        if (f204524f.m221515e() == null || System.currentTimeMillis() - f204519a >= f204522d) {
            CoreModule.f17547e.m33225a3().subscribe(mkd0.m154956H(new e30() { // from class: l.qrj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    zrj0.m219954c(z, act, (UpdateApiResult) obj);
                }
            }, new e30() { // from class: l.rrj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    zrj0.m219962k((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m219969r(UpdateApiResult updateApiResult, String str, boolean z, Act act) {
        m219970s(updateApiResult, str, z, act, true);
    }

    /* JADX INFO: renamed from: s */
    public static void m219970s(final UpdateApiResult updateApiResult, String str, boolean z, final Act act, final boolean z2) {
        C13111a.m79654u().m79667q(qib0.f154693H.getDownloadHttp(), updateApiResult.url, str, z, new e30() { // from class: l.nrj0
            @Override // p149l.e30
            public final void call(Object obj) {
                zrj0.m219965n(updateApiResult, (File) obj, act, z2);
            }
        }, new e30() { // from class: l.orj0
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151578h(R$string.f18751n4);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public static void m219971t(UpdateApiResult updateApiResult, String str, Act act) {
        DownloadTask downloadTaskM79669s = C13111a.m79654u().m79669s(updateApiResult.url);
        Objects.toString(downloadTaskM79669s);
        if (downloadTaskM79669s == null) {
            if (new File(str).exists() && m219964m(updateApiResult, new File(str), act)) {
                return;
            }
            if (bvv.m104079b()) {
                lsi0.m151595y("开始下载");
            }
            m219969r(updateApiResult, str, false, act);
            return;
        }
        if (downloadTaskM79669s.m79601F()) {
            m219964m(updateApiResult, new File(downloadTaskM79669s.m79621v()), act);
        } else if (downloadTaskM79669s.m79596A()) {
            lsi0.m151578h(R$string.f18751n4);
        } else {
            downloadTaskM79669s.m79613R(false);
            lsi0.m151578h(R$string.f17773Gq);
        }
    }

    /* JADX INFO: renamed from: u */
    public static Uri m219972u(Context context, File file) {
        return FileProvider.getUriForFile(context, "files." + context.getPackageName(), file);
    }

    /* JADX INFO: renamed from: v */
    public static void m219973v(Act act, File file) {
        try {
            Intent intentAddFlags = new Intent().setAction("android.intent.action.VIEW").setDataAndType(m219972u(act, file), "application/vnd.android.package-archive").addFlags(268435456);
            intentAddFlags.addFlags(1);
            act.startActivity(intentAddFlags);
        } catch (Exception e) {
            CrashHelper.m81297d(new Exception("UpdateChecker exception:" + e.getMessage(), e), 1000);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m219974w(UpdateApiResult updateApiResult) {
        m219977z();
        C13111a.m79654u().m79664n(C13111a.m79654u().m79669s(updateApiResult.url));
    }

    /* JADX INFO: renamed from: x */
    public static void m219975x(Act act) {
        f204519a = 0L;
        f204522d = f204520b;
        m219968q(act, true);
    }

    @RequiresApi(api = 26)
    /* JADX INFO: renamed from: y */
    public static void m219976y(Context context) {
        Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName()));
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: z */
    public static void m219977z() {
        f204522d = Math.min(f204522d * 2, f204521c);
    }
}
