package p149l;

import android.media.MediaPlayer;
import android.net.Uri;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes11.dex */
public class l680 implements c680 {

    /* JADX INFO: renamed from: a */
    public MediaPlayer f126236a;

    /* JADX INFO: renamed from: b */
    public c680.InterfaceC16083a f126237b;

    /* JADX INFO: renamed from: c */
    public boolean f126238c;

    /* JADX INFO: renamed from: d */
    public boolean f126239d;

    /* JADX INFO: renamed from: g */
    public String f126242g;

    /* JADX INFO: renamed from: j */
    public d30 f126245j;

    /* JADX INFO: renamed from: k */
    public MediaPlayer.OnSeekCompleteListener f126246k;

    /* JADX INFO: renamed from: e */
    public boolean f126240e = false;

    /* JADX INFO: renamed from: f */
    public String f126241f = "";

    /* JADX INFO: renamed from: h */
    public long f126243h = -1;

    /* JADX INFO: renamed from: i */
    public long f126244i = -1;

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m148702l(Throwable th) {
    }

    @Override // p149l.c680
    /* JADX INFO: renamed from: a */
    public void mo105366a(String str) {
        this.f126242g = str;
    }

    @Override // p149l.c680
    /* JADX INFO: renamed from: b */
    public void mo105367b() {
        MediaPlayer mediaPlayer = this.f126236a;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(0.0f, 0.0f);
            this.f126240e = true;
        }
    }

    @Override // p149l.c680
    /* JADX INFO: renamed from: c */
    public void mo105368c() {
        MediaPlayer mediaPlayer;
        if (this.f126237b == null || (mediaPlayer = this.f126236a) == null || !mediaPlayer.isPlaying()) {
            return;
        }
        this.f126237b.mo44051b(this.f126236a.getCurrentPosition());
    }

    @Override // p149l.c680
    /* JADX INFO: renamed from: d */
    public void mo105369d(c680.InterfaceC16083a interfaceC16083a, boolean z) {
        if (interfaceC16083a == null || interfaceC16083a.mo44055f() == null || interfaceC16083a.getSurface() == null) {
            return;
        }
        String aspectRatio = interfaceC16083a.mo44055f().formatAspectRatio() != null ? interfaceC16083a.mo44055f().formatAspectRatio() : "";
        this.f126241f = aspectRatio;
        if (aspectRatio.startsWith("http") && !Network.isConnected(App.f15369e)) {
            lsi0.m151584n(R$string.f17321F);
            interfaceC16083a.mo44053d();
            return;
        }
        this.f126238c = false;
        c680.InterfaceC16083a interfaceC16083a2 = this.f126237b;
        if (interfaceC16083a2 != interfaceC16083a) {
            if (interfaceC16083a2 != null) {
                interfaceC16083a2.mo44054e();
            }
            this.f126237b = interfaceC16083a;
            m148704n();
        } else if (this.f126236a == null) {
            m148704n();
        } else if (this.f126239d) {
            interfaceC16083a.onResume();
            this.f126236a.start();
        } else {
            interfaceC16083a.mo44052c();
        }
        this.f126243h = System.currentTimeMillis();
        if (z) {
            return;
        }
        x1l0.m206744n().m206748I(this.f126241f);
        x1l0.m206744n().m206751q(this.f126241f).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.f680
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f95238a.m148709s((Integer) obj);
            }
        }, new e30() { // from class: l.g680
            @Override // p149l.e30
            public final void call(Object obj) {
                l680.m148702l((Throwable) obj);
            }
        }));
    }

    @Override // p149l.c680
    /* JADX INFO: renamed from: e */
    public boolean mo105370e() {
        return this.f126240e;
    }

    /* JADX INFO: renamed from: m */
    public final void m148703m() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f126236a = mediaPlayer;
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: l.h680
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                this.f106012a.m148705o(mediaPlayer2);
            }
        });
        this.f126236a.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: l.i680
            @Override // android.media.MediaPlayer.OnInfoListener
            public final boolean onInfo(MediaPlayer mediaPlayer2, int i, int i2) {
                return this.f111685a.m148706p(mediaPlayer2, i, i2);
            }
        });
        this.f126236a.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: l.j680
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                return this.f116394a.m148707q(mediaPlayer2, i, i2);
            }
        });
        this.f126236a.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: l.k680
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                this.f121271a.m148708r(mediaPlayer2);
            }
        });
        MediaPlayer.OnSeekCompleteListener onSeekCompleteListener = this.f126246k;
        if (onSeekCompleteListener != null) {
            this.f126236a.setOnSeekCompleteListener(onSeekCompleteListener);
        }
    }

    @Override // p149l.c680
    public void mute(boolean z) {
        MediaPlayer mediaPlayer = this.f126236a;
        if (mediaPlayer == null) {
            return;
        }
        this.f126240e = z;
        if (z) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m148704n() {
        c680.InterfaceC16083a interfaceC16083a = this.f126237b;
        if (interfaceC16083a != null) {
            interfaceC16083a.mo44052c();
        }
        m148713w(false);
        try {
            m148703m();
            this.f126236a.setDataSource(Uri.parse(qib0.m174812d0(this.f126237b.mo44055f().formatAspectRatio())).toString());
            this.f126236a.prepareAsync();
            this.f126236a.setSurface(this.f126237b.getSurface());
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            c680.InterfaceC16083a interfaceC16083a2 = this.f126237b;
            if (interfaceC16083a2 != null) {
                interfaceC16083a2.mo44050a(new IllegalStateException("Failed to prepare media player", e));
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m148705o(MediaPlayer mediaPlayer) {
        this.f126239d = true;
        if (this.f126238c) {
            return;
        }
        mediaPlayer.start();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ boolean m148706p(MediaPlayer mediaPlayer, int i, int i2) {
        c680.InterfaceC16083a interfaceC16083a;
        c680.InterfaceC16083a interfaceC16083a2;
        if (i == 3) {
            if (!this.f126238c && (interfaceC16083a = this.f126237b) != null) {
                interfaceC16083a.onStart();
                this.f126237b.onResume();
                fyx.m123809c(this.f126243h, System.currentTimeMillis(), this.f126241f, fyx.f99915b);
            }
            return true;
        }
        if (i == 701) {
            c680.InterfaceC16083a interfaceC16083a3 = this.f126237b;
            if (interfaceC16083a3 != null) {
                interfaceC16083a3.mo44052c();
            }
            this.f126244i = System.currentTimeMillis();
            return true;
        }
        if (i != 702) {
            return false;
        }
        if (!this.f126238c && (interfaceC16083a2 = this.f126237b) != null) {
            interfaceC16083a2.onResume();
        }
        if (this.f126244i != -1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.f126244i;
            if (j < 200) {
                return true;
            }
            TrackMediaUploadUtil.m80310h0(j, this.f126242g, this.f126241f);
            fyx.m123808b(this.f126244i, jCurrentTimeMillis, this.f126241f, fyx.f99915b);
            this.f126244i = -1L;
        }
        return true;
    }

    @Override // p149l.c680
    public void pause() {
        this.f126238c = true;
        c680.InterfaceC16083a interfaceC16083a = this.f126237b;
        if (interfaceC16083a != null) {
            interfaceC16083a.onPause();
        }
        MediaPlayer mediaPlayer = this.f126236a;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            return;
        }
        this.f126236a.pause();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ boolean m148707q(MediaPlayer mediaPlayer, int i, int i2) {
        String str;
        boolean z = !Network.isConnected(App.f15369e);
        this.f126239d = false;
        if (i == 1 && i2 == Integer.MIN_VALUE && (str = this.f126241f) != null && str.startsWith("http")) {
            lsi0.m151584n(R$string.f17321F);
        }
        c680.InterfaceC16083a interfaceC16083a = this.f126237b;
        if (interfaceC16083a != null) {
            interfaceC16083a.mo44050a(new IllegalStateException());
        }
        fyx.m123811e(i, i2, z, this.f126241f, fyx.f99915b);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m148708r(MediaPlayer mediaPlayer) {
        c680.InterfaceC16083a interfaceC16083a = this.f126237b;
        if (interfaceC16083a != null) {
            interfaceC16083a.mo44053d();
            this.f126237b.onComplete();
        }
        d30 d30Var = this.f126245j;
        if (d30Var != null) {
            d30Var.call();
        }
        mediaPlayer.seekTo(0);
    }

    @Override // p149l.c680
    public void release() {
        m148713w(false);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m148709s(Integer num) {
        fyx.m123810d(this.f126243h, num.intValue(), this.f126241f, fyx.f99915b);
    }

    @Override // p149l.c680
    public void stop() {
        m148713w(true);
    }

    /* JADX INFO: renamed from: t */
    public void m148710t(int i) {
        MediaPlayer mediaPlayer = this.f126236a;
        if (mediaPlayer == null || !this.f126239d) {
            return;
        }
        mediaPlayer.seekTo(i);
    }

    /* JADX INFO: renamed from: u */
    public void m148711u(d30 d30Var) {
        this.f126245j = d30Var;
    }

    /* JADX INFO: renamed from: v */
    public void m148712v(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        this.f126246k = onSeekCompleteListener;
    }

    /* JADX INFO: renamed from: w */
    public final void m148713w(boolean z) {
        c680.InterfaceC16083a interfaceC16083a;
        if (z && (interfaceC16083a = this.f126237b) != null) {
            interfaceC16083a.mo44053d();
        }
        this.f126238c = false;
        MediaPlayer mediaPlayer = this.f126236a;
        if (mediaPlayer != null) {
            if (this.f126239d) {
                mediaPlayer.stop();
            }
            this.f126236a.release();
            this.f126236a = null;
            this.f126239d = false;
        }
    }

    @Override // p149l.c680
    /* JADX INFO: renamed from: f */
    public void mo105371f(boolean z) {
    }

    @Override // p149l.c680
    public void resume() {
    }
}
