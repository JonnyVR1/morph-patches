package p153l;

import android.media.MediaPlayer;
import android.net.Uri;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes10.dex */
public class re80 implements ie80 {

    /* JADX INFO: renamed from: a */
    public MediaPlayer f162402a;

    /* JADX INFO: renamed from: b */
    public ie80.InterfaceC17709a f162403b;

    /* JADX INFO: renamed from: c */
    public boolean f162404c;

    /* JADX INFO: renamed from: d */
    public boolean f162405d;

    /* JADX INFO: renamed from: g */
    public String f162408g;

    /* JADX INFO: renamed from: j */
    public x20 f162411j;

    /* JADX INFO: renamed from: k */
    public MediaPlayer.OnSeekCompleteListener f162412k;

    /* JADX INFO: renamed from: e */
    public boolean f162406e = false;

    /* JADX INFO: renamed from: f */
    public String f162407f = "";

    /* JADX INFO: renamed from: h */
    public long f162409h = -1;

    /* JADX INFO: renamed from: i */
    public long f162410i = -1;

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m180975l(Throwable th) {
    }

    @Override // p153l.ie80
    /* JADX INFO: renamed from: a */
    public void mo139591a(String str) {
        this.f162408g = str;
    }

    @Override // p153l.ie80
    /* JADX INFO: renamed from: b */
    public void mo139592b() {
        MediaPlayer mediaPlayer = this.f162402a;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(0.0f, 0.0f);
            this.f162406e = true;
        }
    }

    @Override // p153l.ie80
    /* JADX INFO: renamed from: c */
    public void mo139593c() {
        MediaPlayer mediaPlayer;
        if (this.f162403b == null || (mediaPlayer = this.f162402a) == null || !mediaPlayer.isPlaying()) {
            return;
        }
        this.f162403b.mo45234b(this.f162402a.getCurrentPosition());
    }

    @Override // p153l.ie80
    /* JADX INFO: renamed from: d */
    public void mo139594d(ie80.InterfaceC17709a interfaceC17709a, boolean z) {
        if (interfaceC17709a == null || interfaceC17709a.mo45238f() == null || interfaceC17709a.getSurface() == null) {
            return;
        }
        String aspectRatio = interfaceC17709a.mo45238f().formatAspectRatio() != null ? interfaceC17709a.mo45238f().formatAspectRatio() : "";
        this.f162407f = aspectRatio;
        if (aspectRatio.startsWith("http") && !Network.isConnected(App.f16088e)) {
            o1j0.m165640n(R$string.f18040F);
            interfaceC17709a.mo45236d();
            return;
        }
        this.f162404c = false;
        ie80.InterfaceC17709a interfaceC17709a2 = this.f162403b;
        if (interfaceC17709a2 != interfaceC17709a) {
            if (interfaceC17709a2 != null) {
                interfaceC17709a2.mo45237e();
            }
            this.f162403b = interfaceC17709a;
            m180977n();
        } else if (this.f162402a == null) {
            m180977n();
        } else if (this.f162405d) {
            interfaceC17709a.onResume();
            this.f162402a.start();
        } else {
            interfaceC17709a.mo45235c();
        }
        this.f162409h = System.currentTimeMillis();
        if (z) {
            return;
        }
        cbl0.m108642n().m108646I(this.f162407f);
        cbl0.m108642n().m108649q(this.f162407f).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.le80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131720a.m180982s((Integer) obj);
            }
        }, new y20() { // from class: l.me80
            @Override // p153l.y20
            public final void call(Object obj) {
                re80.m180975l((Throwable) obj);
            }
        }));
    }

    @Override // p153l.ie80
    /* JADX INFO: renamed from: e */
    public boolean mo139595e() {
        return this.f162406e;
    }

    /* JADX INFO: renamed from: m */
    public final void m180976m() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f162402a = mediaPlayer;
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: l.ne80
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                this.f141577a.m180978o(mediaPlayer2);
            }
        });
        this.f162402a.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: l.oe80
            @Override // android.media.MediaPlayer.OnInfoListener
            public final boolean onInfo(MediaPlayer mediaPlayer2, int i, int i2) {
                return this.f146976a.m180979p(mediaPlayer2, i, i2);
            }
        });
        this.f162402a.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: l.pe80
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                return this.f151879a.m180980q(mediaPlayer2, i, i2);
            }
        });
        this.f162402a.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: l.qe80
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                this.f156798a.m180981r(mediaPlayer2);
            }
        });
        MediaPlayer.OnSeekCompleteListener onSeekCompleteListener = this.f162412k;
        if (onSeekCompleteListener != null) {
            this.f162402a.setOnSeekCompleteListener(onSeekCompleteListener);
        }
    }

    @Override // p153l.ie80
    public void mute(boolean z) {
        MediaPlayer mediaPlayer = this.f162402a;
        if (mediaPlayer == null) {
            return;
        }
        this.f162406e = z;
        if (z) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m180977n() {
        ie80.InterfaceC17709a interfaceC17709a = this.f162403b;
        if (interfaceC17709a != null) {
            interfaceC17709a.mo45235c();
        }
        m180986w(false);
        try {
            m180976m();
            this.f162402a.setDataSource(Uri.parse(uqb0.m197266d0(this.f162403b.mo45238f().formatAspectRatio())).toString());
            this.f162402a.prepareAsync();
            this.f162402a.setSurface(this.f162403b.getSurface());
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            ie80.InterfaceC17709a interfaceC17709a2 = this.f162403b;
            if (interfaceC17709a2 != null) {
                interfaceC17709a2.mo45233a(new IllegalStateException("Failed to prepare media player", e));
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m180978o(MediaPlayer mediaPlayer) {
        this.f162405d = true;
        if (this.f162404c) {
            return;
        }
        mediaPlayer.start();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ boolean m180979p(MediaPlayer mediaPlayer, int i, int i2) {
        ie80.InterfaceC17709a interfaceC17709a;
        ie80.InterfaceC17709a interfaceC17709a2;
        if (i == 3) {
            if (!this.f162404c && (interfaceC17709a = this.f162403b) != null) {
                interfaceC17709a.onStart();
                this.f162403b.onResume();
                c7y.m108344c(this.f162409h, System.currentTimeMillis(), this.f162407f, c7y.f80161b);
            }
            return true;
        }
        if (i == 701) {
            ie80.InterfaceC17709a interfaceC17709a3 = this.f162403b;
            if (interfaceC17709a3 != null) {
                interfaceC17709a3.mo45235c();
            }
            this.f162410i = System.currentTimeMillis();
            return true;
        }
        if (i != 702) {
            return false;
        }
        if (!this.f162404c && (interfaceC17709a2 = this.f162403b) != null) {
            interfaceC17709a2.onResume();
        }
        if (this.f162410i != -1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.f162410i;
            if (j < 200) {
                return true;
            }
            TrackMediaUploadUtil.m81493h0(j, this.f162408g, this.f162407f);
            c7y.m108343b(this.f162410i, jCurrentTimeMillis, this.f162407f, c7y.f80161b);
            this.f162410i = -1L;
        }
        return true;
    }

    @Override // p153l.ie80
    public void pause() {
        this.f162404c = true;
        ie80.InterfaceC17709a interfaceC17709a = this.f162403b;
        if (interfaceC17709a != null) {
            interfaceC17709a.onPause();
        }
        MediaPlayer mediaPlayer = this.f162402a;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            return;
        }
        this.f162402a.pause();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ boolean m180980q(MediaPlayer mediaPlayer, int i, int i2) {
        String str;
        boolean z = !Network.isConnected(App.f16088e);
        this.f162405d = false;
        if (i == 1 && i2 == Integer.MIN_VALUE && (str = this.f162407f) != null && str.startsWith("http")) {
            o1j0.m165640n(R$string.f18040F);
        }
        ie80.InterfaceC17709a interfaceC17709a = this.f162403b;
        if (interfaceC17709a != null) {
            interfaceC17709a.mo45233a(new IllegalStateException());
        }
        c7y.m108346e(i, i2, z, this.f162407f, c7y.f80161b);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m180981r(MediaPlayer mediaPlayer) {
        ie80.InterfaceC17709a interfaceC17709a = this.f162403b;
        if (interfaceC17709a != null) {
            interfaceC17709a.mo45236d();
            this.f162403b.onComplete();
        }
        x20 x20Var = this.f162411j;
        if (x20Var != null) {
            x20Var.call();
        }
        mediaPlayer.seekTo(0);
    }

    @Override // p153l.ie80
    public void release() {
        m180986w(false);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m180982s(Integer num) {
        c7y.m108345d(this.f162409h, num.intValue(), this.f162407f, c7y.f80161b);
    }

    @Override // p153l.ie80
    public void stop() {
        m180986w(true);
    }

    /* JADX INFO: renamed from: t */
    public void m180983t(int i) {
        MediaPlayer mediaPlayer = this.f162402a;
        if (mediaPlayer == null || !this.f162405d) {
            return;
        }
        mediaPlayer.seekTo(i);
    }

    /* JADX INFO: renamed from: u */
    public void m180984u(x20 x20Var) {
        this.f162411j = x20Var;
    }

    /* JADX INFO: renamed from: v */
    public void m180985v(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        this.f162412k = onSeekCompleteListener;
    }

    /* JADX INFO: renamed from: w */
    public final void m180986w(boolean z) {
        ie80.InterfaceC17709a interfaceC17709a;
        if (z && (interfaceC17709a = this.f162403b) != null) {
            interfaceC17709a.mo45236d();
        }
        this.f162404c = false;
        MediaPlayer mediaPlayer = this.f162402a;
        if (mediaPlayer != null) {
            if (this.f162405d) {
                mediaPlayer.stop();
            }
            this.f162402a.release();
            this.f162402a = null;
            this.f162405d = false;
        }
    }

    @Override // p153l.ie80
    public void resume() {
    }

    @Override // p153l.ie80
    /* JADX INFO: renamed from: f */
    public void mo139596f(boolean z) {
    }
}
