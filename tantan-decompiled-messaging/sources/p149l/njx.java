package p149l;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.C1984h;
import com.google.common.collect.ImmutableMap;
import com.tencent.ugc.TXRecordCommon;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class njx {

    /* JADX INFO: renamed from: a */
    public final String f139339a;

    /* JADX INFO: renamed from: b */
    public final int f139340b;

    /* JADX INFO: renamed from: c */
    public final String f139341c;

    /* JADX INFO: renamed from: d */
    public final int f139342d;

    /* JADX INFO: renamed from: e */
    public final int f139343e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final String f139344f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final String f139345g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final String f139346h;

    /* JADX INFO: renamed from: i */
    public final ImmutableMap<String, String> f139347i;

    /* JADX INFO: renamed from: j */
    public final C18721c f139348j;

    /* JADX INFO: renamed from: l.njx$b */
    public static final class C18720b {

        /* JADX INFO: renamed from: a */
        public final String f139349a;

        /* JADX INFO: renamed from: b */
        public final int f139350b;

        /* JADX INFO: renamed from: c */
        public final String f139351c;

        /* JADX INFO: renamed from: d */
        public final int f139352d;

        /* JADX INFO: renamed from: e */
        public final HashMap<String, String> f139353e = new HashMap<>();

        /* JADX INFO: renamed from: f */
        public int f139354f = -1;

        /* JADX INFO: renamed from: g */
        @Nullable
        public String f139355g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public String f139356h;

        /* JADX INFO: renamed from: i */
        @Nullable
        public String f139357i;

        public C18720b(String str, int i, String str2, int i2) {
            this.f139349a = str;
            this.f139350b = i;
            this.f139351c = str2;
            this.f139352d = i2;
        }

        /* JADX INFO: renamed from: k */
        public static String m159806k(int i, String str, int i2, int i3) {
            return vck0.m197793D("%d %s/%d/%d", Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3));
        }

        /* JADX INFO: renamed from: l */
        public static String m159807l(int i) {
            p11.m167007a(i < 96);
            if (i == 0) {
                return m159806k(0, "PCMU", TXRecordCommon.AUDIO_SAMPLERATE_8000, 1);
            }
            if (i == 8) {
                return m159806k(8, "PCMA", TXRecordCommon.AUDIO_SAMPLERATE_8000, 1);
            }
            if (i == 10) {
                return m159806k(10, "L16", 44100, 2);
            }
            if (i == 11) {
                return m159806k(11, "L16", 44100, 1);
            }
            f3c.m119257a("Unsupported static paylod type ", i);
            return null;
        }

        /* JADX INFO: renamed from: i */
        public C18720b m159808i(String str, String str2) {
            this.f139353e.put(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public njx m159809j() {
            try {
                return new njx(this, ImmutableMap.copyOf((Map) this.f139353e), this.f139353e.containsKey("rtpmap") ? C18721c.m159814a((String) vck0.m197866j(this.f139353e.get("rtpmap"))) : C18721c.m159814a(m159807l(this.f139352d)));
            } catch (ParserException e) {
                phg0.m168968a(e);
                return null;
            }
        }

        /* JADX INFO: renamed from: m */
        public C18720b m159810m(int i) {
            this.f139354f = i;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C18720b m159811n(String str) {
            this.f139356h = str;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C18720b m159812o(String str) {
            this.f139357i = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C18720b m159813p(String str) {
            this.f139355g = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.njx$c */
    public static final class C18721c {

        /* JADX INFO: renamed from: a */
        public final int f139358a;

        /* JADX INFO: renamed from: b */
        public final String f139359b;

        /* JADX INFO: renamed from: c */
        public final int f139360c;

        /* JADX INFO: renamed from: d */
        public final int f139361d;

        public C18721c(int i, String str, int i2, int i3) {
            this.f139358a = i;
            this.f139359b = str;
            this.f139360c = i2;
            this.f139361d = i3;
        }

        /* JADX INFO: renamed from: a */
        public static C18721c m159814a(String str) throws ParserException {
            String[] strArrM197844b1 = vck0.m197844b1(str, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            p11.m167007a(strArrM197844b1.length == 2);
            int iM11656h = C1984h.m11656h(strArrM197844b1[0]);
            String[] strArrM197841a1 = vck0.m197841a1(strArrM197844b1[1].trim(), "/");
            p11.m167007a(strArrM197841a1.length >= 2);
            return new C18721c(iM11656h, strArrM197841a1[0], C1984h.m11656h(strArrM197841a1[1]), strArrM197841a1.length == 3 ? C1984h.m11656h(strArrM197841a1[2]) : -1);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C18721c.class == obj.getClass()) {
                C18721c c18721c = (C18721c) obj;
                if (this.f139358a == c18721c.f139358a && this.f139359b.equals(c18721c.f139359b) && this.f139360c == c18721c.f139360c && this.f139361d == c18721c.f139361d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((((217 + this.f139358a) * 31) + this.f139359b.hashCode()) * 31) + this.f139360c) * 31) + this.f139361d;
        }
    }

    public njx(C18720b c18720b, ImmutableMap<String, String> immutableMap, C18721c c18721c) {
        this.f139339a = c18720b.f139349a;
        this.f139340b = c18720b.f139350b;
        this.f139341c = c18720b.f139351c;
        this.f139342d = c18720b.f139352d;
        this.f139344f = c18720b.f139355g;
        this.f139345g = c18720b.f139356h;
        this.f139343e = c18720b.f139354f;
        this.f139346h = c18720b.f139357i;
        this.f139347i = immutableMap;
        this.f139348j = c18721c;
    }

    /* JADX INFO: renamed from: a */
    public ImmutableMap<String, String> m159797a() {
        String str = this.f139347i.get("fmtp");
        if (str == null) {
            return ImmutableMap.m15715of();
        }
        String[] strArrM197844b1 = vck0.m197844b1(str, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        p11.m167008b(strArrM197844b1.length == 2, str);
        String[] strArrSplit = strArrM197844b1[1].split(";\\s?", 0);
        ImmutableMap.C2786b c2786b = new ImmutableMap.C2786b();
        for (String str2 : strArrSplit) {
            String[] strArrM197844b2 = vck0.m197844b1(str2, "=");
            c2786b.mo15661g(strArrM197844b2[0], strArrM197844b2[1]);
        }
        return c2786b.mo15660d();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && njx.class == obj.getClass()) {
            njx njxVar = (njx) obj;
            if (this.f139339a.equals(njxVar.f139339a) && this.f139340b == njxVar.f139340b && this.f139341c.equals(njxVar.f139341c) && this.f139342d == njxVar.f139342d && this.f139343e == njxVar.f139343e && this.f139347i.equals(njxVar.f139347i) && this.f139348j.equals(njxVar.f139348j) && vck0.m197845c(this.f139344f, njxVar.f139344f) && vck0.m197845c(this.f139345g, njxVar.f139345g) && vck0.m197845c(this.f139346h, njxVar.f139346h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((((((((((217 + this.f139339a.hashCode()) * 31) + this.f139340b) * 31) + this.f139341c.hashCode()) * 31) + this.f139342d) * 31) + this.f139343e) * 31) + this.f139347i.hashCode()) * 31) + this.f139348j.hashCode()) * 31;
        String str = this.f139344f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f139345g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f139346h;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
