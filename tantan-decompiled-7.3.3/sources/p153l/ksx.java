package p153l;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.C2007h;
import com.google.common.collect.ImmutableMap;
import com.tencent.ugc.TXRecordCommon;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ksx {

    /* JADX INFO: renamed from: a */
    public final String f128614a;

    /* JADX INFO: renamed from: b */
    public final int f128615b;

    /* JADX INFO: renamed from: c */
    public final String f128616c;

    /* JADX INFO: renamed from: d */
    public final int f128617d;

    /* JADX INFO: renamed from: e */
    public final int f128618e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final String f128619f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final String f128620g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final String f128621h;

    /* JADX INFO: renamed from: i */
    public final ImmutableMap<String, String> f128622i;

    /* JADX INFO: renamed from: j */
    public final C18254c f128623j;

    /* JADX INFO: renamed from: l.ksx$b */
    public static final class C18253b {

        /* JADX INFO: renamed from: a */
        public final String f128624a;

        /* JADX INFO: renamed from: b */
        public final int f128625b;

        /* JADX INFO: renamed from: c */
        public final String f128626c;

        /* JADX INFO: renamed from: d */
        public final int f128627d;

        /* JADX INFO: renamed from: e */
        public final HashMap<String, String> f128628e = new HashMap<>();

        /* JADX INFO: renamed from: f */
        public int f128629f = -1;

        /* JADX INFO: renamed from: g */
        @Nullable
        public String f128630g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public String f128631h;

        /* JADX INFO: renamed from: i */
        @Nullable
        public String f128632i;

        public C18253b(String str, int i, String str2, int i2) {
            this.f128624a = str;
            this.f128625b = i;
            this.f128626c = str2;
            this.f128627d = i2;
        }

        /* JADX INFO: renamed from: k */
        public static String m151302k(int i, String str, int i2, int i3) {
            return bmk0.m105071D("%d %s/%d/%d", Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3));
        }

        /* JADX INFO: renamed from: l */
        public static String m151303l(int i) {
            w11.m204365a(i < 96);
            if (i == 0) {
                return m151302k(0, "PCMU", TXRecordCommon.AUDIO_SAMPLERATE_8000, 1);
            }
            if (i == 8) {
                return m151302k(8, "PCMA", TXRecordCommon.AUDIO_SAMPLERATE_8000, 1);
            }
            if (i == 10) {
                return m151302k(10, "L16", 44100, 2);
            }
            if (i == 11) {
                return m151302k(11, "L16", 44100, 1);
            }
            o4c.m165980a("Unsupported static paylod type ", i);
            return null;
        }

        /* JADX INFO: renamed from: i */
        public C18253b m151304i(String str, String str2) {
            this.f128628e.put(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public ksx m151305j() {
            try {
                return new ksx(this, ImmutableMap.copyOf((Map) this.f128628e), this.f128628e.containsKey("rtpmap") ? C18254c.m151310a((String) bmk0.m105144j(this.f128628e.get("rtpmap"))) : C18254c.m151310a(m151303l(this.f128627d)));
            } catch (ParserException e) {
                xpg0.m212648a(e);
                return null;
            }
        }

        /* JADX INFO: renamed from: m */
        public C18253b m151306m(int i) {
            this.f128629f = i;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C18253b m151307n(String str) {
            this.f128631h = str;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C18253b m151308o(String str) {
            this.f128632i = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C18253b m151309p(String str) {
            this.f128630g = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.ksx$c */
    public static final class C18254c {

        /* JADX INFO: renamed from: a */
        public final int f128633a;

        /* JADX INFO: renamed from: b */
        public final String f128634b;

        /* JADX INFO: renamed from: c */
        public final int f128635c;

        /* JADX INFO: renamed from: d */
        public final int f128636d;

        public C18254c(int i, String str, int i2, int i3) {
            this.f128633a = i;
            this.f128634b = str;
            this.f128635c = i2;
            this.f128636d = i3;
        }

        /* JADX INFO: renamed from: a */
        public static C18254c m151310a(String str) throws ParserException {
            String[] strArrM105122b1 = bmk0.m105122b1(str, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            w11.m204365a(strArrM105122b1.length == 2);
            int iM11710h = C2007h.m11710h(strArrM105122b1[0]);
            String[] strArrM105119a1 = bmk0.m105119a1(strArrM105122b1[1].trim(), "/");
            w11.m204365a(strArrM105119a1.length >= 2);
            return new C18254c(iM11710h, strArrM105119a1[0], C2007h.m11710h(strArrM105119a1[1]), strArrM105119a1.length == 3 ? C2007h.m11710h(strArrM105119a1[2]) : -1);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C18254c.class == obj.getClass()) {
                C18254c c18254c = (C18254c) obj;
                if (this.f128633a == c18254c.f128633a && this.f128634b.equals(c18254c.f128634b) && this.f128635c == c18254c.f128635c && this.f128636d == c18254c.f128636d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((((217 + this.f128633a) * 31) + this.f128634b.hashCode()) * 31) + this.f128635c) * 31) + this.f128636d;
        }
    }

    public ksx(C18253b c18253b, ImmutableMap<String, String> immutableMap, C18254c c18254c) {
        this.f128614a = c18253b.f128624a;
        this.f128615b = c18253b.f128625b;
        this.f128616c = c18253b.f128626c;
        this.f128617d = c18253b.f128627d;
        this.f128619f = c18253b.f128630g;
        this.f128620g = c18253b.f128631h;
        this.f128618e = c18253b.f128629f;
        this.f128621h = c18253b.f128632i;
        this.f128622i = immutableMap;
        this.f128623j = c18254c;
    }

    /* JADX INFO: renamed from: a */
    public ImmutableMap<String, String> m151293a() {
        String str = this.f128622i.get("fmtp");
        if (str == null) {
            return ImmutableMap.m15769of();
        }
        String[] strArrM105122b1 = bmk0.m105122b1(str, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        w11.m204366b(strArrM105122b1.length == 2, str);
        String[] strArrSplit = strArrM105122b1[1].split(";\\s?", 0);
        ImmutableMap.C2809b c2809b = new ImmutableMap.C2809b();
        for (String str2 : strArrSplit) {
            String[] strArrM105122b2 = bmk0.m105122b1(str2, "=");
            c2809b.mo15715g(strArrM105122b2[0], strArrM105122b2[1]);
        }
        return c2809b.mo15714d();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ksx.class == obj.getClass()) {
            ksx ksxVar = (ksx) obj;
            if (this.f128614a.equals(ksxVar.f128614a) && this.f128615b == ksxVar.f128615b && this.f128616c.equals(ksxVar.f128616c) && this.f128617d == ksxVar.f128617d && this.f128618e == ksxVar.f128618e && this.f128622i.equals(ksxVar.f128622i) && this.f128623j.equals(ksxVar.f128623j) && bmk0.m105123c(this.f128619f, ksxVar.f128619f) && bmk0.m105123c(this.f128620g, ksxVar.f128620g) && bmk0.m105123c(this.f128621h, ksxVar.f128621h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((((((((((217 + this.f128614a.hashCode()) * 31) + this.f128615b) * 31) + this.f128616c.hashCode()) * 31) + this.f128617d) * 31) + this.f128618e) * 31) + this.f128622i.hashCode()) * 31) + this.f128623j.hashCode()) * 31;
        String str = this.f128619f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f128620g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f128621h;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
