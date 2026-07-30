package com.p046p1.mobile.putong.core.p053ui.intloperation.flash;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.IntlFlashStickerOptionData;
import com.p046p1.mobile.putong.core.data.IntlMarketConfigEnvelope;
import com.p046p1.mobile.putong.core.data.IntlMarketResponseEnvelope;
import com.p046p1.mobile.putong.core.p053ui.intloperation.flash.C8384a;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VProgress;
import p149l.hpd0;
import p149l.hvc0;
import p149l.kpi;
import p149l.rzb0;
import p149l.ubo;
import p149l.uqd0;
import p149l.vwb;
import p149l.w0c0;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.intloperation.flash.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010 \u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b \u0010!J)\u0010'\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010&\u001a\u0004\u0018\u00010$¢\u0006\u0004\b'\u0010(J\r\u0010*\u001a\u00020)¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u000f¢\u0006\u0004\b,\u0010\u0003R\u0018\u0010/\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/intloperation/flash/a;", "", "<init>", "()V", "Ll/hpd0;", Constants.INAPP_DATA_TAG, "()Ll/hpd0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "source", "Lcom/p1/mobile/putong/core/data/IntlMarketResponseEnvelope;", "data", "", "isUpdateShowNum", "", "f", "(Lcom/p1/mobile/android/app/Act;ILcom/p1/mobile/putong/core/data/IntlMarketResponseEnvelope;Z)V", Constants.INAPP_POSITION, "e", "(I)V", "shapeColor", "", Constants.KEY_RADIUS, "ifUseRippleEffect", "Landroid/graphics/drawable/Drawable;", "b", "(IFZ)Landroid/graphics/drawable/Drawable;", "Lv/VProgress;", "progress", WBConstants.TRANS_PROGRESS_COLOR, "bgColor", "h", "(Lv/VProgress;II)V", "Landroid/widget/TextView;", "tv", "", SocialConstants.PARAM_APP_DESC, "color", RXScreenCaptureService.KEY_INDEX, "(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V", "Ll/uqd0;", "c", "()Ll/uqd0;", "g", "a", "Ll/uqd0;", "flashStickerReminderNum", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class C8384a {

    @NotNull
    public static final C8384a INSTANCE = new C8384a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    public static uqd0 flashStickerReminderNum = new uqd0("regular_sticker_reminder_num_" + CoreModule.m29931H().userId(), "0_0_0");

    /* JADX INFO: renamed from: a */
    public static Unit m46303a(Act act, IntlMarketConfigEnvelope intlMarketConfigEnvelope) {
        intlMarketConfigEnvelope.getClass();
        act.startActivity(FlashStickerAct.INSTANCE.m46302a(act));
        act.overridePendingTransition(rzb0.f161653y, rzb0.f161645q);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Drawable m46304b(@ColorInt int shapeColor, float radius, boolean ifUseRippleEffect) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(shapeColor);
        if (radius != 0.0f) {
            gradientDrawable.setCornerRadius(radius);
        }
        gradientDrawable.setGradientType(0);
        gradientDrawable.setShape(0);
        return !ifUseRippleEffect ? gradientDrawable : new RippleDrawable(ColorStateList.valueOf(hvc0.m133154a(w0c0.f183896w)), gradientDrawable, null);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final uqd0 m46305c() {
        if (flashStickerReminderNum == null) {
            flashStickerReminderNum = new uqd0("regular_sticker_reminder_num_" + CoreModule.m29931H().userId(), "0_0_0");
        }
        uqd0 uqd0Var = flashStickerReminderNum;
        uqd0Var.getClass();
        return uqd0Var;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final hpd0 m46306d() {
        return new hpd0("FlashStickerHelper" + CoreModule.m29931H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: e */
    public final void m46307e(int pos) {
        zvf0.m220399u("e_intl_mkt_time_sticker_button1", "p_intl_mkt_time_sticker_choose", vwb.m200311Y("intl_choose_position", Integer.valueOf(pos)));
    }

    /* JADX INFO: renamed from: f */
    public final void m46308f(@NotNull final Act act, int source, @NotNull IntlMarketResponseEnvelope data, boolean isUpdateShowNum) {
        act.getClass();
        data.getClass();
        if (isUpdateShowNum) {
            ubo.INSTANCE.m192898s(m46305c());
        }
        IntlFlashStickerOptionData intlFlashStickerOptionData = data.data.flash_option;
        if (intlFlashStickerOptionData == null || !intlFlashStickerOptionData.active) {
            CoreModule.f17545c.f19550A1.m182436m3(act, new Function1() { // from class: l.mpi
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C8384a.m46303a(act, (IntlMarketConfigEnvelope) obj);
                }
            });
        } else {
            new kpi(act).m146868p(data.data.flash_option);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m46309g() {
        flashStickerReminderNum = null;
    }

    /* JADX INFO: renamed from: h */
    public final void m46310h(@NotNull VProgress progress, int progressColor, int bgColor) {
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
    public final void m46311i(@NotNull TextView tv2, @Nullable String desc, @Nullable String color) {
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
