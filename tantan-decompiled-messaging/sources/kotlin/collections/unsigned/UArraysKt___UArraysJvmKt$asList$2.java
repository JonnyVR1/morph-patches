package kotlin.collections.unsigned;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m87232d2 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$2", "Lkotlin/collections/AbstractList;", "Lkotlin/ULong;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", "isEmpty", "", "contains", "element", "contains-VKZWuLQ", "(J)Z", "get", FirebaseAnalytics.Param.INDEX, "get-s-VKNKU", "(I)J", "indexOf", "indexOf-VKZWuLQ", "(J)I", "lastIndexOf", "lastIndexOf-VKZWuLQ", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class UArraysKt___UArraysJvmKt$asList$2 extends AbstractList<ULong> implements RandomAccess {

    /* JADX INFO: renamed from: $$v$c$kotlin-ULongArray$-$this$asList$0, reason: not valid java name */
    final /* synthetic */ long[] f210097$$v$c$kotlinULongArray$$this$asList$0;

    public UArraysKt___UArraysJvmKt$asList$2(long[] jArr) {
        this.f210097$$v$c$kotlinULongArray$$this$asList$0 = jArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ULong) {
            return m223987containsVKZWuLQ(((ULong) obj).getData());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-VKZWuLQ, reason: not valid java name */
    public boolean m223987containsVKZWuLQ(long element) {
        return ULongArray.m87296h(this.f210097$$v$c$kotlinULongArray$$this$asList$0, element);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
        return ULong.m87287a(m223988getsVKNKU(i));
    }

    /* JADX INFO: renamed from: get-s-VKNKU, reason: not valid java name */
    public long m223988getsVKNKU(int index) {
        return ULongArray.m87299l(this.f210097$$v$c$kotlinULongArray$$this$asList$0, index);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return ULongArray.m87300p(this.f210097$$v$c$kotlinULongArray$$this$asList$0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ULong) {
            return m223989indexOfVKZWuLQ(((ULong) obj).getData());
        }
        return -1;
    }

    /* JADX INFO: renamed from: indexOf-VKZWuLQ, reason: not valid java name */
    public int m223989indexOfVKZWuLQ(long element) {
        return ArraysKt.indexOf(this.f210097$$v$c$kotlinULongArray$$this$asList$0, element);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return ULongArray.m87302s(this.f210097$$v$c$kotlinULongArray$$this$asList$0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ULong) {
            return m223990lastIndexOfVKZWuLQ(((ULong) obj).getData());
        }
        return -1;
    }

    /* JADX INFO: renamed from: lastIndexOf-VKZWuLQ, reason: not valid java name */
    public int m223990lastIndexOfVKZWuLQ(long element) {
        return ArraysKt.lastIndexOf(this.f210097$$v$c$kotlinULongArray$$this$asList$0, element);
    }
}
