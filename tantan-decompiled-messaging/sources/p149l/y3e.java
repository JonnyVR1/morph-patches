package p149l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
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
import kotlinx.coroutines.InterfaceC15486o;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aT\u0010\u000b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022%\b\u0002\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\t0\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0015\u001a\u00020\u00118\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013¨\u0006\u0016"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/Continuation;", "Lkotlin/Result;", LovePlanetStage.result, "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "cause", "", "onCancellation", "b", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Ll/x3e;", "", Constants.INAPP_DATA_TAG, "(Ll/x3e;)Z", "Ll/yfh0;", "a", "Ll/yfh0;", "UNDEFINED", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class y3e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final yfh0 f195793a = new yfh0("UNDEFINED");

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final yfh0 f195794b = new yfh0("REUSABLE_CLAIMED");

    /* JADX INFO: renamed from: b */
    public static final <T> void m212798b(@NotNull Continuation<? super T> continuation, @NotNull Object obj, @Nullable Function1<? super Throwable, Unit> function1) {
        if (!(continuation instanceof x3e)) {
            continuation.resumeWith(obj);
            return;
        }
        x3e x3eVar = (x3e) continuation;
        Object objM185032b = sn5.m185032b(obj, function1);
        if (x3eVar.dispatcher.isDispatchNeeded(x3eVar.getContext())) {
            x3eVar._state = objM185032b;
            x3eVar.resumeMode = 1;
            x3eVar.dispatcher.dispatch(x3eVar.getContext(), x3eVar);
            return;
        }
        s3f s3fVarM189886b = toi0.INSTANCE.m189886b();
        if (s3fVarM189886b.m182156h0()) {
            x3eVar._state = objM185032b;
            x3eVar.resumeMode = 1;
            s3fVarM189886b.m182153Z(x3eVar);
            return;
        }
        s3fVarM189886b.m182155d0(true);
        try {
            InterfaceC15486o interfaceC15486o = (InterfaceC15486o) x3eVar.getContext().get(InterfaceC15486o.INSTANCE);
            if (interfaceC15486o == null || interfaceC15486o.mo93690k()) {
                Continuation<T> continuation2 = x3eVar.continuation;
                Object obj2 = x3eVar.countOrElement;
                CoroutineContext context = continuation2.getContext();
                Object objM94217c = ThreadContextKt.m94217c(context, obj2);
                qnj0<?> qnj0VarM93609g = objM94217c != ThreadContextKt.f66905a ? CoroutineContextKt.m93609g(continuation2, context, objM94217c) : null;
                try {
                    x3eVar.continuation.resumeWith(obj);
                    Unit unit = Unit.INSTANCE;
                    if (qnj0VarM93609g == null || qnj0VarM93609g.m175681h1()) {
                        ThreadContextKt.m94215a(context, objM94217c);
                    }
                } catch (Throwable th) {
                    if (qnj0VarM93609g == null || qnj0VarM93609g.m175681h1()) {
                        ThreadContextKt.m94215a(context, objM94217c);
                    }
                    throw th;
                }
            } else {
                CancellationException cancellationExceptionMo93653M = interfaceC15486o.mo93653M();
                x3eVar.mo93760b(objM185032b, cancellationExceptionMo93653M);
                Result.Companion companion = Result.INSTANCE;
                x3eVar.resumeWith(Result.m223820constructorimpl(ResultKt.m87238a(cancellationExceptionMo93653M)));
            }
            while (s3fVarM189886b.m182158k0()) {
            }
        } catch (Throwable th2) {
            try {
                x3eVar.m94218h(th2, null);
            } finally {
                s3fVarM189886b.m182154d(true);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m212799c(Continuation continuation, Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        m212798b(continuation, obj, function1);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m212800d(@NotNull x3e<? super Unit> x3eVar) {
        Unit unit = Unit.INSTANCE;
        s3f s3fVarM189886b = toi0.INSTANCE.m189886b();
        if (s3fVarM189886b.m182157i0()) {
            return false;
        }
        if (s3fVarM189886b.m182156h0()) {
            x3eVar._state = unit;
            x3eVar.resumeMode = 1;
            s3fVarM189886b.m182153Z(x3eVar);
            return true;
        }
        s3fVarM189886b.m182155d0(true);
        try {
            x3eVar.run();
            do {
            } while (s3fVarM189886b.m182158k0());
        } catch (Throwable th) {
            try {
                x3eVar.m94218h(th, null);
            } finally {
                s3fVarM189886b.m182154d(true);
            }
        }
        return false;
    }
}
