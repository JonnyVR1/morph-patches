package p149l;

import android.annotation.SuppressLint;
import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveShootGameTask;

/* JADX INFO: loaded from: classes4.dex */
public class gt3 extends mz0 {

    /* JADX INFO: renamed from: y */
    public BLiveShootGameTask f104240y;

    /* JADX INFO: renamed from: z */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final dqd0 f104241z;

    public gt3(bsm bsmVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, int i3, String str2) {
        super(bsmVar, bLiveBottomButton, i, i2, str, i3, str2);
        this.f104240y = null;
        this.f104241z = new dqd0("shoot_game_task_stage_clicked_" + m206032L2() + ypv.f199493a.m199309D0());
    }

    @Override // p149l.i80, p149l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo103804V3(View view) {
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(this.f85889m).m206701e(m134931j4()).m206699c());
        BLiveShootGameTask bLiveShootGameTask = this.f104240y;
        if (bLiveShootGameTask != null) {
            this.f104241z.m113006g(bLiveShootGameTask.stage, mqi0.m155943n(), null);
        }
        m206028F2().BottomEvent.showShootGameRedPot().mo172464m(vwb.m200311Y(null, Boolean.FALSE));
        super.mo103804V3(view);
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo103807X3() {
        return BLiveButtonType.get("shootGame");
    }

    @Override // p149l.df2, p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f104240y = null;
        m206028F2().BottomEvent.showShootGameRedPot().mo172464m(vwb.m200311Y(null, Boolean.FALSE));
    }
}
