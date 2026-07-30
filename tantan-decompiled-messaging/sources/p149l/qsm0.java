package p149l;

import android.media.AudioManager;
import android.os.Vibrator;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.CrashHelper;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes11.dex */
public class qsm0 {

    /* JADX INFO: renamed from: b */
    public wpm0 f156241b = new wpm0();

    /* JADX INFO: renamed from: c */
    public C22392a<Integer> f156242c = C22392a.m221513c(0);

    /* JADX INFO: renamed from: a */
    public final Vibrator f156240a = (Vibrator) CoreModule.f17544b.getSystemService("vibrator");

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m176307a(e30 e30Var, String str, Integer num) {
        try {
            e30Var.call(num);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m176308b(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public boolean m176309c() {
        AudioManager audioManager = (AudioManager) CoreModule.f17544b.getSystemService("audio");
        return audioManager == null || audioManager.getRingerMode() != 0;
    }

    /* JADX INFO: renamed from: d */
    public void m176310d(String str) {
        if (!TextUtils.isEmpty(str)) {
            m176323q(str);
        }
        m176311e(str);
    }

    /* JADX INFO: renamed from: e */
    public void m176311e(String str) {
        this.f156241b.f187561r = str;
        m176324r();
    }

    /* JADX INFO: renamed from: f */
    public wpm0 m176312f() {
        return this.f156241b;
    }

    /* JADX INFO: renamed from: g */
    public C22306c<Integer> m176313g() {
        return this.f156242c.asObservable();
    }

    /* JADX INFO: renamed from: h */
    public String m176314h() {
        return "localInfo:caller:" + this.f156241b.f187544a + ",callee:" + this.f156241b.f187545b + ",channel:" + this.f156241b.f187551h + ",callerDid:" + this.f156241b.f187547d + ",calleeDid:" + this.f156241b.f187546c + ",callerToken:" + this.f156241b.f187550g + ",calleeToken:" + this.f156241b.f187549f + ",localStatus:" + m176315i();
    }

    /* JADX INFO: renamed from: i */
    public int m176315i() {
        return this.f156242c.m221515e().intValue();
    }

    /* JADX INFO: renamed from: j */
    public long m176316j() {
        return this.f156241b.f187560q;
    }

    /* JADX INFO: renamed from: k */
    public String m176317k() {
        return this.f156241b.f187561r;
    }

    /* JADX INFO: renamed from: l */
    public String m176318l() {
        return this.f156241b.f187557n;
    }

    /* JADX INFO: renamed from: m */
    public void m176319m(u44 u44Var) {
        if (m176315i() == 0) {
            m176324r();
            return;
        }
        if (u44Var == u44.f173687g) {
            m176327u(3);
            return;
        }
        if (u44Var == u44.f173689i || u44Var == u44.f173688h) {
            this.f156241b.f187563t = u44Var.m191670a();
            if (m176315i() == 1) {
                m176310d("canceled");
            } else if (m176315i() == 2) {
                m176310d("finished");
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m176320n() {
        return m176315i() == 0;
    }

    /* JADX INFO: renamed from: o */
    public boolean m176321o() {
        return this.f156241b.f187558o;
    }

    /* JADX INFO: renamed from: p */
    public void m176322p(wpm0 wpm0Var) {
        this.f156241b.m204928a(wpm0Var);
        m176321o();
        m176318l();
    }

    /* JADX INFO: renamed from: q */
    public void m176323q(String str) {
        wlm0.m203842i(this.f156241b, str);
    }

    /* JADX INFO: renamed from: r */
    public void m176324r() {
        if (m176315i() == 0) {
            this.f156241b = new wpm0();
            return;
        }
        wpm0 wpm0Var = this.f156241b;
        mqm0.m155964g(wpm0Var.f187557n, wpm0Var.f187551h, m176315i());
        m176327u(4);
        mqm0.m155965h().m155975m();
        this.f156241b = new wpm0();
        m176325s(500);
        ib1.m135233b().mo135237e(tqm0.f171604h);
        m176327u(0);
    }

    /* JADX INFO: renamed from: s */
    public void m176325s(int i) {
        Vibrator vibrator = this.f156240a;
        if (vibrator == null) {
            return;
        }
        vibrator.vibrate(i);
    }

    /* JADX INFO: renamed from: t */
    public c4g0 m176326t(final String str, final e30<Integer> e30Var) {
        return m176313g().subscribe(mkd0.m154956H(new e30() { // from class: l.osm0
            @Override // p149l.e30
            public final void call(Object obj) {
                qsm0.m176307a(e30Var, str, (Integer) obj);
            }
        }, new e30() { // from class: l.psm0
            @Override // p149l.e30
            public final void call(Object obj) {
                qsm0.m176308b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public void m176327u(int i) {
        wpm0 wpm0Var = this.f156241b;
        mqm0.m155969n(wpm0Var.f187557n, wpm0Var.f187551h, this.f156242c.m221515e().intValue(), i);
        this.f156242c.onNext(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: v */
    public void m176328v(long j) {
        this.f156241b.f187560q = j;
    }
}
