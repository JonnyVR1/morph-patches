package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.data.LangModel;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftInteractRules;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItemShort;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftRule;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftTabEntrance;
import com.p051p1.mobile.putong.live.base.data.BLiveRoomTabGifts;
import com.p051p1.mobile.putong.live.base.data.BLiveTabGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class dpj {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ List m117383c(hzj hzjVar) {
        return !jyb.m147479J(hzjVar.f112248a) ? hzjVar.f112248a : new ArrayList();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m117386f(List list, BLiveTabGiftItem bLiveTabGiftItem, BLiveRoomTabGifts bLiveRoomTabGifts, BLiveGiftItemShort bLiveGiftItemShort) {
        BLiveGiftItem bLiveGiftItemM135160l = ((hiv) zrv.m221194l(htd0.f111521c)).m135160l(bLiveGiftItemShort.f45226id);
        if (m117406z(bLiveGiftItemShort, bLiveGiftItemM135160l) != null) {
            list.add(new jjs(bLiveGiftItemM135160l, bLiveTabGiftItem.tabName, bLiveRoomTabGifts.followStarResourceId, bLiveRoomTabGifts.chargeStarResourceId));
        }
    }

    /* JADX INFO: renamed from: j */
    public static xxj m117390j(BLiveRoomTabGifts bLiveRoomTabGifts, uxj uxjVar) {
        return new xxj(m117391k(bLiveRoomTabGifts, uxjVar, false), m117391k(bLiveRoomTabGifts, uxjVar, true), uxjVar.m198486d());
    }

    /* JADX INFO: renamed from: k */
    public static zxj m117391k(final BLiveRoomTabGifts bLiveRoomTabGifts, uxj uxjVar, boolean z) {
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
            jyb.m147537z(bLiveTabGiftItem.entrances, new y20() { // from class: l.loj
                @Override // p153l.y20
                public final void call(Object obj) {
                    BLiveTabGiftItem bLiveTabGiftItem2 = bLiveTabGiftItem;
                    BLiveRoomTabGifts bLiveRoomTabGifts2 = bLiveRoomTabGifts;
                    arrayList2.add(dpj.m117392l((BLiveGiftTabEntrance) obj, bLiveTabGiftItem2.tabName, bLiveRoomTabGifts2.followStarResourceId, bLiveRoomTabGifts2.chargeStarResourceId));
                }
            });
            jyb.m147537z(bLiveTabGiftItem.tabGiftItems, new y20() { // from class: l.noj
                @Override // p153l.y20
                public final void call(Object obj) {
                    dpj.m117386f(arrayList2, bLiveTabGiftItem, bLiveRoomTabGifts, (BLiveGiftItemShort) obj);
                }
            });
            arrayList.add(new hzj(arrayList2, bLiveTabGiftItem.tabId, bLiveTabGiftItem.tabName, i, uxjVar.m198484b(), bLiveTabGiftItem.tabEntrance, z2));
            i++;
            i2++;
            z2 = z;
        }
        return new zxj(arrayList, uxjVar.m198486d(), defaultTabId, false);
    }

    /* JADX INFO: renamed from: l */
    public static jjs m117392l(BLiveGiftTabEntrance bLiveGiftTabEntrance, String str, String str2, String str3) {
        BLiveGiftItem bLiveGiftItemNew_ = BLiveGiftItem.new_();
        bLiveGiftItemNew_.giftSource = -4;
        bLiveGiftItemNew_.url = bLiveGiftTabEntrance.icon;
        bLiveGiftItemNew_.title = m117399s(bLiveGiftTabEntrance.name);
        bLiveGiftItemNew_.localSubtitle = m117404x(bLiveGiftTabEntrance.subTitle);
        bLiveGiftItemNew_.interactRules = m117401u(bLiveGiftTabEntrance);
        return new jjs(bLiveGiftItemNew_, str, str2, str3);
    }

    /* JADX INFO: renamed from: m */
    public static Date m117393m() {
        return new Date(uqb0.f180376H.guessedCurrentServerTime());
    }

    /* JADX INFO: renamed from: n */
    public static int m117394n(List<etj> list) {
        int iM147476G = jyb.m147476G(list, new qcj() { // from class: l.voj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                etj etjVar = (etj) obj;
                return Boolean.valueOf(((jjs) jyb.m147529r(etjVar.f95758a, new qcj() { // from class: l.zoj
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals(String.valueOf(((jjs) obj2).m145122h().f45225id), etjVar.m122460b()));
                    }
                })) != null);
            }
        });
        if (iM147476G == -1) {
            return 0;
        }
        return iM147476G;
    }

    /* JADX INFO: renamed from: o */
    public static int m117395o(List<hzj> list, final int i) {
        int iM147476G = jyb.m147476G(list, new qcj() { // from class: l.goj
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

    /* JADX INFO: renamed from: p */
    public static int m117396p(zxj zxjVar) {
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

    /* JADX INFO: renamed from: q */
    public static ArrayList<jjs> m117397q(List<hzj> list) {
        return jyb.m147479J(list) ? new ArrayList<>() : jyb.m147534w(list, new qcj() { // from class: l.xoj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return dpj.m117383c((hzj) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static List<etj> m117398r(hzj hzjVar) {
        ArrayList arrayList = new ArrayList();
        if (hzjVar != null && !jyb.m147479J(hzjVar.f112248a)) {
            List<jjs> listM117403w = m117403w(hzjVar.f112248a);
            int iCeil = (int) Math.ceil((listM117403w.size() * 1.0f) / 8.0f);
            for (int i = 0; i < iCeil; i++) {
                int i2 = i * 8;
                ArrayList arrayList2 = new ArrayList(listM117403w.subList(i2, Math.min(i2 + 8, listM117403w.size())));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((jjs) it.next()).m145140z(i);
                }
                arrayList.add(new etj(arrayList2, hzjVar.m137895c()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public static String m117399s(String str) {
        LangModel langModelM117404x = m117404x(str);
        if (langModelM117404x == null) {
            return "";
        }
        String strLanguage = Network.language();
        return (strLanguage.startsWith("zh") && Network.LANGUAGE_ZH_HANT.equals(strLanguage)) ? langModelM117404x.zh_tw : langModelM117404x.getLocalName();
    }

    /* JADX INFO: renamed from: t */
    public static List<hzj> m117400t(List<hzj> list, final boolean z) {
        jyb.m147537z(list, new y20() { // from class: l.toj
            @Override // p153l.y20
            public final void call(Object obj) {
                ((hzj) obj).f112251d = z;
            }
        });
        return list;
    }

    /* JADX INFO: renamed from: u */
    public static BLiveGiftInteractRules m117401u(BLiveGiftTabEntrance bLiveGiftTabEntrance) {
        BLiveGiftInteractRules bLiveGiftInteractRulesNew_ = BLiveGiftInteractRules.new_();
        BLiveGiftRule bLiveGiftRuleNew_ = BLiveGiftRule.new_();
        bLiveGiftRuleNew_.action = "JumpToScheme";
        bLiveGiftRuleNew_.scheme = bLiveGiftTabEntrance.jumpUrl;
        bLiveGiftInteractRulesNew_.click = bLiveGiftRuleNew_;
        return bLiveGiftInteractRulesNew_;
    }

    /* JADX INFO: renamed from: v */
    public static BLiveTraceServerData m117402v(BLiveGiftItem bLiveGiftItem, jjs jjsVar, int i) {
        return bLiveGiftItem.isPacketGift() ? BLiveTraceServerData.getNativeTabBarTraceServerData(jjsVar.m145123i(), -1, -1) : BLiveTraceServerData.getNativeTabBarTraceServerData(jjsVar.m145123i(), jjsVar.m145125k(), i);
    }

    /* JADX INFO: renamed from: w */
    public static List<jjs> m117403w(List<jjs> list) {
        final Date dateM117393m = m117393m();
        return jyb.m147522n(list, new qcj() { // from class: l.poj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                jjs jjsVar = (jjs) obj;
                return Boolean.valueOf(jjsVar.m145122h().isNotPacketGift() || jjsVar.m145122h().isValidPacketGift(dateM117393m));
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public static LangModel m117404x(String str) {
        try {
            return LangModel.JSON_ADAPTER.parse(str);
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m117405y(List<hzj> list) {
        jyb.m147537z(m117397q(list), new y20() { // from class: l.roj
            @Override // p153l.y20
            public final void call(Object obj) {
                ((jjs) obj).m145122h().needToPlayAnim = true;
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: z */
    public static BLiveGiftItem m117406z(BLiveGiftItemShort bLiveGiftItemShort, BLiveGiftItem bLiveGiftItem) {
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
            User userM144722i = ((jfv) zrv.m221194l(htd0.f111520b)).m144722i(zrv.f205799a.m207631D0());
            if (userM144722i == null) {
                userM144722i = zrv.f205799a.m207651V();
            }
            if (bLiveGiftItem.isValidGiftType() && userM144722i.hierarchy.grade >= bLiveGiftItem.minWealthHierarchy) {
                bLiveGiftItem2 = bLiveGiftItem;
            }
            if (!TextUtils.isEmpty(bLiveGiftItem.liveResourceId) && ere.m122146i().m122151h(bLiveGiftItem.liveResourceId) == null) {
                ere.m122146i().m122165w(bLiveGiftItem.liveResourceId);
            }
        }
        return bLiveGiftItem2;
    }
}
