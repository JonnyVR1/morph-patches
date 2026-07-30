package com.p051p1.mobile.putong.core.p058ui.intloperation.flash;

import android.R;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IntlFlashStickerOptionData;
import com.p051p1.mobile.putong.core.data.IntlMarketConfigEnvelope;
import com.p051p1.mobile.putong.core.data.IntlMarketResponseEnvelope;
import com.p051p1.mobile.putong.core.p058ui.intloperation.flash.C8547a;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VProgress;
import p153l.c9c0;
import p153l.gsi;
import p153l.i4g0;
import p153l.jxd0;
import p153l.jyb;
import p153l.k3d0;
import p153l.udo;
import p153l.wyd0;
import p153l.x7c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.intloperation.flash.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010 \u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b \u0010!J)\u0010'\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010&\u001a\u0004\u0018\u00010$¢\u0006\u0004\b'\u0010(J\r\u0010*\u001a\u00020)¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u000f¢\u0006\u0004\b,\u0010\u0003R\u0018\u0010/\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/intloperation/flash/a;", "", "<init>", "()V", "Ll/jxd0;", Constants.INAPP_DATA_TAG, "()Ll/jxd0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "source", "Lcom/p1/mobile/putong/core/data/IntlMarketResponseEnvelope;", "data", "", "isUpdateShowNum", "", "f", "(Lcom/p1/mobile/android/app/Act;ILcom/p1/mobile/putong/core/data/IntlMarketResponseEnvelope;Z)V", Constants.INAPP_POSITION, "e", "(I)V", "shapeColor", "", Constants.KEY_RADIUS, "ifUseRippleEffect", "Landroid/graphics/drawable/Drawable;", "b", "(IFZ)Landroid/graphics/drawable/Drawable;", "Lv/VProgress;", "progress", WBConstants.TRANS_PROGRESS_COLOR, "bgColor", "h", "(Lv/VProgress;II)V", "Landroid/widget/TextView;", "tv", "", SocialConstants.PARAM_APP_DESC, "color", RXScreenCaptureService.KEY_INDEX, "(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V", "Ll/wyd0;", "c", "()Ll/wyd0;", "g", "a", "Ll/wyd0;", "flashStickerReminderNum", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class C8547a {

    @NotNull
    public static final C8547a INSTANCE = new C8547a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    public static wyd0 flashStickerReminderNum = new wyd0("regular_sticker_reminder_num_" + CoreModule.m30929H().userId(), "0_0_0");

    /* JADX INFO: renamed from: a */
    public static Unit m47486a(Act act, IntlMarketConfigEnvelope intlMarketConfigEnvelope) {
        intlMarketConfigEnvelope.getClass();
        act.startActivity(FlashStickerAct.INSTANCE.m47485a(act));
        act.overridePendingTransition(x7c0.f192710y, x7c0.f192702q);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Drawable m47487b(@ColorInt int shapeColor, float radius, boolean ifUseRippleEffect) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(shapeColor);
        if (radius != 0.0f) {
            gradientDrawable.setCornerRadius(radius);
        }
        gradientDrawable.setGradientType(0);
        gradientDrawable.setShape(0);
        return !ifUseRippleEffect ? gradientDrawable : new RippleDrawable(ColorStateList.valueOf(k3d0.m148005a(c9c0.f80466w)), gradientDrawable, null);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final wyd0 m47488c() {
        if (flashStickerReminderNum == null) {
            flashStickerReminderNum = new wyd0("regular_sticker_reminder_num_" + CoreModule.m30929H().userId(), "0_0_0");
        }
        wyd0 wyd0Var = flashStickerReminderNum;
        wyd0Var.getClass();
        return wyd0Var;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final jxd0 m47489d() {
        return new jxd0("FlashStickerHelper" + CoreModule.m30929H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: e */
    public final void m47490e(int pos) {
        i4g0.m138523u("e_intl_mkt_time_sticker_button1", "p_intl_mkt_time_sticker_choose", jyb.m147494Y("intl_choose_position", Integer.valueOf(pos)));
    }

    /* JADX INFO: renamed from: f */
    public final void m47491f(@NotNull final Act act, int source, @NotNull IntlMarketResponseEnvelope data, boolean isUpdateShowNum) {
        act.getClass();
        data.getClass();
        if (isUpdateShowNum) {
            udo.INSTANCE.m195519s(m47488c());
        }
        IntlFlashStickerOptionData intlFlashStickerOptionData = data.data.flash_option;
        if (intlFlashStickerOptionData == null || !intlFlashStickerOptionData.active) {
            CoreModule.f18264c.f20292A1.m102932m3(act, new Function1() { // from class: l.isi
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C8547a.m47486a(act, (IntlMarketConfigEnvelope) obj);
                }
            });
        } else {
            new gsi(act).m132051p(data.data.flash_option);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m47492g() {
        flashStickerReminderNum = null;
    }

    /* JADX INFO: renamed from: h */
    public final void m47493h(@NotNull VProgress progress, int progressColor, int bgColor) {
        progress.getClass();
        Drawable drawableMutate = progress.getProgressDrawable().mutate();
        drawableMutate.getClass();
        if (drawableMutate instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawableMutate;
            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
            if (drawableFindDrawableByLayerId instanceof GradientDrawable) {
                ((GradientDrawable) drawableFindDrawableByLayerId).setColor(bgColor);
                layerDrawable.setDrawableByLayerId(R.id.background, drawableFindDrawableByLayerId);
            }
            Drawable drawableFindDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.progress);
            if (drawableFindDrawableByLayerId2 != null) {
                drawableFindDrawableByLayerId2.setColorFilter(progressColor, PorterDuff.Mode.SRC_IN);
                progress.setProgressDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m47494i(@NotNull TextView tv2, @Nullable String desc, @Nullable String color) {
        tv2.getClass();
        if (!TextUtils.isEmpty(color)) {
            tv2.setTextColor(Color.parseColor(color));
        }
        if (TextUtils.isEmpty(desc)) {
            return;
        }
        tv2.setText(desc);
    }
}
