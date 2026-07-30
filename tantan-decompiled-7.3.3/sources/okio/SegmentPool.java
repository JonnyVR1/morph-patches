package okio;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0007J\b\u0010\u000b\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m88121d2 = {"Lokio/SegmentPool;", "", "()V", "MAX_SIZE", "", "byteCount", "next", "Lokio/Segment;", "recycle", "", "segment", "take", "jvm"}, m88122k = 1, m88123mv = {1, 1, 11})
public final class SegmentPool {
    public static final SegmentPool INSTANCE = new SegmentPool();
    public static final long MAX_SIZE = 65536;

    @JvmField
    public static long byteCount;

    @JvmField
    @Nullable
    public static Segment next;

    private SegmentPool() {
    }

    @JvmStatic
    public static final void recycle(@NotNull Segment segment) {
        segment.getClass();
        if (segment.next != null || segment.prev != null) {
            wg3.m206174a("Failed requirement.");
            return;
        }
        if (segment.shared) {
            return;
        }
        synchronized (INSTANCE) {
            long j = byteCount;
            if (j + 8192 > 65536) {
                return;
            }
            byteCount = j + 8192;
            segment.next = next;
            segment.limit = 0;
            segment.pos = 0;
            next = segment;
            Unit unit = Unit.INSTANCE;
        }
    }

    @JvmStatic
    @NotNull
    public static final Segment take() {
        synchronized (INSTANCE) {
            Segment segment = next;
            if (segment == null) {
                return new Segment();
            }
            next = segment.next;
            segment.next = null;
            byteCount -= 8192;
            return segment;
        }
    }
}
