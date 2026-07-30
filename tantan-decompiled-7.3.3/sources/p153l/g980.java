package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveConfig;
import com.p051p1.mobile.putong.live.base.data.BLivePkPunishMotion;
import com.p051p1.mobile.putong.live.base.data.BLivePkSetting;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class g980 {

    /* JADX INFO: renamed from: a */
    public final String f102770a;

    /* JADX INFO: renamed from: b */
    public final String f102771b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f102772c;

    /* JADX INFO: renamed from: l.g980$a */
    public static final class C17180a {

        /* JADX INFO: renamed from: a */
        public static final g980 f102773a = new g980();
    }

    public g980() {
        this.f102770a = "pk_punish_effect";
        this.f102771b = "pk_punish_effect_unzip_dir";
        this.f102772c = false;
    }

    /* JADX INFO: renamed from: n */
    public static g980 m129522n() {
        return C17180a.f102773a;
    }

    /* JADX INFO: renamed from: f */
    public final void m129523f(y20<String> y20Var, String str) {
        if (y20Var != null) {
            y20Var.call(str);
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m129524g(String str, String str2, String str3) {
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        String str4 = File.separator;
        sb.append(str4);
        sb.append(str3);
        String string = sb.toString();
        File file2 = new File(string);
        if ((!file2.exists() && !file2.mkdirs()) || !oki.m168015c(str, string)) {
            return false;
        }
        try {
            oki.m168019g(new File(string + str4 + str3), new File(string));
            return true;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m129525h(File file) {
        if (file == null) {
            return false;
        }
        try {
            return file.delete();
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m129526i(final String str, final String str2, final String str3, final y20<String> y20Var) {
        C13274a.m80837u().m80848o(new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(str2).m80823o(str3).m80818j(new z20() { // from class: l.d980
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f85719a.m129536t(str2, str, y20Var, (DownloadTask) obj, (File) obj2);
            }
        }).m80814f(new z20() { // from class: l.e980
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f92601a.m129537u(str3, (DownloadTask) obj, (Throwable) obj2);
            }
        }).m80809a());
    }

    /* JADX INFO: renamed from: j */
    public void m129527j() {
        synchronized (this) {
            try {
                if (this.f102772c) {
                    return;
                }
                this.f102772c = true;
                jyb.m147537z(m129532p(), new y20() { // from class: l.c980
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f80307a.m129538v((BLivePkPunishMotion) obj);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m129528k(String str, long j, y20<String> y20Var) {
        String strM129531o = m129531o(str, j);
        String strM129529l = m129529l(strM129531o);
        if (new File(strM129529l).exists()) {
            m129523f(y20Var, strM129529l);
            return;
        }
        String strM129530m = m129530m("pk_punish_effect", strM129531o);
        if (TextUtils.isEmpty(strM129531o)) {
            return;
        }
        m129526i(str, strM129531o, strM129530m, y20Var);
    }

    /* JADX INFO: renamed from: l */
    public final String m129529l(String str) {
        return m129534r() + File.separator + m129533q(str);
    }

    /* JADX INFO: renamed from: m */
    public final String m129530m(String str, String str2) {
        return zrv.f205803e.getDir(str, 0).getAbsolutePath() + File.separator + m129533q(str2);
    }

    /* JADX INFO: renamed from: o */
    public final String m129531o(final String str, long j) {
        BLivePkPunishMotion bLivePkPunishMotion = (BLivePkPunishMotion) jyb.m147529r(m129532p(), new qcj() { // from class: l.b980
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(a9g0.m96577l(((BLivePkPunishMotion) obj).f45275id, str));
            }
        });
        if (bLivePkPunishMotion == null) {
            return "";
        }
        if (j >= 38) {
            return bLivePkPunishMotion.superUrl;
        }
        return j >= 25 ? bLivePkPunishMotion.vipUrl : bLivePkPunishMotion.url;
    }

    /* JADX INFO: renamed from: p */
    public final List<BLivePkPunishMotion> m129532p() {
        BLiveConfig bLiveConfig;
        BLivePkSetting bLivePkSetting;
        vwt vwtVarM221193k = zrv.m221193k();
        if (vwtVarM221193k == null) {
            return new ArrayList();
        }
        BLiveSettings bLiveSettingsM203370A3 = vwtVarM221193k.m203370A3();
        return (bLiveSettingsM203370A3 == null || (bLiveConfig = bLiveSettingsM203370A3.liveConfig) == null || (bLivePkSetting = bLiveConfig.f45200pk) == null) ? new ArrayList() : bLivePkSetting.pkMotions;
    }

    /* JADX INFO: renamed from: q */
    public final String m129533q(String str) {
        return str.substring(str.lastIndexOf(File.separator) + 1);
    }

    /* JADX INFO: renamed from: r */
    public final String m129534r() {
        return zrv.f205803e.getDir("pk_punish_effect_unzip_dir", 0).getAbsolutePath();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m129535s(File file, String str, String str2, y20 y20Var) {
        if (m129524g(file.getPath(), m129534r(), m129533q(str))) {
            n180.m161093j("download id:" + str2 + ",path" + m129529l(str));
            m129523f(y20Var, m129529l(str));
            m129525h(file);
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m129536t(final String str, final String str2, final y20 y20Var, DownloadTask downloadTask, final File file) {
        hdu.f109038b.m134613a(new Runnable() { // from class: l.f980
            @Override // java.lang.Runnable
            public final void run() {
                this.f97835a.m129535s(file, str, str2, y20Var);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m129537u(String str, DownloadTask downloadTask, Throwable th) {
        m129525h(new File(str));
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m129538v(BLivePkPunishMotion bLivePkPunishMotion) {
        m129528k(bLivePkPunishMotion.f45275id, 0L, null);
    }
}
