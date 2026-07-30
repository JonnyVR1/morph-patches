package p149l;

import android.net.Uri;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.ijk.media.player.IMediaPlayer;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class s680 implements c680 {

    /* JADX INFO: renamed from: a */
    public wph0 f162625a;

    /* JADX INFO: renamed from: b */
    public c680.InterfaceC16083a f162626b;

    /* JADX INFO: renamed from: c */
    public boolean f162627c;

    /* JADX INFO: renamed from: d */
    public boolean f162628d;

    /* JADX INFO: renamed from: e */
    public boolean f162629e;

    /* JADX INFO: renamed from: m */
    public boolean f162637m;

    /* JADX INFO: renamed from: n */
    public String f162638n;

    /* JADX INFO: renamed from: f */
    public boolean f162630f = true;

    /* JADX INFO: renamed from: g */
    public long f162631g = -1;

    /* JADX INFO: renamed from: h */
    public long f162632h = -1;

    /* JADX INFO: renamed from: i */
    public long f162633i = -1;

    /* JADX INFO: renamed from: j */
    public boolean f162634j = true;

    /* JADX INFO: renamed from: k */
    public String f162635k = "";

    /* JADX INFO: renamed from: l */
    public String f162636l = "";

    /* JADX INFO: renamed from: o */
    public boolean f162639o = false;

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m182408h(Throwable th) {
    }

    /* JADX INFO: renamed from: m */
    private void m182413m() {
        wph0 wph0VarM215630e = yph0.m215627d().m215630e();
        this.f162625a = wph0VarM215630e;
        wph0VarM215630e.setOption(4, "start-on-prepared", 0L);
        this.f162625a.m204912a();
        this.f162625a.setOnPreparedListener(new IMediaPlayer.OnPreparedListener() { // from class: l.o680
            @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnPreparedListener
            public final void onPrepared(IMediaPlayer iMediaPlayer) {
                this.f141987a.m182417o(iMediaPlayer);
            }
        });
        this.f162625a.setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: l.p680
            @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnInfoListener
            public final boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                return this.f147379a.m182418p(iMediaPlayer, i, i2);
            }
        });
        this.f162625a.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: l.q680
            @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnErrorListener
            public final boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                return this.f152858a.m182419q(iMediaPlayer, i, i2);
            }
        });
        this.f162625a.setOnCompletionListener(new IMediaPlayer.OnCompletionListener() { // from class: l.r680
            @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnCompletionListener
            public final void onCompletion(IMediaPlayer iMediaPlayer) {
                this.f157905a.m182420r(iMediaPlayer);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    private void m182414n() {
        c680.InterfaceC16083a interfaceC16083a = this.f162626b;
        if (interfaceC16083a != null) {
            interfaceC16083a.mo44052c();
        }
        m182416t(false);
        try {
            m182413m();
            this.f162625a.setDataSource(Uri.parse(qib0.m174812d0(this.f162626b.mo44055f().formatAspectRatio())).toString());
            this.f162625a.prepareAsync();
            this.f162625a.setSurface(this.f162626b.getSurface());
            this.f162630f = true;
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            c680.InterfaceC16083a interfaceC16083a2 = this.f162626b;
            if (interfaceC16083a2 != null) {
                interfaceC16083a2.mo44050a(new IllegalStateException("Failed to prepare media player", e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m182415s(Integer num) {
        fyx.m123810d(this.f162631g, num.intValue(), this.f162635k, fyx.f99914a);
    }

    /* JADX INFO: renamed from: t */
    private void m182416t(boolean z) {
        c680.InterfaceC16083a interfaceC16083a;
        if (z && (interfaceC16083a = this.f162626b) != null) {
            interfaceC16083a.mo44053d();
        }
        this.f162629e = false;
        this.f162627c = false;
        wph0 wph0Var = this.f162625a;
        if (wph0Var != null) {
            wph0Var.stop();
            this.f162625a = null;
            this.f162628d = false;
        }
    }

    @Override // p149l.c680
    /* JADX INFO: renamed from: a */
    public void mo105366a(String str) {
        this.f162638n = str;
    }

    @Override // p149l.c680
    /* JADX INFO: renamed from: b */
    public void mo105367b() {
        this.f162637m = true;
        wph0 wph0Var = this.f162625a;
        if (wph0Var != null) {
            wph0Var.setVolume(0.0f, 0.0f);
            this.f162639o = true;
        }
    }

    @Override // p149l.c680
    /* JADX INFO: renamed from: c */
    public void mo105368c() {
        wph0 wph0Var;
        if (this.f162626b == null || (wph0Var = this.f162625a) == null || !wph0Var.isPlaying()) {
            return;
        }
        this.f162626b.mo44051b((int) this.f162625a.getCurrentPosition());
    }

    @Override // p149l.c680
    /* JADX INFO: renamed from: d */
    public void mo105369d(c680.InterfaceC16083a interfaceC16083a, boolean z) {
        if (interfaceC16083a == null || interfaceC16083a.mo44055f() == null || interfaceC16083a.getSurface() == null) {
            return;
        }
        this.f162635k = interfaceC16083a.mo44055f().formatAspectRatio() != null ? interfaceC16083a.mo44055f().formatAspectRatio() : "";
        this.f162636l = String.valueOf(((int) interfaceC16083a.mo44055f().duration) * 1000);
        this.f162627c = false;
        c680.InterfaceC16083a interfaceC16083a2 = this.f162626b;
        if (interfaceC16083a2 == interfaceC16083a) {
            wph0 wph0Var = this.f162625a;
            if (wph0Var == null) {
                m182414n();
            } else if (this.f162628d) {
                wph0Var.start();
            } else {
                interfaceC16083a.mo44052c();
            }
        } else {
            if (interfaceC16083a2 != null) {
                interfaceC16083a2.mo44054e();
            }
            this.f162626b = interfaceC16083a;
            m182414n();
        }
        this.f162629e = true;
        this.f162631g = System.currentTimeMillis();
        if (!z) {
            x1l0.m206744n().m206748I(this.f162635k);
            x1l0.m206744n().m206751q(this.f162635k).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.m680
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f131450a.m182415s((Integer) obj);
                }
            }, new e30() { // from class: l.n680
                @Override // p149l.e30
                public final void call(Object obj) {
                    s680.m182408h((Throwable) obj);
                }
            }));
        }
        this.f162632h = -1L;
        this.f162633i = -1L;
    }

    @Override // p149l.c680
    /* JADX INFO: renamed from: e */
    public boolean mo105370e() {
        return this.f162639o;
    }

    @Override // p149l.c680
    /* JADX INFO: renamed from: f */
    public void mo105371f(boolean z) {
        this.f162630f = z;
        this.f162632h = -1L;
        this.f162633i = -1L;
    }

    @Override // p149l.c680
    public void mute(boolean z) {
        this.f162637m = z;
        wph0 wph0Var = this.f162625a;
        if (wph0Var == null) {
            return;
        }
        this.f162639o = z;
        if (z) {
            wph0Var.setVolume(0.0f, 0.0f);
        } else {
            wph0Var.setVolume(1.0f, 1.0f);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m182417o(IMediaPlayer iMediaPlayer) {
        this.f162628d = true;
        boolean z = this.f162637m;
        wph0 wph0Var = this.f162625a;
        if (z) {
            wph0Var.setVolume(0.0f, 0.0f);
            this.f162639o = true;
        } else {
            wph0Var.setVolume(1.0f, 1.0f);
            this.f162639o = false;
        }
        if (this.f162632h > 0) {
            this.f162632h = -1L;
        }
        if (this.f162627c || !this.f162629e) {
            return;
        }
        iMediaPlayer.start();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ boolean m182418p(IMediaPlayer iMediaPlayer, int i, int i2) {
        if (i == 3) {
            if (!this.f162627c && this.f162629e && this.f162626b != null) {
                iMediaPlayer.start();
                this.f162626b.onStart();
            }
            fyx.m123809c(this.f162631g, System.currentTimeMillis(), this.f162635k, fyx.f99914a);
            return true;
        }
        if (i == 701) {
            c680.InterfaceC16083a interfaceC16083a = this.f162626b;
            if (interfaceC16083a != null) {
                interfaceC16083a.mo44052c();
            }
            this.f162633i = System.currentTimeMillis();
            return true;
        }
        if (i != 702) {
            return false;
        }
        c680.InterfaceC16083a interfaceC16083a2 = this.f162626b;
        if (interfaceC16083a2 != null) {
            interfaceC16083a2.mo44056g();
        }
        if (this.f162633i != -1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.f162633i;
            if (j < 200) {
                return true;
            }
            TrackMediaUploadUtil.m80310h0(j, this.f162638n, this.f162635k);
            fyx.m123808b(this.f162633i, jCurrentTimeMillis, this.f162635k, fyx.f99914a);
            this.f162633i = -1L;
        }
        return true;
    }

    @Override // p149l.c680
    public void pause() {
        this.f162627c = true;
        c680.InterfaceC16083a interfaceC16083a = this.f162626b;
        if (interfaceC16083a != null) {
            interfaceC16083a.onPause();
        }
        wph0 wph0Var = this.f162625a;
        if (wph0Var == null || !wph0Var.isPlaying()) {
            return;
        }
        this.f162625a.pause();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ boolean m182419q(IMediaPlayer iMediaPlayer, int i, int i2) {
        this.f162628d = false;
        boolean zIsConnected = Network.isConnected(App.f15369e);
        boolean z = !zIsConnected;
        if (i == -541478725 && !zIsConnected) {
            lsi0.m151584n(R$string.f17321F);
        }
        c680.InterfaceC16083a interfaceC16083a = this.f162626b;
        if (interfaceC16083a != null) {
            interfaceC16083a.mo44050a(new IllegalStateException());
        }
        fyx.m123811e(i, i2, z, this.f162635k, fyx.f99914a);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m182420r(IMediaPlayer iMediaPlayer) {
        c680.InterfaceC16083a interfaceC16083a = this.f162626b;
        if (interfaceC16083a != null) {
            interfaceC16083a.mo44053d();
            this.f162626b.onComplete();
        }
        mo105371f(true);
    }

    @Override // p149l.c680
    public void release() {
        m182416t(false);
    }

    @Override // p149l.c680
    public void resume() {
        c680.InterfaceC16083a interfaceC16083a = this.f162626b;
        if (interfaceC16083a == null || !this.f162628d) {
            return;
        }
        interfaceC16083a.onResume();
    }

    @Override // p149l.c680
    public void stop() {
        m182416t(true);
        mo105371f(true);
    }
}
