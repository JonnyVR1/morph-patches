package com.clevertap.android.sdk.inapp.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.CTInAppWebView;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import java.io.UnsupportedEncodingException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.eclipse.jetty.http.MimeTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.gw3;
import p149l.oqm;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u0000 32\u00020\u00012\u00020\u00022\u00020\u0003:\u000245B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J#\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0005J\u001b\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u0005J!\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b%\u0010&J!\u0010)\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00066"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBasePartialHtmlFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBasePartialFragment;", "Landroid/view/View$OnTouchListener;", "Landroid/view/View$OnLongClickListener;", "<init>", "()V", "", "x4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "y4", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "B4", OMSTemplateModeType.view, "z4", "(Landroid/view/View;)Landroid/view/ViewGroup;", "A4", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", ResourceDirection.f38808v, "", "onLongClick", "(Landroid/view/View;)Z", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Landroid/view/GestureDetector;", "I", "Landroid/view/GestureDetector;", "gd", "Lcom/clevertap/android/sdk/inapp/CTInAppWebView;", "J", "Lcom/clevertap/android/sdk/inapp/CTInAppWebView;", "webView", "Companion", "b", "a", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public abstract class CTInAppBasePartialHtmlFragment extends CTInAppBasePartialFragment implements View.OnTouchListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private GestureDetector gd;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @Nullable
    private CTInAppWebView webView;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.fragment.CTInAppBasePartialHtmlFragment$b */
    @Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBasePartialHtmlFragment$b;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "<init>", "(Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBasePartialHtmlFragment;)V", "Landroid/view/MotionEvent;", "e1", "e2", "", "velocityX", "velocityY", "", "onFling", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "ltr", "a", "(Z)Z", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public final class C1245b extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.fragment.CTInAppBasePartialHtmlFragment$b$a */
        @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m87232d2 = {"com/clevertap/android/sdk/inapp/fragment/CTInAppBasePartialHtmlFragment$b$a", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "onAnimationRepeat", "onAnimationStart", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
        public static final class a implements Animation.AnimationListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ CTInAppBasePartialHtmlFragment f5114a;

            public a(CTInAppBasePartialHtmlFragment cTInAppBasePartialHtmlFragment) {
                this.f5114a = cTInAppBasePartialHtmlFragment;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) throws UnsupportedEncodingException {
                this.f5114a.m6407t4(CTInAppAction.INSTANCE.m6130a(), "swipe-dismiss", null);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        public C1245b() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m6439a(boolean ltr) {
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(ltr ? new TranslateAnimation(0.0f, CTInAppBasePartialHtmlFragment.this.m6397i4(50), 0.0f, 0.0f) : new TranslateAnimation(0.0f, -CTInAppBasePartialHtmlFragment.this.m6397i4(50), 0.0f, 0.0f));
            animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
            animationSet.setDuration(300L);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setAnimationListener(new a(CTInAppBasePartialHtmlFragment.this));
            CTInAppWebView cTInAppWebView = CTInAppBasePartialHtmlFragment.this.webView;
            if (cTInAppWebView != null) {
                cTInAppWebView.startAnimation(animationSet);
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(@Nullable MotionEvent e1, @NotNull MotionEvent e2, float velocityX, float velocityY) {
            e2.getClass();
            if (e1 != null) {
                if (e1.getX() - e2.getX() > 120.0f && Math.abs(velocityX) > 200.0d) {
                    return m6439a(false);
                }
                if (e2.getX() - e1.getX() > 120.0f && Math.abs(velocityX) > 200.0d) {
                    return m6439a(true);
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: B4 */
    private final void m6433B4() {
        CTInAppWebView cTInAppWebView = this.webView;
        if (cTInAppWebView == null) {
            return;
        }
        cTInAppWebView.m6215i();
        Point point = cTInAppWebView.dim;
        int i = point.y;
        int i2 = point.x;
        float f = getResources().getDisplayMetrics().density;
        int i3 = (int) (i / f);
        int i4 = (int) (i2 / f);
        String html = m6394f4().getHtml();
        if (html == null) {
            return;
        }
        String strReplaceFirst = new Regex("<head>").replaceFirst(html, "<head>".concat("<style>body{width: " + i4 + "px; height: " + i3 + "px; margin: 0; padding:0;}</style>"));
        StringBuilder sb = new StringBuilder("Density appears to be ");
        sb.append(f);
        Logger.m5873v(sb.toString());
        cTInAppWebView.setInitialScale((int) (f * 100.0f));
        cTInAppWebView.loadDataWithBaseURL(null, strReplaceFirst, MimeTypes.TEXT_HTML, "utf-8", null);
    }

    /* JADX INFO: renamed from: x4 */
    private final void m6435x4() {
        try {
            CTInAppWebView cTInAppWebView = this.webView;
            if (cTInAppWebView != null) {
                cTInAppWebView.m6214g(m6394f4().getIsJsEnabled());
            }
            this.webView = null;
        } catch (Exception e) {
            m6392d4().getLogger().verbose("cleanupWebView -> there was a crash in cleanup", e);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: y4 */
    private final View m6436y4(LayoutInflater inflater, ViewGroup container) {
        try {
            View viewMo6437A4 = mo6437A4(inflater, container);
            ViewGroup viewGroupMo6438z4 = mo6438z4(viewMo6437A4);
            Context context = inflater.getContext();
            context.getClass();
            CTInAppWebView cTInAppWebView = new CTInAppWebView(context, m6394f4().getWidth(), m6394f4().getHeight(), m6394f4().getWidthPercentage(), m6394f4().getHeightPercentage(), m6394f4().getAspectRatio());
            this.webView = cTInAppWebView;
            cTInAppWebView.setWebViewClient(new oqm(this));
            cTInAppWebView.setOnTouchListener(this);
            cTInAppWebView.setOnLongClickListener(this);
            if (m6394f4().getIsJsEnabled()) {
                cTInAppWebView.setJavaScriptInterface(new gw3(CleverTapAPI.m5760U(getActivity(), m6392d4()), this));
            }
            if (viewGroupMo6438z4 != null) {
                viewGroupMo6438z4.addView(cTInAppWebView);
            }
            return viewMo6437A4;
        } catch (Throwable th) {
            m6392d4().getLogger().verbose(m6392d4().getAccountId(), "Fragment view not created", th);
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: A4 */
    public abstract View mo6437A4(@NotNull LayoutInflater inflater, @Nullable ViewGroup container);

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        context.getClass();
        super.onAttach(context);
        this.gd = new GestureDetector(context, new C1245b());
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        newConfig.getClass();
        super.onConfigurationChanged(newConfig);
        m6433B4();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflater.getClass();
        return m6436y4(inflater, container);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        m6435x4();
        super.onDestroyView();
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(@Nullable View v2) {
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@Nullable View v2, @NotNull MotionEvent event) {
        event.getClass();
        GestureDetector gestureDetector = this.gd;
        if (gestureDetector == null) {
            Intrinsics.m87502r("gd");
            gestureDetector = null;
        }
        return gestureDetector.onTouchEvent(event) || event.getAction() == 2;
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        view.getClass();
        super.onViewCreated(view, savedInstanceState);
        m6433B4();
    }

    @Nullable
    /* JADX INFO: renamed from: z4 */
    public abstract ViewGroup mo6438z4(@Nullable View view);
}
