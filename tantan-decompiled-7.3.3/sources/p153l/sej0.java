package p153l;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.putong.app.web.WebViewClientX;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.live.base.webview.SelfTouchWebView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p151v.VImage;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m88121d2 = {"Ll/sej0;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "url", "", "j", "(Ljava/lang/String;)V", "h", "()V", "a", "Landroid/content/Context;", "Landroid/view/View;", "b", "Landroid/view/View;", "root", "Lcom/p1/mobile/putong/live/base/webview/SelfTouchWebView;", "c", "Lcom/p1/mobile/putong/live/base/webview/SelfTouchWebView;", "webView", "Lv/VImage;", Constants.INAPP_DATA_TAG, "Lv/VImage;", "closeImage", "Ll/nu0;", "e", "Lkotlin/Lazy;", RXScreenCaptureService.KEY_INDEX, "()Ll/nu0;", OMSTemplateType.dialog, "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class sej0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public View root;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public SelfTouchWebView webView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VImage closeImage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Lazy dialog;

    /* JADX INFO: renamed from: l.sej0$a */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"l/sej0$a", "Ll/wqp0;", "Landroid/webkit/WebView;", OMSTemplateModeType.view, "", "newProgress", "", "onProgressChanged", "(Landroid/webkit/WebView;I)V", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20027a extends wqp0 {
        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView view, int newProgress) {
            super.onProgressChanged(view, newProgress);
        }
    }

    /* JADX INFO: renamed from: l.sej0$b */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"l/sej0$b", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "()V", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC20028b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BottomSheetBehavior<FrameLayout> f167626b;

        public ViewTreeObserverOnGlobalLayoutListenerC20028b(BottomSheetBehavior<FrameLayout> bottomSheetBehavior) {
            this.f167626b = bottomSheetBehavior;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            SelfTouchWebView selfTouchWebView = sej0.this.webView;
            View view = null;
            if (selfTouchWebView == null) {
                Intrinsics.m88391r("webView");
                selfTouchWebView = null;
            }
            ViewGroup.LayoutParams layoutParams = selfTouchWebView.getLayoutParams();
            layoutParams.height = bnl0.m105510F(sej0.this.context).y;
            SelfTouchWebView selfTouchWebView2 = sej0.this.webView;
            if (selfTouchWebView2 == null) {
                Intrinsics.m88391r("webView");
                selfTouchWebView2 = null;
            }
            selfTouchWebView2.setLayoutParams(layoutParams);
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f167626b;
            View view2 = sej0.this.root;
            if (view2 == null) {
                Intrinsics.m88391r("root");
                view2 = null;
            }
            bottomSheetBehavior.setPeekHeight(view2.getHeight());
            View view3 = sej0.this.root;
            if (view3 == null) {
                Intrinsics.m88391r("root");
            } else {
                view = view3;
            }
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: l.sej0$c */
    @Metadata(m88120d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"l/sej0$c", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "p0", "", "p1", "", "onStateChanged", "(Landroid/view/View;I)V", "", "onSlide", "(Landroid/view/View;F)V", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20029c extends BottomSheetBehavior.BottomSheetCallback {
        public C20029c() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View p0, float p1) {
            p0.getClass();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View p0, int p1) {
            p0.getClass();
            if (p1 == 4) {
                sej0.this.m185559i().dismiss();
            }
        }
    }

    public sej0(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.dialog = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.qej0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return sej0.m185552b(this.f157188a);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static pej0 m185552b(final sej0 sej0Var) {
        pej0 pej0Var = new pej0(sej0Var.context, ggc0.f104004b);
        VImage vImage = null;
        View viewInflate = LayoutInflater.from(pej0Var.getContext()).inflate(vec0.f183729K, (ViewGroup) null, false);
        viewInflate.getClass();
        sej0Var.root = viewInflate;
        pej0Var.setContentView(viewInflate);
        View view = sej0Var.root;
        if (view == null) {
            Intrinsics.m88391r("root");
            view = null;
        }
        View viewFindViewById = view.findViewById(jdc0.f120220o1);
        viewFindViewById.getClass();
        sej0Var.webView = (SelfTouchWebView) viewFindViewById;
        View view2 = sej0Var.root;
        if (view2 == null) {
            Intrinsics.m88391r("root");
            view2 = null;
        }
        View viewFindViewById2 = view2.findViewById(jdc0.f120192f0);
        viewFindViewById2.getClass();
        sej0Var.closeImage = (VImage) viewFindViewById2;
        SelfTouchWebView selfTouchWebView = sej0Var.webView;
        if (selfTouchWebView == null) {
            Intrinsics.m88391r("webView");
            selfTouchWebView = null;
        }
        selfTouchWebView.setWebViewClientX(new WebViewClientX());
        SelfTouchWebView selfTouchWebView2 = sej0Var.webView;
        if (selfTouchWebView2 == null) {
            Intrinsics.m88391r("webView");
            selfTouchWebView2 = null;
        }
        selfTouchWebView2.setWebChromeClientX(new C20027a());
        VImage vImage2 = sej0Var.closeImage;
        if (vImage2 == null) {
            Intrinsics.m88391r("closeImage");
        } else {
            vImage = vImage2;
        }
        bnl0.m105509E0(vImage, new View.OnClickListener() { // from class: l.rej0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                sej0.m185557g(this.f162656a, view3);
            }
        });
        return pej0Var;
    }

    /* JADX INFO: renamed from: g */
    public static final void m185557g(sej0 sej0Var, View view) {
        sej0Var.m185559i().dismiss();
    }

    /* JADX INFO: renamed from: h */
    public final void m185558h() {
        Window window = m185559i().getWindow();
        if (NullChecker.m82486a(window)) {
            window.getClass();
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) window.findViewById(R.id.content).findViewById(jdc0.f120134F));
            bottomSheetBehaviorFrom.getClass();
            bottomSheetBehaviorFrom.setState(3);
            bottomSheetBehaviorFrom.setPeekHeight(0);
            View view = this.root;
            if (view == null) {
                Intrinsics.m88391r("root");
                view = null;
            }
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC20028b(bottomSheetBehaviorFrom));
            bottomSheetBehaviorFrom.addBottomSheetCallback(new C20029c());
        }
    }

    /* JADX INFO: renamed from: i */
    public final nu0 m185559i() {
        return (nu0) this.dialog.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final void m185560j(@NotNull String url) {
        url.getClass();
        if (!m185559i().isShowing()) {
            m185559i().show();
            m185558h();
        }
        SelfTouchWebView selfTouchWebView = this.webView;
        if (selfTouchWebView == null) {
            Intrinsics.m88391r("webView");
            selfTouchWebView = null;
        }
        selfTouchWebView.loadUrl(url);
    }
}
