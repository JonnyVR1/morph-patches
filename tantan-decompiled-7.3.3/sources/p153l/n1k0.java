package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveUpgradeGiftActInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfoItem;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class n1k0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ a2k0 m161116a(BLiveUpgradeGiftInfo bLiveUpgradeGiftInfo, b2k0 b2k0Var, BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem) {
        return new a2k0(bLiveUpgradeGiftInfoItem, bLiveUpgradeGiftInfo.f45313id, b2k0Var.f112532a);
    }

    /* JADX INFO: renamed from: d */
    public static List<a2k0> m161119d(final b2k0 b2k0Var) {
        final BLiveUpgradeGiftInfo bLiveUpgradeGiftInfoM102201d = b2k0Var.m102201d();
        return jyb.m147486Q(bLiveUpgradeGiftInfoM102201d.slotGiftInfos, new qcj() { // from class: l.m1k0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return n1k0.m161116a(bLiveUpgradeGiftInfoM102201d, b2k0Var, (BLiveUpgradeGiftInfoItem) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static List<i1k0> m161120e(final BLiveUpgradeGiftInfo bLiveUpgradeGiftInfo, final o1k0 o1k0Var) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(new b2k0(bLiveUpgradeGiftInfo, o1k0Var));
        jyb.m147537z(bLiveUpgradeGiftInfo.activityInfos, new y20() { // from class: l.j1k0
            @Override // p153l.y20
            public final void call(Object obj) {
                arrayList.add(new a3k0((BLiveUpgradeGiftActInfo) obj, o1k0Var));
            }
        });
        jyb.m147537z(bLiveUpgradeGiftInfo.slotGiftInfos, new y20() { // from class: l.k1k0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((BLiveUpgradeGiftInfoItem) obj).giftLevels = bLiveUpgradeGiftInfo.giftLevels;
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static int m161121f(b2k0 b2k0Var) {
        int iM147476G = jyb.m147476G(b2k0Var.m102201d().slotGiftInfos, new l1k0());
        if (iM147476G == -1) {
            return 0;
        }
        return iM147476G;
    }

    /* JADX INFO: renamed from: g */
    public static BLiveUpgradeGiftInfoItem m161122g(b2k0 b2k0Var) {
        return (BLiveUpgradeGiftInfoItem) jyb.m147529r(b2k0Var.m102201d().slotGiftInfos, new l1k0());
    }

    /* JADX INFO: renamed from: h */
    public static String m161123h(String str, int i) {
        JSONObject jSONObject;
        String strM161124i = m161124i(str, i);
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("templateUrl", strM161124i);
            } catch (JSONException unused) {
                jSONObject2 = jSONObject;
                jSONObject = jSONObject2;
            }
        } catch (JSONException unused2) {
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m161124i(String str, int i) {
        String strMo144686b = wqe.m207509d("svga").mo144686b(ere.m122146i().m122151h(str));
        if (TextUtils.isEmpty(strMo144686b)) {
            ere.m122146i().m122165w(str);
            muj.m160208m(str, i);
        }
        return strMo144686b;
    }
}
