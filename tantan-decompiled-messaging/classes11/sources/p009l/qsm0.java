package p009l;

import android.media.AudioManager;
import android.os.Vibrator;
import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.CrashHelper;
import l.c4g0;
import l.e30;
import l.mkd0;
import l.u44;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qsm0 {

    /* JADX INFO: renamed from: b */
    public wpm0 f19499b = new wpm0();

    /* JADX INFO: renamed from: c */
    public a<Integer> f19500c = a.c(0);

    /* JADX INFO: renamed from: a */
    public final Vibrator f19498a = (Vibrator) CoreModule.b.getSystemService("vibrator");

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m21240a(e30 e30Var, String str, Integer num) {
        try {
            e30Var.call(num);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m21241b(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public boolean m21242c() {
        AudioManager audioManager = (AudioManager) CoreModule.b.getSystemService("audio");
        return audioManager == null || audioManager.getRingerMode() != 0;
    }

    /* JADX INFO: renamed from: d */
    public void m21243d(String str) {
        if (!TextUtils.isEmpty(str)) {
            m21256q(str);
        }
        m21244e(str);
    }

    /* JADX INFO: renamed from: e */
    public void m21244e(String str) {
        this.f19499b.f22276r = str;
        m21257r();
    }

    /* JADX INFO: renamed from: f */
    public wpm0 m21245f() {
        return this.f19499b;
    }

    /* JADX INFO: renamed from: g */
    public c<Integer> m21246g() {
        return this.f19500c.asObservable();
    }

    /* JADX INFO: renamed from: h */
    public String m21247h() {
        return "localInfo:caller:" + this.f19499b.f22259a + ",callee:" + this.f19499b.f22260b + ",channel:" + this.f19499b.f22266h + ",callerDid:" + this.f19499b.f22262d + ",calleeDid:" + this.f19499b.f22261c + ",callerToken:" + this.f19499b.f22265g + ",calleeToken:" + this.f19499b.f22264f + ",localStatus:" + m21248i();
    }

    /* JADX INFO: renamed from: i */
    public int m21248i() {
        return ((Integer) this.f19500c.e()).intValue();
    }

    /* JADX INFO: renamed from: j */
    public long m21249j() {
        return this.f19499b.f22275q;
    }

    /* JADX INFO: renamed from: k */
    public String m21250k() {
        return this.f19499b.f22276r;
    }

    /* JADX INFO: renamed from: l */
    public String m21251l() {
        return this.f19499b.f22272n;
    }

    /* JADX INFO: renamed from: m */
    public void m21252m(u44 u44Var) {
        if (m21248i() == 0) {
            m21257r();
            return;
        }
        if (u44Var == u44.g) {
            m21260u(3);
            return;
        }
        if (u44Var == u44.i || u44Var == u44.h) {
            this.f19499b.f22278t = u44Var.a();
            if (m21248i() == 1) {
                m21243d("canceled");
            } else if (m21248i() == 2) {
                m21243d("finished");
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m21253n() {
        return m21248i() == 0;
    }

    /* JADX INFO: renamed from: o */
    public boolean m21254o() {
        return this.f19499b.f22273o;
    }

    /* JADX INFO: renamed from: p */
    public void m21255p(wpm0 wpm0Var) {
        this.f19499b.m24452a(wpm0Var);
        m21254o();
        m21251l();
    }

    /* JADX INFO: renamed from: q */
    public void m21256q(String str) {
        wlm0.m24338i(this.f19499b, str);
    }

    /* JADX INFO: renamed from: r */
    public void m21257r() {
        if (m21248i() == 0) {
            this.f19499b = new wpm0();
            return;
        }
        wpm0 wpm0Var = this.f19499b;
        mqm0.m18564g(wpm0Var.f22272n, wpm0Var.f22266h, m21248i());
        m21260u(4);
        mqm0.m18565h().m18575m();
        this.f19499b = new wpm0();
        m21258s(500);
        ib1.m16307b().mo16311e(tqm0.f20833h);
        m21260u(0);
    }

    /* JADX INFO: renamed from: s */
    public void m21258s(int i) {
        Vibrator vibrator = this.f19498a;
        if (vibrator == null) {
            return;
        }
        vibrator.vibrate(i);
    }

    /* JADX INFO: renamed from: t */
    public c4g0 m21259t(final String str, final e30<Integer> e30Var) {
        return m21246g().subscribe(mkd0.H(new e30() { // from class: l.osm0
            public final void call(Object obj) {
                qsm0.m21240a(e30Var, str, (Integer) obj);
            }
        }, new e30() { // from class: l.psm0
            public final void call(Object obj) {
                qsm0.m21241b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public void m21260u(int i) {
        wpm0 wpm0Var = this.f19499b;
        mqm0.m18569n(wpm0Var.f22272n, wpm0Var.f22266h, ((Integer) this.f19500c.e()).intValue(), i);
        this.f19500c.onNext(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: v */
    public void m21261v(long j) {
        this.f19499b.f22275q = j;
    }
}
