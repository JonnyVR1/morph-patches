package p153l;

import android.media.AudioAttributes;
import android.media.SoundPool;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;

/* JADX INFO: loaded from: classes5.dex */
public class uyl0 extends qct<rwn0> {

    /* JADX INFO: renamed from: i */
    public SoundPool f181632i;

    /* JADX INFO: renamed from: j */
    public int f181633j;

    public uyl0(dum dumVar) {
        super(dumVar);
        m198669L3();
    }

    /* JADX INFO: renamed from: L3 */
    public final void m198669L3() {
        SoundPool.Builder builder = new SoundPool.Builder();
        builder.setMaxStreams(1);
        AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
        builder2.setLegacyStreamType(3);
        builder.setAudioAttributes(builder2.build());
        this.f181632i = builder.build();
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m198670M3(SoundPool soundPool, int i, int i2) {
        if (i2 == 0) {
            this.f181633j = i;
        }
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m198671N3(LongLinkVirtualVoice.VoiceToneMessage voiceToneMessage) {
        m198672O3();
    }

    /* JADX INFO: renamed from: O3 */
    public final void m198672O3() {
        SoundPool soundPool;
        int i = this.f181633j;
        if (i > 0 && (soundPool = this.f181632i) != null) {
            soundPool.play(i, 1.0f, 1.0f, 0, 0, 1.0f);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        this.f181632i.load(zrv.f205803e, vfc0.f183894a, 1);
        this.f181632i.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: l.syl0
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
                this.f171273a.m198670M3(soundPool, i, i2);
            }
        });
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        SoundPool soundPool = this.f181632i;
        if (soundPool != null) {
            soundPool.setOnLoadCompleteListener(null);
            this.f181632i.release();
            this.f181632i = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m113231o2(((rwn0) m213810E2()).m168545q1().m98240M(), false).subscribe(dhw.m115829h(new y20() { // from class: l.tyl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176686a.m198671N3((LongLinkVirtualVoice.VoiceToneMessage) obj);
            }
        }));
    }
}
