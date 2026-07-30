package p153l;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.InterfaceC1886e;
import com.google.android.exoplayer2.InterfaceC2089x;
import com.google.android.exoplayer2.InterfaceC2090y;
import com.google.android.exoplayer2.audio.C1841a;
import com.google.android.exoplayer2.source.InterfaceC1988i;
import com.google.android.gms.common.api.Api;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import com.google.mlkit.p034nl.languageid.LanguageIdentifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import org.aspectj.lang.JoinPoint;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class atd extends nxw implements InterfaceC2090y.a {

    /* JADX INFO: renamed from: k */
    public static final Ordering<Integer> f73221k = Ordering.from(new Comparator() { // from class: l.rsd
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return atd.m100047u((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: l */
    public static final Ordering<Integer> f73222l = Ordering.from(new Comparator() { // from class: l.ssd
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return atd.m100046t((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: d */
    public final Object f73223d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final Context f73224e;

    /* JADX INFO: renamed from: f */
    public final u9f.InterfaceC20528b f73225f;

    /* JADX INFO: renamed from: g */
    public final boolean f73226g;

    /* JADX INFO: renamed from: h */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public C15829d f73227h;

    /* JADX INFO: renamed from: i */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public C15831f f73228i;

    /* JADX INFO: renamed from: j */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public C1841a f73229j;

    /* JADX INFO: renamed from: l.atd$b */
    public static final class C15827b extends AbstractC15833h<C15827b> implements Comparable<C15827b> {

        /* JADX INFO: renamed from: e */
        public final int f73230e;

        /* JADX INFO: renamed from: f */
        public final boolean f73231f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public final String f73232g;

        /* JADX INFO: renamed from: h */
        public final C15829d f73233h;

        /* JADX INFO: renamed from: i */
        public final boolean f73234i;

        /* JADX INFO: renamed from: j */
        public final int f73235j;

        /* JADX INFO: renamed from: k */
        public final int f73236k;

        /* JADX INFO: renamed from: l */
        public final int f73237l;

        /* JADX INFO: renamed from: m */
        public final boolean f73238m;

        /* JADX INFO: renamed from: n */
        public final int f73239n;

        /* JADX INFO: renamed from: o */
        public final int f73240o;

        /* JADX INFO: renamed from: p */
        public final boolean f73241p;

        /* JADX INFO: renamed from: q */
        public final int f73242q;

        /* JADX INFO: renamed from: r */
        public final int f73243r;

        /* JADX INFO: renamed from: s */
        public final int f73244s;

        /* JADX INFO: renamed from: t */
        public final int f73245t;

        /* JADX INFO: renamed from: u */
        public final boolean f73246u;

        /* JADX INFO: renamed from: v */
        public final boolean f73247v;

        public C15827b(int i, dfj0 dfj0Var, int i2, C15829d c15829d, int i3, boolean z, tp80<C1894k> tp80Var) {
            int i4;
            int iM100034G;
            int iM100034G2;
            super(i, dfj0Var, i2);
            this.f73233h = c15829d;
            this.f73232g = atd.m100042S(this.f73329d.f7776c);
            this.f73234i = atd.m100040O(i3, false);
            int i5 = 0;
            while (true) {
                int size = c15829d.f71207n.size();
                i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                if (i5 >= size) {
                    iM100034G = 0;
                    i5 = Integer.MAX_VALUE;
                    break;
                } else {
                    iM100034G = atd.m100034G(this.f73329d, c15829d.f71207n.get(i5), false);
                    if (iM100034G > 0) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            this.f73236k = i5;
            this.f73235j = iM100034G;
            this.f73237l = atd.m100037K(this.f73329d.f7778e, c15829d.f71208o);
            C1894k c1894k = this.f73329d;
            int i6 = c1894k.f7778e;
            this.f73238m = i6 == 0 || (i6 & 1) != 0;
            this.f73241p = (c1894k.f7777d & 1) != 0;
            int i7 = c1894k.f7798y;
            this.f73242q = i7;
            this.f73243r = c1894k.f7799z;
            int i8 = c1894k.f7781h;
            this.f73244s = i8;
            this.f73231f = (i8 == -1 || i8 <= c15829d.f71210q) && (i7 == -1 || i7 <= c15829d.f71209p) && tp80Var.apply(c1894k);
            String[] strArrM105151l0 = bmk0.m105151l0();
            int i9 = 0;
            while (true) {
                if (i9 >= strArrM105151l0.length) {
                    iM100034G2 = 0;
                    i9 = Integer.MAX_VALUE;
                    break;
                } else {
                    iM100034G2 = atd.m100034G(this.f73329d, strArrM105151l0[i9], false);
                    if (iM100034G2 > 0) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.f73239n = i9;
            this.f73240o = iM100034G2;
            for (int i10 = 0; i10 < c15829d.f71211r.size(); i10++) {
                String str = this.f73329d.f7785l;
                if (str != null && str.equals(c15829d.f71211r.get(i10))) {
                    i4 = i10;
                    break;
                }
            }
            this.f73245t = i4;
            this.f73246u = InterfaceC2090y.m12263r(i3) == 128;
            this.f73247v = InterfaceC2090y.m12260h(i3) == 64;
            this.f73230e = m100076i(i3, z);
        }

        /* JADX INFO: renamed from: f */
        public static int m100071f(List<C15827b> list, List<C15827b> list2) {
            return ((C15827b) Collections.max(list)).compareTo((C15827b) Collections.max(list2));
        }

        /* JADX INFO: renamed from: h */
        public static ImmutableList<C15827b> m100072h(int i, dfj0 dfj0Var, C15829d c15829d, int[] iArr, boolean z, tp80<C1894k> tp80Var) {
            ImmutableList.C2804a c2804aBuilder = ImmutableList.builder();
            for (int i2 = 0; i2 < dfj0Var.f88159a; i2++) {
                c2804aBuilder.mo15737a(new C15827b(i, dfj0Var, i2, c15829d, iArr[i2], z, tp80Var));
            }
            return c2804aBuilder.m15756m();
        }

        @Override // p153l.atd.AbstractC15833h
        /* JADX INFO: renamed from: a */
        public int mo100073a() {
            return this.f73230e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(C15827b c15827b) {
            Ordering orderingReverse = (this.f73231f && this.f73234i) ? atd.f73221k : atd.f73221k.reverse();
            do5 do5VarMo117170g = do5.m117166k().mo117171h(this.f73234i, c15827b.f73234i).mo117170g(Integer.valueOf(this.f73236k), Integer.valueOf(c15827b.f73236k), Ordering.natural().reverse()).mo117167d(this.f73235j, c15827b.f73235j).mo117167d(this.f73237l, c15827b.f73237l).mo117171h(this.f73241p, c15827b.f73241p).mo117171h(this.f73238m, c15827b.f73238m).mo117170g(Integer.valueOf(this.f73239n), Integer.valueOf(c15827b.f73239n), Ordering.natural().reverse()).mo117167d(this.f73240o, c15827b.f73240o).mo117171h(this.f73231f, c15827b.f73231f).mo117170g(Integer.valueOf(this.f73245t), Integer.valueOf(c15827b.f73245t), Ordering.natural().reverse()).mo117170g(Integer.valueOf(this.f73244s), Integer.valueOf(c15827b.f73244s), this.f73233h.f71216w ? atd.f73221k.reverse() : atd.f73222l).mo117171h(this.f73246u, c15827b.f73246u).mo117171h(this.f73247v, c15827b.f73247v).mo117170g(Integer.valueOf(this.f73242q), Integer.valueOf(c15827b.f73242q), orderingReverse).mo117170g(Integer.valueOf(this.f73243r), Integer.valueOf(c15827b.f73243r), orderingReverse);
            Integer numValueOf = Integer.valueOf(this.f73244s);
            Integer numValueOf2 = Integer.valueOf(c15827b.f73244s);
            if (!bmk0.m105123c(this.f73232g, c15827b.f73232g)) {
                orderingReverse = atd.f73222l;
            }
            return do5VarMo117170g.mo117170g(numValueOf, numValueOf2, orderingReverse).mo117173j();
        }

        /* JADX INFO: renamed from: i */
        public final int m100076i(int i, boolean z) {
            if (!atd.m100040O(i, this.f73233h.f73281P0)) {
                return 0;
            }
            if (!this.f73231f && !this.f73233h.f73275J0) {
                return 0;
            }
            if (!atd.m100040O(i, false) || !this.f73231f || this.f73329d.f7781h == -1) {
                return 1;
            }
            C15829d c15829d = this.f73233h;
            if (c15829d.f71217x || c15829d.f71216w) {
                return 1;
            }
            return (c15829d.f73283R0 || !z) ? 2 : 1;
        }

        @Override // p153l.atd.AbstractC15833h
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo100074b(C15827b c15827b) {
            int i;
            String str;
            int i2;
            C15829d c15829d = this.f73233h;
            if (!c15829d.f73278M0 && ((i2 = this.f73329d.f7798y) == -1 || i2 != c15827b.f73329d.f7798y)) {
                return false;
            }
            if (!c15829d.f73276K0 && ((str = this.f73329d.f7785l) == null || !TextUtils.equals(str, c15827b.f73329d.f7785l))) {
                return false;
            }
            C15829d c15829d2 = this.f73233h;
            if (!c15829d2.f73277L0 && ((i = this.f73329d.f7799z) == -1 || i != c15827b.f73329d.f7799z)) {
                return false;
            }
            if (c15829d2.f73279N0) {
                return true;
            }
            return this.f73246u == c15827b.f73246u && this.f73247v == c15827b.f73247v;
        }
    }

    /* JADX INFO: renamed from: l.atd$c */
    public static final class C15828c implements Comparable<C15828c> {

        /* JADX INFO: renamed from: a */
        public final boolean f73248a;

        /* JADX INFO: renamed from: b */
        public final boolean f73249b;

        public C15828c(C1894k c1894k, int i) {
            this.f73248a = (c1894k.f7777d & 1) != 0;
            this.f73249b = atd.m100040O(i, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C15828c c15828c) {
            return do5.m117166k().mo117171h(this.f73249b, c15828c.f73249b).mo117171h(this.f73248a, c15828c.f73248a).mo117173j();
        }
    }

    /* JADX INFO: renamed from: l.atd$e */
    public static final class C15830e implements InterfaceC1886e {

        /* JADX INFO: renamed from: e */
        public static final String f73303e = bmk0.m105181z0(0);

        /* JADX INFO: renamed from: f */
        public static final String f73304f = bmk0.m105181z0(1);

        /* JADX INFO: renamed from: g */
        public static final String f73305g = bmk0.m105181z0(2);

        /* JADX INFO: renamed from: h */
        public static final InterfaceC1886e.a<C15830e> f73306h = new InterfaceC1886e.a() { // from class: l.ctd
            @Override // com.google.android.exoplayer2.InterfaceC1886e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1886e mo10034a(Bundle bundle) {
                return atd.C15830e.m100154a(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        public final int f73307a;

        /* JADX INFO: renamed from: b */
        public final int[] f73308b;

        /* JADX INFO: renamed from: c */
        public final int f73309c;

        /* JADX INFO: renamed from: d */
        public final int f73310d;

        public C15830e(int i, int[] iArr, int i2) {
            this.f73307a = i;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f73308b = iArrCopyOf;
            this.f73309c = iArr.length;
            this.f73310d = i2;
            Arrays.sort(iArrCopyOf);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ C15830e m100154a(Bundle bundle) {
            int i = bundle.getInt(f73303e, -1);
            int[] intArray = bundle.getIntArray(f73304f);
            int i2 = bundle.getInt(f73305g, -1);
            w11.m204365a(i >= 0 && i2 >= 0);
            w11.m204369e(intArray);
            return new C15830e(i, intArray, i2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C15830e.class == obj.getClass()) {
                C15830e c15830e = (C15830e) obj;
                if (this.f73307a == c15830e.f73307a && Arrays.equals(this.f73308b, c15830e.f73308b) && this.f73310d == c15830e.f73310d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f73307a * 31) + Arrays.hashCode(this.f73308b)) * 31) + this.f73310d;
        }

        @Override // com.google.android.exoplayer2.InterfaceC1886e
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(f73303e, this.f73307a);
            bundle.putIntArray(f73304f, this.f73308b);
            bundle.putInt(f73305g, this.f73310d);
            return bundle;
        }
    }

    /* JADX INFO: renamed from: l.atd$f */
    @RequiresApi(32)
    public static class C15831f {

        /* JADX INFO: renamed from: a */
        public final Spatializer f73311a;

        /* JADX INFO: renamed from: b */
        public final boolean f73312b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public Handler f73313c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public Spatializer$OnSpatializerStateChangedListener f73314d;

        /* JADX INFO: renamed from: l.atd$f$a */
        public class a implements Spatializer$OnSpatializerStateChangedListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ atd f73315a;

            public a(atd atdVar) {
                this.f73315a = atdVar;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
                this.f73315a.m100055Q();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
                this.f73315a.m100055Q();
            }
        }

        public C15831f(Spatializer spatializer) {
            this.f73311a = spatializer;
            this.f73312b = spatializer.getImmersiveAudioLevel() != 0;
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public static C15831f m100155g(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new C15831f(audioManager.getSpatializer());
        }

        /* JADX INFO: renamed from: a */
        public boolean m100156a(C1841a c1841a, C1894k c1894k) {
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(bmk0.m105079H(("audio/eac3-joc".equals(c1894k.f7785l) && c1894k.f7798y == 16) ? 12 : c1894k.f7798y));
            int i = c1894k.f7799z;
            if (i != -1) {
                channelMask.setSampleRate(i);
            }
            return this.f73311a.canBeSpatialized(c1841a.m9586b().f7192a, channelMask.build());
        }

        /* JADX INFO: renamed from: b */
        public void m100157b(atd atdVar, Looper looper) {
            if (this.f73314d == null && this.f73313c == null) {
                this.f73314d = new a(atdVar);
                Handler handler = new Handler(looper);
                this.f73313c = handler;
                Spatializer spatializer = this.f73311a;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new mmd(handler), this.f73314d);
            }
        }

        /* JADX INFO: renamed from: c */
        public boolean m100158c() {
            return this.f73311a.isAvailable();
        }

        /* JADX INFO: renamed from: d */
        public boolean m100159d() {
            return this.f73311a.isEnabled();
        }

        /* JADX INFO: renamed from: e */
        public boolean m100160e() {
            return this.f73312b;
        }

        /* JADX INFO: renamed from: f */
        public void m100161f() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.f73314d;
            if (spatializer$OnSpatializerStateChangedListener == null || this.f73313c == null) {
                return;
            }
            this.f73311a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            ((Handler) bmk0.m105144j(this.f73313c)).removeCallbacksAndMessages(null);
            this.f73313c = null;
            this.f73314d = null;
        }
    }

    /* JADX INFO: renamed from: l.atd$g */
    public static final class C15832g extends AbstractC15833h<C15832g> implements Comparable<C15832g> {

        /* JADX INFO: renamed from: e */
        public final int f73317e;

        /* JADX INFO: renamed from: f */
        public final boolean f73318f;

        /* JADX INFO: renamed from: g */
        public final boolean f73319g;

        /* JADX INFO: renamed from: h */
        public final boolean f73320h;

        /* JADX INFO: renamed from: i */
        public final int f73321i;

        /* JADX INFO: renamed from: j */
        public final int f73322j;

        /* JADX INFO: renamed from: k */
        public final int f73323k;

        /* JADX INFO: renamed from: l */
        public final int f73324l;

        /* JADX INFO: renamed from: m */
        public final boolean f73325m;

        public C15832g(int i, dfj0 dfj0Var, int i2, C15829d c15829d, int i3, @Nullable String str) {
            int iM100034G;
            super(i, dfj0Var, i2);
            int i4 = 0;
            this.f73318f = atd.m100040O(i3, false);
            int i5 = this.f73329d.f7777d & (~c15829d.f71214u);
            this.f73319g = (i5 & 1) != 0;
            this.f73320h = (i5 & 2) != 0;
            ImmutableList<String> immutableListM15740of = c15829d.f71212s.isEmpty() ? ImmutableList.m15740of("") : c15829d.f71212s;
            int i6 = 0;
            while (true) {
                if (i6 >= immutableListM15740of.size()) {
                    i6 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    iM100034G = 0;
                    break;
                } else {
                    iM100034G = atd.m100034G(this.f73329d, immutableListM15740of.get(i6), c15829d.f71215v);
                    if (iM100034G > 0) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.f73321i = i6;
            this.f73322j = iM100034G;
            int iM100037K = atd.m100037K(this.f73329d.f7778e, c15829d.f71213t);
            this.f73323k = iM100037K;
            this.f73325m = (this.f73329d.f7778e & 1088) != 0;
            int iM100034G2 = atd.m100034G(this.f73329d, str, atd.m100042S(str) == null);
            this.f73324l = iM100034G2;
            boolean z = iM100034G > 0 || (c15829d.f71212s.isEmpty() && iM100037K > 0) || this.f73319g || (this.f73320h && iM100034G2 > 0);
            if (atd.m100040O(i3, c15829d.f73281P0) && z) {
                i4 = 1;
            }
            this.f73317e = i4;
        }

        /* JADX INFO: renamed from: f */
        public static int m100162f(List<C15832g> list, List<C15832g> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        /* JADX INFO: renamed from: h */
        public static ImmutableList<C15832g> m100163h(int i, dfj0 dfj0Var, C15829d c15829d, int[] iArr, @Nullable String str) {
            ImmutableList.C2804a c2804aBuilder = ImmutableList.builder();
            for (int i2 = 0; i2 < dfj0Var.f88159a; i2++) {
                c2804aBuilder.mo15737a(new C15832g(i, dfj0Var, i2, c15829d, iArr[i2], str));
            }
            return c2804aBuilder.m15756m();
        }

        @Override // p153l.atd.AbstractC15833h
        /* JADX INFO: renamed from: a */
        public int mo100073a() {
            return this.f73317e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(C15832g c15832g) {
            do5 do5VarMo117167d = do5.m117166k().mo117171h(this.f73318f, c15832g.f73318f).mo117170g(Integer.valueOf(this.f73321i), Integer.valueOf(c15832g.f73321i), Ordering.natural().reverse()).mo117167d(this.f73322j, c15832g.f73322j).mo117167d(this.f73323k, c15832g.f73323k).mo117171h(this.f73319g, c15832g.f73319g).mo117170g(Boolean.valueOf(this.f73320h), Boolean.valueOf(c15832g.f73320h), this.f73322j == 0 ? Ordering.natural() : Ordering.natural().reverse()).mo117167d(this.f73324l, c15832g.f73324l);
            if (this.f73323k == 0) {
                do5VarMo117167d = do5VarMo117167d.mo117172i(this.f73325m, c15832g.f73325m);
            }
            return do5VarMo117167d.mo117173j();
        }

        @Override // p153l.atd.AbstractC15833h
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean mo100074b(C15832g c15832g) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l.atd$h */
    public static abstract class AbstractC15833h<T extends AbstractC15833h<T>> {

        /* JADX INFO: renamed from: a */
        public final int f73326a;

        /* JADX INFO: renamed from: b */
        public final dfj0 f73327b;

        /* JADX INFO: renamed from: c */
        public final int f73328c;

        /* JADX INFO: renamed from: d */
        public final C1894k f73329d;

        /* JADX INFO: renamed from: l.atd$h$a */
        public interface a<T extends AbstractC15833h<T>> {
            /* JADX INFO: renamed from: a */
            List<T> mo100166a(int i, dfj0 dfj0Var, int[] iArr);
        }

        public AbstractC15833h(int i, dfj0 dfj0Var, int i2) {
            this.f73326a = i;
            this.f73327b = dfj0Var;
            this.f73328c = i2;
            this.f73329d = dfj0Var.m115519c(i2);
        }

        /* JADX INFO: renamed from: a */
        public abstract int mo100073a();

        /* JADX INFO: renamed from: b */
        public abstract boolean mo100074b(T t);
    }

    /* JADX INFO: renamed from: l.atd$i */
    public static final class C15834i extends AbstractC15833h<C15834i> {

        /* JADX INFO: renamed from: e */
        public final boolean f73330e;

        /* JADX INFO: renamed from: f */
        public final C15829d f73331f;

        /* JADX INFO: renamed from: g */
        public final boolean f73332g;

        /* JADX INFO: renamed from: h */
        public final boolean f73333h;

        /* JADX INFO: renamed from: i */
        public final int f73334i;

        /* JADX INFO: renamed from: j */
        public final int f73335j;

        /* JADX INFO: renamed from: k */
        public final int f73336k;

        /* JADX INFO: renamed from: l */
        public final int f73337l;

        /* JADX INFO: renamed from: m */
        public final boolean f73338m;

        /* JADX INFO: renamed from: n */
        public final boolean f73339n;

        /* JADX INFO: renamed from: o */
        public final int f73340o;

        /* JADX INFO: renamed from: p */
        public final boolean f73341p;

        /* JADX INFO: renamed from: q */
        public final boolean f73342q;

        /* JADX INFO: renamed from: r */
        public final int f73343r;

        /* JADX WARN: Code duplicated, block: B:31:0x004b  */
        /* JADX WARN: Code duplicated, block: B:51:0x0079  */
        public C15834i(int i, dfj0 dfj0Var, int i2, C15829d c15829d, int i3, int i4, boolean z) {
            boolean z2;
            boolean z3;
            C1894k c1894k;
            int i5;
            int i6;
            int i7;
            C1894k c1894k2;
            int i8;
            int i9;
            int i10;
            super(i, dfj0Var, i2);
            this.f73331f = c15829d;
            int i11 = c15829d.f73273H0 ? 24 : 16;
            this.f73339n = c15829d.f73272G0 && (i4 & i11) != 0;
            if (!z || (((i8 = (c1894k2 = this.f73329d).f7790q) != -1 && i8 > c15829d.f71194a) || ((i9 = c1894k2.f7791r) != -1 && i9 > c15829d.f71195b))) {
                z2 = false;
            } else {
                float f = c1894k2.f7792s;
                if ((f == -1.0f || f <= c15829d.f71196c) && ((i10 = c1894k2.f7781h) == -1 || i10 <= c15829d.f71197d)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            this.f73330e = z2;
            if (!z || (((i5 = (c1894k = this.f73329d).f7790q) != -1 && i5 < c15829d.f71198e) || ((i6 = c1894k.f7791r) != -1 && i6 < c15829d.f71199f))) {
                z3 = false;
            } else {
                float f2 = c1894k.f7792s;
                if ((f2 == -1.0f || f2 >= c15829d.f71200g) && ((i7 = c1894k.f7781h) == -1 || i7 >= c15829d.f71201h)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            this.f73332g = z3;
            this.f73333h = atd.m100040O(i3, false);
            C1894k c1894k3 = this.f73329d;
            this.f73334i = c1894k3.f7781h;
            this.f73335j = c1894k3.m10338f();
            this.f73337l = atd.m100037K(this.f73329d.f7778e, c15829d.f71206m);
            int i12 = this.f73329d.f7778e;
            this.f73338m = i12 == 0 || (i12 & 1) != 0;
            int i13 = 0;
            while (true) {
                if (i13 >= c15829d.f71205l.size()) {
                    i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    break;
                }
                String str = this.f73329d.f7785l;
                if (str != null && str.equals(c15829d.f71205l.get(i13))) {
                    break;
                } else {
                    i13++;
                }
            }
            this.f73336k = i13;
            this.f73341p = InterfaceC2090y.m12263r(i3) == 128;
            this.f73342q = InterfaceC2090y.m12260h(i3) == 64;
            this.f73343r = atd.m100038L(this.f73329d.f7785l);
            this.f73340o = m100173n(i3, i11);
        }

        /* JADX INFO: renamed from: h */
        public static int m100169h(C15834i c15834i, C15834i c15834i2) {
            do5 do5VarMo117171h = do5.m117166k().mo117171h(c15834i.f73333h, c15834i2.f73333h).mo117167d(c15834i.f73337l, c15834i2.f73337l).mo117171h(c15834i.f73338m, c15834i2.f73338m).mo117171h(c15834i.f73330e, c15834i2.f73330e).mo117171h(c15834i.f73332g, c15834i2.f73332g).mo117170g(Integer.valueOf(c15834i.f73336k), Integer.valueOf(c15834i2.f73336k), Ordering.natural().reverse()).mo117171h(c15834i.f73341p, c15834i2.f73341p).mo117171h(c15834i.f73342q, c15834i2.f73342q);
            if (c15834i.f73341p && c15834i.f73342q) {
                do5VarMo117171h = do5VarMo117171h.mo117167d(c15834i.f73343r, c15834i2.f73343r);
            }
            return do5VarMo117171h.mo117173j();
        }

        /* JADX INFO: renamed from: i */
        public static int m100170i(C15834i c15834i, C15834i c15834i2) {
            Ordering orderingReverse = (c15834i.f73330e && c15834i.f73333h) ? atd.f73221k : atd.f73221k.reverse();
            return do5.m117166k().mo117170g(Integer.valueOf(c15834i.f73334i), Integer.valueOf(c15834i2.f73334i), c15834i.f73331f.f71216w ? atd.f73221k.reverse() : atd.f73222l).mo117170g(Integer.valueOf(c15834i.f73335j), Integer.valueOf(c15834i2.f73335j), orderingReverse).mo117170g(Integer.valueOf(c15834i.f73334i), Integer.valueOf(c15834i2.f73334i), orderingReverse).mo117173j();
        }

        /* JADX INFO: renamed from: j */
        public static int m100171j(List<C15834i> list, List<C15834i> list2) {
            return do5.m117166k().mo117170g((C15834i) Collections.max(list, new Comparator() { // from class: l.ktd
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return atd.C15834i.m100169h((atd.C15834i) obj, (atd.C15834i) obj2);
                }
            }), (C15834i) Collections.max(list2, new Comparator() { // from class: l.ktd
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return atd.C15834i.m100169h((atd.C15834i) obj, (atd.C15834i) obj2);
                }
            }), new Comparator() { // from class: l.ktd
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return atd.C15834i.m100169h((atd.C15834i) obj, (atd.C15834i) obj2);
                }
            }).mo117167d(list.size(), list2.size()).mo117170g((C15834i) Collections.max(list, new Comparator() { // from class: l.ltd
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return atd.C15834i.m100170i((atd.C15834i) obj, (atd.C15834i) obj2);
                }
            }), (C15834i) Collections.max(list2, new Comparator() { // from class: l.ltd
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return atd.C15834i.m100170i((atd.C15834i) obj, (atd.C15834i) obj2);
                }
            }), new Comparator() { // from class: l.ltd
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return atd.C15834i.m100170i((atd.C15834i) obj, (atd.C15834i) obj2);
                }
            }).mo117173j();
        }

        /* JADX INFO: renamed from: m */
        public static ImmutableList<C15834i> m100172m(int i, dfj0 dfj0Var, C15829d c15829d, int[] iArr, int i2) {
            int iM100035H = atd.m100035H(dfj0Var, c15829d.f71202i, c15829d.f71203j, c15829d.f71204k);
            ImmutableList.C2804a c2804aBuilder = ImmutableList.builder();
            for (int i3 = 0; i3 < dfj0Var.f88159a; i3++) {
                int iM10338f = dfj0Var.m115519c(i3).m10338f();
                c2804aBuilder.mo15737a(new C15834i(i, dfj0Var, i3, c15829d, iArr[i3], i2, iM100035H == Integer.MAX_VALUE || (iM10338f != -1 && iM10338f <= iM100035H)));
            }
            return c2804aBuilder.m15756m();
        }

        @Override // p153l.atd.AbstractC15833h
        /* JADX INFO: renamed from: a */
        public int mo100073a() {
            return this.f73340o;
        }

        /* JADX INFO: renamed from: n */
        public final int m100173n(int i, int i2) {
            if ((this.f73329d.f7778e & 16384) != 0 || !atd.m100040O(i, this.f73331f.f73281P0)) {
                return 0;
            }
            if (!this.f73330e && !this.f73331f.f73271F0) {
                return 0;
            }
            if (!atd.m100040O(i, false) || !this.f73332g || !this.f73330e || this.f73329d.f7781h == -1) {
                return 1;
            }
            C15829d c15829d = this.f73331f;
            return (c15829d.f71217x || c15829d.f71216w || (i & i2) == 0) ? 1 : 2;
        }

        @Override // p153l.atd.AbstractC15833h
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean mo100074b(C15834i c15834i) {
            if (!this.f73339n && !bmk0.m105123c(this.f73329d.f7785l, c15834i.f73329d.f7785l)) {
                return false;
            }
            if (this.f73331f.f73274I0) {
                return true;
            }
            return this.f73341p == c15834i.f73341p && this.f73342q == c15834i.f73342q;
        }
    }

    public atd(agj0 agj0Var, u9f.InterfaceC20528b interfaceC20528b, @Nullable Context context) {
        this.f73223d = new Object();
        this.f73224e = context != null ? context.getApplicationContext() : null;
        this.f73225f = interfaceC20528b;
        if (agj0Var instanceof C15829d) {
            this.f73227h = (C15829d) agj0Var;
        } else {
            this.f73227h = (context == null ? C15829d.f73250V0 : C15829d.m100085J(context)).mo97663A().m100135h0(agj0Var).mo97691A();
        }
        this.f73229j = C1841a.f7179g;
        boolean z = context != null && bmk0.m105076F0(context);
        this.f73226g = z;
        if (!z && context != null && bmk0.f77313a >= 32) {
            this.f73228i = C15831f.m100155g(context);
        }
        if (this.f73227h.f73280O0 && context == null) {
            kyv.m152151i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m100031D(nxw.C18992a c18992a, C15829d c15829d, u9f.C20527a[] c20527aArr) {
        int iM165292d = c18992a.m165292d();
        for (int i = 0; i < iM165292d; i++) {
            ffj0 ffj0VarM165294f = c18992a.m165294f(i);
            if (c15829d.m100109N(i, ffj0VarM165294f)) {
                C15830e c15830eM100108M = c15829d.m100108M(i, ffj0VarM165294f);
                c20527aArr[i] = (c15830eM100108M == null || c15830eM100108M.f73308b.length == 0) ? null : new u9f.C20527a(ffj0VarM165294f.m125387b(c15830eM100108M.f73307a), c15830eM100108M.f73308b, c15830eM100108M.f73310d);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m100032E(nxw.C18992a c18992a, agj0 agj0Var, u9f.C20527a[] c20527aArr) {
        int iM165292d = c18992a.m165292d();
        HashMap map = new HashMap();
        for (int i = 0; i < iM165292d; i++) {
            m100033F(c18992a.m165294f(i), agj0Var, map);
        }
        m100033F(c18992a.m165296h(), agj0Var, map);
        for (int i2 = 0; i2 < iM165292d; i2++) {
            yfj0 yfj0Var = (yfj0) map.get(Integer.valueOf(c18992a.m165293e(i2)));
            if (yfj0Var != null) {
                c20527aArr[i2] = (yfj0Var.f199534b.isEmpty() || c18992a.m165294f(i2).m125388c(yfj0Var.f199533a) == -1) ? null : new u9f.C20527a(yfj0Var.f199533a, Ints.m16524n(yfj0Var.f199534b));
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m100033F(ffj0 ffj0Var, agj0 agj0Var, Map<Integer, yfj0> map) {
        yfj0 yfj0Var;
        for (int i = 0; i < ffj0Var.f98785a; i++) {
            yfj0 yfj0Var2 = agj0Var.f71218y.get(ffj0Var.m125387b(i));
            if (yfj0Var2 != null && ((yfj0Var = map.get(Integer.valueOf(yfj0Var2.m215616b()))) == null || (yfj0Var.f199534b.isEmpty() && !yfj0Var2.f199534b.isEmpty()))) {
                map.put(Integer.valueOf(yfj0Var2.m215616b()), yfj0Var2);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public static int m100034G(C1894k c1894k, @Nullable String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(c1894k.f7776c)) {
            return 4;
        }
        String strM100042S = m100042S(str);
        String strM100042S2 = m100042S(c1894k.f7776c);
        if (strM100042S2 == null || strM100042S == null) {
            return (z && strM100042S2 == null) ? 1 : 0;
        }
        if (strM100042S2.startsWith(strM100042S) || strM100042S.startsWith(strM100042S2)) {
            return 3;
        }
        return bmk0.m105122b1(strM100042S2, "-")[0].equals(bmk0.m105122b1(strM100042S, "-")[0]) ? 2 : 0;
    }

    /* JADX INFO: renamed from: H */
    public static int m100035H(dfj0 dfj0Var, int i, int i2, boolean z) {
        int i3;
        int i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
            for (int i5 = 0; i5 < dfj0Var.f88159a; i5++) {
                C1894k c1894kM115519c = dfj0Var.m115519c(i5);
                int i6 = c1894kM115519c.f7790q;
                if (i6 > 0 && (i3 = c1894kM115519c.f7791r) > 0) {
                    Point pointM100036I = m100036I(z, i, i2, i6, i3);
                    int i7 = c1894kM115519c.f7790q;
                    int i8 = c1894kM115519c.f7791r;
                    int i9 = i7 * i8;
                    if (i7 >= ((int) (pointM100036I.x * 0.98f)) && i8 >= ((int) (pointM100036I.y * 0.98f)) && i9 < i4) {
                        i4 = i9;
                    }
                }
            }
        }
        return i4;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x000f  */
    /* JADX INFO: renamed from: I */
    public static Point m100036I(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            if ((i3 > i4) == (i > i2)) {
                i2 = i;
                i = i2;
            }
        } else {
            i2 = i;
            i = i2;
        }
        int i5 = i3 * i;
        int i6 = i4 * i2;
        return i5 >= i6 ? new Point(i2, bmk0.m105150l(i6, i3)) : new Point(bmk0.m105150l(i5, i4), i);
    }

    /* JADX INFO: renamed from: K */
    public static int m100037K(int i, int i2) {
        return (i == 0 || i != i2) ? Integer.bitCount(i & i2) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: L */
    public static int m100038L(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "video/dolby-vision":
                return 5;
            case "video/av01":
                return 4;
            case "video/hevc":
                return 3;
            case "video/avc":
                return 1;
            case "video/x-vnd.on2.vp9":
                return 2;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: N */
    public static boolean m100039N(C1894k c1894k) {
        String str = c1894k.f7785l;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/ac3":
            case "audio/ac4":
            case "audio/eac3":
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: O */
    public static boolean m100040O(int i, boolean z) {
        int iM12262p = InterfaceC2090y.m12262p(i);
        if (iM12262p != 4) {
            return z && iM12262p == 3;
        }
        return true;
    }

    /* JADX INFO: renamed from: P */
    public static void m100041P(nxw.C18992a c18992a, int[][][] iArr, jzc0[] jzc0VarArr, u9f[] u9fVarArr) {
        boolean z;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= c18992a.m165292d()) {
                z = true;
                break;
            }
            int iM165293e = c18992a.m165293e(i3);
            u9f u9fVar = u9fVarArr[i3];
            if ((iM165293e == 1 || iM165293e == 2) && u9fVar != null && m100043T(iArr[i3], c18992a.m165294f(i3), u9fVar)) {
                if (iM165293e == 1) {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i3;
                } else {
                    if (i != -1) {
                        z = false;
                        break;
                    }
                    i = i3;
                }
            }
            i3++;
        }
        if (i2 != -1 && i != -1) {
            z2 = true;
        }
        if (z && z2) {
            jzc0 jzc0Var = new jzc0(true);
            jzc0VarArr[i2] = jzc0Var;
            jzc0VarArr[i] = jzc0Var;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: S */
    public static String m100042S(@Nullable String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: T */
    public static boolean m100043T(int[][] iArr, ffj0 ffj0Var, u9f u9fVar) {
        if (u9fVar == null) {
            return false;
        }
        int iM125388c = ffj0Var.m125388c(u9fVar.mo11361h());
        for (int i = 0; i < u9fVar.length(); i++) {
            if (InterfaceC2090y.m12265u(iArr[iM125388c][u9fVar.mo11356c(i)]) != 32) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ int m100046t(Integer num, Integer num2) {
        return 0;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ int m100047u(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ List m100049w(final atd atdVar, C15829d c15829d, boolean z, int i, dfj0 dfj0Var, int[] iArr) {
        atdVar.getClass();
        return C15827b.m100072h(i, dfj0Var, c15829d, iArr, z, new tp80() { // from class: l.zsd
            @Override // p153l.tp80
            public final boolean apply(Object obj) {
                return this.f205872a.m100054M((C1894k) obj);
            }
        });
    }

    @Override // p153l.cgj0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public C15829d mo100064c() {
        C15829d c15829d;
        synchronized (this.f73223d) {
            c15829d = this.f73227h;
        }
        return c15829d;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m100054M(C1894k c1894k) {
        boolean z;
        C15831f c15831f;
        C15831f c15831f2;
        synchronized (this.f73223d) {
            try {
                if (this.f73227h.f73280O0 && !this.f73226g && c1894k.f7798y > 2 && (!m100039N(c1894k) || (bmk0.f77313a >= 32 && (c15831f2 = this.f73228i) != null && c15831f2.m100160e()))) {
                    z = bmk0.f77313a >= 32 && (c15831f = this.f73228i) != null && c15831f.m100160e() && this.f73228i.m100158c() && this.f73228i.m100159d() && this.f73228i.m100156a(this.f73229j, c1894k);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: Q */
    public final void m100055Q() {
        boolean z;
        C15831f c15831f;
        synchronized (this.f73223d) {
            try {
                z = this.f73227h.f73280O0 && !this.f73226g && bmk0.f77313a >= 32 && (c15831f = this.f73228i) != null && c15831f.m100160e();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m109693f();
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m100056R(InterfaceC2089x interfaceC2089x) {
        boolean z;
        synchronized (this.f73223d) {
            z = this.f73227h.f73284S0;
        }
        if (z) {
            m109694g(interfaceC2089x);
        }
    }

    /* JADX INFO: renamed from: U */
    public u9f.C20527a[] m100057U(nxw.C18992a c18992a, int[][][] iArr, int[] iArr2, C15829d c15829d) throws ExoPlaybackException {
        String str;
        int iM165292d = c18992a.m165292d();
        u9f.C20527a[] c20527aArr = new u9f.C20527a[iM165292d];
        Pair<u9f.C20527a, Integer> pairM100062Z = m100062Z(c18992a, iArr, iArr2, c15829d);
        if (pairM100062Z != null) {
            c20527aArr[((Integer) pairM100062Z.second).intValue()] = (u9f.C20527a) pairM100062Z.first;
        }
        Pair<u9f.C20527a, Integer> pairM100058V = m100058V(c18992a, iArr, iArr2, c15829d);
        if (pairM100058V != null) {
            c20527aArr[((Integer) pairM100058V.second).intValue()] = (u9f.C20527a) pairM100058V.first;
        }
        if (pairM100058V == null) {
            str = null;
        } else {
            Object obj = pairM100058V.first;
            str = ((u9f.C20527a) obj).f178112a.m115519c(((u9f.C20527a) obj).f178113b[0]).f7776c;
        }
        Pair<u9f.C20527a, Integer> pairM100060X = m100060X(c18992a, iArr, c15829d, str);
        if (pairM100060X != null) {
            c20527aArr[((Integer) pairM100060X.second).intValue()] = (u9f.C20527a) pairM100060X.first;
        }
        for (int i = 0; i < iM165292d; i++) {
            int iM165293e = c18992a.m165293e(i);
            if (iM165293e != 2 && iM165293e != 1 && iM165293e != 3) {
                c20527aArr[i] = m100059W(iM165293e, c18992a.m165294f(i), iArr[i], c15829d);
            }
        }
        return c20527aArr;
    }

    @Nullable
    /* JADX INFO: renamed from: V */
    public Pair<u9f.C20527a, Integer> m100058V(nxw.C18992a c18992a, int[][][] iArr, int[] iArr2, final C15829d c15829d) throws ExoPlaybackException {
        final boolean z = false;
        for (int i = 0; i < c18992a.m165292d(); i++) {
            if (2 == c18992a.m165293e(i) && c18992a.m165294f(i).f98785a > 0) {
                z = true;
                break;
            }
        }
        return m100061Y(1, c18992a, iArr, new AbstractC15833h.a() { // from class: l.vsd
            @Override // p153l.atd.AbstractC15833h.a
            /* JADX INFO: renamed from: a */
            public final List mo100166a(int i2, dfj0 dfj0Var, int[] iArr3) {
                return atd.m100049w(this.f185596a, c15829d, z, i2, dfj0Var, iArr3);
            }
        }, new Comparator() { // from class: l.wsd
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return atd.C15827b.m100071f((List) obj, (List) obj2);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: W */
    public u9f.C20527a m100059W(int i, ffj0 ffj0Var, int[][] iArr, C15829d c15829d) throws ExoPlaybackException {
        dfj0 dfj0Var = null;
        C15828c c15828c = null;
        int i2 = 0;
        for (int i3 = 0; i3 < ffj0Var.f98785a; i3++) {
            dfj0 dfj0VarM125387b = ffj0Var.m125387b(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < dfj0VarM125387b.f88159a; i4++) {
                if (m100040O(iArr2[i4], c15829d.f73281P0)) {
                    C15828c c15828c2 = new C15828c(dfj0VarM125387b.m115519c(i4), iArr2[i4]);
                    if (c15828c == null || c15828c2.compareTo(c15828c) > 0) {
                        dfj0Var = dfj0VarM125387b;
                        i2 = i4;
                        c15828c = c15828c2;
                    }
                }
            }
        }
        if (dfj0Var == null) {
            return null;
        }
        return new u9f.C20527a(dfj0Var, i2);
    }

    @Nullable
    /* JADX INFO: renamed from: X */
    public Pair<u9f.C20527a, Integer> m100060X(nxw.C18992a c18992a, int[][][] iArr, final C15829d c15829d, @Nullable final String str) throws ExoPlaybackException {
        return m100061Y(3, c18992a, iArr, new AbstractC15833h.a() { // from class: l.xsd
            @Override // p153l.atd.AbstractC15833h.a
            /* JADX INFO: renamed from: a */
            public final List mo100166a(int i, dfj0 dfj0Var, int[] iArr2) {
                return atd.C15832g.m100163h(i, dfj0Var, c15829d, iArr2, str);
            }
        }, new Comparator() { // from class: l.ysd
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return atd.C15832g.m100162f((List) obj, (List) obj2);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: Y */
    public final <T extends AbstractC15833h<T>> Pair<u9f.C20527a, Integer> m100061Y(int i, nxw.C18992a c18992a, int[][][] iArr, AbstractC15833h.a<T> aVar, Comparator<List<T>> comparator) {
        int i2;
        RandomAccess randomAccessM15740of;
        nxw.C18992a c18992a2 = c18992a;
        ArrayList arrayList = new ArrayList();
        int iM165292d = c18992a2.m165292d();
        int i3 = 0;
        while (i3 < iM165292d) {
            if (i == c18992a2.m165293e(i3)) {
                ffj0 ffj0VarM165294f = c18992a2.m165294f(i3);
                for (int i4 = 0; i4 < ffj0VarM165294f.f98785a; i4++) {
                    dfj0 dfj0VarM125387b = ffj0VarM165294f.m125387b(i4);
                    List<T> listMo100166a = aVar.mo100166a(i3, dfj0VarM125387b, iArr[i3][i4]);
                    boolean[] zArr = new boolean[dfj0VarM125387b.f88159a];
                    int i5 = 0;
                    while (i5 < dfj0VarM125387b.f88159a) {
                        T t = listMo100166a.get(i5);
                        int iMo100073a = t.mo100073a();
                        if (zArr[i5] || iMo100073a == 0) {
                            i2 = iM165292d;
                        } else {
                            if (iMo100073a == 1) {
                                randomAccessM15740of = ImmutableList.m15740of(t);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t);
                                int i6 = i5 + 1;
                                while (i6 < dfj0VarM125387b.f88159a) {
                                    T t2 = listMo100166a.get(i6);
                                    int i7 = iM165292d;
                                    if (t2.mo100073a() == 2 && t.mo100074b(t2)) {
                                        arrayList2.add(t2);
                                        zArr[i6] = true;
                                    }
                                    i6++;
                                    iM165292d = i7;
                                }
                                randomAccessM15740of = arrayList2;
                            }
                            i2 = iM165292d;
                            arrayList.add(randomAccessM15740of);
                        }
                        i5++;
                        iM165292d = i2;
                    }
                }
            }
            i3++;
            c18992a2 = c18992a;
            iM165292d = iM165292d;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((AbstractC15833h) list.get(i8)).f73328c;
        }
        AbstractC15833h abstractC15833h = (AbstractC15833h) list.get(0);
        return Pair.create(new u9f.C20527a(abstractC15833h.f73327b, iArr2), Integer.valueOf(abstractC15833h.f73326a));
    }

    @Nullable
    /* JADX INFO: renamed from: Z */
    public Pair<u9f.C20527a, Integer> m100062Z(nxw.C18992a c18992a, int[][][] iArr, final int[] iArr2, final C15829d c15829d) throws ExoPlaybackException {
        return m100061Y(2, c18992a, iArr, new AbstractC15833h.a() { // from class: l.tsd
            @Override // p153l.atd.AbstractC15833h.a
            /* JADX INFO: renamed from: a */
            public final List mo100166a(int i, dfj0 dfj0Var, int[] iArr3) {
                return atd.C15834i.m100172m(i, dfj0Var, c15829d, iArr3, iArr2[i]);
            }
        }, new Comparator() { // from class: l.usd
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return atd.C15834i.m100171j((List) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public final void m100063a0(C15829d c15829d) {
        boolean zEquals;
        w11.m204369e(c15829d);
        synchronized (this.f73223d) {
            zEquals = this.f73227h.equals(c15829d);
            this.f73227h = c15829d;
        }
        if (zEquals) {
            return;
        }
        if (c15829d.f73280O0 && this.f73224e == null) {
            kyv.m152151i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        m109693f();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2090y.a
    /* JADX INFO: renamed from: b */
    public void mo12267b(InterfaceC2089x interfaceC2089x) {
        m100056R(interfaceC2089x);
    }

    @Override // p153l.cgj0
    /* JADX INFO: renamed from: h */
    public boolean mo100066h() {
        return true;
    }

    @Override // p153l.cgj0
    /* JADX INFO: renamed from: j */
    public void mo100067j() {
        C15831f c15831f;
        synchronized (this.f73223d) {
            try {
                if (bmk0.f77313a >= 32 && (c15831f = this.f73228i) != null) {
                    c15831f.m100161f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.mo100067j();
    }

    @Override // p153l.cgj0
    /* JADX INFO: renamed from: l */
    public void mo100068l(C1841a c1841a) {
        boolean zEquals;
        synchronized (this.f73223d) {
            zEquals = this.f73229j.equals(c1841a);
            this.f73229j = c1841a;
        }
        if (zEquals) {
            return;
        }
        m100055Q();
    }

    @Override // p153l.cgj0
    /* JADX INFO: renamed from: m */
    public void mo100069m(agj0 agj0Var) {
        if (agj0Var instanceof C15829d) {
            m100063a0((C15829d) agj0Var);
        }
        m100063a0(new C15829d.a().m100135h0(agj0Var).mo97691A());
    }

    @Override // p153l.nxw
    /* JADX INFO: renamed from: q */
    public final Pair<jzc0[], u9f[]> mo100070q(nxw.C18992a c18992a, int[][][] iArr, int[] iArr2, InterfaceC1988i.b bVar, AbstractC1857c0 abstractC1857c0) throws ExoPlaybackException {
        C15829d c15829d;
        C15831f c15831f;
        synchronized (this.f73223d) {
            try {
                c15829d = this.f73227h;
                if (c15829d.f73280O0 && bmk0.f77313a >= 32 && (c15831f = this.f73228i) != null) {
                    c15831f.m100157b(this, (Looper) w11.m204373i(Looper.myLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int iM165292d = c18992a.m165292d();
        u9f.C20527a[] c20527aArrM100057U = m100057U(c18992a, iArr, iArr2, c15829d);
        m100032E(c18992a, c15829d, c20527aArrM100057U);
        m100031D(c18992a, c15829d, c20527aArrM100057U);
        for (int i = 0; i < iM165292d; i++) {
            int iM165293e = c18992a.m165293e(i);
            if (c15829d.m100107L(i) || c15829d.f71219z.contains(Integer.valueOf(iM165293e))) {
                c20527aArrM100057U[i] = null;
            }
        }
        u9f[] u9fVarArrMo148661a = this.f73225f.mo148661a(c20527aArrM100057U, m109691a(), bVar, abstractC1857c0);
        jzc0[] jzc0VarArr = new jzc0[iM165292d];
        for (int i2 = 0; i2 < iM165292d; i2++) {
            jzc0VarArr[i2] = (c15829d.m100107L(i2) || c15829d.f71219z.contains(Integer.valueOf(c18992a.m165293e(i2))) || (c18992a.m165293e(i2) != -2 && u9fVarArrMo148661a[i2] == null)) ? null : jzc0.f123254b;
        }
        if (c15829d.f73282Q0) {
            m100041P(c18992a, iArr, jzc0VarArr, u9fVarArrMo148661a);
        }
        return Pair.create(jzc0VarArr, u9fVarArrMo148661a);
    }

    @Override // p153l.cgj0
    @Nullable
    /* JADX INFO: renamed from: d */
    public InterfaceC2090y.a mo100065d() {
        return this;
    }

    public atd(Context context, u9f.InterfaceC20528b interfaceC20528b) {
        this(context, C15829d.m100085J(context), interfaceC20528b);
    }

    public atd(Context context, agj0 agj0Var, u9f.InterfaceC20528b interfaceC20528b) {
        this(agj0Var, interfaceC20528b, context);
    }

    public atd(Context context) {
        this(context, new k80.C18117b());
    }

    /* JADX INFO: renamed from: l.atd$d */
    public static final class C15829d extends agj0 implements InterfaceC1886e {

        /* JADX INFO: renamed from: V0 */
        public static final C15829d f73250V0;

        /* JADX INFO: renamed from: W0 */
        @Deprecated
        public static final C15829d f73251W0;

        /* JADX INFO: renamed from: X0 */
        public static final String f73252X0;

        /* JADX INFO: renamed from: Y0 */
        public static final String f73253Y0;

        /* JADX INFO: renamed from: Z0 */
        public static final String f73254Z0;

        /* JADX INFO: renamed from: a1 */
        public static final String f73255a1;

        /* JADX INFO: renamed from: b1 */
        public static final String f73256b1;

        /* JADX INFO: renamed from: c1 */
        public static final String f73257c1;

        /* JADX INFO: renamed from: d1 */
        public static final String f73258d1;

        /* JADX INFO: renamed from: e1 */
        public static final String f73259e1;

        /* JADX INFO: renamed from: f1 */
        public static final String f73260f1;

        /* JADX INFO: renamed from: g1 */
        public static final String f73261g1;

        /* JADX INFO: renamed from: h1 */
        public static final String f73262h1;

        /* JADX INFO: renamed from: i1 */
        public static final String f73263i1;

        /* JADX INFO: renamed from: j1 */
        public static final String f73264j1;

        /* JADX INFO: renamed from: k1 */
        public static final String f73265k1;

        /* JADX INFO: renamed from: l1 */
        public static final String f73266l1;

        /* JADX INFO: renamed from: m1 */
        public static final String f73267m1;

        /* JADX INFO: renamed from: n1 */
        public static final String f73268n1;

        /* JADX INFO: renamed from: o1 */
        public static final String f73269o1;

        /* JADX INFO: renamed from: p1 */
        public static final InterfaceC1886e.a<C15829d> f73270p1;

        /* JADX INFO: renamed from: F0 */
        public final boolean f73271F0;

        /* JADX INFO: renamed from: G0 */
        public final boolean f73272G0;

        /* JADX INFO: renamed from: H0 */
        public final boolean f73273H0;

        /* JADX INFO: renamed from: I0 */
        public final boolean f73274I0;

        /* JADX INFO: renamed from: J0 */
        public final boolean f73275J0;

        /* JADX INFO: renamed from: K0 */
        public final boolean f73276K0;

        /* JADX INFO: renamed from: L0 */
        public final boolean f73277L0;

        /* JADX INFO: renamed from: M0 */
        public final boolean f73278M0;

        /* JADX INFO: renamed from: N0 */
        public final boolean f73279N0;

        /* JADX INFO: renamed from: O0 */
        public final boolean f73280O0;

        /* JADX INFO: renamed from: P0 */
        public final boolean f73281P0;

        /* JADX INFO: renamed from: Q0 */
        public final boolean f73282Q0;

        /* JADX INFO: renamed from: R0 */
        public final boolean f73283R0;

        /* JADX INFO: renamed from: S0 */
        public final boolean f73284S0;

        /* JADX INFO: renamed from: T0 */
        public final SparseArray<Map<ffj0, C15830e>> f73285T0;

        /* JADX INFO: renamed from: U0 */
        public final SparseBooleanArray f73286U0;

        static {
            C15829d c15829dMo97691A = new a().mo97691A();
            f73250V0 = c15829dMo97691A;
            f73251W0 = c15829dMo97691A;
            f73252X0 = bmk0.m105181z0(1000);
            f73253Y0 = bmk0.m105181z0(1001);
            f73254Z0 = bmk0.m105181z0(1002);
            f73255a1 = bmk0.m105181z0(1003);
            f73256b1 = bmk0.m105181z0(1004);
            f73257c1 = bmk0.m105181z0(1005);
            f73258d1 = bmk0.m105181z0(1006);
            f73259e1 = bmk0.m105181z0(1007);
            f73260f1 = bmk0.m105181z0(1008);
            f73261g1 = bmk0.m105181z0(1009);
            f73262h1 = bmk0.m105181z0(1010);
            f73263i1 = bmk0.m105181z0(1011);
            f73264j1 = bmk0.m105181z0(1012);
            f73265k1 = bmk0.m105181z0(1013);
            f73266l1 = bmk0.m105181z0(1014);
            f73267m1 = bmk0.m105181z0(1015);
            f73268n1 = bmk0.m105181z0(1016);
            f73269o1 = bmk0.m105181z0(1017);
            f73270p1 = new InterfaceC1886e.a() { // from class: l.btd
                @Override // com.google.android.exoplayer2.InterfaceC1886e.a
                /* JADX INFO: renamed from: a */
                public final InterfaceC1886e mo10034a(Bundle bundle) {
                    return new atd.C15829d.a(bundle).mo97691A();
                }
            };
        }

        public C15829d(a aVar) {
            super(aVar);
            this.f73271F0 = aVar.f73287A;
            this.f73272G0 = aVar.f73288B;
            this.f73273H0 = aVar.f73289C;
            this.f73274I0 = aVar.f73290D;
            this.f73275J0 = aVar.f73291E;
            this.f73276K0 = aVar.f73292F;
            this.f73277L0 = aVar.f73293G;
            this.f73278M0 = aVar.f73294H;
            this.f73279N0 = aVar.f73295I;
            this.f73280O0 = aVar.f73296J;
            this.f73281P0 = aVar.f73297K;
            this.f73282Q0 = aVar.f73298L;
            this.f73283R0 = aVar.f73299M;
            this.f73284S0 = aVar.f73300N;
            this.f73285T0 = aVar.f73301O;
            this.f73286U0 = aVar.f73302P;
        }

        /* JADX INFO: renamed from: F */
        public static boolean m100082F(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: G */
        public static boolean m100083G(SparseArray<Map<ffj0, C15830e>> sparseArray, SparseArray<Map<ffj0, C15830e>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (iIndexOfKey < 0 || !m100084H(sparseArray.valueAt(i), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: H */
        public static boolean m100084H(Map<ffj0, C15830e> map, Map<ffj0, C15830e> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<ffj0, C15830e> entry : map.entrySet()) {
                ffj0 key = entry.getKey();
                if (!map2.containsKey(key) || !bmk0.m105123c(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: J */
        public static C15829d m100085J(Context context) {
            return new a(context).mo97691A();
        }

        /* JADX INFO: renamed from: K */
        public static int[] m100086K(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i = 0; i < sparseBooleanArray.size(); i++) {
                iArr[i] = sparseBooleanArray.keyAt(i);
            }
            return iArr;
        }

        /* JADX INFO: renamed from: O */
        public static void m100087O(Bundle bundle, SparseArray<Map<ffj0, C15830e>> sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i = 0; i < sparseArray.size(); i++) {
                int iKeyAt = sparseArray.keyAt(i);
                for (Map.Entry<ffj0, C15830e> entry : sparseArray.valueAt(i).entrySet()) {
                    C15830e value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(iKeyAt));
                }
                bundle.putIntArray(f73262h1, Ints.m16524n(arrayList));
                bundle.putParcelableArrayList(f73263i1, cj3.m110059i(arrayList2));
                bundle.putSparseParcelableArray(f73264j1, cj3.m110060j(sparseArray2));
            }
        }

        @Override // p153l.agj0
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public a mo97663A() {
            return new a();
        }

        /* JADX INFO: renamed from: L */
        public boolean m100107L(int i) {
            return this.f73286U0.get(i);
        }

        @Nullable
        @Deprecated
        /* JADX INFO: renamed from: M */
        public C15830e m100108M(int i, ffj0 ffj0Var) {
            Map<ffj0, C15830e> map = this.f73285T0.get(i);
            if (map != null) {
                return map.get(ffj0Var);
            }
            return null;
        }

        @Deprecated
        /* JADX INFO: renamed from: N */
        public boolean m100109N(int i, ffj0 ffj0Var) {
            Map<ffj0, C15830e> map = this.f73285T0.get(i);
            return map != null && map.containsKey(ffj0Var);
        }

        @Override // p153l.agj0
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C15829d.class == obj.getClass()) {
                C15829d c15829d = (C15829d) obj;
                if (super.equals(c15829d) && this.f73271F0 == c15829d.f73271F0 && this.f73272G0 == c15829d.f73272G0 && this.f73273H0 == c15829d.f73273H0 && this.f73274I0 == c15829d.f73274I0 && this.f73275J0 == c15829d.f73275J0 && this.f73276K0 == c15829d.f73276K0 && this.f73277L0 == c15829d.f73277L0 && this.f73278M0 == c15829d.f73278M0 && this.f73279N0 == c15829d.f73279N0 && this.f73280O0 == c15829d.f73280O0 && this.f73281P0 == c15829d.f73281P0 && this.f73282Q0 == c15829d.f73282Q0 && this.f73283R0 == c15829d.f73283R0 && this.f73284S0 == c15829d.f73284S0 && m100082F(this.f73286U0, c15829d.f73286U0) && m100083G(this.f73285T0, c15829d.f73285T0)) {
                    return true;
                }
            }
            return false;
        }

        @Override // p153l.agj0
        public int hashCode() {
            return ((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f73271F0 ? 1 : 0)) * 31) + (this.f73272G0 ? 1 : 0)) * 31) + (this.f73273H0 ? 1 : 0)) * 31) + (this.f73274I0 ? 1 : 0)) * 31) + (this.f73275J0 ? 1 : 0)) * 31) + (this.f73276K0 ? 1 : 0)) * 31) + (this.f73277L0 ? 1 : 0)) * 31) + (this.f73278M0 ? 1 : 0)) * 31) + (this.f73279N0 ? 1 : 0)) * 31) + (this.f73280O0 ? 1 : 0)) * 31) + (this.f73281P0 ? 1 : 0)) * 31) + (this.f73282Q0 ? 1 : 0)) * 31) + (this.f73283R0 ? 1 : 0)) * 31) + (this.f73284S0 ? 1 : 0);
        }

        @Override // p153l.agj0, com.google.android.exoplayer2.InterfaceC1886e
        public Bundle toBundle() {
            Bundle bundle = super.toBundle();
            bundle.putBoolean(f73252X0, this.f73271F0);
            bundle.putBoolean(f73253Y0, this.f73272G0);
            bundle.putBoolean(f73254Z0, this.f73273H0);
            bundle.putBoolean(f73266l1, this.f73274I0);
            bundle.putBoolean(f73255a1, this.f73275J0);
            bundle.putBoolean(f73256b1, this.f73276K0);
            bundle.putBoolean(f73257c1, this.f73277L0);
            bundle.putBoolean(f73258d1, this.f73278M0);
            bundle.putBoolean(f73267m1, this.f73279N0);
            bundle.putBoolean(f73268n1, this.f73280O0);
            bundle.putBoolean(f73259e1, this.f73281P0);
            bundle.putBoolean(f73260f1, this.f73282Q0);
            bundle.putBoolean(f73261g1, this.f73283R0);
            bundle.putBoolean(f73269o1, this.f73284S0);
            m100087O(bundle, this.f73285T0);
            bundle.putIntArray(f73265k1, m100086K(this.f73286U0));
            return bundle;
        }

        /* JADX INFO: renamed from: l.atd$d$a */
        public static final class a extends agj0.C15706a {

            /* JADX INFO: renamed from: A */
            public boolean f73287A;

            /* JADX INFO: renamed from: B */
            public boolean f73288B;

            /* JADX INFO: renamed from: C */
            public boolean f73289C;

            /* JADX INFO: renamed from: D */
            public boolean f73290D;

            /* JADX INFO: renamed from: E */
            public boolean f73291E;

            /* JADX INFO: renamed from: F */
            public boolean f73292F;

            /* JADX INFO: renamed from: G */
            public boolean f73293G;

            /* JADX INFO: renamed from: H */
            public boolean f73294H;

            /* JADX INFO: renamed from: I */
            public boolean f73295I;

            /* JADX INFO: renamed from: J */
            public boolean f73296J;

            /* JADX INFO: renamed from: K */
            public boolean f73297K;

            /* JADX INFO: renamed from: L */
            public boolean f73298L;

            /* JADX INFO: renamed from: M */
            public boolean f73299M;

            /* JADX INFO: renamed from: N */
            public boolean f73300N;

            /* JADX INFO: renamed from: O */
            public final SparseArray<Map<ffj0, C15830e>> f73301O;

            /* JADX INFO: renamed from: P */
            public final SparseBooleanArray f73302P;

            public a(Bundle bundle) {
                super(bundle);
                m100133f0();
                C15829d c15829d = C15829d.f73250V0;
                m100148u0(bundle.getBoolean(C15829d.f73252X0, c15829d.f73271F0));
                m100143p0(bundle.getBoolean(C15829d.f73253Y0, c15829d.f73272G0));
                m100144q0(bundle.getBoolean(C15829d.f73254Z0, c15829d.f73273H0));
                m100142o0(bundle.getBoolean(C15829d.f73266l1, c15829d.f73274I0));
                m100146s0(bundle.getBoolean(C15829d.f73255a1, c15829d.f73275J0));
                m100138k0(bundle.getBoolean(C15829d.f73256b1, c15829d.f73276K0));
                m100139l0(bundle.getBoolean(C15829d.f73257c1, c15829d.f73277L0));
                m100136i0(bundle.getBoolean(C15829d.f73258d1, c15829d.f73278M0));
                m100137j0(bundle.getBoolean(C15829d.f73267m1, c15829d.f73279N0));
                m100145r0(bundle.getBoolean(C15829d.f73268n1, c15829d.f73280O0));
                m100147t0(bundle.getBoolean(C15829d.f73259e1, c15829d.f73281P0));
                m100128B0(bundle.getBoolean(C15829d.f73260f1, c15829d.f73282Q0));
                m100141n0(bundle.getBoolean(C15829d.f73261g1, c15829d.f73283R0));
                m100140m0(bundle.getBoolean(C15829d.f73269o1, c15829d.f73284S0));
                this.f73301O = new SparseArray<>();
                m100153z0(bundle);
                this.f73302P = m100134g0(bundle.getIntArray(C15829d.f73265k1));
            }

            /* JADX INFO: renamed from: e0 */
            public static SparseArray<Map<ffj0, C15830e>> m100126e0(SparseArray<Map<ffj0, C15830e>> sparseArray) {
                SparseArray<Map<ffj0, C15830e>> sparseArray2 = new SparseArray<>();
                for (int i = 0; i < sparseArray.size(); i++) {
                    sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
                }
                return sparseArray2;
            }

            @Override // p153l.agj0.C15706a
            /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
            public a mo97699J(int i, boolean z) {
                super.mo97699J(i, z);
                return this;
            }

            /* JADX INFO: renamed from: B0 */
            public a m100128B0(boolean z) {
                this.f73298L = z;
                return this;
            }

            @Override // p153l.agj0.C15706a
            /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
            public a mo97700K(int i, int i2, boolean z) {
                super.mo97700K(i, i2, z);
                return this;
            }

            @Override // p153l.agj0.C15706a
            /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
            public a mo97701L(Context context, boolean z) {
                super.mo97701L(context, z);
                return this;
            }

            @Override // p153l.agj0.C15706a
            /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
            public C15829d mo97691A() {
                return new C15829d(this);
            }

            @Override // p153l.agj0.C15706a
            /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
            public a mo97692B(int i) {
                super.mo97692B(i);
                return this;
            }

            /* JADX INFO: renamed from: f0 */
            public final void m100133f0() {
                this.f73287A = true;
                this.f73288B = false;
                this.f73289C = true;
                this.f73290D = false;
                this.f73291E = true;
                this.f73292F = false;
                this.f73293G = false;
                this.f73294H = false;
                this.f73295I = false;
                this.f73296J = true;
                this.f73297K = true;
                this.f73298L = false;
                this.f73299M = true;
                this.f73300N = false;
            }

            /* JADX INFO: renamed from: g0 */
            public final SparseBooleanArray m100134g0(@Nullable int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i : iArr) {
                    sparseBooleanArray.append(i, true);
                }
                return sparseBooleanArray;
            }

            /* JADX INFO: renamed from: h0 */
            public a m100135h0(agj0 agj0Var) {
                super.m97694E(agj0Var);
                return this;
            }

            /* JADX INFO: renamed from: i0 */
            public a m100136i0(boolean z) {
                this.f73294H = z;
                return this;
            }

            /* JADX INFO: renamed from: j0 */
            public a m100137j0(boolean z) {
                this.f73295I = z;
                return this;
            }

            /* JADX INFO: renamed from: k0 */
            public a m100138k0(boolean z) {
                this.f73292F = z;
                return this;
            }

            /* JADX INFO: renamed from: l0 */
            public a m100139l0(boolean z) {
                this.f73293G = z;
                return this;
            }

            /* JADX INFO: renamed from: m0 */
            public a m100140m0(boolean z) {
                this.f73300N = z;
                return this;
            }

            /* JADX INFO: renamed from: n0 */
            public a m100141n0(boolean z) {
                this.f73299M = z;
                return this;
            }

            /* JADX INFO: renamed from: o0 */
            public a m100142o0(boolean z) {
                this.f73290D = z;
                return this;
            }

            /* JADX INFO: renamed from: p0 */
            public a m100143p0(boolean z) {
                this.f73288B = z;
                return this;
            }

            /* JADX INFO: renamed from: q0 */
            public a m100144q0(boolean z) {
                this.f73289C = z;
                return this;
            }

            /* JADX INFO: renamed from: r0 */
            public a m100145r0(boolean z) {
                this.f73296J = z;
                return this;
            }

            /* JADX INFO: renamed from: s0 */
            public a m100146s0(boolean z) {
                this.f73291E = z;
                return this;
            }

            /* JADX INFO: renamed from: t0 */
            public a m100147t0(boolean z) {
                this.f73297K = z;
                return this;
            }

            /* JADX INFO: renamed from: u0 */
            public a m100148u0(boolean z) {
                this.f73287A = z;
                return this;
            }

            @Override // p153l.agj0.C15706a
            /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
            public a mo97695F(int i) {
                super.mo97695F(i);
                return this;
            }

            @Override // p153l.agj0.C15706a
            /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
            public a mo97696G(yfj0 yfj0Var) {
                super.mo97696G(yfj0Var);
                return this;
            }

            @Override // p153l.agj0.C15706a
            /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
            public a mo97697H(Context context) {
                super.mo97697H(context);
                return this;
            }

            @Deprecated
            /* JADX INFO: renamed from: y0 */
            public a m100152y0(int i, ffj0 ffj0Var, @Nullable C15830e c15830e) {
                Map<ffj0, C15830e> map = this.f73301O.get(i);
                if (map == null) {
                    map = new HashMap<>();
                    this.f73301O.put(i, map);
                }
                if (map.containsKey(ffj0Var) && bmk0.m105123c(map.get(ffj0Var), c15830e)) {
                    return this;
                }
                map.put(ffj0Var, c15830e);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: z0 */
            public final void m100153z0(Bundle bundle) {
                int[] intArray = bundle.getIntArray(C15829d.f73262h1);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(C15829d.f73263i1);
                ImmutableList immutableListM15739of = parcelableArrayList == null ? ImmutableList.m15739of() : cj3.m110054d(ffj0.f98784f, parcelableArrayList);
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(C15829d.f73264j1);
                SparseArray sparseArray = sparseParcelableArray == null ? new SparseArray() : cj3.m110055e(C15830e.f73306h, sparseParcelableArray);
                if (intArray == null || intArray.length != immutableListM15739of.size()) {
                    return;
                }
                for (int i = 0; i < intArray.length; i++) {
                    m100152y0(intArray[i], (ffj0) immutableListM15739of.get(i), (C15830e) sparseArray.get(i));
                }
            }

            @Deprecated
            public a() {
                this.f73301O = new SparseArray<>();
                this.f73302P = new SparseBooleanArray();
                m100133f0();
            }

            public a(Context context) {
                super(context);
                this.f73301O = new SparseArray<>();
                this.f73302P = new SparseBooleanArray();
                m100133f0();
            }

            public a(C15829d c15829d) {
                super(c15829d);
                this.f73287A = c15829d.f73271F0;
                this.f73288B = c15829d.f73272G0;
                this.f73289C = c15829d.f73273H0;
                this.f73290D = c15829d.f73274I0;
                this.f73291E = c15829d.f73275J0;
                this.f73292F = c15829d.f73276K0;
                this.f73293G = c15829d.f73277L0;
                this.f73294H = c15829d.f73278M0;
                this.f73295I = c15829d.f73279N0;
                this.f73296J = c15829d.f73280O0;
                this.f73297K = c15829d.f73281P0;
                this.f73298L = c15829d.f73282Q0;
                this.f73299M = c15829d.f73283R0;
                this.f73300N = c15829d.f73284S0;
                this.f73301O = m100126e0(c15829d.f73285T0);
                this.f73302P = c15829d.f73286U0.clone();
            }
        }
    }
}
