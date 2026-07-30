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
        public static FqName m88632a(@NotNull AnnotationDescriptor annotationDescriptor) {
            ClassDescriptor classDescriptorM91979l = DescriptorUtilsKt.m91979l(annotationDescriptor);
            if (classDescriptorM91979l != null) {
                if (ErrorUtils.m93003m(classDescriptorM91979l)) {
                    classDescriptorM91979l = null;
                }
                if (classDescriptorM91979l != null) {
                    return DescriptorUtilsKt.m91978k(classDescriptorM91979l);
                }
            }
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    Map<Name, ConstantValue<?>> mo88630a();

    @Nullable
    /* JADX INFO: renamed from: d */
    FqName mo88631d();

    @NotNull
    SourceElement getSource();

    @NotNull
    KotlinType getType();
}
