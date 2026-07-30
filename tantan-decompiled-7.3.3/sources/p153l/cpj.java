package p153l;

import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.data.LangModel;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftInteractRules;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItemCDN;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItemShort;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftRule;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftTabEntrance;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftsFromCdnWarpData;
import com.p051p1.mobile.putong.live.base.data.BLiveLiveMedalCDN;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveModelsFromCdnWarpData;
import com.p051p1.mobile.putong.live.base.data.BLiveRoomTabGifts;
import com.p051p1.mobile.putong.live.base.data.BLiveTabGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class cpj {
    /* JADX INFO: renamed from: A */
    public static ArrayList<jjs> m111765A(List<hzj> list) {
        return jyb.m147479J(list) ? new ArrayList<>() : jyb.m147534w(list, new qcj() { // from class: l.ooj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return cpj.m111784d((hzj) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static List<dtj> m111766B(hzj hzjVar) {
        ArrayList arrayList = new ArrayList();
        if (hzjVar != null && !jyb.m147479J(hzjVar.f112248a)) {
            List<jjs> listM111773I = m111773I(hzjVar.f112248a);
            int iCeil = (int) Math.ceil((listM111773I.size() * 1.0f) / 8.0f);
            for (int i = 0; i < iCeil; i++) {
                int i2 = i * 8;
                ArrayList arrayList2 = new ArrayList(listM111773I.subList(i2, Math.min(i2 + 8, listM111773I.size())));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((jjs) it.next()).m145140z(i);
                }
                arrayList.add(new dtj(arrayList2, hzjVar.m137895c()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: C */
    public static String m111767C(coj cojVar) {
        if (cojVar.m111667i()) {
            return xau.m209911u(R$string.f48178jj, m111802v(cojVar.f82889e.f107998b));
        }
        if (cojVar.m111664f()) {
            return xau.m209912v(R$string.f48222lj, Integer.valueOf(cojVar.f82890f.f150595d), MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + cojVar.f82889e.f107998b);
        }
        if (cojVar.m111663e()) {
            return xau.m209911u(R$string.f48200kj, cojVar.f82889e.f107998b);
        }
        boolean z = cojVar.f82887c;
        p54 p54Var = cojVar.f82890f;
        int i = z ? p54Var.f150595d + 1 : p54Var.f150595d;
        return xau.m209912v(R$string.f48222lj, Integer.valueOf(i), MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + cojVar.f82889e.f107998b);
    }

    /* JADX INFO: renamed from: D */
    public static String m111768D(String str) {
        LangModel langModelM111775K = m111775K(str);
        if (langModelM111775K == null) {
            return "";
        }
        String strLanguage = Network.language();
        return (strLanguage.startsWith("zh") && Network.LANGUAGE_ZH_HANT.equals(strLanguage)) ? langModelM111775K.zh_tw : langModelM111775K.getLocalName();
    }

    /* JADX INFO: renamed from: E */
    public static xbe m111769E(jjs jjsVar, @Nullable List<hzj> list) {
        xbe xbeVar = new xbe();
        ArrayList arrayList = new ArrayList();
        xbeVar.f193152a = arrayList;
        if (!jyb.m147479J(list)) {
            xbeVar.f193153b = jjsVar;
            bce bceVar = new bce();
            for (hzj hzjVar : list) {
                if (!jyb.m147479J(hzjVar.f112248a)) {
                    for (jjs jjsVar2 : hzjVar.f112248a) {
                        BLiveGiftItem bLiveGiftItemM145122h = jjsVar2.m145122h();
                        if (bLiveGiftItemM145122h.isSupportDraw()) {
                            qbe qbeVar = new qbe(bLiveGiftItemM145122h);
                            qbeVar.f156470c = arrayList.size();
                            if (jjsVar2 == jjsVar) {
                                xbeVar.f193154c = arrayList.size();
                                xbeVar.f193155d = bceVar.m103500f();
                                qbeVar.f156469b = true;
                            }
                            bceVar.m103499e(qbeVar);
                            if (bceVar.m103500f() == 4) {
                                bceVar.f76133a = arrayList.size();
                                arrayList.add(bceVar);
                                bceVar = new bce();
                            }
                        }
                    }
                }
            }
            if (bceVar.m103500f() > 0 && bceVar.m103500f() != 4) {
                arrayList.add(bceVar);
            }
        }
        return xbeVar;
    }

    /* JADX INFO: renamed from: F */
    public static List<hzj> m111770F(List<hzj> list, final boolean z) {
        jyb.m147537z(list, new y20() { // from class: l.qoj
            @Override // p153l.y20
            public final void call(Object obj) {
                ((hzj) obj).f112251d = z;
            }
        });
        return list;
    }

    /* JADX INFO: renamed from: G */
    public static BLiveGiftInteractRules m111771G(BLiveGiftTabEntrance bLiveGiftTabEntrance) {
        BLiveGiftInteractRules bLiveGiftInteractRulesNew_ = BLiveGiftInteractRules.new_();
        BLiveGiftRule bLiveGiftRuleNew_ = BLiveGiftRule.new_();
        bLiveGiftRuleNew_.action = "JumpToScheme";
        bLiveGiftRuleNew_.scheme = bLiveGiftTabEntrance.jumpUrl;
        bLiveGiftInteractRulesNew_.click = bLiveGiftRuleNew_;
        return bLiveGiftInteractRulesNew_;
    }

    /* JADX INFO: renamed from: H */
    public static BLiveTraceServerData m111772H(BLiveGiftItem bLiveGiftItem, jjs jjsVar, int i) {
        return bLiveGiftItem.isPacketGift() ? BLiveTraceServerData.getNativeTabBarTraceServerData(jjsVar.m145123i(), -1, -1) : BLiveTraceServerData.getNativeTabBarTraceServerData(jjsVar.m145123i(), jjsVar.m145125k(), i);
    }

    /* JADX INFO: renamed from: I */
    public static List<jjs> m111773I(List<jjs> list) {
        final Date dateM111803w = m111803w();
        return jyb.m147522n(list, new qcj() { // from class: l.soj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                jjs jjsVar = (jjs) obj;
                return Boolean.valueOf(jjsVar.m145122h().isNotPacketGift() || jjsVar.m145122h().isValidPacketGift(dateM111803w));
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public static boolean m111774J(BLiveEnvelope bLiveEnvelope) {
        BLiveGiftItemCDN bLiveGiftItemCDN = bLiveEnvelope.data.giftItemCDN;
        return (bLiveGiftItemCDN == null || TextUtils.isEmpty(bLiveGiftItemCDN.giftItemsCDNUrl)) ? false : true;
    }

    /* JADX INFO: renamed from: K */
    public static LangModel m111775K(String str) {
        try {
            return LangModel.JSON_ADAPTER.parse(str);
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m111776L(List<BLiveGiftItem> list, final y20<BLiveGiftItem> y20Var) {
        jyb.m147537z(list, new y20() { // from class: l.apj
            @Override // p153l.y20
            public final void call(Object obj) {
                cpj.m111787g(y20Var, (BLiveGiftItem) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public static ArrayList<coj> m111777M(rwn0 rwn0Var, boolean z) {
        h64 h64Var;
        p54 p54VarM170592b;
        h64 h64VarM136875n;
        List<BLiveMember> listM136878q = rwn0Var.m183411P2().m136878q();
        ArrayList<coj> arrayList = new ArrayList<>();
        for (int i = 0; i < listM136878q.size(); i++) {
            BLiveVoiceCall bLiveVoiceCallM136873l = rwn0Var.m183411P2().m136873l(listM136878q.get(i).f45246id);
            if (bLiveVoiceCallM136873l == null) {
                if (TEnum.equals(listM136878q.get(i).role, "anchor")) {
                    User userM168532l0 = rwn0Var.m168532l0();
                    String str = (z || (h64VarM136875n = rwn0Var.m183411P2().m136875n(userM168532l0.f56859id)) == null) ? userM168532l0.m61308fp().profileSmall().formatted() : h64VarM136875n.f107999c;
                    h64Var = new h64(userM168532l0.f56859id, userM168532l0.name, str);
                    p54VarM170592b = p54.m170592b("", "", 0);
                }
            } else {
                h64Var = new h64(bLiveVoiceCallM136873l.user, bLiveVoiceCallM136873l.userName, bLiveVoiceCallM136873l.userPicture);
                p54VarM170592b = p54.m170592b(bLiveVoiceCallM136873l.f45333id, "", bLiveVoiceCallM136873l.position);
            }
            final coj cojVarM111661c = coj.m111661c(h64Var, p54VarM170592b);
            nsv<h64> nsvVarM136874m = rwn0Var.m183411P2().m136874m(listM136878q.get(i).f45246id);
            if (nsvVarM136874m != null) {
                l6o0.m153068c(nsvVarM136874m).m153069a(new y20() { // from class: l.joj
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        cpj.m111785e(cojVarM111661c, (l6o0) obj);
                    }
                });
            }
            if (TEnum.equals(listM136878q.get(i).role, "anchor")) {
                cojVarM111661c.f82891g = "voiceLiveMain";
                p54VarM170592b.f150593b = "gift-audience-none-voiceLiveMain";
            } else {
                cojVarM111661c.f82891g = "voiceLiveVice";
                p54VarM170592b.f150593b = "gift-audience-none-voiceLiveVice";
            }
            cojVarM111661c.f82890f = p54VarM170592b;
            cojVarM111661c.f82887c = true;
            arrayList.add(cojVarM111661c);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: N */
    public static ArrayList<coj> m111778N(rwn0 rwn0Var) {
        if (rwn0Var.m183434i3()) {
            return m111777M(rwn0Var, rwn0Var.m183430f3());
        }
        ArrayList<coj> arrayList = new ArrayList<>();
        List<BLiveVoiceCall> listM136880s = rwn0Var.m183411P2().m136880s();
        if (!jyb.m147479J(listM136880s)) {
            for (int i = 0; i < listM136880s.size(); i++) {
                BLiveVoiceCall bLiveVoiceCall = listM136880s.get(i);
                h64 h64Var = new h64(bLiveVoiceCall.user, bLiveVoiceCall.userName, bLiveVoiceCall.userPicture);
                p54 p54VarM170592b = p54.m170592b(bLiveVoiceCall.f45333id, "", bLiveVoiceCall.position);
                final coj cojVarM111661c = coj.m111661c(h64Var, p54VarM170592b);
                l6o0.m153068c(rwn0Var.m183411P2().m136874m(bLiveVoiceCall.user)).m153069a(new y20() { // from class: l.yoj
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        cpj.m111783c(cojVarM111661c, (l6o0) obj);
                    }
                });
                if (TextUtils.equals(bLiveVoiceCall.user, rwn0Var.m168532l0().f56859id)) {
                    cojVarM111661c.f82891g = "voiceLiveMain";
                    p54VarM170592b.f150593b = "gift-audience-none-voiceLiveMain";
                } else {
                    cojVarM111661c.f82891g = "voiceLiveVice";
                    p54VarM170592b.f150593b = "gift-audience-none-voiceLiveVice";
                }
                cojVarM111661c.f82890f = p54VarM170592b;
                cojVarM111661c.f82887c = true;
                arrayList.add(cojVarM111661c);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: O */
    public static void m111779O(List<hzj> list) {
        jyb.m147537z(m111765A(list), new y20() { // from class: l.moj
            @Override // p153l.y20
            public final void call(Object obj) {
                ((jjs) obj).m145122h().needToPlayAnim = true;
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: P */
    public static BLiveGiftItem m111780P(BLiveGiftItemShort bLiveGiftItemShort, BLiveGiftItem bLiveGiftItem, boolean z) {
        BLiveGiftItem bLiveGiftItem2 = null;
        if (bLiveGiftItem != null) {
            bLiveGiftItem.remain = bLiveGiftItemShort.remain;
            bLiveGiftItem.giftSource = bLiveGiftItemShort.giftSource;
            bLiveGiftItem.expiredTime = bLiveGiftItemShort.expiredTime;
            bLiveGiftItem.fastGiftNum = bLiveGiftItemShort.fastGiftNum;
            bLiveGiftItem.nextValidTime = bLiveGiftItemShort.nextValidTime;
            bLiveGiftItem.showOutside = bLiveGiftItemShort.showOutside;
            bLiveGiftItem.createdTime = bLiveGiftItemShort.createdTime;
            bLiveGiftItem.interactStatus = bLiveGiftItemShort.interactStatus;
            bLiveGiftItem.interactRules = bLiveGiftItemShort.interactRules;
            bLiveGiftItem.expiredTimeText = bLiveGiftItemShort.expiredTimeText;
            bLiveGiftItem.labels = bLiveGiftItemShort.labels;
            bLiveGiftItem.showAnimRules = bLiveGiftItemShort.showAnimRules;
            bLiveGiftItem.slotGiftInfo = bLiveGiftItemShort.slotGiftInfo;
            bLiveGiftItem.discounts = bLiveGiftItemShort.discounts;
            bLiveGiftItem.localRightTag = bLiveGiftItemShort.localRightTag;
            bLiveGiftItem.nameStatus = bLiveGiftItemShort.nameStatus;
            if (!TextUtils.isEmpty(bLiveGiftItemShort.tag)) {
                try {
                    bLiveGiftItem.localTag = LangModel.JSON_ADAPTER.parse(bLiveGiftItemShort.tag);
                } catch (IOException unused) {
                }
            }
            if (!TextUtils.isEmpty(bLiveGiftItemShort.rightTag)) {
                try {
                    bLiveGiftItem.localRightTag = LangModel.JSON_ADAPTER.parse(bLiveGiftItemShort.rightTag);
                } catch (IOException unused2) {
                }
            }
            if (!TextUtils.isEmpty(bLiveGiftItemShort.startTagColor)) {
                bLiveGiftItem.startTagColor = bLiveGiftItemShort.startTagColor;
            }
            if (!TextUtils.isEmpty(bLiveGiftItemShort.endTagColor)) {
                bLiveGiftItem.endTagColor = bLiveGiftItemShort.endTagColor;
            }
            if (!TextUtils.isEmpty(bLiveGiftItemShort.rightTag)) {
                bLiveGiftItem.rightTag = bLiveGiftItemShort.rightTag;
            }
            if (!TextUtils.isEmpty(bLiveGiftItemShort.startRightTagColor)) {
                bLiveGiftItem.startRightTagColor = bLiveGiftItemShort.startRightTagColor;
            }
            if (!TextUtils.isEmpty(bLiveGiftItemShort.endRightTagColor)) {
                bLiveGiftItem.endRightTagColor = bLiveGiftItemShort.endRightTagColor;
            }
            User userM144722i = ((jfv) zrv.m221194l(htd0.f111520b)).m144722i(zrv.f205799a.m207631D0());
            if (userM144722i == null) {
                userM144722i = zrv.f205799a.m207651V();
            }
            if (bLiveGiftItem.isValidGiftType() && userM144722i.hierarchy.grade >= bLiveGiftItem.minWealthHierarchy) {
                bLiveGiftItem2 = bLiveGiftItem;
            }
            if (z && !TextUtils.isEmpty(bLiveGiftItem.liveResourceId) && ere.m122146i().m122151h(bLiveGiftItem.liveResourceId) == null) {
                ere.m122146i().m122165w(bLiveGiftItem.liveResourceId);
            }
        }
        return bLiveGiftItem2;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m111783c(coj cojVar, l6o0 l6o0Var) {
        cojVar.f82885a = l6o0Var.f130276c;
        cojVar.f82886b = l6o0Var.f130275b;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ List m111784d(hzj hzjVar) {
        return !jyb.m147479J(hzjVar.f112248a) ? hzjVar.f112248a : new ArrayList();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m111785e(coj cojVar, l6o0 l6o0Var) {
        cojVar.f82885a = l6o0Var.f130276c;
        cojVar.f82886b = l6o0Var.f130275b;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m111787g(y20 y20Var, BLiveGiftItem bLiveGiftItem) {
        try {
            bLiveGiftItem.localName = LangModel.JSON_ADAPTER.parse(bLiveGiftItem.name);
            bLiveGiftItem.localTag = LangModel.JSON_ADAPTER.parse(bLiveGiftItem.tag);
            bLiveGiftItem.localRightTag = LangModel.JSON_ADAPTER.parse(bLiveGiftItem.rightTag);
            bLiveGiftItem.localSubtitle = LangModel.JSON_ADAPTER.parse(bLiveGiftItem.subtitle);
        } catch (IOException e) {
            CrashHelper.m82479c(e);
        }
        y20Var.call(bLiveGiftItem);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m111788h(List list, BLiveTabGiftItem bLiveTabGiftItem, BLiveRoomTabGifts bLiveRoomTabGifts, BLiveGiftItemShort bLiveGiftItemShort) {
        BLiveGiftItem bLiveGiftItemM135160l = ((hiv) zrv.m221194l(htd0.f111521c)).m135160l(bLiveGiftItemShort.f45226id);
        if (m111780P(bLiveGiftItemShort, bLiveGiftItemM135160l, false) != null) {
            list.add(new jjs(bLiveGiftItemM135160l, bLiveTabGiftItem.tabName, bLiveRoomTabGifts.followStarResourceId, bLiveRoomTabGifts.chargeStarResourceId));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static BLiveGiftItem m111794n(BLiveGiftItemShort bLiveGiftItemShort) {
        BLiveGiftItem bLiveGiftItemM135160l = ((hiv) zrv.m221194l(htd0.f111521c)).m135160l(bLiveGiftItemShort.f45226id);
        if (bLiveGiftItemM135160l == null) {
            return null;
        }
        return m111780P(bLiveGiftItemShort, bLiveGiftItemM135160l, true);
    }

    /* JADX INFO: renamed from: o */
    public static xxj m111795o(BLiveRoomTabGifts bLiveRoomTabGifts, uxj uxjVar) {
        return new xxj(m111796p(bLiveRoomTabGifts, uxjVar, false), m111796p(bLiveRoomTabGifts, uxjVar, true), uxjVar.m198486d());
    }

    /* JADX INFO: renamed from: p */
    public static zxj m111796p(final BLiveRoomTabGifts bLiveRoomTabGifts, uxj uxjVar, boolean z) {
        List<BLiveTabGiftItem> giftTabs = bLiveRoomTabGifts.getGiftTabs(z);
        int defaultTabId = bLiveRoomTabGifts.getDefaultTabId(z);
        int size = giftTabs.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            final BLiveTabGiftItem bLiveTabGiftItem = giftTabs.get(i2);
            final ArrayList arrayList2 = new ArrayList();
            jyb.m147537z(bLiveTabGiftItem.entrances, new y20() { // from class: l.foj
                @Override // p153l.y20
                public final void call(Object obj) {
                    BLiveTabGiftItem bLiveTabGiftItem2 = bLiveTabGiftItem;
                    BLiveRoomTabGifts bLiveRoomTabGifts2 = bLiveRoomTabGifts;
                    arrayList2.add(cpj.m111799s((BLiveGiftTabEntrance) obj, bLiveTabGiftItem2.tabName, bLiveRoomTabGifts2.followStarResourceId, bLiveRoomTabGifts2.chargeStarResourceId));
                }
            });
            jyb.m147537z(bLiveTabGiftItem.tabGiftItems, new y20() { // from class: l.koj
                @Override // p153l.y20
                public final void call(Object obj) {
                    cpj.m111788h(arrayList2, bLiveTabGiftItem, bLiveRoomTabGifts, (BLiveGiftItemShort) obj);
                }
            });
            arrayList.add(new hzj(arrayList2, bLiveTabGiftItem.tabId, bLiveTabGiftItem.tabName, i, uxjVar.m198484b(), bLiveTabGiftItem.tabEntrance, z));
            i++;
        }
        return new zxj(arrayList, uxjVar.m198486d(), defaultTabId, z);
    }

    /* JADX INFO: renamed from: q */
    public static Boolean m111797q(BLiveGiftItemCDN bLiveGiftItemCDN, BLiveGiftsFromCdnWarpData bLiveGiftsFromCdnWarpData) {
        return Boolean.valueOf((bLiveGiftsFromCdnWarpData != null && bLiveGiftItemCDN.region.equals(bLiveGiftsFromCdnWarpData.serverRegion) && bLiveGiftItemCDN.version.equals(bLiveGiftsFromCdnWarpData.version)) ? false : true);
    }

    /* JADX INFO: renamed from: r */
    public static Boolean m111798r(BLiveLiveMedalCDN bLiveLiveMedalCDN, BLiveModelsFromCdnWarpData bLiveModelsFromCdnWarpData) {
        return Boolean.valueOf(bLiveModelsFromCdnWarpData == null || !bLiveLiveMedalCDN.version.equals(bLiveModelsFromCdnWarpData.version));
    }

    /* JADX INFO: renamed from: s */
    public static jjs m111799s(BLiveGiftTabEntrance bLiveGiftTabEntrance, String str, String str2, String str3) {
        BLiveGiftItem bLiveGiftItemNew_ = BLiveGiftItem.new_();
        bLiveGiftItemNew_.giftSource = -4;
        bLiveGiftItemNew_.url = bLiveGiftTabEntrance.icon;
        bLiveGiftItemNew_.title = m111768D(bLiveGiftTabEntrance.name);
        bLiveGiftItemNew_.localSubtitle = m111775K(bLiveGiftTabEntrance.subTitle);
        bLiveGiftItemNew_.interactRules = m111771G(bLiveGiftTabEntrance);
        return new jjs(bLiveGiftItemNew_, str, str2, str3);
    }

    /* JADX INFO: renamed from: t */
    public static BLiveGiftItem m111800t(List<hzj> list) {
        jjs jjsVar = (jjs) jyb.m147529r(m111765A(list), new qcj() { // from class: l.ioj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((jjs) obj).m145122h().fastGiftNum > 0);
            }
        });
        if (jjsVar == null) {
            return null;
        }
        return jjsVar.m145122h();
    }

    /* JADX INFO: renamed from: u */
    public static String m111801u(String str) {
        return TextUtils.equals(str, "voiceLiveAudience") ? "voiceLiveVice" : str;
    }

    /* JADX INFO: renamed from: v */
    public static String m111802v(String str) {
        return str.length() > 6 ? str.substring(0, 6).concat("...") : str;
    }

    /* JADX INFO: renamed from: w */
    public static Date m111803w() {
        return new Date(uqb0.f180376H.guessedCurrentServerTime());
    }

    /* JADX INFO: renamed from: x */
    public static int m111804x(List<dtj> list) {
        int iM147476G = jyb.m147476G(list, new qcj() { // from class: l.woj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                dtj dtjVar = (dtj) obj;
                return Boolean.valueOf(((jjs) jyb.m147529r(dtjVar.f90600a, new qcj() { // from class: l.hoj
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals(String.valueOf(((jjs) obj2).m145122h().f45225id), dtjVar.m117880b()));
                    }
                })) != null);
            }
        });
        if (iM147476G == -1) {
            return 0;
        }
        return iM147476G;
    }

    /* JADX INFO: renamed from: y */
    public static int m111805y(List<hzj> list, final int i) {
        int iM147476G = jyb.m147476G(list, new qcj() { // from class: l.uoj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((hzj) obj).f112249b == i);
            }
        });
        if (iM147476G == -1) {
            return 0;
        }
        return iM147476G;
    }

    /* JADX INFO: renamed from: z */
    public static int m111806z(zxj zxjVar) {
        List<Integer> listM222000g = zxjVar.m222000g();
        if (jyb.m147479J(listM222000g)) {
            return zxjVar.m221997d();
        }
        hzj hzjVar = null;
        for (Integer num : listM222000g) {
            for (hzj hzjVar2 : zxjVar.m221999f()) {
                if (num.intValue() == hzjVar2.f112249b) {
                    hzjVar = hzjVar2;
                    break;
                }
            }
            if (hzjVar != null) {
                break;
            }
        }
        return hzjVar == null ? zxjVar.m221997d() : hzjVar.f112249b;
    }
}
