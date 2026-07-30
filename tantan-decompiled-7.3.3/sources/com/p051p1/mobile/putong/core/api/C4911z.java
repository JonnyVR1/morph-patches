package com.p051p1.mobile.putong.core.api;

import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4911z;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Sticker;
import com.p051p1.mobile.putong.core.data.StickerBundle;
import com.p051p1.mobile.putong.core.data.StickerSource;
import com.p051p1.mobile.putong.core.data.UserSticker;
import com.p051p1.mobile.putong.data.BundleStatus;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.StickerInfo;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.data.tenum.TEnumColumn;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p153l.byd0;
import p153l.dji;
import p153l.dy6;
import p153l.g5g0;
import p153l.gta;
import p153l.jxd0;
import p153l.jyb;
import p153l.mof0;
import p153l.pcj;
import p153l.qcj;
import p153l.si20;
import p153l.ti20;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vod;
import p153l.wzh0;
import p153l.zcj;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.z */
/* JADX INFO: loaded from: classes9.dex */
public class C4911z extends dy6 {

    /* JADX INFO: renamed from: R */
    public jxd0 f20883R;

    /* JADX INFO: renamed from: S */
    public b f20884S;

    /* JADX INFO: renamed from: T */
    public c f20885T;

    /* JADX INFO: renamed from: U */
    public byd0 f20886U;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.z$a */
    public class a implements qcj<Envelope, List<Sticker>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f20887a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f20888b;

        public a(String str, String str2) {
            this.f20887a = str;
            this.f20888b = str2;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<Sticker> call(Envelope envelope) {
            if (gta.m132210e().m132214d().mo34895o9() && (TextUtils.equals("chat_text_associate", this.f20887a) || TextUtils.equals("chat_ice_break", this.f20887a))) {
                g5g0.m129056e().m129060f(this.f20888b, ((CoreData) envelope.getModuleData(CoreData.class)).stickers);
            }
            return ((CoreData) envelope.getModuleData(CoreData.class)).stickers;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.z$b */
    public class b extends mof0<CoreData> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.z$b$a */
        public class a implements pcj<C22421c<CoreData>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C4911z f20891a;

            public a(C4911z c4911z) {
                this.f20891a = c4911z;
            }

            @Override // p153l.pcj, java.util.concurrent.Callable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public C22421c<CoreData> call() {
                return new ti20(new pcj() { // from class: l.k0b
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/shops/tantan/bundles?with=packages,stickers&filter=stickers&search=systemDynamic&query=networkShare2014,firstSignup2014")).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.l0b
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f129551a.m35939d((Envelope) obj);
                    }
                });
            }

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ CoreData m35939d(Envelope envelope) {
                this.f20891a.f91137Q.m32495w3(envelope, null);
                ((CoreData) envelope.getModuleData(CoreData.class)).stickers = new ArrayList();
                return (CoreData) envelope.getModuleData(CoreData.class);
            }
        }

        public b() {
            super(C4911z.this.f91137Q, "stickers", new dji(new vod("stickers_protobuf", "_v" + (CoreData.PA_VERSION + 67), uqb0.f180396b0.f170324a.userId()), 7, CoreData.PROTOBUF_ADAPTER), new a(C4911z.this));
        }

        /* JADX INFO: renamed from: D */
        public final /* synthetic */ uxj0 m35934D(Envelope envelope) {
            CoreData coreDataM159277n = m159277n();
            for (StickerBundle stickerBundle : coreDataM159277n.bundles) {
                if (TEnum.equals(stickerBundle.status, "locked")) {
                    stickerBundle.status = BundleStatus.get(BundleStatus.purchased);
                }
            }
            m159273A(coreDataM159277n);
            return uxj0.f181467a;
        }

        /* JADX INFO: renamed from: E */
        public C22421c<uxj0> m35935E() {
            return C4911z.this.f91137Q.now(new ti20(new pcj() { // from class: l.i0b
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/shops/tantan/campaigns/networkShare2014?method=patch")).m209038l(z1d0.create(Network.JSON, "{\"campaignCode\":\"8fd56f5f51790faf9794ab1f4f12e6e9\"}")).m209028b();
                }
            }).map(new qcj() { // from class: l.j0b
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f117804a.m35934D((Envelope) obj);
                }
            }).compose(C4879a.m32255T2()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.z$c */
    public class c extends mof0<CoreData> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.z$c$a */
        public class a implements pcj<C22421c<CoreData>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C4911z f20893a;

            public a(C4911z c4911z) {
                this.f20893a = c4911z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: d */
            public /* synthetic */ CoreData m35964d(Envelope envelope) {
                if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).userStickers) && ((CoreData) envelope.getModuleData(CoreData.class)).userStickers.get(0).updatedTime != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    this.f20893a.f20886U.put(Long.valueOf((long) ((CoreData) envelope.getModuleData(CoreData.class)).userStickers.get(0).updatedTime));
                }
                this.f20893a.f91137Q.m32495w3(envelope, null);
                ((CoreData) envelope.getModuleData(CoreData.class)).stickers = new ArrayList();
                if (((CoreData) envelope.getModuleData(CoreData.class)).userStickers == null) {
                    ((CoreData) envelope.getModuleData(CoreData.class)).userStickers = new ArrayList();
                }
                if (jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).userStickers)) {
                    UserSticker userStickerNew_ = UserSticker.new_();
                    userStickerNew_.f21268id = uqb0.f180396b0.f170324a.userId();
                    ((CoreData) envelope.getModuleData(CoreData.class)).userStickers.add(userStickerNew_);
                }
                return (CoreData) envelope.getModuleData(CoreData.class);
            }

            @Override // p153l.pcj, java.util.concurrent.Callable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public C22421c<CoreData> call() {
                StringBuilder sb = new StringBuilder();
                if (this.f20893a.f20886U.get().longValue() > 0) {
                    sb.append("?since=");
                    try {
                        sb.append(URLEncoder.encode(Converter.dateToApiTimeString(this.f20893a.f20886U.get().longValue()), "UTF-8"));
                    } catch (UnsupportedEncodingException e) {
                        CrashHelper.m82479c(e);
                    }
                }
                final String string = sb.toString();
                return new ti20(new pcj() { // from class: l.z0b
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/stickers" + string)).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.a1b
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f67804a.m35964d((Envelope) obj);
                    }
                });
            }
        }

        public c() {
            super(C4911z.this.f91137Q, "custom_stickers", new dji(new vod("custom_stickers_protobuf", "_v" + (CoreData.PA_VERSION + 14), uqb0.f180396b0.f170324a.userId()), 7, CoreData.PROTOBUF_ADAPTER), new a(C4911z.this), true);
        }

        /* JADX INFO: renamed from: F */
        public static /* synthetic */ Sticker m35944F(Envelope envelope) {
            if (jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).stickers)) {
                return null;
            }
            return ((CoreData) envelope.getModuleData(CoreData.class)).stickers.get(0);
        }

        /* JADX INFO: renamed from: L */
        public static /* synthetic */ StickerInfo m35950L(Envelope envelope) {
            if (jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).stickers)) {
                return null;
            }
            return ((CoreData) envelope.getModuleData(CoreData.class)).stickers.get(0).cloneSticker();
        }

        /* JADX INFO: renamed from: O */
        public C22421c<uxj0> m35953O(final Sticker sticker) {
            final UserSticker userStickerNew_ = UserSticker.new_();
            ArrayList arrayList = new ArrayList();
            userStickerNew_.favoriteStickers = arrayList;
            arrayList.add(sticker.f56859id);
            return C4911z.this.f91137Q.scheduled("addCustomSticker" + sticker.f56859id, 0, new pcj() { // from class: l.m0b
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f134303a.m35958T(sticker, userStickerNew_);
                }
            });
        }

        /* JADX INFO: renamed from: P */
        public C22421c<uxj0> m35954P(final UserSticker userSticker) {
            return C4911z.this.f91137Q.now(new ti20(new pcj() { // from class: l.t0b
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/stickers")).m209031e(z1d0.create(Network.JSON, userSticker.toJson())).m209028b();
                }
            }).map(new qcj() { // from class: l.u0b
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f176870a.m35959U(userSticker, (Envelope) obj);
                }
            }).compose(C4879a.m32255T2()));
        }

        /* JADX INFO: renamed from: Q */
        public C22421c<Sticker> m35955Q(final StickerInfo stickerInfo) {
            return C4911z.this.f91137Q.scheduled("getStickerIdFromSticker" + stickerInfo.f56859id, 0, new pcj() { // from class: l.s0b
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return new si20(new pcj() { // from class: l.x0b
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            StickerInfo stickerInfo2 = stickerInfo;
                            return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/stickers")).m209038l(z1d0.create(Network.JSON, stickerInfo2 == null ? "" : stickerInfo2.toJson())).m209028b();
                        }
                    }, Envelope.JSON_ADAPTER).map(new qcj() { // from class: l.y0b
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return C4911z.c.m35944F((Envelope) obj);
                        }
                    }).compose(C4879a.m32255T2());
                }
            });
        }

        /* JADX INFO: renamed from: R */
        public C22421c<StickerInfo> m35956R(final StickerInfo stickerInfo) {
            return C4911z.this.f91137Q.scheduled("getStickerIdFromSticker" + stickerInfo.f56859id, 0, new pcj() { // from class: l.n0b
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return new si20(new pcj() { // from class: l.o0b
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            StickerInfo stickerInfo2 = stickerInfo;
                            return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/stickers")).m209038l(z1d0.create(Network.JSON, stickerInfo2 == null ? "" : stickerInfo2.toJson())).m209028b();
                        }
                    }, Envelope.JSON_ADAPTER).map(new qcj() { // from class: l.p0b
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return C4911z.c.m35950L((Envelope) obj);
                        }
                    }).compose(C4879a.m32255T2());
                }
            });
        }

        /* JADX INFO: renamed from: S */
        public final /* synthetic */ uxj0 m35957S(Sticker sticker, UserSticker userSticker, Envelope envelope) {
            C4911z.this.f91137Q.m32495w3(envelope, null);
            CoreData coreDataM159277n = m159277n();
            if (NullChecker.m82486a(coreDataM159277n) && !jyb.m147479J(coreDataM159277n.userStickers) && !jyb.m147479J(coreDataM159277n.userStickers.get(0).favoriteStickers)) {
                if (TextUtils.isEmpty(sticker.f56859id) && !jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).stickers)) {
                    userSticker.favoriteStickers.clear();
                    userSticker.favoriteStickers.add(((CoreData) envelope.getModuleData(CoreData.class)).stickers.get(0).f56859id);
                }
                coreDataM159277n.userStickers.get(0).favoriteStickers.removeAll(userSticker.favoriteStickers);
                coreDataM159277n.userStickers.get(0).favoriteStickers.addAll(0, userSticker.favoriteStickers);
            }
            if (NullChecker.m82486a(coreDataM159277n)) {
                m159273A(coreDataM159277n);
            }
            return uxj0.f181467a;
        }

        /* JADX INFO: renamed from: T */
        public final /* synthetic */ C22421c m35958T(final Sticker sticker, final UserSticker userSticker) {
            return new si20(new pcj() { // from class: l.q0b
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    Sticker sticker2 = sticker;
                    return C4879a.f20236P.auth().m209043q(TextUtils.isEmpty(sticker2.f56859id) ? C4879a.m32216J0("/stickers?resource_type=sticker") : C4879a.m32216J0("/stickers")).m209038l(z1d0.create(Network.JSON, TextUtils.isEmpty(sticker2.f56859id) ? sticker2.toJson() : userSticker.toJson())).m209028b();
                }
            }, Envelope.JSON_ADAPTER).map(new qcj() { // from class: l.r0b
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f160603a.m35957S(sticker, userSticker, (Envelope) obj);
                }
            }).compose(C4879a.m32255T2());
        }

        /* JADX INFO: renamed from: U */
        public final /* synthetic */ uxj0 m35959U(UserSticker userSticker, Envelope envelope) {
            CoreData coreDataM159277n = m159277n();
            if (NullChecker.m82486a(coreDataM159277n) && !jyb.m147479J(coreDataM159277n.userStickers) && !jyb.m147479J(coreDataM159277n.userStickers.get(0).favoriteStickers)) {
                coreDataM159277n.userStickers.get(0).favoriteStickers.removeAll(userSticker.favoriteStickers);
            }
            if (NullChecker.m82486a(coreDataM159277n)) {
                m159273A(coreDataM159277n);
            }
            return uxj0.f181467a;
        }

        /* JADX INFO: renamed from: V */
        public final /* synthetic */ uxj0 m35960V(UserSticker userSticker, Envelope envelope) {
            CoreData coreDataM159277n = m159277n();
            if (NullChecker.m82486a(coreDataM159277n) && !jyb.m147479J(coreDataM159277n.userStickers) && !jyb.m147479J(coreDataM159277n.userStickers.get(0).favoriteStickers)) {
                coreDataM159277n.userStickers.get(0).favoriteStickers.removeAll(userSticker.favoriteStickers);
                coreDataM159277n.userStickers.get(0).favoriteStickers.addAll(0, userSticker.favoriteStickers);
            }
            if (NullChecker.m82486a(coreDataM159277n)) {
                m159273A(coreDataM159277n);
            }
            return uxj0.f181467a;
        }

        /* JADX INFO: renamed from: W */
        public C22421c<uxj0> m35961W(final UserSticker userSticker) {
            return C4911z.this.f91137Q.now(new ti20(new pcj() { // from class: l.v0b
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/stickers")).m209037k(z1d0.create(Network.JSON, userSticker.toJson())).m209028b();
                }
            }).map(new qcj() { // from class: l.w0b
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f186554a.m35960V(userSticker, (Envelope) obj);
                }
            }).compose(C4879a.m32255T2()));
        }
    }

    public C4911z(C4883c c4883c) {
        super(c4883c);
        this.f20883R = new jxd0("is_emotion_clicked", Boolean.FALSE);
        this.f20884S = new b();
        this.f20886U = new byd0("customStickerLastReadTime" + uqb0.f180396b0.f170324a.userId(), 0L);
        this.f20885T = new c();
        CoreModule.f18272k.f115539g.warmUp(200, 1000);
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ List m35912a3(boolean z, Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            List list = (List) obj;
            if (z || objArr.length == 1) {
                return list;
            }
            if (!jyb.m147479J(list)) {
                arrayList.add((Sticker) list.get(0));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ Pair m35913b3(Envelope envelope) {
        return (NullChecker.m82486a(envelope.pagination) && NullChecker.m82486a(envelope.pagination.links) && NullChecker.m82486a(envelope.pagination.links.next)) ? Pair.create(((CoreData) envelope.getModuleData(CoreData.class)).stickers, envelope.pagination.links.next) : Pair.create(((CoreData) envelope.getModuleData(CoreData.class)).stickers, "");
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ List m35914c3(List list) {
        return NullChecker.m82486a(list) ? list : new ArrayList();
    }

    /* JADX INFO: renamed from: i3 */
    public void m35920i3() {
        this.f20884S.m159278o();
        this.f20885T.m159278o();
        this.f20886U.clear();
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ C22421c m35921j3(final String str, String str2, String str3) {
        return new si20(new pcj() { // from class: l.f0b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/stickers?filter=third-party&query=" + str)).m209032f().m209028b();
            }
        }, Envelope.JSON_ADAPTER).map(new a(str2, str3)).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: k3 */
    public C22421c<Pair<List<Sticker>, String>> m35922k3() {
        return m35924m3("");
    }

    /* JADX INFO: renamed from: l3 */
    public C22421c<Pair<List<Sticker>, String>> m35923l3(final String str) {
        return this.f91137Q.scheduled("loadPopularStickers" + str, 0, new pcj() { // from class: l.e0b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new si20(new pcj() { // from class: l.g0b
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
                    }
                }, Envelope.JSON_ADAPTER).map(new qcj() { // from class: l.h0b
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C4911z.m35913b3((Envelope) obj);
                    }
                }).compose(C4879a.m32255T2());
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public C22421c<Pair<List<Sticker>, String>> m35924m3(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&channel=" + str;
        }
        return m35923l3(C4879a.m32216J0("/stickers?search=trending&limit=40&offset=0".concat(str2)));
    }

    /* JADX INFO: renamed from: n3 */
    public C22421c<List<Sticker>> m35925n3(List<String> list, boolean z) {
        return m35926o3(list, z, "");
    }

    /* JADX INFO: renamed from: o3 */
    public C22421c<List<Sticker>> m35926o3(List<String> list, final boolean z, String str) {
        if (jyb.m147479J(list)) {
            return C22421c.just(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(m35928q3(list.get(i), str).map(new qcj() { // from class: l.c0b
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return C4911z.m35914c3((List) obj);
                }
            }));
        }
        return C22421c.zip(arrayList, new zcj() { // from class: l.d0b
            @Override // p153l.zcj
            public final Object call(Object[] objArr) {
                return C4911z.m35912a3(z, objArr);
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public C22421c<List<Sticker>> m35927p3(String str) {
        return m35928q3(str, "");
    }

    /* JADX INFO: renamed from: q3 */
    public C22421c<List<Sticker>> m35928q3(final String str, final String str2) {
        String str3;
        if (uqb0.f180394Z.m95954K(str)) {
            return C22421c.just(new ArrayList());
        }
        if (gta.m132210e().m132214d().mo34895o9() && (TextUtils.equals("chat_text_associate", str2) || TextUtils.equals("chat_ice_break", str2))) {
            List<Sticker> listM129058c = g5g0.m129056e().m129058c(str);
            if (!jyb.m147479J(listM129058c)) {
                return C22421c.just(listM129058c);
            }
        }
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = "&channel=" + str2;
        }
        final String str4 = str + str3;
        return this.f91137Q.scheduled("searchThirdPartyStickers".concat(str4), 0, new pcj() { // from class: l.b0b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f74261a.m35921j3(str4, str2, str);
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public Sticker m35929r3(String str) {
        wzh0<Sticker> wzh0Var = CoreModule.f18272k.f115539g;
        Filter<Sticker> filterMo61359EQ = Sticker.NAME.mo61359EQ(str);
        TEnumColumn<Sticker, StickerSource> tEnumColumn = Sticker.SOURCE;
        List<T> listQueryCache = wzh0Var.queryCache(Filter.AND(filterMo61359EQ, Filter.m82444OR(tEnumColumn.m61360EQ("poke"), tEnumColumn.m61360EQ("intimate"))), null, 1);
        return jyb.m147479J(listQueryCache) ? Sticker.new_() : (Sticker) listQueryCache.get(0);
    }

    /* JADX INFO: renamed from: s3 */
    public Sticker m35930s3(String str) {
        Sticker sticker = (Sticker) CoreModule.f18272k.f115539g.queryCache(str);
        return sticker == null ? Sticker.new_() : sticker;
    }
}
