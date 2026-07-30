package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ssa0 extends ar2<vsa0> {

    /* JADX INFO: renamed from: a */
    public final ArrayList<String> f170444a;

    /* JADX INFO: renamed from: b */
    public final Map<String, List<String>> f170445b;

    public ssa0(ner nerVar) {
        super(nerVar);
        this.f170444a = new ArrayList<>();
        this.f170445b = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m187695g0(Bundle bundle) {
        m187696f0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.rsa0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164649a.m187695g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m187696f0() {
        LoopInputType loopInputType = (LoopInputType) ((vsa0) this.viewModel).m202598s().getSerializable("loop_input_type");
        ((vsa0) this.viewModel).m202592A3(loopInputType.title);
        ((vsa0) this.viewModel).m202593B(loopInputType);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
