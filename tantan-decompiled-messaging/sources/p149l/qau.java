package p149l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m87232d2 = {"Ll/qau;", "", "<init>", "()V", "Lcom/tantan/library/svga/data/cache/Resource;", "resource", "", "a", "(Lcom/tantan/library/svga/data/cache/Resource;)Ljava/lang/String;", "path", "b", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "context", "svgaUrl", "Lcom/tantan/library/svga/data/request/RequestCallback;", "callback", "", "c", "(Landroid/content/Context;Ljava/lang/String;Lcom/tantan/library/svga/data/request/RequestCallback;)V", "", "list", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;Ljava/util/List;)V", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class qau {

    @NotNull
    public static final qau INSTANCE = new qau();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m173776a(@NotNull Resource<?> resource) {
        resource.getClass();
        return m173777b(resource.getAbsolutePath());
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m173777b(@Nullable String path) {
        if (path == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("templateUrl", path);
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m173778c(@NotNull Context context, @NotNull String svgaUrl, @Nullable RequestCallback callback) {
        context.getClass();
        svgaUrl.getClass();
        if (svgaUrl.length() == 0) {
            return;
        }
        SVGALoader.with(context).from(svgaUrl).loadCallback(callback).downloadOnly();
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m173779d(@NotNull Context context, @NotNull List<String> list) {
        context.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        SVGALoader.with(context).batchDownload(list);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m173780e(Context context, String str, RequestCallback requestCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            requestCallback = null;
        }
        m173778c(context, str, requestCallback);
    }
}
