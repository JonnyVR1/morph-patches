package p153l;

import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class xpq0 extends AbstractC20758v5 {
    public xpq0(File file) {
        super(file);
    }

    @Override // p153l.AbstractC20758v5, p153l.y4m
    /* JADX INFO: renamed from: c */
    public boolean mo199744c(String str, String str2) {
        File fileM199752k = m199752k(str, str2);
        if (fileM199752k.exists()) {
            return m212665o(fileM199752k);
        }
        return false;
    }

    @Override // p153l.AbstractC20758v5
    /* JADX INFO: renamed from: g */
    public k9e mo199748g(String str) {
        return new k9e() { // from class: l.vpq0
            @Override // p153l.k9e
            /* JADX INFO: renamed from: a */
            public final File mo148865a(String str2, String str3, File file) {
                return this.f185292a.m212668r(str2, str3, file);
            }
        };
    }

    @Override // p153l.AbstractC20758v5
    /* JADX INFO: renamed from: h */
    public String mo199749h() {
        return ".zip";
    }

    @Override // p153l.AbstractC20758v5
    /* JADX INFO: renamed from: m */
    public void mo199754m(String str, String str2) {
        File fileM199752k = m199752k(str, str2);
        if (fileM199752k.exists()) {
            qwa.m178450a(fileM199752k);
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m212665o(File file) throws Throwable {
        File fileM212667q = m212667q(file);
        if (fileM212667q.exists() && fileM212667q.length() > 0) {
            String strM178457h = qwa.m178457h(fileM212667q);
            if (TextUtils.isEmpty(strM178457h)) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(strM178457h);
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
                CrashHelper.m82479c(new Exception("checkDirCorrect parse Json error" + strM178457h, e));
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m212666p(String str, File file) throws Throwable {
        String str2 = this.f182449b.get(str);
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        String strM154420e = liw.m154420e(file);
        if (j8g0.m143832b(strM154420e) && strM154420e.equals(str2)) {
            return true;
        }
        file.delete();
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final File m212667q(File file) {
        if (file == null) {
            return null;
        }
        return new File(file, "modify");
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ File m212668r(String str, String str2, File file) throws Throwable {
        File fileM199752k = m199752k(str, str2);
        boolean zM212666p = m212666p(str2, file);
        if (file == null || !zM212666p) {
            return null;
        }
        boolean zM178458i = qwa.m178458i(file.getAbsolutePath(), fileM199752k + "/");
        file.delete();
        if (zM178458i && fileM199752k.exists()) {
            m212669s(fileM199752k);
            return fileM199752k;
        }
        if (!fileM199752k.exists()) {
            return null;
        }
        qwa.m178450a(fileM199752k);
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final void m212669s(File file) throws Throwable {
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
            qwa.m178461l(file3, jSONObject.toString());
            file.setLastModified(jCurrentTimeMillis);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }
}
