package p149l;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class n1k implements kxq {

    /* JADX INFO: renamed from: b */
    private final nxk f136647b;

    /* JADX INFO: renamed from: c */
    @Nullable
    private final URL f136648c;

    /* JADX INFO: renamed from: d */
    @Nullable
    private final String f136649d;

    /* JADX INFO: renamed from: e */
    @Nullable
    private String f136650e;

    /* JADX INFO: renamed from: f */
    @Nullable
    private URL f136651f;

    /* JADX INFO: renamed from: g */
    @Nullable
    private volatile byte[] f136652g;

    /* JADX INFO: renamed from: h */
    private int f136653h;

    public n1k(URL url, nxk nxkVar) {
        this.f136648c = (URL) qf80.m174276d(url);
        this.f136649d = null;
        this.f136647b = (nxk) qf80.m174276d(nxkVar);
    }

    /* JADX INFO: renamed from: d */
    private byte[] m157371d() {
        if (this.f136652g == null) {
            this.f136652g = m157374c().getBytes(kxq.f125153a);
        }
        return this.f136652g;
    }

    /* JADX INFO: renamed from: f */
    private String m157372f() {
        if (TextUtils.isEmpty(this.f136650e)) {
            String string = this.f136649d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) qf80.m174276d(this.f136648c)).toString();
            }
            this.f136650e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f136650e;
    }

    /* JADX INFO: renamed from: g */
    private URL m157373g() throws MalformedURLException {
        if (this.f136651f == null) {
            this.f136651f = new URL(m157372f());
        }
        return this.f136651f;
    }

    @Override // p149l.kxq
    /* JADX INFO: renamed from: a */
    public void mo5409a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(m157371d());
    }

    /* JADX INFO: renamed from: c */
    public String m157374c() {
        String str = this.f136649d;
        return str != null ? str : ((URL) qf80.m174276d(this.f136648c)).toString();
    }

    /* JADX INFO: renamed from: e */
    public Map<String, String> m157375e() {
        return this.f136647b.mo161948b();
    }

    @Override // p149l.kxq
    public boolean equals(Object obj) {
        if (obj instanceof n1k) {
            n1k n1kVar = (n1k) obj;
            if (m157374c().equals(n1kVar.m157374c()) && this.f136647b.equals(n1kVar.f136647b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public URL m157376h() throws MalformedURLException {
        return m157373g();
    }

    @Override // p149l.kxq
    public int hashCode() {
        if (this.f136653h == 0) {
            int iHashCode = m157374c().hashCode();
            this.f136653h = iHashCode;
            this.f136653h = (iHashCode * 31) + this.f136647b.hashCode();
        }
        return this.f136653h;
    }

    public String toString() {
        return m157374c();
    }

    public n1k(String str) {
        this(str, nxk.f141032b);
    }

    public n1k(URL url) {
        this(url, nxk.f141032b);
    }

    public n1k(String str, nxk nxkVar) {
        this.f136648c = null;
        this.f136649d = qf80.m174274b(str);
        this.f136647b = (nxk) qf80.m174276d(nxkVar);
    }
}
