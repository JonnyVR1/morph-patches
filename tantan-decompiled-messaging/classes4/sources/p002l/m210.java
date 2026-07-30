package p002l;

import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class m210 extends MotionParams {

    /* JADX INFO: renamed from: j */
    public String f15209j;

    /* JADX INFO: renamed from: k */
    public final boolean f15210k;

    /* JADX INFO: renamed from: l */
    public transient FrameLayout f15211l;

    /* JADX INFO: renamed from: m */
    public transient FrameLayout f15212m;

    /* JADX INFO: renamed from: n */
    public int f15213n;

    public m210(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, boolean z, FrameLayout frameLayout, FrameLayout frameLayout2) {
        super(str, "0", String.valueOf(3));
        this.f3832f = str2;
        this.f3833g = str4;
        this.f3834h = str5;
        this.f3830d = str6;
        this.f3835i = str7;
        this.f15210k = z;
        this.f15209j = str8;
        this.f15211l = frameLayout;
        this.f15212m = frameLayout2;
        this.f15213n = i;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams
    /* JADX INFO: renamed from: a */
    public MotionParams.PusherMotionEnum mo5266a() {
        return MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_AUDIENCE;
    }
}
