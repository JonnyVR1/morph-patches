package p149l;

import android.text.TextUtils;
import android.util.Pair;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class y2n0 extends x6s<nnn0, a3n0> {

    /* JADX INFO: renamed from: j */
    public String f195659j;

    public y2n0(bsm bsmVar) {
        super(bsmVar);
        mo51532C(new a3n0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public /* synthetic */ void m212427V3(String str) {
        Pair pair = (Pair) m129297F3(new ynj(7012));
        if ((TextUtils.equals((CharSequence) pair.first, "voiceLiveMain") || TextUtils.equals((CharSequence) pair.first, "voiceLiveVice")) && vwb.m200296J((Collection) m129297F3(new qee0(700)))) {
            osi0.m165783g("请先选择一个收礼人");
        } else {
            ((a3n0) this.viewModel).m71834E();
            m212430X3(str);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m212428U3(List list) {
        ((a3n0) this.viewModel).m94731I(list);
    }

    /* JADX INFO: renamed from: W3 */
    public void m212429W3() {
        ((a3n0) this.viewModel).mo71838p();
        m206028F2().GiftDialogEventGroup.performCpGiftItemClick().mo172463j(this.f195659j);
    }

    /* JADX INFO: renamed from: X3 */
    public final void m212430X3(String str) {
        this.f195659j = str;
        duringCreated(jrl0.m142970c(str)).filter(new u76()).subscribe(ffw.m121197h(new e30() { // from class: l.x2n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f190808a.m212428U3((List) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129304h3(m206028F2().GiftDialogEventGroup.showCpGiftDetailDialog(), new e30() { // from class: l.w2n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184259a.m212427V3((String) obj);
            }
        });
    }
}
