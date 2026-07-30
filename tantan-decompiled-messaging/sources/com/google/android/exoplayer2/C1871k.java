package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.InterfaceC1863e;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import p149l.ar3;
import p149l.de5;
import p149l.n200;
import p149l.oi3;
import p149l.vck0;
import p149l.vnq;

/* JADX INFO: renamed from: com.google.android.exoplayer2.k */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1871k implements InterfaceC1863e {

    /* JADX INFO: renamed from: A */
    public final int f7729A;

    /* JADX INFO: renamed from: B */
    public final int f7730B;

    /* JADX INFO: renamed from: C */
    public final int f7731C;

    /* JADX INFO: renamed from: D */
    public final int f7732D;

    /* JADX INFO: renamed from: E */
    public final int f7733E;

    /* JADX INFO: renamed from: F */
    public final int f7734F;

    /* JADX INFO: renamed from: G */
    public final int f7735G;

    /* JADX INFO: renamed from: H */
    public int f7736H;

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f7737a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f7738b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f7739c;

    /* JADX INFO: renamed from: d */
    public final int f7740d;

    /* JADX INFO: renamed from: e */
    public final int f7741e;

    /* JADX INFO: renamed from: f */
    public final int f7742f;

    /* JADX INFO: renamed from: g */
    public final int f7743g;

    /* JADX INFO: renamed from: h */
    public final int f7744h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final String f7745i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final Metadata f7746j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final String f7747k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public final String f7748l;

    /* JADX INFO: renamed from: m */
    public final int f7749m;

    /* JADX INFO: renamed from: n */
    public final List<byte[]> f7750n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public final DrmInitData f7751o;

    /* JADX INFO: renamed from: p */
    public final long f7752p;

    /* JADX INFO: renamed from: q */
    public final int f7753q;

    /* JADX INFO: renamed from: r */
    public final int f7754r;

    /* JADX INFO: renamed from: s */
    public final float f7755s;

    /* JADX INFO: renamed from: t */
    public final int f7756t;

    /* JADX INFO: renamed from: u */
    public final float f7757u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public final byte[] f7758v;

    /* JADX INFO: renamed from: w */
    public final int f7759w;

    /* JADX INFO: renamed from: x */
    @Nullable
    public final de5 f7760x;

    /* JADX INFO: renamed from: y */
    public final int f7761y;

    /* JADX INFO: renamed from: z */
    public final int f7762z;

    /* JADX INFO: renamed from: I */
    public static final C1871k f7699I = new b().m10320G();

    /* JADX INFO: renamed from: J */
    public static final String f7701J = vck0.m197903z0(0);

    /* JADX INFO: renamed from: K */
    public static final String f7703K = vck0.m197903z0(1);

    /* JADX INFO: renamed from: L */
    public static final String f7705L = vck0.m197903z0(2);

    /* JADX INFO: renamed from: M */
    public static final String f7707M = vck0.m197903z0(3);

    /* JADX INFO: renamed from: N */
    public static final String f7709N = vck0.m197903z0(4);

    /* JADX INFO: renamed from: O */
    public static final String f7711O = vck0.m197903z0(5);

    /* JADX INFO: renamed from: P */
    public static final String f7713P = vck0.m197903z0(6);

    /* JADX INFO: renamed from: Q */
    public static final String f7715Q = vck0.m197903z0(7);

    /* JADX INFO: renamed from: R */
    public static final String f7717R = vck0.m197903z0(8);

    /* JADX INFO: renamed from: S */
    public static final String f7719S = vck0.m197903z0(9);

    /* JADX INFO: renamed from: T */
    public static final String f7720T = vck0.m197903z0(10);

    /* JADX INFO: renamed from: U */
    public static final String f7721U = vck0.m197903z0(11);

    /* JADX INFO: renamed from: V */
    public static final String f7722V = vck0.m197903z0(12);

    /* JADX INFO: renamed from: W */
    public static final String f7723W = vck0.m197903z0(13);

    /* JADX INFO: renamed from: X */
    public static final String f7724X = vck0.m197903z0(14);

    /* JADX INFO: renamed from: Y */
    public static final String f7725Y = vck0.m197903z0(15);

    /* JADX INFO: renamed from: Z */
    public static final String f7726Z = vck0.m197903z0(16);

    /* JADX INFO: renamed from: k0 */
    public static final String f7727k0 = vck0.m197903z0(17);

    /* JADX INFO: renamed from: p0 */
    public static final String f7728p0 = vck0.m197903z0(18);

    /* JADX INFO: renamed from: E0 */
    public static final String f7695E0 = vck0.m197903z0(19);

    /* JADX INFO: renamed from: F0 */
    public static final String f7696F0 = vck0.m197903z0(20);

    /* JADX INFO: renamed from: G0 */
    public static final String f7697G0 = vck0.m197903z0(21);

    /* JADX INFO: renamed from: H0 */
    public static final String f7698H0 = vck0.m197903z0(22);

    /* JADX INFO: renamed from: I0 */
    public static final String f7700I0 = vck0.m197903z0(23);

    /* JADX INFO: renamed from: J0 */
    public static final String f7702J0 = vck0.m197903z0(24);

    /* JADX INFO: renamed from: K0 */
    public static final String f7704K0 = vck0.m197903z0(25);

    /* JADX INFO: renamed from: L0 */
    public static final String f7706L0 = vck0.m197903z0(26);

    /* JADX INFO: renamed from: M0 */
    public static final String f7708M0 = vck0.m197903z0(27);

    /* JADX INFO: renamed from: N0 */
    public static final String f7710N0 = vck0.m197903z0(28);

    /* JADX INFO: renamed from: O0 */
    public static final String f7712O0 = vck0.m197903z0(29);

    /* JADX INFO: renamed from: P0 */
    public static final String f7714P0 = vck0.m197903z0(30);

    /* JADX INFO: renamed from: Q0 */
    public static final String f7716Q0 = vck0.m197903z0(31);

    /* JADX INFO: renamed from: R0 */
    public static final InterfaceC1863e.a<C1871k> f7718R0 = new InterfaceC1863e.a() { // from class: l.tyi
        @Override // com.google.android.exoplayer2.InterfaceC1863e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1863e mo9980a(Bundle bundle) {
            return C1871k.m10279e(bundle);
        }
    };

    public C1871k(b bVar) {
        this.f7737a = bVar.f7769a;
        this.f7738b = bVar.f7770b;
        this.f7739c = vck0.m197810L0(bVar.f7771c);
        this.f7740d = bVar.f7772d;
        this.f7741e = bVar.f7773e;
        int i = bVar.f7774f;
        this.f7742f = i;
        int i2 = bVar.f7775g;
        this.f7743g = i2;
        this.f7744h = i2 != -1 ? i2 : i;
        this.f7745i = bVar.f7776h;
        this.f7746j = bVar.f7777i;
        this.f7747k = bVar.f7778j;
        this.f7748l = bVar.f7779k;
        this.f7749m = bVar.f7780l;
        this.f7750n = bVar.f7781m == null ? Collections.EMPTY_LIST : bVar.f7781m;
        DrmInitData drmInitData = bVar.f7782n;
        this.f7751o = drmInitData;
        this.f7752p = bVar.f7783o;
        this.f7753q = bVar.f7784p;
        this.f7754r = bVar.f7785q;
        this.f7755s = bVar.f7786r;
        this.f7756t = bVar.f7787s == -1 ? 0 : bVar.f7787s;
        this.f7757u = bVar.f7788t == -1.0f ? 1.0f : bVar.f7788t;
        this.f7758v = bVar.f7789u;
        this.f7759w = bVar.f7790v;
        this.f7760x = bVar.f7791w;
        this.f7761y = bVar.f7792x;
        this.f7762z = bVar.f7793y;
        this.f7729A = bVar.f7794z;
        this.f7730B = bVar.f7763A == -1 ? 0 : bVar.f7763A;
        this.f7731C = bVar.f7764B != -1 ? bVar.f7764B : 0;
        this.f7732D = bVar.f7765C;
        this.f7733E = bVar.f7766D;
        this.f7734F = bVar.f7767E;
        if (bVar.f7768F != 0 || drmInitData == null) {
            this.f7735G = bVar.f7768F;
        } else {
            this.f7735G = 1;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static <T> T m10278d(@Nullable T t, @Nullable T t2) {
        return t != null ? t : t2;
    }

    /* JADX INFO: renamed from: e */
    public static C1871k m10279e(Bundle bundle) {
        b bVar = new b();
        oi3.m164494c(bundle);
        String string = bundle.getString(f7701J);
        C1871k c1871k = f7699I;
        bVar.m10334U((String) m10278d(string, c1871k.f7737a)).m10336W((String) m10278d(bundle.getString(f7703K), c1871k.f7738b)).m10337X((String) m10278d(bundle.getString(f7705L), c1871k.f7739c)).m10348i0(bundle.getInt(f7707M, c1871k.f7740d)).m10344e0(bundle.getInt(f7709N, c1871k.f7741e)).m10322I(bundle.getInt(f7711O, c1871k.f7742f)).m10341b0(bundle.getInt(f7713P, c1871k.f7743g)).m10324K((String) m10278d(bundle.getString(f7715Q), c1871k.f7745i)).m10339Z((Metadata) m10278d((Metadata) bundle.getParcelable(f7717R), c1871k.f7746j)).m10326M((String) m10278d(bundle.getString(f7719S), c1871k.f7747k)).m10346g0((String) m10278d(bundle.getString(f7720T), c1871k.f7748l)).m10338Y(bundle.getInt(f7721U, c1871k.f7749m));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            byte[] byteArray = bundle.getByteArray(m10280h(i));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i++;
        }
        b bVarM10328O = bVar.m10335V(arrayList).m10328O((DrmInitData) bundle.getParcelable(f7723W));
        String str = f7724X;
        C1871k c1871k2 = f7699I;
        bVarM10328O.m10350k0(bundle.getLong(str, c1871k2.f7752p)).m10353n0(bundle.getInt(f7725Y, c1871k2.f7753q)).m10332S(bundle.getInt(f7726Z, c1871k2.f7754r)).m10331R(bundle.getFloat(f7727k0, c1871k2.f7755s)).m10345f0(bundle.getInt(f7728p0, c1871k2.f7756t)).m10342c0(bundle.getFloat(f7695E0, c1871k2.f7757u)).m10343d0(bundle.getByteArray(f7696F0)).m10349j0(bundle.getInt(f7697G0, c1871k2.f7759w));
        Bundle bundle2 = bundle.getBundle(f7698H0);
        if (bundle2 != null) {
            bVar.m10325L((de5) de5.f85707l.mo9980a(bundle2));
        }
        bVar.m10323J(bundle.getInt(f7700I0, c1871k2.f7761y)).m10347h0(bundle.getInt(f7702J0, c1871k2.f7762z)).m10340a0(bundle.getInt(f7704K0, c1871k2.f7729A)).m10329P(bundle.getInt(f7706L0, c1871k2.f7730B)).m10330Q(bundle.getInt(f7708M0, c1871k2.f7731C)).m10321H(bundle.getInt(f7710N0, c1871k2.f7732D)).m10351l0(bundle.getInt(f7714P0, c1871k2.f7733E)).m10352m0(bundle.getInt(f7716Q0, c1871k2.f7734F)).m10327N(bundle.getInt(f7712O0, c1871k2.f7735G));
        return bVar.m10320G();
    }

    /* JADX INFO: renamed from: h */
    public static String m10280h(int i) {
        return f7722V + "_" + Integer.toString(i, 36);
    }

    /* JADX INFO: renamed from: j */
    public static String m10281j(@Nullable C1871k c1871k) {
        if (c1871k == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(c1871k.f7737a);
        sb.append(", mimeType=");
        sb.append(c1871k.f7748l);
        if (c1871k.f7744h != -1) {
            sb.append(", bitrate=");
            sb.append(c1871k.f7744h);
        }
        if (c1871k.f7745i != null) {
            sb.append(", codecs=");
            sb.append(c1871k.f7745i);
        }
        if (c1871k.f7751o != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (true) {
                DrmInitData drmInitData = c1871k.f7751o;
                if (i >= drmInitData.schemeDataCount) {
                    break;
                }
                UUID uuid = drmInitData.m9899e(i).uuid;
                if (uuid.equals(ar3.f71229b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(ar3.f71230c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(ar3.f71232e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(ar3.f71231d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(ar3.f71228a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
                i++;
            }
            sb.append(", drm=[");
            vnq.m199039g(',').m199042b(sb, linkedHashSet);
            sb.append(']');
        }
        if (c1871k.f7753q != -1 && c1871k.f7754r != -1) {
            sb.append(", res=");
            sb.append(c1871k.f7753q);
            sb.append(BaseSei.f13930X);
            sb.append(c1871k.f7754r);
        }
        de5 de5Var = c1871k.f7760x;
        if (de5Var != null && de5Var.m111102g()) {
            sb.append(", color=");
            sb.append(c1871k.f7760x.m111103j());
        }
        if (c1871k.f7755s != -1.0f) {
            sb.append(", fps=");
            sb.append(c1871k.f7755s);
        }
        if (c1871k.f7761y != -1) {
            sb.append(", channels=");
            sb.append(c1871k.f7761y);
        }
        if (c1871k.f7762z != -1) {
            sb.append(", sample_rate=");
            sb.append(c1871k.f7762z);
        }
        if (c1871k.f7739c != null) {
            sb.append(", language=");
            sb.append(c1871k.f7739c);
        }
        if (c1871k.f7738b != null) {
            sb.append(", label=");
            sb.append(c1871k.f7738b);
        }
        if (c1871k.f7740d != 0) {
            ArrayList arrayList = new ArrayList();
            if ((c1871k.f7740d & 4) != 0) {
                arrayList.add("auto");
            }
            if ((c1871k.f7740d & 1) != 0) {
                arrayList.add("default");
            }
            if ((c1871k.f7740d & 2) != 0) {
                arrayList.add("forced");
            }
            sb.append(", selectionFlags=[");
            vnq.m199039g(',').m199042b(sb, arrayList);
            sb.append(Constants.AES_SUFFIX);
        }
        if (c1871k.f7741e != 0) {
            ArrayList arrayList2 = new ArrayList();
            if ((c1871k.f7741e & 1) != 0) {
                arrayList2.add(BLiveTraceServerLocation.main);
            }
            if ((c1871k.f7741e & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((c1871k.f7741e & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((c1871k.f7741e & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((c1871k.f7741e & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((c1871k.f7741e & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((c1871k.f7741e & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((c1871k.f7741e & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((c1871k.f7741e & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((c1871k.f7741e & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((c1871k.f7741e & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((c1871k.f7741e & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((c1871k.f7741e & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((c1871k.f7741e & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((c1871k.f7741e & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            sb.append(", roleFlags=[");
            vnq.m199039g(',').m199042b(sb, arrayList2);
            sb.append(Constants.AES_SUFFIX);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public b m10282b() {
        return new b();
    }

    /* JADX INFO: renamed from: c */
    public C1871k m10283c(int i) {
        return m10282b().m10327N(i).m10320G();
    }

    public boolean equals(@Nullable Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && C1871k.class == obj.getClass()) {
            C1871k c1871k = (C1871k) obj;
            int i2 = this.f7736H;
            if ((i2 == 0 || (i = c1871k.f7736H) == 0 || i2 == i) && this.f7740d == c1871k.f7740d && this.f7741e == c1871k.f7741e && this.f7742f == c1871k.f7742f && this.f7743g == c1871k.f7743g && this.f7749m == c1871k.f7749m && this.f7752p == c1871k.f7752p && this.f7753q == c1871k.f7753q && this.f7754r == c1871k.f7754r && this.f7756t == c1871k.f7756t && this.f7759w == c1871k.f7759w && this.f7761y == c1871k.f7761y && this.f7762z == c1871k.f7762z && this.f7729A == c1871k.f7729A && this.f7730B == c1871k.f7730B && this.f7731C == c1871k.f7731C && this.f7732D == c1871k.f7732D && this.f7733E == c1871k.f7733E && this.f7734F == c1871k.f7734F && this.f7735G == c1871k.f7735G && Float.compare(this.f7755s, c1871k.f7755s) == 0 && Float.compare(this.f7757u, c1871k.f7757u) == 0 && vck0.m197845c(this.f7737a, c1871k.f7737a) && vck0.m197845c(this.f7738b, c1871k.f7738b) && vck0.m197845c(this.f7745i, c1871k.f7745i) && vck0.m197845c(this.f7747k, c1871k.f7747k) && vck0.m197845c(this.f7748l, c1871k.f7748l) && vck0.m197845c(this.f7739c, c1871k.f7739c) && Arrays.equals(this.f7758v, c1871k.f7758v) && vck0.m197845c(this.f7746j, c1871k.f7746j) && vck0.m197845c(this.f7760x, c1871k.f7760x) && vck0.m197845c(this.f7751o, c1871k.f7751o) && m10285g(c1871k)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public int m10284f() {
        int i;
        int i2 = this.f7753q;
        if (i2 == -1 || (i = this.f7754r) == -1) {
            return -1;
        }
        return i2 * i;
    }

    /* JADX INFO: renamed from: g */
    public boolean m10285g(C1871k c1871k) {
        if (this.f7750n.size() != c1871k.f7750n.size()) {
            return false;
        }
        for (int i = 0; i < this.f7750n.size(); i++) {
            if (!Arrays.equals(this.f7750n.get(i), c1871k.f7750n.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (this.f7736H == 0) {
            String str = this.f7737a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f7738b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f7739c;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f7740d) * 31) + this.f7741e) * 31) + this.f7742f) * 31) + this.f7743g) * 31;
            String str4 = this.f7745i;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.f7746j;
            int iHashCode5 = (iHashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str5 = this.f7747k;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f7748l;
            this.f7736H = ((((((((((((((((((((((((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f7749m) * 31) + ((int) this.f7752p)) * 31) + this.f7753q) * 31) + this.f7754r) * 31) + Float.floatToIntBits(this.f7755s)) * 31) + this.f7756t) * 31) + Float.floatToIntBits(this.f7757u)) * 31) + this.f7759w) * 31) + this.f7761y) * 31) + this.f7762z) * 31) + this.f7729A) * 31) + this.f7730B) * 31) + this.f7731C) * 31) + this.f7732D) * 31) + this.f7733E) * 31) + this.f7734F) * 31) + this.f7735G;
        }
        return this.f7736H;
    }

    /* JADX INFO: renamed from: i */
    public Bundle m10286i(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString(f7701J, this.f7737a);
        bundle.putString(f7703K, this.f7738b);
        bundle.putString(f7705L, this.f7739c);
        bundle.putInt(f7707M, this.f7740d);
        bundle.putInt(f7709N, this.f7741e);
        bundle.putInt(f7711O, this.f7742f);
        bundle.putInt(f7713P, this.f7743g);
        bundle.putString(f7715Q, this.f7745i);
        if (!z) {
            bundle.putParcelable(f7717R, this.f7746j);
        }
        bundle.putString(f7719S, this.f7747k);
        bundle.putString(f7720T, this.f7748l);
        bundle.putInt(f7721U, this.f7749m);
        for (int i = 0; i < this.f7750n.size(); i++) {
            bundle.putByteArray(m10280h(i), this.f7750n.get(i));
        }
        bundle.putParcelable(f7723W, this.f7751o);
        bundle.putLong(f7724X, this.f7752p);
        bundle.putInt(f7725Y, this.f7753q);
        bundle.putInt(f7726Z, this.f7754r);
        bundle.putFloat(f7727k0, this.f7755s);
        bundle.putInt(f7728p0, this.f7756t);
        bundle.putFloat(f7695E0, this.f7757u);
        bundle.putByteArray(f7696F0, this.f7758v);
        bundle.putInt(f7697G0, this.f7759w);
        de5 de5Var = this.f7760x;
        if (de5Var != null) {
            bundle.putBundle(f7698H0, de5Var.toBundle());
        }
        bundle.putInt(f7700I0, this.f7761y);
        bundle.putInt(f7702J0, this.f7762z);
        bundle.putInt(f7704K0, this.f7729A);
        bundle.putInt(f7706L0, this.f7730B);
        bundle.putInt(f7708M0, this.f7731C);
        bundle.putInt(f7710N0, this.f7732D);
        bundle.putInt(f7714P0, this.f7733E);
        bundle.putInt(f7716Q0, this.f7734F);
        bundle.putInt(f7712O0, this.f7735G);
        return bundle;
    }

    /* JADX INFO: renamed from: k */
    public C1871k m10287k(C1871k c1871k) {
        String str;
        if (this == c1871k) {
            return this;
        }
        int iM157529k = n200.m157529k(this.f7748l);
        String str2 = c1871k.f7737a;
        String str3 = c1871k.f7738b;
        if (str3 == null) {
            str3 = this.f7738b;
        }
        String str4 = this.f7739c;
        if ((iM157529k == 3 || iM157529k == 1) && (str = c1871k.f7739c) != null) {
            str4 = str;
        }
        int i = this.f7742f;
        if (i == -1) {
            i = c1871k.f7742f;
        }
        int i2 = this.f7743g;
        if (i2 == -1) {
            i2 = c1871k.f7743g;
        }
        String str5 = this.f7745i;
        if (str5 == null) {
            String strM197811M = vck0.m197811M(c1871k.f7745i, iM157529k);
            if (vck0.m197847c1(strM197811M).length == 1) {
                str5 = strM197811M;
            }
        }
        Metadata metadata = this.f7746j;
        Metadata metadataM10530b = c1871k.f7746j;
        if (metadata != null) {
            metadataM10530b = metadata.m10530b(metadataM10530b);
        }
        float f = this.f7755s;
        if (f == -1.0f && iM157529k == 2) {
            f = c1871k.f7755s;
        }
        int i3 = this.f7740d | c1871k.f7740d;
        return m10282b().m10334U(str2).m10336W(str3).m10337X(str4).m10348i0(i3).m10344e0(this.f7741e | c1871k.f7741e).m10322I(i).m10341b0(i2).m10324K(str5).m10339Z(metadataM10530b).m10328O(DrmInitData.m9896d(c1871k.f7751o, this.f7751o)).m10331R(f).m10320G();
    }

    @Override // com.google.android.exoplayer2.InterfaceC1863e
    public Bundle toBundle() {
        return m10286i(false);
    }

    public String toString() {
        return "Format(" + this.f7737a + ", " + this.f7738b + ", " + this.f7747k + ", " + this.f7748l + ", " + this.f7745i + ", " + this.f7744h + ", " + this.f7739c + ", [" + this.f7753q + ", " + this.f7754r + ", " + this.f7755s + ", " + this.f7760x + "], [" + this.f7761y + ", " + this.f7762z + "])";
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.k$b */
    public static final class b {

        /* JADX INFO: renamed from: A */
        public int f7763A;

        /* JADX INFO: renamed from: B */
        public int f7764B;

        /* JADX INFO: renamed from: C */
        public int f7765C;

        /* JADX INFO: renamed from: D */
        public int f7766D;

        /* JADX INFO: renamed from: E */
        public int f7767E;

        /* JADX INFO: renamed from: F */
        public int f7768F;

        /* JADX INFO: renamed from: a */
        @Nullable
        public String f7769a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public String f7770b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public String f7771c;

        /* JADX INFO: renamed from: d */
        public int f7772d;

        /* JADX INFO: renamed from: e */
        public int f7773e;

        /* JADX INFO: renamed from: f */
        public int f7774f;

        /* JADX INFO: renamed from: g */
        public int f7775g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public String f7776h;

        /* JADX INFO: renamed from: i */
        @Nullable
        public Metadata f7777i;

        /* JADX INFO: renamed from: j */
        @Nullable
        public String f7778j;

        /* JADX INFO: renamed from: k */
        @Nullable
        public String f7779k;

        /* JADX INFO: renamed from: l */
        public int f7780l;

        /* JADX INFO: renamed from: m */
        @Nullable
        public List<byte[]> f7781m;

        /* JADX INFO: renamed from: n */
        @Nullable
        public DrmInitData f7782n;

        /* JADX INFO: renamed from: o */
        public long f7783o;

        /* JADX INFO: renamed from: p */
        public int f7784p;

        /* JADX INFO: renamed from: q */
        public int f7785q;

        /* JADX INFO: renamed from: r */
        public float f7786r;

        /* JADX INFO: renamed from: s */
        public int f7787s;

        /* JADX INFO: renamed from: t */
        public float f7788t;

        /* JADX INFO: renamed from: u */
        @Nullable
        public byte[] f7789u;

        /* JADX INFO: renamed from: v */
        public int f7790v;

        /* JADX INFO: renamed from: w */
        @Nullable
        public de5 f7791w;

        /* JADX INFO: renamed from: x */
        public int f7792x;

        /* JADX INFO: renamed from: y */
        public int f7793y;

        /* JADX INFO: renamed from: z */
        public int f7794z;

        public b(C1871k c1871k) {
            this.f7769a = c1871k.f7737a;
            this.f7770b = c1871k.f7738b;
            this.f7771c = c1871k.f7739c;
            this.f7772d = c1871k.f7740d;
            this.f7773e = c1871k.f7741e;
            this.f7774f = c1871k.f7742f;
            this.f7775g = c1871k.f7743g;
            this.f7776h = c1871k.f7745i;
            this.f7777i = c1871k.f7746j;
            this.f7778j = c1871k.f7747k;
            this.f7779k = c1871k.f7748l;
            this.f7780l = c1871k.f7749m;
            this.f7781m = c1871k.f7750n;
            this.f7782n = c1871k.f7751o;
            this.f7783o = c1871k.f7752p;
            this.f7784p = c1871k.f7753q;
            this.f7785q = c1871k.f7754r;
            this.f7786r = c1871k.f7755s;
            this.f7787s = c1871k.f7756t;
            this.f7788t = c1871k.f7757u;
            this.f7789u = c1871k.f7758v;
            this.f7790v = c1871k.f7759w;
            this.f7791w = c1871k.f7760x;
            this.f7792x = c1871k.f7761y;
            this.f7793y = c1871k.f7762z;
            this.f7794z = c1871k.f7729A;
            this.f7763A = c1871k.f7730B;
            this.f7764B = c1871k.f7731C;
            this.f7765C = c1871k.f7732D;
            this.f7766D = c1871k.f7733E;
            this.f7767E = c1871k.f7734F;
            this.f7768F = c1871k.f7735G;
        }

        /* JADX INFO: renamed from: G */
        public C1871k m10320G() {
            return new C1871k(this);
        }

        /* JADX INFO: renamed from: H */
        public b m10321H(int i) {
            this.f7765C = i;
            return this;
        }

        /* JADX INFO: renamed from: I */
        public b m10322I(int i) {
            this.f7774f = i;
            return this;
        }

        /* JADX INFO: renamed from: J */
        public b m10323J(int i) {
            this.f7792x = i;
            return this;
        }

        /* JADX INFO: renamed from: K */
        public b m10324K(@Nullable String str) {
            this.f7776h = str;
            return this;
        }

        /* JADX INFO: renamed from: L */
        public b m10325L(@Nullable de5 de5Var) {
            this.f7791w = de5Var;
            return this;
        }

        /* JADX INFO: renamed from: M */
        public b m10326M(@Nullable String str) {
            this.f7778j = str;
            return this;
        }

        /* JADX INFO: renamed from: N */
        public b m10327N(int i) {
            this.f7768F = i;
            return this;
        }

        /* JADX INFO: renamed from: O */
        public b m10328O(@Nullable DrmInitData drmInitData) {
            this.f7782n = drmInitData;
            return this;
        }

        /* JADX INFO: renamed from: P */
        public b m10329P(int i) {
            this.f7763A = i;
            return this;
        }

        /* JADX INFO: renamed from: Q */
        public b m10330Q(int i) {
            this.f7764B = i;
            return this;
        }

        /* JADX INFO: renamed from: R */
        public b m10331R(float f) {
            this.f7786r = f;
            return this;
        }

        /* JADX INFO: renamed from: S */
        public b m10332S(int i) {
            this.f7785q = i;
            return this;
        }

        /* JADX INFO: renamed from: T */
        public b m10333T(int i) {
            this.f7769a = Integer.toString(i);
            return this;
        }

        /* JADX INFO: renamed from: U */
        public b m10334U(@Nullable String str) {
            this.f7769a = str;
            return this;
        }

        /* JADX INFO: renamed from: V */
        public b m10335V(@Nullable List<byte[]> list) {
            this.f7781m = list;
            return this;
        }

        /* JADX INFO: renamed from: W */
        public b m10336W(@Nullable String str) {
            this.f7770b = str;
            return this;
        }

        /* JADX INFO: renamed from: X */
        public b m10337X(@Nullable String str) {
            this.f7771c = str;
            return this;
        }

        /* JADX INFO: renamed from: Y */
        public b m10338Y(int i) {
            this.f7780l = i;
            return this;
        }

        /* JADX INFO: renamed from: Z */
        public b m10339Z(@Nullable Metadata metadata) {
            this.f7777i = metadata;
            return this;
        }

        /* JADX INFO: renamed from: a0 */
        public b m10340a0(int i) {
            this.f7794z = i;
            return this;
        }

        /* JADX INFO: renamed from: b0 */
        public b m10341b0(int i) {
            this.f7775g = i;
            return this;
        }

        /* JADX INFO: renamed from: c0 */
        public b m10342c0(float f) {
            this.f7788t = f;
            return this;
        }

        /* JADX INFO: renamed from: d0 */
        public b m10343d0(@Nullable byte[] bArr) {
            this.f7789u = bArr;
            return this;
        }

        /* JADX INFO: renamed from: e0 */
        public b m10344e0(int i) {
            this.f7773e = i;
            return this;
        }

        /* JADX INFO: renamed from: f0 */
        public b m10345f0(int i) {
            this.f7787s = i;
            return this;
        }

        /* JADX INFO: renamed from: g0 */
        public b m10346g0(@Nullable String str) {
            this.f7779k = str;
            return this;
        }

        /* JADX INFO: renamed from: h0 */
        public b m10347h0(int i) {
            this.f7793y = i;
            return this;
        }

        /* JADX INFO: renamed from: i0 */
        public b m10348i0(int i) {
            this.f7772d = i;
            return this;
        }

        /* JADX INFO: renamed from: j0 */
        public b m10349j0(int i) {
            this.f7790v = i;
            return this;
        }

        /* JADX INFO: renamed from: k0 */
        public b m10350k0(long j) {
            this.f7783o = j;
            return this;
        }

        /* JADX INFO: renamed from: l0 */
        public b m10351l0(int i) {
            this.f7766D = i;
            return this;
        }

        /* JADX INFO: renamed from: m0 */
        public b m10352m0(int i) {
            this.f7767E = i;
            return this;
        }

        /* JADX INFO: renamed from: n0 */
        public b m10353n0(int i) {
            this.f7784p = i;
            return this;
        }

        public b() {
            this.f7774f = -1;
            this.f7775g = -1;
            this.f7780l = -1;
            this.f7783o = Long.MAX_VALUE;
            this.f7784p = -1;
            this.f7785q = -1;
            this.f7786r = -1.0f;
            this.f7788t = 1.0f;
            this.f7790v = -1;
            this.f7792x = -1;
            this.f7793y = -1;
            this.f7794z = -1;
            this.f7765C = -1;
            this.f7766D = -1;
            this.f7767E = -1;
            this.f7768F = 0;
        }
    }
}
