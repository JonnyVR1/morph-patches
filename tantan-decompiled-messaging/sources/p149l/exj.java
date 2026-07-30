package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveGiftGearEffectInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m87232d2 = {"Ll/exj;", "", "<init>", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;", "giftBrief", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;", "giftItem", "", "tmpLiveId", "", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/tray/GiftTrayData;", "a", "(Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;Ljava/lang/String;)Ljava/util/List;", "trayData", "", "c", "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;Lcom/p1/mobile/putong/live/livingroom/increment/gift/tray/GiftTrayData;Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;)V", "", "newCombosNum", "", "b", "(ILcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;)Z", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class exj {

    @NotNull
    public static final exj INSTANCE = new exj();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final List<GiftTrayData> m118669a(@NotNull BLiveGivenGiftBrief giftBrief, @NotNull BLiveGiftItem giftItem, @NotNull String tmpLiveId) {
        giftBrief.getClass();
        giftItem.getClass();
        tmpLiveId.getClass();
        ArrayList arrayList = new ArrayList();
        int i = giftBrief.combos;
        int i2 = giftBrief.num;
        int i3 = i > i2 ? i - i2 : 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i4 + i3 + 1;
            if (i5 <= giftBrief.threshold || i4 == giftBrief.num - 1 || !INSTANCE.m118671b(i5, giftBrief, giftItem)) {
                GiftTrayData giftTrayDataM74153o = GiftTrayData.m74153o(giftItem, giftBrief, null);
                giftTrayDataM74153o.f50102h = tmpLiveId;
                giftTrayDataM74153o.f50105k = i5;
                m118670c(giftItem, giftTrayDataM74153o, giftBrief);
                arrayList.add(giftTrayDataM74153o);
            }
        }
        return arrayList;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m118670c(@NotNull BLiveGiftItem giftItem, @NotNull GiftTrayData trayData, @NotNull BLiveGivenGiftBrief giftBrief) {
        giftItem.getClass();
        trayData.getClass();
        giftBrief.getClass();
        if (!giftBrief.isGear || giftItem.gear.gearEffects.isEmpty()) {
            return;
        }
        for (BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo : giftItem.gear.gearEffects) {
            int i = trayData.f50105k;
            long j = i;
            long j2 = bLiveGiftGearEffectInfo.since;
            if (j >= j2) {
                long j3 = i;
                long j4 = bLiveGiftGearEffectInfo.until;
                if (j3 <= j4 || j4 == -1) {
                    trayData.f50098d = bLiveGiftGearEffectInfo.liveGiftLevel;
                    trayData.f50103i = bLiveGiftGearEffectInfo.trayDuration;
                    trayData.f50119y = bLiveGiftGearEffectInfo.liveResourceId;
                    if (i == ((int) j2)) {
                        trayData.f50107m = true;
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m118671b(int newCombosNum, BLiveGivenGiftBrief giftBrief, BLiveGiftItem giftItem) {
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
