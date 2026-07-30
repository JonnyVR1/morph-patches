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
import p153l.eyd;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class DeserializedTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {

    /* JADX INFO: renamed from: k */
    @NotNull
    public final DeserializationContext f66829k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final ProtoBuf.TypeParameter f66830l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final DeserializedAnnotations f66831m;

    /* JADX WARN: Illegal instructions before constructor call */
    public DeserializedTypeParameterDescriptor(@NotNull DeserializationContext deserializationContext, @NotNull ProtoBuf.TypeParameter typeParameter, int i) {
        deserializationContext.getClass();
        typeParameter.getClass();
        StorageManager storageManagerM93076h = deserializationContext.m93076h();
        DeclarationDescriptor declarationDescriptorM93073e = deserializationContext.m93073e();
        Annotations annotationsM89532b = Annotations.Companion.m89532b();
        Name nameM93124b = NameResolverUtilKt.m93124b(deserializationContext.m93075g(), typeParameter.getName());
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        ProtoBuf.TypeParameter.Variance variance = typeParameter.getVariance();
        variance.getClass();
        super(storageManagerM93076h, declarationDescriptorM93073e, annotationsM89532b, nameM93124b, protoEnumFlags.m93138d(variance), typeParameter.getReified(), i, SourceElement.f64737a, SupertypeLoopChecker.EMPTY.INSTANCE);
        this.f66829k = deserializationContext;
        this.f66830l = typeParameter;
        this.f66831m = new DeserializedAnnotations(deserializationContext.m93076h(), new eyd(this));
    }

    /* JADX INFO: renamed from: G0 */
    public static final List m93323G0(DeserializedTypeParameterDescriptor deserializedTypeParameterDescriptor) {
        return CollectionsKt.toList(deserializedTypeParameterDescriptor.f66829k.m93071c().m93043d().mo91039d(deserializedTypeParameterDescriptor.f66830l, deserializedTypeParameterDescriptor.f66829k.m93075g()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    /* JADX INFO: renamed from: E0 */
    public List<KotlinType> mo89575E0() {
        List<ProtoBuf.Type> listM91807t = ProtoTypeTableUtilKt.m91807t(this.f66830l, this.f66829k.m93078j());
        if (listM91807t.isEmpty()) {
            return CollectionsKt.listOf(DescriptorUtilsKt.m92871m(this).m89140z());
        }
        List<ProtoBuf.Type> list = listM91807t;
        TypeDeserializer typeDeserializerM93077i = this.f66829k.m93077i();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(typeDeserializerM93077i.m93165u((ProtoBuf.Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public DeserializedAnnotations getAnnotations() {
        return this.f66831m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public Void mo89574D0(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
