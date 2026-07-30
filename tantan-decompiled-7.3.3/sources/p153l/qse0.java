package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class qse0 {

    /* JADX INFO: renamed from: a */
    public final ImmutableMap<String, String> f159289a;

    /* JADX INFO: renamed from: b */
    public final ImmutableList<ksx> f159290b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f159291c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final String f159292d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final String f159293e;

    /* JADX INFO: renamed from: f */
    public final int f159294f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final Uri f159295g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final String f159296h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final String f159297i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final String f159298j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final String f159299k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public final String f159300l;

    /* JADX INFO: renamed from: l.qse0$b */
    public static final class C19646b {

        /* JADX INFO: renamed from: a */
        public final HashMap<String, String> f159301a = new HashMap<>();

        /* JADX INFO: renamed from: b */
        public final ImmutableList.C2804a<ksx> f159302b = new ImmutableList.C2804a<>();

        /* JADX INFO: renamed from: c */
        public int f159303c = -1;

        /* JADX INFO: renamed from: d */
        @Nullable
        public String f159304d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public String f159305e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public String f159306f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public Uri f159307g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public String f159308h;

        /* JADX INFO: renamed from: i */
        @Nullable
        public String f159309i;

        /* JADX INFO: renamed from: j */
        @Nullable
        public String f159310j;

        /* JADX INFO: renamed from: k */
        @Nullable
        public String f159311k;

        /* JADX INFO: renamed from: l */
        @Nullable
        public String f159312l;

        /* JADX INFO: renamed from: m */
        public C19646b m177781m(String str, String str2) {
            this.f159301a.put(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C19646b m177782n(ksx ksxVar) {
            this.f159302b.mo15737a(ksxVar);
            return this;
        }

        /* JADX INFO: renamed from: o */
        public qse0 m177783o() {
            return new qse0(this);
        }

        /* JADX INFO: renamed from: p */
        public C19646b m177784p(int i) {
            this.f159303c = i;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C19646b m177785q(String str) {
            this.f159308h = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C19646b m177786r(String str) {
            this.f159311k = str;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C19646b m177787s(String str) {
            this.f159309i = str;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C19646b m177788t(String str) {
            this.f159305e = str;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C19646b m177789u(String str) {
            this.f159312l = str;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C19646b m177790v(String str) {
            this.f159310j = str;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C19646b m177791w(String str) {
            this.f159304d = str;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C19646b m177792x(String str) {
            this.f159306f = str;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C19646b m177793y(Uri uri) {
            this.f159307g = uri;
            return this;
        }
    }

    public qse0(C19646b c19646b) {
        this.f159289a = ImmutableMap.copyOf((Map) c19646b.f159301a);
        this.f159290b = c19646b.f159302b.m15756m();
        this.f159291c = (String) bmk0.m105144j(c19646b.f159304d);
        this.f159292d = (String) bmk0.m105144j(c19646b.f159305e);
        this.f159293e = (String) bmk0.m105144j(c19646b.f159306f);
        this.f159295g = c19646b.f159307g;
        this.f159296h = c19646b.f159308h;
        this.f159294f = c19646b.f159303c;
        this.f159297i = c19646b.f159309i;
        this.f159298j = c19646b.f159311k;
        this.f159299k = c19646b.f159312l;
        this.f159300l = c19646b.f159310j;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qse0.class == obj.getClass()) {
            qse0 qse0Var = (qse0) obj;
            if (this.f159294f == qse0Var.f159294f && this.f159289a.equals(qse0Var.f159289a) && this.f159290b.equals(qse0Var.f159290b) && bmk0.m105123c(this.f159292d, qse0Var.f159292d) && bmk0.m105123c(this.f159291c, qse0Var.f159291c) && bmk0.m105123c(this.f159293e, qse0Var.f159293e) && bmk0.m105123c(this.f159300l, qse0Var.f159300l) && bmk0.m105123c(this.f159295g, qse0Var.f159295g) && bmk0.m105123c(this.f159298j, qse0Var.f159298j) && bmk0.m105123c(this.f159299k, qse0Var.f159299k) && bmk0.m105123c(this.f159296h, qse0Var.f159296h) && bmk0.m105123c(this.f159297i, qse0Var.f159297i)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((217 + this.f159289a.hashCode()) * 31) + this.f159290b.hashCode()) * 31;
        String str = this.f159292d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f159291c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f159293e;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f159294f) * 31;
        String str4 = this.f159300l;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uri uri = this.f159295g;
        int iHashCode6 = (iHashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str5 = this.f159298j;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f159299k;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f159296h;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f159297i;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }
}
