package p002l;

import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.util.Iterator;
import l.pgw;
import l.wet;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rgq0 extends AbstractC0937z5 {
    public rgq0(File file) {
        super(file);
    }

    @Override // p002l.AbstractC0937z5
    /* JADX INFO: renamed from: d */
    public v7e mo21925d(final String str, String str2, final bwc0 bwc0Var) {
        return new v7e() { // from class: l.pgq0
            @Override // p002l.v7e
            /* JADX INFO: renamed from: a */
            public final File mo20281a(String str3, String str4, String str5, File file) {
                return this.f17316a.m21934w(bwc0Var, str, str3, str4, str5, file);
            }
        };
    }

    @Override // p002l.AbstractC0937z5
    /* JADX INFO: renamed from: e */
    public File mo21926e() {
        File file = this.f23250a;
        return file != null ? file : voe.m24084b();
    }

    @Override // p002l.AbstractC0937z5
    /* JADX INFO: renamed from: h */
    public String mo21927h() {
        return ".zip";
    }

    @Override // p002l.AbstractC0937z5
    /* JADX INFO: renamed from: i */
    public boolean mo21928i(String str, String str2, String str3) {
        File fileM27089n = m27089n(str, str2, str3);
        if (fileM27089n.exists()) {
            return m21929r(fileM27089n, str);
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m21929r(File file, String str) {
        File fileM21931t = m21931t(file);
        if (fileM21931t.exists() && fileM21931t.length() > 0) {
            String strG = wet.g(fileM21931t, str);
            if (TextUtils.isEmpty(strG)) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(strG);
                if (jSONObject.optLong("dir") != file.lastModified()) {
                    return false;
                }
                jSONObject.remove("dir");
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    File file2 = new File(file, next);
                    if (!file2.exists() || jSONObject.optLong(next) != file2.lastModified()) {
                        return false;
                    }
                }
                return true;
            } catch (Exception e) {
                CrashHelper.c(new Exception("checkDirCorrect parse Json error" + strG, e));
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m21930s(String str, File file) {
        String str2 = this.f23251b.get(str);
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        String strE = pgw.e(file);
        if (!TextUtils.isEmpty(strE) && strE.equals(str2)) {
            return true;
        }
        wet.e(file);
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final File m21931t(File file) {
        if (file == null) {
            return null;
        }
        return new File(file, "modify");
    }

    /* JADX INFO: renamed from: u */
    public final String m21932u(File file) {
        return pgw.e(file);
    }

    /* JADX INFO: renamed from: v */
    public boolean m21933v(File file, String str) {
        return m21929r(file, str);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ File m21934w(bwc0 bwc0Var, String str, String str2, String str3, String str4, File file) {
        File fileM27089n = m27089n(str2, str3, str4);
        boolean zM21930s = m21930s(str4, file);
        if (!zM21930s) {
            nqe.m18962q(bwc0Var);
            nqe.m18945H(str, str4, m21932u(file), "md5");
        }
        if (file == null || !zM21930s) {
            return null;
        }
        wrj.m25421o0(str);
        boolean zH = wet.h(file.getAbsolutePath(), fileM27089n + "/", str);
        file.delete();
        if (zH && fileM27089n.exists()) {
            wrj.m25419n0(true, str);
            m21935x(fileM27089n);
            return fileM27089n;
        }
        wrj.m25419n0(false, str);
        nqe.m18945H(str, str4, m21932u(file), "unzip");
        nqe.m18968w(bwc0Var);
        if (!fileM27089n.exists()) {
            return null;
        }
        wet.e(fileM27089n);
        return null;
    }

    /* JADX INFO: renamed from: x */
    public final void m21935x(File file) {
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) * 1000;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("dir", Long.valueOf(jCurrentTimeMillis));
            if (file.listFiles() != null) {
                for (File file2 : file.listFiles()) {
                    if (file2 != null && !"modify".equals(file2.getName())) {
                        jSONObject.putOpt(file2.getName(), Long.valueOf(file2.lastModified()));
                    }
                }
            }
            File file3 = new File(file, "modify");
            if (!file3.exists()) {
                file3.createNewFile();
            }
            wet.l(file3, jSONObject.toString());
            file.setLastModified(jCurrentTimeMillis);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }
}
