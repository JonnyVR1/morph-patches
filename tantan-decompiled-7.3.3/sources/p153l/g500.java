package p153l;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Vibrator;
import android.view.View;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.media.AudioPlayer;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.proxy.api.C13825a;
import java.util.concurrent.Callable;
import p137rx.C22421c;
import p151v.VTexturePlayer;

/* JADX INFO: loaded from: classes4.dex */
public class g500 extends j3z<i500> {

    /* JADX INFO: renamed from: n */
    public static long f102209n = -1;

    /* JADX INFO: renamed from: b */
    public long f102210b;

    /* JADX INFO: renamed from: c */
    public AudioPlayer f102211c;

    /* JADX INFO: renamed from: d */
    public boolean f102212d;

    /* JADX INFO: renamed from: e */
    public gcg0<AudioPlayer.State> f102213e;

    /* JADX INFO: renamed from: f */
    public Runnable f102214f;

    /* JADX INFO: renamed from: g */
    public tnw f102215g;

    /* JADX INFO: renamed from: h */
    public SoundPool f102216h;

    /* JADX INFO: renamed from: i */
    public int f102217i;

    /* JADX INFO: renamed from: j */
    public int f102218j;

    /* JADX INFO: renamed from: k */
    public boolean f102219k;

    /* JADX INFO: renamed from: l */
    public AudioPlayer.State f102220l;

    /* JADX INFO: renamed from: m */
    public boolean f102221m;

    public g500(ner nerVar) {
        super(nerVar);
        this.f102210b = f102209n;
        this.f102213e = new C17152a();
        this.f102214f = new Runnable() { // from class: l.a500
            @Override // java.lang.Runnable
            public final void run() {
                this.f68481a.m128954b1();
            }
        };
        this.f102220l = AudioPlayer.State.stopped;
        this.f102221m = false;
    }

    /* JADX INFO: renamed from: L0 */
    private void m128920L0() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.u400
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177424a.m128945Q0((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G0 */
    public final void m128938G0() {
        if (this.f102219k) {
            AudioManager audioManager = (AudioManager) act().getSystemService("audio");
            if (NullChecker.m82486a(audioManager)) {
                audioManager.abandonAudioFocus(null);
            }
            this.f102219k = false;
        }
    }

    /* JADX INFO: renamed from: H0 */
    public AudioPlayer m128939H0() {
        return this.f102211c;
    }

    /* JADX INFO: renamed from: I0 */
    public AudioPlayer.State m128940I0() {
        return this.f102220l;
    }

    /* JADX INFO: renamed from: J0 */
    public tnw m128941J0() {
        return this.f102215g;
    }

    /* JADX INFO: renamed from: N0 */
    public boolean m128942N0(long j) {
        return this.f102210b == j;
    }

    /* JADX INFO: renamed from: O0 */
    public boolean m128943O0() {
        return !m128942N0(f102209n);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m128944P0() {
        this.f102216h.release();
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m128945Q0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            act().postDelayed(this.f102214f, 500L);
            return;
        }
        if (c4470c != C4470c.f16271m) {
            if (c4470c == C4470c.f16268j) {
                m143372e0().mo50158l().m110949a3();
                return;
            }
            return;
        }
        act().removeCallbacks(this.f102214f);
        if (NullChecker.m82486a(this.f102216h)) {
            l51.m152919y(new Runnable() { // from class: l.b500
                @Override // java.lang.Runnable
                public final void run() {
                    this.f75011a.m128944P0();
                }
            });
        }
        if (NullChecker.m82486a(this.f102215g)) {
            this.f102215g.m191981j();
        }
        C13825a.m82554p().m82557l();
        if (NullChecker.m82486a(this.f102211c)) {
            this.f102211c.destroy();
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m128946R0(String str) {
        CoreModule.m30934Q().mo68436Zo().mo136902f(false);
        if (((i500) this.viewModel).m138617q()) {
            m128960h1();
            return;
        }
        m143372e0().mo50160u0().m143374g0().m138616p();
        if (NullChecker.m82486a(act().res)) {
            m143372e0().mo50158l().m110888M6(m128954b1().m191984m(), "audio/mp3", (m128954b1().m191990s() * 1.0f) / 1000.0f);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m128947S0() {
        m143372e0().mo50160u0().m143374g0().m138618u();
        CoreModule.m30934Q().mo68436Zo().mo136902f(true);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m128948U0(int i, int i2) {
        if (i2 == ((i500) this.viewModel).m138615n()) {
            m128956d1();
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m128949V0(uxj0 uxj0Var) {
        this.f102211c.stop();
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m128950W0(C4470c c4470c) {
        this.f102211c.stopIfNotInProximityMode();
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m128951X0() {
        r1j0.m179420g(act().getString(R$string.f21692d6));
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m128952Y0(Message message, View view, Boolean bool) {
        if (bool.booleanValue() && m143372e0().mo50158l().m110973e7(message.f56859id)) {
            sfj0.m185601h("e_chat_message_convert_to_text_initial_button", m143372e0().mo50158l().pageId(), new sfj0.C20032a[0]);
        }
        bnl0.m105524M(view, bool.booleanValue());
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        m128920L0();
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ Boolean m128953a1(Message message) throws Exception {
        return Boolean.valueOf(m143372e0().mo50158l().m110978f7(message));
    }

    /* JADX INFO: renamed from: b1 */
    public tnw m128954b1() {
        if (this.f102215g == null) {
            tnw tnwVar = new tnw();
            this.f102215g = tnwVar;
            tnwVar.m191996y(kl40.m150347e());
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(3);
            SoundPool soundPoolBuild = new SoundPool.Builder().setMaxStreams(3).setAudioAttributes(builder.build()).build();
            this.f102216h = soundPoolBuild;
            this.f102217i = soundPoolBuild.load(act(), tfc0.f173944c, 1);
            this.f102218j = this.f102216h.load(act(), tfc0.f173943b, 1);
            this.f102215g.m191978B(new tnw.InterfaceC20358e() { // from class: l.x400
                @Override // p153l.tnw.InterfaceC20358e
                /* JADX INFO: renamed from: a */
                public final void mo99477a(String str) {
                    this.f192325a.m128946R0(str);
                }
            });
            this.f102215g.m191977A(new tnw.InterfaceC20357d() { // from class: l.y400
                @Override // p153l.tnw.InterfaceC20357d
                public final void onStart() {
                    this.f197403a.m128947S0();
                }
            });
            this.f102215g.m191997z(new tnw.InterfaceC20356c() { // from class: l.z400
                @Override // p153l.tnw.InterfaceC20356c
                public final void onError(int i, int i2) {
                    this.f202890a.m128948U0(i, i2);
                }
            });
        }
        return this.f102215g;
    }

    /* JADX INFO: renamed from: c1 */
    public void m128955c1(Message message) {
        if (this.f102211c == null) {
            AudioPlayer audioPlayer = new AudioPlayer(act());
            this.f102211c = audioPlayer;
            audioPlayer.obs().subscribe((gcg0<? super AudioPlayer.State>) this.f102213e);
            duringCreated(VTexturePlayer.f210389x).subscribe(psd0.m173596G(new y20() { // from class: l.c500
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f79749a.m128949V0((uxj0) obj);
                }
            }));
            lifecycle().filter(new qcj() { // from class: l.d500
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4470c) obj) == C4470c.f16268j);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.e500
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f92172a.m128950W0((C4470c) obj);
                }
            }));
        }
        if (this.f102220l != AudioPlayer.State.stopped) {
            this.f102211c.stop();
        }
        this.f102210b = message._id;
        boolean z = false;
        this.f102221m = (message.owner.equals(CoreModule.m30929H().userId()) || message.audio().audioRead) ? false : true;
        if (!message.audio().audioRead && message.isOtherUser()) {
            CoreModule.f18264c.f20384f0.m33587An(message.f56859id);
        }
        AudioPlayer audioPlayer2 = this.f102211c;
        if (m143372e0().mo50158l().m110977f6() && this.f102221m) {
            z = true;
        }
        audioPlayer2.setNeedToPlayNext(z);
        this.f102211c.setError(new Runnable() { // from class: l.f500
            @Override // java.lang.Runnable
            public final void run() {
                this.f97179a.m128951X0();
            }
        });
        this.f102211c.play(uqb0.m197266d0(message.audio().format32()));
        m128957e1();
        if (CoreModule.m30933P().m143412i().mo180472g1() && m143372e0().mo50158l().m111010m4(message)) {
            m143372e0().mo50158l().m110875J6();
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void m128956d1() {
        m128954b1().m191981j();
        ((i500) this.viewModel).m138616p();
        m143372e0().mo50158l().m110949a3();
        CoreModule.m30934Q().mo68436Zo().mo136902f(false);
    }

    /* JADX INFO: renamed from: e1 */
    public final void m128957e1() {
        AudioManager audioManager = (AudioManager) act().getSystemService("audio");
        if (NullChecker.m82486a(audioManager) && audioManager.requestAudioFocus(null, 3, 2) == 1) {
            this.f102219k = true;
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void m128958f1() {
        m143372e0().mo50158l().m110888M6(m128941J0().m191984m(), "audio/mp3", (m128941J0().m191990s() * 1.0f) / 1000.0f);
    }

    /* JADX INFO: renamed from: g1 */
    public void m128959g1(final Message message, final View view) {
        m143372e0().mo50158l().m111048t7().m178953j0().mo68557c(act(), C22421c.fromCallable(new Callable() { // from class: l.v400
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f182322a.m128953a1(message);
            }
        }).compose(psd0.m173606Q())).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.w400
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187197a.m128952Y0(message, view, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h1 */
    public void m128960h1() {
        m128954b1();
        ((Vibrator) CoreModule.f18263b.getSystemService("vibrator")).vibrate(100L);
    }

    /* JADX INFO: renamed from: i1 */
    public void m128961i1() {
        if (NullChecker.m82486a(this.f102211c) && this.f102220l == AudioPlayer.State.playing) {
            this.f102211c.stop();
        }
    }

    /* JADX INFO: renamed from: l.g500$a */
    public class C17152a extends gcg0<AudioPlayer.State> {
        public C17152a() {
        }

        @Override // p153l.bb50
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void m137019l(AudioPlayer.State state) {
            if (g500.this.f102220l == state) {
                return;
            }
            g500.this.f102220l = state;
            if (state == AudioPlayer.State.stopped) {
                g500.this.f102210b = g500.f102209n;
                g500.this.f102221m = false;
                g500.this.m143372e0().mo50158l().m111048t7().m178888B1();
                g500.this.m128938G0();
                if (g500.this.f102212d) {
                    CoreModule.m30934Q().mo68436Zo().mo136902f(false);
                    return;
                }
                return;
            }
            AudioPlayer.State state2 = AudioPlayer.State.finished;
            g500 g500Var = g500.this;
            if (state != state2) {
                g500Var.m143372e0().mo50158l().m111048t7().m178888B1();
                return;
            }
            boolean z = g500Var.f102221m;
            g500 g500Var2 = g500.this;
            if (z) {
                Message messageM111053v3 = g500Var2.m143372e0().mo50158l().m111053v3(g500.this.f102210b);
                if (NullChecker.m82486a(messageM111053v3)) {
                    g500.this.m128955c1(messageM111053v3);
                    return;
                }
            } else {
                g500Var2.f102212d = true;
            }
            g500.this.f102211c.stop();
            g500.this.m128938G0();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            psd0.m173602M(th);
            CrashHelper.m82480d(new Exception("AudioPlayer error:" + th.getMessage(), th), 100);
        }

        @Override // p153l.bb50
        public void onCompleted() {
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
