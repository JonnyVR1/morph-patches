package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.work.AbstractC0762b;
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
import kotlinx.coroutines.C15407c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.dsi0;
import p149l.gnr;
import p149l.j6f;
import p149l.txv;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a(\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087@¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/gnr;", "Landroidx/work/b;", "worker", Constants.INAPP_DATA_TAG, "(Ll/gnr;Landroidx/work/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", j6f.GPS_MEASUREMENT_INTERRUPTED, "Ljava/util/concurrent/Future;", "future", "e", "(Ljava/util/concurrent/Future;)Ljava/lang/Object;", "Ljava/util/concurrent/ExecutionException;", "", "f", "(Ljava/util/concurrent/ExecutionException;)Ljava/lang/Throwable;", "", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class WorkerWrapperKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f3516a;

    static {
        String strM190978i = txv.m190978i("WorkerWrapper");
        strM190978i.getClass();
        f3516a = strM190978i;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final <T> Object m4504d(@NotNull final gnr<T> gnrVar, @NotNull final AbstractC0762b abstractC0762b, @NotNull Continuation<? super T> continuation) throws Throwable {
        try {
            if (gnrVar.isDone()) {
                return m4505e(gnrVar);
            }
            C15407c c15407c = new C15407c(IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation), 1);
            c15407c.m93745G();
            gnrVar.addListener(new dsi0(gnrVar, c15407c), DirectExecutor.INSTANCE);
            c15407c.mo93780x(new Function1<Throwable, Unit>() { // from class: androidx.work.impl.WorkerWrapperKt$awaitWithin$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    if (th instanceof WorkerStoppedException) {
                        abstractC0762b.stop(((WorkerStoppedException) th).getReason());
                    }
                    gnrVar.cancel(false);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }
            });
            Object objM93778v = c15407c.m93778v();
            if (objM93778v == uwp.m196133e()) {
                DebugProbesKt.m87383c(continuation);
            }
            return objM93778v;
        } catch (ExecutionException e) {
            throw m4506f(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final <V> V m4505e(Future<V> future) {
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
    public static final Throwable m4506f(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }
}
