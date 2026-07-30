package p153l;

import com.tantanapp.sharedlibrary.loader.LoadEvent;
import com.tantanapp.sharedlibrary.loader.SharedLibraryLoader;
import java.util.Objects;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes10.dex */
public class elt {
    /* JADX INFO: renamed from: A */
    public static C22421c<LoadEvent> m121257A(final C22507a<iit> c22507a) {
        return C22421c.create(new C22421c.a() { // from class: l.skt
            @Override // p153l.y20
            public final void call(Object obj) {
                gcg0 gcg0Var = (gcg0) obj;
                SharedLibraryLoader.m82637k().m82649u("b_live").subscribe(psd0.m173597H(new y20() { // from class: l.tkt
                    @Override // p153l.y20
                    public final void call(Object obj2) {
                        elt.m121274l(c22507a, gcg0Var, (LoadEvent) obj2);
                    }
                }, new y20() { // from class: l.ukt
                    @Override // p153l.y20
                    public final void call(Object obj2) {
                        gcg0Var.onError((Throwable) obj2);
                    }
                }));
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static C22421c<iit> m121258B() {
        final C22507a c22507aM222758b = C22507a.m222758b();
        if (SharedLibraryLoader.m82637k().m82646q("lib_live_ffmpeg")) {
            m121281s(c22507aM222758b, guf.INSTANCE);
            return c22507aM222758b.asObservable();
        }
        if (SharedLibraryLoader.m82637k().m82646q("lib_live_ffmpeg")) {
            m121281s(c22507aM222758b, guf.INSTANCE);
        } else {
            C22421c.create(new C22421c.a() { // from class: l.blt
                @Override // p153l.y20
                public final void call(Object obj) {
                    elt.m121278p(c22507aM222758b, (gcg0) obj);
                }
            }).subscribe(dhw.m115826e(new y20() { // from class: l.clt
                @Override // p153l.y20
                public final void call(Object obj) {
                    nsh0.m164608j("live_sdk", "live  libtxffmpeg and libcosmosffmpeg  so load success");
                }
            }, new y20() { // from class: l.dlt
                @Override // p153l.y20
                public final void call(Object obj) {
                    nsh0.m164608j("live_sdk", "live libtxffmpeg and libcosmosffmpeg so download error:" + ((Throwable) obj).getMessage());
                }
            }));
        }
        return c22507aM222758b.asObservable();
    }

    /* JADX INFO: renamed from: C */
    public static void m121259C() {
        if (SharedLibraryLoader.m82637k().m82646q("lib_sud")) {
            return;
        }
        SharedLibraryLoader.m82637k().m82649u("lib_sud").subscribe(dhw.m115826e(new y20() { // from class: l.wkt
            @Override // p153l.y20
            public final void call(Object obj) {
                elt.m121269g((LoadEvent) obj);
            }
        }, new y20() { // from class: l.xkt
            @Override // p153l.y20
            public final void call(Object obj) {
                nsh0.m164608j("intl_sud_sdk", "load intl sud sdk failed");
            }
        }));
    }

    /* JADX INFO: renamed from: D */
    public static void m121260D() {
        if (SharedLibraryLoader.m82637k().m82646q("b_live")) {
            return;
        }
        SharedLibraryLoader.m82637k().m82649u("b_live").subscribe(dhw.m115826e(new y20() { // from class: l.lkt
            @Override // p153l.y20
            public final void call(Object obj) {
                elt.m121276n((LoadEvent) obj);
            }
        }, new y20() { // from class: l.vkt
            @Override // p153l.y20
            public final void call(Object obj) {
                nsh0.m164608j(v2t.f182114d, "loadNormalAudience failed");
            }
        }));
    }

    /* JADX INFO: renamed from: E */
    public static boolean m121261E() {
        return SharedLibraryLoader.m82637k().m82646q("b_live");
    }

    /* JADX INFO: renamed from: F */
    public static C22421c<iit> m121262F(boolean z) {
        final C22507a c22507aM222758b = C22507a.m222758b();
        if (SharedLibraryLoader.m82637k().m82646q("b_live")) {
            m121281s(c22507aM222758b, bae.INSTANCE, zwm.INSTANCE, qtv.INSTANCE, rtv.INSTANCE);
            return c22507aM222758b.asObservable();
        }
        if (z) {
            m121288z(c22507aM222758b);
        } else if (SharedLibraryLoader.m82637k().m82646q("b_liveVoice")) {
            m121281s(c22507aM222758b, bae.INSTANCE, zwm.INSTANCE, rtv.INSTANCE);
        } else {
            C22421c.create(new C22421c.a() { // from class: l.ykt
                @Override // p153l.y20
                public final void call(Object obj) {
                    gcg0 gcg0Var = (gcg0) obj;
                    SharedLibraryLoader.m82637k().m82649u("b_liveVoice").subscribe(psd0.m173597H(new y20() { // from class: l.okt
                        @Override // p153l.y20
                        public final void call(Object obj2) {
                            elt.m121273k(c22507a, gcg0Var, (LoadEvent) obj2);
                        }
                    }, new y20() { // from class: l.pkt
                        @Override // p153l.y20
                        public final void call(Object obj2) {
                            gcg0Var.onError((Throwable) obj2);
                        }
                    }));
                }
            }).subscribe(dhw.m115826e(new y20() { // from class: l.zkt
                @Override // p153l.y20
                public final void call(Object obj) {
                    nsh0.m164608j("live_sdk", "live voice so load success");
                }
            }, new y20() { // from class: l.alt
                @Override // p153l.y20
                public final void call(Object obj) {
                    elt.m121268f((Throwable) obj);
                }
            }));
        }
        return c22507aM222758b.asObservable();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m121265c(C22507a c22507a, gcg0 gcg0Var, LoadEvent loadEvent) {
        if (m121286x(loadEvent)) {
            nsh0.m164608j("live_sdk", "live  libtxffmpeg and libcosmosffmpeg  so download success");
        } else if (m121287y(loadEvent)) {
            nsh0.m164608j("live_sdk", "live  libtxffmpeg and libcosmosffmpeg  so isUnzip success");
        }
        if (loadEvent.m82621c()) {
            m121281s(c22507a, guf.INSTANCE);
            gcg0Var.onNext(loadEvent);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m121266d(Throwable th) {
        th.getMessage();
        nsh0.m164608j("live_sdk", "live so download error:" + th.getMessage());
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m121268f(Throwable th) {
        th.getMessage();
        nsh0.m164608j("live_sdk", "live voice so download error:" + th.getMessage());
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m121269g(LoadEvent loadEvent) {
        if (loadEvent.m82621c()) {
            nsh0.m164608j("intl_sud_sdk", "all so loaded for intl sud sdk");
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m121273k(C22507a c22507a, gcg0 gcg0Var, LoadEvent loadEvent) {
        if (m121286x(loadEvent)) {
            m121281s(c22507a, bae.INSTANCE);
        } else if (m121287y(loadEvent)) {
            m121281s(c22507a, zwm.INSTANCE, rtv.INSTANCE);
        }
        if (loadEvent.m82621c()) {
            gcg0Var.onNext(loadEvent);
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m121274l(C22507a c22507a, gcg0 gcg0Var, LoadEvent loadEvent) {
        m121282t(c22507a, loadEvent);
        if (loadEvent.m82621c()) {
            gcg0Var.onNext(loadEvent);
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m121276n(LoadEvent loadEvent) {
        if (loadEvent.m82621c()) {
            nsh0.m164608j(v2t.f182114d, "all so loaded for normal Audience");
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m121278p(final C22507a c22507a, final gcg0 gcg0Var) {
        C22421c<LoadEvent> c22421cM82649u = SharedLibraryLoader.m82637k().m82649u("lib_live_ffmpeg");
        y20 y20Var = new y20() { // from class: l.qkt
            @Override // p153l.y20
            public final void call(Object obj) {
                elt.m121265c(c22507a, gcg0Var, (LoadEvent) obj);
            }
        };
        Objects.requireNonNull(gcg0Var);
        c22421cM82649u.subscribe(psd0.m173597H(y20Var, new y20() { // from class: l.rkt
            @Override // p153l.y20
            public final void call(Object obj) {
                gcg0Var.onError((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public static void m121281s(C22507a<iit> c22507a, iit... iitVarArr) {
        for (iit iitVar : iitVarArr) {
            iit.INSTANCE.m140125K(iitVar);
            c22507a.onNext(iitVar);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m121282t(C22507a<iit> c22507a, LoadEvent loadEvent) {
        if (m121286x(loadEvent)) {
            m121281s(c22507a, bae.INSTANCE);
        } else if (m121287y(loadEvent)) {
            m121281s(c22507a, zwm.INSTANCE, qtv.INSTANCE, rtv.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: u */
    public static boolean m121283u() {
        return SharedLibraryLoader.m82637k().m82646q("lib_live_ffmpeg");
    }

    /* JADX INFO: renamed from: v */
    public static boolean m121284v() {
        return SharedLibraryLoader.m82637k().m82646q("lib_sud");
    }

    /* JADX INFO: renamed from: w */
    public static C22421c<LoadEvent> m121285w() {
        return SharedLibraryLoader.m82637k().m82649u("lib_sud");
    }

    /* JADX INFO: renamed from: x */
    public static boolean m121286x(LoadEvent loadEvent) {
        return loadEvent.getStep() == LoadEvent.Step.Download && loadEvent.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() == LoadEvent.Event.Success;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m121287y(LoadEvent loadEvent) {
        return loadEvent.getStep() == LoadEvent.Step.Unzip && loadEvent.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() == LoadEvent.Event.Success;
    }

    /* JADX INFO: renamed from: z */
    public static void m121288z(C22507a<iit> c22507a) {
        m121257A(c22507a).subscribe(dhw.m115826e(new y20() { // from class: l.mkt
            @Override // p153l.y20
            public final void call(Object obj) {
                nsh0.m164608j("live_sdk", "live so load success");
            }
        }, new y20() { // from class: l.nkt
            @Override // p153l.y20
            public final void call(Object obj) {
                elt.m121266d((Throwable) obj);
            }
        }));
    }
}
