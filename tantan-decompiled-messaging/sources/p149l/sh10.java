package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u000bR\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m87232d2 = {"Ll/sh10;", "Ll/h4t;", "Ll/pn40;", "Ll/mh10;", "Ll/bsm;", "Ll/am40;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "", "showSeconds", "O3", "(I)V", "S3", "R3", "n", "P3", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "multiCallData", "Ll/c4g0;", "j", "Ll/c4g0;", "subscribe", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class sh10 extends h4t<pn40, mh10> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public BLiveMultiCall multiCallData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public c4g0 subscribe;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh10(@NotNull bsm<am40> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        mo51532C(new mh10());
    }

    /* JADX INFO: renamed from: J3 */
    public static Unit m184141J3(final sh10 sh10Var) {
        vg10 vg10Var = vg10.INSTANCE;
        BLiveMultiCall bLiveMultiCall = sh10Var.multiCallData;
        BLiveMultiCall bLiveMultiCall2 = null;
        if (bLiveMultiCall == null) {
            Intrinsics.m87502r("multiCallData");
            bLiveMultiCall = null;
        }
        if (vg10Var.m198314f(bLiveMultiCall)) {
            BLiveMultiCall bLiveMultiCall3 = sh10Var.multiCallData;
            if (bLiveMultiCall3 == null) {
                Intrinsics.m87502r("multiCallData");
            } else {
                bLiveMultiCall2 = bLiveMultiCall3;
            }
            sh10Var.duringCreated(LivingNormalApiProvider.m71331R7(bLiveMultiCall2.f44400id)).subscribe(ffw.m121194e(new e30() { // from class: l.qh10
                @Override // p149l.e30
                public final void call(Object obj) {
                    sh10.m184146T3(this.f154421a, (BLiveMultiCall) obj);
                }
            }, new e30() { // from class: l.rh10
                @Override // p149l.e30
                public final void call(Object obj) {
                    sh10.m184147U3((Throwable) obj);
                }
            }));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public static void m184142K3(int i, sh10 sh10Var, Long l2) {
        if (((int) l2.longValue()) >= i) {
            sh10Var.m184150R3();
        } else {
            ((mh10) sh10Var.viewModel).m154607k(i, l2.longValue());
        }
    }

    /* JADX INFO: renamed from: M3 */
    public static void m184144M3(sh10 sh10Var, u5t u5tVar) {
        BLiveMultiCall bLiveMultiCall = u5tVar.f174754a;
        bLiveMultiCall.getClass();
        sh10Var.multiCallData = bLiveMultiCall;
        ((mh10) sh10Var.viewModel).m154606j(bLiveMultiCall);
        ((mh10) sh10Var.viewModel).m154608l();
    }

    /* JADX INFO: renamed from: T3 */
    public static final void m184146T3(sh10 sh10Var, BLiveMultiCall bLiveMultiCall) {
        sh10Var.m206028F2().MultiCallEvent.switchToVideo().mo172463j(Boolean.TRUE);
        BLiveMultiCall bLiveMultiCall2 = sh10Var.multiCallData;
        if (bLiveMultiCall2 == null) {
            Intrinsics.m87502r("multiCallData");
            bLiveMultiCall2 = null;
        }
        r610.m178004i0(sh10Var, bLiveMultiCall2, "audience accept");
    }

    /* JADX INFO: renamed from: U3 */
    public static final void m184147U3(Throwable th) {
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public final void m184148O3(final int showSeconds) {
        ((mh10) this.viewModel).m154607k(showSeconds, 0L);
        mkd0.m154992z(this.subscribe);
        this.subscribe = duringCreated((C22306c) m129300I3(((pn40) m206027E2()).m132135h2(1, TimeUnit.SECONDS), true)).take(showSeconds).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.oh10
            @Override // p149l.e30
            public final void call(Object obj) {
                sh10.m184142K3(showSeconds, this, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P3 */
    public final void m184149P3() {
        ((mh10) this.viewModel).m154603e();
        mkd0.m154992z(this.subscribe);
    }

    /* JADX INFO: renamed from: R3 */
    public final void m184150R3() {
        lsi0.m151595y(w8u.m202217t(R$string.f47561u8));
        BLiveMultiCall bLiveMultiCall = this.multiCallData;
        if (bLiveMultiCall == null) {
            Intrinsics.m87502r("multiCallData");
            bLiveMultiCall = null;
        }
        LivingNormalApiProvider.m71339S6(bLiveMultiCall.f44400id);
        m184149P3();
    }

    /* JADX INFO: renamed from: S3 */
    public final void m184151S3() {
        m184149P3();
        l310 l310Var = l310.INSTANCE;
        String str = s410.f162243i;
        str.getClass();
        l310Var.m148350o(this, str, new Function0() { // from class: l.ph10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return sh10.m184141J3(this.f148861a);
            }
        });
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m184149P3();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(LivingNormalApiProvider.m71428c5(this)).subscribe(ffw.m121197h(new e30() { // from class: l.nh10
            @Override // p149l.e30
            public final void call(Object obj) {
                sh10.m184144M3(this.f138942a, (u5t) obj);
            }
        }));
    }
}
