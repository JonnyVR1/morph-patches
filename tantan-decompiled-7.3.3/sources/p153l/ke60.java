package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLivePacketSystemCommentStatus;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view.PacketProgressView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0005*\u0001$\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ!\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u001a\"\u0004\b\u0001\u0010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m88121d2 = {"Ll/ke60;", "Ll/oo2;", "D", "Ll/i6t;", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketProgressView;", "Ll/dum;", BaseSei.INFO, OMSTemplateModeType.view, "<init>", "(Ll/dum;Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketProgressView;)V", "", Constants.KEY_T, "()V", "Y3", "Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;", "", "withAnim", "d4", "(Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;Z)V", "f4", "(Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;)V", "", "next", "c4", "(Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;J)V", p7f.GPS_DIRECTION_TRUE, "Lrx/c$d;", "Z3", "()Lrx/c$d;", "Ll/kcg0;", RXScreenCaptureService.KEY_INDEX, "Ll/kcg0;", "countdownSub", "j", "Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;", "lastStatus", "l/ke60$a", "k", "Ll/ke60$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ke60<D extends oo2> extends i6t<D, PacketProgressView> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public kcg0 countdownSub;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public BLivePacketSystemCommentStatus lastStatus;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final C18145a listener;

    /* JADX INFO: renamed from: l.ke60$a */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"l/ke60$a", "Ll/zd60;", "", "a", "()V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18145a implements zd60 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ke60<D> f125306a;

        public C18145a(ke60<D> ke60Var) {
            this.f125306a = ke60Var;
        }

        @Override // p153l.zd60
        /* JADX INFO: renamed from: a */
        public void mo149317a() {
            BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus = this.f125306a.lastStatus;
            ke60<D> ke60Var = this.f125306a;
            if (bLivePacketSystemCommentStatus == null) {
                ((PacketProgressView) ke60Var.viewModel).m75152z0();
            } else {
                ke60Var.m149315d4(bLivePacketSystemCommentStatus, true);
                ke60Var.lastStatus = null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke60(@NotNull dum<D> dumVar, @NotNull PacketProgressView packetProgressView) {
        super(dumVar);
        dumVar.getClass();
        packetProgressView.getClass();
        mo52715C(packetProgressView);
        this.listener = new C18145a(this);
    }

    /* JADX INFO: renamed from: J3 */
    public static Unit m149295J3(ke60 ke60Var, BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus, Long l2) {
        l2.getClass();
        ke60Var.m149314c4(bLivePacketSystemCommentStatus, l2.longValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public static C22421c m149296K3(final ke60 ke60Var, C22421c c22421c) {
        c22421c.getClass();
        final Function1 function1 = new Function1() { // from class: l.ie60
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ke60.m149309a4(this.f114556a, obj);
            }
        };
        return c22421c.filter(new qcj() { // from class: l.je60
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ke60.m149310b4(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public static void m149298M3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N3 */
    public static void m149299N3(ke60 ke60Var, vxj0 vxj0Var) {
        ke60Var.m149312Y3();
    }

    /* JADX INFO: renamed from: P3 */
    public static Boolean m149301P3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R3 */
    public static void m149302R3(ke60 ke60Var, BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus) {
        bLivePacketSystemCommentStatus.getClass();
        m149311e4(ke60Var, bLivePacketSystemCommentStatus, false, 2, null);
    }

    /* JADX INFO: renamed from: S3 */
    public static Boolean m149303S3(woe0 woe0Var) {
        woe0Var.getClass();
        BLiveGiftItem bLiveGiftItem = woe0Var.getSendGiftRequestInfo().f180057e;
        return Boolean.valueOf(bLiveGiftItem != null && bLiveGiftItem.isPacketGift());
    }

    /* JADX INFO: renamed from: T3 */
    public static void m149304T3(ke60 ke60Var, woe0 woe0Var) {
        BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus = woe0Var.getSendGiftResultWrapper().getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().bagSystemCommentStatus;
        bLivePacketSystemCommentStatus.getClass();
        ke60Var.m149315d4(bLivePacketSystemCommentStatus, true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: a4 */
    public static final Boolean m149309a4(ke60 ke60Var, Object obj) {
        return Boolean.valueOf(!ke60Var.m213810E2().m168538n0().isVoiceLive());
    }

    /* JADX INFO: renamed from: b4 */
    public static final Boolean m149310b4(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e4 */
    public static /* synthetic */ void m149311e4(ke60 ke60Var, BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        ke60Var.m149315d4(bLivePacketSystemCommentStatus, z);
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m149312Y3() {
        if (((PacketProgressView) this.viewModel).m75145q0()) {
            ((PacketProgressView) this.viewModel).m75136B0();
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final <T> C22421c.d<T, T> m149313Z3() {
        return new C22421c.d() { // from class: l.fe60
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ke60.m149296K3(this.f98626a, (C22421c) obj);
            }
        };
    }

    /* JADX INFO: renamed from: c4 */
    public final void m149314c4(BLivePacketSystemCommentStatus info, long next) {
        long j = ((long) info.ticker.durationMs) - (next * 1000);
        ((PacketProgressView) this.viewModel).m75140I0(j >= 0 ? (int) Math.ceil(j / 1000.0d) : 0, info.getCountdownProgress((int) j));
        if (j <= 0) {
            psd0.m173633z(this.countdownSub);
            ((PacketProgressView) this.viewModel).m75151y0();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final void m149315d4(BLivePacketSystemCommentStatus info, boolean withAnim) {
        if (((PacketProgressView) this.viewModel).m75149v0()) {
            this.lastStatus = info;
        } else {
            ((PacketProgressView) this.viewModel).m75150w0(info, this.listener, withAnim);
            m149316f4(info);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m149316f4(final BLivePacketSystemCommentStatus info) {
        psd0.m173633z(this.countdownSub);
        if (info.canCountdown()) {
            C22421c c22421cObserveOn = duringCreated(m213810E2().m168525i2(TimeUnit.SECONDS)).observeOn(fo0.m126432a());
            final Function1 function1 = new Function1() { // from class: l.ge60
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ke60.m149295J3(this.f103772a, info, (Long) obj);
                }
            };
            this.countdownSub = c22421cObserveOn.subscribe(new y20() { // from class: l.he60
                @Override // p153l.y20
                public final void call(Object obj) {
                    ke60.m149298M3(function1, obj);
                }
            });
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m168451E0()).observeOn(fo0.m126432a()).compose(m149313Z3()).subscribe(dhw.m115829h(new y20() { // from class: l.ae60
            @Override // p153l.y20
            public final void call(Object obj) {
                ke60.m149302R3(this.f70771a, (BLivePacketSystemCommentStatus) obj);
            }
        }));
        C22421c c22421cCompose = duringCreated((C22421c) m213811F2().SendGiftEventGroup.sendGiftSuccess().m199270g()).compose(m149313Z3());
        final Function1 function1 = new Function1() { // from class: l.be60
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ke60.m149303S3((woe0) obj);
            }
        };
        c22421cCompose.filter(new qcj() { // from class: l.ce60
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ke60.m149301P3(function1, obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.de60
            @Override // p153l.y20
            public final void call(Object obj) {
                ke60.m149304T3(this.f87990a, (woe0) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().GiftDialogEventGroup.giftDialogShowWithPacketPanel().m199270g()).compose(m149313Z3()).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.ee60
            @Override // p153l.y20
            public final void call(Object obj) {
                ke60.m149299N3(this.f93622a, (vxj0) obj);
            }
        }));
    }
}
