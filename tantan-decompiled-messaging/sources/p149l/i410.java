package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import java.util.HashMap;
import p149l.ho2;

/* JADX INFO: loaded from: classes5.dex */
public class i410<D extends ho2> extends pat<D> {

    /* JADX INFO: renamed from: i */
    public HashMap<String, BLiveMultiCall> f111398i;

    /* JADX INFO: renamed from: j */
    public j510<D> f111399j;

    public i410(bsm<D> bsmVar, j510<D> j510Var) {
        super(bsmVar);
        this.f111398i = new HashMap<>();
        this.f111399j = j510Var;
    }

    /* JADX INFO: renamed from: K3 */
    public void m134316K3(BLiveMultiCall bLiveMultiCall) {
        if (this.f111398i.containsKey(bLiveMultiCall.userId)) {
            return;
        }
        this.f111398i.put(bLiveMultiCall.userId, bLiveMultiCall);
        yi10.m214879a("add connecting call:" + bLiveMultiCall.userId);
    }

    /* JADX INFO: renamed from: L3 */
    public int m134317L3(String str) {
        int i;
        BLiveMultiCall bLiveMultiCallM100373s = this.f111399j.m139800b4().m100373s(str);
        BLiveMultiCall bLiveMultiCall = this.f111398i.get(str);
        if (vg10.m198312d(bLiveMultiCallM100373s)) {
            i = bLiveMultiCallM100373s.position;
        } else {
            i = bLiveMultiCall != null ? bLiveMultiCall.position : -1;
        }
        yi10.m214879a("connecting module getCallPos :" + i);
        return i;
    }

    /* JADX INFO: renamed from: M3 */
    public void mo134318M3(u5t u5tVar) {
        BLiveMultiCall bLiveMultiCallM191876b = u5tVar.m191876b();
        if (vg10.m198309a(bLiveMultiCallM191876b)) {
            m134316K3(bLiveMultiCallM191876b);
            return;
        }
        if ((vg10.m198312d(bLiveMultiCallM191876b) || vg10.m198311c(bLiveMultiCallM191876b)) && this.f111398i.containsKey(bLiveMultiCallM191876b.userId)) {
            this.f111398i.remove(bLiveMultiCallM191876b.userId);
            yi10.m214879a("remove connecting call:" + bLiveMultiCallM191876b.userId);
        }
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ Boolean m134319N3(u5t u5tVar) {
        return Boolean.valueOf(this.f111399j.m139808j4(u5tVar.m191876b()));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m132160q1().m189068R()).filter(new w9j() { // from class: l.e410
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f89243a.m134319N3((u5t) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.f410
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94734a.mo134318M3((u5t) obj);
            }
        }));
        duringCreated(this.f111399j.m139804f4()).filter(new w9j() { // from class: l.g410
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(vg10.m198309a((BLiveMultiCall) obj));
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.h410
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105793a.m134316K3((BLiveMultiCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O3 */
    public void mo134320O3(String str) {
    }
}
