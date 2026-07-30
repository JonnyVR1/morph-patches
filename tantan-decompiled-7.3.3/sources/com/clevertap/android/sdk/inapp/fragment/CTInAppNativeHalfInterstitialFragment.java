package com.clevertap.android.sdk.inapp.fragment;

import android.content.Context;
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
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeHalfInterstitialFragment;
import com.clevertap.android.sdk.inapp.media.InAppMediaHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.brm;
import p153l.efc0;
import p153l.icc0;
import p153l.uzd;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppNativeHalfInterstitialFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFullNativeFragment;", "<init>", "()V", "Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "W3", "()Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/content/Context;", "context", "", "I4", "(Landroid/content/Context;)Z", "Landroid/widget/RelativeLayout;", "H", "Landroid/widget/RelativeLayout;", "relativeLayout", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class CTInAppNativeHalfInterstitialFragment extends CTInAppBaseFullNativeFragment {

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    private RelativeLayout relativeLayout;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.fragment.CTInAppNativeHalfInterstitialFragment$a */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"com/clevertap/android/sdk/inapp/fragment/CTInAppNativeHalfInterstitialFragment$a", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "()V", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC1271a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ LayoutInflater f5158b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ CloseImageView f5159c;

        public ViewTreeObserverOnGlobalLayoutListenerC1271a(LayoutInflater layoutInflater, CloseImageView closeImageView) {
            this.f5158b = layoutInflater;
            this.f5159c = closeImageView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            RelativeLayout relativeLayout = CTInAppNativeHalfInterstitialFragment.this.relativeLayout;
            if (relativeLayout == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.getClass();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if ((CTInAppNativeHalfInterstitialFragment.this.m6448f4().getIsTablet() && CTInAppNativeHalfInterstitialFragment.this.m6468v4()) || (CTInAppNativeHalfInterstitialFragment.this.m6448f4().getIsLocalInApp() && CTInAppNativeHalfInterstitialFragment.this.m6515I4(this.f5158b.getContext()))) {
                CTInAppNativeHalfInterstitialFragment cTInAppNativeHalfInterstitialFragment = CTInAppNativeHalfInterstitialFragment.this;
                CloseImageView closeImageView = this.f5159c;
                closeImageView.getClass();
                cTInAppNativeHalfInterstitialFragment.m6469w4(relativeLayout, layoutParams2, closeImageView);
            } else {
                boolean zM6468v4 = CTInAppNativeHalfInterstitialFragment.this.m6468v4();
                CTInAppNativeHalfInterstitialFragment cTInAppNativeHalfInterstitialFragment2 = CTInAppNativeHalfInterstitialFragment.this;
                if (zM6468v4) {
                    CloseImageView closeImageView2 = this.f5159c;
                    closeImageView2.getClass();
                    cTInAppNativeHalfInterstitialFragment2.m6470x4(relativeLayout, layoutParams2, closeImageView2);
                } else {
                    CloseImageView closeImageView3 = this.f5159c;
                    closeImageView3.getClass();
                    cTInAppNativeHalfInterstitialFragment2.m6469w4(relativeLayout, layoutParams2, closeImageView3);
                }
            }
            relativeLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.fragment.CTInAppNativeHalfInterstitialFragment$b */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"com/clevertap/android/sdk/inapp/fragment/CTInAppNativeHalfInterstitialFragment$b", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "()V", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC1272b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CloseImageView f5161b;

        public ViewTreeObserverOnGlobalLayoutListenerC1272b(CloseImageView closeImageView) {
            this.f5161b = closeImageView;
        }

        /* JADX INFO: renamed from: a */
        public static void m6516a(CloseImageView closeImageView, RelativeLayout relativeLayout) {
            relativeLayout.getClass();
            int measuredWidth = closeImageView.getMeasuredWidth() / 2;
            closeImageView.setX(relativeLayout.getRight() - measuredWidth);
            closeImageView.setY(relativeLayout.getTop() - measuredWidth);
        }

        /* JADX INFO: renamed from: b */
        public static void m6517b(CloseImageView closeImageView, RelativeLayout relativeLayout) {
            relativeLayout.getClass();
            int measuredWidth = closeImageView.getMeasuredWidth() / 2;
            closeImageView.setX(relativeLayout.getRight() - measuredWidth);
            closeImageView.setY(relativeLayout.getTop() - measuredWidth);
        }

        /* JADX INFO: renamed from: c */
        public static void m6518c(CloseImageView closeImageView, RelativeLayout relativeLayout) {
            relativeLayout.getClass();
            int measuredWidth = closeImageView.getMeasuredWidth() / 2;
            closeImageView.setX(relativeLayout.getRight() - measuredWidth);
            closeImageView.setY(relativeLayout.getTop() - measuredWidth);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            final RelativeLayout relativeLayout = CTInAppNativeHalfInterstitialFragment.this.relativeLayout;
            if (relativeLayout == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.getClass();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (CTInAppNativeHalfInterstitialFragment.this.m6448f4().getIsTablet() && CTInAppNativeHalfInterstitialFragment.this.m6468v4()) {
                layoutParams2.width = (int) (relativeLayout.getMeasuredHeight() * 1.3f);
                layoutParams2.gravity = 17;
                relativeLayout.setLayoutParams(layoutParams2);
                final CloseImageView closeImageView = this.f5161b;
                relativeLayout.post(new Runnable() { // from class: l.nv3
                    @Override // java.lang.Runnable
                    public final void run() {
                        CTInAppNativeHalfInterstitialFragment.ViewTreeObserverOnGlobalLayoutListenerC1272b.m6517b(closeImageView, relativeLayout);
                    }
                });
            } else if (CTInAppNativeHalfInterstitialFragment.this.m6468v4()) {
                layoutParams2.setMargins(CTInAppNativeHalfInterstitialFragment.this.m6451i4(140), CTInAppNativeHalfInterstitialFragment.this.m6451i4(100), CTInAppNativeHalfInterstitialFragment.this.m6451i4(140), CTInAppNativeHalfInterstitialFragment.this.m6451i4(100));
                int measuredHeight = relativeLayout.getMeasuredHeight() - CTInAppNativeHalfInterstitialFragment.this.m6451i4(130);
                layoutParams2.height = measuredHeight;
                layoutParams2.width = (int) (measuredHeight * 1.3f);
                layoutParams2.gravity = 17;
                relativeLayout.setLayoutParams(layoutParams2);
                final CloseImageView closeImageView2 = this.f5161b;
                relativeLayout.post(new Runnable() { // from class: l.lv3
                    @Override // java.lang.Runnable
                    public final void run() {
                        CTInAppNativeHalfInterstitialFragment.ViewTreeObserverOnGlobalLayoutListenerC1272b.m6518c(closeImageView2, relativeLayout);
                    }
                });
            } else {
                layoutParams2.width = (int) (relativeLayout.getMeasuredHeight() * 1.3f);
                layoutParams2.gravity = 1;
                relativeLayout.setLayoutParams(layoutParams2);
                final CloseImageView closeImageView3 = this.f5161b;
                relativeLayout.post(new Runnable() { // from class: l.mv3
                    @Override // java.lang.Runnable
                    public final void run() {
                        CTInAppNativeHalfInterstitialFragment.ViewTreeObserverOnGlobalLayoutListenerC1272b.m6516a(closeImageView3, relativeLayout);
                    }
                });
            }
            relativeLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: G4 */
    public static void m6513G4(CTInAppNativeHalfInterstitialFragment cTInAppNativeHalfInterstitialFragment, View view) {
        cTInAppNativeHalfInterstitialFragment.getClass();
        cTInAppNativeHalfInterstitialFragment.m6441Y3(null);
        FragmentActivity activity = cTInAppNativeHalfInterstitialFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: I4 */
    public final boolean m6515I4(@Nullable Context context) {
        return uzd.m198733H(context) == 2;
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment
    @NotNull
    /* JADX INFO: renamed from: W3 */
    public InAppMediaHandler mo6440W3() {
        return InAppMediaHandler.INSTANCE.m6571a(this, m6448f4(), getCurrentOrientation(), m6448f4().getIsTablet() && m6468v4(), m6454m4(), (96 & 32) != 0 ? false : false, (96 & 64) != 0 ? null : null, (96 & 128) != 0 ? null : getActiveMediaUrl());
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewInflate;
        ViewTreeObserver viewTreeObserver;
        RelativeLayout relativeLayout;
        ViewTreeObserver viewTreeObserver2;
        inflater.getClass();
        ArrayList arrayList = new ArrayList();
        if ((m6448f4().getIsTablet() && m6468v4()) || (m6448f4().getIsLocalInApp() && m6515I4(inflater.getContext()))) {
            viewInflate = inflater.inflate(efc0.f93764u, container, false);
            viewInflate.getClass();
        } else {
            viewInflate = inflater.inflate(efc0.f93749f, container, false);
            viewInflate.getClass();
        }
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(icc0.f114364i0);
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(199272);
        RelativeLayout relativeLayout2 = (RelativeLayout) frameLayout.findViewById(icc0.f114332P);
        this.relativeLayout = relativeLayout2;
        if (relativeLayout2 != null) {
            relativeLayout2.setBackgroundColor(Color.parseColor(m6448f4().getBackgroundColor()));
        }
        int currentOrientation = getCurrentOrientation();
        if (currentOrientation == 1) {
            RelativeLayout relativeLayout3 = this.relativeLayout;
            if (relativeLayout3 != null && (viewTreeObserver = relativeLayout3.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1271a(inflater, closeImageView));
            }
        } else if (currentOrientation == 2 && (relativeLayout = this.relativeLayout) != null && (viewTreeObserver2 = relativeLayout.getViewTreeObserver()) != null) {
            viewTreeObserver2.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1272b(closeImageView));
        }
        InAppMediaHandler.C1285b.m6574b(m6450h4(), this.relativeLayout, new brm(icc0.f114347a, false, 0, icc0.f114318I, 4, null), null, 4, null);
        RelativeLayout relativeLayout4 = this.relativeLayout;
        LinearLayout linearLayout = relativeLayout4 != null ? (LinearLayout) relativeLayout4.findViewById(icc0.f114328N) : null;
        Button button = linearLayout != null ? (Button) linearLayout.findViewById(icc0.f114320J) : null;
        if (button != null) {
            arrayList.add(button);
        }
        Button button2 = linearLayout != null ? (Button) linearLayout.findViewById(icc0.f114322K) : null;
        if (button2 != null) {
            arrayList.add(button2);
        }
        RelativeLayout relativeLayout5 = this.relativeLayout;
        TextView textView = relativeLayout5 != null ? (TextView) relativeLayout5.findViewById(icc0.f114334Q) : null;
        if (textView != null) {
            textView.setText(m6448f4().getTitle());
        }
        if (textView != null) {
            textView.setTextColor(Color.parseColor(m6448f4().getTitleColor()));
        }
        RelativeLayout relativeLayout6 = this.relativeLayout;
        TextView textView2 = relativeLayout6 != null ? (TextView) relativeLayout6.findViewById(icc0.f114330O) : null;
        if (textView2 != null) {
            textView2.setText(m6448f4().getMessage());
        }
        if (textView2 != null) {
            textView2.setTextColor(Color.parseColor(m6448f4().getMessageColor()));
        }
        List<CTInAppNotificationButton> listM6217f = m6448f4().m6217f();
        if (listM6217f.size() == 1) {
            if (getCurrentOrientation() == 2) {
                if (button != null) {
                    button.setVisibility(8);
                }
            } else if (getCurrentOrientation() == 1 && button != null) {
                button.setVisibility(4);
            }
            if (button2 != null) {
                m6484F4(button2, listM6217f.get(0), 0);
            }
        } else if (!listM6217f.isEmpty()) {
            int size = listM6217f.size();
            for (int i = 0; i < size; i++) {
                if (i < 2) {
                    m6484F4((Button) arrayList.get(i), listM6217f.get(i), i);
                }
            }
        }
        frameLayout.setBackground(new ColorDrawable(-1157627904));
        closeImageView.setOnClickListener(new View.OnClickListener() { // from class: l.kv3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CTInAppNativeHalfInterstitialFragment.m6513G4(this.f128941a, view);
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
