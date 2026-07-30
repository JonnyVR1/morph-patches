package com.clevertap.android.sdk.network;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC15486o;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 0, 0})
@DebugMetadata(m87373c = "com.clevertap.android.sdk.network.ContentFetchManager$cancelAllResponseJobs$1", m87374f = "ContentFetchManager.kt", m87375l = {CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA}, m87376m = "invokeSuspend")
@SourceDebugExtension
public final class ContentFetchManager$cancelAllResponseJobs$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ContentFetchManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentFetchManager$cancelAllResponseJobs$1(ContentFetchManager contentFetchManager, Continuation<? super ContentFetchManager$cancelAllResponseJobs$1> continuation) {
        super(2, continuation);
        this.this$0 = contentFetchManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContentFetchManager$cancelAllResponseJobs$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return ((ContentFetchManager$cancelAllResponseJobs$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Iterator<InterfaceC15486o> it;
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            it = this.this$0.getParentJob().mo93645H().iterator();
        } else {
            if (i != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) this.L$0;
            ResultKt.m87239b(obj);
        }
        while (it.hasNext()) {
            InterfaceC15486o next = it.next();
            this.L$0 = it;
            this.label = 1;
            if (next.mo93663S(this) == objM196133e) {
                return objM196133e;
            }
        }
        return Unit.INSTANCE;
    }
}
