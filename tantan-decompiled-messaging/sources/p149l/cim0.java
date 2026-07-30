package p149l;

import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: classes4.dex */
public class cim0 extends ks2 {
    public cim0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, f30<Integer, Object> f30Var) {
        super(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, z, f30Var);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams
    /* JADX INFO: renamed from: a */
    public MotionParams.PusherMotionEnum mo71888a() {
        return MotionParams.PusherMotionEnum.MOTION_VOICE_AUDIENCE;
    }

    @Override // p149l.ks2
    public String toString() {
        return super.toString() + "audience";
    }
}
