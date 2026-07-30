package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationAndConstantLoaderImpl extends AbstractAnnotationLoader<AnnotationDescriptor> implements AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AnnotationDeserializer f66637b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationAndConstantLoaderImpl(@NotNull ModuleDescriptor moduleDescriptor, @NotNull NotFoundClasses notFoundClasses, @NotNull SerializerExtensionProtocol serializerExtensionProtocol) {
        super(serializerExtensionProtocol);
        moduleDescriptor.getClass();
        notFoundClasses.getClass();
        serializerExtensionProtocol.getClass();
        this.f66637b = new AnnotationDeserializer(moduleDescriptor, notFoundClasses);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public AnnotationDescriptor mo91045l(@NotNull ProtoBuf.Annotation annotation, @NotNull NameResolver nameResolver) {
        annotation.getClass();
        nameResolver.getClass();
        return this.f66637b.m93018a(annotation, nameResolver);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @Nullable
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public ConstantValue<?> mo91024k(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property property, @NotNull KotlinType kotlinType) {
        protoContainer.getClass();
        property.getClass();
        kotlinType.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @Nullable
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public ConstantValue<?> mo91023e(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property property, @NotNull KotlinType kotlinType) {
        protoContainer.getClass();
        property.getClass();
        kotlinType.getClass();
        ProtoBuf.Annotation.Argument.Value value = (ProtoBuf.Annotation.Argument.Value) ProtoBufUtilKt.m91786a(property, m93007n().m92992b());
        if (value == null) {
            return null;
        }
        return this.f66637b.m93023f(kotlinType, value, protoContainer.m93127b());
    }
}
