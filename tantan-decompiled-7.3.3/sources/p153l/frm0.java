package p153l;

import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: classes4.dex */
public class frm0 extends zs2 {
    public frm0(grm0 grm0Var) {
        super(grm0Var);
    }

    /* JADX INFO: renamed from: A1 */
    public static C12877b m126947A1(MotionParams motionParams) {
        if (motionParams.mo73071a() != MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE) {
            return null;
        }
        return new frm0((grm0) motionParams);
    }
}
