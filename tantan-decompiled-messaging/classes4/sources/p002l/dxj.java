package p002l;

import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p1.mobile.putong.live.base.data.BLiveGiftGearEffectInfo;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import l.vdt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ll/dxj;", "", "<init>", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;", "giftBrief", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;", "giftItem", "Ll/ho2;", "data", "", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/tray/GiftTrayData;", "a", "(Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;Ll/ho2;)Ljava/util/List;", "trayData", "", "c", "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;Lcom/p1/mobile/putong/live/livingroom/increment/gift/tray/GiftTrayData;Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;)V", "", "newCombosNum", "", "b", "(ILcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;)Z", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class dxj {

    @NotNull
    public static final dxj INSTANCE = new dxj();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final List<GiftTrayData> m12086a(@NotNull BLiveGivenGiftBrief giftBrief, @NotNull BLiveGiftItem giftItem, @NotNull ho2 data) {
        giftBrief.getClass();
        giftItem.getClass();
        data.getClass();
        ArrayList arrayList = new ArrayList();
        int i = giftBrief.combos;
        int i2 = giftBrief.num;
        int i3 = i > i2 ? i - i2 : 0;
        if (!vdt.b(1)) {
            GiftTrayData giftTrayDataM7718o = GiftTrayData.m7718o(giftItem, giftBrief, data);
            giftTrayDataM7718o.f6144h = data.m17234j().id;
            giftTrayDataM7718o.f6147k = giftTrayDataM7718o.f6148l + i3;
            m12087c(giftItem, giftTrayDataM7718o, giftBrief);
            arrayList.add(giftTrayDataM7718o);
            return arrayList;
        }
        int i4 = giftBrief.num;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i5 + i3 + 1;
            if (i6 <= giftBrief.threshold || i5 == giftBrief.num - 1 || !INSTANCE.m12088b(i6, giftBrief, giftItem)) {
                GiftTrayData giftTrayDataM7718o2 = GiftTrayData.m7718o(giftItem, giftBrief, data);
                giftTrayDataM7718o2.f6144h = data.m17234j().id;
                giftTrayDataM7718o2.f6147k = i6;
                m12087c(giftItem, giftTrayDataM7718o2, giftBrief);
                arrayList.add(giftTrayDataM7718o2);
            }
        }
        return arrayList;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m12087c(@NotNull BLiveGiftItem giftItem, @NotNull GiftTrayData trayData, @NotNull BLiveGivenGiftBrief giftBrief) {
        giftItem.getClass();
        trayData.getClass();
        giftBrief.getClass();
        if (!giftBrief.isGear || giftItem.gear.gearEffects.isEmpty()) {
            return;
        }
        for (BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo : giftItem.gear.gearEffects) {
            int i = trayData.f6147k;
            long j = i;
            long j2 = bLiveGiftGearEffectInfo.since;
            if (j >= j2) {
                long j3 = i;
                long j4 = bLiveGiftGearEffectInfo.until;
                if (j3 <= j4 || j4 == -1) {
                    trayData.f6140d = bLiveGiftGearEffectInfo.liveGiftLevel;
                    trayData.f6145i = bLiveGiftGearEffectInfo.trayDuration;
                    trayData.f6161y = bLiveGiftGearEffectInfo.liveResourceId;
                    if (i == ((int) j2)) {
                        trayData.f6149m = true;
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12088b(int newCombosNum, BLiveGivenGiftBrief giftBrief, BLiveGiftItem giftItem) {
        if (giftBrief.isGear) {
            List list = giftItem.gear.gearEffects;
            list.getClass();
            if (!list.isEmpty()) {
                for (BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo : giftItem.gear.gearEffects) {
                    if (((int) bLiveGiftGearEffectInfo.since) == newCombosNum) {
                        return false;
                    }
                    long j = bLiveGiftGearEffectInfo.until;
                    if (j != -1 && ((int) j) == newCombosNum) {
                        return false;
                    }
                }
            }
        }
        long j2 = giftBrief.step;
        return newCombosNum % ((j2 > 0L ? 1 : (j2 == 0L ? 0 : -1)) == 0 ? 1 : (int) j2) != 0;
    }
}
