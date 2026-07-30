package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class mb90 {

    /* JADX INFO: renamed from: l.mb90$a */
    public static /* synthetic */ class C18432a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f132998a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f132998a = iArr;
            try {
                iArr[PurchaseType.TYPE_UNDO_PKG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f132998a[PurchaseType.TYPE_LIKENOLIMIT_PKG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f132998a[PurchaseType.TYPE_ROAMING_PKG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f132998a[PurchaseType.TYPE_SUPERLIKE_PKG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m153865a(PurchaseType purchaseType) {
        boolean zM210085l4;
        int i = C18432a.f132998a[purchaseType.ordinal()];
        if (i == 1) {
            zM210085l4 = xma.m210085l4();
        } else if (i == 2) {
            zM210085l4 = xma.m210058W3();
        } else if (i == 3) {
            zM210085l4 = xma.m210069d4();
        } else {
            if (i != 4) {
                return false;
            }
            zM210085l4 = xma.m210079i4();
        }
        return !zM210085l4;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m153866b(PurchaseType purchaseType) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            return m153867c(userM169527p9, purchaseType);
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m153867c(User user, PurchaseType purchaseType) {
        if (user.isVIP()) {
            return true;
        }
        if (purchaseType == PurchaseType.TYPE_ROAMING_PKG) {
            return m153865a(purchaseType);
        }
        return false;
    }
}
