package p149l;

import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: classes4.dex */
public class m210 extends MotionParams {

    /* JADX INFO: renamed from: j */
    public String f130876j;

    /* JADX INFO: renamed from: k */
    public final boolean f130877k;

    /* JADX INFO: renamed from: l */
    public transient FrameLayout f130878l;

    /* JADX INFO: renamed from: m */
    public transient FrameLayout f130879m;

    /* JADX INFO: renamed from: n */
    public int f130880n;

    public m210(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, boolean z, FrameLayout frameLayout, FrameLayout frameLayout2) {
        super(str, "0", String.valueOf(3));
        this.f47790f = str2;
        this.f47791g = str4;
        this.f47792h = str5;
        this.f47788d = str6;
        this.f47793i = str7;
        this.f130877k = z;
        this.f130876j = str8;
        this.f130878l = frameLayout;
        this.f130879m = frameLayout2;
        this.f130880n = i;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams
    /* JADX INFO: renamed from: a */
    public MotionParams.PusherMotionEnum mo71888a() {
        return MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_AUDIENCE;
    }
}
