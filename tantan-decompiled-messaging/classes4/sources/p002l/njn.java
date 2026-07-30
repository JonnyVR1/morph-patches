package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView;
import com.p000p1.mobile.putong.live.livingroom.intl.gift.IntlGiftComboView;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import l.bwr;
import l.c4g0;
import l.d30;
import l.e30;
import l.ffw;
import l.mkd0;
import l.mqi0;
import l.w9j;
import p002l.ho2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class njn<T extends ho2> extends h4t<T, IntlGiftComboView> {

    /* JADX INFO: renamed from: i */
    public c4g0 f16074i;

    /* JADX INFO: renamed from: j */
    public long f16075j;

    public njn(bsm<? extends T> bsmVar, IntlGiftComboView intlGiftComboView) {
        super(bsmVar);
        C(intlGiftComboView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public /* synthetic */ void m18811U3(Long l2) {
        ((IntlGiftComboView) ((bwr) this).viewModel).setAvailableCoin(l2);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m18812P3(efe0 efe0Var) {
        m25548F2().GiftDialogEventGroup.onSengGiftFromMultipleGift().j(efe0Var);
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m18813R3(AtomicInteger atomicInteger) {
        ((IntlGiftComboView) ((bwr) this).viewModel).m8940q0(true);
        ((IntlGiftComboView) ((bwr) this).viewModel).m8936K0(atomicInteger.get());
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m18814S3(AtomicInteger atomicInteger, d30 d30Var, Long l2) {
        atomicInteger.getAndDecrement();
        if (atomicInteger.get() > 0) {
            ((IntlGiftComboView) ((bwr) this).viewModel).m8936K0(atomicInteger.get());
            return;
        }
        if (d30Var != null) {
            d30Var.call();
        }
        ((IntlGiftComboView) ((bwr) this).viewModel).m8940q0(false);
        mkd0.z(this.f16074i);
    }

    /* JADX INFO: renamed from: T */
    public void m18815T() {
        super.T();
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ Boolean m18816T3(mb0 mb0Var) {
        return Boolean.valueOf(mqi0.o() - this.f16075j >= 3000 && !this.f22036e.f8341j.m24319L3(MotionType.multi_call));
    }

    /* JADX INFO: renamed from: V3 */
    public void m18817V3(mb0 mb0Var) {
        m18818W3();
        ((IntlGiftComboView) ((bwr) this).viewModel).m8935G0(mb0Var, new LiveMultipleGiftView.InterfaceC0400a() { // from class: l.kjn
            @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView.InterfaceC0400a
            /* JADX INFO: renamed from: a */
            public final void mo7443a(efe0 efe0Var) {
                this.f14358a.m18812P3(efe0Var);
            }
        });
        m25548F2().IntlGiftComboEvent.newComboVisible().j(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: W3 */
    public void m18818W3() {
        mkd0.z(this.f16074i);
    }

    /* JADX INFO: renamed from: X3 */
    public void m18819X3(int i, final d30 d30Var) {
        mkd0.z(this.f16074i);
        final AtomicInteger atomicInteger = new AtomicInteger();
        if (i != 0) {
            atomicInteger.set(i / 1000);
            this.f16074i = m14186H3(m25547E2().m14571h2(1, TimeUnit.SECONDS)).doOnSubscribe(new d30() { // from class: l.ljn
                public final void call() {
                    this.f14894a.m18813R3(atomicInteger);
                }
            }).subscribe(ffw.d(new e30() { // from class: l.mjn
                public final void call(Object obj) {
                    this.f15411a.m18814S3(atomicInteger, d30Var, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public void m18820Y3() {
        this.f16075j = mqi0.o();
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        m18818W3();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m18821t() {
        super.t();
        duringCreated((c) m25548F2().IntlGiftComboEvent.comboEvent().g()).filter(new w9j() { // from class: l.gjn
            public final Object call(Object obj) {
                mb0 mb0Var = (mb0) obj;
                return Boolean.valueOf((mb0Var == null || mb0Var.m17795c() == null || !mb0Var.m17795c().m15156d()) ? false : true);
            }
        }).filter(new w9j() { // from class: l.hjn
            public final Object call(Object obj) {
                return this.f12079a.m18816T3((mb0) obj);
            }
        }).subscribe(new e30() { // from class: l.ijn
            public final void call(Object obj) {
                this.f13278a.m18817V3((mb0) obj);
            }
        });
        duringCreated(m25547E2().m14602t1()).subscribe(ffw.d(new e30() { // from class: l.jjn
            public final void call(Object obj) {
                this.f13834a.m18811U3((Long) obj);
            }
        }));
    }
}
