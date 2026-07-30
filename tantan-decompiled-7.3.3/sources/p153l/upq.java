package p153l;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class upq {

    /* JADX INFO: renamed from: a */
    public final String f180310a;

    /* JADX INFO: renamed from: l.upq$a */
    public class C20616a extends upq {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f180311b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20616a(upq upqVar, String str) {
            super(upqVar, null);
            this.f180311b = str;
        }

        @Override // p153l.upq
        /* JADX INFO: renamed from: i */
        public CharSequence mo197182i(Object obj) {
            return obj == null ? this.f180311b : upq.this.mo197182i(obj);
        }

        @Override // p153l.upq
        /* JADX INFO: renamed from: j */
        public upq mo197183j(String str) {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    public upq(String str) {
        this.f180310a = (String) xn80.m212111p(str);
    }

    /* JADX INFO: renamed from: g */
    public static upq m197174g(char c) {
        return new upq(String.valueOf(c));
    }

    /* JADX INFO: renamed from: h */
    public static upq m197175h(String str) {
        return new upq(str);
    }

    /* JADX INFO: renamed from: a */
    public <A extends Appendable> A m197176a(A a, Iterator<? extends Object> it) throws IOException {
        xn80.m212111p(a);
        if (it.hasNext()) {
            a.append(mo197182i(it.next()));
            while (it.hasNext()) {
                a.append(this.f180310a);
                a.append(mo197182i(it.next()));
            }
        }
        return a;
    }

    /* JADX INFO: renamed from: b */
    public final StringBuilder m197177b(StringBuilder sb, Iterable<? extends Object> iterable) {
        return m197178c(sb, iterable.iterator());
    }

    /* JADX INFO: renamed from: c */
    public final StringBuilder m197178c(StringBuilder sb, Iterator<? extends Object> it) {
        try {
            m197176a(sb, it);
            return sb;
        } catch (IOException e) {
            gig0.m130323a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m197179d(Iterable<? extends Object> iterable) {
        return m197180e(iterable.iterator());
    }

    /* JADX INFO: renamed from: e */
    public final String m197180e(Iterator<? extends Object> it) {
        return m197178c(new StringBuilder(), it).toString();
    }

    /* JADX INFO: renamed from: f */
    public final String m197181f(Object[] objArr) {
        return m197179d(Arrays.asList(objArr));
    }

    /* JADX INFO: renamed from: i */
    public CharSequence mo197182i(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    /* JADX INFO: renamed from: j */
    public upq mo197183j(String str) {
        xn80.m212111p(str);
        return new C20616a(this, str);
    }

    public /* synthetic */ upq(upq upqVar, C20616a c20616a) {
        this(upqVar);
    }

    public upq(upq upqVar) {
        this.f180310a = upqVar.f180310a;
    }
}
