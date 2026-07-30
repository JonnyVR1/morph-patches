package p153l;

import androidx.annotation.WorkerThread;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotion;
import com.p051p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ+\u0010\u000f\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Ll/rsb;", "", "<init>", "()V", "Lcom/p1/mobile/putong/data/Envelope;", Envelope.TYPE, "", "a", "(Lcom/p1/mobile/putong/data/Envelope;)V", "c", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "Lcom/p1/mobile/putong/core/data/Coupon;", "coupons", "b", "(Ljava/util/List;Ljava/util/List;)V", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class rsb {

    @NotNull
    public static final rsb INSTANCE = new rsb();

    @WorkerThread
    /* JADX INFO: renamed from: a */
    public final void m182949a(@NotNull Envelope envelope) {
        envelope.getClass();
        List<Merchandise> list = ((CoreData) envelope.getModuleData(CoreData.class)).merchandises;
        if (list != null) {
            List<Coupon> listM197855v3 = CoreModule.f18264c.f20376c1.m197855v3();
            rsb rsbVar = INSTANCE;
            listM197855v3.getClass();
            rsbVar.m182950b(list, listM197855v3);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m182950b(List<? extends Merchandise> merchandises, List<? extends Coupon> coupons) {
        HashMap map = new HashMap();
        for (Coupon coupon : coupons) {
            List<String> list = coupon.condition.merchandiseIDs;
            list.getClass();
            for (String str : list) {
                if (!map.containsKey(str)) {
                    map.put(str, new ArrayList());
                }
                Object obj = map.get(str);
                obj.getClass();
                ((ArrayList) obj).add(coupon);
            }
        }
        for (Merchandise merchandise : merchandises) {
            ArrayList arrayList = (ArrayList) map.get(merchandise.f56859id);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            merchandise.localCoupons = arrayList;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: c */
    public final void m182951c(@NotNull Envelope envelope) {
        envelope.getClass();
        HashMap map = new HashMap();
        List<Merchandise> listM31585F4 = CoreModule.f18264c.f20396j0.m31585F4();
        if (CoreModule.f18264c.f20396j0.m31583E4().m222762f() == null) {
            CrashHelper.m82479c(new Exception("CoreModule.core.product.getMerchandiseBehaviorSubject().getValues()  is null"));
        }
        listM31585F4.getClass();
        Iterator<T> it = listM31585F4.iterator();
        while (it.hasNext()) {
            ((Merchandise) it.next()).localCoupons.clear();
        }
        List<MonetizationPromotion> list = ((CoreData) envelope.getModuleData(CoreData.class)).monetizationPromotions;
        if (list != null) {
            for (MonetizationPromotion monetizationPromotion : list) {
                List<String> list2 = monetizationPromotion.userCouponIDs;
                list2.getClass();
                for (String str : list2) {
                    if (!map.containsKey(str)) {
                        map.put(str, new ArrayList());
                    }
                    Object obj = map.get(str);
                    obj.getClass();
                    ((ArrayList) obj).add(monetizationPromotion.f56859id);
                }
            }
        }
        List<Coupon> list3 = ((CoreData) envelope.getModuleData(CoreData.class)).coupons;
        if (list3 != null) {
            for (Coupon coupon : list3) {
                ArrayList arrayList = (ArrayList) map.get(coupon.userCouponID);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                coupon.localApplyPromotions = arrayList;
            }
            rsb rsbVar = INSTANCE;
            listM31585F4.getClass();
            rsbVar.m182950b(listM31585F4, list3);
        }
        ((CoreData) envelope.getModuleData(CoreData.class)).merchandises = listM31585F4;
    }
}
