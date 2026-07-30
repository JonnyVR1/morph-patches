package p149l;

import com.p046p1.mobile.putong.live.livingroom.other.side.LiveSideView;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes4.dex */
public class zut extends jq2<LiveSideView> {

    /* JADX INFO: renamed from: a */
    public final bs5 f204889a;

    /* JADX INFO: renamed from: b */
    public String f204890b;

    public zut(mcr mcrVar) {
        super(mcrVar);
        this.f204889a = new bs5();
        this.f204890b = "";
    }

    @Override // p149l.q0m
    public void destroy() {
        m220253i0();
    }

    /* JADX INFO: renamed from: h0 */
    public String m220252h0() {
        return this.f204890b;
    }

    /* JADX INFO: renamed from: i0 */
    public void m220253i0() {
        this.f204889a.m103657c();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m220254j0(vut vutVar) {
        ((LiveSideView) this.viewModel).m75576y(vutVar);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m220255k0(String str) {
        if (str.equals(this.f204890b)) {
            return;
        }
        this.f204890b = "";
    }

    /* JADX INFO: renamed from: l0 */
    public void m220256l0(x7d0 x7d0Var) {
        if (this.viewModel == 0) {
            return;
        }
        this.f204890b = "";
        this.f204889a.m103655a(duringCreated(x7d0Var.m207278t().mo114611e().observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.wut
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((vut) obj).m200121a();
            }
        }).distinctUntilChanged()).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.xut
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194557a.m220254j0((vut) obj);
            }
        })));
        this.f204889a.m103655a(duringCreated(x7d0Var.m207273o()).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.yut
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200122a.m220255k0((String) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: m0 */
    public void m220257m0(String str) {
        this.f204890b = str;
    }
}
