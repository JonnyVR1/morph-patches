package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p000p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.data.OMSAdCardInfo;
import com.p1.mobile.putong.data.OmsTagUserCounts;
import com.p1.mobile.putong.data.Position;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.e51;
import l.ic50;
import l.j760;
import l.le7;
import l.vwb;
import l.zch0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class jb0 {

    /* JADX INFO: renamed from: a */
    public static HashMap<CoreSuggested.UserInfo, j760<Integer, Long>> f15096a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public static HashMap<CoreSuggested.UserInfo, Integer> f15097b = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public static void m17414a(List<CoreSuggested.UserInfo> list) {
        if (f15097b.size() > 0) {
            boolean z = false;
            for (int i = 0; i < list.size(); i++) {
                CoreSuggested.UserInfo userInfo = list.get(i);
                if (userInfo != null && userInfo.virtualCardType == VirtualCardType.AdCard) {
                    Object obj = userInfo.extensionObject;
                    if (NullChecker.a(obj) && (obj instanceof OMSAdCardInfo)) {
                        z = true;
                    }
                }
            }
            if (z) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<CoreSuggested.UserInfo, Integer> entry : f15097b.entrySet()) {
                arrayList.add(new j760(entry.getKey(), entry.getValue()));
            }
            if (arrayList.size() > 0) {
                CoreModule.f1534c.f3652m0.m3092y6(arrayList);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d2  */
    /* JADX INFO: renamed from: b */
    public static void m17415b() {
        C0158c c0158c = CoreModule.f1534c;
        CoreSuggested coreSuggested = c0158c.f3652m0;
        if (coreSuggested.f3364T1) {
            return;
        }
        coreSuggested.f3364T1 = true;
        Long l2 = (Long) c0158c.f3611Y0.f11585i.get();
        l2.longValue();
        List listH = ic50.j().h();
        if (vwb.J(listH)) {
            return;
        }
        for (int i = 0; i < listH.size(); i++) {
            OMSAdCardInfo oMSAdCardInfo = (OMSAdCardInfo) listH.get(i);
            if (oMSAdCardInfo != null && !le7.c() && (!zch0.a().f() || !m17418e(oMSAdCardInfo.contentType))) {
                boolean zN = ic50.j().f().N(oMSAdCardInfo.identifier, false);
                if (zN && oMSAdCardInfo.identifier.contains("e_oms_180club")) {
                    zN = CoreModule.m1854P().m11706a().m5450hl();
                }
                if (zN) {
                    CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
                    Position position = oMSAdCardInfo.position;
                    userInfo.virtualCardType = VirtualCardType.AdCard;
                    userInfo.f3461id = CoreSuggested.UserInfo.VIRTUAL_CARD;
                    userInfo.preSwipedDirection = SwipeDirection.LEFT;
                    userInfo.extensionObject = oMSAdCardInfo;
                    j760<Integer, Long> j760Var = new j760<>(Integer.valueOf(position.offset), l2);
                    if (m17419f(userInfo)) {
                        List list = oMSAdCardInfo.content.tagCard.tagUserCounts;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((OmsTagUserCounts) it.next()).id);
                        }
                        if (CoreModule.m1854P().m11706a().m5255F9(arrayList)) {
                            f15096a.put(userInfo, j760Var);
                        }
                    } else {
                        f15096a.put(userInfo, j760Var);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m17416c(CoreSuggested.UserInfo userInfo) {
        if (!NullChecker.a(userInfo)) {
            return false;
        }
        Object obj = userInfo.extensionObject;
        if (obj instanceof OMSAdCardInfo) {
            return TextUtils.equals(((OMSAdCardInfo) obj).contentType, "omsCardLiterature");
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m17417d(CoreSuggested.UserInfo userInfo) {
        if (!NullChecker.a(userInfo)) {
            return false;
        }
        Object obj = userInfo.extensionObject;
        if (obj instanceof OMSAdCardInfo) {
            return TextUtils.equals(((OMSAdCardInfo) obj).contentType, "literatureCardGuide");
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m17418e(String str) {
        return TextUtils.equals(str, "tagCardGuide") || TextUtils.equals(str, "tagCard") || TextUtils.equals(str, "literatureCardGuide");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m17419f(CoreSuggested.UserInfo userInfo) {
        if (!NullChecker.a(userInfo)) {
            return false;
        }
        Object obj = userInfo.extensionObject;
        if (obj instanceof OMSAdCardInfo) {
            return TextUtils.equals(((OMSAdCardInfo) obj).contentType, "tagCard");
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m17420g(CoreSuggested.UserInfo userInfo) {
        if (!NullChecker.a(userInfo)) {
            return false;
        }
        Object obj = userInfo.extensionObject;
        if (obj instanceof OMSAdCardInfo) {
            return TextUtils.equals(((OMSAdCardInfo) obj).contentType, "tagCardGuide");
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static void m17421h() {
        if (f15096a.size() <= 0) {
            return;
        }
        Iterator<Map.Entry<CoreSuggested.UserInfo, j760<Integer, Long>>> it = f15096a.entrySet().iterator();
        Long l2 = (Long) CoreModule.f1534c.f3611Y0.f11585i.get();
        long jLongValue = l2.longValue();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        while (it.hasNext()) {
            Map.Entry<CoreSuggested.UserInfo, j760<Integer, Long>> next = it.next();
            CoreSuggested.UserInfo key = next.getKey();
            j760<Integer, Long> value = next.getValue();
            Integer num = (Integer) value.a;
            if (num == null) {
                return;
            }
            if (num.intValue() < 5) {
                f15097b.put(key, num);
                it.remove();
                arrayList.add(new j760(key, num));
            } else {
                Long l3 = (Long) value.b;
                if (l3 == null) {
                    return;
                }
                if (jLongValue != l3.longValue()) {
                    int iIntValue = num.intValue() - 1;
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    if (iIntValue < 5) {
                        f15097b.put(key, Integer.valueOf(iIntValue));
                        it.remove();
                        arrayList.add(new j760(key, Integer.valueOf(iIntValue)));
                    } else {
                        map.put(key, new j760(Integer.valueOf(iIntValue), l2));
                    }
                }
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            f15096a.put((CoreSuggested.UserInfo) entry.getKey(), (j760) entry.getValue());
        }
        if (arrayList.size() > 0) {
            CoreModule.f1534c.f3652m0.m3092y6(arrayList);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m17422i(PartialListOpt<CoreSuggested.UserInfo> partialListOpt) {
        List list;
        if (partialListOpt == null || (list = partialListOpt.loaded) == null || list.size() == 0) {
            return;
        }
        List list2 = partialListOpt.loaded;
        CoreSuggested coreSuggested = CoreModule.f1534c.f3652m0;
        f15096a = coreSuggested.f3358R1;
        f15097b = coreSuggested.f3361S1;
        m17415b();
        m17423j(list2);
        m17414a(list2);
        e51.G(new Runnable() { // from class: l.ib0
            @Override // java.lang.Runnable
            public final void run() {
                jb0.m17421h();
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static void m17423j(List<CoreSuggested.UserInfo> list) {
        if (f15097b.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                CoreSuggested.UserInfo userInfo = list.get(i);
                if (userInfo != null && userInfo.virtualCardType == VirtualCardType.AdCard) {
                    Object obj = userInfo.extensionObject;
                    if (NullChecker.a(obj) && (obj instanceof OMSAdCardInfo)) {
                        f15097b.put(userInfo, Integer.valueOf(i));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m17424k(OMSAdCardInfo oMSAdCardInfo) {
        HashMap<CoreSuggested.UserInfo, Integer> map = f15097b;
        if (map == null) {
            return;
        }
        Iterator<Map.Entry<CoreSuggested.UserInfo, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Object obj = it.next().getKey().extensionObject;
            if (NullChecker.a(obj) && (obj instanceof OMSAdCardInfo) && obj.equals(oMSAdCardInfo)) {
                it.remove();
            }
        }
    }
}
