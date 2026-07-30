package p149l;

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
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.InterfaceC1863e;
import com.google.android.exoplayer2.InterfaceC2066x;
import com.google.android.exoplayer2.InterfaceC2067y;
import com.google.android.exoplayer2.audio.C1818a;
import com.google.android.exoplayer2.source.InterfaceC1965i;
import com.google.android.gms.common.api.Api;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import com.google.mlkit.p033nl.languageid.LanguageIdentifier;
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
public class lrd extends ouw implements InterfaceC2067y.a {

    /* JADX INFO: renamed from: k */
    public static final Ordering<Integer> f129563k = Ordering.from(new Comparator() { // from class: l.crd
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return lrd.m151228u((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: l */
    public static final Ordering<Integer> f129564l = Ordering.from(new Comparator() { // from class: l.drd
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return lrd.m151227t((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: d */
    public final Object f129565d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final Context f129566e;

    /* JADX INFO: renamed from: f */
    public final o8f.InterfaceC18874b f129567f;

    /* JADX INFO: renamed from: g */
    public final boolean f129568g;

    /* JADX INFO: renamed from: h */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public C18296d f129569h;

    /* JADX INFO: renamed from: i */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public C18298f f129570i;

    /* JADX INFO: renamed from: j */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public C1818a f129571j;

    /* JADX INFO: renamed from: l.lrd$b */
    public static final class C18294b extends AbstractC18300h<C18294b> implements Comparable<C18294b> {

        /* JADX INFO: renamed from: e */
        public final int f129572e;

        /* JADX INFO: renamed from: f */
        public final boolean f129573f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public final String f129574g;

        /* JADX INFO: renamed from: h */
        public final C18296d f129575h;

        /* JADX INFO: renamed from: i */
        public final boolean f129576i;

        /* JADX INFO: renamed from: j */
        public final int f129577j;

        /* JADX INFO: renamed from: k */
        public final int f129578k;

        /* JADX INFO: renamed from: l */
        public final int f129579l;

        /* JADX INFO: renamed from: m */
        public final boolean f129580m;

        /* JADX INFO: renamed from: n */
        public final int f129581n;

        /* JADX INFO: renamed from: o */
        public final int f129582o;

        /* JADX INFO: renamed from: p */
        public final boolean f129583p;

        /* JADX INFO: renamed from: q */
        public final int f129584q;

        /* JADX INFO: renamed from: r */
        public final int f129585r;

        /* JADX INFO: renamed from: s */
        public final int f129586s;

        /* JADX INFO: renamed from: t */
        public final int f129587t;

        /* JADX INFO: renamed from: u */
        public final boolean f129588u;

        /* JADX INFO: renamed from: v */
        public final boolean f129589v;

        public C18294b(int i, z5j0 z5j0Var, int i2, C18296d c18296d, int i3, boolean z, oh80<C1871k> oh80Var) {
            int i4;
            int iM151215G;
            int iM151215G2;
            super(i, z5j0Var, i2);
            this.f129575h = c18296d;
            this.f129574g = lrd.m151223S(this.f129671d.f7739c);
            this.f129576i = lrd.m151221O(i3, false);
            int i5 = 0;
            while (true) {
                int size = c18296d.f184892n.size();
                i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                if (i5 >= size) {
                    iM151215G = 0;
                    i5 = Integer.MAX_VALUE;
                    break;
                } else {
                    iM151215G = lrd.m151215G(this.f129671d, c18296d.f184892n.get(i5), false);
                    if (iM151215G > 0) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            this.f129578k = i5;
            this.f129577j = iM151215G;
            this.f129579l = lrd.m151218K(this.f129671d.f7741e, c18296d.f184893o);
            C1871k c1871k = this.f129671d;
            int i6 = c1871k.f7741e;
            this.f129580m = i6 == 0 || (i6 & 1) != 0;
            this.f129583p = (c1871k.f7740d & 1) != 0;
            int i7 = c1871k.f7761y;
            this.f129584q = i7;
            this.f129585r = c1871k.f7762z;
            int i8 = c1871k.f7744h;
            this.f129586s = i8;
            this.f129573f = (i8 == -1 || i8 <= c18296d.f184895q) && (i7 == -1 || i7 <= c18296d.f184894p) && oh80Var.apply(c1871k);
            String[] strArrM197873l0 = vck0.m197873l0();
            int i9 = 0;
            while (true) {
                if (i9 >= strArrM197873l0.length) {
                    iM151215G2 = 0;
                    i9 = Integer.MAX_VALUE;
                    break;
                } else {
                    iM151215G2 = lrd.m151215G(this.f129671d, strArrM197873l0[i9], false);
                    if (iM151215G2 > 0) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.f129581n = i9;
            this.f129582o = iM151215G2;
            for (int i10 = 0; i10 < c18296d.f184896r.size(); i10++) {
                String str = this.f129671d.f7748l;
                if (str != null && str.equals(c18296d.f184896r.get(i10))) {
                    i4 = i10;
                    break;
                }
            }
            this.f129587t = i4;
            this.f129588u = InterfaceC2067y.m12209r(i3) == 128;
            this.f129589v = InterfaceC2067y.m12206h(i3) == 64;
            this.f129572e = m151257i(i3, z);
        }

        /* JADX INFO: renamed from: f */
        public static int m151252f(List<C18294b> list, List<C18294b> list2) {
            return ((C18294b) Collections.max(list)).compareTo((C18294b) Collections.max(list2));
        }

        /* JADX INFO: renamed from: h */
        public static ImmutableList<C18294b> m151253h(int i, z5j0 z5j0Var, C18296d c18296d, int[] iArr, boolean z, oh80<C1871k> oh80Var) {
            ImmutableList.C2781a c2781aBuilder = ImmutableList.builder();
            for (int i2 = 0; i2 < z5j0Var.f201817a; i2++) {
                c2781aBuilder.mo15683a(new C18294b(i, z5j0Var, i2, c18296d, iArr[i2], z, oh80Var));
            }
            return c2781aBuilder.m15702m();
        }

        @Override // p149l.lrd.AbstractC18300h
        /* JADX INFO: renamed from: a */
        public int mo151254a() {
            return this.f129572e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(C18294b c18294b) {
            Ordering orderingReverse = (this.f129573f && this.f129576i) ? lrd.f129563k : lrd.f129563k.reverse();
            zm5 zm5VarMo219309g = zm5.m219305k().mo219310h(this.f129576i, c18294b.f129576i).mo219309g(Integer.valueOf(this.f129578k), Integer.valueOf(c18294b.f129578k), Ordering.natural().reverse()).mo219306d(this.f129577j, c18294b.f129577j).mo219306d(this.f129579l, c18294b.f129579l).mo219310h(this.f129583p, c18294b.f129583p).mo219310h(this.f129580m, c18294b.f129580m).mo219309g(Integer.valueOf(this.f129581n), Integer.valueOf(c18294b.f129581n), Ordering.natural().reverse()).mo219306d(this.f129582o, c18294b.f129582o).mo219310h(this.f129573f, c18294b.f129573f).mo219309g(Integer.valueOf(this.f129587t), Integer.valueOf(c18294b.f129587t), Ordering.natural().reverse()).mo219309g(Integer.valueOf(this.f129586s), Integer.valueOf(c18294b.f129586s), this.f129575h.f184901w ? lrd.f129563k.reverse() : lrd.f129564l).mo219310h(this.f129588u, c18294b.f129588u).mo219310h(this.f129589v, c18294b.f129589v).mo219309g(Integer.valueOf(this.f129584q), Integer.valueOf(c18294b.f129584q), orderingReverse).mo219309g(Integer.valueOf(this.f129585r), Integer.valueOf(c18294b.f129585r), orderingReverse);
            Integer numValueOf = Integer.valueOf(this.f129586s);
            Integer numValueOf2 = Integer.valueOf(c18294b.f129586s);
            if (!vck0.m197845c(this.f129574g, c18294b.f129574g)) {
                orderingReverse = lrd.f129564l;
            }
            return zm5VarMo219309g.mo219309g(numValueOf, numValueOf2, orderingReverse).mo219312j();
        }

        /* JADX INFO: renamed from: i */
        public final int m151257i(int i, boolean z) {
            if (!lrd.m151221O(i, this.f129575h.f129623P0)) {
                return 0;
            }
            if (!this.f129573f && !this.f129575h.f129617J0) {
                return 0;
            }
            if (!lrd.m151221O(i, false) || !this.f129573f || this.f129671d.f7744h == -1) {
                return 1;
            }
            C18296d c18296d = this.f129575h;
            if (c18296d.f184902x || c18296d.f184901w) {
                return 1;
            }
            return (c18296d.f129625R0 || !z) ? 2 : 1;
        }

        @Override // p149l.lrd.AbstractC18300h
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo151255b(C18294b c18294b) {
            int i;
            String str;
            int i2;
            C18296d c18296d = this.f129575h;
            if (!c18296d.f129620M0 && ((i2 = this.f129671d.f7761y) == -1 || i2 != c18294b.f129671d.f7761y)) {
                return false;
            }
            if (!c18296d.f129618K0 && ((str = this.f129671d.f7748l) == null || !TextUtils.equals(str, c18294b.f129671d.f7748l))) {
                return false;
            }
            C18296d c18296d2 = this.f129575h;
            if (!c18296d2.f129619L0 && ((i = this.f129671d.f7762z) == -1 || i != c18294b.f129671d.f7762z)) {
                return false;
            }
            if (c18296d2.f129621N0) {
                return true;
            }
            return this.f129588u == c18294b.f129588u && this.f129589v == c18294b.f129589v;
        }
    }

    /* JADX INFO: renamed from: l.lrd$c */
    public static final class C18295c implements Comparable<C18295c> {

        /* JADX INFO: renamed from: a */
        public final boolean f129590a;

        /* JADX INFO: renamed from: b */
        public final boolean f129591b;

        public C18295c(C1871k c1871k, int i) {
            this.f129590a = (c1871k.f7740d & 1) != 0;
            this.f129591b = lrd.m151221O(i, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C18295c c18295c) {
            return zm5.m219305k().mo219310h(this.f129591b, c18295c.f129591b).mo219310h(this.f129590a, c18295c.f129590a).mo219312j();
        }
    }

    /* JADX INFO: renamed from: l.lrd$e */
    public static final class C18297e implements InterfaceC1863e {

        /* JADX INFO: renamed from: e */
        public static final String f129645e = vck0.m197903z0(0);

        /* JADX INFO: renamed from: f */
        public static final String f129646f = vck0.m197903z0(1);

        /* JADX INFO: renamed from: g */
        public static final String f129647g = vck0.m197903z0(2);

        /* JADX INFO: renamed from: h */
        public static final InterfaceC1863e.a<C18297e> f129648h = new InterfaceC1863e.a() { // from class: l.nrd
            @Override // com.google.android.exoplayer2.InterfaceC1863e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1863e mo9980a(Bundle bundle) {
                return lrd.C18297e.m151344a(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        public final int f129649a;

        /* JADX INFO: renamed from: b */
        public final int[] f129650b;

        /* JADX INFO: renamed from: c */
        public final int f129651c;

        /* JADX INFO: renamed from: d */
        public final int f129652d;

        public C18297e(int i, int[] iArr, int i2) {
            this.f129649a = i;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f129650b = iArrCopyOf;
            this.f129651c = iArr.length;
            this.f129652d = i2;
            Arrays.sort(iArrCopyOf);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ C18297e m151344a(Bundle bundle) {
            int i = bundle.getInt(f129645e, -1);
            int[] intArray = bundle.getIntArray(f129646f);
            int i2 = bundle.getInt(f129647g, -1);
            p11.m167007a(i >= 0 && i2 >= 0);
            p11.m167011e(intArray);
            return new C18297e(i, intArray, i2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C18297e.class == obj.getClass()) {
                C18297e c18297e = (C18297e) obj;
                if (this.f129649a == c18297e.f129649a && Arrays.equals(this.f129650b, c18297e.f129650b) && this.f129652d == c18297e.f129652d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f129649a * 31) + Arrays.hashCode(this.f129650b)) * 31) + this.f129652d;
        }

        @Override // com.google.android.exoplayer2.InterfaceC1863e
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(f129645e, this.f129649a);
            bundle.putIntArray(f129646f, this.f129650b);
            bundle.putInt(f129647g, this.f129652d);
            return bundle;
        }
    }

    /* JADX INFO: renamed from: l.lrd$f */
    @RequiresApi(32)
    public static class C18298f {

        /* JADX INFO: renamed from: a */
        public final Spatializer f129653a;

        /* JADX INFO: renamed from: b */
        public final boolean f129654b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public Handler f129655c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public Spatializer$OnSpatializerStateChangedListener f129656d;

        /* JADX INFO: renamed from: l.lrd$f$a */
        public class a implements Spatializer$OnSpatializerStateChangedListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ lrd f129657a;

            public a(lrd lrdVar) {
                this.f129657a = lrdVar;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
                this.f129657a.m151236Q();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
                this.f129657a.m151236Q();
            }
        }

        public C18298f(Spatializer spatializer) {
            this.f129653a = spatializer;
            this.f129654b = spatializer.getImmersiveAudioLevel() != 0;
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public static C18298f m151345g(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new C18298f(audioManager.getSpatializer());
        }

        /* JADX INFO: renamed from: a */
        public boolean m151346a(C1818a c1818a, C1871k c1871k) {
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(vck0.m197801H(("audio/eac3-joc".equals(c1871k.f7748l) && c1871k.f7761y == 16) ? 12 : c1871k.f7761y));
            int i = c1871k.f7762z;
            if (i != -1) {
                channelMask.setSampleRate(i);
            }
            return this.f129653a.canBeSpatialized(c1818a.m9532b().f7155a, channelMask.build());
        }

        /* JADX INFO: renamed from: b */
        public void m151347b(lrd lrdVar, Looper looper) {
            if (this.f129656d == null && this.f129655c == null) {
                this.f129656d = new a(lrdVar);
                Handler handler = new Handler(looper);
                this.f129655c = handler;
                Spatializer spatializer = this.f129653a;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new gld(handler), this.f129656d);
            }
        }

        /* JADX INFO: renamed from: c */
        public boolean m151348c() {
            return this.f129653a.isAvailable();
        }

        /* JADX INFO: renamed from: d */
        public boolean m151349d() {
            return this.f129653a.isEnabled();
        }

        /* JADX INFO: renamed from: e */
        public boolean m151350e() {
            return this.f129654b;
        }

        /* JADX INFO: renamed from: f */
        public void m151351f() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.f129656d;
            if (spatializer$OnSpatializerStateChangedListener == null || this.f129655c == null) {
                return;
            }
            this.f129653a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            ((Handler) vck0.m197866j(this.f129655c)).removeCallbacksAndMessages(null);
            this.f129655c = null;
            this.f129656d = null;
        }
    }

    /* JADX INFO: renamed from: l.lrd$g */
    public static final class C18299g extends AbstractC18300h<C18299g> implements Comparable<C18299g> {

        /* JADX INFO: renamed from: e */
        public final int f129659e;

        /* JADX INFO: renamed from: f */
        public final boolean f129660f;

        /* JADX INFO: renamed from: g */
        public final boolean f129661g;

        /* JADX INFO: renamed from: h */
        public final boolean f129662h;

        /* JADX INFO: renamed from: i */
        public final int f129663i;

        /* JADX INFO: renamed from: j */
        public final int f129664j;

        /* JADX INFO: renamed from: k */
        public final int f129665k;

        /* JADX INFO: renamed from: l */
        public final int f129666l;

        /* JADX INFO: renamed from: m */
        public final boolean f129667m;

        public C18299g(int i, z5j0 z5j0Var, int i2, C18296d c18296d, int i3, @Nullable String str) {
            int iM151215G;
            super(i, z5j0Var, i2);
            int i4 = 0;
            this.f129660f = lrd.m151221O(i3, false);
            int i5 = this.f129671d.f7740d & (~c18296d.f184899u);
            this.f129661g = (i5 & 1) != 0;
            this.f129662h = (i5 & 2) != 0;
            ImmutableList<String> immutableListM15686of = c18296d.f184897s.isEmpty() ? ImmutableList.m15686of("") : c18296d.f184897s;
            int i6 = 0;
            while (true) {
                if (i6 >= immutableListM15686of.size()) {
                    i6 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    iM151215G = 0;
                    break;
                } else {
                    iM151215G = lrd.m151215G(this.f129671d, immutableListM15686of.get(i6), c18296d.f184900v);
                    if (iM151215G > 0) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.f129663i = i6;
            this.f129664j = iM151215G;
            int iM151218K = lrd.m151218K(this.f129671d.f7741e, c18296d.f184898t);
            this.f129665k = iM151218K;
            this.f129667m = (this.f129671d.f7741e & 1088) != 0;
            int iM151215G2 = lrd.m151215G(this.f129671d, str, lrd.m151223S(str) == null);
            this.f129666l = iM151215G2;
            boolean z = iM151215G > 0 || (c18296d.f184897s.isEmpty() && iM151218K > 0) || this.f129661g || (this.f129662h && iM151215G2 > 0);
            if (lrd.m151221O(i3, c18296d.f129623P0) && z) {
                i4 = 1;
            }
            this.f129659e = i4;
        }

        /* JADX INFO: renamed from: f */
        public static int m151352f(List<C18299g> list, List<C18299g> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        /* JADX INFO: renamed from: h */
        public static ImmutableList<C18299g> m151353h(int i, z5j0 z5j0Var, C18296d c18296d, int[] iArr, @Nullable String str) {
            ImmutableList.C2781a c2781aBuilder = ImmutableList.builder();
            for (int i2 = 0; i2 < z5j0Var.f201817a; i2++) {
                c2781aBuilder.mo15683a(new C18299g(i, z5j0Var, i2, c18296d, iArr[i2], str));
            }
            return c2781aBuilder.m15702m();
        }

        @Override // p149l.lrd.AbstractC18300h
        /* JADX INFO: renamed from: a */
        public int mo151254a() {
            return this.f129659e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(C18299g c18299g) {
            zm5 zm5VarMo219306d = zm5.m219305k().mo219310h(this.f129660f, c18299g.f129660f).mo219309g(Integer.valueOf(this.f129663i), Integer.valueOf(c18299g.f129663i), Ordering.natural().reverse()).mo219306d(this.f129664j, c18299g.f129664j).mo219306d(this.f129665k, c18299g.f129665k).mo219310h(this.f129661g, c18299g.f129661g).mo219309g(Boolean.valueOf(this.f129662h), Boolean.valueOf(c18299g.f129662h), this.f129664j == 0 ? Ordering.natural() : Ordering.natural().reverse()).mo219306d(this.f129666l, c18299g.f129666l);
            if (this.f129665k == 0) {
                zm5VarMo219306d = zm5VarMo219306d.mo219311i(this.f129667m, c18299g.f129667m);
            }
            return zm5VarMo219306d.mo219312j();
        }

        @Override // p149l.lrd.AbstractC18300h
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean mo151255b(C18299g c18299g) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l.lrd$h */
    public static abstract class AbstractC18300h<T extends AbstractC18300h<T>> {

        /* JADX INFO: renamed from: a */
        public final int f129668a;

        /* JADX INFO: renamed from: b */
        public final z5j0 f129669b;

        /* JADX INFO: renamed from: c */
        public final int f129670c;

        /* JADX INFO: renamed from: d */
        public final C1871k f129671d;

        /* JADX INFO: renamed from: l.lrd$h$a */
        public interface a<T extends AbstractC18300h<T>> {
            /* JADX INFO: renamed from: a */
            List<T> mo117825a(int i, z5j0 z5j0Var, int[] iArr);
        }

        public AbstractC18300h(int i, z5j0 z5j0Var, int i2) {
            this.f129668a = i;
            this.f129669b = z5j0Var;
            this.f129670c = i2;
            this.f129671d = z5j0Var.m217358c(i2);
        }

        /* JADX INFO: renamed from: a */
        public abstract int mo151254a();

        /* JADX INFO: renamed from: b */
        public abstract boolean mo151255b(T t);
    }

    /* JADX INFO: renamed from: l.lrd$i */
    public static final class C18301i extends AbstractC18300h<C18301i> {

        /* JADX INFO: renamed from: e */
        public final boolean f129672e;

        /* JADX INFO: renamed from: f */
        public final C18296d f129673f;

        /* JADX INFO: renamed from: g */
        public final boolean f129674g;

        /* JADX INFO: renamed from: h */
        public final boolean f129675h;

        /* JADX INFO: renamed from: i */
        public final int f129676i;

        /* JADX INFO: renamed from: j */
        public final int f129677j;

        /* JADX INFO: renamed from: k */
        public final int f129678k;

        /* JADX INFO: renamed from: l */
        public final int f129679l;

        /* JADX INFO: renamed from: m */
        public final boolean f129680m;

        /* JADX INFO: renamed from: n */
        public final boolean f129681n;

        /* JADX INFO: renamed from: o */
        public final int f129682o;

        /* JADX INFO: renamed from: p */
        public final boolean f129683p;

        /* JADX INFO: renamed from: q */
        public final boolean f129684q;

        /* JADX INFO: renamed from: r */
        public final int f129685r;

        /* JADX WARN: Code duplicated, block: B:31:0x004b  */
        /* JADX WARN: Code duplicated, block: B:51:0x0079  */
        public C18301i(int i, z5j0 z5j0Var, int i2, C18296d c18296d, int i3, int i4, boolean z) {
            boolean z2;
            boolean z3;
            C1871k c1871k;
            int i5;
            int i6;
            int i7;
            C1871k c1871k2;
            int i8;
            int i9;
            int i10;
            super(i, z5j0Var, i2);
            this.f129673f = c18296d;
            int i11 = c18296d.f129615H0 ? 24 : 16;
            this.f129681n = c18296d.f129614G0 && (i4 & i11) != 0;
            if (!z || (((i8 = (c1871k2 = this.f129671d).f7753q) != -1 && i8 > c18296d.f184879a) || ((i9 = c1871k2.f7754r) != -1 && i9 > c18296d.f184880b))) {
                z2 = false;
            } else {
                float f = c1871k2.f7755s;
                if ((f == -1.0f || f <= c18296d.f184881c) && ((i10 = c1871k2.f7744h) == -1 || i10 <= c18296d.f184882d)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            this.f129672e = z2;
            if (!z || (((i5 = (c1871k = this.f129671d).f7753q) != -1 && i5 < c18296d.f184883e) || ((i6 = c1871k.f7754r) != -1 && i6 < c18296d.f184884f))) {
                z3 = false;
            } else {
                float f2 = c1871k.f7755s;
                if ((f2 == -1.0f || f2 >= c18296d.f184885g) && ((i7 = c1871k.f7744h) == -1 || i7 >= c18296d.f184886h)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            this.f129674g = z3;
            this.f129675h = lrd.m151221O(i3, false);
            C1871k c1871k3 = this.f129671d;
            this.f129676i = c1871k3.f7744h;
            this.f129677j = c1871k3.m10284f();
            this.f129679l = lrd.m151218K(this.f129671d.f7741e, c18296d.f184891m);
            int i12 = this.f129671d.f7741e;
            this.f129680m = i12 == 0 || (i12 & 1) != 0;
            int i13 = 0;
            while (true) {
                if (i13 >= c18296d.f184890l.size()) {
                    i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    break;
                }
                String str = this.f129671d.f7748l;
                if (str != null && str.equals(c18296d.f184890l.get(i13))) {
                    break;
                } else {
                    i13++;
                }
            }
            this.f129678k = i13;
            this.f129683p = InterfaceC2067y.m12209r(i3) == 128;
            this.f129684q = InterfaceC2067y.m12206h(i3) == 64;
            this.f129685r = lrd.m151219L(this.f129671d.f7748l);
            this.f129682o = m151362n(i3, i11);
        }

        /* JADX INFO: renamed from: h */
        public static int m151358h(C18301i c18301i, C18301i c18301i2) {
            zm5 zm5VarMo219310h = zm5.m219305k().mo219310h(c18301i.f129675h, c18301i2.f129675h).mo219306d(c18301i.f129679l, c18301i2.f129679l).mo219310h(c18301i.f129680m, c18301i2.f129680m).mo219310h(c18301i.f129672e, c18301i2.f129672e).mo219310h(c18301i.f129674g, c18301i2.f129674g).mo219309g(Integer.valueOf(c18301i.f129678k), Integer.valueOf(c18301i2.f129678k), Ordering.natural().reverse()).mo219310h(c18301i.f129683p, c18301i2.f129683p).mo219310h(c18301i.f129684q, c18301i2.f129684q);
            if (c18301i.f129683p && c18301i.f129684q) {
                zm5VarMo219310h = zm5VarMo219310h.mo219306d(c18301i.f129685r, c18301i2.f129685r);
            }
            return zm5VarMo219310h.mo219312j();
        }

        /* JADX INFO: renamed from: i */
        public static int m151359i(C18301i c18301i, C18301i c18301i2) {
            Ordering orderingReverse = (c18301i.f129672e && c18301i.f129675h) ? lrd.f129563k : lrd.f129563k.reverse();
            return zm5.m219305k().mo219309g(Integer.valueOf(c18301i.f129676i), Integer.valueOf(c18301i2.f129676i), c18301i.f129673f.f184901w ? lrd.f129563k.reverse() : lrd.f129564l).mo219309g(Integer.valueOf(c18301i.f129677j), Integer.valueOf(c18301i2.f129677j), orderingReverse).mo219309g(Integer.valueOf(c18301i.f129676i), Integer.valueOf(c18301i2.f129676i), orderingReverse).mo219312j();
        }

        /* JADX INFO: renamed from: j */
        public static int m151360j(List<C18301i> list, List<C18301i> list2) {
            return zm5.m219305k().mo219309g((C18301i) Collections.max(list, new Comparator() { // from class: l.vrd
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return lrd.C18301i.m151358h((lrd.C18301i) obj, (lrd.C18301i) obj2);
                }
            }), (C18301i) Collections.max(list2, new Comparator() { // from class: l.vrd
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return lrd.C18301i.m151358h((lrd.C18301i) obj, (lrd.C18301i) obj2);
                }
            }), new Comparator() { // from class: l.vrd
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return lrd.C18301i.m151358h((lrd.C18301i) obj, (lrd.C18301i) obj2);
                }
            }).mo219306d(list.size(), list2.size()).mo219309g((C18301i) Collections.max(list, new Comparator() { // from class: l.wrd
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return lrd.C18301i.m151359i((lrd.C18301i) obj, (lrd.C18301i) obj2);
                }
            }), (C18301i) Collections.max(list2, new Comparator() { // from class: l.wrd
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return lrd.C18301i.m151359i((lrd.C18301i) obj, (lrd.C18301i) obj2);
                }
            }), new Comparator() { // from class: l.wrd
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return lrd.C18301i.m151359i((lrd.C18301i) obj, (lrd.C18301i) obj2);
                }
            }).mo219312j();
        }

        /* JADX INFO: renamed from: m */
        public static ImmutableList<C18301i> m151361m(int i, z5j0 z5j0Var, C18296d c18296d, int[] iArr, int i2) {
            int iM151216H = lrd.m151216H(z5j0Var, c18296d.f184887i, c18296d.f184888j, c18296d.f184889k);
            ImmutableList.C2781a c2781aBuilder = ImmutableList.builder();
            for (int i3 = 0; i3 < z5j0Var.f201817a; i3++) {
                int iM10284f = z5j0Var.m217358c(i3).m10284f();
                c2781aBuilder.mo15683a(new C18301i(i, z5j0Var, i3, c18296d, iArr[i3], i2, iM151216H == Integer.MAX_VALUE || (iM10284f != -1 && iM10284f <= iM151216H)));
            }
            return c2781aBuilder.m15702m();
        }

        @Override // p149l.lrd.AbstractC18300h
        /* JADX INFO: renamed from: a */
        public int mo151254a() {
            return this.f129682o;
        }

        /* JADX INFO: renamed from: n */
        public final int m151362n(int i, int i2) {
            if ((this.f129671d.f7741e & 16384) != 0 || !lrd.m151221O(i, this.f129673f.f129623P0)) {
                return 0;
            }
            if (!this.f129672e && !this.f129673f.f129613F0) {
                return 0;
            }
            if (!lrd.m151221O(i, false) || !this.f129674g || !this.f129672e || this.f129671d.f7744h == -1) {
                return 1;
            }
            C18296d c18296d = this.f129673f;
            return (c18296d.f184902x || c18296d.f184901w || (i & i2) == 0) ? 1 : 2;
        }

        @Override // p149l.lrd.AbstractC18300h
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean mo151255b(C18301i c18301i) {
            if (!this.f129681n && !vck0.m197845c(this.f129671d.f7748l, c18301i.f129671d.f7748l)) {
                return false;
            }
            if (this.f129673f.f129616I0) {
                return true;
            }
            return this.f129683p == c18301i.f129683p && this.f129684q == c18301i.f129684q;
        }
    }

    public lrd(w6j0 w6j0Var, o8f.InterfaceC18874b interfaceC18874b, @Nullable Context context) {
        this.f129565d = new Object();
        this.f129566e = context != null ? context.getApplicationContext() : null;
        this.f129567f = interfaceC18874b;
        if (w6j0Var instanceof C18296d) {
            this.f129569h = (C18296d) w6j0Var;
        } else {
            this.f129569h = (context == null ? C18296d.f129592V0 : C18296d.m151266J(context)).mo151287A().m151325h0(w6j0Var).mo151309A();
        }
        this.f129571j = C1818a.f7142g;
        boolean z = context != null && vck0.m197798F0(context);
        this.f129568g = z;
        if (!z && context != null && vck0.f180948a >= 32) {
            this.f129570i = C18298f.m151345g(context);
        }
        if (this.f129569h.f129622O0 && context == null) {
            jwv.m143689i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m151212D(ouw.C19047a c19047a, C18296d c18296d, o8f.C18873a[] c18873aArr) {
        int iM166141d = c19047a.m166141d();
        for (int i = 0; i < iM166141d; i++) {
            b6j0 b6j0VarM166143f = c19047a.m166143f(i);
            if (c18296d.m151291N(i, b6j0VarM166143f)) {
                C18297e c18297eM151290M = c18296d.m151290M(i, b6j0VarM166143f);
                c18873aArr[i] = (c18297eM151290M == null || c18297eM151290M.f129650b.length == 0) ? null : new o8f.C18873a(b6j0VarM166143f.m100410b(c18297eM151290M.f129649a), c18297eM151290M.f129650b, c18297eM151290M.f129652d);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m151213E(ouw.C19047a c19047a, w6j0 w6j0Var, o8f.C18873a[] c18873aArr) {
        int iM166141d = c19047a.m166141d();
        HashMap map = new HashMap();
        for (int i = 0; i < iM166141d; i++) {
            m151214F(c19047a.m166143f(i), w6j0Var, map);
        }
        m151214F(c19047a.m166145h(), w6j0Var, map);
        for (int i2 = 0; i2 < iM166141d; i2++) {
            u6j0 u6j0Var = (u6j0) map.get(Integer.valueOf(c19047a.m166142e(i2)));
            if (u6j0Var != null) {
                c18873aArr[i2] = (u6j0Var.f174846b.isEmpty() || c19047a.m166143f(i2).m100411c(u6j0Var.f174845a) == -1) ? null : new o8f.C18873a(u6j0Var.f174845a, Ints.m16469n(u6j0Var.f174846b));
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m151214F(b6j0 b6j0Var, w6j0 w6j0Var, Map<Integer, u6j0> map) {
        u6j0 u6j0Var;
        for (int i = 0; i < b6j0Var.f73826a; i++) {
            u6j0 u6j0Var2 = w6j0Var.f184903y.get(b6j0Var.m100410b(i));
            if (u6j0Var2 != null && ((u6j0Var = map.get(Integer.valueOf(u6j0Var2.m191979b()))) == null || (u6j0Var.f174846b.isEmpty() && !u6j0Var2.f174846b.isEmpty()))) {
                map.put(Integer.valueOf(u6j0Var2.m191979b()), u6j0Var2);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public static int m151215G(C1871k c1871k, @Nullable String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(c1871k.f7739c)) {
            return 4;
        }
        String strM151223S = m151223S(str);
        String strM151223S2 = m151223S(c1871k.f7739c);
        if (strM151223S2 == null || strM151223S == null) {
            return (z && strM151223S2 == null) ? 1 : 0;
        }
        if (strM151223S2.startsWith(strM151223S) || strM151223S.startsWith(strM151223S2)) {
            return 3;
        }
        return vck0.m197844b1(strM151223S2, "-")[0].equals(vck0.m197844b1(strM151223S, "-")[0]) ? 2 : 0;
    }

    /* JADX INFO: renamed from: H */
    public static int m151216H(z5j0 z5j0Var, int i, int i2, boolean z) {
        int i3;
        int i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
            for (int i5 = 0; i5 < z5j0Var.f201817a; i5++) {
                C1871k c1871kM217358c = z5j0Var.m217358c(i5);
                int i6 = c1871kM217358c.f7753q;
                if (i6 > 0 && (i3 = c1871kM217358c.f7754r) > 0) {
                    Point pointM151217I = m151217I(z, i, i2, i6, i3);
                    int i7 = c1871kM217358c.f7753q;
                    int i8 = c1871kM217358c.f7754r;
                    int i9 = i7 * i8;
                    if (i7 >= ((int) (pointM151217I.x * 0.98f)) && i8 >= ((int) (pointM151217I.y * 0.98f)) && i9 < i4) {
                        i4 = i9;
                    }
                }
            }
        }
        return i4;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x000f  */
    /* JADX INFO: renamed from: I */
    public static Point m151217I(boolean z, int i, int i2, int i3, int i4) {
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
        return i5 >= i6 ? new Point(i2, vck0.m197872l(i6, i3)) : new Point(vck0.m197872l(i5, i4), i);
    }

    /* JADX INFO: renamed from: K */
    public static int m151218K(int i, int i2) {
        return (i == 0 || i != i2) ? Integer.bitCount(i & i2) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: L */
    public static int m151219L(@Nullable String str) {
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
    public static boolean m151220N(C1871k c1871k) {
        String str = c1871k.f7748l;
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
    public static boolean m151221O(int i, boolean z) {
        int iM12208p = InterfaceC2067y.m12208p(i);
        if (iM12208p != 4) {
            return z && iM12208p == 3;
        }
        return true;
    }

    /* JADX INFO: renamed from: P */
    public static void m151222P(ouw.C19047a c19047a, int[][][] iArr, erc0[] erc0VarArr, o8f[] o8fVarArr) {
        boolean z;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= c19047a.m166141d()) {
                z = true;
                break;
            }
            int iM166142e = c19047a.m166142e(i3);
            o8f o8fVar = o8fVarArr[i3];
            if ((iM166142e == 1 || iM166142e == 2) && o8fVar != null && m151224T(iArr[i3], c19047a.m166143f(i3), o8fVar)) {
                if (iM166142e == 1) {
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
            erc0 erc0Var = new erc0(true);
            erc0VarArr[i2] = erc0Var;
            erc0VarArr[i] = erc0Var;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: S */
    public static String m151223S(@Nullable String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: T */
    public static boolean m151224T(int[][] iArr, b6j0 b6j0Var, o8f o8fVar) {
        if (o8fVar == null) {
            return false;
        }
        int iM100411c = b6j0Var.m100411c(o8fVar.mo11307h());
        for (int i = 0; i < o8fVar.length(); i++) {
            if (InterfaceC2067y.m12211u(iArr[iM100411c][o8fVar.mo11302c(i)]) != 32) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ int m151227t(Integer num, Integer num2) {
        return 0;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ int m151228u(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ List m151230w(final lrd lrdVar, C18296d c18296d, boolean z, int i, z5j0 z5j0Var, int[] iArr) {
        lrdVar.getClass();
        return C18294b.m151253h(i, z5j0Var, c18296d, iArr, z, new oh80() { // from class: l.krd
            @Override // p149l.oh80
            public final boolean apply(Object obj) {
                return this.f124342a.m151235M((C1871k) obj);
            }
        });
    }

    @Override // p149l.y6j0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public C18296d mo151245c() {
        C18296d c18296d;
        synchronized (this.f129565d) {
            c18296d = this.f129569h;
        }
        return c18296d;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m151235M(C1871k c1871k) {
        boolean z;
        C18298f c18298f;
        C18298f c18298f2;
        synchronized (this.f129565d) {
            try {
                if (this.f129569h.f129622O0 && !this.f129568g && c1871k.f7761y > 2 && (!m151220N(c1871k) || (vck0.f180948a >= 32 && (c18298f2 = this.f129570i) != null && c18298f2.m151350e()))) {
                    z = vck0.f180948a >= 32 && (c18298f = this.f129570i) != null && c18298f.m151350e() && this.f129570i.m151348c() && this.f129570i.m151349d() && this.f129570i.m151346a(this.f129571j, c1871k);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: Q */
    public final void m151236Q() {
        boolean z;
        C18298f c18298f;
        synchronized (this.f129565d) {
            try {
                z = this.f129569h.f129622O0 && !this.f129568g && vck0.f180948a >= 32 && (c18298f = this.f129570i) != null && c18298f.m151350e();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m213147f();
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m151237R(InterfaceC2066x interfaceC2066x) {
        boolean z;
        synchronized (this.f129565d) {
            z = this.f129569h.f129626S0;
        }
        if (z) {
            m213148g(interfaceC2066x);
        }
    }

    /* JADX INFO: renamed from: U */
    public o8f.C18873a[] m151238U(ouw.C19047a c19047a, int[][][] iArr, int[] iArr2, C18296d c18296d) throws ExoPlaybackException {
        String str;
        int iM166141d = c19047a.m166141d();
        o8f.C18873a[] c18873aArr = new o8f.C18873a[iM166141d];
        Pair<o8f.C18873a, Integer> pairM151243Z = m151243Z(c19047a, iArr, iArr2, c18296d);
        if (pairM151243Z != null) {
            c18873aArr[((Integer) pairM151243Z.second).intValue()] = (o8f.C18873a) pairM151243Z.first;
        }
        Pair<o8f.C18873a, Integer> pairM151239V = m151239V(c19047a, iArr, iArr2, c18296d);
        if (pairM151239V != null) {
            c18873aArr[((Integer) pairM151239V.second).intValue()] = (o8f.C18873a) pairM151239V.first;
        }
        if (pairM151239V == null) {
            str = null;
        } else {
            Object obj = pairM151239V.first;
            str = ((o8f.C18873a) obj).f142622a.m217358c(((o8f.C18873a) obj).f142623b[0]).f7739c;
        }
        Pair<o8f.C18873a, Integer> pairM151241X = m151241X(c19047a, iArr, c18296d, str);
        if (pairM151241X != null) {
            c18873aArr[((Integer) pairM151241X.second).intValue()] = (o8f.C18873a) pairM151241X.first;
        }
        for (int i = 0; i < iM166141d; i++) {
            int iM166142e = c19047a.m166142e(i);
            if (iM166142e != 2 && iM166142e != 1 && iM166142e != 3) {
                c18873aArr[i] = m151240W(iM166142e, c19047a.m166143f(i), iArr[i], c18296d);
            }
        }
        return c18873aArr;
    }

    @Nullable
    /* JADX INFO: renamed from: V */
    public Pair<o8f.C18873a, Integer> m151239V(ouw.C19047a c19047a, int[][][] iArr, int[] iArr2, final C18296d c18296d) throws ExoPlaybackException {
        final boolean z = false;
        for (int i = 0; i < c19047a.m166141d(); i++) {
            if (2 == c19047a.m166142e(i) && c19047a.m166143f(i).f73826a > 0) {
                z = true;
                break;
            }
        }
        return m151242Y(1, c19047a, iArr, new AbstractC18300h.a() { // from class: l.grd
            @Override // p149l.lrd.AbstractC18300h.a
            /* JADX INFO: renamed from: a */
            public final List mo117825a(int i2, z5j0 z5j0Var, int[] iArr3) {
                return lrd.m151230w(this.f104045a, c18296d, z, i2, z5j0Var, iArr3);
            }
        }, new Comparator() { // from class: l.hrd
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return lrd.C18294b.m151252f((List) obj, (List) obj2);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: W */
    public o8f.C18873a m151240W(int i, b6j0 b6j0Var, int[][] iArr, C18296d c18296d) throws ExoPlaybackException {
        z5j0 z5j0Var = null;
        C18295c c18295c = null;
        int i2 = 0;
        for (int i3 = 0; i3 < b6j0Var.f73826a; i3++) {
            z5j0 z5j0VarM100410b = b6j0Var.m100410b(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < z5j0VarM100410b.f201817a; i4++) {
                if (m151221O(iArr2[i4], c18296d.f129623P0)) {
                    C18295c c18295c2 = new C18295c(z5j0VarM100410b.m217358c(i4), iArr2[i4]);
                    if (c18295c == null || c18295c2.compareTo(c18295c) > 0) {
                        z5j0Var = z5j0VarM100410b;
                        i2 = i4;
                        c18295c = c18295c2;
                    }
                }
            }
        }
        if (z5j0Var == null) {
            return null;
        }
        return new o8f.C18873a(z5j0Var, i2);
    }

    @Nullable
    /* JADX INFO: renamed from: X */
    public Pair<o8f.C18873a, Integer> m151241X(ouw.C19047a c19047a, int[][][] iArr, final C18296d c18296d, @Nullable final String str) throws ExoPlaybackException {
        return m151242Y(3, c19047a, iArr, new AbstractC18300h.a() { // from class: l.ird
            @Override // p149l.lrd.AbstractC18300h.a
            /* JADX INFO: renamed from: a */
            public final List mo117825a(int i, z5j0 z5j0Var, int[] iArr2) {
                return lrd.C18299g.m151353h(i, z5j0Var, c18296d, iArr2, str);
            }
        }, new Comparator() { // from class: l.jrd
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return lrd.C18299g.m151352f((List) obj, (List) obj2);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: Y */
    public final <T extends AbstractC18300h<T>> Pair<o8f.C18873a, Integer> m151242Y(int i, ouw.C19047a c19047a, int[][][] iArr, AbstractC18300h.a<T> aVar, Comparator<List<T>> comparator) {
        int i2;
        RandomAccess randomAccessM15686of;
        ouw.C19047a c19047a2 = c19047a;
        ArrayList arrayList = new ArrayList();
        int iM166141d = c19047a2.m166141d();
        int i3 = 0;
        while (i3 < iM166141d) {
            if (i == c19047a2.m166142e(i3)) {
                b6j0 b6j0VarM166143f = c19047a2.m166143f(i3);
                for (int i4 = 0; i4 < b6j0VarM166143f.f73826a; i4++) {
                    z5j0 z5j0VarM100410b = b6j0VarM166143f.m100410b(i4);
                    List<T> listMo117825a = aVar.mo117825a(i3, z5j0VarM100410b, iArr[i3][i4]);
                    boolean[] zArr = new boolean[z5j0VarM100410b.f201817a];
                    int i5 = 0;
                    while (i5 < z5j0VarM100410b.f201817a) {
                        T t = listMo117825a.get(i5);
                        int iMo151254a = t.mo151254a();
                        if (zArr[i5] || iMo151254a == 0) {
                            i2 = iM166141d;
                        } else {
                            if (iMo151254a == 1) {
                                randomAccessM15686of = ImmutableList.m15686of(t);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t);
                                int i6 = i5 + 1;
                                while (i6 < z5j0VarM100410b.f201817a) {
                                    T t2 = listMo117825a.get(i6);
                                    int i7 = iM166141d;
                                    if (t2.mo151254a() == 2 && t.mo151255b(t2)) {
                                        arrayList2.add(t2);
                                        zArr[i6] = true;
                                    }
                                    i6++;
                                    iM166141d = i7;
                                }
                                randomAccessM15686of = arrayList2;
                            }
                            i2 = iM166141d;
                            arrayList.add(randomAccessM15686of);
                        }
                        i5++;
                        iM166141d = i2;
                    }
                }
            }
            i3++;
            c19047a2 = c19047a;
            iM166141d = iM166141d;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((AbstractC18300h) list.get(i8)).f129670c;
        }
        AbstractC18300h abstractC18300h = (AbstractC18300h) list.get(0);
        return Pair.create(new o8f.C18873a(abstractC18300h.f129669b, iArr2), Integer.valueOf(abstractC18300h.f129668a));
    }

    @Nullable
    /* JADX INFO: renamed from: Z */
    public Pair<o8f.C18873a, Integer> m151243Z(ouw.C19047a c19047a, int[][][] iArr, final int[] iArr2, final C18296d c18296d) throws ExoPlaybackException {
        return m151242Y(2, c19047a, iArr, new AbstractC18300h.a() { // from class: l.erd
            @Override // p149l.lrd.AbstractC18300h.a
            /* JADX INFO: renamed from: a */
            public final List mo117825a(int i, z5j0 z5j0Var, int[] iArr3) {
                return lrd.C18301i.m151361m(i, z5j0Var, c18296d, iArr3, iArr2[i]);
            }
        }, new Comparator() { // from class: l.frd
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return lrd.C18301i.m151360j((List) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public final void m151244a0(C18296d c18296d) {
        boolean zEquals;
        p11.m167011e(c18296d);
        synchronized (this.f129565d) {
            zEquals = this.f129569h.equals(c18296d);
            this.f129569h = c18296d;
        }
        if (zEquals) {
            return;
        }
        if (c18296d.f129622O0 && this.f129566e == null) {
            jwv.m143689i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        m213147f();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2067y.a
    /* JADX INFO: renamed from: b */
    public void mo12213b(InterfaceC2066x interfaceC2066x) {
        m151237R(interfaceC2066x);
    }

    @Override // p149l.y6j0
    /* JADX INFO: renamed from: h */
    public boolean mo151247h() {
        return true;
    }

    @Override // p149l.y6j0
    /* JADX INFO: renamed from: j */
    public void mo151248j() {
        C18298f c18298f;
        synchronized (this.f129565d) {
            try {
                if (vck0.f180948a >= 32 && (c18298f = this.f129570i) != null) {
                    c18298f.m151351f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.mo151248j();
    }

    @Override // p149l.y6j0
    /* JADX INFO: renamed from: l */
    public void mo151249l(C1818a c1818a) {
        boolean zEquals;
        synchronized (this.f129565d) {
            zEquals = this.f129571j.equals(c1818a);
            this.f129571j = c1818a;
        }
        if (zEquals) {
            return;
        }
        m151236Q();
    }

    @Override // p149l.y6j0
    /* JADX INFO: renamed from: m */
    public void mo151250m(w6j0 w6j0Var) {
        if (w6j0Var instanceof C18296d) {
            m151244a0((C18296d) w6j0Var);
        }
        m151244a0(new C18296d.a().m151325h0(w6j0Var).mo151309A());
    }

    @Override // p149l.ouw
    /* JADX INFO: renamed from: q */
    public final Pair<erc0[], o8f[]> mo151251q(ouw.C19047a c19047a, int[][][] iArr, int[] iArr2, InterfaceC1965i.b bVar, AbstractC1834c0 abstractC1834c0) throws ExoPlaybackException {
        C18296d c18296d;
        C18298f c18298f;
        synchronized (this.f129565d) {
            try {
                c18296d = this.f129569h;
                if (c18296d.f129622O0 && vck0.f180948a >= 32 && (c18298f = this.f129570i) != null) {
                    c18298f.m151347b(this, (Looper) p11.m167015i(Looper.myLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int iM166141d = c19047a.m166141d();
        o8f.C18873a[] c18873aArrM151238U = m151238U(c19047a, iArr, iArr2, c18296d);
        m151213E(c19047a, c18296d, c18873aArrM151238U);
        m151212D(c19047a, c18296d, c18873aArrM151238U);
        for (int i = 0; i < iM166141d; i++) {
            int iM166142e = c19047a.m166142e(i);
            if (c18296d.m151289L(i) || c18296d.f184904z.contains(Integer.valueOf(iM166142e))) {
                c18873aArrM151238U[i] = null;
            }
        }
        o8f[] o8fVarArrMo163103a = this.f129567f.mo163103a(c18873aArrM151238U, m213145a(), bVar, abstractC1834c0);
        erc0[] erc0VarArr = new erc0[iM166141d];
        for (int i2 = 0; i2 < iM166141d; i2++) {
            erc0VarArr[i2] = (c18296d.m151289L(i2) || c18296d.f184904z.contains(Integer.valueOf(c19047a.m166142e(i2))) || (c19047a.m166142e(i2) != -2 && o8fVarArrMo163103a[i2] == null)) ? null : erc0.f92902b;
        }
        if (c18296d.f129624Q0) {
            m151222P(c19047a, iArr, erc0VarArr, o8fVarArrMo163103a);
        }
        return Pair.create(erc0VarArr, o8fVarArrMo163103a);
    }

    @Override // p149l.y6j0
    @Nullable
    /* JADX INFO: renamed from: d */
    public InterfaceC2067y.a mo151246d() {
        return this;
    }

    public lrd(Context context, o8f.InterfaceC18874b interfaceC18874b) {
        this(context, C18296d.m151266J(context), interfaceC18874b);
    }

    public lrd(Context context, w6j0 w6j0Var, o8f.InterfaceC18874b interfaceC18874b) {
        this(w6j0Var, interfaceC18874b, context);
    }

    public lrd(Context context) {
        this(context, new o80.C18870b());
    }

    /* JADX INFO: renamed from: l.lrd$d */
    public static final class C18296d extends w6j0 implements InterfaceC1863e {

        /* JADX INFO: renamed from: V0 */
        public static final C18296d f129592V0;

        /* JADX INFO: renamed from: W0 */
        @Deprecated
        public static final C18296d f129593W0;

        /* JADX INFO: renamed from: X0 */
        public static final String f129594X0;

        /* JADX INFO: renamed from: Y0 */
        public static final String f129595Y0;

        /* JADX INFO: renamed from: Z0 */
        public static final String f129596Z0;

        /* JADX INFO: renamed from: a1 */
        public static final String f129597a1;

        /* JADX INFO: renamed from: b1 */
        public static final String f129598b1;

        /* JADX INFO: renamed from: c1 */
        public static final String f129599c1;

        /* JADX INFO: renamed from: d1 */
        public static final String f129600d1;

        /* JADX INFO: renamed from: e1 */
        public static final String f129601e1;

        /* JADX INFO: renamed from: f1 */
        public static final String f129602f1;

        /* JADX INFO: renamed from: g1 */
        public static final String f129603g1;

        /* JADX INFO: renamed from: h1 */
        public static final String f129604h1;

        /* JADX INFO: renamed from: i1 */
        public static final String f129605i1;

        /* JADX INFO: renamed from: j1 */
        public static final String f129606j1;

        /* JADX INFO: renamed from: k1 */
        public static final String f129607k1;

        /* JADX INFO: renamed from: l1 */
        public static final String f129608l1;

        /* JADX INFO: renamed from: m1 */
        public static final String f129609m1;

        /* JADX INFO: renamed from: n1 */
        public static final String f129610n1;

        /* JADX INFO: renamed from: o1 */
        public static final String f129611o1;

        /* JADX INFO: renamed from: p1 */
        public static final InterfaceC1863e.a<C18296d> f129612p1;

        /* JADX INFO: renamed from: F0 */
        public final boolean f129613F0;

        /* JADX INFO: renamed from: G0 */
        public final boolean f129614G0;

        /* JADX INFO: renamed from: H0 */
        public final boolean f129615H0;

        /* JADX INFO: renamed from: I0 */
        public final boolean f129616I0;

        /* JADX INFO: renamed from: J0 */
        public final boolean f129617J0;

        /* JADX INFO: renamed from: K0 */
        public final boolean f129618K0;

        /* JADX INFO: renamed from: L0 */
        public final boolean f129619L0;

        /* JADX INFO: renamed from: M0 */
        public final boolean f129620M0;

        /* JADX INFO: renamed from: N0 */
        public final boolean f129621N0;

        /* JADX INFO: renamed from: O0 */
        public final boolean f129622O0;

        /* JADX INFO: renamed from: P0 */
        public final boolean f129623P0;

        /* JADX INFO: renamed from: Q0 */
        public final boolean f129624Q0;

        /* JADX INFO: renamed from: R0 */
        public final boolean f129625R0;

        /* JADX INFO: renamed from: S0 */
        public final boolean f129626S0;

        /* JADX INFO: renamed from: T0 */
        public final SparseArray<Map<b6j0, C18297e>> f129627T0;

        /* JADX INFO: renamed from: U0 */
        public final SparseBooleanArray f129628U0;

        static {
            C18296d c18296dMo151309A = new a().mo151309A();
            f129592V0 = c18296dMo151309A;
            f129593W0 = c18296dMo151309A;
            f129594X0 = vck0.m197903z0(1000);
            f129595Y0 = vck0.m197903z0(1001);
            f129596Z0 = vck0.m197903z0(1002);
            f129597a1 = vck0.m197903z0(1003);
            f129598b1 = vck0.m197903z0(1004);
            f129599c1 = vck0.m197903z0(1005);
            f129600d1 = vck0.m197903z0(1006);
            f129601e1 = vck0.m197903z0(1007);
            f129602f1 = vck0.m197903z0(1008);
            f129603g1 = vck0.m197903z0(1009);
            f129604h1 = vck0.m197903z0(1010);
            f129605i1 = vck0.m197903z0(1011);
            f129606j1 = vck0.m197903z0(1012);
            f129607k1 = vck0.m197903z0(1013);
            f129608l1 = vck0.m197903z0(1014);
            f129609m1 = vck0.m197903z0(1015);
            f129610n1 = vck0.m197903z0(1016);
            f129611o1 = vck0.m197903z0(1017);
            f129612p1 = new InterfaceC1863e.a() { // from class: l.mrd
                @Override // com.google.android.exoplayer2.InterfaceC1863e.a
                /* JADX INFO: renamed from: a */
                public final InterfaceC1863e mo9980a(Bundle bundle) {
                    return new lrd.C18296d.a(bundle).mo151309A();
                }
            };
        }

        public C18296d(a aVar) {
            super(aVar);
            this.f129613F0 = aVar.f129629A;
            this.f129614G0 = aVar.f129630B;
            this.f129615H0 = aVar.f129631C;
            this.f129616I0 = aVar.f129632D;
            this.f129617J0 = aVar.f129633E;
            this.f129618K0 = aVar.f129634F;
            this.f129619L0 = aVar.f129635G;
            this.f129620M0 = aVar.f129636H;
            this.f129621N0 = aVar.f129637I;
            this.f129622O0 = aVar.f129638J;
            this.f129623P0 = aVar.f129639K;
            this.f129624Q0 = aVar.f129640L;
            this.f129625R0 = aVar.f129641M;
            this.f129626S0 = aVar.f129642N;
            this.f129627T0 = aVar.f129643O;
            this.f129628U0 = aVar.f129644P;
        }

        /* JADX INFO: renamed from: F */
        public static boolean m151263F(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
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
        public static boolean m151264G(SparseArray<Map<b6j0, C18297e>> sparseArray, SparseArray<Map<b6j0, C18297e>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (iIndexOfKey < 0 || !m151265H(sparseArray.valueAt(i), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: H */
        public static boolean m151265H(Map<b6j0, C18297e> map, Map<b6j0, C18297e> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<b6j0, C18297e> entry : map.entrySet()) {
                b6j0 key = entry.getKey();
                if (!map2.containsKey(key) || !vck0.m197845c(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: J */
        public static C18296d m151266J(Context context) {
            return new a(context).mo151309A();
        }

        /* JADX INFO: renamed from: K */
        public static int[] m151267K(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i = 0; i < sparseBooleanArray.size(); i++) {
                iArr[i] = sparseBooleanArray.keyAt(i);
            }
            return iArr;
        }

        /* JADX INFO: renamed from: O */
        public static void m151268O(Bundle bundle, SparseArray<Map<b6j0, C18297e>> sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i = 0; i < sparseArray.size(); i++) {
                int iKeyAt = sparseArray.keyAt(i);
                for (Map.Entry<b6j0, C18297e> entry : sparseArray.valueAt(i).entrySet()) {
                    C18297e value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(iKeyAt));
                }
                bundle.putIntArray(f129604h1, Ints.m16469n(arrayList));
                bundle.putParcelableArrayList(f129605i1, oi3.m164500i(arrayList2));
                bundle.putSparseParcelableArray(f129606j1, oi3.m164501j(sparseArray2));
            }
        }

        @Override // p149l.w6j0
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public a mo151287A() {
            return new a();
        }

        /* JADX INFO: renamed from: L */
        public boolean m151289L(int i) {
            return this.f129628U0.get(i);
        }

        @Nullable
        @Deprecated
        /* JADX INFO: renamed from: M */
        public C18297e m151290M(int i, b6j0 b6j0Var) {
            Map<b6j0, C18297e> map = this.f129627T0.get(i);
            if (map != null) {
                return map.get(b6j0Var);
            }
            return null;
        }

        @Deprecated
        /* JADX INFO: renamed from: N */
        public boolean m151291N(int i, b6j0 b6j0Var) {
            Map<b6j0, C18297e> map = this.f129627T0.get(i);
            return map != null && map.containsKey(b6j0Var);
        }

        @Override // p149l.w6j0
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C18296d.class == obj.getClass()) {
                C18296d c18296d = (C18296d) obj;
                if (super.equals(c18296d) && this.f129613F0 == c18296d.f129613F0 && this.f129614G0 == c18296d.f129614G0 && this.f129615H0 == c18296d.f129615H0 && this.f129616I0 == c18296d.f129616I0 && this.f129617J0 == c18296d.f129617J0 && this.f129618K0 == c18296d.f129618K0 && this.f129619L0 == c18296d.f129619L0 && this.f129620M0 == c18296d.f129620M0 && this.f129621N0 == c18296d.f129621N0 && this.f129622O0 == c18296d.f129622O0 && this.f129623P0 == c18296d.f129623P0 && this.f129624Q0 == c18296d.f129624Q0 && this.f129625R0 == c18296d.f129625R0 && this.f129626S0 == c18296d.f129626S0 && m151263F(this.f129628U0, c18296d.f129628U0) && m151264G(this.f129627T0, c18296d.f129627T0)) {
                    return true;
                }
            }
            return false;
        }

        @Override // p149l.w6j0
        public int hashCode() {
            return ((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f129613F0 ? 1 : 0)) * 31) + (this.f129614G0 ? 1 : 0)) * 31) + (this.f129615H0 ? 1 : 0)) * 31) + (this.f129616I0 ? 1 : 0)) * 31) + (this.f129617J0 ? 1 : 0)) * 31) + (this.f129618K0 ? 1 : 0)) * 31) + (this.f129619L0 ? 1 : 0)) * 31) + (this.f129620M0 ? 1 : 0)) * 31) + (this.f129621N0 ? 1 : 0)) * 31) + (this.f129622O0 ? 1 : 0)) * 31) + (this.f129623P0 ? 1 : 0)) * 31) + (this.f129624Q0 ? 1 : 0)) * 31) + (this.f129625R0 ? 1 : 0)) * 31) + (this.f129626S0 ? 1 : 0);
        }

        @Override // p149l.w6j0, com.google.android.exoplayer2.InterfaceC1863e
        public Bundle toBundle() {
            Bundle bundle = super.toBundle();
            bundle.putBoolean(f129594X0, this.f129613F0);
            bundle.putBoolean(f129595Y0, this.f129614G0);
            bundle.putBoolean(f129596Z0, this.f129615H0);
            bundle.putBoolean(f129608l1, this.f129616I0);
            bundle.putBoolean(f129597a1, this.f129617J0);
            bundle.putBoolean(f129598b1, this.f129618K0);
            bundle.putBoolean(f129599c1, this.f129619L0);
            bundle.putBoolean(f129600d1, this.f129620M0);
            bundle.putBoolean(f129609m1, this.f129621N0);
            bundle.putBoolean(f129610n1, this.f129622O0);
            bundle.putBoolean(f129601e1, this.f129623P0);
            bundle.putBoolean(f129602f1, this.f129624Q0);
            bundle.putBoolean(f129603g1, this.f129625R0);
            bundle.putBoolean(f129611o1, this.f129626S0);
            m151268O(bundle, this.f129627T0);
            bundle.putIntArray(f129607k1, m151267K(this.f129628U0));
            return bundle;
        }

        /* JADX INFO: renamed from: l.lrd$d$a */
        public static final class a extends w6j0.C20812a {

            /* JADX INFO: renamed from: A */
            public boolean f129629A;

            /* JADX INFO: renamed from: B */
            public boolean f129630B;

            /* JADX INFO: renamed from: C */
            public boolean f129631C;

            /* JADX INFO: renamed from: D */
            public boolean f129632D;

            /* JADX INFO: renamed from: E */
            public boolean f129633E;

            /* JADX INFO: renamed from: F */
            public boolean f129634F;

            /* JADX INFO: renamed from: G */
            public boolean f129635G;

            /* JADX INFO: renamed from: H */
            public boolean f129636H;

            /* JADX INFO: renamed from: I */
            public boolean f129637I;

            /* JADX INFO: renamed from: J */
            public boolean f129638J;

            /* JADX INFO: renamed from: K */
            public boolean f129639K;

            /* JADX INFO: renamed from: L */
            public boolean f129640L;

            /* JADX INFO: renamed from: M */
            public boolean f129641M;

            /* JADX INFO: renamed from: N */
            public boolean f129642N;

            /* JADX INFO: renamed from: O */
            public final SparseArray<Map<b6j0, C18297e>> f129643O;

            /* JADX INFO: renamed from: P */
            public final SparseBooleanArray f129644P;

            public a(Bundle bundle) {
                super(bundle);
                m151323f0();
                C18296d c18296d = C18296d.f129592V0;
                m151338u0(bundle.getBoolean(C18296d.f129594X0, c18296d.f129613F0));
                m151333p0(bundle.getBoolean(C18296d.f129595Y0, c18296d.f129614G0));
                m151334q0(bundle.getBoolean(C18296d.f129596Z0, c18296d.f129615H0));
                m151332o0(bundle.getBoolean(C18296d.f129608l1, c18296d.f129616I0));
                m151336s0(bundle.getBoolean(C18296d.f129597a1, c18296d.f129617J0));
                m151328k0(bundle.getBoolean(C18296d.f129598b1, c18296d.f129618K0));
                m151329l0(bundle.getBoolean(C18296d.f129599c1, c18296d.f129619L0));
                m151326i0(bundle.getBoolean(C18296d.f129600d1, c18296d.f129620M0));
                m151327j0(bundle.getBoolean(C18296d.f129609m1, c18296d.f129621N0));
                m151335r0(bundle.getBoolean(C18296d.f129610n1, c18296d.f129622O0));
                m151337t0(bundle.getBoolean(C18296d.f129601e1, c18296d.f129623P0));
                m151312B0(bundle.getBoolean(C18296d.f129602f1, c18296d.f129624Q0));
                m151331n0(bundle.getBoolean(C18296d.f129603g1, c18296d.f129625R0));
                m151330m0(bundle.getBoolean(C18296d.f129611o1, c18296d.f129626S0));
                this.f129643O = new SparseArray<>();
                m151343z0(bundle);
                this.f129644P = m151324g0(bundle.getIntArray(C18296d.f129607k1));
            }

            /* JADX INFO: renamed from: e0 */
            public static SparseArray<Map<b6j0, C18297e>> m151308e0(SparseArray<Map<b6j0, C18297e>> sparseArray) {
                SparseArray<Map<b6j0, C18297e>> sparseArray2 = new SparseArray<>();
                for (int i = 0; i < sparseArray.size(); i++) {
                    sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
                }
                return sparseArray2;
            }

            @Override // p149l.w6j0.C20812a
            /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
            public a mo151318J(int i, boolean z) {
                super.mo151318J(i, z);
                return this;
            }

            /* JADX INFO: renamed from: B0 */
            public a m151312B0(boolean z) {
                this.f129640L = z;
                return this;
            }

            @Override // p149l.w6j0.C20812a
            /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
            public a mo151319K(int i, int i2, boolean z) {
                super.mo151319K(i, i2, z);
                return this;
            }

            @Override // p149l.w6j0.C20812a
            /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
            public a mo151320L(Context context, boolean z) {
                super.mo151320L(context, z);
                return this;
            }

            @Override // p149l.w6j0.C20812a
            /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
            public C18296d mo151309A() {
                return new C18296d(this);
            }

            @Override // p149l.w6j0.C20812a
            /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
            public a mo151311B(int i) {
                super.mo151311B(i);
                return this;
            }

            /* JADX INFO: renamed from: f0 */
            public final void m151323f0() {
                this.f129629A = true;
                this.f129630B = false;
                this.f129631C = true;
                this.f129632D = false;
                this.f129633E = true;
                this.f129634F = false;
                this.f129635G = false;
                this.f129636H = false;
                this.f129637I = false;
                this.f129638J = true;
                this.f129639K = true;
                this.f129640L = false;
                this.f129641M = true;
                this.f129642N = false;
            }

            /* JADX INFO: renamed from: g0 */
            public final SparseBooleanArray m151324g0(@Nullable int[] iArr) {
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
            public a m151325h0(w6j0 w6j0Var) {
                super.m201882E(w6j0Var);
                return this;
            }

            /* JADX INFO: renamed from: i0 */
            public a m151326i0(boolean z) {
                this.f129636H = z;
                return this;
            }

            /* JADX INFO: renamed from: j0 */
            public a m151327j0(boolean z) {
                this.f129637I = z;
                return this;
            }

            /* JADX INFO: renamed from: k0 */
            public a m151328k0(boolean z) {
                this.f129634F = z;
                return this;
            }

            /* JADX INFO: renamed from: l0 */
            public a m151329l0(boolean z) {
                this.f129635G = z;
                return this;
            }

            /* JADX INFO: renamed from: m0 */
            public a m151330m0(boolean z) {
                this.f129642N = z;
                return this;
            }

            /* JADX INFO: renamed from: n0 */
            public a m151331n0(boolean z) {
                this.f129641M = z;
                return this;
            }

            /* JADX INFO: renamed from: o0 */
            public a m151332o0(boolean z) {
                this.f129632D = z;
                return this;
            }

            /* JADX INFO: renamed from: p0 */
            public a m151333p0(boolean z) {
                this.f129630B = z;
                return this;
            }

            /* JADX INFO: renamed from: q0 */
            public a m151334q0(boolean z) {
                this.f129631C = z;
                return this;
            }

            /* JADX INFO: renamed from: r0 */
            public a m151335r0(boolean z) {
                this.f129638J = z;
                return this;
            }

            /* JADX INFO: renamed from: s0 */
            public a m151336s0(boolean z) {
                this.f129633E = z;
                return this;
            }

            /* JADX INFO: renamed from: t0 */
            public a m151337t0(boolean z) {
                this.f129639K = z;
                return this;
            }

            /* JADX INFO: renamed from: u0 */
            public a m151338u0(boolean z) {
                this.f129629A = z;
                return this;
            }

            @Override // p149l.w6j0.C20812a
            /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
            public a mo151315F(int i) {
                super.mo151315F(i);
                return this;
            }

            @Override // p149l.w6j0.C20812a
            /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
            public a mo151316G(u6j0 u6j0Var) {
                super.mo151316G(u6j0Var);
                return this;
            }

            @Override // p149l.w6j0.C20812a
            /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
            public a mo151317H(Context context) {
                super.mo151317H(context);
                return this;
            }

            @Deprecated
            /* JADX INFO: renamed from: y0 */
            public a m151342y0(int i, b6j0 b6j0Var, @Nullable C18297e c18297e) {
                Map<b6j0, C18297e> map = this.f129643O.get(i);
                if (map == null) {
                    map = new HashMap<>();
                    this.f129643O.put(i, map);
                }
                if (map.containsKey(b6j0Var) && vck0.m197845c(map.get(b6j0Var), c18297e)) {
                    return this;
                }
                map.put(b6j0Var, c18297e);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: z0 */
            public final void m151343z0(Bundle bundle) {
                int[] intArray = bundle.getIntArray(C18296d.f129604h1);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(C18296d.f129605i1);
                ImmutableList immutableListM15685of = parcelableArrayList == null ? ImmutableList.m15685of() : oi3.m164495d(b6j0.f73825f, parcelableArrayList);
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(C18296d.f129606j1);
                SparseArray sparseArray = sparseParcelableArray == null ? new SparseArray() : oi3.m164496e(C18297e.f129648h, sparseParcelableArray);
                if (intArray == null || intArray.length != immutableListM15685of.size()) {
                    return;
                }
                for (int i = 0; i < intArray.length; i++) {
                    m151342y0(intArray[i], (b6j0) immutableListM15685of.get(i), (C18297e) sparseArray.get(i));
                }
            }

            @Deprecated
            public a() {
                this.f129643O = new SparseArray<>();
                this.f129644P = new SparseBooleanArray();
                m151323f0();
            }

            public a(Context context) {
                super(context);
                this.f129643O = new SparseArray<>();
                this.f129644P = new SparseBooleanArray();
                m151323f0();
            }

            public a(C18296d c18296d) {
                super(c18296d);
                this.f129629A = c18296d.f129613F0;
                this.f129630B = c18296d.f129614G0;
                this.f129631C = c18296d.f129615H0;
                this.f129632D = c18296d.f129616I0;
                this.f129633E = c18296d.f129617J0;
                this.f129634F = c18296d.f129618K0;
                this.f129635G = c18296d.f129619L0;
                this.f129636H = c18296d.f129620M0;
                this.f129637I = c18296d.f129621N0;
                this.f129638J = c18296d.f129622O0;
                this.f129639K = c18296d.f129623P0;
                this.f129640L = c18296d.f129624Q0;
                this.f129641M = c18296d.f129625R0;
                this.f129642N = c18296d.f129626S0;
                this.f129643O = m151308e0(c18296d.f129627T0);
                this.f129644P = c18296d.f129628U0.clone();
            }
        }
    }
}
