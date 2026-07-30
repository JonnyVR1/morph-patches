package p153l;

import android.annotation.SuppressLint;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveShootGameInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveShootGameTask;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class p5f0 extends qct<mu40> {

    /* JADX INFO: renamed from: i */
    public final z4f0 f150644i;

    /* JADX INFO: renamed from: j */
    public int f150645j;

    /* JADX INFO: renamed from: k */
    public int f150646k;

    /* JADX INFO: renamed from: l */
    public BLiveShootGameInfo f150647l;

    /* JADX INFO: renamed from: m */
    public final ft5 f150648m;

    /* JADX INFO: renamed from: n */
    public int f150649n;

    /* JADX INFO: renamed from: o */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final fyd0 f150650o;

    public p5f0(dum dumVar) {
        super(dumVar);
        this.f150644i = new z4f0();
        this.f150645j = 0;
        this.f150646k = 0;
        this.f150648m = new ft5();
        this.f150649n = 0;
        this.f150650o = new fyd0("shoot_game_task_stage_clicked_" + m213815L2() + zrv.f205799a.m207631D0());
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m170629L3(Long l2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m170639a4(Long l2) {
        this.f150645j++;
        this.f150646k--;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m170640c4(jsv jsvVar) {
        this.f150644i.m218586d(zrv.f205799a.m207631D0(), this.f150645j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3, reason: merged with bridge method [inline-methods] */
    public final void m170645b4(final BLiveShootGameTask bLiveShootGameTask) {
        fhw.m125605a("shootGame", "anchor completeTask:" + bLiveShootGameTask);
        duringCreated(this.f150644i.m218585c(zrv.f205799a.m207631D0(), true, bLiveShootGameTask.stage, ((mu40) m213810E2()).m202194o())).subscribe(dhw.m115829h(new y20() { // from class: l.f5f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97223a.m170642X3(bLiveShootGameTask, (BLiveShootGameTask) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m170642X3(BLiveShootGameTask bLiveShootGameTask, BLiveShootGameTask bLiveShootGameTask2) {
        this.f150649n = 1;
        bLiveShootGameTask.status = bLiveShootGameTask2.status;
        bLiveShootGameTask.stage = bLiveShootGameTask2.stage;
        bLiveShootGameTask.ballCount = bLiveShootGameTask2.ballCount;
        bLiveShootGameTask.duration = bLiveShootGameTask2.duration;
        String str = "javascript:stageTaskCompleted('" + bLiveShootGameTask.toJson() + "')";
        m213811F2().BottomEvent.showShootGameRedPot().mo199274m(jyb.m147494Y(bLiveShootGameTask2, Boolean.TRUE));
        m213811F2().LiveBridgeImplEvent.executeJs().mo199273j(str);
        fhw.m125605a("shootGame", "anchor serverTask:" + bLiveShootGameTask2 + ":" + str);
        m170651i4(this.f150647l);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m170643Y3(BLiveShootGameInfo bLiveShootGameInfo) {
        this.f150647l = bLiveShootGameInfo;
        m170651i4(bLiveShootGameInfo);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m170644Z3(uxj0 uxj0Var) {
        m213811F2().BottomEvent.showShootGameRedPot().mo199274m(jyb.m147494Y(null, Boolean.FALSE));
        m170649g4();
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m170646d4(BLiveShootGameTask bLiveShootGameTask) {
        this.f150649n = 0;
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ Integer m170647e4(c5f0 c5f0Var) {
        return Integer.valueOf(this.f150646k);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ Integer m170648f4(a5f0 a5f0Var) {
        return Integer.valueOf(this.f150649n);
    }

    /* JADX INFO: renamed from: g4 */
    public final void m170649g4() {
        duringCreated(this.f150644i.m218587e(zrv.f205799a.m207631D0(), m213815L2())).subscribe(dhw.m115826e(new y20() { // from class: l.j5f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118434a.m170643Y3((BLiveShootGameInfo) obj);
            }
        }, new y20() { // from class: l.k5f0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }));
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m170650h4(BLiveShootGameTask bLiveShootGameTask) {
        return (((int) this.f150650o.m128083d()) == bLiveShootGameTask.stage && ((long) this.f150650o.m128084e()) == pzi0.m174453n()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public final void m170651i4(BLiveShootGameInfo bLiveShootGameInfo) {
        if (bLiveShootGameInfo == null) {
            return;
        }
        fhw.m125605a("shootGame", "anchor shootGameInfo:" + bLiveShootGameInfo.toJson());
        int i = this.f150645j;
        if (i == 0) {
            i = bLiveShootGameInfo.anchorDuration;
        }
        this.f150645j = i;
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
                i2 = i3 - this.f150645j;
                bLiveShootGameTask = bLiveShootGameTask3;
                break;
            }
        }
        if (bLiveShootGameTask2 != null && m170650h4(bLiveShootGameTask2)) {
            m213811F2().BottomEvent.showShootGameRedPot().mo199274m(jyb.m147494Y(bLiveShootGameTask2, Boolean.TRUE));
        }
        if (bLiveShootGameTask == null) {
            m213811F2().OperationsEvent.hideItem().mo199273j("shootGame");
            return;
        }
        if (i2 <= 0) {
            i2 = bLiveShootGameTask.duration;
            this.f150645j = i3 - i2;
        }
        this.f150646k = i2;
        m213811F2().OperationsEvent.aloneCountDown().mo199274m(Integer.valueOf(this.f150646k));
        this.f150648m.m127299c();
        long jM149280Y = kdu.m149280Y();
        fhw.m125605a("shootGame", "anchor task:" + bLiveShootGameTask.toJson() + ":" + jM149280Y + ":" + i2);
        this.f150648m.m127297a(m138858H3(((mu40) m213810E2()).m168525i2(TimeUnit.SECONDS).take(i2).doOnNext(new y20() { // from class: l.l5f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130108a.m170639a4((Long) obj);
            }
        })).observeOn(fo0.m126432a()).subscribe(dhw.m115827f(new y20() { // from class: l.m5f0
            @Override // p153l.y20
            public final void call(Object obj) {
                p5f0.m170629L3((Long) obj);
            }
        }, new y20() { // from class: l.n5f0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }, new x20() { // from class: l.o5f0
            @Override // p153l.x20
            public final void call() {
                this.f145068a.m170645b4(bLiveShootGameTask);
            }
        })));
        this.f150648m.m127297a(duringCreated(C22421c.just(uxj0.f181467a).delay(jM149280Y, TimeUnit.MILLISECONDS)).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.e5f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92215a.m170644Z3((uxj0) obj);
            }
        })));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m170649g4();
        duringCreated(((mu40) m213810E2()).m202192l().filter(new obt())).subscribe(dhw.m115829h(new y20() { // from class: l.d5f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85153a.m170640c4((jsv) obj);
            }
        }));
        m113231o2(m213811F2().ShootEvent.taskReceived().m199270g(), false).subscribe(dhw.m115825d(new y20() { // from class: l.g5f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102323a.m170646d4((BLiveShootGameTask) obj);
            }
        }));
        m138860d3(c5f0.class, new qcj() { // from class: l.h5f0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f107939a.m170647e4((c5f0) obj);
            }
        });
        m138860d3(a5f0.class, new qcj() { // from class: l.i5f0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f113068a.m170648f4((a5f0) obj);
            }
        });
    }
}
