package p009l;

import com.p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p1.mobile.putong.live.base.data.BLiveCallEffectConfig;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class tzo0 {

    /* JADX INFO: renamed from: a */
    public BLiveAvatarFrameConfig f20937a;

    /* JADX INFO: renamed from: b */
    public int f20938b;

    /* JADX INFO: renamed from: c */
    public String f20939c;

    /* JADX INFO: renamed from: d */
    public BLiveCallEffectConfig f20940d;

    /* JADX INFO: renamed from: e */
    public String f20941e;

    public tzo0(int i, String str, BLiveAvatarFrameConfig bLiveAvatarFrameConfig) {
        this.f20938b = i;
        this.f20939c = str;
        this.f20937a = bLiveAvatarFrameConfig;
        if (i == 1) {
            bLiveAvatarFrameConfig.staticUrl = "";
            bLiveAvatarFrameConfig.dynamicUrl = "";
        }
    }

    /* JADX INFO: renamed from: a */
    public BLiveCallEffectConfig m22712a() {
        return this.f20940d;
    }

    /* JADX INFO: renamed from: b */
    public void m22713b(BLiveCallEffectConfig bLiveCallEffectConfig) {
        if (this.f20938b == 1) {
            this.f20940d = null;
        } else {
            this.f20940d = bLiveCallEffectConfig;
        }
    }
}
