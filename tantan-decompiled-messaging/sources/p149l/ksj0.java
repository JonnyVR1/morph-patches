package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveUpgradeGiftActInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfoItem;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ksj0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ xsj0 m147074a(BLiveUpgradeGiftInfo bLiveUpgradeGiftInfo, ysj0 ysj0Var, BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem) {
        return new xsj0(bLiveUpgradeGiftInfoItem, bLiveUpgradeGiftInfo.f44465id, ysj0Var.f99083a);
    }

    /* JADX INFO: renamed from: d */
    public static List<xsj0> m147077d(final ysj0 ysj0Var) {
        final BLiveUpgradeGiftInfo bLiveUpgradeGiftInfoM215913d = ysj0Var.m215913d();
        return vwb.m200303Q(bLiveUpgradeGiftInfoM215913d.slotGiftInfos, new w9j() { // from class: l.jsj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ksj0.m147074a(bLiveUpgradeGiftInfoM215913d, ysj0Var, (BLiveUpgradeGiftInfoItem) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static List<fsj0> m147078e(final BLiveUpgradeGiftInfo bLiveUpgradeGiftInfo, final lsj0 lsj0Var) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(new ysj0(bLiveUpgradeGiftInfo, lsj0Var));
        vwb.m200354z(bLiveUpgradeGiftInfo.activityInfos, new e30() { // from class: l.gsj0
            @Override // p149l.e30
            public final void call(Object obj) {
                arrayList.add(new xtj0((BLiveUpgradeGiftActInfo) obj, lsj0Var));
            }
        });
        vwb.m200354z(bLiveUpgradeGiftInfo.slotGiftInfos, new e30() { // from class: l.hsj0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((BLiveUpgradeGiftInfoItem) obj).giftLevels = bLiveUpgradeGiftInfo.giftLevels;
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static int m147079f(ysj0 ysj0Var) {
        int iM200293G = vwb.m200293G(ysj0Var.m215913d().slotGiftInfos, new isj0());
        if (iM200293G == -1) {
            return 0;
        }
        return iM200293G;
    }

    /* JADX INFO: renamed from: g */
    public static BLiveUpgradeGiftInfoItem m147080g(ysj0 ysj0Var) {
        return (BLiveUpgradeGiftInfoItem) vwb.m200346r(ysj0Var.m215913d().slotGiftInfos, new isj0());
    }

    /* JADX INFO: renamed from: h */
    public static String m147081h(String str, int i) {
        JSONObject jSONObject;
        String strM147082i = m147082i(str, i);
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("templateUrl", strM147082i);
            } catch (JSONException unused) {
                jSONObject2 = jSONObject;
                jSONObject = jSONObject2;
            }
        } catch (JSONException unused2) {
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m147082i(String str, int i) {
        String strMo107443b = spe.m185365d("svga").mo107443b(aqe.m98261i().m98266h(str));
        if (TextUtils.isEmpty(strMo107443b)) {
            aqe.m98261i().m98280w(str);
            wrj.m205244m(str, i);
        }
        return strMo107443b;
    }
}
