package p002l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.BasePreOperationView;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.BoostStartView;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.GiftRedPacketView;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.OperationEntranceAnimView;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.PreOperationAnimView;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.ticketAnim.view.UserAnchorTicketView;
import com.p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.LinkedList;
import l.bwr;
import l.e30;
import l.ffw;
import l.s7m;
import l.vwb;
import l.w9j;
import l.xdl0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class te80 extends h4t<ho2, PreOperationAnimView> {

    /* JADX INFO: renamed from: i */
    public BasePreOperationView f20193i;

    /* JADX INFO: renamed from: j */
    public ViewTreeObserver.OnGlobalLayoutListener f20194j;

    /* JADX INFO: renamed from: k */
    public boolean f20195k;

    /* JADX INFO: renamed from: l */
    public LinkedList<ku50> f20196l;

    public te80(bsm bsmVar, PreOperationAnimView preOperationAnimView) {
        super(bsmVar);
        this.f20195k = false;
        this.f20196l = new LinkedList<>();
        C(preOperationAnimView);
    }

    /* JADX INFO: renamed from: U3 */
    private void m22892U3() {
        this.f20195k = false;
        if (NullChecker.a(this.f20193i)) {
            this.f20193i.destroy();
            if (NullChecker.a(this.f20193i.getPresenter())) {
                C2(this.f20193i.getPresenter());
            }
            ((PreOperationAnimView) ((bwr) this).viewModel).removeView(this.f20193i);
            this.f20193i = null;
        }
        m22902Y3();
    }

    /* JADX INFO: renamed from: N3 */
    public final void m22893N3(ku50 ku50Var) {
        if (ku50Var.m16796k()) {
            this.f20196l.addFirst(ku50Var);
            return;
        }
        boolean zM16797l = ku50Var.m16797l();
        LinkedList<ku50> linkedList = this.f20196l;
        if (zM16797l) {
            linkedList.addFirst(ku50Var);
        } else {
            linkedList.add(ku50Var);
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final BasePreOperationView m22894O3(ku50 ku50Var) {
        if (ku50Var.m16796k()) {
            return new OperationEntranceAnimView(this.f22037f);
        }
        if (ku50Var.m16797l()) {
            return new BoostStartView(this.f22037f);
        }
        if (ku50Var.m16795j()) {
            return new GiftRedPacketView(this.f22037f);
        }
        if (ku50Var.m16798m()) {
            return new UserAnchorTicketView(this.f22037f, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: P3 */
    public boolean m22895P3() {
        return NullChecker.a(vwb.r(this.f20196l, new w9j() { // from class: l.re80
            public final Object call(Object obj) {
                return Boolean.valueOf(((ku50) obj).m16796k());
            }
        }));
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m22896R3() {
        ((PreOperationAnimView) ((bwr) this).viewModel).getViewTreeObserver().removeOnGlobalLayoutListener(this.f20194j);
        if (NullChecker.a(this.f20193i)) {
            this.f20193i.mo8602q0(xdl0.i0(((bwr) this).viewModel));
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m22897S3(ku50 ku50Var) {
        m22892U3();
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ Boolean m22898T3(ut50 ut50Var) {
        return Boolean.valueOf(m22895P3());
    }

    /* JADX INFO: renamed from: V3 */
    public void m22899V3(ku50 ku50Var) {
        BLiveOperationItem bLiveOperationItemM16790e = ku50Var.m16790e();
        BasePreOperationView basePreOperationViewM22894O3 = m22894O3(ku50Var);
        if (basePreOperationViewM22894O3 == null) {
            return;
        }
        BasePreOperationView basePreOperationView = (BasePreOperationView) basePreOperationViewM22894O3.inflateView(LayoutInflater.from(this.f22037f), (ViewGroup) null);
        this.f20193i = basePreOperationView;
        h4t h4tVarMo8599n0 = basePreOperationView.mo8599n0(this.f22036e);
        this.f20193i.mo8594i1(h4tVarMo8599n0);
        z2(h4tVarMo8599n0);
        this.f20193i.setOperationPlace(bLiveOperationItemM16790e);
        this.f20193i.mo8600o0(ku50Var);
        this.f20193i.mo8593i0((PreOperationAnimView) ((bwr) this).viewModel);
        if (ku50Var.m16788c()) {
            this.f20195k = true;
        }
        m22900W3();
    }

    /* JADX INFO: renamed from: W3 */
    public void m22900W3() {
        this.f20193i.mo8601p0();
        this.f20194j = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.se80
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f18948a.m22896R3();
            }
        };
        ((PreOperationAnimView) ((bwr) this).viewModel).getViewTreeObserver().addOnGlobalLayoutListener(this.f20194j);
    }

    /* JADX INFO: renamed from: X3 */
    public final void m22901X3(ku50 ku50Var) {
        if (ku50Var.m16788c()) {
            m22893N3(ku50Var);
            m22902Y3();
        } else if (NullChecker.a(ku50Var)) {
            m22899V3(ku50Var);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m22902Y3() {
        ku50 ku50VarPoll;
        if (vwb.J(this.f20196l) || this.f20195k || (ku50VarPoll = this.f20196l.poll()) == null) {
            return;
        }
        m22899V3(ku50VarPoll);
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        BasePreOperationView basePreOperationView = this.f20193i;
        if (basePreOperationView != null) {
            basePreOperationView.destroy();
            this.f20193i = null;
        }
        s7m s7mVar = ((bwr) this).viewModel;
        if (s7mVar != null) {
            ((PreOperationAnimView) s7mVar).removeAllViews();
        }
        LinkedList<ku50> linkedList = this.f20196l;
        if (linkedList != null) {
            linkedList.clear();
        }
    }

    /* JADX INFO: renamed from: t */
    public void m22903t() {
        super.t();
        duringCreated((c) m25548F2().OperationsEvent.boostStart().g()).subscribe(ffw.d(new e30() { // from class: l.oe80
            public final void call(Object obj) {
                this.f16547a.m22901X3((ku50) obj);
            }
        }));
        duringCreated((c) m25548F2().OperationsEvent.boostStartEnd().g()).subscribe(ffw.d(new e30() { // from class: l.pe80
            public final void call(Object obj) {
                this.f17212a.m22897S3((ku50) obj);
            }
        }));
        m14188d3(ut50.class, new w9j() { // from class: l.qe80
            public final Object call(Object obj) {
                return this.f17959a.m22898T3((ut50) obj);
            }
        });
    }
}
