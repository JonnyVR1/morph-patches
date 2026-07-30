package p149l;

import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002JH\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042#\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006H'¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0007H'¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0004H'¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u0016\u0010\u0017J8\u0010\u001a\u001a\u00020\u000b2'\u0010\u0019\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006j\u0002`\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\u000b*\u00020\u001c2\u0006\u0010\u0003\u001a\u00028\u0000H'¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u00020\u000b*\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u0007H'¢\u0006\u0004\b\u001f\u0010 J<\u0010!\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00028\u00002#\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006H'¢\u0006\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, m87232d2 = {"Ll/bf4;", j6f.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/Continuation;", "value", "", "idempotent", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "cause", "", "onCancellation", "A", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "exception", BaseSei.f13931Y, "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "w", "(Ljava/lang/Object;)V", "", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/Throwable;)Z", "Lkotlinx/coroutines/CompletionHandler;", "handler", BaseSei.f13930X, "(Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/CoroutineDispatcher;", "B", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "a", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Throwable;)V", "f", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "m", "()Z", "isCompleted", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public interface bf4<T> extends Continuation<T> {

    /* JADX INFO: renamed from: l.bf4$a */
    @Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    public static final class C15848a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m101511a(bf4 bf4Var, Throwable th, int i, Object obj) {
            if (obj != null) {
                qq3.m175877a("Super calls with default arguments not supported in this target, function: cancel");
                return false;
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return bf4Var.mo93766i(th);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: A */
    Object mo93742A(T value, @Nullable Object idempotent, @Nullable Function1<? super Throwable, Unit> onCancellation);

    /* JADX INFO: renamed from: B */
    void mo93743B(@NotNull CoroutineDispatcher coroutineDispatcher, T t);

    /* JADX INFO: renamed from: a */
    void mo93759a(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Throwable th);

    /* JADX INFO: renamed from: f */
    void mo93764f(T value, @Nullable Function1<? super Throwable, Unit> onCancellation);

    /* JADX INFO: renamed from: i */
    boolean mo93766i(@Nullable Throwable cause);

    /* JADX INFO: renamed from: m */
    boolean mo93770m();

    /* JADX INFO: renamed from: w */
    void mo93779w(@NotNull Object token);

    /* JADX INFO: renamed from: x */
    void mo93780x(@NotNull Function1<? super Throwable, Unit> handler);

    @Nullable
    /* JADX INFO: renamed from: y */
    Object mo93781y(@NotNull Throwable exception);
}
