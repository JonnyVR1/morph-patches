package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.IntlMarketConfigEnvelope;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\t¨\u0006\f"}, m87232d2 = {"Ll/npi;", "Ll/jq2;", "Ll/vpi;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "destroy", "()V", "f0", "e0", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class npi extends jq2<vpi> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npi(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m160505e0() {
        IntlMarketConfigEnvelope marketConfig = CoreModule.f17545c.f19550A1.getMarketConfig();
        if (marketConfig != null) {
            ((vpi) this.viewModel).m199261L(marketConfig.data);
            return;
        }
        Act act = act();
        if (act != null) {
            act.m66873d2();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m160506f0() {
        ((vpi) this.viewModel).m199268r();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
