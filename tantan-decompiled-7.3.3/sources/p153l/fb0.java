package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.data.OMSAdCardInfo;
import com.p051p1.mobile.putong.data.OmsTagUserCounts;
import com.p051p1.mobile.putong.data.Position;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class fb0 {

    /* JADX INFO: renamed from: a */
    public static HashMap<CoreSuggested.UserInfo, pf60<Integer, Long>> f98027a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public static HashMap<CoreSuggested.UserInfo, Integer> f98028b = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public static void m124802a(List<CoreSuggested.UserInfo> list) {
        if (f98028b.size() > 0) {
            boolean z = false;
            for (int i = 0; i < list.size(); i++) {
                CoreSuggested.UserInfo userInfo = list.get(i);
                if (userInfo != null && userInfo.virtualCardType == VirtualCardType.AdCard) {
                    Object obj = userInfo.extensionObject;
                    if (NullChecker.m82486a(obj) && (obj instanceof OMSAdCardInfo)) {
                        z = true;
                    }
                }
            }
            if (z) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<CoreSuggested.UserInfo, Integer> entry : f98028b.entrySet()) {
                arrayList.add(new pf60(entry.getKey(), entry.getValue()));
            }
            if (arrayList.size() > 0) {
                CoreModule.f18264c.f20405m0.m32165y6(arrayList);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d2  */
    /* JADX INFO: renamed from: b */
    public static void m124803b() {
        C4883c c4883c = CoreModule.f18264c;
        CoreSuggested coreSuggested = c4883c.f20405m0;
        if (coreSuggested.f20117T1) {
            return;
        }
        coreSuggested.f20117T1 = true;
        Long l2 = c4883c.f20364Y0.f161167i.get();
        l2.longValue();
        List<OMSAdCardInfo> listM172576h = pk50.m172568j().m172576h();
        if (jyb.m147479J(listM172576h)) {
            return;
        }
        for (int i = 0; i < listM172576h.size(); i++) {
            OMSAdCardInfo oMSAdCardInfo = listM172576h.get(i);
            if (oMSAdCardInfo != null && !pf7.m172088c() && (!hlh0.m135741a().m135746f() || !m124806e(oMSAdCardInfo.contentType))) {
                boolean zM181650N = pk50.m172568j().m172574f().m181650N(oMSAdCardInfo.identifier, false);
                if (zM181650N && oMSAdCardInfo.identifier.contains("e_oms_180club")) {
                    zM181650N = CoreModule.m30933P().m143405a().mo34516hl();
                }
                if (zM181650N) {
                    CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
                    Position position = oMSAdCardInfo.position;
                    userInfo.virtualCardType = VirtualCardType.AdCard;
                    userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
                    userInfo.preSwipedDirection = SwipeDirection.LEFT;
                    userInfo.extensionObject = oMSAdCardInfo;
                    pf60<Integer, Long> pf60Var = new pf60<>(Integer.valueOf(position.offset), l2);
                    if (m124807f(userInfo)) {
                        List<OmsTagUserCounts> list = oMSAdCardInfo.content.tagCard.tagUserCounts;
                        ArrayList arrayList = new ArrayList();
                        Iterator<OmsTagUserCounts> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().f39650id);
                        }
                        if (CoreModule.m30933P().m143405a().mo34321F9(arrayList)) {
                            f98027a.put(userInfo, pf60Var);
                        }
                    } else {
                        f98027a.put(userInfo, pf60Var);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m124804c(CoreSuggested.UserInfo userInfo) {
        if (!NullChecker.m82486a(userInfo)) {
            return false;
        }
        Object obj = userInfo.extensionObject;
        if (obj instanceof OMSAdCardInfo) {
            return TextUtils.equals(((OMSAdCardInfo) obj).contentType, "omsCardLiterature");
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m124805d(CoreSuggested.UserInfo userInfo) {
        if (!NullChecker.m82486a(userInfo)) {
            return false;
        }
        Object obj = userInfo.extensionObject;
        if (obj instanceof OMSAdCardInfo) {
            return TextUtils.equals(((OMSAdCardInfo) obj).contentType, "literatureCardGuide");
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m124806e(String str) {
        return TextUtils.equals(str, "tagCardGuide") || TextUtils.equals(str, "tagCard") || TextUtils.equals(str, "literatureCardGuide");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m124807f(CoreSuggested.UserInfo userInfo) {
        if (!NullChecker.m82486a(userInfo)) {
            return false;
        }
        Object obj = userInfo.extensionObject;
        if (obj instanceof OMSAdCardInfo) {
            return TextUtils.equals(((OMSAdCardInfo) obj).contentType, "tagCard");
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m124808g(CoreSuggested.UserInfo userInfo) {
        if (!NullChecker.m82486a(userInfo)) {
            return false;
        }
        Object obj = userInfo.extensionObject;
        if (obj instanceof OMSAdCardInfo) {
            return TextUtils.equals(((OMSAdCardInfo) obj).contentType, "tagCardGuide");
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static void m124809h() {
        if (f98027a.size() <= 0) {
            return;
        }
        Iterator<Map.Entry<CoreSuggested.UserInfo, pf60<Integer, Long>>> it = f98027a.entrySet().iterator();
        Long l2 = CoreModule.f18264c.f20364Y0.f161167i.get();
        long jLongValue = l2.longValue();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        while (it.hasNext()) {
            Map.Entry<CoreSuggested.UserInfo, pf60<Integer, Long>> next = it.next();
            CoreSuggested.UserInfo key = next.getKey();
            pf60<Integer, Long> value = next.getValue();
            Integer num = value.f152156a;
            if (num == null) {
                return;
            }
            if (num.intValue() < 5) {
                f98028b.put(key, num);
                it.remove();
                arrayList.add(new pf60(key, num));
            } else {
                Long l3 = value.f152157b;
                if (l3 == null) {
                    return;
                }
                if (jLongValue != l3.longValue()) {
                    int iIntValue = num.intValue() - 1;
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    if (iIntValue < 5) {
                        f98028b.put(key, Integer.valueOf(iIntValue));
                        it.remove();
                        arrayList.add(new pf60(key, Integer.valueOf(iIntValue)));
                    } else {
                        map.put(key, new pf60(Integer.valueOf(iIntValue), l2));
                    }
                }
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            f98027a.put((CoreSuggested.UserInfo) entry.getKey(), (pf60) entry.getValue());
        }
        if (arrayList.size() > 0) {
            CoreModule.f18264c.f20405m0.m32165y6(arrayList);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m124810i(PartialListOpt<CoreSuggested.UserInfo> partialListOpt) {
        List<CoreSuggested.UserInfo> list;
        if (partialListOpt == null || (list = partialListOpt.loaded) == null || list.size() == 0) {
            return;
        }
        List<CoreSuggested.UserInfo> list2 = partialListOpt.loaded;
        CoreSuggested coreSuggested = CoreModule.f18264c.f20405m0;
        f98027a = coreSuggested.f20111R1;
        f98028b = coreSuggested.f20114S1;
        m124803b();
        m124811j(list2);
        m124802a(list2);
        l51.m152887G(new Runnable() { // from class: l.eb0
            @Override // java.lang.Runnable
            public final void run() {
                fb0.m124809h();
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static void m124811j(List<CoreSuggested.UserInfo> list) {
        if (f98028b.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                CoreSuggested.UserInfo userInfo = list.get(i);
                if (userInfo != null && userInfo.virtualCardType == VirtualCardType.AdCard) {
                    Object obj = userInfo.extensionObject;
                    if (NullChecker.m82486a(obj) && (obj instanceof OMSAdCardInfo)) {
                        f98028b.put(userInfo, Integer.valueOf(i));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m124812k(OMSAdCardInfo oMSAdCardInfo) {
        HashMap<CoreSuggested.UserInfo, Integer> map = f98028b;
        if (map == null) {
            return;
        }
        Iterator<Map.Entry<CoreSuggested.UserInfo, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Object obj = it.next().getKey().extensionObject;
            if (NullChecker.m82486a(obj) && (obj instanceof OMSAdCardInfo) && obj.equals(oMSAdCardInfo)) {
                it.remove();
            }
        }
    }
}
