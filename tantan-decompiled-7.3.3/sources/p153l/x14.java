package p153l;

import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: classes4.dex */
public class x14 extends MotionParams {

    /* JADX INFO: renamed from: j */
    public final FrameLayout f191981j;

    /* JADX INFO: renamed from: k */
    public rcj<Integer, Object, Integer> f191982k;

    public x14(String str, String str2, String str3, String str4, String str5, String str6, FrameLayout frameLayout, rcj<Integer, Object, Integer> rcjVar) {
        super(str, "0", String.valueOf(2));
        this.f48638f = str2;
        this.f48639g = str3;
        this.f48640h = str4;
        this.f191982k = rcjVar;
        this.f191981j = frameLayout;
        this.f48636d = str5;
        this.f48641i = str6;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams
    /* JADX INFO: renamed from: a */
    public MotionParams.PusherMotionEnum mo73071a() {
        return MotionParams.PusherMotionEnum.MOTION_CALL_AUDIENCE;
    }

    public String toString() {
        return "CallAudienceMotionParams{remoteContainer=" + this.f191981j + ", callFunc=" + this.f191982k + ", userSig='" + this.f48641i + "', roomId='" + this.f48633a + "', provider='" + this.f48634b + "', businessType='" + this.f48635c + "', rtcProvider='" + this.f48636d + "'}";
    }
}
