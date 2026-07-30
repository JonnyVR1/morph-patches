package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IntlMarketConfigEnvelope;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\t¨\u0006\f"}, m88121d2 = {"Ll/jsi;", "Ll/ar2;", "Ll/rsi;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "destroy", "()V", "f0", "e0", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class jsi extends ar2<rsi> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsi(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m146840e0() {
        IntlMarketConfigEnvelope marketConfig = CoreModule.f18264c.f20292A1.getMarketConfig();
        if (marketConfig != null) {
            ((rsi) this.viewModel).m183002L(marketConfig.data);
            return;
        }
        Act act = act();
        if (act != null) {
            act.m68056e2();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m146841f0() {
        ((rsi) this.viewModel).m183009r();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
