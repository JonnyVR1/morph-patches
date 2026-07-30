package p153l;

import android.view.View;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiPk.dialog.C13064b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class il10 extends hj2<oo2, C13064b> {

    /* JADX INFO: renamed from: k */
    public List<LongLinkLiveMultiPk.MultiPkPlayer> f115479k;

    public il10(dum dumVar) {
        super(dumVar);
        m135319L3();
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m140526S3(uxj0 uxj0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public /* synthetic */ void m140527U3(vxj0 vxj0Var) {
        ((C13064b) this.viewModel).mo72910j();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().MultiPkEventGroup.multiPkOnEnd().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.el10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94469a.m140527U3((vxj0) obj);
            }
        }));
    }

    @Override // p153l.hj2
    /* JADX INFO: renamed from: T3, reason: merged with bridge method [inline-methods] */
    public C13064b mo76862K3() {
        return new C13064b();
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m140529V3(View view) {
        bf10.m103802H(this);
        m213811F2().MultiCallEvent.prepareCloseMultiCall().mo199273j(Boolean.TRUE);
        m213811F2().MultiPkEventGroup.multiPkOnEnd().m199277p();
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m140530W3(List list) {
        this.f115479k = list;
        ((C13064b) this.viewModel).m77052A(list);
        mo135321N3();
    }

    /* JADX INFO: renamed from: X3 */
    public void m140531X3() {
        new th0.C20312a(this.f196919f).m191151j("退出后,进行中的PK会被打断").m191159r("退出").m191156o(new View.OnClickListener() { // from class: l.gl10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104790a.m140529V3(view);
            }
        }).m191146e(R$string.f47690N1).m191148g(false).m191149h(false).m191142a().m191141g();
        ((C13064b) this.viewModel).mo72910j();
    }

    /* JADX INFO: renamed from: Y3 */
    public void m140532Y3() {
        if (this.f115479k.isEmpty()) {
            return;
        }
        BLiveMultiCall bLiveMultiCallM103848z = bf10.m103848z(this);
        ArrayList arrayList = new ArrayList();
        Iterator<LongLinkLiveMultiPk.MultiPkPlayer> it = this.f115479k.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getUserId());
        }
        if (bLiveMultiCallM103848z != null) {
            duringCreated(LivingNormalApiProvider.m72450K6(bLiveMultiCallM103848z.ownerLiveId, arrayList)).subscribe(dhw.m115826e(new y20() { // from class: l.hl10
                @Override // p153l.y20
                public final void call(Object obj) {
                    il10.m140526S3((uxj0) obj);
                }
            }, new z2e0()));
        }
        ((C13064b) this.viewModel).mo72910j();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().MultiCallEvent.clickPkOver().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.fl10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99581a.m140530W3((List) obj);
            }
        }));
    }
}
