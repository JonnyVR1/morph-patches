package p153l;

import android.media.AudioAttributes;
import android.media.SoundPool;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class icl0 {

    /* JADX INFO: renamed from: a */
    public SoundPool f114415a;

    /* JADX INFO: renamed from: b */
    public int f114416b;

    /* JADX INFO: renamed from: c */
    public int f114417c;

    /* JADX INFO: renamed from: d */
    public boolean f114418d;

    /* JADX INFO: renamed from: b */
    public void m139445b() {
        SoundPool.Builder builder = new SoundPool.Builder();
        builder.setMaxStreams(1);
        AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
        builder2.setLegacyStreamType(3);
        builder.setAudioAttributes(builder2.build());
        SoundPool soundPoolBuild = builder.build();
        this.f114415a = soundPoolBuild;
        soundPoolBuild.load(zrv.f205803e, ufc0.f178749a, 1);
        this.f114415a.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: l.hcl0
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
                this.f108710a.m139446c(soundPool, i, i2);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m139446c(SoundPool soundPool, int i, int i2) {
        if (i2 == 0) {
            this.f114416b = i;
            if (this.f114418d) {
                m139447d();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m139447d() {
        SoundPool soundPool;
        this.f114418d = true;
        nsh0.m164608j("videoChat", "playRingtone:" + this.f114416b);
        int i = this.f114416b;
        if (i > 0 && (soundPool = this.f114415a) != null) {
            this.f114417c = soundPool.play(i, 1.0f, 1.0f, 0, -1, 1.0f);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m139448e() {
        this.f114418d = false;
        nsh0.m164608j("videoChat", "release");
        if (this.f114415a != null) {
            m139449f();
            this.f114415a.setOnLoadCompleteListener(null);
            this.f114415a.release();
            this.f114415a = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m139449f() {
        this.f114418d = false;
        nsh0.m164608j("videoChat", "stopRingtone:" + this.f114417c);
        if (this.f114417c <= 0 || !NullChecker.m82486a(this.f114415a)) {
            return;
        }
        this.f114415a.stop(this.f114417c);
    }
}
