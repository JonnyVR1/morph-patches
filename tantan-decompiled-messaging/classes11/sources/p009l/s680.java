package p009l;

import android.net.Uri;
import com.p000p1.mobile.putong.util.TrackMediaUploadUtil;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.common.R;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.ijk.media.player.IMediaPlayer;
import java.io.IOException;
import l.e30;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.wph0;
import l.x1l0;
import l.yph0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class s680 implements c680 {

    /* JADX INFO: renamed from: a */
    public wph0 f20100a;

    /* JADX INFO: renamed from: b */
    public c680.InterfaceC0799a f20101b;

    /* JADX INFO: renamed from: c */
    public boolean f20102c;

    /* JADX INFO: renamed from: d */
    public boolean f20103d;

    /* JADX INFO: renamed from: e */
    public boolean f20104e;

    /* JADX INFO: renamed from: m */
    public boolean f20112m;

    /* JADX INFO: renamed from: n */
    public String f20113n;

    /* JADX INFO: renamed from: f */
    public boolean f20105f = true;

    /* JADX INFO: renamed from: g */
    public long f20106g = -1;

    /* JADX INFO: renamed from: h */
    public long f20107h = -1;

    /* JADX INFO: renamed from: i */
    public long f20108i = -1;

    /* JADX INFO: renamed from: j */
    public boolean f20109j = true;

    /* JADX INFO: renamed from: k */
    public String f20110k = "";

    /* JADX INFO: renamed from: l */
    public String f20111l = "";

    /* JADX INFO: renamed from: o */
    public boolean f20114o = false;

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m21987h(Throwable th) {
    }

    /* JADX INFO: renamed from: m */
    private void m21992m() {
        wph0 wph0VarE = yph0.d().e();
        this.f20100a = wph0VarE;
        wph0VarE.setOption(4, "start-on-prepared", 0L);
        this.f20100a.a();
        this.f20100a.setOnPreparedListener(new IMediaPlayer.OnPreparedListener() { // from class: l.o680
            public final void onPrepared(IMediaPlayer iMediaPlayer) {
                this.f17852a.m21996o(iMediaPlayer);
            }
        });
        this.f20100a.setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: l.p680
            public final boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                return this.f18405a.m21997p(iMediaPlayer, i, i2);
            }
        });
        this.f20100a.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: l.q680
            public final boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                return this.f19047a.m21998q(iMediaPlayer, i, i2);
            }
        });
        this.f20100a.setOnCompletionListener(new IMediaPlayer.OnCompletionListener() { // from class: l.r680
            public final void onCompletion(IMediaPlayer iMediaPlayer) {
                this.f19647a.m21999r(iMediaPlayer);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    private void m21993n() {
        c680.InterfaceC0799a interfaceC0799a = this.f20101b;
        if (interfaceC0799a != null) {
            interfaceC0799a.mo9456c();
        }
        m21995t(false);
        try {
            m21992m();
            this.f20100a.setDataSource(Uri.parse(qib0.d0(this.f20101b.mo9459f().formatAspectRatio())).toString());
            this.f20100a.prepareAsync();
            this.f20100a.setSurface(this.f20101b.getSurface());
            this.f20105f = true;
        } catch (IOException e) {
            CrashHelper.c(e);
            c680.InterfaceC0799a interfaceC0799a2 = this.f20101b;
            if (interfaceC0799a2 != null) {
                interfaceC0799a2.mo9454a(new IllegalStateException("Failed to prepare media player", e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m21994s(Integer num) {
        fyx.m14675d(this.f20106g, num.intValue(), this.f20110k, fyx.f13233a);
    }

    /* JADX INFO: renamed from: t */
    private void m21995t(boolean z) {
        c680.InterfaceC0799a interfaceC0799a;
        if (z && (interfaceC0799a = this.f20101b) != null) {
            interfaceC0799a.mo9457d();
        }
        this.f20104e = false;
        this.f20102c = false;
        wph0 wph0Var = this.f20100a;
        if (wph0Var != null) {
            wph0Var.stop();
            this.f20100a = null;
            this.f20103d = false;
        }
    }

    @Override // p009l.c680
    /* JADX INFO: renamed from: a */
    public void mo12358a(String str) {
        this.f20113n = str;
    }

    @Override // p009l.c680
    /* JADX INFO: renamed from: b */
    public void mo12359b() {
        this.f20112m = true;
        wph0 wph0Var = this.f20100a;
        if (wph0Var != null) {
            wph0Var.setVolume(0.0f, 0.0f);
            this.f20114o = true;
        }
    }

    @Override // p009l.c680
    /* JADX INFO: renamed from: c */
    public void mo12360c() {
        wph0 wph0Var;
        if (this.f20101b == null || (wph0Var = this.f20100a) == null || !wph0Var.isPlaying()) {
            return;
        }
        this.f20101b.mo9455b((int) this.f20100a.getCurrentPosition());
    }

    @Override // p009l.c680
    /* JADX INFO: renamed from: d */
    public void mo12361d(c680.InterfaceC0799a interfaceC0799a, boolean z) {
        if (interfaceC0799a == null || interfaceC0799a.mo9459f() == null || interfaceC0799a.getSurface() == null) {
            return;
        }
        this.f20110k = interfaceC0799a.mo9459f().formatAspectRatio() != null ? interfaceC0799a.mo9459f().formatAspectRatio() : "";
        this.f20111l = String.valueOf(((int) interfaceC0799a.mo9459f().duration) * 1000);
        this.f20102c = false;
        c680.InterfaceC0799a interfaceC0799a2 = this.f20101b;
        if (interfaceC0799a2 == interfaceC0799a) {
            wph0 wph0Var = this.f20100a;
            if (wph0Var == null) {
                m21993n();
            } else if (this.f20103d) {
                wph0Var.start();
            } else {
                interfaceC0799a.mo9456c();
            }
        } else {
            if (interfaceC0799a2 != null) {
                interfaceC0799a2.mo9458e();
            }
            this.f20101b = interfaceC0799a;
            m21993n();
        }
        this.f20104e = true;
        this.f20106g = System.currentTimeMillis();
        if (!z) {
            x1l0.n().I(this.f20110k);
            x1l0.n().q(this.f20110k).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.m680
                public final void call(Object obj) {
                    this.f16512a.m21994s((Integer) obj);
                }
            }, new e30() { // from class: l.n680
                public final void call(Object obj) {
                    s680.m21987h((Throwable) obj);
                }
            }));
        }
        this.f20107h = -1L;
        this.f20108i = -1L;
    }

    @Override // p009l.c680
    /* JADX INFO: renamed from: e */
    public boolean mo12362e() {
        return this.f20114o;
    }

    @Override // p009l.c680
    /* JADX INFO: renamed from: f */
    public void mo12363f(boolean z) {
        this.f20105f = z;
        this.f20107h = -1L;
        this.f20108i = -1L;
    }

    @Override // p009l.c680
    public void mute(boolean z) {
        this.f20112m = z;
        wph0 wph0Var = this.f20100a;
        if (wph0Var == null) {
            return;
        }
        this.f20114o = z;
        if (z) {
            wph0Var.setVolume(0.0f, 0.0f);
        } else {
            wph0Var.setVolume(1.0f, 1.0f);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m21996o(IMediaPlayer iMediaPlayer) {
        this.f20103d = true;
        boolean z = this.f20112m;
        wph0 wph0Var = this.f20100a;
        if (z) {
            wph0Var.setVolume(0.0f, 0.0f);
            this.f20114o = true;
        } else {
            wph0Var.setVolume(1.0f, 1.0f);
            this.f20114o = false;
        }
        if (this.f20107h > 0) {
            this.f20107h = -1L;
        }
        if (this.f20102c || !this.f20104e) {
            return;
        }
        iMediaPlayer.start();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ boolean m21997p(IMediaPlayer iMediaPlayer, int i, int i2) {
        if (i == 3) {
            if (!this.f20102c && this.f20104e && this.f20101b != null) {
                iMediaPlayer.start();
                this.f20101b.onStart();
            }
            fyx.m14674c(this.f20106g, System.currentTimeMillis(), this.f20110k, fyx.f13233a);
            return true;
        }
        if (i == 701) {
            c680.InterfaceC0799a interfaceC0799a = this.f20101b;
            if (interfaceC0799a != null) {
                interfaceC0799a.mo9456c();
            }
            this.f20108i = System.currentTimeMillis();
            return true;
        }
        if (i != 702) {
            return false;
        }
        c680.InterfaceC0799a interfaceC0799a2 = this.f20101b;
        if (interfaceC0799a2 != null) {
            interfaceC0799a2.mo9460g();
        }
        if (this.f20108i != -1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.f20108i;
            if (j < 200) {
                return true;
            }
            TrackMediaUploadUtil.m10661h0(j, this.f20113n, this.f20110k);
            fyx.m14673b(this.f20108i, jCurrentTimeMillis, this.f20110k, fyx.f13233a);
            this.f20108i = -1L;
        }
        return true;
    }

    @Override // p009l.c680
    public void pause() {
        this.f20102c = true;
        c680.InterfaceC0799a interfaceC0799a = this.f20101b;
        if (interfaceC0799a != null) {
            interfaceC0799a.onPause();
        }
        wph0 wph0Var = this.f20100a;
        if (wph0Var == null || !wph0Var.isPlaying()) {
            return;
        }
        this.f20100a.pause();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ boolean m21998q(IMediaPlayer iMediaPlayer, int i, int i2) {
        this.f20103d = false;
        boolean zIsConnected = Network.isConnected(App.e);
        boolean z = !zIsConnected;
        if (i == -541478725 && !zIsConnected) {
            lsi0.n(R.string.F);
        }
        c680.InterfaceC0799a interfaceC0799a = this.f20101b;
        if (interfaceC0799a != null) {
            interfaceC0799a.mo9454a(new IllegalStateException());
        }
        fyx.m14676e(i, i2, z, this.f20110k, fyx.f13233a);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m21999r(IMediaPlayer iMediaPlayer) {
        c680.InterfaceC0799a interfaceC0799a = this.f20101b;
        if (interfaceC0799a != null) {
            interfaceC0799a.mo9457d();
            this.f20101b.onComplete();
        }
        mo12363f(true);
    }

    @Override // p009l.c680
    public void release() {
        m21995t(false);
    }

    @Override // p009l.c680
    public void resume() {
        c680.InterfaceC0799a interfaceC0799a = this.f20101b;
        if (interfaceC0799a == null || !this.f20103d) {
            return;
        }
        interfaceC0799a.onResume();
    }

    @Override // p009l.c680
    public void stop() {
        m21995t(true);
        mo12363f(true);
    }
}
