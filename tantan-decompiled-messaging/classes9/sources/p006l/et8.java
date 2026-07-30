package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p000p1.mobile.putong.core.businessdata.GiftInfoTotalData;
import com.p000p1.mobile.putong.core.businessdata.NewGiftInfoPanelWrapper;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.CoreGiftGuide;
import com.p1.mobile.putong.core.data.CoreGiftInfo;
import com.p1.mobile.putong.core.data.CoreGiftPanel;
import com.p1.mobile.putong.core.data.CoreSendGiftBody;
import com.p1.mobile.putong.core.data.GiftWallRankInfo;
import com.p1.mobile.putong.core.data.GiftWallSocial;
import com.p1.mobile.putong.core.data.GiftWallTitle;
import com.p1.mobile.putong.core.data.MyMeetExtra;
import com.p1.mobile.putong.core.data.NewGiftWall;
import com.p1.mobile.putong.core.data.PrivilegeGift;
import com.p1.mobile.putong.data.CoreGiftPanelName;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.jo0;
import l.roj0;
import l.tpd0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.xaj0;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;
import rx.schedulers.Schedulers;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class et8 extends ax6 {

    /* JADX INFO: renamed from: R */
    public final a<Map<CoreGiftPanelName, List<CoreGiftInfo>>> f11433R;

    /* JADX INFO: renamed from: S */
    public final b<CoreGiftGuide> f11434S;

    /* JADX INFO: renamed from: T */
    public final a<GiftWallTitle> f11435T;

    /* JADX INFO: renamed from: U */
    public final a<List<NewGiftInfoPanelWrapper>> f11436U;

    /* JADX INFO: renamed from: V */
    public final a<MyMeetExtra> f11437V;

    /* JADX INFO: renamed from: W */
    public final a<Map<String, PrivilegeGift>> f11438W;

    /* JADX INFO: renamed from: X */
    public final tpd0 f11439X;

    /* JADX INFO: renamed from: Y */
    public GiftInfoTotalData f11440Y;

    public et8(C0158c c0158c) {
        super(c0158c);
        this.f11433R = a.c(new HashMap());
        this.f11434S = b.b();
        this.f11435T = a.b();
        this.f11436U = a.b();
        this.f11437V = a.b();
        this.f11438W = a.c(new HashMap());
        this.f11439X = new tpd0("has_show_purchase_privilege_guide_counter_" + CoreModule.m1850H().userId(), 0);
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ c m14816a3(String str, final String str2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return ia20.m16567a(new v9j() { // from class: l.ns8
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3171R(str2)).m(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).map(new w9j() { // from class: l.os8
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ xaj0 m14822g3(CoreData coreData) {
        GiftWallRankInfo giftWallRankInfo = !vwb.J(coreData.giftWallRankInfos) ? (GiftWallRankInfo) coreData.giftWallRankInfos.get(0) : null;
        return xaj0.a(giftWallRankInfo, coreData.newGiftWalls, Integer.valueOf(NullChecker.a(giftWallRankInfo) ? giftWallRankInfo.totalGiftAmount : 0));
    }

    /* JADX INFO: renamed from: j3 */
    public static /* synthetic */ GiftWallSocial m14825j3(CoreData coreData) {
        if (vwb.J(coreData.giftWallSocials)) {
            return null;
        }
        return (GiftWallSocial) coreData.giftWallSocials.get(0);
    }

    /* JADX INFO: renamed from: n3 */
    public static /* synthetic */ PrivilegeGift m14829n3(PrivilegeGift privilegeGift) {
        return privilegeGift;
    }

    /* JADX INFO: renamed from: z3 */
    public static /* synthetic */ Envelope m14841z3(Envelope envelope) {
        ura.m25555e().m25559d().m5862tb(envelope.getModuleData(CoreData.class).giftInfos);
        return envelope;
    }

    /* JADX INFO: renamed from: H3 */
    public c<roj0> m14842H3(final String str, final String str2) {
        return this.f8580Q.scheduled("core-gift-sent", -1, new v9j() { // from class: l.gs8
            public final Object call() {
                return et8.m14816a3(str2, str);
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public void m14843I3() {
        this.f11436U.onNext(Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: J3 */
    public int m14844J3(String str) {
        PrivilegeGift privilegeGiftM14851Q3 = m14851Q3(str);
        if (privilegeGiftM14851Q3 == null) {
            return 0;
        }
        return privilegeGiftM14851Q3.remaining;
    }

    /* JADX INFO: renamed from: K3 */
    public c<roj0> m14845K3(CoreGiftPanelName coreGiftPanelName, String str) {
        final String strM3183U = coreGiftPanelName == CoreGiftPanelName.get("greet") ? C0154a.m3183U(str) : C0154a.m3151L0(str);
        return this.f8580Q.scheduled("core-gift-panel-meet-" + str, 0, new v9j() { // from class: l.ls8
            public final Object call() {
                return this.f16616a.m14856V3(strM3183U);
            }
        });
    }

    /* JADX INFO: renamed from: L3 */
    public c<GiftWallSocial> m14846L3() {
        return this.f8580Q.scheduled("core-gift-socialinfo", 0, new v9j() { // from class: l.xs8
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.bt8
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/gift-wall-socials")).f().b();
                    }
                }).map(new w9j() { // from class: l.ct8
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class);
                    }
                }).map(new w9j() { // from class: l.dt8
                    public final Object call(Object obj) {
                        return et8.m14825j3((CoreData) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public c<xaj0<GiftWallRankInfo, List<NewGiftWall>, Integer>> m14847M3(final int i, final int i2) {
        return this.f8580Q.scheduled("core-gift-wall-list", 0, new v9j() { // from class: l.xr8
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.bs8
                    public final Object call() {
                        return C0154a.f3483P.auth().q(String.format(C0154a.m3211b1("list&with=rankInfo&page=%s&size=%s"), Integer.valueOf(i), Integer.valueOf(i))).f().b();
                    }
                }).map(new w9j() { // from class: l.cs8
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class);
                    }
                }).map(new w9j() { // from class: l.ds8
                    public final Object call(Object obj) {
                        return et8.m14822g3((CoreData) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: N3 */
    public GiftInfoTotalData m14848N3() {
        return this.f11440Y;
    }

    /* JADX INFO: renamed from: O3 */
    public c<roj0> m14849O3(String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("?otherUserID=");
        sb.append(str);
        sb.append("&with=giftGuide");
        if (!TextUtils.isEmpty(ura.m25555e().m25559d().m5764fi())) {
            sb.append("&tracker=");
            sb.append(ura.m25555e().m25559d().m5764fi());
        }
        return this.f8580Q.scheduled("core-gift-panel-opt", 0, new v9j() { // from class: l.ms8
            public final Object call() {
                return this.f17225a.m14859Y3(sb);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public List<NewGiftInfoPanelWrapper> m14850P3() {
        return (List) this.f11436U.e();
    }

    /* JADX INFO: renamed from: Q3 */
    public PrivilegeGift m14851Q3(String str) {
        Map map = (Map) this.f11438W.e();
        if (NullChecker.a(map)) {
            return (PrivilegeGift) map.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: R3 */
    public CoreGiftInfo m14852R3(String str) {
        return CoreModule.f1542k.f11210r.queryCache(str);
    }

    /* JADX INFO: renamed from: S3 */
    public boolean m14853S3() {
        try {
            return ((Integer) this.f11439X.get()).intValue() < RemoteConfig.x().z("REV_purchase_show_limit_gift", 3);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ Envelope m14854T3(Envelope envelope) {
        if (NullChecker.a(envelope.getModuleData(CoreData.class).giftInfos)) {
            this.f8580Q.m3422w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ roj0 m14855U3(Envelope envelope) {
        List list = envelope.getModuleData(CoreData.class).giftInfos;
        if (NullChecker.a(list)) {
            Map map = (Map) this.f11433R.e();
            map.put(CoreGiftPanelName.get("note"), envelope.getModuleData(CoreData.class).giftInfos);
            this.f11433R.onNext(map);
        }
        if (!vwb.J(list)) {
            ArrayList arrayList = new ArrayList();
            NewGiftInfoPanelWrapper newGiftInfoPanelWrapper = new NewGiftInfoPanelWrapper();
            newGiftInfoPanelWrapper.panel = CoreGiftPanel.new_();
            newGiftInfoPanelWrapper.giftInfos = new ArrayList<>(list);
            arrayList.add(newGiftInfoPanelWrapper);
            this.f11436U.onNext(arrayList);
        }
        m14869i4(envelope.getModuleData(CoreData.class).privilegeGifts);
        this.f11437V.onNext(envelope.getModuleData(CoreData.class).myMeet);
        return roj0.a;
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ c m14856V3(final String str) {
        return ia20.m16571e(new v9j() { // from class: l.ps8
            public final Object call() {
                return C0154a.f3483P.auth().q(str).f().b();
            }
        }).map(new w9j() { // from class: l.qs8
            public final Object call(Object obj) {
                return this.f20005a.m14854T3((Envelope) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.rs8
            public final Object call(Object obj) {
                return this.f20706a.m14855U3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ Envelope m14857W3(Envelope envelope) {
        if (NullChecker.a(envelope.getModuleData(CoreData.class).giftInfos)) {
            this.f8580Q.m3422w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ roj0 m14858X3(Envelope envelope) {
        if (NullChecker.a(envelope.getModuleData(CoreData.class).giftGuide)) {
            this.f11434S.onNext(envelope.getModuleData(CoreData.class).giftGuide);
        }
        List list = envelope.getModuleData(CoreData.class).giftInfos;
        List list2 = envelope.getModuleData(CoreData.class).giftPanel;
        m14869i4(envelope.getModuleData(CoreData.class).privilegeGifts);
        if (vwb.J(list) || vwb.J(list2)) {
            this.f11436U.onNext(Collections.EMPTY_LIST);
        } else {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list2.size(); i++) {
                CoreGiftPanel coreGiftPanel = (CoreGiftPanel) list2.get(i);
                List list3 = coreGiftPanel.giftIds;
                if (!vwb.J(list3)) {
                    NewGiftInfoPanelWrapper newGiftInfoPanelWrapper = new NewGiftInfoPanelWrapper();
                    newGiftInfoPanelWrapper.panel = coreGiftPanel;
                    newGiftInfoPanelWrapper.giftInfos = new ArrayList<>();
                    for (int i2 = 0; i2 < list3.size(); i2++) {
                        final String str = (String) list3.get(i2);
                        ArrayList arrayListN = vwb.n(list, new w9j() { // from class: l.ws8
                            public final Object call(Object obj) {
                                return Boolean.valueOf(((DbObject) ((CoreGiftInfo) obj)).id.equals(str));
                            }
                        });
                        if (!vwb.J(arrayListN)) {
                            newGiftInfoPanelWrapper.giftInfos.add((CoreGiftInfo) arrayListN.get(0));
                        }
                    }
                    arrayList.add(newGiftInfoPanelWrapper);
                }
            }
            this.f11436U.onNext(arrayList);
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ c m14859Y3(final StringBuilder sb) {
        return ia20.m16571e(new v9j() { // from class: l.ss8
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3164P(sb.toString())).f().b();
            }
        }).map(new w9j() { // from class: l.us8
            public final Object call(Object obj) {
                return this.f23728a.m14857W3((Envelope) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.vs8
            public final Object call(Object obj) {
                return this.f24441a.m14858X3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ Envelope m14860Z3(Envelope envelope) {
        if (NullChecker.a(envelope.getModuleData(CoreData.class).giftInfos)) {
            this.f8580Q.m3422w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ roj0 m14861a4(CoreSendGiftBody coreSendGiftBody, Envelope envelope) {
        m14869i4(envelope.getModuleData(CoreData.class).privilegeGifts);
        this.f8580Q.f3559H0.m27538l5(envelope);
        if ("privilege".equals(coreSendGiftBody.consumeType) || (NullChecker.a(coreSendGiftBody.extra) && TextUtils.equals(coreSendGiftBody.extra.privilegeType, "greetGift"))) {
            this.f8580Q.f3544C0.m27420u4();
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ c m14862b4(final CoreSendGiftBody coreSendGiftBody) {
        return ia20.m16571e(new v9j() { // from class: l.hs8
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3167Q()).m(utc0.create(Network.JSON, coreSendGiftBody.toJson())).b();
            }
        }).map(new w9j() { // from class: l.js8
            public final Object call(Object obj) {
                return this.f15370a.m14860Z3((Envelope) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.ks8
            public final Object call(Object obj) {
                return this.f15978a.m14861a4(coreSendGiftBody, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ Envelope m14863c4(Envelope envelope) {
        if (NullChecker.a(envelope.getModuleData(CoreData.class).giftInfos)) {
            this.f8580Q.m3422w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ c m14864d4() {
        return ia20.m16571e(new v9j() { // from class: l.ys8
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3161O()).f().b();
            }
        }).map(new w9j() { // from class: l.zs8
            public final Object call(Object obj) {
                return this.f28955a.m14863c4((Envelope) obj);
            }
        }).observeOn(Schedulers.io()).map(new w9j() { // from class: l.at8
            public final Object call(Object obj) {
                return et8.m14841z3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ roj0 m14865e4(Envelope envelope) {
        List<PrivilegeGift> list = envelope.getModuleData(CoreData.class).privilegeGifts;
        if (!list.isEmpty()) {
            m14869i4(list);
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ c m14866f4() {
        return ia20.m16567a(new v9j() { // from class: l.yr8
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3175S()).f().b();
            }
        }).map(new w9j() { // from class: l.zr8
            public final Object call(Object obj) {
                return this.f28919a.m14865e4((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public c<MyMeetExtra> m14867g4() {
        return this.f11437V.asObservable();
    }

    /* JADX INFO: renamed from: h4 */
    public c<List<NewGiftInfoPanelWrapper>> m14868h4() {
        return this.f11436U.asObservable();
    }

    /* JADX INFO: renamed from: i4 */
    public final void m14869i4(List<PrivilegeGift> list) {
        HashMap map = list == null ? new HashMap() : vwb.d(list, new w9j() { // from class: l.es8
            public final Object call(Object obj) {
                return ((PrivilegeGift) obj).id;
            }
        }, new w9j() { // from class: l.fs8
            public final Object call(Object obj) {
                return et8.m14829n3((PrivilegeGift) obj);
            }
        });
        if (map.equals(this.f11438W.e())) {
            return;
        }
        this.f11438W.onNext(map);
    }

    /* JADX INFO: renamed from: j4 */
    public c<roj0> m14870j4(String str) {
        return m14842H3(str, "open");
    }

    /* JADX INFO: renamed from: k4 */
    public c<roj0> m14871k4(final CoreSendGiftBody coreSendGiftBody) {
        PrivilegeGift privilegeGiftM14851Q3 = this.f8580Q.f3632f1.m14851Q3(coreSendGiftBody.giftID);
        if (NullChecker.a(privilegeGiftM14851Q3) && privilegeGiftM14851Q3.remaining > 0) {
            coreSendGiftBody.extra.privilegeType = privilegeGiftM14851Q3.privilegeType.toString();
        }
        return this.f8580Q.scheduled("core-gift-send", -1, new v9j() { // from class: l.as8
            public final Object call() {
                return this.f8471a.m14862b4(coreSendGiftBody);
            }
        });
    }

    /* JADX INFO: renamed from: l4 */
    public void m14872l4() {
        this.f11439X.a(1);
    }

    /* JADX INFO: renamed from: m4 */
    public void m14873m4() {
        this.f8580Q.scheduled("core-gift-resources", 0, new v9j() { // from class: l.ts8
            public final Object call() {
                return this.f22263a.m14864d4();
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public void m14874n4() {
        this.f8580Q.scheduled("privilege-gift-remaining", 0, new v9j() { // from class: l.is8
            public final Object call() {
                return this.f14736a.m14866f4();
            }
        });
    }

    /* JADX INFO: renamed from: o4 */
    public void m14875o4() {
        this.f11439X.put(0);
    }

    /* JADX INFO: renamed from: p4 */
    public c<roj0> m14876p4(String str) {
        return m14842H3(str, "thank");
    }
}
