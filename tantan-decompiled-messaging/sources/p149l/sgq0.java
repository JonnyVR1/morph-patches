package p149l;

import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class sgq0 extends AbstractC21309y5 {
    public sgq0(File file) {
        super(file);
    }

    @Override // p149l.AbstractC21309y5, p149l.f2m
    /* JADX INFO: renamed from: c */
    public boolean mo119229c(String str, String str2) {
        File fileM212951k = m212951k(str, str2);
        if (fileM212951k.exists()) {
            return m184130o(fileM212951k);
        }
        return false;
    }

    @Override // p149l.AbstractC21309y5
    /* JADX INFO: renamed from: g */
    public w7e mo184127g(String str) {
        return new w7e() { // from class: l.qgq0
            @Override // p149l.w7e
            /* JADX INFO: renamed from: a */
            public final File mo174454a(String str2, String str3, File file) {
                return this.f154368a.m184133r(str2, str3, file);
            }
        };
    }

    @Override // p149l.AbstractC21309y5
    /* JADX INFO: renamed from: h */
    public String mo184128h() {
        return ".zip";
    }

    @Override // p149l.AbstractC21309y5
    /* JADX INFO: renamed from: m */
    public void mo184129m(String str, String str2) {
        File fileM212951k = m212951k(str, str2);
        if (fileM212951k.exists()) {
            eva.m118246a(fileM212951k);
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m184130o(File file) throws Throwable {
        File fileM184132q = m184132q(file);
        if (fileM184132q.exists() && fileM184132q.length() > 0) {
            String strM118253h = eva.m118253h(fileM184132q);
            if (TextUtils.isEmpty(strM118253h)) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(strM118253h);
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
                CrashHelper.m81296c(new Exception("checkDirCorrect parse Json error" + strM118253h, e));
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m184131p(String str, File file) throws Throwable {
        String str2 = this.f196369b.get(str);
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        String strM168921e = pgw.m168921e(file);
        if (b0g0.m99772e(strM168921e) && strM168921e.equals(str2)) {
            return true;
        }
        file.delete();
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final File m184132q(File file) {
        if (file == null) {
            return null;
        }
        return new File(file, "modify");
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ File m184133r(String str, String str2, File file) throws Throwable {
        File fileM212951k = m212951k(str, str2);
        boolean zM184131p = m184131p(str2, file);
        if (file == null || !zM184131p) {
            return null;
        }
        boolean zM118254i = eva.m118254i(file.getAbsolutePath(), fileM212951k + "/");
        file.delete();
        if (zM118254i && fileM212951k.exists()) {
            m184134s(fileM212951k);
            return fileM212951k;
        }
        if (!fileM212951k.exists()) {
            return null;
        }
        eva.m118246a(fileM212951k);
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final void m184134s(File file) throws Throwable {
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
            eva.m118257l(file3, jSONObject.toString());
            file.setLastModified(jCurrentTimeMillis);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }
}
