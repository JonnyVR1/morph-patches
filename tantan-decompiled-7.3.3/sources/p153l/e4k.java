package p153l;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e4k implements kzq {

    /* JADX INFO: renamed from: b */
    private final d0l f92102b;

    /* JADX INFO: renamed from: c */
    @Nullable
    private final URL f92103c;

    /* JADX INFO: renamed from: d */
    @Nullable
    private final String f92104d;

    /* JADX INFO: renamed from: e */
    @Nullable
    private String f92105e;

    /* JADX INFO: renamed from: f */
    @Nullable
    private URL f92106f;

    /* JADX INFO: renamed from: g */
    @Nullable
    private volatile byte[] f92107g;

    /* JADX INFO: renamed from: h */
    private int f92108h;

    public e4k(URL url, d0l d0lVar) {
        this.f92103c = (URL) vn80.m201944d(url);
        this.f92104d = null;
        this.f92102b = (d0l) vn80.m201944d(d0lVar);
    }

    /* JADX INFO: renamed from: d */
    private byte[] m119430d() {
        if (this.f92107g == null) {
            this.f92107g = m119433c().getBytes(kzq.f129442a);
        }
        return this.f92107g;
    }

    /* JADX INFO: renamed from: f */
    private String m119431f() {
        if (TextUtils.isEmpty(this.f92105e)) {
            String string = this.f92104d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) vn80.m201944d(this.f92103c)).toString();
            }
            this.f92105e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f92105e;
    }

    /* JADX INFO: renamed from: g */
    private URL m119432g() throws MalformedURLException {
        if (this.f92106f == null) {
            this.f92106f = new URL(m119431f());
        }
        return this.f92106f;
    }

    @Override // p153l.kzq
    /* JADX INFO: renamed from: a */
    public void mo5434a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(m119430d());
    }

    /* JADX INFO: renamed from: c */
    public String m119433c() {
        String str = this.f92104d;
        return str != null ? str : ((URL) vn80.m201944d(this.f92103c)).toString();
    }

    /* JADX INFO: renamed from: e */
    public Map<String, String> m119434e() {
        return this.f92102b.mo113410a();
    }

    @Override // p153l.kzq
    public boolean equals(Object obj) {
        if (obj instanceof e4k) {
            e4k e4kVar = (e4k) obj;
            if (m119433c().equals(e4kVar.m119433c()) && this.f92102b.equals(e4kVar.f92102b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public URL m119435h() throws MalformedURLException {
        return m119432g();
    }

    @Override // p153l.kzq
    public int hashCode() {
        if (this.f92108h == 0) {
            int iHashCode = m119433c().hashCode();
            this.f92108h = iHashCode;
            this.f92108h = (iHashCode * 31) + this.f92102b.hashCode();
        }
        return this.f92108h;
    }

    public String toString() {
        return m119433c();
    }

    public e4k(String str) {
        this(str, d0l.f84579b);
    }

    public e4k(URL url) {
        this(url, d0l.f84579b);
    }

    public e4k(String str, d0l d0lVar) {
        this.f92103c = null;
        this.f92104d = vn80.m201942b(str);
        this.f92102b = (d0l) vn80.m201944d(d0lVar);
    }
}
