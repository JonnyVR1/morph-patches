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
    public static final FqName f64716a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final FqName f64717b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final FqName f64718c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final FqName f64719d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final FqName f64720e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final FqName f64721f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final FqName f64722g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final FqName f64723h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final FqName f64724i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final FqName f64725j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final FqName f64726k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final FqName f64727l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final FqName f64728m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final FqName f64729n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final FqName f64730o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final FqName f64731p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final Set<FqName> f64732q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final Set<FqName> f64733r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public static final Set<FqName> f64734s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public static final Set<FqName> f64735t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public static final Set<FqName> f64736u;

    /* JADX INFO: renamed from: v */
    @NotNull
    public static final Set<FqName> f64737v;

    /* JADX INFO: renamed from: w */
    @NotNull
    public static final Set<FqName> f64738w;

    /* JADX INFO: renamed from: x */
    @NotNull
    public static final Map<FqName, FqName> f64739x;

    /* JADX INFO: renamed from: y */
    @NotNull
    public static final FqName f64740y;

    static {
        FqName fqName = new FqName("org.jspecify.nullness.Nullable");
        f64716a = fqName;
        FqName fqName2 = new FqName("org.jspecify.nullness.NullMarked");
        f64717b = fqName2;
        FqName fqName3 = new FqName("org.jspecify.nullness.NullnessUnspecified");
        f64718c = fqName3;
        FqName fqName4 = new FqName("org.jspecify.annotations.NonNull");
        f64719d = fqName4;
        FqName fqName5 = new FqName("org.jspecify.annotations.Nullable");
        f64720e = fqName5;
        FqName fqName6 = new FqName("org.jspecify.annotations.NullMarked");
        f64721f = fqName6;
        FqName fqName7 = new FqName("org.jspecify.annotations.NullnessUnspecified");
        f64722g = fqName7;
        FqName fqName8 = new FqName("org.jspecify.annotations.NullUnmarked");
        f64723h = fqName8;
        f64724i = new FqName("javax.annotation.meta.TypeQualifier");
        f64725j = new FqName("javax.annotation.meta.TypeQualifierNickname");
        f64726k = new FqName("javax.annotation.meta.TypeQualifierDefault");
        FqName fqName9 = new FqName("javax.annotation.Nonnull");
        f64727l = fqName9;
        FqName fqName10 = new FqName("javax.annotation.Nullable");
        f64728m = fqName10;
        FqName fqName11 = new FqName("javax.annotation.CheckForNull");
        f64729n = fqName11;
        f64730o = new FqName("javax.annotation.ParametersAreNonnullByDefault");
        f64731p = new FqName("javax.annotation.ParametersAreNullableByDefault");
        f64732q = SetsKt.setOf((Object[]) new FqName[]{fqName9, fqName11});
        FqName fqName12 = JvmAnnotationNames.f64704l;
        fqName12.getClass();
        Set<FqName> of = SetsKt.setOf((Object[]) new FqName[]{fqName12, fqName4, new FqName("android.annotation.NonNull"), new FqName("androidx.annotation.NonNull"), new FqName("androidx.annotation.RecentlyNonNull"), new FqName("androidx.annotation.NonNull"), new FqName("com.android.annotations.NonNull"), new FqName("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new FqName("org.checkerframework.checker.nullness.qual.NonNull"), new FqName("edu.umd.cs.findbugs.annotations.NonNull"), new FqName("io.reactivex.annotations.NonNull"), new FqName("io.reactivex.rxjava3.annotations.NonNull"), new FqName("org.eclipse.jdt.annotation.NonNull"), new FqName("lombok.NonNull"), new FqName("jakarta.annotation.Nonnull")});
        f64733r = of;
        FqName fqName13 = JvmAnnotationNames.f64705m;
        fqName13.getClass();
        Set<FqName> of2 = SetsKt.setOf((Object[]) new FqName[]{fqName13, fqName, fqName5, fqName10, fqName11, new FqName("android.annotation.Nullable"), new FqName("androidx.annotation.Nullable"), new FqName("androidx.annotation.RecentlyNullable"), new FqName("androidx.annotation.Nullable"), new FqName("com.android.annotations.Nullable"), new FqName("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new FqName("org.checkerframework.checker.nullness.qual.Nullable"), new FqName("edu.umd.cs.findbugs.annotations.Nullable"), new FqName("edu.umd.cs.findbugs.annotations.PossiblyNull"), new FqName("edu.umd.cs.findbugs.annotations.CheckForNull"), new FqName("io.reactivex.annotations.Nullable"), new FqName("io.reactivex.rxjava3.annotations.Nullable"), new FqName("org.eclipse.jdt.annotation.Nullable"), new FqName("jakarta.annotation.Nullable")});
        f64734s = of2;
        f64735t = SetsKt.setOf((Object[]) new FqName[]{fqName3, fqName7});
        f64736u = SetsKt.plus((Set<? extends FqName>) SetsKt.plus((Set<? extends FqName>) SetsKt.plus((Set<? extends FqName>) SetsKt.plus((Set<? extends FqName>) SetsKt.plus(SetsKt.plus((Set) new LinkedHashSet(), (Iterable) of), (Iterable) of2), fqName9), fqName2), fqName6), fqName8);
        f64737v = SetsKt.setOf((Object[]) new FqName[]{JvmAnnotationNames.f64707o, JvmAnnotationNames.f64708p});
        f64738w = SetsKt.setOf((Object[]) new FqName[]{JvmAnnotationNames.f64706n, JvmAnnotationNames.f64709q});
        f64739x = MapsKt.mapOf(TuplesKt.m87240a(JvmAnnotationNames.f64696d, StandardNames.FqNames.f63847G), TuplesKt.m87240a(JvmAnnotationNames.f64698f, StandardNames.FqNames.f63855K), TuplesKt.m87240a(JvmAnnotationNames.f64700h, StandardNames.FqNames.f63928x), TuplesKt.m87240a(JvmAnnotationNames.f64701i, StandardNames.FqNames.f63863O));
        f64740y = new FqName("kotlin.annotations.jvm.UnderMigration");
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Set<FqName> m89437a() {
        return f64732q;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Set<FqName> m89438b() {
        return f64735t;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final FqName m89439c() {
        return f64727l;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final FqName m89440d() {
        return f64730o;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final FqName m89441e() {
        return f64731p;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final FqName m89442f() {
        return f64724i;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final FqName m89443g() {
        return f64726k;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final FqName m89444h() {
        return f64725j;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final FqName m89445i() {
        return f64721f;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final FqName m89446j() {
        return f64723h;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final FqName m89447k() {
        return f64717b;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final Set<FqName> m89448l() {
        return f64738w;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final Set<FqName> m89449m() {
        return f64733r;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static final Set<FqName> m89450n() {
        return f64734s;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static final Set<FqName> m89451o() {
        return f64737v;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public static final FqName m89452p() {
        return f64740y;
    }
}
