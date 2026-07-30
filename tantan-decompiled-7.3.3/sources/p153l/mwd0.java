package p153l;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public class mwd0 {

    /* JADX INFO: renamed from: a */
    private final wgw<kzq, String> f139050a = new wgw<>(1000);

    /* JADX INFO: renamed from: b */
    private final nj80<C18720b> f139051b = mxf.m160653d(10, new C18719a());

    /* JADX INFO: renamed from: l.mwd0$a */
    public class C18719a implements mxf.InterfaceC18736d<C18720b> {
        public C18719a() {
        }

        @Override // p153l.mxf.InterfaceC18736d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C18720b create() {
            try {
                return new C18720b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                iig0.m140070a(e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: l.mwd0$b */
    public static final class C18720b implements mxf.InterfaceC18738f {

        /* JADX INFO: renamed from: a */
        final MessageDigest f139053a;

        /* JADX INFO: renamed from: b */
        private final x3g0 f139054b = x3g0.m209209a();

        public C18720b(MessageDigest messageDigest) {
            this.f139053a = messageDigest;
        }

        @Override // p153l.mxf.InterfaceC18738f
        @NonNull
        /* JADX INFO: renamed from: b */
        public x3g0 mo5402b() {
            return this.f139054b;
        }
    }

    /* JADX INFO: renamed from: a */
    private String m160477a(kzq kzqVar) {
        C18720b c18720b = (C18720b) vn80.m201944d(this.f139051b.acquire());
        try {
            kzqVar.mo5434a(c18720b.f139053a);
            return ylk0.m216600x(c18720b.f139053a.digest());
        } finally {
            this.f139051b.release(c18720b);
        }
    }

    /* JADX INFO: renamed from: b */
    public String m160478b(kzq kzqVar) {
        String strM206267g;
        synchronized (this.f139050a) {
            strM206267g = this.f139050a.m206267g(kzqVar);
        }
        if (strM206267g == null) {
            strM206267g = m160477a(kzqVar);
        }
        synchronized (this.f139050a) {
            this.f139050a.m206269k(kzqVar, strM206267g);
        }
        return strM206267g;
    }
}
