package p153l;

import android.annotation.SuppressLint;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveShootGameInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveShootGameStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveShootGameTask;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class b6f0 extends qct<ou40> {

    /* JADX INFO: renamed from: i */
    public final z4f0 f75181i;

    /* JADX INFO: renamed from: j */
    public BLiveShootGameInfo f75182j;

    /* JADX INFO: renamed from: k */
    public BLiveShootGameTask f75183k;

    /* JADX INFO: renamed from: l */
    public final ft5 f75184l;

    /* JADX INFO: renamed from: m */
    public Integer f75185m;

    /* JADX INFO: renamed from: n */
    public int f75186n;

    /* JADX INFO: renamed from: o */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final fyd0 f75187o;

    public b6f0(dum dumVar) {
        super(dumVar);
        this.f75181i = new z4f0();
        this.f75183k = null;
        this.f75184l = new ft5();
        this.f75185m = 0;
        this.f75186n = 0;
        this.f75187o = new fyd0("shoot_game_task_stage_clicked_" + m213815L2() + zrv.f205799a.m207631D0());
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m102738L3(Long l2) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    private void m102747V3(final BLiveShootGameTask bLiveShootGameTask) {
        fhw.m125605a("shootGame", "completeTask:" + bLiveShootGameTask);
        duringCreated(this.f75181i.m218585c(zrv.f205799a.m207631D0(), false, bLiveShootGameTask.stage, ((ou40) m213810E2()).m202194o())).subscribe(dhw.m115829h(new y20() { // from class: l.r5f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161350a.m102751W3(bLiveShootGameTask, (BLiveShootGameTask) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m102748Z3(Long l2) {
        this.f75185m = Integer.valueOf(this.f75185m.intValue() - 1);
    }

    /* JADX INFO: renamed from: g4 */
    private boolean m102749g4(BLiveShootGameTask bLiveShootGameTask) {
        return (((int) this.f75187o.m128083d()) == bLiveShootGameTask.stage && ((long) this.f75187o.m128084e()) == pzi0.m174453n()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    private void m102750h4(BLiveShootGameInfo bLiveShootGameInfo) {
        BLiveShootGameTask bLiveShootGameTask;
        BLiveShootGameTask next;
        if (bLiveShootGameInfo == null) {
            return;
        }
        fhw.m125605a("shootGame", "shootGameInfo:" + bLiveShootGameInfo.toJson());
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
                this.f75186n = 1;
                bLiveShootGameTask = next;
                break;
            }
        } while (!TEnum.equals(next.status, "ongoing"));
        if (bLiveShootGameTask != null && m102749g4(bLiveShootGameTask)) {
            m213811F2().BottomEvent.showShootGameRedPot().mo199274m(jyb.m147494Y(bLiveShootGameTask, Boolean.TRUE));
        }
        if (next == null) {
            if (z) {
                return;
            }
            m213811F2().OperationsEvent.hideItem().mo199273j("shootGame");
            return;
        }
        this.f75183k = next;
        if (next.duration < 0) {
            next.duration = 0;
        }
        this.f75185m = Integer.valueOf(next.duration);
        m213811F2().OperationsEvent.aloneCountDown().mo199274m(this.f75185m);
        this.f75184l.m127299c();
        long jM149280Y = kdu.m149280Y();
        fhw.m125605a("shootGame", "task:" + this.f75183k.toJson() + ":nextDayDiff:" + jM149280Y);
        this.f75184l.m127297a(duringCreated(C22421c.just(uxj0.f181467a).delay(jM149280Y, TimeUnit.MILLISECONDS)).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.w5f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187505a.m102753Y3((uxj0) obj);
            }
        })));
        if (this.f75185m.intValue() <= 0) {
            return;
        }
        this.f75184l.m127297a(m138858H3(((ou40) m213810E2()).m168525i2(TimeUnit.SECONDS).take(this.f75185m.intValue()).doOnNext(new y20() { // from class: l.x5f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192494a.m102748Z3((Long) obj);
            }
        })).observeOn(fo0.m126432a()).subscribe(dhw.m115827f(new y20() { // from class: l.y5f0
            @Override // p153l.y20
            public final void call(Object obj) {
                b6f0.m102738L3((Long) obj);
            }
        }, new y20() { // from class: l.z5f0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }, new x20() { // from class: l.a6f0
            @Override // p153l.x20
            public final void call() {
                this.f68725a.m102754a4();
            }
        })));
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m102751W3(BLiveShootGameTask bLiveShootGameTask, BLiveShootGameTask bLiveShootGameTask2) {
        fhw.m125605a("shootGame", "serverTask:" + bLiveShootGameTask2);
        this.f75186n = 1;
        bLiveShootGameTask.status = bLiveShootGameTask2.status;
        bLiveShootGameTask.stage = bLiveShootGameTask2.stage;
        bLiveShootGameTask.ballCount = bLiveShootGameTask2.ballCount;
        bLiveShootGameTask.duration = bLiveShootGameTask2.duration;
        m213811F2().BottomEvent.showShootGameRedPot().mo199274m(jyb.m147494Y(bLiveShootGameTask2, Boolean.TRUE));
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m102752X3(boolean z, BLiveShootGameInfo bLiveShootGameInfo) {
        this.f75182j = bLiveShootGameInfo;
        if (z) {
            m213811F2().LiveBridgeImplEvent.executeJs().mo199273j("javascript:resetShootGameTasks()");
        }
        m102750h4(bLiveShootGameInfo);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m102753Y3(uxj0 uxj0Var) {
        m213811F2().BottomEvent.showShootGameRedPot().mo199274m(jyb.m147494Y(null, Boolean.FALSE));
        m102759f4(true);
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m102754a4() {
        m102747V3(this.f75183k);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m102755b4(BLiveShootGameTask bLiveShootGameTask) {
        this.f75186n = 0;
        if (this.f75183k == null || this.f75182j == null) {
            return;
        }
        if (TEnum.equals(bLiveShootGameTask.status, BLiveShootGameStatus.autoReceived)) {
            m102758e4(this.f75182j.shootGameTasks);
        } else {
            BLiveShootGameTask bLiveShootGameTask2 = this.f75183k;
            bLiveShootGameTask2.status = bLiveShootGameTask.status;
            bLiveShootGameTask2.stage = bLiveShootGameTask.stage;
            bLiveShootGameTask2.duration = bLiveShootGameTask.duration;
            bLiveShootGameTask2.ballCount = bLiveShootGameTask.ballCount;
        }
        m102750h4(this.f75182j);
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ Integer m102756c4(c5f0 c5f0Var) {
        fhw.m125605a("shootGame", "currentTaskCountDown:" + this.f75185m);
        return this.f75185m;
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ Integer m102757d4(a5f0 a5f0Var) {
        return Integer.valueOf(this.f75186n);
    }

    /* JADX INFO: renamed from: e4 */
    public final void m102758e4(List<BLiveShootGameTask> list) {
        for (BLiveShootGameTask bLiveShootGameTask : list) {
            if (TEnum.equals(bLiveShootGameTask.status, "completed")) {
                bLiveShootGameTask.status = BLiveShootGameStatus.get("received");
            }
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m102759f4(final boolean z) {
        duringCreated(this.f75181i.m218587e(zrv.f205799a.m207631D0(), m213815L2())).subscribe(dhw.m115826e(new y20() { // from class: l.u5f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177632a.m102752X3(z, (BLiveShootGameInfo) obj);
            }
        }, new y20() { // from class: l.v5f0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m102759f4(false);
        m113231o2(m213811F2().ShootEvent.taskReceived().m199270g(), false).subscribe(dhw.m115825d(new y20() { // from class: l.q5f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155712a.m102755b4((BLiveShootGameTask) obj);
            }
        }));
        m138860d3(c5f0.class, new qcj() { // from class: l.s5f0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f166361a.m102756c4((c5f0) obj);
            }
        });
        m138860d3(a5f0.class, new qcj() { // from class: l.t5f0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f172205a.m102757d4((a5f0) obj);
            }
        });
    }
}
