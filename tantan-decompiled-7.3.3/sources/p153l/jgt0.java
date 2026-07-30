package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class jgt0 implements bqs0 {
    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12917a(Object obj, Map map) {
        bft0 bft0Var = (bft0) obj;
        yjt0 yjt0VarMo13729a = bft0Var.mo13729a();
        if (yjt0VarMo13729a == null) {
            try {
                yjt0 yjt0Var = new yjt0(bft0Var, Float.parseFloat((String) map.get(BLiveOperationTitleShowType.duration)), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                bft0Var.mo13764t(yjt0Var);
                yjt0VarMo13729a = yjt0Var;
            } catch (NullPointerException | NumberFormatException e) {
                dct0.m115296e("Unable to parse videoMeta message.", e);
                bxy0.m106933q().m120275w(e, "VideoMetaGmsgHandler.onGmsg");
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
        if (dct0.m115301j(3)) {
            dct0.m115293b("Video Meta GMSG: currentTime : " + f2 + " , duration : " + f + " , isMuted : " + zEquals + " , playbackState : " + i2 + " , aspectRatio : " + str);
        }
        yjt0VarMo13729a.m216429p8(f2, f, i2, zEquals, f3);
    }
}
