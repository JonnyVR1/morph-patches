package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.ho2;

/* JADX INFO: loaded from: classes5.dex */
public class cg10<D extends ho2> extends pat<D> {

    /* JADX INFO: renamed from: i */
    public final C22392a<BLiveMultiCall> f80690i;

    public cg10(bsm<D> bsmVar) {
        super(bsmVar);
        this.f80690i = C22392a.m221512b();
    }

    /* JADX INFO: renamed from: L3 */
    public void m106645L3(BLiveMultiCall bLiveMultiCall) {
        m106649P3(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: M3 */
    public BLiveMultiCall m106646M3() {
        return this.f80690i.m221515e();
    }

    /* JADX INFO: renamed from: N3 */
    public C22306c<BLiveMultiCall> m106647N3() {
        return this.f80690i.asObservable();
    }

    /* JADX INFO: renamed from: O3 */
    public void m106648O3(BLiveMultiCall bLiveMultiCall) {
        m106649P3(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m106649P3(BLiveMultiCall bLiveMultiCall) {
        if (r610.m177988W(bLiveMultiCall.userId)) {
            BLiveMultiCall bLiveMultiCallM106646M3 = m106646M3();
            if (bLiveMultiCallM106646M3 != null && TextUtils.equals(bLiveMultiCall.state, bLiveMultiCallM106646M3.state) && TextUtils.equals(bLiveMultiCall.f44400id, bLiveMultiCallM106646M3.f44400id) && bLiveMultiCall.isAway == bLiveMultiCallM106646M3.isAway) {
                return;
            }
            yi10.m214879a("send self call state: id:" + bLiveMultiCall.f44400id + ", state:" + bLiveMultiCall.state);
            this.f80690i.m132487l(bLiveMultiCall);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public void m106650R3(BLiveMultiCall bLiveMultiCall) {
        m106649P3(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: S3 */
    public void m106651S3(List<BLiveMultiCall> list) {
        BLiveMultiCall bLiveMultiCall = (BLiveMultiCall) vwb.m200346r(list, new w9j() { // from class: l.bg10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(r610.m177988W(((BLiveMultiCall) obj).userId));
            }
        });
        if (bLiveMultiCall != null) {
            m106649P3(bLiveMultiCall);
            return;
        }
        if (m106646M3() != null) {
            if (s410.f162219I.equals(m106646M3().state) || s410.f162249o.equals(m106646M3().state)) {
                BLiveMultiCall bLiveMultiCallMo223809clone = m106646M3().mo223809clone();
                bLiveMultiCallMo223809clone.state = s410.f162250p;
                m106649P3(bLiveMultiCallMo223809clone);
            }
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129304h3(m206028F2().MultiCallEvent.updateSelfCall(), new e30() { // from class: l.ag10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69239a.m106649P3((BLiveMultiCall) obj);
            }
        });
    }
}
