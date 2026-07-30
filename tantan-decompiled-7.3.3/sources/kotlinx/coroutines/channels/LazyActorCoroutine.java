package kotlinx.coroutines.channels;

import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ble0;
import p153l.cle0;
import p153l.eg4;
import p153l.gle0;
import p153l.q60;
import p153l.sme0;
import p153l.uyp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0001\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0001\u0010\u0007J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\u0006\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u00020\u00032\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R,\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0\u00198VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0005\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, m88121d2 = {"Lkotlinx/coroutines/channels/LazyActorCoroutine;", "E", "Ll/q60;", "", "N0", "()V", "element", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/a;", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/lang/Object;)Ljava/lang/Object;", "", "cause", "", "D", "(Ljava/lang/Throwable;)Z", "Ll/gle0;", "select", "", "k1", "(Ll/gle0;Ljava/lang/Object;)V", "Lkotlin/coroutines/Continuation;", "e", "Lkotlin/coroutines/Continuation;", "continuation", "Ll/ble0;", "Ll/sme0;", "c", "()Ll/ble0;", "getOnSend$annotations", "onSend", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class LazyActorCoroutine<E> extends q60<E> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public Continuation<? super Unit> continuation;

    @Override // p153l.gs4, p153l.sme0
    /* JADX INFO: renamed from: D */
    public boolean mo94678D(@Nullable Throwable cause) {
        boolean zMo94678D = super.mo94678D(cause);
        start();
        return zMo94678D;
    }

    @Override // p153l.gs4, p153l.sme0
    @Nullable
    /* JADX INFO: renamed from: E */
    public Object mo94679E(E e, @NotNull Continuation<? super Unit> continuation) {
        start();
        Object objMo94679E = super.mo94679E(e, continuation);
        return objMo94679E == uyp.m198688e() ? objMo94679E : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: N0 */
    public void mo94547N0() throws Throwable {
        eg4.m120754b(this.continuation, this);
    }

    @Override // p153l.gs4, p153l.sme0
    @NotNull
    /* JADX INFO: renamed from: c */
    public ble0<E, sme0<E>> mo94764c() {
        LazyActorCoroutine$onSend$1 lazyActorCoroutine$onSend$1 = LazyActorCoroutine$onSend$1.INSTANCE;
        lazyActorCoroutine$onSend$1.getClass();
        return new cle0(this, (Function3) TypeIntrinsics.m88429g(lazyActorCoroutine$onSend$1, 3), super.mo94764c().mo98658b(), null, 8, null);
    }

    /* JADX INFO: renamed from: k1 */
    public final void m94870k1(gle0<?> select, Object element) throws Throwable {
        mo94547N0();
        super.mo94764c().mo98659c().invoke(this, select, element);
    }

    @Override // p153l.gs4, p153l.sme0
    @NotNull
    /* JADX INFO: renamed from: l */
    public Object mo94683l(E element) {
        start();
        return super.mo94683l(element);
    }
}
