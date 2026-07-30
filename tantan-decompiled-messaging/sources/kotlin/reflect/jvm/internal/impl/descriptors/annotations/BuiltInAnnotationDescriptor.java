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
import p149l.kh3;

/* JADX INFO: loaded from: classes2.dex */
public final class BuiltInAnnotationDescriptor implements AnnotationDescriptor {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final KotlinBuiltIns f64081a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final FqName f64082b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Map<Name, ConstantValue<?>> f64083c;

    /* JADX INFO: renamed from: d */
    public final boolean f64084d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f64085e;

    /* JADX WARN: Multi-variable type inference failed */
    public BuiltInAnnotationDescriptor(@NotNull KotlinBuiltIns kotlinBuiltIns, @NotNull FqName fqName, @NotNull Map<Name, ? extends ConstantValue<?>> map, boolean z) {
        kotlinBuiltIns.getClass();
        fqName.getClass();
        map.getClass();
        this.f64081a = kotlinBuiltIns;
        this.f64082b = fqName;
        this.f64083c = map;
        this.f64084d = z;
        this.f64085e = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.PUBLICATION, new kh3(this));
    }

    /* JADX INFO: renamed from: c */
    public static final SimpleType m88647c(BuiltInAnnotationDescriptor builtInAnnotationDescriptor) {
        return builtInAnnotationDescriptor.f64081a.m88239p(builtInAnnotationDescriptor.mo88631d()).mo88458o();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    public Map<Name, ConstantValue<?>> mo88630a() {
        return this.f64083c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    /* JADX INFO: renamed from: d */
    public FqName mo88631d() {
        return this.f64082b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public SourceElement getSource() {
        SourceElement sourceElement = SourceElement.f64063a;
        sourceElement.getClass();
        return sourceElement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public KotlinType getType() {
        Object value = this.f64085e.getValue();
        value.getClass();
        return (KotlinType) value;
    }

    public /* synthetic */ BuiltInAnnotationDescriptor(KotlinBuiltIns kotlinBuiltIns, FqName fqName, Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kotlinBuiltIns, fqName, map, (i & 8) != 0 ? false : z);
    }
}
