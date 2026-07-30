package p149l;

import android.graphics.PointF;
import com.clevertap.android.sdk.inapp.pipsdk.PIPPosition;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012JA\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m87232d2 = {"Ll/f360;", "", "<init>", "()V", "", "containerWidth", "containerHeight", "pipWidth", "pipHeight", "horizontalMarginPx", "verticalMarginPx", "Ll/rtm;", "safeInsets", "bottomOffsetPx", "", "Lcom/clevertap/android/sdk/inapp/pipsdk/PIPPosition;", "Landroid/graphics/PointF;", "b", "(IIIIIILl/rtm;I)Ljava/util/Map;", "", "pipCenterX", "pipCenterY", "anchors", "a", "(FFLjava/util/Map;II)Lcom/clevertap/android/sdk/inapp/pipsdk/PIPPosition;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class f360 {

    @NotNull
    public static final f360 INSTANCE = new f360();

    private f360() {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final PIPPosition m119249a(float pipCenterX, float pipCenterY, @NotNull Map<PIPPosition, ? extends PointF> anchors, int pipWidth, int pipHeight) {
        Object obj;
        PIPPosition pIPPosition;
        anchors.getClass();
        Iterator<T> it = anchors.entrySet().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                PointF pointF = (PointF) ((Map.Entry) next).getValue();
                float f = pipWidth / 2.0f;
                float f2 = pipCenterX - (pointF.x + f);
                float f3 = pipHeight / 2.0f;
                float f4 = pipCenterY - (pointF.y + f3);
                float f5 = (f2 * f2) + (f4 * f4);
                do {
                    Object next2 = it.next();
                    PointF pointF2 = (PointF) ((Map.Entry) next2).getValue();
                    float f6 = pipCenterX - (pointF2.x + f);
                    float f7 = pipCenterY - (pointF2.y + f3);
                    float f8 = (f6 * f6) + (f7 * f7);
                    if (Float.compare(f5, f8) > 0) {
                        next = next2;
                        f5 = f8;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Map.Entry entry = (Map.Entry) obj;
        return (entry == null || (pIPPosition = (PIPPosition) entry.getKey()) == null) ? PIPPosition.BOTTOM_RIGHT : pIPPosition;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Map<PIPPosition, PointF> m119250b(int containerWidth, int containerHeight, int pipWidth, int pipHeight, int horizontalMarginPx, int verticalMarginPx, @NotNull rtm safeInsets, int bottomOffsetPx) {
        safeInsets.getClass();
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        float f = safeInsets.f160972a + horizontalMarginPx;
        float f2 = safeInsets.f160973b + verticalMarginPx;
        float fM87595a = C15167a.m87595a(((containerWidth - pipWidth) - horizontalMarginPx) - safeInsets.f160974c, f);
        float fM87595a2 = C15167a.m87595a((((containerHeight - pipHeight) - verticalMarginPx) - bottomOffsetPx) - safeInsets.f160975d, f2);
        float f3 = (f + fM87595a) / 2.0f;
        float f4 = (f2 + fM87595a2) / 2.0f;
        mapCreateMapBuilder.put(PIPPosition.TOP_LEFT, new PointF(f, f2));
        mapCreateMapBuilder.put(PIPPosition.TOP_CENTER, new PointF(f3, f2));
        mapCreateMapBuilder.put(PIPPosition.TOP_RIGHT, new PointF(fM87595a, f2));
        mapCreateMapBuilder.put(PIPPosition.LEFT_CENTER, new PointF(f, f4));
        mapCreateMapBuilder.put(PIPPosition.CENTER, new PointF(f3, f4));
        mapCreateMapBuilder.put(PIPPosition.RIGHT_CENTER, new PointF(fM87595a, f4));
        mapCreateMapBuilder.put(PIPPosition.BOTTOM_LEFT, new PointF(f, fM87595a2));
        mapCreateMapBuilder.put(PIPPosition.BOTTOM_CENTER, new PointF(f3, fM87595a2));
        mapCreateMapBuilder.put(PIPPosition.BOTTOM_RIGHT, new PointF(fM87595a, fM87595a2));
        return MapsKt.build(mapCreateMapBuilder);
    }
}
