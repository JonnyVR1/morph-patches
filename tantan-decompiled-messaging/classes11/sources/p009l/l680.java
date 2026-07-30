package p009l;

import android.media.MediaPlayer;
import android.net.Uri;
import com.p000p1.mobile.putong.util.TrackMediaUploadUtil;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.common.R;
import com.tantanapp.common.utils.CrashHelper;
import l.d30;
import l.e30;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.x1l0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class l680 implements c680 {

    /* JADX INFO: renamed from: a */
    public MediaPlayer f15956a;

    /* JADX INFO: renamed from: b */
    public c680.InterfaceC0799a f15957b;

    /* JADX INFO: renamed from: c */
    public boolean f15958c;

    /* JADX INFO: renamed from: d */
    public boolean f15959d;

    /* JADX INFO: renamed from: g */
    public String f15962g;

    /* JADX INFO: renamed from: j */
    public d30 f15965j;

    /* JADX INFO: renamed from: k */
    public MediaPlayer.OnSeekCompleteListener f15966k;

    /* JADX INFO: renamed from: e */
    public boolean f15960e = false;

    /* JADX INFO: renamed from: f */
    public String f15961f = "";

    /* JADX INFO: renamed from: h */
    public long f15963h = -1;

    /* JADX INFO: renamed from: i */
    public long f15964i = -1;

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m17704l(Throwable th) {
    }

    @Override // p009l.c680
    /* JADX INFO: renamed from: a */
    public void mo12358a(String str) {
        this.f15962g = str;
    }

    @Override // p009l.c680
    /* JADX INFO: renamed from: b */
    public void mo12359b() {
        MediaPlayer mediaPlayer = this.f15956a;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(0.0f, 0.0f);
            this.f15960e = true;
        }
    }

    @Override // p009l.c680
    /* JADX INFO: renamed from: c */
    public void mo12360c() {
        MediaPlayer mediaPlayer;
        if (this.f15957b == null || (mediaPlayer = this.f15956a) == null || !mediaPlayer.isPlaying()) {
            return;
        }
        this.f15957b.mo9455b(this.f15956a.getCurrentPosition());
    }

    @Override // p009l.c680
    /* JADX INFO: renamed from: d */
    public void mo12361d(c680.InterfaceC0799a interfaceC0799a, boolean z) {
        if (interfaceC0799a == null || interfaceC0799a.mo9459f() == null || interfaceC0799a.getSurface() == null) {
            return;
        }
        String aspectRatio = interfaceC0799a.mo9459f().formatAspectRatio() != null ? interfaceC0799a.mo9459f().formatAspectRatio() : "";
        this.f15961f = aspectRatio;
        if (aspectRatio.startsWith("http") && !Network.isConnected(App.e)) {
            lsi0.n(R.string.F);
            interfaceC0799a.mo9457d();
            return;
        }
        this.f15958c = false;
        c680.InterfaceC0799a interfaceC0799a2 = this.f15957b;
        if (interfaceC0799a2 != interfaceC0799a) {
            if (interfaceC0799a2 != null) {
                interfaceC0799a2.mo9458e();
            }
            this.f15957b = interfaceC0799a;
            m17706n();
        } else if (this.f15956a == null) {
            m17706n();
        } else if (this.f15959d) {
            interfaceC0799a.onResume();
            this.f15956a.start();
        } else {
            interfaceC0799a.mo9456c();
        }
        this.f15963h = System.currentTimeMillis();
        if (z) {
            return;
        }
        x1l0.n().I(this.f15961f);
        x1l0.n().q(this.f15961f).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.f680
            public final void call(Object obj) {
                this.f12836a.m17711s((Integer) obj);
            }
        }, new e30() { // from class: l.g680
            public final void call(Object obj) {
                l680.m17704l((Throwable) obj);
            }
        }));
    }

    @Override // p009l.c680
    /* JADX INFO: renamed from: e */
    public boolean mo12362e() {
        return this.f15960e;
    }

    /* JADX INFO: renamed from: m */
    public final void m17705m() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f15956a = mediaPlayer;
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: l.h680
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                this.f13884a.m17707o(mediaPlayer2);
            }
        });
        this.f15956a.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: l.i680
            @Override // android.media.MediaPlayer.OnInfoListener
            public final boolean onInfo(MediaPlayer mediaPlayer2, int i, int i2) {
                return this.f14407a.m17708p(mediaPlayer2, i, i2);
            }
        });
        this.f15956a.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: l.j680
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                return this.f14947a.m17709q(mediaPlayer2, i, i2);
            }
        });
        this.f15956a.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: l.k680
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                this.f15422a.m17710r(mediaPlayer2);
            }
        });
        MediaPlayer.OnSeekCompleteListener onSeekCompleteListener = this.f15966k;
        if (onSeekCompleteListener != null) {
            this.f15956a.setOnSeekCompleteListener(onSeekCompleteListener);
        }
    }

    @Override // p009l.c680
    public void mute(boolean z) {
        MediaPlayer mediaPlayer = this.f15956a;
        if (mediaPlayer == null) {
            return;
        }
        this.f15960e = z;
        if (z) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m17706n() {
        c680.InterfaceC0799a interfaceC0799a = this.f15957b;
        if (interfaceC0799a != null) {
            interfaceC0799a.mo9456c();
        }
        m17715w(false);
        try {
            m17705m();
            this.f15956a.setDataSource(Uri.parse(qib0.d0(this.f15957b.mo9459f().formatAspectRatio())).toString());
            this.f15956a.prepareAsync();
            this.f15956a.setSurface(this.f15957b.getSurface());
        } catch (Exception e) {
            CrashHelper.c(e);
            c680.InterfaceC0799a interfaceC0799a2 = this.f15957b;
            if (interfaceC0799a2 != null) {
                interfaceC0799a2.mo9454a(new IllegalStateException("Failed to prepare media player", e));
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m17707o(MediaPlayer mediaPlayer) {
        this.f15959d = true;
        if (this.f15958c) {
            return;
        }
        mediaPlayer.start();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ boolean m17708p(MediaPlayer mediaPlayer, int i, int i2) {
        c680.InterfaceC0799a interfaceC0799a;
        c680.InterfaceC0799a interfaceC0799a2;
        if (i == 3) {
            if (!this.f15958c && (interfaceC0799a = this.f15957b) != null) {
                interfaceC0799a.onStart();
                this.f15957b.onResume();
                fyx.m14674c(this.f15963h, System.currentTimeMillis(), this.f15961f, fyx.f13234b);
            }
            return true;
        }
        if (i == 701) {
            c680.InterfaceC0799a interfaceC0799a3 = this.f15957b;
            if (interfaceC0799a3 != null) {
                interfaceC0799a3.mo9456c();
            }
            this.f15964i = System.currentTimeMillis();
            return true;
        }
        if (i != 702) {
            return false;
        }
        if (!this.f15958c && (interfaceC0799a2 = this.f15957b) != null) {
            interfaceC0799a2.onResume();
        }
        if (this.f15964i != -1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.f15964i;
            if (j < 200) {
                return true;
            }
            TrackMediaUploadUtil.m10661h0(j, this.f15962g, this.f15961f);
            fyx.m14673b(this.f15964i, jCurrentTimeMillis, this.f15961f, fyx.f13234b);
            this.f15964i = -1L;
        }
        return true;
    }

    @Override // p009l.c680
    public void pause() {
        this.f15958c = true;
        c680.InterfaceC0799a interfaceC0799a = this.f15957b;
        if (interfaceC0799a != null) {
            interfaceC0799a.onPause();
        }
        MediaPlayer mediaPlayer = this.f15956a;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            return;
        }
        this.f15956a.pause();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ boolean m17709q(MediaPlayer mediaPlayer, int i, int i2) {
        String str;
        boolean z = !Network.isConnected(App.e);
        this.f15959d = false;
        if (i == 1 && i2 == Integer.MIN_VALUE && (str = this.f15961f) != null && str.startsWith("http")) {
            lsi0.n(R.string.F);
        }
        c680.InterfaceC0799a interfaceC0799a = this.f15957b;
        if (interfaceC0799a != null) {
            interfaceC0799a.mo9454a(new IllegalStateException());
        }
        fyx.m14676e(i, i2, z, this.f15961f, fyx.f13234b);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m17710r(MediaPlayer mediaPlayer) {
        c680.InterfaceC0799a interfaceC0799a = this.f15957b;
        if (interfaceC0799a != null) {
            interfaceC0799a.mo9457d();
            this.f15957b.onComplete();
        }
        d30 d30Var = this.f15965j;
        if (d30Var != null) {
            d30Var.call();
        }
        mediaPlayer.seekTo(0);
    }

    @Override // p009l.c680
    public void release() {
        m17715w(false);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m17711s(Integer num) {
        fyx.m14675d(this.f15963h, num.intValue(), this.f15961f, fyx.f13234b);
    }

    @Override // p009l.c680
    public void stop() {
        m17715w(true);
    }

    /* JADX INFO: renamed from: t */
    public void m17712t(int i) {
        MediaPlayer mediaPlayer = this.f15956a;
        if (mediaPlayer == null || !this.f15959d) {
            return;
        }
        mediaPlayer.seekTo(i);
    }

    /* JADX INFO: renamed from: u */
    public void m17713u(d30 d30Var) {
        this.f15965j = d30Var;
    }

    /* JADX INFO: renamed from: v */
    public void m17714v(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        this.f15966k = onSeekCompleteListener;
    }

    /* JADX INFO: renamed from: w */
    public final void m17715w(boolean z) {
        c680.InterfaceC0799a interfaceC0799a;
        if (z && (interfaceC0799a = this.f15957b) != null) {
            interfaceC0799a.mo9457d();
        }
        this.f15958c = false;
        MediaPlayer mediaPlayer = this.f15956a;
        if (mediaPlayer != null) {
            if (this.f15959d) {
                mediaPlayer.stop();
            }
            this.f15956a.release();
            this.f15956a = null;
            this.f15959d = false;
        }
    }

    @Override // p009l.c680
    /* JADX INFO: renamed from: f */
    public void mo12363f(boolean z) {
    }

    @Override // p009l.c680
    public void resume() {
    }
}
