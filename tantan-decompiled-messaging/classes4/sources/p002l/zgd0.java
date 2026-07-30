package p002l;

import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p1.mobile.putong.live.base.data.BLivePkInfo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zgd0 extends MotionParams {

    /* JADX INFO: renamed from: j */
    public transient FrameLayout f23396j;

    /* JADX INFO: renamed from: k */
    public transient FrameLayout f23397k;

    /* JADX INFO: renamed from: l */
    public String f23398l;

    /* JADX INFO: renamed from: m */
    public BLivePkInfo f23399m;

    public zgd0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, FrameLayout frameLayout, FrameLayout frameLayout2, BLivePkInfo bLivePkInfo) {
        super(str, "0", String.valueOf(0));
        this.f3832f = str3;
        this.f3833g = str5;
        this.f3834h = str6;
        this.f3830d = str7;
        this.f3835i = str8;
        this.f23396j = frameLayout;
        this.f23397k = frameLayout2;
        this.f23398l = str2;
        this.f23399m = bLivePkInfo;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams
    /* JADX INFO: renamed from: a */
    public MotionParams.PusherMotionEnum mo5266a() {
        return MotionParams.PusherMotionEnum.MOTION_AUDIENCE_RTC;
    }
}
