package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.drm.InterfaceC1877b;
import com.google.android.exoplayer2.drm.InterfaceC1878c;
import com.google.android.exoplayer2.source.InterfaceC1976h;
import com.google.android.exoplayer2.source.InterfaceC1989j;
import com.google.android.exoplayer2.source.InterfaceC1997r;
import com.google.android.exoplayer2.upstream.InterfaceC2072c;
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
import p153l.a6f;
import p153l.bf80;
import p153l.bmk0;
import p153l.dfj0;
import p153l.e0f;
import p153l.et5;
import p153l.ffj0;
import p153l.h4c;
import p153l.hs2;
import p153l.mr60;
import p153l.nke0;
import p153l.oj0;
import p153l.pgj0;
import p153l.t1d0;
import p153l.t45;
import p153l.tvd;
import p153l.u9f;
import p153l.vtv;
import p153l.xwd0;
import p153l.y70;
import p153l.z5f;
import p153l.zb5;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.b */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1970b implements InterfaceC1976h, InterfaceC1997r.a<t45<InterfaceC1969a>>, t45.InterfaceC20230b<InterfaceC1969a> {

    /* JADX INFO: renamed from: y */
    public static final Pattern f8420y = Pattern.compile("CC([1-4])=(.+)");

    /* JADX INFO: renamed from: z */
    public static final Pattern f8421z = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* JADX INFO: renamed from: a */
    public final int f8422a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1969a.a f8423b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final pgj0 f8424c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1878c f8425d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2072c f8426e;

    /* JADX INFO: renamed from: f */
    public final hs2 f8427f;

    /* JADX INFO: renamed from: g */
    public final long f8428g;

    /* JADX INFO: renamed from: h */
    public final vtv f8429h;

    /* JADX INFO: renamed from: i */
    public final oj0 f8430i;

    /* JADX INFO: renamed from: j */
    public final ffj0 f8431j;

    /* JADX INFO: renamed from: k */
    public final a[] f8432k;

    /* JADX INFO: renamed from: l */
    public final et5 f8433l;

    /* JADX INFO: renamed from: m */
    public final C1972d f8434m;

    /* JADX INFO: renamed from: o */
    public final InterfaceC1989j.a f8436o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC1877b.a f8437p;

    /* JADX INFO: renamed from: q */
    public final bf80 f8438q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public InterfaceC1976h.a f8439r;

    /* JADX INFO: renamed from: u */
    public InterfaceC1997r f8442u;

    /* JADX INFO: renamed from: v */
    public h4c f8443v;

    /* JADX INFO: renamed from: w */
    public int f8444w;

    /* JADX INFO: renamed from: x */
    public List<a6f> f8445x;

    /* JADX INFO: renamed from: s */
    public t45<InterfaceC1969a>[] f8440s = m11092E(0);

    /* JADX INFO: renamed from: t */
    public z5f[] f8441t = new z5f[0];

    /* JADX INFO: renamed from: n */
    public final IdentityHashMap<t45<InterfaceC1969a>, C1972d.c> f8435n = new IdentityHashMap<>();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int[] f8446a;

        /* JADX INFO: renamed from: b */
        public final int f8447b;

        /* JADX INFO: renamed from: c */
        public final int f8448c;

        /* JADX INFO: renamed from: d */
        public final int f8449d;

        /* JADX INFO: renamed from: e */
        public final int f8450e;

        /* JADX INFO: renamed from: f */
        public final int f8451f;

        /* JADX INFO: renamed from: g */
        public final int f8452g;

        public a(int i, int i2, int[] iArr, int i3, int i4, int i5, int i6) {
            this.f8447b = i;
            this.f8446a = iArr;
            this.f8448c = i2;
            this.f8450e = i3;
            this.f8451f = i4;
            this.f8452g = i5;
            this.f8449d = i6;
        }

        /* JADX INFO: renamed from: a */
        public static a m11112a(int[] iArr, int i) {
            return new a(3, 1, iArr, i, -1, -1, -1);
        }

        /* JADX INFO: renamed from: b */
        public static a m11113b(int[] iArr, int i) {
            return new a(5, 1, iArr, i, -1, -1, -1);
        }

        /* JADX INFO: renamed from: c */
        public static a m11114c(int i) {
            return new a(5, 2, new int[0], -1, -1, -1, i);
        }

        /* JADX INFO: renamed from: d */
        public static a m11115d(int i, int[] iArr, int i2, int i3, int i4) {
            return new a(i, 0, iArr, i2, i3, i4, -1);
        }
    }

    public C1970b(int i, h4c h4cVar, hs2 hs2Var, int i2, InterfaceC1969a.a aVar, @Nullable pgj0 pgj0Var, @Nullable zb5 zb5Var, InterfaceC1878c interfaceC1878c, InterfaceC1877b.a aVar2, InterfaceC2072c interfaceC2072c, InterfaceC1989j.a aVar3, long j, vtv vtvVar, oj0 oj0Var, et5 et5Var, C1972d.b bVar, bf80 bf80Var) {
        this.f8422a = i;
        this.f8443v = h4cVar;
        this.f8427f = hs2Var;
        this.f8444w = i2;
        this.f8423b = aVar;
        this.f8424c = pgj0Var;
        this.f8425d = interfaceC1878c;
        this.f8437p = aVar2;
        this.f8426e = interfaceC2072c;
        this.f8436o = aVar3;
        this.f8428g = j;
        this.f8429h = vtvVar;
        this.f8430i = oj0Var;
        this.f8433l = et5Var;
        this.f8438q = bf80Var;
        this.f8434m = new C1972d(h4cVar, bVar, oj0Var);
        this.f8442u = et5Var.mo122429a(this.f8440s);
        mr60 mr60VarM133557d = h4cVar.m133557d(i2);
        List<a6f> list = mr60VarM133557d.f138303d;
        this.f8445x = list;
        Pair<ffj0, a[]> pairM11096u = m11096u(interfaceC1878c, mr60VarM133557d.f138302c, list);
        this.f8431j = (ffj0) pairM11096u.first;
        this.f8432k = (a[]) pairM11096u.second;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m11090C(List<y70> list, int[] iArr) {
        for (int i : iArr) {
            List<t1d0> list2 = list.get(i).f197729c;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (!list2.get(i2).f171648e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    public static int m11091D(int i, List<y70> list, int[][] iArr, boolean[] zArr, C1894k[][] c1894kArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (m11090C(list, iArr[i3])) {
                zArr[i3] = true;
                i2++;
            }
            C1894k[] c1894kArrM11100y = m11100y(list, iArr[i3]);
            c1894kArr[i3] = c1894kArrM11100y;
            if (c1894kArrM11100y.length != 0) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: E */
    public static t45<InterfaceC1969a>[] m11092E(int i) {
        return new t45[i];
    }

    /* JADX INFO: renamed from: G */
    public static C1894k[] m11093G(tvd tvdVar, Pattern pattern, C1894k c1894k) {
        String str = tvdVar.f176258b;
        if (str == null) {
            return new C1894k[]{c1894k};
        }
        String[] strArrM105119a1 = bmk0.m105119a1(str, Constants.PACKNAME_END);
        C1894k[] c1894kArr = new C1894k[strArrM105119a1.length];
        for (int i = 0; i < strArrM105119a1.length; i++) {
            Matcher matcher = pattern.matcher(strArrM105119a1[i]);
            if (!matcher.matches()) {
                return new C1894k[]{c1894k};
            }
            int i2 = Integer.parseInt(matcher.group(1));
            c1894kArr[i] = c1894k.m10336b().m10388U(c1894k.f7774a + ":" + i2).m10375H(i2).m10391X(matcher.group(2)).m10374G();
        }
        return c1894kArr;
    }

    /* JADX INFO: renamed from: n */
    public static void m11094n(List<a6f> list, dfj0[] dfj0VarArr, a[] aVarArr, int i) {
        int i2 = 0;
        while (i2 < list.size()) {
            a6f a6fVar = list.get(i2);
            dfj0VarArr[i] = new dfj0(a6fVar.m96325a() + ":" + i2, new C1894k.b().m10388U(a6fVar.m96325a()).m10400g0("application/x-emsg").m10374G());
            aVarArr[i] = a.m11114c(i2);
            i2++;
            i++;
        }
    }

    /* JADX INFO: renamed from: o */
    public static int m11095o(InterfaceC1878c interfaceC1878c, List<y70> list, int[][] iArr, int i, boolean[] zArr, C1894k[][] c1894kArr, dfj0[] dfj0VarArr, a[] aVarArr) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            int[] iArr2 = iArr[i4];
            ArrayList arrayList = new ArrayList();
            for (int i6 : iArr2) {
                arrayList.addAll(list.get(i6).f197729c);
            }
            int size = arrayList.size();
            C1894k[] c1894kArr2 = new C1894k[size];
            for (int i7 = 0; i7 < size; i7++) {
                C1894k c1894k = ((t1d0) arrayList.get(i7)).f171645b;
                c1894kArr2[i7] = c1894k.m10337c(interfaceC1878c.mo9930c(c1894k));
            }
            y70 y70Var = list.get(iArr2[0]);
            long j = y70Var.f197727a;
            String string = j != -1 ? Long.toString(j) : "unset:" + i4;
            int i8 = i5 + 1;
            if (zArr[i4]) {
                i2 = i5 + 2;
            } else {
                i2 = i8;
                i8 = -1;
            }
            if (c1894kArr[i4].length != 0) {
                i3 = i2 + 1;
            } else {
                i3 = i2;
                i2 = -1;
            }
            dfj0VarArr[i5] = new dfj0(string, c1894kArr2);
            aVarArr[i5] = a.m11115d(y70Var.f197728b, iArr2, i5, i8, i2);
            if (i8 != -1) {
                String str = string + ":emsg";
                dfj0VarArr[i8] = new dfj0(str, new C1894k.b().m10388U(str).m10400g0("application/x-emsg").m10374G());
                aVarArr[i8] = a.m11113b(iArr2, i5);
            }
            if (i2 != -1) {
                dfj0VarArr[i2] = new dfj0(string + ":cc", c1894kArr[i4]);
                aVarArr[i2] = a.m11112a(iArr2, i5);
            }
            i4++;
            i5 = i3;
        }
        return i5;
    }

    /* JADX INFO: renamed from: u */
    public static Pair<ffj0, a[]> m11096u(InterfaceC1878c interfaceC1878c, List<y70> list, List<a6f> list2) {
        int[][] iArrM11101z = m11101z(list);
        int length = iArrM11101z.length;
        boolean[] zArr = new boolean[length];
        C1894k[][] c1894kArr = new C1894k[length][];
        int iM11091D = m11091D(length, list, iArrM11101z, zArr, c1894kArr) + length + list2.size();
        dfj0[] dfj0VarArr = new dfj0[iM11091D];
        a[] aVarArr = new a[iM11091D];
        m11094n(list2, dfj0VarArr, aVarArr, m11095o(interfaceC1878c, list, iArrM11101z, length, zArr, c1894kArr, dfj0VarArr, aVarArr));
        return Pair.create(new ffj0(dfj0VarArr), aVarArr);
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public static tvd m11097v(List<tvd> list) {
        return m11098w(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public static tvd m11098w(List<tvd> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            tvd tvdVar = list.get(i);
            if (str.equals(tvdVar.f176257a)) {
                return tvdVar;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public static tvd m11099x(List<tvd> list) {
        return m11098w(list, "http://dashif.org/guidelines/trickmode");
    }

    /* JADX INFO: renamed from: y */
    public static C1894k[] m11100y(List<y70> list, int[] iArr) {
        for (int i : iArr) {
            y70 y70Var = list.get(i);
            List<tvd> list2 = list.get(i).f197730d;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                tvd tvdVar = list2.get(i2);
                if ("urn:scte:dash:cc:cea-608:2015".equals(tvdVar.f176257a)) {
                    return m11093G(tvdVar, f8420y, new C1894k.b().m10400g0("application/cea-608").m10388U(y70Var.f197727a + ":cea608").m10374G());
                }
                if ("urn:scte:dash:cc:cea-708:2015".equals(tvdVar.f176257a)) {
                    return m11093G(tvdVar, f8421z, new C1894k.b().m10400g0("application/cea-708").m10388U(y70Var.f197727a + ":cea708").m10374G());
                }
            }
        }
        return new C1894k[0];
    }

    /* JADX INFO: renamed from: z */
    public static int[][] m11101z(List<y70> list) {
        tvd tvdVarM11097v;
        Integer num;
        int size = list.size();
        HashMap mapM16096q = Maps.m16096q(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i = 0; i < size; i++) {
            mapM16096q.put(Long.valueOf(list.get(i).f197727a), Integer.valueOf(i));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i));
            arrayList.add(arrayList2);
            sparseArray.put(i, arrayList2);
        }
        for (int i2 = 0; i2 < size; i2++) {
            y70 y70Var = list.get(i2);
            tvd tvdVarM11099x = m11099x(y70Var.f197731e);
            if (tvdVarM11099x == null) {
                tvdVarM11099x = m11099x(y70Var.f197732f);
            }
            int iIntValue = (tvdVarM11099x == null || (num = (Integer) mapM16096q.get(Long.valueOf(Long.parseLong(tvdVarM11099x.f176258b)))) == null) ? i2 : num.intValue();
            if (iIntValue == i2 && (tvdVarM11097v = m11097v(y70Var.f197732f)) != null) {
                for (String str : bmk0.m105119a1(tvdVarM11097v.f176258b, com.clevertap.android.sdk.Constants.SEPARATOR_COMMA)) {
                    Integer num2 = (Integer) mapM16096q.get(Long.valueOf(Long.parseLong(str)));
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
            int[] iArrM16524n = Ints.m16524n((Collection) arrayList.get(i3));
            iArr[i3] = iArrM16524n;
            Arrays.sort(iArrM16524n);
        }
        return iArr;
    }

    /* JADX INFO: renamed from: A */
    public final int m11102A(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        int i3 = this.f8432k[i2].f8450e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && this.f8432k[i5].f8448c == 0) {
                return i4;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: B */
    public final int[] m11103B(u9f[] u9fVarArr) {
        int[] iArr = new int[u9fVarArr.length];
        for (int i = 0; i < u9fVarArr.length; i++) {
            u9f u9fVar = u9fVarArr[i];
            if (u9fVar != null) {
                iArr[i] = this.f8431j.m125388c(u9fVar.mo11361h());
            } else {
                iArr[i] = -1;
            }
        }
        return iArr;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1997r.a
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo10270j(t45<InterfaceC1969a> t45Var) {
        this.f8439r.mo10270j(this);
    }

    /* JADX INFO: renamed from: H */
    public void m11105H() {
        this.f8434m.m11160o();
        for (t45<InterfaceC1969a> t45Var : this.f8440s) {
            t45Var.m189166P(this);
        }
        this.f8439r = null;
    }

    /* JADX INFO: renamed from: I */
    public final void m11106I(u9f[] u9fVarArr, boolean[] zArr, xwd0[] xwd0VarArr) {
        for (int i = 0; i < u9fVarArr.length; i++) {
            if (u9fVarArr[i] == null || !zArr[i]) {
                xwd0 xwd0Var = xwd0VarArr[i];
                if (xwd0Var instanceof t45) {
                    ((t45) xwd0Var).m189166P(this);
                } else if (xwd0Var instanceof t45.C20229a) {
                    ((t45.C20229a) xwd0Var).m189173d();
                }
                xwd0VarArr[i] = null;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m11107J(u9f[] u9fVarArr, xwd0[] xwd0VarArr, int[] iArr) {
        boolean z;
        for (int i = 0; i < u9fVarArr.length; i++) {
            xwd0 xwd0Var = xwd0VarArr[i];
            if ((xwd0Var instanceof e0f) || (xwd0Var instanceof t45.C20229a)) {
                int iM11102A = m11102A(i, iArr);
                if (iM11102A == -1) {
                    z = xwd0VarArr[i] instanceof e0f;
                } else {
                    xwd0 xwd0Var2 = xwd0VarArr[i];
                    z = (xwd0Var2 instanceof t45.C20229a) && ((t45.C20229a) xwd0Var2).f172000a == xwd0VarArr[iM11102A];
                }
                if (!z) {
                    xwd0 xwd0Var3 = xwd0VarArr[i];
                    if (xwd0Var3 instanceof t45.C20229a) {
                        ((t45.C20229a) xwd0Var3).m189173d();
                    }
                    xwd0VarArr[i] = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m11108K(u9f[] u9fVarArr, xwd0[] xwd0VarArr, boolean[] zArr, long j, int[] iArr) {
        for (int i = 0; i < u9fVarArr.length; i++) {
            u9f u9fVar = u9fVarArr[i];
            if (u9fVar != null) {
                xwd0 xwd0Var = xwd0VarArr[i];
                if (xwd0Var == null) {
                    zArr[i] = true;
                    a aVar = this.f8432k[iArr[i]];
                    int i2 = aVar.f8448c;
                    if (i2 == 0) {
                        xwd0VarArr[i] = m11111q(aVar, u9fVar, j);
                    } else if (i2 == 2) {
                        xwd0VarArr[i] = new z5f(this.f8445x.get(aVar.f8449d), u9fVar.mo11361h().m115519c(0), this.f8443v.f107779d);
                    }
                } else if (xwd0Var instanceof t45) {
                    ((InterfaceC1969a) ((t45) xwd0Var).m189154D()).mo11087b(u9fVar);
                }
            }
        }
        for (int i3 = 0; i3 < u9fVarArr.length; i3++) {
            if (xwd0VarArr[i3] == null && u9fVarArr[i3] != null) {
                a aVar2 = this.f8432k[iArr[i3]];
                if (aVar2.f8448c == 1) {
                    int iM11102A = m11102A(i3, iArr);
                    if (iM11102A == -1) {
                        xwd0VarArr[i3] = new e0f();
                    } else {
                        xwd0VarArr[i3] = ((t45) xwd0VarArr[iM11102A]).m189169S(j, aVar2.f8447b);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m11109L(h4c h4cVar, int i) {
        this.f8443v = h4cVar;
        this.f8444w = i;
        this.f8434m.m11162q(h4cVar);
        t45<InterfaceC1969a>[] t45VarArr = this.f8440s;
        if (t45VarArr != null) {
            for (t45<InterfaceC1969a> t45Var : t45VarArr) {
                ((InterfaceC1969a) t45Var.m189154D()).mo11088i(h4cVar, i);
            }
            this.f8439r.mo10270j(this);
        }
        this.f8445x = h4cVar.m133557d(i).f138303d;
        for (z5f z5fVar : this.f8441t) {
            for (a6f a6fVar : this.f8445x) {
                if (a6fVar.m96325a().equals(z5fVar.m218656c())) {
                    z5fVar.m218658e(a6fVar, h4cVar.f107779d && i == h4cVar.m133558e() - 1);
                    break;
                }
            }
        }
    }

    @Override // p153l.t45.InterfaceC20230b
    /* JADX INFO: renamed from: b */
    public synchronized void mo11110b(t45<InterfaceC1969a> t45Var) {
        C1972d.c cVarRemove = this.f8435n.remove(t45Var);
        if (cVarRemove != null) {
            cVarRemove.m11174n();
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: c */
    public boolean mo10977c(long j) {
        return this.f8442u.mo10977c(j);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: d */
    public long mo10978d() {
        return this.f8442u.mo10978d();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: e */
    public void mo10979e(long j) {
        this.f8442u.mo10979e(j);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    /* JADX INFO: renamed from: f */
    public long mo10980f() {
        return this.f8442u.mo10980f();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: g */
    public long mo10981g(long j, nke0 nke0Var) {
        for (t45<InterfaceC1969a> t45Var : this.f8440s) {
            if (t45Var.f171977a == 2) {
                return t45Var.m189170g(j, nke0Var);
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: h */
    public long mo10982h(long j) throws Throwable {
        for (t45<InterfaceC1969a> t45Var : this.f8440s) {
            t45Var.m189168R(j);
        }
        for (z5f z5fVar : this.f8441t) {
            z5fVar.m218657d(j);
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: i */
    public long mo10983i() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h, com.google.android.exoplayer2.source.InterfaceC1997r
    public boolean isLoading() {
        return this.f8442u.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: m */
    public ffj0 mo10984m() {
        return this.f8431j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: p */
    public void mo10987p(InterfaceC1976h.a aVar, long j) {
        this.f8439r = aVar;
        aVar.mo10275l(this);
    }

    /* JADX INFO: renamed from: q */
    public final t45<InterfaceC1969a> m11111q(a aVar, u9f u9fVar, long j) {
        int i;
        dfj0 dfj0VarM125387b;
        dfj0 dfj0VarM125387b2;
        int i2;
        int i3 = aVar.f8451f;
        boolean z = i3 != -1;
        C1972d.c cVarM11156k = null;
        if (z) {
            dfj0VarM125387b = this.f8431j.m125387b(i3);
            i = 1;
        } else {
            i = 0;
            dfj0VarM125387b = null;
        }
        int i4 = aVar.f8452g;
        boolean z2 = i4 != -1;
        if (z2) {
            dfj0VarM125387b2 = this.f8431j.m125387b(i4);
            i += dfj0VarM125387b2.f88159a;
        } else {
            dfj0VarM125387b2 = null;
        }
        C1894k[] c1894kArr = new C1894k[i];
        int[] iArr = new int[i];
        if (z) {
            c1894kArr[0] = dfj0VarM125387b.m115519c(0);
            iArr[0] = 5;
            i2 = 1;
        } else {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z2) {
            for (int i5 = 0; i5 < dfj0VarM125387b2.f88159a; i5++) {
                C1894k c1894kM115519c = dfj0VarM125387b2.m115519c(i5);
                c1894kArr[i2] = c1894kM115519c;
                iArr[i2] = 3;
                arrayList.add(c1894kM115519c);
                i2++;
            }
        }
        if (this.f8443v.f107779d && z) {
            cVarM11156k = this.f8434m.m11156k();
        }
        C1972d.c cVar = cVarM11156k;
        t45<InterfaceC1969a> t45Var = new t45<>(aVar.f8447b, iArr, c1894kArr, this.f8423b.mo11089a(this.f8429h, this.f8443v, this.f8427f, this.f8444w, aVar.f8446a, u9fVar, aVar.f8447b, this.f8428g, z, arrayList, cVar, this.f8424c, this.f8438q, null), this, this.f8430i, j, this.f8425d, this.f8437p, this.f8426e, this.f8436o);
        synchronized (this) {
            this.f8435n.put(t45Var, cVar);
        }
        return t45Var;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: r */
    public long mo10989r(u9f[] u9fVarArr, boolean[] zArr, xwd0[] xwd0VarArr, boolean[] zArr2, long j) {
        int[] iArrM11103B = m11103B(u9fVarArr);
        m11106I(u9fVarArr, zArr, xwd0VarArr);
        m11107J(u9fVarArr, xwd0VarArr, iArrM11103B);
        m11108K(u9fVarArr, xwd0VarArr, zArr2, j, iArrM11103B);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (xwd0 xwd0Var : xwd0VarArr) {
            if (xwd0Var instanceof t45) {
                arrayList.add((t45) xwd0Var);
            } else if (xwd0Var instanceof z5f) {
                arrayList2.add((z5f) xwd0Var);
            }
        }
        t45<InterfaceC1969a>[] t45VarArrM11092E = m11092E(arrayList.size());
        this.f8440s = t45VarArrM11092E;
        arrayList.toArray(t45VarArrM11092E);
        z5f[] z5fVarArr = new z5f[arrayList2.size()];
        this.f8441t = z5fVarArr;
        arrayList2.toArray(z5fVarArr);
        this.f8442u = this.f8433l.mo122429a(this.f8440s);
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: s */
    public void mo10990s() throws IOException {
        this.f8429h.mo11081a();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1976h
    /* JADX INFO: renamed from: t */
    public void mo10991t(long j, boolean z) {
        for (t45<InterfaceC1969a> t45Var : this.f8440s) {
            t45Var.m189171t(j, z);
        }
    }
}
