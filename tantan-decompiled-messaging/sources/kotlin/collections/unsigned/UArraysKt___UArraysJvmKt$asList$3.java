package kotlin.collections.unsigned;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m87232d2 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$3", "Lkotlin/collections/AbstractList;", "Lkotlin/UByte;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", "isEmpty", "", "contains", "element", "contains-7apg3OU", "(B)Z", "get", FirebaseAnalytics.Param.INDEX, "get-w2LRezQ", "(I)B", "indexOf", "indexOf-7apg3OU", "(B)I", "lastIndexOf", "lastIndexOf-7apg3OU", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class UArraysKt___UArraysJvmKt$asList$3 extends AbstractList<UByte> implements RandomAccess {

    /* JADX INFO: renamed from: $$v$c$kotlin-UByteArray$-$this$asList$0, reason: not valid java name */
    final /* synthetic */ byte[] f210098$$v$c$kotlinUByteArray$$this$asList$0;

    public UArraysKt___UArraysJvmKt$asList$3(byte[] bArr) {
        this.f210098$$v$c$kotlinUByteArray$$this$asList$0 = bArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UByte) {
            return m223991contains7apg3OU(((UByte) obj).getData());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-7apg3OU, reason: not valid java name */
    public boolean m223991contains7apg3OU(byte element) {
        return UByteArray.m87250h(this.f210098$$v$c$kotlinUByteArray$$this$asList$0, element);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
        return UByte.m87241a(m223992getw2LRezQ(i));
    }

    /* JADX INFO: renamed from: get-w2LRezQ, reason: not valid java name */
    public byte m223992getw2LRezQ(int index) {
        return UByteArray.m87253l(this.f210098$$v$c$kotlinUByteArray$$this$asList$0, index);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return UByteArray.m87254p(this.f210098$$v$c$kotlinUByteArray$$this$asList$0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof UByte) {
            return m223993indexOf7apg3OU(((UByte) obj).getData());
        }
        return -1;
    }

    /* JADX INFO: renamed from: indexOf-7apg3OU, reason: not valid java name */
    public int m223993indexOf7apg3OU(byte element) {
        return ArraysKt.indexOf(this.f210098$$v$c$kotlinUByteArray$$this$asList$0, element);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return UByteArray.m87256s(this.f210098$$v$c$kotlinUByteArray$$this$asList$0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof UByte) {
            return m223994lastIndexOf7apg3OU(((UByte) obj).getData());
        }
        return -1;
    }

    /* JADX INFO: renamed from: lastIndexOf-7apg3OU, reason: not valid java name */
    public int m223994lastIndexOf7apg3OU(byte element) {
        return ArraysKt.lastIndexOf(this.f210098$$v$c$kotlinUByteArray$$this$asList$0, element);
    }
}
