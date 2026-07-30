package com.p051p1.mobile.putong.feed.api;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.UiThread;
import com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.api.C10897a;
import com.p051p1.mobile.putong.feed.data.CameraBeautyMode;
import com.p051p1.mobile.putong.feed.data.CameraCategory;
import com.p051p1.mobile.putong.feed.data.CameraFilter;
import com.p051p1.mobile.putong.feed.data.CameraSticker;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MusicCategory;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.dji;
import p153l.dog;
import p153l.fo0;
import p153l.gcg0;
import p153l.jyb;
import p153l.l9c;
import p153l.mof0;
import p153l.oc4;
import p153l.pcj;
import p153l.psd0;
import p153l.qcj;
import p153l.ti20;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vod;
import p153l.x20;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.api.a */
/* JADX INFO: loaded from: classes13.dex */
public class C10897a extends dog {

    /* JADX INFO: renamed from: H */
    public a f40040H;

    /* JADX INFO: renamed from: I */
    public b f40041I;

    /* JADX INFO: renamed from: J */
    public C22507a<Pair<String, List<Moment>>> f40042J = C22507a.m222758b();

    /* JADX INFO: renamed from: K */
    public C22507a<Music> f40043K = C22507a.m222758b();

    /* JADX INFO: renamed from: L */
    public C22507a<List<CameraCategory>> f40044L = C22507a.m222758b();

    /* JADX INFO: renamed from: M */
    public C22507a<List<CameraCategory>> f40045M = C22507a.m222758b();

    /* JADX INFO: renamed from: N */
    public C22507a<List<CameraCategory>> f40046N = C22507a.m222758b();

    /* JADX INFO: renamed from: O */
    public HashMap<String, C22507a<List<Music>>> f40047O = new HashMap<>();

    /* JADX INFO: renamed from: P */
    public C22507a<List<List<CameraBeautyMode>>> f40048P = C22507a.m222758b();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.api.a$a */
    public class a extends mof0<List<CameraFilter>> {
        public a() {
            super(C10897a.this, "loadFilters", new dji(new vod("filters", null, FeedModule.m61405F().userId()), -1, ProtobufAdapter.ARRAY_ADAPTER(CameraFilter.PROTOBUF_ADAPTER)), new pcj() { // from class: l.be7
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return new ti20(new pcj() { // from class: l.ce7
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            return dog.f89929G.auth().m209043q(dog.m117246k("/cameraFilters")).m209032f().m209028b();
                        }
                    }).map(new qcj() { // from class: l.de7
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return ((FeedData) ((Envelope) obj).getModuleData(FeedData.class)).cameraFilters;
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.api.a$b */
    public class b extends mof0<List<CameraCategory>> {
        public b() {
            super(C10897a.this, "loadMakeup", new dji(new vod("makeup", null, FeedModule.m61405F().userId()), -1, ProtobufAdapter.ARRAY_ADAPTER(CameraCategory.PROTOBUF_ADAPTER)), new pcj() { // from class: l.ee7
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return new ti20(new pcj() { // from class: l.fe7
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            return dog.f89929G.auth().m209043q(dog.m117246k("/cameraCategories?filter=makeup&search=makeup")).m209032f().m209028b();
                        }
                    }).map(new qcj() { // from class: l.ge7
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return ((FeedData) ((Envelope) obj).getModuleData(FeedData.class)).cameraCategories;
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.api.a$c */
    public class c extends mof0<List<CameraSticker>> {
        public c(final String str) {
            super(C10897a.this, "loadMakeupItem", new dji(new vod("makeupItem" + str, null, null), -1, ProtobufAdapter.ARRAY_ADAPTER(CameraSticker.PROTOBUF_ADAPTER)), new pcj() { // from class: l.ie7
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return new ti20(new pcj() { // from class: l.je7
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            return dog.f89929G.auth().m209043q(dog.m117246k("/cameraCategories/" + str + "?filter=makeup")).m209032f().m209028b();
                        }
                    }).map(new qcj() { // from class: l.ke7
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return C10897a.c.m61732C((Envelope) obj);
                        }
                    });
                }
            });
        }

        /* JADX INFO: renamed from: C */
        public static /* synthetic */ List m61732C(Envelope envelope) {
            ArrayList arrayListM147522n = jyb.m147522n(((FeedData) envelope.getModuleData(FeedData.class)).cameraStickers, new qcj() { // from class: l.he7
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(uc4.m195357g(((CameraSticker) obj).minVersion));
                }
            });
            oc4.m167081O().m167138z(arrayListM147522n);
            return arrayListM147522n;
        }
    }

    public C10897a() {
        this.f40040H = new a();
        this.f40041I = new b();
        this.f40047O.put("hot", C22507a.m222759c(new ArrayList()));
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ List m61595C0(qcj qcjVar, Envelope envelope) {
        ArrayList arrayListM147522n = jyb.m147522n(((FeedData) envelope.getModuleData(FeedData.class)).cameraStickers, new qcj() { // from class: l.kd7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(uc4.m195357g(((CameraSticker) obj).minVersion));
            }
        });
        if (NullChecker.m82486a(qcjVar)) {
            arrayListM147522n = jyb.m147522n(arrayListM147522n, qcjVar);
        }
        oc4.m167081O().m167119A(arrayListM147522n);
        return arrayListM147522n;
    }

    /* JADX INFO: renamed from: C1 */
    public static /* synthetic */ void m61596C1(String str, Envelope envelope) {
        DbLinks dbLinks = new DbLinks();
        dbLinks.f56859id = "music_" + str;
        dbLinks.links = envelope.pagination.links;
        uqb0.f180405k0.m201492n(dbLinks);
    }

    /* JADX INFO: renamed from: D1 */
    public static /* synthetic */ Music m61598D1(Envelope envelope) {
        List<Music> list = ((FeedData) envelope.getModuleData(FeedData.class)).musics;
        if (jyb.m147479J(list)) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: G1 */
    public static /* synthetic */ void m61604G1(Envelope envelope) {
        DbLinks dbLinks = new DbLinks();
        dbLinks.f56859id = "music_favor";
        dbLinks.links = envelope.pagination.links;
        uqb0.f180405k0.m201492n(dbLinks);
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ DbLinks m61607I0(String str) {
        return (DbLinks) uqb0.f180405k0.f184354c.query("music_" + str);
    }

    /* JADX INFO: renamed from: J1 */
    public static /* synthetic */ void m61610J1(Envelope envelope) {
        DbLinks dbLinks = new DbLinks();
        dbLinks.f56859id = "music_moment_links_id";
        dbLinks.links = envelope.pagination.links;
        uqb0.f180405k0.m201492n(dbLinks);
    }

    /* JADX INFO: renamed from: N1 */
    public static /* synthetic */ List m61618N1(List list) {
        oc4.m167081O().m167138z(list);
        return list;
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ DbLinks m61626S0() {
        return (DbLinks) uqb0.f180405k0.f184354c.query("music_favor");
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ DbLinks m61629V0() {
        return (DbLinks) uqb0.f180405k0.f184354c.query("music_moment_links_id");
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ void m61631X0(Throwable th) {
        th.printStackTrace();
        CrashHelper.m82479c(th);
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ void m61640g1(Envelope envelope) {
        DbLinks dbLinks = new DbLinks();
        dbLinks.f56859id = "music_favor";
        dbLinks.links = envelope.pagination.links;
        uqb0.f180405k0.m201492n(dbLinks);
    }

    /* JADX INFO: renamed from: n1 */
    public static /* synthetic */ void m61647n1(String str, Envelope envelope) {
        final DbLinks dbLinks = new DbLinks();
        dbLinks.f56859id = "music_" + str;
        dbLinks.links = envelope.pagination.links;
        l9c.m153394o().m153397B(new x20() { // from class: l.bd7
            @Override // p153l.x20
            public final void call() {
                uqb0.f180405k0.f184354c.upsert(dbLinks);
            }
        });
    }

    /* JADX INFO: renamed from: p1 */
    public static /* synthetic */ void m61649p1(Envelope envelope) {
        DbLinks dbLinks = new DbLinks();
        dbLinks.f56859id = "music_moment_links_id";
        dbLinks.links = envelope.pagination.links;
        uqb0.f180405k0.m201492n(dbLinks);
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ List m61655u0(qcj qcjVar, Envelope envelope) {
        ArrayList arrayListM147522n = jyb.m147522n(((FeedData) envelope.getModuleData(FeedData.class)).cameraStickers, new qcj() { // from class: l.nc7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(uc4.m195357g(((CameraSticker) obj).minVersion));
            }
        });
        if (NullChecker.m82486a(qcjVar)) {
            arrayListM147522n = jyb.m147522n(arrayListM147522n, qcjVar);
        }
        oc4.m167081O().m167119A(arrayListM147522n);
        return arrayListM147522n;
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m61661x0(Throwable th) {
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m61663y0(gcg0 gcg0Var) {
        try {
            gcg0Var.m137019l(CameraBeautyMode.JSON_ADAPTER.ARRAY_ADAPTER().ARRAY_ADAPTER().parse(FeedModule.f39700a.getAssets().open("MMBeautyAutoModelgeo.json")));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            gcg0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ Boolean m61667A2(String str, Envelope envelope) {
        List arrayList = this.f40042J.m222761e() == null ? new ArrayList() : (List) this.f40042J.m222761e().second;
        if (!jyb.m147479J(((FeedData) envelope.getModuleData(FeedData.class)).moments)) {
            arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).moments);
        }
        this.f40042J.m137019l(new Pair<>(str, jyb.m147510h(arrayList, new qcj() { // from class: l.xd7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Moment) obj).f56859id;
            }
        })));
        return Boolean.valueOf(envelope.pagination.links.next != null);
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ C22421c m61668B2(pcj pcjVar, final String str) {
        return new ti20(pcjVar).doOnNext(new y20() { // from class: l.ud7
            @Override // p153l.y20
            public final void call(Object obj) {
                C10897a.m61610J1((Envelope) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.vd7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f183544a.m61667A2(str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ C22421c m61669C2(final String str, DbLinks dbLinks) {
        final String str2 = dbLinks == null ? null : dbLinks.links.next;
        if (str2 == null) {
            return C22421c.just(Boolean.FALSE);
        }
        final pcj pcjVar = new pcj() { // from class: l.nd7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209043q(dog.m117246k("/moments?search=music&query=" + str + "&" + str2)).m209032f().m209028b();
            }
        };
        return scheduled("loadmoremoment", 0, new pcj() { // from class: l.od7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f146851a.m61668B2(pcjVar, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ Boolean m61670D2(String str, Envelope envelope) {
        List<Music> listM222761e = m61706h2(str).m222761e();
        listM222761e.addAll(((FeedData) envelope.getModuleData(FeedData.class)).musics);
        m61706h2(str).m137019l(jyb.m147510h(listM222761e, new qcj() { // from class: l.td7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Music) obj).f39629id;
            }
        }));
        return Boolean.valueOf(envelope.pagination.links.next != null);
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ C22421c m61671E2(pcj pcjVar, final String str) {
        return new ti20(pcjVar).doOnNext(new y20() { // from class: l.pd7
            @Override // p153l.y20
            public final void call(Object obj) {
                C10897a.m61596C1(str, (Envelope) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.rd7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f162287a.m61670D2(str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F2 */
    public final /* synthetic */ C22421c m61672F2(final String str, DbLinks dbLinks) {
        final String str2 = dbLinks == null ? null : dbLinks.links.next;
        if (str2 == null) {
            return C22421c.just(Boolean.FALSE);
        }
        final pcj pcjVar = new pcj() { // from class: l.cd7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209043q(dog.m117246k("/musics?search=category&query=" + str + "&" + str2)).m209032f().m209028b();
            }
        };
        return scheduled("loadmore" + str, 0, new pcj() { // from class: l.dd7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f87859a.m61671E2(pcjVar, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: G2 */
    public void m61673G2() {
        m61690U1().subscribe(psd0.m173596G(new y20() { // from class: l.xb7
            @Override // p153l.y20
            public final void call(Object obj) {
                l94.m153309e().m153322n((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H2 */
    public void m61674H2() {
        C22421c.create(new C22421c.a() { // from class: l.pb7
            @Override // p153l.y20
            public final void call(Object obj) {
                C10897a.m61663y0((gcg0) obj);
            }
        }).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.qb7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156457a.m61715q2((List) obj);
            }
        }, new y20() { // from class: l.rb7
            @Override // p153l.y20
            public final void call(Object obj) {
                C10897a.m61631X0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I2 */
    public void m61675I2() {
        final pcj pcjVar = new pcj() { // from class: l.bc7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209043q(dog.m117246k("/cameraCategories?filter=default,beauty")).m209032f().m209028b();
            }
        };
        scheduled("cameraCategories", 0, new pcj() { // from class: l.cc7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(pcjVar).compose(psd0.m173592C()).map(new qcj() { // from class: l.kc7
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((FeedData) ((Envelope) obj).getModuleData(FeedData.class)).cameraCategories;
                    }
                });
            }
        }, false).subscribe(psd0.m173597H(new y20() { // from class: l.dc7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f87755a.m61716r2((List) obj);
            }
        }, new y20() { // from class: l.ec7
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }));
    }

    /* JADX INFO: renamed from: J2 */
    public void m61676J2() {
        this.f40041I.m159274k().subscribe(psd0.m173597H(new y20() { // from class: l.kb7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124755a.m61717s2((List) obj);
            }
        }, new y20() { // from class: l.lb7
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }));
    }

    /* JADX INFO: renamed from: K2 */
    public void m61677K2() {
        final pcj pcjVar = new pcj() { // from class: l.zd7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209043q(dog.m117246k("/cameraCategories?filter=cartoon&search=cartoon")).m209032f().m209028b();
            }
        };
        scheduled("cameraCategoriesCartoon", 0, new pcj() { // from class: l.ae7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(pcjVar).compose(psd0.m173592C()).map(new qcj() { // from class: l.fc7
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((FeedData) ((Envelope) obj).getModuleData(FeedData.class)).cameraCategories;
                    }
                });
            }
        }, false).subscribe(psd0.m173597H(new y20() { // from class: l.db7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85968a.m61718t2((List) obj);
            }
        }, new y20() { // from class: l.eb7
            @Override // p153l.y20
            public final void call(Object obj) {
                C10897a.m61661x0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L2 */
    public void m61678L2() {
        final pcj pcjVar = new pcj() { // from class: l.fb7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209043q(dog.m117246k("/users/me/musics?search=favors&limit=20")).m209032f().m209028b();
            }
        };
        scheduled("loadfavor", 0, new pcj() { // from class: l.gb7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f103058a.m61720v2(pcjVar);
            }
        }, true);
    }

    /* JADX INFO: renamed from: M2 */
    public C22421c<Boolean> m61679M2(final String str) {
        final pcj pcjVar = new pcj() { // from class: l.zb7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209043q(dog.m117246k("/moments?search=music&query=" + str + "&with=musics&limit=20")).m209032f().m209028b();
            }
        };
        return scheduled("loadMomentList", 0, new pcj() { // from class: l.ac7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f69679a.m61722x2(pcjVar, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: N2 */
    public C22421c<List<MusicCategory>> m61680N2() {
        final pcj pcjVar = new pcj() { // from class: l.qd7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209043q(dog.m117246k("/musicCategories")).m209032f().m209028b();
            }
        };
        return scheduled("loadMusicCategory", 0, new pcj() { // from class: l.yd7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(pcjVar).compose(psd0.m173592C()).map(new qcj() { // from class: l.hb7
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((FeedData) ((Envelope) obj).getModuleData(FeedData.class)).musicCategories;
                    }
                });
            }
        }, true);
    }

    /* JADX INFO: renamed from: O2 */
    public C22421c<uxj0> m61681O2(final String str) {
        final pcj pcjVar = new pcj() { // from class: l.mb7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209043q(dog.m117246k("/musics?search=category&query=" + str + "&limit=20")).m209032f().m209028b();
            }
        };
        return scheduled(TrackLoadSettingsAtom.TYPE + str, 0, new pcj() { // from class: l.ob7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f145945a.m61724z2(pcjVar, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: P2 */
    public void m61682P2() {
        if (this.f40040H.m159277n() == null || this.f40040H.m159277n().size() == 0) {
            oc4.m167081O();
            oc4.m167092d0(new ArrayList()).subscribe();
        }
        this.f40040H.m159280q();
        m61675I2();
        m61674H2();
        m61676J2();
        m61677K2();
    }

    /* JADX INFO: renamed from: Q2 */
    public C22421c<List<CameraSticker>> m61683Q2(String str) {
        return new c(str).m159274k().map(new qcj() { // from class: l.sd7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C10897a.m61618N1((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R1 */
    public C22421c<uxj0> m61684R1(final Music music) {
        final pcj pcjVar = new pcj() { // from class: l.sb7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                Music music2 = music;
                return uqb0.f180376H.auth().m209043q(dog.m117246k("/users/" + FeedModule.m61405F().userId() + "/musics/" + music2.f39629id + "/favors/me")).m209039m(z1d0.create(Network.JSON, "{\"id\":\"" + music2.f39629id + "\"}")).m209028b();
            }
        };
        return scheduled("addFavor", 0, new pcj() { // from class: l.tb7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f172835a.m61709k2(pcjVar, music);
            }
        }, false);
    }

    /* JADX INFO: renamed from: R2 */
    public C22421c<Pair<String, List<Moment>>> m61685R2() {
        return this.f40042J;
    }

    /* JADX INFO: renamed from: S1 */
    public C22421c<Music> m61686S1() {
        return this.f40043K;
    }

    /* JADX INFO: renamed from: S2 */
    public C22421c<Boolean> m61687S2(final String str) {
        return C22421c.fromCallable(new Callable() { // from class: l.hd7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C10897a.m61629V0();
            }
        }).compose(psd0.m173606Q()).flatMap(new qcj() { // from class: l.id7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f114476a.m61669C2(str, (DbLinks) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: T1 */
    public C22421c<List<List<CameraBeautyMode>>> m61688T1() {
        return this.f40048P;
    }

    /* JADX INFO: renamed from: T2 */
    public C22421c<List<Music>> m61689T2(String str) {
        return m61706h2(str);
    }

    /* JADX INFO: renamed from: U1 */
    public C22421c<List<CameraCategory>> m61690U1() {
        return this.f40044L;
    }

    /* JADX INFO: renamed from: U2 */
    public C22421c<Boolean> m61691U2(final String str) {
        return C22421c.fromCallable(new pcj() { // from class: l.lc7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C10897a.m61607I0(str);
            }
        }).compose(psd0.m173606Q()).flatMap(new qcj() { // from class: l.mc7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f135797a.m61672F2(str, (DbLinks) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: V1 */
    public C22421c<List<CameraCategory>> m61692V1() {
        return this.f40046N;
    }

    /* JADX INFO: renamed from: V2 */
    public C22421c<List<CameraSticker>> m61693V2(final qcj<CameraSticker, Boolean> qcjVar, final String str) {
        final pcj pcjVar = new pcj() { // from class: l.jc7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209043q(dog.m117246k("/cameraCategories/" + str + "?search = sticker&filter=default,beauty")).m209032f().m209028b();
            }
        };
        return scheduled("cameraCategoriesInCid" + str, 0, new pcj() { // from class: l.uc7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(pcjVar).compose(psd0.m173592C()).map(new qcj() { // from class: l.wb7
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C10897a.m61655u0(qcjVar, (Envelope) obj);
                    }
                });
            }
        }, true);
    }

    /* JADX INFO: renamed from: W1 */
    public C22421c<List<CameraCategory>> m61694W1() {
        return this.f40045M;
    }

    @UiThread
    /* JADX INFO: renamed from: W2 */
    public void m61695W2(Music music) {
        this.f40043K.m137019l(music);
    }

    /* JADX INFO: renamed from: X1 */
    public C22421c<List<CameraSticker>> m61696X1(final qcj<CameraSticker, Boolean> qcjVar, final String str) {
        final pcj pcjVar = new pcj() { // from class: l.ib7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209043q(dog.m117246k("/cameraCategories/" + str + "?search=cartoon&filter=cartoon")).m209032f().m209028b();
            }
        };
        return scheduled("cameraCategoriesInCid" + str, 0, new pcj() { // from class: l.jb7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(pcjVar).compose(psd0.m173592C()).map(new qcj() { // from class: l.ic7
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C10897a.m61595C0(qcjVar, (Envelope) obj);
                    }
                });
            }
        }, true);
    }

    /* JADX INFO: renamed from: Y1 */
    public C22421c<Music> m61697Y1(final int i) {
        final pcj pcjVar = new pcj() { // from class: l.oc7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209043q(dog.m117246k("/musics?search=filter&query=" + i)).m209032f().m209028b();
            }
        };
        return scheduled("loadmore" + i, 0, new pcj() { // from class: l.pc7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(pcjVar).compose(psd0.m173592C()).map(new qcj() { // from class: l.jd7
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C10897a.m61598D1((Envelope) obj);
                    }
                });
            }
        }, false);
    }

    /* JADX INFO: renamed from: Z1 */
    public C22421c<uxj0> m61698Z1(final String str) {
        final pcj pcjVar = new pcj() { // from class: l.ub7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                String str2 = str;
                return uqb0.f180376H.auth().m209043q(dog.m117246k("/users/" + FeedModule.m61405F().userId() + "/musics/" + str2 + "/favors/me")).m209031e(z1d0.create(Network.JSON, "{\"id\":\"" + str2 + "\"}")).m209028b();
            }
        };
        return scheduled("deleteFavor", 0, new pcj() { // from class: l.vb7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f183212a.m61711m2(pcjVar, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: a2 */
    public C22421c<File> m61699a2(CameraSticker cameraSticker) {
        return oc4.m167081O().m167120I(cameraSticker);
    }

    /* JADX INFO: renamed from: b2 */
    public C22421c<MusicContent> m61700b2(Music music) {
        return oc4.m167081O().m167121J(music);
    }

    /* JADX INFO: renamed from: c2 */
    public C22421c<File> m61701c2(CameraSticker cameraSticker) {
        return oc4.m167081O().m167122K(cameraSticker);
    }

    /* JADX INFO: renamed from: d2 */
    public C22421c<List<Music>> m61702d2() {
        return m61706h2("favor");
    }

    /* JADX INFO: renamed from: e2 */
    public C22421c<Boolean> m61703e2() {
        return C22421c.fromCallable(new Callable() { // from class: l.yc7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C10897a.m61626S0();
            }
        }).compose(psd0.m173606Q()).flatMap(new qcj() { // from class: l.zc7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f203738a.m61714p2((DbLinks) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: f2 */
    public C22421c<uxj0> m61704f2() {
        return m61705g2(true);
    }

    /* JADX INFO: renamed from: g2 */
    public C22421c<uxj0> m61705g2(boolean z) {
        return this.f40040H.m159275l(z).map(new qcj() { // from class: l.cb7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jyb.m147522n((List) obj, new qcj() { // from class: l.fd7
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(uc4.m195357g(((CameraFilter) obj2).minVersion));
                    }
                });
            }
        }).flatMap(new qcj() { // from class: l.nb7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return oc4.m167092d0((ArrayList) obj);
            }
        }).map(new qcj() { // from class: l.yb7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: h2 */
    public C22507a<List<Music>> m61706h2(String str) {
        C22507a<List<Music>> c22507a = this.f40047O.get(str);
        if (c22507a != null) {
            return c22507a;
        }
        C22507a<List<Music>> c22507aM222759c = C22507a.m222759c(new ArrayList());
        this.f40047O.put(str, c22507aM222759c);
        return c22507aM222759c;
    }

    /* JADX INFO: renamed from: i2 */
    public boolean m61707i2() {
        return !jyb.m147479J(this.f40044L.m222761e());
    }

    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ uxj0 m61708j2(Music music, Envelope envelope) {
        for (C22507a<List<Music>> c22507a : this.f40047O.values()) {
            if (c22507a != null && c22507a.m222761e() != null) {
                for (Music music2 : c22507a.m222761e()) {
                    if (TextUtils.equals(music.f39629id, music2.f39629id)) {
                        music2.favor = true;
                        c22507a.m137019l(c22507a.m222761e());
                    }
                }
            }
        }
        List<Music> listM222761e = m61706h2("favor").m222761e();
        Music musicMo225055clone = music.mo225055clone();
        m61695W2(musicMo225055clone);
        musicMo225055clone.favor = true;
        listM222761e.add(0, musicMo225055clone);
        m61706h2("favor").m137019l(listM222761e);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ C22421c m61709k2(pcj pcjVar, final Music music) {
        return new ti20(pcjVar).compose(psd0.m173592C()).map(new qcj() { // from class: l.tc7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f173211a.m61708j2(music, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ uxj0 m61710l2(final String str, Envelope envelope) {
        for (C22507a<List<Music>> c22507a : this.f40047O.values()) {
            if (c22507a != null && c22507a.m222761e() != null) {
                for (Music music : c22507a.m222761e()) {
                    if (TextUtils.equals(str, music.f39629id)) {
                        music.favor = false;
                        c22507a.m137019l(c22507a.m222761e());
                        m61695W2(music);
                    }
                }
            }
        }
        List<Music> listM222761e = m61706h2("favor").m222761e();
        jyb.m147503d0(listM222761e, new qcj() { // from class: l.ad7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Music) obj).f39629id, str));
            }
        });
        m61706h2("favor").m137019l(listM222761e);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ C22421c m61711m2(pcj pcjVar, final String str) {
        return new ti20(pcjVar).compose(psd0.m173592C()).map(new qcj() { // from class: l.vc7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f183339a.m61710l2(str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ Boolean m61712n2(Envelope envelope) {
        List<Music> listM222761e = m61706h2("favor").m222761e();
        listM222761e.addAll(((FeedData) envelope.getModuleData(FeedData.class)).musics);
        m61706h2("favor").m137019l(jyb.m147510h(listM222761e, new qcj() { // from class: l.wd7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Music) obj).f39629id;
            }
        }));
        return Boolean.valueOf(envelope.pagination.links.next != null);
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ C22421c m61713o2(pcj pcjVar) {
        return new ti20(pcjVar).doOnNext(new y20() { // from class: l.ld7
            @Override // p153l.y20
            public final void call(Object obj) {
                C10897a.m61640g1((Envelope) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.md7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f135868a.m61712n2((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ C22421c m61714p2(DbLinks dbLinks) {
        final String str = dbLinks == null ? null : dbLinks.links.next;
        if (str == null) {
            return C22421c.just(Boolean.FALSE);
        }
        final pcj pcjVar = new pcj() { // from class: l.ed7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209043q(dog.m117246k("/users/me/musics?search=favors&limit=20&" + str)).m209032f().m209028b();
            }
        };
        return scheduled("loadmorefavor", 0, new pcj() { // from class: l.gd7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f103633a.m61713o2(pcjVar);
            }
        }, false);
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m61715q2(List list) {
        this.f40048P.m137019l(list);
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m61716r2(List list) {
        this.f40044L.m137019l(list);
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m61717s2(List list) {
        this.f40045M.m137019l(list);
    }

    /* JADX INFO: renamed from: t2 */
    public final /* synthetic */ void m61718t2(List list) {
        this.f40046N.m137019l(list);
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ uxj0 m61719u2(Envelope envelope) {
        m61706h2("favor").m137019l(((FeedData) envelope.getModuleData(FeedData.class)).musics);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ C22421c m61720v2(pcj pcjVar) {
        return new ti20(pcjVar).doOnNext(new y20() { // from class: l.wc7
            @Override // p153l.y20
            public final void call(Object obj) {
                C10897a.m61604G1((Envelope) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.xc7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f193271a.m61719u2((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ Boolean m61721w2(String str, Envelope envelope) {
        this.f40042J.m137019l(new Pair<>(str, ((FeedData) envelope.getModuleData(FeedData.class)).moments));
        this.f40043K.m137019l(((FeedData) envelope.getModuleData(FeedData.class)).musics.get(0));
        return Boolean.valueOf(envelope.pagination.links.next != null);
    }

    /* JADX INFO: renamed from: x2 */
    public final /* synthetic */ C22421c m61722x2(pcj pcjVar, final String str) {
        return new ti20(pcjVar).doOnNext(new y20() { // from class: l.gc7
            @Override // p153l.y20
            public final void call(Object obj) {
                C10897a.m61649p1((Envelope) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.hc7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f108677a.m61721w2(str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ uxj0 m61723y2(String str, Envelope envelope) {
        m61706h2(str).m137019l(((FeedData) envelope.getModuleData(FeedData.class)).musics);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ C22421c m61724z2(pcj pcjVar, final String str) {
        return new ti20(pcjVar).doOnNext(new y20() { // from class: l.qc7
            @Override // p153l.y20
            public final void call(Object obj) {
                C10897a.m61647n1(str, (Envelope) obj);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.rc7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f162071a.m61723y2(str, (Envelope) obj);
            }
        }).doOnError(new y20() { // from class: l.sc7
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165634h(R$string.f39979q1);
            }
        });
    }
}
