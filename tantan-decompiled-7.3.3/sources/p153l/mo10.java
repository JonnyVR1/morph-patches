package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.oo2;

/* JADX INFO: loaded from: classes5.dex */
public class mo10<D extends oo2> extends qct<D> {

    /* JADX INFO: renamed from: i */
    public final C22507a<BLiveMultiCall> f137767i;

    public mo10(dum<D> dumVar) {
        super(dumVar);
        this.f137767i = C22507a.m222758b();
    }

    /* JADX INFO: renamed from: L3 */
    public void m159226L3(BLiveMultiCall bLiveMultiCall) {
        m159230P3(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: M3 */
    public BLiveMultiCall m159227M3() {
        return this.f137767i.m222761e();
    }

    /* JADX INFO: renamed from: N3 */
    public C22421c<BLiveMultiCall> m159228N3() {
        return this.f137767i.asObservable();
    }

    /* JADX INFO: renamed from: O3 */
    public void m159229O3(BLiveMultiCall bLiveMultiCall) {
        m159230P3(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m159230P3(BLiveMultiCall bLiveMultiCall) {
        if (bf10.m103817W(bLiveMultiCall.userId)) {
            BLiveMultiCall bLiveMultiCallM159227M3 = m159227M3();
            if (bLiveMultiCallM159227M3 != null && TextUtils.equals(bLiveMultiCall.state, bLiveMultiCallM159227M3.state) && TextUtils.equals(bLiveMultiCall.f45248id, bLiveMultiCallM159227M3.f45248id) && bLiveMultiCall.isAway == bLiveMultiCallM159227M3.isAway) {
                return;
            }
            ir10.m141746a("send self call state: id:" + bLiveMultiCall.f45248id + ", state:" + bLiveMultiCall.state);
            this.f137767i.m137019l(bLiveMultiCall);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public void m159231R3(BLiveMultiCall bLiveMultiCall) {
        m159230P3(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: S3 */
    public void m159232S3(List<BLiveMultiCall> list) {
        BLiveMultiCall bLiveMultiCall = (BLiveMultiCall) jyb.m147529r(list, new qcj() { // from class: l.lo10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(bf10.m103817W(((BLiveMultiCall) obj).userId));
            }
        });
        if (bLiveMultiCall != null) {
            m159230P3(bLiveMultiCall);
            return;
        }
        if (m159227M3() != null) {
            if (cd10.f81057I.equals(m159227M3().state) || cd10.f81087o.equals(m159227M3().state)) {
                BLiveMultiCall bLiveMultiCallMo225055clone = m159227M3().mo225055clone();
                bLiveMultiCallMo225055clone.state = cd10.f81088p;
                m159230P3(bLiveMultiCallMo225055clone);
            }
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138863h3(m213811F2().MultiCallEvent.updateSelfCall(), new y20() { // from class: l.ko10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127665a.m159230P3((BLiveMultiCall) obj);
            }
        });
    }
}
