package com.clevertap.android.sdk.inapp.fragment;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeInterstitialFragment;
import com.clevertap.android.sdk.inapp.media.InAppMediaHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.a7c0;
import p149l.c4c0;
import p149l.zom;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppNativeInterstitialFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFullNativeFragment;", "<init>", "()V", "", "I4", "K4", "L4", "Landroid/widget/FrameLayout;", Constants.META_FRESH_APP_LAUNCH, "Lcom/clevertap/android/sdk/customviews/CloseImageView;", "closeImageView", "J4", "(Landroid/widget/FrameLayout;Lcom/clevertap/android/sdk/customviews/CloseImageView;)V", "Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "W3", "()Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/widget/RelativeLayout;", "H", "Landroid/widget/RelativeLayout;", "relativeLayout", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class CTInAppNativeInterstitialFragment extends CTInAppBaseFullNativeFragment {

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    private RelativeLayout relativeLayout;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.fragment.CTInAppNativeInterstitialFragment$a */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"com/clevertap/android/sdk/inapp/fragment/CTInAppNativeInterstitialFragment$a", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "()V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC1252a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ FrameLayout f5132b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ CloseImageView f5133c;

        public ViewTreeObserverOnGlobalLayoutListenerC1252a(FrameLayout frameLayout, CloseImageView closeImageView) {
            this.f5132b = frameLayout;
            this.f5133c = closeImageView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            RelativeLayout relativeLayout = CTInAppNativeInterstitialFragment.this.relativeLayout;
            if (relativeLayout == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.getClass();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (CTInAppNativeInterstitialFragment.this.m6394f4().getIsTablet() && CTInAppNativeInterstitialFragment.this.m6414v4()) {
                CTInAppNativeInterstitialFragment.this.m6409A4(relativeLayout, layoutParams2, this.f5132b, this.f5133c);
            } else {
                boolean zM6414v4 = CTInAppNativeInterstitialFragment.this.m6414v4();
                CTInAppNativeInterstitialFragment cTInAppNativeInterstitialFragment = CTInAppNativeInterstitialFragment.this;
                if (zM6414v4) {
                    cTInAppNativeInterstitialFragment.m6418z4(relativeLayout, layoutParams2, this.f5132b, this.f5133c);
                } else {
                    cTInAppNativeInterstitialFragment.m6417y4(relativeLayout, layoutParams2, this.f5133c);
                }
            }
            relativeLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.fragment.CTInAppNativeInterstitialFragment$b */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"com/clevertap/android/sdk/inapp/fragment/CTInAppNativeInterstitialFragment$b", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "()V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC1253b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ FrameLayout f5135b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ CloseImageView f5136c;

        public ViewTreeObserverOnGlobalLayoutListenerC1253b(FrameLayout frameLayout, CloseImageView closeImageView) {
            this.f5135b = frameLayout;
            this.f5136c = closeImageView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            RelativeLayout relativeLayout = CTInAppNativeInterstitialFragment.this.relativeLayout;
            if (relativeLayout == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.getClass();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (CTInAppNativeInterstitialFragment.this.m6394f4().getIsTablet() && CTInAppNativeInterstitialFragment.this.m6414v4()) {
                CTInAppNativeInterstitialFragment.this.m6412D4(relativeLayout, layoutParams2, this.f5135b, this.f5136c);
            } else {
                boolean zM6414v4 = CTInAppNativeInterstitialFragment.this.m6414v4();
                CTInAppNativeInterstitialFragment cTInAppNativeInterstitialFragment = CTInAppNativeInterstitialFragment.this;
                if (zM6414v4) {
                    cTInAppNativeInterstitialFragment.m6411C4(relativeLayout, layoutParams2, this.f5135b, this.f5136c);
                } else {
                    cTInAppNativeInterstitialFragment.m6410B4(relativeLayout, layoutParams2, this.f5136c);
                }
            }
            relativeLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: G4 */
    public static void m6473G4(CTInAppNativeInterstitialFragment cTInAppNativeInterstitialFragment, View view) {
        cTInAppNativeInterstitialFragment.getClass();
        cTInAppNativeInterstitialFragment.m6387Y3(null);
        FragmentActivity activity = cTInAppNativeInterstitialFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: I4 */
    private final void m6475I4() {
        if (m6394f4().getIsHideCloseButton()) {
            CloseImageView closeImageView = getCloseImageView();
            if (closeImageView != null) {
                closeImageView.setVisibility(0);
            }
            CloseImageView closeImageView2 = getCloseImageView();
            if (closeImageView2 != null) {
                closeImageView2.setOnClickListener(new View.OnClickListener() { // from class: l.wu3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CTInAppNativeInterstitialFragment.m6473G4(this.f188079a, view);
                    }
                });
                return;
            }
            return;
        }
        CloseImageView closeImageView3 = getCloseImageView();
        if (closeImageView3 != null) {
            closeImageView3.setOnClickListener(null);
        }
        CloseImageView closeImageView4 = getCloseImageView();
        if (closeImageView4 != null) {
            closeImageView4.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: J4 */
    private final void m6476J4(FrameLayout fl, CloseImageView closeImageView) {
        ViewTreeObserver viewTreeObserver;
        RelativeLayout relativeLayout;
        ViewTreeObserver viewTreeObserver2;
        int currentOrientation = getCurrentOrientation();
        if (currentOrientation != 1) {
            if (currentOrientation != 2 || (relativeLayout = this.relativeLayout) == null || (viewTreeObserver2 = relativeLayout.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver2.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1253b(fl, closeImageView));
            return;
        }
        RelativeLayout relativeLayout2 = this.relativeLayout;
        if (relativeLayout2 == null || (viewTreeObserver = relativeLayout2.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1252a(fl, closeImageView));
    }

    /* JADX INFO: renamed from: K4 */
    private final void m6477K4() {
        ArrayList arrayList = new ArrayList();
        RelativeLayout relativeLayout = this.relativeLayout;
        LinearLayout linearLayout = relativeLayout != null ? (LinearLayout) relativeLayout.findViewById(c4c0.f79252u0) : null;
        Button button = linearLayout != null ? (Button) linearLayout.findViewById(c4c0.f79244q0) : null;
        if (button != null) {
            arrayList.add(button);
        }
        Button button2 = linearLayout != null ? (Button) linearLayout.findViewById(c4c0.f79246r0) : null;
        if (button2 != null) {
            arrayList.add(button2);
        }
        List<CTInAppNotificationButton> listM6163f = m6394f4().m6163f();
        if (listM6163f.size() != 1) {
            if (listM6163f.isEmpty()) {
                return;
            }
            int size = listM6163f.size();
            for (int i = 0; i < size && i < 2; i++) {
                m6430F4((Button) arrayList.get(i), listM6163f.get(i), i);
            }
            return;
        }
        if (getCurrentOrientation() == 2) {
            if (button != null) {
                button.setVisibility(8);
            }
        } else if (getCurrentOrientation() == 1 && button != null) {
            button.setVisibility(4);
        }
        if (button2 != null) {
            m6430F4(button2, listM6163f.get(0), 0);
        }
    }

    /* JADX INFO: renamed from: L4 */
    private final void m6478L4() {
        RelativeLayout relativeLayout = this.relativeLayout;
        TextView textView = relativeLayout != null ? (TextView) relativeLayout.findViewById(c4c0.f79258x0) : null;
        if (textView != null) {
            textView.setText(m6394f4().getTitle());
        }
        if (textView != null) {
            textView.setTextColor(Color.parseColor(m6394f4().getTitleColor()));
        }
        RelativeLayout relativeLayout2 = this.relativeLayout;
        TextView textView2 = relativeLayout2 != null ? (TextView) relativeLayout2.findViewById(c4c0.f79254v0) : null;
        if (textView2 != null) {
            textView2.setText(m6394f4().getMessage());
        }
        if (textView2 != null) {
            textView2.setTextColor(Color.parseColor(m6394f4().getMessageColor()));
        }
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment
    @NotNull
    /* JADX INFO: renamed from: W3 */
    public InAppMediaHandler mo6386W3() {
        return InAppMediaHandler.INSTANCE.m6517a(this, m6394f4(), getCurrentOrientation(), m6394f4().getIsTablet() && m6414v4(), m6400m4(), (96 & 32) != 0 ? false : true, (96 & 64) != 0 ? null : null, (96 & 128) != 0 ? null : getActiveMediaUrl());
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"ResourceType"})
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflater.getClass();
        View viewInflate = (m6394f4().getIsTablet() && m6414v4()) ? inflater.inflate(a7c0.f67914w, container, false) : inflater.inflate(a7c0.f67903l, container, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(c4c0.f79238n0);
        m6402o4((CloseImageView) frameLayout.findViewById(199272));
        RelativeLayout relativeLayout = (RelativeLayout) frameLayout.findViewById(c4c0.f79256w0);
        this.relativeLayout = relativeLayout;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(Color.parseColor(m6394f4().getBackgroundColor()));
        }
        frameLayout.setBackground(new ColorDrawable(-1157627904));
        CloseImageView closeImageView = getCloseImageView();
        closeImageView.getClass();
        m6476J4(frameLayout, closeImageView);
        InAppMediaHandler.C1262b.m6520b(m6396h4(), this.relativeLayout, new zom(c4c0.f79211a, false, c4c0.f79201R0, c4c0.f79182I), null, 4, null);
        m6478L4();
        m6477K4();
        m6475I4();
        return viewInflate;
    }
}
