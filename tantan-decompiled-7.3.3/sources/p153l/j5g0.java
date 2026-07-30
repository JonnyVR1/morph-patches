package p153l;

import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.Interactive;
import com.p051p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p051p1.mobile.putong.live.base.data.BLivePosition;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.GiftSticker;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.ImageSticker;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InteractiveSticker;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerResManager;
import com.tantanapp.common.utils.CrashHelper;
import p151v.VText;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class j5g0 {
    /* JADX INFO: renamed from: a */
    public static InterfaceC12899c m143525a(BLiveAddStickerResult bLiveAddStickerResult, Act act) {
        InterfaceC12899c imageSticker;
        boolean zEquals = TextUtils.equals(bLiveAddStickerResult.category, Interactive.TYPE);
        int iM161284h = RoundedDrawable.DEFAULT_BORDER_COLOR;
        if (zEquals) {
            InteractiveSticker interactiveSticker = new InteractiveSticker(act);
            interactiveSticker.mo73432T(bLiveAddStickerResult, bLiveAddStickerResult.content);
            interactiveSticker.setMaxCount(bLiveAddStickerResult.maxCount);
            int i = bLiveAddStickerResult.fontSize;
            interactiveSticker.setTextSize(i == 0 ? 14.0f : i);
            try {
                iM161284h = Color.parseColor("#" + bLiveAddStickerResult.color);
            } catch (IllegalArgumentException e) {
                CrashHelper.m82479c(e);
            }
            interactiveSticker.setTextColor(iM161284h);
            interactiveSticker.setTypeface(bLiveAddStickerResult.boldText ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            imageSticker = interactiveSticker;
        } else if (TextUtils.equals(bLiveAddStickerResult.category, "gift")) {
            GiftSticker giftSticker = (GiftSticker) act.inflater().inflate(yec0.f198937U5, (ViewGroup) null);
            giftSticker.mo73432T(bLiveAddStickerResult, bLiveAddStickerResult.content);
            giftSticker.setMaxCount(bLiveAddStickerResult.maxCount);
            VText vText = giftSticker.f49463d;
            int i2 = bLiveAddStickerResult.fontSize;
            vText.setTextSize(i2 == 0 ? 10.0f : i2);
            try {
                iM161284h = n3d0.m161284h("#" + bLiveAddStickerResult.color, RoundedDrawable.DEFAULT_BORDER_COLOR);
            } catch (IllegalArgumentException e2) {
                CrashHelper.m82479c(e2);
            }
            giftSticker.f49463d.setTextColor(iM161284h);
            giftSticker.f49463d.setTypeface(bLiveAddStickerResult.boldText ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            imageSticker = giftSticker;
        } else {
            imageSticker = new ImageSticker(act);
        }
        imageSticker.mo73431Q(bLiveAddStickerResult, LiveStickerResManager.m73530w().m73548v(bLiveAddStickerResult.url));
        if (!TextUtils.isEmpty(bLiveAddStickerResult.f45177id)) {
            imageSticker.setCustomId(bLiveAddStickerResult.f45177id);
        }
        imageSticker.setTemplateId(bLiveAddStickerResult.templateId);
        imageSticker.setCategory(bLiveAddStickerResult.category);
        BLivePosition bLivePosition = bLiveAddStickerResult.position;
        imageSticker.mo73433e(bLivePosition.f45278x, bLivePosition.f45279y);
        return imageSticker;
    }
}
