package p149l;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Vibrator;
import android.view.View;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.media.AudioPlayer;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.proxy.api.C13662a;
import java.util.concurrent.Callable;
import p133rx.C22306c;
import p147v.VTexturePlayer;

/* JADX INFO: loaded from: classes4.dex */
public class jwz extends muy<lwz> {

    /* JADX INFO: renamed from: n */
    public static long f120156n = -1;

    /* JADX INFO: renamed from: b */
    public long f120157b;

    /* JADX INFO: renamed from: c */
    public AudioPlayer f120158c;

    /* JADX INFO: renamed from: d */
    public boolean f120159d;

    /* JADX INFO: renamed from: e */
    public z3g0<AudioPlayer.State> f120160e;

    /* JADX INFO: renamed from: f */
    public Runnable f120161f;

    /* JADX INFO: renamed from: g */
    public ukw f120162g;

    /* JADX INFO: renamed from: h */
    public SoundPool f120163h;

    /* JADX INFO: renamed from: i */
    public int f120164i;

    /* JADX INFO: renamed from: j */
    public int f120165j;

    /* JADX INFO: renamed from: k */
    public boolean f120166k;

    /* JADX INFO: renamed from: l */
    public AudioPlayer.State f120167l;

    /* JADX INFO: renamed from: m */
    public boolean f120168m;

    public jwz(mcr mcrVar) {
        super(mcrVar);
        this.f120157b = f120156n;
        this.f120160e = new C17884a();
        this.f120161f = new Runnable() { // from class: l.dwz
            @Override // java.lang.Runnable
            public final void run() {
                this.f88225a.m143739b1();
            }
        };
        this.f120167l = AudioPlayer.State.stopped;
        this.f120168m = false;
    }

    /* JADX INFO: renamed from: L0 */
    private void m143705L0() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.xvz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194680a.m143730Q0((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G0 */
    public final void m143723G0() {
        if (this.f120166k) {
            AudioManager audioManager = (AudioManager) act().getSystemService("audio");
            if (NullChecker.m81303a(audioManager)) {
                audioManager.abandonAudioFocus(null);
            }
            this.f120166k = false;
        }
    }

    /* JADX INFO: renamed from: H0 */
    public AudioPlayer m143724H0() {
        return this.f120158c;
    }

    /* JADX INFO: renamed from: I0 */
    public AudioPlayer.State m143725I0() {
        return this.f120167l;
    }

    /* JADX INFO: renamed from: J0 */
    public ukw m143726J0() {
        return this.f120162g;
    }

    /* JADX INFO: renamed from: N0 */
    public boolean m143727N0(long j) {
        return this.f120157b == j;
    }

    /* JADX INFO: renamed from: O0 */
    public boolean m143728O0() {
        return !m143727N0(f120156n);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m143729P0() {
        this.f120163h.release();
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m143730Q0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            act().postDelayed(this.f120161f, 500L);
            return;
        }
        if (c4319c != C4319c.f15552m) {
            if (c4319c == C4319c.f15549j) {
                m156455e0().mo48974l().m120743a3();
                return;
            }
            return;
        }
        act().removeCallbacks(this.f120161f);
        if (NullChecker.m81303a(this.f120163h)) {
            e51.m114774y(new Runnable() { // from class: l.ewz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f93560a.m143729P0();
                }
            });
        }
        if (NullChecker.m81303a(this.f120162g)) {
            this.f120162g.m194193j();
        }
        C13662a.m81371p().m81374l();
        if (NullChecker.m81303a(this.f120158c)) {
            this.f120158c.destroy();
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m143731R0(String str) {
        CoreModule.m29936Q().mo67253Zo().mo111895f(false);
        if (((lwz) this.viewModel).m152035q()) {
            m143745h1();
            return;
        }
        m156455e0().mo48976t0().m156457g0().m152034p();
        if (NullChecker.m81303a(act().res)) {
            m156455e0().mo48974l().m120682M6(m143739b1().m194196m(), "audio/mp3", (m143739b1().m194202s() * 1.0f) / 1000.0f);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m143732S0() {
        m156455e0().mo48976t0().m156457g0().m152036u();
        CoreModule.m29936Q().mo67253Zo().mo111895f(true);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m143733U0(int i, int i2) {
        if (i2 == ((lwz) this.viewModel).m152033n()) {
            m143741d1();
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m143734V0(roj0 roj0Var) {
        this.f120158c.stop();
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m143735W0(C4319c c4319c) {
        this.f120158c.stopIfNotInProximityMode();
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m143736X0() {
        osi0.m165783g(act().getString(R$string.f20950d6));
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m143737Y0(Message message, View view, Boolean bool) {
        if (bool.booleanValue() && m156455e0().mo48974l().m120767e7(message.f56011id)) {
            o6j0.m162864h("e_chat_message_convert_to_text_initial_button", m156455e0().mo48974l().pageId(), new o6j0.C18854a[0]);
        }
        xdl0.m208344M(view, bool.booleanValue());
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        m143705L0();
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ Boolean m143738a1(Message message) throws Exception {
        return Boolean.valueOf(m156455e0().mo48974l().m120772f7(message));
    }

    /* JADX INFO: renamed from: b1 */
    public ukw m143739b1() {
        if (this.f120162g == null) {
            ukw ukwVar = new ukw();
            this.f120162g = ukwVar;
            ukwVar.m194208y(wc40.m202628e());
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(3);
            SoundPool soundPoolBuild = new SoundPool.Builder().setMaxStreams(3).setAudioAttributes(builder.build()).build();
            this.f120163h = soundPoolBuild;
            this.f120164i = soundPoolBuild.load(act(), p7c0.f147490c, 1);
            this.f120165j = this.f120163h.load(act(), p7c0.f147489b, 1);
            this.f120162g.m194190B(new ukw.InterfaceC20452e() { // from class: l.awz
                @Override // p149l.ukw.InterfaceC20452e
                /* JADX INFO: renamed from: a */
                public final void mo99331a(String str) {
                    this.f72086a.m143731R0(str);
                }
            });
            this.f120162g.m194189A(new ukw.InterfaceC20451d() { // from class: l.bwz
                @Override // p149l.ukw.InterfaceC20451d
                public final void onStart() {
                    this.f77722a.m143732S0();
                }
            });
            this.f120162g.m194209z(new ukw.InterfaceC20450c() { // from class: l.cwz
                @Override // p149l.ukw.InterfaceC20450c
                public final void onError(int i, int i2) {
                    this.f82822a.m143733U0(i, i2);
                }
            });
        }
        return this.f120162g;
    }

    /* JADX INFO: renamed from: c1 */
    public void m143740c1(Message message) {
        if (this.f120158c == null) {
            AudioPlayer audioPlayer = new AudioPlayer(act());
            this.f120158c = audioPlayer;
            audioPlayer.obs().subscribe((z3g0<? super AudioPlayer.State>) this.f120160e);
            duringCreated(VTexturePlayer.f209467x).subscribe(mkd0.m154955G(new e30() { // from class: l.fwz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f99715a.m143734V0((roj0) obj);
                }
            }));
            lifecycle().filter(new w9j() { // from class: l.gwz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4319c) obj) == C4319c.f15549j);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.hwz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f109809a.m143735W0((C4319c) obj);
                }
            }));
        }
        if (this.f120167l != AudioPlayer.State.stopped) {
            this.f120158c.stop();
        }
        this.f120157b = message._id;
        boolean z = false;
        this.f120168m = (message.owner.equals(CoreModule.m29931H().userId()) || message.audio().audioRead) ? false : true;
        if (!message.audio().audioRead && message.isOtherUser()) {
            CoreModule.f17545c.f19642f0.m32584An(message.f56011id);
        }
        AudioPlayer audioPlayer2 = this.f120158c;
        if (m156455e0().mo48974l().m120771f6() && this.f120168m) {
            z = true;
        }
        audioPlayer2.setNeedToPlayNext(z);
        this.f120158c.setError(new Runnable() { // from class: l.iwz
            @Override // java.lang.Runnable
            public final void run() {
                this.f115317a.m143736X0();
            }
        });
        this.f120158c.play(qib0.m174812d0(message.audio().format32()));
        m143742e1();
        if (CoreModule.m29935P().m94658i().mo158380g1() && m156455e0().mo48974l().m120804m4(message)) {
            m156455e0().mo48974l().m120669J6();
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void m143741d1() {
        m143739b1().m194193j();
        ((lwz) this.viewModel).m152034p();
        m156455e0().mo48974l().m120743a3();
        CoreModule.m29936Q().mo67253Zo().mo111895f(false);
    }

    /* JADX INFO: renamed from: e1 */
    public final void m143742e1() {
        AudioManager audioManager = (AudioManager) act().getSystemService("audio");
        if (NullChecker.m81303a(audioManager) && audioManager.requestAudioFocus(null, 3, 2) == 1) {
            this.f120166k = true;
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void m143743f1() {
        m156455e0().mo48974l().m120682M6(m143726J0().m194196m(), "audio/mp3", (m143726J0().m194202s() * 1.0f) / 1000.0f);
    }

    /* JADX INFO: renamed from: g1 */
    public void m143744g1(final Message message, final View view) {
        m156455e0().mo48974l().m120842t7().m190310j0().mo67374c(act(), C22306c.fromCallable(new Callable() { // from class: l.yvz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f200303a.m143738a1(message);
            }
        }).compose(mkd0.m154965Q())).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.zvz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205084a.m143737Y0(message, view, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h1 */
    public void m143745h1() {
        m143739b1();
        ((Vibrator) CoreModule.f17544b.getSystemService("vibrator")).vibrate(100L);
    }

    /* JADX INFO: renamed from: i1 */
    public void m143746i1() {
        if (NullChecker.m81303a(this.f120158c) && this.f120167l == AudioPlayer.State.playing) {
            this.f120158c.stop();
        }
    }

    /* JADX INFO: renamed from: l.jwz$a */
    public class C17884a extends z3g0<AudioPlayer.State> {
        public C17884a() {
        }

        @Override // p149l.m250
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void m132487l(AudioPlayer.State state) {
            if (jwz.this.f120167l == state) {
                return;
            }
            jwz.this.f120167l = state;
            if (state == AudioPlayer.State.stopped) {
                jwz.this.f120157b = jwz.f120156n;
                jwz.this.f120168m = false;
                jwz.this.m156455e0().mo48974l().m120842t7().m190248B1();
                jwz.this.m143723G0();
                if (jwz.this.f120159d) {
                    CoreModule.m29936Q().mo67253Zo().mo111895f(false);
                    return;
                }
                return;
            }
            AudioPlayer.State state2 = AudioPlayer.State.finished;
            jwz jwzVar = jwz.this;
            if (state != state2) {
                jwzVar.m156455e0().mo48974l().m120842t7().m190248B1();
                return;
            }
            boolean z = jwzVar.f120168m;
            jwz jwzVar2 = jwz.this;
            if (z) {
                Message messageM120847v3 = jwzVar2.m156455e0().mo48974l().m120847v3(jwz.this.f120157b);
                if (NullChecker.m81303a(messageM120847v3)) {
                    jwz.this.m143740c1(messageM120847v3);
                    return;
                }
            } else {
                jwzVar2.f120159d = true;
            }
            jwz.this.f120158c.stop();
            jwz.this.m143723G0();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            mkd0.m154961M(th);
            CrashHelper.m81297d(new Exception("AudioPlayer error:" + th.getMessage(), th), 100);
        }

        @Override // p149l.m250
        public void onCompleted() {
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
