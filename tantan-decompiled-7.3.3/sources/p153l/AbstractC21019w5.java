package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.Priority;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.w5 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21019w5 {

    /* JADX INFO: renamed from: a */
    public File f187453a;

    /* JADX INFO: renamed from: b */
    public HashMap<String, String> f187454b = new HashMap<>(2);

    public AbstractC21019w5(File file) {
        this.f187453a = file;
        m204907b();
    }

    /* JADX INFO: renamed from: b */
    public final void m204907b() {
        if (!this.f187453a.exists()) {
            this.f187453a.mkdirs();
        }
        File file = new File(this.f187453a, ".nomedia");
        if (file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m204908c(final String str, final String str2, String str3, Priority priority, w8e w8eVar, final e4d0 e4d0Var) {
        n9s.m162004B().m162033z(new f9e.C16927a(str3, m204917l(str, str2, str3).getAbsolutePath()).m124655i(priority).m124654h(new rcj() { // from class: l.u5
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f177572a.m204915j(str, str2, e4d0Var, (String) obj, (File) obj2);
            }
        }).m124653g(str).m124647a(), w8eVar);
    }

    /* JADX INFO: renamed from: d */
    public abstract j9e mo204909d(String str, String str2, e4d0 e4d0Var);

    /* JADX INFO: renamed from: e */
    public abstract File mo204910e();

    /* JADX INFO: renamed from: f */
    public void m204911f(String str, String str2, String str3, String str4, Priority priority, w8e w8eVar, e4d0 e4d0Var) {
        if (!TextUtils.isEmpty(str4)) {
            this.f187454b.put(str3, str4);
        }
        m204916k(str, str2, str3, priority, w8eVar, e4d0Var);
    }

    /* JADX INFO: renamed from: g */
    public final String m204912g(String str, String str2) {
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
    public abstract String mo204913h();

    /* JADX INFO: renamed from: i */
    public abstract boolean mo204914i(String str, String str2, String str3);

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ File m204915j(String str, String str2, e4d0 e4d0Var, String str3, File file) {
        return mo204909d(str, str2, e4d0Var).mo143941a(str, str2, str3, file);
    }

    /* JADX INFO: renamed from: k */
    public final void m204916k(String str, String str2, String str3, Priority priority, w8e w8eVar, e4d0 e4d0Var) {
        if (TextUtils.isEmpty(str3) || !str3.toLowerCase().endsWith(mo204913h().toLowerCase())) {
            muj.m160219u("后缀校验没通过，返回 effectId: " + str);
            w8eVar.onFailed("后缀校验没通过");
            return;
        }
        if (!mo204914i(str, str2, str3)) {
            muj.m160180W(str, str2, str3, false);
            m204908c(str, str2, str3, priority, w8eVar, e4d0Var);
        } else {
            muj.m160180W(str, str2, str3, true);
            if (w8eVar != null) {
                w8eVar.mo75431a(m204919n(str, str2, str3));
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public File m204917l(String str, String str2, String str3) {
        return new File(m204918m(str, str2), m204912g(str3, w2t.m204590e(str3)) + mo204913h());
    }

    /* JADX INFO: renamed from: m */
    public File m204918m(String str, String str2) {
        File fileMo204910e = mo204910e();
        StringBuilder sb = new StringBuilder("effect");
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str);
        sb.append(str3);
        sb.append(str2);
        File file = new File(fileMo204910e, sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: n */
    public File m204919n(String str, String str2, String str3) {
        return new File(m204918m(str, str2), w2t.m204590e(str3));
    }

    /* JADX INFO: renamed from: o */
    public File m204920o(String str, String str2, String str3) {
        return m204919n(str, str2, str3);
    }

    /* JADX INFO: renamed from: p */
    public String m204921p(String str, String str2, String str3) {
        return m204919n(str, str2, str3).getAbsolutePath();
    }
}
