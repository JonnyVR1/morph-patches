package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.businessdata.GiftInfoTotalData;
import com.p046p1.mobile.putong.core.businessdata.NewGiftInfoPanelWrapper;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.CoreGiftGuide;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.data.CoreGiftPanel;
import com.p046p1.mobile.putong.core.data.CoreSendGiftBody;
import com.p046p1.mobile.putong.core.data.GiftWallRankInfo;
import com.p046p1.mobile.putong.core.data.GiftWallSocial;
import com.p046p1.mobile.putong.core.data.GiftWallTitle;
import com.p046p1.mobile.putong.core.data.MyMeetExtra;
import com.p046p1.mobile.putong.core.data.NewGiftWall;
import com.p046p1.mobile.putong.core.data.PrivilegeGift;
import com.p046p1.mobile.putong.data.CoreGiftPanelName;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
public class et8 extends ax6 {

    /* JADX INFO: renamed from: R */
    public final C22392a<Map<CoreGiftPanelName, List<CoreGiftInfo>>> f93092R;

    /* JADX INFO: renamed from: S */
    public final C22393b<CoreGiftGuide> f93093S;

    /* JADX INFO: renamed from: T */
    public final C22392a<GiftWallTitle> f93094T;

    /* JADX INFO: renamed from: U */
    public final C22392a<List<NewGiftInfoPanelWrapper>> f93095U;

    /* JADX INFO: renamed from: V */
    public final C22392a<MyMeetExtra> f93096V;

    /* JADX INFO: renamed from: W */
    public final C22392a<Map<String, PrivilegeGift>> f93097W;

    /* JADX INFO: renamed from: X */
    public final tpd0 f93098X;

    /* JADX INFO: renamed from: Y */
    public GiftInfoTotalData f93099Y;

    public et8(C4732c c4732c) {
        super(c4732c);
        this.f93092R = C22392a.m221513c(new HashMap());
        this.f93093S = C22393b.m221521b();
        this.f93094T = C22392a.m221512b();
        this.f93095U = C22392a.m221512b();
        this.f93096V = C22392a.m221512b();
        this.f93097W = C22392a.m221513c(new HashMap());
        this.f93098X = new tpd0("has_show_purchase_privilege_guide_counter_" + CoreModule.m29931H().userId(), 0);
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ C22306c m118018a3(String str, final String str2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return ia20.m135117a(new v9j() { // from class: l.ns8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31241R(str2)).m185894m(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).map(new w9j() { // from class: l.os8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ CoreData m118019b3(Envelope envelope) {
        return (CoreData) envelope.getModuleData(CoreData.class);
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ xaj0 m118024g3(CoreData coreData) {
        GiftWallRankInfo giftWallRankInfo = !vwb.m200296J(coreData.giftWallRankInfos) ? coreData.giftWallRankInfos.get(0) : null;
        return xaj0.m207578a(giftWallRankInfo, coreData.newGiftWalls, Integer.valueOf(NullChecker.m81303a(giftWallRankInfo) ? giftWallRankInfo.totalGiftAmount : 0));
    }

    /* JADX INFO: renamed from: j3 */
    public static /* synthetic */ GiftWallSocial m118027j3(CoreData coreData) {
        if (vwb.m200296J(coreData.giftWallSocials)) {
            return null;
        }
        return coreData.giftWallSocials.get(0);
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ CoreData m118029l3(Envelope envelope) {
        return (CoreData) envelope.getModuleData(CoreData.class);
    }

    /* JADX INFO: renamed from: n3 */
    public static /* synthetic */ PrivilegeGift m118031n3(PrivilegeGift privilegeGift) {
        return privilegeGift;
    }

    /* JADX INFO: renamed from: z3 */
    public static /* synthetic */ Envelope m118043z3(Envelope envelope) {
        ura.m195053e().m195057d().mo33925tb(((CoreData) envelope.getModuleData(CoreData.class)).giftInfos);
        return envelope;
    }

    /* JADX INFO: renamed from: H3 */
    public C22306c<roj0> m118044H3(final String str, final String str2) {
        return this.f72126Q.scheduled("core-gift-sent", -1, new v9j() { // from class: l.gs8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return et8.m118018a3(str2, str);
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public void m118045I3() {
        this.f93095U.m132487l(Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: J3 */
    public int m118046J3(String str) {
        PrivilegeGift privilegeGiftM118053Q3 = m118053Q3(str);
        if (privilegeGiftM118053Q3 == null) {
            return 0;
        }
        return privilegeGiftM118053Q3.remaining;
    }

    /* JADX INFO: renamed from: K3 */
    public C22306c<roj0> m118047K3(CoreGiftPanelName coreGiftPanelName, String str) {
        final String strM31253U = coreGiftPanelName == CoreGiftPanelName.get("greet") ? C4728a.m31253U(str) : C4728a.m31221L0(str);
        return this.f72126Q.scheduled("core-gift-panel-meet-" + str, 0, new v9j() { // from class: l.ls8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f129812a.m118058V3(strM31253U);
            }
        });
    }

    /* JADX INFO: renamed from: L3 */
    public C22306c<GiftWallSocial> m118048L3() {
        return this.f72126Q.scheduled("core-gift-socialinfo", 0, new v9j() { // from class: l.xs8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.bt8
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/gift-wall-socials")).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.ct8
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return et8.m118019b3((Envelope) obj);
                    }
                }).map(new w9j() { // from class: l.dt8
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return et8.m118027j3((CoreData) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public C22306c<xaj0<GiftWallRankInfo, List<NewGiftWall>, Integer>> m118049M3(final int i, final int i2) {
        return this.f72126Q.scheduled("core-gift-wall-list", 0, new v9j() { // from class: l.xr8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.bs8
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(String.format(C4728a.m31281b1("list&with=rankInfo&page=%s&size=%s"), Integer.valueOf(i), Integer.valueOf(i))).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.cs8
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return et8.m118029l3((Envelope) obj);
                    }
                }).map(new w9j() { // from class: l.ds8
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return et8.m118024g3((CoreData) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: N3 */
    public GiftInfoTotalData m118050N3() {
        return this.f93099Y;
    }

    /* JADX INFO: renamed from: O3 */
    public C22306c<roj0> m118051O3(String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("?otherUserID=");
        sb.append(str);
        sb.append("&with=giftGuide");
        if (!TextUtils.isEmpty(ura.m195053e().m195057d().mo33827fi())) {
            sb.append("&tracker=");
            sb.append(ura.m195053e().m195057d().mo33827fi());
        }
        return this.f72126Q.scheduled("core-gift-panel-opt", 0, new v9j() { // from class: l.ms8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f135454a.m118061Y3(sb);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public List<NewGiftInfoPanelWrapper> m118052P3() {
        return this.f93095U.m221515e();
    }

    /* JADX INFO: renamed from: Q3 */
    public PrivilegeGift m118053Q3(String str) {
        Map<String, PrivilegeGift> mapM221515e = this.f93097W.m221515e();
        if (NullChecker.m81303a(mapM221515e)) {
            return mapM221515e.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: R3 */
    public CoreGiftInfo m118054R3(String str) {
        return CoreModule.f17553k.f91955r.queryCache(str);
    }

    /* JADX INFO: renamed from: S3 */
    public boolean m118055S3() {
        try {
            return this.f93098X.get().intValue() < RemoteConfig.m79298x().m79336z("REV_purchase_show_limit_gift", 3);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ Envelope m118056T3(Envelope envelope) {
        if (NullChecker.m81303a(((CoreData) envelope.getModuleData(CoreData.class)).giftInfos)) {
            this.f72126Q.m31492w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ roj0 m118057U3(Envelope envelope) {
        List<CoreGiftInfo> list = ((CoreData) envelope.getModuleData(CoreData.class)).giftInfos;
        if (NullChecker.m81303a(list)) {
            Map<CoreGiftPanelName, List<CoreGiftInfo>> mapM221515e = this.f93092R.m221515e();
            mapM221515e.put(CoreGiftPanelName.get("note"), ((CoreData) envelope.getModuleData(CoreData.class)).giftInfos);
            this.f93092R.m132487l(mapM221515e);
        }
        if (!vwb.m200296J(list)) {
            ArrayList arrayList = new ArrayList();
            NewGiftInfoPanelWrapper newGiftInfoPanelWrapper = new NewGiftInfoPanelWrapper();
            newGiftInfoPanelWrapper.panel = CoreGiftPanel.new_();
            newGiftInfoPanelWrapper.giftInfos = new ArrayList<>(list);
            arrayList.add(newGiftInfoPanelWrapper);
            this.f93095U.m132487l(arrayList);
        }
        m118071i4(((CoreData) envelope.getModuleData(CoreData.class)).privilegeGifts);
        this.f93096V.m132487l(((CoreData) envelope.getModuleData(CoreData.class)).myMeet);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ C22306c m118058V3(final String str) {
        return ia20.m135121e(new v9j() { // from class: l.ps8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.qs8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f156106a.m118056T3((Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.rs8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f160817a.m118057U3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ Envelope m118059W3(Envelope envelope) {
        if (NullChecker.m81303a(((CoreData) envelope.getModuleData(CoreData.class)).giftInfos)) {
            this.f72126Q.m31492w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ roj0 m118060X3(Envelope envelope) {
        if (NullChecker.m81303a(((CoreData) envelope.getModuleData(CoreData.class)).giftGuide)) {
            this.f93093S.m132487l(((CoreData) envelope.getModuleData(CoreData.class)).giftGuide);
        }
        List<CoreGiftInfo> list = ((CoreData) envelope.getModuleData(CoreData.class)).giftInfos;
        List<CoreGiftPanel> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).giftPanel;
        m118071i4(((CoreData) envelope.getModuleData(CoreData.class)).privilegeGifts);
        if (vwb.m200296J(list) || vwb.m200296J(list2)) {
            this.f93095U.m132487l(Collections.EMPTY_LIST);
        } else {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list2.size(); i++) {
                CoreGiftPanel coreGiftPanel = list2.get(i);
                List<String> list3 = coreGiftPanel.giftIds;
                if (!vwb.m200296J(list3)) {
                    NewGiftInfoPanelWrapper newGiftInfoPanelWrapper = new NewGiftInfoPanelWrapper();
                    newGiftInfoPanelWrapper.panel = coreGiftPanel;
                    newGiftInfoPanelWrapper.giftInfos = new ArrayList<>();
                    for (int i2 = 0; i2 < list3.size(); i2++) {
                        final String str = list3.get(i2);
                        ArrayList arrayListM200339n = vwb.m200339n(list, new w9j() { // from class: l.ws8
                            @Override // p149l.w9j
                            public final Object call(Object obj) {
                                return Boolean.valueOf(((CoreGiftInfo) obj).f56011id.equals(str));
                            }
                        });
                        if (!vwb.m200296J(arrayListM200339n)) {
                            newGiftInfoPanelWrapper.giftInfos.add((CoreGiftInfo) arrayListM200339n.get(0));
                        }
                    }
                    arrayList.add(newGiftInfoPanelWrapper);
                }
            }
            this.f93095U.m132487l(arrayList);
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ C22306c m118061Y3(final StringBuilder sb) {
        return ia20.m135121e(new v9j() { // from class: l.ss8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31234P(sb.toString())).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.us8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f177947a.m118059W3((Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.vs8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f182811a.m118060X3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ Envelope m118062Z3(Envelope envelope) {
        if (NullChecker.m81303a(((CoreData) envelope.getModuleData(CoreData.class)).giftInfos)) {
            this.f72126Q.m31492w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ roj0 m118063a4(CoreSendGiftBody coreSendGiftBody, Envelope envelope) {
        m118071i4(((CoreData) envelope.getModuleData(CoreData.class)).privilegeGifts);
        this.f72126Q.f19570H0.m210363l5(envelope);
        if ("privilege".equals(coreSendGiftBody.consumeType) || (NullChecker.m81303a(coreSendGiftBody.extra) && TextUtils.equals(coreSendGiftBody.extra.privilegeType, "greetGift"))) {
            this.f72126Q.f19555C0.m210112u4();
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ C22306c m118064b4(final CoreSendGiftBody coreSendGiftBody) {
        return ia20.m135121e(new v9j() { // from class: l.hs8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31237Q()).m185894m(utc0.create(Network.JSON, coreSendGiftBody.toJson())).m185883b();
            }
        }).map(new w9j() { // from class: l.js8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f119480a.m118062Z3((Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.ks8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f124423a.m118063a4(coreSendGiftBody, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ Envelope m118065c4(Envelope envelope) {
        if (NullChecker.m81303a(((CoreData) envelope.getModuleData(CoreData.class)).giftInfos)) {
            this.f72126Q.m31492w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ C22306c m118066d4() {
        return ia20.m135121e(new v9j() { // from class: l.ys8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31231O()).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.zs8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f204573a.m118065c4((Envelope) obj);
            }
        }).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.at8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return et8.m118043z3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ roj0 m118067e4(Envelope envelope) {
        List<PrivilegeGift> list = ((CoreData) envelope.getModuleData(CoreData.class)).privilegeGifts;
        if (!list.isEmpty()) {
            m118071i4(list);
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ C22306c m118068f4() {
        return ia20.m135117a(new v9j() { // from class: l.yr8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31245S()).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.zr8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f204462a.m118067e4((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public C22306c<MyMeetExtra> m118069g4() {
        return this.f93096V.asObservable();
    }

    /* JADX INFO: renamed from: h4 */
    public C22306c<List<NewGiftInfoPanelWrapper>> m118070h4() {
        return this.f93095U.asObservable();
    }

    /* JADX INFO: renamed from: i4 */
    public final void m118071i4(List<PrivilegeGift> list) {
        HashMap map = list == null ? new HashMap() : vwb.m200319d(list, new w9j() { // from class: l.es8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((PrivilegeGift) obj).f20472id;
            }
        }, new w9j() { // from class: l.fs8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return et8.m118031n3((PrivilegeGift) obj);
            }
        });
        if (map.equals(this.f93097W.m221515e())) {
            return;
        }
        this.f93097W.m132487l(map);
    }

    /* JADX INFO: renamed from: j4 */
    public C22306c<roj0> m118072j4(String str) {
        return m118044H3(str, "open");
    }

    /* JADX INFO: renamed from: k4 */
    public C22306c<roj0> m118073k4(final CoreSendGiftBody coreSendGiftBody) {
        PrivilegeGift privilegeGiftM118053Q3 = this.f72126Q.f19643f1.m118053Q3(coreSendGiftBody.giftID);
        if (NullChecker.m81303a(privilegeGiftM118053Q3) && privilegeGiftM118053Q3.remaining > 0) {
            coreSendGiftBody.extra.privilegeType = privilegeGiftM118053Q3.privilegeType.toString();
        }
        return this.f72126Q.scheduled("core-gift-send", -1, new v9j() { // from class: l.as8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f71398a.m118064b4(coreSendGiftBody);
            }
        });
    }

    /* JADX INFO: renamed from: l4 */
    public void m118074l4() {
        this.f93098X.m189988a(1);
    }

    /* JADX INFO: renamed from: m4 */
    public void m118075m4() {
        this.f72126Q.scheduled("core-gift-resources", 0, new v9j() { // from class: l.ts8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f171917a.m118066d4();
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public void m118076n4() {
        this.f72126Q.scheduled("privilege-gift-remaining", 0, new v9j() { // from class: l.is8
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f114743a.m118068f4();
            }
        });
    }

    /* JADX INFO: renamed from: o4 */
    public void m118077o4() {
        this.f93098X.put(0);
    }

    /* JADX INFO: renamed from: p4 */
    public C22306c<roj0> m118078p4(String str) {
        return m118044H3(str, "thank");
    }
}
