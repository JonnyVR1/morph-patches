package kotlin.reflect.jvm.internal.impl.storage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import kotlin.text.StringsKt;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.xqf0;

/* JADX INFO: loaded from: classes2.dex */
public class LockBasedStorageManager implements StorageManager {

    /* JADX INFO: renamed from: d */
    public static final String f66838d = StringsKt.m94320X0(LockBasedStorageManager.class.getCanonicalName(), ".", "");

    /* JADX INFO: renamed from: e */
    public static final StorageManager f66839e = new C15432a("NO_LOCKS", ExceptionHandlingStrategy.f66843a, EmptySimpleLock.INSTANCE);

    /* JADX INFO: renamed from: a */
    public final SimpleLock f66840a;

    /* JADX INFO: renamed from: b */
    public final ExceptionHandlingStrategy f66841b;

    /* JADX INFO: renamed from: c */
    public final String f66842c;

    public interface ExceptionHandlingStrategy {

        /* JADX INFO: renamed from: a */
        public static final ExceptionHandlingStrategy f66843a = new C15431a();

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$ExceptionHandlingStrategy$a */
        public static class C15431a implements ExceptionHandlingStrategy {
            /* JADX INFO: renamed from: b */
            public static /* synthetic */ void m93346b(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy
            @NotNull
            /* JADX INFO: renamed from: a */
            public RuntimeException mo93345a(@NotNull Throwable th) {
                if (th == null) {
                    m93346b(0);
                }
                throw ExceptionUtilsKt.m94088b(th);
            }
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        RuntimeException mo93345a(@NotNull Throwable th);
    }

    public enum NotValue {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$a */
    public static class C15432a extends LockBasedStorageManager {
        public C15432a(String str, ExceptionHandlingStrategy exceptionHandlingStrategy, SimpleLock simpleLock) {
            super(str, exceptionHandlingStrategy, simpleLock, null);
        }

        /* JADX INFO: renamed from: j */
        public static /* synthetic */ void m93347j(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 1 ? 3 : 2];
            if (i != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String str2 = String.format(str, objArr);
            if (i == 1) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager
        @NotNull
        /* JADX INFO: renamed from: p */
        public <K, V> C15444m<V> mo93344p(@NotNull String str, K k) {
            if (str == null) {
                m93347j(0);
            }
            C15444m<V> c15444mM93369a = C15444m.m93369a();
            if (c15444mM93369a == null) {
                m93347j(1);
            }
            return c15444mM93369a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$b */
    public class C15433b<T> extends C15440i<T> {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Object f66844d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15433b(LockBasedStorageManager lockBasedStorageManager, Function0 function0, Object obj) {
            super(lockBasedStorageManager, function0);
            this.f66844d = obj;
        }

        /* JADX INFO: renamed from: a */
        private static /* synthetic */ void m93348a(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C15438g
        @NotNull
        /* JADX INFO: renamed from: c */
        public C15444m<T> mo93349c(boolean z) {
            C15444m<T> c15444mM93370d = C15444m.m93370d(this.f66844d);
            if (c15444mM93370d == null) {
                m93348a(0);
            }
            return c15444mM93370d;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$c */
    public class C15434c<T> extends AbstractC15441j<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Function1 f66846e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Function1 f66847f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15434c(LockBasedStorageManager lockBasedStorageManager, Function0 function0, Function1 function1, Function1 function2) {
            super(lockBasedStorageManager, function0);
            this.f66846e = function1;
            this.f66847f = function2;
        }

        /* JADX INFO: renamed from: a */
        private static /* synthetic */ void m93350a(int i) {
            String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i != 2 ? 2 : 3];
            if (i != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i == 2) {
                objArr[2] = "doPostCompute";
            }
            String str2 = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalArgumentException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C15438g
        @NotNull
        /* JADX INFO: renamed from: c */
        public C15444m<T> mo93349c(boolean z) {
            Function1 function1 = this.f66846e;
            if (function1 == null) {
                C15444m<T> c15444mMo93349c = super.mo93349c(z);
                if (c15444mMo93349c == null) {
                    m93350a(0);
                }
                return c15444mMo93349c;
            }
            C15444m<T> c15444mM93370d = C15444m.m93370d(function1.invoke(Boolean.valueOf(z)));
            if (c15444mM93370d == null) {
                m93350a(1);
            }
            return c15444mM93370d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.AbstractC15439h
        /* JADX INFO: renamed from: f */
        public void mo93351f(@NotNull T t) {
            if (t == null) {
                m93350a(2);
            }
            this.f66847f.invoke(t);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$f */
    public static class C15437f<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f66849a;

        /* JADX INFO: renamed from: b */
        public final Function0<? extends V> f66850b;

        public C15437f(K k, Function0<? extends V> function0) {
            this.f66849a = k;
            this.f66850b = function0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f66849a.equals(((C15437f) obj).f66849a);
        }

        public int hashCode() {
            return this.f66849a.hashCode();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$g */
    public static class C15438g<T> implements NullableLazyValue<T> {

        /* JADX INFO: renamed from: a */
        public final LockBasedStorageManager f66851a;

        /* JADX INFO: renamed from: b */
        public final Function0<? extends T> f66852b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public volatile Object f66853c;

        public C15438g(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            if (lockBasedStorageManager == null) {
                m93356a(0);
            }
            if (function0 == null) {
                m93356a(1);
            }
            this.f66853c = NotValue.NOT_COMPUTED;
            this.f66851a = lockBasedStorageManager;
            this.f66852b = function0;
        }

        /* JADX INFO: renamed from: a */
        private static /* synthetic */ void m93356a(int i) {
            String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i == 2 || i == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 2) {
                objArr[1] = "recursionDetected";
            } else if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i != 2 && i != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        /* JADX INFO: renamed from: b */
        public void mo93357b(T t) {
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public C15444m<T> mo93349c(boolean z) {
            C15444m<T> c15444mMo93344p = this.f66851a.mo93344p("in a lazy value", null);
            if (c15444mMo93344p == null) {
                m93356a(2);
            }
            return c15444mMo93344p;
        }

        /* JADX INFO: renamed from: d */
        public boolean m93358d() {
            return (this.f66853c == NotValue.NOT_COMPUTED || this.f66853c == NotValue.COMPUTING) ? false : true;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003e A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x0042 A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x004d A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:24:0x0052 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        @Override // kotlin.jvm.functions.Function0
        public T invoke() {
            T tInvoke;
            C15444m<T> c15444mMo93349c;
            Object obj = this.f66853c;
            if (!(obj instanceof NotValue)) {
                return (T) WrappedValues.m94121f(obj);
            }
            this.f66851a.f66840a.lock();
            try {
                Object obj2 = this.f66853c;
                if (obj2 instanceof NotValue) {
                    NotValue notValue = NotValue.COMPUTING;
                    if (obj2 == notValue) {
                        this.f66853c = NotValue.RECURSION_WAS_DETECTED;
                        C15444m<T> c15444mMo93349c2 = mo93349c(true);
                        if (!c15444mMo93349c2.m93372c()) {
                            tInvoke = c15444mMo93349c2.m93371b();
                        } else if (obj2 == NotValue.RECURSION_WAS_DETECTED) {
                            c15444mMo93349c = mo93349c(false);
                            if (c15444mMo93349c.m93372c()) {
                                this.f66853c = notValue;
                                try {
                                    tInvoke = this.f66852b.invoke();
                                    mo93357b(tInvoke);
                                    this.f66853c = tInvoke;
                                } catch (Throwable th) {
                                    if (ExceptionUtilsKt.m94087a(th)) {
                                        this.f66853c = NotValue.NOT_COMPUTED;
                                        throw th;
                                    }
                                    if (this.f66853c == NotValue.COMPUTING) {
                                        this.f66853c = WrappedValues.m94118c(th);
                                    }
                                    throw this.f66851a.f66841b.mo93345a(th);
                                }
                            } else {
                                tInvoke = c15444mMo93349c.m93371b();
                            }
                        } else {
                            this.f66853c = notValue;
                            tInvoke = this.f66852b.invoke();
                            mo93357b(tInvoke);
                            this.f66853c = tInvoke;
                        }
                    } else if (obj2 == NotValue.RECURSION_WAS_DETECTED) {
                        c15444mMo93349c = mo93349c(false);
                        if (c15444mMo93349c.m93372c()) {
                            tInvoke = c15444mMo93349c.m93371b();
                        } else {
                            this.f66853c = notValue;
                            tInvoke = this.f66852b.invoke();
                            mo93357b(tInvoke);
                            this.f66853c = tInvoke;
                        }
                    } else {
                        this.f66853c = notValue;
                        tInvoke = this.f66852b.invoke();
                        mo93357b(tInvoke);
                        this.f66853c = tInvoke;
                    }
                } else {
                    tInvoke = (T) WrappedValues.m94121f(obj2);
                }
                this.f66851a.f66840a.unlock();
                return tInvoke;
            } catch (Throwable th2) {
                this.f66851a.f66840a.unlock();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$h */
    public static abstract class AbstractC15439h<T> extends C15438g<T> {

        /* JADX INFO: renamed from: d */
        @Nullable
        public volatile xqf0<T> f66854d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC15439h(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                m93359a(0);
            }
            if (function0 == null) {
                m93359a(1);
            }
            this.f66854d = null;
        }

        /* JADX INFO: renamed from: a */
        private static /* synthetic */ void m93359a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C15438g
        /* JADX INFO: renamed from: b */
        public final void mo93357b(T t) {
            this.f66854d = new xqf0<>(t);
            try {
                mo93351f(t);
            } finally {
                this.f66854d = null;
            }
        }

        /* JADX INFO: renamed from: f */
        public abstract void mo93351f(T t);

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C15438g, kotlin.jvm.functions.Function0
        public T invoke() {
            xqf0<T> xqf0Var = this.f66854d;
            return (xqf0Var == null || !xqf0Var.m212734b()) ? (T) super.invoke() : xqf0Var.m212733a();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$i */
    public static class C15440i<T> extends C15438g<T> implements NotNullLazyValue<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15440i(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                m93360a(0);
            }
            if (function0 == null) {
                m93360a(1);
            }
        }

        /* JADX INFO: renamed from: a */
        private static /* synthetic */ void m93360a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C15438g, kotlin.jvm.functions.Function0
        @NotNull
        public T invoke() {
            T t = (T) super.invoke();
            if (t == null) {
                m93360a(2);
            }
            return t;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$j */
    public static abstract class AbstractC15441j<T> extends AbstractC15439h<T> implements NotNullLazyValue<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC15441j(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                m93361a(0);
            }
            if (function0 == null) {
                m93361a(1);
            }
        }

        /* JADX INFO: renamed from: a */
        private static /* synthetic */ void m93361a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.AbstractC15439h, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C15438g, kotlin.jvm.functions.Function0
        @NotNull
        public T invoke() {
            T t = (T) super.invoke();
            if (t == null) {
                m93361a(2);
            }
            return t;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$k */
    public static class C15442k<K, V> implements MemoizedFunctionToNullable<K, V> {

        /* JADX INFO: renamed from: a */
        public final LockBasedStorageManager f66855a;

        /* JADX INFO: renamed from: b */
        public final ConcurrentMap<K, Object> f66856b;

        /* JADX INFO: renamed from: c */
        public final Function1<? super K, ? extends V> f66857c;

        public C15442k(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<K, Object> concurrentMap, @NotNull Function1<? super K, ? extends V> function1) {
            if (lockBasedStorageManager == null) {
                m93362b(0);
            }
            if (concurrentMap == null) {
                m93362b(1);
            }
            if (function1 == null) {
                m93362b(2);
            }
            this.f66855a = lockBasedStorageManager;
            this.f66856b = concurrentMap;
            this.f66857c = function1;
        }

        /* JADX INFO: renamed from: b */
        private static /* synthetic */ void m93362b(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i != 3 && i != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        /* JADX INFO: renamed from: c */
        public final AssertionError m93363c(K k, Object obj) {
            return (AssertionError) LockBasedStorageManager.m93332q(new AssertionError("Inconsistent key detected. " + NotValue.COMPUTING + " is expected, was: " + obj + ", most probably race condition detected on input " + k + " under " + this.f66855a));
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable
        /* JADX INFO: renamed from: e */
        public boolean mo93364e(K k) {
            Object obj = this.f66856b.get(k);
            return (obj == null || obj == NotValue.COMPUTING) ? false : true;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final AssertionError m93365f(K k, Object obj) {
            AssertionError assertionError = (AssertionError) LockBasedStorageManager.m93332q(new AssertionError("Race condition detected on input " + k + ". Old value is " + obj + " under " + this.f66855a));
            if (assertionError == null) {
                m93362b(4);
            }
            return assertionError;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public C15444m<V> m93366g(K k, boolean z) {
            C15444m<V> c15444mMo93344p = this.f66855a.mo93344p("", k);
            if (c15444mMo93344p == null) {
                m93362b(3);
            }
            return c15444mMo93344p;
        }

        /* JADX INFO: renamed from: h */
        public final AssertionError m93367h(K k, Throwable th) {
            return (AssertionError) LockBasedStorageManager.m93332q(new AssertionError("Unable to remove " + k + " under " + this.f66855a, th));
        }

        /* JADX WARN: Code duplicated, block: B:18:0x003e A[Catch: all -> 0x003b, PHI: r0
          0x003e: PHI (r0v6 java.lang.Object) = (r0v5 java.lang.Object), (r0v16 java.lang.Object) binds: [B:10:0x0020, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:48:0x00a1, B:50:0x00ad, B:51:0x00b1, B:52:0x00b2, B:53:0x00bc, B:55:0x00c0, B:56:0x00ca, B:58:0x00cc, B:59:0x00d0, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:54:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:66:0x0018, inners: #0, #1, #3 }] */
        /* JADX WARN: Code duplicated, block: B:20:0x0042 A[Catch: all -> 0x003b, TryCatch #2 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:48:0x00a1, B:50:0x00ad, B:51:0x00b1, B:52:0x00b2, B:53:0x00bc, B:55:0x00c0, B:56:0x00ca, B:58:0x00cc, B:59:0x00d0, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:54:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:66:0x0018, inners: #0, #1, #3 }] */
        /* JADX WARN: Code duplicated, block: B:22:0x004d A[Catch: all -> 0x003b, TryCatch #2 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:48:0x00a1, B:50:0x00ad, B:51:0x00b1, B:52:0x00b2, B:53:0x00bc, B:55:0x00c0, B:56:0x00ca, B:58:0x00cc, B:59:0x00d0, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:54:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:66:0x0018, inners: #0, #1, #3 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x0052 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:24:0x0054 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #2 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:48:0x00a1, B:50:0x00ad, B:51:0x00b1, B:52:0x00b2, B:53:0x00bc, B:55:0x00c0, B:56:0x00ca, B:58:0x00cc, B:59:0x00d0, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:54:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:66:0x0018, inners: #0, #1, #3 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x0059  */
        /* JADX WARN: Code duplicated, block: B:29:0x0071  */
        /* JADX WARN: Code duplicated, block: B:31:0x0079 A[Catch: all -> 0x007e, TRY_ENTER, TryCatch #3 {all -> 0x007e, blocks: (B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:67:0x005a, outer: #2 }] */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public V invoke(K k) {
            AssertionError assertionErrorM93365f;
            V vInvoke;
            Object objPut;
            V vM93371b;
            C15444m<V> c15444mM93366g;
            Object obj = this.f66856b.get(k);
            if (obj != null && obj != NotValue.COMPUTING) {
                return (V) WrappedValues.m94119d(obj);
            }
            this.f66855a.f66840a.lock();
            try {
                Object obj2 = this.f66856b.get(k);
                NotValue notValue = NotValue.COMPUTING;
                if (obj2 == notValue) {
                    obj2 = NotValue.RECURSION_WAS_DETECTED;
                    C15444m<V> c15444mM93366g2 = m93366g(k, true);
                    if (!c15444mM93366g2.m93372c()) {
                        vM93371b = c15444mM93366g2.m93371b();
                    } else if (obj2 == NotValue.RECURSION_WAS_DETECTED) {
                        c15444mM93366g = m93366g(k, false);
                        if (!c15444mM93366g.m93372c()) {
                            vM93371b = c15444mM93366g.m93371b();
                        } else {
                            if (obj2 != null) {
                                assertionErrorM93365f = null;
                                try {
                                    this.f66856b.put(k, notValue);
                                    vInvoke = this.f66857c.invoke(k);
                                    objPut = this.f66856b.put(k, WrappedValues.m94117b(vInvoke));
                                    if (objPut == notValue) {
                                        this.f66855a.f66840a.unlock();
                                        return vInvoke;
                                    }
                                    assertionErrorM93365f = m93365f(k, objPut);
                                    throw assertionErrorM93365f;
                                } catch (Throwable th) {
                                    if (ExceptionUtilsKt.m94087a(th)) {
                                        try {
                                            Object objRemove = this.f66856b.remove(k);
                                            if (objRemove != NotValue.COMPUTING) {
                                                throw m93363c(k, objRemove);
                                            }
                                            throw th;
                                        } catch (Throwable th2) {
                                            throw m93367h(k, th2);
                                        }
                                    }
                                    ConcurrentMap<K, Object> concurrentMap = this.f66856b;
                                    if (th != assertionErrorM93365f) {
                                        Object objPut2 = concurrentMap.put(k, WrappedValues.m94118c(th));
                                        if (objPut2 != NotValue.COMPUTING) {
                                            throw m93365f(k, objPut2);
                                        }
                                        throw this.f66855a.f66841b.mo93345a(th);
                                    }
                                    try {
                                        concurrentMap.remove(k);
                                        throw this.f66855a.f66841b.mo93345a(th);
                                    } catch (Throwable th3) {
                                        throw m93367h(k, th3);
                                    }
                                }
                                this.f66855a.f66840a.unlock();
                                throw th;
                            }
                            vM93371b = (V) WrappedValues.m94119d(obj2);
                        }
                    } else {
                        if (obj2 != null) {
                            assertionErrorM93365f = null;
                            this.f66856b.put(k, notValue);
                            vInvoke = this.f66857c.invoke(k);
                            objPut = this.f66856b.put(k, WrappedValues.m94117b(vInvoke));
                            if (objPut == notValue) {
                                this.f66855a.f66840a.unlock();
                                return vInvoke;
                            }
                            assertionErrorM93365f = m93365f(k, objPut);
                            throw assertionErrorM93365f;
                            this.f66855a.f66840a.unlock();
                            throw th;
                        }
                        vM93371b = (V) WrappedValues.m94119d(obj2);
                    }
                } else if (obj2 == NotValue.RECURSION_WAS_DETECTED) {
                    c15444mM93366g = m93366g(k, false);
                    if (!c15444mM93366g.m93372c()) {
                        vM93371b = c15444mM93366g.m93371b();
                    } else {
                        if (obj2 != null) {
                            assertionErrorM93365f = null;
                            this.f66856b.put(k, notValue);
                            vInvoke = this.f66857c.invoke(k);
                            objPut = this.f66856b.put(k, WrappedValues.m94117b(vInvoke));
                            if (objPut == notValue) {
                                this.f66855a.f66840a.unlock();
                                return vInvoke;
                            }
                            assertionErrorM93365f = m93365f(k, objPut);
                            throw assertionErrorM93365f;
                            this.f66855a.f66840a.unlock();
                            throw th;
                        }
                        vM93371b = (V) WrappedValues.m94119d(obj2);
                    }
                } else {
                    if (obj2 != null) {
                        assertionErrorM93365f = null;
                        this.f66856b.put(k, notValue);
                        vInvoke = this.f66857c.invoke(k);
                        objPut = this.f66856b.put(k, WrappedValues.m94117b(vInvoke));
                        if (objPut == notValue) {
                            this.f66855a.f66840a.unlock();
                            return vInvoke;
                        }
                        assertionErrorM93365f = m93365f(k, objPut);
                        throw assertionErrorM93365f;
                        this.f66855a.f66840a.unlock();
                        throw th;
                    }
                    vM93371b = (V) WrappedValues.m94119d(obj2);
                }
                this.f66855a.f66840a.unlock();
                return vM93371b;
            } catch (Throwable th4) {
                this.f66855a.f66840a.unlock();
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$l */
    public static class C15443l<K, V> extends C15442k<K, V> implements MemoizedFunctionToNotNull<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15443l(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<K, Object> concurrentMap, @NotNull Function1<? super K, ? extends V> function1) {
            super(lockBasedStorageManager, concurrentMap, function1);
            if (lockBasedStorageManager == null) {
                m93368b(0);
            }
            if (concurrentMap == null) {
                m93368b(1);
            }
            if (function1 == null) {
                m93368b(2);
            }
        }

        /* JADX INFO: renamed from: b */
        private static /* synthetic */ void m93368b(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C15442k, kotlin.jvm.functions.Function1
        @NotNull
        public V invoke(K k) {
            V v2 = (V) super.invoke(k);
            if (v2 == null) {
                m93368b(3);
            }
            return v2;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$m */
    public static class C15444m<T> {

        /* JADX INFO: renamed from: a */
        public final T f66858a;

        /* JADX INFO: renamed from: b */
        public final boolean f66859b;

        public C15444m(T t, boolean z) {
            this.f66858a = t;
            this.f66859b = z;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public static <T> C15444m<T> m93369a() {
            return new C15444m<>(null, true);
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public static <T> C15444m<T> m93370d(T t) {
            return new C15444m<>(t, false);
        }

        /* JADX INFO: renamed from: b */
        public T m93371b() {
            return this.f66858a;
        }

        /* JADX INFO: renamed from: c */
        public boolean m93372c() {
            return this.f66859b;
        }

        public String toString() {
            return m93372c() ? "FALL_THROUGH" : String.valueOf(this.f66858a);
        }
    }

    public LockBasedStorageManager(@NotNull String str, @NotNull ExceptionHandlingStrategy exceptionHandlingStrategy, @NotNull SimpleLock simpleLock) {
        if (str == null) {
            m93328j(4);
        }
        if (exceptionHandlingStrategy == null) {
            m93328j(5);
        }
        if (simpleLock == null) {
            m93328j(6);
        }
        this.f66840a = simpleLock;
        this.f66841b = exceptionHandlingStrategy;
        this.f66842c = str;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX INFO: renamed from: j */
    private static /* synthetic */ void m93328j(int i) {
        String str = (i == 10 || i == 13 || i == 20 || i == 37) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 10 || i == 13 || i == 20 || i == 37) ? 2 : 3];
        if (i == 1 || i == 3 || i == 5) {
            objArr[0] = "exceptionHandlingStrategy";
        } else if (i != 6) {
            switch (i) {
                case 8:
                    objArr[0] = "exceptionHandlingStrategy";
                    break;
                case 9:
                case 11:
                case 14:
                case 16:
                case 19:
                case 21:
                    objArr[0] = "compute";
                    break;
                case 10:
                case 13:
                case 20:
                case 37:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                    break;
                case 12:
                case 17:
                case 25:
                case 27:
                    objArr[0] = "onRecursiveCall";
                    break;
                case 15:
                case 18:
                case 22:
                    objArr[0] = "map";
                    break;
                case 23:
                case 24:
                case 26:
                case 28:
                case 30:
                case 31:
                case 32:
                case 34:
                    objArr[0] = "computable";
                    break;
                case 29:
                case 33:
                    objArr[0] = "postCompute";
                    break;
                case 35:
                    objArr[0] = "source";
                    break;
                case 36:
                    objArr[0] = "throwable";
                    break;
                default:
                    objArr[0] = "debugText";
                    break;
            }
        } else {
            objArr[0] = JoinPoint.SYNCHRONIZATION_LOCK;
        }
        if (i == 10 || i == 13) {
            objArr[1] = "createMemoizedFunction";
        } else if (i == 20) {
            objArr[1] = "createMemoizedFunctionWithNullableValues";
        } else if (i != 37) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
        } else {
            objArr[1] = "sanitizeStackTrace";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "<init>";
                break;
            case 7:
            case 8:
                objArr[2] = "replaceExceptionHandling";
                break;
            case 9:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createMemoizedFunction";
                break;
            case 10:
            case 13:
            case 20:
            case 37:
                break;
            case 19:
            case 21:
            case 22:
                objArr[2] = "createMemoizedFunctionWithNullableValues";
                break;
            case 23:
            case 24:
            case 25:
                objArr[2] = "createLazyValue";
                break;
            case 26:
            case 27:
                objArr[2] = "createRecursionTolerantLazyValue";
                break;
            case 28:
            case 29:
                objArr[2] = "createLazyValueWithPostCompute";
                break;
            case 30:
                objArr[2] = "createNullableLazyValue";
                break;
            case 31:
                objArr[2] = "createRecursionTolerantNullableLazyValue";
                break;
            case 32:
            case 33:
                objArr[2] = "createNullableLazyValueWithPostCompute";
                break;
            case 34:
                objArr[2] = "compute";
                break;
            case 35:
                objArr[2] = "recursionDetectedDefault";
                break;
            case 36:
                objArr[2] = "sanitizeStackTrace";
                break;
            default:
                objArr[2] = "createWithExceptionHandling";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 10 && i != 13 && i != 20 && i != 37) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static <K> ConcurrentMap<K, Object> m93331m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public static <T extends Throwable> T m93332q(@NotNull T t) {
        if (t == null) {
            m93328j(36);
        }
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (i < length) {
            if (!stackTrace[i].getClassName().startsWith(f66838d)) {
                List listSubList = Arrays.asList(stackTrace).subList(i, length);
                t.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
                return t;
            }
            i++;
        }
        i = -1;
        List listSubList2 = Arrays.asList(stackTrace).subList(i, length);
        t.setStackTrace((StackTraceElement[]) listSubList2.toArray(new StackTraceElement[listSubList2.size()]));
        return t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    /* JADX INFO: renamed from: a */
    public <T> NotNullLazyValue<T> mo93333a(@NotNull Function0<? extends T> function0, @NotNull T t) {
        if (function0 == null) {
            m93328j(26);
        }
        if (t == null) {
            m93328j(27);
        }
        return new C15433b(this, function0, t);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    /* JADX INFO: renamed from: b */
    public <T> NotNullLazyValue<T> mo93334b(@NotNull Function0<? extends T> function0, Function1<? super Boolean, ? extends T> function1, @NotNull Function1<? super T, Unit> function2) {
        if (function0 == null) {
            m93328j(28);
        }
        if (function2 == null) {
            m93328j(29);
        }
        return new C15434c(this, function0, function1, function2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    /* JADX INFO: renamed from: c */
    public <K, V> MemoizedFunctionToNullable<K, V> mo93335c(@NotNull Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            m93328j(19);
        }
        MemoizedFunctionToNullable<K, V> memoizedFunctionToNullableM93343o = m93343o(function1, m93331m());
        if (memoizedFunctionToNullableM93343o == null) {
            m93328j(20);
        }
        return memoizedFunctionToNullableM93343o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    /* JADX INFO: renamed from: d */
    public <K, V> CacheWithNotNullValues<K, V> mo93336d() {
        return new C15435d(this, m93331m(), null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    /* JADX INFO: renamed from: e */
    public <T> NotNullLazyValue<T> mo93337e(@NotNull Function0<? extends T> function0) {
        if (function0 == null) {
            m93328j(23);
        }
        return new C15440i(this, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    /* JADX INFO: renamed from: f */
    public <T> T mo93338f(@NotNull Function0<? extends T> function0) {
        if (function0 == null) {
            m93328j(34);
        }
        this.f66840a.lock();
        try {
            T tInvoke = function0.invoke();
            this.f66840a.unlock();
            return tInvoke;
        } catch (Throwable th) {
            try {
                throw this.f66841b.mo93345a(th);
            } catch (Throwable th2) {
                this.f66840a.unlock();
                throw th2;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    /* JADX INFO: renamed from: g */
    public <T> NullableLazyValue<T> mo93339g(@NotNull Function0<? extends T> function0) {
        if (function0 == null) {
            m93328j(30);
        }
        return new C15438g(this, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    /* JADX INFO: renamed from: h */
    public <K, V> CacheWithNullableValues<K, V> mo93340h() {
        return new C15436e(this, m93331m(), null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    /* JADX INFO: renamed from: i */
    public <K, V> MemoizedFunctionToNotNull<K, V> mo93341i(@NotNull Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            m93328j(9);
        }
        MemoizedFunctionToNotNull<K, V> memoizedFunctionToNotNullM93342n = m93342n(function1, m93331m());
        if (memoizedFunctionToNotNullM93342n == null) {
            m93328j(10);
        }
        return memoizedFunctionToNotNullM93342n;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public <K, V> MemoizedFunctionToNotNull<K, V> m93342n(@NotNull Function1<? super K, ? extends V> function1, @NotNull ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            m93328j(14);
        }
        if (concurrentMap == null) {
            m93328j(15);
        }
        return new C15443l(this, concurrentMap, function1);
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public <K, V> MemoizedFunctionToNullable<K, V> m93343o(@NotNull Function1<? super K, ? extends V> function1, @NotNull ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            m93328j(21);
        }
        if (concurrentMap == null) {
            m93328j(22);
        }
        return new C15442k(this, concurrentMap, function1);
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public <K, V> C15444m<V> mo93344p(@NotNull String str, K k) {
        String str2;
        if (str == null) {
            m93328j(35);
        }
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        if (k == null) {
            str2 = "";
        } else {
            str2 = "on input: " + k;
        }
        sb.append(str2);
        sb.append(" under ");
        sb.append(this);
        throw ((AssertionError) m93332q(new AssertionError(sb.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f66842c + ")";
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$d */
    public static class C15435d<K, V> extends C15436e<K, V> implements CacheWithNotNullValues<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15435d(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<C15437f<K, V>, Object> concurrentMap) {
            super(lockBasedStorageManager, concurrentMap, null);
            if (lockBasedStorageManager == null) {
                m93352b(0);
            }
            if (concurrentMap == null) {
                m93352b(1);
            }
        }

        /* JADX INFO: renamed from: b */
        private static /* synthetic */ void m93352b(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "computation";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C15436e, kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues
        @NotNull
        /* JADX INFO: renamed from: a */
        public V mo93326a(K k, @NotNull Function0<? extends V> function0) {
            if (function0 == null) {
                m93352b(2);
            }
            V v2 = (V) super.mo93326a(k, function0);
            if (v2 == null) {
                m93352b(3);
            }
            return v2;
        }

        public /* synthetic */ C15435d(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, C15432a c15432a) {
            this(lockBasedStorageManager, concurrentMap);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$e */
    public static class C15436e<K, V> extends C15442k<C15437f<K, V>, V> implements CacheWithNullableValues<K, V> {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$e$a */
        public class a implements Function1<C15437f<K, V>, V> {
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public V invoke(C15437f<K, V> c15437f) {
                return (V) c15437f.f66850b.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15436e(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<C15437f<K, V>, Object> concurrentMap) {
            super(lockBasedStorageManager, concurrentMap, new a());
            if (lockBasedStorageManager == null) {
                m93353b(0);
            }
            if (concurrentMap == null) {
                m93353b(1);
            }
        }

        /* JADX INFO: renamed from: b */
        private static /* synthetic */ void m93353b(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public V mo93326a(K k, @NotNull Function0<? extends V> function0) {
            if (function0 == null) {
                m93353b(2);
            }
            return invoke(new C15437f(k, function0));
        }

        public /* synthetic */ C15436e(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, C15432a c15432a) {
            this(lockBasedStorageManager, concurrentMap);
        }
    }

    public /* synthetic */ LockBasedStorageManager(String str, ExceptionHandlingStrategy exceptionHandlingStrategy, SimpleLock simpleLock, C15432a c15432a) {
        this(str, exceptionHandlingStrategy, simpleLock);
    }

    public LockBasedStorageManager(String str) {
        this(str, (Runnable) null, (Function1<InterruptedException, Unit>) null);
    }

    public LockBasedStorageManager(String str, @Nullable Runnable runnable, @Nullable Function1<InterruptedException, Unit> function1) {
        this(str, ExceptionHandlingStrategy.f66843a, SimpleLock.Companion.m93374a(runnable, function1));
    }
}
