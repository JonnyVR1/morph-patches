package p149l;

import android.media.AudioAttributes;
import android.media.SoundPool;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;

/* JADX INFO: loaded from: classes5.dex */
public class qpl0 extends pat<nnn0> {

    /* JADX INFO: renamed from: i */
    public SoundPool f155779i;

    /* JADX INFO: renamed from: j */
    public int f155780j;

    public qpl0(bsm bsmVar) {
        super(bsmVar);
        m175850L3();
    }

    /* JADX INFO: renamed from: L3 */
    public final void m175850L3() {
        SoundPool.Builder builder = new SoundPool.Builder();
        builder.setMaxStreams(1);
        AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
        builder2.setLegacyStreamType(3);
        builder.setAudioAttributes(builder2.build());
        this.f155779i = builder.build();
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m175851M3(SoundPool soundPool, int i, int i2) {
        if (i2 == 0) {
            this.f155780j = i;
        }
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m175852N3(LongLinkVirtualVoice.VoiceToneMessage voiceToneMessage) {
        m175853O3();
    }

    /* JADX INFO: renamed from: O3 */
    public final void m175853O3() {
        SoundPool soundPool;
        int i = this.f155780j;
        if (i > 0 && (soundPool = this.f155779i) != null) {
            soundPool.play(i, 1.0f, 1.0f, 0, 0, 1.0f);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        this.f155779i.load(ypv.f199497e, r7c0.f158021a, 1);
        this.f155779i.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: l.opl0
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
                this.f145013a.m175851M3(soundPool, i, i2);
            }
        });
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        SoundPool soundPool = this.f155779i;
        if (soundPool != null) {
            soundPool.setOnLoadCompleteListener(null);
            this.f155779i.release();
            this.f155779i = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m104250o2(((nnn0) m206027E2()).m132160q1().m189058M(), false).subscribe(ffw.m121197h(new e30() { // from class: l.ppl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150663a.m175852N3((LongLinkVirtualVoice.VoiceToneMessage) obj);
            }
        }));
    }
}
