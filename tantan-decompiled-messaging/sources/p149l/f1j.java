package p149l;

import android.text.TextUtils;
import android.util.Base64;
import com.p046p1.mobile.putong.data.FoulWords;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class f1j extends fgf0<FoulWords> {

    /* JADX INFO: renamed from: l.f1j$a */
    public class C16737a implements v9j<C22306c<FoulWords>> {
        /* JADX INFO: renamed from: d */
        public static /* synthetic */ FoulWords m119136d(FoulWords foulWords) {
            foulWords.exact = vwb.m200303Q(foulWords.exact, new w9j() { // from class: l.c1j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((String) obj).toLowerCase();
                }
            });
            foulWords.contains = vwb.m200303Q(foulWords.contains, new w9j() { // from class: l.d1j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((String) obj).toLowerCase();
                }
            });
            foulWords.spoofing = vwb.m200303Q(foulWords.spoofing, new w9j() { // from class: l.e1j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((String) obj).toLowerCase();
                }
            });
            return foulWords;
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ FoulWords m119139g(String str) {
            try {
                return FoulWords.JSON_ADAPTER.parse(f1j.m119124J(str));
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // p149l.v9j, java.util.concurrent.Callable
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public C22306c<FoulWords> call() {
            return new ka20((v9j<stc0>) new v9j() { // from class: l.y0j
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return qib0.f154693H.basic().m185898q(xh5.m208757e("/api/keyword/sensitive?include=extended")).m185887f().m185883b();
                }
            }, JsonAdapter.STRING_ADAPTER, new C16739c()).map(new w9j() { // from class: l.z0j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return f1j.C16737a.m119139g((String) obj);
                }
            }).filter(new w9j() { // from class: l.a1j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((FoulWords) obj) != null);
                }
            }).map(new w9j() { // from class: l.b1j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return f1j.C16737a.m119136d((FoulWords) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.f1j$b */
    public class C16738b implements C22306c.a<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f94099a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f94100b;

        public C16738b(String str, String str2) {
            this.f94099a = str;
            this.f94100b = str2;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super Boolean> z3g0Var) {
            boolean z = false;
            if (ic50.m135327j().m135333f().m145226M(this.f94099a, false) && f1j.this.m119128N(this.f94100b)) {
                z = true;
            }
            z3g0Var.m132487l(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: l.f1j$c */
    public static class C16739c extends DataChecker {
        @Override // com.tantanapp.common.data.DataChecker
        public boolean netDataErrorCheck(ValueObject valueObject) {
            if (!(valueObject instanceof FoulWords)) {
                return false;
            }
            FoulWords foulWords = (FoulWords) valueObject;
            if (!NullChecker.m81303a(foulWords.harassRegex)) {
                return false;
            }
            List<String> list = foulWords.harassRegex;
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                try {
                    Pattern.compile(str);
                } catch (Throwable unused) {
                    arrayList.add(str);
                }
            }
            if (arrayList.size() <= 0) {
                return false;
            }
            list.removeAll(arrayList);
            CrashHelper.m81296c(new Exception("harassRegex contains invalid regex:" + arrayList));
            return false;
        }

        @Override // com.tantanapp.common.data.DataChecker
        public HashSet<Class> registerCheckClass() {
            HashSet<Class> hashSet = new HashSet<>();
            hashSet.add(FoulWords.class);
            return hashSet;
        }

        public C16739c() {
        }
    }

    public f1j() {
        super("foulWordsNew", new h0f(new qnd("foul_words_protobuf", "_v9", null), 7, FoulWords.PROTOBUF_ADAPTER), new C16737a());
        e51.m114742G(new Runnable() { // from class: l.r0j
            @Override // java.lang.Runnable
            public final void run() {
                this.f157176a.m119132R();
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public static String m119124J(String str) throws Exception {
        byte[] bArrDecode = Base64.decode(str, 2);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        byte[] bytes = "ACBbYKyNLxTYdVlC".getBytes("UTF-8");
        cipher.init(2, new SecretKeySpec(bytes, "AES"), new IvParameterSpec(bytes));
        return new String(cipher.doFinal(bArrDecode), StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: K */
    public boolean m119125K(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        FoulWords foulWordsM121233n = qib0.f154711Z.m121233n();
        if (!NullChecker.m81303a(foulWordsM121233n) || !NullChecker.m81303a(foulWordsM121233n.exact)) {
            return false;
        }
        final String strTrim = str.toLowerCase().trim();
        return foulWordsM121233n.exact.contains(strTrim) || vwb.m200346r(foulWordsM121233n.contains, new w9j() { // from class: l.t0j
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(strTrim.contains((String) obj));
            }
        }) != null;
    }

    /* JADX INFO: renamed from: L */
    public String m119126L(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        FoulWords foulWordsM121233n = qib0.f154711Z.m121233n();
        if (NullChecker.m81303a(foulWordsM121233n)) {
            final String strTrim = str.toLowerCase().trim();
            if (!vwb.m200296J(foulWordsM121233n.exact) && foulWordsM121233n.exact.contains(strTrim)) {
                return strTrim;
            }
            if (!vwb.m200296J(foulWordsM121233n.contains)) {
                List<String> list = foulWordsM121233n.contains;
                Objects.requireNonNull(strTrim);
                if (NullChecker.m81303a(vwb.m200346r(list, new s0j(strTrim)))) {
                    return (String) vwb.m200346r(foulWordsM121233n.contains, new s0j(strTrim));
                }
            }
            if (!vwb.m200296J(foulWordsM121233n.harassRegex) && NullChecker.m81303a(vwb.m200346r(foulWordsM121233n.harassRegex, new w9j() { // from class: l.v0j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(knc0.m146561a(strTrim, (String) obj));
                }
            }))) {
                return (String) vwb.m200346r(foulWordsM121233n.harassRegex, new w9j() { // from class: l.w0j
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(knc0.m146561a(strTrim, (String) obj));
                    }
                });
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: M */
    public boolean m119127M(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        FoulWords foulWordsM121233n = qib0.f154711Z.m121233n();
        if (NullChecker.m81303a(foulWordsM121233n)) {
            final String strTrim = str.toLowerCase().trim();
            if (vwb.m200346r(foulWordsM121233n.harassRegex, new w9j() { // from class: l.u0j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(knc0.m146561a(strTrim, (String) obj));
                }
            }) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m119128N(String str) {
        TextUtils.isEmpty(str);
        return false;
    }

    /* JADX INFO: renamed from: O */
    public boolean m119129O(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        FoulWords foulWordsM121233n = qib0.f154711Z.m121233n();
        if (NullChecker.m81303a(foulWordsM121233n)) {
            String strTrim = str.toLowerCase().trim();
            if (!vwb.m200296J(foulWordsM121233n.spoofingNew)) {
                List<String> list = foulWordsM121233n.spoofingNew;
                Objects.requireNonNull(strTrim);
                if (NullChecker.m81303a(vwb.m200346r(list, new s0j(strTrim)))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: P */
    public boolean m119130P(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        FoulWords foulWordsM121233n = qib0.f154711Z.m121233n();
        if (NullChecker.m81303a(foulWordsM121233n)) {
            String strTrim = str.toLowerCase().trim();
            if (!vwb.m200296J(foulWordsM121233n.spoofing)) {
                List<String> list = foulWordsM121233n.spoofing;
                Objects.requireNonNull(strTrim);
                if (NullChecker.m81303a(vwb.m200346r(list, new s0j(strTrim)))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Q */
    public C22306c<Boolean> m119131Q(String str, String str2) {
        return C22306c.create(new C16738b(str2, str)).compose(mkd0.m154965Q()).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m119132R() {
        m121230k().first().map(new w9j() { // from class: l.x0j
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).subscribe();
    }
}
