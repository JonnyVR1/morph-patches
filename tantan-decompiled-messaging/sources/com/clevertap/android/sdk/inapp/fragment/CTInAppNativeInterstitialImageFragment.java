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
import p149l.a7c0;
import p149l.c4c0;
import p149l.zom;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppNativeInterstitialImageFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFullFragment;", "<init>", "()V", "Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "W3", "()Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/widget/RelativeLayout;", "H", "Landroid/widget/RelativeLayout;", "relativeLayout", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class CTInAppNativeInterstitialImageFragment extends CTInAppBaseFullFragment {

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    private RelativeLayout relativeLayout;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.fragment.CTInAppNativeInterstitialImageFragment$a */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"com/clevertap/android/sdk/inapp/fragment/CTInAppNativeInterstitialImageFragment$a", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "()V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC1254a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ FrameLayout f5139b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ CloseImageView f5140c;

        public ViewTreeObserverOnGlobalLayoutListenerC1254a(FrameLayout frameLayout, CloseImageView closeImageView) {
            this.f5139b = frameLayout;
            this.f5140c = closeImageView;
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
            if (CTInAppNativeInterstitialImageFragment.this.m6394f4().getIsTablet() && CTInAppNativeInterstitialImageFragment.this.m6414v4()) {
                CTInAppNativeInterstitialImageFragment cTInAppNativeInterstitialImageFragment = CTInAppNativeInterstitialImageFragment.this;
                FrameLayout frameLayout = this.f5139b;
                frameLayout.getClass();
                CloseImageView closeImageView = this.f5140c;
                closeImageView.getClass();
                cTInAppNativeInterstitialImageFragment.m6409A4(relativeLayout, layoutParams2, frameLayout, closeImageView);
            } else {
                boolean zM6414v4 = CTInAppNativeInterstitialImageFragment.this.m6414v4();
                CTInAppNativeInterstitialImageFragment cTInAppNativeInterstitialImageFragment2 = CTInAppNativeInterstitialImageFragment.this;
                if (zM6414v4) {
                    FrameLayout frameLayout2 = this.f5139b;
                    frameLayout2.getClass();
                    CloseImageView closeImageView2 = this.f5140c;
                    closeImageView2.getClass();
                    cTInAppNativeInterstitialImageFragment2.m6418z4(relativeLayout, layoutParams2, frameLayout2, closeImageView2);
                } else {
                    CloseImageView closeImageView3 = this.f5140c;
                    closeImageView3.getClass();
                    cTInAppNativeInterstitialImageFragment2.m6417y4(relativeLayout, layoutParams2, closeImageView3);
                }
            }
            relativeLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.fragment.CTInAppNativeInterstitialImageFragment$b */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"com/clevertap/android/sdk/inapp/fragment/CTInAppNativeInterstitialImageFragment$b", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "()V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC1255b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ FrameLayout f5142b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ CloseImageView f5143c;

        public ViewTreeObserverOnGlobalLayoutListenerC1255b(FrameLayout frameLayout, CloseImageView closeImageView) {
            this.f5142b = frameLayout;
            this.f5143c = closeImageView;
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
            if (CTInAppNativeInterstitialImageFragment.this.m6394f4().getIsTablet() && CTInAppNativeInterstitialImageFragment.this.m6414v4()) {
                CTInAppNativeInterstitialImageFragment cTInAppNativeInterstitialImageFragment = CTInAppNativeInterstitialImageFragment.this;
                FrameLayout frameLayout = this.f5142b;
                frameLayout.getClass();
                CloseImageView closeImageView = this.f5143c;
                closeImageView.getClass();
                cTInAppNativeInterstitialImageFragment.m6412D4(relativeLayout, layoutParams2, frameLayout, closeImageView);
            } else {
                boolean zM6414v4 = CTInAppNativeInterstitialImageFragment.this.m6414v4();
                CTInAppNativeInterstitialImageFragment cTInAppNativeInterstitialImageFragment2 = CTInAppNativeInterstitialImageFragment.this;
                if (zM6414v4) {
                    FrameLayout frameLayout2 = this.f5142b;
                    frameLayout2.getClass();
                    CloseImageView closeImageView2 = this.f5143c;
                    closeImageView2.getClass();
                    cTInAppNativeInterstitialImageFragment2.m6411C4(relativeLayout, layoutParams2, frameLayout2, closeImageView2);
                } else {
                    CloseImageView closeImageView3 = this.f5143c;
                    closeImageView3.getClass();
                    cTInAppNativeInterstitialImageFragment2.m6410B4(relativeLayout, layoutParams2, closeImageView3);
                }
            }
            relativeLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: E4 */
    public static void m6479E4(CTInAppNativeInterstitialImageFragment cTInAppNativeInterstitialImageFragment, View view) {
        cTInAppNativeInterstitialImageFragment.getClass();
        cTInAppNativeInterstitialImageFragment.m6387Y3(null);
        FragmentActivity activity = cTInAppNativeInterstitialImageFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: F4 */
    public static Unit m6480F4(CTInAppNativeInterstitialImageFragment cTInAppNativeInterstitialImageFragment) {
        cTInAppNativeInterstitialImageFragment.getClass();
        cTInAppNativeInterstitialImageFragment.m6398j4(0);
        return Unit.INSTANCE;
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment
    @NotNull
    /* JADX INFO: renamed from: W3 */
    public InAppMediaHandler mo6386W3() {
        return InAppMediaHandler.INSTANCE.m6517a(this, m6394f4(), getCurrentOrientation(), m6394f4().getIsTablet() && m6414v4(), m6400m4(), true, !m6394f4().m6163f().isEmpty() ? new Function0() { // from class: l.xu3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CTInAppNativeInterstitialImageFragment.m6480F4(this.f194470a);
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
        View viewInflate = (m6394f4().getIsTablet() && m6414v4()) ? inflater.inflate(a7c0.f67915x, container, false) : inflater.inflate(a7c0.f67904m, container, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(c4c0.f79240o0);
        frameLayout.setBackground(new ColorDrawable(-1157627904));
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(199272);
        RelativeLayout relativeLayout2 = (RelativeLayout) frameLayout.findViewById(c4c0.f79250t0);
        this.relativeLayout = relativeLayout2;
        if (relativeLayout2 != null) {
            relativeLayout2.setBackgroundColor(Color.parseColor(m6394f4().getBackgroundColor()));
        }
        int currentOrientation = getCurrentOrientation();
        if (currentOrientation == 1) {
            RelativeLayout relativeLayout3 = this.relativeLayout;
            if (relativeLayout3 != null && (viewTreeObserver = relativeLayout3.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1254a(frameLayout, closeImageView));
            }
        } else if (currentOrientation == 2 && (relativeLayout = this.relativeLayout) != null && (viewTreeObserver2 = relativeLayout.getViewTreeObserver()) != null) {
            viewTreeObserver2.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1255b(frameLayout, closeImageView));
        }
        m6396h4().setup(this.relativeLayout, new zom(c4c0.f79248s0, true, c4c0.f79201R0, c4c0.f79182I), new CTInAppBaseFragment.ViewOnClickListenerC1241a());
        closeImageView.setOnClickListener(new View.OnClickListener() { // from class: l.yu3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CTInAppNativeInterstitialImageFragment.m6479E4(this.f200040a, view);
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
