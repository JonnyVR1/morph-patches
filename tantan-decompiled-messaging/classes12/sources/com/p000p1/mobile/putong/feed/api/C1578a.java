package com.p000p1.mobile.putong.feed.api;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.UiThread;
import com.p000p1.mobile.putong.data.DbLinks;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.api.C1578a;
import com.p000p1.mobile.putong.feed.data.CameraBeautyMode;
import com.p000p1.mobile.putong.feed.data.CameraCategory;
import com.p000p1.mobile.putong.feed.data.CameraFilter;
import com.p000p1.mobile.putong.feed.data.CameraSticker;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MusicCategory;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import l.d30;
import l.e30;
import l.fgf0;
import l.ggi;
import l.jo0;
import l.la20;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.qnd;
import l.roj0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.z3g0;
import p007l.f8c;
import p007l.omg;
import p007l.pb4;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.api.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C1578a extends omg {

    /* JADX INFO: renamed from: H */
    public a f653H;

    /* JADX INFO: renamed from: I */
    public b f654I;

    /* JADX INFO: renamed from: J */
    public rx.subjects.a<Pair<String, List<Moment>>> f655J = rx.subjects.a.b();

    /* JADX INFO: renamed from: K */
    public rx.subjects.a<Music> f656K = rx.subjects.a.b();

    /* JADX INFO: renamed from: L */
    public rx.subjects.a<List<CameraCategory>> f657L = rx.subjects.a.b();

    /* JADX INFO: renamed from: M */
    public rx.subjects.a<List<CameraCategory>> f658M = rx.subjects.a.b();

    /* JADX INFO: renamed from: N */
    public rx.subjects.a<List<CameraCategory>> f659N = rx.subjects.a.b();

    /* JADX INFO: renamed from: O */
    public HashMap<String, rx.subjects.a<List<Music>>> f660O = new HashMap<>();

    /* JADX INFO: renamed from: P */
    public rx.subjects.a<List<List<CameraBeautyMode>>> f661P = rx.subjects.a.b();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.api.a$a */
    public class a extends fgf0<List<CameraFilter>> {
        public a() {
            super(C1578a.this, "loadFilters", new ggi(new qnd("filters", (String) null, FeedModule.m1139F().userId()), -1, ProtobufAdapter.ARRAY_ADAPTER(CameraFilter.PROTOBUF_ADAPTER)), new v9j() { // from class: l.xc7
                public final Object call() {
                    return new la20(new v9j() { // from class: l.yc7
                        public final Object call() {
                            return omg.f11509G.auth().q(omg.m12703k("/cameraFilters")).f().b();
                        }
                    }).map(new w9j() { // from class: l.zc7
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
            super(C1578a.this, "loadMakeup", new ggi(new qnd(CameraSticker.CATEGORY_MAKEUP, (String) null, FeedModule.m1139F().userId()), -1, ProtobufAdapter.ARRAY_ADAPTER(CameraCategory.PROTOBUF_ADAPTER)), new v9j() { // from class: l.ad7
                public final Object call() {
                    return new la20(new v9j() { // from class: l.bd7
                        public final Object call() {
                            return omg.f11509G.auth().q(omg.m12703k("/cameraCategories?filter=makeup&search=makeup")).f().b();
                        }
                    }).map(new w9j() { // from class: l.cd7
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
            super(C1578a.this, "loadMakeupItem", new ggi(new qnd("makeupItem" + str, (String) null, (String) null), -1, ProtobufAdapter.ARRAY_ADAPTER(CameraSticker.PROTOBUF_ADAPTER)), new v9j() { // from class: l.ed7
                public final Object call() {
                    return new la20(new v9j() { // from class: l.fd7
                        public final Object call() {
                            return omg.f11509G.auth().q(omg.m12703k("/cameraCategories/" + str + "?filter=makeup")).f().b();
                        }
                    }).map(new w9j() { // from class: l.gd7
                        public final Object call(Object obj) {
                            return C1578a.c.m1474C((Envelope) obj);
                        }
                    });
                }
            });
        }

        /* JADX INFO: renamed from: C */
        public static /* synthetic */ List m1474C(Envelope envelope) {
            ArrayList arrayListN = vwb.n(((FeedData) envelope.getModuleData(FeedData.class)).cameraStickers, new w9j() { // from class: l.dd7
                public final Object call(Object obj) {
                    return Boolean.valueOf(vb4.m15408g(((CameraSticker) obj).minVersion));
                }
            });
            pb4.m12961O().m13018z(arrayListN);
            return arrayListN;
        }
    }

    public C1578a() {
        this.f653H = new a();
        this.f654I = new b();
        this.f660O.put("hot", rx.subjects.a.c(new ArrayList()));
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ List m1337C0(w9j w9jVar, Envelope envelope) {
        ArrayList arrayListN = vwb.n(((FeedData) envelope.getModuleData(FeedData.class)).cameraStickers, new w9j() { // from class: l.gc7
            public final Object call(Object obj) {
                return Boolean.valueOf(vb4.m15408g(((CameraSticker) obj).minVersion));
            }
        });
        if (NullChecker.a(w9jVar)) {
            arrayListN = vwb.n(arrayListN, w9jVar);
        }
        pb4.m12961O().m12999A(arrayListN);
        return arrayListN;
    }

    /* JADX INFO: renamed from: C1 */
    public static /* synthetic */ void m1338C1(String str, Envelope envelope) {
        DbLinks dbLinks = new DbLinks();
        ((DbObject) dbLinks).id = "music_" + str;
        dbLinks.links = envelope.pagination.links;
        qib0.k0.n(dbLinks);
    }

    /* JADX INFO: renamed from: D1 */
    public static /* synthetic */ Music m1340D1(Envelope envelope) {
        List<Music> list = ((FeedData) envelope.getModuleData(FeedData.class)).musics;
        if (vwb.J(list)) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: G1 */
    public static /* synthetic */ void m1346G1(Envelope envelope) {
        DbLinks dbLinks = new DbLinks();
        ((DbObject) dbLinks).id = "music_favor";
        dbLinks.links = envelope.pagination.links;
        qib0.k0.n(dbLinks);
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ DbLinks m1349I0(String str) {
        return (DbLinks) qib0.k0.c.query("music_" + str);
    }

    /* JADX INFO: renamed from: J1 */
    public static /* synthetic */ void m1352J1(Envelope envelope) {
        DbLinks dbLinks = new DbLinks();
        ((DbObject) dbLinks).id = "music_moment_links_id";
        dbLinks.links = envelope.pagination.links;
        qib0.k0.n(dbLinks);
    }

    /* JADX INFO: renamed from: N1 */
    public static /* synthetic */ List m1360N1(List list) {
        pb4.m12961O().m13018z(list);
        return list;
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ DbLinks m1368S0() {
        return (DbLinks) qib0.k0.c.query("music_favor");
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ DbLinks m1371V0() {
        return (DbLinks) qib0.k0.c.query("music_moment_links_id");
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ void m1373X0(Throwable th) {
        th.printStackTrace();
        CrashHelper.c(th);
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ void m1382g1(Envelope envelope) {
        DbLinks dbLinks = new DbLinks();
        ((DbObject) dbLinks).id = "music_favor";
        dbLinks.links = envelope.pagination.links;
        qib0.k0.n(dbLinks);
    }

    /* JADX INFO: renamed from: n1 */
    public static /* synthetic */ void m1389n1(String str, Envelope envelope) {
        final DbLinks dbLinks = new DbLinks();
        ((DbObject) dbLinks).id = "music_" + str;
        dbLinks.links = envelope.pagination.links;
        f8c.m10082o().m10085B(new d30() { // from class: l.xb7
            public final void call() {
                qib0.k0.c.upsert(dbLinks);
            }
        });
    }

    /* JADX INFO: renamed from: p1 */
    public static /* synthetic */ void m1391p1(Envelope envelope) {
        DbLinks dbLinks = new DbLinks();
        ((DbObject) dbLinks).id = "music_moment_links_id";
        dbLinks.links = envelope.pagination.links;
        qib0.k0.n(dbLinks);
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ List m1397u0(w9j w9jVar, Envelope envelope) {
        ArrayList arrayListN = vwb.n(((FeedData) envelope.getModuleData(FeedData.class)).cameraStickers, new w9j() { // from class: l.jb7
            public final Object call(Object obj) {
                return Boolean.valueOf(vb4.m15408g(((CameraSticker) obj).minVersion));
            }
        });
        if (NullChecker.a(w9jVar)) {
            arrayListN = vwb.n(arrayListN, w9jVar);
        }
        pb4.m12961O().m12999A(arrayListN);
        return arrayListN;
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m1403x0(Throwable th) {
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m1405y0(z3g0 z3g0Var) {
        try {
            z3g0Var.onNext(CameraBeautyMode.JSON_ADAPTER.ARRAY_ADAPTER().ARRAY_ADAPTER().parse(FeedModule.f313a.getAssets().open("MMBeautyAutoModelgeo.json")));
        } catch (Exception e) {
            CrashHelper.c(e);
            z3g0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ Boolean m1409A2(String str, Envelope envelope) {
        List arrayList = this.f655J.e() == null ? new ArrayList() : (List) ((Pair) this.f655J.e()).second;
        if (!vwb.J(((FeedData) envelope.getModuleData(FeedData.class)).moments)) {
            arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).moments);
        }
        this.f655J.onNext(new Pair(str, vwb.h(arrayList, new w9j() { // from class: l.tc7
            public final Object call(Object obj) {
                return ((DbObject) ((Moment) obj)).id;
            }
        })));
        return Boolean.valueOf(envelope.pagination.links.next != null);
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ rx.c m1410B2(v9j v9jVar, final String str) {
        return new la20(v9jVar).doOnNext(new e30() { // from class: l.qc7
            public final void call(Object obj) {
                C1578a.m1352J1((Envelope) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.rc7
            public final Object call(Object obj) {
                return this.f12589a.m1409A2(str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ rx.c m1411C2(final String str, DbLinks dbLinks) {
        final String str2 = dbLinks == null ? null : dbLinks.links.next;
        if (str2 == null) {
            return rx.c.just(Boolean.FALSE);
        }
        final v9j v9jVar = new v9j() { // from class: l.jc7
            public final Object call() {
                return qib0.H.auth().q(omg.m12703k("/moments?search=music&query=" + str + "&" + str2)).f().b();
            }
        };
        return scheduled("loadmoremoment", 0, new v9j() { // from class: l.kc7
            public final Object call() {
                return this.f9672a.m1410B2(v9jVar, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ Boolean m1412D2(String str, Envelope envelope) {
        List list = (List) m1448h2(str).e();
        list.addAll(((FeedData) envelope.getModuleData(FeedData.class)).musics);
        m1448h2(str).onNext(vwb.h(list, new w9j() { // from class: l.pc7
            public final Object call(Object obj) {
                return ((Music) obj).f242id;
            }
        }));
        return Boolean.valueOf(envelope.pagination.links.next != null);
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ rx.c m1413E2(v9j v9jVar, final String str) {
        return new la20(v9jVar).doOnNext(new e30() { // from class: l.lc7
            public final void call(Object obj) {
                C1578a.m1338C1(str, (Envelope) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.nc7
            public final Object call(Object obj) {
                return this.f10738a.m1412D2(str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F2 */
    public final /* synthetic */ rx.c m1414F2(final String str, DbLinks dbLinks) {
        final String str2 = dbLinks == null ? null : dbLinks.links.next;
        if (str2 == null) {
            return rx.c.just(Boolean.FALSE);
        }
        final v9j v9jVar = new v9j() { // from class: l.yb7
            public final Object call() {
                return qib0.H.auth().q(omg.m12703k("/musics?search=category&query=" + str + "&" + str2)).f().b();
            }
        };
        return scheduled("loadmore" + str, 0, new v9j() { // from class: l.zb7
            public final Object call() {
                return this.f15683a.m1413E2(v9jVar, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: G2 */
    public void m1415G2() {
        m1432U1().subscribe(mkd0.G(new e30() { // from class: l.ta7
            public final void call(Object obj) {
                m84.m11844e().m11857n((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H2 */
    public void m1416H2() {
        rx.c.create(new rx.c.a() { // from class: l.la7
            public final void call(Object obj) {
                C1578a.m1405y0((z3g0) obj);
            }
        }).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.ma7
            public final void call(Object obj) {
                this.f10370a.m1457q2((List) obj);
            }
        }, new e30() { // from class: l.na7
            public final void call(Object obj) {
                C1578a.m1373X0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I2 */
    public void m1417I2() {
        final v9j v9jVar = new v9j() { // from class: l.xa7
            public final Object call() {
                return qib0.H.auth().q(omg.m12703k("/cameraCategories?filter=default,beauty")).f().b();
            }
        };
        scheduled("cameraCategories", 0, new v9j() { // from class: l.ya7
            public final Object call() {
                return new la20(v9jVar).compose(mkd0.C()).map(new w9j() { // from class: l.gb7
                    public final Object call(Object obj) {
                        return ((FeedData) ((Envelope) obj).getModuleData(FeedData.class)).cameraCategories;
                    }
                });
            }
        }, false).subscribe(mkd0.H(new e30() { // from class: l.za7
            public final void call(Object obj) {
                this.f15672a.m1458r2((List) obj);
            }
        }, new e30() { // from class: l.ab7
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }));
    }

    /* JADX INFO: renamed from: J2 */
    public void m1418J2() {
        this.f654I.k().subscribe(mkd0.H(new e30() { // from class: l.ga7
            public final void call(Object obj) {
                this.f8402a.m1459s2((List) obj);
            }
        }, new e30() { // from class: l.ha7
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }));
    }

    /* JADX INFO: renamed from: K2 */
    public void m1419K2() {
        final v9j v9jVar = new v9j() { // from class: l.vc7
            public final Object call() {
                return qib0.H.auth().q(omg.m12703k("/cameraCategories?filter=cartoon&search=cartoon")).f().b();
            }
        };
        scheduled("cameraCategoriesCartoon", 0, new v9j() { // from class: l.wc7
            public final Object call() {
                return new la20(v9jVar).compose(mkd0.C()).map(new w9j() { // from class: l.bb7
                    public final Object call(Object obj) {
                        return ((FeedData) ((Envelope) obj).getModuleData(FeedData.class)).cameraCategories;
                    }
                });
            }
        }, false).subscribe(mkd0.H(new e30() { // from class: l.z97
            public final void call(Object obj) {
                this.f15665a.m1460t2((List) obj);
            }
        }, new e30() { // from class: l.aa7
            public final void call(Object obj) {
                C1578a.m1403x0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L2 */
    public void m1420L2() {
        final v9j v9jVar = new v9j() { // from class: l.ba7
            public final Object call() {
                return qib0.H.auth().q(omg.m12703k("/users/me/musics?search=favors&limit=20")).f().b();
            }
        };
        scheduled("loadfavor", 0, new v9j() { // from class: l.ca7
            public final Object call() {
                return this.f6580a.m1462v2(v9jVar);
            }
        }, true);
    }

    /* JADX INFO: renamed from: M2 */
    public rx.c<Boolean> m1421M2(final String str) {
        final v9j v9jVar = new v9j() { // from class: l.va7
            public final Object call() {
                return qib0.H.auth().q(omg.m12703k("/moments?search=music&query=" + str + "&with=musics&limit=20")).f().b();
            }
        };
        return scheduled("loadMomentList", 0, new v9j() { // from class: l.wa7
            public final Object call() {
                return this.f14488a.m1464x2(v9jVar, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: N2 */
    public rx.c<List<MusicCategory>> m1422N2() {
        final v9j v9jVar = new v9j() { // from class: l.mc7
            public final Object call() {
                return qib0.H.auth().q(omg.m12703k("/musicCategories")).f().b();
            }
        };
        return scheduled("loadMusicCategory", 0, new v9j() { // from class: l.uc7
            public final Object call() {
                return new la20(v9jVar).compose(mkd0.C()).map(new w9j() { // from class: l.da7
                    public final Object call(Object obj) {
                        return ((FeedData) ((Envelope) obj).getModuleData(FeedData.class)).musicCategories;
                    }
                });
            }
        }, true);
    }

    /* JADX INFO: renamed from: O2 */
    public rx.c<roj0> m1423O2(final String str) {
        final v9j v9jVar = new v9j() { // from class: l.ia7
            public final Object call() {
                return qib0.H.auth().q(omg.m12703k("/musics?search=category&query=" + str + "&limit=20")).f().b();
            }
        };
        return scheduled("load" + str, 0, new v9j() { // from class: l.ka7
            public final Object call() {
                return this.f9654a.m1466z2(v9jVar, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: P2 */
    public void m1424P2() {
        if (this.f653H.n() == null || ((List) this.f653H.n()).size() == 0) {
            pb4.m12961O();
            pb4.m12972d0(new ArrayList()).subscribe();
        }
        this.f653H.z();
        m1417I2();
        m1416H2();
        m1418J2();
        m1419K2();
    }

    /* JADX INFO: renamed from: Q2 */
    public rx.c<List<CameraSticker>> m1425Q2(String str) {
        return new c(str).k().map(new w9j() { // from class: l.oc7
            public final Object call(Object obj) {
                return C1578a.m1360N1((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R1 */
    public rx.c<roj0> m1426R1(final Music music) {
        final v9j v9jVar = new v9j() { // from class: l.oa7
            public final Object call() {
                Music music2 = music;
                return qib0.H.auth().q(omg.m12703k("/users/" + FeedModule.m1139F().userId() + "/musics/" + music2.f242id + "/favors/me")).m(utc0.create(Network.JSON, "{\"id\":\"" + music2.f242id + "\"}")).b();
            }
        };
        return scheduled("addFavor", 0, new v9j() { // from class: l.pa7
            public final Object call() {
                return this.f11743a.m1451k2(v9jVar, music);
            }
        }, false);
    }

    /* JADX INFO: renamed from: R2 */
    public rx.c<Pair<String, List<Moment>>> m1427R2() {
        return this.f655J;
    }

    /* JADX INFO: renamed from: S1 */
    public rx.c<Music> m1428S1() {
        return this.f656K;
    }

    /* JADX INFO: renamed from: S2 */
    public rx.c<Boolean> m1429S2(final String str) {
        return rx.c.fromCallable(new Callable() { // from class: l.dc7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C1578a.m1371V0();
            }
        }).compose(mkd0.Q()).flatMap(new w9j() { // from class: l.ec7
            public final Object call(Object obj) {
                return this.f7326a.m1411C2(str, (DbLinks) obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: T1 */
    public rx.c<List<List<CameraBeautyMode>>> m1430T1() {
        return this.f661P;
    }

    /* JADX INFO: renamed from: T2 */
    public rx.c<List<Music>> m1431T2(String str) {
        return m1448h2(str);
    }

    /* JADX INFO: renamed from: U1 */
    public rx.c<List<CameraCategory>> m1432U1() {
        return this.f657L;
    }

    /* JADX INFO: renamed from: U2 */
    public rx.c<Boolean> m1433U2(final String str) {
        return rx.c.fromCallable(new v9j() { // from class: l.hb7
            public final Object call() {
                return C1578a.m1349I0(str);
            }
        }).compose(mkd0.Q()).flatMap(new w9j() { // from class: l.ib7
            public final Object call(Object obj) {
                return this.f8979a.m1414F2(str, (DbLinks) obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: V1 */
    public rx.c<List<CameraCategory>> m1434V1() {
        return this.f659N;
    }

    /* JADX INFO: renamed from: V2 */
    public rx.c<List<CameraSticker>> m1435V2(final w9j<CameraSticker, Boolean> w9jVar, final String str) {
        final v9j v9jVar = new v9j() { // from class: l.fb7
            public final Object call() {
                return qib0.H.auth().q(omg.m12703k("/cameraCategories/" + str + "?search = sticker&filter=default,beauty")).f().b();
            }
        };
        return scheduled("cameraCategoriesInCid" + str, 0, new v9j() { // from class: l.qb7
            public final Object call() {
                return new la20(v9jVar).compose(mkd0.C()).map(new w9j() { // from class: l.sa7
                    public final Object call(Object obj) {
                        return C1578a.m1397u0(w9jVar, (Envelope) obj);
                    }
                });
            }
        }, true);
    }

    /* JADX INFO: renamed from: W1 */
    public rx.c<List<CameraCategory>> m1436W1() {
        return this.f658M;
    }

    @UiThread
    /* JADX INFO: renamed from: W2 */
    public void m1437W2(Music music) {
        this.f656K.onNext(music);
    }

    /* JADX INFO: renamed from: X1 */
    public rx.c<List<CameraSticker>> m1438X1(final w9j<CameraSticker, Boolean> w9jVar, final String str) {
        final v9j v9jVar = new v9j() { // from class: l.ea7
            public final Object call() {
                return qib0.H.auth().q(omg.m12703k("/cameraCategories/" + str + "?search=cartoon&filter=cartoon")).f().b();
            }
        };
        return scheduled("cameraCategoriesInCid" + str, 0, new v9j() { // from class: l.fa7
            public final Object call() {
                return new la20(v9jVar).compose(mkd0.C()).map(new w9j() { // from class: l.eb7
                    public final Object call(Object obj) {
                        return C1578a.m1337C0(w9jVar, (Envelope) obj);
                    }
                });
            }
        }, true);
    }

    /* JADX INFO: renamed from: Y1 */
    public rx.c<Music> m1439Y1(final int i) {
        final v9j v9jVar = new v9j() { // from class: l.kb7
            public final Object call() {
                return qib0.H.auth().q(omg.m12703k("/musics?search=filter&query=" + i)).f().b();
            }
        };
        return scheduled("loadmore" + i, 0, new v9j() { // from class: l.lb7
            public final Object call() {
                return new la20(v9jVar).compose(mkd0.C()).map(new w9j() { // from class: l.fc7
                    public final Object call(Object obj) {
                        return C1578a.m1340D1((Envelope) obj);
                    }
                });
            }
        }, false);
    }

    /* JADX INFO: renamed from: Z1 */
    public rx.c<roj0> m1440Z1(final String str) {
        final v9j v9jVar = new v9j() { // from class: l.qa7
            public final Object call() {
                String str2 = str;
                return qib0.H.auth().q(omg.m12703k("/users/" + FeedModule.m1139F().userId() + "/musics/" + str2 + "/favors/me")).e(utc0.create(Network.JSON, "{\"id\":\"" + str2 + "\"}")).b();
            }
        };
        return scheduled("deleteFavor", 0, new v9j() { // from class: l.ra7
            public final Object call() {
                return this.f12573a.m1453m2(v9jVar, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: a2 */
    public rx.c<File> m1441a2(CameraSticker cameraSticker) {
        return pb4.m12961O().m13000I(cameraSticker);
    }

    /* JADX INFO: renamed from: b2 */
    public rx.c<MusicContent> m1442b2(Music music) {
        return pb4.m12961O().m13001J(music);
    }

    /* JADX INFO: renamed from: c2 */
    public rx.c<File> m1443c2(CameraSticker cameraSticker) {
        return pb4.m12961O().m13002K(cameraSticker);
    }

    /* JADX INFO: renamed from: d2 */
    public rx.c<List<Music>> m1444d2() {
        return m1448h2("favor");
    }

    /* JADX INFO: renamed from: e2 */
    public rx.c<Boolean> m1445e2() {
        return rx.c.fromCallable(new Callable() { // from class: l.ub7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C1578a.m1368S0();
            }
        }).compose(mkd0.Q()).flatMap(new w9j() { // from class: l.vb7
            public final Object call(Object obj) {
                return this.f14136a.m1456p2((DbLinks) obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: f2 */
    public rx.c<roj0> m1446f2() {
        return m1447g2(true);
    }

    /* JADX INFO: renamed from: g2 */
    public rx.c<roj0> m1447g2(boolean z) {
        return this.f653H.l(z).map(new w9j() { // from class: l.y97
            public final Object call(Object obj) {
                return vwb.n((List) obj, new w9j() { // from class: l.bc7
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(vb4.m15408g(((CameraFilter) obj2).minVersion));
                    }
                });
            }
        }).flatMap(new w9j() { // from class: l.ja7
            public final Object call(Object obj) {
                return pb4.m12972d0((ArrayList) obj);
            }
        }).map(new w9j() { // from class: l.ua7
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: h2 */
    public rx.subjects.a<List<Music>> m1448h2(String str) {
        rx.subjects.a<List<Music>> aVar = this.f660O.get(str);
        if (aVar != null) {
            return aVar;
        }
        rx.subjects.a<List<Music>> aVarC = rx.subjects.a.c(new ArrayList());
        this.f660O.put(str, aVarC);
        return aVarC;
    }

    /* JADX INFO: renamed from: i2 */
    public boolean m1449i2() {
        return !vwb.J((Collection) this.f657L.e());
    }

    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ roj0 m1450j2(Music music, Envelope envelope) {
        for (rx.subjects.a<List<Music>> aVar : this.f660O.values()) {
            if (aVar != null && aVar.e() != null) {
                for (Music music2 : (List) aVar.e()) {
                    if (TextUtils.equals(music.f242id, music2.f242id)) {
                        music2.favor = true;
                        aVar.onNext((List) aVar.e());
                    }
                }
            }
        }
        List list = (List) m1448h2("favor").e();
        Music musicM18500clone = music.m18500clone();
        m1437W2(musicM18500clone);
        musicM18500clone.favor = true;
        list.add(0, musicM18500clone);
        m1448h2("favor").onNext(list);
        return roj0.a;
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ rx.c m1451k2(v9j v9jVar, final Music music) {
        return new la20(v9jVar).compose(mkd0.C()).map(new w9j() { // from class: l.pb7
            public final Object call(Object obj) {
                return this.f11777a.m1450j2(music, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ roj0 m1452l2(final String str, Envelope envelope) {
        for (rx.subjects.a<List<Music>> aVar : this.f660O.values()) {
            if (aVar != null && aVar.e() != null) {
                for (Music music : (List) aVar.e()) {
                    if (TextUtils.equals(str, music.f242id)) {
                        music.favor = false;
                        aVar.onNext((List) aVar.e());
                        m1437W2(music);
                    }
                }
            }
        }
        List list = (List) m1448h2("favor").e();
        vwb.d0(list, new w9j() { // from class: l.wb7
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Music) obj).f242id, str));
            }
        });
        m1448h2("favor").onNext(list);
        return roj0.a;
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ rx.c m1453m2(v9j v9jVar, final String str) {
        return new la20(v9jVar).compose(mkd0.C()).map(new w9j() { // from class: l.rb7
            public final Object call(Object obj) {
                return this.f12585a.m1452l2(str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ Boolean m1454n2(Envelope envelope) {
        List list = (List) m1448h2("favor").e();
        list.addAll(((FeedData) envelope.getModuleData(FeedData.class)).musics);
        m1448h2("favor").onNext(vwb.h(list, new w9j() { // from class: l.sc7
            public final Object call(Object obj) {
                return ((Music) obj).f242id;
            }
        }));
        return Boolean.valueOf(envelope.pagination.links.next != null);
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ rx.c m1455o2(v9j v9jVar) {
        return new la20(v9jVar).doOnNext(new e30() { // from class: l.hc7
            public final void call(Object obj) {
                C1578a.m1382g1((Envelope) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.ic7
            public final Object call(Object obj) {
                return this.f8985a.m1454n2((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ rx.c m1456p2(DbLinks dbLinks) {
        final String str = dbLinks == null ? null : dbLinks.links.next;
        if (str == null) {
            return rx.c.just(Boolean.FALSE);
        }
        final v9j v9jVar = new v9j() { // from class: l.ac7
            public final Object call() {
                return qib0.H.auth().q(omg.m12703k("/users/me/musics?search=favors&limit=20&" + str)).f().b();
            }
        };
        return scheduled("loadmorefavor", 0, new v9j() { // from class: l.cc7
            public final Object call() {
                return this.f6606a.m1455o2(v9jVar);
            }
        }, false);
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m1457q2(List list) {
        this.f661P.onNext(list);
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m1458r2(List list) {
        this.f657L.onNext(list);
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m1459s2(List list) {
        this.f658M.onNext(list);
    }

    /* JADX INFO: renamed from: t2 */
    public final /* synthetic */ void m1460t2(List list) {
        this.f659N.onNext(list);
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ roj0 m1461u2(Envelope envelope) {
        m1448h2("favor").onNext(((FeedData) envelope.getModuleData(FeedData.class)).musics);
        return roj0.a;
    }

    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ rx.c m1462v2(v9j v9jVar) {
        return new la20(v9jVar).doOnNext(new e30() { // from class: l.sb7
            public final void call(Object obj) {
                C1578a.m1346G1((Envelope) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.tb7
            public final Object call(Object obj) {
                return this.f13250a.m1461u2((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ Boolean m1463w2(String str, Envelope envelope) {
        this.f655J.onNext(new Pair(str, ((FeedData) envelope.getModuleData(FeedData.class)).moments));
        this.f656K.onNext(((FeedData) envelope.getModuleData(FeedData.class)).musics.get(0));
        return Boolean.valueOf(envelope.pagination.links.next != null);
    }

    /* JADX INFO: renamed from: x2 */
    public final /* synthetic */ rx.c m1464x2(v9j v9jVar, final String str) {
        return new la20(v9jVar).doOnNext(new e30() { // from class: l.cb7
            public final void call(Object obj) {
                C1578a.m1391p1((Envelope) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.db7
            public final Object call(Object obj) {
                return this.f6885a.m1463w2(str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ roj0 m1465y2(String str, Envelope envelope) {
        m1448h2(str).onNext(((FeedData) envelope.getModuleData(FeedData.class)).musics);
        return roj0.a;
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ rx.c m1466z2(v9j v9jVar, final String str) {
        return new la20(v9jVar).doOnNext(new e30() { // from class: l.mb7
            public final void call(Object obj) {
                C1578a.m1389n1(str, (Envelope) obj);
            }
        }).compose(mkd0.C()).map(new w9j() { // from class: l.nb7
            public final Object call(Object obj) {
                return this.f10733a.m1465y2(str, (Envelope) obj);
            }
        }).doOnError(new e30() { // from class: l.ob7
            public final void call(Object obj) {
                lsi0.h(R$string.f592q1);
            }
        });
    }
}
