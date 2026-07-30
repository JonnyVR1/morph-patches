package p153l;

import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: classes4.dex */
public class klm0 extends zs2 {
    public klm0(llm0 llm0Var) {
        super(llm0Var);
    }

    /* JADX INFO: renamed from: A1 */
    public static C12877b m150391A1(MotionParams motionParams) {
        if (motionParams.mo73071a() != MotionParams.PusherMotionEnum.MOTION_VOICE_ANCHOR) {
            return null;
        }
        return new klm0((llm0) motionParams);
    }
}
