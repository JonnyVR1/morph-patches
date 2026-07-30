package p149l;

import android.app.Application;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class ypv {

    /* JADX INFO: renamed from: a */
    public static vpv f199493a;

    /* JADX INFO: renamed from: b */
    public static bqv f199494b;

    /* JADX INFO: renamed from: c */
    public static swr f199495c;

    /* JADX INFO: renamed from: d */
    public static uut f199496d;

    /* JADX INFO: renamed from: e */
    public static Application f199497e = App.f15369e;

    /* JADX INFO: renamed from: f */
    public static cuc0 f199498f = new cuc0();

    /* JADX INFO: renamed from: g */
    public static b1t f199499g;

    /* JADX INFO: renamed from: l.ypv$a */
    public class CallableC21471a implements Callable<roj0> {
        public CallableC21471a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public roj0 call() {
            ypv.this.m215682o();
            return roj0.f160388a;
        }
    }

    /* JADX INFO: renamed from: l.ypv$b */
    public class C21472b implements e30<roj0> {
        public C21472b() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(roj0 roj0Var) {
            ypv.this.m215678f();
        }
    }

    public ypv(vpv vpvVar) {
        gkh0.m126627j("[live]living_room", "LivingRoomModule.init()");
        f199493a = vpvVar;
        f199494b = new bqv();
        f199495c = new swr();
    }

    /* JADX INFO: renamed from: j */
    public static b1t m215671j() {
        if (f199499g == null) {
            f199499g = new b1t();
        }
        return f199499g;
    }

    /* JADX INFO: renamed from: k */
    public static uut m215672k() {
        if (f199496d == null) {
            f199496d = f199493a.m199364p();
        }
        return f199496d;
    }

    /* JADX INFO: renamed from: l */
    public static <V> V m215673l(fld0<V> fld0Var) {
        return (V) f199494b.m103423a(fld0Var);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m215674m() {
        return f199494b != null;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m215675n(String str) {
        if ("voice".equals(str)) {
            return !vdt.m198092b(3);
        }
        return f199493a.m199316I() && !vdt.m198092b(2);
    }

    /* JADX INFO: renamed from: r */
    public static void m215676r() {
        uut uutVar = f199496d;
        if (uutVar != null) {
            if (uutVar.m195583A3() == null || f199496d.m195583A3().liveConfig == null) {
                f199496d.m121236q();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m215677e() {
        aqe.m98261i().m98282y();
        if (!vdt.m198092b(1)) {
            ldp.m149464a().m149467d();
        }
        if (vdt.m198092b(2)) {
            zfv.m218542Y0(LiveRegionTag.get("unknown_")).subscribe(ffw.m121192c());
            zfv.m218553c1().subscribe(ffw.m121192c());
            zfv.m218565g1().subscribe(ffw.m121192c());
            a180.m94514n().m94519j();
        } else {
            LivingNormalApiProvider.m71410a5().subscribe(ffw.m121192c());
            LivingNormalApiProvider.m71419b5().subscribe(ffw.m121192c());
        }
        vet.m198232p(hgt.INSTANCE.m130912S(), null, new Object[0]).subscribe(ffw.m121192c());
        e51.m114774y(new Runnable() { // from class: l.xpv
            @Override // java.lang.Runnable
            public final void run() {
                wet.m202922a(ypv.f199497e, "preset", new File(js2.m142986v1()));
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m215678f() {
        try {
            gkh0.m126627j(u0t.f172945d, "http dns open:" + f199493a.m199312F());
            if (f199493a.m199312F()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add("live-api.immomo.com");
                arrayList.add("sla-media.immomo.com");
                arrayList.add("schedule-media.immomo.com");
                i0c.m133758e(f199497e, arrayList);
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m215679g() {
        if (rw0.m181367a()) {
            C22306c.fromCallable(new CallableC21471a()).compose(mkd0.m154951C()).subscribe(mkd0.m154955G(new C21472b()));
        } else {
            m215682o();
            m215678f();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m215680h() {
        m215683p();
        if (vdt.m198092b(2)) {
            zfv.m218542Y0(LiveRegionTag.get("unknown_")).subscribe(ffw.m121192c());
            zfv.m218553c1().subscribe(ffw.m121192c());
            zfv.m218565g1().subscribe(ffw.m121192c());
            a180.m94514n().m94519j();
        } else {
            LivingNormalApiProvider.m71410a5().subscribe(ffw.m121192c());
            LivingNormalApiProvider.m71419b5().subscribe(ffw.m121192c());
        }
        m215679g();
        vet.m198232p(hgt.INSTANCE.m130912S(), null, new Object[0]).subscribe(ffw.m121192c());
        e51.m114774y(new Runnable() { // from class: l.wpv
            @Override // java.lang.Runnable
            public final void run() {
                wet.m202922a(ypv.f199497e, "preset", new File(js2.m142986v1()));
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public void m215681i(uut uutVar) {
        f199496d = uutVar;
        m215679g();
    }

    /* JADX INFO: renamed from: o */
    public final void m215682o() {
        try {
            System.loadLibrary("mmcrypto");
            System.loadLibrary("mmssl");
            System.loadLibrary("curl");
            System.loadLibrary("mdlog");
            System.loadLibrary("mmdns");
        } catch (Throwable th) {
            CrashHelper.m81296c(new RuntimeException("enableDomainAnalysis", th));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m215683p() {
        vpv vpvVar = f199493a;
        if (vpvVar == null || !vpvVar.m199318K()) {
            return;
        }
        aqe.m98261i().m98282y();
        if (vdt.m198092b(1)) {
            return;
        }
        ldp.m149464a().m149467d();
    }

    /* JADX INFO: renamed from: q */
    public void m215684q() {
        ycp0.m214190d().m214192a();
        pqi.m170912d().m170915c();
        pxm.m171910c().m171911a(true);
        f199496d = null;
    }
}
