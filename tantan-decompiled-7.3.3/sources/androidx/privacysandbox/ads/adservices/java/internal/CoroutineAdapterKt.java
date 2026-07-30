package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.hpr;
import p153l.p7f;
import p153l.utd;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/utd;", "", "tag", "Ll/hpr;", "b", "(Ll/utd;Ljava/lang/Object;)Ll/hpr;", "ads-adservices-java_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class CoroutineAdapterKt {
    /* JADX INFO: renamed from: a */
    public static Object m3203a(final utd utdVar, Object obj, final CallbackToFutureAdapter.C0202a c0202a) {
        utdVar.getClass();
        c0202a.getClass();
        utdVar.mo94592u(new Function1<Throwable, Unit>() { // from class: androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt$asListenableFuture$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                if (th == null) {
                    c0202a.m868c((T) utdVar.mo164040q());
                    return;
                }
                boolean z = th instanceof CancellationException;
                CallbackToFutureAdapter.C0202a<T> c0202a2 = c0202a;
                if (z) {
                    c0202a2.m869d();
                } else {
                    c0202a2.m871f(th);
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
    public static final <T> hpr<T> m3204b(@NotNull final utd<? extends T> utdVar, @Nullable final Object obj) {
        utdVar.getClass();
        hpr<T> hprVarM865a = CallbackToFutureAdapter.m865a(new CallbackToFutureAdapter.InterfaceC0203b() { // from class: l.uqb
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.InterfaceC0203b
            /* JADX INFO: renamed from: a */
            public final Object mo872a(CallbackToFutureAdapter.C0202a c0202a) {
                return CoroutineAdapterKt.m3203a(utdVar, obj, c0202a);
            }
        });
        hprVarM865a.getClass();
        return hprVarM865a;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ hpr m3205c(utd utdVar, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return m3204b(utdVar, obj);
    }
}
