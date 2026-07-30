package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveConfig;
import com.p046p1.mobile.putong.live.base.data.BLivePkPunishMotion;
import com.p046p1.mobile.putong.live.base.data.BLivePkSetting;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class a180 {

    /* JADX INFO: renamed from: a */
    public final String f67104a;

    /* JADX INFO: renamed from: b */
    public final String f67105b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f67106c;

    /* JADX INFO: renamed from: l.a180$a */
    public static final class C15510a {

        /* JADX INFO: renamed from: a */
        public static final a180 f67107a = new a180();
    }

    public a180() {
        this.f67104a = "pk_punish_effect";
        this.f67105b = "pk_punish_effect_unzip_dir";
        this.f67106c = false;
    }

    /* JADX INFO: renamed from: n */
    public static a180 m94514n() {
        return C15510a.f67107a;
    }

    /* JADX INFO: renamed from: f */
    public final void m94515f(e30<String> e30Var, String str) {
        if (e30Var != null) {
            e30Var.call(str);
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m94516g(String str, String str2, String str3) {
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
        if ((!file2.exists() && !file2.mkdirs()) || !rhi.m179359c(str, string)) {
            return false;
        }
        try {
            rhi.m179363g(new File(string + str4 + str3), new File(string));
            return true;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m94517h(File file) {
        if (file == null) {
            return false;
        }
        try {
            return file.delete();
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m94518i(final String str, final String str2, final String str3, final e30<String> e30Var) {
        C13111a.m79654u().m79665o(new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(str2).m79640o(str3).m79635j(new f30() { // from class: l.x080
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f188937a.m94528t(str2, str, e30Var, (DownloadTask) obj, (File) obj2);
            }
        }).m79631f(new f30() { // from class: l.y080
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f195281a.m94529u(str3, (DownloadTask) obj, (Throwable) obj2);
            }
        }).m79626a());
    }

    /* JADX INFO: renamed from: j */
    public void m94519j() {
        synchronized (this) {
            try {
                if (this.f67106c) {
                    return;
                }
                this.f67106c = true;
                vwb.m200354z(m94524p(), new e30() { // from class: l.w080
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f183735a.m94530v((BLivePkPunishMotion) obj);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m94520k(String str, long j, e30<String> e30Var) {
        String strM94523o = m94523o(str, j);
        String strM94521l = m94521l(strM94523o);
        if (new File(strM94521l).exists()) {
            m94515f(e30Var, strM94521l);
            return;
        }
        String strM94522m = m94522m("pk_punish_effect", strM94523o);
        if (TextUtils.isEmpty(strM94523o)) {
            return;
        }
        m94518i(str, strM94523o, strM94522m, e30Var);
    }

    /* JADX INFO: renamed from: l */
    public final String m94521l(String str) {
        return m94526r() + File.separator + m94525q(str);
    }

    /* JADX INFO: renamed from: m */
    public final String m94522m(String str, String str2) {
        return ypv.f199497e.getDir(str, 0).getAbsolutePath() + File.separator + m94525q(str2);
    }

    /* JADX INFO: renamed from: o */
    public final String m94523o(final String str, long j) {
        BLivePkPunishMotion bLivePkPunishMotion = (BLivePkPunishMotion) vwb.m200346r(m94524p(), new w9j() { // from class: l.v080
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(t0g0.m186871l(((BLivePkPunishMotion) obj).f44427id, str));
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
    public final List<BLivePkPunishMotion> m94524p() {
        BLiveConfig bLiveConfig;
        BLivePkSetting bLivePkSetting;
        uut uutVarM215672k = ypv.m215672k();
        if (uutVarM215672k == null) {
            return new ArrayList();
        }
        BLiveSettings bLiveSettingsM195583A3 = uutVarM215672k.m195583A3();
        return (bLiveSettingsM195583A3 == null || (bLiveConfig = bLiveSettingsM195583A3.liveConfig) == null || (bLivePkSetting = bLiveConfig.f44352pk) == null) ? new ArrayList() : bLivePkSetting.pkMotions;
    }

    /* JADX INFO: renamed from: q */
    public final String m94525q(String str) {
        return str.substring(str.lastIndexOf(File.separator) + 1);
    }

    /* JADX INFO: renamed from: r */
    public final String m94526r() {
        return ypv.f199497e.getDir("pk_punish_effect_unzip_dir", 0).getAbsolutePath();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m94527s(File file, String str, String str2, e30 e30Var) {
        if (m94516g(file.getPath(), m94526r(), m94525q(str))) {
            ht70.m132853j("download id:" + str2 + ",path" + m94521l(str));
            m94515f(e30Var, m94521l(str));
            m94517h(file);
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m94528t(final String str, final String str2, final e30 e30Var, DownloadTask downloadTask, final File file) {
        gbu.f101912b.m125328a(new Runnable() { // from class: l.z080
            @Override // java.lang.Runnable
            public final void run() {
                this.f200941a.m94527s(file, str, str2, e30Var);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m94529u(String str, DownloadTask downloadTask, Throwable th) {
        m94517h(new File(str));
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m94530v(BLivePkPunishMotion bLivePkPunishMotion) {
        m94520k(bLivePkPunishMotion.f44427id, 0L, null);
    }
}
