package p149l;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.tencent.open.SocialConstants;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000b\u0010\u000fR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00020\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Ll/oqm;", "Landroid/webkit/WebViewClient;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFragment;", "fragment", "<init>", "(Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFragment;)V", "Landroid/webkit/WebView;", OMSTemplateModeType.view, "", "url", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "Landroid/webkit/WebResourceRequest;", SocialConstants.TYPE_REQUEST, "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "fragmentWr", "Ljava/lang/ref/WeakReference;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class oqm extends WebViewClient {

    @NotNull
    private final WeakReference<CTInAppBaseFragment> fragmentWr;

    public oqm(@NotNull CTInAppBaseFragment cTInAppBaseFragment) {
        cTInAppBaseFragment.getClass();
        this.fragmentWr = new WeakReference<>(cTInAppBaseFragment);
    }

    @Override // android.webkit.WebViewClient
    @SuppressLint({"UseRequiresApi"})
    @TargetApi(24)
    public boolean shouldOverrideUrlLoading(@NotNull WebView view, @NotNull WebResourceRequest request) throws UnsupportedEncodingException {
        String string;
        view.getClass();
        request.getClass();
        Uri url = request.getUrl();
        if (url == null || (string = url.toString()) == null) {
            Logger.m5873v("InAppWebViewClient : Url to open is null; not processing");
            return true;
        }
        CTInAppBaseFragment cTInAppBaseFragment = this.fragmentWr.get();
        if (cTInAppBaseFragment != null) {
            cTInAppBaseFragment.m6399l4(string);
            return true;
        }
        Logger.m5873v("InAppWebViewClient : Android view is gone, not opening url");
        return true;
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public boolean shouldOverrideUrlLoading(@NotNull WebView view, @NotNull String url) throws UnsupportedEncodingException {
        view.getClass();
        url.getClass();
        CTInAppBaseFragment cTInAppBaseFragment = this.fragmentWr.get();
        if (cTInAppBaseFragment != null) {
            cTInAppBaseFragment.m6399l4(url);
            return true;
        }
        Logger.m5873v("InAppWebViewClient : Android view is gone, not opening url");
        return true;
    }
}
