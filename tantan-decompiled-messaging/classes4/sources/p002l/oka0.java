package p002l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.e30;
import l.jq2;
import l.mcr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class oka0 extends jq2<rka0> {

    /* JADX INFO: renamed from: a */
    public final ArrayList<String> f16678a;

    /* JADX INFO: renamed from: b */
    public final Map<String, List<String>> f16679b;

    public oka0(mcr mcrVar) {
        super(mcrVar);
        this.f16678a = new ArrayList<>();
        this.f16679b = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m19599g0(Bundle bundle) {
        m19601f0();
    }

    /* JADX INFO: renamed from: a0 */
    public void m19600a0() {
        super.a0();
        creates(new e30() { // from class: l.nka0
            public final void call(Object obj) {
                this.f16080a.m19599g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m19601f0() {
        LoopInputType loopInputType = (LoopInputType) ((rka0) ((jq2) this).viewModel).m22067s().getSerializable("loop_input_type");
        ((rka0) ((jq2) this).viewModel).m22059A3(loopInputType.title);
        ((rka0) ((jq2) this).viewModel).m22060B(loopInputType);
    }

    public void destroy() {
    }
}
