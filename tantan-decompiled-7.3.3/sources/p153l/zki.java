package p153l;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: loaded from: classes4.dex */
public class zki extends a3g0 {
    @Override // p153l.a3g0
    /* JADX INFO: renamed from: a */
    public void mo95802a(p2g0 p2g0Var) {
        d3g0 d3g0VarMo170350a = p2g0Var.mo170350a();
        AudienceStartData audienceStartDataM113813c = d3g0VarMo170350a.m113813c();
        Intent intentM113812b = d3g0VarMo170350a.m113812b();
        if (intentM113812b == null) {
            intentM113812b = new Intent(d3g0VarMo170350a.m113811a(), (Class<?>) LiveAct.class);
        }
        intentM113812b.putExtra(AudienceStartData.ANCHOR_TAG, false);
        intentM113812b.putExtra(AudienceStartData.LIVE_AUDIENCE_START_DATA, audienceStartDataM113813c);
        intentM113812b.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        BLiveAbsData bLiveAbsData = audienceStartDataM113813c.live;
        if (bLiveAbsData == null) {
            nsh0.m164608j("[live][trace_problem]", Log.getStackTraceString(new Exception("startData.live is null.")));
        } else if (TextUtils.isEmpty(bLiveAbsData.f45171id)) {
            nsh0.m164608j("[live][trace_problem]", Log.getStackTraceString(new Exception("startData.live.id is null.")));
        }
        nsh0.m164608j("[live][enter]", audienceStartDataM113813c.toString());
        fgt.m125529a("audience_start_live_click", false, audienceStartDataM113813c.traceId, audienceStartDataM113813c.source, audienceStartDataM113813c.live, null);
        if (d3g0VarMo170350a.m113815e()) {
            lej0.INSTANCE.m153910d("voice_enter_room_rtc");
        } else if (d3g0VarMo170350a.m113816f()) {
            lej0.INSTANCE.m153910d("live_enter_room_rtc");
        } else {
            lej0.INSTANCE.m153910d("live_enter_room_cdn");
        }
        d3g0VarMo170350a.m113817g(intentM113812b);
        p2g0Var.mo170351b(d3g0VarMo170350a);
    }
}
