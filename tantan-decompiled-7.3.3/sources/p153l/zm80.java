package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.BoostStartView;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.GiftRedPacketView;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.OperationEntranceAnimView;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.PreOperationAnimView;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.ticketAnim.view.UserAnchorTicketView;
import com.tantanapp.common.utils.NullChecker;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public class zm80 extends i6t<oo2, PreOperationAnimView> {

    /* JADX INFO: renamed from: i */
    public BasePreOperationView f205047i;

    /* JADX INFO: renamed from: j */
    public ViewTreeObserver.OnGlobalLayoutListener f205048j;

    /* JADX INFO: renamed from: k */
    public boolean f205049k;

    /* JADX INFO: renamed from: l */
    public LinkedList<q260> f205050l;

    public zm80(dum dumVar, PreOperationAnimView preOperationAnimView) {
        super(dumVar);
        this.f205049k = false;
        this.f205050l = new LinkedList<>();
        mo52715C(preOperationAnimView);
    }

    /* JADX INFO: renamed from: U3 */
    private void m220359U3() {
        this.f205049k = false;
        if (NullChecker.m82486a(this.f205047i)) {
            this.f205047i.destroy();
            if (NullChecker.m82486a(this.f205047i.getPresenter())) {
                m153097C2(this.f205047i.getPresenter());
            }
            ((PreOperationAnimView) this.viewModel).removeView(this.f205047i);
            this.f205047i = null;
        }
        m220369Y3();
    }

    /* JADX INFO: renamed from: N3 */
    public final void m220360N3(q260 q260Var) {
        if (q260Var.m174999k()) {
            this.f205050l.addFirst(q260Var);
            return;
        }
        boolean zM175000l = q260Var.m175000l();
        LinkedList<q260> linkedList = this.f205050l;
        if (zM175000l) {
            linkedList.addFirst(q260Var);
        } else {
            linkedList.add(q260Var);
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final BasePreOperationView m220361O3(q260 q260Var) {
        if (q260Var.m174999k()) {
            return new OperationEntranceAnimView(this.f196919f);
        }
        if (q260Var.m175000l()) {
            return new BoostStartView(this.f196919f);
        }
        if (q260Var.m174998j()) {
            return new GiftRedPacketView(this.f196919f);
        }
        if (q260Var.m175001m()) {
            return new UserAnchorTicketView(this.f196919f, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: P3 */
    public boolean m220362P3() {
        return NullChecker.m82486a(jyb.m147529r(this.f205050l, new qcj() { // from class: l.xm80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((q260) obj).m174999k());
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m220363R3() {
        ((PreOperationAnimView) this.viewModel).getViewTreeObserver().removeOnGlobalLayoutListener(this.f205048j);
        if (NullChecker.m82486a(this.f205047i)) {
            this.f205047i.mo76177q0(bnl0.m105560i0((View) this.viewModel));
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m220364S3(q260 q260Var) {
        m220359U3();
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ Boolean m220365T3(a260 a260Var) {
        return Boolean.valueOf(m220362P3());
    }

    /* JADX INFO: renamed from: V3 */
    public void m220366V3(q260 q260Var) {
        BLiveOperationItem bLiveOperationItemM174993e = q260Var.m174993e();
        BasePreOperationView basePreOperationViewM220361O3 = m220361O3(q260Var);
        if (basePreOperationViewM220361O3 == null) {
            return;
        }
        BasePreOperationView basePreOperationView = (BasePreOperationView) basePreOperationViewM220361O3.inflateView(LayoutInflater.from(this.f196919f), null);
        this.f205047i = basePreOperationView;
        i6t i6tVarMo76174n0 = basePreOperationView.mo76174n0(this.f196918e);
        this.f205047i.mo22064i1(i6tVarMo76174n0);
        m153103z2(i6tVarMo76174n0);
        this.f205047i.setOperationPlace(bLiveOperationItemM174993e);
        this.f205047i.mo76175o0(q260Var);
        this.f205047i.mo76169i0((PreOperationAnimView) this.viewModel);
        if (q260Var.m174991c()) {
            this.f205049k = true;
        }
        m220367W3();
    }

    /* JADX INFO: renamed from: W3 */
    public void m220367W3() {
        this.f205047i.mo76176p0();
        this.f205048j = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.ym80
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f200645a.m220363R3();
            }
        };
        ((PreOperationAnimView) this.viewModel).getViewTreeObserver().addOnGlobalLayoutListener(this.f205048j);
    }

    /* JADX INFO: renamed from: X3 */
    public final void m220368X3(q260 q260Var) {
        if (q260Var.m174991c()) {
            m220360N3(q260Var);
            m220369Y3();
        } else if (NullChecker.m82486a(q260Var)) {
            m220366V3(q260Var);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m220369Y3() {
        q260 q260VarPoll;
        if (jyb.m147479J(this.f205050l) || this.f205049k || (q260VarPoll = this.f205050l.poll()) == null) {
            return;
        }
        m220366V3(q260VarPoll);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        BasePreOperationView basePreOperationView = this.f205047i;
        if (basePreOperationView != null) {
            basePreOperationView.destroy();
            this.f205047i = null;
        }
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((PreOperationAnimView) v2).removeAllViews();
        }
        LinkedList<q260> linkedList = this.f205050l;
        if (linkedList != null) {
            linkedList.clear();
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().OperationsEvent.boostStart().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.um80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179609a.m220368X3((q260) obj);
            }
        }));
        duringCreated(m213811F2().OperationsEvent.boostStartEnd().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.vm80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184676a.m220364S3((q260) obj);
            }
        }));
        m138860d3(a260.class, new qcj() { // from class: l.wm80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f189781a.m220365T3((a260) obj);
            }
        });
    }
}
