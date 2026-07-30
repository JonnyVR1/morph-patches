package p149l;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class usf implements eyv {

    /* JADX INFO: renamed from: c */
    public static final usf f177964c = new usf();

    /* JADX INFO: renamed from: a */
    public String f177965a = "unknown";

    /* JADX INFO: renamed from: b */
    public int f177966b = 5;

    /* JADX INFO: renamed from: g */
    public static usf m195189g() {
        return f177964c;
    }

    /* JADX INFO: renamed from: h */
    public static String m195190h(String str, Throwable th) {
        return str + '\n' + m195191i(th);
    }

    /* JADX INFO: renamed from: i */
    public static String m195191i(Throwable th) {
        return th == null ? "" : Log.getStackTraceString(th);
    }

    @Override // p149l.eyv
    /* JADX INFO: renamed from: a */
    public void mo118788a(String str, String str2, Throwable th) {
        m195194l(6, str, str2, th);
    }

    @Override // p149l.eyv
    /* JADX INFO: renamed from: b */
    public void mo118789b(String str, String str2) {
        m195193k(6, str, str2);
    }

    @Override // p149l.eyv
    /* JADX INFO: renamed from: c */
    public void mo118790c(String str, String str2, Throwable th) {
        m195194l(5, str, str2, th);
    }

    @Override // p149l.eyv
    /* JADX INFO: renamed from: d */
    public void mo118791d(String str, String str2) {
        m195193k(3, str, str2);
    }

    @Override // p149l.eyv
    /* JADX INFO: renamed from: e */
    public void mo118793e(String str, String str2) {
        m195193k(6, str, str2);
    }

    @Override // p149l.eyv
    /* JADX INFO: renamed from: f */
    public boolean mo118795f(int i) {
        return this.f177966b <= i;
    }

    /* JADX INFO: renamed from: j */
    public final String m195192j(String str) {
        if (this.f177965a == null) {
            return str;
        }
        return this.f177965a + ":" + str;
    }

    /* JADX INFO: renamed from: k */
    public final void m195193k(int i, String str, String str2) {
        Log.println(i, m195192j(str), str2);
    }

    /* JADX INFO: renamed from: l */
    public final void m195194l(int i, String str, String str2, Throwable th) {
        Log.println(i, m195192j(str), m195190h(str2, th));
    }

    @Override // p149l.eyv
    /* JADX INFO: renamed from: v */
    public void mo118796v(String str, String str2) {
        m195193k(2, str, str2);
    }

    @Override // p149l.eyv
    /* JADX INFO: renamed from: w */
    public void mo118797w(String str, String str2) {
        m195193k(5, str, str2);
    }

    @Override // p149l.eyv
    /* JADX INFO: renamed from: d */
    public void mo118792d(String str, String str2, Throwable th) {
        m195194l(3, str, str2, th);
    }

    @Override // p149l.eyv
    /* JADX INFO: renamed from: e */
    public void mo118794e(String str, String str2, Throwable th) {
        m195194l(6, str, str2, th);
    }
}
