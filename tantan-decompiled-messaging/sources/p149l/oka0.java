package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class oka0 extends jq2<rka0> {

    /* JADX INFO: renamed from: a */
    public final ArrayList<String> f144406a;

    /* JADX INFO: renamed from: b */
    public final Map<String, List<String>> f144407b;

    public oka0(mcr mcrVar) {
        super(mcrVar);
        this.f144406a = new ArrayList<>();
        this.f144407b = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m164838g0(Bundle bundle) {
        m164839f0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.nka0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139386a.m164838g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m164839f0() {
        LoopInputType loopInputType = (LoopInputType) ((rka0) this.viewModel).m179699s().getSerializable("loop_input_type");
        ((rka0) this.viewModel).m179693A3(loopInputType.title);
        ((rka0) this.viewModel).m179694B(loopInputType);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
