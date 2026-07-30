package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import java.util.HashMap;
import p153l.oo2;

/* JADX INFO: loaded from: classes5.dex */
public class sc10<D extends oo2> extends qct<D> {

    /* JADX INFO: renamed from: i */
    public HashMap<String, BLiveMultiCall> f167190i;

    /* JADX INFO: renamed from: j */
    public td10<D> f167191j;

    public sc10(dum<D> dumVar, td10<D> td10Var) {
        super(dumVar);
        this.f167190i = new HashMap<>();
        this.f167191j = td10Var;
    }

    /* JADX INFO: renamed from: K3 */
    public void m185360K3(BLiveMultiCall bLiveMultiCall) {
        if (this.f167190i.containsKey(bLiveMultiCall.userId)) {
            return;
        }
        this.f167190i.put(bLiveMultiCall.userId, bLiveMultiCall);
        ir10.m141746a("add connecting call:" + bLiveMultiCall.userId);
    }

    /* JADX INFO: renamed from: L3 */
    public int m185361L3(String str) {
        int i;
        BLiveMultiCall bLiveMultiCallM153851s = this.f167191j.m190584b4().m153851s(str);
        BLiveMultiCall bLiveMultiCall = this.f167190i.get(str);
        if (fp10.m126517d(bLiveMultiCallM153851s)) {
            i = bLiveMultiCallM153851s.position;
        } else {
            i = bLiveMultiCall != null ? bLiveMultiCall.position : -1;
        }
        ir10.m141746a("connecting module getCallPos :" + i);
        return i;
    }

    /* JADX INFO: renamed from: M3 */
    public void mo103571M3(v7t v7tVar) {
        BLiveMultiCall bLiveMultiCallM200274b = v7tVar.m200274b();
        if (fp10.m126514a(bLiveMultiCallM200274b)) {
            m185360K3(bLiveMultiCallM200274b);
            return;
        }
        if ((fp10.m126517d(bLiveMultiCallM200274b) || fp10.m126516c(bLiveMultiCallM200274b)) && this.f167190i.containsKey(bLiveMultiCallM200274b.userId)) {
            this.f167190i.remove(bLiveMultiCallM200274b.userId);
            ir10.m141746a("remove connecting call:" + bLiveMultiCallM200274b.userId);
        }
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ Boolean m185362N3(v7t v7tVar) {
        return Boolean.valueOf(this.f167191j.m190592j4(v7tVar.m200274b()));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m168545q1().m98250R()).filter(new qcj() { // from class: l.oc10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f146643a.m185362N3((v7t) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.pc10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151511a.mo103571M3((v7t) obj);
            }
        }));
        duringCreated(this.f167191j.m190588f4()).filter(new qcj() { // from class: l.qc10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(fp10.m126514a((BLiveMultiCall) obj));
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.rc10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162059a.m185360K3((BLiveMultiCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O3 */
    public void mo103572O3(String str) {
    }
}
