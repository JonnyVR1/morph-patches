package kotlin.reflect.jvm.internal;

import com.facebook.AuthenticationTokenClaims;
import com.tencent.open.SocialOperation;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;
import p149l.tvq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001cB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty0Impl;", j6f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/jvm/internal/KProperty0Impl;", "Lkotlin/reflect/KMutableProperty0;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", AuthenticationTokenClaims.JSON_KEY_NAME, SocialOperation.GAME_SIGNATURE, "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "value", "", "t0", "(Ljava/lang/Object;)V", "Lkotlin/Lazy;", "Lkotlin/reflect/jvm/internal/KMutableProperty0Impl$Setter;", "q", "Lkotlin/Lazy;", "_setter", "s0", "()Lkotlin/reflect/jvm/internal/KMutableProperty0Impl$Setter;", "setter", "Setter", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class KMutableProperty0Impl<V> extends KProperty0Impl<V> implements KMutableProperty0<V> {

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final Lazy<Setter<V>> _setter;

    @Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty0Impl$Setter;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "Lkotlin/reflect/KMutableProperty0$Setter;", "Lkotlin/reflect/jvm/internal/KMutableProperty0Impl;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/KMutableProperty0Impl;)V", "value", "", "h0", "(Ljava/lang/Object;)V", "k", "Lkotlin/reflect/jvm/internal/KMutableProperty0Impl;", "g0", "()Lkotlin/reflect/jvm/internal/KMutableProperty0Impl;", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Setter<R> extends KPropertyImpl.Setter<R> implements KMutableProperty0.Setter<R> {

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final KMutableProperty0Impl<R> property;

        public Setter(@NotNull KMutableProperty0Impl<R> kMutableProperty0Impl) {
            kMutableProperty0Impl.getClass();
            this.property = kMutableProperty0Impl;
        }

        @Override // kotlin.reflect.KProperty.Accessor
        @NotNull
        /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
        public KMutableProperty0Impl<R> mo87608g() {
            return this.property;
        }

        /* JADX INFO: renamed from: h0 */
        public void m87873h0(R value) throws IllegalCallableAccessException {
            mo87608g().m87870t0(value);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) throws IllegalCallableAccessException {
            m87873h0(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty0Impl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull String str, @NotNull String str2, @Nullable Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        kDeclarationContainerImpl.getClass();
        str.getClass();
        str2.getClass();
        this._setter = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.PUBLICATION, new tvq(this));
    }

    /* JADX INFO: renamed from: q0 */
    public static final Setter m87867q0(KMutableProperty0Impl kMutableProperty0Impl) {
        return new Setter(kMutableProperty0Impl);
    }

    @Override // kotlin.reflect.KMutableProperty0, kotlin.reflect.KMutableProperty
    @NotNull
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public Setter<V> getSetter() {
        return this._setter.getValue();
    }

    /* JADX INFO: renamed from: t0 */
    public void m87870t0(V value) throws IllegalCallableAccessException {
        getSetter().call(value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty0Impl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull PropertyDescriptor propertyDescriptor) {
        super(kDeclarationContainerImpl, propertyDescriptor);
        kDeclarationContainerImpl.getClass();
        propertyDescriptor.getClass();
        this._setter = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.PUBLICATION, new tvq(this));
    }
}
