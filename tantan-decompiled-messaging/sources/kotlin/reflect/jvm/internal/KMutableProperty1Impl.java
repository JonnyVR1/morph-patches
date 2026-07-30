package kotlin.reflect.jvm.internal;

import com.facebook.AuthenticationTokenClaims;
import com.tencent.open.SocialOperation;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;
import p149l.uvq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u001eB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB+\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", j6f.GPS_DIRECTION_TRUE, j6f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/jvm/internal/KProperty1Impl;", "Lkotlin/reflect/KMutableProperty1;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", AuthenticationTokenClaims.JSON_KEY_NAME, SocialOperation.GAME_SIGNATURE, "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "receiver", "value", "", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Lazy;", "Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$Setter;", "q", "Lkotlin/Lazy;", "_setter", "r0", "()Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$Setter;", "setter", "Setter", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class KMutableProperty1Impl<T, V> extends KProperty1Impl<T, V> implements KMutableProperty1<T, V> {

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final Lazy<Setter<T, V>> _setter;

    @Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00028\u00022\u0006\u0010\n\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$Setter;", j6f.GPS_DIRECTION_TRUE, j6f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "Lkotlin/reflect/KMutableProperty1$Setter;", "Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;)V", "receiver", "value", "", "h0", "(Ljava/lang/Object;Ljava/lang/Object;)V", "k", "Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", "g0", "()Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Setter<T, V> extends KPropertyImpl.Setter<V> implements KMutableProperty1.Setter<T, V> {

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final KMutableProperty1Impl<T, V> property;

        public Setter(@NotNull KMutableProperty1Impl<T, V> kMutableProperty1Impl) {
            kMutableProperty1Impl.getClass();
            this.property = kMutableProperty1Impl;
        }

        @Override // kotlin.reflect.KProperty.Accessor
        @NotNull
        /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
        public KMutableProperty1Impl<T, V> mo87608g() {
            return this.property;
        }

        /* JADX INFO: renamed from: h0 */
        public void m87878h0(T receiver, V value) throws IllegalCallableAccessException {
            mo87608g().set(receiver, value);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2) throws IllegalCallableAccessException {
            m87878h0(obj, obj2);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty1Impl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull String str, @NotNull String str2, @Nullable Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        kDeclarationContainerImpl.getClass();
        str.getClass();
        str2.getClass();
        this._setter = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.PUBLICATION, new uvq(this));
    }

    /* JADX INFO: renamed from: p0 */
    public static final Setter m87874p0(KMutableProperty1Impl kMutableProperty1Impl) {
        return new Setter(kMutableProperty1Impl);
    }

    @Override // kotlin.reflect.KMutableProperty1, kotlin.reflect.KMutableProperty
    @NotNull
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public Setter<T, V> getSetter() {
        return this._setter.getValue();
    }

    @Override // kotlin.reflect.KMutableProperty1
    public void set(T receiver, V value) throws IllegalCallableAccessException {
        getSetter().call(receiver, value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty1Impl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull PropertyDescriptor propertyDescriptor) {
        super(kDeclarationContainerImpl, propertyDescriptor);
        kDeclarationContainerImpl.getClass();
        propertyDescriptor.getClass();
        this._setter = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.PUBLICATION, new uvq(this));
    }
}
