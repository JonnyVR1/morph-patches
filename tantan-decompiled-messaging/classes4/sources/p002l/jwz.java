package p002l;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Vibrator;
import android.view.View;
import com.p1.mobile.android.app.c;
import com.p1.mobile.android.media.AudioPlayer;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.proxy.api.a;
import java.util.concurrent.Callable;
import l.e30;
import l.e51;
import l.jo0;
import l.jq2;
import l.lwz;
import l.mcr;
import l.mkd0;
import l.muy;
import l.o6j0;
import l.osi0;
import l.p7c0;
import l.qib0;
import l.roj0;
import l.ukw;
import l.w9j;
import l.wc40;
import l.xdl0;
import l.z3g0;
import v.VTexturePlayer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jwz extends muy<lwz> {

    /* JADX INFO: renamed from: n */
    public static long f14104n = -1;

    /* JADX INFO: renamed from: b */
    public long f14105b;

    /* JADX INFO: renamed from: c */
    public AudioPlayer f14106c;

    /* JADX INFO: renamed from: d */
    public boolean f14107d;

    /* JADX INFO: renamed from: e */
    public z3g0<AudioPlayer.State> f14108e;

    /* JADX INFO: renamed from: f */
    public Runnable f14109f;

    /* JADX INFO: renamed from: g */
    public ukw f14110g;

    /* JADX INFO: renamed from: h */
    public SoundPool f14111h;

    /* JADX INFO: renamed from: i */
    public int f14112i;

    /* JADX INFO: renamed from: j */
    public int f14113j;

    /* JADX INFO: renamed from: k */
    public boolean f14114k;

    /* JADX INFO: renamed from: l */
    public AudioPlayer.State f14115l;

    /* JADX INFO: renamed from: m */
    public boolean f14116m;

    public jwz(mcr mcrVar) {
        super(mcrVar);
        this.f14105b = f14104n;
        this.f14108e = new C0646a();
        this.f14109f = new Runnable() { // from class: l.dwz
            @Override // java.lang.Runnable
            public final void run() {
                this.f9469a.m16438b1();
            }
        };
        this.f14115l = AudioPlayer.State.stopped;
        this.f14116m = false;
    }

    /* JADX INFO: renamed from: L0 */
    private void m16403L0() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.xvz
            public final void call(Object obj) {
                this.f22485a.m16428Q0((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G0 */
    public final void m16421G0() {
        if (this.f14114k) {
            AudioManager audioManager = (AudioManager) act().getSystemService("audio");
            if (NullChecker.a(audioManager)) {
                audioManager.abandonAudioFocus(null);
            }
            this.f14114k = false;
        }
    }

    /* JADX INFO: renamed from: H0 */
    public AudioPlayer m16422H0() {
        return this.f14106c;
    }

    /* JADX INFO: renamed from: I0 */
    public AudioPlayer.State m16423I0() {
        return this.f14115l;
    }

    /* JADX INFO: renamed from: J0 */
    public ukw m16424J0() {
        return this.f14110g;
    }

    /* JADX INFO: renamed from: N0 */
    public boolean m16425N0(long j) {
        return this.f14105b == j;
    }

    /* JADX INFO: renamed from: O0 */
    public boolean m16426O0() {
        return !m16425N0(f14104n);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m16427P0() {
        this.f14111h.release();
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m16428Q0(c cVar) {
        if (cVar == c.i) {
            act().postDelayed(this.f14109f, 500L);
            return;
        }
        if (cVar != c.m) {
            if (cVar == c.j) {
                e0().l().a3();
                return;
            }
            return;
        }
        act().removeCallbacks(this.f14109f);
        if (NullChecker.a(this.f14111h)) {
            e51.y(new Runnable() { // from class: l.ewz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10036a.m16427P0();
                }
            });
        }
        if (NullChecker.a(this.f14110g)) {
            this.f14110g.j();
        }
        a.p().l();
        if (NullChecker.a(this.f14106c)) {
            this.f14106c.destroy();
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m16429R0(String str) {
        CoreModule.Q().Zo().f(false);
        if (((jq2) this).viewModel.q()) {
            m16444h1();
            return;
        }
        e0().t0().g0().p();
        if (NullChecker.a(act().res)) {
            e0().l().M6(m16438b1().m(), "audio/mp3", (m16438b1().s() * 1.0f) / 1000.0f);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m16430S0() {
        e0().t0().g0().u();
        CoreModule.Q().Zo().f(true);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m16431U0(int i, int i2) {
        if (i2 == ((jq2) this).viewModel.n()) {
            m16440d1();
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m16432V0(roj0 roj0Var) {
        this.f14106c.stop();
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m16433W0(c cVar) {
        this.f14106c.stopIfNotInProximityMode();
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m16434X0() {
        osi0.g(act().getString(R.string.d6));
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m16435Y0(Message message, View view, Boolean bool) {
        if (bool.booleanValue() && e0().l().e7(((DbObject) message).id)) {
            o6j0.h("e_chat_message_convert_to_text_initial_button", e0().l().pageId(), new o6j0.a[0]);
        }
        xdl0.M(view, bool.booleanValue());
    }

    /* JADX INFO: renamed from: a0 */
    public void m16436a0() {
        super/*l.jq2*/.a0();
        m16403L0();
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ Boolean m16437a1(Message message) throws Exception {
        return Boolean.valueOf(e0().l().f7(message));
    }

    /* JADX INFO: renamed from: b1 */
    public ukw m16438b1() {
        if (this.f14110g == null) {
            ukw ukwVar = new ukw();
            this.f14110g = ukwVar;
            ukwVar.y(wc40.e());
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(3);
            SoundPool soundPoolBuild = new SoundPool.Builder().setMaxStreams(3).setAudioAttributes(builder.build()).build();
            this.f14111h = soundPoolBuild;
            this.f14112i = soundPoolBuild.load(act(), p7c0.c, 1);
            this.f14113j = this.f14111h.load(act(), p7c0.b, 1);
            this.f14110g.B(new ukw.e() { // from class: l.awz
                /* JADX INFO: renamed from: a */
                public final void m10086a(String str) {
                    this.f7910a.m16429R0(str);
                }
            });
            this.f14110g.A(new ukw.d() { // from class: l.bwz
                public final void onStart() {
                    this.f8398a.m16430S0();
                }
            });
            this.f14110g.z(new ukw.c() { // from class: l.cwz
                public final void onError(int i, int i2) {
                    this.f8966a.m16431U0(i, i2);
                }
            });
        }
        return this.f14110g;
    }

    /* JADX INFO: renamed from: c1 */
    public void m16439c1(Message message) {
        if (this.f14106c == null) {
            AudioPlayer audioPlayer = new AudioPlayer(act());
            this.f14106c = audioPlayer;
            audioPlayer.obs().subscribe(this.f14108e);
            duringCreated(VTexturePlayer.x).subscribe(mkd0.G(new e30() { // from class: l.fwz
                public final void call(Object obj) {
                    this.f10673a.m16432V0((roj0) obj);
                }
            }));
            lifecycle().filter(new w9j() { // from class: l.gwz
                public final Object call(Object obj) {
                    return Boolean.valueOf(((c) obj) == c.j);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.hwz
                public final void call(Object obj) {
                    this.f12320a.m16433W0((c) obj);
                }
            }));
        }
        if (this.f14115l != AudioPlayer.State.stopped) {
            this.f14106c.stop();
        }
        this.f14105b = ((DbObject) message)._id;
        boolean z = false;
        this.f14116m = (message.owner.equals(CoreModule.H().userId()) || message.audio().audioRead) ? false : true;
        if (!message.audio().audioRead && message.isOtherUser()) {
            CoreModule.c.f0.An(((DbObject) message).id);
        }
        AudioPlayer audioPlayer2 = this.f14106c;
        if (e0().l().f6() && this.f14116m) {
            z = true;
        }
        audioPlayer2.setNeedToPlayNext(z);
        this.f14106c.setError(new Runnable() { // from class: l.iwz
            @Override // java.lang.Runnable
            public final void run() {
                this.f13460a.m16434X0();
            }
        });
        this.f14106c.play(qib0.d0(message.audio().format32()));
        m16441e1();
        if (CoreModule.P().i().g1() && e0().l().m4(message)) {
            e0().l().J6();
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void m16440d1() {
        m16438b1().j();
        ((jq2) this).viewModel.p();
        e0().l().a3();
        CoreModule.Q().Zo().f(false);
    }

    /* JADX INFO: renamed from: e1 */
    public final void m16441e1() {
        AudioManager audioManager = (AudioManager) act().getSystemService("audio");
        if (NullChecker.a(audioManager) && audioManager.requestAudioFocus(null, 3, 2) == 1) {
            this.f14114k = true;
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void m16442f1() {
        e0().l().M6(m16424J0().m(), "audio/mp3", (m16424J0().s() * 1.0f) / 1000.0f);
    }

    /* JADX INFO: renamed from: g1 */
    public void m16443g1(final Message message, final View view) {
        e0().l().t7().j0().m19173c(act(), rx.c.fromCallable(new Callable() { // from class: l.yvz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f23124a.m16437a1(message);
            }
        }).compose(mkd0.Q())).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.zvz
            public final void call(Object obj) {
                this.f23647a.m16435Y0(message, view, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h1 */
    public void m16444h1() {
        m16438b1();
        ((Vibrator) CoreModule.b.getSystemService("vibrator")).vibrate(100L);
    }

    /* JADX INFO: renamed from: i1 */
    public void m16445i1() {
        if (NullChecker.a(this.f14106c) && this.f14115l == AudioPlayer.State.playing) {
            this.f14106c.stop();
        }
    }

    /* JADX INFO: renamed from: l.jwz$a */
    public class C0646a extends z3g0<AudioPlayer.State> {
        public C0646a() {
        }

        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onNext(AudioPlayer.State state) {
            if (jwz.this.f14115l == state) {
                return;
            }
            jwz.this.f14115l = state;
            if (state == AudioPlayer.State.stopped) {
                jwz.this.f14105b = jwz.f14104n;
                jwz.this.f14116m = false;
                jwz.this.e0().l().t7().B1();
                jwz.this.m16421G0();
                if (jwz.this.f14107d) {
                    CoreModule.Q().Zo().f(false);
                    return;
                }
                return;
            }
            AudioPlayer.State state2 = AudioPlayer.State.finished;
            jwz jwzVar = jwz.this;
            if (state != state2) {
                jwzVar.e0().l().t7().B1();
                return;
            }
            boolean z = jwzVar.f14116m;
            jwz jwzVar2 = jwz.this;
            if (z) {
                Message messageV3 = jwzVar2.e0().l().v3(jwz.this.f14105b);
                if (NullChecker.a(messageV3)) {
                    jwz.this.m16439c1(messageV3);
                    return;
                }
            } else {
                jwzVar2.f14107d = true;
            }
            jwz.this.f14106c.stop();
            jwz.this.m16421G0();
        }

        public void onError(Throwable th) {
            mkd0.M(th);
            CrashHelper.d(new Exception("AudioPlayer error:" + th.getMessage(), th), 100);
        }

        public void onCompleted() {
        }
    }

    public void destroy() {
    }
}
