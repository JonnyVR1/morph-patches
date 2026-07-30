package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.BoostStartView;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.GiftRedPacketView;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.OperationEntranceAnimView;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.PreOperationAnimView;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.ticketAnim.view.UserAnchorTicketView;
import com.tantanapp.common.utils.NullChecker;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public class te80 extends h4t<ho2, PreOperationAnimView> {

    /* JADX INFO: renamed from: i */
    public BasePreOperationView f169802i;

    /* JADX INFO: renamed from: j */
    public ViewTreeObserver.OnGlobalLayoutListener f169803j;

    /* JADX INFO: renamed from: k */
    public boolean f169804k;

    /* JADX INFO: renamed from: l */
    public LinkedList<ku50> f169805l;

    public te80(bsm bsmVar, PreOperationAnimView preOperationAnimView) {
        super(bsmVar);
        this.f169804k = false;
        this.f169805l = new LinkedList<>();
        mo51532C(preOperationAnimView);
    }

    /* JADX INFO: renamed from: U3 */
    private void m188477U3() {
        this.f169804k = false;
        if (NullChecker.m81303a(this.f169802i)) {
            this.f169802i.destroy();
            if (NullChecker.m81303a(this.f169802i.getPresenter())) {
                m144506C2(this.f169802i.getPresenter());
            }
            ((PreOperationAnimView) this.viewModel).removeView(this.f169802i);
            this.f169802i = null;
        }
        m188487Y3();
    }

    /* JADX INFO: renamed from: N3 */
    public final void m188478N3(ku50 ku50Var) {
        if (ku50Var.m147253k()) {
            this.f169805l.addFirst(ku50Var);
            return;
        }
        boolean zM147254l = ku50Var.m147254l();
        LinkedList<ku50> linkedList = this.f169805l;
        if (zM147254l) {
            linkedList.addFirst(ku50Var);
        } else {
            linkedList.add(ku50Var);
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final BasePreOperationView m188479O3(ku50 ku50Var) {
        if (ku50Var.m147253k()) {
            return new OperationEntranceAnimView(this.f188513f);
        }
        if (ku50Var.m147254l()) {
            return new BoostStartView(this.f188513f);
        }
        if (ku50Var.m147252j()) {
            return new GiftRedPacketView(this.f188513f);
        }
        if (ku50Var.m147255m()) {
            return new UserAnchorTicketView(this.f188513f, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: P3 */
    public boolean m188480P3() {
        return NullChecker.m81303a(vwb.m200346r(this.f169805l, new w9j() { // from class: l.re80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((ku50) obj).m147253k());
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m188481R3() {
        ((PreOperationAnimView) this.viewModel).getViewTreeObserver().removeOnGlobalLayoutListener(this.f169803j);
        if (NullChecker.m81303a(this.f169802i)) {
            this.f169802i.mo74994q0(xdl0.m208380i0((View) this.viewModel));
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m188482S3(ku50 ku50Var) {
        m188477U3();
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ Boolean m188483T3(ut50 ut50Var) {
        return Boolean.valueOf(m188480P3());
    }

    /* JADX INFO: renamed from: V3 */
    public void m188484V3(ku50 ku50Var) {
        BLiveOperationItem bLiveOperationItemM147247e = ku50Var.m147247e();
        BasePreOperationView basePreOperationViewM188479O3 = m188479O3(ku50Var);
        if (basePreOperationViewM188479O3 == null) {
            return;
        }
        BasePreOperationView basePreOperationView = (BasePreOperationView) basePreOperationViewM188479O3.inflateView(LayoutInflater.from(this.f188513f), null);
        this.f169802i = basePreOperationView;
        h4t h4tVarMo74991n0 = basePreOperationView.mo74991n0(this.f188512e);
        this.f169802i.mo21065i1(h4tVarMo74991n0);
        m144512z2(h4tVarMo74991n0);
        this.f169802i.setOperationPlace(bLiveOperationItemM147247e);
        this.f169802i.mo74992o0(ku50Var);
        this.f169802i.mo74986i0((PreOperationAnimView) this.viewModel);
        if (ku50Var.m147245c()) {
            this.f169804k = true;
        }
        m188485W3();
    }

    /* JADX INFO: renamed from: W3 */
    public void m188485W3() {
        this.f169802i.mo74993p0();
        this.f169803j = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.se80
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f163934a.m188481R3();
            }
        };
        ((PreOperationAnimView) this.viewModel).getViewTreeObserver().addOnGlobalLayoutListener(this.f169803j);
    }

    /* JADX INFO: renamed from: X3 */
    public final void m188486X3(ku50 ku50Var) {
        if (ku50Var.m147245c()) {
            m188478N3(ku50Var);
            m188487Y3();
        } else if (NullChecker.m81303a(ku50Var)) {
            m188484V3(ku50Var);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m188487Y3() {
        ku50 ku50VarPoll;
        if (vwb.m200296J(this.f169805l) || this.f169804k || (ku50VarPoll = this.f169805l.poll()) == null) {
            return;
        }
        m188484V3(ku50VarPoll);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        BasePreOperationView basePreOperationView = this.f169802i;
        if (basePreOperationView != null) {
            basePreOperationView.destroy();
            this.f169802i = null;
        }
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((PreOperationAnimView) v2).removeAllViews();
        }
        LinkedList<ku50> linkedList = this.f169805l;
        if (linkedList != null) {
            linkedList.clear();
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().OperationsEvent.boostStart().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.oe80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143289a.m188486X3((ku50) obj);
            }
        }));
        duringCreated(m206028F2().OperationsEvent.boostStartEnd().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.pe80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148404a.m188482S3((ku50) obj);
            }
        }));
        m129301d3(ut50.class, new w9j() { // from class: l.qe80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f154000a.m188483T3((ut50) obj);
            }
        });
    }
}
