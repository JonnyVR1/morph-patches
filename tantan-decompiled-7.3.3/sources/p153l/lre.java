package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftGearEffectInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\t¨\u0006\u0011"}, m88121d2 = {"Ll/lre;", "", "<init>", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;", "giftItem", "", "goDownload", "a", "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;Z)Z", "b", "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;)Z", "", "effectId", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Z)Z", "c", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class lre {

    @NotNull
    public static final lre INSTANCE = new lre();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m155614a(@NotNull BLiveGiftItem giftItem, boolean goDownload) {
        giftItem.getClass();
        if (!giftItem.gear.gearEffects.isEmpty()) {
            return INSTANCE.m155616c(giftItem, goDownload);
        }
        lre lreVar = INSTANCE;
        if (!lreVar.m155615b(giftItem)) {
            return true;
        }
        String str = giftItem.liveResourceId;
        str.getClass();
        return lreVar.m155617d(str, goDownload);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m155615b(BLiveGiftItem giftItem) {
        return (!giftItem.isHighRankGift() || TextUtils.isEmpty(giftItem.liveResourceId) || giftItem.isFaceGift()) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m155616c(BLiveGiftItem giftItem, boolean goDownload) {
        boolean z = true;
        for (BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo : giftItem.gear.gearEffects) {
            String str = bLiveGiftGearEffectInfo.liveResourceId;
            str.getClass();
            if (str.length() > 0) {
                String str2 = bLiveGiftGearEffectInfo.liveResourceId;
                str2.getClass();
                if (!m155617d(str2, goDownload)) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m155617d(String effectId, boolean goDownload) {
        if (effectId.length() == 0) {
            return false;
        }
        BLiveEffect bLiveEffectM122151h = ere.m122146i().m122151h(effectId);
        if (bLiveEffectM122151h == null) {
            ere.m122146i().m122165w(effectId);
            return false;
        }
        if (ere.m122146i().m122152j(effectId)) {
            return true;
        }
        return wqe.m207509d(bLiveEffectM122151h.type).m152744e(bLiveEffectM122151h.f45207id, goDownload, null);
    }
}
