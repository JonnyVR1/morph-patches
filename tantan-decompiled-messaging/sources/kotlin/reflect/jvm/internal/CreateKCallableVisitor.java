package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies;
import org.jetbrains.annotations.NotNull;
import p149l.zwq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/CreateKCallableVisitor;", "Lkotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorVisitorEmptyBodies;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "data", "visitPropertyDescriptor", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "visitFunctionDescriptor", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "a", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public class CreateKCallableVisitor extends DeclarationDescriptorVisitorEmptyBodies<KCallableImpl<?>, Unit> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final KDeclarationContainerImpl container;

    public CreateKCallableVisitor(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl) {
        kDeclarationContainerImpl.getClass();
        this.container = kDeclarationContainerImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public KCallableImpl<?> mo87671l(@NotNull FunctionDescriptor functionDescriptor, @NotNull Unit unit) {
        functionDescriptor.getClass();
        unit.getClass();
        return new KFunctionImpl(this.container, functionDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public KCallableImpl<?> mo87670c(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Unit unit) {
        int i;
        propertyDescriptor.getClass();
        unit.getClass();
        List<ReceiverParameterDescriptor> listMo88450x0 = propertyDescriptor.mo88450x0();
        listMo88450x0.getClass();
        if (listMo88450x0.isEmpty()) {
            i = (propertyDescriptor.mo88444Y() != null ? 1 : 0) + (propertyDescriptor.mo88446b0() != null ? 1 : 0);
        } else {
            i = -1;
        }
        if (propertyDescriptor.mo88620y()) {
            if (i == -1) {
                return new KMutablePropertyNImpl(this.container, propertyDescriptor);
            }
            if (i == 0) {
                return new KMutableProperty0Impl(this.container, propertyDescriptor);
            }
            if (i == 1) {
                return new KMutableProperty1Impl(this.container, propertyDescriptor);
            }
            if (i == 2) {
                return new KMutableProperty2Impl(this.container, propertyDescriptor);
            }
        } else {
            if (i == -1) {
                return new KPropertyNImpl(this.container, propertyDescriptor);
            }
            if (i == 0) {
                return new KProperty0Impl(this.container, propertyDescriptor);
            }
            if (i == 1) {
                return new KProperty1Impl(this.container, propertyDescriptor);
            }
            if (i == 2) {
                return new KProperty2Impl(this.container, propertyDescriptor);
            }
        }
        zwq.m220685a("Unsupported property: ", propertyDescriptor);
        return null;
    }
}
