package p149l;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m87232d2 = {"Ll/wc90;", "E", "Ll/hr4;", "Ll/ad90;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Ll/gr4;", "channel", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ll/gr4;)V", "", "value", "j1", "(Lkotlin/Unit;)V", "", "cause", "", "handled", "e1", "(Ljava/lang/Throwable;Z)V", "k", "()Z", "isActive", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class wc90<E> extends hr4<E> implements ad90<E> {
    public wc90(@NotNull CoroutineContext coroutineContext, @NotNull gr4<E> gr4Var) {
        super(coroutineContext, gr4Var, true, true);
    }

    @Override // kotlinx.coroutines.AbstractC15403a
    /* JADX INFO: renamed from: e1 */
    public void mo93732e1(@NotNull Throwable cause, boolean handled) {
        if (m132613i1().mo93786D(cause) || handled) {
            return;
        }
        mpb.m155795a(getContext(), cause);
    }

    @Override // p149l.ad90
    public /* bridge */ /* synthetic */ nee0 getChannel() {
        return m132612h1();
    }

    @Override // kotlinx.coroutines.AbstractC15403a
    /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] */
    public void mo93733f1(@NotNull Unit value) {
        nee0.C18682a.m159110a(m132613i1(), null, 1, null);
    }

    @Override // kotlinx.coroutines.AbstractC15403a, kotlinx.coroutines.JobSupport, kotlinx.coroutines.InterfaceC15486o
    /* JADX INFO: renamed from: k */
    public boolean mo93690k() {
        return super.mo93690k();
    }
}
