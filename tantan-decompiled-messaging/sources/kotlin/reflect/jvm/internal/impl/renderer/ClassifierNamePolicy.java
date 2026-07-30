package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface ClassifierNamePolicy {

    public static final class FULLY_QUALIFIED implements ClassifierNamePolicy {

        @NotNull
        public static final FULLY_QUALIFIED INSTANCE = new FULLY_QUALIFIED();

        private FULLY_QUALIFIED() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        @NotNull
        /* JADX INFO: renamed from: a */
        public String mo91421a(@NotNull ClassifierDescriptor classifierDescriptor, @NotNull DescriptorRenderer descriptorRenderer) {
            classifierDescriptor.getClass();
            descriptorRenderer.getClass();
            if (classifierDescriptor instanceof TypeParameterDescriptor) {
                Name name = ((TypeParameterDescriptor) classifierDescriptor).getName();
                name.getClass();
                return descriptorRenderer.mo91451T(name, false);
            }
            FqNameUnsafe fqNameUnsafeM91772m = DescriptorUtils.m91772m(classifierDescriptor);
            fqNameUnsafeM91772m.getClass();
            return descriptorRenderer.mo91450S(fqNameUnsafeM91772m);
        }
    }

    public static final class SHORT implements ClassifierNamePolicy {

        @NotNull
        public static final SHORT INSTANCE = new SHORT();

        private SHORT() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Named] */
        /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        @NotNull
        /* JADX INFO: renamed from: a */
        public String mo91421a(@NotNull ClassifierDescriptor classifierDescriptor, @NotNull DescriptorRenderer descriptorRenderer) {
            classifierDescriptor.getClass();
            descriptorRenderer.getClass();
            if (classifierDescriptor instanceof TypeParameterDescriptor) {
                Name name = ((TypeParameterDescriptor) classifierDescriptor).getName();
                name.getClass();
                return descriptorRenderer.mo91451T(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(classifierDescriptor.getName());
                classifierDescriptor = classifierDescriptor.mo88299b();
            } while (classifierDescriptor instanceof ClassDescriptor);
            return RenderingUtilsKt.m91705g(CollectionsKt.asReversedMutable(arrayList));
        }
    }

    public static final class SOURCE_CODE_QUALIFIED implements ClassifierNamePolicy {

        @NotNull
        public static final SOURCE_CODE_QUALIFIED INSTANCE = new SOURCE_CODE_QUALIFIED();

        private SOURCE_CODE_QUALIFIED() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        @NotNull
        /* JADX INFO: renamed from: a */
        public String mo91421a(@NotNull ClassifierDescriptor classifierDescriptor, @NotNull DescriptorRenderer descriptorRenderer) {
            classifierDescriptor.getClass();
            descriptorRenderer.getClass();
            return m91422b(classifierDescriptor);
        }

        /* JADX INFO: renamed from: b */
        public final String m91422b(ClassifierDescriptor classifierDescriptor) {
            Name name = classifierDescriptor.getName();
            name.getClass();
            String strM91701c = RenderingUtilsKt.m91701c(name);
            if (classifierDescriptor instanceof TypeParameterDescriptor) {
                return strM91701c;
            }
            DeclarationDescriptor declarationDescriptorMo88299b = classifierDescriptor.mo88299b();
            declarationDescriptorMo88299b.getClass();
            String strM91423c = m91423c(declarationDescriptorMo88299b);
            if (strM91423c == null || Intrinsics.m87488d(strM91423c, "")) {
                return strM91701c;
            }
            return strM91423c + '.' + strM91701c;
        }

        /* JADX INFO: renamed from: c */
        public final String m91423c(DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor instanceof ClassDescriptor) {
                return m91422b((ClassifierDescriptor) declarationDescriptor);
            }
            if (declarationDescriptor instanceof PackageFragmentDescriptor) {
                return RenderingUtilsKt.m91700b(((PackageFragmentDescriptor) declarationDescriptor).mo88562d().m91054i());
            }
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    String mo91421a(@NotNull ClassifierDescriptor classifierDescriptor, @NotNull DescriptorRenderer descriptorRenderer);
}
