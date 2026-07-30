package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.data.LangModel;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveGiftInteractRules;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGiftItemCDN;
import com.p1.mobile.putong.live.base.data.BLiveGiftItemShort;
import com.p1.mobile.putong.live.base.data.BLiveGiftRule;
import com.p1.mobile.putong.live.base.data.BLiveGiftTabEntrance;
import com.p1.mobile.putong.live.base.data.BLiveGiftsFromCdnWarpData;
import com.p1.mobile.putong.live.base.data.BLiveLiveMedalCDN;
import com.p1.mobile.putong.live.base.data.BLiveMember;
import com.p1.mobile.putong.live.base.data.BLiveModelsFromCdnWarpData;
import com.p1.mobile.putong.live.base.data.BLiveRoomTabGifts;
import com.p1.mobile.putong.live.base.data.BLiveTabGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import l.e30;
import l.fld0;
import l.ggv;
import l.hxn0;
import l.i54;
import l.idv;
import l.mqv;
import l.nnn0;
import l.qib0;
import l.vwb;
import l.w8u;
import l.w9j;
import l.ypv;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mmj {
    /* JADX INFO: renamed from: A */
    public static ArrayList<ihs> m18040A(List<rwj> list) {
        return vwb.J(list) ? new ArrayList<>() : vwb.w(list, new w9j() { // from class: l.ylj
            public final Object call(Object obj) {
                return mmj.m18059d((rwj) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static List<nqj> m18041B(rwj rwjVar) {
        ArrayList arrayList = new ArrayList();
        if (rwjVar != null && !vwb.J(rwjVar.f18703a)) {
            List<ihs> listM18048I = m18048I(rwjVar.f18703a);
            int iCeil = (int) Math.ceil((listM18048I.size() * 1.0f) / 8.0f);
            for (int i = 0; i < iCeil; i++) {
                int i2 = i * 8;
                ArrayList arrayList2 = new ArrayList(listM18048I.subList(i2, Math.min(i2 + 8, listM18048I.size())));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((ihs) it.next()).m15178z(i);
                }
                arrayList.add(new nqj(arrayList2, rwjVar.m22140c()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: C */
    public static String m18042C(mlj mljVar) {
        if (mljVar.m18009i()) {
            return w8u.u(R$string.f3372jj, m18077v(mljVar.f15446e.b));
        }
        if (mljVar.m18006f()) {
            return w8u.v(R$string.f3416lj, new Object[]{Integer.valueOf(mljVar.f15447f.f17803d), " " + mljVar.f15446e.b});
        }
        if (mljVar.m18005e()) {
            return w8u.u(R$string.f3394kj, mljVar.f15446e.b);
        }
        boolean z = mljVar.f15444c;
        q44 q44Var = mljVar.f15447f;
        int i = z ? q44Var.f17803d + 1 : q44Var.f17803d;
        return w8u.v(R$string.f3416lj, new Object[]{Integer.valueOf(i), " " + mljVar.f15446e.b});
    }

    /* JADX INFO: renamed from: D */
    public static String m18043D(String str) {
        LangModel langModelM18050K = m18050K(str);
        if (langModelM18050K == null) {
            return "";
        }
        String strLanguage = Network.language();
        return (strLanguage.startsWith("zh") && "zh-Hant".equals(strLanguage)) ? langModelM18050K.zh_tw : langModelM18050K.getLocalName();
    }

    /* JADX INFO: renamed from: E */
    public static tae m18044E(ihs ihsVar, @Nullable List<rwj> list) {
        tae taeVar = new tae();
        ArrayList arrayList = new ArrayList();
        taeVar.f20146a = arrayList;
        if (!vwb.J(list)) {
            taeVar.f20147b = ihsVar;
            xae xaeVar = new xae();
            for (rwj rwjVar : list) {
                if (!vwb.J(rwjVar.f18703a)) {
                    for (ihs ihsVar2 : rwjVar.f18703a) {
                        BLiveGiftItem bLiveGiftItemM15160h = ihsVar2.m15160h();
                        if (bLiveGiftItemM15160h.isSupportDraw()) {
                            mae maeVar = new mae(bLiveGiftItemM15160h);
                            maeVar.f15296c = arrayList.size();
                            if (ihsVar2 == ihsVar) {
                                taeVar.f20148c = arrayList.size();
                                taeVar.f20149d = xaeVar.m25811f();
                                maeVar.f15295b = true;
                            }
                            xaeVar.m25810e(maeVar);
                            if (xaeVar.m25811f() == 4) {
                                xaeVar.f22194a = arrayList.size();
                                arrayList.add(xaeVar);
                                xaeVar = new xae();
                            }
                        }
                    }
                }
            }
            if (xaeVar.m25811f() > 0 && xaeVar.m25811f() != 4) {
                arrayList.add(xaeVar);
            }
        }
        return taeVar;
    }

    /* JADX INFO: renamed from: F */
    public static List<rwj> m18045F(List<rwj> list, final boolean z) {
        vwb.z(list, new e30() { // from class: l.amj
            public final void call(Object obj) {
                ((rwj) obj).f18706d = z;
            }
        });
        return list;
    }

    /* JADX INFO: renamed from: G */
    public static BLiveGiftInteractRules m18046G(BLiveGiftTabEntrance bLiveGiftTabEntrance) {
        BLiveGiftInteractRules bLiveGiftInteractRulesNew_ = BLiveGiftInteractRules.new_();
        BLiveGiftRule bLiveGiftRuleNew_ = BLiveGiftRule.new_();
        bLiveGiftRuleNew_.action = "JumpToScheme";
        bLiveGiftRuleNew_.scheme = bLiveGiftTabEntrance.jumpUrl;
        bLiveGiftInteractRulesNew_.click = bLiveGiftRuleNew_;
        return bLiveGiftInteractRulesNew_;
    }

    /* JADX INFO: renamed from: H */
    public static BLiveTraceServerData m18047H(BLiveGiftItem bLiveGiftItem, ihs ihsVar, int i) {
        return bLiveGiftItem.isPacketGift() ? BLiveTraceServerData.getNativeTabBarTraceServerData(ihsVar.m15161i(), -1, -1) : BLiveTraceServerData.getNativeTabBarTraceServerData(ihsVar.m15161i(), ihsVar.m15163k(), i);
    }

    /* JADX INFO: renamed from: I */
    public static List<ihs> m18048I(List<ihs> list) {
        final Date dateM18078w = m18078w();
        return vwb.n(list, new w9j() { // from class: l.cmj
            public final Object call(Object obj) {
                ihs ihsVar = (ihs) obj;
                return Boolean.valueOf(ihsVar.m15160h().isNotPacketGift() || ihsVar.m15160h().isValidPacketGift(dateM18078w));
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public static boolean m18049J(BLiveEnvelope bLiveEnvelope) {
        BLiveGiftItemCDN bLiveGiftItemCDN = bLiveEnvelope.data.giftItemCDN;
        return (bLiveGiftItemCDN == null || TextUtils.isEmpty(bLiveGiftItemCDN.giftItemsCDNUrl)) ? false : true;
    }

    /* JADX INFO: renamed from: K */
    public static LangModel m18050K(String str) {
        try {
            return (LangModel) LangModel.JSON_ADAPTER.parse(str);
        } catch (IOException e) {
            CrashHelper.c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m18051L(List<BLiveGiftItem> list, final e30<BLiveGiftItem> e30Var) {
        vwb.z(list, new e30() { // from class: l.kmj
            public final void call(Object obj) {
                mmj.m18062g(e30Var, (BLiveGiftItem) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public static ArrayList<mlj> m18052M(nnn0 nnn0Var, boolean z) {
        i54 i54Var;
        q44 q44VarM21020b;
        i54 i54VarN;
        List listQ = nnn0Var.P2().q();
        ArrayList<mlj> arrayList = new ArrayList<>();
        for (int i = 0; i < listQ.size(); i++) {
            BLiveVoiceCall bLiveVoiceCallL = nnn0Var.P2().l(((BLiveMember) listQ.get(i)).id);
            if (bLiveVoiceCallL == null) {
                if (TEnum.equals(((BLiveMember) listQ.get(i)).role, "anchor")) {
                    User userM14582l0 = nnn0Var.m14582l0();
                    String str = (z || (i54VarN = nnn0Var.P2().n(((DbObject) userM14582l0).id)) == null) ? userM14582l0.fp().profileSmall().formatted() : i54VarN.c;
                    i54Var = new i54(((DbObject) userM14582l0).id, userM14582l0.name, str);
                    q44VarM21020b = q44.m21020b("", "", 0);
                }
            } else {
                i54Var = new i54(bLiveVoiceCallL.user, bLiveVoiceCallL.userName, bLiveVoiceCallL.userPicture);
                q44VarM21020b = q44.m21020b(bLiveVoiceCallL.id, "", bLiveVoiceCallL.position);
            }
            final mlj mljVarM18003c = mlj.m18003c(i54Var, q44VarM21020b);
            mqv mqvVarM = nnn0Var.P2().m(((BLiveMember) listQ.get(i)).id);
            if (mqvVarM != null) {
                hxn0.c(mqvVarM).a(new e30() { // from class: l.tlj
                    public final void call(Object obj) {
                        mmj.m18060e(mljVarM18003c, (hxn0) obj);
                    }
                });
            }
            if (TEnum.equals(((BLiveMember) listQ.get(i)).role, "anchor")) {
                mljVarM18003c.f15448g = "voiceLiveMain";
                q44VarM21020b.f17801b = "gift-audience-none-voiceLiveMain";
            } else {
                mljVarM18003c.f15448g = "voiceLiveVice";
                q44VarM21020b.f17801b = "gift-audience-none-voiceLiveVice";
            }
            mljVarM18003c.f15447f = q44VarM21020b;
            mljVarM18003c.f15444c = true;
            arrayList.add(mljVarM18003c);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: N */
    public static ArrayList<mlj> m18053N(nnn0 nnn0Var) {
        if (nnn0Var.i3()) {
            return m18052M(nnn0Var, nnn0Var.f3());
        }
        ArrayList<mlj> arrayList = new ArrayList<>();
        List listS = nnn0Var.P2().s();
        if (!vwb.J(listS)) {
            for (int i = 0; i < listS.size(); i++) {
                BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) listS.get(i);
                i54 i54Var = new i54(bLiveVoiceCall.user, bLiveVoiceCall.userName, bLiveVoiceCall.userPicture);
                q44 q44VarM21020b = q44.m21020b(bLiveVoiceCall.id, "", bLiveVoiceCall.position);
                final mlj mljVarM18003c = mlj.m18003c(i54Var, q44VarM21020b);
                hxn0.c(nnn0Var.P2().m(bLiveVoiceCall.user)).a(new e30() { // from class: l.imj
                    public final void call(Object obj) {
                        mmj.m18058c(mljVarM18003c, (hxn0) obj);
                    }
                });
                if (TextUtils.equals(bLiveVoiceCall.user, ((DbObject) nnn0Var.m14582l0()).id)) {
                    mljVarM18003c.f15448g = "voiceLiveMain";
                    q44VarM21020b.f17801b = "gift-audience-none-voiceLiveMain";
                } else {
                    mljVarM18003c.f15448g = "voiceLiveVice";
                    q44VarM21020b.f17801b = "gift-audience-none-voiceLiveVice";
                }
                mljVarM18003c.f15447f = q44VarM21020b;
                mljVarM18003c.f15444c = true;
                arrayList.add(mljVarM18003c);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: O */
    public static void m18054O(List<rwj> list) {
        vwb.z(m18040A(list), new e30() { // from class: l.wlj
            public final void call(Object obj) {
                ((ihs) obj).m15160h().needToPlayAnim = true;
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: P */
    public static BLiveGiftItem m18055P(BLiveGiftItemShort bLiveGiftItemShort, BLiveGiftItem bLiveGiftItem, boolean z) {
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
                    bLiveGiftItem.localTag = (LangModel) LangModel.JSON_ADAPTER.parse(bLiveGiftItemShort.tag);
                } catch (IOException unused) {
                }
            }
            if (!TextUtils.isEmpty(bLiveGiftItemShort.rightTag)) {
                try {
                    bLiveGiftItem.localRightTag = (LangModel) LangModel.JSON_ADAPTER.parse(bLiveGiftItemShort.rightTag);
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
            User userI = ((idv) ypv.l(fld0.b)).i(ypv.a.D0());
            if (userI == null) {
                userI = ypv.a.V();
            }
            if (bLiveGiftItem.isValidGiftType() && userI.hierarchy.grade >= bLiveGiftItem.minWealthHierarchy) {
                bLiveGiftItem2 = bLiveGiftItem;
            }
            if (z && !TextUtils.isEmpty(bLiveGiftItem.liveResourceId) && aqe.m10039i().m10044h(bLiveGiftItem.liveResourceId) == null) {
                aqe.m10039i().m10058w(bLiveGiftItem.liveResourceId);
            }
        }
        return bLiveGiftItem2;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m18058c(mlj mljVar, hxn0 hxn0Var) {
        mljVar.f15442a = hxn0Var.c;
        mljVar.f15443b = hxn0Var.b;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ List m18059d(rwj rwjVar) {
        return !vwb.J(rwjVar.f18703a) ? rwjVar.f18703a : new ArrayList();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m18060e(mlj mljVar, hxn0 hxn0Var) {
        mljVar.f15442a = hxn0Var.c;
        mljVar.f15443b = hxn0Var.b;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m18062g(e30 e30Var, BLiveGiftItem bLiveGiftItem) {
        try {
            bLiveGiftItem.localName = (LangModel) LangModel.JSON_ADAPTER.parse(bLiveGiftItem.name);
            bLiveGiftItem.localTag = (LangModel) LangModel.JSON_ADAPTER.parse(bLiveGiftItem.tag);
            bLiveGiftItem.localRightTag = (LangModel) LangModel.JSON_ADAPTER.parse(bLiveGiftItem.rightTag);
            bLiveGiftItem.localSubtitle = (LangModel) LangModel.JSON_ADAPTER.parse(bLiveGiftItem.subtitle);
        } catch (IOException e) {
            CrashHelper.c(e);
        }
        e30Var.call(bLiveGiftItem);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m18063h(List list, BLiveTabGiftItem bLiveTabGiftItem, BLiveRoomTabGifts bLiveRoomTabGifts, BLiveGiftItemShort bLiveGiftItemShort) {
        BLiveGiftItem bLiveGiftItemL = ((ggv) ypv.l(fld0.c)).l(bLiveGiftItemShort.id);
        if (m18055P(bLiveGiftItemShort, bLiveGiftItemL, false) != null) {
            list.add(new ihs(bLiveGiftItemL, bLiveTabGiftItem.tabName, bLiveRoomTabGifts.followStarResourceId, bLiveRoomTabGifts.chargeStarResourceId));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static BLiveGiftItem m18069n(BLiveGiftItemShort bLiveGiftItemShort) {
        BLiveGiftItem bLiveGiftItemL = ((ggv) ypv.l(fld0.c)).l(bLiveGiftItemShort.id);
        if (bLiveGiftItemL == null) {
            return null;
        }
        return m18055P(bLiveGiftItemShort, bLiveGiftItemL, true);
    }

    /* JADX INFO: renamed from: o */
    public static hvj m18070o(BLiveRoomTabGifts bLiveRoomTabGifts, evj evjVar) {
        return new hvj(m18071p(bLiveRoomTabGifts, evjVar, false), m18071p(bLiveRoomTabGifts, evjVar, true), evjVar.m12709d());
    }

    /* JADX INFO: renamed from: p */
    public static jvj m18071p(final BLiveRoomTabGifts bLiveRoomTabGifts, evj evjVar, boolean z) {
        List giftTabs = bLiveRoomTabGifts.getGiftTabs(z);
        int defaultTabId = bLiveRoomTabGifts.getDefaultTabId(z);
        int size = giftTabs.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            final BLiveTabGiftItem bLiveTabGiftItem = (BLiveTabGiftItem) giftTabs.get(i2);
            final ArrayList arrayList2 = new ArrayList();
            vwb.z(bLiveTabGiftItem.entrances, new e30() { // from class: l.plj
                public final void call(Object obj) {
                    BLiveTabGiftItem bLiveTabGiftItem2 = bLiveTabGiftItem;
                    BLiveRoomTabGifts bLiveRoomTabGifts2 = bLiveRoomTabGifts;
                    arrayList2.add(mmj.m18074s((BLiveGiftTabEntrance) obj, bLiveTabGiftItem2.tabName, bLiveRoomTabGifts2.followStarResourceId, bLiveRoomTabGifts2.chargeStarResourceId));
                }
            });
            vwb.z(bLiveTabGiftItem.tabGiftItems, new e30() { // from class: l.ulj
                public final void call(Object obj) {
                    mmj.m18063h(arrayList2, bLiveTabGiftItem, bLiveRoomTabGifts, (BLiveGiftItemShort) obj);
                }
            });
            arrayList.add(new rwj(arrayList2, bLiveTabGiftItem.tabId, bLiveTabGiftItem.tabName, i, evjVar.m12707b(), bLiveTabGiftItem.tabEntrance, z));
            i++;
        }
        return new jvj(arrayList, evjVar.m12709d(), defaultTabId, z);
    }

    /* JADX INFO: renamed from: q */
    public static Boolean m18072q(BLiveGiftItemCDN bLiveGiftItemCDN, BLiveGiftsFromCdnWarpData bLiveGiftsFromCdnWarpData) {
        return Boolean.valueOf((bLiveGiftsFromCdnWarpData != null && bLiveGiftItemCDN.region.equals(bLiveGiftsFromCdnWarpData.serverRegion) && bLiveGiftItemCDN.version.equals(bLiveGiftsFromCdnWarpData.version)) ? false : true);
    }

    /* JADX INFO: renamed from: r */
    public static Boolean m18073r(BLiveLiveMedalCDN bLiveLiveMedalCDN, BLiveModelsFromCdnWarpData bLiveModelsFromCdnWarpData) {
        return Boolean.valueOf(bLiveModelsFromCdnWarpData == null || !bLiveLiveMedalCDN.version.equals(bLiveModelsFromCdnWarpData.version));
    }

    /* JADX INFO: renamed from: s */
    public static ihs m18074s(BLiveGiftTabEntrance bLiveGiftTabEntrance, String str, String str2, String str3) {
        BLiveGiftItem bLiveGiftItemNew_ = BLiveGiftItem.new_();
        bLiveGiftItemNew_.giftSource = -4;
        bLiveGiftItemNew_.url = bLiveGiftTabEntrance.icon;
        bLiveGiftItemNew_.title = m18043D(bLiveGiftTabEntrance.name);
        bLiveGiftItemNew_.localSubtitle = m18050K(bLiveGiftTabEntrance.subTitle);
        bLiveGiftItemNew_.interactRules = m18046G(bLiveGiftTabEntrance);
        return new ihs(bLiveGiftItemNew_, str, str2, str3);
    }

    /* JADX INFO: renamed from: t */
    public static BLiveGiftItem m18075t(List<rwj> list) {
        ihs ihsVar = (ihs) vwb.r(m18040A(list), new w9j() { // from class: l.slj
            public final Object call(Object obj) {
                return Boolean.valueOf(((ihs) obj).m15160h().fastGiftNum > 0);
            }
        });
        if (ihsVar == null) {
            return null;
        }
        return ihsVar.m15160h();
    }

    /* JADX INFO: renamed from: u */
    public static String m18076u(String str) {
        return TextUtils.equals(str, "voiceLiveAudience") ? "voiceLiveVice" : str;
    }

    /* JADX INFO: renamed from: v */
    public static String m18077v(String str) {
        return str.length() > 6 ? str.substring(0, 6).concat("...") : str;
    }

    /* JADX INFO: renamed from: w */
    public static Date m18078w() {
        return new Date(qib0.H.guessedCurrentServerTime());
    }

    /* JADX INFO: renamed from: x */
    public static int m18079x(List<nqj> list) {
        int iG = vwb.G(list, new w9j() { // from class: l.gmj
            public final Object call(Object obj) {
                nqj nqjVar = (nqj) obj;
                return Boolean.valueOf(((ihs) vwb.r(nqjVar.f16163a, new w9j() { // from class: l.rlj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals(String.valueOf(((ihs) obj2).m15160h().id), nqjVar.m18973b()));
                    }
                })) != null);
            }
        });
        if (iG == -1) {
            return 0;
        }
        return iG;
    }

    /* JADX INFO: renamed from: y */
    public static int m18080y(List<rwj> list, final int i) {
        int iG = vwb.G(list, new w9j() { // from class: l.emj
            public final Object call(Object obj) {
                return Boolean.valueOf(((rwj) obj).f18704b == i);
            }
        });
        if (iG == -1) {
            return 0;
        }
        return iG;
    }

    /* JADX INFO: renamed from: z */
    public static int m18081z(jvj jvjVar) {
        List<Integer> listM16345g = jvjVar.m16345g();
        if (vwb.J(listM16345g)) {
            return jvjVar.m16342d();
        }
        rwj rwjVar = null;
        for (Integer num : listM16345g) {
            for (rwj rwjVar2 : jvjVar.m16344f()) {
                if (num.intValue() == rwjVar2.f18704b) {
                    rwjVar = rwjVar2;
                    break;
                }
            }
            if (rwjVar != null) {
                break;
            }
        }
        return rwjVar == null ? jvjVar.m16342d() : rwjVar.f18704b;
    }
}
