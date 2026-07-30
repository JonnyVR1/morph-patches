package com.p046p1.mobile.putong.feed.api;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.UiThread;
import com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.api.C10734a;
import com.p046p1.mobile.putong.feed.data.CameraBeautyMode;
import com.p046p1.mobile.putong.feed.data.CameraCategory;
import com.p046p1.mobile.putong.feed.data.CameraFilter;
import com.p046p1.mobile.putong.feed.data.CameraSticker;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MusicCategory;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.d30;
import p149l.e30;
import p149l.f8c;
import p149l.fgf0;
import p149l.ggi;
import p149l.jo0;
import p149l.la20;
import p149l.mkd0;
import p149l.omg;
import p149l.pb4;
import p149l.qib0;
import p149l.qnd;
import p149l.roj0;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.z3g0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.api.a */
/* JADX INFO: loaded from: classes12.dex */
public class C10734a extends omg {

    /* JADX INFO: renamed from: H */
    public a f39192H;

    /* JADX INFO: renamed from: I */
    public b f39193I;

    /* JADX INFO: renamed from: J */
    public C22392a<Pair<String, List<Moment>>> f39194J = C22392a.m221512b();

    /* JADX INFO: renamed from: K */
    public C22392a<Music> f39195K = C22392a.m221512b();

    /* JADX INFO: renamed from: L */
    public C22392a<List<CameraCategory>> f39196L = C22392a.m221512b();

    /* JADX INFO: renamed from: M */
    public C22392a<List<CameraCategory>> f39197M = C22392a.m221512b();

    /* JADX INFO: renamed from: N */
    public C22392a<List<CameraCategory>> f39198N = C22392a.m221512b();

    /* JADX INFO: renamed from: O */
    public HashMap<String, C22392a<List<Music>>> f39199O = new HashMap<>();

    /* JADX INFO: renamed from: P */
    public C22392a<List<List<CameraBeautyMode>>> f39200P = C22392a.m221512b();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.api.a$a */
    public class a extends fgf0<List<CameraFilter>> {
        public a() {
            super(C10734a.this, "loadFilters", new ggi(new qnd("filters", null, FeedModule.m60221F().userId()), -1, ProtobufAdapter.ARRAY_ADAPTER(CameraFilter.PROTOBUF_ADAPTER)), new v9j() { // from class: l.xc7
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return new la20(new v9j() { // from class: l.yc7
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            return omg.f144622G.auth().m185898q(omg.m165085k("/cameraFilters")).m185887f().m185883b();
                        }
                    }).map(new w9j() { // from class: l.zc7
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return ((FeedData) ((Envelope) obj).getModuleData(FeedData.class)).cameraFilters;
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.api.a$b */
    public class b extends fgf0<List<CameraCategory>> {
        public b() {
            super(C10734a.this, "loadMakeup", new ggi(new qnd("makeup", null, FeedModule.m60221F().userId()), -1, ProtobufAdapter.ARRAY_ADAPTER(CameraCategory.PROTOBUF_ADAPTER)), new v9j() { // from class: l.ad7
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return new la20(new v9j() { // from class: l.bd7
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            return omg.f144622G.auth().m185898q(omg.m165085k("/cameraCategories?filter=makeup&search=makeup")).m185887f().m185883b();
                        }
                    }).map(new w9j() { // from class: l.cd7
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return ((FeedData) ((Envelope) obj).getModuleData(FeedData.class)).cameraCategories;
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.api.a$c */
    public class c extends fgf0<List<CameraSticker>> {
        public c(final String str) {
            super(C10734a.this, "loadMakeupItem", new ggi(new qnd("makeupItem" + str, null, null), -1, ProtobufAdapter.ARRAY_ADAPTER(CameraSticker.PROTOBUF_ADAPTER)), new v9j() { // from class: l.ed7
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return new la20(new v9j() { // from class: l.fd7
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            return omg.f144622G.auth().m185898q(omg.m165085k("/cameraCategories/" + str + "?filter=makeup")).m185887f().m185883b();
                        }
                    }).map(new w9j() { // from class: l.gd7
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return C10734a.c.m60548C((Envelope) obj);
                        }
                    });
                }
            });
        }

        /* JADX INFO: renamed from: C */
        public static /* synthetic */ List m60548C(Envelope envelope) {
            ArrayList arrayListM200339n = vwb.m200339n(((FeedData) envelope.getModuleData(FeedData.class)).cameraStickers, new w9j() { // from class: l.dd7
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(vb4.m197673g(((CameraSticker) obj).minVersion));
                }
            });
            pb4.m168142O().m168199z(arrayListM200339n);
            return arrayListM200339n;
        }
    }

    public C10734a() {
        this.f39192H = new a();
        this.f39193I = new b();
        this.f39199O.put("hot", C22392a.m221513c(new ArrayList()));
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ List m60411C0(w9j w9jVar, Envelope envelope) {
        ArrayList arrayListM200339n = vwb.m200339n(((FeedData) envelope.getModuleData(FeedData.class)).cameraStickers, new w9j() { // from class: l.gc7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(vb4.m197673g(((CameraSticker) obj).minVersion));
            }
        });
        if (NullChecker.m81303a(w9jVar)) {
            arrayListM200339n = vwb.m200339n(arrayListM200339n, w9jVar);
        }
        pb4.m168142O().m168180A(arrayListM200339n);
        return arrayListM200339n;
    }

    /* JADX INFO: renamed from: C1 */
    public static /* synthetic */ void m60412C1(String str, Envelope envelope) {
        DbLinks dbLinks = new DbLinks();
        dbLinks.f56011id = "music_" + str;
        dbLinks.links = envelope.pagination.links;
        qib0.f154722k0.m193854n(dbLinks);
    }

    /* JADX INFO: renamed from: D1 */
    public static /* synthetic */ Music m60414D1(Envelope envelope) {
        List<Music> list = ((FeedData) envelope.getModuleData(FeedData.class)).musics;
        if (vwb.m200296J(list)) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: G1 */
    public static /* synthetic */ void m60420G1(Envelope envelope) {
        DbLinks dbLinks = new DbLinks();
        dbLinks.f56011id = "music_favor";
        dbLinks.links = envelope.pagination.links;
        qib0.f154722k0.m193854n(dbLinks);
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ DbLinks m60423I0(String str) {
        return (DbLinks) qib0.f154722k0.f176630c.query("music_" + str);
    }

    /* JADX INFO: renamed from: J1 */
    public static /* synthetic */ void m60426J1(Envelope envelope) {
        DbLinks dbLinks = new DbLinks();
        dbLinks.f56011id = "music_moment_links_id";
        dbLinks.links = envelope.pagination.links;
        qib0.f154722k0.m193854n(dbLinks);
    }

    /* JADX INFO: renamed from: N1 */
    public static /* synthetic */ List m60434N1(List list) {
        pb4.m168142O().m168199z(list);
        return list;
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ DbLinks m60442S0() {
        return (DbLinks) qib0.f154722k0.f176630c.query("music_favor");
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ DbLinks m60445V0() {
        return (DbLinks) qib0.f154722k0.f176630c.query("music_moment_links_id");
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ void m60447X0(Throwable th) {
        th.printStackTrace();
        CrashHelper.m81296c(th);
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ void m60456g1(Envelope envelope) {
        DbLinks dbLinks = new DbLinks();
        dbLinks.f56011id = "music_favor";
        dbLinks.links = envelope.pagination.links;
        qib0.f154722k0.m193854n(dbLinks);
    }

    /* JADX INFO: renamed from: n1 */
    public static /* synthetic */ void m60463n1(String str, Envelope envelope) {
        final DbLinks dbLinks = new DbLinks();
        dbLinks.f56011id = "music_" + str;
        dbLinks.links = envelope.pagination.links;
        f8c.m119878o().m119881B(new d30() { // from class: l.xb7
            @Override // p149l.d30
            public final void call() {
                qib0.f154722k0.f176630c.upsert(dbLinks);
            }
        });
    }

    /* JADX INFO: renamed from: p1 */
    public static /* synthetic */ void m60465p1(Envelope envelope) {
        DbLinks dbLinks = new DbLinks();
        dbLinks.f56011id = "music_moment_links_id";
        dbLinks.links = envelope.pagination.links;
        qib0.f154722k0.m193854n(dbLinks);
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ List m60471u0(w9j w9jVar, Envelope envelope) {
        ArrayList arrayListM200339n = vwb.m200339n(((FeedData) envelope.getModuleData(FeedData.class)).cameraStickers, new w9j() { // from class: l.jb7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(vb4.m197673g(((CameraSticker) obj).minVersion));
            }
        });
        if (NullChecker.m81303a(w9jVar)) {
            arrayListM200339n = vwb.m200339n(arrayListM200339n, w9jVar);
        }
        pb4.m168142O().m168180A(arrayListM200339n);
        return arrayListM200339n;
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m60477x0(Throwable th) {
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m60479y0(z3g0 z3g0Var) {
        try {
            z3g0Var.m132487l(CameraBeautyMode.JSON_ADAPTER.ARRAY_ADAPTER().ARRAY_ADAPTER().parse(FeedModule.f38852a.getAssets().open("MMBeautyAutoModelgeo.json")));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            z3g0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ Boolean m60483A2(String str, Envelope envelope) {
        List arrayList = this.f39194J.m221515e() == null ? new ArrayList() : (List) this.f39194J.m221515e().second;
        if (!vwb.m200296J(((FeedData) envelope.getModuleData(FeedData.class)).moments)) {
            arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).moments);
        }
        this.f39194J.m132487l(new Pair<>(str, vwb.m200327h(arrayList, new w9j() { // from class: l.tc7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Moment) obj).f56011id;
            }
        })));
        return Boolean.valueOf(envelope.pagination.links.next != null);
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ C22306c m60484B2(v9j v9jVar, final String str) {
        return new la20(v9jVar).doOnNext(new e30() { // from class: l.qc7
            @Override // p149l.e30
            public final void call(Object obj) {
                C10734a.m60426J1((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.rc7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f158743a.m60483A2(str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ C22306c m60485C2(final String str, DbLinks dbLinks) {
        final String str2 = dbLinks == null ? null : dbLinks.links.next;
        if (str2 == null) {
            return C22306c.just(Boolean.FALSE);
        }
        final v9j v9jVar = new v9j() { // from class: l.jc7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185898q(omg.m165085k("/moments?search=music&query=" + str + "&" + str2)).m185887f().m185883b();
            }
        };
        return scheduled("loadmoremoment", 0, new v9j() { // from class: l.kc7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f122290a.m60484B2(v9jVar, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ Boolean m60486D2(String str, Envelope envelope) {
        List<Music> listM221515e = m60522h2(str).m221515e();
        listM221515e.addAll(((FeedData) envelope.getModuleData(FeedData.class)).musics);
        m60522h2(str).m132487l(vwb.m200327h(listM221515e, new w9j() { // from class: l.pc7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Music) obj).f38781id;
            }
        }));
        return Boolean.valueOf(envelope.pagination.links.next != null);
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ C22306c m60487E2(v9j v9jVar, final String str) {
        return new la20(v9jVar).doOnNext(new e30() { // from class: l.lc7
            @Override // p149l.e30
            public final void call(Object obj) {
                C10734a.m60412C1(str, (Envelope) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.nc7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f138132a.m60486D2(str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F2 */
    public final /* synthetic */ C22306c m60488F2(final String str, DbLinks dbLinks) {
        final String str2 = dbLinks == null ? null : dbLinks.links.next;
        if (str2 == null) {
            return C22306c.just(Boolean.FALSE);
        }
        final v9j v9jVar = new v9j() { // from class: l.yb7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185898q(omg.m165085k("/musics?search=category&query=" + str + "&" + str2)).m185887f().m185883b();
            }
        };
        return scheduled("loadmore" + str, 0, new v9j() { // from class: l.zb7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f202422a.m60487E2(v9jVar, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: G2 */
    public void m60489G2() {
        m60506U1().subscribe(mkd0.m154955G(new e30() { // from class: l.ta7
            @Override // p149l.e30
            public final void call(Object obj) {
                m84.m153429e().m153442n((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H2 */
    public void m60490H2() {
        C22306c.create(new C22306c.a() { // from class: l.la7
            @Override // p149l.e30
            public final void call(Object obj) {
                C10734a.m60479y0((z3g0) obj);
            }
        }).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.ma7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f132837a.m60531q2((List) obj);
            }
        }, new e30() { // from class: l.na7
            @Override // p149l.e30
            public final void call(Object obj) {
                C10734a.m60447X0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I2 */
    public void m60491I2() {
        final v9j v9jVar = new v9j() { // from class: l.xa7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185898q(omg.m165085k("/cameraCategories?filter=default,beauty")).m185887f().m185883b();
            }
        };
        scheduled("cameraCategories", 0, new v9j() { // from class: l.ya7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(v9jVar).compose(mkd0.m154951C()).map(new w9j() { // from class: l.gb7
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((FeedData) ((Envelope) obj).getModuleData(FeedData.class)).cameraCategories;
                    }
                });
            }
        }, false).subscribe(mkd0.m154956H(new e30() { // from class: l.za7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202330a.m60532r2((List) obj);
            }
        }, new e30() { // from class: l.ab7
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }));
    }

    /* JADX INFO: renamed from: J2 */
    public void m60492J2() {
        this.f39193I.m121230k().subscribe(mkd0.m154956H(new e30() { // from class: l.ga7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101636a.m60533s2((List) obj);
            }
        }, new e30() { // from class: l.ha7
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }));
    }

    /* JADX INFO: renamed from: K2 */
    public void m60493K2() {
        final v9j v9jVar = new v9j() { // from class: l.vc7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185898q(omg.m165085k("/cameraCategories?filter=cartoon&search=cartoon")).m185887f().m185883b();
            }
        };
        scheduled("cameraCategoriesCartoon", 0, new v9j() { // from class: l.wc7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(v9jVar).compose(mkd0.m154951C()).map(new w9j() { // from class: l.bb7
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((FeedData) ((Envelope) obj).getModuleData(FeedData.class)).cameraCategories;
                    }
                });
            }
        }, false).subscribe(mkd0.m154956H(new e30() { // from class: l.z97
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202276a.m60534t2((List) obj);
            }
        }, new e30() { // from class: l.aa7
            @Override // p149l.e30
            public final void call(Object obj) {
                C10734a.m60477x0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L2 */
    public void m60494L2() {
        final v9j v9jVar = new v9j() { // from class: l.ba7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185898q(omg.m165085k("/users/me/musics?search=favors&limit=20")).m185887f().m185883b();
            }
        };
        scheduled("loadfavor", 0, new v9j() { // from class: l.ca7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f80008a.m60536v2(v9jVar);
            }
        }, true);
    }

    /* JADX INFO: renamed from: M2 */
    public C22306c<Boolean> m60495M2(final String str) {
        final v9j v9jVar = new v9j() { // from class: l.va7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185898q(omg.m165085k("/moments?search=music&query=" + str + "&with=musics&limit=20")).m185887f().m185883b();
            }
        };
        return scheduled("loadMomentList", 0, new v9j() { // from class: l.wa7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f185442a.m60538x2(v9jVar, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: N2 */
    public C22306c<List<MusicCategory>> m60496N2() {
        final v9j v9jVar = new v9j() { // from class: l.mc7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185898q(omg.m165085k("/musicCategories")).m185887f().m185883b();
            }
        };
        return scheduled("loadMusicCategory", 0, new v9j() { // from class: l.uc7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(v9jVar).compose(mkd0.m154951C()).map(new w9j() { // from class: l.da7
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((FeedData) ((Envelope) obj).getModuleData(FeedData.class)).musicCategories;
                    }
                });
            }
        }, true);
    }

    /* JADX INFO: renamed from: O2 */
    public C22306c<roj0> m60497O2(final String str) {
        final v9j v9jVar = new v9j() { // from class: l.ia7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185898q(omg.m165085k("/musics?search=category&query=" + str + "&limit=20")).m185887f().m185883b();
            }
        };
        return scheduled(TrackLoadSettingsAtom.TYPE + str, 0, new v9j() { // from class: l.ka7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f122099a.m60540z2(v9jVar, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: P2 */
    public void m60498P2() {
        if (this.f39192H.m121233n() == null || this.f39192H.m121233n().size() == 0) {
            pb4.m168142O();
            pb4.m168153d0(new ArrayList()).subscribe();
        }
        this.f39192H.m121236q();
        m60491I2();
        m60490H2();
        m60492J2();
        m60493K2();
    }

    /* JADX INFO: renamed from: Q2 */
    public C22306c<List<CameraSticker>> m60499Q2(String str) {
        return new c(str).m121230k().map(new w9j() { // from class: l.oc7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C10734a.m60434N1((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R1 */
    public C22306c<roj0> m60500R1(final Music music) {
        final v9j v9jVar = new v9j() { // from class: l.oa7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                Music music2 = music;
                return qib0.f154693H.auth().m185898q(omg.m165085k("/users/" + FeedModule.m60221F().userId() + "/musics/" + music2.f38781id + "/favors/me")).m185894m(utc0.create(Network.JSON, "{\"id\":\"" + music2.f38781id + "\"}")).m185883b();
            }
        };
        return scheduled("addFavor", 0, new v9j() { // from class: l.pa7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f147948a.m60525k2(v9jVar, music);
            }
        }, false);
    }

    /* JADX INFO: renamed from: R2 */
    public C22306c<Pair<String, List<Moment>>> m60501R2() {
        return this.f39194J;
    }

    /* JADX INFO: renamed from: S1 */
    public C22306c<Music> m60502S1() {
        return this.f39195K;
    }

    /* JADX INFO: renamed from: S2 */
    public C22306c<Boolean> m60503S2(final String str) {
        return C22306c.fromCallable(new Callable() { // from class: l.dc7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C10734a.m60445V0();
            }
        }).compose(mkd0.m154965Q()).flatMap(new w9j() { // from class: l.ec7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f90473a.m60485C2(str, (DbLinks) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: T1 */
    public C22306c<List<List<CameraBeautyMode>>> m60504T1() {
        return this.f39200P;
    }

    /* JADX INFO: renamed from: T2 */
    public C22306c<List<Music>> m60505T2(String str) {
        return m60522h2(str);
    }

    /* JADX INFO: renamed from: U1 */
    public C22306c<List<CameraCategory>> m60506U1() {
        return this.f39196L;
    }

    /* JADX INFO: renamed from: U2 */
    public C22306c<Boolean> m60507U2(final String str) {
        return C22306c.fromCallable(new v9j() { // from class: l.hb7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C10734a.m60423I0(str);
            }
        }).compose(mkd0.m154965Q()).flatMap(new w9j() { // from class: l.ib7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f112353a.m60488F2(str, (DbLinks) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: V1 */
    public C22306c<List<CameraCategory>> m60508V1() {
        return this.f39198N;
    }

    /* JADX INFO: renamed from: V2 */
    public C22306c<List<CameraSticker>> m60509V2(final w9j<CameraSticker, Boolean> w9jVar, final String str) {
        final v9j v9jVar = new v9j() { // from class: l.fb7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185898q(omg.m165085k("/cameraCategories/" + str + "?search = sticker&filter=default,beauty")).m185887f().m185883b();
            }
        };
        return scheduled("cameraCategoriesInCid" + str, 0, new v9j() { // from class: l.qb7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(v9jVar).compose(mkd0.m154951C()).map(new w9j() { // from class: l.sa7
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C10734a.m60471u0(w9jVar, (Envelope) obj);
                    }
                });
            }
        }, true);
    }

    /* JADX INFO: renamed from: W1 */
    public C22306c<List<CameraCategory>> m60510W1() {
        return this.f39197M;
    }

    @UiThread
    /* JADX INFO: renamed from: W2 */
    public void m60511W2(Music music) {
        this.f39195K.m132487l(music);
    }

    /* JADX INFO: renamed from: X1 */
    public C22306c<List<CameraSticker>> m60512X1(final w9j<CameraSticker, Boolean> w9jVar, final String str) {
        final v9j v9jVar = new v9j() { // from class: l.ea7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185898q(omg.m165085k("/cameraCategories/" + str + "?search=cartoon&filter=cartoon")).m185887f().m185883b();
            }
        };
        return scheduled("cameraCategoriesInCid" + str, 0, new v9j() { // from class: l.fa7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(v9jVar).compose(mkd0.m154951C()).map(new w9j() { // from class: l.eb7
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C10734a.m60411C0(w9jVar, (Envelope) obj);
                    }
                });
            }
        }, true);
    }

    /* JADX INFO: renamed from: Y1 */
    public C22306c<Music> m60513Y1(final int i) {
        final v9j v9jVar = new v9j() { // from class: l.kb7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185898q(omg.m165085k("/musics?search=filter&query=" + i)).m185887f().m185883b();
            }
        };
        return scheduled("loadmore" + i, 0, new v9j() { // from class: l.lb7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(v9jVar).compose(mkd0.m154951C()).map(new w9j() { // from class: l.fc7
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C10734a.m60414D1((Envelope) obj);
                    }
                });
            }
        }, false);
    }

    /* JADX INFO: renamed from: Z1 */
    public C22306c<roj0> m60514Z1(final String str) {
        final v9j v9jVar = new v9j() { // from class: l.qa7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                String str2 = str;
                return qib0.f154693H.auth().m185898q(omg.m165085k("/users/" + FeedModule.m60221F().userId() + "/musics/" + str2 + "/favors/me")).m185886e(utc0.create(Network.JSON, "{\"id\":\"" + str2 + "\"}")).m185883b();
            }
        };
        return scheduled("deleteFavor", 0, new v9j() { // from class: l.ra7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f158488a.m60527m2(v9jVar, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: a2 */
    public C22306c<File> m60515a2(CameraSticker cameraSticker) {
        return pb4.m168142O().m168181I(cameraSticker);
    }

    /* JADX INFO: renamed from: b2 */
    public C22306c<MusicContent> m60516b2(Music music) {
        return pb4.m168142O().m168182J(music);
    }

    /* JADX INFO: renamed from: c2 */
    public C22306c<File> m60517c2(CameraSticker cameraSticker) {
        return pb4.m168142O().m168183K(cameraSticker);
    }

    /* JADX INFO: renamed from: d2 */
    public C22306c<List<Music>> m60518d2() {
        return m60522h2("favor");
    }

    /* JADX INFO: renamed from: e2 */
    public C22306c<Boolean> m60519e2() {
        return C22306c.fromCallable(new Callable() { // from class: l.ub7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C10734a.m60442S0();
            }
        }).compose(mkd0.m154965Q()).flatMap(new w9j() { // from class: l.vb7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f180820a.m60530p2((DbLinks) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: f2 */
    public C22306c<roj0> m60520f2() {
        return m60521g2(true);
    }

    /* JADX INFO: renamed from: g2 */
    public C22306c<roj0> m60521g2(boolean z) {
        return this.f39192H.m121231l(z).map(new w9j() { // from class: l.y97
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vwb.m200339n((List) obj, new w9j() { // from class: l.bc7
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(vb4.m197673g(((CameraFilter) obj2).minVersion));
                    }
                });
            }
        }).flatMap(new w9j() { // from class: l.ja7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return pb4.m168153d0((ArrayList) obj);
            }
        }).map(new w9j() { // from class: l.ua7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: h2 */
    public C22392a<List<Music>> m60522h2(String str) {
        C22392a<List<Music>> c22392a = this.f39199O.get(str);
        if (c22392a != null) {
            return c22392a;
        }
        C22392a<List<Music>> c22392aM221513c = C22392a.m221513c(new ArrayList());
        this.f39199O.put(str, c22392aM221513c);
        return c22392aM221513c;
    }

    /* JADX INFO: renamed from: i2 */
    public boolean m60523i2() {
        return !vwb.m200296J(this.f39196L.m221515e());
    }

    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ roj0 m60524j2(Music music, Envelope envelope) {
        for (C22392a<List<Music>> c22392a : this.f39199O.values()) {
            if (c22392a != null && c22392a.m221515e() != null) {
                for (Music music2 : c22392a.m221515e()) {
                    if (TextUtils.equals(music.f38781id, music2.f38781id)) {
                        music2.favor = true;
                        c22392a.m132487l(c22392a.m221515e());
                    }
                }
            }
        }
        List<Music> listM221515e = m60522h2("favor").m221515e();
        Music musicMo223809clone = music.mo223809clone();
        m60511W2(musicMo223809clone);
        musicMo223809clone.favor = true;
        listM221515e.add(0, musicMo223809clone);
        m60522h2("favor").m132487l(listM221515e);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ C22306c m60525k2(v9j v9jVar, final Music music) {
        return new la20(v9jVar).compose(mkd0.m154951C()).map(new w9j() { // from class: l.pb7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f148065a.m60524j2(music, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ roj0 m60526l2(final String str, Envelope envelope) {
        for (C22392a<List<Music>> c22392a : this.f39199O.values()) {
            if (c22392a != null && c22392a.m221515e() != null) {
                for (Music music : c22392a.m221515e()) {
                    if (TextUtils.equals(str, music.f38781id)) {
                        music.favor = false;
                        c22392a.m132487l(c22392a.m221515e());
                        m60511W2(music);
                    }
                }
            }
        }
        List<Music> listM221515e = m60522h2("favor").m221515e();
        vwb.m200320d0(listM221515e, new w9j() { // from class: l.wb7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Music) obj).f38781id, str));
            }
        });
        m60522h2("favor").m132487l(listM221515e);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ C22306c m60527m2(v9j v9jVar, final String str) {
        return new la20(v9jVar).compose(mkd0.m154951C()).map(new w9j() { // from class: l.rb7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f158587a.m60526l2(str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ Boolean m60528n2(Envelope envelope) {
        List<Music> listM221515e = m60522h2("favor").m221515e();
        listM221515e.addAll(((FeedData) envelope.getModuleData(FeedData.class)).musics);
        m60522h2("favor").m132487l(vwb.m200327h(listM221515e, new w9j() { // from class: l.sc7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Music) obj).f38781id;
            }
        }));
        return Boolean.valueOf(envelope.pagination.links.next != null);
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ C22306c m60529o2(v9j v9jVar) {
        return new la20(v9jVar).doOnNext(new e30() { // from class: l.hc7
            @Override // p149l.e30
            public final void call(Object obj) {
                C10734a.m60456g1((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.ic7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f112440a.m60528n2((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ C22306c m60530p2(DbLinks dbLinks) {
        final String str = dbLinks == null ? null : dbLinks.links.next;
        if (str == null) {
            return C22306c.just(Boolean.FALSE);
        }
        final v9j v9jVar = new v9j() { // from class: l.ac7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185898q(omg.m165085k("/users/me/musics?search=favors&limit=20&" + str)).m185887f().m185883b();
            }
        };
        return scheduled("loadmorefavor", 0, new v9j() { // from class: l.cc7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f80208a.m60529o2(v9jVar);
            }
        }, false);
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m60531q2(List list) {
        this.f39200P.m132487l(list);
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m60532r2(List list) {
        this.f39196L.m132487l(list);
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m60533s2(List list) {
        this.f39197M.m132487l(list);
    }

    /* JADX INFO: renamed from: t2 */
    public final /* synthetic */ void m60534t2(List list) {
        this.f39198N.m132487l(list);
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ roj0 m60535u2(Envelope envelope) {
        m60522h2("favor").m132487l(((FeedData) envelope.getModuleData(FeedData.class)).musics);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ C22306c m60536v2(v9j v9jVar) {
        return new la20(v9jVar).doOnNext(new e30() { // from class: l.sb7
            @Override // p149l.e30
            public final void call(Object obj) {
                C10734a.m60420G1((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.tb7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f169229a.m60535u2((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ Boolean m60537w2(String str, Envelope envelope) {
        this.f39194J.m132487l(new Pair<>(str, ((FeedData) envelope.getModuleData(FeedData.class)).moments));
        this.f39195K.m132487l(((FeedData) envelope.getModuleData(FeedData.class)).musics.get(0));
        return Boolean.valueOf(envelope.pagination.links.next != null);
    }

    /* JADX INFO: renamed from: x2 */
    public final /* synthetic */ C22306c m60538x2(v9j v9jVar, final String str) {
        return new la20(v9jVar).doOnNext(new e30() { // from class: l.cb7
            @Override // p149l.e30
            public final void call(Object obj) {
                C10734a.m60465p1((Envelope) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.db7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f85296a.m60537w2(str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ roj0 m60539y2(String str, Envelope envelope) {
        m60522h2(str).m132487l(((FeedData) envelope.getModuleData(FeedData.class)).musics);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ C22306c m60540z2(v9j v9jVar, final String str) {
        return new la20(v9jVar).doOnNext(new e30() { // from class: l.mb7
            @Override // p149l.e30
            public final void call(Object obj) {
                C10734a.m60463n1(str, (Envelope) obj);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.nb7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f138017a.m60539y2(str, (Envelope) obj);
            }
        }).doOnError(new e30() { // from class: l.ob7
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151578h(R$string.f39131q1);
            }
        });
    }
}
