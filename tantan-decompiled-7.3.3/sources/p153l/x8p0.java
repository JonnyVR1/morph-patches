package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveCallEffectConfig;

/* JADX INFO: loaded from: classes10.dex */
public class x8p0 {

    /* JADX INFO: renamed from: a */
    public BLiveAvatarFrameConfig f192860a;

    /* JADX INFO: renamed from: b */
    public int f192861b;

    /* JADX INFO: renamed from: c */
    public String f192862c;

    /* JADX INFO: renamed from: d */
    public BLiveCallEffectConfig f192863d;

    /* JADX INFO: renamed from: e */
    public String f192864e;

    public x8p0(int i, String str, BLiveAvatarFrameConfig bLiveAvatarFrameConfig) {
        this.f192861b = i;
        this.f192862c = str;
        this.f192860a = bLiveAvatarFrameConfig;
        if (i == 1) {
            bLiveAvatarFrameConfig.staticUrl = "";
            bLiveAvatarFrameConfig.dynamicUrl = "";
        }
    }

    /* JADX INFO: renamed from: a */
    public BLiveCallEffectConfig m209750a() {
        return this.f192863d;
    }

    /* JADX INFO: renamed from: b */
    public void m209751b(BLiveCallEffectConfig bLiveCallEffectConfig) {
        if (this.f192861b == 1) {
            this.f192863d = null;
        } else {
            this.f192863d = bLiveCallEffectConfig;
        }
    }
}
