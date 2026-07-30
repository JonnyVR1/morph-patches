package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.Priority;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import l.v0t;
import l.x9j;

/* JADX INFO: renamed from: l.z5 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class AbstractC0937z5 {

    /* JADX INFO: renamed from: a */
    public File f23250a;

    /* JADX INFO: renamed from: b */
    public HashMap<String, String> f23251b = new HashMap<>(2);

    public AbstractC0937z5(File file) {
        this.f23250a = file;
        m27081b();
    }

    /* JADX INFO: renamed from: b */
    public final void m27081b() {
        if (!this.f23250a.exists()) {
            this.f23250a.mkdirs();
        }
        File file = new File(this.f23250a, ".nomedia");
        if (file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m27082c(final String str, final String str2, String str3, Priority priority, h7e h7eVar, final bwc0 bwc0Var) {
        m7s.m17729B().m17758z(new q7e.C0782a(str3, m27087l(str, str2, str3).getAbsolutePath()).m21055i(priority).m21054h(new x9j() { // from class: l.x5
            public final Object call(Object obj, Object obj2) {
                return this.f22115a.m27085j(str, str2, bwc0Var, (String) obj, (File) obj2);
            }
        }).m21053g(str).m21047a(), h7eVar);
    }

    /* JADX INFO: renamed from: d */
    public abstract v7e mo21925d(String str, String str2, bwc0 bwc0Var);

    /* JADX INFO: renamed from: e */
    public abstract File mo21926e();

    /* JADX INFO: renamed from: f */
    public void m27083f(String str, String str2, String str3, String str4, Priority priority, h7e h7eVar, bwc0 bwc0Var) {
        if (!TextUtils.isEmpty(str4)) {
            this.f23251b.put(str3, str4);
        }
        m27086k(str, str2, str3, priority, h7eVar, bwc0Var);
    }

    /* JADX INFO: renamed from: g */
    public final String m27084g(String str, String str2) {
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length >= 2) {
            String[] strArrSplit2 = strArrSplit[strArrSplit.length - 1].split("\\.");
            if (strArrSplit2.length >= 2) {
                return strArrSplit2[0];
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: h */
    public abstract String mo21927h();

    /* JADX INFO: renamed from: i */
    public abstract boolean mo21928i(String str, String str2, String str3);

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ File m27085j(String str, String str2, bwc0 bwc0Var, String str3, File file) {
        return mo21925d(str, str2, bwc0Var).mo20281a(str, str2, str3, file);
    }

    /* JADX INFO: renamed from: k */
    public final void m27086k(String str, String str2, String str3, Priority priority, h7e h7eVar, bwc0 bwc0Var) {
        if (TextUtils.isEmpty(str3) || !str3.toLowerCase().endsWith(mo21927h().toLowerCase())) {
            wrj.m25427u("后缀校验没通过，返回 effectId: " + str);
            h7eVar.onFailed("后缀校验没通过");
            return;
        }
        if (!mo21928i(str, str2, str3)) {
            wrj.m25388W(str, str2, str3, false);
            m27082c(str, str2, str3, priority, h7eVar, bwc0Var);
        } else {
            wrj.m25388W(str, str2, str3, true);
            if (h7eVar != null) {
                h7eVar.mo7819a(m27089n(str, str2, str3));
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public File m27087l(String str, String str2, String str3) {
        return new File(m27088m(str, str2), m27084g(str3, v0t.e(str3)) + mo21927h());
    }

    /* JADX INFO: renamed from: m */
    public File m27088m(String str, String str2) {
        File fileMo21926e = mo21926e();
        StringBuilder sb = new StringBuilder("effect");
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str);
        sb.append(str3);
        sb.append(str2);
        File file = new File(fileMo21926e, sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: n */
    public File m27089n(String str, String str2, String str3) {
        return new File(m27088m(str, str2), v0t.e(str3));
    }

    /* JADX INFO: renamed from: o */
    public File m27090o(String str, String str2, String str3) {
        return m27089n(str, str2, str3);
    }

    /* JADX INFO: renamed from: p */
    public String m27091p(String str, String str2, String str3) {
        return m27089n(str, str2, str3).getAbsolutePath();
    }
}
