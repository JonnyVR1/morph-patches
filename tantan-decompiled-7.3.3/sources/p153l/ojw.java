package p153l;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper;
import com.hellogroup.p036mk.business.p038ui.BaseMKProxyActivity;
import com.hellogroup.p036mk.business.widget.enhance.MKEnhanceView;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0018\u001a\u00020\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b\u0018\u0010\u0019JC\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\u0006J\u000f\u0010\"\u001a\u00020!H&¢\u0006\u0004\b\"\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b%\u0010&J\u0011\u0010'\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b'\u0010\rJ\u0019\u0010*\u001a\f\u0012\u0006\b\u0001\u0012\u00020)\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J9\u0010/\u001a\u0004\u0018\u00010.2\b\u0010,\u001a\u0004\u0018\u00010\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\b\u0010-\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b/\u00100J\u0019\u00103\u001a\u0004\u0018\u0001022\u0006\u0010,\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0011\u00106\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0004H\u0016¢\u0006\u0004\b8\u0010\u0006J\u0011\u0010:\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b:\u0010;J\u0011\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b=\u0010>J\u0011\u0010@\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\b@\u0010AJ\u0011\u0010C\u001a\u0004\u0018\u00010BH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bF\u0010GJ\u0011\u0010I\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020KH&¢\u0006\u0004\bL\u0010MJ\u0011\u0010O\u001a\u0004\u0018\u00010NH\u0016¢\u0006\u0004\bO\u0010PJ\u0011\u0010R\u001a\u0004\u0018\u00010QH&¢\u0006\u0004\bR\u0010SJ\u0011\u0010U\u001a\u0004\u0018\u00010TH\u0016¢\u0006\u0004\bU\u0010VJ%\u0010X\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\b\u0010W\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\bX\u0010Y¨\u0006Z"}, m88121d2 = {"Ll/ojw;", "", "<init>", "()V", "", BaseSei.f14624X, "()Z", "h", "Ll/kw5;", "j", "()Ll/kw5;", "", "b", "()Ljava/lang/String;", "Ll/to2;", "c", "()Ll/to2;", "Landroid/content/Context;", "context", "Lcom/hellogroup/mk/business/base/ui/MKWebView;", "mkWebView", "Lcom/hellogroup/mk/business/base/ui/MKWebViewHelper;", "webViewHelper", "", "a", "(Landroid/content/Context;Lcom/hellogroup/mk/business/base/ui/MKWebView;Lcom/hellogroup/mk/business/base/ui/MKWebViewHelper;)V", "url", "viewFlag", "isPanel", "Lcom/hellogroup/mk/business/widget/enhance/MKEnhanceView;", "r", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/hellogroup/mk/business/base/ui/MKWebView;Z)Lcom/hellogroup/mk/business/widget/enhance/MKEnhanceView;", BaseSei.f14625Y, "Ll/ivl;", BaseSei.f14626Z, "()Ll/ivl;", "Ll/elw;", "f", "()Ll/elw;", "A", "Ljava/lang/Class;", "Lcom/hellogroup/mk/business/ui/BaseMKProxyActivity;", "e", "()Ljava/lang/Class;", "activity", "uiFlag", "Landroid/view/ViewGroup;", "g", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/hellogroup/mk/business/base/ui/MKWebView;)Landroid/view/ViewGroup;", "Landroid/app/Activity;", "Ll/wam;", "u", "(Landroid/app/Activity;)Ll/wam;", "Ll/rtl;", "m", "()Ll/rtl;", RXScreenCaptureService.KEY_INDEX, "Ll/oxl;", "p", "()Ll/oxl;", "Ll/mxl;", BLiveStormDanmakuGiftResourceType.f45292l, "()Ll/mxl;", "Ll/b2m;", BLiveStormDanmakuGiftResourceType.f45294s, "()Ll/b2m;", "Ll/nvl;", ResourceDirection.f39656v, "()Ll/nvl;", "Ll/g4k;", "n", "()Ll/g4k;", "Ll/p7m;", "w", "()Ll/p7m;", "Ll/yym;", "o", "()Ll/yym;", "Ll/i5m;", Constants.KEY_T, "()Ll/i5m;", "Ll/lxl;", "q", "()Ll/lxl;", "Ll/url;", "k", "()Ll/url;", "h5Url", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public abstract class ojw {
    @Nullable
    /* JADX INFO: renamed from: A */
    public String m167941A() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo167942a(@Nullable Context context, @Nullable MKWebView mkWebView, @Nullable MKWebViewHelper webViewHelper);

    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract String mo167943b();

    @NotNull
    /* JADX INFO: renamed from: c */
    public abstract to2 mo167944c();

    @Nullable
    /* JADX INFO: renamed from: e */
    public Class<? extends BaseMKProxyActivity> m167946e() {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public elw mo167947f() {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public ViewGroup m167948g(@Nullable Context activity, @Nullable String url, @Nullable String uiFlag, @Nullable MKWebView mkWebView) {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public boolean mo167949h() {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public boolean m167950i() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public abstract kw5 mo167951j();

    @Nullable
    /* JADX INFO: renamed from: k */
    public url mo167952k() {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public mxl m167953l() {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public rtl m167954m() {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public g4k mo167955n() {
        return new h4k();
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public abstract yym mo167956o();

    @Nullable
    /* JADX INFO: renamed from: p */
    public oxl mo167957p() {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public abstract lxl mo167958q();

    @Nullable
    /* JADX INFO: renamed from: r */
    public MKEnhanceView m167959r(@Nullable Context context, @Nullable String url, @Nullable String viewFlag, @Nullable MKWebView mkWebView, boolean isPanel) {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public b2m m167960s() {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public i5m mo167961t() {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public wam m167962u(@NotNull Activity activity) {
        activity.getClass();
        return new hlw(activity);
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public nvl mo167963v() {
        return new qpd();
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public p7m m167964w() {
        return new eqf0();
    }

    /* JADX INFO: renamed from: x */
    public abstract boolean mo167965x();

    /* JADX INFO: renamed from: y */
    public boolean mo167966y() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public abstract ivl mo167967z();

    @Nullable
    /* JADX INFO: renamed from: d */
    public String mo167945d(@Nullable String url, @Nullable String h5Url) {
        return url;
    }
}
