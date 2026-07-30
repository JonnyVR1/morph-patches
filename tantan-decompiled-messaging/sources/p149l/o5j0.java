package p149l;

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
import com.p046p1.mobile.putong.app.web.WebViewClientX;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.live.base.webview.SelfTouchWebView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p147v.VImage;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m87232d2 = {"Ll/o5j0;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "url", "", "j", "(Ljava/lang/String;)V", "h", "()V", "a", "Landroid/content/Context;", "Landroid/view/View;", "b", "Landroid/view/View;", "root", "Lcom/p1/mobile/putong/live/base/webview/SelfTouchWebView;", "c", "Lcom/p1/mobile/putong/live/base/webview/SelfTouchWebView;", "webView", "Lv/VImage;", Constants.INAPP_DATA_TAG, "Lv/VImage;", "closeImage", "Ll/hu0;", "e", "Lkotlin/Lazy;", RXScreenCaptureService.KEY_INDEX, "()Ll/hu0;", OMSTemplateType.dialog, "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class o5j0 {

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

    /* JADX INFO: renamed from: l.o5j0$a */
    @Metadata(m87231d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"l/o5j0$a", "Ll/thp0;", "Landroid/webkit/WebView;", OMSTemplateModeType.view, "", "newProgress", "", "onProgressChanged", "(Landroid/webkit/WebView;I)V", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C18847a extends thp0 {
        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView view, int newProgress) {
            super.onProgressChanged(view, newProgress);
        }
    }

    /* JADX INFO: renamed from: l.o5j0$b */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"l/o5j0$b", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "()V", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC18848b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BottomSheetBehavior<FrameLayout> f141913b;

        public ViewTreeObserverOnGlobalLayoutListenerC18848b(BottomSheetBehavior<FrameLayout> bottomSheetBehavior) {
            this.f141913b = bottomSheetBehavior;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            SelfTouchWebView selfTouchWebView = o5j0.this.webView;
            View view = null;
            if (selfTouchWebView == null) {
                Intrinsics.m87502r("webView");
                selfTouchWebView = null;
            }
            ViewGroup.LayoutParams layoutParams = selfTouchWebView.getLayoutParams();
            layoutParams.height = xdl0.m208330F(o5j0.this.context).y;
            SelfTouchWebView selfTouchWebView2 = o5j0.this.webView;
            if (selfTouchWebView2 == null) {
                Intrinsics.m87502r("webView");
                selfTouchWebView2 = null;
            }
            selfTouchWebView2.setLayoutParams(layoutParams);
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f141913b;
            View view2 = o5j0.this.root;
            if (view2 == null) {
                Intrinsics.m87502r("root");
                view2 = null;
            }
            bottomSheetBehavior.setPeekHeight(view2.getHeight());
            View view3 = o5j0.this.root;
            if (view3 == null) {
                Intrinsics.m87502r("root");
            } else {
                view = view3;
            }
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: l.o5j0$c */
    @Metadata(m87231d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"l/o5j0$c", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "p0", "", "p1", "", "onStateChanged", "(Landroid/view/View;I)V", "", "onSlide", "(Landroid/view/View;F)V", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C18849c extends BottomSheetBehavior.BottomSheetCallback {
        public C18849c() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View p0, float p1) {
            p0.getClass();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View p0, int p1) {
            p0.getClass();
            if (p1 == 4) {
                o5j0.this.m162795i().dismiss();
            }
        }
    }

    public o5j0(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.dialog = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.m5j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o5j0.m162788b(this.f131400a);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static l5j0 m162788b(final o5j0 o5j0Var) {
        l5j0 l5j0Var = new l5j0(o5j0Var.context, b8c0.f74085b);
        VImage vImage = null;
        View viewInflate = LayoutInflater.from(l5j0Var.getContext()).inflate(q6c0.f152872K, (ViewGroup) null, false);
        viewInflate.getClass();
        o5j0Var.root = viewInflate;
        l5j0Var.setContentView(viewInflate);
        View view = o5j0Var.root;
        if (view == null) {
            Intrinsics.m87502r("root");
            view = null;
        }
        View viewFindViewById = view.findViewById(d5c0.f84502o1);
        viewFindViewById.getClass();
        o5j0Var.webView = (SelfTouchWebView) viewFindViewById;
        View view2 = o5j0Var.root;
        if (view2 == null) {
            Intrinsics.m87502r("root");
            view2 = null;
        }
        View viewFindViewById2 = view2.findViewById(d5c0.f84474f0);
        viewFindViewById2.getClass();
        o5j0Var.closeImage = (VImage) viewFindViewById2;
        SelfTouchWebView selfTouchWebView = o5j0Var.webView;
        if (selfTouchWebView == null) {
            Intrinsics.m87502r("webView");
            selfTouchWebView = null;
        }
        selfTouchWebView.setWebViewClientX(new WebViewClientX());
        SelfTouchWebView selfTouchWebView2 = o5j0Var.webView;
        if (selfTouchWebView2 == null) {
            Intrinsics.m87502r("webView");
            selfTouchWebView2 = null;
        }
        selfTouchWebView2.setWebChromeClientX(new C18847a());
        VImage vImage2 = o5j0Var.closeImage;
        if (vImage2 == null) {
            Intrinsics.m87502r("closeImage");
        } else {
            vImage = vImage2;
        }
        xdl0.m208329E0(vImage, new View.OnClickListener() { // from class: l.n5j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                o5j0.m162793g(this.f137215a, view3);
            }
        });
        return l5j0Var;
    }

    /* JADX INFO: renamed from: g */
    public static final void m162793g(o5j0 o5j0Var, View view) {
        o5j0Var.m162795i().dismiss();
    }

    /* JADX INFO: renamed from: h */
    public final void m162794h() {
        Window window = m162795i().getWindow();
        if (NullChecker.m81303a(window)) {
            window.getClass();
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) window.findViewById(R.id.content).findViewById(d5c0.f84416F));
            bottomSheetBehaviorFrom.getClass();
            bottomSheetBehaviorFrom.setState(3);
            bottomSheetBehaviorFrom.setPeekHeight(0);
            View view = this.root;
            if (view == null) {
                Intrinsics.m87502r("root");
                view = null;
            }
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC18848b(bottomSheetBehaviorFrom));
            bottomSheetBehaviorFrom.addBottomSheetCallback(new C18849c());
        }
    }

    /* JADX INFO: renamed from: i */
    public final hu0 m162795i() {
        return (hu0) this.dialog.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final void m162796j(@NotNull String url) {
        url.getClass();
        if (!m162795i().isShowing()) {
            m162795i().show();
            m162794h();
        }
        SelfTouchWebView selfTouchWebView = this.webView;
        if (selfTouchWebView == null) {
            Intrinsics.m87502r("webView");
            selfTouchWebView = null;
        }
        selfTouchWebView.loadUrl(url);
    }
}
