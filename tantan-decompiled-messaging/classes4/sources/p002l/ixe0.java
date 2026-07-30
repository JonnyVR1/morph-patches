package p002l;

import android.annotation.SuppressLint;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveShootGameInfo;
import com.p1.mobile.putong.live.base.data.BLiveShootGameTask;
import java.util.concurrent.TimeUnit;
import l.bs5;
import l.d30;
import l.dqd0;
import l.e30;
import l.ffw;
import l.hfw;
import l.jbu;
import l.jo0;
import l.mqi0;
import l.roj0;
import l.vwb;
import l.w9j;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ixe0 extends pat<yl40> {

    /* JADX INFO: renamed from: i */
    public final swe0 f13466i;

    /* JADX INFO: renamed from: j */
    public int f13467j;

    /* JADX INFO: renamed from: k */
    public int f13468k;

    /* JADX INFO: renamed from: l */
    public BLiveShootGameInfo f13469l;

    /* JADX INFO: renamed from: m */
    public final bs5 f13470m;

    /* JADX INFO: renamed from: n */
    public int f13471n;

    /* JADX INFO: renamed from: o */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final dqd0 f13472o;

    public ixe0(bsm bsmVar) {
        super(bsmVar);
        this.f13466i = new swe0();
        this.f13467j = 0;
        this.f13468k = 0;
        this.f13470m = new bs5();
        this.f13471n = 0;
        this.f13472o = new dqd0("shoot_game_task_stage_clicked_" + m25552L2() + ypv.a.D0());
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m15477L3(Long l2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m15487a4(Long l2) {
        this.f13467j++;
        this.f13468k--;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m15488c4(iqv iqvVar) {
        this.f13466i.m22718d(ypv.a.D0(), this.f13467j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3, reason: merged with bridge method [inline-methods] */
    public final void m15493b4(final BLiveShootGameTask bLiveShootGameTask) {
        hfw.a(LiveMessage.LiveMessageType.SHOOT_GAME, "anchor completeTask:" + bLiveShootGameTask);
        duringCreated(this.f13466i.m22717c(ypv.a.D0(), true, bLiveShootGameTask.stage, ((yl40) m25547E2()).m17239o())).subscribe(ffw.h(new e30() { // from class: l.ywe0
            public final void call(Object obj) {
                this.f23132a.m15490X3(bLiveShootGameTask, (BLiveShootGameTask) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m15490X3(BLiveShootGameTask bLiveShootGameTask, BLiveShootGameTask bLiveShootGameTask2) {
        this.f13471n = 1;
        bLiveShootGameTask.status = bLiveShootGameTask2.status;
        bLiveShootGameTask.stage = bLiveShootGameTask2.stage;
        bLiveShootGameTask.ballCount = bLiveShootGameTask2.ballCount;
        bLiveShootGameTask.duration = bLiveShootGameTask2.duration;
        String str = "javascript:stageTaskCompleted('" + bLiveShootGameTask.toJson() + "')";
        m25548F2().BottomEvent.showShootGameRedPot().m(vwb.Y(bLiveShootGameTask2, Boolean.TRUE));
        m25548F2().LiveBridgeImplEvent.executeJs().j(str);
        hfw.a(LiveMessage.LiveMessageType.SHOOT_GAME, "anchor serverTask:" + bLiveShootGameTask2 + ":" + str);
        m15499i4(this.f13469l);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m15491Y3(BLiveShootGameInfo bLiveShootGameInfo) {
        this.f13469l = bLiveShootGameInfo;
        m15499i4(bLiveShootGameInfo);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m15492Z3(roj0 roj0Var) {
        m25548F2().BottomEvent.showShootGameRedPot().m(vwb.Y((Object) null, Boolean.FALSE));
        m15497g4();
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m15494d4(BLiveShootGameTask bLiveShootGameTask) {
        this.f13471n = 0;
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ Integer m15495e4(vwe0 vwe0Var) {
        return Integer.valueOf(this.f13468k);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ Integer m15496f4(twe0 twe0Var) {
        return Integer.valueOf(this.f13471n);
    }

    /* JADX INFO: renamed from: g4 */
    public final void m15497g4() {
        duringCreated(this.f13466i.m22719e(ypv.a.D0(), m25552L2())).subscribe(ffw.e(new e30() { // from class: l.cxe0
            public final void call(Object obj) {
                this.f8974a.m15491Y3((BLiveShootGameInfo) obj);
            }
        }, new e30() { // from class: l.dxe0
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }));
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m15498h4(BLiveShootGameTask bLiveShootGameTask) {
        return (((int) this.f13472o.d()) == bLiveShootGameTask.stage && ((long) this.f13472o.e()) == mqi0.n()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public final void m15499i4(BLiveShootGameInfo bLiveShootGameInfo) {
        if (bLiveShootGameInfo == null) {
            return;
        }
        hfw.a(LiveMessage.LiveMessageType.SHOOT_GAME, "anchor shootGameInfo:" + bLiveShootGameInfo.toJson());
        int i = this.f13467j;
        if (i == 0) {
            i = bLiveShootGameInfo.anchorDuration;
        }
        this.f13467j = i;
        final BLiveShootGameTask bLiveShootGameTask = null;
        int i2 = 0;
        BLiveShootGameTask bLiveShootGameTask2 = null;
        int i3 = 0;
        for (BLiveShootGameTask bLiveShootGameTask3 : bLiveShootGameInfo.shootGameTasks) {
            if (!TEnum.equals(bLiveShootGameTask3.status, "received")) {
                bLiveShootGameTask2 = bLiveShootGameTask3;
            }
            TEnum.equals(bLiveShootGameTask3.status, "completed");
            i3 += bLiveShootGameTask3.duration;
            if (TEnum.equals(bLiveShootGameTask3.status, "default") || TEnum.equals(bLiveShootGameTask3.status, "ongoing")) {
                i2 = i3 - this.f13467j;
                bLiveShootGameTask = bLiveShootGameTask3;
                break;
            }
        }
        if (bLiveShootGameTask2 != null && m15498h4(bLiveShootGameTask2)) {
            m25548F2().BottomEvent.showShootGameRedPot().m(vwb.Y(bLiveShootGameTask2, Boolean.TRUE));
        }
        if (bLiveShootGameTask == null) {
            m25548F2().OperationsEvent.hideItem().j(LiveMessage.LiveMessageType.SHOOT_GAME);
            return;
        }
        if (i2 <= 0) {
            i2 = bLiveShootGameTask.duration;
            this.f13467j = i3 - i2;
        }
        this.f13468k = i2;
        m25548F2().OperationsEvent.aloneCountDown().m(Integer.valueOf(this.f13468k));
        this.f13470m.c();
        long jY = jbu.Y();
        hfw.a(LiveMessage.LiveMessageType.SHOOT_GAME, "anchor task:" + bLiveShootGameTask.toJson() + ":" + jY + ":" + i2);
        this.f13470m.a(m14186H3(((yl40) m25547E2()).m14575i2(TimeUnit.SECONDS).take(i2).doOnNext(new e30() { // from class: l.exe0
            public final void call(Object obj) {
                this.f10043a.m15487a4((Long) obj);
            }
        })).observeOn(jo0.a()).subscribe(ffw.f(new e30() { // from class: l.fxe0
            public final void call(Object obj) {
                ixe0.m15477L3((Long) obj);
            }
        }, new e30() { // from class: l.gxe0
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }, new d30() { // from class: l.hxe0
            public final void call() {
                this.f12337a.m15493b4(bLiveShootGameTask);
            }
        })));
        this.f13470m.a(duringCreated(c.just(roj0.a).delay(jY, TimeUnit.MILLISECONDS)).observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.xwe0
            public final void call(Object obj) {
                this.f22491a.m15492Z3((roj0) obj);
            }
        })));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public void m15500t() {
        super.t();
        m15497g4();
        duringCreated(((yl40) m25547E2()).m17236l().filter(new n9t())).subscribe(ffw.h(new e30() { // from class: l.wwe0
            public final void call(Object obj) {
                this.f22020a.m15488c4((iqv) obj);
            }
        }));
        o2((c) m25548F2().ShootEvent.taskReceived().g(), false).subscribe(ffw.d(new e30() { // from class: l.zwe0
            public final void call(Object obj) {
                this.f23656a.m15494d4((BLiveShootGameTask) obj);
            }
        }));
        m14188d3(vwe0.class, new w9j() { // from class: l.axe0
            public final Object call(Object obj) {
                return this.f7917a.m15495e4((vwe0) obj);
            }
        });
        m14188d3(twe0.class, new w9j() { // from class: l.bxe0
            public final Object call(Object obj) {
                return this.f8400a.m15496f4((twe0) obj);
            }
        });
    }
}
