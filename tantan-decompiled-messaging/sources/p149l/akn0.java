package p149l;

import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes5.dex */
public class akn0 extends nmo0<nnn0> {
    public akn0(bsm bsmVar, FrameLayout frameLayout) {
        super(bsmVar, frameLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m97160e4(Integer num) {
        m160147U3();
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m97161f4(Integer num) {
        m160150X3();
    }

    @Override // p149l.nmo0, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().VoiceGameChangeEvent.startVoiceGame().m172460g()).filter(new w9j() { // from class: l.wjn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() == 4);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.xjn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193234a.m97160e4((Integer) obj);
            }
        }));
        duringCreated(m206028F2().VoiceGameChangeEvent.stopVoiceGame().m172460g()).filter(new w9j() { // from class: l.yjn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Integer num = (Integer) obj;
                return Boolean.valueOf(num.intValue() == 4 || num.intValue() == 5);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.zjn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203433a.m97161f4((Integer) obj);
            }
        }));
    }
}
