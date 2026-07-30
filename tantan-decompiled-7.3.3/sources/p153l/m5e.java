package p153l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.InterfaceC15593o;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aT\u0010\u000b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022%\b\u0002\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\t0\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0015\u001a\u00020\u00118\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013¨\u0006\u0016"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/Continuation;", "Lkotlin/Result;", LovePlanetStage.result, "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "cause", "", "onCancellation", "b", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Ll/l5e;", "", Constants.INAPP_DATA_TAG, "(Ll/l5e;)Z", "Ll/goh0;", "a", "Ll/goh0;", "UNDEFINED", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class m5e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final goh0 f134888a = new goh0("UNDEFINED");

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final goh0 f134889b = new goh0("REUSABLE_CLAIMED");

    /* JADX INFO: renamed from: b */
    public static final <T> void m157101b(@NotNull Continuation<? super T> continuation, @NotNull Object obj, @Nullable Function1<? super Throwable, Unit> function1) {
        if (!(continuation instanceof l5e)) {
            continuation.resumeWith(obj);
            return;
        }
        l5e l5eVar = (l5e) continuation;
        Object objM207261b = wo5.m207261b(obj, function1);
        if (l5eVar.dispatcher.isDispatchNeeded(l5eVar.getContext())) {
            l5eVar._state = objM207261b;
            l5eVar.resumeMode = 1;
            l5eVar.dispatcher.dispatch(l5eVar.getContext(), l5eVar);
            return;
        }
        w4f w4fVarM203845b = vxi0.INSTANCE.m203845b();
        if (w4fVarM203845b.m204880i0()) {
            l5eVar._state = objM207261b;
            l5eVar.resumeMode = 1;
            w4fVarM203845b.m204877a0(l5eVar);
            return;
        }
        w4fVarM203845b.m204879e0(true);
        try {
            InterfaceC15593o interfaceC15593o = (InterfaceC15593o) l5eVar.getContext().get(InterfaceC15593o.INSTANCE);
            if (interfaceC15593o == null || interfaceC15593o.mo94581k()) {
                Continuation<T> continuation2 = l5eVar.continuation;
                Object obj2 = l5eVar.countOrElement;
                CoroutineContext context = continuation2.getContext();
                Object objM95110c = ThreadContextKt.m95110c(context, obj2);
                twj0<?> twj0VarM94500g = objM95110c != ThreadContextKt.f67579a ? CoroutineContextKt.m94500g(continuation2, context, objM95110c) : null;
                try {
                    l5eVar.continuation.resumeWith(obj);
                    Unit unit = Unit.INSTANCE;
                    if (twj0VarM94500g == null || twj0VarM94500g.m193347h1()) {
                        ThreadContextKt.m95108a(context, objM95110c);
                    }
                } catch (Throwable th) {
                    if (twj0VarM94500g == null || twj0VarM94500g.m193347h1()) {
                        ThreadContextKt.m95108a(context, objM95110c);
                    }
                    throw th;
                }
            } else {
                CancellationException cancellationExceptionMo94544M = interfaceC15593o.mo94544M();
                l5eVar.mo94652b(objM207261b, cancellationExceptionMo94544M);
                Result.Companion companion = Result.INSTANCE;
                l5eVar.resumeWith(Result.m225066constructorimpl(ResultKt.m88127a(cancellationExceptionMo94544M)));
            }
            while (w4fVarM203845b.m204882l0()) {
            }
        } catch (Throwable th2) {
            try {
                l5eVar.m95111h(th2, null);
            } finally {
                w4fVarM203845b.m204878d(true);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m157102c(Continuation continuation, Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        m157101b(continuation, obj, function1);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m157103d(@NotNull l5e<? super Unit> l5eVar) {
        Unit unit = Unit.INSTANCE;
        w4f w4fVarM203845b = vxi0.INSTANCE.m203845b();
        if (w4fVarM203845b.m204881j0()) {
            return false;
        }
        if (w4fVarM203845b.m204880i0()) {
            l5eVar._state = unit;
            l5eVar.resumeMode = 1;
            w4fVarM203845b.m204877a0(l5eVar);
            return true;
        }
        w4fVarM203845b.m204879e0(true);
        try {
            l5eVar.run();
            do {
            } while (w4fVarM203845b.m204882l0());
        } catch (Throwable th) {
            try {
                l5eVar.m95111h(th, null);
            } finally {
                w4fVarM203845b.m204878d(true);
            }
        }
        return false;
    }
}
