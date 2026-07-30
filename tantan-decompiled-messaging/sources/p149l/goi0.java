package p149l;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Ll/goi0;", j6f.LATITUDE_SOUTH, "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "context", j6f.GPS_DIRECTION_TRUE, "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "oldState", "", "e", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public interface goi0<S> extends CoroutineContext.Element {

    /* JADX INFO: renamed from: l.goi0$a */
    @Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    public static final class C17132a {
        /* JADX INFO: renamed from: a */
        public static <S, R> R m127246a(@NotNull goi0<S> goi0Var, R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.DefaultImpls.m87362a(goi0Var, r, function2);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public static <S> CoroutineContext m127247b(@NotNull goi0<S> goi0Var, @NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.m87365d(goi0Var, coroutineContext);
        }
    }

    /* JADX INFO: renamed from: T */
    S mo94008T(@NotNull CoroutineContext context);

    /* JADX INFO: renamed from: e */
    void mo94012e(@NotNull CoroutineContext context, S oldState);
}
