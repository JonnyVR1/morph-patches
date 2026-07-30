package p149l;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class gqm0 extends h4t<nnn0, jqm0> {

    /* JADX INFO: renamed from: i */
    public List<iik0> f103961i;

    public gqm0(bsm bsmVar) {
        super(bsmVar);
        ArrayList arrayListM200324f0 = vwb.m200324f0((iik0) m144512z2(new cgk0(bsmVar)));
        this.f103961i = arrayListM200324f0;
        mo51532C(new jqm0(vwb.m200303Q(arrayListM200324f0, new w9j() { // from class: l.bqm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((iik0) obj).getTabName();
            }
        }), vwb.m200303Q(this.f103961i, new w9j() { // from class: l.cqm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((iik0) obj).getView();
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public /* synthetic */ Boolean m127616P3(Integer num) {
        return Boolean.valueOf(((jqm0) this.viewModel).m142823f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m127617R3(Integer num) {
        m127620T3(m127618O3("page_apply"));
    }

    /* JADX INFO: renamed from: O3 */
    public final int m127618O3(String str) {
        if (TextUtils.equals(str, "page_invite")) {
            return 1;
        }
        return (!TextUtils.equals(str, "page_apply") && TextUtils.equals(str, "page_invite")) ? 2 : 0;
    }

    /* JADX INFO: renamed from: S3 */
    public void m127619S3(int i) {
        this.f103961i.get(i).mo106770c();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().VoiceCallEvent.openVoiceCallDlgEvent().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.dqm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87458a.m127621U3((String) obj);
            }
        }));
        duringCreated(m206028F2().VoiceCallEvent.updateApplyCountEvent().m172460g()).filter(new w9j() { // from class: l.eqm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f92812a.m127616P3((Integer) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.fqm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98824a.m127617R3((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final void m127620T3(int i) {
        ((jqm0) this.viewModel).m142826n(i, this.f103961i.get(i).getTabName());
    }

    /* JADX INFO: renamed from: U3 */
    public final void m127621U3(String str) {
        ((jqm0) this.viewModel).m142827p();
        int iM127618O3 = m127618O3(str);
        if (iM127618O3 != ((jqm0) this.viewModel).m142824i()) {
            ((jqm0) this.viewModel).m142825m(iM127618O3);
        } else {
            m127619S3(iM127618O3);
        }
        m127620T3(0);
    }
}
