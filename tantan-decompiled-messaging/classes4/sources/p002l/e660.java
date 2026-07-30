package p002l;

import com.p000p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view.PacketProgressView;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLivePacketSystemCommentStatus;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l.bwr;
import l.c4g0;
import l.e30;
import l.ffw;
import l.jo0;
import l.mkd0;
import l.soj0;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002l.ho2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0005*\u0001$\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ!\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u001a\"\u0004\b\u0001\u0010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Ll/e660;", "Ll/ho2;", "D", "Ll/h4t;", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketProgressView;", "Ll/bsm;", "info", "view", "<init>", "(Ll/bsm;Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketProgressView;)V", "", "t", "()V", "Y3", "Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;", "", "withAnim", "d4", "(Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;Z)V", "f4", "(Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;)V", "", "next", "c4", "(Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;J)V", "T", "Lrx/c$d;", "Z3", "()Lrx/c$d;", "Ll/c4g0;", "i", "Ll/c4g0;", "countdownSub", "j", "Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;", "lastStatus", "l/e660$a", "k", "Ll/e660$a;", "listener", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e660<D extends ho2> extends h4t<D, PacketProgressView> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public c4g0 countdownSub;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public BLivePacketSystemCommentStatus lastStatus;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final C0537a listener;

    /* JADX INFO: renamed from: l.e660$a */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"l/e660$a", "Ll/t560;", "", "a", "()V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0537a implements t560 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e660<D> f9590a;

        public C0537a(e660<D> e660Var) {
            this.f9590a = e660Var;
        }

        @Override // p002l.t560
        /* JADX INFO: renamed from: a */
        public void mo12245a() {
            BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus = this.f9590a.lastStatus;
            e660<D> e660Var = this.f9590a;
            if (bLivePacketSystemCommentStatus == null) {
                ((PacketProgressView) ((bwr) e660Var).viewModel).m7528z0();
            } else {
                e660Var.m12242d4(bLivePacketSystemCommentStatus, true);
                e660Var.lastStatus = null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e660(@NotNull bsm<D> bsmVar, @NotNull PacketProgressView packetProgressView) {
        super(bsmVar);
        bsmVar.getClass();
        packetProgressView.getClass();
        C(packetProgressView);
        this.listener = new C0537a(this);
    }

    /* JADX INFO: renamed from: J3 */
    public static Unit m12222J3(e660 e660Var, BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus, Long l2) {
        l2.getClass();
        e660Var.m12241c4(bLivePacketSystemCommentStatus, l2.longValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public static c m12223K3(final e660 e660Var, c cVar) {
        cVar.getClass();
        final Function1 function1 = new Function1() { // from class: l.c660
            public final Object invoke(Object obj) {
                return e660.m12236a4(this.f8496a, obj);
            }
        };
        return cVar.filter(new w9j() { // from class: l.d660
            public final Object call(Object obj) {
                return e660.m12237b4(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public static void m12225M3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N3 */
    public static void m12226N3(e660 e660Var, soj0 soj0Var) {
        e660Var.m12239Y3();
    }

    /* JADX INFO: renamed from: P3 */
    public static Boolean m12228P3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R3 */
    public static void m12229R3(e660 e660Var, BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus) {
        bLivePacketSystemCommentStatus.getClass();
        m12238e4(e660Var, bLivePacketSystemCommentStatus, false, 2, null);
    }

    /* JADX INFO: renamed from: S3 */
    public static Boolean m12230S3(rge0 rge0Var) {
        rge0Var.getClass();
        BLiveGiftItem bLiveGiftItem = rge0Var.getSendGiftRequestInfo().f17280e;
        return Boolean.valueOf(bLiveGiftItem != null && bLiveGiftItem.isPacketGift());
    }

    /* JADX INFO: renamed from: T3 */
    public static void m12231T3(e660 e660Var, rge0 rge0Var) {
        BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus = rge0Var.getSendGiftResultWrapper().getResult().bagSystemCommentStatus;
        bLivePacketSystemCommentStatus.getClass();
        e660Var.m12242d4(bLivePacketSystemCommentStatus, true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: a4 */
    public static final Boolean m12236a4(e660 e660Var, Object obj) {
        return Boolean.valueOf(!e660Var.m25547E2().m14588n0().isVoiceLive());
    }

    /* JADX INFO: renamed from: b4 */
    public static final Boolean m12237b4(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e4 */
    public static /* synthetic */ void m12238e4(e660 e660Var, BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        e660Var.m12242d4(bLivePacketSystemCommentStatus, z);
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m12239Y3() {
        if (((PacketProgressView) ((bwr) this).viewModel).m7521q0()) {
            ((PacketProgressView) ((bwr) this).viewModel).m7510B0();
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final <T> c.d<T, T> m12240Z3() {
        return new c.d() { // from class: l.z560
            public final Object call(Object obj) {
                return e660.m12223K3(this.f23254a, (c) obj);
            }
        };
    }

    /* JADX INFO: renamed from: c4 */
    public final void m12241c4(BLivePacketSystemCommentStatus info, long next) {
        long j = ((long) info.ticker.durationMs) - (next * 1000);
        ((PacketProgressView) ((bwr) this).viewModel).m7515I0(j >= 0 ? (int) Math.ceil(j / 1000.0d) : 0, info.getCountdownProgress((int) j));
        if (j <= 0) {
            mkd0.z(this.countdownSub);
            ((PacketProgressView) ((bwr) this).viewModel).m7527y0();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final void m12242d4(BLivePacketSystemCommentStatus info, boolean withAnim) {
        if (((PacketProgressView) ((bwr) this).viewModel).m7525v0()) {
            this.lastStatus = info;
        } else {
            ((PacketProgressView) ((bwr) this).viewModel).m7526w0(info, this.listener, withAnim);
            m12243f4(info);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m12243f4(final BLivePacketSystemCommentStatus info) {
        mkd0.z(this.countdownSub);
        if (info.canCountdown()) {
            c cVarObserveOn = duringCreated(m25547E2().m14575i2(TimeUnit.SECONDS)).observeOn(jo0.a());
            final Function1 function1 = new Function1() { // from class: l.a660
                public final Object invoke(Object obj) {
                    return e660.m12222J3(this.f7415a, info, (Long) obj);
                }
            };
            this.countdownSub = cVarObserveOn.subscribe(new e30() { // from class: l.b660
                public final void call(Object obj) {
                    e660.m12225M3(function1, obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: t */
    public void m12244t() {
        super.t();
        duringCreated(m25547E2().m14497E0()).observeOn(jo0.a()).compose(m12240Z3()).subscribe(ffw.h(new e30() { // from class: l.u560
            public final void call(Object obj) {
                e660.m12229R3(this.f20493a, (BLivePacketSystemCommentStatus) obj);
            }
        }));
        c cVarCompose = duringCreated((c) m25548F2().SendGiftEventGroup.sendGiftSuccess().g()).compose(m12240Z3());
        final Function1 function1 = new Function1() { // from class: l.v560
            public final Object invoke(Object obj) {
                return e660.m12230S3((rge0) obj);
            }
        };
        cVarCompose.filter(new w9j() { // from class: l.w560
            public final Object call(Object obj) {
                return e660.m12228P3(function1, obj);
            }
        }).subscribe(ffw.h(new e30() { // from class: l.x560
            public final void call(Object obj) {
                e660.m12231T3(this.f22122a, (rge0) obj);
            }
        }));
        duringCreated((c) m25548F2().GiftDialogEventGroup.giftDialogShowWithPacketPanel().g()).compose(m12240Z3()).observeOn(jo0.a()).subscribe(ffw.h(new e30() { // from class: l.y560
            public final void call(Object obj) {
                e660.m12226N3(this.f22663a, (soj0) obj);
            }
        }));
    }
}
