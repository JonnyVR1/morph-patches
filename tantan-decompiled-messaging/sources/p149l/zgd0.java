package p149l;

import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.data.BLivePkInfo;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: classes4.dex */
public class zgd0 extends MotionParams {

    /* JADX INFO: renamed from: j */
    public transient FrameLayout f203035j;

    /* JADX INFO: renamed from: k */
    public transient FrameLayout f203036k;

    /* JADX INFO: renamed from: l */
    public String f203037l;

    /* JADX INFO: renamed from: m */
    public BLivePkInfo f203038m;

    public zgd0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, FrameLayout frameLayout, FrameLayout frameLayout2, BLivePkInfo bLivePkInfo) {
        super(str, "0", String.valueOf(0));
        this.f47790f = str3;
        this.f47791g = str5;
        this.f47792h = str6;
        this.f47788d = str7;
        this.f47793i = str8;
        this.f203035j = frameLayout;
        this.f203036k = frameLayout2;
        this.f203037l = str2;
        this.f203038m = bLivePkInfo;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams
    /* JADX INFO: renamed from: a */
    public MotionParams.PusherMotionEnum mo71888a() {
        return MotionParams.PusherMotionEnum.MOTION_AUDIENCE_RTC;
    }
}
