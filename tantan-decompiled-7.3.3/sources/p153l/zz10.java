package p153l;

import android.text.TextUtils;
import com.immomo.moment.mediautils.AudioSpeedControlPlayer;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class zz10 {

    /* JADX INFO: renamed from: a */
    private AudioSpeedControlPlayer f206660a;

    /* JADX INFO: renamed from: b */
    private int f206661b;

    /* JADX INFO: renamed from: c */
    private int f206662c;

    /* JADX INFO: renamed from: d */
    private List<AudioSpeedControlPlayer.OnPlayPositionListener> f206663d;

    /* JADX INFO: renamed from: e */
    private AudioSpeedControlPlayer.OnPreparedListener f206664e;

    /* JADX INFO: renamed from: f */
    private AudioSpeedControlPlayer.OnPlayPositionListener f206665f;

    /* JADX INFO: renamed from: l.zz10$a */
    public class C21943a implements AudioSpeedControlPlayer.OnPreparedListener {
        public C21943a() {
        }

        @Override // com.immomo.moment.mediautils.AudioSpeedControlPlayer.OnPreparedListener
        public void onPrepared(AudioSpeedControlPlayer audioSpeedControlPlayer) {
            if (zz10.this.f206662c >= 0) {
                zz10.this.f206660a.seekPlayTime(zz10.this.f206662c);
                zz10.this.f206662c = -1;
            }
            zz10.this.f206660a.start();
        }
    }

    /* JADX INFO: renamed from: l.zz10$b */
    public class C21944b implements AudioSpeedControlPlayer.OnPlayPositionListener {
        public C21944b() {
        }

        @Override // com.immomo.moment.mediautils.AudioSpeedControlPlayer.OnPlayPositionListener
        public void onPlayPositionListener(AudioSpeedControlPlayer audioSpeedControlPlayer, int i) {
            zz10.this.f206661b = i;
            if (zz10.this.f206663d == null || zz10.this.f206663d.isEmpty()) {
                return;
            }
            for (AudioSpeedControlPlayer.OnPlayPositionListener onPlayPositionListener : zz10.this.f206663d) {
                if (onPlayPositionListener != null) {
                    onPlayPositionListener.onPlayPositionListener(audioSpeedControlPlayer, i);
                }
            }
        }
    }

    public zz10(boolean z) {
        this.f206662c = -1;
        this.f206664e = new C21943a();
        this.f206665f = new C21944b();
        AudioSpeedControlPlayer audioSpeedControlPlayer = new AudioSpeedControlPlayer(z, false);
        this.f206660a = audioSpeedControlPlayer;
        audioSpeedControlPlayer.setOnErrorDotDataListener(new dp50());
        this.f206660a.setOnErrorDotDataListener(new ql50());
        this.f206660a.setOnPreparedListener(this.f206664e);
        this.f206660a.setOnPlayPositionListener(this.f206665f);
    }

    /* JADX INFO: renamed from: f */
    private void m222219f() {
        List<AudioSpeedControlPlayer.OnPlayPositionListener> list = this.f206663d;
        if (list != null) {
            list.clear();
            this.f206663d = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public AudioSpeedControlPlayer m222220g() {
        return this.f206660a;
    }

    /* JADX INFO: renamed from: h */
    public boolean m222221h() {
        AudioSpeedControlPlayer audioSpeedControlPlayer = this.f206660a;
        return audioSpeedControlPlayer != null && audioSpeedControlPlayer.isPlaying();
    }

    /* JADX INFO: renamed from: i */
    public void m222222i() {
        AudioSpeedControlPlayer audioSpeedControlPlayer = this.f206660a;
        if (audioSpeedControlPlayer == null || !audioSpeedControlPlayer.isPlaying()) {
            return;
        }
        this.f206660a.pause();
    }

    /* JADX INFO: renamed from: j */
    public void m222223j() {
        AudioSpeedControlPlayer audioSpeedControlPlayer = this.f206660a;
        if (audioSpeedControlPlayer != null) {
            if (audioSpeedControlPlayer.isPlaying()) {
                this.f206660a.pause();
            }
            this.f206660a.release();
        }
        m222219f();
    }

    /* JADX INFO: renamed from: k */
    public void m222224k() {
        this.f206660a.pause();
        this.f206660a.reset();
    }

    /* JADX INFO: renamed from: l */
    public void m222225l(float f) {
        if (m222221h()) {
            return;
        }
        this.f206660a.setPlaySpeed(f);
        this.f206660a.start();
    }

    /* JADX INFO: renamed from: m */
    public boolean m222226m(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!new File(str).exists()) {
            return true;
        }
        this.f206660a.setDataSource(str);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public void m222227n(AudioSpeedControlPlayer.OnPreparedListener onPreparedListener) {
        this.f206660a.setOnPreparedListener(onPreparedListener);
    }

    /* JADX INFO: renamed from: o */
    public void m222228o(int i) {
        this.f206662c = i;
        if (i >= 0) {
            this.f206660a.seekPlayTime(i);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m222229p(int i, int i2, boolean z, float f) {
        if (m222221h()) {
            m222222i();
            if (!z) {
                m222230q();
            }
        }
        this.f206661b = 0;
        this.f206660a.setPlaySpeed(f);
        this.f206660a.setPlayTimeRange(i, i2);
        AudioSpeedControlPlayer audioSpeedControlPlayer = this.f206660a;
        if (z) {
            audioSpeedControlPlayer.start();
        } else {
            audioSpeedControlPlayer.prepare();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m222230q() {
        this.f206661b = 0;
        AudioSpeedControlPlayer audioSpeedControlPlayer = this.f206660a;
        if (audioSpeedControlPlayer == null || !audioSpeedControlPlayer.isPlaying()) {
            return;
        }
        m222222i();
        this.f206660a.release();
    }

    public zz10() {
        this(false, false);
    }

    public zz10(boolean z, boolean z2) {
        this.f206662c = -1;
        this.f206664e = new C21943a();
        this.f206665f = new C21944b();
        AudioSpeedControlPlayer audioSpeedControlPlayer = new AudioSpeedControlPlayer(z, z2);
        this.f206660a = audioSpeedControlPlayer;
        audioSpeedControlPlayer.setOnErrorDotDataListener(new dp50());
        this.f206660a.setOnErrorDotDataListener(new ql50());
        this.f206660a.setOnPreparedListener(this.f206664e);
        this.f206660a.setOnPlayPositionListener(this.f206665f);
    }
}
