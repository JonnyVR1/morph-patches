package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.BLiveUpgradeGiftActInfo;
import com.p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfo;
import com.p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfoItem;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.vwb;
import l.w9j;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ksj0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ xsj0 m16774a(BLiveUpgradeGiftInfo bLiveUpgradeGiftInfo, ysj0 ysj0Var, BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem) {
        return new xsj0(bLiveUpgradeGiftInfoItem, bLiveUpgradeGiftInfo.id, ysj0Var.f10626a);
    }

    /* JADX INFO: renamed from: d */
    public static List<xsj0> m16777d(final ysj0 ysj0Var) {
        final BLiveUpgradeGiftInfo bLiveUpgradeGiftInfoM26916d = ysj0Var.m26916d();
        return vwb.Q(bLiveUpgradeGiftInfoM26916d.slotGiftInfos, new w9j() { // from class: l.jsj0
            public final Object call(Object obj) {
                return ksj0.m16774a(bLiveUpgradeGiftInfoM26916d, ysj0Var, (BLiveUpgradeGiftInfoItem) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static List<fsj0> m16778e(final BLiveUpgradeGiftInfo bLiveUpgradeGiftInfo, final lsj0 lsj0Var) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(new ysj0(bLiveUpgradeGiftInfo, lsj0Var));
        vwb.z(bLiveUpgradeGiftInfo.activityInfos, new e30() { // from class: l.gsj0
            public final void call(Object obj) {
                arrayList.add(new xtj0((BLiveUpgradeGiftActInfo) obj, lsj0Var));
            }
        });
        vwb.z(bLiveUpgradeGiftInfo.slotGiftInfos, new e30() { // from class: l.hsj0
            public final void call(Object obj) {
                ((BLiveUpgradeGiftInfoItem) obj).giftLevels = bLiveUpgradeGiftInfo.giftLevels;
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static int m16779f(ysj0 ysj0Var) {
        int iG = vwb.G(ysj0Var.m26916d().slotGiftInfos, new isj0());
        if (iG == -1) {
            return 0;
        }
        return iG;
    }

    /* JADX INFO: renamed from: g */
    public static BLiveUpgradeGiftInfoItem m16780g(ysj0 ysj0Var) {
        return (BLiveUpgradeGiftInfoItem) vwb.r(ysj0Var.m26916d().slotGiftInfos, new isj0());
    }

    /* JADX INFO: renamed from: h */
    public static String m16781h(String str, int i) {
        JSONObject jSONObject;
        String strM16782i = m16782i(str, i);
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("templateUrl", strM16782i);
            } catch (JSONException unused) {
                jSONObject2 = jSONObject;
                jSONObject = jSONObject2;
            }
        } catch (JSONException unused2) {
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m16782i(String str, int i) {
        String strMo11105b = spe.m22604d("svga").mo11105b(aqe.m10039i().m10044h(str));
        if (TextUtils.isEmpty(strMo11105b)) {
            aqe.m10039i().m10058w(str);
            wrj.m25416m(str, i);
        }
        return strMo11105b;
    }
}
