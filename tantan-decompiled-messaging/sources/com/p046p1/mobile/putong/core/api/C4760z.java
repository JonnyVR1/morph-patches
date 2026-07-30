package com.p046p1.mobile.putong.core.api;

import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4760z;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.Sticker;
import com.p046p1.mobile.putong.core.data.StickerBundle;
import com.p046p1.mobile.putong.core.data.StickerSource;
import com.p046p1.mobile.putong.core.data.UserSticker;
import com.p046p1.mobile.putong.data.BundleStatus;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.StickerInfo;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.data.tenum.TEnumColumn;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p149l.ax6;
import p149l.faj;
import p149l.fgf0;
import p149l.ggi;
import p149l.hpd0;
import p149l.ka20;
import p149l.la20;
import p149l.orh0;
import p149l.qib0;
import p149l.qnd;
import p149l.roj0;
import p149l.ura;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.wwf0;
import p149l.zpd0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.z */
/* JADX INFO: loaded from: classes9.dex */
public class C4760z extends ax6 {

    /* JADX INFO: renamed from: R */
    public hpd0 f20141R;

    /* JADX INFO: renamed from: S */
    public b f20142S;

    /* JADX INFO: renamed from: T */
    public c f20143T;

    /* JADX INFO: renamed from: U */
    public zpd0 f20144U;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.z$a */
    public class a implements w9j<Envelope, List<Sticker>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f20145a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f20146b;

        public a(String str, String str2) {
            this.f20145a = str;
            this.f20146b = str2;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<Sticker> call(Envelope envelope) {
            if (ura.m195053e().m195057d().mo33892o9() && (TextUtils.equals("chat_text_associate", this.f20145a) || TextUtils.equals("chat_ice_break", this.f20145a))) {
                wwf0.m205859e().m205863f(this.f20146b, ((CoreData) envelope.getModuleData(CoreData.class)).stickers);
            }
            return ((CoreData) envelope.getModuleData(CoreData.class)).stickers;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.z$b */
    public class b extends fgf0<CoreData> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.z$b$a */
        public class a implements v9j<C22306c<CoreData>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C4760z f20149a;

            public a(C4760z c4760z) {
                this.f20149a = c4760z;
            }

            @Override // p149l.v9j, java.util.concurrent.Callable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public C22306c<CoreData> call() {
                return new la20(new v9j() { // from class: l.yya
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/shops/tantan/bundles?with=packages,stickers&filter=stickers&search=systemDynamic&query=networkShare2014,firstSignup2014")).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.zya
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f205670a.m34936d((Envelope) obj);
                    }
                });
            }

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ CoreData m34936d(Envelope envelope) {
                this.f20149a.f72126Q.m31492w3(envelope, null);
                ((CoreData) envelope.getModuleData(CoreData.class)).stickers = new ArrayList();
                return (CoreData) envelope.getModuleData(CoreData.class);
            }
        }

        public b() {
            super(C4760z.this.f72126Q, "stickers", new ggi(new qnd("stickers_protobuf", "_v" + (CoreData.PA_VERSION + 67), qib0.f154713b0.f139230a.userId()), 7, CoreData.PROTOBUF_ADAPTER), new a(C4760z.this));
        }

        /* JADX INFO: renamed from: D */
        public final /* synthetic */ roj0 m34931D(Envelope envelope) {
            CoreData coreDataM121233n = m121233n();
            for (StickerBundle stickerBundle : coreDataM121233n.bundles) {
                if (TEnum.equals(stickerBundle.status, "locked")) {
                    stickerBundle.status = BundleStatus.get(BundleStatus.purchased);
                }
            }
            m121229A(coreDataM121233n);
            return roj0.f160388a;
        }

        /* JADX INFO: renamed from: E */
        public C22306c<roj0> m34932E() {
            return C4760z.this.f72126Q.now(new la20(new v9j() { // from class: l.wya
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/shops/tantan/campaigns/networkShare2014?method=patch")).m185893l(utc0.create(Network.JSON, "{\"campaignCode\":\"8fd56f5f51790faf9794ab1f4f12e6e9\"}")).m185883b();
                }
            }).map(new w9j() { // from class: l.xya
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f195036a.m34931D((Envelope) obj);
                }
            }).compose(C4728a.m31252T2()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.z$c */
    public class c extends fgf0<CoreData> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.z$c$a */
        public class a implements v9j<C22306c<CoreData>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C4760z f20151a;

            public a(C4760z c4760z) {
                this.f20151a = c4760z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: d */
            public /* synthetic */ CoreData m34961d(Envelope envelope) {
                if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).userStickers) && ((CoreData) envelope.getModuleData(CoreData.class)).userStickers.get(0).updatedTime != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    this.f20151a.f20144U.put(Long.valueOf((long) ((CoreData) envelope.getModuleData(CoreData.class)).userStickers.get(0).updatedTime));
                }
                this.f20151a.f72126Q.m31492w3(envelope, null);
                ((CoreData) envelope.getModuleData(CoreData.class)).stickers = new ArrayList();
                if (((CoreData) envelope.getModuleData(CoreData.class)).userStickers == null) {
                    ((CoreData) envelope.getModuleData(CoreData.class)).userStickers = new ArrayList();
                }
                if (vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).userStickers)) {
                    UserSticker userStickerNew_ = UserSticker.new_();
                    userStickerNew_.f20526id = qib0.f154713b0.f139230a.userId();
                    ((CoreData) envelope.getModuleData(CoreData.class)).userStickers.add(userStickerNew_);
                }
                return (CoreData) envelope.getModuleData(CoreData.class);
            }

            @Override // p149l.v9j, java.util.concurrent.Callable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public C22306c<CoreData> call() {
                StringBuilder sb = new StringBuilder();
                if (this.f20151a.f20144U.get().longValue() > 0) {
                    sb.append("?since=");
                    try {
                        sb.append(URLEncoder.encode(Converter.dateToApiTimeString(this.f20151a.f20144U.get().longValue()), "UTF-8"));
                    } catch (UnsupportedEncodingException e) {
                        CrashHelper.m81296c(e);
                    }
                }
                final String string = sb.toString();
                return new la20(new v9j() { // from class: l.nza
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/stickers" + string)).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.oza
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f146391a.m34961d((Envelope) obj);
                    }
                });
            }
        }

        public c() {
            super(C4760z.this.f72126Q, "custom_stickers", new ggi(new qnd("custom_stickers_protobuf", "_v" + (CoreData.PA_VERSION + 14), qib0.f154713b0.f139230a.userId()), 7, CoreData.PROTOBUF_ADAPTER), new a(C4760z.this), true);
        }

        /* JADX INFO: renamed from: F */
        public static /* synthetic */ Sticker m34941F(Envelope envelope) {
            if (vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).stickers)) {
                return null;
            }
            return ((CoreData) envelope.getModuleData(CoreData.class)).stickers.get(0);
        }

        /* JADX INFO: renamed from: L */
        public static /* synthetic */ StickerInfo m34947L(Envelope envelope) {
            if (vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).stickers)) {
                return null;
            }
            return ((CoreData) envelope.getModuleData(CoreData.class)).stickers.get(0).cloneSticker();
        }

        /* JADX INFO: renamed from: O */
        public C22306c<roj0> m34950O(final Sticker sticker) {
            final UserSticker userStickerNew_ = UserSticker.new_();
            ArrayList arrayList = new ArrayList();
            userStickerNew_.favoriteStickers = arrayList;
            arrayList.add(sticker.f56011id);
            return C4760z.this.f72126Q.scheduled("addCustomSticker" + sticker.f56011id, 0, new v9j() { // from class: l.aza
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f72345a.m34955T(sticker, userStickerNew_);
                }
            });
        }

        /* JADX INFO: renamed from: P */
        public C22306c<roj0> m34951P(final UserSticker userSticker) {
            return C4760z.this.f72126Q.now(new la20(new v9j() { // from class: l.hza
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/stickers")).m185886e(utc0.create(Network.JSON, userSticker.toJson())).m185883b();
                }
            }).map(new w9j() { // from class: l.iza
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f115547a.m34956U(userSticker, (Envelope) obj);
                }
            }).compose(C4728a.m31252T2()));
        }

        /* JADX INFO: renamed from: Q */
        public C22306c<Sticker> m34952Q(final StickerInfo stickerInfo) {
            return C4760z.this.f72126Q.scheduled("getStickerIdFromSticker" + stickerInfo.f56011id, 0, new v9j() { // from class: l.gza
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return new ka20(new v9j() { // from class: l.lza
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            StickerInfo stickerInfo2 = stickerInfo;
                            return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/stickers")).m185893l(utc0.create(Network.JSON, stickerInfo2 == null ? "" : stickerInfo2.toJson())).m185883b();
                        }
                    }, Envelope.JSON_ADAPTER).map(new w9j() { // from class: l.mza
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return C4760z.c.m34941F((Envelope) obj);
                        }
                    }).compose(C4728a.m31252T2());
                }
            });
        }

        /* JADX INFO: renamed from: R */
        public C22306c<StickerInfo> m34953R(final StickerInfo stickerInfo) {
            return C4760z.this.f72126Q.scheduled("getStickerIdFromSticker" + stickerInfo.f56011id, 0, new v9j() { // from class: l.bza
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return new ka20(new v9j() { // from class: l.cza
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            StickerInfo stickerInfo2 = stickerInfo;
                            return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/stickers")).m185893l(utc0.create(Network.JSON, stickerInfo2 == null ? "" : stickerInfo2.toJson())).m185883b();
                        }
                    }, Envelope.JSON_ADAPTER).map(new w9j() { // from class: l.dza
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return C4760z.c.m34947L((Envelope) obj);
                        }
                    }).compose(C4728a.m31252T2());
                }
            });
        }

        /* JADX INFO: renamed from: S */
        public final /* synthetic */ roj0 m34954S(Sticker sticker, UserSticker userSticker, Envelope envelope) {
            C4760z.this.f72126Q.m31492w3(envelope, null);
            CoreData coreDataM121233n = m121233n();
            if (NullChecker.m81303a(coreDataM121233n) && !vwb.m200296J(coreDataM121233n.userStickers) && !vwb.m200296J(coreDataM121233n.userStickers.get(0).favoriteStickers)) {
                if (TextUtils.isEmpty(sticker.f56011id) && !vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).stickers)) {
                    userSticker.favoriteStickers.clear();
                    userSticker.favoriteStickers.add(((CoreData) envelope.getModuleData(CoreData.class)).stickers.get(0).f56011id);
                }
                coreDataM121233n.userStickers.get(0).favoriteStickers.removeAll(userSticker.favoriteStickers);
                coreDataM121233n.userStickers.get(0).favoriteStickers.addAll(0, userSticker.favoriteStickers);
            }
            if (NullChecker.m81303a(coreDataM121233n)) {
                m121229A(coreDataM121233n);
            }
            return roj0.f160388a;
        }

        /* JADX INFO: renamed from: T */
        public final /* synthetic */ C22306c m34955T(final Sticker sticker, final UserSticker userSticker) {
            return new ka20(new v9j() { // from class: l.eza
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    Sticker sticker2 = sticker;
                    return C4728a.f19494P.auth().m185898q(TextUtils.isEmpty(sticker2.f56011id) ? C4728a.m31213J0("/stickers?resource_type=sticker") : C4728a.m31213J0("/stickers")).m185893l(utc0.create(Network.JSON, TextUtils.isEmpty(sticker2.f56011id) ? sticker2.toJson() : userSticker.toJson())).m185883b();
                }
            }, Envelope.JSON_ADAPTER).map(new w9j() { // from class: l.fza
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f99941a.m34954S(sticker, userSticker, (Envelope) obj);
                }
            }).compose(C4728a.m31252T2());
        }

        /* JADX INFO: renamed from: U */
        public final /* synthetic */ roj0 m34956U(UserSticker userSticker, Envelope envelope) {
            CoreData coreDataM121233n = m121233n();
            if (NullChecker.m81303a(coreDataM121233n) && !vwb.m200296J(coreDataM121233n.userStickers) && !vwb.m200296J(coreDataM121233n.userStickers.get(0).favoriteStickers)) {
                coreDataM121233n.userStickers.get(0).favoriteStickers.removeAll(userSticker.favoriteStickers);
            }
            if (NullChecker.m81303a(coreDataM121233n)) {
                m121229A(coreDataM121233n);
            }
            return roj0.f160388a;
        }

        /* JADX INFO: renamed from: V */
        public final /* synthetic */ roj0 m34957V(UserSticker userSticker, Envelope envelope) {
            CoreData coreDataM121233n = m121233n();
            if (NullChecker.m81303a(coreDataM121233n) && !vwb.m200296J(coreDataM121233n.userStickers) && !vwb.m200296J(coreDataM121233n.userStickers.get(0).favoriteStickers)) {
                coreDataM121233n.userStickers.get(0).favoriteStickers.removeAll(userSticker.favoriteStickers);
                coreDataM121233n.userStickers.get(0).favoriteStickers.addAll(0, userSticker.favoriteStickers);
            }
            if (NullChecker.m81303a(coreDataM121233n)) {
                m121229A(coreDataM121233n);
            }
            return roj0.f160388a;
        }

        /* JADX INFO: renamed from: W */
        public C22306c<roj0> m34958W(final UserSticker userSticker) {
            return C4760z.this.f72126Q.now(new la20(new v9j() { // from class: l.jza
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/stickers")).m185892k(utc0.create(Network.JSON, userSticker.toJson())).m185883b();
                }
            }).map(new w9j() { // from class: l.kza
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f125365a.m34957V(userSticker, (Envelope) obj);
                }
            }).compose(C4728a.m31252T2()));
        }
    }

    public C4760z(C4732c c4732c) {
        super(c4732c);
        this.f20141R = new hpd0("is_emotion_clicked", Boolean.FALSE);
        this.f20142S = new b();
        this.f20144U = new zpd0("customStickerLastReadTime" + qib0.f154713b0.f139230a.userId(), 0L);
        this.f20143T = new c();
        CoreModule.f17553k.f91944g.warmUp(200, 1000);
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ List m34909a3(boolean z, Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            List list = (List) obj;
            if (z || objArr.length == 1) {
                return list;
            }
            if (!vwb.m200296J(list)) {
                arrayList.add((Sticker) list.get(0));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ Pair m34910b3(Envelope envelope) {
        return (NullChecker.m81303a(envelope.pagination) && NullChecker.m81303a(envelope.pagination.links) && NullChecker.m81303a(envelope.pagination.links.next)) ? Pair.create(((CoreData) envelope.getModuleData(CoreData.class)).stickers, envelope.pagination.links.next) : Pair.create(((CoreData) envelope.getModuleData(CoreData.class)).stickers, "");
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ List m34911c3(List list) {
        return NullChecker.m81303a(list) ? list : new ArrayList();
    }

    /* JADX INFO: renamed from: i3 */
    public void m34917i3() {
        this.f20142S.m121234o();
        this.f20143T.m121234o();
        this.f20144U.clear();
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ C22306c m34918j3(final String str, String str2, String str3) {
        return new ka20(new v9j() { // from class: l.tya
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/stickers?filter=third-party&query=" + str)).m185887f().m185883b();
            }
        }, Envelope.JSON_ADAPTER).map(new a(str2, str3)).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: k3 */
    public C22306c<Pair<List<Sticker>, String>> m34919k3() {
        return m34921m3("");
    }

    /* JADX INFO: renamed from: l3 */
    public C22306c<Pair<List<Sticker>, String>> m34920l3(final String str) {
        return this.f72126Q.scheduled("loadPopularStickers" + str, 0, new v9j() { // from class: l.sya
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new ka20(new v9j() { // from class: l.uya
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
                    }
                }, Envelope.JSON_ADAPTER).map(new w9j() { // from class: l.vya
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C4760z.m34910b3((Envelope) obj);
                    }
                }).compose(C4728a.m31252T2());
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public C22306c<Pair<List<Sticker>, String>> m34921m3(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&channel=" + str;
        }
        return m34920l3(C4728a.m31213J0("/stickers?search=trending&limit=40&offset=0".concat(str2)));
    }

    /* JADX INFO: renamed from: n3 */
    public C22306c<List<Sticker>> m34922n3(List<String> list, boolean z) {
        return m34923o3(list, z, "");
    }

    /* JADX INFO: renamed from: o3 */
    public C22306c<List<Sticker>> m34923o3(List<String> list, final boolean z, String str) {
        if (vwb.m200296J(list)) {
            return C22306c.just(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(m34925q3(list.get(i), str).map(new w9j() { // from class: l.qya
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return C4760z.m34911c3((List) obj);
                }
            }));
        }
        return C22306c.zip(arrayList, new faj() { // from class: l.rya
            @Override // p149l.faj
            public final Object call(Object[] objArr) {
                return C4760z.m34909a3(z, objArr);
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public C22306c<List<Sticker>> m34924p3(String str) {
        return m34925q3(str, "");
    }

    /* JADX INFO: renamed from: q3 */
    public C22306c<List<Sticker>> m34925q3(final String str, final String str2) {
        String str3;
        if (qib0.f154711Z.m119125K(str)) {
            return C22306c.just(new ArrayList());
        }
        if (ura.m195053e().m195057d().mo33892o9() && (TextUtils.equals("chat_text_associate", str2) || TextUtils.equals("chat_ice_break", str2))) {
            List<Sticker> listM205861c = wwf0.m205859e().m205861c(str);
            if (!vwb.m200296J(listM205861c)) {
                return C22306c.just(listM205861c);
            }
        }
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = "&channel=" + str2;
        }
        final String str4 = str + str3;
        return this.f72126Q.scheduled("searchThirdPartyStickers".concat(str4), 0, new v9j() { // from class: l.pya
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f151823a.m34918j3(str4, str2, str);
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public Sticker m34926r3(String str) {
        orh0<Sticker> orh0Var = CoreModule.f17553k.f91944g;
        Filter<Sticker> filterMo60175EQ = Sticker.NAME.mo60175EQ(str);
        TEnumColumn<Sticker, StickerSource> tEnumColumn = Sticker.SOURCE;
        List<T> listQueryCache = orh0Var.queryCache(Filter.AND(filterMo60175EQ, Filter.m81261OR(tEnumColumn.m60176EQ("poke"), tEnumColumn.m60176EQ("intimate"))), null, 1);
        return vwb.m200296J(listQueryCache) ? Sticker.new_() : (Sticker) listQueryCache.get(0);
    }

    /* JADX INFO: renamed from: s3 */
    public Sticker m34927s3(String str) {
        Sticker sticker = (Sticker) CoreModule.f17553k.f91944g.queryCache(str);
        return sticker == null ? Sticker.new_() : sticker;
    }
}
