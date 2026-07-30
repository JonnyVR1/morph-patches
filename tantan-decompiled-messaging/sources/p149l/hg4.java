package p149l;

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
public final class hg4 implements TypeParameterDescriptor {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TypeParameterDescriptor f107559a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final DeclarationDescriptor f107560b;

    /* JADX INFO: renamed from: c */
    public final int f107561c;

    public hg4(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull DeclarationDescriptor declarationDescriptor, int i) {
        typeParameterDescriptor.getClass();
        declarationDescriptor.getClass();
        this.f107559a = typeParameterDescriptor;
        this.f107560b = declarationDescriptor;
        this.f107561c = i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    /* JADX INFO: renamed from: A */
    public boolean mo88599A() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: S */
    public <R, D> R mo88464S(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return (R) this.f107559a.mo88464S(declarationDescriptorVisitor, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    /* JADX INFO: renamed from: Z */
    public StorageManager mo88600Z() {
        StorageManager storageManagerMo88600Z = this.f107559a.mo88600Z();
        storageManagerMo88600Z.getClass();
        return storageManagerMo88600Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    public TypeParameterDescriptor mo88445a() {
        TypeParameterDescriptor typeParameterDescriptorMo88445a = this.f107559a.mo88445a();
        typeParameterDescriptorMo88445a.getClass();
        return typeParameterDescriptorMo88445a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: b */
    public DeclarationDescriptor mo88299b() {
        return this.f107560b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.f107559a.getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public int getIndex() {
        return this.f107561c + this.f107559a.getIndex();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        Name name = this.f107559a.getName();
        name.getClass();
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        SourceElement source = this.f107559a.getSource();
        source.getClass();
        return source;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    public List<KotlinType> getUpperBounds() {
        List<KotlinType> upperBounds = this.f107559a.getUpperBounds();
        upperBounds.getClass();
        return upperBounds;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    /* JADX INFO: renamed from: h */
    public Variance mo88601h() {
        Variance varianceMo88601h = this.f107559a.mo88601h();
        varianceMo88601h.getClass();
        return varianceMo88601h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* JADX INFO: renamed from: l */
    public TypeConstructor mo88305l() {
        TypeConstructor typeConstructorMo88305l = this.f107559a.mo88305l();
        typeConstructorMo88305l.getClass();
        return typeConstructorMo88305l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* JADX INFO: renamed from: o */
    public SimpleType mo88458o() {
        SimpleType simpleTypeMo88458o = this.f107559a.mo88458o();
        simpleTypeMo88458o.getClass();
        return simpleTypeMo88458o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    /* JADX INFO: renamed from: s */
    public boolean mo88602s() {
        return this.f107559a.mo88602s();
    }

    @NotNull
    public String toString() {
        return this.f107559a + "[inner-copy]";
    }
}
