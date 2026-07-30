package p002l;

import android.annotation.SuppressLint;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveShootGameInfo;
import com.p1.mobile.putong.live.base.data.BLiveShootGameStatus;
import com.p1.mobile.putong.live.base.data.BLiveShootGameTask;
import java.util.Iterator;
import java.util.List;
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
public class uxe0 extends pat<am40> {

    /* JADX INFO: renamed from: i */
    public final swe0 f20869i;

    /* JADX INFO: renamed from: j */
    public BLiveShootGameInfo f20870j;

    /* JADX INFO: renamed from: k */
    public BLiveShootGameTask f20871k;

    /* JADX INFO: renamed from: l */
    public final bs5 f20872l;

    /* JADX INFO: renamed from: m */
    public Integer f20873m;

    /* JADX INFO: renamed from: n */
    public int f20874n;

    /* JADX INFO: renamed from: o */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final dqd0 f20875o;

    public uxe0(bsm bsmVar) {
        super(bsmVar);
        this.f20869i = new swe0();
        this.f20871k = null;
        this.f20872l = new bs5();
        this.f20873m = 0;
        this.f20874n = 0;
        this.f20875o = new dqd0("shoot_game_task_stage_clicked_" + m25552L2() + ypv.a.D0());
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m23649L3(Long l2) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    private void m23658V3(final BLiveShootGameTask bLiveShootGameTask) {
        hfw.a(LiveMessage.LiveMessageType.SHOOT_GAME, "completeTask:" + bLiveShootGameTask);
        duringCreated(this.f20869i.m22717c(ypv.a.D0(), false, bLiveShootGameTask.stage, ((am40) m25547E2()).m17239o())).subscribe(ffw.h(new e30() { // from class: l.kxe0
            public final void call(Object obj) {
                this.f14578a.m23662W3(bLiveShootGameTask, (BLiveShootGameTask) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m23659Z3(Long l2) {
        this.f20873m = Integer.valueOf(this.f20873m.intValue() - 1);
    }

    /* JADX INFO: renamed from: g4 */
    private boolean m23660g4(BLiveShootGameTask bLiveShootGameTask) {
        return (((int) this.f20875o.d()) == bLiveShootGameTask.stage && ((long) this.f20875o.e()) == mqi0.n()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    private void m23661h4(BLiveShootGameInfo bLiveShootGameInfo) {
        BLiveShootGameTask bLiveShootGameTask;
        BLiveShootGameTask bLiveShootGameTask2;
        if (bLiveShootGameInfo == null) {
            return;
        }
        hfw.a(LiveMessage.LiveMessageType.SHOOT_GAME, "shootGameInfo:" + bLiveShootGameInfo.toJson());
        Iterator it = bLiveShootGameInfo.shootGameTasks.iterator();
        boolean z = false;
        do {
            bLiveShootGameTask = null;
            if (!it.hasNext()) {
                bLiveShootGameTask2 = null;
                break;
            }
            bLiveShootGameTask2 = (BLiveShootGameTask) it.next();
            if (!TEnum.equals(bLiveShootGameTask2.status, "received")) {
                z = true;
            }
            if (!TEnum.equals(bLiveShootGameTask2.status, "completed")) {
                if (TEnum.equals(bLiveShootGameTask2.status, "default")) {
                    break;
                }
            } else {
                bLiveShootGameTask2.duration = 0;
                this.f20874n = 1;
                bLiveShootGameTask = bLiveShootGameTask2;
                break;
            }
        } while (!TEnum.equals(bLiveShootGameTask2.status, "ongoing"));
        if (bLiveShootGameTask != null && m23660g4(bLiveShootGameTask)) {
            m25548F2().BottomEvent.showShootGameRedPot().m(vwb.Y(bLiveShootGameTask, Boolean.TRUE));
        }
        if (bLiveShootGameTask2 == null) {
            if (z) {
                return;
            }
            m25548F2().OperationsEvent.hideItem().j(LiveMessage.LiveMessageType.SHOOT_GAME);
            return;
        }
        this.f20871k = bLiveShootGameTask2;
        if (bLiveShootGameTask2.duration < 0) {
            bLiveShootGameTask2.duration = 0;
        }
        this.f20873m = Integer.valueOf(bLiveShootGameTask2.duration);
        m25548F2().OperationsEvent.aloneCountDown().m(this.f20873m);
        this.f20872l.c();
        long jY = jbu.Y();
        hfw.a(LiveMessage.LiveMessageType.SHOOT_GAME, "task:" + this.f20871k.toJson() + ":nextDayDiff:" + jY);
        this.f20872l.a(duringCreated(c.just(roj0.a).delay(jY, TimeUnit.MILLISECONDS)).observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.pxe0
            public final void call(Object obj) {
                this.f17712a.m23664Y3((roj0) obj);
            }
        })));
        if (this.f20873m.intValue() <= 0) {
            return;
        }
        this.f20872l.a(m14186H3(((am40) m25547E2()).m14575i2(TimeUnit.SECONDS).take(this.f20873m.intValue()).doOnNext(new e30() { // from class: l.qxe0
            public final void call(Object obj) {
                this.f18269a.m23659Z3((Long) obj);
            }
        })).observeOn(jo0.a()).subscribe(ffw.f(new e30() { // from class: l.rxe0
            public final void call(Object obj) {
                uxe0.m23649L3((Long) obj);
            }
        }, new e30() { // from class: l.sxe0
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }, new d30() { // from class: l.txe0
            public final void call() {
                this.f20419a.m23665a4();
            }
        })));
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m23662W3(BLiveShootGameTask bLiveShootGameTask, BLiveShootGameTask bLiveShootGameTask2) {
        hfw.a(LiveMessage.LiveMessageType.SHOOT_GAME, "serverTask:" + bLiveShootGameTask2);
        this.f20874n = 1;
        bLiveShootGameTask.status = bLiveShootGameTask2.status;
        bLiveShootGameTask.stage = bLiveShootGameTask2.stage;
        bLiveShootGameTask.ballCount = bLiveShootGameTask2.ballCount;
        bLiveShootGameTask.duration = bLiveShootGameTask2.duration;
        m25548F2().BottomEvent.showShootGameRedPot().m(vwb.Y(bLiveShootGameTask2, Boolean.TRUE));
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m23663X3(boolean z, BLiveShootGameInfo bLiveShootGameInfo) {
        this.f20870j = bLiveShootGameInfo;
        if (z) {
            m25548F2().LiveBridgeImplEvent.executeJs().j("javascript:resetShootGameTasks()");
        }
        m23661h4(bLiveShootGameInfo);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m23664Y3(roj0 roj0Var) {
        m25548F2().BottomEvent.showShootGameRedPot().m(vwb.Y((Object) null, Boolean.FALSE));
        m23670f4(true);
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m23665a4() {
        m23658V3(this.f20871k);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m23666b4(BLiveShootGameTask bLiveShootGameTask) {
        this.f20874n = 0;
        if (this.f20871k == null || this.f20870j == null) {
            return;
        }
        if (TEnum.equals(bLiveShootGameTask.status, "autoReceived")) {
            m23669e4(this.f20870j.shootGameTasks);
        } else {
            BLiveShootGameTask bLiveShootGameTask2 = this.f20871k;
            bLiveShootGameTask2.status = bLiveShootGameTask.status;
            bLiveShootGameTask2.stage = bLiveShootGameTask.stage;
            bLiveShootGameTask2.duration = bLiveShootGameTask.duration;
            bLiveShootGameTask2.ballCount = bLiveShootGameTask.ballCount;
        }
        m23661h4(this.f20870j);
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ Integer m23667c4(vwe0 vwe0Var) {
        hfw.a(LiveMessage.LiveMessageType.SHOOT_GAME, "currentTaskCountDown:" + this.f20873m);
        return this.f20873m;
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ Integer m23668d4(twe0 twe0Var) {
        return Integer.valueOf(this.f20874n);
    }

    /* JADX INFO: renamed from: e4 */
    public final void m23669e4(List<BLiveShootGameTask> list) {
        for (BLiveShootGameTask bLiveShootGameTask : list) {
            if (TEnum.equals(bLiveShootGameTask.status, "completed")) {
                bLiveShootGameTask.status = BLiveShootGameStatus.get("received");
            }
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m23670f4(final boolean z) {
        duringCreated(this.f20869i.m22719e(ypv.a.D0(), m25552L2())).subscribe(ffw.e(new e30() { // from class: l.nxe0
            public final void call(Object obj) {
                this.f16294a.m23663X3(z, (BLiveShootGameInfo) obj);
            }
        }, new e30() { // from class: l.oxe0
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public void m23671t() {
        super.t();
        m23670f4(false);
        o2((c) m25548F2().ShootEvent.taskReceived().g(), false).subscribe(ffw.d(new e30() { // from class: l.jxe0
            public final void call(Object obj) {
                this.f14124a.m23666b4((BLiveShootGameTask) obj);
            }
        }));
        m14188d3(vwe0.class, new w9j() { // from class: l.lxe0
            public final Object call(Object obj) {
                return this.f15113a.m23667c4((vwe0) obj);
            }
        });
        m14188d3(twe0.class, new w9j() { // from class: l.mxe0
            public final Object call(Object obj) {
                return this.f15735a.m23668d4((twe0) obj);
            }
        });
    }
}
