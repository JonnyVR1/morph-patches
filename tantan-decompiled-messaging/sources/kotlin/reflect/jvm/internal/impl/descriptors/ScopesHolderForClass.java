package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import p149l.j3e0;
import p149l.k3e0;

/* JADX INFO: loaded from: classes2.dex */
public final class ScopesHolderForClass<T extends MemberScope> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ClassDescriptor f64059a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Function1<KotlinTypeRefiner, T> f64060b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final KotlinTypeRefiner f64061c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final NotNullLazyValue f64062d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ KProperty<Object>[] f64058e = {Reflection.m87514i(new PropertyReference1Impl(ScopesHolderForClass.class, "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final <T extends MemberScope> ScopesHolderForClass<T> m88592a(@NotNull ClassDescriptor classDescriptor, @NotNull StorageManager storageManager, @NotNull KotlinTypeRefiner kotlinTypeRefiner, @NotNull Function1<? super KotlinTypeRefiner, ? extends T> function1) {
            classDescriptor.getClass();
            storageManager.getClass();
            kotlinTypeRefiner.getClass();
            function1.getClass();
            return new ScopesHolderForClass<>(classDescriptor, storageManager, function1, kotlinTypeRefiner, null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScopesHolderForClass(ClassDescriptor classDescriptor, StorageManager storageManager, Function1<? super KotlinTypeRefiner, ? extends T> function1, KotlinTypeRefiner kotlinTypeRefiner) {
        this.f64059a = classDescriptor;
        this.f64060b = function1;
        this.f64061c = kotlinTypeRefiner;
        this.f64062d = storageManager.mo92446e(new j3e0(this));
    }

    /* JADX INFO: renamed from: d */
    public static final MemberScope m88588d(ScopesHolderForClass scopesHolderForClass, KotlinTypeRefiner kotlinTypeRefiner) {
        return scopesHolderForClass.f64060b.invoke(kotlinTypeRefiner);
    }

    /* JADX INFO: renamed from: f */
    public static final MemberScope m88589f(ScopesHolderForClass scopesHolderForClass) {
        return scopesHolderForClass.f64060b.invoke(scopesHolderForClass.f64061c);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final T m88590c(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        if (!kotlinTypeRefiner.mo92909d(DescriptorUtilsKt.m91986s(this.f64059a))) {
            return (T) m88591e();
        }
        TypeConstructor typeConstructorMo88305l = this.f64059a.mo88305l();
        typeConstructorMo88305l.getClass();
        return !kotlinTypeRefiner.mo92910e(typeConstructorMo88305l) ? (T) m88591e() : (T) kotlinTypeRefiner.mo92908c(this.f64059a, new k3e0(this, kotlinTypeRefiner));
    }

    /* JADX INFO: renamed from: e */
    public final T m88591e() {
        return (T) StorageKt.m92484a(this.f64062d, this, f64058e[0]);
    }

    public /* synthetic */ ScopesHolderForClass(ClassDescriptor classDescriptor, StorageManager storageManager, Function1 function1, KotlinTypeRefiner kotlinTypeRefiner, DefaultConstructorMarker defaultConstructorMarker) {
        this(classDescriptor, storageManager, function1, kotlinTypeRefiner);
    }
}
