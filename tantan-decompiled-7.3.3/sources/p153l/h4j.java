package p153l;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u00020\f*\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/h4j;", "", "", "maxFpsLimit", "<init>", "(I)V", "durationMs", "frameCount", "targetFps", "", "a", "(III)Ljava/util/Map;", "", "b", "(I)F", "I", "animated-drawable_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class h4j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int maxFpsLimit;

    public h4j(int i) {
        this.maxFpsLimit = i;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Map<Integer, Integer> m133576a(int durationMs, int frameCount, int targetFps) {
        float fM88485a = C15274a.m88485a(C15274a.m88489e(C15274a.m88486b(targetFps, 1), this.maxFpsLimit) * m133577b(durationMs), 0.0f);
        float f = frameCount;
        float fM88488d = f / C15274a.m88488d(fM88485a, f);
        int i = 0;
        IntRange intRangeM88496l = C15274a.m88496l(0, frameCount);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C15274a.m88486b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(intRangeM88496l, 10)), 16));
        for (Integer num : intRangeM88496l) {
            int iIntValue = num.intValue();
            if (((int) (iIntValue % fM88488d)) == 0) {
                i = iIntValue;
            }
            linkedHashMap.put(num, Integer.valueOf(i));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: b */
    public final float m133577b(int i) {
        return i / 1000.0f;
    }
}
