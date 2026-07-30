package p009l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.MaleSuperLikeOptimise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseDialogConfigTrigger;
import com.p1.mobile.putong.core.data.PurchaseDialogConfigs;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import l.upa;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class och0 {

    /* JADX INFO: renamed from: a */
    public static ProductCategory f17895a = ProductCategory.get("unknown_");

    /* JADX INFO: renamed from: b */
    public static volatile MaleSuperLikeOptimise f17896b = null;

    /* JADX INFO: renamed from: c */
    public static volatile AtomicBoolean f17897c = new AtomicBoolean(false);

    @Nullable
    /* JADX INFO: renamed from: b */
    public static MaleSuperLikeOptimise m19659b() {
        MaleSuperLikeOptimise maleSuperLikeOptimise;
        if (NullChecker.a(f17896b)) {
            return f17896b;
        }
        if (f17897c.get()) {
            return f17896b;
        }
        synchronized (och0.class) {
            try {
                maleSuperLikeOptimise = (MaleSuperLikeOptimise) RemoteConfig.m9619x().m9654v("male_superlike_optimise", MaleSuperLikeOptimise.JSON_ADAPTER);
            } catch (Exception unused) {
                maleSuperLikeOptimise = null;
            }
            f17897c.set(true);
            f17896b = maleSuperLikeOptimise;
        }
        return maleSuperLikeOptimise;
    }

    /* JADX INFO: renamed from: c */
    public static PurchaseDialogConfigTrigger m19660c(final String str) {
        PurchaseDialogConfigs purchaseDialogConfigsI4 = CoreModule.c.j0.I4();
        if (!NullChecker.a(purchaseDialogConfigsI4) || vwb.J(purchaseDialogConfigsI4.triggerDialog)) {
            return null;
        }
        return (PurchaseDialogConfigTrigger) vwb.r(purchaseDialogConfigsI4.triggerDialog, new w9j() { // from class: l.nch0
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((PurchaseDialogConfigTrigger) obj).membership, str));
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static void m19661d() {
        PurchaseDialogConfigTrigger purchaseDialogConfigTriggerM19660c = m19660c("vip");
        if (NullChecker.a(purchaseDialogConfigTriggerM19660c)) {
            f17895a = purchaseDialogConfigTriggerM19660c.defaultCategory;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m19662e() {
        f17897c.set(false);
        f17896b = null;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m19663f() {
        return upa.h3();
    }
}
