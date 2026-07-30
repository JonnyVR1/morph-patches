package p153l;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/hxi0;", p7f.LATITUDE_SOUTH, "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "context", "U", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "oldState", "", "e", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public interface hxi0<S> extends CoroutineContext.Element {

    /* JADX INFO: renamed from: l.hxi0$a */
    @Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static final class C17588a {
        /* JADX INFO: renamed from: a */
        public static <S, R> R m137610a(@NotNull hxi0<S> hxi0Var, R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.DefaultImpls.m88251a(hxi0Var, r, function2);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public static <S> CoroutineContext m137611b(@NotNull hxi0<S> hxi0Var, @NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.m88254d(hxi0Var, coroutineContext);
        }
    }

    /* JADX INFO: renamed from: U */
    S mo94900U(@NotNull CoroutineContext context);

    /* JADX INFO: renamed from: e */
    void mo94904e(@NotNull CoroutineContext context, S oldState);
}
