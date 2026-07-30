package kotlin.reflect.jvm.internal.calls;

import com.clevertap.android.sdk.Constants;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.cmq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u001c\u001dB\u001f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0004¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0001\u0002\u001e\u001f¨\u0006 "}, m88121d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Ljava/lang/reflect/Method;", "unboxMethod", "", "Ljava/lang/reflect/Type;", "parameterTypes", "<init>", "(Ljava/lang/reflect/Method;Ljava/util/List;)V", "", "instance", "", "args", "c", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/lang/reflect/Method;", "b", "Ljava/util/List;", "getParameterTypes", "()Ljava/util/List;", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "g", "()Ljava/lang/reflect/Method;", "member", "Unbound", "Bound", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Bound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound;", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public abstract class InternalUnderlyingValOfInlineClass implements Caller<Method> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Method unboxMethod;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<Type> parameterTypes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Type returnType;

    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Bound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Ljava/lang/reflect/Method;", "unboxMethod", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", Constants.INAPP_DATA_TAG, "Ljava/lang/Object;", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Bound extends InternalUnderlyingValOfInlineClass implements BoundCaller {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final Object boundReceiver;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Bound(@NotNull Method method, @Nullable Object obj) {
            super(method, CollectionsKt.emptyList(), null);
            method.getClass();
            this.boundReceiver = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] args) {
            args.getClass();
            m88984d(args);
            return m88983c(this.boundReceiver, args);
        }
    }

    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "unboxMethod", "Ljava/lang/reflect/Method;", "<init>", "(Ljava/lang/reflect/Method;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Unbound extends InternalUnderlyingValOfInlineClass {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unbound(@NotNull Method method) {
            super(method, CollectionsKt.listOf(method.getDeclaringClass()), null);
            method.getClass();
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] args) {
            args.getClass();
            m88984d(args);
            Object obj = args[0];
            CallerImpl.Companion companion = CallerImpl.INSTANCE;
            return m88983c(obj, args.length <= 1 ? new Object[0] : ArraysKt.copyOfRange(args, 1, args.length));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InternalUnderlyingValOfInlineClass(Method method, List<? extends Type> list) {
        this.unboxMethod = method;
        this.parameterTypes = list;
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        this.returnType = returnType;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: a */
    public /* bridge */ boolean mo88949a() {
        return m88986f();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m88983c(@Nullable Object instance, @NotNull Object[] args) {
        args.getClass();
        return this.unboxMethod.invoke(instance, Arrays.copyOf(args, args.length));
    }

    /* JADX INFO: renamed from: d */
    public /* bridge */ void m88984d(@NotNull Object[] objArr) {
        m88985e(objArr);
    }

    /* JADX INFO: renamed from: e */
    public void m88985e(Object[] objArr) {
        objArr.getClass();
        if (CallerKt.m88982a(this) == objArr.length) {
            return;
        }
        cmq.m111312a("Callable expects ", CallerKt.m88982a(this), " arguments, but ", objArr.length, " were provided.");
    }

    /* JADX INFO: renamed from: f */
    public boolean m88986f() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @Nullable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Method mo88950b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public final List<Type> getParameterTypes() {
        return this.parameterTypes;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public final Type getReturnType() {
        return this.returnType;
    }

    public /* synthetic */ InternalUnderlyingValOfInlineClass(Method method, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(method, list);
    }
}
