package p149l;

import android.view.Choreographer;
import com.p046p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveMaskAvatarConfig;
import com.p046p1.mobile.putong.live.base.view.CircularProgressView;

/* JADX INFO: loaded from: classes5.dex */
public class c45 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public CircularProgressView f79153a;

    /* JADX INFO: renamed from: b */
    public BLiveMaskAvatarConfig f79154b;

    public c45(CircularProgressView circularProgressView) {
        this.f79153a = circularProgressView;
    }

    /* JADX INFO: renamed from: a */
    public void m105201a() {
        this.f79153a.clearAnimation();
        xdl0.m208344M(this.f79153a, false);
    }

    /* JADX INFO: renamed from: b */
    public void m105202b() {
        m105201a();
        Choreographer.getInstance().removeFrameCallback(this);
    }

    /* JADX INFO: renamed from: c */
    public void m105203c(float f) {
        if (!xdl0.m208349O0(this.f79153a)) {
            xdl0.m208344M(this.f79153a, true);
        }
        this.f79153a.setProgress(f);
    }

    /* JADX INFO: renamed from: d */
    public void m105204d(BLiveMaskAvatarConfig bLiveMaskAvatarConfig) {
        this.f79154b = bLiveMaskAvatarConfig;
        doFrame(System.nanoTime());
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        BLiveMaskAvatarConfig bLiveMaskAvatarConfig = this.f79154b;
        if (bLiveMaskAvatarConfig == null || this.f79153a == null) {
            m105201a();
            return;
        }
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig = bLiveMaskAvatarConfig.frameConfig;
        if (!bLiveAvatarFrameConfig.checkNeedChangeVoice()) {
            m105201a();
            return;
        }
        float currentProgress = bLiveAvatarFrameConfig.getCurrentProgress();
        if (currentProgress <= 0.0f) {
            m105201a();
            return;
        }
        m105203c(currentProgress);
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: e */
    public void m105205e(mqv<i54> mqvVar) {
        if (hxn0.m133350c(mqvVar).m133353d()) {
            m105204d(hxn0.m133350c(mqvVar).f109896b.avatarConfig);
        }
    }
}
