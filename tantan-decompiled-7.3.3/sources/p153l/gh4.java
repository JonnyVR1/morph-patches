package p153l;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class gh4 implements TypeParameterDescriptor {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TypeParameterDescriptor f104065a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final DeclarationDescriptor f104066b;

    /* JADX INFO: renamed from: c */
    public final int f104067c;

    public gh4(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull DeclarationDescriptor declarationDescriptor, int i) {
        typeParameterDescriptor.getClass();
        declarationDescriptor.getClass();
        this.f104065a = typeParameterDescriptor;
        this.f104066b = declarationDescriptor;
        this.f104067c = i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    /* JADX INFO: renamed from: A */
    public boolean mo89490A() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: S */
    public <R, D> R mo89355S(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return (R) this.f104065a.mo89355S(declarationDescriptorVisitor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    /* JADX INFO: renamed from: Z */
    public StorageManager mo89491Z() {
        StorageManager storageManagerMo89491Z = this.f104065a.mo89491Z();
        storageManagerMo89491Z.getClass();
        return storageManagerMo89491Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    public TypeParameterDescriptor mo89336a() {
        TypeParameterDescriptor typeParameterDescriptorMo89336a = this.f104065a.mo89336a();
        typeParameterDescriptorMo89336a.getClass();
        return typeParameterDescriptorMo89336a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: b */
    public DeclarationDescriptor mo89190b() {
        return this.f104066b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.f104065a.getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public int getIndex() {
        return this.f104067c + this.f104065a.getIndex();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        Name name = this.f104065a.getName();
        name.getClass();
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        SourceElement source = this.f104065a.getSource();
        source.getClass();
        return source;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    public List<KotlinType> getUpperBounds() {
        List<KotlinType> upperBounds = this.f104065a.getUpperBounds();
        upperBounds.getClass();
        return upperBounds;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    /* JADX INFO: renamed from: h */
    public Variance mo89492h() {
        Variance varianceMo89492h = this.f104065a.mo89492h();
        varianceMo89492h.getClass();
        return varianceMo89492h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* JADX INFO: renamed from: l */
    public TypeConstructor mo89196l() {
        TypeConstructor typeConstructorMo89196l = this.f104065a.mo89196l();
        typeConstructorMo89196l.getClass();
        return typeConstructorMo89196l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* JADX INFO: renamed from: o */
    public SimpleType mo89349o() {
        SimpleType simpleTypeMo89349o = this.f104065a.mo89349o();
        simpleTypeMo89349o.getClass();
        return simpleTypeMo89349o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    /* JADX INFO: renamed from: s */
    public boolean mo89493s() {
        return this.f104065a.mo89493s();
    }

    @NotNull
    public String toString() {
        return this.f104065a + "[inner-copy]";
    }
}
