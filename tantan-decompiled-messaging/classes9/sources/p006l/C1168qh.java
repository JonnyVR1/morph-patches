package p006l;

import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.api.C0002b;
import com.p000p1.mobile.putong.account.data.AccountCameraDataEnvelope;
import com.p000p1.mobile.putong.account.data.CameraBeautyMode;
import com.p000p1.mobile.putong.account.data.CameraCategory;
import com.p000p1.mobile.putong.account.data.CameraFilter;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p1.mobile.putong.data.Music;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import l.e30;
import l.fgf0;
import l.ggi;
import l.jo0;
import l.mkd0;
import l.roj0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.z3g0;

/* JADX INFO: renamed from: l.qh */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1168qh extends C0002b {

    /* JADX INFO: renamed from: g */
    public a f19742g;

    /* JADX INFO: renamed from: h */
    public b f19743h;

    /* JADX INFO: renamed from: i */
    public rx.subjects.a<List<CameraCategory>> f19744i = rx.subjects.a.b();

    /* JADX INFO: renamed from: j */
    public rx.subjects.a<List<CameraCategory>> f19745j = rx.subjects.a.b();

    /* JADX INFO: renamed from: k */
    public HashMap<String, rx.subjects.a<List<Music>>> f19746k = new HashMap<>();

    /* JADX INFO: renamed from: l */
    public rx.subjects.a<List<List<CameraBeautyMode>>> f19747l = rx.subjects.a.b();

    /* JADX INFO: renamed from: l.qh$a */
    public class a extends fgf0<List<CameraFilter>> {
        public a() {
            super(C1168qh.this, "accountLoadFilters", new ggi(new qnd("account_filters", null, AccountModule.m26F().userId()), -1, ProtobufAdapter.ARRAY_ADAPTER(CameraFilter.PROTOBUF_ADAPTER)), new v9j() { // from class: l.nh
                public final Object call() {
                    return new ka20(new v9j() { // from class: l.oh
                        public final Object call() {
                            return qib0.f19784H.auth().q(C0002b.m268c("/cameraFilters")).f().b();
                        }
                    }, AccountCameraDataEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.ph
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
            super(C1168qh.this, "accountMakeup", new ggi(new qnd("account_Makeup", null, AccountModule.m26F().userId()), -1, ProtobufAdapter.ARRAY_ADAPTER(CameraCategory.PROTOBUF_ADAPTER)), new v9j() { // from class: l.rh
                public final Object call() {
                    return new ka20(new v9j() { // from class: l.sh
                        public final Object call() {
                            return qib0.f19784H.auth().q(C0002b.m268c("/cameraCategories?filter=makeup&search=makeup")).f().b();
                        }
                    }, AccountCameraDataEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.th
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
            super(C1168qh.this, "accountMakeupItem", new ggi(new qnd("account_MakeupItem", null, AccountModule.m26F().userId()), -1, ProtobufAdapter.ARRAY_ADAPTER(CameraSticker.PROTOBUF_ADAPTER)), new v9j() { // from class: l.vh
                public final Object call() {
                    return new ka20(new v9j() { // from class: l.wh
                        public final Object call() {
                            return qib0.f19784H.auth().q(C0002b.m268c("/cameraCategories/" + str + "?filter=makeup")).f().b();
                        }
                    }, AccountCameraDataEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.xh
                        public final Object call(Object obj) {
                            return C1168qh.c.m22089D((AccountCameraDataEnvelope) obj);
                        }
                    });
                }
            });
        }

        /* JADX INFO: renamed from: D */
        public static /* synthetic */ List m22089D(AccountCameraDataEnvelope accountCameraDataEnvelope) {
            ArrayList arrayListN = vwb.n(accountCameraDataEnvelope.data.cameraStickers, new w9j() { // from class: l.uh
                public final Object call(Object obj) {
                    return Boolean.valueOf(C1311tj.m24698a(((CameraSticker) obj).minVersion));
                }
            });
            C1262sj.m23765C().m23810u(arrayListN);
            return arrayListN;
        }
    }

    public C1168qh() {
        this.f19742g = new a();
        this.f19743h = new b();
        this.f19746k.put("hot", rx.subjects.a.c(new ArrayList()));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m22048h(Throwable th) {
        th.printStackTrace();
        CrashHelper.c(th);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ List m22049i(w9j w9jVar, AccountCameraDataEnvelope accountCameraDataEnvelope) {
        ArrayList arrayListN = vwb.n(accountCameraDataEnvelope.data.cameraStickers, new w9j() { // from class: l.ch
            public final Object call(Object obj) {
                return Boolean.valueOf(C1311tj.m24698a(((CameraSticker) obj).minVersion));
            }
        });
        if (NullChecker.a(w9jVar)) {
            arrayListN = vwb.n(arrayListN, w9jVar);
        }
        C1262sj.m23765C().m23811v(arrayListN);
        return arrayListN;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ List m22051k(List list) {
        C1262sj.m23765C().m23810u(list);
        return list;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m22064x(z3g0 z3g0Var) {
        try {
            z3g0Var.onNext(CameraBeautyMode.JSON_ADAPTER.ARRAY_ADAPTER().ARRAY_ADAPTER().parse(AccountModule.f24a.getAssets().open("AccountMMBeautyAutoModelgeo.json")));
        } catch (Exception e) {
            CrashHelper.c(e);
            z3g0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: A */
    public rx.c<List<CameraCategory>> m22065A() {
        return this.f19745j;
    }

    /* JADX INFO: renamed from: B */
    public rx.c<File> m22066B(CameraSticker cameraSticker) {
        return C1262sj.m23765C().m23812y(cameraSticker);
    }

    /* JADX INFO: renamed from: C */
    public rx.c<File> m22067C(CameraSticker cameraSticker) {
        return C1262sj.m23765C().m23813z(cameraSticker);
    }

    /* JADX INFO: renamed from: D */
    public rx.c<roj0> m22068D(boolean z) {
        return this.f19742g.l(z).map(new w9j() { // from class: l.fh
            public final Object call(Object obj) {
                return vwb.n((List) obj, new w9j() { // from class: l.ah
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(C1311tj.m24698a(((CameraFilter) obj2).minVersion));
                    }
                });
            }
        }).flatMap(new w9j() { // from class: l.gh
            public final Object call(Object obj) {
                return C1262sj.m23771O((ArrayList) obj);
            }
        }).map(new w9j() { // from class: l.hh
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: E */
    public boolean m22069E() {
        return !vwb.J((Collection) this.f19744i.e());
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m22070F(List list) {
        this.f19747l.onNext(list);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m22071G(List list) {
        this.f19744i.onNext(list);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m22072H(List list) {
        this.f19745j.onNext(list);
    }

    /* JADX INFO: renamed from: I */
    public void m22073I() {
        rx.c.create(new rx.c.a() { // from class: l.xg
            public final void call(Object obj) {
                C1168qh.m22064x((z3g0) obj);
            }
        }).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.yg
            public final void call(Object obj) {
                this.f28197a.m22070F((List) obj);
            }
        }, new e30() { // from class: l.zg
            public final void call(Object obj) {
                C1168qh.m22048h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public void m22074J() {
        final v9j v9jVar = new v9j() { // from class: l.lh
            public final Object call() {
                return qib0.f19784H.auth().q(C0002b.m268c("/cameraCategories?filter=default,beauty")).f().b();
            }
        };
        scheduled("accountCameraCategories", 0, new v9j() { // from class: l.mh
            public final Object call() {
                return new ka20(v9jVar, AccountCameraDataEnvelope.JSON_ADAPTER).compose(mkd0.C()).map(new w9j() { // from class: l.bh
                    public final Object call(Object obj) {
                        return ((AccountCameraDataEnvelope) obj).data.cameraCategories;
                    }
                });
            }
        }, false).subscribe(mkd0.H(new e30() { // from class: l.vg
            public final void call(Object obj) {
                this.f24309a.m22071G((List) obj);
            }
        }, new e30() { // from class: l.wg
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m22075K() {
        this.f19743h.k().subscribe(mkd0.H(new e30() { // from class: l.jh
            public final void call(Object obj) {
                this.f15148a.m22072H((List) obj);
            }
        }, new e30() { // from class: l.kh
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public rx.c<roj0> m22076L() {
        if (this.f19742g.n() == null || ((List) this.f19742g.n()).size() == 0) {
            C1262sj.m23765C();
            C1262sj.m23771O(new ArrayList()).subscribe();
        }
        this.f19742g.z();
        m22074J();
        m22073I();
        m22075K();
        return rx.c.just(roj0.a);
    }

    /* JADX INFO: renamed from: M */
    public rx.c<List<CameraSticker>> m22077M(String str) {
        return new c(str).k().map(new w9j() { // from class: l.dh
            public final Object call(Object obj) {
                return C1168qh.m22051k((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public rx.c<List<CameraSticker>> m22078N(final w9j<CameraSticker, Boolean> w9jVar, final String str) {
        final v9j v9jVar = new v9j() { // from class: l.ug
            public final Object call() {
                return qib0.f19784H.auth().q(C0002b.m268c("/cameraCategories/" + str + "?search = sticker&filter=default,beauty")).f().b();
            }
        };
        return scheduled("accountCameraCategoriesInCid" + str, 0, new v9j() { // from class: l.eh
            public final Object call() {
                return new ka20(v9jVar, AccountCameraDataEnvelope.JSON_ADAPTER).compose(mkd0.C()).map(new w9j() { // from class: l.ih
                    public final Object call(Object obj) {
                        return C1168qh.m22049i(w9jVar, (AccountCameraDataEnvelope) obj);
                    }
                });
            }
        }, true);
    }

    /* JADX INFO: renamed from: y */
    public rx.c<List<List<CameraBeautyMode>>> m22079y() {
        return this.f19747l;
    }

    /* JADX INFO: renamed from: z */
    public rx.c<List<CameraCategory>> m22080z() {
        return this.f19744i;
    }
}
