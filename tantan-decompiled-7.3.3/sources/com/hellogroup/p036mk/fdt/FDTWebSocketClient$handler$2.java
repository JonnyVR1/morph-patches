package com.hellogroup.p036mk.fdt;

import android.os.Handler;
import android.os.HandlerThread;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p153l.duf;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, m88122k = 3, m88123mv = {1, 1, 16})
final class FDTWebSocketClient$handler$2 extends Lambda implements Function0<Handler> {
    final /* synthetic */ duf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FDTWebSocketClient$handler$2(duf dufVar) {
        super(0);
        this.this$0 = dufVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Handler invoke() {
        HandlerThread handlerThread = new HandlerThread(this.this$0.m118134a(), 0);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }
}
