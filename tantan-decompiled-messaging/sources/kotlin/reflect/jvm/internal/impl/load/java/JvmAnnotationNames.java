package kotlin.reflect.jvm.internal.impl.load.java;

import com.meituan.robust.Constants;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmAnnotationNames {

    /* JADX INFO: renamed from: a */
    public static final FqName f64693a;

    /* JADX INFO: renamed from: b */
    public static final String f64694b;

    /* JADX INFO: renamed from: c */
    public static final Name f64695c;

    /* JADX INFO: renamed from: d */
    public static final FqName f64696d;

    /* JADX INFO: renamed from: e */
    public static final FqName f64697e;

    /* JADX INFO: renamed from: f */
    public static final FqName f64698f;

    /* JADX INFO: renamed from: g */
    public static final FqName f64699g;

    /* JADX INFO: renamed from: h */
    public static final FqName f64700h;

    /* JADX INFO: renamed from: i */
    public static final FqName f64701i;

    /* JADX INFO: renamed from: j */
    public static final FqName f64702j;

    /* JADX INFO: renamed from: k */
    public static final FqName f64703k;

    /* JADX INFO: renamed from: l */
    public static final FqName f64704l;

    /* JADX INFO: renamed from: m */
    public static final FqName f64705m;

    /* JADX INFO: renamed from: n */
    public static final FqName f64706n;

    /* JADX INFO: renamed from: o */
    public static final FqName f64707o;

    /* JADX INFO: renamed from: p */
    public static final FqName f64708p;

    /* JADX INFO: renamed from: q */
    public static final FqName f64709q;

    /* JADX INFO: renamed from: r */
    public static final FqName f64710r;

    /* JADX INFO: renamed from: s */
    public static final FqName f64711s;

    /* JADX INFO: renamed from: t */
    public static final FqName f64712t;

    /* JADX INFO: renamed from: u */
    public static final String f64713u;

    /* JADX INFO: renamed from: v */
    public static final FqName f64714v;

    /* JADX INFO: renamed from: w */
    public static final FqName f64715w;

    static {
        FqName fqName = new FqName("kotlin.Metadata");
        f64693a = fqName;
        f64694b = "L" + JvmClassName.m92016c(fqName).m92020f() + Constants.PACKNAME_END;
        f64695c = Name.m91079i("value");
        f64696d = new FqName(Target.class.getName());
        f64697e = new FqName(ElementType.class.getName());
        f64698f = new FqName(Retention.class.getName());
        f64699g = new FqName(RetentionPolicy.class.getName());
        f64700h = new FqName(Deprecated.class.getName());
        f64701i = new FqName(Documented.class.getName());
        f64702j = new FqName("java.lang.annotation.Repeatable");
        f64703k = new FqName(Override.class.getName());
        f64704l = new FqName("org.jetbrains.annotations.NotNull");
        f64705m = new FqName("org.jetbrains.annotations.Nullable");
        f64706n = new FqName("org.jetbrains.annotations.Mutable");
        f64707o = new FqName("org.jetbrains.annotations.ReadOnly");
        f64708p = new FqName("kotlin.annotations.jvm.ReadOnly");
        f64709q = new FqName("kotlin.annotations.jvm.Mutable");
        f64710r = new FqName("kotlin.jvm.PurelyImplements");
        f64711s = new FqName("kotlin.jvm.internal");
        FqName fqName2 = new FqName("kotlin.jvm.internal.SerializedIr");
        f64712t = fqName2;
        f64713u = "L" + JvmClassName.m92016c(fqName2).m92020f() + Constants.PACKNAME_END;
        f64714v = new FqName("kotlin.jvm.internal.EnhancedNullability");
        f64715w = new FqName("kotlin.jvm.internal.EnhancedMutability");
    }
}
