package p006l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.CoreModule;
import java.util.List;
import kotlin.Metadata;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: l.t0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\t¨\u0006\u0011"}, d2 = {"Ll/t0;", "Ll/jq2;", "Ll/x0;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "a0", "()V", "destroy", "", "langKey", "langName", "h0", "(Ljava/lang/String;Ljava/lang/String;)V", "g0", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C1295t0 extends jq2<C1426x0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1295t0(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m24409e0(C1295t0 c1295t0, String str, List list) {
        ((C1426x0) ((jq2) c1295t0).viewModel).m26938k(list, str);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m24410f0(C1295t0 c1295t0, Bundle bundle) {
        c1295t0.m24412g0();
    }

    /* JADX INFO: renamed from: a0 */
    public void m24411a0() {
        creates(new e30() { // from class: l.r0
            public final void call(Object obj) {
                C1295t0.m24410f0(this.f20209a, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final void m24412g0() {
        final String strM16409e = C0819i0.m16409e();
        ((C1426x0) ((jq2) this).viewModel).m26938k(null, strM16409e);
        CoreModule.f1534c.f3673t0.m1955k3().subscribe(mkd0.G(new e30() { // from class: l.s0
            public final void call(Object obj) {
                C1295t0.m24409e0(this.f20957a, strM16409e, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m24413h0(@NotNull String langKey, @NotNull String langName) {
        langKey.getClass();
        langName.getClass();
        ((C1426x0) ((jq2) this).viewModel).m26940m(langName);
    }

    public void destroy() {
    }
}
