package p153l;

import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: classes4.dex */
public class wa10 extends MotionParams {

    /* JADX INFO: renamed from: j */
    public String f188079j;

    /* JADX INFO: renamed from: k */
    public final boolean f188080k;

    /* JADX INFO: renamed from: l */
    public transient FrameLayout f188081l;

    /* JADX INFO: renamed from: m */
    public transient FrameLayout f188082m;

    /* JADX INFO: renamed from: n */
    public int f188083n;

    public wa10(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, boolean z, FrameLayout frameLayout, FrameLayout frameLayout2) {
        super(str, "0", String.valueOf(3));
        this.f48638f = str2;
        this.f48639g = str4;
        this.f48640h = str5;
        this.f48636d = str6;
        this.f48641i = str7;
        this.f188080k = z;
        this.f188079j = str8;
        this.f188081l = frameLayout;
        this.f188082m = frameLayout2;
        this.f188083n = i;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams
    /* JADX INFO: renamed from: a */
    public MotionParams.PusherMotionEnum mo73071a() {
        return MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_AUDIENCE;
    }
}
