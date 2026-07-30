package p153l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC15510a;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.channels.C15521a;
import kotlinx.coroutines.channels.ChannelIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0015\u001a\u00020\u00032#\u0010\u0014\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00030\u0011H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0096Aø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001bJ\u0018\u0010\u0001\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b\u0001\u0010\u001fJ\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J$\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2\u0006\u0010\u001e\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\u00020\u00032\u000e\u0010\u000e\u001a\n\u0018\u00010$j\u0004\u0018\u0001`%¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b(\u0010)R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00028\u0000018\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b2\u00103R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c018\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b5\u00103R&\u0010;\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000008078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048F¢\u0006\u0006\u001a\u0004\b<\u0010-\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006>"}, m88121d2 = {"Ll/gs4;", "E", "Lkotlinx/coroutines/a;", "", "Ll/fs4;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "_channel", "", "initParentJob", Active.TYPE, "<init>", "(Lkotlin/coroutines/CoroutineContext;Ll/fs4;ZZ)V", "", "cause", "D", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "handler", "j", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/channels/ChannelIterator;", "iterator", "()Lkotlinx/coroutines/channels/ChannelIterator;", c4s.C_ZONE, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/a;", "r", "element", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p", "()Ljava/lang/Object;", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "n", "(Ljava/util/concurrent/CancellationException;)V", "a0", "(Ljava/lang/Throwable;)V", Constants.INAPP_DATA_TAG, "Ll/fs4;", "i1", "()Ll/fs4;", BLiveStormDanmakuGiftResourceType.f45294s, "()Z", "isClosedForSend", "Ll/zke0;", BaseSei.f14626Z, "()Ll/zke0;", "onReceive", "o", "onReceiveCatching", "Ll/ble0;", "Ll/sme0;", "c", "()Ll/ble0;", "onSend", "h1", "channel", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public class gs4<E> extends AbstractC15510a<Unit> implements fs4<E> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final fs4<E> _channel;

    public gs4(@NotNull CoroutineContext coroutineContext, @NotNull fs4<E> fs4Var, boolean z, boolean z2) {
        super(coroutineContext, z, z2);
        this._channel = fs4Var;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Nullable
    /* JADX INFO: renamed from: C */
    public Object mo94727C(@NotNull Continuation<? super E> continuation) {
        return this._channel.mo94727C(continuation);
    }

    /* JADX INFO: renamed from: D */
    public boolean mo94678D(@Nullable Throwable cause) {
        return this._channel.mo94678D(cause);
    }

    @Nullable
    /* JADX INFO: renamed from: E */
    public Object mo94679E(E e, @NotNull Continuation<? super Unit> continuation) {
        return this._channel.mo94679E(e, continuation);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: a0 */
    public void mo94568a0(@NotNull Throwable cause) {
        CancellationException cancellationExceptionM94525W0 = JobSupport.m94525W0(this, cause, null, 1, null);
        this._channel.mo94782n(cancellationExceptionM94525W0);
        m94564Y(cancellationExceptionM94525W0);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public ble0<E, sme0<E>> mo94764c() {
        return this._channel.mo94764c();
    }

    @NotNull
    /* JADX INFO: renamed from: i1 */
    public final fs4<E> m131956i1() {
        return this._channel;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public ChannelIterator<E> iterator() {
        return this._channel.iterator();
    }

    @Override // p153l.sme0
    /* JADX INFO: renamed from: j */
    public void mo94775j(@NotNull Function1<? super Throwable, Unit> handler) {
        this._channel.mo94775j(handler);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public Object mo94683l(E element) {
        return this._channel.mo94683l(element);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.InterfaceC15593o
    /* JADX INFO: renamed from: n */
    public final void mo94586n(@Nullable CancellationException cause) {
        if (isCancelled()) {
            return;
        }
        if (cause == null) {
            cause = new JobCancellationException(mo94574d0(), null, this);
        }
        mo94568a0(cause);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    /* JADX INFO: renamed from: o */
    public zke0<C15521a<E>> mo94785o() {
        return this._channel.mo94785o();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    /* JADX INFO: renamed from: p */
    public Object mo94788p() {
        return this._channel.mo94788p();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Nullable
    /* JADX INFO: renamed from: r */
    public Object mo94793r(@NotNull Continuation<? super C15521a<? extends E>> continuation) {
        Object objMo94793r = this._channel.mo94793r(continuation);
        uyp.m198688e();
        return objMo94793r;
    }

    @Override // p153l.sme0
    /* JADX INFO: renamed from: s */
    public boolean mo94684s() {
        return this._channel.mo94684s();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    /* JADX INFO: renamed from: z */
    public zke0<E> mo94802z() {
        return this._channel.mo94802z();
    }

    @NotNull
    /* JADX INFO: renamed from: h1 */
    public final fs4<E> m131955h1() {
        return this;
    }
}
