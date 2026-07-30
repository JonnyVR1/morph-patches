package p153l;

import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jµ\u0001\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m88121d2 = {"Ll/ta00;", "", "<init>", "()V", "", "", "componentAttribution", "shortcutAttribution", "dataSourceExtras", "imageSourceExtras", "Landroid/graphics/Rect;", "viewportDimensions", "scaleType", "Landroid/graphics/PointF;", "focusPoint", "imageExtras", "callerContext", "", "logWithHighSamplingRate", "Landroid/net/Uri;", "mainUri", "Ll/u36$a;", "a", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Landroid/graphics/Rect;Ljava/lang/String;Landroid/graphics/PointF;Ljava/util/Map;Ljava/lang/Object;ZLandroid/net/Uri;)Ll/u36$a;", "middleware_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class ta00 {

    @NotNull
    public static final ta00 INSTANCE = new ta00();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final u36.C20477a m189768a(@NotNull Map<String, ? extends Object> componentAttribution, @NotNull Map<String, ? extends Object> shortcutAttribution, @Nullable Map<String, ? extends Object> dataSourceExtras, @Nullable Map<String, ? extends Object> imageSourceExtras, @Nullable Rect viewportDimensions, @Nullable String scaleType, @Nullable PointF focusPoint, @Nullable Map<String, ? extends Object> imageExtras, @Nullable Object callerContext, boolean logWithHighSamplingRate, @Nullable Uri mainUri) {
        componentAttribution.getClass();
        shortcutAttribution.getClass();
        u36.C20477a c20477a = new u36.C20477a();
        if (viewportDimensions != null) {
            c20477a.viewportWidth = viewportDimensions.width();
            c20477a.viewportHeight = viewportDimensions.height();
        }
        c20477a.scaleType = scaleType;
        if (focusPoint != null) {
            c20477a.focusX = Float.valueOf(focusPoint.x);
            c20477a.focusY = Float.valueOf(focusPoint.y);
        }
        c20477a.callerContext = callerContext;
        c20477a.logWithHighSamplingRate = logWithHighSamplingRate;
        c20477a.mainUri = mainUri;
        c20477a.datasourceExtras = dataSourceExtras;
        c20477a.imageExtras = imageExtras;
        c20477a.shortcutExtras = shortcutAttribution;
        c20477a.componentExtras = componentAttribution;
        c20477a.imageSourceExtras = imageSourceExtras;
        return c20477a;
    }
}
