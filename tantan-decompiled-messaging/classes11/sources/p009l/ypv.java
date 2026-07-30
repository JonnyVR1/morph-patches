package p009l;

import android.app.Application;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.LiveRegionTag;
import com.p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import l.a180;
import l.aqe;
import l.b1t;
import l.e30;
import l.e51;
import l.ffw;
import l.gkh0;
import l.i0c;
import l.js2;
import l.ldp;
import l.mkd0;
import l.pqi;
import l.pxm;
import l.roj0;
import l.rw0;
import l.swr;
import l.u0t;
import l.uut;
import l.vdt;
import l.vet;
import l.wet;
import l.ycp0;
import l.zfv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ypv {

    /* JADX INFO: renamed from: a */
    public static vpv f23196a;

    /* JADX INFO: renamed from: b */
    public static bqv f23197b;

    /* JADX INFO: renamed from: c */
    public static swr f23198c;

    /* JADX INFO: renamed from: d */
    public static uut f23199d;

    /* JADX INFO: renamed from: e */
    public static Application f23200e = App.e;

    /* JADX INFO: renamed from: f */
    public static cuc0 f23201f = new cuc0();

    /* JADX INFO: renamed from: g */
    public static b1t f23202g;

    /* JADX INFO: renamed from: l.ypv$a */
    public class CallableC1334a implements Callable<roj0> {
        public CallableC1334a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public roj0 call() {
            ypv.this.m25500o();
            return roj0.a;
        }
    }

    /* JADX INFO: renamed from: l.ypv$b */
    public class C1335b implements e30<roj0> {
        public C1335b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(roj0 roj0Var) {
            ypv.this.m25496f();
        }
    }

    public ypv(vpv vpvVar) {
        gkh0.j("[live]living_room", "LivingRoomModule.init()");
        f23196a = vpvVar;
        f23197b = new bqv();
        f23198c = new swr();
    }

    /* JADX INFO: renamed from: j */
    public static b1t m25489j() {
        if (f23202g == null) {
            f23202g = new b1t();
        }
        return f23202g;
    }

    /* JADX INFO: renamed from: k */
    public static uut m25490k() {
        if (f23199d == null) {
            f23199d = f23196a.m23674p();
        }
        return f23199d;
    }

    /* JADX INFO: renamed from: l */
    public static <V> V m25491l(fld0<V> fld0Var) {
        return (V) f23197b.m12191a(fld0Var);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m25492m() {
        return f23197b != null;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m25493n(String str) {
        if ("voice".equals(str)) {
            return !vdt.b(3);
        }
        return f23196a.m23626I() && !vdt.b(2);
    }

    /* JADX INFO: renamed from: r */
    public static void m25494r() {
        uut uutVar = f23199d;
        if (uutVar != null) {
            if (uutVar.A3() == null || f23199d.A3().liveConfig == null) {
                f23199d.z();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m25495e() {
        aqe.i().y();
        if (!vdt.b(1)) {
            ldp.a().d();
        }
        if (vdt.b(2)) {
            zfv.Y0(LiveRegionTag.get("unknown_")).subscribe(ffw.c());
            zfv.c1().subscribe(ffw.c());
            zfv.g1().subscribe(ffw.c());
            a180.n().j();
        } else {
            LivingNormalApiProvider.a5().subscribe(ffw.c());
            LivingNormalApiProvider.b5().subscribe(ffw.c());
        }
        vet.p(hgt.INSTANCE.m15684S(), (Act) null, new Object[0]).subscribe(ffw.c());
        e51.y(new Runnable() { // from class: l.xpv
            @Override // java.lang.Runnable
            public final void run() {
                wet.a(ypv.f23200e, "preset", new File(js2.v1()));
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m25496f() {
        try {
            gkh0.j(u0t.d, "http dns open:" + f23196a.m23622F());
            if (f23196a.m23622F()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add("live-api.immomo.com");
                arrayList.add("sla-media.immomo.com");
                arrayList.add("schedule-media.immomo.com");
                i0c.e(f23200e, arrayList);
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m25497g() {
        if (rw0.a()) {
            c.fromCallable(new CallableC1334a()).compose(mkd0.C()).subscribe(mkd0.G(new C1335b()));
        } else {
            m25500o();
            m25496f();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m25498h() {
        m25501p();
        if (vdt.b(2)) {
            zfv.Y0(LiveRegionTag.get("unknown_")).subscribe(ffw.c());
            zfv.c1().subscribe(ffw.c());
            zfv.g1().subscribe(ffw.c());
            a180.n().j();
        } else {
            LivingNormalApiProvider.a5().subscribe(ffw.c());
            LivingNormalApiProvider.b5().subscribe(ffw.c());
        }
        m25497g();
        vet.p(hgt.INSTANCE.m15684S(), (Act) null, new Object[0]).subscribe(ffw.c());
        e51.y(new Runnable() { // from class: l.wpv
            @Override // java.lang.Runnable
            public final void run() {
                wet.a(ypv.f23200e, "preset", new File(js2.v1()));
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public void m25499i(uut uutVar) {
        f23199d = uutVar;
        m25497g();
    }

    /* JADX INFO: renamed from: o */
    public final void m25500o() {
        try {
            System.loadLibrary("mmcrypto");
            System.loadLibrary("mmssl");
            System.loadLibrary("curl");
            System.loadLibrary("mdlog");
            System.loadLibrary("mmdns");
        } catch (Throwable th) {
            CrashHelper.c(new RuntimeException("enableDomainAnalysis", th));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m25501p() {
        vpv vpvVar = f23196a;
        if (vpvVar == null || !vpvVar.m23628K()) {
            return;
        }
        aqe.i().y();
        if (vdt.b(1)) {
            return;
        }
        ldp.a().d();
    }

    /* JADX INFO: renamed from: q */
    public void m25502q() {
        ycp0.d().a();
        pqi.d().c();
        pxm.c().a(true);
        f23199d = null;
    }
}
