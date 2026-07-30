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
import kotlinx.coroutines.InterfaceC15593o;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.drb;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 0, 0})
@DebugMetadata(m88262c = "com.clevertap.android.sdk.network.ContentFetchManager$cancelAllResponseJobs$1", m88263f = "ContentFetchManager.kt", m88264l = {CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA}, m88265m = "invokeSuspend")
@SourceDebugExtension
public final class ContentFetchManager$cancelAllResponseJobs$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
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
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((ContentFetchManager$cancelAllResponseJobs$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Iterator<InterfaceC15593o> it;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            it = this.this$0.getParentJob().mo94536H().iterator();
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) this.L$0;
            ResultKt.m88128b(obj);
        }
        while (it.hasNext()) {
            InterfaceC15593o next = it.next();
            this.L$0 = it;
            this.label = 1;
            if (next.mo94554S(this) == objM198688e) {
                return objM198688e;
            }
        }
        return Unit.INSTANCE;
    }
}
