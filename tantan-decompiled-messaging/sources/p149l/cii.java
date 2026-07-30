package p149l;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: loaded from: classes4.dex */
public class cii extends ruf0 {
    @Override // p149l.ruf0
    /* JADX INFO: renamed from: a */
    public void mo98305a(guf0 guf0Var) {
        uuf0 uuf0VarMo128030a = guf0Var.mo128030a();
        AudienceStartData audienceStartDataM195359c = uuf0VarMo128030a.m195359c();
        Intent intentM195358b = uuf0VarMo128030a.m195358b();
        if (intentM195358b == null) {
            intentM195358b = new Intent(uuf0VarMo128030a.m195357a(), (Class<?>) LiveAct.class);
        }
        intentM195358b.putExtra(AudienceStartData.ANCHOR_TAG, false);
        intentM195358b.putExtra(AudienceStartData.LIVE_AUDIENCE_START_DATA, audienceStartDataM195359c);
        intentM195358b.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        BLiveAbsData bLiveAbsData = audienceStartDataM195359c.live;
        if (bLiveAbsData == null) {
            gkh0.m126627j("[live][trace_problem]", Log.getStackTraceString(new Exception("startData.live is null.")));
        } else if (TextUtils.isEmpty(bLiveAbsData.f44323id)) {
            gkh0.m126627j("[live][trace_problem]", Log.getStackTraceString(new Exception("startData.live.id is null.")));
        }
        gkh0.m126627j("[live][enter]", audienceStartDataM195359c.toString());
        eet.m116002a("audience_start_live_click", false, audienceStartDataM195359c.traceId, audienceStartDataM195359c.source, audienceStartDataM195359c.live, null);
        if (uuf0VarMo128030a.m195361e()) {
            h5j0.INSTANCE.m129405d("voice_enter_room_rtc");
        } else if (uuf0VarMo128030a.m195362f()) {
            h5j0.INSTANCE.m129405d("live_enter_room_rtc");
        } else {
            h5j0.INSTANCE.m129405d("live_enter_room_cdn");
        }
        uuf0VarMo128030a.m195363g(intentM195358b);
        guf0Var.mo128031b(uuf0VarMo128030a);
    }
}
