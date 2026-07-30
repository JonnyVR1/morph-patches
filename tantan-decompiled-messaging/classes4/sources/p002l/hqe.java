package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.BLiveEffect;
import com.p1.mobile.putong.live.base.data.BLiveGiftGearEffectInfo;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\t¨\u0006\u0011"}, d2 = {"Ll/hqe;", "", "<init>", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;", "giftItem", "", "goDownload", "a", "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;Z)Z", "b", "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;)Z", "", "effectId", "d", "(Ljava/lang/String;Z)Z", "c", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class hqe {

    @NotNull
    public static final hqe INSTANCE = new hqe();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m14673a(@NotNull BLiveGiftItem giftItem, boolean goDownload) {
        giftItem.getClass();
        if (!giftItem.gear.gearEffects.isEmpty()) {
            return INSTANCE.m14675c(giftItem, goDownload);
        }
        hqe hqeVar = INSTANCE;
        if (!hqeVar.m14674b(giftItem)) {
            return true;
        }
        String str = giftItem.liveResourceId;
        str.getClass();
        return hqeVar.m14676d(str, goDownload);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m14674b(BLiveGiftItem giftItem) {
        return (!giftItem.isHighRankGift() || TextUtils.isEmpty(giftItem.liveResourceId) || giftItem.isFaceGift()) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m14675c(BLiveGiftItem giftItem, boolean goDownload) {
        boolean z = true;
        for (BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo : giftItem.gear.gearEffects) {
            String str = bLiveGiftGearEffectInfo.liveResourceId;
            str.getClass();
            if (str.length() > 0) {
                String str2 = bLiveGiftGearEffectInfo.liveResourceId;
                str2.getClass();
                if (!m14676d(str2, goDownload)) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m14676d(String effectId, boolean goDownload) {
        if (effectId.length() == 0) {
            return false;
        }
        BLiveEffect bLiveEffectM10044h = aqe.m10039i().m10044h(effectId);
        if (bLiveEffectM10044h == null) {
            aqe.m10039i().m10058w(effectId);
            return false;
        }
        if (aqe.m10039i().m10045j(effectId)) {
            return true;
        }
        return spe.m22604d(bLiveEffectM10044h.type).m17695e(bLiveEffectM10044h.id, goDownload, null);
    }
}
