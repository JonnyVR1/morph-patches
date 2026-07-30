package p006l;

import android.text.TextUtils;
import android.util.Base64;
import com.p1.mobile.putong.data.FoulWords;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.INetParser;
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
import l.e51;
import l.fgf0;
import l.h0f;
import l.ic50;
import l.jo0;
import l.knc0;
import l.mkd0;
import l.roj0;
import l.stc0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.z3g0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class f1j extends fgf0<FoulWords> {

    /* JADX INFO: renamed from: l.f1j$a */
    public class C0699a implements v9j<c<FoulWords>> {
        /* JADX INFO: renamed from: d */
        public static /* synthetic */ FoulWords m15001d(FoulWords foulWords) {
            foulWords.exact = vwb.Q(foulWords.exact, new w9j() { // from class: l.c1j
                public final Object call(Object obj) {
                    return ((String) obj).toLowerCase();
                }
            });
            foulWords.contains = vwb.Q(foulWords.contains, new w9j() { // from class: l.d1j
                public final Object call(Object obj) {
                    return ((String) obj).toLowerCase();
                }
            });
            foulWords.spoofing = vwb.Q(foulWords.spoofing, new w9j() { // from class: l.e1j
                public final Object call(Object obj) {
                    return ((String) obj).toLowerCase();
                }
            });
            return foulWords;
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ FoulWords m15004g(String str) {
            try {
                return (FoulWords) FoulWords.JSON_ADAPTER.parse(f1j.m14989J(str));
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public c<FoulWords> call() {
            return new ka20((v9j<stc0>) new v9j() { // from class: l.y0j
                public final Object call() {
                    return qib0.f19784H.basic().q(xh5.m27246e("/api/keyword/sensitive?include=extended")).f().b();
                }
            }, (INetParser) JsonAdapter.STRING_ADAPTER, (DataChecker) new C0701c()).map(new w9j() { // from class: l.z0j
                public final Object call(Object obj) {
                    return f1j.C0699a.m15004g((String) obj);
                }
            }).filter(new w9j() { // from class: l.a1j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((FoulWords) obj) != null);
                }
            }).map(new w9j() { // from class: l.b1j
                public final Object call(Object obj) {
                    return f1j.C0699a.m15001d((FoulWords) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.f1j$b */
    public class C0700b implements c.a<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f11563a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f11564b;

        public C0700b(String str, String str2) {
            this.f11563a = str;
            this.f11564b = str2;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(z3g0<? super Boolean> z3g0Var) {
            boolean z = false;
            if (ic50.j().f().M(this.f11563a, false) && f1j.this.m14993N(this.f11564b)) {
                z = true;
            }
            z3g0Var.onNext(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: l.f1j$c */
    public static class C0701c extends DataChecker {
        public boolean netDataErrorCheck(ValueObject valueObject) {
            if (!(valueObject instanceof FoulWords)) {
                return false;
            }
            FoulWords foulWords = (FoulWords) valueObject;
            if (!NullChecker.a(foulWords.harassRegex)) {
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
            CrashHelper.c(new Exception("harassRegex contains invalid regex:" + arrayList));
            return false;
        }

        public HashSet<Class> registerCheckClass() {
            HashSet<Class> hashSet = new HashSet<>();
            hashSet.add(FoulWords.class);
            return hashSet;
        }

        public C0701c() {
        }
    }

    public f1j() {
        super("foulWordsNew", new h0f(new qnd("foul_words_protobuf", "_v9", null), 7, FoulWords.PROTOBUF_ADAPTER), new C0699a());
        e51.G(new Runnable() { // from class: l.r0j
            @Override // java.lang.Runnable
            public final void run() {
                this.f20217a.m14997R();
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public static String m14989J(String str) throws Exception {
        byte[] bArrDecode = Base64.decode(str, 2);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        byte[] bytes = "ACBbYKyNLxTYdVlC".getBytes("UTF-8");
        cipher.init(2, new SecretKeySpec(bytes, "AES"), new IvParameterSpec(bytes));
        return new String(cipher.doFinal(bArrDecode), StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: K */
    public boolean m14990K(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        FoulWords foulWords = (FoulWords) qib0.f19802Z.n();
        if (!NullChecker.a(foulWords) || !NullChecker.a(foulWords.exact)) {
            return false;
        }
        final String strTrim = str.toLowerCase().trim();
        return foulWords.exact.contains(strTrim) || vwb.r(foulWords.contains, new w9j() { // from class: l.t0j
            public final Object call(Object obj) {
                return Boolean.valueOf(strTrim.contains((String) obj));
            }
        }) != null;
    }

    /* JADX INFO: renamed from: L */
    public String m14991L(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        FoulWords foulWords = (FoulWords) qib0.f19802Z.n();
        if (NullChecker.a(foulWords)) {
            final String strTrim = str.toLowerCase().trim();
            if (!vwb.J(foulWords.exact) && foulWords.exact.contains(strTrim)) {
                return strTrim;
            }
            if (!vwb.J(foulWords.contains)) {
                List list = foulWords.contains;
                Objects.requireNonNull(strTrim);
                if (NullChecker.a(vwb.r(list, new s0j(strTrim)))) {
                    return (String) vwb.r(foulWords.contains, new s0j(strTrim));
                }
            }
            if (!vwb.J(foulWords.harassRegex) && NullChecker.a(vwb.r(foulWords.harassRegex, new w9j() { // from class: l.v0j
                public final Object call(Object obj) {
                    return Boolean.valueOf(knc0.a(strTrim, (String) obj));
                }
            }))) {
                return (String) vwb.r(foulWords.harassRegex, new w9j() { // from class: l.w0j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(knc0.a(strTrim, (String) obj));
                    }
                });
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: M */
    public boolean m14992M(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        FoulWords foulWords = (FoulWords) qib0.f19802Z.n();
        if (NullChecker.a(foulWords)) {
            final String strTrim = str.toLowerCase().trim();
            if (vwb.r(foulWords.harassRegex, new w9j() { // from class: l.u0j
                public final Object call(Object obj) {
                    return Boolean.valueOf(knc0.a(strTrim, (String) obj));
                }
            }) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m14993N(String str) {
        TextUtils.isEmpty(str);
        return false;
    }

    /* JADX INFO: renamed from: O */
    public boolean m14994O(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        FoulWords foulWords = (FoulWords) qib0.f19802Z.n();
        if (NullChecker.a(foulWords)) {
            String strTrim = str.toLowerCase().trim();
            if (!vwb.J(foulWords.spoofingNew)) {
                List list = foulWords.spoofingNew;
                Objects.requireNonNull(strTrim);
                if (NullChecker.a(vwb.r(list, new s0j(strTrim)))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: P */
    public boolean m14995P(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        FoulWords foulWords = (FoulWords) qib0.f19802Z.n();
        if (NullChecker.a(foulWords)) {
            String strTrim = str.toLowerCase().trim();
            if (!vwb.J(foulWords.spoofing)) {
                List list = foulWords.spoofing;
                Objects.requireNonNull(strTrim);
                if (NullChecker.a(vwb.r(list, new s0j(strTrim)))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Q */
    public c<Boolean> m14996Q(String str, String str2) {
        return c.create(new C0700b(str2, str)).compose(mkd0.Q()).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m14997R() {
        k().first().map(new w9j() { // from class: l.x0j
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).subscribe();
    }
}
