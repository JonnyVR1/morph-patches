package p149l;

import android.annotation.SuppressLint;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveShootGameInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveShootGameStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveShootGameTask;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class uxe0 extends pat<am40> {

    /* JADX INFO: renamed from: i */
    public final swe0 f178728i;

    /* JADX INFO: renamed from: j */
    public BLiveShootGameInfo f178729j;

    /* JADX INFO: renamed from: k */
    public BLiveShootGameTask f178730k;

    /* JADX INFO: renamed from: l */
    public final bs5 f178731l;

    /* JADX INFO: renamed from: m */
    public Integer f178732m;

    /* JADX INFO: renamed from: n */
    public int f178733n;

    /* JADX INFO: renamed from: o */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final dqd0 f178734o;

    public uxe0(bsm bsmVar) {
        super(bsmVar);
        this.f178728i = new swe0();
        this.f178730k = null;
        this.f178731l = new bs5();
        this.f178732m = 0;
        this.f178733n = 0;
        this.f178734o = new dqd0("shoot_game_task_stage_clicked_" + m206032L2() + ypv.f199493a.m199309D0());
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m196155L3(Long l2) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    private void m196164V3(final BLiveShootGameTask bLiveShootGameTask) {
        hfw.m130790a("shootGame", "completeTask:" + bLiveShootGameTask);
        duringCreated(this.f178728i.m186159c(ypv.f199493a.m199309D0(), false, bLiveShootGameTask.stage, ((am40) m206027E2()).m149818o())).subscribe(ffw.m121197h(new e30() { // from class: l.kxe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125105a.m196168W3(bLiveShootGameTask, (BLiveShootGameTask) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m196165Z3(Long l2) {
        this.f178732m = Integer.valueOf(this.f178732m.intValue() - 1);
    }

    /* JADX INFO: renamed from: g4 */
    private boolean m196166g4(BLiveShootGameTask bLiveShootGameTask) {
        return (((int) this.f178734o.m113003d()) == bLiveShootGameTask.stage && ((long) this.f178734o.m113004e()) == mqi0.m155943n()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    private void m196167h4(BLiveShootGameInfo bLiveShootGameInfo) {
        BLiveShootGameTask bLiveShootGameTask;
        BLiveShootGameTask next;
        if (bLiveShootGameInfo == null) {
            return;
        }
        hfw.m130790a("shootGame", "shootGameInfo:" + bLiveShootGameInfo.toJson());
        Iterator<BLiveShootGameTask> it = bLiveShootGameInfo.shootGameTasks.iterator();
        boolean z = false;
        do {
            bLiveShootGameTask = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!TEnum.equals(next.status, "received")) {
                z = true;
            }
            if (!TEnum.equals(next.status, "completed")) {
                if (TEnum.equals(next.status, "default")) {
                    break;
                }
            } else {
                next.duration = 0;
                this.f178733n = 1;
                bLiveShootGameTask = next;
                break;
            }
        } while (!TEnum.equals(next.status, "ongoing"));
        if (bLiveShootGameTask != null && m196166g4(bLiveShootGameTask)) {
            m206028F2().BottomEvent.showShootGameRedPot().mo172464m(vwb.m200311Y(bLiveShootGameTask, Boolean.TRUE));
        }
        if (next == null) {
            if (z) {
                return;
            }
            m206028F2().OperationsEvent.hideItem().mo172463j("shootGame");
            return;
        }
        this.f178730k = next;
        if (next.duration < 0) {
            next.duration = 0;
        }
        this.f178732m = Integer.valueOf(next.duration);
        m206028F2().OperationsEvent.aloneCountDown().mo172464m(this.f178732m);
        this.f178731l.m103657c();
        long jM140817Y = jbu.m140817Y();
        hfw.m130790a("shootGame", "task:" + this.f178730k.toJson() + ":nextDayDiff:" + jM140817Y);
        this.f178731l.m103655a(duringCreated(C22306c.just(roj0.f160388a).delay(jM140817Y, TimeUnit.MILLISECONDS)).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.pxe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151677a.m196170Y3((roj0) obj);
            }
        })));
        if (this.f178732m.intValue() <= 0) {
            return;
        }
        this.f178731l.m103655a(m129299H3(((am40) m206027E2()).m132139i2(TimeUnit.SECONDS).take(this.f178732m.intValue()).doOnNext(new e30() { // from class: l.qxe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156840a.m196165Z3((Long) obj);
            }
        })).observeOn(jo0.m142408a()).subscribe(ffw.m121195f(new e30() { // from class: l.rxe0
            @Override // p149l.e30
            public final void call(Object obj) {
                uxe0.m196155L3((Long) obj);
            }
        }, new e30() { // from class: l.sxe0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }, new d30() { // from class: l.txe0
            @Override // p149l.d30
            public final void call() {
                this.f172505a.m196171a4();
            }
        })));
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m196168W3(BLiveShootGameTask bLiveShootGameTask, BLiveShootGameTask bLiveShootGameTask2) {
        hfw.m130790a("shootGame", "serverTask:" + bLiveShootGameTask2);
        this.f178733n = 1;
        bLiveShootGameTask.status = bLiveShootGameTask2.status;
        bLiveShootGameTask.stage = bLiveShootGameTask2.stage;
        bLiveShootGameTask.ballCount = bLiveShootGameTask2.ballCount;
        bLiveShootGameTask.duration = bLiveShootGameTask2.duration;
        m206028F2().BottomEvent.showShootGameRedPot().mo172464m(vwb.m200311Y(bLiveShootGameTask2, Boolean.TRUE));
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m196169X3(boolean z, BLiveShootGameInfo bLiveShootGameInfo) {
        this.f178729j = bLiveShootGameInfo;
        if (z) {
            m206028F2().LiveBridgeImplEvent.executeJs().mo172463j("javascript:resetShootGameTasks()");
        }
        m196167h4(bLiveShootGameInfo);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m196170Y3(roj0 roj0Var) {
        m206028F2().BottomEvent.showShootGameRedPot().mo172464m(vwb.m200311Y(null, Boolean.FALSE));
        m196176f4(true);
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m196171a4() {
        m196164V3(this.f178730k);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m196172b4(BLiveShootGameTask bLiveShootGameTask) {
        this.f178733n = 0;
        if (this.f178730k == null || this.f178729j == null) {
            return;
        }
        if (TEnum.equals(bLiveShootGameTask.status, BLiveShootGameStatus.autoReceived)) {
            m196175e4(this.f178729j.shootGameTasks);
        } else {
            BLiveShootGameTask bLiveShootGameTask2 = this.f178730k;
            bLiveShootGameTask2.status = bLiveShootGameTask.status;
            bLiveShootGameTask2.stage = bLiveShootGameTask.stage;
            bLiveShootGameTask2.duration = bLiveShootGameTask.duration;
            bLiveShootGameTask2.ballCount = bLiveShootGameTask.ballCount;
        }
        m196167h4(this.f178729j);
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ Integer m196173c4(vwe0 vwe0Var) {
        hfw.m130790a("shootGame", "currentTaskCountDown:" + this.f178732m);
        return this.f178732m;
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ Integer m196174d4(twe0 twe0Var) {
        return Integer.valueOf(this.f178733n);
    }

    /* JADX INFO: renamed from: e4 */
    public final void m196175e4(List<BLiveShootGameTask> list) {
        for (BLiveShootGameTask bLiveShootGameTask : list) {
            if (TEnum.equals(bLiveShootGameTask.status, "completed")) {
                bLiveShootGameTask.status = BLiveShootGameStatus.get("received");
            }
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m196176f4(final boolean z) {
        duringCreated(this.f178728i.m186161e(ypv.f199493a.m199309D0(), m206032L2())).subscribe(ffw.m121194e(new e30() { // from class: l.nxe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141016a.m196169X3(z, (BLiveShootGameInfo) obj);
            }
        }, new e30() { // from class: l.oxe0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m196176f4(false);
        m104250o2(m206028F2().ShootEvent.taskReceived().m172460g(), false).subscribe(ffw.m121193d(new e30() { // from class: l.jxe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120220a.m196172b4((BLiveShootGameTask) obj);
            }
        }));
        m129301d3(vwe0.class, new w9j() { // from class: l.lxe0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f130415a.m196173c4((vwe0) obj);
            }
        });
        m129301d3(twe0.class, new w9j() { // from class: l.mxe0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f136169a.m196174d4((twe0) obj);
            }
        });
    }
}
