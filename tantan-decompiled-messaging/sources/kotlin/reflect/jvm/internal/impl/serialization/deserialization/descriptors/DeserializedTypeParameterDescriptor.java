package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import p149l.qwd;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class DeserializedTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {

    /* JADX INFO: renamed from: k */
    @NotNull
    public final DeserializationContext f66155k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final ProtoBuf.TypeParameter f66156l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final DeserializedAnnotations f66157m;

    /* JADX WARN: Illegal instructions before constructor call */
    public DeserializedTypeParameterDescriptor(@NotNull DeserializationContext deserializationContext, @NotNull ProtoBuf.TypeParameter typeParameter, int i) {
        deserializationContext.getClass();
        typeParameter.getClass();
        StorageManager storageManagerM92185h = deserializationContext.m92185h();
        DeclarationDescriptor declarationDescriptorM92182e = deserializationContext.m92182e();
        Annotations annotationsM88641b = Annotations.Companion.m88641b();
        Name nameM92233b = NameResolverUtilKt.m92233b(deserializationContext.m92184g(), typeParameter.getName());
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        ProtoBuf.TypeParameter.Variance variance = typeParameter.getVariance();
        variance.getClass();
        super(storageManagerM92185h, declarationDescriptorM92182e, annotationsM88641b, nameM92233b, protoEnumFlags.m92247d(variance), typeParameter.getReified(), i, SourceElement.f64063a, SupertypeLoopChecker.EMPTY.INSTANCE);
        this.f66155k = deserializationContext;
        this.f66156l = typeParameter;
        this.f66157m = new DeserializedAnnotations(deserializationContext.m92185h(), new qwd(this));
    }

    /* JADX INFO: renamed from: G0 */
    public static final List m92432G0(DeserializedTypeParameterDescriptor deserializedTypeParameterDescriptor) {
        return CollectionsKt.toList(deserializedTypeParameterDescriptor.f66155k.m92180c().m92152d().mo90148d(deserializedTypeParameterDescriptor.f66156l, deserializedTypeParameterDescriptor.f66155k.m92184g()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    /* JADX INFO: renamed from: E0 */
    public List<KotlinType> mo88684E0() {
        List<ProtoBuf.Type> listM90916t = ProtoTypeTableUtilKt.m90916t(this.f66156l, this.f66155k.m92187j());
        if (listM90916t.isEmpty()) {
            return CollectionsKt.listOf(DescriptorUtilsKt.m91980m(this).m88249z());
        }
        List<ProtoBuf.Type> list = listM90916t;
        TypeDeserializer typeDeserializerM92186i = this.f66155k.m92186i();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(typeDeserializerM92186i.m92274u((ProtoBuf.Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public DeserializedAnnotations getAnnotations() {
        return this.f66157m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public Void mo88683D0(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
