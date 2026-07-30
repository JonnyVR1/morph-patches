package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class qj90 {

    /* JADX INFO: renamed from: l.qj90$a */
    public static /* synthetic */ class C19582a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f157947a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f157947a = iArr;
            try {
                iArr[PurchaseType.TYPE_UNDO_PKG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f157947a[PurchaseType.TYPE_LIKENOLIMIT_PKG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f157947a[PurchaseType.TYPE_ROAMING_PKG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f157947a[PurchaseType.TYPE_SUPERLIKE_PKG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m176829a(PurchaseType purchaseType) {
        boolean zM146400m4;
        int i = C19582a.f157947a[purchaseType.ordinal()];
        if (i == 1) {
            zM146400m4 = joa.m146400m4();
        } else if (i == 2) {
            zM146400m4 = joa.m146372X3();
        } else if (i == 3) {
            zM146400m4 = joa.m146384e4();
        } else {
            if (i != 4) {
                return false;
            }
            zM146400m4 = joa.m146394j4();
        }
        return !zM146400m4;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m176830b(PurchaseType purchaseType) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            return m176831c(userM116600p9, purchaseType);
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m176831c(User user, PurchaseType purchaseType) {
        if (user.isVIP()) {
            return true;
        }
        if (purchaseType == PurchaseType.TYPE_ROAMING_PKG) {
            return m176829a(purchaseType);
        }
        return false;
    }
}
