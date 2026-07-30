package p149l;

import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.data.LangModel;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftInteractRules;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItemCDN;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItemShort;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftRule;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftTabEntrance;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftsFromCdnWarpData;
import com.p046p1.mobile.putong.live.base.data.BLiveLiveMedalCDN;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveModelsFromCdnWarpData;
import com.p046p1.mobile.putong.live.base.data.BLiveRoomTabGifts;
import com.p046p1.mobile.putong.live.base.data.BLiveTabGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class mmj {
    /* JADX INFO: renamed from: A */
    public static ArrayList<ihs> m155398A(List<rwj> list) {
        return vwb.m200296J(list) ? new ArrayList<>() : vwb.m200351w(list, new w9j() { // from class: l.ylj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return mmj.m155417d((rwj) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static List<nqj> m155399B(rwj rwjVar) {
        ArrayList arrayList = new ArrayList();
        if (rwjVar != null && !vwb.m200296J(rwjVar.f161338a)) {
            List<ihs> listM155406I = m155406I(rwjVar.f161338a);
            int iCeil = (int) Math.ceil((listM155406I.size() * 1.0f) / 8.0f);
            for (int i = 0; i < iCeil; i++) {
                int i2 = i * 8;
                ArrayList arrayList2 = new ArrayList(listM155406I.subList(i2, Math.min(i2 + 8, listM155406I.size())));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((ihs) it.next()).m136301z(i);
                }
                arrayList.add(new nqj(arrayList2, rwjVar.m181396c()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: C */
    public static String m155400C(mlj mljVar) {
        if (mljVar.m155160i()) {
            return w8u.m202218u(R$string.f47330jj, m155435v(mljVar.f134444e.f111521b));
        }
        if (mljVar.m155157f()) {
            return w8u.m202219v(R$string.f47374lj, Integer.valueOf(mljVar.f134445f.f152540d), MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + mljVar.f134444e.f111521b);
        }
        if (mljVar.m155156e()) {
            return w8u.m202218u(R$string.f47352kj, mljVar.f134444e.f111521b);
        }
        boolean z = mljVar.f134442c;
        q44 q44Var = mljVar.f134445f;
        int i = z ? q44Var.f152540d + 1 : q44Var.f152540d;
        return w8u.m202219v(R$string.f47374lj, Integer.valueOf(i), MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + mljVar.f134444e.f111521b);
    }

    /* JADX INFO: renamed from: D */
    public static String m155401D(String str) {
        LangModel langModelM155408K = m155408K(str);
        if (langModelM155408K == null) {
            return "";
        }
        String strLanguage = Network.language();
        return (strLanguage.startsWith("zh") && Network.LANGUAGE_ZH_HANT.equals(strLanguage)) ? langModelM155408K.zh_tw : langModelM155408K.getLocalName();
    }

    /* JADX INFO: renamed from: E */
    public static tae m155402E(ihs ihsVar, @Nullable List<rwj> list) {
        tae taeVar = new tae();
        ArrayList arrayList = new ArrayList();
        taeVar.f169109a = arrayList;
        if (!vwb.m200296J(list)) {
            taeVar.f169110b = ihsVar;
            xae xaeVar = new xae();
            for (rwj rwjVar : list) {
                if (!vwb.m200296J(rwjVar.f161338a)) {
                    for (ihs ihsVar2 : rwjVar.f161338a) {
                        BLiveGiftItem bLiveGiftItemM136283h = ihsVar2.m136283h();
                        if (bLiveGiftItemM136283h.isSupportDraw()) {
                            mae maeVar = new mae(bLiveGiftItemM136283h);
                            maeVar.f132845c = arrayList.size();
                            if (ihsVar2 == ihsVar) {
                                taeVar.f169111c = arrayList.size();
                                taeVar.f169112d = xaeVar.m207567f();
                                maeVar.f132844b = true;
                            }
                            xaeVar.m207566e(maeVar);
                            if (xaeVar.m207567f() == 4) {
                                xaeVar.f191728a = arrayList.size();
                                arrayList.add(xaeVar);
                                xaeVar = new xae();
                            }
                        }
                    }
                }
            }
            if (xaeVar.m207567f() > 0 && xaeVar.m207567f() != 4) {
                arrayList.add(xaeVar);
            }
        }
        return taeVar;
    }

    /* JADX INFO: renamed from: F */
    public static List<rwj> m155403F(List<rwj> list, final boolean z) {
        vwb.m200354z(list, new e30() { // from class: l.amj
            @Override // p149l.e30
            public final void call(Object obj) {
                ((rwj) obj).f161341d = z;
            }
        });
        return list;
    }

    /* JADX INFO: renamed from: G */
    public static BLiveGiftInteractRules m155404G(BLiveGiftTabEntrance bLiveGiftTabEntrance) {
        BLiveGiftInteractRules bLiveGiftInteractRulesNew_ = BLiveGiftInteractRules.new_();
        BLiveGiftRule bLiveGiftRuleNew_ = BLiveGiftRule.new_();
        bLiveGiftRuleNew_.action = "JumpToScheme";
        bLiveGiftRuleNew_.scheme = bLiveGiftTabEntrance.jumpUrl;
        bLiveGiftInteractRulesNew_.click = bLiveGiftRuleNew_;
        return bLiveGiftInteractRulesNew_;
    }

    /* JADX INFO: renamed from: H */
    public static BLiveTraceServerData m155405H(BLiveGiftItem bLiveGiftItem, ihs ihsVar, int i) {
        return bLiveGiftItem.isPacketGift() ? BLiveTraceServerData.getNativeTabBarTraceServerData(ihsVar.m136284i(), -1, -1) : BLiveTraceServerData.getNativeTabBarTraceServerData(ihsVar.m136284i(), ihsVar.m136286k(), i);
    }

    /* JADX INFO: renamed from: I */
    public static List<ihs> m155406I(List<ihs> list) {
        final Date dateM155436w = m155436w();
        return vwb.m200339n(list, new w9j() { // from class: l.cmj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                ihs ihsVar = (ihs) obj;
                return Boolean.valueOf(ihsVar.m136283h().isNotPacketGift() || ihsVar.m136283h().isValidPacketGift(dateM155436w));
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public static boolean m155407J(BLiveEnvelope bLiveEnvelope) {
        BLiveGiftItemCDN bLiveGiftItemCDN = bLiveEnvelope.data.giftItemCDN;
        return (bLiveGiftItemCDN == null || TextUtils.isEmpty(bLiveGiftItemCDN.giftItemsCDNUrl)) ? false : true;
    }

    /* JADX INFO: renamed from: K */
    public static LangModel m155408K(String str) {
        try {
            return LangModel.JSON_ADAPTER.parse(str);
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m155409L(List<BLiveGiftItem> list, final e30<BLiveGiftItem> e30Var) {
        vwb.m200354z(list, new e30() { // from class: l.kmj
            @Override // p149l.e30
            public final void call(Object obj) {
                mmj.m155420g(e30Var, (BLiveGiftItem) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public static ArrayList<mlj> m155410M(nnn0 nnn0Var, boolean z) {
        i54 i54Var;
        q44 q44VarM172922b;
        i54 i54VarM102065n;
        List<BLiveMember> listM102068q = nnn0Var.m160249P2().m102068q();
        ArrayList<mlj> arrayList = new ArrayList<>();
        for (int i = 0; i < listM102068q.size(); i++) {
            BLiveVoiceCall bLiveVoiceCallM102063l = nnn0Var.m160249P2().m102063l(listM102068q.get(i).f44398id);
            if (bLiveVoiceCallM102063l == null) {
                if (TEnum.equals(listM102068q.get(i).role, "anchor")) {
                    User userM132146l0 = nnn0Var.m132146l0();
                    String str = (z || (i54VarM102065n = nnn0Var.m160249P2().m102065n(userM132146l0.f56011id)) == null) ? userM132146l0.m60124fp().profileSmall().formatted() : i54VarM102065n.f111522c;
                    i54Var = new i54(userM132146l0.f56011id, userM132146l0.name, str);
                    q44VarM172922b = q44.m172922b("", "", 0);
                }
            } else {
                i54Var = new i54(bLiveVoiceCallM102063l.user, bLiveVoiceCallM102063l.userName, bLiveVoiceCallM102063l.userPicture);
                q44VarM172922b = q44.m172922b(bLiveVoiceCallM102063l.f44485id, "", bLiveVoiceCallM102063l.position);
            }
            final mlj mljVarM155154c = mlj.m155154c(i54Var, q44VarM172922b);
            mqv<i54> mqvVarM102064m = nnn0Var.m160249P2().m102064m(listM102068q.get(i).f44398id);
            if (mqvVarM102064m != null) {
                hxn0.m133350c(mqvVarM102064m).m133351a(new e30() { // from class: l.tlj
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        mmj.m155418e(mljVarM155154c, (hxn0) obj);
                    }
                });
            }
            if (TEnum.equals(listM102068q.get(i).role, "anchor")) {
                mljVarM155154c.f134446g = "voiceLiveMain";
                q44VarM172922b.f152538b = "gift-audience-none-voiceLiveMain";
            } else {
                mljVarM155154c.f134446g = "voiceLiveVice";
                q44VarM172922b.f152538b = "gift-audience-none-voiceLiveVice";
            }
            mljVarM155154c.f134445f = q44VarM172922b;
            mljVarM155154c.f134442c = true;
            arrayList.add(mljVarM155154c);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: N */
    public static ArrayList<mlj> m155411N(nnn0 nnn0Var) {
        if (nnn0Var.m160271i3()) {
            return m155410M(nnn0Var, nnn0Var.m160268f3());
        }
        ArrayList<mlj> arrayList = new ArrayList<>();
        List<BLiveVoiceCall> listM102070s = nnn0Var.m160249P2().m102070s();
        if (!vwb.m200296J(listM102070s)) {
            for (int i = 0; i < listM102070s.size(); i++) {
                BLiveVoiceCall bLiveVoiceCall = listM102070s.get(i);
                i54 i54Var = new i54(bLiveVoiceCall.user, bLiveVoiceCall.userName, bLiveVoiceCall.userPicture);
                q44 q44VarM172922b = q44.m172922b(bLiveVoiceCall.f44485id, "", bLiveVoiceCall.position);
                final mlj mljVarM155154c = mlj.m155154c(i54Var, q44VarM172922b);
                hxn0.m133350c(nnn0Var.m160249P2().m102064m(bLiveVoiceCall.user)).m133351a(new e30() { // from class: l.imj
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        mmj.m155416c(mljVarM155154c, (hxn0) obj);
                    }
                });
                if (TextUtils.equals(bLiveVoiceCall.user, nnn0Var.m132146l0().f56011id)) {
                    mljVarM155154c.f134446g = "voiceLiveMain";
                    q44VarM172922b.f152538b = "gift-audience-none-voiceLiveMain";
                } else {
                    mljVarM155154c.f134446g = "voiceLiveVice";
                    q44VarM172922b.f152538b = "gift-audience-none-voiceLiveVice";
                }
                mljVarM155154c.f134445f = q44VarM172922b;
                mljVarM155154c.f134442c = true;
                arrayList.add(mljVarM155154c);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: O */
    public static void m155412O(List<rwj> list) {
        vwb.m200354z(m155398A(list), new e30() { // from class: l.wlj
            @Override // p149l.e30
            public final void call(Object obj) {
                ((ihs) obj).m136283h().needToPlayAnim = true;
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: P */
    public static BLiveGiftItem m155413P(BLiveGiftItemShort bLiveGiftItemShort, BLiveGiftItem bLiveGiftItem, boolean z) {
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
            User userM135637i = ((idv) ypv.m215673l(fld0.f98147b)).m135637i(ypv.f199493a.m199309D0());
            if (userM135637i == null) {
                userM135637i = ypv.f199493a.m199329V();
            }
            if (bLiveGiftItem.isValidGiftType() && userM135637i.hierarchy.grade >= bLiveGiftItem.minWealthHierarchy) {
                bLiveGiftItem2 = bLiveGiftItem;
            }
            if (z && !TextUtils.isEmpty(bLiveGiftItem.liveResourceId) && aqe.m98261i().m98266h(bLiveGiftItem.liveResourceId) == null) {
                aqe.m98261i().m98280w(bLiveGiftItem.liveResourceId);
            }
        }
        return bLiveGiftItem2;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m155416c(mlj mljVar, hxn0 hxn0Var) {
        mljVar.f134440a = hxn0Var.f109897c;
        mljVar.f134441b = hxn0Var.f109896b;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ List m155417d(rwj rwjVar) {
        return !vwb.m200296J(rwjVar.f161338a) ? rwjVar.f161338a : new ArrayList();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m155418e(mlj mljVar, hxn0 hxn0Var) {
        mljVar.f134440a = hxn0Var.f109897c;
        mljVar.f134441b = hxn0Var.f109896b;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m155420g(e30 e30Var, BLiveGiftItem bLiveGiftItem) {
        try {
            bLiveGiftItem.localName = LangModel.JSON_ADAPTER.parse(bLiveGiftItem.name);
            bLiveGiftItem.localTag = LangModel.JSON_ADAPTER.parse(bLiveGiftItem.tag);
            bLiveGiftItem.localRightTag = LangModel.JSON_ADAPTER.parse(bLiveGiftItem.rightTag);
            bLiveGiftItem.localSubtitle = LangModel.JSON_ADAPTER.parse(bLiveGiftItem.subtitle);
        } catch (IOException e) {
            CrashHelper.m81296c(e);
        }
        e30Var.call(bLiveGiftItem);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m155421h(List list, BLiveTabGiftItem bLiveTabGiftItem, BLiveRoomTabGifts bLiveRoomTabGifts, BLiveGiftItemShort bLiveGiftItemShort) {
        BLiveGiftItem bLiveGiftItemM126026l = ((ggv) ypv.m215673l(fld0.f98148c)).m126026l(bLiveGiftItemShort.f44378id);
        if (m155413P(bLiveGiftItemShort, bLiveGiftItemM126026l, false) != null) {
            list.add(new ihs(bLiveGiftItemM126026l, bLiveTabGiftItem.tabName, bLiveRoomTabGifts.followStarResourceId, bLiveRoomTabGifts.chargeStarResourceId));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static BLiveGiftItem m155427n(BLiveGiftItemShort bLiveGiftItemShort) {
        BLiveGiftItem bLiveGiftItemM126026l = ((ggv) ypv.m215673l(fld0.f98148c)).m126026l(bLiveGiftItemShort.f44378id);
        if (bLiveGiftItemM126026l == null) {
            return null;
        }
        return m155413P(bLiveGiftItemShort, bLiveGiftItemM126026l, true);
    }

    /* JADX INFO: renamed from: o */
    public static hvj m155428o(BLiveRoomTabGifts bLiveRoomTabGifts, evj evjVar) {
        return new hvj(m155429p(bLiveRoomTabGifts, evjVar, false), m155429p(bLiveRoomTabGifts, evjVar, true), evjVar.m118269d());
    }

    /* JADX INFO: renamed from: p */
    public static jvj m155429p(final BLiveRoomTabGifts bLiveRoomTabGifts, evj evjVar, boolean z) {
        List<BLiveTabGiftItem> giftTabs = bLiveRoomTabGifts.getGiftTabs(z);
        int defaultTabId = bLiveRoomTabGifts.getDefaultTabId(z);
        int size = giftTabs.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            final BLiveTabGiftItem bLiveTabGiftItem = giftTabs.get(i2);
            final ArrayList arrayList2 = new ArrayList();
            vwb.m200354z(bLiveTabGiftItem.entrances, new e30() { // from class: l.plj
                @Override // p149l.e30
                public final void call(Object obj) {
                    BLiveTabGiftItem bLiveTabGiftItem2 = bLiveTabGiftItem;
                    BLiveRoomTabGifts bLiveRoomTabGifts2 = bLiveRoomTabGifts;
                    arrayList2.add(mmj.m155432s((BLiveGiftTabEntrance) obj, bLiveTabGiftItem2.tabName, bLiveRoomTabGifts2.followStarResourceId, bLiveRoomTabGifts2.chargeStarResourceId));
                }
            });
            vwb.m200354z(bLiveTabGiftItem.tabGiftItems, new e30() { // from class: l.ulj
                @Override // p149l.e30
                public final void call(Object obj) {
                    mmj.m155421h(arrayList2, bLiveTabGiftItem, bLiveRoomTabGifts, (BLiveGiftItemShort) obj);
                }
            });
            arrayList.add(new rwj(arrayList2, bLiveTabGiftItem.tabId, bLiveTabGiftItem.tabName, i, evjVar.m118267b(), bLiveTabGiftItem.tabEntrance, z));
            i++;
        }
        return new jvj(arrayList, evjVar.m118269d(), defaultTabId, z);
    }

    /* JADX INFO: renamed from: q */
    public static Boolean m155430q(BLiveGiftItemCDN bLiveGiftItemCDN, BLiveGiftsFromCdnWarpData bLiveGiftsFromCdnWarpData) {
        return Boolean.valueOf((bLiveGiftsFromCdnWarpData != null && bLiveGiftItemCDN.region.equals(bLiveGiftsFromCdnWarpData.serverRegion) && bLiveGiftItemCDN.version.equals(bLiveGiftsFromCdnWarpData.version)) ? false : true);
    }

    /* JADX INFO: renamed from: r */
    public static Boolean m155431r(BLiveLiveMedalCDN bLiveLiveMedalCDN, BLiveModelsFromCdnWarpData bLiveModelsFromCdnWarpData) {
        return Boolean.valueOf(bLiveModelsFromCdnWarpData == null || !bLiveLiveMedalCDN.version.equals(bLiveModelsFromCdnWarpData.version));
    }

    /* JADX INFO: renamed from: s */
    public static ihs m155432s(BLiveGiftTabEntrance bLiveGiftTabEntrance, String str, String str2, String str3) {
        BLiveGiftItem bLiveGiftItemNew_ = BLiveGiftItem.new_();
        bLiveGiftItemNew_.giftSource = -4;
        bLiveGiftItemNew_.url = bLiveGiftTabEntrance.icon;
        bLiveGiftItemNew_.title = m155401D(bLiveGiftTabEntrance.name);
        bLiveGiftItemNew_.localSubtitle = m155408K(bLiveGiftTabEntrance.subTitle);
        bLiveGiftItemNew_.interactRules = m155404G(bLiveGiftTabEntrance);
        return new ihs(bLiveGiftItemNew_, str, str2, str3);
    }

    /* JADX INFO: renamed from: t */
    public static BLiveGiftItem m155433t(List<rwj> list) {
        ihs ihsVar = (ihs) vwb.m200346r(m155398A(list), new w9j() { // from class: l.slj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((ihs) obj).m136283h().fastGiftNum > 0);
            }
        });
        if (ihsVar == null) {
            return null;
        }
        return ihsVar.m136283h();
    }

    /* JADX INFO: renamed from: u */
    public static String m155434u(String str) {
        return TextUtils.equals(str, "voiceLiveAudience") ? "voiceLiveVice" : str;
    }

    /* JADX INFO: renamed from: v */
    public static String m155435v(String str) {
        return str.length() > 6 ? str.substring(0, 6).concat("...") : str;
    }

    /* JADX INFO: renamed from: w */
    public static Date m155436w() {
        return new Date(qib0.f154693H.guessedCurrentServerTime());
    }

    /* JADX INFO: renamed from: x */
    public static int m155437x(List<nqj> list) {
        int iM200293G = vwb.m200293G(list, new w9j() { // from class: l.gmj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                nqj nqjVar = (nqj) obj;
                return Boolean.valueOf(((ihs) vwb.m200346r(nqjVar.f140073a, new w9j() { // from class: l.rlj
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals(String.valueOf(((ihs) obj2).m136283h().f44377id), nqjVar.m160623b()));
                    }
                })) != null);
            }
        });
        if (iM200293G == -1) {
            return 0;
        }
        return iM200293G;
    }

    /* JADX INFO: renamed from: y */
    public static int m155438y(List<rwj> list, final int i) {
        int iM200293G = vwb.m200293G(list, new w9j() { // from class: l.emj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((rwj) obj).f161339b == i);
            }
        });
        if (iM200293G == -1) {
            return 0;
        }
        return iM200293G;
    }

    /* JADX INFO: renamed from: z */
    public static int m155439z(jvj jvjVar) {
        List<Integer> listM143510g = jvjVar.m143510g();
        if (vwb.m200296J(listM143510g)) {
            return jvjVar.m143507d();
        }
        rwj rwjVar = null;
        for (Integer num : listM143510g) {
            for (rwj rwjVar2 : jvjVar.m143509f()) {
                if (num.intValue() == rwjVar2.f161339b) {
                    rwjVar = rwjVar2;
                    break;
                }
            }
            if (rwjVar != null) {
                break;
            }
        }
        return rwjVar == null ? jvjVar.m143507d() : rwjVar.f161339b;
    }
}
