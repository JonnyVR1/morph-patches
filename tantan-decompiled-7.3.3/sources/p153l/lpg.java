package p153l;

import android.app.Activity;
import android.media.AudioManager;
import android.text.TextUtils;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.helper.audioplayer.FeedAudioCanWorkControl;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes13.dex */
public class lpg {

    /* JADX INFO: renamed from: m */
    public static volatile lpg f133045m;

    /* JADX INFO: renamed from: a */
    public azl f133046a;

    /* JADX INFO: renamed from: b */
    public Moment f133047b;

    /* JADX INFO: renamed from: c */
    public Activity f133048c;

    /* JADX INFO: renamed from: d */
    public String f133049d;

    /* JADX INFO: renamed from: e */
    public String f133050e;

    /* JADX INFO: renamed from: f */
    public List<npg> f133051f;

    /* JADX INFO: renamed from: g */
    public mpg f133052g;

    /* JADX INFO: renamed from: h */
    public AudioManager.OnAudioFocusChangeListener f133053h;

    /* JADX INFO: renamed from: i */
    public boolean f133054i;

    /* JADX INFO: renamed from: j */
    public Runnable f133055j;

    /* JADX INFO: renamed from: k */
    public boolean f133056k;

    /* JADX INFO: renamed from: l */
    public C22508b<String> f133057l;

    public lpg() {
        m155195B();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m155181a(npg npgVar) {
        if (NullChecker.m82486a(npgVar)) {
            npgVar.onStart();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m155182b(npg npgVar) {
        if (NullChecker.m82486a(npgVar)) {
            npgVar.onComplete();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m155183c(npg npgVar) {
        if (NullChecker.m82486a(npgVar)) {
            npgVar.mo67522h();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m155184d(boolean z, npg npgVar) {
        if (NullChecker.m82486a(npgVar)) {
            npgVar.mo67475i(z);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m155187g(npg npgVar) {
        if (NullChecker.m82486a(npgVar)) {
            npgVar.onPause();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m155188h(Exception exc, npg npgVar) {
        if (NullChecker.m82486a(npgVar)) {
            npgVar.mo67474a(exc);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m155189i(npg npgVar) {
        if (NullChecker.m82486a(npgVar)) {
            npgVar.onResume();
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m155190j(float f, npg npgVar) {
        if (NullChecker.m82486a(npgVar)) {
            npgVar.mo67476j(f);
        }
    }

    /* JADX INFO: renamed from: v */
    public static lpg m155193v() {
        if (f133045m == null) {
            synchronized (lpg.class) {
                try {
                    if (f133045m == null) {
                        f133045m = new lpg();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f133045m;
    }

    /* JADX INFO: renamed from: A */
    public final void m155194A() {
        mpg mpgVar = this.f133052g;
        if (mpgVar == null) {
            this.f133052g = new mpg(this.f133048c, this.f133047b);
        } else {
            mpgVar.m159366e(this.f133047b);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m155195B() {
        this.f133051f = new ArrayList();
        this.f133057l = C22508b.m222767b();
    }

    /* JADX INFO: renamed from: C */
    public final void m155196C() {
        aqh0 aqh0Var = new aqh0();
        this.f133046a = aqh0Var;
        aqh0Var.mo99484b(new y20() { // from class: l.gpg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f105462a.m155212S(obj);
            }
        });
        this.f133046a.mo99483a(new a30() { // from class: l.hpg
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                this.f111023a.m155208O(obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
        this.f133046a.mo99485c(new a30() { // from class: l.ipg
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                this.f116273a.m155207N(obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
        this.f133046a.mo99486d(new y20() { // from class: l.jpg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122098a.m155205L(obj);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public boolean m155197D() {
        return m155198E() || m155199F();
    }

    /* JADX INFO: renamed from: E */
    public boolean m155198E() {
        return NullChecker.m82486a(this.f133046a) && this.f133046a.isPlaying();
    }

    /* JADX INFO: renamed from: F */
    public final boolean m155199F() {
        return !TextUtils.isEmpty(this.f133050e);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m155200G() {
        try {
            if (TextUtils.isEmpty(this.f133049d) || !this.f133056k) {
                return;
            }
            m155218Y(this.f133049d);
            this.f133056k = false;
        } catch (IOException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m155201H(int i) {
        if (i == -3 || i == -2) {
            l51.m152887G(new Runnable() { // from class: l.kpg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f127887a.m155202I();
                }
            });
        } else if (i == -1) {
            l51.m152887G(new Runnable() { // from class: l.vog
                @Override // java.lang.Runnable
                public final void run() {
                    this.f185040a.m155229j0();
                }
            });
        } else {
            if (i != 1) {
                return;
            }
            l51.m152887G(new Runnable() { // from class: l.wog
                @Override // java.lang.Runnable
                public final void run() {
                    this.f190040a.m155200G();
                }
            });
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m155202I() {
        m155217X();
        this.f133056k = true;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m155203J() {
        m155228i0();
        m155213T(this.f133046a.getCurrentPosition());
    }

    /* JADX INFO: renamed from: K */
    public void m155204K() {
        jyb.m147537z(m155242y(), new y20() { // from class: l.yog
            @Override // p153l.y20
            public final void call(Object obj) {
                lpg.m155182b((npg) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public void m155205L(Object obj) {
        m155204K();
        m155211R();
        m155235q();
    }

    /* JADX INFO: renamed from: M */
    public void m155206M(final Exception exc) {
        jyb.m147537z(m155242y(), new y20() { // from class: l.zog
            @Override // p153l.y20
            public final void call(Object obj) {
                lpg.m155188h(exc, (npg) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public boolean m155207N(Object obj, int i, int i2) {
        o1j0.m165635i(R$string.f39854Y0, true);
        m155206M(new IllegalStateException(i + "" + i2));
        m155211R();
        m155235q();
        return true;
    }

    /* JADX INFO: renamed from: O */
    public boolean m155208O(Object obj, int i, int i2) {
        if (i == 701) {
            m155209P();
            return true;
        }
        if (i != 702) {
            return false;
        }
        m155214U();
        return true;
    }

    /* JADX INFO: renamed from: P */
    public void m155209P() {
        jyb.m147537z(m155242y(), new y20() { // from class: l.epg
            @Override // p153l.y20
            public final void call(Object obj) {
                lpg.m155183c((npg) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public void m155210Q() {
        jyb.m147537z(m155242y(), new y20() { // from class: l.bpg
            @Override // p153l.y20
            public final void call(Object obj) {
                lpg.m155187g((npg) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final void m155211R() {
        m155230k0();
        m155221b0();
        this.f133051f.clear();
        lb1.m153551a(m155238t());
    }

    /* JADX INFO: renamed from: S */
    public void m155212S(Object obj) {
        if (m155243z()) {
            m155236r(this.f133050e);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m155213T(final float f) {
        jyb.m147537z(m155242y(), new y20() { // from class: l.xog
            @Override // p153l.y20
            public final void call(Object obj) {
                lpg.m155190j(f, (npg) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public void m155214U() {
        jyb.m147537z(m155242y(), new y20() { // from class: l.apg
            @Override // p153l.y20
            public final void call(Object obj) {
                lpg.m155189i((npg) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public void m155215V() {
        jyb.m147537z(m155242y(), new y20() { // from class: l.fpg
            @Override // p153l.y20
            public final void call(Object obj) {
                lpg.m155181a((npg) obj);
            }
        });
        m155228i0();
    }

    /* JADX INFO: renamed from: W */
    public void m155216W(final boolean z) {
        jyb.m147537z(m155242y(), new y20() { // from class: l.dpg
            @Override // p153l.y20
            public final void call(Object obj) {
                lpg.m155184d(z, (npg) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public void m155217X() {
        m155220a0();
        if (m155198E()) {
            this.f133046a.pause();
            m155210Q();
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m155218Y(String str) throws IOException {
        m155219Z(str, null);
    }

    /* JADX INFO: renamed from: Z */
    public void m155219Z(String str, npg npgVar) throws IOException {
        if (m155225f0(str) && FeedAudioCanWorkControl.m62102a()) {
            if (this.f133046a == null) {
                m155196C();
            }
            if (m155226g0(str)) {
                m155236r(str);
                return;
            }
            m155233o();
            m155231m(npgVar);
            m155194A();
            this.f133050e = str;
            m155209P();
            this.f133046a.reset();
            this.f133046a.setDataSource(str);
            this.f133046a.prepareAsync();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m155220a0() {
        this.f133050e = "";
    }

    /* JADX INFO: renamed from: b0 */
    public final void m155221b0() {
        this.f133049d = "";
    }

    /* JADX INFO: renamed from: c0 */
    public lpg m155222c0(Moment moment) {
        this.f133047b = moment;
        return this;
    }

    /* JADX INFO: renamed from: d0 */
    public lpg m155223d0(Activity activity) {
        this.f133048c = activity;
        return this;
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m155224e0(String str) {
        return m155226g0(str) || m155227h0(str);
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m155225f0(String str) {
        return !TextUtils.equals(str, this.f133050e);
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m155226g0(String str) {
        String str2 = this.f133049d;
        return str2 != null && str2.equals(str);
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m155227h0(String str) {
        String str2 = this.f133050e;
        return str2 != null && str2.equals(str);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m155228i0() {
        this.f133054i = true;
        l51.m152888H(FeedModule.f39700a, m155240w(), 1000L);
    }

    /* JADX INFO: renamed from: j0 */
    public void m155229j0() {
        if (m155197D()) {
            m155216W(false);
            if (m155198E()) {
                m155237s();
            } else {
                m155211R();
            }
            m155235q();
        }
        m155220a0();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m155230k0() {
        if (this.f133054i) {
            l51.m152890J(m155240w());
        }
        this.f133054i = false;
    }

    /* JADX INFO: renamed from: m */
    public lpg m155231m(npg npgVar) {
        if (NullChecker.m82486a(npgVar) && !this.f133051f.contains(npgVar)) {
            this.f133051f.add(npgVar);
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final void m155232n(List<npg> list) {
        list.add(this.f133052g);
    }

    /* JADX INFO: renamed from: o */
    public final void m155233o() {
        if (m155198E()) {
            m155216W(true);
            m155237s();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m155234p() {
        if (NullChecker.m82486a(this.f133052g)) {
            this.f133052g.m159363b();
            this.f133052g = null;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m155235q() {
        m155234p();
        this.f133048c = null;
    }

    /* JADX INFO: renamed from: r */
    public final void m155236r(String str) {
        m155220a0();
        if (lb1.m153552b(m155238t(), 1)) {
            this.f133049d = str;
            this.f133046a.start();
            m155215V();
            this.f133057l.onNext(str);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m155237s() {
        this.f133046a.stop();
        m155211R();
    }

    /* JADX INFO: renamed from: t */
    public AudioManager.OnAudioFocusChangeListener m155238t() {
        if (this.f133053h == null) {
            this.f133053h = new AudioManager.OnAudioFocusChangeListener() { // from class: l.uog
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i) {
                    this.f180082a.m155201H(i);
                }
            };
        }
        return this.f133053h;
    }

    /* JADX INFO: renamed from: u */
    public String m155239u() {
        return NullChecker.m82486a(this.f133047b) ? this.f133047b.f56859id : "";
    }

    /* JADX INFO: renamed from: w */
    public final Runnable m155240w() {
        if (this.f133055j == null) {
            this.f133055j = new Runnable() { // from class: l.cpg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f82997a.m155203J();
                }
            };
        }
        return this.f133055j;
    }

    /* JADX INFO: renamed from: x */
    public C22508b<String> m155241x() {
        return this.f133057l;
    }

    /* JADX INFO: renamed from: y */
    public final List<npg> m155242y() {
        ArrayList arrayList = new ArrayList(this.f133051f);
        m155232n(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m155243z() {
        return !TextUtils.isEmpty(this.f133050e);
    }
}
