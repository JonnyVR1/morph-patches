package p153l;

import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes5.dex */
public class etn0 extends rvo0<rwn0> {
    public etn0(dum dumVar, FrameLayout frameLayout) {
        super(dumVar, frameLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m122481e4(Integer num) {
        m183290U3();
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m122482f4(Integer num) {
        m183293X3();
    }

    @Override // p153l.rvo0, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().VoiceGameChangeEvent.startVoiceGame().m199270g()).filter(new qcj() { // from class: l.atn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() == 4);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.btn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78370a.m122481e4((Integer) obj);
            }
        }));
        duringCreated(m213811F2().VoiceGameChangeEvent.stopVoiceGame().m199270g()).filter(new qcj() { // from class: l.ctn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Integer num = (Integer) obj;
                return Boolean.valueOf(num.intValue() == 4 || num.intValue() == 5);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.dtn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90607a.m122482f4((Integer) obj);
            }
        }));
    }
}
