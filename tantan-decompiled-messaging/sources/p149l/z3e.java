package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC15481j;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\u000b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0018\u0010\u0011\u001a\u00020\t*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0013\u001a\u00020\t*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/j;", "", "mode", "", "a", "(Lkotlinx/coroutines/j;I)V", "Lkotlin/coroutines/Continuation;", "delegate", "", "undispatched", Constants.INAPP_DATA_TAG, "(Lkotlinx/coroutines/j;Lkotlin/coroutines/Continuation;Z)V", "e", "(Lkotlinx/coroutines/j;)V", "b", "(I)Z", "isCancellableMode", "c", "isReusableMode", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class z3e {
    /* JADX INFO: renamed from: a */
    public static final <T> void m217025a(@NotNull AbstractC15481j<? super T> abstractC15481j, int i) {
        Continuation<? super T> continuationMo93761c = abstractC15481j.mo93761c();
        boolean z = i == 4;
        if (z || !(continuationMo93761c instanceof x3e) || m217026b(i) != m217026b(abstractC15481j.resumeMode)) {
            m217028d(abstractC15481j, continuationMo93761c, z);
            return;
        }
        CoroutineDispatcher coroutineDispatcher = ((x3e) continuationMo93761c).dispatcher;
        CoroutineContext context = continuationMo93761c.getContext();
        if (coroutineDispatcher.isDispatchNeeded(context)) {
            coroutineDispatcher.dispatch(context, abstractC15481j);
        } else {
            m217029e(abstractC15481j);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m217026b(int i) {
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m217027c(int i) {
        return i == 2;
    }

    /* JADX INFO: renamed from: d */
    public static final <T> void m217028d(@NotNull AbstractC15481j<? super T> abstractC15481j, @NotNull Continuation<? super T> continuation, boolean z) {
        Object objMo93763e;
        Object objMo93767j = abstractC15481j.mo93767j();
        Throwable thMo93762d = abstractC15481j.mo93762d(objMo93767j);
        if (thMo93762d != null) {
            Result.Companion companion = Result.INSTANCE;
            objMo93763e = ResultKt.m87238a(thMo93762d);
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            objMo93763e = abstractC15481j.mo93763e(objMo93767j);
        }
        Object objM223820constructorimpl = Result.m223820constructorimpl(objMo93763e);
        if (!z) {
            continuation.resumeWith(objM223820constructorimpl);
            return;
        }
        continuation.getClass();
        x3e x3eVar = (x3e) continuation;
        Continuation<T> continuation2 = x3eVar.continuation;
        Object obj = x3eVar.countOrElement;
        CoroutineContext context = continuation2.getContext();
        Object objM94217c = ThreadContextKt.m94217c(context, obj);
        qnj0<?> qnj0VarM93609g = objM94217c != ThreadContextKt.f66905a ? CoroutineContextKt.m93609g(continuation2, context, objM94217c) : null;
        try {
            x3eVar.continuation.resumeWith(objM223820constructorimpl);
            Unit unit = Unit.INSTANCE;
        } finally {
            if (qnj0VarM93609g == null || qnj0VarM93609g.m175681h1()) {
                ThreadContextKt.m94215a(context, objM94217c);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m217029e(AbstractC15481j<?> abstractC15481j) {
        s3f s3fVarM189886b = toi0.INSTANCE.m189886b();
        if (s3fVarM189886b.m182156h0()) {
            s3fVarM189886b.m182153Z(abstractC15481j);
            return;
        }
        s3fVarM189886b.m182155d0(true);
        try {
            m217028d(abstractC15481j, abstractC15481j.mo93761c(), true);
            do {
            } while (s3fVarM189886b.m182158k0());
        } catch (Throwable th) {
            try {
                abstractC15481j.m94218h(th, null);
            } finally {
                s3fVarM189886b.m182154d(true);
            }
        }
    }
}
