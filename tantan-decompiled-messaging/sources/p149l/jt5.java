package p149l;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.android.app.Act;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m87232d2 = {"Ll/jt5;", "Ll/jq2;", "Ll/it5;", "Ll/mcr;", "lifecycleProvider", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Ll/mcr;Lcom/p1/mobile/android/app/Act;)V", "Ll/jt5$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "f0", "(Ll/jt5$a;)V", "e0", "()V", "g0", "destroy", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Ll/jt5$a;", "confirmListener", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class jt5 extends jq2<it5> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public InterfaceC17853a confirmListener;

    /* JADX INFO: renamed from: l.jt5$a */
    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006À\u0006\u0003"}, m87232d2 = {"Ll/jt5$a;", "", "", "b", "()V", "a", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface InterfaceC17853a {
        /* JADX INFO: renamed from: a */
        void mo143084a();

        /* JADX INFO: renamed from: b */
        void mo143085b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt5(@NotNull mcr mcrVar, @NotNull Act act) {
        super(mcrVar);
        mcrVar.getClass();
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m143081e0() {
        InterfaceC17853a interfaceC17853a = this.confirmListener;
        if (interfaceC17853a == null) {
            Intrinsics.m87502r("confirmListener");
            interfaceC17853a = null;
        }
        interfaceC17853a.mo143085b();
        ((it5) this.viewModel).m138179k();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m143082f0(@NotNull InterfaceC17853a listener) {
        listener.getClass();
        if (this.viewModel == 0) {
            it5 it5Var = new it5();
            this.viewModel = it5Var;
            mo51532C(it5Var);
        }
        this.confirmListener = listener;
        ((it5) this.viewModel).m138178i(this.act);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m143083g0() {
        InterfaceC17853a interfaceC17853a = this.confirmListener;
        if (interfaceC17853a == null) {
            Intrinsics.m87502r("confirmListener");
            interfaceC17853a = null;
        }
        interfaceC17853a.mo143084a();
        ((it5) this.viewModel).m138179k();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
