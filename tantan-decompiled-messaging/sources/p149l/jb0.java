package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.data.OMSAdCardInfo;
import com.p046p1.mobile.putong.data.OmsTagUserCounts;
import com.p046p1.mobile.putong.data.Position;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class jb0 {

    /* JADX INFO: renamed from: a */
    public static HashMap<CoreSuggested.UserInfo, j760<Integer, Long>> f117148a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public static HashMap<CoreSuggested.UserInfo, Integer> f117149b = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public static void m140723a(List<CoreSuggested.UserInfo> list) {
        if (f117149b.size() > 0) {
            boolean z = false;
            for (int i = 0; i < list.size(); i++) {
                CoreSuggested.UserInfo userInfo = list.get(i);
                if (userInfo != null && userInfo.virtualCardType == VirtualCardType.AdCard) {
                    Object obj = userInfo.extensionObject;
                    if (NullChecker.m81303a(obj) && (obj instanceof OMSAdCardInfo)) {
                        z = true;
                    }
                }
            }
            if (z) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<CoreSuggested.UserInfo, Integer> entry : f117149b.entrySet()) {
                arrayList.add(new j760(entry.getKey(), entry.getValue()));
            }
            if (arrayList.size() > 0) {
                CoreModule.f17545c.f19663m0.m31162y6(arrayList);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d2  */
    /* JADX INFO: renamed from: b */
    public static void m140724b() {
        C4732c c4732c = CoreModule.f17545c;
        CoreSuggested coreSuggested = c4732c.f19663m0;
        if (coreSuggested.f19375T1) {
            return;
        }
        coreSuggested.f19375T1 = true;
        Long l2 = c4732c.f19622Y0.f94264i.get();
        l2.longValue();
        List<OMSAdCardInfo> listM135335h = ic50.m135327j().m135335h();
        if (vwb.m200296J(listM135335h)) {
            return;
        }
        for (int i = 0; i < listM135335h.size(); i++) {
            OMSAdCardInfo oMSAdCardInfo = listM135335h.get(i);
            if (oMSAdCardInfo != null && !le7.m149481c() && (!zch0.m218024a().m218029f() || !m140727e(oMSAdCardInfo.contentType))) {
                boolean zM145227N = ic50.m135327j().m135333f().m145227N(oMSAdCardInfo.identifier, false);
                if (zM145227N && oMSAdCardInfo.identifier.contains("e_oms_180club")) {
                    zM145227N = CoreModule.m29935P().m94651a().mo33513hl();
                }
                if (zM145227N) {
                    CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
                    Position position = oMSAdCardInfo.position;
                    userInfo.virtualCardType = VirtualCardType.AdCard;
                    userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
                    userInfo.preSwipedDirection = SwipeDirection.LEFT;
                    userInfo.extensionObject = oMSAdCardInfo;
                    j760<Integer, Long> j760Var = new j760<>(Integer.valueOf(position.offset), l2);
                    if (m140728f(userInfo)) {
                        List<OmsTagUserCounts> list = oMSAdCardInfo.content.tagCard.tagUserCounts;
                        ArrayList arrayList = new ArrayList();
                        Iterator<OmsTagUserCounts> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().f38802id);
                        }
                        if (CoreModule.m29935P().m94651a().mo33318F9(arrayList)) {
                            f117148a.put(userInfo, j760Var);
                        }
                    } else {
                        f117148a.put(userInfo, j760Var);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m140725c(CoreSuggested.UserInfo userInfo) {
        if (!NullChecker.m81303a(userInfo)) {
            return false;
        }
        Object obj = userInfo.extensionObject;
        if (obj instanceof OMSAdCardInfo) {
            return TextUtils.equals(((OMSAdCardInfo) obj).contentType, "omsCardLiterature");
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m140726d(CoreSuggested.UserInfo userInfo) {
        if (!NullChecker.m81303a(userInfo)) {
            return false;
        }
        Object obj = userInfo.extensionObject;
        if (obj instanceof OMSAdCardInfo) {
            return TextUtils.equals(((OMSAdCardInfo) obj).contentType, "literatureCardGuide");
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m140727e(String str) {
        return TextUtils.equals(str, "tagCardGuide") || TextUtils.equals(str, "tagCard") || TextUtils.equals(str, "literatureCardGuide");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m140728f(CoreSuggested.UserInfo userInfo) {
        if (!NullChecker.m81303a(userInfo)) {
            return false;
        }
        Object obj = userInfo.extensionObject;
        if (obj instanceof OMSAdCardInfo) {
            return TextUtils.equals(((OMSAdCardInfo) obj).contentType, "tagCard");
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m140729g(CoreSuggested.UserInfo userInfo) {
        if (!NullChecker.m81303a(userInfo)) {
            return false;
        }
        Object obj = userInfo.extensionObject;
        if (obj instanceof OMSAdCardInfo) {
            return TextUtils.equals(((OMSAdCardInfo) obj).contentType, "tagCardGuide");
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static void m140730h() {
        if (f117148a.size() <= 0) {
            return;
        }
        Iterator<Map.Entry<CoreSuggested.UserInfo, j760<Integer, Long>>> it = f117148a.entrySet().iterator();
        Long l2 = CoreModule.f17545c.f19622Y0.f94264i.get();
        long jLongValue = l2.longValue();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        while (it.hasNext()) {
            Map.Entry<CoreSuggested.UserInfo, j760<Integer, Long>> next = it.next();
            CoreSuggested.UserInfo key = next.getKey();
            j760<Integer, Long> value = next.getValue();
            Integer num = value.f116564a;
            if (num == null) {
                return;
            }
            if (num.intValue() < 5) {
                f117149b.put(key, num);
                it.remove();
                arrayList.add(new j760(key, num));
            } else {
                Long l3 = value.f116565b;
                if (l3 == null) {
                    return;
                }
                if (jLongValue != l3.longValue()) {
                    int iIntValue = num.intValue() - 1;
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    if (iIntValue < 5) {
                        f117149b.put(key, Integer.valueOf(iIntValue));
                        it.remove();
                        arrayList.add(new j760(key, Integer.valueOf(iIntValue)));
                    } else {
                        map.put(key, new j760(Integer.valueOf(iIntValue), l2));
                    }
                }
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            f117148a.put((CoreSuggested.UserInfo) entry.getKey(), (j760) entry.getValue());
        }
        if (arrayList.size() > 0) {
            CoreModule.f17545c.f19663m0.m31162y6(arrayList);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m140731i(PartialListOpt<CoreSuggested.UserInfo> partialListOpt) {
        List<CoreSuggested.UserInfo> list;
        if (partialListOpt == null || (list = partialListOpt.loaded) == null || list.size() == 0) {
            return;
        }
        List<CoreSuggested.UserInfo> list2 = partialListOpt.loaded;
        CoreSuggested coreSuggested = CoreModule.f17545c.f19663m0;
        f117148a = coreSuggested.f19369R1;
        f117149b = coreSuggested.f19372S1;
        m140724b();
        m140732j(list2);
        m140723a(list2);
        e51.m114742G(new Runnable() { // from class: l.ib0
            @Override // java.lang.Runnable
            public final void run() {
                jb0.m140730h();
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static void m140732j(List<CoreSuggested.UserInfo> list) {
        if (f117149b.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                CoreSuggested.UserInfo userInfo = list.get(i);
                if (userInfo != null && userInfo.virtualCardType == VirtualCardType.AdCard) {
                    Object obj = userInfo.extensionObject;
                    if (NullChecker.m81303a(obj) && (obj instanceof OMSAdCardInfo)) {
                        f117149b.put(userInfo, Integer.valueOf(i));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m140733k(OMSAdCardInfo oMSAdCardInfo) {
        HashMap<CoreSuggested.UserInfo, Integer> map = f117149b;
        if (map == null) {
            return;
        }
        Iterator<Map.Entry<CoreSuggested.UserInfo, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Object obj = it.next().getKey().extensionObject;
            if (NullChecker.m81303a(obj) && (obj instanceof OMSAdCardInfo) && obj.equals(oMSAdCardInfo)) {
                it.remove();
            }
        }
    }
}
