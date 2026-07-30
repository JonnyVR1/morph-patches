package p149l;

import android.text.TextUtils;
import com.immomo.mmutil.FileUtil;
import com.immomo.mmutil.log.Log4Android;
import com.immomo.mwc.sdk.MWCEngine;
import java.io.File;
import java.io.IOException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class v750 {

    /* JADX INFO: renamed from: a */
    public String f180301a;

    /* JADX INFO: renamed from: b */
    private String f180302b;

    /* JADX INFO: renamed from: c */
    public h460 f180303c;

    /* JADX INFO: renamed from: d */
    public n460 f180304d;

    /* JADX INFO: renamed from: e */
    public File f180305e;

    /* JADX INFO: renamed from: f */
    public File f180306f;

    /* JADX INFO: renamed from: g */
    public JSONObject f180307g;

    /* JADX INFO: renamed from: h */
    public File f180308h;

    /* JADX INFO: renamed from: i */
    public File f180309i;

    /* JADX INFO: renamed from: j */
    public File f180310j;

    public v750(String str) {
        this.f180301a = str;
    }

    /* JADX INFO: renamed from: a */
    public long m197335a() {
        n460 n460Var = this.f180304d;
        if (n460Var != null) {
            return n460Var.f137041b;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: b */
    public String m197336b() {
        h460 h460Var;
        File file = this.f180309i;
        return (file == null || !file.exists() || this.f180309i.length() <= 0 || (h460Var = this.f180303c) == null) ? "" : h460Var.m129223d();
    }

    /* JADX INFO: renamed from: c */
    public String m197337c() {
        return this.f180302b;
    }

    /* JADX INFO: renamed from: d */
    public File m197338d(MWCEngine.CodeType codeType) {
        if (this.f180310j == null) {
            this.f180310j = z750.m217439j(this.f180302b, codeType);
        }
        return this.f180310j;
    }

    /* JADX INFO: renamed from: e */
    public JSONObject m197339e() {
        if (this.f180307g == null && m197344j()) {
            try {
                this.f180307g = new JSONObject(FileUtil.m18411h(this.f180305e));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return this.f180307g;
    }

    /* JADX INFO: renamed from: f */
    public long m197340f() {
        h460 h460Var;
        File file = this.f180309i;
        if (file == null || !file.exists() || this.f180309i.length() <= 0 || (h460Var = this.f180303c) == null) {
            return 0L;
        }
        return h460Var.m129226g();
    }

    /* JADX INFO: renamed from: g */
    public String m197341g() {
        h460 h460Var;
        File file = this.f180309i;
        return (file == null || !file.exists() || this.f180309i.length() <= 0 || (h460Var = this.f180303c) == null) ? "" : h460Var.m129227h();
    }

    /* JADX INFO: renamed from: h */
    public void m197342h(String str) {
        this.f180302b = str;
        this.f180305e = z750.m217441l(str);
        this.f180308h = z750.m217440k(this.f180302b);
        this.f180309i = z750.m217436g(this.f180302b);
        this.f180306f = z750.m217438i(this.f180302b);
        try {
            this.f180303c = z750.m217446q(this.f180302b);
        } catch (IOException e) {
            Log4Android.m18417f().m18422e(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m197343i() {
        return !TextUtils.isEmpty(this.f180302b) && new File(this.f180302b).exists();
    }

    /* JADX INFO: renamed from: j */
    public boolean m197344j() {
        n460 n460Var;
        return shw.m184294n() != null && shw.m184294n().mo110233e() && (n460Var = this.f180304d) != null && n460Var.f137043d == 1;
    }

    /* JADX INFO: renamed from: k */
    public boolean m197345k() {
        if (this.f180304d == null) {
            this.f180304d = new n460(this.f180301a);
        }
        return this.f180303c != null && (System.currentTimeMillis() - this.f180304d.f137042c) / 1000 > this.f180303c.m129221b() * 60;
    }

    /* JADX INFO: renamed from: l */
    public long m197346l() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        n460 n460Var = this.f180304d;
        if (n460Var != null) {
            n460Var.f137042c = jCurrentTimeMillis;
        }
        return jCurrentTimeMillis;
    }

    /* JADX INFO: renamed from: m */
    public void m197347m(n460 n460Var) {
        this.f180304d = n460Var;
        if (m197344j()) {
            try {
                this.f180307g = new JSONObject(FileUtil.m18411h(this.f180305e));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m197348n(int i) {
        n460 n460Var = this.f180304d;
        if (n460Var != null) {
            n460Var.f137043d = i;
        }
    }
}
