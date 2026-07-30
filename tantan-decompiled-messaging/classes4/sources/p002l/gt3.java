package p002l;

import android.annotation.SuppressLint;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p1.mobile.putong.live.base.data.BLiveShootGameTask;
import l.dqd0;
import l.mqi0;
import l.vwb;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gt3 extends mz0 {

    /* JADX INFO: renamed from: y */
    public BLiveShootGameTask f11621y;

    /* JADX INFO: renamed from: z */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final dqd0 f11622z;

    public gt3(bsm bsmVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, int i3, String str2) {
        super(bsmVar, bLiveBottomButton, i, i2, str, i3, str2);
        this.f11621y = null;
        this.f11622z = new dqd0("shoot_game_task_stage_clicked_" + m25552L2() + ypv.a.D0());
    }

    @Override // p002l.i80, p002l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo10610V3(View view) {
        m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(this.f9198m).m25610e(m15041j4()).m25608c());
        BLiveShootGameTask bLiveShootGameTask = this.f11621y;
        if (bLiveShootGameTask != null) {
            this.f11622z.g(bLiveShootGameTask.stage, mqi0.n(), (String) null);
        }
        m25548F2().BottomEvent.showShootGameRedPot().m(vwb.Y((Object) null, Boolean.FALSE));
        super.mo10610V3(view);
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo10613X3() {
        return BLiveButtonType.get(LiveMessage.LiveMessageType.SHOOT_GAME);
    }

    @Override // p002l.df2, p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        this.f11621y = null;
        m25548F2().BottomEvent.showShootGameRedPot().m(vwb.Y((Object) null, Boolean.FALSE));
    }
}
