package com.hellogroup.common.thread;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import p153l.gsw;
import p153l.r5e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\b\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u000b"}, m88121d2 = {"Lcom/hellogroup/common/thread/MMDispatchers;", "", "<init>", "()V", "Lkotlinx/coroutines/CoroutineDispatcher;", "a", "Lkotlin/Lazy;", "()Lkotlinx/coroutines/CoroutineDispatcher;", "Main", "b", "User", "HelloFoundation_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class MMDispatchers {
    public static final MMDispatchers INSTANCE = new MMDispatchers();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy Main = LazyKt__LazyJVMKt.m88118b(new Function0<gsw>() { // from class: com.hellogroup.common.thread.MMDispatchers$Main$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final gsw invoke() {
            return r5e.m179862c();
        }
    });

    private MMDispatchers() {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final CoroutineDispatcher m17547a() {
        return (CoroutineDispatcher) Main.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final CoroutineDispatcher m17548b() {
        return Executors.INSTANCE.m17543a().m17545b();
    }
}
