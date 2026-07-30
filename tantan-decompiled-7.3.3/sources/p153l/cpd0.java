package p153l;

import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.data.BLivePkInfo;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: classes4.dex */
public class cpd0 extends MotionParams {

    /* JADX INFO: renamed from: j */
    public transient FrameLayout f82991j;

    /* JADX INFO: renamed from: k */
    public transient FrameLayout f82992k;

    /* JADX INFO: renamed from: l */
    public String f82993l;

    /* JADX INFO: renamed from: m */
    public BLivePkInfo f82994m;

    public cpd0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, FrameLayout frameLayout, FrameLayout frameLayout2, BLivePkInfo bLivePkInfo) {
        super(str, "0", String.valueOf(0));
        this.f48638f = str3;
        this.f48639g = str5;
        this.f48640h = str6;
        this.f48636d = str7;
        this.f48641i = str8;
        this.f82991j = frameLayout;
        this.f82992k = frameLayout2;
        this.f82993l = str2;
        this.f82994m = bLivePkInfo;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams
    /* JADX INFO: renamed from: a */
    public MotionParams.PusherMotionEnum mo73071a() {
        return MotionParams.PusherMotionEnum.MOTION_AUDIENCE_RTC;
    }
}
