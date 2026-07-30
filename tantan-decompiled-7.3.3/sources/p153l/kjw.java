package p153l;

import android.content.Context;
import com.hellogroup.p036mk.business.MKConfigSetter;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper;
import com.hellogroup.p036mk.business.bridge.BusinessMediaBridge;
import com.p051p1.mobile.putong.data.Device;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/kjw;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/hellogroup/mk/business/base/ui/MKWebView;", "mkWebView", "Lcom/hellogroup/mk/business/base/ui/MKWebViewHelper;", "webViewHelper", "", "a", "(Landroid/content/Context;Lcom/hellogroup/mk/business/base/ui/MKWebView;Lcom/hellogroup/mk/business/base/ui/MKWebViewHelper;)V", "b", "(Lcom/hellogroup/mk/business/base/ui/MKWebView;)V", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class kjw {
    public static final kjw INSTANCE = new kjw();

    private kjw() {
    }

    /* JADX INFO: renamed from: a */
    public final void m150072a(@Nullable Context context, @Nullable MKWebView mkWebView, @Nullable MKWebViewHelper webViewHelper) {
        if (context == null || mkWebView == null || webViewHelper == null) {
            return;
        }
        webViewHelper.m17958H("media", new BusinessMediaBridge(mkWebView));
        webViewHelper.m17958H("ui", new hm3(mkWebView, webViewHelper));
        webViewHelper.m17958H("analyze", new oj3(context, mkWebView));
        ojw ojwVarM17763b = MKConfigSetter.INSTANCE.m17763b();
        if (ojwVarM17763b != null) {
            ojwVarM17763b.mo167942a(context, mkWebView, webViewHelper);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m150073b(@Nullable MKWebView mkWebView) {
        if (mkWebView != null) {
            fqq bridgeProcessor = mkWebView.getBridgeProcessor();
            if (bridgeProcessor != null) {
                bridgeProcessor.m126798n(Device.TYPE, new hk3(mkWebView));
            }
            if (bridgeProcessor != null) {
                bridgeProcessor.m126798n("app", new yj3(mkWebView));
            }
            if (bridgeProcessor != null) {
                bridgeProcessor.m126798n("action", new nj3(mkWebView));
            }
            if (bridgeProcessor != null) {
                bridgeProcessor.m126798n("sensor", new em3(mkWebView));
            }
            if (bridgeProcessor != null) {
                bridgeProcessor.m126798n("http", new pl3(mkWebView));
            }
        }
    }
}
