package p009l;

import com.tantanapp.sharedlibrary.loader.LoadEvent;
import com.tantanapp.sharedlibrary.loader.SharedLibraryLoader;
import java.util.Objects;
import l.e30;
import l.ffw;
import l.gkh0;
import l.mkd0;
import l.u0t;
import l.z3g0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class djt {
    /* JADX INFO: renamed from: A */
    public static c<LoadEvent> m13364A(final a<hgt> aVar) {
        return c.create(new c.a() { // from class: l.rit
            public final void call(Object obj) {
                z3g0 z3g0Var = (z3g0) obj;
                SharedLibraryLoader.k().u("b_live").subscribe(mkd0.H(new e30() { // from class: l.sit
                    public final void call(Object obj2) {
                        djt.m13381l(aVar, z3g0Var, (LoadEvent) obj2);
                    }
                }, new e30() { // from class: l.tit
                    public final void call(Object obj2) {
                        z3g0Var.onError((Throwable) obj2);
                    }
                }));
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static c<hgt> m13365B() {
        final a aVarB = a.b();
        if (SharedLibraryLoader.k().q("lib_live_ffmpeg")) {
            m13388s(aVarB, ssf.INSTANCE);
            return aVarB.asObservable();
        }
        if (SharedLibraryLoader.k().q("lib_live_ffmpeg")) {
            m13388s(aVarB, ssf.INSTANCE);
        } else {
            c.create(new c.a() { // from class: l.ajt
                public final void call(Object obj) {
                    djt.m13385p(aVarB, (z3g0) obj);
                }
            }).subscribe(ffw.e(new e30() { // from class: l.bjt
                public final void call(Object obj) {
                    gkh0.j("live_sdk", "live  libtxffmpeg and libcosmosffmpeg  so load success");
                }
            }, new e30() { // from class: l.cjt
                public final void call(Object obj) {
                    gkh0.j("live_sdk", "live libtxffmpeg and libcosmosffmpeg so download error:" + ((Throwable) obj).getMessage());
                }
            }));
        }
        return aVarB.asObservable();
    }

    /* JADX INFO: renamed from: C */
    public static void m13366C() {
        if (SharedLibraryLoader.k().q("lib_sud")) {
            return;
        }
        SharedLibraryLoader.k().u("lib_sud").subscribe(ffw.e(new e30() { // from class: l.vit
            public final void call(Object obj) {
                djt.m13376g((LoadEvent) obj);
            }
        }, new e30() { // from class: l.wit
            public final void call(Object obj) {
                gkh0.j("intl_sud_sdk", "load intl sud sdk failed");
            }
        }));
    }

    /* JADX INFO: renamed from: D */
    public static void m13367D() {
        if (SharedLibraryLoader.k().q("b_live")) {
            return;
        }
        SharedLibraryLoader.k().u("b_live").subscribe(ffw.e(new e30() { // from class: l.kit
            public final void call(Object obj) {
                djt.m13383n((LoadEvent) obj);
            }
        }, new e30() { // from class: l.uit
            public final void call(Object obj) {
                gkh0.j(u0t.d, "loadNormalAudience failed");
            }
        }));
    }

    /* JADX INFO: renamed from: E */
    public static boolean m13368E() {
        return SharedLibraryLoader.k().q("b_live");
    }

    /* JADX INFO: renamed from: F */
    public static c<hgt> m13369F(boolean z) {
        final a aVarB = a.b();
        if (SharedLibraryLoader.k().q("b_live")) {
            m13388s(aVarB, p8e.INSTANCE, yum.INSTANCE, prv.INSTANCE, qrv.INSTANCE);
            return aVarB.asObservable();
        }
        if (z) {
            m13395z(aVarB);
        } else if (SharedLibraryLoader.k().q("b_liveVoice")) {
            m13388s(aVarB, p8e.INSTANCE, yum.INSTANCE, qrv.INSTANCE);
        } else {
            c.create(new c.a() { // from class: l.xit
                public final void call(Object obj) {
                    z3g0 z3g0Var = (z3g0) obj;
                    SharedLibraryLoader.k().u("b_liveVoice").subscribe(mkd0.H(new e30() { // from class: l.nit
                        public final void call(Object obj2) {
                            djt.m13380k(aVar, z3g0Var, (LoadEvent) obj2);
                        }
                    }, new e30() { // from class: l.oit
                        public final void call(Object obj2) {
                            z3g0Var.onError((Throwable) obj2);
                        }
                    }));
                }
            }).subscribe(ffw.e(new e30() { // from class: l.yit
                public final void call(Object obj) {
                    gkh0.j("live_sdk", "live voice so load success");
                }
            }, new e30() { // from class: l.zit
                public final void call(Object obj) {
                    djt.m13375f((Throwable) obj);
                }
            }));
        }
        return aVarB.asObservable();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m13372c(a aVar, z3g0 z3g0Var, LoadEvent loadEvent) {
        if (m13393x(loadEvent)) {
            gkh0.j("live_sdk", "live  libtxffmpeg and libcosmosffmpeg  so download success");
        } else if (m13394y(loadEvent)) {
            gkh0.j("live_sdk", "live  libtxffmpeg and libcosmosffmpeg  so isUnzip success");
        }
        if (loadEvent.c()) {
            m13388s(aVar, ssf.INSTANCE);
            z3g0Var.onNext(loadEvent);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m13373d(Throwable th) {
        th.getMessage();
        gkh0.j("live_sdk", "live so download error:" + th.getMessage());
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m13375f(Throwable th) {
        th.getMessage();
        gkh0.j("live_sdk", "live voice so download error:" + th.getMessage());
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m13376g(LoadEvent loadEvent) {
        if (loadEvent.c()) {
            gkh0.j("intl_sud_sdk", "all so loaded for intl sud sdk");
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m13380k(a aVar, z3g0 z3g0Var, LoadEvent loadEvent) {
        if (m13393x(loadEvent)) {
            m13388s(aVar, p8e.INSTANCE);
        } else if (m13394y(loadEvent)) {
            m13388s(aVar, yum.INSTANCE, qrv.INSTANCE);
        }
        if (loadEvent.c()) {
            z3g0Var.onNext(loadEvent);
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m13381l(a aVar, z3g0 z3g0Var, LoadEvent loadEvent) {
        m13389t(aVar, loadEvent);
        if (loadEvent.c()) {
            z3g0Var.onNext(loadEvent);
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m13383n(LoadEvent loadEvent) {
        if (loadEvent.c()) {
            gkh0.j(u0t.d, "all so loaded for normal Audience");
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m13385p(final a aVar, final z3g0 z3g0Var) {
        c cVarU = SharedLibraryLoader.k().u("lib_live_ffmpeg");
        e30 e30Var = new e30() { // from class: l.pit
            public final void call(Object obj) {
                djt.m13372c(aVar, z3g0Var, (LoadEvent) obj);
            }
        };
        Objects.requireNonNull(z3g0Var);
        cVarU.subscribe(mkd0.H(e30Var, new e30() { // from class: l.qit
            public final void call(Object obj) {
                z3g0Var.onError((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public static void m13388s(a<hgt> aVar, hgt... hgtVarArr) {
        for (hgt hgtVar : hgtVarArr) {
            hgt.INSTANCE.m15676K(hgtVar);
            aVar.onNext(hgtVar);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m13389t(a<hgt> aVar, LoadEvent loadEvent) {
        if (m13393x(loadEvent)) {
            m13388s(aVar, p8e.INSTANCE);
        } else if (m13394y(loadEvent)) {
            m13388s(aVar, yum.INSTANCE, prv.INSTANCE, qrv.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: u */
    public static boolean m13390u() {
        return SharedLibraryLoader.k().q("lib_live_ffmpeg");
    }

    /* JADX INFO: renamed from: v */
    public static boolean m13391v() {
        return SharedLibraryLoader.k().q("lib_sud");
    }

    /* JADX INFO: renamed from: w */
    public static c<LoadEvent> m13392w() {
        return SharedLibraryLoader.k().u("lib_sud");
    }

    /* JADX INFO: renamed from: x */
    public static boolean m13393x(LoadEvent loadEvent) {
        return loadEvent.b() == LoadEvent.Step.Download && loadEvent.a() == LoadEvent.Event.Success;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m13394y(LoadEvent loadEvent) {
        return loadEvent.b() == LoadEvent.Step.Unzip && loadEvent.a() == LoadEvent.Event.Success;
    }

    /* JADX INFO: renamed from: z */
    public static void m13395z(a<hgt> aVar) {
        m13364A(aVar).subscribe(ffw.e(new e30() { // from class: l.lit
            public final void call(Object obj) {
                gkh0.j("live_sdk", "live so load success");
            }
        }, new e30() { // from class: l.mit
            public final void call(Object obj) {
                djt.m13373d((Throwable) obj);
            }
        }));
    }
}
