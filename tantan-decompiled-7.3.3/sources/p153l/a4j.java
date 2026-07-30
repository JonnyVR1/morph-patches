package p153l;

import android.text.TextUtils;
import android.util.Base64;
import com.p051p1.mobile.putong.data.FoulWords;
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
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class a4j extends mof0<FoulWords> {

    /* JADX INFO: renamed from: l.a4j$a */
    public class C15637a implements pcj<C22421c<FoulWords>> {
        /* JADX INFO: renamed from: d */
        public static /* synthetic */ FoulWords m95965d(FoulWords foulWords) {
            foulWords.exact = jyb.m147486Q(foulWords.exact, new qcj() { // from class: l.x3j
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((String) obj).toLowerCase();
                }
            });
            foulWords.contains = jyb.m147486Q(foulWords.contains, new qcj() { // from class: l.y3j
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((String) obj).toLowerCase();
                }
            });
            foulWords.spoofing = jyb.m147486Q(foulWords.spoofing, new qcj() { // from class: l.z3j
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((String) obj).toLowerCase();
                }
            });
            return foulWords;
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ FoulWords m95968g(String str) {
            try {
                return FoulWords.JSON_ADAPTER.parse(a4j.m95953J(str));
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // p153l.pcj, java.util.concurrent.Callable
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public C22421c<FoulWords> call() {
            return new si20((pcj<x1d0>) new pcj() { // from class: l.t3j
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return uqb0.f180376H.basic().m209043q(xi5.m211103e("/api/keyword/sensitive?include=extended")).m209032f().m209028b();
                }
            }, JsonAdapter.STRING_ADAPTER, new C15639c()).map(new qcj() { // from class: l.u3j
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return a4j.C15637a.m95968g((String) obj);
                }
            }).filter(new qcj() { // from class: l.v3j
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((FoulWords) obj) != null);
                }
            }).map(new qcj() { // from class: l.w3j
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return a4j.C15637a.m95965d((FoulWords) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.a4j$b */
    public class C15638b implements C22421c.a<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f68401a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f68402b;

        public C15638b(String str, String str2) {
            this.f68401a = str;
            this.f68402b = str2;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(gcg0<? super Boolean> gcg0Var) {
            boolean z = false;
            if (pk50.m172568j().m172574f().m181649M(this.f68401a, false) && a4j.this.m95957N(this.f68402b)) {
                z = true;
            }
            gcg0Var.m137019l(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: l.a4j$c */
    public static class C15639c extends DataChecker {
        @Override // com.tantanapp.common.data.DataChecker
        public boolean netDataErrorCheck(ValueObject valueObject) {
            if (!(valueObject instanceof FoulWords)) {
                return false;
            }
            FoulWords foulWords = (FoulWords) valueObject;
            if (!NullChecker.m82486a(foulWords.harassRegex)) {
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
            CrashHelper.m82479c(new Exception("harassRegex contains invalid regex:" + arrayList));
            return false;
        }

        @Override // com.tantanapp.common.data.DataChecker
        public HashSet<Class> registerCheckClass() {
            HashSet<Class> hashSet = new HashSet<>();
            hashSet.add(FoulWords.class);
            return hashSet;
        }

        public C15639c() {
        }
    }

    public a4j() {
        super("foulWordsNew", new l1f(new vod("foul_words_protobuf", "_v9", null), 7, FoulWords.PROTOBUF_ADAPTER), new C15637a());
        l51.m152887G(new Runnable() { // from class: l.m3j
            @Override // java.lang.Runnable
            public final void run() {
                this.f134671a.m95961R();
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public static String m95953J(String str) throws Exception {
        byte[] bArrDecode = Base64.decode(str, 2);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        byte[] bytes = "ACBbYKyNLxTYdVlC".getBytes("UTF-8");
        cipher.init(2, new SecretKeySpec(bytes, "AES"), new IvParameterSpec(bytes));
        return new String(cipher.doFinal(bArrDecode), StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: K */
    public boolean m95954K(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        FoulWords foulWordsM159277n = uqb0.f180394Z.m159277n();
        if (!NullChecker.m82486a(foulWordsM159277n) || !NullChecker.m82486a(foulWordsM159277n.exact)) {
            return false;
        }
        final String strTrim = str.toLowerCase().trim();
        return foulWordsM159277n.exact.contains(strTrim) || jyb.m147529r(foulWordsM159277n.contains, new qcj() { // from class: l.o3j
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(strTrim.contains((String) obj));
            }
        }) != null;
    }

    /* JADX INFO: renamed from: L */
    public String m95955L(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        FoulWords foulWordsM159277n = uqb0.f180394Z.m159277n();
        if (NullChecker.m82486a(foulWordsM159277n)) {
            final String strTrim = str.toLowerCase().trim();
            if (!jyb.m147479J(foulWordsM159277n.exact) && foulWordsM159277n.exact.contains(strTrim)) {
                return strTrim;
            }
            if (!jyb.m147479J(foulWordsM159277n.contains)) {
                List<String> list = foulWordsM159277n.contains;
                Objects.requireNonNull(strTrim);
                if (NullChecker.m82486a(jyb.m147529r(list, new n3j(strTrim)))) {
                    return (String) jyb.m147529r(foulWordsM159277n.contains, new n3j(strTrim));
                }
            }
            if (!jyb.m147479J(foulWordsM159277n.harassRegex) && NullChecker.m82486a(jyb.m147529r(foulWordsM159277n.harassRegex, new qcj() { // from class: l.q3j
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(pvc0.m173940a(strTrim, (String) obj));
                }
            }))) {
                return (String) jyb.m147529r(foulWordsM159277n.harassRegex, new qcj() { // from class: l.r3j
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(pvc0.m173940a(strTrim, (String) obj));
                    }
                });
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: M */
    public boolean m95956M(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        FoulWords foulWordsM159277n = uqb0.f180394Z.m159277n();
        if (NullChecker.m82486a(foulWordsM159277n)) {
            final String strTrim = str.toLowerCase().trim();
            if (jyb.m147529r(foulWordsM159277n.harassRegex, new qcj() { // from class: l.p3j
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(pvc0.m173940a(strTrim, (String) obj));
                }
            }) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m95957N(String str) {
        TextUtils.isEmpty(str);
        return false;
    }

    /* JADX INFO: renamed from: O */
    public boolean m95958O(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        FoulWords foulWordsM159277n = uqb0.f180394Z.m159277n();
        if (NullChecker.m82486a(foulWordsM159277n)) {
            String strTrim = str.toLowerCase().trim();
            if (!jyb.m147479J(foulWordsM159277n.spoofingNew)) {
                List<String> list = foulWordsM159277n.spoofingNew;
                Objects.requireNonNull(strTrim);
                if (NullChecker.m82486a(jyb.m147529r(list, new n3j(strTrim)))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: P */
    public boolean m95959P(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        FoulWords foulWordsM159277n = uqb0.f180394Z.m159277n();
        if (NullChecker.m82486a(foulWordsM159277n)) {
            String strTrim = str.toLowerCase().trim();
            if (!jyb.m147479J(foulWordsM159277n.spoofing)) {
                List<String> list = foulWordsM159277n.spoofing;
                Objects.requireNonNull(strTrim);
                if (NullChecker.m82486a(jyb.m147529r(list, new n3j(strTrim)))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Q */
    public C22421c<Boolean> m95960Q(String str, String str2) {
        return C22421c.create(new C15638b(str2, str)).compose(psd0.m173606Q()).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m95961R() {
        m159274k().first().map(new qcj() { // from class: l.s3j
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).subscribe();
    }
}
