package p153l;

import com.p051p1.mobile.putong.live.livingroom.other.side.LiveSideView;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes5.dex */
public class axt extends ar2<LiveSideView> {

    /* JADX INFO: renamed from: a */
    public final ft5 f73911a;

    /* JADX INFO: renamed from: b */
    public String f73912b;

    public axt(ner nerVar) {
        super(nerVar);
        this.f73911a = new ft5();
        this.f73912b = "";
    }

    @Override // p153l.k3m
    public void destroy() {
        m100836i0();
    }

    /* JADX INFO: renamed from: h0 */
    public String m100835h0() {
        return this.f73912b;
    }

    /* JADX INFO: renamed from: i0 */
    public void m100836i0() {
        this.f73911a.m127299c();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m100837j0(wwt wwtVar) {
        ((LiveSideView) this.viewModel).m76759y(wwtVar);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m100838k0(String str) {
        if (str.equals(this.f73912b)) {
            return;
        }
        this.f73912b = "";
    }

    /* JADX INFO: renamed from: l0 */
    public void m100839l0(agd0 agd0Var) {
        if (this.viewModel == 0) {
            return;
        }
        this.f73912b = "";
        this.f73911a.m127297a(duringCreated(agd0Var.m97615t().mo129565e().observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.xwt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((wwt) obj).m208295a();
            }
        }).distinctUntilChanged()).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.ywt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201859a.m100837j0((wwt) obj);
            }
        })));
        this.f73911a.m127297a(duringCreated(agd0Var.m97610o()).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.zwt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206379a.m100838k0((String) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: m0 */
    public void m100840m0(String str) {
        this.f73912b = str;
    }
}
