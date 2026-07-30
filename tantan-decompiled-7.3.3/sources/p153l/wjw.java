package p153l;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0016\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001a\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, m88121d2 = {"Ll/wjw;", "Ll/dpf0;", "Ll/nxl;", "mkHelper", "<init>", "(Ll/nxl;)V", "Landroid/webkit/WebView;", "webview", "", "url", "Landroid/graphics/Bitmap;", "favicon", "", "g", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "f", "(Landroid/webkit/WebView;Ljava/lang/String;)V", OMSTemplateModeType.view, "", "errorCode", "description", "failingUrl", "e", "(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V", "Landroid/webkit/RenderProcessGoneDetail;", "detail", BLiveStormDanmakuGiftResourceType.f45292l, "(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)V", "", "c", "J", "start", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "TAG", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class wjw extends dpf0 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long start;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String TAG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjw(@NotNull nxl nxlVar) {
        super(nxlVar);
        nxlVar.getClass();
        this.TAG = "MKCustomWebLoadListener";
    }

    @Override // p153l.dpf0, p153l.ilw
    /* JADX INFO: renamed from: e */
    public void mo17978e(@Nullable WebView view, int errorCode, @Nullable String description, @Nullable String failingUrl) {
        super.mo17978e(view, errorCode, description, failingUrl);
        jzv.m147728a(this.TAG, "onPageError");
    }

    @Override // p153l.dpf0, p153l.ilw
    /* JADX INFO: renamed from: f */
    public void mo17979f(@Nullable WebView webview, @Nullable String url) {
        super.mo17979f(webview, url);
        jzv.m147728a(this.TAG, "onPageFinished: " + (System.currentTimeMillis() - this.start) + " ms");
    }

    @Override // p153l.dpf0, p153l.ilw
    /* JADX INFO: renamed from: g */
    public void mo17980g(@Nullable WebView webview, @Nullable String url, @Nullable Bitmap favicon) {
        super.mo17980g(webview, url, favicon);
        this.start = System.currentTimeMillis();
        jzv.m147728a(this.TAG, "onPageStart");
    }

    @Override // p153l.ilw
    /* JADX INFO: renamed from: l */
    public void mo18131l(@Nullable WebView view, @Nullable RenderProcessGoneDetail detail) {
        super.mo18131l(view, detail);
    }
}
