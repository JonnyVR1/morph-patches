package p149l;

import com.p046p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView;
import com.p046p1.mobile.putong.live.livingroom.intl.gift.IntlGiftComboView;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class njn<T extends ho2> extends h4t<T, IntlGiftComboView> {

    /* JADX INFO: renamed from: i */
    public c4g0 f139296i;

    /* JADX INFO: renamed from: j */
    public long f139297j;

    public njn(bsm<? extends T> bsmVar, IntlGiftComboView intlGiftComboView) {
        super(bsmVar);
        mo51532C(intlGiftComboView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public /* synthetic */ void m159753U3(Long l2) {
        ((IntlGiftComboView) this.viewModel).setAvailableCoin(l2);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m159754P3(efe0 efe0Var) {
        m206028F2().GiftDialogEventGroup.onSengGiftFromMultipleGift().mo172463j(efe0Var);
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m159755R3(AtomicInteger atomicInteger) {
        ((IntlGiftComboView) this.viewModel).m75319q0(true);
        ((IntlGiftComboView) this.viewModel).m75316K0(atomicInteger.get());
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m159756S3(AtomicInteger atomicInteger, d30 d30Var, Long l2) {
        atomicInteger.getAndDecrement();
        if (atomicInteger.get() > 0) {
            ((IntlGiftComboView) this.viewModel).m75316K0(atomicInteger.get());
            return;
        }
        if (d30Var != null) {
            d30Var.call();
        }
        ((IntlGiftComboView) this.viewModel).m75319q0(false);
        mkd0.m154992z(this.f139296i);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ Boolean m159757T3(mb0 mb0Var) {
        return Boolean.valueOf(mqi0.m155944o() - this.f139297j >= 3000 && !this.f188512e.f77104j.m201577L3(MotionType.multi_call));
    }

    /* JADX INFO: renamed from: V3 */
    public void m159758V3(mb0 mb0Var) {
        m159759W3();
        ((IntlGiftComboView) this.viewModel).m75315G0(mb0Var, new LiveMultipleGiftView.InterfaceC12811a() { // from class: l.kjn
            @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView.InterfaceC12811a
            /* JADX INFO: renamed from: a */
            public final void mo73887a(efe0 efe0Var) {
                this.f123490a.m159754P3(efe0Var);
            }
        });
        m206028F2().IntlGiftComboEvent.newComboVisible().mo172463j(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: W3 */
    public void m159759W3() {
        mkd0.m154992z(this.f139296i);
    }

    /* JADX INFO: renamed from: X3 */
    public void m159760X3(int i, final d30 d30Var) {
        mkd0.m154992z(this.f139296i);
        final AtomicInteger atomicInteger = new AtomicInteger();
        if (i != 0) {
            atomicInteger.set(i / 1000);
            this.f139296i = m129299H3(m206027E2().m132135h2(1, TimeUnit.SECONDS)).doOnSubscribe(new d30() { // from class: l.ljn
                @Override // p149l.d30
                public final void call() {
                    this.f128367a.m159755R3(atomicInteger);
                }
            }).subscribe(ffw.m121193d(new e30() { // from class: l.mjn
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f134217a.m159756S3(atomicInteger, d30Var, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public void m159761Y3() {
        this.f139297j = mqi0.m155944o();
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m159759W3();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated((C22306c<T>) m206028F2().IntlGiftComboEvent.comboEvent().m172460g()).filter(new w9j() { // from class: l.gjn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                mb0 mb0Var = (mb0) obj;
                return Boolean.valueOf((mb0Var == null || mb0Var.m153857c() == null || !mb0Var.m153857c().m136279d()) ? false : true);
            }
        }).filter(new w9j() { // from class: l.hjn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f108097a.m159757T3((mb0) obj);
            }
        }).subscribe(new e30() { // from class: l.ijn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113579a.m159758V3((mb0) obj);
            }
        });
        duringCreated((C22306c<T>) m206027E2().m132166t1()).subscribe(ffw.m121193d(new e30() { // from class: l.jjn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118305a.m159753U3((Long) obj);
            }
        }));
    }
}
