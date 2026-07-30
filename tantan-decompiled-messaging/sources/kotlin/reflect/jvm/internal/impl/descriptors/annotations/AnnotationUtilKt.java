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
import p149l.sr0;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationUtilKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Name f64073a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Name f64074b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Name f64075c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Name f64076d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Name f64077e;

    static {
        Name nameM91079i = Name.m91079i("message");
        nameM91079i.getClass();
        f64073a = nameM91079i;
        Name nameM91079i2 = Name.m91079i("replaceWith");
        nameM91079i2.getClass();
        f64074b = nameM91079i2;
        Name nameM91079i3 = Name.m91079i(FirebaseAnalytics.Param.LEVEL);
        nameM91079i3.getClass();
        f64075c = nameM91079i3;
        Name nameM91079i4 = Name.m91079i("expression");
        nameM91079i4.getClass();
        f64076d = nameM91079i4;
        Name nameM91079i5 = Name.m91079i("imports");
        nameM91079i5.getClass();
        f64077e = nameM91079i5;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final AnnotationDescriptor m88635b(@NotNull KotlinBuiltIns kotlinBuiltIns, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        kotlinBuiltIns.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        BuiltInAnnotationDescriptor builtInAnnotationDescriptor = new BuiltInAnnotationDescriptor(kotlinBuiltIns, StandardNames.FqNames.f63835A, MapsKt.mapOf(TuplesKt.m87240a(f64076d, new StringValue(str2)), TuplesKt.m87240a(f64077e, new ArrayValue(CollectionsKt.emptyList(), new sr0(kotlinBuiltIns)))), false, 8, null);
        FqName fqName = StandardNames.FqNames.f63928x;
        Pair pairM87240a = TuplesKt.m87240a(f64073a, new StringValue(str));
        Pair pairM87240a2 = TuplesKt.m87240a(f64074b, new AnnotationValue(builtInAnnotationDescriptor));
        Name name = f64075c;
        ClassId classIdM91045c = ClassId.Companion.m91045c(StandardNames.FqNames.f63932z);
        Name nameM91079i = Name.m91079i(str3);
        nameM91079i.getClass();
        return new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, MapsKt.mapOf(pairM87240a, pairM87240a2, TuplesKt.m87240a(name, new EnumValue(classIdM91045c, nameM91079i))), z);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ AnnotationDescriptor m88636c(KotlinBuiltIns kotlinBuiltIns, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "WARNING";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return m88635b(kotlinBuiltIns, str, str2, str3, z);
    }

    /* JADX INFO: renamed from: d */
    public static final KotlinType m88637d(KotlinBuiltIns kotlinBuiltIns, ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        SimpleType simpleTypeM88236m = moduleDescriptor.mo88546f().m88236m(Variance.INVARIANT, kotlinBuiltIns.m88225X());
        simpleTypeM88236m.getClass();
        return simpleTypeM88236m;
    }
}
