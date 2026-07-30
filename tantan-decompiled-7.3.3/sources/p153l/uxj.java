package p153l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class uxj {

    /* JADX INFO: renamed from: a */
    public final String f181457a;

    /* JADX INFO: renamed from: b */
    public final String f181458b;

    /* JADX INFO: renamed from: c */
    public final String f181459c;

    /* JADX INFO: renamed from: d */
    public final x20 f181460d;

    /* JADX INFO: renamed from: e */
    public final String f181461e;

    /* JADX INFO: renamed from: l.uxj$a */
    public static class C20693a {

        /* JADX INFO: renamed from: a */
        public final String f181462a;

        /* JADX INFO: renamed from: b */
        public final String f181463b;

        /* JADX INFO: renamed from: c */
        public final String f181464c;

        /* JADX INFO: renamed from: d */
        public x20 f181465d;

        /* JADX INFO: renamed from: e */
        public String f181466e = "";

        public C20693a(String str, String str2, String str3) {
            this.f181462a = str;
            this.f181463b = str2;
            this.f181464c = str3;
        }

        /* JADX INFO: renamed from: f */
        public uxj m198494f() {
            return new uxj(this);
        }

        /* JADX INFO: renamed from: g */
        public C20693a m198495g(x20 x20Var) {
            this.f181465d = x20Var;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C20693a m198496h(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f181466e = str;
            }
            return this;
        }
    }

    public uxj(C20693a c20693a) {
        this.f181457a = c20693a.f181462a;
        this.f181458b = c20693a.f181463b;
        this.f181459c = c20693a.f181464c;
        this.f181460d = c20693a.f181465d;
        this.f181461e = c20693a.f181466e;
    }

    /* JADX INFO: renamed from: a */
    public String m198483a() {
        return this.f181458b;
    }

    /* JADX INFO: renamed from: b */
    public String m198484b() {
        return this.f181461e;
    }

    /* JADX INFO: renamed from: c */
    public String m198485c() {
        return this.f181457a;
    }

    /* JADX INFO: renamed from: d */
    public String m198486d() {
        return this.f181459c;
    }

    /* JADX INFO: renamed from: e */
    public x20 m198487e() {
        return this.f181460d;
    }

    /* JADX INFO: renamed from: f */
    public boolean m198488f() {
        return TextUtils.equals(this.f181459c, "live");
    }
}
