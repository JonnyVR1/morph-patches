package p002l;

import com.p000p1.mobile.putong.live.livingroom.other.side.LiveSideView;
import l.bs5;
import l.e30;
import l.ffw;
import l.jo0;
import l.jq2;
import l.mcr;
import l.w9j;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zut extends jq2<LiveSideView> {

    /* JADX INFO: renamed from: a */
    public final bs5 f23596a;

    /* JADX INFO: renamed from: b */
    public String f23597b;

    public zut(mcr mcrVar) {
        super(mcrVar);
        this.f23596a = new bs5();
        this.f23597b = "";
    }

    public void destroy() {
        m27537i0();
    }

    /* JADX INFO: renamed from: h0 */
    public String m27536h0() {
        return this.f23597b;
    }

    /* JADX INFO: renamed from: i0 */
    public void m27537i0() {
        this.f23596a.c();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m27538j0(vut vutVar) {
        ((LiveSideView) ((jq2) this).viewModel).m9215y(vutVar);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m27539k0(String str) {
        if (str.equals(this.f23597b)) {
            return;
        }
        this.f23597b = "";
    }

    /* JADX INFO: renamed from: l0 */
    public void m27540l0(x7d0 x7d0Var) {
        if (((jq2) this).viewModel == null) {
            return;
        }
        this.f23597b = "";
        this.f23596a.a(duringCreated(x7d0Var.m25730t().mo12169e().observeOn(Schedulers.io()).map(new w9j() { // from class: l.wut
            public final Object call(Object obj) {
                return ((vut) obj).m24163a();
            }
        }).distinctUntilChanged()).onBackpressureLatest().observeOn(jo0.a()).subscribe(ffw.h(new e30() { // from class: l.xut
            public final void call(Object obj) {
                this.f22475a.m27538j0((vut) obj);
            }
        })));
        this.f23596a.a(duringCreated(x7d0Var.m25725o()).observeOn(jo0.a()).subscribe(ffw.h(new e30() { // from class: l.yut
            public final void call(Object obj) {
                this.f23108a.m27539k0((String) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: m0 */
    public void m27541m0(String str) {
        this.f23597b = str;
    }
}
