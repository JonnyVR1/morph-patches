package p149l;

import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: classes4.dex */
public class bim0 extends js2 {
    public bim0(cim0 cim0Var) {
        super(cim0Var);
    }

    /* JADX INFO: renamed from: A1 */
    public static C12714b m102086A1(MotionParams motionParams) {
        if (motionParams.mo71888a() != MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE) {
            return null;
        }
        return new bim0((cim0) motionParams);
    }
}
