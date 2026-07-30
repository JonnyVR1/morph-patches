package kotlin.reflect.jvm.internal;

import com.facebook.AuthenticationTokenClaims;
import com.tencent.open.SocialOperation;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.reflect.KProperty0;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.hyq;
import p153l.iyq;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001eB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000fJ\u000f\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0011R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/KProperty0Impl;", p7f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/KProperty0;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", AuthenticationTokenClaims.JSON_KEY_NAME, SocialOperation.GAME_SIGNATURE, "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "o0", "()Ljava/lang/Object;", "getDelegate", "invoke", "Lkotlin/Lazy;", "Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "o", "Lkotlin/Lazy;", "_getter", "p", "delegateValue", "p0", "()Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "getter", "Getter", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class KProperty0Impl<V> extends KPropertyImpl<V> implements KProperty0<V> {

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Lazy<Getter<V>> _getter;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Lazy<Object> delegateValue;

    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkotlin/reflect/KProperty0$Getter;", "Lkotlin/reflect/jvm/internal/KProperty0Impl;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/KProperty0Impl;)V", "invoke", "()Ljava/lang/Object;", "k", "Lkotlin/reflect/jvm/internal/KProperty0Impl;", "g0", "()Lkotlin/reflect/jvm/internal/KProperty0Impl;", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Getter<R> extends KPropertyImpl.Getter<R> implements KProperty0.Getter<R> {

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final KProperty0Impl<R> property;

        /* JADX WARN: Multi-variable type inference failed */
        public Getter(@NotNull KProperty0Impl<? extends R> kProperty0Impl) {
            kProperty0Impl.getClass();
            this.property = kProperty0Impl;
        }

        @Override // kotlin.reflect.KProperty.Accessor
        @NotNull
        /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
        public KProperty0Impl<R> mo88499g() {
            return this.property;
        }

        @Override // kotlin.jvm.functions.Function0
        public R invoke() {
            return mo88499g().m88811o0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty0Impl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull String str, @NotNull String str2, @Nullable Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        kDeclarationContainerImpl.getClass();
        str.getClass();
        str2.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this._getter = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new hyq(this));
        this.delegateValue = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new iyq(this));
    }

    /* JADX INFO: renamed from: k0 */
    public static final Getter m88806k0(KProperty0Impl kProperty0Impl) {
        return new Getter(kProperty0Impl);
    }

    /* JADX INFO: renamed from: n0 */
    public static final Object m88809n0(KProperty0Impl kProperty0Impl) {
        return kProperty0Impl.m88833f0(kProperty0Impl.m88831d0(), null, null);
    }

    @Override // kotlin.reflect.KProperty0
    @Nullable
    public Object getDelegate() {
        return this.delegateValue.getValue();
    }

    @Override // kotlin.jvm.functions.Function0
    public V invoke() {
        return m88811o0();
    }

    /* JADX INFO: renamed from: o0 */
    public V m88811o0() {
        return mo88810h0().call(new Object[0]);
    }

    @Override // kotlin.reflect.jvm.internal.KPropertyImpl
    @NotNull
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public Getter<V> mo88810h0() {
        return this._getter.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty0Impl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull PropertyDescriptor propertyDescriptor) {
        super(kDeclarationContainerImpl, propertyDescriptor);
        kDeclarationContainerImpl.getClass();
        propertyDescriptor.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this._getter = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new hyq(this));
        this.delegateValue = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new iyq(this));
    }
}
