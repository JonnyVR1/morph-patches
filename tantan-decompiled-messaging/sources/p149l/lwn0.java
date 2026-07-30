package p149l;

import com.p046p1.mobile.putong.live.livingroom.voice.motion.VoiceLiveMotionType;

/* JADX INFO: loaded from: classes11.dex */
public class lwn0 {

    /* JADX INFO: renamed from: a */
    public final VoiceLiveMotionType f130279a;

    /* JADX INFO: renamed from: b */
    public final z9j<VoiceLiveMotionType, sun0, bsm, b8m, kwn0> f130280b;

    public lwn0(VoiceLiveMotionType voiceLiveMotionType, z9j<VoiceLiveMotionType, sun0, bsm, b8m, kwn0> z9jVar) {
        this.f130279a = voiceLiveMotionType;
        this.f130280b = z9jVar;
    }

    /* JADX INFO: renamed from: a */
    public kwn0 m151980a(sun0 sun0Var, bsm bsmVar, b8m b8mVar) {
        return this.f130280b.mo100621b(this.f130279a, sun0Var, bsmVar, b8mVar);
    }

    /* JADX INFO: renamed from: b */
    public boolean m151981b(VoiceLiveMotionType voiceLiveMotionType) {
        VoiceLiveMotionType voiceLiveMotionType2 = this.f130279a;
        return voiceLiveMotionType2 != null && voiceLiveMotionType2 == voiceLiveMotionType;
    }
}
