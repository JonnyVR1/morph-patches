package p007l;

import android.app.Activity;
import android.media.AudioManager;
import android.text.TextUtils;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.helper.audioplayer.FeedAudioCanWorkControl;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.e51;
import l.g30;
import l.iwl;
import l.lsi0;
import l.thh0;
import l.vwb;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class wng {

    /* JADX INFO: renamed from: m */
    public static volatile wng f14635m;

    /* JADX INFO: renamed from: a */
    public iwl f14636a;

    /* JADX INFO: renamed from: b */
    public Moment f14637b;

    /* JADX INFO: renamed from: c */
    public Activity f14638c;

    /* JADX INFO: renamed from: d */
    public String f14639d;

    /* JADX INFO: renamed from: e */
    public String f14640e;

    /* JADX INFO: renamed from: f */
    public List<yng> f14641f;

    /* JADX INFO: renamed from: g */
    public xng f14642g;

    /* JADX INFO: renamed from: h */
    public AudioManager.OnAudioFocusChangeListener f14643h;

    /* JADX INFO: renamed from: i */
    public boolean f14644i;

    /* JADX INFO: renamed from: j */
    public Runnable f14645j;

    /* JADX INFO: renamed from: k */
    public boolean f14646k;

    /* JADX INFO: renamed from: l */
    public b<String> f14647l;

    public wng() {
        m15857B();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15843a(yng yngVar) {
        if (NullChecker.a(yngVar)) {
            yngVar.onStart();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m15844b(yng yngVar) {
        if (NullChecker.a(yngVar)) {
            yngVar.onComplete();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m15845c(yng yngVar) {
        if (NullChecker.a(yngVar)) {
            yngVar.mo7504h();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m15846d(boolean z, yng yngVar) {
        if (NullChecker.a(yngVar)) {
            yngVar.mo7452i(z);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m15849g(yng yngVar) {
        if (NullChecker.a(yngVar)) {
            yngVar.onPause();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m15850h(Exception exc, yng yngVar) {
        if (NullChecker.a(yngVar)) {
            yngVar.mo7451a(exc);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m15851i(yng yngVar) {
        if (NullChecker.a(yngVar)) {
            yngVar.onResume();
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m15852j(float f, yng yngVar) {
        if (NullChecker.a(yngVar)) {
            yngVar.mo7453j(f);
        }
    }

    /* JADX INFO: renamed from: v */
    public static wng m15855v() {
        if (f14635m == null) {
            synchronized (wng.class) {
                try {
                    if (f14635m == null) {
                        f14635m = new wng();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14635m;
    }

    /* JADX INFO: renamed from: A */
    public final void m15856A() {
        xng xngVar = this.f14642g;
        if (xngVar == null) {
            this.f14642g = new xng(this.f14638c, this.f14637b);
        } else {
            xngVar.m16799e(this.f14637b);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m15857B() {
        this.f14641f = new ArrayList();
        this.f14647l = b.b();
    }

    /* JADX INFO: renamed from: C */
    public final void m15858C() {
        thh0 thh0Var = new thh0();
        this.f14636a = thh0Var;
        thh0Var.b(new e30() { // from class: l.rng
            public final void call(Object obj) {
                this.f12700a.m15874S(obj);
            }
        });
        this.f14636a.a(new g30() { // from class: l.sng
            /* JADX INFO: renamed from: a */
            public final void m14277a(Object obj, Object obj2, Object obj3) {
                this.f13018a.m15870O(obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
        this.f14636a.c(new g30() { // from class: l.tng
            /* JADX INFO: renamed from: a */
            public final void m14575a(Object obj, Object obj2, Object obj3) {
                this.f13347a.m15869N(obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
        this.f14636a.d(new e30() { // from class: l.ung
            public final void call(Object obj) {
                this.f13892a.m15867L(obj);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public boolean m15859D() {
        return m15860E() || m15861F();
    }

    /* JADX INFO: renamed from: E */
    public boolean m15860E() {
        return NullChecker.a(this.f14636a) && this.f14636a.isPlaying();
    }

    /* JADX INFO: renamed from: F */
    public final boolean m15861F() {
        return !TextUtils.isEmpty(this.f14640e);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m15862G() {
        try {
            if (TextUtils.isEmpty(this.f14639d) || !this.f14646k) {
                return;
            }
            m15880Y(this.f14639d);
            this.f14646k = false;
        } catch (IOException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m15863H(int i) {
        if (i == -3 || i == -2) {
            e51.G(new Runnable() { // from class: l.vng
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14252a.m15864I();
                }
            });
        } else if (i == -1) {
            e51.G(new Runnable() { // from class: l.gng
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8486a.m15891j0();
                }
            });
        } else {
            if (i != 1) {
                return;
            }
            e51.G(new Runnable() { // from class: l.hng
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8779a.m15862G();
                }
            });
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m15864I() {
        m15879X();
        this.f14646k = true;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m15865J() {
        m15890i0();
        m15875T(this.f14636a.getCurrentPosition());
    }

    /* JADX INFO: renamed from: K */
    public void m15866K() {
        vwb.z(m15904y(), new e30() { // from class: l.jng
            public final void call(Object obj) {
                wng.m15844b((yng) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public void m15867L(Object obj) {
        m15866K();
        m15873R();
        m15897q();
    }

    /* JADX INFO: renamed from: M */
    public void m15868M(final Exception exc) {
        vwb.z(m15904y(), new e30() { // from class: l.kng
            public final void call(Object obj) {
                wng.m15850h(exc, (yng) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public boolean m15869N(Object obj, int i, int i2) {
        lsi0.i(R$string.f467Y0, true);
        m15868M(new IllegalStateException(i + "" + i2));
        m15873R();
        m15897q();
        return true;
    }

    /* JADX INFO: renamed from: O */
    public boolean m15870O(Object obj, int i, int i2) {
        if (i == 701) {
            m15871P();
            return true;
        }
        if (i != 702) {
            return false;
        }
        m15876U();
        return true;
    }

    /* JADX INFO: renamed from: P */
    public void m15871P() {
        vwb.z(m15904y(), new e30() { // from class: l.png
            public final void call(Object obj) {
                wng.m15845c((yng) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public void m15872Q() {
        vwb.z(m15904y(), new e30() { // from class: l.mng
            public final void call(Object obj) {
                wng.m15849g((yng) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final void m15873R() {
        m15892k0();
        m15883b0();
        this.f14641f.clear();
        eb1.m9688a(m15900t());
    }

    /* JADX INFO: renamed from: S */
    public void m15874S(Object obj) {
        if (m15905z()) {
            m15898r(this.f14640e);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m15875T(final float f) {
        vwb.z(m15904y(), new e30() { // from class: l.ing
            public final void call(Object obj) {
                wng.m15852j(f, (yng) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public void m15876U() {
        vwb.z(m15904y(), new e30() { // from class: l.lng
            public final void call(Object obj) {
                wng.m15851i((yng) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public void m15877V() {
        vwb.z(m15904y(), new e30() { // from class: l.qng
            public final void call(Object obj) {
                wng.m15843a((yng) obj);
            }
        });
        m15890i0();
    }

    /* JADX INFO: renamed from: W */
    public void m15878W(final boolean z) {
        vwb.z(m15904y(), new e30() { // from class: l.ong
            public final void call(Object obj) {
                wng.m15846d(z, (yng) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public void m15879X() {
        m15882a0();
        if (m15860E()) {
            this.f14636a.pause();
            m15872Q();
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m15880Y(String str) throws IOException {
        m15881Z(str, null);
    }

    /* JADX INFO: renamed from: Z */
    public void m15881Z(String str, yng yngVar) throws IOException {
        if (m15887f0(str) && FeedAudioCanWorkControl.m1844a()) {
            if (this.f14636a == null) {
                m15858C();
            }
            if (m15888g0(str)) {
                m15898r(str);
                return;
            }
            m15895o();
            m15893m(yngVar);
            m15856A();
            this.f14640e = str;
            m15871P();
            this.f14636a.reset();
            this.f14636a.setDataSource(str);
            this.f14636a.prepareAsync();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m15882a0() {
        this.f14640e = "";
    }

    /* JADX INFO: renamed from: b0 */
    public final void m15883b0() {
        this.f14639d = "";
    }

    /* JADX INFO: renamed from: c0 */
    public wng m15884c0(Moment moment) {
        this.f14637b = moment;
        return this;
    }

    /* JADX INFO: renamed from: d0 */
    public wng m15885d0(Activity activity) {
        this.f14638c = activity;
        return this;
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m15886e0(String str) {
        return m15888g0(str) || m15889h0(str);
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m15887f0(String str) {
        return !TextUtils.equals(str, this.f14640e);
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m15888g0(String str) {
        String str2 = this.f14639d;
        return str2 != null && str2.equals(str);
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m15889h0(String str) {
        String str2 = this.f14640e;
        return str2 != null && str2.equals(str);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m15890i0() {
        this.f14644i = true;
        e51.H(FeedModule.f313a, m15902w(), 1000L);
    }

    /* JADX INFO: renamed from: j0 */
    public void m15891j0() {
        if (m15859D()) {
            m15878W(false);
            if (m15860E()) {
                m15899s();
            } else {
                m15873R();
            }
            m15897q();
        }
        m15882a0();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m15892k0() {
        if (this.f14644i) {
            e51.J(m15902w());
        }
        this.f14644i = false;
    }

    /* JADX INFO: renamed from: m */
    public wng m15893m(yng yngVar) {
        if (NullChecker.a(yngVar) && !this.f14641f.contains(yngVar)) {
            this.f14641f.add(yngVar);
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final void m15894n(List<yng> list) {
        list.add(this.f14642g);
    }

    /* JADX INFO: renamed from: o */
    public final void m15895o() {
        if (m15860E()) {
            m15878W(true);
            m15899s();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m15896p() {
        if (NullChecker.a(this.f14642g)) {
            this.f14642g.m16796b();
            this.f14642g = null;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m15897q() {
        m15896p();
        this.f14638c = null;
    }

    /* JADX INFO: renamed from: r */
    public final void m15898r(String str) {
        m15882a0();
        if (eb1.m9689b(m15900t(), 1)) {
            this.f14639d = str;
            this.f14636a.start();
            m15877V();
            this.f14647l.onNext(str);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m15899s() {
        this.f14636a.stop();
        m15873R();
    }

    /* JADX INFO: renamed from: t */
    public AudioManager.OnAudioFocusChangeListener m15900t() {
        if (this.f14643h == null) {
            this.f14643h = new AudioManager.OnAudioFocusChangeListener() { // from class: l.fng
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i) {
                    this.f8169a.m15863H(i);
                }
            };
        }
        return this.f14643h;
    }

    /* JADX INFO: renamed from: u */
    public String m15901u() {
        return NullChecker.a(this.f14637b) ? ((DbObject) this.f14637b).id : "";
    }

    /* JADX INFO: renamed from: w */
    public final Runnable m15902w() {
        if (this.f14645j == null) {
            this.f14645j = new Runnable() { // from class: l.nng
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10839a.m15865J();
                }
            };
        }
        return this.f14645j;
    }

    /* JADX INFO: renamed from: x */
    public b<String> m15903x() {
        return this.f14647l;
    }

    /* JADX INFO: renamed from: y */
    public final List<yng> m15904y() {
        ArrayList arrayList = new ArrayList(this.f14641f);
        m15894n(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m15905z() {
        return !TextUtils.isEmpty(this.f14640e);
    }
}
