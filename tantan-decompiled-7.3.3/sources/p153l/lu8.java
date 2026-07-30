package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.businessdata.GiftInfoTotalData;
import com.p051p1.mobile.putong.core.businessdata.NewGiftInfoPanelWrapper;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.CoreGiftGuide;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.data.CoreGiftPanel;
import com.p051p1.mobile.putong.core.data.CoreSendGiftBody;
import com.p051p1.mobile.putong.core.data.GiftWallRankInfo;
import com.p051p1.mobile.putong.core.data.GiftWallSocial;
import com.p051p1.mobile.putong.core.data.GiftWallTitle;
import com.p051p1.mobile.putong.core.data.MyMeetExtra;
import com.p051p1.mobile.putong.core.data.NewGiftWall;
import com.p051p1.mobile.putong.core.data.PrivilegeGift;
import com.p051p1.mobile.putong.data.CoreGiftPanelName;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public class lu8 extends dy6 {

    /* JADX INFO: renamed from: R */
    public final C22507a<Map<CoreGiftPanelName, List<CoreGiftInfo>>> f133602R;

    /* JADX INFO: renamed from: S */
    public final C22508b<CoreGiftGuide> f133603S;

    /* JADX INFO: renamed from: T */
    public final C22507a<GiftWallTitle> f133604T;

    /* JADX INFO: renamed from: U */
    public final C22507a<List<NewGiftInfoPanelWrapper>> f133605U;

    /* JADX INFO: renamed from: V */
    public final C22507a<MyMeetExtra> f133606V;

    /* JADX INFO: renamed from: W */
    public final C22507a<Map<String, PrivilegeGift>> f133607W;

    /* JADX INFO: renamed from: X */
    public final vxd0 f133608X;

    /* JADX INFO: renamed from: Y */
    public GiftInfoTotalData f133609Y;

    public lu8(C4883c c4883c) {
        super(c4883c);
        this.f133602R = C22507a.m222759c(new HashMap());
        this.f133603S = C22508b.m222767b();
        this.f133604T = C22507a.m222758b();
        this.f133605U = C22507a.m222758b();
        this.f133606V = C22507a.m222758b();
        this.f133607W = C22507a.m222759c(new HashMap());
        this.f133608X = new vxd0("has_show_purchase_privilege_guide_counter_" + CoreModule.m30929H().userId(), 0);
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ C22421c m155856a3(String str, final String str2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return qi20.m176654a(new pcj() { // from class: l.ut8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32244R(str2)).m209039m(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).map(new qcj() { // from class: l.vt8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ CoreData m155857b3(Envelope envelope) {
        return (CoreData) envelope.getModuleData(CoreData.class);
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ bkj0 m155862g3(CoreData coreData) {
        GiftWallRankInfo giftWallRankInfo = !jyb.m147479J(coreData.giftWallRankInfos) ? coreData.giftWallRankInfos.get(0) : null;
        return bkj0.m104818a(giftWallRankInfo, coreData.newGiftWalls, Integer.valueOf(NullChecker.m82486a(giftWallRankInfo) ? giftWallRankInfo.totalGiftAmount : 0));
    }

    /* JADX INFO: renamed from: j3 */
    public static /* synthetic */ GiftWallSocial m155865j3(CoreData coreData) {
        if (jyb.m147479J(coreData.giftWallSocials)) {
            return null;
        }
        return coreData.giftWallSocials.get(0);
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ CoreData m155867l3(Envelope envelope) {
        return (CoreData) envelope.getModuleData(CoreData.class);
    }

    /* JADX INFO: renamed from: n3 */
    public static /* synthetic */ PrivilegeGift m155869n3(PrivilegeGift privilegeGift) {
        return privilegeGift;
    }

    /* JADX INFO: renamed from: z3 */
    public static /* synthetic */ Envelope m155881z3(Envelope envelope) {
        gta.m132210e().m132214d().mo34928tb(((CoreData) envelope.getModuleData(CoreData.class)).giftInfos);
        return envelope;
    }

    /* JADX INFO: renamed from: H3 */
    public C22421c<uxj0> m155882H3(final String str, final String str2) {
        return this.f91137Q.scheduled("core-gift-sent", -1, new pcj() { // from class: l.nt8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return lu8.m155856a3(str2, str);
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public void m155883I3() {
        this.f133605U.m137019l(Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: J3 */
    public int m155884J3(String str) {
        PrivilegeGift privilegeGiftM155891Q3 = m155891Q3(str);
        if (privilegeGiftM155891Q3 == null) {
            return 0;
        }
        return privilegeGiftM155891Q3.remaining;
    }

    /* JADX INFO: renamed from: K3 */
    public C22421c<uxj0> m155885K3(CoreGiftPanelName coreGiftPanelName, String str) {
        final String strM32256U = coreGiftPanelName == CoreGiftPanelName.get("greet") ? C4879a.m32256U(str) : C4879a.m32224L0(str);
        return this.f91137Q.scheduled("core-gift-panel-meet-" + str, 0, new pcj() { // from class: l.st8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f170550a.m155896V3(strM32256U);
            }
        });
    }

    /* JADX INFO: renamed from: L3 */
    public C22421c<GiftWallSocial> m155886L3() {
        return this.f91137Q.scheduled("core-gift-socialinfo", 0, new pcj() { // from class: l.eu8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.iu8
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/gift-wall-socials")).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.ju8
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return lu8.m155857b3((Envelope) obj);
                    }
                }).map(new qcj() { // from class: l.ku8
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return lu8.m155865j3((CoreData) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public C22421c<bkj0<GiftWallRankInfo, List<NewGiftWall>, Integer>> m155887M3(final int i, final int i2) {
        return this.f91137Q.scheduled("core-gift-wall-list", 0, new pcj() { // from class: l.et8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.it8
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(String.format(C4879a.m32284b1("list&with=rankInfo&page=%s&size=%s"), Integer.valueOf(i), Integer.valueOf(i))).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.jt8
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return lu8.m155867l3((Envelope) obj);
                    }
                }).map(new qcj() { // from class: l.kt8
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return lu8.m155862g3((CoreData) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: N3 */
    public GiftInfoTotalData m155888N3() {
        return this.f133609Y;
    }

    /* JADX INFO: renamed from: O3 */
    public C22421c<uxj0> m155889O3(String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("?otherUserID=");
        sb.append(str);
        sb.append("&with=giftGuide");
        if (!TextUtils.isEmpty(gta.m132210e().m132214d().mo34830fi())) {
            sb.append("&tracker=");
            sb.append(gta.m132210e().m132214d().mo34830fi());
        }
        return this.f91137Q.scheduled("core-gift-panel-opt", 0, new pcj() { // from class: l.tt8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f176061a.m155899Y3(sb);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public List<NewGiftInfoPanelWrapper> m155890P3() {
        return this.f133605U.m222761e();
    }

    /* JADX INFO: renamed from: Q3 */
    public PrivilegeGift m155891Q3(String str) {
        Map<String, PrivilegeGift> mapM222761e = this.f133607W.m222761e();
        if (NullChecker.m82486a(mapM222761e)) {
            return mapM222761e.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: R3 */
    public CoreGiftInfo m155892R3(String str) {
        return CoreModule.f18272k.f115550r.queryCache(str);
    }

    /* JADX INFO: renamed from: S3 */
    public boolean m155893S3() {
        try {
            return this.f133608X.get().intValue() < RemoteConfig.m80481x().m80519z("REV_purchase_show_limit_gift", 3);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ Envelope m155894T3(Envelope envelope) {
        if (NullChecker.m82486a(((CoreData) envelope.getModuleData(CoreData.class)).giftInfos)) {
            this.f91137Q.m32495w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ uxj0 m155895U3(Envelope envelope) {
        List<CoreGiftInfo> list = ((CoreData) envelope.getModuleData(CoreData.class)).giftInfos;
        if (NullChecker.m82486a(list)) {
            Map<CoreGiftPanelName, List<CoreGiftInfo>> mapM222761e = this.f133602R.m222761e();
            mapM222761e.put(CoreGiftPanelName.get("note"), ((CoreData) envelope.getModuleData(CoreData.class)).giftInfos);
            this.f133602R.m137019l(mapM222761e);
        }
        if (!jyb.m147479J(list)) {
            ArrayList arrayList = new ArrayList();
            NewGiftInfoPanelWrapper newGiftInfoPanelWrapper = new NewGiftInfoPanelWrapper();
            newGiftInfoPanelWrapper.panel = CoreGiftPanel.new_();
            newGiftInfoPanelWrapper.giftInfos = new ArrayList<>(list);
            arrayList.add(newGiftInfoPanelWrapper);
            this.f133605U.m137019l(arrayList);
        }
        m155909i4(((CoreData) envelope.getModuleData(CoreData.class)).privilegeGifts);
        this.f133606V.m137019l(((CoreData) envelope.getModuleData(CoreData.class)).myMeet);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ C22421c m155896V3(final String str) {
        return qi20.m176658e(new pcj() { // from class: l.wt8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.xt8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f196195a.m155894T3((Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.yt8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f201493a.m155895U3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ Envelope m155897W3(Envelope envelope) {
        if (NullChecker.m82486a(((CoreData) envelope.getModuleData(CoreData.class)).giftInfos)) {
            this.f91137Q.m32495w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ uxj0 m155898X3(Envelope envelope) {
        if (NullChecker.m82486a(((CoreData) envelope.getModuleData(CoreData.class)).giftGuide)) {
            this.f133603S.m137019l(((CoreData) envelope.getModuleData(CoreData.class)).giftGuide);
        }
        List<CoreGiftInfo> list = ((CoreData) envelope.getModuleData(CoreData.class)).giftInfos;
        List<CoreGiftPanel> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).giftPanel;
        m155909i4(((CoreData) envelope.getModuleData(CoreData.class)).privilegeGifts);
        if (jyb.m147479J(list) || jyb.m147479J(list2)) {
            this.f133605U.m137019l(Collections.EMPTY_LIST);
        } else {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list2.size(); i++) {
                CoreGiftPanel coreGiftPanel = list2.get(i);
                List<String> list3 = coreGiftPanel.giftIds;
                if (!jyb.m147479J(list3)) {
                    NewGiftInfoPanelWrapper newGiftInfoPanelWrapper = new NewGiftInfoPanelWrapper();
                    newGiftInfoPanelWrapper.panel = coreGiftPanel;
                    newGiftInfoPanelWrapper.giftInfos = new ArrayList<>();
                    for (int i2 = 0; i2 < list3.size(); i2++) {
                        final String str = list3.get(i2);
                        ArrayList arrayListM147522n = jyb.m147522n(list, new qcj() { // from class: l.du8
                            @Override // p153l.qcj
                            public final Object call(Object obj) {
                                return Boolean.valueOf(((CoreGiftInfo) obj).f56859id.equals(str));
                            }
                        });
                        if (!jyb.m147479J(arrayListM147522n)) {
                            newGiftInfoPanelWrapper.giftInfos.add((CoreGiftInfo) arrayListM147522n.get(0));
                        }
                    }
                    arrayList.add(newGiftInfoPanelWrapper);
                }
            }
            this.f133605U.m137019l(arrayList);
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ C22421c m155899Y3(final StringBuilder sb) {
        return qi20.m176658e(new pcj() { // from class: l.zt8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32237P(sb.toString())).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.bu8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f78437a.m155897W3((Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.cu8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f83822a.m155898X3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ Envelope m155900Z3(Envelope envelope) {
        if (NullChecker.m82486a(((CoreData) envelope.getModuleData(CoreData.class)).giftInfos)) {
            this.f91137Q.m32495w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ uxj0 m155901a4(CoreSendGiftBody coreSendGiftBody, Envelope envelope) {
        m155909i4(((CoreData) envelope.getModuleData(CoreData.class)).privilegeGifts);
        this.f91137Q.f20312H0.m155451l5(envelope);
        if ("privilege".equals(coreSendGiftBody.consumeType) || (NullChecker.m82486a(coreSendGiftBody.extra) && TextUtils.equals(coreSendGiftBody.extra.privilegeType, "greetGift"))) {
            this.f91137Q.f20297C0.m146425v4();
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ C22421c m155902b4(final CoreSendGiftBody coreSendGiftBody) {
        return qi20.m176658e(new pcj() { // from class: l.ot8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32240Q()).m209039m(z1d0.create(Network.JSON, coreSendGiftBody.toJson())).m209028b();
            }
        }).map(new qcj() { // from class: l.qt8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f159398a.m155900Z3((Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.rt8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f164794a.m155901a4(coreSendGiftBody, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ Envelope m155903c4(Envelope envelope) {
        if (NullChecker.m82486a(((CoreData) envelope.getModuleData(CoreData.class)).giftInfos)) {
            this.f91137Q.m32495w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ C22421c m155904d4() {
        return qi20.m176658e(new pcj() { // from class: l.fu8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32234O()).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.gu8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f106474a.m155903c4((Envelope) obj);
            }
        }).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.hu8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return lu8.m155881z3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ uxj0 m155905e4(Envelope envelope) {
        List<PrivilegeGift> list = ((CoreData) envelope.getModuleData(CoreData.class)).privilegeGifts;
        if (!list.isEmpty()) {
            m155909i4(list);
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ C22421c m155906f4() {
        return qi20.m176654a(new pcj() { // from class: l.ft8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32248S()).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.gt8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f106389a.m155905e4((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public C22421c<MyMeetExtra> m155907g4() {
        return this.f133606V.asObservable();
    }

    /* JADX INFO: renamed from: h4 */
    public C22421c<List<NewGiftInfoPanelWrapper>> m155908h4() {
        return this.f133605U.asObservable();
    }

    /* JADX INFO: renamed from: i4 */
    public final void m155909i4(List<PrivilegeGift> list) {
        HashMap map = list == null ? new HashMap() : jyb.m147502d(list, new qcj() { // from class: l.lt8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((PrivilegeGift) obj).f21214id;
            }
        }, new qcj() { // from class: l.mt8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return lu8.m155869n3((PrivilegeGift) obj);
            }
        });
        if (map.equals(this.f133607W.m222761e())) {
            return;
        }
        this.f133607W.m137019l(map);
    }

    /* JADX INFO: renamed from: j4 */
    public C22421c<uxj0> m155910j4(String str) {
        return m155882H3(str, "open");
    }

    /* JADX INFO: renamed from: k4 */
    public C22421c<uxj0> m155911k4(final CoreSendGiftBody coreSendGiftBody) {
        PrivilegeGift privilegeGiftM155891Q3 = this.f91137Q.f20385f1.m155891Q3(coreSendGiftBody.giftID);
        if (NullChecker.m82486a(privilegeGiftM155891Q3) && privilegeGiftM155891Q3.remaining > 0) {
            coreSendGiftBody.extra.privilegeType = privilegeGiftM155891Q3.privilegeType.toString();
        }
        return this.f91137Q.scheduled("core-gift-send", -1, new pcj() { // from class: l.ht8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f111514a.m155902b4(coreSendGiftBody);
            }
        });
    }

    /* JADX INFO: renamed from: l4 */
    public void m155912l4() {
        this.f133608X.m203841a(1);
    }

    /* JADX INFO: renamed from: m4 */
    public void m155913m4() {
        this.f91137Q.scheduled("core-gift-resources", 0, new pcj() { // from class: l.au8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f73474a.m155904d4();
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public void m155914n4() {
        this.f91137Q.scheduled("privilege-gift-remaining", 0, new pcj() { // from class: l.pt8
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f153992a.m155906f4();
            }
        });
    }

    /* JADX INFO: renamed from: o4 */
    public void m155915o4() {
        this.f133608X.put(0);
    }

    /* JADX INFO: renamed from: p4 */
    public C22421c<uxj0> m155916p4(String str) {
        return m155882H3(str, "thank");
    }
}
