package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveGiftGearEffectInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"Ll/tzj;", "", "<init>", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;", "giftBrief", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;", "giftItem", "Ll/oo2;", "data", "", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/tray/GiftTrayData;", "a", "(Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;Ll/oo2;)Ljava/util/List;", "trayData", "", "c", "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;Lcom/p1/mobile/putong/live/livingroom/increment/gift/tray/GiftTrayData;Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;)V", "", "newCombosNum", "", "b", "(ILcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;)Z", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class tzj {

    @NotNull
    public static final tzj INSTANCE = new tzj();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final List<GiftTrayData> m193673a(@NotNull BLiveGivenGiftBrief giftBrief, @NotNull BLiveGiftItem giftItem, @NotNull oo2 data) {
        giftBrief.getClass();
        giftItem.getClass();
        data.getClass();
        ArrayList arrayList = new ArrayList();
        int i = giftBrief.combos;
        int i2 = giftBrief.num;
        int i3 = i > i2 ? i - i2 : 0;
        if (!wft.m206159b(1)) {
            GiftTrayData giftTrayDataM75336o = GiftTrayData.m75336o(giftItem, giftBrief, data);
            giftTrayDataM75336o.f50950h = data.mo183435j().f45171id;
            giftTrayDataM75336o.f50953k = giftTrayDataM75336o.f50954l + i3;
            m193674c(giftItem, giftTrayDataM75336o, giftBrief);
            arrayList.add(giftTrayDataM75336o);
            return arrayList;
        }
        int i4 = giftBrief.num;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i5 + i3 + 1;
            if (i6 <= giftBrief.threshold || i5 == giftBrief.num - 1 || !INSTANCE.m193675b(i6, giftBrief, giftItem)) {
                GiftTrayData giftTrayDataM75336o2 = GiftTrayData.m75336o(giftItem, giftBrief, data);
                giftTrayDataM75336o2.f50950h = data.mo183435j().f45171id;
                giftTrayDataM75336o2.f50953k = i6;
                m193674c(giftItem, giftTrayDataM75336o2, giftBrief);
                arrayList.add(giftTrayDataM75336o2);
            }
        }
        return arrayList;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m193674c(@NotNull BLiveGiftItem giftItem, @NotNull GiftTrayData trayData, @NotNull BLiveGivenGiftBrief giftBrief) {
        giftItem.getClass();
        trayData.getClass();
        giftBrief.getClass();
        if (!giftBrief.isGear || giftItem.gear.gearEffects.isEmpty()) {
            return;
        }
        for (BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo : giftItem.gear.gearEffects) {
            int i = trayData.f50953k;
            long j = i;
            long j2 = bLiveGiftGearEffectInfo.since;
            if (j >= j2) {
                long j3 = i;
                long j4 = bLiveGiftGearEffectInfo.until;
                if (j3 <= j4 || j4 == -1) {
                    trayData.f50946d = bLiveGiftGearEffectInfo.liveGiftLevel;
                    trayData.f50951i = bLiveGiftGearEffectInfo.trayDuration;
                    trayData.f50967y = bLiveGiftGearEffectInfo.liveResourceId;
                    if (i == ((int) j2)) {
                        trayData.f50955m = true;
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m193675b(int newCombosNum, BLiveGivenGiftBrief giftBrief, BLiveGiftItem giftItem) {
        if (giftBrief.isGear) {
            List<BLiveGiftGearEffectInfo> list = giftItem.gear.gearEffects;
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
