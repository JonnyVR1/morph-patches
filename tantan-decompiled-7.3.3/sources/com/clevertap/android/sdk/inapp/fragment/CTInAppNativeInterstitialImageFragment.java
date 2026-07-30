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
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeInterstitialImageFragment;
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
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppNativeInterstitialImageFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFullFragment;", "<init>", "()V", "Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "W3", "()Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/widget/RelativeLayout;", "H", "Landroid/widget/RelativeLayout;", "relativeLayout", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class CTInAppNativeInterstitialImageFragment extends CTInAppBaseFullFragment {

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    private RelativeLayout relativeLayout;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.fragment.CTInAppNativeInterstitialImageFragment$a */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"com/clevertap/android/sdk/inapp/fragment/CTInAppNativeInterstitialImageFragment$a", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "()V", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC1277a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ FrameLayout f5176b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ CloseImageView f5177c;

        public ViewTreeObserverOnGlobalLayoutListenerC1277a(FrameLayout frameLayout, CloseImageView closeImageView) {
            this.f5176b = frameLayout;
            this.f5177c = closeImageView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            RelativeLayout relativeLayout = CTInAppNativeInterstitialImageFragment.this.relativeLayout;
            if (relativeLayout == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.getClass();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (CTInAppNativeInterstitialImageFragment.this.m6448f4().getIsTablet() && CTInAppNativeInterstitialImageFragment.this.m6468v4()) {
                CTInAppNativeInterstitialImageFragment cTInAppNativeInterstitialImageFragment = CTInAppNativeInterstitialImageFragment.this;
                FrameLayout frameLayout = this.f5176b;
                frameLayout.getClass();
                CloseImageView closeImageView = this.f5177c;
                closeImageView.getClass();
                cTInAppNativeInterstitialImageFragment.m6463A4(relativeLayout, layoutParams2, frameLayout, closeImageView);
            } else {
                boolean zM6468v4 = CTInAppNativeInterstitialImageFragment.this.m6468v4();
                CTInAppNativeInterstitialImageFragment cTInAppNativeInterstitialImageFragment2 = CTInAppNativeInterstitialImageFragment.this;
                if (zM6468v4) {
                    FrameLayout frameLayout2 = this.f5176b;
                    frameLayout2.getClass();
                    CloseImageView closeImageView2 = this.f5177c;
                    closeImageView2.getClass();
                    cTInAppNativeInterstitialImageFragment2.m6472z4(relativeLayout, layoutParams2, frameLayout2, closeImageView2);
                } else {
                    CloseImageView closeImageView3 = this.f5177c;
                    closeImageView3.getClass();
                    cTInAppNativeInterstitialImageFragment2.m6471y4(relativeLayout, layoutParams2, closeImageView3);
                }
            }
            relativeLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.fragment.CTInAppNativeInterstitialImageFragment$b */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"com/clevertap/android/sdk/inapp/fragment/CTInAppNativeInterstitialImageFragment$b", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "()V", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC1278b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ FrameLayout f5179b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ CloseImageView f5180c;

        public ViewTreeObserverOnGlobalLayoutListenerC1278b(FrameLayout frameLayout, CloseImageView closeImageView) {
            this.f5179b = frameLayout;
            this.f5180c = closeImageView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            RelativeLayout relativeLayout = CTInAppNativeInterstitialImageFragment.this.relativeLayout;
            if (relativeLayout == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.getClass();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (CTInAppNativeInterstitialImageFragment.this.m6448f4().getIsTablet() && CTInAppNativeInterstitialImageFragment.this.m6468v4()) {
                CTInAppNativeInterstitialImageFragment cTInAppNativeInterstitialImageFragment = CTInAppNativeInterstitialImageFragment.this;
                FrameLayout frameLayout = this.f5179b;
                frameLayout.getClass();
                CloseImageView closeImageView = this.f5180c;
                closeImageView.getClass();
                cTInAppNativeInterstitialImageFragment.m6466D4(relativeLayout, layoutParams2, frameLayout, closeImageView);
            } else {
                boolean zM6468v4 = CTInAppNativeInterstitialImageFragment.this.m6468v4();
                CTInAppNativeInterstitialImageFragment cTInAppNativeInterstitialImageFragment2 = CTInAppNativeInterstitialImageFragment.this;
                if (zM6468v4) {
                    FrameLayout frameLayout2 = this.f5179b;
                    frameLayout2.getClass();
                    CloseImageView closeImageView2 = this.f5180c;
                    closeImageView2.getClass();
                    cTInAppNativeInterstitialImageFragment2.m6465C4(relativeLayout, layoutParams2, frameLayout2, closeImageView2);
                } else {
                    CloseImageView closeImageView3 = this.f5180c;
                    closeImageView3.getClass();
                    cTInAppNativeInterstitialImageFragment2.m6464B4(relativeLayout, layoutParams2, closeImageView3);
                }
            }
            relativeLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: E4 */
    public static void m6533E4(CTInAppNativeInterstitialImageFragment cTInAppNativeInterstitialImageFragment, View view) {
        cTInAppNativeInterstitialImageFragment.getClass();
        cTInAppNativeInterstitialImageFragment.m6441Y3(null);
        FragmentActivity activity = cTInAppNativeInterstitialImageFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: F4 */
    public static Unit m6534F4(CTInAppNativeInterstitialImageFragment cTInAppNativeInterstitialImageFragment) {
        cTInAppNativeInterstitialImageFragment.getClass();
        cTInAppNativeInterstitialImageFragment.m6452j4(0);
        return Unit.INSTANCE;
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment
    @NotNull
    /* JADX INFO: renamed from: W3 */
    public InAppMediaHandler mo6440W3() {
        return InAppMediaHandler.INSTANCE.m6571a(this, m6448f4(), getCurrentOrientation(), m6448f4().getIsTablet() && m6468v4(), m6454m4(), true, !m6448f4().m6217f().isEmpty() ? new Function0() { // from class: l.wv3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CTInAppNativeInterstitialImageFragment.m6534F4(this.f190906a);
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
        View viewInflate = (m6448f4().getIsTablet() && m6468v4()) ? inflater.inflate(efc0.f93767x, container, false) : inflater.inflate(efc0.f93756m, container, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(icc0.f114376o0);
        frameLayout.setBackground(new ColorDrawable(-1157627904));
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(199272);
        RelativeLayout relativeLayout2 = (RelativeLayout) frameLayout.findViewById(icc0.f114386t0);
        this.relativeLayout = relativeLayout2;
        if (relativeLayout2 != null) {
            relativeLayout2.setBackgroundColor(Color.parseColor(m6448f4().getBackgroundColor()));
        }
        int currentOrientation = getCurrentOrientation();
        if (currentOrientation == 1) {
            RelativeLayout relativeLayout3 = this.relativeLayout;
            if (relativeLayout3 != null && (viewTreeObserver = relativeLayout3.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1277a(frameLayout, closeImageView));
            }
        } else if (currentOrientation == 2 && (relativeLayout = this.relativeLayout) != null && (viewTreeObserver2 = relativeLayout.getViewTreeObserver()) != null) {
            viewTreeObserver2.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1278b(frameLayout, closeImageView));
        }
        m6450h4().setup(this.relativeLayout, new brm(icc0.f114384s0, true, icc0.f114337R0, icc0.f114318I), new CTInAppBaseFragment.ViewOnClickListenerC1264a());
        closeImageView.setOnClickListener(new View.OnClickListener() { // from class: l.xv3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CTInAppNativeInterstitialImageFragment.m6533E4(this.f196348a, view);
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
