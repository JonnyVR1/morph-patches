package p003l;

import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.util.Iterator;
import l.b0g0;
import l.pgw;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class sgq0 extends AbstractC3491y5 {
    public sgq0(File file) {
        super(file);
    }

    @Override // p003l.AbstractC3491y5, p003l.f2m
    /* JADX INFO: renamed from: c */
    public boolean mo6372c(String str, String str2) {
        File fileM11151k = m11151k(str, str2);
        if (fileM11151k.exists()) {
            return m9345o(fileM11151k);
        }
        return false;
    }

    @Override // p003l.AbstractC3491y5
    /* JADX INFO: renamed from: g */
    public w7e mo9342g(String str) {
        return new w7e() { // from class: l.qgq0
            @Override // p003l.w7e
            /* JADX INFO: renamed from: a */
            public final File mo8994a(String str2, String str3, File file) {
                return this.f7020a.m9348r(str2, str3, file);
            }
        };
    }

    @Override // p003l.AbstractC3491y5
    /* JADX INFO: renamed from: h */
    public String mo9343h() {
        return ".zip";
    }

    @Override // p003l.AbstractC3491y5
    /* JADX INFO: renamed from: m */
    public void mo9344m(String str, String str2) {
        File fileM11151k = m11151k(str, str2);
        if (fileM11151k.exists()) {
            eva.m6321a(fileM11151k);
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m9345o(File file) throws Throwable {
        File fileM9347q = m9347q(file);
        if (fileM9347q.exists() && fileM9347q.length() > 0) {
            String strM6328h = eva.m6328h(fileM9347q);
            if (TextUtils.isEmpty(strM6328h)) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(strM6328h);
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
                CrashHelper.c(new Exception("checkDirCorrect parse Json error" + strM6328h, e));
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m9346p(String str, File file) {
        String str2 = this.f8988b.get(str);
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        String strE = pgw.e(file);
        if (b0g0.e(strE) && strE.equals(str2)) {
            return true;
        }
        file.delete();
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final File m9347q(File file) {
        if (file == null) {
            return null;
        }
        return new File(file, "modify");
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ File m9348r(String str, String str2, File file) throws Throwable {
        File fileM11151k = m11151k(str, str2);
        boolean zM9346p = m9346p(str2, file);
        if (file == null || !zM9346p) {
            return null;
        }
        boolean zM6329i = eva.m6329i(file.getAbsolutePath(), fileM11151k + "/");
        file.delete();
        if (zM6329i && fileM11151k.exists()) {
            m9349s(fileM11151k);
            return fileM11151k;
        }
        if (!fileM11151k.exists()) {
            return null;
        }
        eva.m6321a(fileM11151k);
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final void m9349s(File file) throws Throwable {
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
            eva.m6332l(file3, jSONObject.toString());
            file.setLastModified(jCurrentTimeMillis);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }
}
