package p153l;

import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class wpq0 extends AbstractC21019w5 {
    public wpq0(File file) {
        super(file);
    }

    @Override // p153l.AbstractC21019w5
    /* JADX INFO: renamed from: d */
    public j9e mo204909d(final String str, String str2, final e4d0 e4d0Var) {
        return new j9e() { // from class: l.upq0
            @Override // p153l.j9e
            /* JADX INFO: renamed from: a */
            public final File mo143941a(String str3, String str4, String str5, File file) {
                return this.f180313a.m207495w(e4d0Var, str, str3, str4, str5, file);
            }
        };
    }

    @Override // p153l.AbstractC21019w5
    /* JADX INFO: renamed from: e */
    public File mo204910e() {
        File file = this.f187453a;
        return file != null ? file : zpe.m220835b();
    }

    @Override // p153l.AbstractC21019w5
    /* JADX INFO: renamed from: h */
    public String mo204913h() {
        return ".zip";
    }

    @Override // p153l.AbstractC21019w5
    /* JADX INFO: renamed from: i */
    public boolean mo204914i(String str, String str2, String str3) {
        File fileM204919n = m204919n(str, str2, str3);
        if (fileM204919n.exists()) {
            return m207490r(fileM204919n, str);
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m207490r(File file, String str) throws Throwable {
        File fileM207492t = m207492t(file);
        if (fileM207492t.exists() && fileM207492t.length() > 0) {
            String strM210943g = xgt.m210943g(fileM207492t, str);
            if (TextUtils.isEmpty(strM210943g)) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(strM210943g);
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
                CrashHelper.m82479c(new Exception("checkDirCorrect parse Json error" + strM210943g, e));
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m207491s(String str, File file) throws Throwable {
        String str2 = this.f187454b.get(str);
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        String strM154420e = liw.m154420e(file);
        if (!TextUtils.isEmpty(strM154420e) && strM154420e.equals(str2)) {
            return true;
        }
        xgt.m210941e(file);
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final File m207492t(File file) {
        if (file == null) {
            return null;
        }
        return new File(file, "modify");
    }

    /* JADX INFO: renamed from: u */
    public final String m207493u(File file) {
        return liw.m154420e(file);
    }

    /* JADX INFO: renamed from: v */
    public boolean m207494v(File file, String str) {
        return m207490r(file, str);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ File m207495w(e4d0 e4d0Var, String str, String str2, String str3, String str4, File file) throws Throwable {
        File fileM204919n = m204919n(str2, str3, str4);
        boolean zM207491s = m207491s(str4, file);
        if (!zM207491s) {
            rre.m182745q(e4d0Var);
            rre.m182728H(str, str4, m207493u(file), "md5");
        }
        if (file == null || !zM207491s) {
            return null;
        }
        muj.m160213o0(str);
        boolean zM210944h = xgt.m210944h(file.getAbsolutePath(), fileM204919n + "/", str);
        file.delete();
        if (zM210944h && fileM204919n.exists()) {
            muj.m160211n0(true, str);
            m207496x(fileM204919n);
            return fileM204919n;
        }
        muj.m160211n0(false, str);
        rre.m182728H(str, str4, m207493u(file), "unzip");
        rre.m182751w(e4d0Var);
        if (!fileM204919n.exists()) {
            return null;
        }
        xgt.m210941e(fileM204919n);
        return null;
    }

    /* JADX INFO: renamed from: x */
    public final void m207496x(File file) throws Throwable {
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
            xgt.m210948l(file3, jSONObject.toString());
            file.setLastModified(jCurrentTimeMillis);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }
}
