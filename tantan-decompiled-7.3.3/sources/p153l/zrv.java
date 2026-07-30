package p153l;

import android.app.Application;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public class zrv {

    /* JADX INFO: renamed from: a */
    public static wrv f205799a;

    /* JADX INFO: renamed from: b */
    public static csv f205800b;

    /* JADX INFO: renamed from: c */
    public static tyr f205801c;

    /* JADX INFO: renamed from: d */
    public static vwt f205802d;

    /* JADX INFO: renamed from: e */
    public static Application f205803e = App.f16088e;

    /* JADX INFO: renamed from: f */
    public static f2d0 f205804f = new f2d0();

    /* JADX INFO: renamed from: g */
    public static c3t f205805g;

    /* JADX INFO: renamed from: l.zrv$a */
    public class CallableC21873a implements Callable<uxj0> {
        public CallableC21873a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public uxj0 call() {
            zrv.this.m221203o();
            return uxj0.f181467a;
        }
    }

    /* JADX INFO: renamed from: l.zrv$b */
    public class C21874b implements y20<uxj0> {
        public C21874b() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(uxj0 uxj0Var) {
            zrv.this.m221199f();
        }
    }

    public zrv(wrv wrvVar) {
        nsh0.m164608j("[live]living_room", "LivingRoomModule.init()");
        f205799a = wrvVar;
        f205800b = new csv();
        f205801c = new tyr();
    }

    /* JADX INFO: renamed from: j */
    public static c3t m221192j() {
        if (f205805g == null) {
            f205805g = new c3t();
        }
        return f205805g;
    }

    /* JADX INFO: renamed from: k */
    public static vwt m221193k() {
        if (f205802d == null) {
            f205802d = f205799a.m207686p();
        }
        return f205802d;
    }

    /* JADX INFO: renamed from: l */
    public static <V> V m221194l(htd0<V> htd0Var) {
        return (V) f205800b.m112234a(htd0Var);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m221195m() {
        return f205800b != null;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m221196n(String str) {
        if ("voice".equals(str)) {
            return !wft.m206159b(3);
        }
        return f205799a.m207638I() && !wft.m206159b(2);
    }

    /* JADX INFO: renamed from: r */
    public static void m221197r() {
        vwt vwtVar = f205802d;
        if (vwtVar != null) {
            if (vwtVar.m203370A3() == null || f205802d.m203370A3().liveConfig == null) {
                f205802d.m159280q();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m221198e() {
        ere.m122146i().m122167y();
        if (!wft.m206159b(1)) {
            lfp.m154031a().m154034d();
        }
        if (wft.m206159b(2)) {
            aiv.m98076Y0(LiveRegionTag.get("unknown_")).subscribe(dhw.m115824c());
            aiv.m98087c1().subscribe(dhw.m115824c());
            aiv.m98099g1().subscribe(dhw.m115824c());
            g980.m129522n().m129527j();
        } else {
            LivingNormalApiProvider.m72593a5().subscribe(dhw.m115824c());
            LivingNormalApiProvider.m72602b5().subscribe(dhw.m115824c());
        }
        wgt.m206249p(iit.INSTANCE.m140133S(), null, new Object[0]).subscribe(dhw.m115824c());
        l51.m152919y(new Runnable() { // from class: l.yrv
            @Override // java.lang.Runnable
            public final void run() {
                xgt.m210937a(zrv.f205803e, "preset", new File(zs2.m221303v1()));
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m221199f() {
        try {
            nsh0.m164608j(v2t.f182114d, "http dns open:" + f205799a.m207634F());
            if (f205799a.m207634F()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add("live-api.immomo.com");
                arrayList.add("sla-media.immomo.com");
                arrayList.add("schedule-media.immomo.com");
                v1c.m199000e(f205803e, arrayList);
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m221200g() {
        if (yw0.m217558a()) {
            C22421c.fromCallable(new CallableC21873a()).compose(psd0.m173592C()).subscribe(psd0.m173596G(new C21874b()));
        } else {
            m221203o();
            m221199f();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m221201h() {
        m221204p();
        if (wft.m206159b(2)) {
            aiv.m98076Y0(LiveRegionTag.get("unknown_")).subscribe(dhw.m115824c());
            aiv.m98087c1().subscribe(dhw.m115824c());
            aiv.m98099g1().subscribe(dhw.m115824c());
            g980.m129522n().m129527j();
        } else {
            LivingNormalApiProvider.m72593a5().subscribe(dhw.m115824c());
            LivingNormalApiProvider.m72602b5().subscribe(dhw.m115824c());
        }
        m221200g();
        wgt.m206249p(iit.INSTANCE.m140133S(), null, new Object[0]).subscribe(dhw.m115824c());
        l51.m152919y(new Runnable() { // from class: l.xrv
            @Override // java.lang.Runnable
            public final void run() {
                xgt.m210937a(zrv.f205803e, "preset", new File(zs2.m221303v1()));
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public void m221202i(vwt vwtVar) {
        f205802d = vwtVar;
        m221200g();
    }

    /* JADX INFO: renamed from: o */
    public final void m221203o() {
        try {
            System.loadLibrary("mmcrypto");
            System.loadLibrary("mmssl");
            System.loadLibrary("curl");
            System.loadLibrary("mdlog");
            System.loadLibrary("mmdns");
        } catch (Throwable th) {
            CrashHelper.m82479c(new RuntimeException("enableDomainAnalysis", th));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m221204p() {
        wrv wrvVar = f205799a;
        if (wrvVar == null || !wrvVar.m207640K()) {
            return;
        }
        ere.m122146i().m122167y();
        if (wft.m206159b(1)) {
            return;
        }
        lfp.m154031a().m154034d();
    }

    /* JADX INFO: renamed from: q */
    public void m221205q() {
        cmp0.m111299d().m111301a();
        lti.m155789d().m155792c();
        pzm.m174537c().m174538a(true);
        f205802d = null;
    }
}
