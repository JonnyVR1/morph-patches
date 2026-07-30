package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.MaleSuperLikeOptimise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseDialogConfigTrigger;
import com.p051p1.mobile.putong.core.data.PurchaseDialogConfigs;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public class wkh0 {

    /* JADX INFO: renamed from: a */
    public static ProductCategory f189551a = ProductCategory.get("unknown_");

    /* JADX INFO: renamed from: b */
    public static volatile MaleSuperLikeOptimise f189552b = null;

    /* JADX INFO: renamed from: c */
    public static volatile AtomicBoolean f189553c = new AtomicBoolean(false);

    @Nullable
    /* JADX INFO: renamed from: b */
    public static MaleSuperLikeOptimise m206816b() {
        MaleSuperLikeOptimise maleSuperLikeOptimise;
        if (NullChecker.m82486a(f189552b)) {
            return f189552b;
        }
        if (f189553c.get()) {
            return f189552b;
        }
        synchronized (wkh0.class) {
            try {
                maleSuperLikeOptimise = (MaleSuperLikeOptimise) RemoteConfig.m80481x().m80516v("male_superlike_optimise", MaleSuperLikeOptimise.JSON_ADAPTER);
            } catch (Exception unused) {
                maleSuperLikeOptimise = null;
            }
            f189553c.set(true);
            f189552b = maleSuperLikeOptimise;
        }
        return maleSuperLikeOptimise;
    }

    /* JADX INFO: renamed from: c */
    public static PurchaseDialogConfigTrigger m206817c(final String str) {
        PurchaseDialogConfigs purchaseDialogConfigsM31591I4 = CoreModule.f18264c.f20396j0.m31591I4();
        if (!NullChecker.m82486a(purchaseDialogConfigsM31591I4) || jyb.m147479J(purchaseDialogConfigsM31591I4.triggerDialog)) {
            return null;
        }
        return (PurchaseDialogConfigTrigger) jyb.m147529r(purchaseDialogConfigsM31591I4.triggerDialog, new qcj() { // from class: l.vkh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((PurchaseDialogConfigTrigger) obj).membership, str));
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static void m206818d() {
        PurchaseDialogConfigTrigger purchaseDialogConfigTriggerM206817c = m206817c("vip");
        if (NullChecker.m82486a(purchaseDialogConfigTriggerM206817c)) {
            f189551a = purchaseDialogConfigTriggerM206817c.defaultCategory;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m206819e() {
        f189553c.set(false);
        f189552b = null;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m206820f() {
        return gra.m131692h3();
    }
}
