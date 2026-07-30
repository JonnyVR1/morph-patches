package p153l;

import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class c690 {

    /* JADX INFO: renamed from: l.c690$a */
    public static /* synthetic */ class C16199a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f79947a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f79947a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m108122a() {
        int iM80518y = RemoteConfig.m80481x().m80518y("instant_chat_num");
        if (iM80518y > 0) {
            return iM80518y;
        }
        return 3;
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList<Privilege> m108123b(PurchaseType purchaseType) {
        int i = C16199a.f79947a[purchaseType.ordinal()];
        return j690.m143634z();
    }
}
