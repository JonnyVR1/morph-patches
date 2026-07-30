package com.immomo.mmutil.task;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p153l.rl80;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m88121d2 = {"Ll/rl80;", "invoke", "()Ll/rl80;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
final class MMThreadExecutors$Main$2 extends Lambda implements Function0<rl80> {
    public static final MMThreadExecutors$Main$2 INSTANCE = new MMThreadExecutors$Main$2();

    /* JADX INFO: renamed from: com.immomo.mmutil.task.MMThreadExecutors$Main$2$a */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m88121d2 = {"<anonymous>", "Lio/reactivex/Scheduler;", "kotlin.jvm.PlatformType", "getScheduler"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class C3942a implements rl80 {
        public static final C3942a INSTANCE = new C3942a();
    }

    public MMThreadExecutors$Main$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final rl80 invoke() {
        return C3942a.INSTANCE;
    }
}
