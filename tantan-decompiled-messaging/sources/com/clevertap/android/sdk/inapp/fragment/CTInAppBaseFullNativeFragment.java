package com.clevertap.android.sdk.inapp.fragment;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.Button;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15385c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFullNativeFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFullFragment;", "<init>", "()V", "", "E4", "()I", "Landroid/widget/Button;", "inAppButton", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;", "inAppNotificationButton", "buttonIndex", "", "F4", "(Landroid/widget/Button;Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;I)V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public abstract class CTInAppBaseFullNativeFragment extends CTInAppBaseFullFragment {
    /* JADX INFO: renamed from: E4 */
    private final int m6429E4() {
        int i;
        WindowManager windowManager = (WindowManager) requireContext().getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        if (windowManager == null) {
            return 160;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            i = requireContext().getResources().getConfiguration().densityDpi;
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            i = displayMetrics.densityDpi;
        }
        if (i > 0) {
            return i;
        }
        return 160;
    }

    /* JADX INFO: renamed from: F4 */
    public final void m6430F4(@NotNull Button inAppButton, @Nullable CTInAppNotificationButton inAppNotificationButton, int buttonIndex) {
        ShapeDrawable shapeDrawable;
        inAppButton.getClass();
        if (inAppNotificationButton == null) {
            inAppButton.setVisibility(8);
            return;
        }
        inAppButton.setVisibility(0);
        inAppButton.setTag(Integer.valueOf(buttonIndex));
        inAppButton.setText(inAppNotificationButton.getText());
        inAppButton.setTextColor(Color.parseColor(inAppNotificationButton.getTextColor()));
        inAppButton.setOnClickListener(new CTInAppBaseFragment.ViewOnClickListenerC1241a());
        ShapeDrawable shapeDrawable2 = null;
        if (inAppNotificationButton.getBorderRadius().length() > 0) {
            Float fM93473n = C15385c.m93473n(inAppNotificationButton.getBorderRadius());
            float fFloatValue = (fM93473n != null ? fM93473n.floatValue() : 0.0f) * (480.0f / m6429E4()) * 2.0f;
            shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{fFloatValue, fFloatValue, fFloatValue, fFloatValue, fFloatValue, fFloatValue, fFloatValue, fFloatValue}, null, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}));
            shapeDrawable.getPaint().setColor(Color.parseColor(inAppNotificationButton.getBackgroundColor()));
            shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
            shapeDrawable.getPaint().setAntiAlias(true);
            shapeDrawable2 = new ShapeDrawable(new RoundRectShape(new float[]{fFloatValue, fFloatValue, fFloatValue, fFloatValue, fFloatValue, fFloatValue, fFloatValue, fFloatValue}, null, new float[]{fFloatValue, fFloatValue, fFloatValue, fFloatValue, fFloatValue, fFloatValue, fFloatValue, fFloatValue}));
        } else {
            shapeDrawable = null;
        }
        if (inAppNotificationButton.getBorderColor().length() != 0 && shapeDrawable2 != null) {
            shapeDrawable2.getPaint().setColor(Color.parseColor(inAppNotificationButton.getBorderColor()));
            shapeDrawable2.setPadding(1, 1, 1, 1);
            shapeDrawable2.getPaint().setStyle(Paint.Style.FILL);
        }
        if (shapeDrawable == null || shapeDrawable2 == null) {
            return;
        }
        inAppButton.setBackground(new LayerDrawable(new Drawable[]{shapeDrawable2, shapeDrawable}));
    }
}
