package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import p153l.yh3;

/* JADX INFO: loaded from: classes2.dex */
public final class BuiltInAnnotationDescriptor implements AnnotationDescriptor {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final KotlinBuiltIns f64755a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final FqName f64756b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Map<Name, ConstantValue<?>> f64757c;

    /* JADX INFO: renamed from: d */
    public final boolean f64758d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f64759e;

    /* JADX WARN: Multi-variable type inference failed */
    public BuiltInAnnotationDescriptor(@NotNull KotlinBuiltIns kotlinBuiltIns, @NotNull FqName fqName, @NotNull Map<Name, ? extends ConstantValue<?>> map, boolean z) {
        kotlinBuiltIns.getClass();
        fqName.getClass();
        map.getClass();
        this.f64755a = kotlinBuiltIns;
        this.f64756b = fqName;
        this.f64757c = map;
        this.f64758d = z;
        this.f64759e = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.PUBLICATION, new yh3(this));
    }

    /* JADX INFO: renamed from: c */
    public static final SimpleType m89538c(BuiltInAnnotationDescriptor builtInAnnotationDescriptor) {
        return builtInAnnotationDescriptor.f64755a.m89130p(builtInAnnotationDescriptor.mo89522d()).mo89349o();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    public Map<Name, ConstantValue<?>> mo89521a() {
        return this.f64757c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* JADX INFO: renamed from: d */
    public FqName mo89522d() {
        return this.f64756b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public SourceElement getSource() {
        SourceElement sourceElement = SourceElement.f64737a;
        sourceElement.getClass();
        return sourceElement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public KotlinType getType() {
        Object value = this.f64759e.getValue();
        value.getClass();
        return (KotlinType) value;
    }

    public /* synthetic */ BuiltInAnnotationDescriptor(KotlinBuiltIns kotlinBuiltIns, FqName fqName, Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kotlinBuiltIns, fqName, map, (i & 8) != 0 ? false : z);
    }
}
