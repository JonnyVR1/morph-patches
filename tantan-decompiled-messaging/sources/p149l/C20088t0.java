package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: l.t0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\t¨\u0006\u0011"}, m87232d2 = {"Ll/t0;", "Ll/jq2;", "Ll/x0;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "a0", "()V", "destroy", "", "langKey", "langName", "h0", "(Ljava/lang/String;Ljava/lang/String;)V", "g0", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class C20088t0 extends jq2<C21010x0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20088t0(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m186807e0(C20088t0 c20088t0, String str, List list) {
        ((C21010x0) c20088t0.viewModel).m206328k(list, str);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m186808f0(C20088t0 c20088t0, Bundle bundle) {
        c20088t0.m186809g0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.r0
            @Override // p149l.e30
            public final void call(Object obj) {
                C20088t0.m186808f0(this.f157122a, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final void m186809g0() {
        final String strM133730e = C17441i0.m133730e();
        ((C21010x0) this.viewModel).m206328k(null, strM133730e);
        CoreModule.f17545c.f19684t0.m30027k3().subscribe(mkd0.m154955G(new e30() { // from class: l.s0
            @Override // p149l.e30
            public final void call(Object obj) {
                C20088t0.m186807e0(this.f161710a, strM133730e, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m186810h0(@NotNull String langKey, @NotNull String langName) {
        langKey.getClass();
        langName.getClass();
        ((C21010x0) this.viewModel).m206330m(langName);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
