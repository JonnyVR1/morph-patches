package com.clevertap.android.sdk.inapp.fragment;

import android.content.Context;
import android.graphics.Color;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.p046p1.mobile.putong.data.ResourceDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b \u0018\u0000 /2\u00020\u00012\u00020\u00022\u00020\u0003:\u000201B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020 8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010.\u001a\u0004\u0018\u00010\u000b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00062"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBasePartialNativeFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBasePartialFragment;", "Landroid/view/View$OnTouchListener;", "Landroid/view/View$OnLongClickListener;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", ResourceDirection.f38808v, "", "onLongClick", "(Landroid/view/View;)Z", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Landroid/widget/Button;", "mainButton", "secondaryButton", "y4", "(Landroid/widget/Button;Landroid/widget/Button;)V", "inAppButton", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;", "inAppNotificationButton", "", "buttonIndex", "B4", "(Landroid/widget/Button;Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;I)V", "Landroid/view/GestureDetector;", "I", "Landroid/view/GestureDetector;", "w4", "()Landroid/view/GestureDetector;", "z4", "(Landroid/view/GestureDetector;)V", "gd", "J", "Landroid/view/View;", "x4", "()Landroid/view/View;", "A4", "(Landroid/view/View;)V", "inAppView", "Companion", "a", "b", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public abstract class CTInAppBasePartialNativeFragment extends CTInAppBasePartialFragment implements View.OnTouchListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    protected GestureDetector gd;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @Nullable
    private View inAppView;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.fragment.CTInAppBasePartialNativeFragment$b */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000e\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBasePartialNativeFragment$b;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "<init>", "(Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBasePartialNativeFragment;)V", "Landroid/view/MotionEvent;", "e", "", "onDown", "(Landroid/view/MotionEvent;)Z", "e1", "e2", "", "velocityX", "velocityY", "onFling", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "ltr", "a", "(Z)Z", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public final class C1247b extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.fragment.CTInAppBasePartialNativeFragment$b$a */
        @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m87232d2 = {"com/clevertap/android/sdk/inapp/fragment/CTInAppBasePartialNativeFragment$b$a", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "onAnimationRepeat", "onAnimationStart", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
        public static final class a implements Animation.AnimationListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ CTInAppBasePartialNativeFragment f5118a;

            public a(CTInAppBasePartialNativeFragment cTInAppBasePartialNativeFragment) {
                this.f5118a = cTInAppBasePartialNativeFragment;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                this.f5118a.m6387Y3(null);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        public C1247b() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m6446a(boolean ltr) {
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(ltr ? new TranslateAnimation(0.0f, CTInAppBasePartialNativeFragment.this.m6397i4(50), 0.0f, 0.0f) : new TranslateAnimation(0.0f, -CTInAppBasePartialNativeFragment.this.m6397i4(50), 0.0f, 0.0f));
            animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
            animationSet.setDuration(300L);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setAnimationListener(new a(CTInAppBasePartialNativeFragment.this));
            View inAppView = CTInAppBasePartialNativeFragment.this.getInAppView();
            if (inAppView != null) {
                inAppView.startAnimation(animationSet);
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(@NotNull MotionEvent e) {
            e.getClass();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(@Nullable MotionEvent e1, @NotNull MotionEvent e2, float velocityX, float velocityY) {
            e2.getClass();
            if (e1 == null) {
                return false;
            }
            if (e1.getX() - e2.getX() > 120.0f && Math.abs(velocityX) > 200.0d) {
                return m6446a(false);
            }
            if (e2.getX() - e1.getX() <= 120.0f || Math.abs(velocityX) <= 200.0d) {
                return false;
            }
            return m6446a(true);
        }
    }

    /* JADX INFO: renamed from: A4 */
    public final void m6440A4(@Nullable View view) {
        this.inAppView = view;
    }

    /* JADX INFO: renamed from: B4 */
    public final void m6441B4(@NotNull Button inAppButton, @Nullable CTInAppNotificationButton inAppNotificationButton, int buttonIndex) {
        inAppButton.getClass();
        if (inAppNotificationButton == null) {
            inAppButton.setVisibility(8);
            return;
        }
        inAppButton.setTag(Integer.valueOf(buttonIndex));
        inAppButton.setVisibility(0);
        inAppButton.setText(inAppNotificationButton.getText());
        inAppButton.setTextColor(Color.parseColor(inAppNotificationButton.getTextColor()));
        inAppButton.setBackgroundColor(Color.parseColor(inAppNotificationButton.getBackgroundColor()));
        inAppButton.setOnClickListener(new CTInAppBaseFragment.ViewOnClickListenerC1241a());
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        context.getClass();
        super.onAttach(context);
        m6445z4(new GestureDetector(context, new C1247b()));
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(@Nullable View v2) {
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@Nullable View v2, @NotNull MotionEvent event) {
        event.getClass();
        return m6442w4().onTouchEvent(event) || event.getAction() == 2;
    }

    @NotNull
    /* JADX INFO: renamed from: w4 */
    public final GestureDetector m6442w4() {
        GestureDetector gestureDetector = this.gd;
        if (gestureDetector != null) {
            return gestureDetector;
        }
        Intrinsics.m87502r("gd");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: x4, reason: from getter */
    public final View getInAppView() {
        return this.inAppView;
    }

    /* JADX INFO: renamed from: y4 */
    public final void m6444y4(@NotNull Button mainButton, @NotNull Button secondaryButton) {
        mainButton.getClass();
        secondaryButton.getClass();
        secondaryButton.setVisibility(8);
        mainButton.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 2.0f));
        secondaryButton.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.0f));
    }

    /* JADX INFO: renamed from: z4 */
    public final void m6445z4(@NotNull GestureDetector gestureDetector) {
        gestureDetector.getClass();
        this.gd = gestureDetector;
    }
}
