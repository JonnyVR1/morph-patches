package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveDiscountItem;
import com.p051p1.mobile.putong.live.base.data.BLiveDiscountSendGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001a¨\u0006\u001e"}, m88121d2 = {"Ll/f3e;", "", "<init>", "()V", "Ll/uoe0;", "requestInfo", "", "a", "(Ll/uoe0;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;", "giftItem", "", "giftCount", "", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;I)D", "Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;", "brief", "f", "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;)V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveDiscountItem;", "discountList", "needCount", "Lcom/p1/mobile/putong/live/base/data/BLiveDiscountSendGiftItem;", "c", "(Ljava/util/List;I)Ljava/util/List;", "e", "(Ljava/util/List;)Ljava/util/List;", "b", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class f3e {

    @NotNull
    public static final f3e INSTANCE = new f3e();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m123724a(@NotNull uoe0 requestInfo) {
        requestInfo.getClass();
        BLiveGiftItem bLiveGiftItem = requestInfo.f180057e;
        if (bLiveGiftItem == null) {
            return;
        }
        List<BLiveDiscountItem> list = bLiveGiftItem.discounts;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((BLiveDiscountItem) obj).remain > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int i = requestInfo.f180058f;
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((BLiveDiscountItem) it.next()).remain;
        }
        requestInfo.f180043F = new g3e(i < i2 ? INSTANCE.m123728c(arrayList, i) : INSTANCE.m123729e(arrayList));
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final double m123725d(@NotNull BLiveGiftItem giftItem, int giftCount) {
        giftItem.getClass();
        long price = giftItem.getPrice();
        long j = u8n.m195065a() ? giftItem.diamondPrice.purchasePrice : giftItem.purchasePrice;
        if (!giftItem.isSupportDiscountGift()) {
            return price * ((long) giftCount);
        }
        f3e f3eVar = INSTANCE;
        List<BLiveDiscountItem> list = giftItem.discounts;
        list.getClass();
        List<BLiveDiscountItem> listM123727b = f3eVar.m123727b(list, giftCount);
        int size = listM123727b.size();
        double dCeil = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (giftCount > size) {
            Iterator<BLiveDiscountItem> it = listM123727b.iterator();
            while (it.hasNext()) {
                dCeil += Math.ceil(j * (((double) it.next().discount) / 100.0d));
            }
            return dCeil + (j * ((long) (giftCount - listM123727b.size())));
        }
        Iterator<BLiveDiscountItem> it2 = listM123727b.iterator();
        while (it2.hasNext()) {
            dCeil += Math.ceil(j * (((double) it2.next().discount) / 100.0d));
        }
        return dCeil;
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m123726f(@NotNull BLiveGiftItem giftItem, @NotNull BLiveGivenGiftBrief brief) {
        List<BLiveDiscountItem> list;
        Object next;
        giftItem.getClass();
        brief.getClass();
        List<BLiveDiscountItem> list2 = giftItem.discounts;
        if (list2 == null || list2.isEmpty() || (list = brief.discounts) == null || list.isEmpty()) {
            return;
        }
        for (BLiveDiscountItem bLiveDiscountItem : brief.discounts) {
            List<BLiveDiscountItem> list3 = giftItem.discounts;
            list3.getClass();
            Iterator<T> it = list3.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (bLiveDiscountItem.f45204id != ((BLiveDiscountItem) next).f45204id);
            BLiveDiscountItem bLiveDiscountItem2 = (BLiveDiscountItem) next;
            if (bLiveDiscountItem2 != null) {
                bLiveDiscountItem2.remain = bLiveDiscountItem.remain;
            }
            List<BLiveDiscountItem> list4 = giftItem.discounts;
            list4.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list4) {
                if (((BLiveDiscountItem) obj).remain > 0) {
                    arrayList.add(obj);
                }
            }
            giftItem.discounts = arrayList;
        }
    }

    /* JADX INFO: renamed from: b */
    public final List<BLiveDiscountItem> m123727b(List<? extends BLiveDiscountItem> discountList, int giftCount) {
        ArrayList arrayList = new ArrayList();
        for (BLiveDiscountItem bLiveDiscountItem : discountList) {
            int i = bLiveDiscountItem.remain;
            if (1 <= i) {
                while (true) {
                    arrayList.add(bLiveDiscountItem);
                    int i2 = i2 != i ? i2 + 1 : 1;
                }
            }
        }
        return giftCount >= arrayList.size() ? arrayList : arrayList.subList(0, giftCount);
    }

    /* JADX INFO: renamed from: c */
    public final List<BLiveDiscountSendGiftItem> m123728c(List<? extends BLiveDiscountItem> discountList, int needCount) {
        int i;
        ArrayList arrayList = new ArrayList();
        for (BLiveDiscountItem bLiveDiscountItem : discountList) {
            int i2 = bLiveDiscountItem.remain;
            if (1 <= i2) {
                while (true) {
                    BLiveDiscountSendGiftItem bLiveDiscountSendGiftItemNew_ = BLiveDiscountSendGiftItem.new_();
                    bLiveDiscountSendGiftItemNew_.f45205id = bLiveDiscountItem.f45204id;
                    bLiveDiscountSendGiftItemNew_.cnt = 1;
                    arrayList.add(bLiveDiscountSendGiftItemNew_);
                    int i3 = i3 != i2 ? i3 + 1 : 1;
                }
            }
        }
        List listSubList = arrayList.subList(0, needCount);
        HashSet hashSet = new HashSet();
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(((BLiveDiscountSendGiftItem) it.next()).f45205id));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = hashSet.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            Object next = it2.next();
            next.getClass();
            int iIntValue = ((Number) next).intValue();
            List list = listSubList;
            if ((list instanceof Collection) && list.isEmpty()) {
                i = 0;
            } else {
                Iterator it3 = list.iterator();
                i = 0;
                while (it3.hasNext()) {
                    if (((BLiveDiscountSendGiftItem) it3.next()).f45205id == iIntValue && (i = i + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            BLiveDiscountSendGiftItem bLiveDiscountSendGiftItem = new BLiveDiscountSendGiftItem();
            bLiveDiscountSendGiftItem.f45205id = iIntValue;
            bLiveDiscountSendGiftItem.cnt = i;
            arrayList2.add(bLiveDiscountSendGiftItem);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: e */
    public final List<BLiveDiscountSendGiftItem> m123729e(List<? extends BLiveDiscountItem> discountList) {
        List<? extends BLiveDiscountItem> list = discountList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (BLiveDiscountItem bLiveDiscountItem : list) {
            BLiveDiscountSendGiftItem bLiveDiscountSendGiftItem = new BLiveDiscountSendGiftItem();
            bLiveDiscountSendGiftItem.f45205id = bLiveDiscountItem.f45204id;
            bLiveDiscountSendGiftItem.cnt = bLiveDiscountItem.remain;
            arrayList.add(bLiveDiscountSendGiftItem);
        }
        return arrayList;
    }
}
