package kotlin.reflect.jvm.internal;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import org.jetbrains.annotations.NotNull;
import p153l.p7f;
import p153l.xxq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0012B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/KMutablePropertyNImpl;", p7f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/jvm/internal/KPropertyNImpl;", "Lkotlin/reflect/KMutableProperty;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "Lkotlin/Lazy;", "Lkotlin/reflect/jvm/internal/KMutablePropertyNImpl$Setter;", "p", "Lkotlin/Lazy;", "_setter", "p0", "()Lkotlin/reflect/jvm/internal/KMutablePropertyNImpl$Setter;", "setter", "Setter", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class KMutablePropertyNImpl<V> extends KPropertyNImpl<V> implements KMutableProperty<V> {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Lazy<Setter<V>> _setter;

    @Metadata(m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/KMutablePropertyNImpl$Setter;", p7f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "Lkotlin/reflect/jvm/internal/KMutablePropertyNImpl;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/KMutablePropertyNImpl;)V", "k", "Lkotlin/reflect/jvm/internal/KMutablePropertyNImpl;", "g0", "()Lkotlin/reflect/jvm/internal/KMutablePropertyNImpl;", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Setter<V> extends KPropertyImpl.Setter<V> {

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final KMutablePropertyNImpl<V> property;

        public Setter(@NotNull KMutablePropertyNImpl<V> kMutablePropertyNImpl) {
            kMutablePropertyNImpl.getClass();
            this.property = kMutablePropertyNImpl;
        }

        @Override // kotlin.reflect.KProperty.Accessor
        @NotNull
        /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
        public KMutablePropertyNImpl<V> mo88499g() {
            return this.property;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutablePropertyNImpl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull PropertyDescriptor propertyDescriptor) {
        super(kDeclarationContainerImpl, propertyDescriptor);
        kDeclarationContainerImpl.getClass();
        propertyDescriptor.getClass();
        this._setter = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.PUBLICATION, new xxq(this));
    }

    /* JADX INFO: renamed from: n0 */
    public static final Setter m88776n0(KMutablePropertyNImpl kMutablePropertyNImpl) {
        return new Setter(kMutablePropertyNImpl);
    }

    @Override // kotlin.reflect.KMutableProperty
    @NotNull
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public Setter<V> getSetter() {
        return this._setter.getValue();
    }
}
