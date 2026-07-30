package p153l;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class kzm0 extends i6t<rwn0, nzm0> {

    /* JADX INFO: renamed from: i */
    public List<ork0> f129437i;

    public kzm0(dum dumVar) {
        super(dumVar);
        ArrayList arrayListM147507f0 = jyb.m147507f0((ork0) m153103z2(new ipk0(dumVar)));
        this.f129437i = arrayListM147507f0;
        mo52715C(new nzm0(jyb.m147486Q(arrayListM147507f0, new qcj() { // from class: l.fzm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((ork0) obj).getTabName();
            }
        }), jyb.m147486Q(this.f129437i, new qcj() { // from class: l.gzm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((ork0) obj).getView();
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public /* synthetic */ Boolean m152206P3(Integer num) {
        return Boolean.valueOf(((nzm0) this.viewModel).m165385f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m152207R3(Integer num) {
        m152210T3(m152208O3("page_apply"));
    }

    /* JADX INFO: renamed from: O3 */
    public final int m152208O3(String str) {
        if (TextUtils.equals(str, "page_invite")) {
            return 1;
        }
        return (!TextUtils.equals(str, "page_apply") && TextUtils.equals(str, "page_invite")) ? 2 : 0;
    }

    /* JADX INFO: renamed from: S3 */
    public void m152209S3(int i) {
        this.f129437i.get(i).mo141519c();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().VoiceCallEvent.openVoiceCallDlgEvent().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.hzm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112272a.m152211U3((String) obj);
            }
        }));
        duringCreated(m213811F2().VoiceCallEvent.updateApplyCountEvent().m199270g()).filter(new qcj() { // from class: l.izm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f117720a.m152206P3((Integer) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.jzm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123277a.m152207R3((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final void m152210T3(int i) {
        ((nzm0) this.viewModel).m165388n(i, this.f129437i.get(i).getTabName());
    }

    /* JADX INFO: renamed from: U3 */
    public final void m152211U3(String str) {
        ((nzm0) this.viewModel).m165389p();
        int iM152208O3 = m152208O3(str);
        if (iM152208O3 != ((nzm0) this.viewModel).m165386i()) {
            ((nzm0) this.viewModel).m165387m(iM152208O3);
        } else {
            m152209S3(iM152208O3);
        }
        m152210T3(0);
    }
}
