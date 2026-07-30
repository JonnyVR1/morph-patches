package com.hellogroup.common.thread;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p153l.lxi0;
import p153l.tl80;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\b\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m88121d2 = {"Lcom/hellogroup/common/thread/MMThreadExecutors;", "", "<init>", "()V", "Ll/tl80;", "a", "Lkotlin/Lazy;", "()Ll/tl80;", "Main", "Ll/lxi0;", "b", "()Ll/lxi0;", "User", "HelloFoundation_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class MMThreadExecutors {
    public static final MMThreadExecutors INSTANCE = new MMThreadExecutors();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy Main = LazyKt__LazyJVMKt.m88118b(new Function0<tl80>() { // from class: com.hellogroup.common.thread.MMThreadExecutors$Main$2

        /* JADX INFO: renamed from: com.hellogroup.common.thread.MMThreadExecutors$Main$2$a */
        @Metadata(m88120d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Lio/reactivex/Scheduler;", "kotlin.jvm.PlatformType", "a", "()Lio/reactivex/Scheduler;"}, m88122k = 3, m88123mv = {1, 4, 0})
        public static final class C3478a implements tl80 {
            public static final C3478a INSTANCE = new C3478a();

            @Override // p153l.tl80
            /* JADX INFO: renamed from: a */
            public final Scheduler mo17551a() {
                return AndroidSchedulers.mainThread();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final tl80 invoke() {
            return C3478a.INSTANCE;
        }
    });

    private MMThreadExecutors() {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final tl80 m17549a() {
        return (tl80) Main.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final lxi0 m17550b() {
        return Executors.INSTANCE.m17543a().m17546c();
    }
}
