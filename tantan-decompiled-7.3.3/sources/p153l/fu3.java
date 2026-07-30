package p153l;

import android.annotation.SuppressLint;
import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveShootGameTask;

/* JADX INFO: loaded from: classes4.dex */
public class fu3 extends tz0 {

    /* JADX INFO: renamed from: y */
    public BLiveShootGameTask f100877y;

    /* JADX INFO: renamed from: z */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final fyd0 f100878z;

    public fu3(dum dumVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, int i3, String str2) {
        super(dumVar, bLiveBottomButton, i, i2, str, i3, str2);
        this.f100877y = null;
        this.f100878z = new fyd0("shoot_game_task_stage_clicked_" + m213815L2() + zrv.f205799a.m207631D0());
    }

    @Override // p153l.e80, p153l.kf2
    /* JADX INFO: renamed from: V3 */
    public void mo96798V3(View view) {
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(this.f126234m).m103154e(m119795j4()).m103152c());
        BLiveShootGameTask bLiveShootGameTask = this.f100877y;
        if (bLiveShootGameTask != null) {
            this.f100878z.m128086g(bLiveShootGameTask.stage, pzi0.m174453n(), null);
        }
        m213811F2().BottomEvent.showShootGameRedPot().mo199274m(jyb.m147494Y(null, Boolean.FALSE));
        super.mo96798V3(view);
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo96799X3() {
        return BLiveButtonType.get("shootGame");
    }

    @Override // p153l.kf2, p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f100877y = null;
        m213811F2().BottomEvent.showShootGameRedPot().mo199274m(jyb.m147494Y(null, Boolean.FALSE));
    }
}
