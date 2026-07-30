package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.fep.base.core.FepManager;
import com.hellogroup.fep.feppkg.internal.core.CheckPolicy;
import com.hellogroup.p036mk.core.pkg.WebViewPkgInfoCache;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\n\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010!\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R#\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b0\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b#\u0010)R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b*\u0010)R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010+¨\u0006,"}, m88121d2 = {"Ll/x4d0;", "", "", "bid", "url", "Lcom/hellogroup/mk/core/pkg/WebViewPkgInfoCache;", "webViewPkgInfoCache", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/hellogroup/mk/core/pkg/WebViewPkgInfoCache;)V", "c", "(Ljava/lang/String;)Ljava/lang/String;", "Ll/zgi;", Constants.INAPP_DATA_TAG, "()Ll/zgi;", "", "deletePkgs", "", "a", "(Ljava/util/List;)V", "", "f", "()Ljava/util/List;", "baseVersion", "Lcom/hellogroup/fep/feppkg/internal/core/CheckPolicy;", "checkPolicy", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/hellogroup/fep/feppkg/internal/core/CheckPolicy;)Ll/zgi;", "Ljava/io/File;", "Ljava/io/File;", "g", "()Ljava/io/File;", RXScreenCaptureService.KEY_INDEX, "(Ljava/io/File;)V", "resourceResultDirectory", "", "b", "Ljava/util/Map;", "h", "()Ljava/util/Map;", "submoduleMapping", "Ljava/lang/String;", "()Ljava/lang/String;", "getUrl", "Lcom/hellogroup/mk/core/pkg/WebViewPkgInfoCache;", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class x4d0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private File resourceResultDirectory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Map<String, File> submoduleMapping;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String bid;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String url;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final WebViewPkgInfoCache webViewPkgInfoCache;

    public x4d0(@NotNull String str, @NotNull String str2, @Nullable WebViewPkgInfoCache webViewPkgInfoCache) {
        str.getClass();
        str2.getClass();
        this.bid = str;
        this.url = str2;
        this.webViewPkgInfoCache = webViewPkgInfoCache;
        this.submoduleMapping = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a */
    public final void m209304a(@NotNull List<zgi> deletePkgs) {
        deletePkgs.getClass();
        WebViewPkgInfoCache webViewPkgInfoCache = this.webViewPkgInfoCache;
        if (webViewPkgInfoCache != null) {
            webViewPkgInfoCache.m18487a(deletePkgs);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBid() {
        return this.bid;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final String m209306c(@NotNull String bid) {
        bid.getClass();
        if (TextUtils.equals(bid, this.bid)) {
            return this.url;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final zgi m209307d() {
        zgi zgiVarM18489c;
        WebViewPkgInfoCache webViewPkgInfoCache = this.webViewPkgInfoCache;
        return (webViewPkgInfoCache == null || (zgiVarM18489c = webViewPkgInfoCache.m18489c(this.url, this.bid, null, CheckPolicy.LOCAL_ONLY)) == null) ? FepManager.INSTANCE.m17610a().m17591l(this.url, CheckPolicy.LOCAL_ONLY) : zgiVarM18489c;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final zgi m209308e(@Nullable String url, @Nullable String bid, @Nullable String baseVersion, @NotNull CheckPolicy checkPolicy) {
        zgi zgiVarM18489c;
        checkPolicy.getClass();
        WebViewPkgInfoCache webViewPkgInfoCache = this.webViewPkgInfoCache;
        if (webViewPkgInfoCache != null && (zgiVarM18489c = webViewPkgInfoCache.m18489c(url, bid, baseVersion, checkPolicy)) != null) {
            return zgiVarM18489c;
        }
        if (url != null && !StringsKt.m94329e0(url)) {
            return FepManager.INSTANCE.m17610a().m17591l(url, checkPolicy);
        }
        if (bid == null || StringsKt.m94329e0(bid)) {
            return null;
        }
        return FepManager.INSTANCE.m17610a().m17592n(bid, baseVersion, url, checkPolicy);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<zgi> m209309f() {
        List<zgi> listM18490d;
        WebViewPkgInfoCache webViewPkgInfoCache = this.webViewPkgInfoCache;
        return (webViewPkgInfoCache == null || (listM18490d = webViewPkgInfoCache.m18490d()) == null) ? CollectionsKt.emptyList() : listM18490d;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final File getResourceResultDirectory() {
        return this.resourceResultDirectory;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Map<String, File> m209311h() {
        return this.submoduleMapping;
    }

    /* JADX INFO: renamed from: i */
    public final void m209312i(@Nullable File file) {
        this.resourceResultDirectory = file;
    }
}
