package p149l;

import android.annotation.SuppressLint;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveShootGameInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveShootGameTask;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class ixe0 extends pat<yl40> {

    /* JADX INFO: renamed from: i */
    public final swe0 f115357i;

    /* JADX INFO: renamed from: j */
    public int f115358j;

    /* JADX INFO: renamed from: k */
    public int f115359k;

    /* JADX INFO: renamed from: l */
    public BLiveShootGameInfo f115360l;

    /* JADX INFO: renamed from: m */
    public final bs5 f115361m;

    /* JADX INFO: renamed from: n */
    public int f115362n;

    /* JADX INFO: renamed from: o */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final dqd0 f115363o;

    public ixe0(bsm bsmVar) {
        super(bsmVar);
        this.f115357i = new swe0();
        this.f115358j = 0;
        this.f115359k = 0;
        this.f115361m = new bs5();
        this.f115362n = 0;
        this.f115363o = new dqd0("shoot_game_task_stage_clicked_" + m206032L2() + ypv.f199493a.m199309D0());
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m138817L3(Long l2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m138827a4(Long l2) {
        this.f115358j++;
        this.f115359k--;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m138828c4(iqv iqvVar) {
        this.f115357i.m186160d(ypv.f199493a.m199309D0(), this.f115358j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3, reason: merged with bridge method [inline-methods] */
    public final void m138833b4(final BLiveShootGameTask bLiveShootGameTask) {
        hfw.m130790a("shootGame", "anchor completeTask:" + bLiveShootGameTask);
        duringCreated(this.f115357i.m186159c(ypv.f199493a.m199309D0(), true, bLiveShootGameTask.stage, ((yl40) m206027E2()).m149818o())).subscribe(ffw.m121197h(new e30() { // from class: l.ywe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200496a.m138830X3(bLiveShootGameTask, (BLiveShootGameTask) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m138830X3(BLiveShootGameTask bLiveShootGameTask, BLiveShootGameTask bLiveShootGameTask2) {
        this.f115362n = 1;
        bLiveShootGameTask.status = bLiveShootGameTask2.status;
        bLiveShootGameTask.stage = bLiveShootGameTask2.stage;
        bLiveShootGameTask.ballCount = bLiveShootGameTask2.ballCount;
        bLiveShootGameTask.duration = bLiveShootGameTask2.duration;
        String str = "javascript:stageTaskCompleted('" + bLiveShootGameTask.toJson() + "')";
        m206028F2().BottomEvent.showShootGameRedPot().mo172464m(vwb.m200311Y(bLiveShootGameTask2, Boolean.TRUE));
        m206028F2().LiveBridgeImplEvent.executeJs().mo172463j(str);
        hfw.m130790a("shootGame", "anchor serverTask:" + bLiveShootGameTask2 + ":" + str);
        m138839i4(this.f115360l);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m138831Y3(BLiveShootGameInfo bLiveShootGameInfo) {
        this.f115360l = bLiveShootGameInfo;
        m138839i4(bLiveShootGameInfo);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m138832Z3(roj0 roj0Var) {
        m206028F2().BottomEvent.showShootGameRedPot().mo172464m(vwb.m200311Y(null, Boolean.FALSE));
        m138837g4();
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m138834d4(BLiveShootGameTask bLiveShootGameTask) {
        this.f115362n = 0;
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ Integer m138835e4(vwe0 vwe0Var) {
        return Integer.valueOf(this.f115359k);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ Integer m138836f4(twe0 twe0Var) {
        return Integer.valueOf(this.f115362n);
    }

    /* JADX INFO: renamed from: g4 */
    public final void m138837g4() {
        duringCreated(this.f115357i.m186161e(ypv.f199493a.m199309D0(), m206032L2())).subscribe(ffw.m121194e(new e30() { // from class: l.cxe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82871a.m138831Y3((BLiveShootGameInfo) obj);
            }
        }, new e30() { // from class: l.dxe0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }));
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m138838h4(BLiveShootGameTask bLiveShootGameTask) {
        return (((int) this.f115363o.m113003d()) == bLiveShootGameTask.stage && ((long) this.f115363o.m113004e()) == mqi0.m155943n()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public final void m138839i4(BLiveShootGameInfo bLiveShootGameInfo) {
        if (bLiveShootGameInfo == null) {
            return;
        }
        hfw.m130790a("shootGame", "anchor shootGameInfo:" + bLiveShootGameInfo.toJson());
        int i = this.f115358j;
        if (i == 0) {
            i = bLiveShootGameInfo.anchorDuration;
        }
        this.f115358j = i;
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
                i2 = i3 - this.f115358j;
                bLiveShootGameTask = bLiveShootGameTask3;
                break;
            }
        }
        if (bLiveShootGameTask2 != null && m138838h4(bLiveShootGameTask2)) {
            m206028F2().BottomEvent.showShootGameRedPot().mo172464m(vwb.m200311Y(bLiveShootGameTask2, Boolean.TRUE));
        }
        if (bLiveShootGameTask == null) {
            m206028F2().OperationsEvent.hideItem().mo172463j("shootGame");
            return;
        }
        if (i2 <= 0) {
            i2 = bLiveShootGameTask.duration;
            this.f115358j = i3 - i2;
        }
        this.f115359k = i2;
        m206028F2().OperationsEvent.aloneCountDown().mo172464m(Integer.valueOf(this.f115359k));
        this.f115361m.m103657c();
        long jM140817Y = jbu.m140817Y();
        hfw.m130790a("shootGame", "anchor task:" + bLiveShootGameTask.toJson() + ":" + jM140817Y + ":" + i2);
        this.f115361m.m103655a(m129299H3(((yl40) m206027E2()).m132139i2(TimeUnit.SECONDS).take(i2).doOnNext(new e30() { // from class: l.exe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93653a.m138827a4((Long) obj);
            }
        })).observeOn(jo0.m142408a()).subscribe(ffw.m121195f(new e30() { // from class: l.fxe0
            @Override // p149l.e30
            public final void call(Object obj) {
                ixe0.m138817L3((Long) obj);
            }
        }, new e30() { // from class: l.gxe0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }, new d30() { // from class: l.hxe0
            @Override // p149l.d30
            public final void call() {
                this.f109863a.m138833b4(bLiveShootGameTask);
            }
        })));
        this.f115361m.m103655a(duringCreated(C22306c.just(roj0.f160388a).delay(jM140817Y, TimeUnit.MILLISECONDS)).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.xwe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194730a.m138832Z3((roj0) obj);
            }
        })));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m138837g4();
        duringCreated(((yl40) m206027E2()).m149815l().filter(new n9t())).subscribe(ffw.m121197h(new e30() { // from class: l.wwe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188367a.m138828c4((iqv) obj);
            }
        }));
        m104250o2(m206028F2().ShootEvent.taskReceived().m172460g(), false).subscribe(ffw.m121193d(new e30() { // from class: l.zwe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205172a.m138834d4((BLiveShootGameTask) obj);
            }
        }));
        m129301d3(vwe0.class, new w9j() { // from class: l.axe0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f72147a.m138835e4((vwe0) obj);
            }
        });
        m129301d3(twe0.class, new w9j() { // from class: l.bxe0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f77785a.m138836f4((twe0) obj);
            }
        });
    }
}
