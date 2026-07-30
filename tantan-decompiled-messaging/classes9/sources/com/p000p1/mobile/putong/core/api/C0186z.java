package com.p000p1.mobile.putong.core.api;

import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0186z;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.data.StickerBundle;
import com.p1.mobile.putong.core.data.UserSticker;
import com.p1.mobile.putong.data.BundleStatus;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.StickerInfo;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.data.tenum.TEnumColumn;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Order;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import l.faj;
import l.fgf0;
import l.ggi;
import l.hpd0;
import l.orh0;
import l.roj0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.wwf0;
import l.zpd0;
import p006l.ax6;
import p006l.ka20;
import p006l.la20;
import p006l.qib0;
import p006l.qnd;
import p006l.ura;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.z */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0186z extends ax6 {

    /* JADX INFO: renamed from: R */
    public hpd0 f4130R;

    /* JADX INFO: renamed from: S */
    public b f4131S;

    /* JADX INFO: renamed from: T */
    public c f4132T;

    /* JADX INFO: renamed from: U */
    public zpd0 f4133U;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.z$a */
    public class a implements w9j<Envelope, List<Sticker>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f4134a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f4135b;

        public a(String str, String str2) {
            this.f4134a = str;
            this.f4135b = str2;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<Sticker> call(Envelope envelope) {
            if (ura.m25555e().m25559d().m5829o9() && (TextUtils.equals("chat_text_associate", this.f4134a) || TextUtils.equals("chat_ice_break", this.f4134a))) {
                wwf0.e().f(this.f4135b, envelope.getModuleData(CoreData.class).stickers);
            }
            return envelope.getModuleData(CoreData.class).stickers;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.z$b */
    public class b extends fgf0<CoreData> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.z$b$a */
        public class a implements v9j<rx.c<CoreData>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C0186z f4138a;

            public a(C0186z c0186z) {
                this.f4138a = c0186z;
            }

            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public rx.c<CoreData> call() {
                return new la20(new v9j() { // from class: l.yya
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/shops/tantan/bundles?with=packages,stickers&filter=stickers&search=systemDynamic&query=networkShare2014,firstSignup2014")).f().b();
                    }
                }).map(new w9j() { // from class: l.zya
                    public final Object call(Object obj) {
                        return this.f29035a.m6873d((Envelope) obj);
                    }
                });
            }

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ CoreData m6873d(Envelope envelope) {
                this.f4138a.f8580Q.m3422w3(envelope, null);
                envelope.getModuleData(CoreData.class).stickers = new ArrayList();
                return envelope.getModuleData(CoreData.class);
            }
        }

        public b() {
            super(C0186z.this.f8580Q, "stickers", new ggi(new qnd("stickers_protobuf", "_v" + (CoreData.PA_VERSION + 67), qib0.f19804b0.f17706a.userId()), 7, CoreData.PROTOBUF_ADAPTER), new a(C0186z.this));
        }

        /* JADX INFO: renamed from: D */
        public final /* synthetic */ roj0 m6868D(Envelope envelope) {
            CoreData coreData = (CoreData) n();
            for (StickerBundle stickerBundle : coreData.bundles) {
                if (TEnum.equals(stickerBundle.status, "locked")) {
                    stickerBundle.status = BundleStatus.get("purchased");
                }
            }
            A(coreData);
            return roj0.a;
        }

        /* JADX INFO: renamed from: E */
        public rx.c<roj0> m6869E() {
            return C0186z.this.f8580Q.now(new la20(new v9j() { // from class: l.wya
                public final Object call() {
                    return C0154a.f3483P.auth().q(C0154a.m3130G("/shops/tantan/campaigns/networkShare2014?method=patch")).l(utc0.create(Network.JSON, "{\"campaignCode\":\"8fd56f5f51790faf9794ab1f4f12e6e9\"}")).b();
                }
            }).map(new w9j() { // from class: l.xya
                public final Object call(Object obj) {
                    return this.f27787a.m6868D((Envelope) obj);
                }
            }).compose(C0154a.m3182T2()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.z$c */
    public class c extends fgf0<CoreData> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.z$c$a */
        public class a implements v9j<rx.c<CoreData>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C0186z f4140a;

            public a(C0186z c0186z) {
                this.f4140a = c0186z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: d */
            public /* synthetic */ CoreData m6898d(Envelope envelope) {
                if (!vwb.J(envelope.getModuleData(CoreData.class).userStickers) && ((UserSticker) envelope.getModuleData(CoreData.class).userStickers.get(0)).updatedTime != 0.0d) {
                    this.f4140a.f4133U.put(Long.valueOf((long) ((UserSticker) envelope.getModuleData(CoreData.class).userStickers.get(0)).updatedTime));
                }
                this.f4140a.f8580Q.m3422w3(envelope, null);
                envelope.getModuleData(CoreData.class).stickers = new ArrayList();
                if (envelope.getModuleData(CoreData.class).userStickers == null) {
                    envelope.getModuleData(CoreData.class).userStickers = new ArrayList();
                }
                if (vwb.J(envelope.getModuleData(CoreData.class).userStickers)) {
                    UserSticker userStickerNew_ = UserSticker.new_();
                    userStickerNew_.id = qib0.f19804b0.f17706a.userId();
                    envelope.getModuleData(CoreData.class).userStickers.add(userStickerNew_);
                }
                return envelope.getModuleData(CoreData.class);
            }

            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public rx.c<CoreData> call() {
                StringBuilder sb = new StringBuilder();
                if (((Long) this.f4140a.f4133U.get()).longValue() > 0) {
                    sb.append("?since=");
                    try {
                        sb.append(URLEncoder.encode(Converter.dateToApiTimeString(((Long) this.f4140a.f4133U.get()).longValue()), "UTF-8"));
                    } catch (UnsupportedEncodingException e) {
                        CrashHelper.c(e);
                    }
                }
                final String string = sb.toString();
                return new la20(new v9j() { // from class: l.nza
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/stickers" + string)).f().b();
                    }
                }).map(new w9j() { // from class: l.oza
                    public final Object call(Object obj) {
                        return this.f18508a.m6898d((Envelope) obj);
                    }
                });
            }
        }

        public c() {
            super(C0186z.this.f8580Q, "custom_stickers", new ggi(new qnd("custom_stickers_protobuf", "_v" + (CoreData.PA_VERSION + 14), qib0.f19804b0.f17706a.userId()), 7, CoreData.PROTOBUF_ADAPTER), new a(C0186z.this), true);
        }

        /* JADX INFO: renamed from: F */
        public static /* synthetic */ Sticker m6878F(Envelope envelope) {
            if (vwb.J(envelope.getModuleData(CoreData.class).stickers)) {
                return null;
            }
            return (Sticker) envelope.getModuleData(CoreData.class).stickers.get(0);
        }

        /* JADX INFO: renamed from: L */
        public static /* synthetic */ StickerInfo m6884L(Envelope envelope) {
            if (vwb.J(envelope.getModuleData(CoreData.class).stickers)) {
                return null;
            }
            return ((Sticker) envelope.getModuleData(CoreData.class).stickers.get(0)).cloneSticker();
        }

        /* JADX INFO: renamed from: O */
        public rx.c<roj0> m6887O(final Sticker sticker) {
            final UserSticker userStickerNew_ = UserSticker.new_();
            ArrayList arrayList = new ArrayList();
            userStickerNew_.favoriteStickers = arrayList;
            arrayList.add(((DbObject) sticker).id);
            return C0186z.this.f8580Q.scheduled("addCustomSticker" + ((DbObject) sticker).id, 0, new v9j() { // from class: l.aza
                public final Object call() {
                    return this.f8621a.m6892T(sticker, userStickerNew_);
                }
            });
        }

        /* JADX INFO: renamed from: P */
        public rx.c<roj0> m6888P(final UserSticker userSticker) {
            return C0186z.this.f8580Q.now(new la20(new v9j() { // from class: l.hza
                public final Object call() {
                    return C0154a.f3483P.auth().q(C0154a.m3143J0("/stickers")).e(utc0.create(Network.JSON, userSticker.toJson())).b();
                }
            }).map(new w9j() { // from class: l.iza
                public final Object call(Object obj) {
                    return this.f14886a.m6893U(userSticker, (Envelope) obj);
                }
            }).compose(C0154a.m3182T2()));
        }

        /* JADX INFO: renamed from: Q */
        public rx.c<Sticker> m6889Q(final StickerInfo stickerInfo) {
            return C0186z.this.f8580Q.scheduled("getStickerIdFromSticker" + ((DbObject) stickerInfo).id, 0, new v9j() { // from class: l.gza
                public final Object call() {
                    return new ka20(new v9j() { // from class: l.lza
                        public final Object call() {
                            StickerInfo stickerInfo2 = stickerInfo;
                            return C0154a.f3483P.auth().q(C0154a.m3130G("/stickers")).l(utc0.create(Network.JSON, stickerInfo2 == null ? "" : stickerInfo2.toJson())).b();
                        }
                    }, Envelope.JSON_ADAPTER).map(new w9j() { // from class: l.mza
                        public final Object call(Object obj) {
                            return C0186z.c.m6878F((Envelope) obj);
                        }
                    }).compose(C0154a.m3182T2());
                }
            });
        }

        /* JADX INFO: renamed from: R */
        public rx.c<StickerInfo> m6890R(final StickerInfo stickerInfo) {
            return C0186z.this.f8580Q.scheduled("getStickerIdFromSticker" + ((DbObject) stickerInfo).id, 0, new v9j() { // from class: l.bza
                public final Object call() {
                    return new ka20(new v9j() { // from class: l.cza
                        public final Object call() {
                            StickerInfo stickerInfo2 = stickerInfo;
                            return C0154a.f3483P.auth().q(C0154a.m3130G("/stickers")).l(utc0.create(Network.JSON, stickerInfo2 == null ? "" : stickerInfo2.toJson())).b();
                        }
                    }, Envelope.JSON_ADAPTER).map(new w9j() { // from class: l.dza
                        public final Object call(Object obj) {
                            return C0186z.c.m6884L((Envelope) obj);
                        }
                    }).compose(C0154a.m3182T2());
                }
            });
        }

        /* JADX INFO: renamed from: S */
        public final /* synthetic */ roj0 m6891S(Sticker sticker, UserSticker userSticker, Envelope envelope) {
            C0186z.this.f8580Q.m3422w3(envelope, null);
            CoreData coreData = (CoreData) n();
            if (NullChecker.a(coreData) && !vwb.J(coreData.userStickers) && !vwb.J(((UserSticker) coreData.userStickers.get(0)).favoriteStickers)) {
                if (TextUtils.isEmpty(((DbObject) sticker).id) && !vwb.J(envelope.getModuleData(CoreData.class).stickers)) {
                    userSticker.favoriteStickers.clear();
                    userSticker.favoriteStickers.add(((DbObject) ((Sticker) envelope.getModuleData(CoreData.class).stickers.get(0))).id);
                }
                ((UserSticker) coreData.userStickers.get(0)).favoriteStickers.removeAll(userSticker.favoriteStickers);
                ((UserSticker) coreData.userStickers.get(0)).favoriteStickers.addAll(0, userSticker.favoriteStickers);
            }
            if (NullChecker.a(coreData)) {
                A(coreData);
            }
            return roj0.a;
        }

        /* JADX INFO: renamed from: T */
        public final /* synthetic */ rx.c m6892T(final Sticker sticker, final UserSticker userSticker) {
            return new ka20(new v9j() { // from class: l.eza
                public final Object call() {
                    Sticker sticker2 = sticker;
                    return C0154a.f3483P.auth().q(TextUtils.isEmpty(((DbObject) sticker2).id) ? C0154a.m3143J0("/stickers?resource_type=sticker") : C0154a.m3143J0("/stickers")).l(utc0.create(Network.JSON, TextUtils.isEmpty(((DbObject) sticker2).id) ? sticker2.toJson() : userSticker.toJson())).b();
                }
            }, Envelope.JSON_ADAPTER).map(new w9j() { // from class: l.fza
                public final Object call(Object obj) {
                    return this.f12993a.m6891S(sticker, userSticker, (Envelope) obj);
                }
            }).compose(C0154a.m3182T2());
        }

        /* JADX INFO: renamed from: U */
        public final /* synthetic */ roj0 m6893U(UserSticker userSticker, Envelope envelope) {
            CoreData coreData = (CoreData) n();
            if (NullChecker.a(coreData) && !vwb.J(coreData.userStickers) && !vwb.J(((UserSticker) coreData.userStickers.get(0)).favoriteStickers)) {
                ((UserSticker) coreData.userStickers.get(0)).favoriteStickers.removeAll(userSticker.favoriteStickers);
            }
            if (NullChecker.a(coreData)) {
                A(coreData);
            }
            return roj0.a;
        }

        /* JADX INFO: renamed from: V */
        public final /* synthetic */ roj0 m6894V(UserSticker userSticker, Envelope envelope) {
            CoreData coreData = (CoreData) n();
            if (NullChecker.a(coreData) && !vwb.J(coreData.userStickers) && !vwb.J(((UserSticker) coreData.userStickers.get(0)).favoriteStickers)) {
                ((UserSticker) coreData.userStickers.get(0)).favoriteStickers.removeAll(userSticker.favoriteStickers);
                ((UserSticker) coreData.userStickers.get(0)).favoriteStickers.addAll(0, userSticker.favoriteStickers);
            }
            if (NullChecker.a(coreData)) {
                A(coreData);
            }
            return roj0.a;
        }

        /* JADX INFO: renamed from: W */
        public rx.c<roj0> m6895W(final UserSticker userSticker) {
            return C0186z.this.f8580Q.now(new la20(new v9j() { // from class: l.jza
                public final Object call() {
                    return C0154a.f3483P.auth().q(C0154a.m3143J0("/stickers")).k(utc0.create(Network.JSON, userSticker.toJson())).b();
                }
            }).map(new w9j() { // from class: l.kza
                public final Object call(Object obj) {
                    return this.f16110a.m6894V(userSticker, (Envelope) obj);
                }
            }).compose(C0154a.m3182T2()));
        }
    }

    public C0186z(C0158c c0158c) {
        super(c0158c);
        this.f4130R = new hpd0("is_emotion_clicked", Boolean.FALSE);
        this.f4131S = new b();
        this.f4133U = new zpd0("customStickerLastReadTime" + qib0.f19804b0.f17706a.userId(), 0L);
        this.f4132T = new c();
        CoreModule.f1542k.f11199g.warmUp(200, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ List m6846a3(boolean z, Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            List list = (List) obj;
            if (z || objArr.length == 1) {
                return list;
            }
            if (!vwb.J(list)) {
                arrayList.add((Sticker) list.get(0));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ Pair m6847b3(Envelope envelope) {
        return (NullChecker.a(envelope.pagination) && NullChecker.a(envelope.pagination.links) && NullChecker.a(envelope.pagination.links.next)) ? Pair.create(envelope.getModuleData(CoreData.class).stickers, envelope.pagination.links.next) : Pair.create(envelope.getModuleData(CoreData.class).stickers, "");
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ List m6848c3(List list) {
        return NullChecker.a(list) ? list : new ArrayList();
    }

    /* JADX INFO: renamed from: i3 */
    public void m6854i3() {
        this.f4131S.o();
        this.f4132T.o();
        this.f4133U.clear();
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ rx.c m6855j3(final String str, String str2, String str3) {
        return new ka20(new v9j() { // from class: l.tya
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/stickers?filter=third-party&query=" + str)).f().b();
            }
        }, Envelope.JSON_ADAPTER).map(new a(str2, str3)).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: k3 */
    public rx.c<Pair<List<Sticker>, String>> m6856k3() {
        return m6858m3("");
    }

    /* JADX INFO: renamed from: l3 */
    public rx.c<Pair<List<Sticker>, String>> m6857l3(final String str) {
        return this.f8580Q.scheduled("loadPopularStickers" + str, 0, new v9j() { // from class: l.sya
            public final Object call() {
                return new ka20(new v9j() { // from class: l.uya
                    public final Object call() {
                        return C0154a.f3483P.auth().q(str).f().b();
                    }
                }, Envelope.JSON_ADAPTER).map(new w9j() { // from class: l.vya
                    public final Object call(Object obj) {
                        return C0186z.m6847b3((Envelope) obj);
                    }
                }).compose(C0154a.m3182T2());
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public rx.c<Pair<List<Sticker>, String>> m6858m3(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&channel=" + str;
        }
        return m6857l3(C0154a.m3143J0("/stickers?search=trending&limit=40&offset=0".concat(str2)));
    }

    /* JADX INFO: renamed from: n3 */
    public rx.c<List<Sticker>> m6859n3(List<String> list, boolean z) {
        return m6860o3(list, z, "");
    }

    /* JADX INFO: renamed from: o3 */
    public rx.c<List<Sticker>> m6860o3(List<String> list, final boolean z, String str) {
        if (vwb.J(list)) {
            return rx.c.just(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(m6862q3(list.get(i), str).map(new w9j() { // from class: l.qya
                public final Object call(Object obj) {
                    return C0186z.m6848c3((List) obj);
                }
            }));
        }
        return rx.c.zip(arrayList, new faj() { // from class: l.rya
            public final Object call(Object[] objArr) {
                return C0186z.m6846a3(z, objArr);
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public rx.c<List<Sticker>> m6861p3(String str) {
        return m6862q3(str, "");
    }

    /* JADX INFO: renamed from: q3 */
    public rx.c<List<Sticker>> m6862q3(final String str, final String str2) {
        String str3;
        if (qib0.f19802Z.m14990K(str)) {
            return rx.c.just(new ArrayList());
        }
        if (ura.m25555e().m25559d().m5829o9() && (TextUtils.equals("chat_text_associate", str2) || TextUtils.equals("chat_ice_break", str2))) {
            List listC = wwf0.e().c(str);
            if (!vwb.J(listC)) {
                return rx.c.just(listC);
            }
        }
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = "&channel=" + str2;
        }
        final String str4 = str + str3;
        return this.f8580Q.scheduled("searchThirdPartyStickers".concat(str4), 0, new v9j() { // from class: l.pya
            public final Object call() {
                return this.f19438a.m6855j3(str4, str2, str);
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public Sticker m6863r3(String str) {
        orh0<Sticker> orh0Var = CoreModule.f1542k.f11199g;
        Filter filterEQ = Sticker.NAME.EQ(str);
        TEnumColumn tEnumColumn = Sticker.SOURCE;
        List listQueryCache = orh0Var.queryCache(Filter.AND(new Filter[]{filterEQ, Filter.OR(new Filter[]{tEnumColumn.EQ("poke"), tEnumColumn.EQ("intimate")})}), (Order) null, 1);
        return vwb.J(listQueryCache) ? Sticker.new_() : (Sticker) listQueryCache.get(0);
    }

    /* JADX INFO: renamed from: s3 */
    public Sticker m6864s3(String str) {
        Sticker stickerQueryCache = CoreModule.f1542k.f11199g.queryCache(str);
        return stickerQueryCache == null ? Sticker.new_() : stickerQueryCache;
    }
}
