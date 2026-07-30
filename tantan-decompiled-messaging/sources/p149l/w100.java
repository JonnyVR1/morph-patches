package p149l;

import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jµ\u0001\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m87232d2 = {"Ll/w100;", "", "<init>", "()V", "", "", "componentAttribution", "shortcutAttribution", "dataSourceExtras", "imageSourceExtras", "Landroid/graphics/Rect;", "viewportDimensions", "scaleType", "Landroid/graphics/PointF;", "focusPoint", "imageExtras", "callerContext", "", "logWithHighSamplingRate", "Landroid/net/Uri;", "mainUri", "Ll/p26$a;", "a", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Landroid/graphics/Rect;Ljava/lang/String;Landroid/graphics/PointF;Ljava/util/Map;Ljava/lang/Object;ZLandroid/net/Uri;)Ll/p26$a;", "middleware_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class w100 {

    @NotNull
    public static final w100 INSTANCE = new w100();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final p26.C19111a m200911a(@NotNull Map<String, ? extends Object> componentAttribution, @NotNull Map<String, ? extends Object> shortcutAttribution, @Nullable Map<String, ? extends Object> dataSourceExtras, @Nullable Map<String, ? extends Object> imageSourceExtras, @Nullable Rect viewportDimensions, @Nullable String scaleType, @Nullable PointF focusPoint, @Nullable Map<String, ? extends Object> imageExtras, @Nullable Object callerContext, boolean logWithHighSamplingRate, @Nullable Uri mainUri) {
        componentAttribution.getClass();
        shortcutAttribution.getClass();
        p26.C19111a c19111a = new p26.C19111a();
        if (viewportDimensions != null) {
            c19111a.viewportWidth = viewportDimensions.width();
            c19111a.viewportHeight = viewportDimensions.height();
        }
        c19111a.scaleType = scaleType;
        if (focusPoint != null) {
            c19111a.focusX = Float.valueOf(focusPoint.x);
            c19111a.focusY = Float.valueOf(focusPoint.y);
        }
        c19111a.callerContext = callerContext;
        c19111a.logWithHighSamplingRate = logWithHighSamplingRate;
        c19111a.mainUri = mainUri;
        c19111a.datasourceExtras = dataSourceExtras;
        c19111a.imageExtras = imageExtras;
        c19111a.shortcutExtras = shortcutAttribution;
        c19111a.componentExtras = componentAttribution;
        c19111a.imageSourceExtras = imageSourceExtras;
        return c19111a;
    }
}
