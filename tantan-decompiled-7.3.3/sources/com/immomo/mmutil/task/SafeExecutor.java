package com.immomo.mmutil.task;

import com.clevertap.android.sdk.Constants;
import java.lang.reflect.Field;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m88121d2 = {"Lcom/immomo/mmutil/task/SafeExecutor;", "Ljava/util/concurrent/ScheduledExecutorService;", "Companion", "a", "mm-util_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class SafeExecutor implements ScheduledExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    private static final Lazy f13683a = LazyKt__LazyJVMKt.m88118b(new Function0<Field>() { // from class: com.immomo.mmutil.task.SafeExecutor$Companion$callableField$2
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Field invoke() {
            try {
                Field declaredField = FutureTask.class.getDeclaredField("callable");
                declaredField.getClass();
                declaredField.setAccessible(true);
                return declaredField;
            } catch (Exception unused) {
                return null;
            }
        }
    });

    /* JADX INFO: renamed from: b */
    private static final Lazy f13684b = LazyKt__LazyJVMKt.m88118b(new Function0<Class<Callable<Object>>>() { // from class: com.immomo.mmutil.task.SafeExecutor$Companion$runnableAdapterClass$2

        /* JADX INFO: renamed from: com.immomo.mmutil.task.SafeExecutor$Companion$runnableAdapterClass$2$a */
        @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
        public static final class RunnableC3945a implements Runnable {
            public static final RunnableC3945a INSTANCE = new RunnableC3945a();

            @Override // java.lang.Runnable
            public final void run() {
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Class<Callable<Object>> invoke() {
            return Executors.callable(RunnableC3945a.INSTANCE).getClass();
        }
    });

    /* JADX INFO: renamed from: c */
    private static final Lazy f13685c = LazyKt__LazyJVMKt.m88118b(new Function0<Field>() { // from class: com.immomo.mmutil.task.SafeExecutor$Companion$taskField$2
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Field invoke() {
            try {
                Field declaredField = SafeExecutor.INSTANCE.m19421d().getDeclaredField("task");
                declaredField.getClass();
                declaredField.setAccessible(true);
                return declaredField;
            } catch (Exception unused) {
                return null;
            }
        }
    });

    /* JADX INFO: renamed from: com.immomo.mmutil.task.SafeExecutor$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\r¨\u0006\u0017"}, m88121d2 = {"Lcom/immomo/mmutil/task/SafeExecutor$a;", "", "<init>", "()V", "Ljava/lang/Runnable;", "runnable", "", "b", "(Ljava/lang/Runnable;)Z", "Ljava/lang/reflect/Field;", "callableField$delegate", "Lkotlin/Lazy;", "c", "()Ljava/lang/reflect/Field;", "callableField", "Ljava/lang/Class;", "runnableAdapterClass$delegate", Constants.INAPP_DATA_TAG, "()Ljava/lang/Class;", "runnableAdapterClass", "taskField$delegate", "e", "taskField", "mm-util_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: c */
        private final Field m19420c() {
            return (Field) SafeExecutor.f13683a.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public final Class<?> m19421d() {
            return (Class) SafeExecutor.f13684b.getValue();
        }

        /* JADX INFO: renamed from: e */
        private final Field m19422e() {
            return (Field) SafeExecutor.f13685c.getValue();
        }

        /* JADX INFO: renamed from: b */
        public final boolean m19423b(@NotNull Runnable runnable) {
            Object obj;
            Field fieldM19422e;
            runnable.getClass();
            if (!(runnable instanceof FutureTask)) {
                return false;
            }
            try {
                Field fieldM19420c = m19420c();
                if (fieldM19420c != null && (obj = fieldM19420c.get(runnable)) != null && m19421d().isInstance(obj) && (fieldM19422e = m19422e()) != null) {
                    fieldM19422e.get(obj);
                }
            } catch (Exception unused) {
            }
            return false;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
