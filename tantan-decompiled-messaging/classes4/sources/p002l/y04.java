package p002l;

import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import l.x9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class y04 extends MotionParams {

    /* JADX INFO: renamed from: j */
    public final FrameLayout f22560j;

    /* JADX INFO: renamed from: k */
    public x9j<Integer, Object, Integer> f22561k;

    public y04(String str, String str2, String str3, String str4, String str5, String str6, FrameLayout frameLayout, x9j<Integer, Object, Integer> x9jVar) {
        super(str, "0", String.valueOf(2));
        this.f3832f = str2;
        this.f3833g = str3;
        this.f3834h = str4;
        this.f22561k = x9jVar;
        this.f22560j = frameLayout;
        this.f3830d = str5;
        this.f3835i = str6;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams
    /* JADX INFO: renamed from: a */
    public MotionParams.PusherMotionEnum mo5266a() {
        return MotionParams.PusherMotionEnum.MOTION_CALL_AUDIENCE;
    }

    public String toString() {
        return "CallAudienceMotionParams{remoteContainer=" + this.f22560j + ", callFunc=" + this.f22561k + ", userSig='" + this.f3835i + "', roomId='" + this.f3827a + "', provider='" + this.f3828b + "', businessType='" + this.f3829c + "', rtcProvider='" + this.f3830d + "'}";
    }
}
