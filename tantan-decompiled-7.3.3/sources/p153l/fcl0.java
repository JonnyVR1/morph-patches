package p153l;

import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p051p1.mobile.putong.live.external.internal.vchat.sdk.base.MotionParams;

/* JADX INFO: loaded from: classes9.dex */
public class fcl0 extends MotionParams {

    /* JADX INFO: renamed from: e */
    public final FrameLayout f98225e;

    /* JADX INFO: renamed from: f */
    public final FrameLayout f98226f;

    /* JADX INFO: renamed from: g */
    public String f98227g;

    /* JADX INFO: renamed from: h */
    public String f98228h;

    /* JADX INFO: renamed from: i */
    public String f98229i;

    /* JADX INFO: renamed from: j */
    public String f98230j;

    /* JADX INFO: renamed from: k */
    public String f98231k;

    /* JADX INFO: renamed from: l */
    public boolean f98232l;

    /* JADX INFO: renamed from: m */
    public aam f98233m;

    /* JADX INFO: renamed from: n */
    public BLiveVideoQualityConf f98234n;

    public fcl0(String str, String str2, String str3, String str4, String str5, String str6, BLiveVideoQualityConf bLiveVideoQualityConf, FrameLayout frameLayout, FrameLayout frameLayout2, boolean z, String str7, aam aamVar) {
        super(str, "0", String.valueOf(205));
        this.f98227g = str2;
        this.f98228h = str3;
        this.f98229i = str4;
        this.f98225e = frameLayout;
        this.f46184d = str5;
        this.f98231k = str6;
        this.f98232l = z;
        this.f98234n = bLiveVideoQualityConf;
        this.f98226f = frameLayout2;
        this.f98230j = str7;
        this.f98233m = aamVar;
    }

    @Override // com.p051p1.mobile.putong.live.external.internal.vchat.sdk.base.MotionParams
    /* JADX INFO: renamed from: a */
    public MotionParams.PusherMotionEnum mo70870a() {
        return this.f98232l ? MotionParams.PusherMotionEnum.VIDEO_CHAT_HOST : MotionParams.PusherMotionEnum.VIDEO_CHAT_CALLER;
    }
}
