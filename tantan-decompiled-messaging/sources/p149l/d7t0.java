package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class d7t0 implements vgs0 {
    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12863a(Object obj, Map map) {
        v5t0 v5t0Var = (v5t0) obj;
        sat0 sat0VarMo13675a = v5t0Var.mo13675a();
        if (sat0VarMo13675a == null) {
            try {
                sat0 sat0Var = new sat0(v5t0Var, Float.parseFloat((String) map.get(BLiveOperationTitleShowType.duration)), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                v5t0Var.mo13710t(sat0Var);
                sat0VarMo13675a = sat0Var;
            } catch (NullPointerException | NumberFormatException e) {
                x2t0.m206867e("Unable to parse videoMeta message.", e);
                vny0.m199079q().m212290w(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f = Float.parseFloat((String) map.get(BLiveOperationTitleShowType.duration));
        boolean zEquals = "1".equals(map.get("muted"));
        float f2 = Float.parseFloat((String) map.get("currentTime"));
        int i = Integer.parseInt((String) map.get("playbackState"));
        int i2 = 0;
        if (i >= 0 && i <= 3) {
            i2 = i;
        }
        String str = (String) map.get(Constants.INAPP_ASPECT_RATIO);
        float f3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (x2t0.m206872j(3)) {
            x2t0.m206864b("Video Meta GMSG: currentTime : " + f2 + " , duration : " + f + " , isMuted : " + zEquals + " , playbackState : " + i2 + " , aspectRatio : " + str);
        }
        sat0VarMo13675a.m183091p8(f2, f, i2, zEquals, f3);
    }
}
