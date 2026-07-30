package p153l;

import com.p051p1.mobile.putong.live.livingroom.voice.motion.VoiceLiveMotionType;

/* JADX INFO: loaded from: classes10.dex */
public class p5o0 {

    /* JADX INFO: renamed from: a */
    public final VoiceLiveMotionType f150666a;

    /* JADX INFO: renamed from: b */
    public final tcj<VoiceLiveMotionType, w3o0, dum, ram, o5o0> f150667b;

    public p5o0(VoiceLiveMotionType voiceLiveMotionType, tcj<VoiceLiveMotionType, w3o0, dum, ram, o5o0> tcjVar) {
        this.f150666a = voiceLiveMotionType;
        this.f150667b = tcjVar;
    }

    /* JADX INFO: renamed from: a */
    public o5o0 m170676a(w3o0 w3o0Var, dum dumVar, ram ramVar) {
        return this.f150667b.mo112959b(this.f150666a, w3o0Var, dumVar, ramVar);
    }

    /* JADX INFO: renamed from: b */
    public boolean m170677b(VoiceLiveMotionType voiceLiveMotionType) {
        VoiceLiveMotionType voiceLiveMotionType2 = this.f150666a;
        return voiceLiveMotionType2 != null && voiceLiveMotionType2 == voiceLiveMotionType;
    }
}
