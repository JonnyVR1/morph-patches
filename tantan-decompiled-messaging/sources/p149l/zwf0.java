package p149l;

import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.Interactive;
import com.p046p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p046p1.mobile.putong.live.base.data.BLivePosition;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.GiftSticker;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.ImageSticker;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InteractiveSticker;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerResManager;
import com.tantanapp.common.utils.CrashHelper;
import p147v.VText;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class zwf0 {
    /* JADX INFO: renamed from: a */
    public static InterfaceC12736c m220591a(BLiveAddStickerResult bLiveAddStickerResult, Act act) {
        InterfaceC12736c imageSticker;
        boolean zEquals = TextUtils.equals(bLiveAddStickerResult.category, Interactive.TYPE);
        int iM147359h = RoundedDrawable.DEFAULT_BORDER_COLOR;
        if (zEquals) {
            InteractiveSticker interactiveSticker = new InteractiveSticker(act);
            interactiveSticker.mo72249T(bLiveAddStickerResult, bLiveAddStickerResult.content);
            interactiveSticker.setMaxCount(bLiveAddStickerResult.maxCount);
            int i = bLiveAddStickerResult.fontSize;
            interactiveSticker.setTextSize(i == 0 ? 14.0f : i);
            try {
                iM147359h = Color.parseColor("#" + bLiveAddStickerResult.color);
            } catch (IllegalArgumentException e) {
                CrashHelper.m81296c(e);
            }
            interactiveSticker.setTextColor(iM147359h);
            interactiveSticker.setTypeface(bLiveAddStickerResult.boldText ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            imageSticker = interactiveSticker;
        } else if (TextUtils.equals(bLiveAddStickerResult.category, "gift")) {
            GiftSticker giftSticker = (GiftSticker) act.inflater().inflate(t6c0.f168205U5, (ViewGroup) null);
            giftSticker.mo72249T(bLiveAddStickerResult, bLiveAddStickerResult.content);
            giftSticker.setMaxCount(bLiveAddStickerResult.maxCount);
            VText vText = giftSticker.f48615d;
            int i2 = bLiveAddStickerResult.fontSize;
            vText.setTextSize(i2 == 0 ? 10.0f : i2);
            try {
                iM147359h = kvc0.m147359h("#" + bLiveAddStickerResult.color, RoundedDrawable.DEFAULT_BORDER_COLOR);
            } catch (IllegalArgumentException e2) {
                CrashHelper.m81296c(e2);
            }
            giftSticker.f48615d.setTextColor(iM147359h);
            giftSticker.f48615d.setTypeface(bLiveAddStickerResult.boldText ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            imageSticker = giftSticker;
        } else {
            imageSticker = new ImageSticker(act);
        }
        imageSticker.mo72248Q(bLiveAddStickerResult, LiveStickerResManager.m72347w().m72365v(bLiveAddStickerResult.url));
        if (!TextUtils.isEmpty(bLiveAddStickerResult.f44329id)) {
            imageSticker.setCustomId(bLiveAddStickerResult.f44329id);
        }
        imageSticker.setTemplateId(bLiveAddStickerResult.templateId);
        imageSticker.setCategory(bLiveAddStickerResult.category);
        BLivePosition bLivePosition = bLiveAddStickerResult.position;
        imageSticker.mo72250e(bLivePosition.f44430x, bLivePosition.f44431y);
        return imageSticker;
    }
}
