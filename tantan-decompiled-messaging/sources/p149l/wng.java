package p149l;

import android.app.Activity;
import android.media.AudioManager;
import android.text.TextUtils;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.helper.audioplayer.FeedAudioCanWorkControl;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes12.dex */
public class wng {

    /* JADX INFO: renamed from: m */
    public static volatile wng f187295m;

    /* JADX INFO: renamed from: a */
    public iwl f187296a;

    /* JADX INFO: renamed from: b */
    public Moment f187297b;

    /* JADX INFO: renamed from: c */
    public Activity f187298c;

    /* JADX INFO: renamed from: d */
    public String f187299d;

    /* JADX INFO: renamed from: e */
    public String f187300e;

    /* JADX INFO: renamed from: f */
    public List<yng> f187301f;

    /* JADX INFO: renamed from: g */
    public xng f187302g;

    /* JADX INFO: renamed from: h */
    public AudioManager.OnAudioFocusChangeListener f187303h;

    /* JADX INFO: renamed from: i */
    public boolean f187304i;

    /* JADX INFO: renamed from: j */
    public Runnable f187305j;

    /* JADX INFO: renamed from: k */
    public boolean f187306k;

    /* JADX INFO: renamed from: l */
    public C22393b<String> f187307l;

    public wng() {
        m204697B();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m204683a(yng yngVar) {
        if (NullChecker.m81303a(yngVar)) {
            yngVar.onStart();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m204684b(yng yngVar) {
        if (NullChecker.m81303a(yngVar)) {
            yngVar.onComplete();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m204685c(yng yngVar) {
        if (NullChecker.m81303a(yngVar)) {
            yngVar.mo66339h();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m204686d(boolean z, yng yngVar) {
        if (NullChecker.m81303a(yngVar)) {
            yngVar.mo66292i(z);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m204689g(yng yngVar) {
        if (NullChecker.m81303a(yngVar)) {
            yngVar.onPause();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m204690h(Exception exc, yng yngVar) {
        if (NullChecker.m81303a(yngVar)) {
            yngVar.mo66291a(exc);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m204691i(yng yngVar) {
        if (NullChecker.m81303a(yngVar)) {
            yngVar.onResume();
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m204692j(float f, yng yngVar) {
        if (NullChecker.m81303a(yngVar)) {
            yngVar.mo66293j(f);
        }
    }

    /* JADX INFO: renamed from: v */
    public static wng m204695v() {
        if (f187295m == null) {
            synchronized (wng.class) {
                try {
                    if (f187295m == null) {
                        f187295m = new wng();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f187295m;
    }

    /* JADX INFO: renamed from: A */
    public final void m204696A() {
        xng xngVar = this.f187302g;
        if (xngVar == null) {
            this.f187302g = new xng(this.f187298c, this.f187297b);
        } else {
            xngVar.m210161e(this.f187297b);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m204697B() {
        this.f187301f = new ArrayList();
        this.f187307l = C22393b.m221521b();
    }

    /* JADX INFO: renamed from: C */
    public final void m204698C() {
        thh0 thh0Var = new thh0();
        this.f187296a = thh0Var;
        thh0Var.mo138751b(new e30() { // from class: l.rng
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160267a.m204714S(obj);
            }
        });
        this.f187296a.mo138750a(new g30() { // from class: l.sng
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                this.f165451a.m204710O(obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
        this.f187296a.mo138752c(new g30() { // from class: l.tng
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                this.f171231a.m204709N(obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
        this.f187296a.mo138753d(new e30() { // from class: l.ung
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177365a.m204707L(obj);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public boolean m204699D() {
        return m204700E() || m204701F();
    }

    /* JADX INFO: renamed from: E */
    public boolean m204700E() {
        return NullChecker.m81303a(this.f187296a) && this.f187296a.isPlaying();
    }

    /* JADX INFO: renamed from: F */
    public final boolean m204701F() {
        return !TextUtils.isEmpty(this.f187300e);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m204702G() {
        try {
            if (TextUtils.isEmpty(this.f187299d) || !this.f187306k) {
                return;
            }
            m204720Y(this.f187299d);
            this.f187306k = false;
        } catch (IOException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m204703H(int i) {
        if (i == -3 || i == -2) {
            e51.m114742G(new Runnable() { // from class: l.vng
                @Override // java.lang.Runnable
                public final void run() {
                    this.f182243a.m204704I();
                }
            });
        } else if (i == -1) {
            e51.m114742G(new Runnable() { // from class: l.gng
                @Override // java.lang.Runnable
                public final void run() {
                    this.f103597a.m204731j0();
                }
            });
        } else {
            if (i != 1) {
                return;
            }
            e51.m114742G(new Runnable() { // from class: l.hng
                @Override // java.lang.Runnable
                public final void run() {
                    this.f108627a.m204702G();
                }
            });
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m204704I() {
        m204719X();
        this.f187306k = true;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m204705J() {
        m204730i0();
        m204715T(this.f187296a.getCurrentPosition());
    }

    /* JADX INFO: renamed from: K */
    public void m204706K() {
        vwb.m200354z(m204744y(), new e30() { // from class: l.jng
            @Override // p149l.e30
            public final void call(Object obj) {
                wng.m204684b((yng) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public void m204707L(Object obj) {
        m204706K();
        m204713R();
        m204737q();
    }

    /* JADX INFO: renamed from: M */
    public void m204708M(final Exception exc) {
        vwb.m200354z(m204744y(), new e30() { // from class: l.kng
            @Override // p149l.e30
            public final void call(Object obj) {
                wng.m204690h(exc, (yng) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public boolean m204709N(Object obj, int i, int i2) {
        lsi0.m151579i(R$string.f39006Y0, true);
        m204708M(new IllegalStateException(i + "" + i2));
        m204713R();
        m204737q();
        return true;
    }

    /* JADX INFO: renamed from: O */
    public boolean m204710O(Object obj, int i, int i2) {
        if (i == 701) {
            m204711P();
            return true;
        }
        if (i != 702) {
            return false;
        }
        m204716U();
        return true;
    }

    /* JADX INFO: renamed from: P */
    public void m204711P() {
        vwb.m200354z(m204744y(), new e30() { // from class: l.png
            @Override // p149l.e30
            public final void call(Object obj) {
                wng.m204685c((yng) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public void m204712Q() {
        vwb.m200354z(m204744y(), new e30() { // from class: l.mng
            @Override // p149l.e30
            public final void call(Object obj) {
                wng.m204689g((yng) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final void m204713R() {
        m204732k0();
        m204723b0();
        this.f187301f.clear();
        eb1.m115446a(m204740t());
    }

    /* JADX INFO: renamed from: S */
    public void m204714S(Object obj) {
        if (m204745z()) {
            m204738r(this.f187300e);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m204715T(final float f) {
        vwb.m200354z(m204744y(), new e30() { // from class: l.ing
            @Override // p149l.e30
            public final void call(Object obj) {
                wng.m204692j(f, (yng) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public void m204716U() {
        vwb.m200354z(m204744y(), new e30() { // from class: l.lng
            @Override // p149l.e30
            public final void call(Object obj) {
                wng.m204691i((yng) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public void m204717V() {
        vwb.m200354z(m204744y(), new e30() { // from class: l.qng
            @Override // p149l.e30
            public final void call(Object obj) {
                wng.m204683a((yng) obj);
            }
        });
        m204730i0();
    }

    /* JADX INFO: renamed from: W */
    public void m204718W(final boolean z) {
        vwb.m200354z(m204744y(), new e30() { // from class: l.ong
            @Override // p149l.e30
            public final void call(Object obj) {
                wng.m204686d(z, (yng) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public void m204719X() {
        m204722a0();
        if (m204700E()) {
            this.f187296a.pause();
            m204712Q();
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m204720Y(String str) throws IOException {
        m204721Z(str, null);
    }

    /* JADX INFO: renamed from: Z */
    public void m204721Z(String str, yng yngVar) throws IOException {
        if (m204727f0(str) && FeedAudioCanWorkControl.m60918a()) {
            if (this.f187296a == null) {
                m204698C();
            }
            if (m204728g0(str)) {
                m204738r(str);
                return;
            }
            m204735o();
            m204733m(yngVar);
            m204696A();
            this.f187300e = str;
            m204711P();
            this.f187296a.reset();
            this.f187296a.setDataSource(str);
            this.f187296a.prepareAsync();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m204722a0() {
        this.f187300e = "";
    }

    /* JADX INFO: renamed from: b0 */
    public final void m204723b0() {
        this.f187299d = "";
    }

    /* JADX INFO: renamed from: c0 */
    public wng m204724c0(Moment moment) {
        this.f187297b = moment;
        return this;
    }

    /* JADX INFO: renamed from: d0 */
    public wng m204725d0(Activity activity) {
        this.f187298c = activity;
        return this;
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m204726e0(String str) {
        return m204728g0(str) || m204729h0(str);
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m204727f0(String str) {
        return !TextUtils.equals(str, this.f187300e);
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m204728g0(String str) {
        String str2 = this.f187299d;
        return str2 != null && str2.equals(str);
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m204729h0(String str) {
        String str2 = this.f187300e;
        return str2 != null && str2.equals(str);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m204730i0() {
        this.f187304i = true;
        e51.m114743H(FeedModule.f38852a, m204742w(), 1000L);
    }

    /* JADX INFO: renamed from: j0 */
    public void m204731j0() {
        if (m204699D()) {
            m204718W(false);
            if (m204700E()) {
                m204739s();
            } else {
                m204713R();
            }
            m204737q();
        }
        m204722a0();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m204732k0() {
        if (this.f187304i) {
            e51.m114745J(m204742w());
        }
        this.f187304i = false;
    }

    /* JADX INFO: renamed from: m */
    public wng m204733m(yng yngVar) {
        if (NullChecker.m81303a(yngVar) && !this.f187301f.contains(yngVar)) {
            this.f187301f.add(yngVar);
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final void m204734n(List<yng> list) {
        list.add(this.f187302g);
    }

    /* JADX INFO: renamed from: o */
    public final void m204735o() {
        if (m204700E()) {
            m204718W(true);
            m204739s();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m204736p() {
        if (NullChecker.m81303a(this.f187302g)) {
            this.f187302g.m210158b();
            this.f187302g = null;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m204737q() {
        m204736p();
        this.f187298c = null;
    }

    /* JADX INFO: renamed from: r */
    public final void m204738r(String str) {
        m204722a0();
        if (eb1.m115447b(m204740t(), 1)) {
            this.f187299d = str;
            this.f187296a.start();
            m204717V();
            this.f187307l.onNext(str);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m204739s() {
        this.f187296a.stop();
        m204713R();
    }

    /* JADX INFO: renamed from: t */
    public AudioManager.OnAudioFocusChangeListener m204740t() {
        if (this.f187303h == null) {
            this.f187303h = new AudioManager.OnAudioFocusChangeListener() { // from class: l.fng
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i) {
                    this.f98416a.m204703H(i);
                }
            };
        }
        return this.f187303h;
    }

    /* JADX INFO: renamed from: u */
    public String m204741u() {
        return NullChecker.m81303a(this.f187297b) ? this.f187297b.f56011id : "";
    }

    /* JADX INFO: renamed from: w */
    public final Runnable m204742w() {
        if (this.f187305j == null) {
            this.f187305j = new Runnable() { // from class: l.nng
                @Override // java.lang.Runnable
                public final void run() {
                    this.f139727a.m204705J();
                }
            };
        }
        return this.f187305j;
    }

    /* JADX INFO: renamed from: x */
    public C22393b<String> m204743x() {
        return this.f187307l;
    }

    /* JADX INFO: renamed from: y */
    public final List<yng> m204744y() {
        ArrayList arrayList = new ArrayList(this.f187301f);
        m204734n(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m204745z() {
        return !TextUtils.isEmpty(this.f187300e);
    }
}
