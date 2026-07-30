package com.clevertap.android.sdk.inapp.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.R$string;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppWebView;
import com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFullHtmlFragment;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.text.Regex;
import org.eclipse.jetty.http.MimeTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.efc0;
import p153l.fx3;
import p153l.icc0;
import p153l.qsm;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0003J-\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u0003J!\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b%\u0010&R$\u0010.\u001a\u0004\u0018\u00010'8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00103\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u00108\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0012¨\u00064"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFullHtmlFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFullFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "G4", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/widget/RelativeLayout$LayoutParams;", CommandMessage.PARAMS, "", "I4", "(Landroid/widget/RelativeLayout$LayoutParams;)V", "", "J4", "()Z", "K4", "M4", "F4", "N4", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", OMSTemplateModeType.view, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "webViewId", "H4", "(I)Landroid/widget/RelativeLayout$LayoutParams;", "Lcom/clevertap/android/sdk/inapp/CTInAppWebView;", "H", "Lcom/clevertap/android/sdk/inapp/CTInAppWebView;", "getWebView", "()Lcom/clevertap/android/sdk/inapp/CTInAppWebView;", "setWebView", "(Lcom/clevertap/android/sdk/inapp/CTInAppWebView;)V", "webView", "value", "I", "Z", "L4", "isFullscreen", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public abstract class CTInAppBaseFullHtmlFragment extends CTInAppBaseFullFragment {

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    private CTInAppWebView webView;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private boolean isFullscreen;

    /* JADX INFO: renamed from: E4 */
    public static void m6473E4(CTInAppBaseFullHtmlFragment cTInAppBaseFullHtmlFragment, View view) {
        cTInAppBaseFullHtmlFragment.getClass();
        cTInAppBaseFullHtmlFragment.m6441Y3(null);
    }

    /* JADX INFO: renamed from: F4 */
    private final void m6474F4() {
        try {
            CTInAppWebView cTInAppWebView = this.webView;
            if (cTInAppWebView != null) {
                cTInAppWebView.m6268g(m6448f4().getIsJsEnabled());
            }
            this.webView = null;
        } catch (Exception e) {
            m6446d4().getLogger().verbose("cleanupWebView -> there was a crash in cleanup", e);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: G4 */
    private final View m6475G4(LayoutInflater inflater, ViewGroup container) {
        try {
            View viewInflate = inflater.inflate(efc0.f93753j, container, false);
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(icc0.f114370l0);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            m6476I4(layoutParams);
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            CTInAppWebView cTInAppWebView = new CTInAppWebView(contextRequireContext, m6448f4().getWidth(), m6448f4().getHeight(), m6448f4().getWidthPercentage(), m6448f4().getHeightPercentage());
            cTInAppWebView.setFullscreen(this.isFullscreen);
            this.webView = cTInAppWebView;
            cTInAppWebView.setWebViewClient(new qsm(this));
            if (m6448f4().getIsJsEnabled()) {
                cTInAppWebView.setJavaScriptInterface(new fx3(CleverTapAPI.m5814U(getActivity(), m6446d4()), this));
            }
            if (m6478K4()) {
                relativeLayout.setBackground(new ColorDrawable(-1157627904));
            } else {
                relativeLayout.setBackground(new ColorDrawable(0));
            }
            relativeLayout.addView(cTInAppWebView, layoutParams);
            if (m6477J4()) {
                Context context = inflater.getContext();
                CloseImageView closeImageView = new CloseImageView(context);
                RelativeLayout.LayoutParams layoutParamsMo6481H4 = mo6481H4(cTInAppWebView.getId());
                closeImageView.setOnClickListener(new View.OnClickListener() { // from class: l.xu3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CTInAppBaseFullHtmlFragment.m6473E4(this.f196261a, view);
                    }
                });
                closeImageView.setContentDescription(context.getString(R$string.f4862c));
                m6456o4(closeImageView);
                relativeLayout.addView(closeImageView, layoutParamsMo6481H4);
            }
            return viewInflate;
        } catch (Throwable th) {
            m6446d4().getLogger().verbose(m6446d4().getAccountId(), "Fragment view not created", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: I4 */
    private final void m6476I4(RelativeLayout.LayoutParams params) {
        char position = m6448f4().getPosition();
        if (position == 't') {
            params.addRule(10);
        } else if (position == 'l') {
            params.addRule(9);
        } else if (position == 'b') {
            params.addRule(12);
        } else if (position == 'r') {
            params.addRule(11);
        } else if (position == 'c') {
            params.addRule(13);
        }
        params.setMargins(0, 0, 0, 0);
    }

    /* JADX INFO: renamed from: J4 */
    private final boolean m6477J4() {
        return m6448f4().getIsShowClose();
    }

    /* JADX INFO: renamed from: K4 */
    private final boolean m6478K4() {
        return m6448f4().getIsDarkenScreen();
    }

    /* JADX INFO: renamed from: M4 */
    private final void m6479M4() {
        CTInAppWebView cTInAppWebView = this.webView;
        if (cTInAppWebView == null) {
            return;
        }
        cTInAppWebView.setFullscreen(this.isFullscreen);
        cTInAppWebView.m6269i();
        String customInAppUrl = m6448f4().getCustomInAppUrl();
        if (customInAppUrl != null && customInAppUrl.length() != 0) {
            cTInAppWebView.setWebViewClient(new WebViewClient());
            cTInAppWebView.loadUrl(customInAppUrl);
            return;
        }
        Point point = cTInAppWebView.dim;
        int i = point.y;
        int i2 = point.x;
        float f = getResources().getDisplayMetrics().density;
        int i3 = (int) (i / f);
        int i4 = (int) (i2 / f);
        String html = m6448f4().getHtml();
        if (html == null) {
            return;
        }
        String strReplaceFirst = new Regex("<head>").replaceFirst(html, "<head>".concat("<style>body{width: " + i4 + "px; height: " + i3 + "px; margin: 0; padding:0;}</style>"));
        StringBuilder sb = new StringBuilder("Density appears to be ");
        sb.append(f);
        Logger.m5927v(sb.toString());
        cTInAppWebView.setInitialScale((int) (f * 100.0f));
        cTInAppWebView.loadDataWithBaseURL(null, strReplaceFirst, MimeTypes.TEXT_HTML, "utf-8", null);
    }

    /* JADX INFO: renamed from: N4 */
    private final void m6480N4() {
        Window window;
        WindowManager.LayoutParams attributes;
        FragmentActivity activity = getActivity();
        this.isFullscreen = ((activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? 0 : attributes.flags & 1024) != 0;
    }

    @NotNull
    /* JADX INFO: renamed from: H4 */
    public RelativeLayout.LayoutParams mo6481H4(int webViewId) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(2, webViewId);
        layoutParams.addRule(1, webViewId);
        int i = -(m6451i4(40) / 2);
        layoutParams.setMargins(i, 0, 0, i);
        return layoutParams;
    }

    /* JADX INFO: renamed from: L4, reason: from getter */
    public final boolean getIsFullscreen() {
        return this.isFullscreen;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        newConfig.getClass();
        super.onConfigurationChanged(newConfig);
        m6480N4();
        m6479M4();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflater.getClass();
        m6480N4();
        return m6475G4(inflater, container);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        m6474F4();
        super.onDestroyView();
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        view.getClass();
        super.onViewCreated(view, savedInstanceState);
        m6479M4();
    }
}
