package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.MaleSuperLikeOptimise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseDialogConfigTrigger;
import com.p046p1.mobile.putong.core.data.PurchaseDialogConfigs;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public class och0 {

    /* JADX INFO: renamed from: a */
    public static ProductCategory f143041a = ProductCategory.get("unknown_");

    /* JADX INFO: renamed from: b */
    public static volatile MaleSuperLikeOptimise f143042b = null;

    /* JADX INFO: renamed from: c */
    public static volatile AtomicBoolean f143043c = new AtomicBoolean(false);

    @Nullable
    /* JADX INFO: renamed from: b */
    public static MaleSuperLikeOptimise m163514b() {
        MaleSuperLikeOptimise maleSuperLikeOptimise;
        if (NullChecker.m81303a(f143042b)) {
            return f143042b;
        }
        if (f143043c.get()) {
            return f143042b;
        }
        synchronized (och0.class) {
            try {
                maleSuperLikeOptimise = (MaleSuperLikeOptimise) RemoteConfig.m79298x().m79333v("male_superlike_optimise", MaleSuperLikeOptimise.JSON_ADAPTER);
            } catch (Exception unused) {
                maleSuperLikeOptimise = null;
            }
            f143043c.set(true);
            f143042b = maleSuperLikeOptimise;
        }
        return maleSuperLikeOptimise;
    }

    /* JADX INFO: renamed from: c */
    public static PurchaseDialogConfigTrigger m163515c(final String str) {
        PurchaseDialogConfigs purchaseDialogConfigsM30588I4 = CoreModule.f17545c.f19654j0.m30588I4();
        if (!NullChecker.m81303a(purchaseDialogConfigsM30588I4) || vwb.m200296J(purchaseDialogConfigsM30588I4.triggerDialog)) {
            return null;
        }
        return (PurchaseDialogConfigTrigger) vwb.m200346r(purchaseDialogConfigsM30588I4.triggerDialog, new w9j() { // from class: l.nch0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((PurchaseDialogConfigTrigger) obj).membership, str));
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static void m163516d() {
        PurchaseDialogConfigTrigger purchaseDialogConfigTriggerM163515c = m163515c("vip");
        if (NullChecker.m81303a(purchaseDialogConfigTriggerM163515c)) {
            f143041a = purchaseDialogConfigTriggerM163515c.defaultCategory;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m163517e() {
        f143043c.set(false);
        f143042b = null;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m163518f() {
        return upa.m194761h3();
    }
}
