package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.InterfaceC1886e;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import p153l.bmk0;
import p153l.cj3;
import p153l.df5;
import p153l.kb00;
import p153l.upq;
import p153l.zr3;

/* JADX INFO: renamed from: com.google.android.exoplayer2.k */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1894k implements InterfaceC1886e {

    /* JADX INFO: renamed from: A */
    public final int f7766A;

    /* JADX INFO: renamed from: B */
    public final int f7767B;

    /* JADX INFO: renamed from: C */
    public final int f7768C;

    /* JADX INFO: renamed from: D */
    public final int f7769D;

    /* JADX INFO: renamed from: E */
    public final int f7770E;

    /* JADX INFO: renamed from: F */
    public final int f7771F;

    /* JADX INFO: renamed from: G */
    public final int f7772G;

    /* JADX INFO: renamed from: H */
    public int f7773H;

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f7774a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f7775b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f7776c;

    /* JADX INFO: renamed from: d */
    public final int f7777d;

    /* JADX INFO: renamed from: e */
    public final int f7778e;

    /* JADX INFO: renamed from: f */
    public final int f7779f;

    /* JADX INFO: renamed from: g */
    public final int f7780g;

    /* JADX INFO: renamed from: h */
    public final int f7781h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final String f7782i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final Metadata f7783j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final String f7784k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public final String f7785l;

    /* JADX INFO: renamed from: m */
    public final int f7786m;

    /* JADX INFO: renamed from: n */
    public final List<byte[]> f7787n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public final DrmInitData f7788o;

    /* JADX INFO: renamed from: p */
    public final long f7789p;

    /* JADX INFO: renamed from: q */
    public final int f7790q;

    /* JADX INFO: renamed from: r */
    public final int f7791r;

    /* JADX INFO: renamed from: s */
    public final float f7792s;

    /* JADX INFO: renamed from: t */
    public final int f7793t;

    /* JADX INFO: renamed from: u */
    public final float f7794u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public final byte[] f7795v;

    /* JADX INFO: renamed from: w */
    public final int f7796w;

    /* JADX INFO: renamed from: x */
    @Nullable
    public final df5 f7797x;

    /* JADX INFO: renamed from: y */
    public final int f7798y;

    /* JADX INFO: renamed from: z */
    public final int f7799z;

    /* JADX INFO: renamed from: I */
    public static final C1894k f7736I = new b().m10374G();

    /* JADX INFO: renamed from: J */
    public static final String f7738J = bmk0.m105181z0(0);

    /* JADX INFO: renamed from: K */
    public static final String f7740K = bmk0.m105181z0(1);

    /* JADX INFO: renamed from: L */
    public static final String f7742L = bmk0.m105181z0(2);

    /* JADX INFO: renamed from: M */
    public static final String f7744M = bmk0.m105181z0(3);

    /* JADX INFO: renamed from: N */
    public static final String f7746N = bmk0.m105181z0(4);

    /* JADX INFO: renamed from: O */
    public static final String f7748O = bmk0.m105181z0(5);

    /* JADX INFO: renamed from: P */
    public static final String f7750P = bmk0.m105181z0(6);

    /* JADX INFO: renamed from: Q */
    public static final String f7752Q = bmk0.m105181z0(7);

    /* JADX INFO: renamed from: R */
    public static final String f7754R = bmk0.m105181z0(8);

    /* JADX INFO: renamed from: S */
    public static final String f7756S = bmk0.m105181z0(9);

    /* JADX INFO: renamed from: T */
    public static final String f7757T = bmk0.m105181z0(10);

    /* JADX INFO: renamed from: U */
    public static final String f7758U = bmk0.m105181z0(11);

    /* JADX INFO: renamed from: V */
    public static final String f7759V = bmk0.m105181z0(12);

    /* JADX INFO: renamed from: W */
    public static final String f7760W = bmk0.m105181z0(13);

    /* JADX INFO: renamed from: X */
    public static final String f7761X = bmk0.m105181z0(14);

    /* JADX INFO: renamed from: Y */
    public static final String f7762Y = bmk0.m105181z0(15);

    /* JADX INFO: renamed from: Z */
    public static final String f7763Z = bmk0.m105181z0(16);

    /* JADX INFO: renamed from: k0 */
    public static final String f7764k0 = bmk0.m105181z0(17);

    /* JADX INFO: renamed from: p0 */
    public static final String f7765p0 = bmk0.m105181z0(18);

    /* JADX INFO: renamed from: E0 */
    public static final String f7732E0 = bmk0.m105181z0(19);

    /* JADX INFO: renamed from: F0 */
    public static final String f7733F0 = bmk0.m105181z0(20);

    /* JADX INFO: renamed from: G0 */
    public static final String f7734G0 = bmk0.m105181z0(21);

    /* JADX INFO: renamed from: H0 */
    public static final String f7735H0 = bmk0.m105181z0(22);

    /* JADX INFO: renamed from: I0 */
    public static final String f7737I0 = bmk0.m105181z0(23);

    /* JADX INFO: renamed from: J0 */
    public static final String f7739J0 = bmk0.m105181z0(24);

    /* JADX INFO: renamed from: K0 */
    public static final String f7741K0 = bmk0.m105181z0(25);

    /* JADX INFO: renamed from: L0 */
    public static final String f7743L0 = bmk0.m105181z0(26);

    /* JADX INFO: renamed from: M0 */
    public static final String f7745M0 = bmk0.m105181z0(27);

    /* JADX INFO: renamed from: N0 */
    public static final String f7747N0 = bmk0.m105181z0(28);

    /* JADX INFO: renamed from: O0 */
    public static final String f7749O0 = bmk0.m105181z0(29);

    /* JADX INFO: renamed from: P0 */
    public static final String f7751P0 = bmk0.m105181z0(30);

    /* JADX INFO: renamed from: Q0 */
    public static final String f7753Q0 = bmk0.m105181z0(31);

    /* JADX INFO: renamed from: R0 */
    public static final InterfaceC1886e.a<C1894k> f7755R0 = new InterfaceC1886e.a() { // from class: l.o1j
        @Override // com.google.android.exoplayer2.InterfaceC1886e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1886e mo10034a(Bundle bundle) {
            return C1894k.m10333e(bundle);
        }
    };

    public C1894k(b bVar) {
        this.f7774a = bVar.f7806a;
        this.f7775b = bVar.f7807b;
        this.f7776c = bmk0.m105088L0(bVar.f7808c);
        this.f7777d = bVar.f7809d;
        this.f7778e = bVar.f7810e;
        int i = bVar.f7811f;
        this.f7779f = i;
        int i2 = bVar.f7812g;
        this.f7780g = i2;
        this.f7781h = i2 != -1 ? i2 : i;
        this.f7782i = bVar.f7813h;
        this.f7783j = bVar.f7814i;
        this.f7784k = bVar.f7815j;
        this.f7785l = bVar.f7816k;
        this.f7786m = bVar.f7817l;
        this.f7787n = bVar.f7818m == null ? Collections.EMPTY_LIST : bVar.f7818m;
        DrmInitData drmInitData = bVar.f7819n;
        this.f7788o = drmInitData;
        this.f7789p = bVar.f7820o;
        this.f7790q = bVar.f7821p;
        this.f7791r = bVar.f7822q;
        this.f7792s = bVar.f7823r;
        this.f7793t = bVar.f7824s == -1 ? 0 : bVar.f7824s;
        this.f7794u = bVar.f7825t == -1.0f ? 1.0f : bVar.f7825t;
        this.f7795v = bVar.f7826u;
        this.f7796w = bVar.f7827v;
        this.f7797x = bVar.f7828w;
        this.f7798y = bVar.f7829x;
        this.f7799z = bVar.f7830y;
        this.f7766A = bVar.f7831z;
        this.f7767B = bVar.f7800A == -1 ? 0 : bVar.f7800A;
        this.f7768C = bVar.f7801B != -1 ? bVar.f7801B : 0;
        this.f7769D = bVar.f7802C;
        this.f7770E = bVar.f7803D;
        this.f7771F = bVar.f7804E;
        if (bVar.f7805F != 0 || drmInitData == null) {
            this.f7772G = bVar.f7805F;
        } else {
            this.f7772G = 1;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static <T> T m10332d(@Nullable T t, @Nullable T t2) {
        return t != null ? t : t2;
    }

    /* JADX INFO: renamed from: e */
    public static C1894k m10333e(Bundle bundle) {
        b bVar = new b();
        cj3.m110053c(bundle);
        String string = bundle.getString(f7738J);
        C1894k c1894k = f7736I;
        bVar.m10388U((String) m10332d(string, c1894k.f7774a)).m10390W((String) m10332d(bundle.getString(f7740K), c1894k.f7775b)).m10391X((String) m10332d(bundle.getString(f7742L), c1894k.f7776c)).m10402i0(bundle.getInt(f7744M, c1894k.f7777d)).m10398e0(bundle.getInt(f7746N, c1894k.f7778e)).m10376I(bundle.getInt(f7748O, c1894k.f7779f)).m10395b0(bundle.getInt(f7750P, c1894k.f7780g)).m10378K((String) m10332d(bundle.getString(f7752Q), c1894k.f7782i)).m10393Z((Metadata) m10332d((Metadata) bundle.getParcelable(f7754R), c1894k.f7783j)).m10380M((String) m10332d(bundle.getString(f7756S), c1894k.f7784k)).m10400g0((String) m10332d(bundle.getString(f7757T), c1894k.f7785l)).m10392Y(bundle.getInt(f7758U, c1894k.f7786m));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            byte[] byteArray = bundle.getByteArray(m10334h(i));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i++;
        }
        b bVarM10382O = bVar.m10389V(arrayList).m10382O((DrmInitData) bundle.getParcelable(f7760W));
        String str = f7761X;
        C1894k c1894k2 = f7736I;
        bVarM10382O.m10404k0(bundle.getLong(str, c1894k2.f7789p)).m10407n0(bundle.getInt(f7762Y, c1894k2.f7790q)).m10386S(bundle.getInt(f7763Z, c1894k2.f7791r)).m10385R(bundle.getFloat(f7764k0, c1894k2.f7792s)).m10399f0(bundle.getInt(f7765p0, c1894k2.f7793t)).m10396c0(bundle.getFloat(f7732E0, c1894k2.f7794u)).m10397d0(bundle.getByteArray(f7733F0)).m10403j0(bundle.getInt(f7734G0, c1894k2.f7796w));
        Bundle bundle2 = bundle.getBundle(f7735H0);
        if (bundle2 != null) {
            bVar.m10379L((df5) df5.f88122l.mo10034a(bundle2));
        }
        bVar.m10377J(bundle.getInt(f7737I0, c1894k2.f7798y)).m10401h0(bundle.getInt(f7739J0, c1894k2.f7799z)).m10394a0(bundle.getInt(f7741K0, c1894k2.f7766A)).m10383P(bundle.getInt(f7743L0, c1894k2.f7767B)).m10384Q(bundle.getInt(f7745M0, c1894k2.f7768C)).m10375H(bundle.getInt(f7747N0, c1894k2.f7769D)).m10405l0(bundle.getInt(f7751P0, c1894k2.f7770E)).m10406m0(bundle.getInt(f7753Q0, c1894k2.f7771F)).m10381N(bundle.getInt(f7749O0, c1894k2.f7772G));
        return bVar.m10374G();
    }

    /* JADX INFO: renamed from: h */
    public static String m10334h(int i) {
        return f7759V + "_" + Integer.toString(i, 36);
    }

    /* JADX INFO: renamed from: j */
    public static String m10335j(@Nullable C1894k c1894k) {
        if (c1894k == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(c1894k.f7774a);
        sb.append(", mimeType=");
        sb.append(c1894k.f7785l);
        if (c1894k.f7781h != -1) {
            sb.append(", bitrate=");
            sb.append(c1894k.f7781h);
        }
        if (c1894k.f7782i != null) {
            sb.append(", codecs=");
            sb.append(c1894k.f7782i);
        }
        if (c1894k.f7788o != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (true) {
                DrmInitData drmInitData = c1894k.f7788o;
                if (i >= drmInitData.schemeDataCount) {
                    break;
                }
                UUID uuid = drmInitData.m9953e(i).uuid;
                if (uuid.equals(zr3.f205730b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(zr3.f205731c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(zr3.f205733e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(zr3.f205732d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(zr3.f205729a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
                i++;
            }
            sb.append(", drm=[");
            upq.m197174g(',').m197177b(sb, linkedHashSet);
            sb.append(']');
        }
        if (c1894k.f7790q != -1 && c1894k.f7791r != -1) {
            sb.append(", res=");
            sb.append(c1894k.f7790q);
            sb.append(BaseSei.f14624X);
            sb.append(c1894k.f7791r);
        }
        df5 df5Var = c1894k.f7797x;
        if (df5Var != null && df5Var.m115499g()) {
            sb.append(", color=");
            sb.append(c1894k.f7797x.m115500j());
        }
        if (c1894k.f7792s != -1.0f) {
            sb.append(", fps=");
            sb.append(c1894k.f7792s);
        }
        if (c1894k.f7798y != -1) {
            sb.append(", channels=");
            sb.append(c1894k.f7798y);
        }
        if (c1894k.f7799z != -1) {
            sb.append(", sample_rate=");
            sb.append(c1894k.f7799z);
        }
        if (c1894k.f7776c != null) {
            sb.append(", language=");
            sb.append(c1894k.f7776c);
        }
        if (c1894k.f7775b != null) {
            sb.append(", label=");
            sb.append(c1894k.f7775b);
        }
        if (c1894k.f7777d != 0) {
            ArrayList arrayList = new ArrayList();
            if ((c1894k.f7777d & 4) != 0) {
                arrayList.add("auto");
            }
            if ((c1894k.f7777d & 1) != 0) {
                arrayList.add("default");
            }
            if ((c1894k.f7777d & 2) != 0) {
                arrayList.add("forced");
            }
            sb.append(", selectionFlags=[");
            upq.m197174g(',').m197177b(sb, arrayList);
            sb.append(Constants.AES_SUFFIX);
        }
        if (c1894k.f7778e != 0) {
            ArrayList arrayList2 = new ArrayList();
            if ((c1894k.f7778e & 1) != 0) {
                arrayList2.add(BLiveTraceServerLocation.main);
            }
            if ((c1894k.f7778e & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((c1894k.f7778e & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((c1894k.f7778e & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((c1894k.f7778e & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((c1894k.f7778e & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((c1894k.f7778e & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((c1894k.f7778e & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((c1894k.f7778e & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((c1894k.f7778e & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((c1894k.f7778e & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((c1894k.f7778e & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((c1894k.f7778e & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((c1894k.f7778e & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((c1894k.f7778e & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            sb.append(", roleFlags=[");
            upq.m197174g(',').m197177b(sb, arrayList2);
            sb.append(Constants.AES_SUFFIX);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public b m10336b() {
        return new b();
    }

    /* JADX INFO: renamed from: c */
    public C1894k m10337c(int i) {
        return m10336b().m10381N(i).m10374G();
    }

    public boolean equals(@Nullable Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && C1894k.class == obj.getClass()) {
            C1894k c1894k = (C1894k) obj;
            int i2 = this.f7773H;
            if ((i2 == 0 || (i = c1894k.f7773H) == 0 || i2 == i) && this.f7777d == c1894k.f7777d && this.f7778e == c1894k.f7778e && this.f7779f == c1894k.f7779f && this.f7780g == c1894k.f7780g && this.f7786m == c1894k.f7786m && this.f7789p == c1894k.f7789p && this.f7790q == c1894k.f7790q && this.f7791r == c1894k.f7791r && this.f7793t == c1894k.f7793t && this.f7796w == c1894k.f7796w && this.f7798y == c1894k.f7798y && this.f7799z == c1894k.f7799z && this.f7766A == c1894k.f7766A && this.f7767B == c1894k.f7767B && this.f7768C == c1894k.f7768C && this.f7769D == c1894k.f7769D && this.f7770E == c1894k.f7770E && this.f7771F == c1894k.f7771F && this.f7772G == c1894k.f7772G && Float.compare(this.f7792s, c1894k.f7792s) == 0 && Float.compare(this.f7794u, c1894k.f7794u) == 0 && bmk0.m105123c(this.f7774a, c1894k.f7774a) && bmk0.m105123c(this.f7775b, c1894k.f7775b) && bmk0.m105123c(this.f7782i, c1894k.f7782i) && bmk0.m105123c(this.f7784k, c1894k.f7784k) && bmk0.m105123c(this.f7785l, c1894k.f7785l) && bmk0.m105123c(this.f7776c, c1894k.f7776c) && Arrays.equals(this.f7795v, c1894k.f7795v) && bmk0.m105123c(this.f7783j, c1894k.f7783j) && bmk0.m105123c(this.f7797x, c1894k.f7797x) && bmk0.m105123c(this.f7788o, c1894k.f7788o) && m10339g(c1894k)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public int m10338f() {
        int i;
        int i2 = this.f7790q;
        if (i2 == -1 || (i = this.f7791r) == -1) {
            return -1;
        }
        return i2 * i;
    }

    /* JADX INFO: renamed from: g */
    public boolean m10339g(C1894k c1894k) {
        if (this.f7787n.size() != c1894k.f7787n.size()) {
            return false;
        }
        for (int i = 0; i < this.f7787n.size(); i++) {
            if (!Arrays.equals(this.f7787n.get(i), c1894k.f7787n.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (this.f7773H == 0) {
            String str = this.f7774a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f7775b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f7776c;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f7777d) * 31) + this.f7778e) * 31) + this.f7779f) * 31) + this.f7780g) * 31;
            String str4 = this.f7782i;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.f7783j;
            int iHashCode5 = (iHashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str5 = this.f7784k;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f7785l;
            this.f7773H = ((((((((((((((((((((((((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f7786m) * 31) + ((int) this.f7789p)) * 31) + this.f7790q) * 31) + this.f7791r) * 31) + Float.floatToIntBits(this.f7792s)) * 31) + this.f7793t) * 31) + Float.floatToIntBits(this.f7794u)) * 31) + this.f7796w) * 31) + this.f7798y) * 31) + this.f7799z) * 31) + this.f7766A) * 31) + this.f7767B) * 31) + this.f7768C) * 31) + this.f7769D) * 31) + this.f7770E) * 31) + this.f7771F) * 31) + this.f7772G;
        }
        return this.f7773H;
    }

    /* JADX INFO: renamed from: i */
    public Bundle m10340i(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString(f7738J, this.f7774a);
        bundle.putString(f7740K, this.f7775b);
        bundle.putString(f7742L, this.f7776c);
        bundle.putInt(f7744M, this.f7777d);
        bundle.putInt(f7746N, this.f7778e);
        bundle.putInt(f7748O, this.f7779f);
        bundle.putInt(f7750P, this.f7780g);
        bundle.putString(f7752Q, this.f7782i);
        if (!z) {
            bundle.putParcelable(f7754R, this.f7783j);
        }
        bundle.putString(f7756S, this.f7784k);
        bundle.putString(f7757T, this.f7785l);
        bundle.putInt(f7758U, this.f7786m);
        for (int i = 0; i < this.f7787n.size(); i++) {
            bundle.putByteArray(m10334h(i), this.f7787n.get(i));
        }
        bundle.putParcelable(f7760W, this.f7788o);
        bundle.putLong(f7761X, this.f7789p);
        bundle.putInt(f7762Y, this.f7790q);
        bundle.putInt(f7763Z, this.f7791r);
        bundle.putFloat(f7764k0, this.f7792s);
        bundle.putInt(f7765p0, this.f7793t);
        bundle.putFloat(f7732E0, this.f7794u);
        bundle.putByteArray(f7733F0, this.f7795v);
        bundle.putInt(f7734G0, this.f7796w);
        df5 df5Var = this.f7797x;
        if (df5Var != null) {
            bundle.putBundle(f7735H0, df5Var.toBundle());
        }
        bundle.putInt(f7737I0, this.f7798y);
        bundle.putInt(f7739J0, this.f7799z);
        bundle.putInt(f7741K0, this.f7766A);
        bundle.putInt(f7743L0, this.f7767B);
        bundle.putInt(f7745M0, this.f7768C);
        bundle.putInt(f7747N0, this.f7769D);
        bundle.putInt(f7751P0, this.f7770E);
        bundle.putInt(f7753Q0, this.f7771F);
        bundle.putInt(f7749O0, this.f7772G);
        return bundle;
    }

    /* JADX INFO: renamed from: k */
    public C1894k m10341k(C1894k c1894k) {
        String str;
        if (this == c1894k) {
            return this;
        }
        int iM149010k = kb00.m149010k(this.f7785l);
        String str2 = c1894k.f7774a;
        String str3 = c1894k.f7775b;
        if (str3 == null) {
            str3 = this.f7775b;
        }
        String str4 = this.f7776c;
        if ((iM149010k == 3 || iM149010k == 1) && (str = c1894k.f7776c) != null) {
            str4 = str;
        }
        int i = this.f7779f;
        if (i == -1) {
            i = c1894k.f7779f;
        }
        int i2 = this.f7780g;
        if (i2 == -1) {
            i2 = c1894k.f7780g;
        }
        String str5 = this.f7782i;
        if (str5 == null) {
            String strM105089M = bmk0.m105089M(c1894k.f7782i, iM149010k);
            if (bmk0.m105125c1(strM105089M).length == 1) {
                str5 = strM105089M;
            }
        }
        Metadata metadata = this.f7783j;
        Metadata metadataM10584b = c1894k.f7783j;
        if (metadata != null) {
            metadataM10584b = metadata.m10584b(metadataM10584b);
        }
        float f = this.f7792s;
        if (f == -1.0f && iM149010k == 2) {
            f = c1894k.f7792s;
        }
        int i3 = this.f7777d | c1894k.f7777d;
        return m10336b().m10388U(str2).m10390W(str3).m10391X(str4).m10402i0(i3).m10398e0(this.f7778e | c1894k.f7778e).m10376I(i).m10395b0(i2).m10378K(str5).m10393Z(metadataM10584b).m10382O(DrmInitData.m9950d(c1894k.f7788o, this.f7788o)).m10385R(f).m10374G();
    }

    @Override // com.google.android.exoplayer2.InterfaceC1886e
    public Bundle toBundle() {
        return m10340i(false);
    }

    public String toString() {
        return "Format(" + this.f7774a + ", " + this.f7775b + ", " + this.f7784k + ", " + this.f7785l + ", " + this.f7782i + ", " + this.f7781h + ", " + this.f7776c + ", [" + this.f7790q + ", " + this.f7791r + ", " + this.f7792s + ", " + this.f7797x + "], [" + this.f7798y + ", " + this.f7799z + "])";
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.k$b */
    public static final class b {

        /* JADX INFO: renamed from: A */
        public int f7800A;

        /* JADX INFO: renamed from: B */
        public int f7801B;

        /* JADX INFO: renamed from: C */
        public int f7802C;

        /* JADX INFO: renamed from: D */
        public int f7803D;

        /* JADX INFO: renamed from: E */
        public int f7804E;

        /* JADX INFO: renamed from: F */
        public int f7805F;

        /* JADX INFO: renamed from: a */
        @Nullable
        public String f7806a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public String f7807b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public String f7808c;

        /* JADX INFO: renamed from: d */
        public int f7809d;

        /* JADX INFO: renamed from: e */
        public int f7810e;

        /* JADX INFO: renamed from: f */
        public int f7811f;

        /* JADX INFO: renamed from: g */
        public int f7812g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public String f7813h;

        /* JADX INFO: renamed from: i */
        @Nullable
        public Metadata f7814i;

        /* JADX INFO: renamed from: j */
        @Nullable
        public String f7815j;

        /* JADX INFO: renamed from: k */
        @Nullable
        public String f7816k;

        /* JADX INFO: renamed from: l */
        public int f7817l;

        /* JADX INFO: renamed from: m */
        @Nullable
        public List<byte[]> f7818m;

        /* JADX INFO: renamed from: n */
        @Nullable
        public DrmInitData f7819n;

        /* JADX INFO: renamed from: o */
        public long f7820o;

        /* JADX INFO: renamed from: p */
        public int f7821p;

        /* JADX INFO: renamed from: q */
        public int f7822q;

        /* JADX INFO: renamed from: r */
        public float f7823r;

        /* JADX INFO: renamed from: s */
        public int f7824s;

        /* JADX INFO: renamed from: t */
        public float f7825t;

        /* JADX INFO: renamed from: u */
        @Nullable
        public byte[] f7826u;

        /* JADX INFO: renamed from: v */
        public int f7827v;

        /* JADX INFO: renamed from: w */
        @Nullable
        public df5 f7828w;

        /* JADX INFO: renamed from: x */
        public int f7829x;

        /* JADX INFO: renamed from: y */
        public int f7830y;

        /* JADX INFO: renamed from: z */
        public int f7831z;

        public b(C1894k c1894k) {
            this.f7806a = c1894k.f7774a;
            this.f7807b = c1894k.f7775b;
            this.f7808c = c1894k.f7776c;
            this.f7809d = c1894k.f7777d;
            this.f7810e = c1894k.f7778e;
            this.f7811f = c1894k.f7779f;
            this.f7812g = c1894k.f7780g;
            this.f7813h = c1894k.f7782i;
            this.f7814i = c1894k.f7783j;
            this.f7815j = c1894k.f7784k;
            this.f7816k = c1894k.f7785l;
            this.f7817l = c1894k.f7786m;
            this.f7818m = c1894k.f7787n;
            this.f7819n = c1894k.f7788o;
            this.f7820o = c1894k.f7789p;
            this.f7821p = c1894k.f7790q;
            this.f7822q = c1894k.f7791r;
            this.f7823r = c1894k.f7792s;
            this.f7824s = c1894k.f7793t;
            this.f7825t = c1894k.f7794u;
            this.f7826u = c1894k.f7795v;
            this.f7827v = c1894k.f7796w;
            this.f7828w = c1894k.f7797x;
            this.f7829x = c1894k.f7798y;
            this.f7830y = c1894k.f7799z;
            this.f7831z = c1894k.f7766A;
            this.f7800A = c1894k.f7767B;
            this.f7801B = c1894k.f7768C;
            this.f7802C = c1894k.f7769D;
            this.f7803D = c1894k.f7770E;
            this.f7804E = c1894k.f7771F;
            this.f7805F = c1894k.f7772G;
        }

        /* JADX INFO: renamed from: G */
        public C1894k m10374G() {
            return new C1894k(this);
        }

        /* JADX INFO: renamed from: H */
        public b m10375H(int i) {
            this.f7802C = i;
            return this;
        }

        /* JADX INFO: renamed from: I */
        public b m10376I(int i) {
            this.f7811f = i;
            return this;
        }

        /* JADX INFO: renamed from: J */
        public b m10377J(int i) {
            this.f7829x = i;
            return this;
        }

        /* JADX INFO: renamed from: K */
        public b m10378K(@Nullable String str) {
            this.f7813h = str;
            return this;
        }

        /* JADX INFO: renamed from: L */
        public b m10379L(@Nullable df5 df5Var) {
            this.f7828w = df5Var;
            return this;
        }

        /* JADX INFO: renamed from: M */
        public b m10380M(@Nullable String str) {
            this.f7815j = str;
            return this;
        }

        /* JADX INFO: renamed from: N */
        public b m10381N(int i) {
            this.f7805F = i;
            return this;
        }

        /* JADX INFO: renamed from: O */
        public b m10382O(@Nullable DrmInitData drmInitData) {
            this.f7819n = drmInitData;
            return this;
        }

        /* JADX INFO: renamed from: P */
        public b m10383P(int i) {
            this.f7800A = i;
            return this;
        }

        /* JADX INFO: renamed from: Q */
        public b m10384Q(int i) {
            this.f7801B = i;
            return this;
        }

        /* JADX INFO: renamed from: R */
        public b m10385R(float f) {
            this.f7823r = f;
            return this;
        }

        /* JADX INFO: renamed from: S */
        public b m10386S(int i) {
            this.f7822q = i;
            return this;
        }

        /* JADX INFO: renamed from: T */
        public b m10387T(int i) {
            this.f7806a = Integer.toString(i);
            return this;
        }

        /* JADX INFO: renamed from: U */
        public b m10388U(@Nullable String str) {
            this.f7806a = str;
            return this;
        }

        /* JADX INFO: renamed from: V */
        public b m10389V(@Nullable List<byte[]> list) {
            this.f7818m = list;
            return this;
        }

        /* JADX INFO: renamed from: W */
        public b m10390W(@Nullable String str) {
            this.f7807b = str;
            return this;
        }

        /* JADX INFO: renamed from: X */
        public b m10391X(@Nullable String str) {
            this.f7808c = str;
            return this;
        }

        /* JADX INFO: renamed from: Y */
        public b m10392Y(int i) {
            this.f7817l = i;
            return this;
        }

        /* JADX INFO: renamed from: Z */
        public b m10393Z(@Nullable Metadata metadata) {
            this.f7814i = metadata;
            return this;
        }

        /* JADX INFO: renamed from: a0 */
        public b m10394a0(int i) {
            this.f7831z = i;
            return this;
        }

        /* JADX INFO: renamed from: b0 */
        public b m10395b0(int i) {
            this.f7812g = i;
            return this;
        }

        /* JADX INFO: renamed from: c0 */
        public b m10396c0(float f) {
            this.f7825t = f;
            return this;
        }

        /* JADX INFO: renamed from: d0 */
        public b m10397d0(@Nullable byte[] bArr) {
            this.f7826u = bArr;
            return this;
        }

        /* JADX INFO: renamed from: e0 */
        public b m10398e0(int i) {
            this.f7810e = i;
            return this;
        }

        /* JADX INFO: renamed from: f0 */
        public b m10399f0(int i) {
            this.f7824s = i;
            return this;
        }

        /* JADX INFO: renamed from: g0 */
        public b m10400g0(@Nullable String str) {
            this.f7816k = str;
            return this;
        }

        /* JADX INFO: renamed from: h0 */
        public b m10401h0(int i) {
            this.f7830y = i;
            return this;
        }

        /* JADX INFO: renamed from: i0 */
        public b m10402i0(int i) {
            this.f7809d = i;
            return this;
        }

        /* JADX INFO: renamed from: j0 */
        public b m10403j0(int i) {
            this.f7827v = i;
            return this;
        }

        /* JADX INFO: renamed from: k0 */
        public b m10404k0(long j) {
            this.f7820o = j;
            return this;
        }

        /* JADX INFO: renamed from: l0 */
        public b m10405l0(int i) {
            this.f7803D = i;
            return this;
        }

        /* JADX INFO: renamed from: m0 */
        public b m10406m0(int i) {
            this.f7804E = i;
            return this;
        }

        /* JADX INFO: renamed from: n0 */
        public b m10407n0(int i) {
            this.f7821p = i;
            return this;
        }

        public b() {
            this.f7811f = -1;
            this.f7812g = -1;
            this.f7817l = -1;
            this.f7820o = Long.MAX_VALUE;
            this.f7821p = -1;
            this.f7822q = -1;
            this.f7823r = -1.0f;
            this.f7825t = 1.0f;
            this.f7827v = -1;
            this.f7829x = -1;
            this.f7830y = -1;
            this.f7831z = -1;
            this.f7802C = -1;
            this.f7803D = -1;
            this.f7804E = -1;
            this.f7805F = 0;
        }
    }
}
