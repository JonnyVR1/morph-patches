package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gcm0 extends js2 {
    public gcm0(hcm0 hcm0Var) {
        super(hcm0Var);
    }

    /* JADX INFO: renamed from: A1 */
    public static C0303b m13717A1(MotionParams motionParams) {
        if (motionParams.mo5266a() != MotionParams.PusherMotionEnum.MOTION_VOICE_ANCHOR) {
            return null;
        }
        return new gcm0((hcm0) motionParams);
    }
}
