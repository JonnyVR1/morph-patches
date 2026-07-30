package p149l;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public class kod0 {

    /* JADX INFO: renamed from: a */
    private final yew<kxq, String> f123991a = new yew<>(1000);

    /* JADX INFO: renamed from: b */
    private final hb80<C18053b> f123992b = yvf.m216209d(10, new C18052a());

    /* JADX INFO: renamed from: l.kod0$a */
    public class C18052a implements yvf.InterfaceC21543d<C18053b> {
        public C18052a() {
        }

        @Override // p149l.yvf.InterfaceC21543d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C18053b create() {
            try {
                return new C18053b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                aag0.m95543a(e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: l.kod0$b */
    public static final class C18053b implements yvf.InterfaceC21545f {

        /* JADX INFO: renamed from: a */
        final MessageDigest f123994a;

        /* JADX INFO: renamed from: b */
        private final ovf0 f123995b = ovf0.m166181a();

        public C18053b(MessageDigest messageDigest) {
            this.f123994a = messageDigest;
        }

        @Override // p149l.yvf.InterfaceC21545f
        @NonNull
        /* JADX INFO: renamed from: a */
        public ovf0 mo5376a() {
            return this.f123995b;
        }
    }

    /* JADX INFO: renamed from: a */
    private String m146696a(kxq kxqVar) {
        C18053b c18053b = (C18053b) qf80.m174276d(this.f123992b.acquire());
        try {
            kxqVar.mo5409a(c18053b.f123994a);
            return sck0.m183420t(c18053b.f123994a.digest());
        } finally {
            this.f123992b.release(c18053b);
        }
    }

    /* JADX INFO: renamed from: b */
    public String m146697b(kxq kxqVar) {
        String strM214441g;
        synchronized (this.f123991a) {
            strM214441g = this.f123991a.m214441g(kxqVar);
        }
        if (strM214441g == null) {
            strM214441g = m146696a(kxqVar);
        }
        synchronized (this.f123991a) {
            this.f123991a.m214443k(kxqVar, strM214441g);
        }
        return strM214441g;
    }
}
