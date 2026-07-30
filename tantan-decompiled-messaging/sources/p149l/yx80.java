package p149l;

import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class yx80 {

    /* JADX INFO: renamed from: l.yx80$a */
    public static /* synthetic */ class C21567a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f200582a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f200582a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m216433a() {
        int iM79335y = RemoteConfig.m79298x().m79335y("instant_chat_num");
        if (iM79335y > 0) {
            return iM79335y;
        }
        return 3;
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList<Privilege> m216434b(PurchaseType purchaseType) {
        int i = C21567a.f200582a[purchaseType.ordinal()];
        return fy80.m123730z();
    }
}
