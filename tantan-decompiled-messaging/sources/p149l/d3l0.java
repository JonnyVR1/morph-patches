package p149l;

import android.media.AudioAttributes;
import android.media.SoundPool;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class d3l0 {

    /* JADX INFO: renamed from: a */
    public SoundPool f84233a;

    /* JADX INFO: renamed from: b */
    public int f84234b;

    /* JADX INFO: renamed from: c */
    public int f84235c;

    /* JADX INFO: renamed from: d */
    public boolean f84236d;

    /* JADX INFO: renamed from: b */
    public void m109936b() {
        SoundPool.Builder builder = new SoundPool.Builder();
        builder.setMaxStreams(1);
        AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
        builder2.setLegacyStreamType(3);
        builder.setAudioAttributes(builder2.build());
        SoundPool soundPoolBuild = builder.build();
        this.f84233a = soundPoolBuild;
        soundPoolBuild.load(ypv.f199497e, q7c0.f153029a, 1);
        this.f84233a.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: l.c3l0
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
                this.f79016a.m109937c(soundPool, i, i2);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m109937c(SoundPool soundPool, int i, int i2) {
        if (i2 == 0) {
            this.f84234b = i;
            if (this.f84236d) {
                m109938d();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m109938d() {
        SoundPool soundPool;
        this.f84236d = true;
        gkh0.m126627j("videoChat", "playRingtone:" + this.f84234b);
        int i = this.f84234b;
        if (i > 0 && (soundPool = this.f84233a) != null) {
            this.f84235c = soundPool.play(i, 1.0f, 1.0f, 0, -1, 1.0f);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m109939e() {
        this.f84236d = false;
        gkh0.m126627j("videoChat", "release");
        if (this.f84233a != null) {
            m109940f();
            this.f84233a.setOnLoadCompleteListener(null);
            this.f84233a.release();
            this.f84233a = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m109940f() {
        this.f84236d = false;
        gkh0.m126627j("videoChat", "stopRingtone:" + this.f84235c);
        if (this.f84235c <= 0 || !NullChecker.m81303a(this.f84233a)) {
            return;
        }
        this.f84233a.stop(this.f84235c);
    }
}
