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
    public static final FqName f65367a;

    /* JADX INFO: renamed from: b */
    public static final String f65368b;

    /* JADX INFO: renamed from: c */
    public static final Name f65369c;

    /* JADX INFO: renamed from: d */
    public static final FqName f65370d;

    /* JADX INFO: renamed from: e */
    public static final FqName f65371e;

    /* JADX INFO: renamed from: f */
    public static final FqName f65372f;

    /* JADX INFO: renamed from: g */
    public static final FqName f65373g;

    /* JADX INFO: renamed from: h */
    public static final FqName f65374h;

    /* JADX INFO: renamed from: i */
    public static final FqName f65375i;

    /* JADX INFO: renamed from: j */
    public static final FqName f65376j;

    /* JADX INFO: renamed from: k */
    public static final FqName f65377k;

    /* JADX INFO: renamed from: l */
    public static final FqName f65378l;

    /* JADX INFO: renamed from: m */
    public static final FqName f65379m;

    /* JADX INFO: renamed from: n */
    public static final FqName f65380n;

    /* JADX INFO: renamed from: o */
    public static final FqName f65381o;

    /* JADX INFO: renamed from: p */
    public static final FqName f65382p;

    /* JADX INFO: renamed from: q */
    public static final FqName f65383q;

    /* JADX INFO: renamed from: r */
    public static final FqName f65384r;

    /* JADX INFO: renamed from: s */
    public static final FqName f65385s;

    /* JADX INFO: renamed from: t */
    public static final FqName f65386t;

    /* JADX INFO: renamed from: u */
    public static final String f65387u;

    /* JADX INFO: renamed from: v */
    public static final FqName f65388v;

    /* JADX INFO: renamed from: w */
    public static final FqName f65389w;

    static {
        FqName fqName = new FqName("kotlin.Metadata");
        f65367a = fqName;
        f65368b = "L" + JvmClassName.m92907c(fqName).m92911f() + Constants.PACKNAME_END;
        f65369c = Name.m91970i("value");
        f65370d = new FqName(Target.class.getName());
        f65371e = new FqName(ElementType.class.getName());
        f65372f = new FqName(Retention.class.getName());
        f65373g = new FqName(RetentionPolicy.class.getName());
        f65374h = new FqName(Deprecated.class.getName());
        f65375i = new FqName(Documented.class.getName());
        f65376j = new FqName("java.lang.annotation.Repeatable");
        f65377k = new FqName(Override.class.getName());
        f65378l = new FqName("org.jetbrains.annotations.NotNull");
        f65379m = new FqName("org.jetbrains.annotations.Nullable");
        f65380n = new FqName("org.jetbrains.annotations.Mutable");
        f65381o = new FqName("org.jetbrains.annotations.ReadOnly");
        f65382p = new FqName("kotlin.annotations.jvm.ReadOnly");
        f65383q = new FqName("kotlin.annotations.jvm.Mutable");
        f65384r = new FqName("kotlin.jvm.PurelyImplements");
        f65385s = new FqName("kotlin.jvm.internal");
        FqName fqName2 = new FqName("kotlin.jvm.internal.SerializedIr");
        f65386t = fqName2;
        f65387u = "L" + JvmClassName.m92907c(fqName2).m92911f() + Constants.PACKNAME_END;
        f65388v = new FqName("kotlin.jvm.internal.EnhancedNullability");
        f65389w = new FqName("kotlin.jvm.internal.EnhancedMutability");
    }
}
