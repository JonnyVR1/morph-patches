package kotlin.reflect.jvm.internal;

import com.facebook.AuthenticationTokenClaims;
import com.tencent.open.SocialOperation;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import org.jetbrains.annotations.NotNull;
import p153l.p7f;
import p153l.wxq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\u001eB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0012\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R,\u0010\u001a\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty2Impl;", "D", "E", p7f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/jvm/internal/KProperty2Impl;", "Lkotlin/reflect/KMutableProperty2;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", AuthenticationTokenClaims.JSON_KEY_NAME, SocialOperation.GAME_SIGNATURE, "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;)V", "receiver1", "receiver2", "value", "", "t0", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Lazy;", "Lkotlin/reflect/jvm/internal/KMutableProperty2Impl$Setter;", "q", "Lkotlin/Lazy;", "_setter", "s0", "()Lkotlin/reflect/jvm/internal/KMutableProperty2Impl$Setter;", "setter", "Setter", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class KMutableProperty2Impl<D, E, V> extends KProperty2Impl<D, E, V> implements KMutableProperty2<D, E, V> {

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final Lazy<Setter<D, E, V>> _setter;

    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\u000b\u001a\u00028\u00042\u0006\u0010\f\u001a\u00028\u0005H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty2Impl$Setter;", "D", "E", p7f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "Lkotlin/reflect/KMutableProperty2$Setter;", "Lkotlin/reflect/jvm/internal/KMutableProperty2Impl;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/KMutableProperty2Impl;)V", "receiver1", "receiver2", "value", "", "h0", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "k", "Lkotlin/reflect/jvm/internal/KMutableProperty2Impl;", "g0", "()Lkotlin/reflect/jvm/internal/KMutableProperty2Impl;", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Setter<D, E, V> extends KPropertyImpl.Setter<V> implements KMutableProperty2.Setter<D, E, V> {

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final KMutableProperty2Impl<D, E, V> property;

        public Setter(@NotNull KMutableProperty2Impl<D, E, V> kMutableProperty2Impl) {
            kMutableProperty2Impl.getClass();
            this.property = kMutableProperty2Impl;
        }

        @Override // kotlin.reflect.KProperty.Accessor
        @NotNull
        /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
        public KMutableProperty2Impl<D, E, V> mo88499g() {
            return this.property;
        }

        /* JADX INFO: renamed from: h0 */
        public void m88775h0(D receiver1, E receiver2, V value) throws IllegalCallableAccessException {
            mo88499g().m88773t0(receiver1, receiver2, value);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Object obj3) throws IllegalCallableAccessException {
            m88775h0(obj, obj2, obj3);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty2Impl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull String str, @NotNull String str2) {
        super(kDeclarationContainerImpl, str, str2);
        kDeclarationContainerImpl.getClass();
        str.getClass();
        str2.getClass();
        this._setter = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.PUBLICATION, new wxq(this));
    }

    /* JADX INFO: renamed from: q0 */
    public static final Setter m88770q0(KMutableProperty2Impl kMutableProperty2Impl) {
        return new Setter(kMutableProperty2Impl);
    }

    @Override // kotlin.reflect.KMutableProperty2, kotlin.reflect.KMutableProperty
    @NotNull
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public Setter<D, E, V> getSetter() {
        return this._setter.getValue();
    }

    /* JADX INFO: renamed from: t0 */
    public void m88773t0(D receiver1, E receiver2, V value) throws IllegalCallableAccessException {
        getSetter().call(receiver1, receiver2, value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty2Impl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull PropertyDescriptor propertyDescriptor) {
        super(kDeclarationContainerImpl, propertyDescriptor);
        kDeclarationContainerImpl.getClass();
        propertyDescriptor.getClass();
        this._setter = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.PUBLICATION, new wxq(this));
    }
}
