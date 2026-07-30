package p153l;

import com.p051p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView;
import com.p051p1.mobile.putong.live.livingroom.intl.gift.IntlGiftComboView;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes5.dex */
public class nln<T extends oo2> extends i6t<T, IntlGiftComboView> {

    /* JADX INFO: renamed from: i */
    public kcg0 f142572i;

    /* JADX INFO: renamed from: j */
    public long f142573j;

    public nln(dum<? extends T> dumVar, IntlGiftComboView intlGiftComboView) {
        super(dumVar);
        mo52715C(intlGiftComboView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public /* synthetic */ void m163749U3(Long l2) {
        ((IntlGiftComboView) this.viewModel).setAvailableCoin(l2);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m163750P3(jne0 jne0Var) {
        m213811F2().GiftDialogEventGroup.onSengGiftFromMultipleGift().mo199273j(jne0Var);
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m163751R3(AtomicInteger atomicInteger) {
        ((IntlGiftComboView) this.viewModel).m76502q0(true);
        ((IntlGiftComboView) this.viewModel).m76499K0(atomicInteger.get());
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m163752S3(AtomicInteger atomicInteger, x20 x20Var, Long l2) {
        atomicInteger.getAndDecrement();
        if (atomicInteger.get() > 0) {
            ((IntlGiftComboView) this.viewModel).m76499K0(atomicInteger.get());
            return;
        }
        if (x20Var != null) {
            x20Var.call();
        }
        ((IntlGiftComboView) this.viewModel).m76502q0(false);
        psd0.m173633z(this.f142572i);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ Boolean m163753T3(ib0 ib0Var) {
        return Boolean.valueOf(pzi0.m174454o() - this.f142573j >= 3000 && !this.f196918e.f90824j.m209548L3(MotionType.multi_call));
    }

    /* JADX INFO: renamed from: V3 */
    public void m163754V3(ib0 ib0Var) {
        m163755W3();
        ((IntlGiftComboView) this.viewModel).m76498G0(ib0Var, new LiveMultipleGiftView.InterfaceC12974a() { // from class: l.kln
            @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView.InterfaceC12974a
            /* JADX INFO: renamed from: a */
            public final void mo75070a(jne0 jne0Var) {
                this.f127398a.m163750P3(jne0Var);
            }
        });
        m213811F2().IntlGiftComboEvent.newComboVisible().mo199273j(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: W3 */
    public void m163755W3() {
        psd0.m173633z(this.f142572i);
    }

    /* JADX INFO: renamed from: X3 */
    public void m163756X3(int i, final x20 x20Var) {
        psd0.m173633z(this.f142572i);
        final AtomicInteger atomicInteger = new AtomicInteger();
        if (i != 0) {
            atomicInteger.set(i / 1000);
            this.f142572i = m138858H3(m213810E2().m168521h2(1, TimeUnit.SECONDS)).doOnSubscribe(new x20() { // from class: l.lln
                @Override // p153l.x20
                public final void call() {
                    this.f132578a.m163751R3(atomicInteger);
                }
            }).subscribe(dhw.m115825d(new y20() { // from class: l.mln
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f137426a.m163752S3(atomicInteger, x20Var, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public void m163757Y3() {
        this.f142573j = pzi0.m174454o();
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m163755W3();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated((C22421c<T>) m213811F2().IntlGiftComboEvent.comboEvent().m199270g()).filter(new qcj() { // from class: l.gln
            @Override // p153l.qcj
            public final Object call(Object obj) {
                ib0 ib0Var = (ib0) obj;
                return Boolean.valueOf((ib0Var == null || ib0Var.m139230c() == null || !ib0Var.m139230c().m145118d()) ? false : true);
            }
        }).filter(new qcj() { // from class: l.hln
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f110518a.m163753T3((ib0) obj);
            }
        }).subscribe(new y20() { // from class: l.iln
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115592a.m163754V3((ib0) obj);
            }
        });
        duringCreated((C22421c<T>) m213810E2().m168550t1()).subscribe(dhw.m115825d(new y20() { // from class: l.jln
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121584a.m163749U3((Long) obj);
            }
        }));
    }
}
