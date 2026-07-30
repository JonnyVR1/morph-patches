package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.data.LangModel;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftInteractRules;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItemShort;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftRule;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftTabEntrance;
import com.p046p1.mobile.putong.live.base.data.BLiveRoomTabGifts;
import com.p046p1.mobile.putong.live.base.data.BLiveTabGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class nmj {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ List m160091c(rwj rwjVar) {
        return !vwb.m200296J(rwjVar.f161338a) ? rwjVar.f161338a : new ArrayList();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m160094f(List list, BLiveTabGiftItem bLiveTabGiftItem, BLiveRoomTabGifts bLiveRoomTabGifts, BLiveGiftItemShort bLiveGiftItemShort) {
        BLiveGiftItem bLiveGiftItemM126026l = ((ggv) ypv.m215673l(fld0.f98148c)).m126026l(bLiveGiftItemShort.f44378id);
        if (m160114z(bLiveGiftItemShort, bLiveGiftItemM126026l) != null) {
            list.add(new ihs(bLiveGiftItemM126026l, bLiveTabGiftItem.tabName, bLiveRoomTabGifts.followStarResourceId, bLiveRoomTabGifts.chargeStarResourceId));
        }
    }

    /* JADX INFO: renamed from: j */
    public static hvj m160098j(BLiveRoomTabGifts bLiveRoomTabGifts, evj evjVar) {
        return new hvj(m160099k(bLiveRoomTabGifts, evjVar, false), m160099k(bLiveRoomTabGifts, evjVar, true), evjVar.m118269d());
    }

    /* JADX INFO: renamed from: k */
    public static jvj m160099k(final BLiveRoomTabGifts bLiveRoomTabGifts, evj evjVar, boolean z) {
        boolean z2 = z;
        List<BLiveTabGiftItem> giftTabs = bLiveRoomTabGifts.getGiftTabs(z2);
        int defaultTabId = bLiveRoomTabGifts.getDefaultTabId(z2);
        int size = giftTabs.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            final BLiveTabGiftItem bLiveTabGiftItem = giftTabs.get(i2);
            final ArrayList arrayList2 = new ArrayList();
            vwb.m200354z(bLiveTabGiftItem.entrances, new e30() { // from class: l.vlj
                @Override // p149l.e30
                public final void call(Object obj) {
                    BLiveTabGiftItem bLiveTabGiftItem2 = bLiveTabGiftItem;
                    BLiveRoomTabGifts bLiveRoomTabGifts2 = bLiveRoomTabGifts;
                    arrayList2.add(nmj.m160100l((BLiveGiftTabEntrance) obj, bLiveTabGiftItem2.tabName, bLiveRoomTabGifts2.followStarResourceId, bLiveRoomTabGifts2.chargeStarResourceId));
                }
            });
            vwb.m200354z(bLiveTabGiftItem.tabGiftItems, new e30() { // from class: l.xlj
                @Override // p149l.e30
                public final void call(Object obj) {
                    nmj.m160094f(arrayList2, bLiveTabGiftItem, bLiveRoomTabGifts, (BLiveGiftItemShort) obj);
                }
            });
            arrayList.add(new rwj(arrayList2, bLiveTabGiftItem.tabId, bLiveTabGiftItem.tabName, i, evjVar.m118267b(), bLiveTabGiftItem.tabEntrance, z2));
            i++;
            i2++;
            z2 = z;
        }
        return new jvj(arrayList, evjVar.m118269d(), defaultTabId, false);
    }

    /* JADX INFO: renamed from: l */
    public static ihs m160100l(BLiveGiftTabEntrance bLiveGiftTabEntrance, String str, String str2, String str3) {
        BLiveGiftItem bLiveGiftItemNew_ = BLiveGiftItem.new_();
        bLiveGiftItemNew_.giftSource = -4;
        bLiveGiftItemNew_.url = bLiveGiftTabEntrance.icon;
        bLiveGiftItemNew_.title = m160107s(bLiveGiftTabEntrance.name);
        bLiveGiftItemNew_.localSubtitle = m160112x(bLiveGiftTabEntrance.subTitle);
        bLiveGiftItemNew_.interactRules = m160109u(bLiveGiftTabEntrance);
        return new ihs(bLiveGiftItemNew_, str, str2, str3);
    }

    /* JADX INFO: renamed from: m */
    public static Date m160101m() {
        return new Date(qib0.f154693H.guessedCurrentServerTime());
    }

    /* JADX INFO: renamed from: n */
    public static int m160102n(List<oqj> list) {
        int iM200293G = vwb.m200293G(list, new w9j() { // from class: l.fmj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                oqj oqjVar = (oqj) obj;
                return Boolean.valueOf(((ihs) vwb.m200346r(oqjVar.f145162a, new w9j() { // from class: l.jmj
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals(String.valueOf(((ihs) obj2).m136283h().f44377id), oqjVar.m165460b()));
                    }
                })) != null);
            }
        });
        if (iM200293G == -1) {
            return 0;
        }
        return iM200293G;
    }

    /* JADX INFO: renamed from: o */
    public static int m160103o(List<rwj> list, final int i) {
        int iM200293G = vwb.m200293G(list, new w9j() { // from class: l.qlj
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

    /* JADX INFO: renamed from: p */
    public static int m160104p(jvj jvjVar) {
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

    /* JADX INFO: renamed from: q */
    public static ArrayList<ihs> m160105q(List<rwj> list) {
        return vwb.m200296J(list) ? new ArrayList<>() : vwb.m200351w(list, new w9j() { // from class: l.hmj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return nmj.m160091c((rwj) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static List<oqj> m160106r(rwj rwjVar) {
        ArrayList arrayList = new ArrayList();
        if (rwjVar != null && !vwb.m200296J(rwjVar.f161338a)) {
            List<ihs> listM160111w = m160111w(rwjVar.f161338a);
            int iCeil = (int) Math.ceil((listM160111w.size() * 1.0f) / 8.0f);
            for (int i = 0; i < iCeil; i++) {
                int i2 = i * 8;
                ArrayList arrayList2 = new ArrayList(listM160111w.subList(i2, Math.min(i2 + 8, listM160111w.size())));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((ihs) it.next()).m136301z(i);
                }
                arrayList.add(new oqj(arrayList2, rwjVar.m181396c()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public static String m160107s(String str) {
        LangModel langModelM160112x = m160112x(str);
        if (langModelM160112x == null) {
            return "";
        }
        String strLanguage = Network.language();
        return (strLanguage.startsWith("zh") && Network.LANGUAGE_ZH_HANT.equals(strLanguage)) ? langModelM160112x.zh_tw : langModelM160112x.getLocalName();
    }

    /* JADX INFO: renamed from: t */
    public static List<rwj> m160108t(List<rwj> list, final boolean z) {
        vwb.m200354z(list, new e30() { // from class: l.dmj
            @Override // p149l.e30
            public final void call(Object obj) {
                ((rwj) obj).f161341d = z;
            }
        });
        return list;
    }

    /* JADX INFO: renamed from: u */
    public static BLiveGiftInteractRules m160109u(BLiveGiftTabEntrance bLiveGiftTabEntrance) {
        BLiveGiftInteractRules bLiveGiftInteractRulesNew_ = BLiveGiftInteractRules.new_();
        BLiveGiftRule bLiveGiftRuleNew_ = BLiveGiftRule.new_();
        bLiveGiftRuleNew_.action = "JumpToScheme";
        bLiveGiftRuleNew_.scheme = bLiveGiftTabEntrance.jumpUrl;
        bLiveGiftInteractRulesNew_.click = bLiveGiftRuleNew_;
        return bLiveGiftInteractRulesNew_;
    }

    /* JADX INFO: renamed from: v */
    public static BLiveTraceServerData m160110v(BLiveGiftItem bLiveGiftItem, ihs ihsVar, int i) {
        return bLiveGiftItem.isPacketGift() ? BLiveTraceServerData.getNativeTabBarTraceServerData(ihsVar.m136284i(), -1, -1) : BLiveTraceServerData.getNativeTabBarTraceServerData(ihsVar.m136284i(), ihsVar.m136286k(), i);
    }

    /* JADX INFO: renamed from: w */
    public static List<ihs> m160111w(List<ihs> list) {
        final Date dateM160101m = m160101m();
        return vwb.m200339n(list, new w9j() { // from class: l.zlj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                ihs ihsVar = (ihs) obj;
                return Boolean.valueOf(ihsVar.m136283h().isNotPacketGift() || ihsVar.m136283h().isValidPacketGift(dateM160101m));
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public static LangModel m160112x(String str) {
        try {
            return LangModel.JSON_ADAPTER.parse(str);
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m160113y(List<rwj> list) {
        vwb.m200354z(m160105q(list), new e30() { // from class: l.bmj
            @Override // p149l.e30
            public final void call(Object obj) {
                ((ihs) obj).m136283h().needToPlayAnim = true;
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: z */
    public static BLiveGiftItem m160114z(BLiveGiftItemShort bLiveGiftItemShort, BLiveGiftItem bLiveGiftItem) {
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
            bLiveGiftItem.flyMicInfo = bLiveGiftItemShort.flyMicInfo;
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
            if (!TextUtils.isEmpty(bLiveGiftItem.liveResourceId) && aqe.m98261i().m98266h(bLiveGiftItem.liveResourceId) == null) {
                aqe.m98261i().m98280w(bLiveGiftItem.liveResourceId);
            }
        }
        return bLiveGiftItem2;
    }
}
