package okio;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p000.C0799b;
import p153l.t560;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0014B\u001f\b\u0002\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\rH\u0096\u0002R\u001e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m88121d2 = {"Lokio/Options;", "Ljava/util/AbstractList;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "byteStrings", "", "trie", "", "([Lokio/ByteString;[I)V", "getByteStrings$jvm", "()[Lokio/ByteString;", "[Lokio/ByteString;", "size", "", "getSize", "()I", "getTrie$jvm", "()[I", "get", FirebaseAnalytics.Param.INDEX, "Companion", "jvm"}, m88122k = 1, m88123mv = {1, 1, 11})
public final class Options extends AbstractList<ByteString> implements RandomAccess {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ByteString[] byteStrings;

    @NotNull
    private final int[] trie;

    private Options(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: of */
    public static final Options m222322of(@NotNull ByteString... byteStringArr) {
        return INSTANCE.m222323of(byteStringArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj != null ? obj instanceof ByteString : true) {
            return contains((ByteString) obj);
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: getByteStrings$jvm, reason: from getter */
    public final ByteString[] getByteStrings() {
        return this.byteStrings;
    }

    public int getSize() {
        return this.byteStrings.length;
    }

    @NotNull
    /* JADX INFO: renamed from: getTrie$jvm, reason: from getter */
    public final int[] getTrie() {
        return this.trie;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj != null ? obj instanceof ByteString : true) {
            return indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj != null ? obj instanceof ByteString : true) {
            return lastIndexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj != null ? obj instanceof ByteString : true) {
            return remove((ByteString) obj);
        }
        return false;
    }

    public /* bridge */ ByteString removeAt(int i) {
        return (ByteString) super.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002J!\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0016\"\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0017R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m88121d2 = {"Lokio/Options$Companion;", "", "()V", "intCount", "", "Lokio/Buffer;", "getIntCount", "(Lokio/Buffer;)J", "buildTrieRecursive", "", "nodeOffset", "node", "byteStringOffset", "", "byteStrings", "", "Lokio/ByteString;", "fromIndex", "toIndex", "indexes", "of", "Lokio/Options;", "", "([Lokio/ByteString;)Lokio/Options;", "jvm"}, m88122k = 1, m88123mv = {1, 1, 11})
    public static final class Companion {
        private Companion() {
        }

        private final void buildTrieRecursive(long nodeOffset, Buffer node, int byteStringOffset, List<? extends ByteString> byteStrings, int fromIndex, int toIndex, List<Integer> indexes) throws IOException {
            int i;
            int i2;
            long j;
            int i3;
            long j2;
            int i4 = byteStringOffset;
            if (fromIndex >= toIndex) {
                wg3.m206174a("Failed requirement.");
                return;
            }
            for (int i5 = fromIndex; i5 < toIndex; i5++) {
                if (byteStrings.get(i5).size() < i4) {
                    wg3.m206174a("Failed requirement.");
                    return;
                }
            }
            ByteString byteString = byteStrings.get(fromIndex);
            ByteString byteString2 = byteStrings.get(toIndex - 1);
            byte b = -1;
            if (i4 == byteString.size()) {
                int iIntValue = indexes.get(fromIndex).intValue();
                int i6 = fromIndex + 1;
                ByteString byteString3 = byteStrings.get(i6);
                i = i6;
                i2 = iIntValue;
                byteString = byteString3;
            } else {
                i = fromIndex;
                i2 = -1;
            }
            long j3 = 2;
            if (byteString.getByte(i4) == byteString2.getByte(i4)) {
                int iMin = Math.min(byteString.size(), byteString2.size());
                int i7 = 0;
                int i8 = i4;
                while (true) {
                    byte b2 = b;
                    if (i8 >= iMin) {
                        j = j3;
                        break;
                    }
                    j = j3;
                    if (byteString.getByte(i8) != byteString2.getByte(i8)) {
                        break;
                    }
                    i7++;
                    i8++;
                    b = b2;
                    j3 = j;
                }
                long intCount = nodeOffset + getIntCount(node) + j + ((long) i7) + 1;
                node.writeInt(-i7);
                node.writeInt(i2);
                int i9 = i4 + i7;
                while (i4 < i9) {
                    node.writeInt(byteString.getByte(i4) & 255);
                    i4++;
                }
                if (i + 1 == toIndex) {
                    if (i9 == byteStrings.get(i).size()) {
                        node.writeInt(indexes.get(i).intValue());
                        return;
                    } else {
                        wtq0.m207906a("Check failed.");
                        return;
                    }
                }
                Buffer buffer = new Buffer();
                node.writeInt(((int) (getIntCount(buffer) + intCount)) * (-1));
                buildTrieRecursive(intCount, buffer, i9, byteStrings, i, toIndex, indexes);
                node.writeAll(buffer);
                return;
            }
            int i10 = 1;
            for (int i11 = i + 1; i11 < toIndex; i11++) {
                if (byteStrings.get(i11 - 1).getByte(i4) != byteStrings.get(i11).getByte(i4)) {
                    i10++;
                }
            }
            long intCount2 = nodeOffset + getIntCount(node) + 2 + ((long) (i10 * 2));
            node.writeInt(i10);
            node.writeInt(i2);
            for (int i12 = i; i12 < toIndex; i12++) {
                byte b3 = byteStrings.get(i12).getByte(i4);
                if (i12 == i || b3 != byteStrings.get(i12 - 1).getByte(i4)) {
                    node.writeInt(b3 & 255);
                }
            }
            Buffer buffer2 = new Buffer();
            while (i < toIndex) {
                byte b4 = byteStrings.get(i).getByte(i4);
                int i13 = i + 1;
                int i14 = i13;
                while (true) {
                    if (i14 >= toIndex) {
                        i3 = toIndex;
                        break;
                    } else {
                        if (b4 != byteStrings.get(i14).getByte(i4)) {
                            i3 = i14;
                            break;
                        }
                        i14++;
                    }
                }
                if (i13 == i3 && i4 + 1 == byteStrings.get(i).size()) {
                    node.writeInt(indexes.get(i).intValue());
                    j2 = intCount2;
                } else {
                    node.writeInt(((int) (getIntCount(buffer2) + intCount2)) * (-1));
                    j2 = intCount2;
                    buildTrieRecursive(j2, buffer2, i4 + 1, byteStrings, i, i3, indexes);
                }
                intCount2 = j2;
                i = i3;
            }
            node.writeAll(buffer2);
        }

        public static /* bridge */ /* synthetic */ void buildTrieRecursive$default(Companion companion, long j, Buffer buffer, int i, List list, int i2, int i3, List list2, int i4, Object obj) throws IOException {
            if ((i4 & 1) != 0) {
                j = 0;
            }
            companion.buildTrieRecursive(j, buffer, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        private final long getIntCount(@NotNull Buffer buffer) {
            return buffer.size() / 4;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: of */
        public final Options m222323of(@NotNull ByteString... byteStrings) throws IOException {
            byteStrings.getClass();
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i = 0;
            if (byteStrings.length == 0) {
                return new Options(new ByteString[0], new int[]{0, -1}, defaultConstructorMarker);
            }
            List mutableList = ArraysKt.toMutableList(byteStrings);
            CollectionsKt.sort(mutableList);
            ArrayList arrayList = new ArrayList(byteStrings.length);
            for (ByteString byteString : byteStrings) {
                arrayList.add(-1);
            }
            Object[] array = arrayList.toArray(new Integer[0]);
            if (array == null) {
                C0799b.m4641a("null cannot be cast to non-null type kotlin.Array<T>");
                return null;
            }
            Integer[] numArr = (Integer[]) array;
            List listMutableListOf = CollectionsKt.mutableListOf((Integer[]) Arrays.copyOf(numArr, numArr.length));
            int length = byteStrings.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                listMutableListOf.set(CollectionsKt.binarySearch$default(mutableList, byteStrings[i2], 0, 0, 6, (Object) null), Integer.valueOf(i3));
                i2++;
                i3++;
            }
            if (((ByteString) mutableList.get(0)).size() <= 0) {
                wg3.m206174a("the empty byte string is not a supported option");
                return null;
            }
            int i4 = 0;
            while (i4 < mutableList.size()) {
                ByteString byteString2 = (ByteString) mutableList.get(i4);
                int i5 = i4 + 1;
                int i6 = i5;
                while (i6 < mutableList.size()) {
                    ByteString byteString3 = (ByteString) mutableList.get(i6);
                    if (!byteString3.startsWith(byteString2)) {
                        break;
                    }
                    if (byteString3.size() == byteString2.size()) {
                        t560.m189376a("duplicate option: ", byteString3);
                        return null;
                    }
                    if (((Number) listMutableListOf.get(i6)).intValue() > ((Number) listMutableListOf.get(i4)).intValue()) {
                        mutableList.remove(i6);
                        listMutableListOf.remove(i6);
                    } else {
                        i6++;
                    }
                }
                i4 = i5;
            }
            Buffer buffer = new Buffer();
            buildTrieRecursive$default(this, 0L, buffer, 0, mutableList, 0, 0, listMutableListOf, 53, null);
            int[] iArr = new int[(int) getIntCount(buffer)];
            while (!buffer.exhausted()) {
                iArr[i] = buffer.readInt();
                i++;
            }
            return new Options((ByteString[]) byteStrings.clone(), iArr, defaultConstructorMarker);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ByteString get(int index) {
        return this.byteStrings[index];
    }

    public /* synthetic */ Options(@NotNull ByteString[] byteStringArr, @NotNull int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteStringArr, iArr);
    }

    public /* bridge */ boolean contains(ByteString byteString) {
        return super.contains((Object) byteString);
    }

    public /* bridge */ int indexOf(ByteString byteString) {
        return super.indexOf((Object) byteString);
    }

    public /* bridge */ int lastIndexOf(ByteString byteString) {
        return super.lastIndexOf((Object) byteString);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ ByteString remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(ByteString byteString) {
        return super.remove((Object) byteString);
    }
}
