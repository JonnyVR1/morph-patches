package kotlinx.coroutines.channels;

import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.bde0;
import p149l.ff4;
import p149l.nee0;
import p149l.u60;
import p149l.uwp;
import p149l.wce0;
import p149l.xce0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0001\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0001\u0010\u0007J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\u0006\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u00020\u00032\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R,\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0\u00198VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0005\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, m87232d2 = {"Lkotlinx/coroutines/channels/LazyActorCoroutine;", "E", "Ll/u60;", "", "N0", "()V", "element", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/a;", BLiveStormDanmakuGiftResourceType.f44444l, "(Ljava/lang/Object;)Ljava/lang/Object;", "", "cause", "", "D", "(Ljava/lang/Throwable;)Z", "Ll/bde0;", "select", "", "k1", "(Ll/bde0;Ljava/lang/Object;)V", "Lkotlin/coroutines/Continuation;", "e", "Lkotlin/coroutines/Continuation;", "continuation", "Ll/wce0;", "Ll/nee0;", "c", "()Ll/wce0;", "getOnSend$annotations", "onSend", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class LazyActorCoroutine<E> extends u60<E> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public Continuation<? super Unit> continuation;

    @Override // p149l.hr4, p149l.nee0
    /* JADX INFO: renamed from: D */
    public boolean mo93786D(@Nullable Throwable cause) {
        boolean zMo93786D = super.mo93786D(cause);
        start();
        return zMo93786D;
    }

    @Override // p149l.hr4, p149l.nee0
    @Nullable
    /* JADX INFO: renamed from: E */
    public Object mo93787E(E e, @NotNull Continuation<? super Unit> continuation) {
        start();
        Object objMo93787E = super.mo93787E(e, continuation);
        return objMo93787E == uwp.m196133e() ? objMo93787E : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: N0 */
    public void mo93656N0() throws Throwable {
        ff4.m121106b(this.continuation, this);
    }

    @Override // p149l.hr4, p149l.nee0
    @NotNull
    /* JADX INFO: renamed from: c */
    public wce0<E, nee0<E>> mo93872c() {
        LazyActorCoroutine$onSend$1 lazyActorCoroutine$onSend$1 = LazyActorCoroutine$onSend$1.INSTANCE;
        lazyActorCoroutine$onSend$1.getClass();
        return new xce0(this, (Function3) TypeIntrinsics.m87540g(lazyActorCoroutine$onSend$1, 3), super.mo93872c().mo187983b(), null, 8, null);
    }

    /* JADX INFO: renamed from: k1 */
    public final void m93978k1(bde0<?> select, Object element) throws Throwable {
        mo93656N0();
        super.mo93872c().mo187984c().invoke(this, select, element);
    }

    @Override // p149l.hr4, p149l.nee0
    @NotNull
    /* JADX INFO: renamed from: l */
    public Object mo93791l(E element) {
        start();
        return super.mo93791l(element);
    }
}
