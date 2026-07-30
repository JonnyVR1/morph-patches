package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmAnnotationNamesKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FqName f65390a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final FqName f65391b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final FqName f65392c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final FqName f65393d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final FqName f65394e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final FqName f65395f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final FqName f65396g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final FqName f65397h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final FqName f65398i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final FqName f65399j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final FqName f65400k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final FqName f65401l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final FqName f65402m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final FqName f65403n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final FqName f65404o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final FqName f65405p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final Set<FqName> f65406q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final Set<FqName> f65407r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public static final Set<FqName> f65408s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public static final Set<FqName> f65409t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public static final Set<FqName> f65410u;

    /* JADX INFO: renamed from: v */
    @NotNull
    public static final Set<FqName> f65411v;

    /* JADX INFO: renamed from: w */
    @NotNull
    public static final Set<FqName> f65412w;

    /* JADX INFO: renamed from: x */
    @NotNull
    public static final Map<FqName, FqName> f65413x;

    /* JADX INFO: renamed from: y */
    @NotNull
    public static final FqName f65414y;

    static {
        FqName fqName = new FqName("org.jspecify.nullness.Nullable");
        f65390a = fqName;
        FqName fqName2 = new FqName("org.jspecify.nullness.NullMarked");
        f65391b = fqName2;
        FqName fqName3 = new FqName("org.jspecify.nullness.NullnessUnspecified");
        f65392c = fqName3;
        FqName fqName4 = new FqName("org.jspecify.annotations.NonNull");
        f65393d = fqName4;
        FqName fqName5 = new FqName("org.jspecify.annotations.Nullable");
        f65394e = fqName5;
        FqName fqName6 = new FqName("org.jspecify.annotations.NullMarked");
        f65395f = fqName6;
        FqName fqName7 = new FqName("org.jspecify.annotations.NullnessUnspecified");
        f65396g = fqName7;
        FqName fqName8 = new FqName("org.jspecify.annotations.NullUnmarked");
        f65397h = fqName8;
        f65398i = new FqName("javax.annotation.meta.TypeQualifier");
        f65399j = new FqName("javax.annotation.meta.TypeQualifierNickname");
        f65400k = new FqName("javax.annotation.meta.TypeQualifierDefault");
        FqName fqName9 = new FqName("javax.annotation.Nonnull");
        f65401l = fqName9;
        FqName fqName10 = new FqName("javax.annotation.Nullable");
        f65402m = fqName10;
        FqName fqName11 = new FqName("javax.annotation.CheckForNull");
        f65403n = fqName11;
        f65404o = new FqName("javax.annotation.ParametersAreNonnullByDefault");
        f65405p = new FqName("javax.annotation.ParametersAreNullableByDefault");
        f65406q = SetsKt.setOf((Object[]) new FqName[]{fqName9, fqName11});
        FqName fqName12 = JvmAnnotationNames.f65378l;
        fqName12.getClass();
        Set<FqName> of = SetsKt.setOf((Object[]) new FqName[]{fqName12, fqName4, new FqName("android.annotation.NonNull"), new FqName("androidx.annotation.NonNull"), new FqName("androidx.annotation.RecentlyNonNull"), new FqName("androidx.annotation.NonNull"), new FqName("com.android.annotations.NonNull"), new FqName("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new FqName("org.checkerframework.checker.nullness.qual.NonNull"), new FqName("edu.umd.cs.findbugs.annotations.NonNull"), new FqName("io.reactivex.annotations.NonNull"), new FqName("io.reactivex.rxjava3.annotations.NonNull"), new FqName("org.eclipse.jdt.annotation.NonNull"), new FqName("lombok.NonNull"), new FqName("jakarta.annotation.Nonnull")});
        f65407r = of;
        FqName fqName13 = JvmAnnotationNames.f65379m;
        fqName13.getClass();
        Set<FqName> of2 = SetsKt.setOf((Object[]) new FqName[]{fqName13, fqName, fqName5, fqName10, fqName11, new FqName("android.annotation.Nullable"), new FqName("androidx.annotation.Nullable"), new FqName("androidx.annotation.RecentlyNullable"), new FqName("androidx.annotation.Nullable"), new FqName("com.android.annotations.Nullable"), new FqName("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new FqName("org.checkerframework.checker.nullness.qual.Nullable"), new FqName("edu.umd.cs.findbugs.annotations.Nullable"), new FqName("edu.umd.cs.findbugs.annotations.PossiblyNull"), new FqName("edu.umd.cs.findbugs.annotations.CheckForNull"), new FqName("io.reactivex.annotations.Nullable"), new FqName("io.reactivex.rxjava3.annotations.Nullable"), new FqName("org.eclipse.jdt.annotation.Nullable"), new FqName("jakarta.annotation.Nullable")});
        f65408s = of2;
        f65409t = SetsKt.setOf((Object[]) new FqName[]{fqName3, fqName7});
        f65410u = SetsKt.plus((Set<? extends FqName>) SetsKt.plus((Set<? extends FqName>) SetsKt.plus((Set<? extends FqName>) SetsKt.plus((Set<? extends FqName>) SetsKt.plus(SetsKt.plus((Set) new LinkedHashSet(), (Iterable) of), (Iterable) of2), fqName9), fqName2), fqName6), fqName8);
        f65411v = SetsKt.setOf((Object[]) new FqName[]{JvmAnnotationNames.f65381o, JvmAnnotationNames.f65382p});
        f65412w = SetsKt.setOf((Object[]) new FqName[]{JvmAnnotationNames.f65380n, JvmAnnotationNames.f65383q});
        f65413x = MapsKt.mapOf(TuplesKt.m88129a(JvmAnnotationNames.f65370d, StandardNames.FqNames.f64521G), TuplesKt.m88129a(JvmAnnotationNames.f65372f, StandardNames.FqNames.f64529K), TuplesKt.m88129a(JvmAnnotationNames.f65374h, StandardNames.FqNames.f64602x), TuplesKt.m88129a(JvmAnnotationNames.f65375i, StandardNames.FqNames.f64537O));
        f65414y = new FqName("kotlin.annotations.jvm.UnderMigration");
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Set<FqName> m90328a() {
        return f65406q;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Set<FqName> m90329b() {
        return f65409t;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final FqName m90330c() {
        return f65401l;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final FqName m90331d() {
        return f65404o;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final FqName m90332e() {
        return f65405p;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final FqName m90333f() {
        return f65398i;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final FqName m90334g() {
        return f65400k;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final FqName m90335h() {
        return f65399j;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final FqName m90336i() {
        return f65395f;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final FqName m90337j() {
        return f65397h;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final FqName m90338k() {
        return f65391b;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final Set<FqName> m90339l() {
        return f65412w;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final Set<FqName> m90340m() {
        return f65407r;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static final Set<FqName> m90341n() {
        return f65408s;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static final Set<FqName> m90342o() {
        return f65411v;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public static final FqName m90343p() {
        return f65414y;
    }
}
