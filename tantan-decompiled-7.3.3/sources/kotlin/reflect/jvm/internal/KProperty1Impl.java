package kotlin.reflect.jvm.internal;

import com.facebook.AuthenticationTokenClaims;
import com.tencent.open.SocialOperation;
import java.lang.reflect.Member;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.reflect.KProperty1;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.jyq;
import p153l.kyq;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0001!B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB+\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u0010J\u0017\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0015\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0013R&\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R \u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, m88121d2 = {"Lkotlin/reflect/jvm/internal/KProperty1Impl;", p7f.GPS_DIRECTION_TRUE, p7f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/KProperty1;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", AuthenticationTokenClaims.JSON_KEY_NAME, SocialOperation.GAME_SIGNATURE, "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "receiver", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "getDelegate", "invoke", "Lkotlin/Lazy;", "Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", "o", "Lkotlin/Lazy;", "_getter", "Ljava/lang/reflect/Member;", "p", "delegateSource", "o0", "()Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", "getter", "Getter", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class KProperty1Impl<T, V> extends KPropertyImpl<V> implements KProperty1<T, V> {

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Lazy<Getter<T, V>> _getter;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Lazy<Member> delegateSource;

    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0006\b\u0003\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00028\u00032\u0006\u0010\t\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", p7f.GPS_DIRECTION_TRUE, p7f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkotlin/reflect/KProperty1$Getter;", "Lkotlin/reflect/jvm/internal/KProperty1Impl;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/KProperty1Impl;)V", "receiver", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "k", "Lkotlin/reflect/jvm/internal/KProperty1Impl;", "g0", "()Lkotlin/reflect/jvm/internal/KProperty1Impl;", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Getter<T, V> extends KPropertyImpl.Getter<V> implements KProperty1.Getter<T, V> {

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final KProperty1Impl<T, V> property;

        /* JADX WARN: Multi-variable type inference failed */
        public Getter(@NotNull KProperty1Impl<T, ? extends V> kProperty1Impl) {
            kProperty1Impl.getClass();
            this.property = kProperty1Impl;
        }

        @Override // kotlin.reflect.KProperty.Accessor
        @NotNull
        /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
        public KProperty1Impl<T, V> mo88499g() {
            return this.property;
        }

        @Override // kotlin.jvm.functions.Function1
        public V invoke(T receiver) {
            return mo88499g().get(receiver);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty1Impl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull String str, @NotNull String str2, @Nullable Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        kDeclarationContainerImpl.getClass();
        str.getClass();
        str2.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this._getter = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new jyq(this));
        this.delegateSource = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new kyq(this));
    }

    /* JADX INFO: renamed from: k0 */
    public static final Getter m88814k0(KProperty1Impl kProperty1Impl) {
        return new Getter(kProperty1Impl);
    }

    /* JADX INFO: renamed from: n0 */
    public static final Member m88817n0(KProperty1Impl kProperty1Impl) {
        return kProperty1Impl.m88831d0();
    }

    @Override // kotlin.reflect.KProperty1
    public V get(T receiver) {
        return mo88810h0().call(receiver);
    }

    @Override // kotlin.reflect.KProperty1
    @Nullable
    public Object getDelegate(T receiver) {
        return m88833f0(this.delegateSource.getValue(), receiver, null);
    }

    @Override // kotlin.jvm.functions.Function1
    public V invoke(T receiver) {
        return get(receiver);
    }

    @Override // kotlin.reflect.jvm.internal.KPropertyImpl
    @NotNull
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public Getter<T, V> mo88810h0() {
        return this._getter.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty1Impl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull PropertyDescriptor propertyDescriptor) {
        super(kDeclarationContainerImpl, propertyDescriptor);
        kDeclarationContainerImpl.getClass();
        propertyDescriptor.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this._getter = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new jyq(this));
        this.delegateSource = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new kyq(this));
    }
}
