package p009l;

import com.p000p1.mobile.putong.live.livingroom.voice.motion.VoiceLiveMotionType;
import l.bsm;
import l.z9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class lwn0 {

    /* JADX INFO: renamed from: a */
    public final VoiceLiveMotionType f16433a;

    /* JADX INFO: renamed from: b */
    public final z9j<VoiceLiveMotionType, sun0, bsm, b8m, kwn0> f16434b;

    public lwn0(VoiceLiveMotionType voiceLiveMotionType, z9j<VoiceLiveMotionType, sun0, bsm, b8m, kwn0> z9jVar) {
        this.f16433a = voiceLiveMotionType;
        this.f16434b = z9jVar;
    }

    /* JADX INFO: renamed from: a */
    public kwn0 m18068a(sun0 sun0Var, bsm bsmVar, b8m b8mVar) {
        return (kwn0) this.f16434b.b(this.f16433a, sun0Var, bsmVar, b8mVar);
    }

    /* JADX INFO: renamed from: b */
    public boolean m18069b(VoiceLiveMotionType voiceLiveMotionType) {
        VoiceLiveMotionType voiceLiveMotionType2 = this.f16433a;
        return voiceLiveMotionType2 != null && voiceLiveMotionType2 == voiceLiveMotionType;
    }
}
