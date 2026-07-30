package kotlin.reflect.jvm.internal;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import org.jetbrains.annotations.NotNull;
import p149l.j6f;
import p149l.swq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/KPropertyNImpl;", j6f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "Lkotlin/Lazy;", "Lkotlin/reflect/jvm/internal/KPropertyNImpl$Getter;", "o", "Lkotlin/Lazy;", "_getter", "m0", "()Lkotlin/reflect/jvm/internal/KPropertyNImpl$Getter;", "getter", "Getter", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public class KPropertyNImpl<V> extends KPropertyImpl<V> {

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Lazy<Getter<V>> _getter;

    @Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/KPropertyNImpl$Getter;", j6f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkotlin/reflect/jvm/internal/KPropertyNImpl;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/KPropertyNImpl;)V", "k", "Lkotlin/reflect/jvm/internal/KPropertyNImpl;", "g0", "()Lkotlin/reflect/jvm/internal/KPropertyNImpl;", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Getter<V> extends KPropertyImpl.Getter<V> {

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final KPropertyNImpl<V> property;

        /* JADX WARN: Multi-variable type inference failed */
        public Getter(@NotNull KPropertyNImpl<? extends V> kPropertyNImpl) {
            kPropertyNImpl.getClass();
            this.property = kPropertyNImpl;
        }

        @Override // kotlin.reflect.KProperty.Accessor
        @NotNull
        /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public KPropertyNImpl<V> mo87608g() {
            return this.property;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KPropertyNImpl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull PropertyDescriptor propertyDescriptor) {
        super(kDeclarationContainerImpl, propertyDescriptor);
        kDeclarationContainerImpl.getClass();
        propertyDescriptor.getClass();
        this._getter = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.PUBLICATION, new swq(this));
    }

    /* JADX INFO: renamed from: k0 */
    public static final Getter m87964k0(KPropertyNImpl kPropertyNImpl) {
        return new Getter(kPropertyNImpl);
    }

    @Override // kotlin.reflect.jvm.internal.KPropertyImpl
    @NotNull
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Getter<V> mo87919h0() {
        return this._getter.getValue();
    }
}
