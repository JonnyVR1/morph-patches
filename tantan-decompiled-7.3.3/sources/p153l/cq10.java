package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u000bR\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m88121d2 = {"Ll/cq10;", "Ll/i6t;", "Ll/dw40;", "Ll/wp10;", "Ll/dum;", "Ll/ou40;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", Constants.KEY_T, "()V", "", "showSeconds", "O3", "(I)V", "S3", "R3", "n", "P3", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "multiCallData", "Ll/kcg0;", "j", "Ll/kcg0;", "subscribe", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class cq10 extends i6t<dw40, wp10> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public BLiveMultiCall multiCallData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public kcg0 subscribe;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq10(@NotNull dum<ou40> dumVar) {
        super(dumVar);
        dumVar.getClass();
        mo52715C(new wp10());
    }

    /* JADX INFO: renamed from: J3 */
    public static Unit m111864J3(final cq10 cq10Var) {
        fp10 fp10Var = fp10.INSTANCE;
        BLiveMultiCall bLiveMultiCall = cq10Var.multiCallData;
        BLiveMultiCall bLiveMultiCall2 = null;
        if (bLiveMultiCall == null) {
            Intrinsics.m88391r("multiCallData");
            bLiveMultiCall = null;
        }
        if (fp10Var.m126519f(bLiveMultiCall)) {
            BLiveMultiCall bLiveMultiCall3 = cq10Var.multiCallData;
            if (bLiveMultiCall3 == null) {
                Intrinsics.m88391r("multiCallData");
            } else {
                bLiveMultiCall2 = bLiveMultiCall3;
            }
            cq10Var.duringCreated(LivingNormalApiProvider.m72514R7(bLiveMultiCall2.f45248id)).subscribe(dhw.m115826e(new y20() { // from class: l.aq10
                @Override // p153l.y20
                public final void call(Object obj) {
                    cq10.m111869T3(this.f72780a, (BLiveMultiCall) obj);
                }
            }, new y20() { // from class: l.bq10
                @Override // p153l.y20
                public final void call(Object obj) {
                    cq10.m111870U3((Throwable) obj);
                }
            }));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public static void m111865K3(int i, cq10 cq10Var, Long l2) {
        if (((int) l2.longValue()) >= i) {
            cq10Var.m111873R3();
        } else {
            ((wp10) cq10Var.viewModel).m207415k(i, l2.longValue());
        }
    }

    /* JADX INFO: renamed from: M3 */
    public static void m111867M3(cq10 cq10Var, v7t v7tVar) {
        BLiveMultiCall bLiveMultiCall = v7tVar.f182817a;
        bLiveMultiCall.getClass();
        cq10Var.multiCallData = bLiveMultiCall;
        ((wp10) cq10Var.viewModel).m207414j(bLiveMultiCall);
        ((wp10) cq10Var.viewModel).m207416l();
    }

    /* JADX INFO: renamed from: T3 */
    public static final void m111869T3(cq10 cq10Var, BLiveMultiCall bLiveMultiCall) {
        cq10Var.m213811F2().MultiCallEvent.switchToVideo().mo199273j(Boolean.TRUE);
        BLiveMultiCall bLiveMultiCall2 = cq10Var.multiCallData;
        if (bLiveMultiCall2 == null) {
            Intrinsics.m88391r("multiCallData");
            bLiveMultiCall2 = null;
        }
        bf10.m103833i0(cq10Var, bLiveMultiCall2, "audience accept");
    }

    /* JADX INFO: renamed from: U3 */
    public static final void m111870U3(Throwable th) {
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public final void m111871O3(final int showSeconds) {
        ((wp10) this.viewModel).m207415k(showSeconds, 0L);
        psd0.m173633z(this.subscribe);
        this.subscribe = duringCreated((C22421c) m138859I3(((dw40) m213810E2()).m168521h2(1, TimeUnit.SECONDS), true)).take(showSeconds).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.yp10
            @Override // p153l.y20
            public final void call(Object obj) {
                cq10.m111865K3(showSeconds, this, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P3 */
    public final void m111872P3() {
        ((wp10) this.viewModel).m207411e();
        psd0.m173633z(this.subscribe);
    }

    /* JADX INFO: renamed from: R3 */
    public final void m111873R3() {
        o1j0.m165651y(xau.m209910t(R$string.f48409u8));
        BLiveMultiCall bLiveMultiCall = this.multiCallData;
        if (bLiveMultiCall == null) {
            Intrinsics.m88391r("multiCallData");
            bLiveMultiCall = null;
        }
        LivingNormalApiProvider.m72522S6(bLiveMultiCall.f45248id);
        m111872P3();
    }

    /* JADX INFO: renamed from: S3 */
    public final void m111874S3() {
        m111872P3();
        vb10 vb10Var = vb10.INSTANCE;
        String str = cd10.f81081i;
        str.getClass();
        vb10Var.m200665o(this, str, new Function0() { // from class: l.zp10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return cq10.m111864J3(this.f205417a);
            }
        });
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m111872P3();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(LivingNormalApiProvider.m72611c5(this)).subscribe(dhw.m115829h(new y20() { // from class: l.xp10
            @Override // p153l.y20
            public final void call(Object obj) {
                cq10.m111867M3(this.f195631a, (v7t) obj);
            }
        }));
    }
}
