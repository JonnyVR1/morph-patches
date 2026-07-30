package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.work.AbstractC0764b;
import androidx.work.DirectExecutor;
import com.clevertap.android.sdk.Constants;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15514c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.g1j0;
import p153l.hpr;
import p153l.p7f;
import p153l.qzv;
import p153l.uyp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a(\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087@¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/hpr;", "Landroidx/work/b;", "worker", Constants.INAPP_DATA_TAG, "(Ll/hpr;Landroidx/work/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", p7f.GPS_MEASUREMENT_INTERRUPTED, "Ljava/util/concurrent/Future;", "future", "e", "(Ljava/util/concurrent/Future;)Ljava/lang/Object;", "Ljava/util/concurrent/ExecutionException;", "", "f", "(Ljava/util/concurrent/ExecutionException;)Ljava/lang/Throwable;", "", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class WorkerWrapperKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f3516a;

    static {
        String strM178831i = qzv.m178831i("WorkerWrapper");
        strM178831i.getClass();
        f3516a = strM178831i;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final <T> Object m4506d(@NotNull final hpr<T> hprVar, @NotNull final AbstractC0764b abstractC0764b, @NotNull Continuation<? super T> continuation) throws Throwable {
        try {
            if (hprVar.isDone()) {
                return m4507e(hprVar);
            }
            C15514c c15514c = new C15514c(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation), 1);
            c15514c.m94637G();
            hprVar.addListener(new g1j0(hprVar, c15514c), DirectExecutor.INSTANCE);
            c15514c.mo94672x(new Function1<Throwable, Unit>() { // from class: androidx.work.impl.WorkerWrapperKt$awaitWithin$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    if (th instanceof WorkerStoppedException) {
                        abstractC0764b.stop(((WorkerStoppedException) th).getReason());
                    }
                    hprVar.cancel(false);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }
            });
            Object objM94670v = c15514c.m94670v();
            if (objM94670v == uyp.m198688e()) {
                DebugProbesKt.m88272c(continuation);
            }
            return objM94670v;
        } catch (ExecutionException e) {
            throw m4508f(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final <V> V m4507e(Future<V> future) {
        V v2;
        boolean z = false;
        while (true) {
            try {
                v2 = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v2;
    }

    /* JADX INFO: renamed from: f */
    public static final Throwable m4508f(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }
}
