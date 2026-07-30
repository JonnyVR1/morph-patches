package com.clevertap.android.sdk.inapp.fragment;

import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.InAppNotificationActivity;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.media.NoOpMediaHandler;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.p0c0;
import p149l.yom;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\u0003J\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0013J%\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0013J-\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0019J%\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u0013J-\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u0019J-\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFullFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFragment;", "<init>", "()V", "Landroid/widget/RelativeLayout;", "relativeLayout", "Lcom/clevertap/android/sdk/customviews/CloseImageView;", "closeImageView", "", "u4", "(Landroid/widget/RelativeLayout;Lcom/clevertap/android/sdk/customviews/CloseImageView;)V", "V3", "a4", "", "v4", "()Z", "Landroid/widget/FrameLayout$LayoutParams;", "layoutParams", "w4", "(Landroid/widget/RelativeLayout;Landroid/widget/FrameLayout$LayoutParams;Lcom/clevertap/android/sdk/customviews/CloseImageView;)V", "x4", "y4", "Landroid/widget/FrameLayout;", Constants.META_FRESH_APP_LAUNCH, "z4", "(Landroid/widget/RelativeLayout;Landroid/widget/FrameLayout$LayoutParams;Landroid/widget/FrameLayout;Lcom/clevertap/android/sdk/customviews/CloseImageView;)V", "A4", "B4", "C4", "D4", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public abstract class CTInAppBaseFullFragment extends CTInAppBaseFragment {

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFullFragment$a */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"com/clevertap/android/sdk/inapp/fragment/CTInAppBaseFullFragment$a", "Ljava/lang/Runnable;", "", "run", "()V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class RunnableC1243a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CloseImageView f5106a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ RelativeLayout f5107b;

        public RunnableC1243a(CloseImageView closeImageView, RelativeLayout relativeLayout) {
            this.f5106a = closeImageView;
            this.f5107b = relativeLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            int measuredWidth = this.f5106a.getMeasuredWidth() / 2;
            this.f5106a.setX(this.f5107b.getRight() - measuredWidth);
            this.f5106a.setY(this.f5107b.getTop() - measuredWidth);
        }
    }

    /* JADX INFO: renamed from: A4 */
    public final void m6409A4(@NotNull RelativeLayout relativeLayout, @NotNull FrameLayout.LayoutParams layoutParams, @NotNull FrameLayout fl, @NotNull CloseImageView closeImageView) {
        relativeLayout.getClass();
        layoutParams.getClass();
        fl.getClass();
        closeImageView.getClass();
        int measuredWidth = (int) (relativeLayout.getMeasuredWidth() * 1.78f);
        int measuredHeight = fl.getMeasuredHeight() - m6397i4(80);
        if (measuredWidth > measuredHeight) {
            layoutParams.height = measuredHeight;
            layoutParams.width = (int) (measuredHeight / 1.78f);
        } else {
            layoutParams.height = measuredWidth;
        }
        relativeLayout.setLayoutParams(layoutParams);
        m6413u4(relativeLayout, closeImageView);
    }

    /* JADX INFO: renamed from: B4 */
    public final void m6410B4(@NotNull RelativeLayout relativeLayout, @NotNull FrameLayout.LayoutParams layoutParams, @NotNull CloseImageView closeImageView) {
        relativeLayout.getClass();
        layoutParams.getClass();
        closeImageView.getClass();
        layoutParams.width = (int) (relativeLayout.getMeasuredHeight() * 1.78f);
        layoutParams.gravity = 1;
        relativeLayout.setLayoutParams(layoutParams);
        m6413u4(relativeLayout, closeImageView);
    }

    /* JADX INFO: renamed from: C4 */
    public final void m6411C4(@NotNull RelativeLayout relativeLayout, @NotNull FrameLayout.LayoutParams layoutParams, @NotNull FrameLayout fl, @NotNull CloseImageView closeImageView) {
        relativeLayout.getClass();
        layoutParams.getClass();
        fl.getClass();
        closeImageView.getClass();
        int measuredHeight = (int) ((relativeLayout.getMeasuredHeight() - m6397i4(120)) * 1.78f);
        int measuredWidth = fl.getMeasuredWidth() - m6397i4(280);
        if (measuredHeight > measuredWidth) {
            layoutParams.width = measuredWidth;
            layoutParams.height = (int) (measuredWidth / 1.78f);
        } else {
            layoutParams.width = measuredHeight;
            layoutParams.height = relativeLayout.getMeasuredHeight() - m6397i4(120);
        }
        layoutParams.setMargins(m6397i4(140), m6397i4(100), m6397i4(140), m6397i4(100));
        layoutParams.gravity = 17;
        relativeLayout.setLayoutParams(layoutParams);
        m6413u4(relativeLayout, closeImageView);
    }

    /* JADX INFO: renamed from: D4 */
    public final void m6412D4(@NotNull RelativeLayout relativeLayout, @NotNull FrameLayout.LayoutParams layoutParams, @NotNull FrameLayout fl, @NotNull CloseImageView closeImageView) {
        relativeLayout.getClass();
        layoutParams.getClass();
        fl.getClass();
        closeImageView.getClass();
        int measuredHeight = (int) (relativeLayout.getMeasuredHeight() * 1.78f);
        int measuredWidth = fl.getMeasuredWidth() - m6397i4(80);
        if (measuredHeight > measuredWidth) {
            layoutParams.width = measuredWidth;
            layoutParams.height = (int) (measuredWidth / 1.78f);
        } else {
            layoutParams.width = measuredHeight;
        }
        layoutParams.gravity = 17;
        relativeLayout.setLayoutParams(layoutParams);
        m6413u4(relativeLayout, closeImageView);
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment
    /* JADX INFO: renamed from: V3 */
    public void mo6385V3() {
        if (m6396h4() instanceof NoOpMediaHandler) {
            return;
        }
        getLifecycle().mo2969d(m6396h4());
        m6396h4().cleanup();
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment
    /* JADX INFO: renamed from: a4 */
    public void mo6389a4() {
        Object context = getContext();
        if (context instanceof InAppNotificationActivity) {
            m6405r4((yom) context);
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final void m6413u4(@NotNull RelativeLayout relativeLayout, @NotNull CloseImageView closeImageView) {
        relativeLayout.getClass();
        closeImageView.getClass();
        relativeLayout.post(new RunnableC1243a(closeImageView, relativeLayout));
    }

    /* JADX INFO: renamed from: v4 */
    public final boolean m6414v4() {
        if (Utils.m5925v(getActivity())) {
            return false;
        }
        try {
            return getResources().getBoolean(p0c0.f146580a);
        } catch (Exception unused) {
            Logger.m5865d("Failed to decide whether device is a smart phone or tablet!");
            return false;
        }
    }

    /* JADX INFO: renamed from: w4 */
    public final void m6415w4(@NotNull RelativeLayout relativeLayout, @NotNull FrameLayout.LayoutParams layoutParams, @NotNull CloseImageView closeImageView) {
        relativeLayout.getClass();
        layoutParams.getClass();
        closeImageView.getClass();
        layoutParams.height = (int) (relativeLayout.getMeasuredWidth() * 1.3f);
        relativeLayout.setLayoutParams(layoutParams);
        m6413u4(relativeLayout, closeImageView);
    }

    /* JADX INFO: renamed from: x4 */
    public final void m6416x4(@NotNull RelativeLayout relativeLayout, @NotNull FrameLayout.LayoutParams layoutParams, @NotNull CloseImageView closeImageView) {
        relativeLayout.getClass();
        layoutParams.getClass();
        closeImageView.getClass();
        layoutParams.setMargins(m6397i4(140), m6397i4(140), m6397i4(140), m6397i4(140));
        int measuredWidth = relativeLayout.getMeasuredWidth() - m6397i4(210);
        layoutParams.width = measuredWidth;
        layoutParams.height = (int) (measuredWidth * 1.3f);
        relativeLayout.setLayoutParams(layoutParams);
        m6413u4(relativeLayout, closeImageView);
    }

    /* JADX INFO: renamed from: y4 */
    public final void m6417y4(@NotNull RelativeLayout relativeLayout, @NotNull FrameLayout.LayoutParams layoutParams, @NotNull CloseImageView closeImageView) {
        relativeLayout.getClass();
        layoutParams.getClass();
        closeImageView.getClass();
        layoutParams.height = (int) (relativeLayout.getMeasuredWidth() * 1.78f);
        relativeLayout.setLayoutParams(layoutParams);
        m6413u4(relativeLayout, closeImageView);
    }

    /* JADX INFO: renamed from: z4 */
    public final void m6418z4(@NotNull RelativeLayout relativeLayout, @NotNull FrameLayout.LayoutParams layoutParams, @NotNull FrameLayout fl, @NotNull CloseImageView closeImageView) {
        relativeLayout.getClass();
        layoutParams.getClass();
        fl.getClass();
        closeImageView.getClass();
        int measuredWidth = (int) ((relativeLayout.getMeasuredWidth() - m6397i4(200)) * 1.78f);
        int measuredHeight = fl.getMeasuredHeight() - m6397i4(280);
        if (measuredWidth > measuredHeight) {
            layoutParams.height = measuredHeight;
            layoutParams.width = (int) (measuredHeight / 1.78f);
        } else {
            layoutParams.height = measuredWidth;
            layoutParams.width = relativeLayout.getMeasuredWidth() - m6397i4(200);
        }
        layoutParams.setMargins(m6397i4(140), m6397i4(140), m6397i4(140), m6397i4(140));
        relativeLayout.setLayoutParams(layoutParams);
        m6413u4(relativeLayout, closeImageView);
    }
}
