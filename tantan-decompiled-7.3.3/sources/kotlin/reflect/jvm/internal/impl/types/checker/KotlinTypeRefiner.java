package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class KotlinTypeRefiner extends AbstractTypeRefiner {

    public static final class Default extends KotlinTypeRefiner {

        @NotNull
        public static final Default INSTANCE = new Default();

        private Default() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        @Nullable
        /* JADX INFO: renamed from: b */
        public ClassDescriptor mo93798b(@NotNull ClassId classId) {
            classId.getClass();
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        @NotNull
        /* JADX INFO: renamed from: c */
        public <S extends MemberScope> S mo93799c(@NotNull ClassDescriptor classDescriptor, @NotNull Function0<? extends S> function0) {
            classDescriptor.getClass();
            function0.getClass();
            return function0.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        /* JADX INFO: renamed from: d */
        public boolean mo93800d(@NotNull ModuleDescriptor moduleDescriptor) {
            moduleDescriptor.getClass();
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        /* JADX INFO: renamed from: e */
        public boolean mo93801e(@NotNull TypeConstructor typeConstructor) {
            typeConstructor.getClass();
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        @NotNull
        /* JADX INFO: renamed from: g */
        public Collection<KotlinType> mo93803g(@NotNull ClassDescriptor classDescriptor) {
            classDescriptor.getClass();
            Collection<KotlinType> collectionMo89569c = classDescriptor.mo89196l().mo89569c();
            collectionMo89569c.getClass();
            return collectionMo89569c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner
        @NotNull
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public KotlinType mo93450a(@NotNull KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            return (KotlinType) kotlinTypeMarker;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        @Nullable
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public ClassDescriptor mo93802f(@NotNull DeclarationDescriptor declarationDescriptor) {
            declarationDescriptor.getClass();
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract ClassDescriptor mo93798b(@NotNull ClassId classId);

    @NotNull
    /* JADX INFO: renamed from: c */
    public abstract <S extends MemberScope> S mo93799c(@NotNull ClassDescriptor classDescriptor, @NotNull Function0<? extends S> function0);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo93800d(@NotNull ModuleDescriptor moduleDescriptor);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo93801e(@NotNull TypeConstructor typeConstructor);

    @Nullable
    /* JADX INFO: renamed from: f */
    public abstract ClassifierDescriptor mo93802f(@NotNull DeclarationDescriptor declarationDescriptor);

    @NotNull
    /* JADX INFO: renamed from: g */
    public abstract Collection<KotlinType> mo93803g(@NotNull ClassDescriptor classDescriptor);

    @NotNull
    /* JADX INFO: renamed from: h */
    public abstract KotlinType mo93450a(@NotNull KotlinTypeMarker kotlinTypeMarker);
}
