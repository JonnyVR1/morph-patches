package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import p153l.xr0;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationUtilKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Name f64747a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Name f64748b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Name f64749c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Name f64750d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Name f64751e;

    static {
        Name nameM91970i = Name.m91970i("message");
        nameM91970i.getClass();
        f64747a = nameM91970i;
        Name nameM91970i2 = Name.m91970i("replaceWith");
        nameM91970i2.getClass();
        f64748b = nameM91970i2;
        Name nameM91970i3 = Name.m91970i(FirebaseAnalytics.Param.LEVEL);
        nameM91970i3.getClass();
        f64749c = nameM91970i3;
        Name nameM91970i4 = Name.m91970i("expression");
        nameM91970i4.getClass();
        f64750d = nameM91970i4;
        Name nameM91970i5 = Name.m91970i("imports");
        nameM91970i5.getClass();
        f64751e = nameM91970i5;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final AnnotationDescriptor m89526b(@NotNull KotlinBuiltIns kotlinBuiltIns, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        kotlinBuiltIns.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        BuiltInAnnotationDescriptor builtInAnnotationDescriptor = new BuiltInAnnotationDescriptor(kotlinBuiltIns, StandardNames.FqNames.f64509A, MapsKt.mapOf(TuplesKt.m88129a(f64750d, new StringValue(str2)), TuplesKt.m88129a(f64751e, new ArrayValue(CollectionsKt.emptyList(), new xr0(kotlinBuiltIns)))), false, 8, null);
        FqName fqName = StandardNames.FqNames.f64602x;
        Pair pairM88129a = TuplesKt.m88129a(f64747a, new StringValue(str));
        Pair pairM88129a2 = TuplesKt.m88129a(f64748b, new AnnotationValue(builtInAnnotationDescriptor));
        Name name = f64749c;
        ClassId classIdM91936c = ClassId.Companion.m91936c(StandardNames.FqNames.f64606z);
        Name nameM91970i = Name.m91970i(str3);
        nameM91970i.getClass();
        return new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, MapsKt.mapOf(pairM88129a, pairM88129a2, TuplesKt.m88129a(name, new EnumValue(classIdM91936c, nameM91970i))), z);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ AnnotationDescriptor m89527c(KotlinBuiltIns kotlinBuiltIns, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "WARNING";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return m89526b(kotlinBuiltIns, str, str2, str3, z);
    }

    /* JADX INFO: renamed from: d */
    public static final KotlinType m89528d(KotlinBuiltIns kotlinBuiltIns, ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        SimpleType simpleTypeM89127m = moduleDescriptor.mo89437f().m89127m(Variance.INVARIANT, kotlinBuiltIns.m89116X());
        simpleTypeM89127m.getClass();
        return simpleTypeM89127m;
    }
}
