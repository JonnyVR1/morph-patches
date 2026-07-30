package p149l;

import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.api.C4576b;
import com.p046p1.mobile.putong.account.data.AccountCameraDataEnvelope;
import com.p046p1.mobile.putong.account.data.CameraBeautyMode;
import com.p046p1.mobile.putong.account.data.CameraCategory;
import com.p046p1.mobile.putong.account.data.CameraFilter;
import com.p046p1.mobile.putong.account.data.CameraSticker;
import com.p046p1.mobile.putong.data.Music;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: renamed from: l.qh */
/* JADX INFO: loaded from: classes9.dex */
public class C19496qh extends C4576b {

    /* JADX INFO: renamed from: g */
    public a f154408g;

    /* JADX INFO: renamed from: h */
    public b f154409h;

    /* JADX INFO: renamed from: i */
    public C22392a<List<CameraCategory>> f154410i = C22392a.m221512b();

    /* JADX INFO: renamed from: j */
    public C22392a<List<CameraCategory>> f154411j = C22392a.m221512b();

    /* JADX INFO: renamed from: k */
    public HashMap<String, C22392a<List<Music>>> f154412k = new HashMap<>();

    /* JADX INFO: renamed from: l */
    public C22392a<List<List<CameraBeautyMode>>> f154413l = C22392a.m221512b();

    /* JADX INFO: renamed from: l.qh$a */
    public class a extends fgf0<List<CameraFilter>> {
        public a() {
            super(C19496qh.this, "accountLoadFilters", new ggi(new qnd("account_filters", null, AccountModule.m28131F().userId()), -1, ProtobufAdapter.ARRAY_ADAPTER(CameraFilter.PROTOBUF_ADAPTER)), new v9j() { // from class: l.nh
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return new ka20(new v9j() { // from class: l.oh
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            return qib0.f154693H.auth().m185898q(C4576b.m28373c("/cameraFilters")).m185887f().m185883b();
                        }
                    }, AccountCameraDataEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.ph
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return ((AccountCameraDataEnvelope) obj).data.cameraFilters;
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.qh$b */
    public class b extends fgf0<List<CameraCategory>> {
        public b() {
            super(C19496qh.this, "accountMakeup", new ggi(new qnd("account_Makeup", null, AccountModule.m28131F().userId()), -1, ProtobufAdapter.ARRAY_ADAPTER(CameraCategory.PROTOBUF_ADAPTER)), new v9j() { // from class: l.rh
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return new ka20(new v9j() { // from class: l.sh
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            return qib0.f154693H.auth().m185898q(C4576b.m28373c("/cameraCategories?filter=makeup&search=makeup")).m185887f().m185883b();
                        }
                    }, AccountCameraDataEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.th
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return ((AccountCameraDataEnvelope) obj).data.cameraCategories;
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.qh$c */
    public class c extends fgf0<List<CameraSticker>> {
        public c(final String str) {
            super(C19496qh.this, "accountMakeupItem", new ggi(new qnd("account_MakeupItem", null, AccountModule.m28131F().userId()), -1, ProtobufAdapter.ARRAY_ADAPTER(CameraSticker.PROTOBUF_ADAPTER)), new v9j() { // from class: l.vh
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return new ka20(new v9j() { // from class: l.wh
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            return qib0.f154693H.auth().m185898q(C4576b.m28373c("/cameraCategories/" + str + "?filter=makeup")).m185887f().m185883b();
                        }
                    }, AccountCameraDataEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.xh
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return C19496qh.c.m174505D((AccountCameraDataEnvelope) obj);
                        }
                    });
                }
            });
        }

        /* JADX INFO: renamed from: D */
        public static /* synthetic */ List m174505D(AccountCameraDataEnvelope accountCameraDataEnvelope) {
            ArrayList arrayListM200339n = vwb.m200339n(accountCameraDataEnvelope.data.cameraStickers, new w9j() { // from class: l.uh
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(C20183tj.m189233a(((CameraSticker) obj).minVersion));
                }
            });
            C19952sj.m184358C().m184403u(arrayListM200339n);
            return arrayListM200339n;
        }
    }

    public C19496qh() {
        this.f154408g = new a();
        this.f154409h = new b();
        this.f154412k.put("hot", C22392a.m221513c(new ArrayList()));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m174464h(Throwable th) {
        th.printStackTrace();
        CrashHelper.m81296c(th);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ List m174465i(w9j w9jVar, AccountCameraDataEnvelope accountCameraDataEnvelope) {
        ArrayList arrayListM200339n = vwb.m200339n(accountCameraDataEnvelope.data.cameraStickers, new w9j() { // from class: l.ch
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(C20183tj.m189233a(((CameraSticker) obj).minVersion));
            }
        });
        if (NullChecker.m81303a(w9jVar)) {
            arrayListM200339n = vwb.m200339n(arrayListM200339n, w9jVar);
        }
        C19952sj.m184358C().m184404v(arrayListM200339n);
        return arrayListM200339n;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ List m174467k(List list) {
        C19952sj.m184358C().m184403u(list);
        return list;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m174480x(z3g0 z3g0Var) {
        try {
            z3g0Var.m132487l(CameraBeautyMode.JSON_ADAPTER.ARRAY_ADAPTER().ARRAY_ADAPTER().parse(AccountModule.f16035a.getAssets().open("AccountMMBeautyAutoModelgeo.json")));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            z3g0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: A */
    public C22306c<List<CameraCategory>> m174481A() {
        return this.f154411j;
    }

    /* JADX INFO: renamed from: B */
    public C22306c<File> m174482B(CameraSticker cameraSticker) {
        return C19952sj.m184358C().m184405y(cameraSticker);
    }

    /* JADX INFO: renamed from: C */
    public C22306c<File> m174483C(CameraSticker cameraSticker) {
        return C19952sj.m184358C().m184406z(cameraSticker);
    }

    /* JADX INFO: renamed from: D */
    public C22306c<roj0> m174484D(boolean z) {
        return this.f154408g.m121231l(z).map(new w9j() { // from class: l.fh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vwb.m200339n((List) obj, new w9j() { // from class: l.ah
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(C20183tj.m189233a(((CameraFilter) obj2).minVersion));
                    }
                });
            }
        }).flatMap(new w9j() { // from class: l.gh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C19952sj.m184364O((ArrayList) obj);
            }
        }).map(new w9j() { // from class: l.hh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: E */
    public boolean m174485E() {
        return !vwb.m200296J(this.f154410i.m221515e());
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m174486F(List list) {
        this.f154413l.m132487l(list);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m174487G(List list) {
        this.f154410i.m132487l(list);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m174488H(List list) {
        this.f154411j.m132487l(list);
    }

    /* JADX INFO: renamed from: I */
    public void m174489I() {
        C22306c.create(new C22306c.a() { // from class: l.xg
            @Override // p149l.e30
            public final void call(Object obj) {
                C19496qh.m174480x((z3g0) obj);
            }
        }).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.yg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198107a.m174486F((List) obj);
            }
        }, new e30() { // from class: l.zg
            @Override // p149l.e30
            public final void call(Object obj) {
                C19496qh.m174464h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public void m174490J() {
        final v9j v9jVar = new v9j() { // from class: l.lh
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185898q(C4576b.m28373c("/cameraCategories?filter=default,beauty")).m185887f().m185883b();
            }
        };
        scheduled("accountCameraCategories", 0, new v9j() { // from class: l.mh
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new ka20(v9jVar, AccountCameraDataEnvelope.JSON_ADAPTER).compose(mkd0.m154951C()).map(new w9j() { // from class: l.bh
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((AccountCameraDataEnvelope) obj).data.cameraCategories;
                    }
                });
            }
        }, false).subscribe(mkd0.m154956H(new e30() { // from class: l.vg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181340a.m174487G((List) obj);
            }
        }, new e30() { // from class: l.wg
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m174491K() {
        this.f154409h.m121230k().subscribe(mkd0.m154956H(new e30() { // from class: l.jh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117863a.m174488H((List) obj);
            }
        }, new e30() { // from class: l.kh
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public C22306c<roj0> m174492L() {
        if (this.f154408g.m121233n() == null || this.f154408g.m121233n().size() == 0) {
            C19952sj.m184358C();
            C19952sj.m184364O(new ArrayList()).subscribe();
        }
        this.f154408g.m121236q();
        m174490J();
        m174489I();
        m174491K();
        return C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: M */
    public C22306c<List<CameraSticker>> m174493M(String str) {
        return new c(str).m121230k().map(new w9j() { // from class: l.dh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C19496qh.m174467k((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public C22306c<List<CameraSticker>> m174494N(final w9j<CameraSticker, Boolean> w9jVar, final String str) {
        final v9j v9jVar = new v9j() { // from class: l.ug
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185898q(C4576b.m28373c("/cameraCategories/" + str + "?search = sticker&filter=default,beauty")).m185887f().m185883b();
            }
        };
        return scheduled("accountCameraCategoriesInCid" + str, 0, new v9j() { // from class: l.eh
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new ka20(v9jVar, AccountCameraDataEnvelope.JSON_ADAPTER).compose(mkd0.m154951C()).map(new w9j() { // from class: l.ih
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C19496qh.m174465i(w9jVar, (AccountCameraDataEnvelope) obj);
                    }
                });
            }
        }, true);
    }

    /* JADX INFO: renamed from: y */
    public C22306c<List<List<CameraBeautyMode>>> m174495y() {
        return this.f154413l;
    }

    /* JADX INFO: renamed from: z */
    public C22306c<List<CameraCategory>> m174496z() {
        return this.f154410i;
    }
}
