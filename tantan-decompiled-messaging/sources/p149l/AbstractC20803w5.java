package p149l;

import android.text.TextUtils;
import immomo.com.mklibrary.momitor.exception.MKLogIllegalArgumentException;

/* JADX INFO: renamed from: l.w5 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC20803w5 {

    /* JADX INFO: renamed from: a */
    protected a f184627a;

    public AbstractC20803w5(a aVar) {
        if (aVar == null) {
            throw new MKLogIllegalArgumentException("log params is null");
        }
        this.f184627a = aVar;
    }

    /* JADX INFO: renamed from: a */
    public String mo117516a() {
        StringBuilder sbMo201596a = this.f184627a.mo201596a();
        sbMo201596a.append(mo96873e());
        sbMo201596a.append(this.f184627a.f184632e);
        return sbMo201596a.toString();
    }

    /* JADX INFO: renamed from: b */
    public boolean mo117517b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public String m201591c() {
        return this.f184627a.f184631d;
    }

    /* JADX INFO: renamed from: d */
    public String m201592d() {
        return this.f184627a.f184629b;
    }

    /* JADX INFO: renamed from: e */
    public abstract String mo96873e();

    /* JADX INFO: renamed from: f */
    public String m201593f() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: g */
    public String m201594g() {
        return this.f184627a.f184634g;
    }

    /* JADX INFO: renamed from: h */
    public boolean m201595h() {
        return this.f184627a.f184633f;
    }

    /* JADX INFO: renamed from: i */
    public boolean mo96874i() {
        return false;
    }

    /* JADX INFO: renamed from: l.w5$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public long f184628a;

        /* JADX INFO: renamed from: b */
        public String f184629b;

        /* JADX INFO: renamed from: c */
        public String f184630c;

        /* JADX INFO: renamed from: d */
        public String f184631d;

        /* JADX INFO: renamed from: e */
        public String f184632e;

        /* JADX INFO: renamed from: f */
        public boolean f184633f;

        /* JADX INFO: renamed from: g */
        public String f184634g;

        public a(String str, String str2) {
            this.f184633f = false;
            this.f184634g = null;
            if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
                throw new MKLogIllegalArgumentException("logSessionKey or logLevel is null");
            }
            this.f184629b = str;
            this.f184628a = System.currentTimeMillis();
            this.f184631d = str2;
            this.f184630c = "native";
        }

        /* JADX INFO: renamed from: a */
        public StringBuilder mo201596a() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f184628a);
            sb.append("|");
            sb.append(this.f184630c);
            sb.append("|");
            sb.append(this.f184631d);
            sb.append("|");
            return sb;
        }

        public a(String str, String str2, String str3) {
            this.f184633f = false;
            this.f184634g = null;
            this.f184629b = str;
            this.f184628a = System.currentTimeMillis();
            this.f184630c = str2;
            this.f184631d = str3;
        }
    }
}
