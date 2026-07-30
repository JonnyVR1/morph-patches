package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b \u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b!\u0010\u0015R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b$\u0010#R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b8\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b\u001a\u0010#¨\u0006%"}, m87232d2 = {"Ll/w2f;", "", "", "maxDepth", "maxArrayKeyCount", "maxObjectKeyCount", "maxArrayLength", "maxKVPairCount", "", "Ll/mxq;", "keysModified", "Ll/srk0;", "valuesModified", "Ll/yqc0;", "itemsRemoved", "<init>", "(IIIIILjava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "e", "b", "c", "g", Constants.INAPP_DATA_TAG, "f", "Ljava/util/List;", "()Ljava/util/List;", "h", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final /* data */ class w2f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int maxDepth;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int maxArrayKeyCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int maxObjectKeyCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int maxArrayLength;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int maxKVPairCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final List<mxq> keysModified;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final List<srk0> valuesModified;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final List<yqc0> itemsRemoved;

    public w2f(int i, int i2, int i3, int i4, int i5, @NotNull List<mxq> list, @NotNull List<srk0> list2, @NotNull List<yqc0> list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.maxDepth = i;
        this.maxArrayKeyCount = i2;
        this.maxObjectKeyCount = i3;
        this.maxArrayLength = i4;
        this.maxKVPairCount = i5;
        this.keysModified = list;
        this.valuesModified = list2;
        this.itemsRemoved = list3;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<yqc0> m201104a() {
        return this.itemsRemoved;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<mxq> m201105b() {
        return this.keysModified;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMaxArrayKeyCount() {
        return this.maxArrayKeyCount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMaxArrayLength() {
        return this.maxArrayLength;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMaxDepth() {
        return this.maxDepth;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof w2f)) {
            return false;
        }
        w2f w2fVar = (w2f) other;
        return this.maxDepth == w2fVar.maxDepth && this.maxArrayKeyCount == w2fVar.maxArrayKeyCount && this.maxObjectKeyCount == w2fVar.maxObjectKeyCount && this.maxArrayLength == w2fVar.maxArrayLength && this.maxKVPairCount == w2fVar.maxKVPairCount && Intrinsics.m87488d(this.keysModified, w2fVar.keysModified) && Intrinsics.m87488d(this.valuesModified, w2fVar.valuesModified) && Intrinsics.m87488d(this.itemsRemoved, w2fVar.itemsRemoved);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getMaxKVPairCount() {
        return this.maxKVPairCount;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getMaxObjectKeyCount() {
        return this.maxObjectKeyCount;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final List<srk0> m201111h() {
        return this.valuesModified;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.maxDepth) * 31) + Integer.hashCode(this.maxArrayKeyCount)) * 31) + Integer.hashCode(this.maxObjectKeyCount)) * 31) + Integer.hashCode(this.maxArrayLength)) * 31) + Integer.hashCode(this.maxKVPairCount)) * 31) + this.keysModified.hashCode()) * 31) + this.valuesModified.hashCode()) * 31) + this.itemsRemoved.hashCode();
    }

    @NotNull
    public String toString() {
        return "EventDataMetrics(maxDepth=" + this.maxDepth + ", maxArrayKeyCount=" + this.maxArrayKeyCount + ", maxObjectKeyCount=" + this.maxObjectKeyCount + ", maxArrayLength=" + this.maxArrayLength + ", maxKVPairCount=" + this.maxKVPairCount + ", keysModified=" + this.keysModified + ", valuesModified=" + this.valuesModified + ", itemsRemoved=" + this.itemsRemoved + ')';
    }
}
