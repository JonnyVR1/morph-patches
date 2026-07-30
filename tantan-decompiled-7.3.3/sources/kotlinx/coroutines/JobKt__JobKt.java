package kotlinx.coroutines;

import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.b6e;
import p153l.fpq;
import p153l.mpq;
import p153l.po5;
import p153l.uyp;
import p153l.xoq;
import p153l.z5e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000e\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0014\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0016\u001a\u00020\u0010*\u00020\u00002\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u0019\u001a\u00020\u0010*\u00020\u00182\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0011\u0010\u001b\u001a\u00020\u0010*\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001d\u001a\u00020\u0010*\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001e\"\u0015\u0010!\u001a\u00020\u0001*\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u0015\u0010$\u001a\u00020\u0000*\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, m88121d2 = {"Lkotlinx/coroutines/o;", "", "onCancelling", "invokeImmediately", "Lkotlinx/coroutines/n;", "handler", "Ll/z5e;", BLiveStormDanmakuGiftResourceType.f45292l, "(Lkotlinx/coroutines/o;ZZLkotlinx/coroutines/n;)Ll/z5e;", "parent", "Ll/po5;", "a", "(Lkotlinx/coroutines/o;)Ll/po5;", "handle", "h", "(Lkotlinx/coroutines/o;Ll/z5e;)Ll/z5e;", "", "e", "(Lkotlinx/coroutines/o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "f", "(Lkotlinx/coroutines/o;Ljava/util/concurrent/CancellationException;)V", "Lkotlin/coroutines/CoroutineContext;", "c", "(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/CancellationException;)V", "j", "(Lkotlinx/coroutines/o;)V", RXScreenCaptureService.KEY_INDEX, "(Lkotlin/coroutines/CoroutineContext;)V", "n", "(Lkotlin/coroutines/CoroutineContext;)Z", "isActive", "k", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/o;", "job", "kotlinx-coroutines-core"}, m88122k = 5, m88123mv = {1, 9, 0}, m88125xi = 48, m88126xs = "kotlinx/coroutines/JobKt")
@SourceDebugExtension
public final /* synthetic */ class JobKt__JobKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final po5 m94506a(@Nullable InterfaceC15593o interfaceC15593o) {
        return new xoq(interfaceC15593o);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ po5 m94507b(InterfaceC15593o interfaceC15593o, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC15593o = null;
        }
        return fpq.m126702a(interfaceC15593o);
    }

    /* JADX INFO: renamed from: c */
    public static final void m94508c(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        InterfaceC15593o interfaceC15593o = (InterfaceC15593o) coroutineContext.get(InterfaceC15593o.INSTANCE);
        if (interfaceC15593o != null) {
            interfaceC15593o.mo94586n(cancellationException);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m94509d(CoroutineContext coroutineContext, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        fpq.m126704c(coroutineContext, cancellationException);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final Object m94510e(@NotNull InterfaceC15593o interfaceC15593o, @NotNull Continuation<? super Unit> continuation) {
        InterfaceC15593o.a.m95138a(interfaceC15593o, null, 1, null);
        Object objMo94554S = interfaceC15593o.mo94554S(continuation);
        return objMo94554S == uyp.m198688e() ? objMo94554S : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final void m94511f(@NotNull InterfaceC15593o interfaceC15593o, @Nullable CancellationException cancellationException) {
        Iterator<InterfaceC15593o> it = interfaceC15593o.mo94536H().iterator();
        while (it.hasNext()) {
            it.next().mo94586n(cancellationException);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m94512g(InterfaceC15593o interfaceC15593o, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        fpq.m126707f(interfaceC15593o, cancellationException);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final z5e m94513h(@NotNull InterfaceC15593o interfaceC15593o, @NotNull z5e z5eVar) {
        return m94518m(interfaceC15593o, false, false, new b6e(z5eVar), 3, null);
    }

    /* JADX INFO: renamed from: i */
    public static final void m94514i(@NotNull CoroutineContext coroutineContext) {
        InterfaceC15593o interfaceC15593o = (InterfaceC15593o) coroutineContext.get(InterfaceC15593o.INSTANCE);
        if (interfaceC15593o != null) {
            fpq.m126712k(interfaceC15593o);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m94515j(@NotNull InterfaceC15593o interfaceC15593o) {
        if (!interfaceC15593o.mo94581k()) {
            throw interfaceC15593o.mo94544M();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final InterfaceC15593o m94516k(@NotNull CoroutineContext coroutineContext) {
        InterfaceC15593o interfaceC15593o = (InterfaceC15593o) coroutineContext.get(InterfaceC15593o.INSTANCE);
        if (interfaceC15593o != null) {
            return interfaceC15593o;
        }
        mpq.m159379a("Current context doesn't contain Job in it: ", coroutineContext);
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final z5e m94517l(@NotNull InterfaceC15593o interfaceC15593o, boolean z, boolean z2, @NotNull InterfaceC15592n interfaceC15592n) {
        return interfaceC15593o instanceof JobSupport ? ((JobSupport) interfaceC15593o).m94596x0(z, z2, interfaceC15592n) : interfaceC15593o.mo94540J(z, z2, new JobKt__JobKt$invokeOnCompletion$1(interfaceC15592n));
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ z5e m94518m(InterfaceC15593o interfaceC15593o, boolean z, boolean z2, InterfaceC15592n interfaceC15592n, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return fpq.m126714m(interfaceC15593o, z, z2, interfaceC15592n);
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m94519n(@NotNull CoroutineContext coroutineContext) {
        InterfaceC15593o interfaceC15593o = (InterfaceC15593o) coroutineContext.get(InterfaceC15593o.INSTANCE);
        if (interfaceC15593o != null) {
            return interfaceC15593o.mo94581k();
        }
        return true;
    }
}
