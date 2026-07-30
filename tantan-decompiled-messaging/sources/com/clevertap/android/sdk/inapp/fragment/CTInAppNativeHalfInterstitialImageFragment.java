package com.clevertap.android.sdk.inapp.fragment;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeHalfInterstitialImageFragment;
import com.clevertap.android.sdk.inapp.media.InAppMediaHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.a7c0;
import p149l.c4c0;
import p149l.zom;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppNativeHalfInterstitialImageFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFullFragment;", "<init>", "()V", "Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "W3", "()Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/widget/RelativeLayout;", "H", "Landroid/widget/RelativeLayout;", "relativeLayout", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class CTInAppNativeHalfInterstitialImageFragment extends CTInAppBaseFullFragment {

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    private RelativeLayout relativeLayout;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.fragment.CTInAppNativeHalfInterstitialImageFragment$a */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"com/clevertap/android/sdk/inapp/fragment/CTInAppNativeHalfInterstitialImageFragment$a", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "()V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC1250a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CloseImageView f5127b;

        public ViewTreeObserverOnGlobalLayoutListenerC1250a(CloseImageView closeImageView) {
            this.f5127b = closeImageView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            RelativeLayout relativeLayout = CTInAppNativeHalfInterstitialImageFragment.this.relativeLayout;
            if (relativeLayout == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.getClass();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (CTInAppNativeHalfInterstitialImageFragment.this.m6394f4().getIsTablet() && CTInAppNativeHalfInterstitialImageFragment.this.m6414v4()) {
                CTInAppNativeHalfInterstitialImageFragment cTInAppNativeHalfInterstitialImageFragment = CTInAppNativeHalfInterstitialImageFragment.this;
                CloseImageView closeImageView = this.f5127b;
                closeImageView.getClass();
                cTInAppNativeHalfInterstitialImageFragment.m6415w4(relativeLayout, layoutParams2, closeImageView);
            } else {
                boolean zM6414v4 = CTInAppNativeHalfInterstitialImageFragment.this.m6414v4();
                CTInAppNativeHalfInterstitialImageFragment cTInAppNativeHalfInterstitialImageFragment2 = CTInAppNativeHalfInterstitialImageFragment.this;
                if (zM6414v4) {
                    CloseImageView closeImageView2 = this.f5127b;
                    closeImageView2.getClass();
                    cTInAppNativeHalfInterstitialImageFragment2.m6416x4(relativeLayout, layoutParams2, closeImageView2);
                } else {
                    CloseImageView closeImageView3 = this.f5127b;
                    closeImageView3.getClass();
                    cTInAppNativeHalfInterstitialImageFragment2.m6415w4(relativeLayout, layoutParams2, closeImageView3);
                }
            }
            relativeLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.fragment.CTInAppNativeHalfInterstitialImageFragment$b */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"com/clevertap/android/sdk/inapp/fragment/CTInAppNativeHalfInterstitialImageFragment$b", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "()V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC1251b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CloseImageView f5129b;

        public ViewTreeObserverOnGlobalLayoutListenerC1251b(CloseImageView closeImageView) {
            this.f5129b = closeImageView;
        }

        /* JADX INFO: renamed from: a */
        public static void m6468a(CloseImageView closeImageView, RelativeLayout relativeLayout) {
            relativeLayout.getClass();
            int measuredWidth = closeImageView.getMeasuredWidth() / 2;
            closeImageView.setX(relativeLayout.getRight() - measuredWidth);
            closeImageView.setY(relativeLayout.getTop() - measuredWidth);
        }

        /* JADX INFO: renamed from: b */
        public static void m6469b(CloseImageView closeImageView, RelativeLayout relativeLayout) {
            relativeLayout.getClass();
            int measuredWidth = closeImageView.getMeasuredWidth() / 2;
            closeImageView.setX(relativeLayout.getRight() - measuredWidth);
            closeImageView.setY(relativeLayout.getTop() - measuredWidth);
        }

        /* JADX INFO: renamed from: c */
        public static void m6470c(CloseImageView closeImageView, RelativeLayout relativeLayout) {
            relativeLayout.getClass();
            int measuredWidth = closeImageView.getMeasuredWidth() / 2;
            closeImageView.setX(relativeLayout.getRight() - measuredWidth);
            closeImageView.setY(relativeLayout.getTop() - measuredWidth);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            final RelativeLayout relativeLayout = CTInAppNativeHalfInterstitialImageFragment.this.relativeLayout;
            if (relativeLayout == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.getClass();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (CTInAppNativeHalfInterstitialImageFragment.this.m6394f4().getIsTablet() && CTInAppNativeHalfInterstitialImageFragment.this.m6414v4()) {
                layoutParams2.width = (int) (relativeLayout.getMeasuredHeight() * 1.3f);
                layoutParams2.gravity = 17;
                relativeLayout.setLayoutParams(layoutParams2);
                final CloseImageView closeImageView = this.f5129b;
                relativeLayout.post(new Runnable() { // from class: l.tu3
                    @Override // java.lang.Runnable
                    public final void run() {
                        CTInAppNativeHalfInterstitialImageFragment.ViewTreeObserverOnGlobalLayoutListenerC1251b.m6468a(closeImageView, relativeLayout);
                    }
                });
            } else if (CTInAppNativeHalfInterstitialImageFragment.this.m6414v4()) {
                layoutParams2.setMargins(CTInAppNativeHalfInterstitialImageFragment.this.m6397i4(140), CTInAppNativeHalfInterstitialImageFragment.this.m6397i4(100), CTInAppNativeHalfInterstitialImageFragment.this.m6397i4(140), CTInAppNativeHalfInterstitialImageFragment.this.m6397i4(100));
                int measuredHeight = relativeLayout.getMeasuredHeight() - CTInAppNativeHalfInterstitialImageFragment.this.m6397i4(130);
                layoutParams2.height = measuredHeight;
                layoutParams2.width = (int) (measuredHeight * 1.3f);
                layoutParams2.gravity = 17;
                relativeLayout.setLayoutParams(layoutParams2);
                final CloseImageView closeImageView2 = this.f5129b;
                relativeLayout.post(new Runnable() { // from class: l.ru3
                    @Override // java.lang.Runnable
                    public final void run() {
                        CTInAppNativeHalfInterstitialImageFragment.ViewTreeObserverOnGlobalLayoutListenerC1251b.m6469b(closeImageView2, relativeLayout);
                    }
                });
            } else {
                layoutParams2.width = (int) (relativeLayout.getMeasuredHeight() * 1.3f);
                layoutParams2.gravity = 1;
                relativeLayout.setLayoutParams(layoutParams2);
                final CloseImageView closeImageView3 = this.f5129b;
                relativeLayout.post(new Runnable() { // from class: l.su3
                    @Override // java.lang.Runnable
                    public final void run() {
                        CTInAppNativeHalfInterstitialImageFragment.ViewTreeObserverOnGlobalLayoutListenerC1251b.m6470c(closeImageView3, relativeLayout);
                    }
                });
            }
            relativeLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: E4 */
    public static void m6465E4(CTInAppNativeHalfInterstitialImageFragment cTInAppNativeHalfInterstitialImageFragment, View view) {
        cTInAppNativeHalfInterstitialImageFragment.getClass();
        cTInAppNativeHalfInterstitialImageFragment.m6387Y3(null);
        FragmentActivity activity = cTInAppNativeHalfInterstitialImageFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: F4 */
    public static Unit m6466F4(CTInAppNativeHalfInterstitialImageFragment cTInAppNativeHalfInterstitialImageFragment) {
        cTInAppNativeHalfInterstitialImageFragment.getClass();
        cTInAppNativeHalfInterstitialImageFragment.m6398j4(0);
        return Unit.INSTANCE;
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment
    @NotNull
    /* JADX INFO: renamed from: W3 */
    public InAppMediaHandler mo6386W3() {
        return InAppMediaHandler.INSTANCE.m6517a(this, m6394f4(), getCurrentOrientation(), m6394f4().getIsTablet() && m6414v4(), m6400m4(), true, !m6394f4().m6163f().isEmpty() ? new Function0() { // from class: l.pu3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CTInAppNativeHalfInterstitialImageFragment.m6466F4(this.f151241a);
            }
        } : null, getActiveMediaUrl());
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewTreeObserver viewTreeObserver;
        RelativeLayout relativeLayout;
        ViewTreeObserver viewTreeObserver2;
        inflater.getClass();
        View viewInflate = (m6394f4().getIsTablet() && m6414v4()) ? inflater.inflate(a7c0.f67913v, container, false) : inflater.inflate(a7c0.f67898g, container, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(c4c0.f79230j0);
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(199272);
        frameLayout.setBackground(new ColorDrawable(-1157627904));
        RelativeLayout relativeLayout2 = (RelativeLayout) frameLayout.findViewById(c4c0.f79190M);
        this.relativeLayout = relativeLayout2;
        if (relativeLayout2 != null) {
            relativeLayout2.setBackgroundColor(Color.parseColor(m6394f4().getBackgroundColor()));
        }
        int currentOrientation = getCurrentOrientation();
        if (currentOrientation == 1) {
            RelativeLayout relativeLayout3 = this.relativeLayout;
            if (relativeLayout3 != null && (viewTreeObserver = relativeLayout3.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1250a(closeImageView));
            }
        } else if (currentOrientation == 2 && (relativeLayout = this.relativeLayout) != null && (viewTreeObserver2 = relativeLayout.getViewTreeObserver()) != null) {
            viewTreeObserver2.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1251b(closeImageView));
        }
        m6396h4().setup(this.relativeLayout, new zom(c4c0.f79188L, true, c4c0.f79201R0, c4c0.f79182I), new CTInAppBaseFragment.ViewOnClickListenerC1241a());
        closeImageView.setOnClickListener(new View.OnClickListener() { // from class: l.qu3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CTInAppNativeHalfInterstitialImageFragment.m6465E4(this.f156423a, view);
            }
        });
        if (m6394f4().getIsHideCloseButton()) {
            closeImageView.setVisibility(0);
            return viewInflate;
        }
        closeImageView.setVisibility(8);
        return viewInflate;
    }
}
