package com.google.firebase.sessions;

import android.util.Log;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bui;
import p153l.hq80;
import p153l.iq80;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m88121d2 = {"Ll/bui;", "Ll/hq80;", "", "exception", "", "<anonymous>", "(Ll/bui;Ljava/lang/Throwable;)V"}, m88122k = 3, m88123mv = {1, 8, 0})
@DebugMetadata(m88262c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", m88263f = "SessionDatastore.kt", m88264l = {76}, m88265m = "invokeSuspend")
public final class SessionDatastoreImpl$firebaseSessionDataFlow$1 extends SuspendLambda implements Function3<bui<? super hq80>, Throwable, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public SessionDatastoreImpl$firebaseSessionDataFlow$1(Continuation<? super SessionDatastoreImpl$firebaseSessionDataFlow$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull bui<? super hq80> buiVar, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
        SessionDatastoreImpl$firebaseSessionDataFlow$1 sessionDatastoreImpl$firebaseSessionDataFlow$1 = new SessionDatastoreImpl$firebaseSessionDataFlow$1(continuation);
        sessionDatastoreImpl$firebaseSessionDataFlow$1.L$0 = buiVar;
        sessionDatastoreImpl$firebaseSessionDataFlow$1.L$1 = th;
        return sessionDatastoreImpl$firebaseSessionDataFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            bui buiVar = (bui) this.L$0;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.L$1);
            hq80 hq80VarM141660a = iq80.m141660a();
            this.L$0 = null;
            this.label = 1;
            if (buiVar.emit(hq80VarM141660a, this) == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        return Unit.INSTANCE;
    }
}
