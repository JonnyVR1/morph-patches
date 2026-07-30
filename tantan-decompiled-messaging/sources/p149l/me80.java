package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;

/* JADX INFO: loaded from: classes4.dex */
public class me80 extends h4t<ho2, me80> implements s7m, l3m {

    /* JADX INFO: renamed from: i */
    public final c4g0 f133380i;

    /* JADX INFO: renamed from: j */
    public String f133381j;

    /* JADX INFO: renamed from: k */
    public Boolean f133382k;

    public me80(bsm bsmVar) {
        super(bsmVar);
        this.f133380i = h4g0.m129242c(m206028F2().PreLoadEvent.cleanPreLoad().m172460g().subscribe(ffw.m121193d(new e30() { // from class: l.ke80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122682a.m154167M3((soj0) obj);
            }
        })), m206028F2().PreLoadEvent.preLoad().m172460g().subscribe(ffw.m121193d(new e30() { // from class: l.le80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127656a.m154168N3((ie80) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: L3 */
    public void m154166L3() {
        this.f133381j = null;
        this.f133382k = null;
        m206028F2().PlayerEvent.restorePlayerView().m172467p();
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m154167M3(soj0 soj0Var) {
        m154166L3();
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m154168N3(ie80 ie80Var) {
        m154169O3(ie80Var.f112713a, ie80Var.f112714b);
    }

    /* JADX INFO: renamed from: O3 */
    public void m154169O3(boolean z, BLiveAbsData bLiveAbsData) {
        if (TextUtils.equals(this.f133381j, bLiveAbsData.f44323id) && this.f133382k.booleanValue() == z) {
            return;
        }
        m206028F2().PlayerEvent.restorePlayerView().m172467p();
        this.f133381j = bLiveAbsData.f44323id;
        this.f133382k = Boolean.valueOf(z);
        m206028F2().PlayerEvent.prePlay().mo172463j(bLiveAbsData);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.l3m
    /* JADX INFO: renamed from: m1 */
    public void mo105734m1() {
        mkd0.m154992z(this.f133380i);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m154166L3();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(q0m q0mVar) {
    }
}
