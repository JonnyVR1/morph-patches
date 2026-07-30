package p149l;

import android.view.View;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiPk.dialog.C12901b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class yc10 extends zi2<ho2, C12901b> {

    /* JADX INFO: renamed from: k */
    public List<LongLinkLiveMultiPk.MultiPkPlayer> f197399k;

    public yc10(bsm bsmVar) {
        super(bsmVar);
        m218910L3();
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m213991S3(roj0 roj0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public /* synthetic */ void m213992U3(soj0 soj0Var) {
        ((C12901b) this.viewModel).mo71727j();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().MultiPkEventGroup.multiPkOnEnd().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.uc10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175782a.m213992U3((soj0) obj);
            }
        }));
    }

    @Override // p149l.zi2
    /* JADX INFO: renamed from: T3, reason: merged with bridge method [inline-methods] */
    public C12901b mo75679K3() {
        return new C12901b();
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m213994V3(View view) {
        r610.m177973H(this);
        m206028F2().MultiCallEvent.prepareCloseMultiCall().mo172463j(Boolean.TRUE);
        m206028F2().MultiPkEventGroup.multiPkOnEnd().m172467p();
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m213995W3(List list) {
        this.f197399k = list;
        ((C12901b) this.viewModel).m75869A(list);
        mo168244N3();
    }

    /* JADX INFO: renamed from: X3 */
    public void m213996X3() {
        new xh0.C21150a(this.f188513f).m208731j("退出后,进行中的PK会被打断").m208739r("退出").m208736o(new View.OnClickListener() { // from class: l.wc10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185637a.m213994V3(view);
            }
        }).m208726e(R$string.f46842N1).m208728g(false).m208729h(false).m208722a().m208721g();
        ((C12901b) this.viewModel).mo71727j();
    }

    /* JADX INFO: renamed from: Y3 */
    public void m213997Y3() {
        if (this.f197399k.isEmpty()) {
            return;
        }
        BLiveMultiCall bLiveMultiCallM178019z = r610.m178019z(this);
        ArrayList arrayList = new ArrayList();
        Iterator<LongLinkLiveMultiPk.MultiPkPlayer> it = this.f197399k.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getUserId());
        }
        if (bLiveMultiCallM178019z != null) {
            duringCreated(LivingNormalApiProvider.m71267K6(bLiveMultiCallM178019z.ownerLiveId, arrayList)).subscribe(ffw.m121194e(new e30() { // from class: l.xc10
                @Override // p149l.e30
                public final void call(Object obj) {
                    yc10.m213991S3((roj0) obj);
                }
            }, new vud0()));
        }
        ((C12901b) this.viewModel).mo71727j();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().MultiCallEvent.clickPkOver().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.vc10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180902a.m213995W3((List) obj);
            }
        }));
    }
}
