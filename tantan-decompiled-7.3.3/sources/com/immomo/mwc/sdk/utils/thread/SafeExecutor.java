package com.immomo.mwc.sdk.utils.thread;

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
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m88121d2 = {"Lcom/immomo/mwc/sdk/utils/thread/SafeExecutor;", "Ljava/util/concurrent/ScheduledExecutorService;", "Companion", "a", "mwc_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class SafeExecutor implements ScheduledExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    private static final Lazy f14732a = LazyKt__LazyJVMKt.m88118b(new Function0<Field>() { // from class: com.immomo.mwc.sdk.utils.thread.SafeExecutor$Companion$callableField$2
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
    private static final Lazy f14733b = LazyKt__LazyJVMKt.m88118b(new Function0<Class<Callable<Object>>>() { // from class: com.immomo.mwc.sdk.utils.thread.SafeExecutor$Companion$runnableAdapterClass$2

        /* JADX INFO: renamed from: com.immomo.mwc.sdk.utils.thread.SafeExecutor$Companion$runnableAdapterClass$2$a */
        @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
        public static final class RunnableC4076a implements Runnable {
            public static final RunnableC4076a INSTANCE = new RunnableC4076a();

            @Override // java.lang.Runnable
            public final void run() {
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Class<Callable<Object>> invoke() {
            return Executors.callable(RunnableC4076a.INSTANCE).getClass();
        }
    });

    /* JADX INFO: renamed from: c */
    private static final Lazy f14734c = LazyKt__LazyJVMKt.m88118b(new Function0<Field>() { // from class: com.immomo.mwc.sdk.utils.thread.SafeExecutor$Companion$taskField$2
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Field invoke() {
            try {
                Field declaredField = SafeExecutor.INSTANCE.m20444d().getDeclaredField("task");
                declaredField.getClass();
                declaredField.setAccessible(true);
                return declaredField;
            } catch (Exception unused) {
                return null;
            }
        }
    });

    /* JADX INFO: renamed from: com.immomo.mwc.sdk.utils.thread.SafeExecutor$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\r¨\u0006\u0017"}, m88121d2 = {"Lcom/immomo/mwc/sdk/utils/thread/SafeExecutor$a;", "", "<init>", "()V", "Ljava/lang/Runnable;", "runnable", "", "b", "(Ljava/lang/Runnable;)Z", "Ljava/lang/reflect/Field;", "callableField$delegate", "Lkotlin/Lazy;", "c", "()Ljava/lang/reflect/Field;", "callableField", "Ljava/lang/Class;", "runnableAdapterClass$delegate", Constants.INAPP_DATA_TAG, "()Ljava/lang/Class;", "runnableAdapterClass", "taskField$delegate", "e", "taskField", "mwc_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: c */
        private final Field m20443c() {
            return (Field) SafeExecutor.f14732a.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public final Class<?> m20444d() {
            return (Class) SafeExecutor.f14733b.getValue();
        }

        /* JADX INFO: renamed from: e */
        private final Field m20445e() {
            return (Field) SafeExecutor.f14734c.getValue();
        }

        /* JADX INFO: renamed from: b */
        public final boolean m20446b(@NotNull Runnable runnable) {
            Object obj;
            Field fieldM20445e;
            runnable.getClass();
            if (!(runnable instanceof FutureTask)) {
                return false;
            }
            try {
                Field fieldM20443c = m20443c();
                if (fieldM20443c != null && (obj = fieldM20443c.get(runnable)) != null && m20444d().isInstance(obj) && (fieldM20445e = m20445e()) != null) {
                    fieldM20445e.get(obj);
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
