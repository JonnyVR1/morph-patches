package p149l;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u00020\f*\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Ll/m1j;", "", "", "maxFpsLimit", "<init>", "(I)V", "durationMs", "frameCount", "targetFps", "", "a", "(III)Ljava/util/Map;", "", "b", "(I)F", "I", "animated-drawable_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class m1j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int maxFpsLimit;

    public m1j(int i) {
        this.maxFpsLimit = i;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Map<Integer, Integer> m152593a(int durationMs, int frameCount, int targetFps) {
        float fM87595a = C15167a.m87595a(C15167a.m87599e(C15167a.m87596b(targetFps, 1), this.maxFpsLimit) * m152594b(durationMs), 0.0f);
        float f = frameCount;
        float fM87598d = f / C15167a.m87598d(fM87595a, f);
        int i = 0;
        IntRange intRangeM87605k = C15167a.m87605k(0, frameCount);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C15167a.m87596b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(intRangeM87605k, 10)), 16));
        for (Integer num : intRangeM87605k) {
            int iIntValue = num.intValue();
            if (((int) (iIntValue % fM87598d)) == 0) {
                i = iIntValue;
            }
            linkedHashMap.put(num, Integer.valueOf(i));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: b */
    public final float m152594b(int i) {
        return i / 1000.0f;
    }
}
