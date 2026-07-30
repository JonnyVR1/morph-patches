package androidx.datastore.core;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC15593o;
import kotlinx.coroutines.channels.C15521a;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.drb;
import p153l.fs4;
import p153l.ns4;
import p153l.p7f;
import p153l.wtq0;
import p153l.xh3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bh\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\t\u0012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R3\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m88121d2 = {"Landroidx/datastore/core/SimpleActor;", p7f.GPS_DIRECTION_TRUE, "", "Ll/drb;", "scope", "Lkotlin/Function1;", "", "", "onComplete", "Lkotlin/Function2;", "onUndeliveredElement", "Lkotlin/coroutines/Continuation;", "consumeMessage", "<init>", "(Ll/drb;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "msg", "e", "(Ljava/lang/Object;)V", "a", "Ll/drb;", "b", "Lkotlin/jvm/functions/Function2;", "Ll/fs4;", "c", "Ll/fs4;", "messageQueue", "Ljava/util/concurrent/atomic/AtomicInteger;", Constants.INAPP_DATA_TAG, "Ljava/util/concurrent/atomic/AtomicInteger;", "remainingMessages", "datastore-core"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public final class SimpleActor<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final drb scope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function2<T, Continuation<? super Unit>, Object> consumeMessage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final fs4<T> messageQueue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AtomicInteger remainingMessages;

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleActor(@NotNull drb drbVar, @NotNull final Function1<? super Throwable, Unit> function1, @NotNull final Function2<? super T, ? super Throwable, Unit> function2, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        drbVar.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        this.scope = drbVar;
        this.consumeMessage = function3;
        this.messageQueue = ns4.m164557c(Api.BaseClientBuilder.API_PRIORITY_OTHER, null, null, 6, null);
        this.remainingMessages = new AtomicInteger(0);
        InterfaceC15593o interfaceC15593o = (InterfaceC15593o) drbVar.getCoroutineContext().get(InterfaceC15593o.INSTANCE);
        if (interfaceC15593o == null) {
            return;
        }
        interfaceC15593o.mo94592u(new Function1<Throwable, Unit>() { // from class: androidx.datastore.core.SimpleActor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                Unit unit;
                function1.invoke(th);
                this.messageQueue.mo94678D(th);
                do {
                    Object objM94887f = C15521a.m94887f(this.messageQueue.mo94788p());
                    if (objM94887f == null) {
                        unit = null;
                    } else {
                        function2.invoke((T) objM94887f, th);
                        unit = Unit.INSTANCE;
                    }
                } while (unit != null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m1399e(T msg) {
        Object objMo94683l = this.messageQueue.mo94683l(msg);
        if (objMo94683l instanceof C15521a.a) {
            Throwable thM94886e = C15521a.m94886e(objMo94683l);
            if (thM94886e != null) {
                throw thM94886e;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!C15521a.m94890i(objMo94683l)) {
            wtq0.m207906a("Check failed.");
        } else if (this.remainingMessages.getAndIncrement() == 0) {
            xh3.m210980d(this.scope, null, null, new SimpleActor$offer$2(this, null), 3, null);
        }
    }
}
