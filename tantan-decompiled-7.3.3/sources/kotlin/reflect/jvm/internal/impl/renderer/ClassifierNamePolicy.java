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
        public String mo92312a(@NotNull ClassifierDescriptor classifierDescriptor, @NotNull DescriptorRenderer descriptorRenderer) {
            classifierDescriptor.getClass();
            descriptorRenderer.getClass();
            if (classifierDescriptor instanceof TypeParameterDescriptor) {
                Name name = ((TypeParameterDescriptor) classifierDescriptor).getName();
                name.getClass();
                return descriptorRenderer.mo92342T(name, false);
            }
            FqNameUnsafe fqNameUnsafeM92663m = DescriptorUtils.m92663m(classifierDescriptor);
            fqNameUnsafeM92663m.getClass();
            return descriptorRenderer.mo92341S(fqNameUnsafeM92663m);
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
        public String mo92312a(@NotNull ClassifierDescriptor classifierDescriptor, @NotNull DescriptorRenderer descriptorRenderer) {
            classifierDescriptor.getClass();
            descriptorRenderer.getClass();
            if (classifierDescriptor instanceof TypeParameterDescriptor) {
                Name name = ((TypeParameterDescriptor) classifierDescriptor).getName();
                name.getClass();
                return descriptorRenderer.mo92342T(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(classifierDescriptor.getName());
                classifierDescriptor = classifierDescriptor.mo89190b();
            } while (classifierDescriptor instanceof ClassDescriptor);
            return RenderingUtilsKt.m92596g(CollectionsKt.asReversedMutable(arrayList));
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
        public String mo92312a(@NotNull ClassifierDescriptor classifierDescriptor, @NotNull DescriptorRenderer descriptorRenderer) {
            classifierDescriptor.getClass();
            descriptorRenderer.getClass();
            return m92313b(classifierDescriptor);
        }

        /* JADX INFO: renamed from: b */
        public final String m92313b(ClassifierDescriptor classifierDescriptor) {
            Name name = classifierDescriptor.getName();
            name.getClass();
            String strM92592c = RenderingUtilsKt.m92592c(name);
            if (classifierDescriptor instanceof TypeParameterDescriptor) {
                return strM92592c;
            }
            DeclarationDescriptor declarationDescriptorMo89190b = classifierDescriptor.mo89190b();
            declarationDescriptorMo89190b.getClass();
            String strM92314c = m92314c(declarationDescriptorMo89190b);
            if (strM92314c == null || Intrinsics.m88377d(strM92314c, "")) {
                return strM92592c;
            }
            return strM92314c + '.' + strM92592c;
        }

        /* JADX INFO: renamed from: c */
        public final String m92314c(DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor instanceof ClassDescriptor) {
                return m92313b((ClassifierDescriptor) declarationDescriptor);
            }
            if (declarationDescriptor instanceof PackageFragmentDescriptor) {
                return RenderingUtilsKt.m92591b(((PackageFragmentDescriptor) declarationDescriptor).mo89453d().m91945i());
            }
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    String mo92312a(@NotNull ClassifierDescriptor classifierDescriptor, @NotNull DescriptorRenderer descriptorRenderer);
}
