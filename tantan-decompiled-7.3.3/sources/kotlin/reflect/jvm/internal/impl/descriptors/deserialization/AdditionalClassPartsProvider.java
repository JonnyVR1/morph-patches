package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface AdditionalClassPartsProvider {

    public static final class None implements AdditionalClassPartsProvider {

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        @NotNull
        /* JADX INFO: renamed from: b */
        public Collection<ClassConstructorDescriptor> mo89305b(@NotNull ClassDescriptor classDescriptor) {
            classDescriptor.getClass();
            return CollectionsKt.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        @NotNull
        /* JADX INFO: renamed from: c */
        public Collection<KotlinType> mo89306c(@NotNull ClassDescriptor classDescriptor) {
            classDescriptor.getClass();
            return CollectionsKt.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        @NotNull
        /* JADX INFO: renamed from: d */
        public Collection<SimpleFunctionDescriptor> mo89307d(@NotNull Name name, @NotNull ClassDescriptor classDescriptor) {
            name.getClass();
            classDescriptor.getClass();
            return CollectionsKt.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        @NotNull
        /* JADX INFO: renamed from: e */
        public Collection<Name> mo89308e(@NotNull ClassDescriptor classDescriptor) {
            classDescriptor.getClass();
            return CollectionsKt.emptyList();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    Collection<ClassConstructorDescriptor> mo89305b(@NotNull ClassDescriptor classDescriptor);

    @NotNull
    /* JADX INFO: renamed from: c */
    Collection<KotlinType> mo89306c(@NotNull ClassDescriptor classDescriptor);

    @NotNull
    /* JADX INFO: renamed from: d */
    Collection<SimpleFunctionDescriptor> mo89307d(@NotNull Name name, @NotNull ClassDescriptor classDescriptor);

    @NotNull
    /* JADX INFO: renamed from: e */
    Collection<Name> mo89308e(@NotNull ClassDescriptor classDescriptor);
}
