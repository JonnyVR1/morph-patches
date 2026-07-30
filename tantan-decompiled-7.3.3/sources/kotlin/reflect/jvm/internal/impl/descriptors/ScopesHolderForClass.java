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
import p153l.nbe0;
import p153l.obe0;

/* JADX INFO: loaded from: classes2.dex */
public final class ScopesHolderForClass<T extends MemberScope> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ClassDescriptor f64733a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Function1<KotlinTypeRefiner, T> f64734b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final KotlinTypeRefiner f64735c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final NotNullLazyValue f64736d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ KProperty<Object>[] f64732e = {Reflection.m88403i(new PropertyReference1Impl(ScopesHolderForClass.class, "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final <T extends MemberScope> ScopesHolderForClass<T> m89483a(@NotNull ClassDescriptor classDescriptor, @NotNull StorageManager storageManager, @NotNull KotlinTypeRefiner kotlinTypeRefiner, @NotNull Function1<? super KotlinTypeRefiner, ? extends T> function1) {
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
        this.f64733a = classDescriptor;
        this.f64734b = function1;
        this.f64735c = kotlinTypeRefiner;
        this.f64736d = storageManager.mo93337e(new nbe0(this));
    }

    /* JADX INFO: renamed from: d */
    public static final MemberScope m89479d(ScopesHolderForClass scopesHolderForClass, KotlinTypeRefiner kotlinTypeRefiner) {
        return scopesHolderForClass.f64734b.invoke(kotlinTypeRefiner);
    }

    /* JADX INFO: renamed from: f */
    public static final MemberScope m89480f(ScopesHolderForClass scopesHolderForClass) {
        return scopesHolderForClass.f64734b.invoke(scopesHolderForClass.f64735c);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final T m89481c(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        if (!kotlinTypeRefiner.mo93800d(DescriptorUtilsKt.m92877s(this.f64733a))) {
            return (T) m89482e();
        }
        TypeConstructor typeConstructorMo89196l = this.f64733a.mo89196l();
        typeConstructorMo89196l.getClass();
        return !kotlinTypeRefiner.mo93801e(typeConstructorMo89196l) ? (T) m89482e() : (T) kotlinTypeRefiner.mo93799c(this.f64733a, new obe0(this, kotlinTypeRefiner));
    }

    /* JADX INFO: renamed from: e */
    public final T m89482e() {
        return (T) StorageKt.m93375a(this.f64736d, this, f64732e[0]);
    }

    public /* synthetic */ ScopesHolderForClass(ClassDescriptor classDescriptor, StorageManager storageManager, Function1 function1, KotlinTypeRefiner kotlinTypeRefiner, DefaultConstructorMarker defaultConstructorMarker) {
        this(classDescriptor, storageManager, function1, kotlinTypeRefiner);
    }
}
