package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.drm.InterfaceC1854b;
import com.google.android.exoplayer2.drm.InterfaceC1855c;
import com.google.android.exoplayer2.source.InterfaceC1953h;
import com.google.android.exoplayer2.source.InterfaceC1966j;
import com.google.android.exoplayer2.source.InterfaceC1974r;
import com.google.android.exoplayer2.upstream.InterfaceC2049c;
import com.google.common.collect.Maps;
import com.google.common.primitives.Ints;
import com.meituan.robust.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p149l.as5;
import p149l.aze;
import p149l.b6j0;
import p149l.c80;
import p149l.fud;
import p149l.hj60;
import p149l.ice0;
import p149l.l7j0;
import p149l.o8f;
import p149l.otc0;
import p149l.rr2;
import p149l.s35;
import p149l.sj0;
import p149l.urv;
import p149l.v4f;
import p149l.v680;
import p149l.vck0;
import p149l.vod0;
import p149l.w4f;
import p149l.y2c;
import p149l.z5j0;
import p149l.za5;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.b */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1947b implements InterfaceC1953h, InterfaceC1974r.a<s35<InterfaceC1946a>>, s35.InterfaceC19837b<InterfaceC1946a> {

    /* JADX INFO: renamed from: y */
    public static final Pattern f8383y = Pattern.compile("CC([1-4])=(.+)");

    /* JADX INFO: renamed from: z */
    public static final Pattern f8384z = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* JADX INFO: renamed from: a */
    public final int f8385a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1946a.a f8386b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final l7j0 f8387c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1855c f8388d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2049c f8389e;

    /* JADX INFO: renamed from: f */
    public final rr2 f8390f;

    /* JADX INFO: renamed from: g */
    public final long f8391g;

    /* JADX INFO: renamed from: h */
    public final urv f8392h;

    /* JADX INFO: renamed from: i */
    public final sj0 f8393i;

    /* JADX INFO: renamed from: j */
    public final b6j0 f8394j;

    /* JADX INFO: renamed from: k */
    public final a[] f8395k;

    /* JADX INFO: renamed from: l */
    public final as5 f8396l;

    /* JADX INFO: renamed from: m */
    public final C1949d f8397m;

    /* JADX INFO: renamed from: o */
    public final InterfaceC1966j.a f8399o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC1854b.a f8400p;

    /* JADX INFO: renamed from: q */
    public final v680 f8401q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public InterfaceC1953h.a f8402r;

    /* JADX INFO: renamed from: u */
    public InterfaceC1974r f8405u;

    /* JADX INFO: renamed from: v */
    public y2c f8406v;

    /* JADX INFO: renamed from: w */
    public int f8407w;

    /* JADX INFO: renamed from: x */
    public List<w4f> f8408x;

    /* JADX INFO: renamed from: s */
    public s35<InterfaceC1946a>[] f8403s = m11038E(0);

    /* JADX INFO: renamed from: t */
    public v4f[] f8404t = new v4f[0];

    /* JADX INFO: renamed from: n */
    public final IdentityHashMap<s35<InterfaceC1946a>, C1949d.c> f8398n = new IdentityHashMap<>();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int[] f8409a;

        /* JADX INFO: renamed from: b */
        public final int f8410b;

        /* JADX INFO: renamed from: c */
        public final int f8411c;

        /* JADX INFO: renamed from: d */
        public final int f8412d;

        /* JADX INFO: renamed from: e */
        public final int f8413e;

        /* JADX INFO: renamed from: f */
        public final int f8414f;

        /* JADX INFO: renamed from: g */
        public final int f8415g;

        public a(int i, int i2, int[] iArr, int i3, int i4, int i5, int i6) {
            this.f8410b = i;
            this.f8409a = iArr;
            this.f8411c = i2;
            this.f8413e = i3;
            this.f8414f = i4;
            this.f8415g = i5;
            this.f8412d = i6;
        }

        /* JADX INFO: renamed from: a */
        public static a m11058a(int[] iArr, int i) {
            return new a(3, 1, iArr, i, -1, -1, -1);
        }

        /* JADX INFO: renamed from: b */
        public static a m11059b(int[] iArr, int i) {
            return new a(5, 1, iArr, i, -1, -1, -1);
        }

        /* JADX INFO: renamed from: c */
        public static a m11060c(int i) {
            return new a(5, 2, new int[0], -1, -1, -1, i);
        }

        /* JADX INFO: renamed from: d */
        public static a m11061d(int i, int[] iArr, int i2, int i3, int i4) {
            return new a(i, 0, iArr, i2, i3, i4, -1);
        }
    }

    public C1947b(int i, y2c y2cVar, rr2 rr2Var, int i2, InterfaceC1946a.a aVar, @Nullable l7j0 l7j0Var, @Nullable za5 za5Var, InterfaceC1855c interfaceC1855c, InterfaceC1854b.a aVar2, InterfaceC2049c interfaceC2049c, InterfaceC1966j.a aVar3, long j, urv urvVar, sj0 sj0Var, as5 as5Var, C1949d.b bVar, v680 v680Var) {
        this.f8385a = i;
        this.f8406v = y2cVar;
        this.f8390f = rr2Var;
        this.f8407w = i2;
        this.f8386b = aVar;
        this.f8387c = l7j0Var;
        this.f8388d = interfaceC1855c;
        this.f8400p = aVar2;
        this.f8389e = interfaceC2049c;
        this.f8399o = aVar3;
        this.f8391g = j;
        this.f8392h = urvVar;
        this.f8393i = sj0Var;
        this.f8396l = as5Var;
        this.f8401q = v680Var;
        this.f8397m = new C1949d(y2cVar, bVar, sj0Var);
        this.f8405u = as5Var.mo98579a(this.f8403s);
        hj60 hj60VarM212360d = y2cVar.m212360d(i2);
        List<w4f> list = hj60VarM212360d.f108039d;
        this.f8408x = list;
        Pair<b6j0, a[]> pairM11042u = m11042u(interfaceC1855c, hj60VarM212360d.f108038c, list);
        this.f8394j = (b6j0) pairM11042u.first;
        this.f8395k = (a[]) pairM11042u.second;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m11036C(List<c80> list, int[] iArr) {
        for (int i : iArr) {
            List<otc0> list2 = list.get(i).f79672c;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (!list2.get(i2).f145565e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    public static int m11037D(int i, List<c80> list, int[][] iArr, boolean[] zArr, C1871k[][] c1871kArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (m11036C(list, iArr[i3])) {
                zArr[i3] = true;
                i2++;
            }
            C1871k[] c1871kArrM11046y = m11046y(list, iArr[i3]);
            c1871kArr[i3] = c1871kArrM11046y;
            if (c1871kArrM11046y.length != 0) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: E */
    public static s35<InterfaceC1946a>[] m11038E(int i) {
        return new s35[i];
    }

    /* JADX INFO: renamed from: G */
    public static C1871k[] m11039G(fud fudVar, Pattern pattern, C1871k c1871k) {
        String str = fudVar.f99335b;
        if (str == null) {
            return new C1871k[]{c1871k};
        }
        String[] strArrM197841a1 = vck0.m197841a1(str, Constants.PACKNAME_END);
        C1871k[] c1871kArr = new C1871k[strArrM197841a1.length];
        for (int i = 0; i < strArrM197841a1.length; i++) {
            Matcher matcher = pattern.matcher(strArrM197841a1[i]);
            if (!matcher.matches()) {
                return new C1871k[]{c1871k};
            }
            int i2 = Integer.parseInt(matcher.group(1));
            c1871kArr[i] = c1871k.m10282b().m10334U(c1871k.f7737a + ":" + i2).m10321H(i2).m10337X(matcher.group(2)).m10320G();
        }
        return c1871kArr;
    }

    /* JADX INFO: renamed from: n */
    public static void m11040n(List<w4f> list, z5j0[] z5j0VarArr, a[] aVarArr, int i) {
        int i2 = 0;
        while (i2 < list.size()) {
            w4f w4fVar = list.get(i2);
            z5j0VarArr[i] = new z5j0(w4fVar.m201480a() + ":" + i2, new C1871k.b().m10334U(w4fVar.m201480a()).m10346g0("application/x-emsg").m10320G());
            aVarArr[i] = a.m11060c(i2);
            i2++;
            i++;
        }
    }

    /* JADX INFO: renamed from: o */
    public static int m11041o(InterfaceC1855c interfaceC1855c, List<c80> list, int[][] iArr, int i, boolean[] zArr, C1871k[][] c1871kArr, z5j0[] z5j0VarArr, a[] aVarArr) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            int[] iArr2 = iArr[i4];
            ArrayList arrayList = new ArrayList();
            for (int i6 : iArr2) {
                arrayList.addAll(list.get(i6).f79672c);
            }
            int size = arrayList.size();
            C1871k[] c1871kArr2 = new C1871k[size];
            for (int i7 = 0; i7 < size; i7++) {
                C1871k c1871k = ((otc0) arrayList.get(i7)).f145562b;
                c1871kArr2[i7] = c1871k.m10283c(interfaceC1855c.mo9876c(c1871k));
            }
            c80 c80Var = list.get(iArr2[0]);
            long j = c80Var.f79670a;
            String string = j != -1 ? Long.toString(j) : "unset:" + i4;
            int i8 = i5 + 1;
            if (zArr[i4]) {
                i2 = i5 + 2;
            } else {
                i2 = i8;
                i8 = -1;
            }
            if (c1871kArr[i4].length != 0) {
                i3 = i2 + 1;
            } else {
                i3 = i2;
                i2 = -1;
            }
            z5j0VarArr[i5] = new z5j0(string, c1871kArr2);
            aVarArr[i5] = a.m11061d(c80Var.f79671b, iArr2, i5, i8, i2);
            if (i8 != -1) {
                String str = string + ":emsg";
                z5j0VarArr[i8] = new z5j0(str, new C1871k.b().m10334U(str).m10346g0("application/x-emsg").m10320G());
                aVarArr[i8] = a.m11059b(iArr2, i5);
            }
            if (i2 != -1) {
                z5j0VarArr[i2] = new z5j0(string + ":cc", c1871kArr[i4]);
                aVarArr[i2] = a.m11058a(iArr2, i5);
            }
            i4++;
            i5 = i3;
        }
        return i5;
    }

    /* JADX INFO: renamed from: u */
    public static Pair<b6j0, a[]> m11042u(InterfaceC1855c interfaceC1855c, List<c80> list, List<w4f> list2) {
        int[][] iArrM11047z = m11047z(list);
        int length = iArrM11047z.length;
        boolean[] zArr = new boolean[length];
        C1871k[][] c1871kArr = new C1871k[length][];
        int iM11037D = m11037D(length, list, iArrM11047z, zArr, c1871kArr) + length + list2.size();
        z5j0[] z5j0VarArr = new z5j0[iM11037D];
        a[] aVarArr = new a[iM11037D];
        m11040n(list2, z5j0VarArr, aVarArr, m11041o(interfaceC1855c, list, iArrM11047z, length, zArr, c1871kArr, z5j0VarArr, aVarArr));
        return Pair.create(new b6j0(z5j0VarArr), aVarArr);
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public static fud m11043v(List<fud> list) {
        return m11044w(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public static fud m11044w(List<fud> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            fud fudVar = list.get(i);
            if (str.equals(fudVar.f99334a)) {
                return fudVar;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public static fud m11045x(List<fud> list) {
        return m11044w(list, "http://dashif.org/guidelines/trickmode");
    }

    /* JADX INFO: renamed from: y */
    public static C1871k[] m11046y(List<c80> list, int[] iArr) {
        for (int i : iArr) {
            c80 c80Var = list.get(i);
            List<fud> list2 = list.get(i).f79673d;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                fud fudVar = list2.get(i2);
                if ("urn:scte:dash:cc:cea-608:2015".equals(fudVar.f99334a)) {
                    return m11039G(fudVar, f8383y, new C1871k.b().m10346g0("application/cea-608").m10334U(c80Var.f79670a + ":cea608").m10320G());
                }
                if ("urn:scte:dash:cc:cea-708:2015".equals(fudVar.f99334a)) {
                    return m11039G(fudVar, f8384z, new C1871k.b().m10346g0("application/cea-708").m10334U(c80Var.f79670a + ":cea708").m10320G());
                }
            }
        }
        return new C1871k[0];
    }

    /* JADX INFO: renamed from: z */
    public static int[][] m11047z(List<c80> list) {
        fud fudVarM11043v;
        Integer num;
        int size = list.size();
        HashMap mapM16042q = Maps.m16042q(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i = 0; i < size; i++) {
            mapM16042q.put(Long.valueOf(list.get(i).f79670a), Integer.valueOf(i));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i));
            arrayList.add(arrayList2);
            sparseArray.put(i, arrayList2);
        }
        for (int i2 = 0; i2 < size; i2++) {
            c80 c80Var = list.get(i2);
            fud fudVarM11045x = m11045x(c80Var.f79674e);
            if (fudVarM11045x == null) {
                fudVarM11045x = m11045x(c80Var.f79675f);
            }
            int iIntValue = (fudVarM11045x == null || (num = (Integer) mapM16042q.get(Long.valueOf(Long.parseLong(fudVarM11045x.f99335b)))) == null) ? i2 : num.intValue();
            if (iIntValue == i2 && (fudVarM11043v = m11043v(c80Var.f79675f)) != null) {
                for (String str : vck0.m197841a1(fudVarM11043v.f99335b, com.clevertap.android.sdk.Constants.SEPARATOR_COMMA)) {
                    Integer num2 = (Integer) mapM16042q.get(Long.valueOf(Long.parseLong(str)));
                    if (num2 != null) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i2) {
                List list2 = (List) sparseArray.get(i2);
                List list3 = (List) sparseArray.get(iIntValue);
                list3.addAll(list2);
                sparseArray.put(i2, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i3 = 0; i3 < size2; i3++) {
            int[] iArrM16469n = Ints.m16469n((Collection) arrayList.get(i3));
            iArr[i3] = iArrM16469n;
            Arrays.sort(iArrM16469n);
        }
        return iArr;
    }

    /* JADX INFO: renamed from: A */
    public final int m11048A(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        int i3 = this.f8395k[i2].f8413e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && this.f8395k[i5].f8411c == 0) {
                return i4;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: B */
    public final int[] m11049B(o8f[] o8fVarArr) {
        int[] iArr = new int[o8fVarArr.length];
        for (int i = 0; i < o8fVarArr.length; i++) {
            o8f o8fVar = o8fVarArr[i];
            if (o8fVar != null) {
                iArr[i] = this.f8394j.m100411c(o8fVar.mo11307h());
            } else {
                iArr[i] = -1;
            }
        }
        return iArr;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1974r.a
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo10216j(s35<InterfaceC1946a> s35Var) {
        this.f8402r.mo10216j(this);
    }

    /* JADX INFO: renamed from: H */
    public void m11051H() {
        this.f8397m.m11106o();
        for (s35<InterfaceC1946a> s35Var : this.f8403s) {
            s35Var.m182113P(this);
        }
        this.f8402r = null;
    }

    /* JADX INFO: renamed from: I */
    public final void m11052I(o8f[] o8fVarArr, boolean[] zArr, vod0[] vod0VarArr) {
        for (int i = 0; i < o8fVarArr.length; i++) {
            if (o8fVarArr[i] == null || !zArr[i]) {
                vod0 vod0Var = vod0VarArr[i];
                if (vod0Var instanceof s35) {
                    ((s35) vod0Var).m182113P(this);
                } else if (vod0Var instanceof s35.C19836a) {
                    ((s35.C19836a) vod0Var).m182120d();
                }
                vod0VarArr[i] = null;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m11053J(o8f[] o8fVarArr, vod0[] vod0VarArr, int[] iArr) {
        boolean z;
        for (int i = 0; i < o8fVarArr.length; i++) {
            vod0 vod0Var = vod0VarArr[i];
            if ((vod0Var instanceof aze) || (vod0Var instanceof s35.C19836a)) {
                int iM11048A = m11048A(i, iArr);
                if (iM11048A == -1) {
                    z = vod0VarArr[i] instanceof aze;
                } else {
                    vod0 vod0Var2 = vod0VarArr[i];
                    z = (vod0Var2 instanceof s35.C19836a) && ((s35.C19836a) vod0Var2).f162065a == vod0VarArr[iM11048A];
                }
                if (!z) {
                    vod0 vod0Var3 = vod0VarArr[i];
                    if (vod0Var3 instanceof s35.C19836a) {
                        ((s35.C19836a) vod0Var3).m182120d();
                    }
                    vod0VarArr[i] = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m11054K(o8f[] o8fVarArr, vod0[] vod0VarArr, boolean[] zArr, long j, int[] iArr) {
        for (int i = 0; i < o8fVarArr.length; i++) {
            o8f o8fVar = o8fVarArr[i];
            if (o8fVar != null) {
                vod0 vod0Var = vod0VarArr[i];
                if (vod0Var == null) {
                    zArr[i] = true;
                    a aVar = this.f8395k[iArr[i]];
                    int i2 = aVar.f8411c;
                    if (i2 == 0) {
                        vod0VarArr[i] = m11057q(aVar, o8fVar, j);
                    } else if (i2 == 2) {
                        vod0VarArr[i] = new v4f(this.f8408x.get(aVar.f8412d), o8fVar.mo11307h().m217358c(0), this.f8406v.f195510d);
                    }
                } else if (vod0Var instanceof s35) {
                    ((InterfaceC1946a) ((s35) vod0Var).m182101D()).mo11033b(o8fVar);
                }
            }
        }
        for (int i3 = 0; i3 < o8fVarArr.length; i3++) {
            if (vod0VarArr[i3] == null && o8fVarArr[i3] != null) {
                a aVar2 = this.f8395k[iArr[i3]];
                if (aVar2.f8411c == 1) {
                    int iM11048A = m11048A(i3, iArr);
                    if (iM11048A == -1) {
                        vod0VarArr[i3] = new aze();
                    } else {
                        vod0VarArr[i3] = ((s35) vod0VarArr[iM11048A]).m182116S(j, aVar2.f8410b);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m11055L(y2c y2cVar, int i) {
        this.f8406v = y2cVar;
        this.f8407w = i;
        this.f8397m.m11108q(y2cVar);
        s35<InterfaceC1946a>[] s35VarArr = this.f8403s;
        if (s35VarArr != null) {
            for (s35<InterfaceC1946a> s35Var : s35VarArr) {
                ((InterfaceC1946a) s35Var.m182101D()).mo11034i(y2cVar, i);
            }
            this.f8402r.mo10216j(this);
        }
        this.f8408x = y2cVar.m212360d(i).f108039d;
        for (v4f v4fVar : this.f8404t) {
            for (w4f w4fVar : this.f8408x) {
                if (w4fVar.m201480a().equals(v4fVar.m196962c())) {
                    v4fVar.m196964e(w4fVar, y2cVar.f195510d && i == y2cVar.m212361e() - 1);
                    break;
                }
            }
        }
    }

    @Override // p149l.s35.InterfaceC19837b
    /* JADX INFO: renamed from: b */
    public synchronized void mo11056b(s35<InterfaceC1946a> s35Var) {
        C1949d.c cVarRemove = this.f8398n.remove(s35Var);
        if (cVarRemove != null) {
            cVarRemove.m11120n();
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: c */
    public boolean mo10923c(long j) {
        return this.f8405u.mo10923c(j);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: d */
    public long mo10924d() {
        return this.f8405u.mo10924d();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: e */
    public void mo10925e(long j) {
        this.f8405u.mo10925e(j);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    /* JADX INFO: renamed from: f */
    public long mo10926f() {
        return this.f8405u.mo10926f();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: g */
    public long mo10927g(long j, ice0 ice0Var) {
        for (s35<InterfaceC1946a> s35Var : this.f8403s) {
            if (s35Var.f162042a == 2) {
                return s35Var.m182117g(j, ice0Var);
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: h */
    public long mo10928h(long j) throws Throwable {
        for (s35<InterfaceC1946a> s35Var : this.f8403s) {
            s35Var.m182115R(j);
        }
        for (v4f v4fVar : this.f8404t) {
            v4fVar.m196963d(j);
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: i */
    public long mo10929i() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h, com.google.android.exoplayer2.source.InterfaceC1974r
    public boolean isLoading() {
        return this.f8405u.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: m */
    public b6j0 mo10930m() {
        return this.f8394j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: p */
    public void mo10933p(InterfaceC1953h.a aVar, long j) {
        this.f8402r = aVar;
        aVar.mo10221l(this);
    }

    /* JADX INFO: renamed from: q */
    public final s35<InterfaceC1946a> m11057q(a aVar, o8f o8fVar, long j) {
        int i;
        z5j0 z5j0VarM100410b;
        z5j0 z5j0VarM100410b2;
        int i2;
        int i3 = aVar.f8414f;
        boolean z = i3 != -1;
        C1949d.c cVarM11102k = null;
        if (z) {
            z5j0VarM100410b = this.f8394j.m100410b(i3);
            i = 1;
        } else {
            i = 0;
            z5j0VarM100410b = null;
        }
        int i4 = aVar.f8415g;
        boolean z2 = i4 != -1;
        if (z2) {
            z5j0VarM100410b2 = this.f8394j.m100410b(i4);
            i += z5j0VarM100410b2.f201817a;
        } else {
            z5j0VarM100410b2 = null;
        }
        C1871k[] c1871kArr = new C1871k[i];
        int[] iArr = new int[i];
        if (z) {
            c1871kArr[0] = z5j0VarM100410b.m217358c(0);
            iArr[0] = 5;
            i2 = 1;
        } else {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z2) {
            for (int i5 = 0; i5 < z5j0VarM100410b2.f201817a; i5++) {
                C1871k c1871kM217358c = z5j0VarM100410b2.m217358c(i5);
                c1871kArr[i2] = c1871kM217358c;
                iArr[i2] = 3;
                arrayList.add(c1871kM217358c);
                i2++;
            }
        }
        if (this.f8406v.f195510d && z) {
            cVarM11102k = this.f8397m.m11102k();
        }
        C1949d.c cVar = cVarM11102k;
        s35<InterfaceC1946a> s35Var = new s35<>(aVar.f8410b, iArr, c1871kArr, this.f8386b.mo11035a(this.f8392h, this.f8406v, this.f8390f, this.f8407w, aVar.f8409a, o8fVar, aVar.f8410b, this.f8391g, z, arrayList, cVar, this.f8387c, this.f8401q, null), this, this.f8393i, j, this.f8388d, this.f8400p, this.f8389e, this.f8399o);
        synchronized (this) {
            this.f8398n.put(s35Var, cVar);
        }
        return s35Var;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: r */
    public long mo10935r(o8f[] o8fVarArr, boolean[] zArr, vod0[] vod0VarArr, boolean[] zArr2, long j) {
        int[] iArrM11049B = m11049B(o8fVarArr);
        m11052I(o8fVarArr, zArr, vod0VarArr);
        m11053J(o8fVarArr, vod0VarArr, iArrM11049B);
        m11054K(o8fVarArr, vod0VarArr, zArr2, j, iArrM11049B);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (vod0 vod0Var : vod0VarArr) {
            if (vod0Var instanceof s35) {
                arrayList.add((s35) vod0Var);
            } else if (vod0Var instanceof v4f) {
                arrayList2.add((v4f) vod0Var);
            }
        }
        s35<InterfaceC1946a>[] s35VarArrM11038E = m11038E(arrayList.size());
        this.f8403s = s35VarArrM11038E;
        arrayList.toArray(s35VarArrM11038E);
        v4f[] v4fVarArr = new v4f[arrayList2.size()];
        this.f8404t = v4fVarArr;
        arrayList2.toArray(v4fVarArr);
        this.f8405u = this.f8396l.mo98579a(this.f8403s);
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: s */
    public void mo10936s() throws IOException {
        this.f8392h.mo11027a();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1953h
    /* JADX INFO: renamed from: t */
    public void mo10937t(long j, boolean z) {
        for (s35<InterfaceC1946a> s35Var : this.f8403s) {
            s35Var.m182118t(j, z);
        }
    }
}
