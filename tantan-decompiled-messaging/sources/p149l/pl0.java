package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallAnnouncement;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.tantan.live.eventbus.LiveEventBus;
import com.tantan.live.eventbus.LiveEventBus.MultiCallEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m87232d2 = {"Ll/pl0;", "Ll/ho2;", "D", "Ll/zi2;", "Ll/hl0;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "W3", "", "content", "Z3", "(Ljava/lang/String;)V", "Y3", "()Ll/hl0;", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallAnnouncement;", "k", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallAnnouncement;", VirtualVoiceMotionType.announcement, "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class pl0<D extends ho2> extends zi2<D, hl0> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public BLiveMultiCallAnnouncement announcement;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl0(@NotNull bsm<D> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
    }

    /* JADX INFO: renamed from: P3 */
    public static Boolean m170062P3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R3 */
    public static void m170063R3(pl0 pl0Var, BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement) {
        if (TEnum.equals(bLiveMultiCallAnnouncement.state, "approved")) {
            osi0.m165782f(R$string.f47345kc);
        } else if (TEnum.equals(bLiveMultiCallAnnouncement.state, "pending")) {
            osi0.m165782f(R$string.f47367lc);
        }
        ((hl0) pl0Var.viewModel).mo71727j();
        LiveEventBus liveEventBusM206028F2 = pl0Var.m206028F2();
        liveEventBusM206028F2.getClass();
        liveEventBusM206028F2.new MultiCallEvent().announcementData().mo172464m(bLiveMultiCallAnnouncement);
    }

    /* JADX INFO: renamed from: S3 */
    public static Boolean m170064S3(pl0 pl0Var, BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement) {
        hl0 hl0Var = (hl0) pl0Var.viewModel;
        return Boolean.valueOf(hl0Var != null ? hl0Var.isShowing() : false);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m170065T3(pl0 pl0Var, BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement) {
        pl0Var.announcement = bLiveMultiCallAnnouncement;
        hl0 hl0Var = (hl0) pl0Var.viewModel;
        bLiveMultiCallAnnouncement.getClass();
        hl0Var.m131624L(bLiveMultiCallAnnouncement);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m170066U3(Throwable th) {
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m170067V3(pl0 pl0Var, Boolean bool) {
        r610.INSTANCE.m178022f0(pl0Var);
        pl0Var.m218910L3();
        pl0Var.mo168244N3();
    }

    /* JADX INFO: renamed from: X3 */
    public static final void m170068X3(pl0 pl0Var, BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement) {
        ((hl0) pl0Var.viewModel).mo71727j();
        osi0.m165782f(R$string.f47214ec);
        LiveEventBus liveEventBusM206028F2 = pl0Var.m206028F2();
        liveEventBusM206028F2.getClass();
        liveEventBusM206028F2.new MultiCallEvent().announcementData().mo172464m(bLiveMultiCallAnnouncement);
    }

    /* JADX INFO: renamed from: W3 */
    public final void m170069W3() {
        BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement = this.announcement;
        if (bLiveMultiCallAnnouncement != null) {
            zi10.m218891a();
            zr0 zr0Var = zr0.INSTANCE;
            String str = bLiveMultiCallAnnouncement.roomId;
            str.getClass();
            String str2 = bLiveMultiCallAnnouncement.f44401id;
            str2.getClass();
            duringCreated(zr0Var.m219922g(str, str2)).subscribe(ffw.m121197h(new e30() { // from class: l.ol0
                @Override // p149l.e30
                public final void call(Object obj) {
                    pl0.m170068X3(this.f144471a, (BLiveMultiCallAnnouncement) obj);
                }
            }));
        }
    }

    @Override // p149l.zi2
    @NotNull
    /* JADX INFO: renamed from: Y3, reason: merged with bridge method [inline-methods] */
    public hl0 mo75679K3() {
        return new hl0();
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m170071Z3(@NotNull String content) {
        content.getClass();
        if (TextUtils.isEmpty(content)) {
            osi0.m165782f(R$string.f47258gc);
            return;
        }
        BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement = this.announcement;
        if (bLiveMultiCallAnnouncement != null) {
            bLiveMultiCallAnnouncement.getClass();
            if (TEnum.equals(bLiveMultiCallAnnouncement.state, "approved")) {
                BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement2 = this.announcement;
                bLiveMultiCallAnnouncement2.getClass();
                if (Intrinsics.m87488d(content, bLiveMultiCallAnnouncement2.content)) {
                    ((hl0) this.viewModel).mo71727j();
                    return;
                }
            }
        }
        zi10.m218896g();
        zr0 zr0Var = zr0.INSTANCE;
        String strM149818o = m206027E2().m149818o();
        strM149818o.getClass();
        duringCreated(zr0Var.m219923i(strM149818o, content)).subscribe(ffw.m121194e(new e30() { // from class: l.ml0
            @Override // p149l.e30
            public final void call(Object obj) {
                pl0.m170063R3(this.f134400a, (BLiveMultiCallAnnouncement) obj);
            }
        }, new e30() { // from class: l.nl0
            @Override // p149l.e30
            public final void call(Object obj) {
                pl0.m170066U3((Throwable) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        r610.INSTANCE.m178022f0(this);
        duringCreated((C22306c) m206028F2().MultiCallEvent.showAnnouncementDlg().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.il0
            @Override // p149l.e30
            public final void call(Object obj) {
                pl0.m170067V3(this.f113758a, (Boolean) obj);
            }
        }));
        LiveEventBus liveEventBusM206028F2 = m206028F2();
        liveEventBusM206028F2.getClass();
        C22306c<BLiveMultiCallAnnouncement> c22306cM172460g = liveEventBusM206028F2.new MultiCallEvent().announcementData().m172460g();
        final Function1 function1 = new Function1() { // from class: l.jl0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pl0.m170064S3(this.f118442a, (BLiveMultiCallAnnouncement) obj);
            }
        };
        duringCreated(c22306cM172460g.filter(new w9j() { // from class: l.kl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return pl0.m170062P3(function1, obj);
            }
        })).subscribe(ffw.m121197h(new e30() { // from class: l.ll0
            @Override // p149l.e30
            public final void call(Object obj) {
                pl0.m170065T3(this.f128629a, (BLiveMultiCallAnnouncement) obj);
            }
        }));
    }
}
