package p149l;

import android.text.TextUtils;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes7.dex */
public class jxc0 {

    /* JADX INFO: renamed from: a */
    private InputStream f120213a;

    /* JADX INFO: renamed from: b */
    private long f120214b;

    /* JADX INFO: renamed from: c */
    private int f120215c;

    /* JADX INFO: renamed from: d */
    private u500 f120216d;

    public jxc0(u500 u500Var) {
        this.f120216d = u500Var;
        this.f120213a = u500Var.m191784k();
        this.f120214b = u500Var.m191786n();
        this.f120215c = u500Var.m191785m();
    }

    /* JADX INFO: renamed from: a */
    public void m143766a() {
        try {
            this.f120216d.close();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public long m143767b() {
        return this.f120214b;
    }

    /* JADX INFO: renamed from: c */
    public String m143768c(String str) {
        String strM191787q = this.f120216d.m191787q(str);
        return TextUtils.isEmpty(strM191787q) ? "" : strM191787q;
    }

    /* JADX INFO: renamed from: d */
    public int m143769d(String str, int i) {
        String strM191787q = this.f120216d.m191787q(str);
        if (TextUtils.isEmpty(strM191787q)) {
            return i;
        }
        try {
            return Integer.parseInt(strM191787q);
        } catch (Exception unused) {
            return i;
        }
    }

    /* JADX INFO: renamed from: e */
    public InputStream m143770e() {
        return this.f120213a;
    }

    /* JADX INFO: renamed from: f */
    public int m143771f() {
        return this.f120215c;
    }

    /* JADX INFO: renamed from: g */
    public URL m143772g() {
        try {
            return new URL(this.f120216d.m191789u());
        } catch (MalformedURLException unused) {
            return null;
        }
    }
}
