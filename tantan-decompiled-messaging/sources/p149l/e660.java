package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLivePacketSystemCommentStatus;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view.PacketProgressView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0005*\u0001$\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ!\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u001a\"\u0004\b\u0001\u0010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m87232d2 = {"Ll/e660;", "Ll/ho2;", "D", "Ll/h4t;", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketProgressView;", "Ll/bsm;", BaseSei.INFO, OMSTemplateModeType.view, "<init>", "(Ll/bsm;Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketProgressView;)V", "", Constants.KEY_T, "()V", "Y3", "Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;", "", "withAnim", "d4", "(Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;Z)V", "f4", "(Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;)V", "", "next", "c4", "(Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;J)V", j6f.GPS_DIRECTION_TRUE, "Lrx/c$d;", "Z3", "()Lrx/c$d;", "Ll/c4g0;", RXScreenCaptureService.KEY_INDEX, "Ll/c4g0;", "countdownSub", "j", "Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;", "lastStatus", "l/e660$a", "k", "Ll/e660$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class e660<D extends ho2> extends h4t<D, PacketProgressView> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public c4g0 countdownSub;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public BLivePacketSystemCommentStatus lastStatus;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final C16546a listener;

    /* JADX INFO: renamed from: l.e660$a */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"l/e660$a", "Ll/t560;", "", "a", "()V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C16546a implements t560 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e660<D> f89507a;

        public C16546a(e660<D> e660Var) {
            this.f89507a = e660Var;
        }

        @Override // p149l.t560
        /* JADX INFO: renamed from: a */
        public void mo115020a() {
            BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus = this.f89507a.lastStatus;
            e660<D> e660Var = this.f89507a;
            if (bLivePacketSystemCommentStatus == null) {
                ((PacketProgressView) e660Var.viewModel).m73969z0();
            } else {
                e660Var.m115018d4(bLivePacketSystemCommentStatus, true);
                e660Var.lastStatus = null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e660(@NotNull bsm<D> bsmVar, @NotNull PacketProgressView packetProgressView) {
        super(bsmVar);
        bsmVar.getClass();
        packetProgressView.getClass();
        mo51532C(packetProgressView);
        this.listener = new C16546a(this);
    }

    /* JADX INFO: renamed from: J3 */
    public static Unit m114998J3(e660 e660Var, BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus, Long l2) {
        l2.getClass();
        e660Var.m115017c4(bLivePacketSystemCommentStatus, l2.longValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public static C22306c m114999K3(final e660 e660Var, C22306c c22306c) {
        c22306c.getClass();
        final Function1 function1 = new Function1() { // from class: l.c660
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e660.m115012a4(this.f79441a, obj);
            }
        };
        return c22306c.filter(new w9j() { // from class: l.d660
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return e660.m115013b4(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public static void m115001M3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N3 */
    public static void m115002N3(e660 e660Var, soj0 soj0Var) {
        e660Var.m115015Y3();
    }

    /* JADX INFO: renamed from: P3 */
    public static Boolean m115004P3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R3 */
    public static void m115005R3(e660 e660Var, BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus) {
        bLivePacketSystemCommentStatus.getClass();
        m115014e4(e660Var, bLivePacketSystemCommentStatus, false, 2, null);
    }

    /* JADX INFO: renamed from: S3 */
    public static Boolean m115006S3(rge0 rge0Var) {
        rge0Var.getClass();
        BLiveGiftItem bLiveGiftItem = rge0Var.getSendGiftRequestInfo().f148656e;
        return Boolean.valueOf(bLiveGiftItem != null && bLiveGiftItem.isPacketGift());
    }

    /* JADX INFO: renamed from: T3 */
    public static void m115007T3(e660 e660Var, rge0 rge0Var) {
        BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus = rge0Var.getSendGiftResultWrapper().getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().bagSystemCommentStatus;
        bLivePacketSystemCommentStatus.getClass();
        e660Var.m115018d4(bLivePacketSystemCommentStatus, true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: a4 */
    public static final Boolean m115012a4(e660 e660Var, Object obj) {
        return Boolean.valueOf(!e660Var.m206027E2().m132152n0().isVoiceLive());
    }

    /* JADX INFO: renamed from: b4 */
    public static final Boolean m115013b4(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e4 */
    public static /* synthetic */ void m115014e4(e660 e660Var, BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        e660Var.m115018d4(bLivePacketSystemCommentStatus, z);
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m115015Y3() {
        if (((PacketProgressView) this.viewModel).m73962q0()) {
            ((PacketProgressView) this.viewModel).m73953B0();
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final <T> C22306c.d<T, T> m115016Z3() {
        return new C22306c.d() { // from class: l.z560
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return e660.m114999K3(this.f201757a, (C22306c) obj);
            }
        };
    }

    /* JADX INFO: renamed from: c4 */
    public final void m115017c4(BLivePacketSystemCommentStatus info, long next) {
        long j = ((long) info.ticker.durationMs) - (next * 1000);
        ((PacketProgressView) this.viewModel).m73957I0(j >= 0 ? (int) Math.ceil(j / 1000.0d) : 0, info.getCountdownProgress((int) j));
        if (j <= 0) {
            mkd0.m154992z(this.countdownSub);
            ((PacketProgressView) this.viewModel).m73968y0();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final void m115018d4(BLivePacketSystemCommentStatus info, boolean withAnim) {
        if (((PacketProgressView) this.viewModel).m73966v0()) {
            this.lastStatus = info;
        } else {
            ((PacketProgressView) this.viewModel).m73967w0(info, this.listener, withAnim);
            m115019f4(info);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m115019f4(final BLivePacketSystemCommentStatus info) {
        mkd0.m154992z(this.countdownSub);
        if (info.canCountdown()) {
            C22306c c22306cObserveOn = duringCreated(m206027E2().m132139i2(TimeUnit.SECONDS)).observeOn(jo0.m142408a());
            final Function1 function1 = new Function1() { // from class: l.a660
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e660.m114998J3(this.f67741a, info, (Long) obj);
                }
            };
            this.countdownSub = c22306cObserveOn.subscribe(new e30() { // from class: l.b660
                @Override // p149l.e30
                public final void call(Object obj) {
                    e660.m115001M3(function1, obj);
                }
            });
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m132062E0()).observeOn(jo0.m142408a()).compose(m115016Z3()).subscribe(ffw.m121197h(new e30() { // from class: l.u560
            @Override // p149l.e30
            public final void call(Object obj) {
                e660.m115005R3(this.f174654a, (BLivePacketSystemCommentStatus) obj);
            }
        }));
        C22306c c22306cCompose = duringCreated((C22306c) m206028F2().SendGiftEventGroup.sendGiftSuccess().m172460g()).compose(m115016Z3());
        final Function1 function1 = new Function1() { // from class: l.v560
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e660.m115006S3((rge0) obj);
            }
        };
        c22306cCompose.filter(new w9j() { // from class: l.w560
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return e660.m115004P3(function1, obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.x560
            @Override // p149l.e30
            public final void call(Object obj) {
                e660.m115007T3(this.f191092a, (rge0) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().GiftDialogEventGroup.giftDialogShowWithPacketPanel().m172460g()).compose(m115016Z3()).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.y560
            @Override // p149l.e30
            public final void call(Object obj) {
                e660.m115002N3(this.f196384a, (soj0) obj);
            }
        }));
    }
}
