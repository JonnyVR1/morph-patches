package p149l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class lke0 {

    /* JADX INFO: renamed from: a */
    public final ImmutableMap<String, String> f128467a;

    /* JADX INFO: renamed from: b */
    public final ImmutableList<njx> f128468b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f128469c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final String f128470d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final String f128471e;

    /* JADX INFO: renamed from: f */
    public final int f128472f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final Uri f128473g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final String f128474h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final String f128475i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final String f128476j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final String f128477k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public final String f128478l;

    /* JADX INFO: renamed from: l.lke0$b */
    public static final class C18241b {

        /* JADX INFO: renamed from: a */
        public final HashMap<String, String> f128479a = new HashMap<>();

        /* JADX INFO: renamed from: b */
        public final ImmutableList.C2781a<njx> f128480b = new ImmutableList.C2781a<>();

        /* JADX INFO: renamed from: c */
        public int f128481c = -1;

        /* JADX INFO: renamed from: d */
        @Nullable
        public String f128482d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public String f128483e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public String f128484f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public Uri f128485g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public String f128486h;

        /* JADX INFO: renamed from: i */
        @Nullable
        public String f128487i;

        /* JADX INFO: renamed from: j */
        @Nullable
        public String f128488j;

        /* JADX INFO: renamed from: k */
        @Nullable
        public String f128489k;

        /* JADX INFO: renamed from: l */
        @Nullable
        public String f128490l;

        /* JADX INFO: renamed from: m */
        public C18241b m150205m(String str, String str2) {
            this.f128479a.put(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C18241b m150206n(njx njxVar) {
            this.f128480b.mo15683a(njxVar);
            return this;
        }

        /* JADX INFO: renamed from: o */
        public lke0 m150207o() {
            return new lke0(this);
        }

        /* JADX INFO: renamed from: p */
        public C18241b m150208p(int i) {
            this.f128481c = i;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C18241b m150209q(String str) {
            this.f128486h = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C18241b m150210r(String str) {
            this.f128489k = str;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C18241b m150211s(String str) {
            this.f128487i = str;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C18241b m150212t(String str) {
            this.f128483e = str;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C18241b m150213u(String str) {
            this.f128490l = str;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C18241b m150214v(String str) {
            this.f128488j = str;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C18241b m150215w(String str) {
            this.f128482d = str;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C18241b m150216x(String str) {
            this.f128484f = str;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C18241b m150217y(Uri uri) {
            this.f128485g = uri;
            return this;
        }
    }

    public lke0(C18241b c18241b) {
        this.f128467a = ImmutableMap.copyOf((Map) c18241b.f128479a);
        this.f128468b = c18241b.f128480b.m15702m();
        this.f128469c = (String) vck0.m197866j(c18241b.f128482d);
        this.f128470d = (String) vck0.m197866j(c18241b.f128483e);
        this.f128471e = (String) vck0.m197866j(c18241b.f128484f);
        this.f128473g = c18241b.f128485g;
        this.f128474h = c18241b.f128486h;
        this.f128472f = c18241b.f128481c;
        this.f128475i = c18241b.f128487i;
        this.f128476j = c18241b.f128489k;
        this.f128477k = c18241b.f128490l;
        this.f128478l = c18241b.f128488j;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lke0.class == obj.getClass()) {
            lke0 lke0Var = (lke0) obj;
            if (this.f128472f == lke0Var.f128472f && this.f128467a.equals(lke0Var.f128467a) && this.f128468b.equals(lke0Var.f128468b) && vck0.m197845c(this.f128470d, lke0Var.f128470d) && vck0.m197845c(this.f128469c, lke0Var.f128469c) && vck0.m197845c(this.f128471e, lke0Var.f128471e) && vck0.m197845c(this.f128478l, lke0Var.f128478l) && vck0.m197845c(this.f128473g, lke0Var.f128473g) && vck0.m197845c(this.f128476j, lke0Var.f128476j) && vck0.m197845c(this.f128477k, lke0Var.f128477k) && vck0.m197845c(this.f128474h, lke0Var.f128474h) && vck0.m197845c(this.f128475i, lke0Var.f128475i)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((217 + this.f128467a.hashCode()) * 31) + this.f128468b.hashCode()) * 31;
        String str = this.f128470d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f128469c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f128471e;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f128472f) * 31;
        String str4 = this.f128478l;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uri uri = this.f128473g;
        int iHashCode6 = (iHashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str5 = this.f128476j;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f128477k;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f128474h;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f128475i;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }
}
