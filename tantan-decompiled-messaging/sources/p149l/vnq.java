package p149l;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class vnq {

    /* JADX INFO: renamed from: a */
    public final String f182265a;

    /* JADX INFO: renamed from: l.vnq$a */
    public class C20671a extends vnq {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f182266b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20671a(vnq vnqVar, String str) {
            super(vnqVar, null);
            this.f182266b = str;
        }

        @Override // p149l.vnq
        /* JADX INFO: renamed from: i */
        public CharSequence mo199047i(Object obj) {
            return obj == null ? this.f182266b : vnq.this.mo199047i(obj);
        }

        @Override // p149l.vnq
        /* JADX INFO: renamed from: j */
        public vnq mo199048j(String str) {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    public vnq(String str) {
        this.f182265a = (String) sf80.m183894p(str);
    }

    /* JADX INFO: renamed from: g */
    public static vnq m199039g(char c) {
        return new vnq(String.valueOf(c));
    }

    /* JADX INFO: renamed from: h */
    public static vnq m199040h(String str) {
        return new vnq(str);
    }

    /* JADX INFO: renamed from: a */
    public <A extends Appendable> A m199041a(A a, Iterator<? extends Object> it) throws IOException {
        sf80.m183894p(a);
        if (it.hasNext()) {
            a.append(mo199047i(it.next()));
            while (it.hasNext()) {
                a.append(this.f182265a);
                a.append(mo199047i(it.next()));
            }
        }
        return a;
    }

    /* JADX INFO: renamed from: b */
    public final StringBuilder m199042b(StringBuilder sb, Iterable<? extends Object> iterable) {
        return m199043c(sb, iterable.iterator());
    }

    /* JADX INFO: renamed from: c */
    public final StringBuilder m199043c(StringBuilder sb, Iterator<? extends Object> it) {
        try {
            m199041a(sb, it);
            return sb;
        } catch (IOException e) {
            y9g0.m213537a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m199044d(Iterable<? extends Object> iterable) {
        return m199045e(iterable.iterator());
    }

    /* JADX INFO: renamed from: e */
    public final String m199045e(Iterator<? extends Object> it) {
        return m199043c(new StringBuilder(), it).toString();
    }

    /* JADX INFO: renamed from: f */
    public final String m199046f(Object[] objArr) {
        return m199044d(Arrays.asList(objArr));
    }

    /* JADX INFO: renamed from: i */
    public CharSequence mo199047i(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    /* JADX INFO: renamed from: j */
    public vnq mo199048j(String str) {
        sf80.m183894p(str);
        return new C20671a(this, str);
    }

    public /* synthetic */ vnq(vnq vnqVar, C20671a c20671a) {
        this(vnqVar);
    }

    public vnq(vnq vnqVar) {
        this.f182265a = vnqVar.f182265a;
    }
}
