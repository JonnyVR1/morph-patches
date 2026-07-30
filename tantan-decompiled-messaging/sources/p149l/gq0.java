package p149l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m87232d2 = {"Ll/gq0;", "", "<init>", "()V", "", "frameDurationMs", "", "a", "([I)V", "", "c", "([I)I", "frameDurationsMs", "b", "([I)[I", "Companion", "animated-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class gq0 {
    /* JADX INFO: renamed from: a */
    public final void m127504a(@NotNull int[] frameDurationMs) {
        frameDurationMs.getClass();
        int length = frameDurationMs.length;
        for (int i = 0; i < length; i++) {
            if (frameDurationMs[i] < 11) {
                frameDurationMs[i] = 100;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final int[] m127505b(@NotNull int[] frameDurationsMs) {
        frameDurationsMs.getClass();
        int[] iArr = new int[frameDurationsMs.length];
        int length = frameDurationsMs.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = i;
            i += frameDurationsMs[i2];
        }
        return iArr;
    }

    /* JADX INFO: renamed from: c */
    public final int m127506c(@NotNull int[] frameDurationMs) {
        frameDurationMs.getClass();
        int i = 0;
        for (int i2 : frameDurationMs) {
            i += i2;
        }
        return i;
    }
}
