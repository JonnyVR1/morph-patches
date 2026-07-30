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
import p153l.brm;
import p153l.efc0;
import p153l.icc0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppNativeHalfInterstitialImageFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFullFragment;", "<init>", "()V", "Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "W3", "()Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/widget/RelativeLayout;", "H", "Landroid/widget/RelativeLayout;", "relativeLayout", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class CTInAppNativeHalfInterstitialImageFragment extends CTInAppBaseFullFragment {

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    private RelativeLayout relativeLayout;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.fragment.CTInAppNativeHalfInterstitialImageFragment$a */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"com/clevertap/android/sdk/inapp/fragment/CTInAppNativeHalfInterstitialImageFragment$a", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "()V", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC1273a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CloseImageView f5164b;

        public ViewTreeObserverOnGlobalLayoutListenerC1273a(CloseImageView closeImageView) {
            this.f5164b = closeImageView;
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
            if (CTInAppNativeHalfInterstitialImageFragment.this.m6448f4().getIsTablet() && CTInAppNativeHalfInterstitialImageFragment.this.m6468v4()) {
                CTInAppNativeHalfInterstitialImageFragment cTInAppNativeHalfInterstitialImageFragment = CTInAppNativeHalfInterstitialImageFragment.this;
                CloseImageView closeImageView = this.f5164b;
                closeImageView.getClass();
                cTInAppNativeHalfInterstitialImageFragment.m6469w4(relativeLayout, layoutParams2, closeImageView);
            } else {
                boolean zM6468v4 = CTInAppNativeHalfInterstitialImageFragment.this.m6468v4();
                CTInAppNativeHalfInterstitialImageFragment cTInAppNativeHalfInterstitialImageFragment2 = CTInAppNativeHalfInterstitialImageFragment.this;
                if (zM6468v4) {
                    CloseImageView closeImageView2 = this.f5164b;
                    closeImageView2.getClass();
                    cTInAppNativeHalfInterstitialImageFragment2.m6470x4(relativeLayout, layoutParams2, closeImageView2);
                } else {
                    CloseImageView closeImageView3 = this.f5164b;
                    closeImageView3.getClass();
                    cTInAppNativeHalfInterstitialImageFragment2.m6469w4(relativeLayout, layoutParams2, closeImageView3);
                }
            }
            relativeLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.fragment.CTInAppNativeHalfInterstitialImageFragment$b */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"com/clevertap/android/sdk/inapp/fragment/CTInAppNativeHalfInterstitialImageFragment$b", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "()V", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC1274b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CloseImageView f5166b;

        public ViewTreeObserverOnGlobalLayoutListenerC1274b(CloseImageView closeImageView) {
            this.f5166b = closeImageView;
        }

        /* JADX INFO: renamed from: a */
        public static void m6522a(CloseImageView closeImageView, RelativeLayout relativeLayout) {
            relativeLayout.getClass();
            int measuredWidth = closeImageView.getMeasuredWidth() / 2;
            closeImageView.setX(relativeLayout.getRight() - measuredWidth);
            closeImageView.setY(relativeLayout.getTop() - measuredWidth);
        }

        /* JADX INFO: renamed from: b */
        public static void m6523b(CloseImageView closeImageView, RelativeLayout relativeLayout) {
            relativeLayout.getClass();
            int measuredWidth = closeImageView.getMeasuredWidth() / 2;
            closeImageView.setX(relativeLayout.getRight() - measuredWidth);
            closeImageView.setY(relativeLayout.getTop() - measuredWidth);
        }

        /* JADX INFO: renamed from: c */
        public static void m6524c(CloseImageView closeImageView, RelativeLayout relativeLayout) {
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
            if (CTInAppNativeHalfInterstitialImageFragment.this.m6448f4().getIsTablet() && CTInAppNativeHalfInterstitialImageFragment.this.m6468v4()) {
                layoutParams2.width = (int) (relativeLayout.getMeasuredHeight() * 1.3f);
                layoutParams2.gravity = 17;
                relativeLayout.setLayoutParams(layoutParams2);
                final CloseImageView closeImageView = this.f5166b;
                relativeLayout.post(new Runnable() { // from class: l.sv3
                    @Override // java.lang.Runnable
                    public final void run() {
                        CTInAppNativeHalfInterstitialImageFragment.ViewTreeObserverOnGlobalLayoutListenerC1274b.m6522a(closeImageView, relativeLayout);
                    }
                });
            } else if (CTInAppNativeHalfInterstitialImageFragment.this.m6468v4()) {
                layoutParams2.setMargins(CTInAppNativeHalfInterstitialImageFragment.this.m6451i4(140), CTInAppNativeHalfInterstitialImageFragment.this.m6451i4(100), CTInAppNativeHalfInterstitialImageFragment.this.m6451i4(140), CTInAppNativeHalfInterstitialImageFragment.this.m6451i4(100));
                int measuredHeight = relativeLayout.getMeasuredHeight() - CTInAppNativeHalfInterstitialImageFragment.this.m6451i4(130);
                layoutParams2.height = measuredHeight;
                layoutParams2.width = (int) (measuredHeight * 1.3f);
                layoutParams2.gravity = 17;
                relativeLayout.setLayoutParams(layoutParams2);
                final CloseImageView closeImageView2 = this.f5166b;
                relativeLayout.post(new Runnable() { // from class: l.qv3
                    @Override // java.lang.Runnable
                    public final void run() {
                        CTInAppNativeHalfInterstitialImageFragment.ViewTreeObserverOnGlobalLayoutListenerC1274b.m6523b(closeImageView2, relativeLayout);
                    }
                });
            } else {
                layoutParams2.width = (int) (relativeLayout.getMeasuredHeight() * 1.3f);
                layoutParams2.gravity = 1;
                relativeLayout.setLayoutParams(layoutParams2);
                final CloseImageView closeImageView3 = this.f5166b;
                relativeLayout.post(new Runnable() { // from class: l.rv3
                    @Override // java.lang.Runnable
                    public final void run() {
                        CTInAppNativeHalfInterstitialImageFragment.ViewTreeObserverOnGlobalLayoutListenerC1274b.m6524c(closeImageView3, relativeLayout);
                    }
                });
            }
            relativeLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: E4 */
    public static void m6519E4(CTInAppNativeHalfInterstitialImageFragment cTInAppNativeHalfInterstitialImageFragment, View view) {
        cTInAppNativeHalfInterstitialImageFragment.getClass();
        cTInAppNativeHalfInterstitialImageFragment.m6441Y3(null);
        FragmentActivity activity = cTInAppNativeHalfInterstitialImageFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: F4 */
    public static Unit m6520F4(CTInAppNativeHalfInterstitialImageFragment cTInAppNativeHalfInterstitialImageFragment) {
        cTInAppNativeHalfInterstitialImageFragment.getClass();
        cTInAppNativeHalfInterstitialImageFragment.m6452j4(0);
        return Unit.INSTANCE;
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment
    @NotNull
    /* JADX INFO: renamed from: W3 */
    public InAppMediaHandler mo6440W3() {
        return InAppMediaHandler.INSTANCE.m6571a(this, m6448f4(), getCurrentOrientation(), m6448f4().getIsTablet() && m6468v4(), m6454m4(), true, !m6448f4().m6217f().isEmpty() ? new Function0() { // from class: l.ov3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CTInAppNativeHalfInterstitialImageFragment.m6520F4(this.f149229a);
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
        View viewInflate = (m6448f4().getIsTablet() && m6468v4()) ? inflater.inflate(efc0.f93765v, container, false) : inflater.inflate(efc0.f93750g, container, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(icc0.f114366j0);
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(199272);
        frameLayout.setBackground(new ColorDrawable(-1157627904));
        RelativeLayout relativeLayout2 = (RelativeLayout) frameLayout.findViewById(icc0.f114326M);
        this.relativeLayout = relativeLayout2;
        if (relativeLayout2 != null) {
            relativeLayout2.setBackgroundColor(Color.parseColor(m6448f4().getBackgroundColor()));
        }
        int currentOrientation = getCurrentOrientation();
        if (currentOrientation == 1) {
            RelativeLayout relativeLayout3 = this.relativeLayout;
            if (relativeLayout3 != null && (viewTreeObserver = relativeLayout3.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1273a(closeImageView));
            }
        } else if (currentOrientation == 2 && (relativeLayout = this.relativeLayout) != null && (viewTreeObserver2 = relativeLayout.getViewTreeObserver()) != null) {
            viewTreeObserver2.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1274b(closeImageView));
        }
        m6450h4().setup(this.relativeLayout, new brm(icc0.f114324L, true, icc0.f114337R0, icc0.f114318I), new CTInAppBaseFragment.ViewOnClickListenerC1264a());
        closeImageView.setOnClickListener(new View.OnClickListener() { // from class: l.pv3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CTInAppNativeHalfInterstitialImageFragment.m6519E4(this.f154261a, view);
            }
        });
        if (m6448f4().getIsHideCloseButton()) {
            closeImageView.setVisibility(0);
            return viewInflate;
        }
        closeImageView.setVisibility(8);
        return viewInflate;
    }
}
