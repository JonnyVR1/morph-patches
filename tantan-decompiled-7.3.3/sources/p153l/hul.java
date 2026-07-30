package p153l;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.hellogroup.p036mk.core.pkg.WebViewPkgInfoCache;

/* JADX INFO: loaded from: classes7.dex */
public interface hul {
    /* JADX INFO: renamed from: a */
    void mo17912a();

    /* JADX INFO: renamed from: c */
    String mo17916c(String str);

    /* JADX INFO: renamed from: d */
    void mo17918d(String str, String str2);

    /* JADX INFO: renamed from: e */
    boolean mo17920e();

    /* JADX INFO: renamed from: f */
    void mo17922f(String str);

    /* JADX INFO: renamed from: g */
    void mo17923g(String str);

    String getBid();

    gjw getBoost();

    ViewGroup getContainerScaleView();

    String getLogSessionKey();

    nlw getMkWebRebuildData();

    String getOriginURL();

    Context getRealContext();

    x4d0 getResourceResponse();

    WebView getView();

    Context getWebContext();

    @Nullable
    String getWebViewId();

    ViewParent getWebViewParent();

    WebViewPkgInfoCache getWebViewPkgInfoCache();

    String getWebViewUrl();

    String getWebWorkerId();

    /* JADX INFO: renamed from: h */
    void mo17924h(String str);

    /* JADX INFO: renamed from: i */
    void mo17926i(@NonNull String str, @NonNull ValueCallback<String> valueCallback);

    boolean isDestroyed();

    boolean isVisible();

    void setWebDrawingCacheEnabled(boolean z);

    void setWebViewPost(Runnable runnable);
}
