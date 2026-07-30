package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface AnnotationDescriptor {

    @SourceDebugExtension
    public static final class DefaultImpls {
        @Nullable
        /* JADX INFO: renamed from: a */
        public static FqName m89523a(@NotNull AnnotationDescriptor annotationDescriptor) {
            ClassDescriptor classDescriptorM92870l = DescriptorUtilsKt.m92870l(annotationDescriptor);
            if (classDescriptorM92870l != null) {
                if (ErrorUtils.m93894m(classDescriptorM92870l)) {
                    classDescriptorM92870l = null;
                }
                if (classDescriptorM92870l != null) {
                    return DescriptorUtilsKt.m92869k(classDescriptorM92870l);
                }
            }
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    Map<Name, ConstantValue<?>> mo89521a();

    @Nullable
    /* JADX INFO: renamed from: d */
    FqName mo89522d();

    @NotNull
    SourceElement getSource();

    @NotNull
    KotlinType getType();
}
