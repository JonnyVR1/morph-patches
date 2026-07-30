package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hcm0 extends ks2 {
    public hcm0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, f30<Integer, Object> f30Var) {
        super(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, true, f30Var);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams
    /* JADX INFO: renamed from: a */
    public MotionParams.PusherMotionEnum mo5266a() {
        return MotionParams.PusherMotionEnum.MOTION_VOICE_ANCHOR;
    }

    @Override // p002l.ks2
    public String toString() {
        return super.toString() + "anchor";
    }
}
