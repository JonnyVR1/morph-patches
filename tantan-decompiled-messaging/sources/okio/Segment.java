package okio;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.GuideBoostMode;
import com.p046p1.mobile.putong.data.Owner;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ig3;
import p149l.qkq0;
import p149l.x9g0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B/\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u0000J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000J\u0006\u0010\u0013\u001a\u00020\u0000J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0000J\u0016\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m87232d2 = {"Lokio/Segment;", "", "()V", "data", "", Constants.INAPP_POSITION, "", Constants.KEY_LIMIT, "shared", "", Owner.TYPE, "([BIIZZ)V", "next", "prev", "compact", "", GuideBoostMode.pop, "push", "segment", "sharedCopy", "split", "byteCount", "unsharedCopy", "writeTo", "sink", "Companion", "jvm"}, m87233k = 1, m87234mv = {1, 1, 11})
public final class Segment {
    public static final int SHARE_MINIMUM = 1024;
    public static final int SIZE = 8192;

    @JvmField
    @NotNull
    public final byte[] data;

    @JvmField
    public int limit;

    @JvmField
    @Nullable
    public Segment next;

    @JvmField
    public boolean owner;

    @JvmField
    public int pos;

    @JvmField
    @Nullable
    public Segment prev;

    @JvmField
    public boolean shared;

    public Segment(@NotNull byte[] bArr, int i, int i2, boolean z, boolean z2) {
        bArr.getClass();
        this.data = bArr;
        this.pos = i;
        this.limit = i2;
        this.shared = z;
        this.owner = z2;
    }

    public final void compact() {
        int i;
        Segment segment = this.prev;
        if (segment == this) {
            qkq0.m175383a("cannot compact");
            return;
        }
        if (segment == null) {
            Intrinsics.m87497m();
        }
        if (segment.owner) {
            int i2 = this.limit - this.pos;
            Segment segment2 = this.prev;
            if (segment2 == null) {
                Intrinsics.m87497m();
            }
            int i3 = 8192 - segment2.limit;
            Segment segment3 = this.prev;
            if (segment3 == null) {
                Intrinsics.m87497m();
            }
            if (segment3.shared) {
                i = 0;
            } else {
                Segment segment4 = this.prev;
                if (segment4 == null) {
                    Intrinsics.m87497m();
                }
                i = segment4.pos;
            }
            if (i2 > i3 + i) {
                return;
            }
            Segment segment5 = this.prev;
            if (segment5 == null) {
                Intrinsics.m87497m();
            }
            writeTo(segment5, i2);
            pop();
            SegmentPool.recycle(this);
        }
    }

    @Nullable
    public final Segment pop() {
        Segment segment = this.next;
        if (segment == this) {
            segment = null;
        }
        Segment segment2 = this.prev;
        if (segment2 == null) {
            Intrinsics.m87497m();
        }
        segment2.next = this.next;
        Segment segment3 = this.next;
        if (segment3 == null) {
            Intrinsics.m87497m();
        }
        segment3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return segment;
    }

    @NotNull
    public final Segment push(@NotNull Segment segment) {
        segment.getClass();
        segment.prev = this;
        segment.next = this.next;
        Segment segment2 = this.next;
        if (segment2 == null) {
            Intrinsics.m87497m();
        }
        segment2.prev = segment;
        this.next = segment;
        return segment;
    }

    @NotNull
    public final Segment sharedCopy() {
        this.shared = true;
        return new Segment(this.data, this.pos, this.limit, true, false);
    }

    @NotNull
    public final Segment split(int byteCount) {
        Segment segmentTake;
        if (byteCount <= 0 || byteCount > this.limit - this.pos) {
            ig3.m135964a("byteCount out of range");
            return null;
        }
        if (byteCount >= 1024) {
            segmentTake = sharedCopy();
        } else {
            segmentTake = SegmentPool.take();
            Platform.arraycopy(this.data, this.pos, segmentTake.data, 0, byteCount);
        }
        segmentTake.limit = segmentTake.pos + byteCount;
        this.pos += byteCount;
        Segment segment = this.prev;
        if (segment == null) {
            Intrinsics.m87497m();
        }
        segment.push(segmentTake);
        return segmentTake;
    }

    @NotNull
    public final Segment unsharedCopy() {
        byte[] bArr = this.data;
        return new Segment(Arrays.copyOf(bArr, bArr.length), this.pos, this.limit, false, true);
    }

    public final void writeTo(@NotNull Segment sink, int byteCount) {
        sink.getClass();
        if (!sink.owner) {
            qkq0.m175383a("only owner can write");
            return;
        }
        int i = sink.limit;
        if (i + byteCount > 8192) {
            if (sink.shared) {
                x9g0.m207497a();
                return;
            }
            int i2 = sink.pos;
            if ((i + byteCount) - i2 > 8192) {
                x9g0.m207497a();
                return;
            }
            byte[] bArr = sink.data;
            Platform.arraycopy(bArr, i2, bArr, 0, i - i2);
            sink.limit -= sink.pos;
            sink.pos = 0;
        }
        Platform.arraycopy(this.data, this.pos, sink.data, sink.limit, byteCount);
        sink.limit += byteCount;
        this.pos += byteCount;
    }

    public Segment() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }
}
