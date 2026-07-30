package p003l;

import com.p000p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.xma;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class mb90 {

    /* JADX INFO: renamed from: l.mb90$a */
    public static /* synthetic */ class C3379a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6325a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f6325a = iArr;
            try {
                iArr[PurchaseType.TYPE_UNDO_PKG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6325a[PurchaseType.TYPE_LIKENOLIMIT_PKG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6325a[PurchaseType.TYPE_ROAMING_PKG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6325a[PurchaseType.TYPE_SUPERLIKE_PKG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m8136a(PurchaseType purchaseType) {
        boolean zL4;
        int i = C3379a.f6325a[purchaseType.ordinal()];
        if (i == 1) {
            zL4 = xma.l4();
        } else if (i == 2) {
            zL4 = xma.W3();
        } else if (i == 3) {
            zL4 = xma.d4();
        } else {
            if (i != 4) {
                return false;
            }
            zL4 = xma.i4();
        }
        return !zL4;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m8137b(PurchaseType purchaseType) {
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(userP9)) {
            return m8138c(userP9, purchaseType);
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m8138c(User user, PurchaseType purchaseType) {
        if (user.isVIP()) {
            return true;
        }
        if (purchaseType == PurchaseType.TYPE_ROAMING_PKG) {
            return m8136a(purchaseType);
        }
        return false;
    }
}
