package p153l;

import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.api.C4727b;
import com.p051p1.mobile.putong.account.data.AccountCameraDataEnvelope;
import com.p051p1.mobile.putong.account.data.CameraBeautyMode;
import com.p051p1.mobile.putong.account.data.CameraCategory;
import com.p051p1.mobile.putong.account.data.CameraFilter;
import com.p051p1.mobile.putong.account.data.CameraSticker;
import com.p051p1.mobile.putong.data.Music;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: renamed from: l.lh */
/* JADX INFO: loaded from: classes9.dex */
public class C18394lh extends C4727b {

    /* JADX INFO: renamed from: g */
    public a f132032g;

    /* JADX INFO: renamed from: h */
    public b f132033h;

    /* JADX INFO: renamed from: i */
    public C22507a<List<CameraCategory>> f132034i = C22507a.m222758b();

    /* JADX INFO: renamed from: j */
    public C22507a<List<CameraCategory>> f132035j = C22507a.m222758b();

    /* JADX INFO: renamed from: k */
    public HashMap<String, C22507a<List<Music>>> f132036k = new HashMap<>();

    /* JADX INFO: renamed from: l */
    public C22507a<List<List<CameraBeautyMode>>> f132037l = C22507a.m222758b();

    /* JADX INFO: renamed from: l.lh$a */
    public class a extends mof0<List<CameraFilter>> {
        public a() {
            super(C18394lh.this, "accountLoadFilters", new dji(new vod("account_filters", null, AccountModule.m29130F().userId()), -1, ProtobufAdapter.ARRAY_ADAPTER(CameraFilter.PROTOBUF_ADAPTER)), new pcj() { // from class: l.ih
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return new si20(new pcj() { // from class: l.jh
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            return uqb0.f180376H.auth().m209043q(C4727b.m29372c("/cameraFilters")).m209032f().m209028b();
                        }
                    }, AccountCameraDataEnvelope.JSON_ADAPTER).map(new qcj() { // from class: l.kh
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return ((AccountCameraDataEnvelope) obj).data.cameraFilters;
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.lh$b */
    public class b extends mof0<List<CameraCategory>> {
        public b() {
            super(C18394lh.this, "accountMakeup", new dji(new vod("account_Makeup", null, AccountModule.m29130F().userId()), -1, ProtobufAdapter.ARRAY_ADAPTER(CameraCategory.PROTOBUF_ADAPTER)), new pcj() { // from class: l.mh
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return new si20(new pcj() { // from class: l.nh
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            return uqb0.f180376H.auth().m209043q(C4727b.m29372c("/cameraCategories?filter=makeup&search=makeup")).m209032f().m209028b();
                        }
                    }, AccountCameraDataEnvelope.JSON_ADAPTER).map(new qcj() { // from class: l.oh
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return ((AccountCameraDataEnvelope) obj).data.cameraCategories;
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.lh$c */
    public class c extends mof0<List<CameraSticker>> {
        public c(final String str) {
            super(C18394lh.this, "accountMakeupItem", new dji(new vod("account_MakeupItem", null, AccountModule.m29130F().userId()), -1, ProtobufAdapter.ARRAY_ADAPTER(CameraSticker.PROTOBUF_ADAPTER)), new pcj() { // from class: l.qh
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return new si20(new pcj() { // from class: l.rh
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            return uqb0.f180376H.auth().m209043q(C4727b.m29372c("/cameraCategories/" + str + "?filter=makeup")).m209032f().m209028b();
                        }
                    }, AccountCameraDataEnvelope.JSON_ADAPTER).map(new qcj() { // from class: l.sh
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return C18394lh.c.m154198D((AccountCameraDataEnvelope) obj);
                        }
                    });
                }
            });
        }

        /* JADX INFO: renamed from: D */
        public static /* synthetic */ List m154198D(AccountCameraDataEnvelope accountCameraDataEnvelope) {
            ArrayList arrayListM147522n = jyb.m147522n(accountCameraDataEnvelope.data.cameraStickers, new qcj() { // from class: l.ph
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(C19146oj.m167805a(((CameraSticker) obj).minVersion));
                }
            });
            C18882nj.m163352C().m163397u(arrayListM147522n);
            return arrayListM147522n;
        }
    }

    public C18394lh() {
        this.f132032g = new a();
        this.f132033h = new b();
        this.f132036k.put("hot", C22507a.m222759c(new ArrayList()));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m154157h(Throwable th) {
        th.printStackTrace();
        CrashHelper.m82479c(th);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ List m154158i(qcj qcjVar, AccountCameraDataEnvelope accountCameraDataEnvelope) {
        ArrayList arrayListM147522n = jyb.m147522n(accountCameraDataEnvelope.data.cameraStickers, new qcj() { // from class: l.xg
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(C19146oj.m167805a(((CameraSticker) obj).minVersion));
            }
        });
        if (NullChecker.m82486a(qcjVar)) {
            arrayListM147522n = jyb.m147522n(arrayListM147522n, qcjVar);
        }
        C18882nj.m163352C().m163398v(arrayListM147522n);
        return arrayListM147522n;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ List m154160k(List list) {
        C18882nj.m163352C().m163397u(list);
        return list;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m154173x(gcg0 gcg0Var) {
        try {
            gcg0Var.m137019l(CameraBeautyMode.JSON_ADAPTER.ARRAY_ADAPTER().ARRAY_ADAPTER().parse(AccountModule.f16754a.getAssets().open("AccountMMBeautyAutoModelgeo.json")));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            gcg0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: A */
    public C22421c<List<CameraCategory>> m154174A() {
        return this.f132035j;
    }

    /* JADX INFO: renamed from: B */
    public C22421c<File> m154175B(CameraSticker cameraSticker) {
        return C18882nj.m163352C().m163399y(cameraSticker);
    }

    /* JADX INFO: renamed from: C */
    public C22421c<File> m154176C(CameraSticker cameraSticker) {
        return C18882nj.m163352C().m163400z(cameraSticker);
    }

    /* JADX INFO: renamed from: D */
    public C22421c<uxj0> m154177D(boolean z) {
        return this.f132032g.m159275l(z).map(new qcj() { // from class: l.ah
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jyb.m147522n((List) obj, new qcj() { // from class: l.vg
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(C19146oj.m167805a(((CameraFilter) obj2).minVersion));
                    }
                });
            }
        }).flatMap(new qcj() { // from class: l.bh
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C18882nj.m163358O((ArrayList) obj);
            }
        }).map(new qcj() { // from class: l.ch
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: E */
    public boolean m154178E() {
        return !jyb.m147479J(this.f132034i.m222761e());
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m154179F(List list) {
        this.f132037l.m137019l(list);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m154180G(List list) {
        this.f132034i.m137019l(list);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m154181H(List list) {
        this.f132035j.m137019l(list);
    }

    /* JADX INFO: renamed from: I */
    public void m154182I() {
        C22421c.create(new C22421c.a() { // from class: l.sg
            @Override // p153l.y20
            public final void call(Object obj) {
                C18394lh.m154173x((gcg0) obj);
            }
        }).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.tg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174031a.m154179F((List) obj);
            }
        }, new y20() { // from class: l.ug
            @Override // p153l.y20
            public final void call(Object obj) {
                C18394lh.m154157h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public void m154183J() {
        final pcj pcjVar = new pcj() { // from class: l.gh
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209043q(C4727b.m29372c("/cameraCategories?filter=default,beauty")).m209032f().m209028b();
            }
        };
        scheduled("accountCameraCategories", 0, new pcj() { // from class: l.hh
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new si20(pcjVar, AccountCameraDataEnvelope.JSON_ADAPTER).compose(psd0.m173592C()).map(new qcj() { // from class: l.wg
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((AccountCameraDataEnvelope) obj).data.cameraCategories;
                    }
                });
            }
        }, false).subscribe(psd0.m173597H(new y20() { // from class: l.qg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157369a.m154180G((List) obj);
            }
        }, new y20() { // from class: l.rg
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m154184K() {
        this.f132033h.m159274k().subscribe(psd0.m173597H(new y20() { // from class: l.eh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93989a.m154181H((List) obj);
            }
        }, new y20() { // from class: l.fh
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    public C22421c<uxj0> m154185L() {
        if (this.f132032g.m159277n() == null || this.f132032g.m159277n().size() == 0) {
            C18882nj.m163352C();
            C18882nj.m163358O(new ArrayList()).subscribe();
        }
        this.f132032g.m159280q();
        m154183J();
        m154182I();
        m154184K();
        return C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: M */
    public C22421c<List<CameraSticker>> m154186M(String str) {
        return new c(str).m159274k().map(new qcj() { // from class: l.yg
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C18394lh.m154160k((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public C22421c<List<CameraSticker>> m154187N(final qcj<CameraSticker, Boolean> qcjVar, final String str) {
        final pcj pcjVar = new pcj() { // from class: l.pg
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209043q(C4727b.m29372c("/cameraCategories/" + str + "?search = sticker&filter=default,beauty")).m209032f().m209028b();
            }
        };
        return scheduled("accountCameraCategoriesInCid" + str, 0, new pcj() { // from class: l.zg
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new si20(pcjVar, AccountCameraDataEnvelope.JSON_ADAPTER).compose(psd0.m173592C()).map(new qcj() { // from class: l.dh
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C18394lh.m154158i(qcjVar, (AccountCameraDataEnvelope) obj);
                    }
                });
            }
        }, true);
    }

    /* JADX INFO: renamed from: y */
    public C22421c<List<List<CameraBeautyMode>>> m154188y() {
        return this.f132037l;
    }

    /* JADX INFO: renamed from: z */
    public C22421c<List<CameraCategory>> m154189z() {
        return this.f132034i;
    }
}
