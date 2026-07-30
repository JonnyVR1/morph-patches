package com.immomo.mmutil.task;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import p149l.d4e;
import p149l.hpw;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\b\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u000b"}, m87232d2 = {"Lcom/immomo/mmutil/task/MMDispatchers;", "", "<init>", "()V", "Lkotlinx/coroutines/CoroutineDispatcher;", "a", "Lkotlin/Lazy;", "()Lkotlinx/coroutines/CoroutineDispatcher;", "Main", "b", "User", "mm-util_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class MMDispatchers {
    public static final MMDispatchers INSTANCE = new MMDispatchers();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy Main = LazyKt__LazyJVMKt.m87229b(new Function0<hpw>() { // from class: com.immomo.mmutil.task.MMDispatchers$Main$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final hpw invoke() {
            return d4e.m109982c();
        }
    });

    private MMDispatchers() {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final CoroutineDispatcher m18428a() {
        return (CoroutineDispatcher) Main.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final CoroutineDispatcher m18429b() {
        return Executors.INSTANCE.m18425a().m18427b();
    }
}
