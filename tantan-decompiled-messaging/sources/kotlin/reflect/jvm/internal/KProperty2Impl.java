package kotlin.reflect.jvm.internal;

import com.facebook.AuthenticationTokenClaims;
import com.tencent.open.SocialOperation;
import java.lang.reflect.Member;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.CallableReference;
import kotlin.reflect.KProperty2;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;
import p149l.kwq;
import p149l.lwq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\"B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000fJ\u001f\u0010\u0012\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J \u0010\u0016\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0013R,\u0010\u001b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR&\u0010!\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/KProperty2Impl;", "D", "E", j6f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/KProperty2;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", AuthenticationTokenClaims.JSON_KEY_NAME, SocialOperation.GAME_SIGNATURE, "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;)V", "receiver1", "receiver2", "o0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "getDelegate", "invoke", "Lkotlin/Lazy;", "Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "o", "Lkotlin/Lazy;", "_getter", "Ljava/lang/reflect/Member;", "p", "delegateSource", "p0", "()Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "getter", "Getter", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public class KProperty2Impl<D, E, V> extends KPropertyImpl<V> implements KProperty2<D, E, V> {

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Lazy<Getter<D, E, V>> _getter;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Lazy<Member> delegateSource;

    @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0006\b\u0005\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00028\u00052\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\u000b\u001a\u00028\u0004H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "D", "E", j6f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkotlin/reflect/KProperty2$Getter;", "Lkotlin/reflect/jvm/internal/KProperty2Impl;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/KProperty2Impl;)V", "receiver1", "receiver2", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "k", "Lkotlin/reflect/jvm/internal/KProperty2Impl;", "g0", "()Lkotlin/reflect/jvm/internal/KProperty2Impl;", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Getter<D, E, V> extends KPropertyImpl.Getter<V> implements KProperty2.Getter<D, E, V> {

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final KProperty2Impl<D, E, V> property;

        /* JADX WARN: Multi-variable type inference failed */
        public Getter(@NotNull KProperty2Impl<D, E, ? extends V> kProperty2Impl) {
            kProperty2Impl.getClass();
            this.property = kProperty2Impl;
        }

        @Override // kotlin.reflect.KProperty.Accessor
        @NotNull
        /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
        public KProperty2Impl<D, E, V> mo87608g() {
            return this.property;
        }

        @Override // kotlin.jvm.functions.Function2
        public V invoke(D receiver1, E receiver2) {
            return mo87608g().m87933o0(receiver1, receiver2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty2Impl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull String str, @NotNull String str2) {
        super(kDeclarationContainerImpl, str, str2, CallableReference.NO_RECEIVER);
        kDeclarationContainerImpl.getClass();
        str.getClass();
        str2.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this._getter = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new kwq(this));
        this.delegateSource = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new lwq(this));
    }

    /* JADX INFO: renamed from: k0 */
    public static final Getter m87929k0(KProperty2Impl kProperty2Impl) {
        return new Getter(kProperty2Impl);
    }

    /* JADX INFO: renamed from: n0 */
    public static final Member m87932n0(KProperty2Impl kProperty2Impl) {
        return kProperty2Impl.m87940d0();
    }

    @Override // kotlin.reflect.KProperty2
    @Nullable
    public Object getDelegate(D receiver1, E receiver2) {
        return m87942f0(this.delegateSource.getValue(), receiver1, receiver2);
    }

    @Override // kotlin.jvm.functions.Function2
    public V invoke(D receiver1, E receiver2) {
        return m87933o0(receiver1, receiver2);
    }

    /* JADX INFO: renamed from: o0 */
    public V m87933o0(D receiver1, E receiver2) {
        return mo87919h0().call(receiver1, receiver2);
    }

    @Override // kotlin.reflect.jvm.internal.KPropertyImpl
    @NotNull
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public Getter<D, E, V> mo87919h0() {
        return this._getter.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty2Impl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull PropertyDescriptor propertyDescriptor) {
        super(kDeclarationContainerImpl, propertyDescriptor);
        kDeclarationContainerImpl.getClass();
        propertyDescriptor.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this._getter = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new kwq(this));
        this.delegateSource = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new lwq(this));
    }
}
