package p149l;

import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u0018\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0001\u0010\u0005J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0003\u001a\u00028\u0000H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\f\u0010\rJ4\u0010\u0012\u001a\u00020\u00042#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00040\u000eH&¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u000b8&X§\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, m87232d2 = {"Ll/nee0;", "E", "", "element", "", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/a;", BLiveStormDanmakuGiftResourceType.f44444l, "(Ljava/lang/Object;)Ljava/lang/Object;", "", "cause", "", "D", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "handler", "j", "(Lkotlin/jvm/functions/Function1;)V", BLiveStormDanmakuGiftResourceType.f44446s, "()Z", "isClosedForSend$annotations", "()V", "isClosedForSend", "Ll/wce0;", "c", "()Ll/wce0;", "onSend", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public interface nee0<E> {

    /* JADX INFO: renamed from: l.nee0$a */
    @Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    public static final class C18682a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m159110a(nee0 nee0Var, Throwable th, int i, Object obj) {
            if (obj != null) {
                qq3.m175877a("Super calls with default arguments not supported in this target, function: close");
                return false;
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return nee0Var.mo93786D(th);
        }
    }

    /* JADX INFO: renamed from: D */
    boolean mo93786D(@Nullable Throwable cause);

    @Nullable
    /* JADX INFO: renamed from: E */
    Object mo93787E(E e, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    /* JADX INFO: renamed from: c */
    wce0<E, nee0<E>> mo93872c();

    /* JADX INFO: renamed from: j */
    void mo93883j(@NotNull Function1<? super Throwable, Unit> handler);

    @NotNull
    /* JADX INFO: renamed from: l */
    Object mo93791l(E element);

    /* JADX INFO: renamed from: s */
    boolean mo93792s();
}
