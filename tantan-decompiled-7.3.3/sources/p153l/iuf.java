package p153l;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class iuf implements b0w {

    /* JADX INFO: renamed from: c */
    public static final iuf f116923c = new iuf();

    /* JADX INFO: renamed from: a */
    public String f116924a = "unknown";

    /* JADX INFO: renamed from: b */
    public int f116925b = 5;

    /* JADX INFO: renamed from: g */
    public static iuf m142182g() {
        return f116923c;
    }

    /* JADX INFO: renamed from: h */
    public static String m142183h(String str, Throwable th) {
        return str + '\n' + m142184i(th);
    }

    /* JADX INFO: renamed from: i */
    public static String m142184i(Throwable th) {
        return th == null ? "" : Log.getStackTraceString(th);
    }

    @Override // p153l.b0w
    /* JADX INFO: renamed from: a */
    public void mo101358a(String str, String str2, Throwable th) {
        m142187l(6, str, str2, th);
    }

    @Override // p153l.b0w
    /* JADX INFO: renamed from: b */
    public void mo101359b(String str, String str2) {
        m142186k(6, str, str2);
    }

    @Override // p153l.b0w
    /* JADX INFO: renamed from: c */
    public void mo101360c(String str, String str2, Throwable th) {
        m142187l(5, str, str2, th);
    }

    @Override // p153l.b0w
    /* JADX INFO: renamed from: d */
    public void mo101361d(String str, String str2) {
        m142186k(3, str, str2);
    }

    @Override // p153l.b0w
    /* JADX INFO: renamed from: e */
    public void mo101363e(String str, String str2) {
        m142186k(6, str, str2);
    }

    @Override // p153l.b0w
    /* JADX INFO: renamed from: f */
    public boolean mo101365f(int i) {
        return this.f116925b <= i;
    }

    /* JADX INFO: renamed from: j */
    public final String m142185j(String str) {
        if (this.f116924a == null) {
            return str;
        }
        return this.f116924a + ":" + str;
    }

    /* JADX INFO: renamed from: k */
    public final void m142186k(int i, String str, String str2) {
        Log.println(i, m142185j(str), str2);
    }

    /* JADX INFO: renamed from: l */
    public final void m142187l(int i, String str, String str2, Throwable th) {
        Log.println(i, m142185j(str), m142183h(str2, th));
    }

    @Override // p153l.b0w
    /* JADX INFO: renamed from: v */
    public void mo101366v(String str, String str2) {
        m142186k(2, str, str2);
    }

    @Override // p153l.b0w
    /* JADX INFO: renamed from: w */
    public void mo101367w(String str, String str2) {
        m142186k(5, str, str2);
    }

    @Override // p153l.b0w
    /* JADX INFO: renamed from: d */
    public void mo101362d(String str, String str2, Throwable th) {
        m142187l(3, str, str2, th);
    }

    @Override // p153l.b0w
    /* JADX INFO: renamed from: e */
    public void mo101364e(String str, String str2, Throwable th) {
        m142187l(6, str, str2, th);
    }
}
