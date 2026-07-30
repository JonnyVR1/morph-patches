package p153l;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.net.URI;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\bJ#\u0010\u0018\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\u001f\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001b0\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b!\u0010\u0012J\u0017\u0010\"\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010$\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b%\u0010\u0012J!\u0010'\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010&\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b'\u0010\u0012R\u0016\u0010)\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010(R$\u00101\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00104\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010(\u001a\u0004\b+\u0010\n\"\u0004\b2\u00103¨\u00065"}, m88121d2 = {"Ll/auf;", "", "<init>", "()V", "", "url", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Z", "e", "()Z", "webViewId", "a", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "log", "source", "", "f", "(Ljava/lang/String;Ljava/lang/String;)V", "c", "Landroid/webkit/WebResourceResponse;", "response", "Landroid/webkit/WebResourceRequest;", SocialConstants.TYPE_REQUEST, "h", "(Landroid/webkit/WebResourceResponse;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "", "", "postMap", "Landroid/webkit/WebView;", OMSTemplateModeType.view, "g", "(Landroid/webkit/WebResourceRequest;Ljava/util/Map;Landroid/webkit/WebView;)Landroid/webkit/WebResourceResponse;", "j", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)V", "userAgent", "m", "title", "n", "Z", "auth", "Ll/auf$a;", "b", "Ll/auf$a;", "getListener", "()Ll/auf$a;", "k", "(Ll/auf$a;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, BLiveStormDanmakuGiftResourceType.f45292l, "(Z)V", "sendLogFDT", "MKFDT_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class auf {
    public static final auf INSTANCE = new auf();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static boolean auth;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static InterfaceC15842a listener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static boolean sendLogFDT;

    /* JADX INFO: renamed from: l.auf$a */
    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"Ll/auf$a;", "", "", "log", "source", "", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "MKFDT_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public interface InterfaceC15842a {
        /* JADX INFO: renamed from: a */
        void m100390a(@NotNull String log, @Nullable String source);
    }

    private auf() {
    }

    /* JADX INFO: renamed from: d */
    private final boolean m100376d(String url) {
        try {
            return Intrinsics.m88377d(new URI(url).getHost(), "local.m.immomo.com");
        } catch (Exception e) {
            jzv.m147729b("FDTMKHelper", "isLocalUrl 出错啦:$" + e.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    private final boolean m100377e() {
        return !auth;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m100378a(@NotNull String url, @Nullable String webViewId) {
        url.getClass();
        if (!auth) {
            return url;
        }
        Uri.Builder builderBuildUpon = Uri.parse(url).buildUpon();
        builderBuildUpon.appendQueryParameter("deviceID", "");
        builderBuildUpon.appendQueryParameter("pageID", webViewId);
        String string = builderBuildUpon.build().toString();
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m100379b() {
        return sendLogFDT;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m100380c(@Nullable String url) {
        return auth && m100376d(url);
    }

    /* JADX INFO: renamed from: f */
    public final void m100381f(@NotNull String log, @Nullable String source) {
        log.getClass();
        InterfaceC15842a interfaceC15842a = listener;
        if (interfaceC15842a != null) {
            interfaceC15842a.m100390a(log, source);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final WebResourceResponse m100382g(@Nullable WebResourceRequest request, @NotNull Map<String, byte[]> postMap, @Nullable WebView view) {
        postMap.getClass();
        m100377e();
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final WebResourceResponse m100383h(@Nullable WebResourceResponse response, @Nullable WebResourceRequest request) {
        if (m100377e()) {
            return response;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final void m100384i(@Nullable String webViewId) {
        m100377e();
    }

    /* JADX INFO: renamed from: j */
    public final void m100385j(@Nullable String webViewId, @Nullable String url) {
        m100377e();
    }

    /* JADX INFO: renamed from: l */
    public final void m100387l(boolean z) {
        sendLogFDT = z;
    }

    /* JADX INFO: renamed from: m */
    public final void m100388m(@Nullable String webViewId, @Nullable String userAgent) {
        m100377e();
    }

    /* JADX INFO: renamed from: n */
    public final void m100389n(@Nullable String webViewId, @Nullable String title) {
        m100377e();
    }

    /* JADX INFO: renamed from: k */
    public final void m100386k(@Nullable InterfaceC15842a interfaceC15842a) {
    }
}
