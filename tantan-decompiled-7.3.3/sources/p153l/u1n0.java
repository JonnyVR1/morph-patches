package p153l;

import android.media.AudioManager;
import android.os.Vibrator;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.CrashHelper;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes11.dex */
public class u1n0 {

    /* JADX INFO: renamed from: b */
    public azm0 f177084b = new azm0();

    /* JADX INFO: renamed from: c */
    public C22507a<Integer> f177085c = C22507a.m222759c(0);

    /* JADX INFO: renamed from: a */
    public final Vibrator f177083a = (Vibrator) CoreModule.f18263b.getSystemService("vibrator");

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m194025a(y20 y20Var, String str, Integer num) {
        try {
            y20Var.call(num);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m194026b(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public boolean m194027c() {
        AudioManager audioManager = (AudioManager) CoreModule.f18263b.getSystemService("audio");
        return audioManager == null || audioManager.getRingerMode() != 0;
    }

    /* JADX INFO: renamed from: d */
    public void m194028d(String str) {
        if (!TextUtils.isEmpty(str)) {
            m194041q(str);
        }
        m194029e(str);
    }

    /* JADX INFO: renamed from: e */
    public void m194029e(String str) {
        this.f177084b.f74170r = str;
        m194042r();
    }

    /* JADX INFO: renamed from: f */
    public azm0 m194030f() {
        return this.f177084b;
    }

    /* JADX INFO: renamed from: g */
    public C22421c<Integer> m194031g() {
        return this.f177085c.asObservable();
    }

    /* JADX INFO: renamed from: h */
    public String m194032h() {
        return "localInfo:caller:" + this.f177084b.f74153a + ",callee:" + this.f177084b.f74154b + ",channel:" + this.f177084b.f74160h + ",callerDid:" + this.f177084b.f74156d + ",calleeDid:" + this.f177084b.f74155c + ",callerToken:" + this.f177084b.f74159g + ",calleeToken:" + this.f177084b.f74158f + ",localStatus:" + m194033i();
    }

    /* JADX INFO: renamed from: i */
    public int m194033i() {
        return this.f177085c.m222761e().intValue();
    }

    /* JADX INFO: renamed from: j */
    public long m194034j() {
        return this.f177084b.f74169q;
    }

    /* JADX INFO: renamed from: k */
    public String m194035k() {
        return this.f177084b.f74170r;
    }

    /* JADX INFO: renamed from: l */
    public String m194036l() {
        return this.f177084b.f74166n;
    }

    /* JADX INFO: renamed from: m */
    public void m194037m(t54 t54Var) {
        if (m194033i() == 0) {
            m194042r();
            return;
        }
        if (t54Var == t54.f172176g) {
            m194045u(3);
            return;
        }
        if (t54Var == t54.f172178i || t54Var == t54.f172177h) {
            this.f177084b.f74172t = t54Var.m189373a();
            if (m194033i() == 1) {
                m194028d("canceled");
            } else if (m194033i() == 2) {
                m194028d("finished");
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m194038n() {
        return m194033i() == 0;
    }

    /* JADX INFO: renamed from: o */
    public boolean m194039o() {
        return this.f177084b.f74167o;
    }

    /* JADX INFO: renamed from: p */
    public void m194040p(azm0 azm0Var) {
        this.f177084b.m101077a(azm0Var);
        m194039o();
        m194036l();
    }

    /* JADX INFO: renamed from: q */
    public void m194041q(String str) {
        avm0.m100476i(this.f177084b, str);
    }

    /* JADX INFO: renamed from: r */
    public void m194042r() {
        if (m194033i() == 0) {
            this.f177084b = new azm0();
            return;
        }
        azm0 azm0Var = this.f177084b;
        qzm0.m178811g(azm0Var.f74166n, azm0Var.f74160h, m194033i());
        m194045u(4);
        qzm0.m178812h().m178822m();
        this.f177084b = new azm0();
        m194043s(500);
        pb1.m171472b().mo171476e(xzm0.f196892h);
        m194045u(0);
    }

    /* JADX INFO: renamed from: s */
    public void m194043s(int i) {
        Vibrator vibrator = this.f177083a;
        if (vibrator == null) {
            return;
        }
        vibrator.vibrate(i);
    }

    /* JADX INFO: renamed from: t */
    public kcg0 m194044t(final String str, final y20<Integer> y20Var) {
        return m194031g().subscribe(psd0.m173597H(new y20() { // from class: l.s1n0
            @Override // p153l.y20
            public final void call(Object obj) {
                u1n0.m194025a(y20Var, str, (Integer) obj);
            }
        }, new y20() { // from class: l.t1n0
            @Override // p153l.y20
            public final void call(Object obj) {
                u1n0.m194026b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public void m194045u(int i) {
        azm0 azm0Var = this.f177084b;
        qzm0.m178816n(azm0Var.f74166n, azm0Var.f74160h, this.f177085c.m222761e().intValue(), i);
        this.f177085c.onNext(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: v */
    public void m194046v(long j) {
        this.f177084b.f74169q = j;
    }
}
