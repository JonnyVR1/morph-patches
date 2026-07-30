package p153l;

import android.net.Uri;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.ijk.media.player.IMediaPlayer;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class ye80 implements ie80 {

    /* JADX INFO: renamed from: a */
    public dyh0 f198671a;

    /* JADX INFO: renamed from: b */
    public ie80.InterfaceC17709a f198672b;

    /* JADX INFO: renamed from: c */
    public boolean f198673c;

    /* JADX INFO: renamed from: d */
    public boolean f198674d;

    /* JADX INFO: renamed from: e */
    public boolean f198675e;

    /* JADX INFO: renamed from: m */
    public boolean f198683m;

    /* JADX INFO: renamed from: n */
    public String f198684n;

    /* JADX INFO: renamed from: f */
    public boolean f198676f = true;

    /* JADX INFO: renamed from: g */
    public long f198677g = -1;

    /* JADX INFO: renamed from: h */
    public long f198678h = -1;

    /* JADX INFO: renamed from: i */
    public long f198679i = -1;

    /* JADX INFO: renamed from: j */
    public boolean f198680j = true;

    /* JADX INFO: renamed from: k */
    public String f198681k = "";

    /* JADX INFO: renamed from: l */
    public String f198682l = "";

    /* JADX INFO: renamed from: o */
    public boolean f198685o = false;

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m215397h(Throwable th) {
    }

    /* JADX INFO: renamed from: m */
    private void m215402m() {
        dyh0 dyh0VarM128092e = fyh0.m128089d().m128092e();
        this.f198671a = dyh0VarM128092e;
        dyh0VarM128092e.setOption(4, "start-on-prepared", 0L);
        this.f198671a.m118695a();
        this.f198671a.setOnPreparedListener(new IMediaPlayer.OnPreparedListener() { // from class: l.ue80
            @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnPreparedListener
            public final void onPrepared(IMediaPlayer iMediaPlayer) {
                this.f178639a.m215406o(iMediaPlayer);
            }
        });
        this.f198671a.setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: l.ve80
            @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnInfoListener
            public final boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                return this.f183709a.m215407p(iMediaPlayer, i, i2);
            }
        });
        this.f198671a.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: l.we80
            @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnErrorListener
            public final boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                return this.f188674a.m215408q(iMediaPlayer, i, i2);
            }
        });
        this.f198671a.setOnCompletionListener(new IMediaPlayer.OnCompletionListener() { // from class: l.xe80
            @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnCompletionListener
            public final void onCompletion(IMediaPlayer iMediaPlayer) {
                this.f193740a.m215409r(iMediaPlayer);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    private void m215403n() {
        ie80.InterfaceC17709a interfaceC17709a = this.f198672b;
        if (interfaceC17709a != null) {
            interfaceC17709a.mo45235c();
        }
        m215405t(false);
        try {
            m215402m();
            this.f198671a.setDataSource(Uri.parse(uqb0.m197266d0(this.f198672b.mo45238f().formatAspectRatio())).toString());
            this.f198671a.prepareAsync();
            this.f198671a.setSurface(this.f198672b.getSurface());
            this.f198676f = true;
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            ie80.InterfaceC17709a interfaceC17709a2 = this.f198672b;
            if (interfaceC17709a2 != null) {
                interfaceC17709a2.mo45233a(new IllegalStateException("Failed to prepare media player", e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m215404s(Integer num) {
        c7y.m108345d(this.f198677g, num.intValue(), this.f198681k, c7y.f80160a);
    }

    /* JADX INFO: renamed from: t */
    private void m215405t(boolean z) {
        ie80.InterfaceC17709a interfaceC17709a;
        if (z && (interfaceC17709a = this.f198672b) != null) {
            interfaceC17709a.mo45236d();
        }
        this.f198675e = false;
        this.f198673c = false;
        dyh0 dyh0Var = this.f198671a;
        if (dyh0Var != null) {
            dyh0Var.stop();
            this.f198671a = null;
            this.f198674d = false;
        }
    }

    @Override // p153l.ie80
    /* JADX INFO: renamed from: a */
    public void mo139591a(String str) {
        this.f198684n = str;
    }

    @Override // p153l.ie80
    /* JADX INFO: renamed from: b */
    public void mo139592b() {
        this.f198683m = true;
        dyh0 dyh0Var = this.f198671a;
        if (dyh0Var != null) {
            dyh0Var.setVolume(0.0f, 0.0f);
            this.f198685o = true;
        }
    }

    @Override // p153l.ie80
    /* JADX INFO: renamed from: c */
    public void mo139593c() {
        dyh0 dyh0Var;
        if (this.f198672b == null || (dyh0Var = this.f198671a) == null || !dyh0Var.isPlaying()) {
            return;
        }
        this.f198672b.mo45234b((int) this.f198671a.getCurrentPosition());
    }

    @Override // p153l.ie80
    /* JADX INFO: renamed from: d */
    public void mo139594d(ie80.InterfaceC17709a interfaceC17709a, boolean z) {
        if (interfaceC17709a == null || interfaceC17709a.mo45238f() == null || interfaceC17709a.getSurface() == null) {
            return;
        }
        this.f198681k = interfaceC17709a.mo45238f().formatAspectRatio() != null ? interfaceC17709a.mo45238f().formatAspectRatio() : "";
        this.f198682l = String.valueOf(((int) interfaceC17709a.mo45238f().duration) * 1000);
        this.f198673c = false;
        ie80.InterfaceC17709a interfaceC17709a2 = this.f198672b;
        if (interfaceC17709a2 == interfaceC17709a) {
            dyh0 dyh0Var = this.f198671a;
            if (dyh0Var == null) {
                m215403n();
            } else if (this.f198674d) {
                dyh0Var.start();
            } else {
                interfaceC17709a.mo45235c();
            }
        } else {
            if (interfaceC17709a2 != null) {
                interfaceC17709a2.mo45237e();
            }
            this.f198672b = interfaceC17709a;
            m215403n();
        }
        this.f198675e = true;
        this.f198677g = System.currentTimeMillis();
        if (!z) {
            cbl0.m108642n().m108646I(this.f198681k);
            cbl0.m108642n().m108649q(this.f198681k).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.se80
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f167491a.m215404s((Integer) obj);
                }
            }, new y20() { // from class: l.te80
                @Override // p153l.y20
                public final void call(Object obj) {
                    ye80.m215397h((Throwable) obj);
                }
            }));
        }
        this.f198678h = -1L;
        this.f198679i = -1L;
    }

    @Override // p153l.ie80
    /* JADX INFO: renamed from: e */
    public boolean mo139595e() {
        return this.f198685o;
    }

    @Override // p153l.ie80
    /* JADX INFO: renamed from: f */
    public void mo139596f(boolean z) {
        this.f198676f = z;
        this.f198678h = -1L;
        this.f198679i = -1L;
    }

    @Override // p153l.ie80
    public void mute(boolean z) {
        this.f198683m = z;
        dyh0 dyh0Var = this.f198671a;
        if (dyh0Var == null) {
            return;
        }
        this.f198685o = z;
        if (z) {
            dyh0Var.setVolume(0.0f, 0.0f);
        } else {
            dyh0Var.setVolume(1.0f, 1.0f);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m215406o(IMediaPlayer iMediaPlayer) {
        this.f198674d = true;
        boolean z = this.f198683m;
        dyh0 dyh0Var = this.f198671a;
        if (z) {
            dyh0Var.setVolume(0.0f, 0.0f);
            this.f198685o = true;
        } else {
            dyh0Var.setVolume(1.0f, 1.0f);
            this.f198685o = false;
        }
        if (this.f198678h > 0) {
            this.f198678h = -1L;
        }
        if (this.f198673c || !this.f198675e) {
            return;
        }
        iMediaPlayer.start();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ boolean m215407p(IMediaPlayer iMediaPlayer, int i, int i2) {
        if (i == 3) {
            if (!this.f198673c && this.f198675e && this.f198672b != null) {
                iMediaPlayer.start();
                this.f198672b.onStart();
            }
            c7y.m108344c(this.f198677g, System.currentTimeMillis(), this.f198681k, c7y.f80160a);
            return true;
        }
        if (i == 701) {
            ie80.InterfaceC17709a interfaceC17709a = this.f198672b;
            if (interfaceC17709a != null) {
                interfaceC17709a.mo45235c();
            }
            this.f198679i = System.currentTimeMillis();
            return true;
        }
        if (i != 702) {
            return false;
        }
        ie80.InterfaceC17709a interfaceC17709a2 = this.f198672b;
        if (interfaceC17709a2 != null) {
            interfaceC17709a2.mo45239g();
        }
        if (this.f198679i != -1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.f198679i;
            if (j < 200) {
                return true;
            }
            TrackMediaUploadUtil.m81493h0(j, this.f198684n, this.f198681k);
            c7y.m108343b(this.f198679i, jCurrentTimeMillis, this.f198681k, c7y.f80160a);
            this.f198679i = -1L;
        }
        return true;
    }

    @Override // p153l.ie80
    public void pause() {
        this.f198673c = true;
        ie80.InterfaceC17709a interfaceC17709a = this.f198672b;
        if (interfaceC17709a != null) {
            interfaceC17709a.onPause();
        }
        dyh0 dyh0Var = this.f198671a;
        if (dyh0Var == null || !dyh0Var.isPlaying()) {
            return;
        }
        this.f198671a.pause();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ boolean m215408q(IMediaPlayer iMediaPlayer, int i, int i2) {
        this.f198674d = false;
        boolean zIsConnected = Network.isConnected(App.f16088e);
        boolean z = !zIsConnected;
        if (i == -541478725 && !zIsConnected) {
            o1j0.m165640n(R$string.f18040F);
        }
        ie80.InterfaceC17709a interfaceC17709a = this.f198672b;
        if (interfaceC17709a != null) {
            interfaceC17709a.mo45233a(new IllegalStateException());
        }
        c7y.m108346e(i, i2, z, this.f198681k, c7y.f80160a);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m215409r(IMediaPlayer iMediaPlayer) {
        ie80.InterfaceC17709a interfaceC17709a = this.f198672b;
        if (interfaceC17709a != null) {
            interfaceC17709a.mo45236d();
            this.f198672b.onComplete();
        }
        mo139596f(true);
    }

    @Override // p153l.ie80
    public void release() {
        m215405t(false);
    }

    @Override // p153l.ie80
    public void resume() {
        ie80.InterfaceC17709a interfaceC17709a = this.f198672b;
        if (interfaceC17709a == null || !this.f198674d) {
            return;
        }
        interfaceC17709a.onResume();
    }

    @Override // p153l.ie80
    public void stop() {
        m215405t(true);
        mo139596f(true);
    }
}
