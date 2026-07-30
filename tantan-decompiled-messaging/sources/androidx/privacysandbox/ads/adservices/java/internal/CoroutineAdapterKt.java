package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.gnr;
import p149l.gsd;
import p149l.j6f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/gsd;", "", "tag", "Ll/gnr;", "b", "(Ll/gsd;Ljava/lang/Object;)Ll/gnr;", "ads-adservices-java_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class CoroutineAdapterKt {
    /* JADX INFO: renamed from: a */
    public static Object m3202a(final gsd gsdVar, Object obj, final CallbackToFutureAdapter.C0201a c0201a) {
        gsdVar.getClass();
        c0201a.getClass();
        gsdVar.mo93701u(new Function1<Throwable, Unit>() { // from class: androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt$asListenableFuture$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                if (th == null) {
                    c0201a.m867c((T) gsdVar.mo127792q());
                    return;
                }
                boolean z = th instanceof CancellationException;
                CallbackToFutureAdapter.C0201a<T> c0201a2 = c0201a;
                if (z) {
                    c0201a2.m868d();
                } else {
                    c0201a2.m870f(th);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }
        });
        return obj;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> gnr<T> m3203b(@NotNull final gsd<? extends T> gsdVar, @Nullable final Object obj) {
        gsdVar.getClass();
        gnr<T> gnrVarM864a = CallbackToFutureAdapter.m864a(new CallbackToFutureAdapter.InterfaceC0202b() { // from class: l.gpb
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.InterfaceC0202b
            /* JADX INFO: renamed from: a */
            public final Object mo871a(CallbackToFutureAdapter.C0201a c0201a) {
                return CoroutineAdapterKt.m3202a(gsdVar, obj, c0201a);
            }
        });
        gnrVarM864a.getClass();
        return gnrVarM864a;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ gnr m3204c(gsd gsdVar, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return m3203b(gsdVar, obj);
    }
}
