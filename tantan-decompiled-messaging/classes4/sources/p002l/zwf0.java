package p002l;

import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.GiftSticker;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.ImageSticker;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InteractiveSticker;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerResManager;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p1.mobile.putong.live.base.data.BLivePosition;
import com.tantanapp.common.utils.CrashHelper;
import l.kvc0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zwf0 {
    /* JADX INFO: renamed from: a */
    public static InterfaceC0325c m27668a(BLiveAddStickerResult bLiveAddStickerResult, Act act) {
        VImage imageSticker;
        int iH = -16777216;
        if (TextUtils.equals(bLiveAddStickerResult.category, "interactive")) {
            imageSticker = new InteractiveSticker(act);
            imageSticker.mo5722T(bLiveAddStickerResult, bLiveAddStickerResult.content);
            imageSticker.setMaxCount(bLiveAddStickerResult.maxCount);
            int i = bLiveAddStickerResult.fontSize;
            imageSticker.setTextSize(i == 0 ? 14.0f : i);
            try {
                iH = Color.parseColor("#" + bLiveAddStickerResult.color);
            } catch (IllegalArgumentException e) {
                CrashHelper.c(e);
            }
            imageSticker.setTextColor(iH);
            imageSticker.setTypeface(bLiveAddStickerResult.boldText ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        } else if (TextUtils.equals(bLiveAddStickerResult.category, "gift")) {
            imageSticker = (GiftSticker) act.inflater().inflate(t6c0.f19701U5, (ViewGroup) null);
            imageSticker.mo5722T(bLiveAddStickerResult, bLiveAddStickerResult.content);
            imageSticker.setMaxCount(bLiveAddStickerResult.maxCount);
            VText vText = imageSticker.f4657d;
            int i2 = bLiveAddStickerResult.fontSize;
            vText.setTextSize(i2 == 0 ? 10.0f : i2);
            try {
                iH = kvc0.h("#" + bLiveAddStickerResult.color, -16777216);
            } catch (IllegalArgumentException e2) {
                CrashHelper.c(e2);
            }
            imageSticker.f4657d.setTextColor(iH);
            imageSticker.f4657d.setTypeface(bLiveAddStickerResult.boldText ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        } else {
            imageSticker = new ImageSticker(act);
        }
        imageSticker.mo5721Q(bLiveAddStickerResult, LiveStickerResManager.m5824w().m5842v(bLiveAddStickerResult.url));
        if (!TextUtils.isEmpty(bLiveAddStickerResult.id)) {
            imageSticker.setCustomId(bLiveAddStickerResult.id);
        }
        imageSticker.setTemplateId(bLiveAddStickerResult.templateId);
        imageSticker.setCategory(bLiveAddStickerResult.category);
        BLivePosition bLivePosition = bLiveAddStickerResult.position;
        imageSticker.mo5723e(bLivePosition.x, bLivePosition.y);
        return imageSticker;
    }
}
