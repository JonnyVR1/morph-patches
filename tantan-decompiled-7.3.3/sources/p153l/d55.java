package p153l;

import android.view.Choreographer;
import com.p051p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveMaskAvatarConfig;
import com.p051p1.mobile.putong.live.base.view.CircularProgressView;

/* JADX INFO: loaded from: classes5.dex */
public class d55 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public CircularProgressView f85100a;

    /* JADX INFO: renamed from: b */
    public BLiveMaskAvatarConfig f85101b;

    public d55(CircularProgressView circularProgressView) {
        this.f85100a = circularProgressView;
    }

    /* JADX INFO: renamed from: a */
    public void m114257a() {
        this.f85100a.clearAnimation();
        bnl0.m105524M(this.f85100a, false);
    }

    /* JADX INFO: renamed from: b */
    public void m114258b() {
        m114257a();
        Choreographer.getInstance().removeFrameCallback(this);
    }

    /* JADX INFO: renamed from: c */
    public void m114259c(float f) {
        if (!bnl0.m105529O0(this.f85100a)) {
            bnl0.m105524M(this.f85100a, true);
        }
        this.f85100a.setProgress(f);
    }

    /* JADX INFO: renamed from: d */
    public void m114260d(BLiveMaskAvatarConfig bLiveMaskAvatarConfig) {
        this.f85101b = bLiveMaskAvatarConfig;
        doFrame(System.nanoTime());
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        BLiveMaskAvatarConfig bLiveMaskAvatarConfig = this.f85101b;
        if (bLiveMaskAvatarConfig == null || this.f85100a == null) {
            m114257a();
            return;
        }
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig = bLiveMaskAvatarConfig.frameConfig;
        if (!bLiveAvatarFrameConfig.checkNeedChangeVoice()) {
            m114257a();
            return;
        }
        float currentProgress = bLiveAvatarFrameConfig.getCurrentProgress();
        if (currentProgress <= 0.0f) {
            m114257a();
            return;
        }
        m114259c(currentProgress);
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: e */
    public void m114261e(nsv<h64> nsvVar) {
        if (l6o0.m153068c(nsvVar).m153071d()) {
            m114260d(l6o0.m153068c(nsvVar).f130275b.avatarConfig);
        }
    }
}
