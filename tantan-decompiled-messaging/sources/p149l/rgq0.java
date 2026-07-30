package p149l;

import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class rgq0 extends AbstractC21632z5 {
    public rgq0(File file) {
        super(file);
    }

    @Override // p149l.AbstractC21632z5
    /* JADX INFO: renamed from: d */
    public v7e mo179245d(final String str, String str2, final bwc0 bwc0Var) {
        return new v7e() { // from class: l.pgq0
            @Override // p149l.v7e
            /* JADX INFO: renamed from: a */
            public final File mo168891a(String str3, String str4, String str5, File file) {
                return this.f148799a.m179254w(bwc0Var, str, str3, str4, str5, file);
            }
        };
    }

    @Override // p149l.AbstractC21632z5
    /* JADX INFO: renamed from: e */
    public File mo179246e() {
        File file = this.f201725a;
        return file != null ? file : voe.m199164b();
    }

    @Override // p149l.AbstractC21632z5
    /* JADX INFO: renamed from: h */
    public String mo179247h() {
        return ".zip";
    }

    @Override // p149l.AbstractC21632z5
    /* JADX INFO: renamed from: i */
    public boolean mo179248i(String str, String str2, String str3) {
        File fileM217257n = m217257n(str, str2, str3);
        if (fileM217257n.exists()) {
            return m179249r(fileM217257n, str);
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m179249r(File file, String str) throws Throwable {
        File fileM179251t = m179251t(file);
        if (fileM179251t.exists() && fileM179251t.length() > 0) {
            String strM202928g = wet.m202928g(fileM179251t, str);
            if (TextUtils.isEmpty(strM202928g)) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(strM202928g);
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
                CrashHelper.m81296c(new Exception("checkDirCorrect parse Json error" + strM202928g, e));
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m179250s(String str, File file) throws Throwable {
        String str2 = this.f201726b.get(str);
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        String strM168921e = pgw.m168921e(file);
        if (!TextUtils.isEmpty(strM168921e) && strM168921e.equals(str2)) {
            return true;
        }
        wet.m202926e(file);
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final File m179251t(File file) {
        if (file == null) {
            return null;
        }
        return new File(file, "modify");
    }

    /* JADX INFO: renamed from: u */
    public final String m179252u(File file) {
        return pgw.m168921e(file);
    }

    /* JADX INFO: renamed from: v */
    public boolean m179253v(File file, String str) {
        return m179249r(file, str);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ File m179254w(bwc0 bwc0Var, String str, String str2, String str3, String str4, File file) throws Throwable {
        File fileM217257n = m217257n(str2, str3, str4);
        boolean zM179250s = m179250s(str4, file);
        if (!zM179250s) {
            nqe.m160611q(bwc0Var);
            nqe.m160594H(str, str4, m179252u(file), "md5");
        }
        if (file == null || !zM179250s) {
            return null;
        }
        wrj.m205249o0(str);
        boolean zM202929h = wet.m202929h(file.getAbsolutePath(), fileM217257n + "/", str);
        file.delete();
        if (zM202929h && fileM217257n.exists()) {
            wrj.m205247n0(true, str);
            m179255x(fileM217257n);
            return fileM217257n;
        }
        wrj.m205247n0(false, str);
        nqe.m160594H(str, str4, m179252u(file), "unzip");
        nqe.m160617w(bwc0Var);
        if (!fileM217257n.exists()) {
            return null;
        }
        wet.m202926e(fileM217257n);
        return null;
    }

    /* JADX INFO: renamed from: x */
    public final void m179255x(File file) throws Throwable {
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
            wet.m202933l(file3, jSONObject.toString());
            file.setLastModified(jCurrentTimeMillis);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }
}
