package p149l;

import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: classes4.dex */
public class gcm0 extends js2 {
    public gcm0(hcm0 hcm0Var) {
        super(hcm0Var);
    }

    /* JADX INFO: renamed from: A1 */
    public static C12714b m125518A1(MotionParams motionParams) {
        if (motionParams.mo71888a() != MotionParams.PusherMotionEnum.MOTION_VOICE_ANCHOR) {
            return null;
        }
        return new gcm0((hcm0) motionParams);
    }
}
