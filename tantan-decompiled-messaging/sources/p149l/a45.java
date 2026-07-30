package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Ll/a45;", "", "", "size", "<init>", "(I)V", "from", Target.TYPE, "length", "", "c", "(III)Z", "a", "(I)I", "", Constants.INAPP_DATA_TAG, "(II)Ljava/util/List;", "I", "b", "()I", "animated-drawable_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class a45 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int size;

    public a45(int i) {
        this.size = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m94797a(int target) {
        int i = target % this.size;
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i + this.size;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m94799c(int from, int target, int length) {
        int iM94797a = m94797a(length + from);
        if (from < iM94797a) {
            return from <= target && target <= iM94797a;
        }
        return (from <= target && target <= this.size) || (target >= 0 && target <= iM94797a);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<Integer> m94800d(int from, int length) {
        IntRange intRangeM87605k = C15167a.m87605k(0, length);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeM87605k, 10));
        Iterator<Integer> it = intRangeM87605k.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(m94797a(((IntIterator) it).nextInt() + from)));
        }
        return arrayList;
    }
}
