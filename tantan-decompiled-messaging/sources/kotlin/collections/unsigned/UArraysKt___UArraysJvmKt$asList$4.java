package kotlin.collections.unsigned;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m87232d2 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$4", "Lkotlin/collections/AbstractList;", "Lkotlin/UShort;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", "isEmpty", "", "contains", "element", "contains-xj2QHRw", "(S)Z", "get", FirebaseAnalytics.Param.INDEX, "get-Mh2AYeg", "(I)S", "indexOf", "indexOf-xj2QHRw", "(S)I", "lastIndexOf", "lastIndexOf-xj2QHRw", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class UArraysKt___UArraysJvmKt$asList$4 extends AbstractList<UShort> implements RandomAccess {

    /* JADX INFO: renamed from: $$v$c$kotlin-UShortArray$-$this$asList$0, reason: not valid java name */
    final /* synthetic */ short[] f210099$$v$c$kotlinUShortArray$$this$asList$0;

    public UArraysKt___UArraysJvmKt$asList$4(short[] sArr) {
        this.f210099$$v$c$kotlinUShortArray$$this$asList$0 = sArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UShort) {
            return m223995containsxj2QHRw(((UShort) obj).getData());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-xj2QHRw, reason: not valid java name */
    public boolean m223995containsxj2QHRw(short element) {
        return UShortArray.m87319h(this.f210099$$v$c$kotlinUShortArray$$this$asList$0, element);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
        return UShort.m87310a(m223996getMh2AYeg(i));
    }

    /* JADX INFO: renamed from: get-Mh2AYeg, reason: not valid java name */
    public short m223996getMh2AYeg(int index) {
        return UShortArray.m87322l(this.f210099$$v$c$kotlinUShortArray$$this$asList$0, index);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return UShortArray.m87323p(this.f210099$$v$c$kotlinUShortArray$$this$asList$0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof UShort) {
            return m223997indexOfxj2QHRw(((UShort) obj).getData());
        }
        return -1;
    }

    /* JADX INFO: renamed from: indexOf-xj2QHRw, reason: not valid java name */
    public int m223997indexOfxj2QHRw(short element) {
        return ArraysKt.indexOf(this.f210099$$v$c$kotlinUShortArray$$this$asList$0, element);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return UShortArray.m87325s(this.f210099$$v$c$kotlinUShortArray$$this$asList$0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof UShort) {
            return m223998lastIndexOfxj2QHRw(((UShort) obj).getData());
        }
        return -1;
    }

    /* JADX INFO: renamed from: lastIndexOf-xj2QHRw, reason: not valid java name */
    public int m223998lastIndexOfxj2QHRw(short element) {
        return ArraysKt.lastIndexOf(this.f210099$$v$c$kotlinUShortArray$$this$asList$0, element);
    }
}
