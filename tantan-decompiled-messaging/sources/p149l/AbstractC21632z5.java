package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.Priority;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.z5 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21632z5 {

    /* JADX INFO: renamed from: a */
    public File f201725a;

    /* JADX INFO: renamed from: b */
    public HashMap<String, String> f201726b = new HashMap<>(2);

    public AbstractC21632z5(File file) {
        this.f201725a = file;
        m217249b();
    }

    /* JADX INFO: renamed from: b */
    public final void m217249b() {
        if (!this.f201725a.exists()) {
            this.f201725a.mkdirs();
        }
        File file = new File(this.f201725a, ".nomedia");
        if (file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m217250c(final String str, final String str2, String str3, Priority priority, h7e h7eVar, final bwc0 bwc0Var) {
        m7s.m153386B().m153415z(new q7e.C19441a(str3, m217255l(str, str2, str3).getAbsolutePath()).m173256i(priority).m173255h(new x9j() { // from class: l.x5
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f191072a.m217253j(str, str2, bwc0Var, (String) obj, (File) obj2);
            }
        }).m173254g(str).m173248a(), h7eVar);
    }

    /* JADX INFO: renamed from: d */
    public abstract v7e mo179245d(String str, String str2, bwc0 bwc0Var);

    /* JADX INFO: renamed from: e */
    public abstract File mo179246e();

    /* JADX INFO: renamed from: f */
    public void m217251f(String str, String str2, String str3, String str4, Priority priority, h7e h7eVar, bwc0 bwc0Var) {
        if (!TextUtils.isEmpty(str4)) {
            this.f201726b.put(str3, str4);
        }
        m217254k(str, str2, str3, priority, h7eVar, bwc0Var);
    }

    /* JADX INFO: renamed from: g */
    public final String m217252g(String str, String str2) {
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
    public abstract String mo179247h();

    /* JADX INFO: renamed from: i */
    public abstract boolean mo179248i(String str, String str2, String str3);

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ File m217253j(String str, String str2, bwc0 bwc0Var, String str3, File file) {
        return mo179245d(str, str2, bwc0Var).mo168891a(str, str2, str3, file);
    }

    /* JADX INFO: renamed from: k */
    public final void m217254k(String str, String str2, String str3, Priority priority, h7e h7eVar, bwc0 bwc0Var) {
        if (TextUtils.isEmpty(str3) || !str3.toLowerCase().endsWith(mo179247h().toLowerCase())) {
            wrj.m205255u("后缀校验没通过，返回 effectId: " + str);
            h7eVar.onFailed("后缀校验没通过");
            return;
        }
        if (!mo179248i(str, str2, str3)) {
            wrj.m205216W(str, str2, str3, false);
            m217250c(str, str2, str3, priority, h7eVar, bwc0Var);
        } else {
            wrj.m205216W(str, str2, str3, true);
            if (h7eVar != null) {
                h7eVar.mo74248a(m217257n(str, str2, str3));
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public File m217255l(String str, String str2, String str3) {
        return new File(m217256m(str, str2), m217252g(str3, v0t.m196511e(str3)) + mo179247h());
    }

    /* JADX INFO: renamed from: m */
    public File m217256m(String str, String str2) {
        File fileMo179246e = mo179246e();
        StringBuilder sb = new StringBuilder("effect");
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str);
        sb.append(str3);
        sb.append(str2);
        File file = new File(fileMo179246e, sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: n */
    public File m217257n(String str, String str2, String str3) {
        return new File(m217256m(str, str2), v0t.m196511e(str3));
    }

    /* JADX INFO: renamed from: o */
    public File m217258o(String str, String str2, String str3) {
        return m217257n(str, str2, str3);
    }

    /* JADX INFO: renamed from: p */
    public String m217259p(String str, String str2, String str3) {
        return m217257n(str, str2, str3).getAbsolutePath();
    }
}
