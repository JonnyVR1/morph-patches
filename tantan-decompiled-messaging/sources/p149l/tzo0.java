package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveCallEffectConfig;

/* JADX INFO: loaded from: classes11.dex */
public class tzo0 {

    /* JADX INFO: renamed from: a */
    public BLiveAvatarFrameConfig f172744a;

    /* JADX INFO: renamed from: b */
    public int f172745b;

    /* JADX INFO: renamed from: c */
    public String f172746c;

    /* JADX INFO: renamed from: d */
    public BLiveCallEffectConfig f172747d;

    /* JADX INFO: renamed from: e */
    public String f172748e;

    public tzo0(int i, String str, BLiveAvatarFrameConfig bLiveAvatarFrameConfig) {
        this.f172745b = i;
        this.f172746c = str;
        this.f172744a = bLiveAvatarFrameConfig;
        if (i == 1) {
            bLiveAvatarFrameConfig.staticUrl = "";
            bLiveAvatarFrameConfig.dynamicUrl = "";
        }
    }

    /* JADX INFO: renamed from: a */
    public BLiveCallEffectConfig m191211a() {
        return this.f172747d;
    }

    /* JADX INFO: renamed from: b */
    public void m191212b(BLiveCallEffectConfig bLiveCallEffectConfig) {
        if (this.f172745b == 1) {
            this.f172747d = null;
        } else {
            this.f172747d = bLiveCallEffectConfig;
        }
    }
}
