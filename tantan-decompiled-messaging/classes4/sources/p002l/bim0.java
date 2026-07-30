package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bim0 extends js2 {
    public bim0(cim0 cim0Var) {
        super(cim0Var);
    }

    /* JADX INFO: renamed from: A1 */
    public static C0303b m10374A1(MotionParams motionParams) {
        if (motionParams.mo5266a() != MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE) {
            return null;
        }
        return new bim0((cim0) motionParams);
    }
}
