package com.hellogroup.p036mk.business.p038ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.hellogroup.p036mk.business.MKConfigSetter;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.hellogroup.p036mk.business.widget.MKSwipeRefreshLayout;
import com.hellogroup.p036mk.fdt.FDTManager;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.putong.core.data.Permissions;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.eclipse.jetty.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p153l.amw;
import p153l.ave0;
import p153l.bec0;
import p153l.brw;
import p153l.d2f;
import p153l.i8g0;
import p153l.ilw;
import p153l.jzv;
import p153l.kjw;
import p153l.mjw;
import p153l.njw;
import p153l.nlw;
import p153l.pr3;
import p153l.q9r;
import p153l.sjw;
import p153l.t1j0;
import p153l.v1r;
import p153l.vjw;
import p153l.wi20;
import p153l.wjw;
import p153l.x0c;
import p153l.x310;
import p153l.zlw;
import p153l.zue0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 £\u00012\u00020\u0001:\u0002¤\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u0019\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0092\u0001\u0010-\u001a\u00020\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010 \u001a\u00020\u001d2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2%\b\u0002\u0010,\u001a\u001f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\n\u0018\u00010)H\u0007¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b/\u0010\u0010J'\u00103\u001a\u00020\n2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u001d2\b\u00102\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\n¢\u0006\u0004\b5\u0010\fJ\r\u00106\u001a\u00020\n¢\u0006\u0004\b6\u0010\fJ\r\u00107\u001a\u00020\n¢\u0006\u0004\b7\u0010\fJ\r\u00108\u001a\u00020\n¢\u0006\u0004\b8\u0010\fJ\r\u00109\u001a\u00020\n¢\u0006\u0004\b9\u0010\fJ'\u0010=\u001a\u00020\n2\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u00062\b\u0010<\u001a\u0004\u0018\u00010!¢\u0006\u0004\b=\u0010>J-\u0010C\u001a\u00020\n2\u0006\u0010:\u001a\u00020\u00062\u000e\u0010@\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0?2\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\u001d¢\u0006\u0004\bE\u0010FJ\u0015\u0010H\u001a\u00020\n2\u0006\u0010G\u001a\u00020\u001d¢\u0006\u0004\bH\u0010IR$\u0010Q\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010\u0017R$\u0010\\\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\u0010R\"\u0010d\u001a\u00020]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR$\u0010h\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010X\u001a\u0004\bf\u0010Z\"\u0004\bg\u0010\u0010R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR$\u0010$\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR$\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR%\u0010(\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001RE\u0010,\u001a\u001f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\n\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0019\u0010\u008d\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010\u008f\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008c\u0001R\u001a\u0010\u0091\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010XR\u001a\u0010\u0093\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010XR\u001a\u0010\u0095\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010XR\u001c\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001c\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001c\u0010¡\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010\u008c\u0001¨\u0006¥\u0001"}, m88121d2 = {"Lcom/hellogroup/mk/business/ui/MKWebViewWrapper;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributes", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "q0", "()V", "", "startUrl", "s0", "(Ljava/lang/String;)V", "r0", "w0", "p0", "Lcom/hellogroup/mk/business/base/ui/MKWebView;", "mkWebView", "t0", "(Lcom/hellogroup/mk/business/base/ui/MKWebView;)V", "Landroid/app/Activity;", "o0", "()Landroid/app/Activity;", "Ll/zlw;", "mkWhiteRepairData", "", "isNeedLoadUrl", "url", "isPanel", "Landroid/content/Intent;", "intent", "Ll/ilw;", "mkWebLoadListener", "Lcom/hellogroup/mk/business/base/ui/MKWebView$f;", "onEnhanceLoadUrlListener", "Ll/x0c;", "customWebViewHelper", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "customMkInit", "u0", "(Ll/zlw;ZLjava/lang/String;ZLandroid/content/Intent;Ll/ilw;Lcom/hellogroup/mk/business/base/ui/MKWebView$f;Ll/x0c;Lkotlin/jvm/functions/Function1;)V", "y0", "actionType", "isEnable", "callback", "J0", "(IZLjava/lang/String;)V", "H0", "G0", "D0", "I0", "onDestroy", "requestCode", "resultCode", "data", "z0", "(IILandroid/content/Intent;)V", "", Permissions.TYPE, "", "grantResults", "E0", "(I[Ljava/lang/String;[I)V", "B0", "()Z", "isShow", "K0", "(Z)V", "Ll/amw;", Constants.INAPP_DATA_TAG, "Ll/amw;", "getMkWhiteScreenUtil", "()Ll/amw;", "setMkWhiteScreenUtil", "(Ll/amw;)V", "mkWhiteScreenUtil", "e", "Lcom/hellogroup/mk/business/base/ui/MKWebView;", "getMkWebView", "()Lcom/hellogroup/mk/business/base/ui/MKWebView;", "setMkWebView", "f", "Ljava/lang/String;", "getMkUrl", "()Ljava/lang/String;", "setMkUrl", "mkUrl", "Ll/q9r;", "g", "Ll/q9r;", "getBinding", "()Ll/q9r;", "setBinding", "(Ll/q9r;)V", "binding", "h", "getSwipeRefreshCallback", "setSwipeRefreshCallback", "swipeRefreshCallback", RXScreenCaptureService.KEY_INDEX, "Landroid/content/Intent;", "getIntent", "()Landroid/content/Intent;", "setIntent", "(Landroid/content/Intent;)V", "j", "Ll/ilw;", "getMkWebLoadListener", "()Ll/ilw;", "setMkWebLoadListener", "(Ll/ilw;)V", "k", "Lcom/hellogroup/mk/business/base/ui/MKWebView$f;", "getOnEnhanceLoadUrlListener", "()Lcom/hellogroup/mk/business/base/ui/MKWebView$f;", "setOnEnhanceLoadUrlListener", "(Lcom/hellogroup/mk/business/base/ui/MKWebView$f;)V", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/x0c;", "getCustomWebViewHelper", "()Ll/x0c;", "setCustomWebViewHelper", "(Ll/x0c;)V", "m", "Lkotlin/jvm/functions/Function1;", "getCustomMkInit", "()Lkotlin/jvm/functions/Function1;", "setCustomMkInit", "(Lkotlin/jvm/functions/Function1;)V", "Ll/njw;", "n", "Ll/njw;", "mkUIUtil", "o", "Z", "isRegisterKeyboardEvent", "p", "isHideLoading", "q", "loadingCustomFlag", "r", "customNavbar", BLiveStormDanmakuGiftResourceType.f45294s, "webBgColor", "Ll/d2f;", Constants.KEY_T, "Ll/d2f;", "customerLoadingViewManager", "Landroid/widget/FrameLayout;", "u", "Landroid/widget/FrameLayout;", "toolbarContainer", "Landroid/view/ViewGroup;", ResourceDirection.f39656v, "Landroid/view/ViewGroup;", "curToolbarView", "w", "Companion", "a", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class MKWebViewWrapper extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private amw mkWhiteScreenUtil;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private MKWebView mkWebView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private String mkUrl;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private q9r binding;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private String swipeRefreshCallback;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Intent intent;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private ilw mkWebLoadListener;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private MKWebView.InterfaceC3514f onEnhanceLoadUrlListener;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private x0c customWebViewHelper;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private Function1<? super MKWebView, Unit> customMkInit;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private njw mkUIUtil;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean isRegisterKeyboardEvent;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean isHideLoading;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private String loadingCustomFlag;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private String customNavbar;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private String webBgColor;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private d2f customerLoadingViewManager;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private FrameLayout toolbarContainer;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private ViewGroup curToolbarView;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private boolean isPanel;

    /* JADX INFO: renamed from: com.hellogroup.mk.business.ui.MKWebViewWrapper$c */
    @Metadata(m88120d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, m88121d2 = {"com/hellogroup/mk/business/ui/MKWebViewWrapper$c", "Lcom/hellogroup/mk/business/base/ui/MKWebView$f;", "", "url", "", "isLoadOfflinePackage", "", "c", "(Ljava/lang/String;Z)V", "", "errorCode", "errDesc", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;ILjava/lang/String;)V", "a", "(Ljava/lang/String;)V", "b", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class C3552c implements MKWebView.InterfaceC3514f {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ MKWebView.InterfaceC3514f f12265b;

        public C3552c(MKWebView.InterfaceC3514f interfaceC3514f) {
            this.f12265b = interfaceC3514f;
        }

        @Override // com.hellogroup.p036mk.business.base.p037ui.MKWebView.InterfaceC3514f
        /* JADX INFO: renamed from: a */
        public void mo17937a(@Nullable String url) {
            super.mo17937a(url);
            MKWebView.InterfaceC3514f interfaceC3514f = this.f12265b;
            if (interfaceC3514f != null) {
                interfaceC3514f.mo17937a(url);
            }
        }

        @Override // com.hellogroup.p036mk.business.base.p037ui.MKWebView.InterfaceC3514f
        /* JADX INFO: renamed from: b */
        public void mo17938b(@Nullable String url) {
            jzv.m147728a("MKWebViewWrapper", "loadUrlEnd");
            super.mo17938b(url);
            MKWebViewWrapper.this.m18175K0(false);
        }

        @Override // com.hellogroup.p036mk.business.base.p037ui.MKWebView.InterfaceC3514f
        /* JADX INFO: renamed from: c */
        public void mo17939c(@Nullable String url, boolean isLoadOfflinePackage) {
            jzv.m147728a("MKWebViewWrapper", "loadUrlStart");
            MKWebViewWrapper.this.m18175K0(true);
            MKWebView.InterfaceC3514f interfaceC3514f = this.f12265b;
            if (interfaceC3514f != null) {
                interfaceC3514f.mo17939c(url, isLoadOfflinePackage);
            }
        }

        @Override // com.hellogroup.p036mk.business.base.p037ui.MKWebView.InterfaceC3514f
        /* JADX INFO: renamed from: d */
        public void mo17940d(@Nullable String url, int errorCode, @Nullable String errDesc) {
            d2f d2fVar = MKWebViewWrapper.this.customerLoadingViewManager;
            if (d2fVar != null) {
                d2fVar.m113697h(true, url, "网络错误");
            }
            MKWebView.InterfaceC3514f interfaceC3514f = this.f12265b;
            if (interfaceC3514f != null) {
                interfaceC3514f.mo17940d(url, errorCode, errDesc);
            }
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.ui.MKWebViewWrapper$d */
    @Metadata(m88120d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m88121d2 = {"", "p", "()V"}, m88122k = 3, m88123mv = {1, 4, 0})
    public static final class C3553d implements MKSwipeRefreshLayout.InterfaceC3584j {
        public C3553d() {
        }

        @Override // com.hellogroup.p036mk.business.widget.MKSwipeRefreshLayout.InterfaceC3584j
        /* JADX INFO: renamed from: p */
        public final void mo18128p() {
            boolean zM206544h = wi20.m206544h();
            MKWebViewWrapper mKWebViewWrapper = MKWebViewWrapper.this;
            if (!zM206544h) {
                MKSwipeRefreshLayout mKSwipeRefreshLayout = mKWebViewWrapper.getBinding().f156257b;
                mKSwipeRefreshLayout.getClass();
                mKSwipeRefreshLayout.setRefreshing(false);
                t1j0.m188920p("网络异常");
                return;
            }
            boolean zIsEmpty = TextUtils.isEmpty(mKWebViewWrapper.getSwipeRefreshCallback());
            MKWebViewWrapper mKWebViewWrapper2 = MKWebViewWrapper.this;
            if (zIsEmpty) {
                MKSwipeRefreshLayout mKSwipeRefreshLayout2 = mKWebViewWrapper2.getBinding().f156257b;
                mKSwipeRefreshLayout2.getClass();
                mKSwipeRefreshLayout2.setRefreshing(false);
            } else {
                MKWebView mkWebView = mKWebViewWrapper2.getMkWebView();
                if (mkWebView != null) {
                    mkWebView.mo17918d(MKWebViewWrapper.this.getSwipeRefreshCallback(), null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.ui.MKWebViewWrapper$e */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class RunnableC3554e implements Runnable {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f12268b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f12269c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f12270d;

        public RunnableC3554e(int i, boolean z, String str) {
            this.f12268b = i;
            this.f12269c = z;
            this.f12270d = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.f12268b;
            if (i == 0) {
                MKSwipeRefreshLayout mKSwipeRefreshLayout = MKWebViewWrapper.this.getBinding().f156257b;
                mKSwipeRefreshLayout.getClass();
                mKSwipeRefreshLayout.setEnabled(this.f12269c);
            } else {
                if (i == 1) {
                    MKSwipeRefreshLayout mKSwipeRefreshLayout2 = MKWebViewWrapper.this.getBinding().f156257b;
                    mKSwipeRefreshLayout2.getClass();
                    mKSwipeRefreshLayout2.setEnabled(true);
                    MKWebViewWrapper.this.setSwipeRefreshCallback(this.f12270d);
                    return;
                }
                if (i != 2) {
                    return;
                }
                MKSwipeRefreshLayout mKSwipeRefreshLayout3 = MKWebViewWrapper.this.getBinding().f156257b;
                mKSwipeRefreshLayout3.getClass();
                mKSwipeRefreshLayout3.setRefreshing(false);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MKWebViewWrapper(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        q9r q9rVarM175844a = q9r.m175844a(LayoutInflater.from(context).inflate(bec0.f76365e, this));
        q9rVarM175844a.getClass();
        this.binding = q9rVarM175844a;
        this.mkWhiteScreenUtil = new amw();
        this.mkUIUtil = new njw();
        m18167w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public final Activity m18160o0() {
        Context context = getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        return (Activity) context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public final void m18161p0() {
        amw amwVar = this.mkWhiteScreenUtil;
        if (amwVar != null) {
            amwVar.m98863d(this.mkWebView, this, this.mkUrl, new Function2<zlw, String, Unit>() { // from class: com.hellogroup.mk.business.ui.MKWebViewWrapper$checkReloadRecycleWeb$1
                {
                    super(2);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable zlw zlwVar, @NotNull String str) {
                    str.getClass();
                    if (i8g0.m139002d(str)) {
                        this.this$0.setMkUrl(str);
                    }
                    MKWebViewWrapper mKWebViewWrapper = this.this$0;
                    MKWebViewWrapper.m18166v0(mKWebViewWrapper, zlwVar, false, null, mKWebViewWrapper.isPanel, null, null, null, null, null, HttpStatus.BAD_GATEWAY_502, null);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(zlw zlwVar, String str) {
                    invoke2(zlwVar, str);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX INFO: renamed from: q0 */
    private final void m18162q0() {
        Integer numM199048a;
        try {
            String str = this.mkUrl;
            if (str != null) {
                Uri uri = Uri.parse(str);
                this.isHideLoading = Intrinsics.m88377d("1", uri.getQueryParameter("_clsL"));
                this.loadingCustomFlag = uri.getQueryParameter("_loading");
                this.customNavbar = uri.getQueryParameter("_navbar");
                String queryParameter = uri.getQueryParameter("_bg_color");
                this.webBgColor = queryParameter;
                if (queryParameter != null && (numM199048a = v1r.m199048a(queryParameter)) != null) {
                    int iIntValue = numM199048a.intValue();
                    MKWebView mKWebView = this.mkWebView;
                    if (mKWebView != null) {
                        mKWebView.setBackgroundColor(iIntValue);
                    }
                }
                m18163r0();
                m18164s0(str);
            }
        } catch (Throwable th) {
            jzv.m147730c("MKWebViewWrapper", "", th);
        }
    }

    /* JADX INFO: renamed from: r0 */
    private final void m18163r0() {
        if (this.curToolbarView != null || this.isPanel) {
            return;
        }
        vjw vjwVar = vjw.INSTANCE;
        Activity activityM18160o0 = m18160o0();
        String str = this.mkUrl;
        MKWebView mKWebView = this.mkWebView;
        this.curToolbarView = vjwVar.m201554a(activityM18160o0, str, this.customNavbar, this.toolbarContainer, mKWebView);
    }

    /* JADX INFO: renamed from: s0 */
    private final void m18164s0(String startUrl) {
        if (this.customerLoadingViewManager == null) {
            this.customerLoadingViewManager = vjw.m201553c(vjw.INSTANCE, m18160o0(), startUrl, this.loadingCustomFlag, this, this.mkWebView, null, this.isPanel, 32, null);
            jzv.m147732e("MKWebViewWrapper", "customMkInit initEnhanceView=" + startUrl);
        }
    }

    /* JADX INFO: renamed from: t0 */
    private final void m18165t0(MKWebView mkWebView) {
        if (mkWebView != null) {
            kjw.INSTANCE.m150072a(m18160o0(), mkWebView, this.customWebViewHelper);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ void m18166v0(MKWebViewWrapper mKWebViewWrapper, zlw zlwVar, boolean z, String str, boolean z2, Intent intent, ilw ilwVar, MKWebView.InterfaceC3514f interfaceC3514f, x0c x0cVar, Function1 function1, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: initMK");
            return;
        }
        if ((i & 1) != 0) {
            zlwVar = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            str = mKWebViewWrapper.mkUrl;
        }
        if ((i & 8) != 0) {
            z2 = mKWebViewWrapper.isPanel;
        }
        if ((i & 16) != 0) {
            intent = mKWebViewWrapper.intent;
        }
        if ((i & 32) != 0) {
            ilwVar = mKWebViewWrapper.mkWebLoadListener;
        }
        if ((i & 64) != 0) {
            interfaceC3514f = mKWebViewWrapper.onEnhanceLoadUrlListener;
        }
        if ((i & 128) != 0) {
            x0cVar = mKWebViewWrapper.customWebViewHelper;
        }
        if ((i & 256) != 0) {
            function1 = mKWebViewWrapper.customMkInit;
        }
        x0c x0cVar2 = x0cVar;
        Function1 function2 = function1;
        ilw ilwVar2 = ilwVar;
        MKWebView.InterfaceC3514f interfaceC3514f2 = interfaceC3514f;
        Intent intent2 = intent;
        String str2 = str;
        zlw zlwVar2 = zlwVar;
        mKWebViewWrapper.m18176u0(zlwVar2, z, str2, z2, intent2, ilwVar2, interfaceC3514f2, x0cVar2, function2);
    }

    /* JADX INFO: renamed from: w0 */
    private final void m18167w0() {
        MKSwipeRefreshLayout mKSwipeRefreshLayout = this.binding.f156257b;
        mKSwipeRefreshLayout.getClass();
        mKSwipeRefreshLayout.setEnabled(false);
        this.binding.f156257b.setOnRefreshListener(new C3553d());
    }

    /* JADX INFO: renamed from: B0 */
    public final boolean m18168B0() {
        MKWebView mKWebView = this.mkWebView;
        return mKWebView != null && mKWebView.canGoBack();
    }

    /* JADX INFO: renamed from: D0 */
    public final void m18169D0() {
        d2f d2fVar = this.customerLoadingViewManager;
        if (d2fVar != null) {
            d2fVar.m113692c(getContext());
        }
        x0c x0cVar = this.customWebViewHelper;
        if (x0cVar != null) {
            x0cVar.mo17973u();
        }
        amw amwVar = this.mkWhiteScreenUtil;
        if (amwVar != null) {
            amwVar.m98861b();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m18170E0(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        permissions.getClass();
        grantResults.getClass();
        x0c x0cVar = this.customWebViewHelper;
        if (x0cVar != null) {
            x0cVar.m17957G(requestCode, permissions, grantResults);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m18171G0() {
        d2f d2fVar = this.customerLoadingViewManager;
        if (d2fVar != null) {
            d2fVar.m113693d(getContext());
        }
        m18161p0();
        x0c x0cVar = this.customWebViewHelper;
        if (x0cVar != null) {
            x0cVar.mo17974v();
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m18172H0() {
        d2f d2fVar = this.customerLoadingViewManager;
        if (d2fVar != null) {
            d2fVar.m113694e(getContext());
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m18173I0() {
        d2f d2fVar = this.customerLoadingViewManager;
        if (d2fVar != null) {
            d2fVar.m113695f(getContext());
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m18174J0(int actionType, boolean isEnable, @Nullable String callback) {
        x310.m209186d(new RunnableC3554e(actionType, isEnable, callback));
    }

    /* JADX INFO: renamed from: K0 */
    public final void m18175K0(boolean isShow) {
        d2f d2fVar;
        if (this.isHideLoading || (d2fVar = this.customerLoadingViewManager) == null) {
            return;
        }
        d2fVar.m113696g(isShow);
    }

    @NotNull
    public final q9r getBinding() {
        return this.binding;
    }

    @Nullable
    public final Function1<MKWebView, Unit> getCustomMkInit() {
        return this.customMkInit;
    }

    @Nullable
    public final x0c getCustomWebViewHelper() {
        return this.customWebViewHelper;
    }

    @Nullable
    public final Intent getIntent() {
        return this.intent;
    }

    @Nullable
    public final String getMkUrl() {
        return this.mkUrl;
    }

    @Nullable
    public final ilw getMkWebLoadListener() {
        return this.mkWebLoadListener;
    }

    @Nullable
    public final MKWebView getMkWebView() {
        return this.mkWebView;
    }

    @Nullable
    public final amw getMkWhiteScreenUtil() {
        return this.mkWhiteScreenUtil;
    }

    @Nullable
    public final MKWebView.InterfaceC3514f getOnEnhanceLoadUrlListener() {
        return this.onEnhanceLoadUrlListener;
    }

    @Nullable
    public final String getSwipeRefreshCallback() {
        return this.swipeRefreshCallback;
    }

    public final void onDestroy() {
        d2f d2fVar = this.customerLoadingViewManager;
        if (d2fVar != null) {
            d2fVar.m113691b(getContext());
        }
        njw njwVar = this.mkUIUtil;
        if (njwVar != null) {
            njwVar.m163475g(m18160o0());
        }
        x0c x0cVar = this.customWebViewHelper;
        if (x0cVar != null) {
            x0cVar.mo17963d();
        }
        amw amwVar = this.mkWhiteScreenUtil;
        if (amwVar != null) {
            amwVar.m98860a(this.mkWebView);
        }
    }

    public final void setBinding(@NotNull q9r q9rVar) {
        q9rVar.getClass();
        this.binding = q9rVar;
    }

    public final void setCustomMkInit(@Nullable Function1<? super MKWebView, Unit> function1) {
        this.customMkInit = function1;
    }

    public final void setCustomWebViewHelper(@Nullable x0c x0cVar) {
        this.customWebViewHelper = x0cVar;
    }

    public final void setIntent(@Nullable Intent intent) {
        this.intent = intent;
    }

    public final void setMkUrl(@Nullable String str) {
        this.mkUrl = str;
    }

    public final void setMkWebLoadListener(@Nullable ilw ilwVar) {
        this.mkWebLoadListener = ilwVar;
    }

    public final void setMkWebView(@Nullable MKWebView mKWebView) {
        this.mkWebView = mKWebView;
    }

    public final void setMkWhiteScreenUtil(@Nullable amw amwVar) {
        this.mkWhiteScreenUtil = amwVar;
    }

    public final void setOnEnhanceLoadUrlListener(@Nullable MKWebView.InterfaceC3514f interfaceC3514f) {
        this.onEnhanceLoadUrlListener = interfaceC3514f;
    }

    public final void setSwipeRefreshCallback(@Nullable String str) {
        this.swipeRefreshCallback = str;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    @JvmOverloads
    /* JADX INFO: renamed from: u0 */
    public final void m18176u0(@Nullable zlw mkWhiteRepairData, boolean isNeedLoadUrl, @Nullable String url, boolean isPanel, @Nullable Intent intent, @Nullable final ilw mkWebLoadListener, @Nullable MKWebView.InterfaceC3514f onEnhanceLoadUrlListener, @Nullable x0c customWebViewHelper, @Nullable Function1<? super MKWebView, Unit> customMkInit) {
        final MKWebViewWrapper mKWebViewWrapper;
        nlw mkRebuildData;
        MKWebView mKWebView;
        this.isPanel = isPanel;
        if (intent != null) {
            this.intent = intent;
        }
        if (mkWebLoadListener != null) {
            this.mkWebLoadListener = mkWebLoadListener;
        }
        if (onEnhanceLoadUrlListener != null) {
            this.onEnhanceLoadUrlListener = onEnhanceLoadUrlListener;
        }
        if (customWebViewHelper != null) {
            this.customWebViewHelper = customWebViewHelper;
        }
        if (customMkInit != null) {
            this.customMkInit = customMkInit;
        }
        final Activity activityM18160o0 = m18160o0();
        MKWebView mKWebViewM158641s = mjw.INSTANCE.m158641s(activityM18160o0, url, intent);
        if (mKWebViewM158641s == null) {
            mKWebViewM158641s = new MKWebView(activityM18160o0, brw.m106162a(intent, url));
        }
        this.mkWebView = mKWebViewM158641s;
        mKWebViewM158641s.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        MKWebView mKWebView2 = this.mkWebView;
        if (mKWebView2 != null) {
            mKWebView2.setDebuggable(MKConfigSetter.INSTANCE.m17766i() || FDTManager.INSTANCE.m18519k());
        }
        this.binding.f156257b.addView(this.mkWebView);
        if (mkWhiteRepairData != null && (mkRebuildData = mkWhiteRepairData.getMkRebuildData()) != null && (mKWebView = this.mkWebView) != null) {
            mKWebView.m17906I0(mkRebuildData);
        }
        if (this.customWebViewHelper == null) {
            if (customWebViewHelper == null) {
                customWebViewHelper = new C3551b(activityM18160o0, url, url);
            }
            this.customWebViewHelper = customWebViewHelper;
        }
        MKWebView mKWebView3 = this.mkWebView;
        if (mKWebView3 != null) {
            mKWebView3.setBackgroundColor(0);
        }
        MKWebView mKWebView4 = this.mkWebView;
        if (mKWebView4 != null) {
            mKWebView4.setWebUserAgent(sjw.m186321j(url));
        }
        final x0c x0cVar = this.customWebViewHelper;
        if (x0cVar != null) {
            x0cVar.m17975z(activityM18160o0, this.mkWebView);
            MKWebView mKWebView5 = this.mkWebView;
            if (mKWebView5 != null) {
                mKWebViewWrapper = this;
                mKWebView5.setMKWebLoadListener(new wjw(x0cVar) { // from class: com.hellogroup.mk.business.ui.MKWebViewWrapper$initMK$$inlined$also$lambda$1
                    @Override // p153l.dpf0, p153l.ilw
                    /* JADX INFO: renamed from: a */
                    public boolean mo17977a(@Nullable ConsoleMessage consoleMessage) {
                        ilw ilwVar = mkWebLoadListener;
                        return ilwVar != null ? ilwVar.mo17977a(consoleMessage) : super.mo17977a(consoleMessage);
                    }

                    @Override // p153l.dpf0, p153l.ilw
                    /* JADX INFO: renamed from: b */
                    public boolean mo18180b(@Nullable WebView webView, @Nullable String str, @Nullable String str2, @Nullable JsResult jsResult) {
                        ilw ilwVar = mkWebLoadListener;
                        return ilwVar != null ? ilwVar.mo18180b(webView, str, str2, jsResult) : super.mo18180b(webView, str, str2, jsResult);
                    }

                    @Override // p153l.dpf0, p153l.ilw
                    /* JADX INFO: renamed from: c */
                    public boolean mo18181c(@Nullable WebView webView, @Nullable String str, @Nullable String str2, @Nullable JsResult jsResult) {
                        ilw ilwVar = mkWebLoadListener;
                        return ilwVar != null ? ilwVar.mo18181c(webView, str, str2, jsResult) : super.mo18181c(webView, str, str2, jsResult);
                    }

                    @Override // p153l.dpf0, p153l.ilw
                    /* JADX INFO: renamed from: d */
                    public boolean mo18182d(@Nullable WebView webView, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable JsPromptResult jsPromptResult) {
                        ilw ilwVar = mkWebLoadListener;
                        return ilwVar != null ? ilwVar.mo18182d(webView, str, str2, str3, jsPromptResult) : super.mo18182d(webView, str, str2, str3, jsPromptResult);
                    }

                    @Override // p153l.wjw, p153l.dpf0, p153l.ilw
                    /* JADX INFO: renamed from: e */
                    public void mo17978e(@Nullable WebView webView, int i, @Nullable String str, @Nullable String str2) {
                        super.mo17978e(webView, i, str, str2);
                        ilw ilwVar = mkWebLoadListener;
                        if (ilwVar != null) {
                            ilwVar.mo17978e(webView, i, str, str2);
                        }
                    }

                    @Override // p153l.wjw, p153l.dpf0, p153l.ilw
                    /* JADX INFO: renamed from: f */
                    public void mo17979f(@Nullable WebView webView, @Nullable String str) {
                        super.mo17979f(webView, str);
                        ilw ilwVar = mkWebLoadListener;
                        if (ilwVar != null) {
                            ilwVar.mo17979f(webView, str);
                        }
                        if (mKWebViewWrapper.isRegisterKeyboardEvent) {
                            return;
                        }
                        mKWebViewWrapper.isRegisterKeyboardEvent = true;
                        njw njwVar = mKWebViewWrapper.mkUIUtil;
                        if (njwVar != null) {
                            njwVar.m163474f(mKWebViewWrapper.m18160o0(), mKWebViewWrapper.getMkWebView());
                        }
                    }

                    @Override // p153l.wjw, p153l.dpf0, p153l.ilw
                    /* JADX INFO: renamed from: g */
                    public void mo17980g(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
                        super.mo17980g(webView, str, bitmap);
                        ilw ilwVar = mkWebLoadListener;
                        if (ilwVar != null) {
                            ilwVar.mo17980g(webView, str, bitmap);
                        }
                    }

                    @Override // p153l.dpf0, p153l.ilw
                    /* JADX INFO: renamed from: h */
                    public void mo18130h(@Nullable WebView webView, int i) {
                        super.mo18130h(webView, i);
                        ilw ilwVar = mkWebLoadListener;
                        if (ilwVar != null) {
                            ilwVar.mo18130h(webView, i);
                        }
                    }

                    @Override // p153l.dpf0, p153l.ilw
                    /* JADX INFO: renamed from: i */
                    public void mo18183i(@Nullable WebView webView, @Nullable Bitmap bitmap) {
                        super.mo18183i(webView, bitmap);
                        ilw ilwVar = mkWebLoadListener;
                        if (ilwVar != null) {
                            ilwVar.mo18183i(webView, bitmap);
                        }
                    }

                    @Override // p153l.ilw
                    /* JADX INFO: renamed from: j */
                    public void mo18184j(@Nullable WebView webView, @Nullable SslErrorHandler sslErrorHandler, @Nullable SslError sslError) {
                        super.mo18184j(webView, sslErrorHandler, sslError);
                        ilw ilwVar = mkWebLoadListener;
                        if (ilwVar != null) {
                            ilwVar.mo18184j(webView, sslErrorHandler, sslError);
                        }
                    }

                    @Override // p153l.dpf0, p153l.ilw
                    /* JADX INFO: renamed from: k */
                    public void mo17981k(@Nullable WebView webView, @Nullable String str) {
                        super.mo17981k(webView, str);
                        ilw ilwVar = mkWebLoadListener;
                        if (ilwVar != null) {
                            ilwVar.mo17981k(webView, str);
                        }
                    }

                    @Override // p153l.wjw, p153l.ilw
                    /* JADX INFO: renamed from: l */
                    public void mo18131l(@Nullable WebView webView, @Nullable RenderProcessGoneDetail renderProcessGoneDetail) {
                        super.mo18131l(webView, renderProcessGoneDetail);
                        amw mkWhiteScreenUtil = mKWebViewWrapper.getMkWhiteScreenUtil();
                        if (mkWhiteScreenUtil != null) {
                            mkWhiteScreenUtil.m98862c(mKWebViewWrapper.getMkWebView(), webView, new Function0<Unit>() { // from class: com.hellogroup.mk.business.ui.MKWebViewWrapper$initMK$$inlined$also$lambda$1.1
                                {
                                    super(0);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    mKWebViewWrapper.m18161p0();
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }
                            });
                        }
                        ilw ilwVar = mkWebLoadListener;
                        if (ilwVar != null) {
                            ilwVar.mo18131l(webView, renderProcessGoneDetail);
                        }
                    }

                    @Override // p153l.ilw
                    @Nullable
                    /* JADX INFO: renamed from: m */
                    public WebResourceResponse mo18185m(@Nullable WebView webView, @Nullable String str) {
                        WebResourceResponse webResourceResponseMo18185m;
                        ilw ilwVar = mkWebLoadListener;
                        return (ilwVar == null || (webResourceResponseMo18185m = ilwVar.mo18185m(webView, str)) == null) ? super.mo18185m(webView, str) : webResourceResponseMo18185m;
                    }

                    @Override // p153l.dpf0, p153l.ilw
                    @Nullable
                    /* JADX INFO: renamed from: n */
                    public WebResourceResponse mo18132n(@Nullable WebView webView, @Nullable String str) {
                        WebResourceResponse webResourceResponseMo18132n;
                        ilw ilwVar = mkWebLoadListener;
                        return (ilwVar == null || (webResourceResponseMo18132n = ilwVar.mo18132n(webView, str)) == null) ? super.mo18132n(webView, str) : webResourceResponseMo18132n;
                    }

                    @Override // p153l.ilw
                    /* JADX INFO: renamed from: o */
                    public boolean mo18186o(@Nullable WebView webView, @Nullable String str) {
                        ilw ilwVar = mkWebLoadListener;
                        return ilwVar != null ? ilwVar.mo18186o(webView, str) : super.mo18186o(webView, str);
                    }
                });
            } else {
                mKWebViewWrapper = this;
            }
        } else {
            mKWebViewWrapper = this;
        }
        mKWebViewWrapper.m18165t0(mKWebViewWrapper.mkWebView);
        MKWebView mKWebView6 = mKWebViewWrapper.mkWebView;
        if (mKWebView6 != null) {
            mKWebView6.setOnLoadUrlListener(mKWebViewWrapper.new C3552c(onEnhanceLoadUrlListener));
        }
        MKWebView mKWebView7 = mKWebViewWrapper.mkWebView;
        if (mKWebView7 != null && customMkInit != null) {
            customMkInit.invoke(mKWebView7);
        }
        if (isNeedLoadUrl) {
            mKWebViewWrapper.m18177y0(url);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m18177y0(@Nullable String url) {
        if (url != null) {
            this.mkUrl = url;
            m18162q0();
            MKWebView mKWebView = this.mkWebView;
            if (mKWebView != null) {
                mKWebView.loadUrl(url);
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m18178z0(int requestCode, int resultCode, @Nullable Intent data) {
        x0c x0cVar = this.customWebViewHelper;
        if (x0cVar != null) {
            x0cVar.m17956E(requestCode, resultCode, data);
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.ui.MKWebViewWrapper$b */
    @Metadata(m88120d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001e\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010\u001a¨\u0006!"}, m88121d2 = {"com/hellogroup/mk/business/ui/MKWebViewWrapper$b", "Ll/x0c;", "", "actionType", "", "isEnable", "", "callback", "", "w", "(IZLjava/lang/String;)V", "Ll/ave0;", "uiParams", "k", "(Ll/ave0;)V", "show", "e", "(Z)V", "title", "g", "(Ljava/lang/String;)V", "Ll/zue0;", CommandMessage.PARAMS, "r", "(Ll/zue0;)V", "f", "()V", "url", "Lorg/json/JSONObject;", "jsParams", "m", "(Ljava/lang/String;Lorg/json/JSONObject;)Z", "closePage", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class C3551b extends x0c {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ Activity f12262n;

        /* JADX INFO: renamed from: o */
        final /* synthetic */ String f12263o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3551b(Activity activity, String str, String str2) {
            super(str2);
            this.f12262n = activity;
            this.f12263o = str;
        }

        @Override // p153l.x0c, p153l.ziw
        public void closePage() {
            Activity activity = this.f12262n;
            if (activity != null) {
                activity.onBackPressed();
            }
        }

        @Override // p153l.x0c, p153l.flw
        /* JADX INFO: renamed from: e */
        public void mo18038e(boolean show) {
        }

        @Override // p153l.x0c, p153l.ziw
        /* JADX INFO: renamed from: f */
        public void mo18039f() {
        }

        @Override // p153l.x0c, p153l.flw
        /* JADX INFO: renamed from: g */
        public void mo18040g(@Nullable String title) {
        }

        @Override // com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper, p153l.flw
        /* JADX INFO: renamed from: m */
        public boolean mo17968m(@Nullable String url, @Nullable JSONObject jsParams) {
            return super.mo17968m(url, jsParams);
        }

        @Override // p153l.flw
        /* JADX INFO: renamed from: w */
        public void mo18179w(int actionType, boolean isEnable, @Nullable String callback) {
            MKWebViewWrapper.this.m18174J0(actionType, isEnable, callback);
        }

        @Override // p153l.x0c, p153l.flw
        /* JADX INFO: renamed from: k */
        public void mo18041k(@Nullable ave0 uiParams) {
        }

        @Override // p153l.x0c, p153l.flw
        /* JADX INFO: renamed from: r */
        public void mo18043r(@Nullable zue0 params) {
        }
    }

    @JvmOverloads
    public MKWebViewWrapper(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ MKWebViewWrapper(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @JvmOverloads
    public MKWebViewWrapper(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }
}
