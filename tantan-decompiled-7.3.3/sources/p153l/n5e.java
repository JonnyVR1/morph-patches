package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC15588j;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\u000b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0018\u0010\u0011\u001a\u00020\t*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0013\u001a\u00020\t*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/j;", "", "mode", "", "a", "(Lkotlinx/coroutines/j;I)V", "Lkotlin/coroutines/Continuation;", "delegate", "", "undispatched", Constants.INAPP_DATA_TAG, "(Lkotlinx/coroutines/j;Lkotlin/coroutines/Continuation;Z)V", "e", "(Lkotlinx/coroutines/j;)V", "b", "(I)Z", "isCancellableMode", "c", "isReusableMode", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class n5e {
    /* JADX INFO: renamed from: a */
    public static final <T> void m161705a(@NotNull AbstractC15588j<? super T> abstractC15588j, int i) {
        Continuation<? super T> continuationMo94653c = abstractC15588j.mo94653c();
        boolean z = i == 4;
        if (z || !(continuationMo94653c instanceof l5e) || m161706b(i) != m161706b(abstractC15588j.resumeMode)) {
            m161708d(abstractC15588j, continuationMo94653c, z);
            return;
        }
        CoroutineDispatcher coroutineDispatcher = ((l5e) continuationMo94653c).dispatcher;
        CoroutineContext context = continuationMo94653c.getContext();
        if (coroutineDispatcher.isDispatchNeeded(context)) {
            coroutineDispatcher.dispatch(context, abstractC15588j);
        } else {
            m161709e(abstractC15588j);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m161706b(int i) {
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m161707c(int i) {
        return i == 2;
    }

    /* JADX INFO: renamed from: d */
    public static final <T> void m161708d(@NotNull AbstractC15588j<? super T> abstractC15588j, @NotNull Continuation<? super T> continuation, boolean z) {
        Object objMo94655e;
        Object objMo94659j = abstractC15588j.mo94659j();
        Throwable thMo94654d = abstractC15588j.mo94654d(objMo94659j);
        if (thMo94654d != null) {
            Result.Companion companion = Result.INSTANCE;
            objMo94655e = ResultKt.m88127a(thMo94654d);
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            objMo94655e = abstractC15588j.mo94655e(objMo94659j);
        }
        Object objM225066constructorimpl = Result.m225066constructorimpl(objMo94655e);
        if (!z) {
            continuation.resumeWith(objM225066constructorimpl);
            return;
        }
        continuation.getClass();
        l5e l5eVar = (l5e) continuation;
        Continuation<T> continuation2 = l5eVar.continuation;
        Object obj = l5eVar.countOrElement;
        CoroutineContext context = continuation2.getContext();
        Object objM95110c = ThreadContextKt.m95110c(context, obj);
        twj0<?> twj0VarM94500g = objM95110c != ThreadContextKt.f67579a ? CoroutineContextKt.m94500g(continuation2, context, objM95110c) : null;
        try {
            l5eVar.continuation.resumeWith(objM225066constructorimpl);
            Unit unit = Unit.INSTANCE;
        } finally {
            if (twj0VarM94500g == null || twj0VarM94500g.m193347h1()) {
                ThreadContextKt.m95108a(context, objM95110c);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m161709e(AbstractC15588j<?> abstractC15588j) {
        w4f w4fVarM203845b = vxi0.INSTANCE.m203845b();
        if (w4fVarM203845b.m204880i0()) {
            w4fVarM203845b.m204877a0(abstractC15588j);
            return;
        }
        w4fVarM203845b.m204879e0(true);
        try {
            m161708d(abstractC15588j, abstractC15588j.mo94653c(), true);
            do {
            } while (w4fVarM203845b.m204882l0());
        } catch (Throwable th) {
            try {
                abstractC15588j.m95111h(th, null);
            } finally {
                w4fVarM203845b.m204878d(true);
            }
        }
    }
}
