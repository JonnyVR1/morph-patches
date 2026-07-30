package p149l;

import android.text.TextUtils;
import com.immomo.moment.mediautils.AudioSpeedControlPlayer;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class rr10 {

    /* JADX INFO: renamed from: a */
    private AudioSpeedControlPlayer f160708a;

    /* JADX INFO: renamed from: b */
    private int f160709b;

    /* JADX INFO: renamed from: c */
    private int f160710c;

    /* JADX INFO: renamed from: d */
    private List<AudioSpeedControlPlayer.OnPlayPositionListener> f160711d;

    /* JADX INFO: renamed from: e */
    private AudioSpeedControlPlayer.OnPreparedListener f160712e;

    /* JADX INFO: renamed from: f */
    private AudioSpeedControlPlayer.OnPlayPositionListener f160713f;

    /* JADX INFO: renamed from: l.rr10$a */
    public class C19761a implements AudioSpeedControlPlayer.OnPreparedListener {
        public C19761a() {
        }

        @Override // com.immomo.moment.mediautils.AudioSpeedControlPlayer.OnPreparedListener
        public void onPrepared(AudioSpeedControlPlayer audioSpeedControlPlayer) {
            if (rr10.this.f160710c >= 0) {
                rr10.this.f160708a.seekPlayTime(rr10.this.f160710c);
                rr10.this.f160710c = -1;
            }
            rr10.this.f160708a.start();
        }
    }

    /* JADX INFO: renamed from: l.rr10$b */
    public class C19762b implements AudioSpeedControlPlayer.OnPlayPositionListener {
        public C19762b() {
        }

        @Override // com.immomo.moment.mediautils.AudioSpeedControlPlayer.OnPlayPositionListener
        public void onPlayPositionListener(AudioSpeedControlPlayer audioSpeedControlPlayer, int i) {
            rr10.this.f160709b = i;
            if (rr10.this.f160711d == null || rr10.this.f160711d.isEmpty()) {
                return;
            }
            for (AudioSpeedControlPlayer.OnPlayPositionListener onPlayPositionListener : rr10.this.f160711d) {
                if (onPlayPositionListener != null) {
                    onPlayPositionListener.onPlayPositionListener(audioSpeedControlPlayer, i);
                }
            }
        }
    }

    public rr10(boolean z) {
        this.f160710c = -1;
        this.f160712e = new C19761a();
        this.f160713f = new C19762b();
        AudioSpeedControlPlayer audioSpeedControlPlayer = new AudioSpeedControlPlayer(z, false);
        this.f160708a = audioSpeedControlPlayer;
        audioSpeedControlPlayer.setOnErrorDotDataListener(new xg50());
        this.f160708a.setOnErrorDotDataListener(new jd50());
        this.f160708a.setOnPreparedListener(this.f160712e);
        this.f160708a.setOnPlayPositionListener(this.f160713f);
    }

    /* JADX INFO: renamed from: f */
    private void m180499f() {
        List<AudioSpeedControlPlayer.OnPlayPositionListener> list = this.f160711d;
        if (list != null) {
            list.clear();
            this.f160711d = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public AudioSpeedControlPlayer m180500g() {
        return this.f160708a;
    }

    /* JADX INFO: renamed from: h */
    public boolean m180501h() {
        AudioSpeedControlPlayer audioSpeedControlPlayer = this.f160708a;
        return audioSpeedControlPlayer != null && audioSpeedControlPlayer.isPlaying();
    }

    /* JADX INFO: renamed from: i */
    public void m180502i() {
        AudioSpeedControlPlayer audioSpeedControlPlayer = this.f160708a;
        if (audioSpeedControlPlayer == null || !audioSpeedControlPlayer.isPlaying()) {
            return;
        }
        this.f160708a.pause();
    }

    /* JADX INFO: renamed from: j */
    public void m180503j() {
        AudioSpeedControlPlayer audioSpeedControlPlayer = this.f160708a;
        if (audioSpeedControlPlayer != null) {
            if (audioSpeedControlPlayer.isPlaying()) {
                this.f160708a.pause();
            }
            this.f160708a.release();
        }
        m180499f();
    }

    /* JADX INFO: renamed from: k */
    public void m180504k() {
        this.f160708a.pause();
        this.f160708a.reset();
    }

    /* JADX INFO: renamed from: l */
    public void m180505l(float f) {
        if (m180501h()) {
            return;
        }
        this.f160708a.setPlaySpeed(f);
        this.f160708a.start();
    }

    /* JADX INFO: renamed from: m */
    public boolean m180506m(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!new File(str).exists()) {
            return true;
        }
        this.f160708a.setDataSource(str);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public void m180507n(AudioSpeedControlPlayer.OnPreparedListener onPreparedListener) {
        this.f160708a.setOnPreparedListener(onPreparedListener);
    }

    /* JADX INFO: renamed from: o */
    public void m180508o(int i) {
        this.f160710c = i;
        if (i >= 0) {
            this.f160708a.seekPlayTime(i);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m180509p(int i, int i2, boolean z, float f) {
        if (m180501h()) {
            m180502i();
            if (!z) {
                m180510q();
            }
        }
        this.f160709b = 0;
        this.f160708a.setPlaySpeed(f);
        this.f160708a.setPlayTimeRange(i, i2);
        AudioSpeedControlPlayer audioSpeedControlPlayer = this.f160708a;
        if (z) {
            audioSpeedControlPlayer.start();
        } else {
            audioSpeedControlPlayer.prepare();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m180510q() {
        this.f160709b = 0;
        AudioSpeedControlPlayer audioSpeedControlPlayer = this.f160708a;
        if (audioSpeedControlPlayer == null || !audioSpeedControlPlayer.isPlaying()) {
            return;
        }
        m180502i();
        this.f160708a.release();
    }

    public rr10() {
        this(false, false);
    }

    public rr10(boolean z, boolean z2) {
        this.f160710c = -1;
        this.f160712e = new C19761a();
        this.f160713f = new C19762b();
        AudioSpeedControlPlayer audioSpeedControlPlayer = new AudioSpeedControlPlayer(z, z2);
        this.f160708a = audioSpeedControlPlayer;
        audioSpeedControlPlayer.setOnErrorDotDataListener(new xg50());
        this.f160708a.setOnErrorDotDataListener(new jd50());
        this.f160708a.setOnPreparedListener(this.f160712e);
        this.f160708a.setOnPlayPositionListener(this.f160713f);
    }
}
