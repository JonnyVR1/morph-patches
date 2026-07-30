package p153l;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p051p1.mobile.android.app.Act;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m88121d2 = {"Ll/nu5;", "Ll/ar2;", "Ll/mu5;", "Ll/ner;", "lifecycleProvider", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Ll/ner;Lcom/p1/mobile/android/app/Act;)V", "Ll/nu5$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "f0", "(Ll/nu5$a;)V", "e0", "()V", "g0", "destroy", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Ll/nu5$a;", "confirmListener", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class nu5 extends ar2<mu5> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public InterfaceC18951a confirmListener;

    /* JADX INFO: renamed from: l.nu5$a */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006À\u0006\u0003"}, m88121d2 = {"Ll/nu5$a;", "", "", "b", "()V", "a", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC18951a {
        /* JADX INFO: renamed from: a */
        void mo100362a();

        /* JADX INFO: renamed from: b */
        void mo100363b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu5(@NotNull ner nerVar, @NotNull Act act) {
        super(nerVar);
        nerVar.getClass();
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m164762e0() {
        InterfaceC18951a interfaceC18951a = this.confirmListener;
        if (interfaceC18951a == null) {
            Intrinsics.m88391r("confirmListener");
            interfaceC18951a = null;
        }
        interfaceC18951a.mo100363b();
        ((mu5) this.viewModel).m160126k();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m164763f0(@NotNull InterfaceC18951a listener) {
        listener.getClass();
        if (this.viewModel == 0) {
            mu5 mu5Var = new mu5();
            this.viewModel = mu5Var;
            mo52715C(mu5Var);
        }
        this.confirmListener = listener;
        ((mu5) this.viewModel).m160125i(this.act);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m164764g0() {
        InterfaceC18951a interfaceC18951a = this.confirmListener;
        if (interfaceC18951a == null) {
            Intrinsics.m88391r("confirmListener");
            interfaceC18951a = null;
        }
        interfaceC18951a.mo100362a();
        ((mu5) this.viewModel).m160126k();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
