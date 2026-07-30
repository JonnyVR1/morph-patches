package com.google.firebase.sessions.settings;

import android.util.Log;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m88121d2 = {"<anonymous>", "", "msg", ""}, m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
@DebugMetadata(m88262c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", m88263f = "RemoteSettings.kt", m88264l = {}, m88265m = "invokeSuspend")
public final class RemoteSettings$updateSettings$2$2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public RemoteSettings$updateSettings$2$2(Continuation<? super RemoteSettings$updateSettings$2$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(continuation);
        remoteSettings$updateSettings$2$2.L$0 = obj;
        return remoteSettings$updateSettings$2$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull String str, @Nullable Continuation<? super Unit> continuation) {
        return ((RemoteSettings$updateSettings$2$2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        uyp.m198688e();
        if (this.label != 0) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        Log.e(RemoteSettings.TAG, "Error failing to fetch the remote configs: " + ((String) this.L$0));
        return Unit.INSTANCE;
    }
}
