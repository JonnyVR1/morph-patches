package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.clevertap.android.sdk.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import p153l.nbr;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public class JvmNameResolverBase implements NameResolver {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final String f66128d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final List<String> f66129e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Map<String, Integer> f66130f;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String[] f66131a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Set<Integer> f66132b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<JvmProtoBuf.StringTableTypes.Record> f66133c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66134a;

        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f66134a = iArr;
        }
    }

    static {
        String strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new Character[]{'k', 'o', Character.valueOf(Constants.INAPP_POSITION_TOP), Character.valueOf(Constants.INAPP_POSITION_LEFT), 'i', 'n'}), "", null, null, 0, null, null, 62, null);
        f66128d = strJoinToString$default;
        List<String> listListOf = CollectionsKt.listOf((Object[]) new String[]{strJoinToString$default + "/Any", strJoinToString$default + "/Nothing", strJoinToString$default + "/Unit", strJoinToString$default + "/Throwable", strJoinToString$default + "/Number", strJoinToString$default + "/Byte", strJoinToString$default + "/Double", strJoinToString$default + "/Float", strJoinToString$default + "/Int", strJoinToString$default + "/Long", strJoinToString$default + "/Short", strJoinToString$default + "/Boolean", strJoinToString$default + "/Char", strJoinToString$default + "/CharSequence", strJoinToString$default + "/String", strJoinToString$default + "/Comparable", strJoinToString$default + "/Enum", strJoinToString$default + "/Array", strJoinToString$default + "/ByteArray", strJoinToString$default + "/DoubleArray", strJoinToString$default + "/FloatArray", strJoinToString$default + "/IntArray", strJoinToString$default + "/LongArray", strJoinToString$default + "/ShortArray", strJoinToString$default + "/BooleanArray", strJoinToString$default + "/CharArray", strJoinToString$default + "/Cloneable", strJoinToString$default + "/Annotation", strJoinToString$default + "/collections/Iterable", strJoinToString$default + "/collections/MutableIterable", strJoinToString$default + "/collections/Collection", strJoinToString$default + "/collections/MutableCollection", strJoinToString$default + "/collections/List", strJoinToString$default + "/collections/MutableList", strJoinToString$default + "/collections/Set", strJoinToString$default + "/collections/MutableSet", strJoinToString$default + "/collections/Map", strJoinToString$default + "/collections/MutableMap", strJoinToString$default + "/collections/Map.Entry", strJoinToString$default + "/collections/MutableMap.MutableEntry", strJoinToString$default + "/collections/Iterator", strJoinToString$default + "/collections/MutableIterator", strJoinToString$default + "/collections/ListIterator", strJoinToString$default + "/collections/MutableListIterator"});
        f66129e = listListOf;
        Iterable<IndexedValue> iterableWithIndex = CollectionsKt.withIndex(listListOf);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C15274a.m88486b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10)), 16));
        for (IndexedValue indexedValue : iterableWithIndex) {
            linkedHashMap.put((String) indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex()));
        }
        f66130f = linkedHashMap;
    }

    public JvmNameResolverBase(@NotNull String[] strArr, @NotNull Set<Integer> set, @NotNull List<JvmProtoBuf.StringTableTypes.Record> list) {
        strArr.getClass();
        set.getClass();
        list.getClass();
        this.f66131a = strArr;
        this.f66132b = set;
        this.f66133c = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo91783a(int i) {
        return getString(i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    /* JADX INFO: renamed from: b */
    public boolean mo91784b(int i) {
        return this.f66132b.contains(Integer.valueOf(i));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getString(int i) {
        String strSubstring;
        JvmProtoBuf.StringTableTypes.Record record = this.f66133c.get(i);
        if (record.hasString()) {
            strSubstring = record.getString();
        } else if (record.hasPredefinedIndex()) {
            List<String> list = f66129e;
            int size = list.size();
            int predefinedIndex = record.getPredefinedIndex();
            if (predefinedIndex < 0 || predefinedIndex >= size) {
                strSubstring = this.f66131a[i];
            } else {
                strSubstring = list.get(record.getPredefinedIndex());
            }
        } else {
            strSubstring = this.f66131a[i];
        }
        if (record.getSubstringIndexCount() >= 2) {
            List<Integer> substringIndexList = record.getSubstringIndexList();
            substringIndexList.getClass();
            Integer num = substringIndexList.get(0);
            Integer num2 = substringIndexList.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= strSubstring.length()) {
                strSubstring = strSubstring.substring(num.intValue(), num2.intValue());
            }
        }
        String strM94369E = strSubstring;
        if (record.getReplaceCharCount() >= 2) {
            List<Integer> replaceCharList = record.getReplaceCharList();
            replaceCharList.getClass();
            Integer num3 = replaceCharList.get(0);
            Integer num4 = replaceCharList.get(1);
            strM94369E.getClass();
            strM94369E = C15493d.m94369E(strM94369E, (char) num3.intValue(), (char) num4.intValue(), false, 4, null);
        }
        String strM94369E2 = strM94369E;
        JvmProtoBuf.StringTableTypes.Record.Operation operation = record.getOperation();
        if (operation == null) {
            operation = JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
        }
        int i2 = WhenMappings.f66134a[operation.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                strM94369E2.getClass();
                strM94369E2 = C15493d.m94369E(strM94369E2, '$', '.', false, 4, null);
            } else {
                if (i2 != 3) {
                    nbr.m162172a();
                    return null;
                }
                if (strM94369E2.length() >= 2) {
                    strM94369E2 = strM94369E2.substring(1, strM94369E2.length() - 1);
                }
                strM94369E2 = C15493d.m94369E(strM94369E2, '$', '.', false, 4, null);
            }
        }
        strM94369E2.getClass();
        return strM94369E2;
    }
}
