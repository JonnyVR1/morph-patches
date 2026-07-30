package p009l;

import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class yx80 {

    /* JADX INFO: renamed from: l.yx80$a */
    public static /* synthetic */ class C1338a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23267a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f23267a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m25534a() {
        int iM9656y = RemoteConfig.m9619x().m9656y("instant_chat_num");
        if (iM9656y > 0) {
            return iM9656y;
        }
        return 3;
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList<Privilege> m25535b(PurchaseType purchaseType) {
        int i = C1338a.f23267a[purchaseType.ordinal()];
        return fy80.m14660z();
    }
}
