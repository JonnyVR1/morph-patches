package p002l;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.p000p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import java.io.Serializable;
import l.gkh0;
import l.h5j0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cii extends ruf0 {
    @Override // p002l.ruf0
    /* JADX INFO: renamed from: a */
    public void mo10063a(guf0 guf0Var) {
        uuf0 uuf0VarMo14046a = guf0Var.mo14046a();
        AudienceStartData audienceStartDataM23633c = uuf0VarMo14046a.m23633c();
        Intent intentM23632b = uuf0VarMo14046a.m23632b();
        if (intentM23632b == null) {
            intentM23632b = new Intent(uuf0VarMo14046a.m23631a(), (Class<?>) LiveAct.class);
        }
        intentM23632b.putExtra("jump_to_tag", false);
        intentM23632b.putExtra("LIVE_AUDIENCE_START_DATA", (Serializable) audienceStartDataM23633c);
        intentM23632b.addFlags(67108864);
        BLiveAbsData bLiveAbsData = audienceStartDataM23633c.live;
        if (bLiveAbsData == null) {
            gkh0.j("[live][trace_problem]", Log.getStackTraceString(new Exception("startData.live is null.")));
        } else if (TextUtils.isEmpty(bLiveAbsData.id)) {
            gkh0.j("[live][trace_problem]", Log.getStackTraceString(new Exception("startData.live.id is null.")));
        }
        gkh0.j("[live][enter]", audienceStartDataM23633c.toString());
        eet.m12447a("audience_start_live_click", false, audienceStartDataM23633c.traceId, audienceStartDataM23633c.source, audienceStartDataM23633c.live, null);
        if (uuf0VarMo14046a.m23635e()) {
            h5j0.INSTANCE.d("voice_enter_room_rtc");
        } else if (uuf0VarMo14046a.m23636f()) {
            h5j0.INSTANCE.d("live_enter_room_rtc");
        } else {
            h5j0.INSTANCE.d("live_enter_room_cdn");
        }
        uuf0VarMo14046a.m23637g(intentM23632b);
        guf0Var.mo14047b(uuf0VarMo14046a);
    }
}
