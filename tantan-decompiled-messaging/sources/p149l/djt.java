package p149l;

import com.tantanapp.sharedlibrary.loader.LoadEvent;
import com.tantanapp.sharedlibrary.loader.SharedLibraryLoader;
import java.util.Objects;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes11.dex */
public class djt {
    /* JADX INFO: renamed from: A */
    public static C22306c<LoadEvent> m112112A(final C22392a<hgt> c22392a) {
        return C22306c.create(new C22306c.a() { // from class: l.rit
            @Override // p149l.e30
            public final void call(Object obj) {
                z3g0 z3g0Var = (z3g0) obj;
                SharedLibraryLoader.m81454k().m81466u("b_live").subscribe(mkd0.m154956H(new e30() { // from class: l.sit
                    @Override // p149l.e30
                    public final void call(Object obj2) {
                        djt.m112129l(c22392a, z3g0Var, (LoadEvent) obj2);
                    }
                }, new e30() { // from class: l.tit
                    @Override // p149l.e30
                    public final void call(Object obj2) {
                        z3g0Var.onError((Throwable) obj2);
                    }
                }));
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static C22306c<hgt> m112113B() {
        final C22392a c22392aM221512b = C22392a.m221512b();
        if (SharedLibraryLoader.m81454k().m81463q("lib_live_ffmpeg")) {
            m112136s(c22392aM221512b, ssf.INSTANCE);
            return c22392aM221512b.asObservable();
        }
        if (SharedLibraryLoader.m81454k().m81463q("lib_live_ffmpeg")) {
            m112136s(c22392aM221512b, ssf.INSTANCE);
        } else {
            C22306c.create(new C22306c.a() { // from class: l.ajt
                @Override // p149l.e30
                public final void call(Object obj) {
                    djt.m112133p(c22392aM221512b, (z3g0) obj);
                }
            }).subscribe(ffw.m121194e(new e30() { // from class: l.bjt
                @Override // p149l.e30
                public final void call(Object obj) {
                    gkh0.m126627j("live_sdk", "live  libtxffmpeg and libcosmosffmpeg  so load success");
                }
            }, new e30() { // from class: l.cjt
                @Override // p149l.e30
                public final void call(Object obj) {
                    gkh0.m126627j("live_sdk", "live libtxffmpeg and libcosmosffmpeg so download error:" + ((Throwable) obj).getMessage());
                }
            }));
        }
        return c22392aM221512b.asObservable();
    }

    /* JADX INFO: renamed from: C */
    public static void m112114C() {
        if (SharedLibraryLoader.m81454k().m81463q("lib_sud")) {
            return;
        }
        SharedLibraryLoader.m81454k().m81466u("lib_sud").subscribe(ffw.m121194e(new e30() { // from class: l.vit
            @Override // p149l.e30
            public final void call(Object obj) {
                djt.m112124g((LoadEvent) obj);
            }
        }, new e30() { // from class: l.wit
            @Override // p149l.e30
            public final void call(Object obj) {
                gkh0.m126627j("intl_sud_sdk", "load intl sud sdk failed");
            }
        }));
    }

    /* JADX INFO: renamed from: D */
    public static void m112115D() {
        if (SharedLibraryLoader.m81454k().m81463q("b_live")) {
            return;
        }
        SharedLibraryLoader.m81454k().m81466u("b_live").subscribe(ffw.m121194e(new e30() { // from class: l.kit
            @Override // p149l.e30
            public final void call(Object obj) {
                djt.m112131n((LoadEvent) obj);
            }
        }, new e30() { // from class: l.uit
            @Override // p149l.e30
            public final void call(Object obj) {
                gkh0.m126627j(u0t.f172945d, "loadNormalAudience failed");
            }
        }));
    }

    /* JADX INFO: renamed from: E */
    public static boolean m112116E() {
        return SharedLibraryLoader.m81454k().m81463q("b_live");
    }

    /* JADX INFO: renamed from: F */
    public static C22306c<hgt> m112117F(boolean z) {
        final C22392a c22392aM221512b = C22392a.m221512b();
        if (SharedLibraryLoader.m81454k().m81463q("b_live")) {
            m112136s(c22392aM221512b, p8e.INSTANCE, yum.INSTANCE, prv.INSTANCE, qrv.INSTANCE);
            return c22392aM221512b.asObservable();
        }
        if (z) {
            m112143z(c22392aM221512b);
        } else if (SharedLibraryLoader.m81454k().m81463q("b_liveVoice")) {
            m112136s(c22392aM221512b, p8e.INSTANCE, yum.INSTANCE, qrv.INSTANCE);
        } else {
            C22306c.create(new C22306c.a() { // from class: l.xit
                @Override // p149l.e30
                public final void call(Object obj) {
                    z3g0 z3g0Var = (z3g0) obj;
                    SharedLibraryLoader.m81454k().m81466u("b_liveVoice").subscribe(mkd0.m154956H(new e30() { // from class: l.nit
                        @Override // p149l.e30
                        public final void call(Object obj2) {
                            djt.m112128k(c22392a, z3g0Var, (LoadEvent) obj2);
                        }
                    }, new e30() { // from class: l.oit
                        @Override // p149l.e30
                        public final void call(Object obj2) {
                            z3g0Var.onError((Throwable) obj2);
                        }
                    }));
                }
            }).subscribe(ffw.m121194e(new e30() { // from class: l.yit
                @Override // p149l.e30
                public final void call(Object obj) {
                    gkh0.m126627j("live_sdk", "live voice so load success");
                }
            }, new e30() { // from class: l.zit
                @Override // p149l.e30
                public final void call(Object obj) {
                    djt.m112123f((Throwable) obj);
                }
            }));
        }
        return c22392aM221512b.asObservable();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m112120c(C22392a c22392a, z3g0 z3g0Var, LoadEvent loadEvent) {
        if (m112141x(loadEvent)) {
            gkh0.m126627j("live_sdk", "live  libtxffmpeg and libcosmosffmpeg  so download success");
        } else if (m112142y(loadEvent)) {
            gkh0.m126627j("live_sdk", "live  libtxffmpeg and libcosmosffmpeg  so isUnzip success");
        }
        if (loadEvent.m81438c()) {
            m112136s(c22392a, ssf.INSTANCE);
            z3g0Var.onNext(loadEvent);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m112121d(Throwable th) {
        th.getMessage();
        gkh0.m126627j("live_sdk", "live so download error:" + th.getMessage());
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m112123f(Throwable th) {
        th.getMessage();
        gkh0.m126627j("live_sdk", "live voice so download error:" + th.getMessage());
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m112124g(LoadEvent loadEvent) {
        if (loadEvent.m81438c()) {
            gkh0.m126627j("intl_sud_sdk", "all so loaded for intl sud sdk");
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m112128k(C22392a c22392a, z3g0 z3g0Var, LoadEvent loadEvent) {
        if (m112141x(loadEvent)) {
            m112136s(c22392a, p8e.INSTANCE);
        } else if (m112142y(loadEvent)) {
            m112136s(c22392a, yum.INSTANCE, qrv.INSTANCE);
        }
        if (loadEvent.m81438c()) {
            z3g0Var.onNext(loadEvent);
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m112129l(C22392a c22392a, z3g0 z3g0Var, LoadEvent loadEvent) {
        m112137t(c22392a, loadEvent);
        if (loadEvent.m81438c()) {
            z3g0Var.onNext(loadEvent);
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m112131n(LoadEvent loadEvent) {
        if (loadEvent.m81438c()) {
            gkh0.m126627j(u0t.f172945d, "all so loaded for normal Audience");
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m112133p(final C22392a c22392a, final z3g0 z3g0Var) {
        C22306c<LoadEvent> c22306cM81466u = SharedLibraryLoader.m81454k().m81466u("lib_live_ffmpeg");
        e30 e30Var = new e30() { // from class: l.pit
            @Override // p149l.e30
            public final void call(Object obj) {
                djt.m112120c(c22392a, z3g0Var, (LoadEvent) obj);
            }
        };
        Objects.requireNonNull(z3g0Var);
        c22306cM81466u.subscribe(mkd0.m154956H(e30Var, new e30() { // from class: l.qit
            @Override // p149l.e30
            public final void call(Object obj) {
                z3g0Var.onError((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public static void m112136s(C22392a<hgt> c22392a, hgt... hgtVarArr) {
        for (hgt hgtVar : hgtVarArr) {
            hgt.INSTANCE.m130904K(hgtVar);
            c22392a.onNext(hgtVar);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m112137t(C22392a<hgt> c22392a, LoadEvent loadEvent) {
        if (m112141x(loadEvent)) {
            m112136s(c22392a, p8e.INSTANCE);
        } else if (m112142y(loadEvent)) {
            m112136s(c22392a, yum.INSTANCE, prv.INSTANCE, qrv.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: u */
    public static boolean m112138u() {
        return SharedLibraryLoader.m81454k().m81463q("lib_live_ffmpeg");
    }

    /* JADX INFO: renamed from: v */
    public static boolean m112139v() {
        return SharedLibraryLoader.m81454k().m81463q("lib_sud");
    }

    /* JADX INFO: renamed from: w */
    public static C22306c<LoadEvent> m112140w() {
        return SharedLibraryLoader.m81454k().m81466u("lib_sud");
    }

    /* JADX INFO: renamed from: x */
    public static boolean m112141x(LoadEvent loadEvent) {
        return loadEvent.getStep() == LoadEvent.Step.Download && loadEvent.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() == LoadEvent.Event.Success;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m112142y(LoadEvent loadEvent) {
        return loadEvent.getStep() == LoadEvent.Step.Unzip && loadEvent.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() == LoadEvent.Event.Success;
    }

    /* JADX INFO: renamed from: z */
    public static void m112143z(C22392a<hgt> c22392a) {
        m112112A(c22392a).subscribe(ffw.m121194e(new e30() { // from class: l.lit
            @Override // p149l.e30
            public final void call(Object obj) {
                gkh0.m126627j("live_sdk", "live so load success");
            }
        }, new e30() { // from class: l.mit
            @Override // p149l.e30
            public final void call(Object obj) {
                djt.m112121d((Throwable) obj);
            }
        }));
    }
}
