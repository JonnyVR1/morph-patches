package p149l;

import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p046p1.mobile.putong.live.external.internal.vchat.sdk.base.MotionParams;

/* JADX INFO: loaded from: classes13.dex */
public class a3l0 extends MotionParams {

    /* JADX INFO: renamed from: e */
    public final FrameLayout f67388e;

    /* JADX INFO: renamed from: f */
    public final FrameLayout f67389f;

    /* JADX INFO: renamed from: g */
    public String f67390g;

    /* JADX INFO: renamed from: h */
    public String f67391h;

    /* JADX INFO: renamed from: i */
    public String f67392i;

    /* JADX INFO: renamed from: j */
    public String f67393j;

    /* JADX INFO: renamed from: k */
    public String f67394k;

    /* JADX INFO: renamed from: l */
    public boolean f67395l;

    /* JADX INFO: renamed from: m */
    public k7m f67396m;

    /* JADX INFO: renamed from: n */
    public BLiveVideoQualityConf f67397n;

    public a3l0(String str, String str2, String str3, String str4, String str5, String str6, BLiveVideoQualityConf bLiveVideoQualityConf, FrameLayout frameLayout, FrameLayout frameLayout2, boolean z, String str7, k7m k7mVar) {
        super(str, "0", String.valueOf(205));
        this.f67390g = str2;
        this.f67391h = str3;
        this.f67392i = str4;
        this.f67388e = frameLayout;
        this.f45336d = str5;
        this.f67394k = str6;
        this.f67395l = z;
        this.f67397n = bLiveVideoQualityConf;
        this.f67389f = frameLayout2;
        this.f67393j = str7;
        this.f67396m = k7mVar;
    }

    @Override // com.p046p1.mobile.putong.live.external.internal.vchat.sdk.base.MotionParams
    /* JADX INFO: renamed from: a */
    public MotionParams.PusherMotionEnum mo69687a() {
        return this.f67395l ? MotionParams.PusherMotionEnum.VIDEO_CHAT_HOST : MotionParams.PusherMotionEnum.VIDEO_CHAT_CALLER;
    }
}
