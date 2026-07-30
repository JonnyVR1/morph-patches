package kotlin.collections;

import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.collections.unsigned.UArraysKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b2s;
import p149l.j6f;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00030\u0003¢\u0006\u0002\u0010\u0004\u001aG\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00010\u0006\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0007*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00070\u00060\u0003¢\u0006\u0002\u0010\b\u001a)\u0010\t\u001a\u00020\n*\b\u0012\u0002\b\u0003\u0018\u00010\u0003H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000¢\u0006\u0002\u0010\u000b\u001aH\u0010\f\u001a\u0002H\u0007\"\u0010\b\u0000\u0010\r*\u0006\u0012\u0002\b\u00030\u0003*\u0002H\u0007\"\u0004\b\u0001\u0010\u0007*\u0002H\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000fH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010\u0010\u001a5\u0010\u0011\u001a\u00020\n\"\u0004\b\u0000\u0010\u0002*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u00032\u0010\u0010\u0012\u001a\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0015\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u0002*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a?\u0010\u0019\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\n\u0010\u001b\u001a\u00060\u001cj\u0002`\u001d2\u0010\u0010\u001e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u001fH\u0002¢\u0006\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, m87232d2 = {"flatten", "", j6f.GPS_DIRECTION_TRUE, "", "([[Ljava/lang/Object;)Ljava/util/List;", "unzip", "Lkotlin/Pair;", "R", "([Lkotlin/Pair;)Lkotlin/Pair;", "isNullOrEmpty", "", "([Ljava/lang/Object;)Z", "ifEmpty", b2s.C_ZONE, "defaultValue", "Lkotlin/Function0;", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "contentDeepEqualsImpl", "other", "contentDeepEquals", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", "contentDeepToStringImpl", "", "contentDeepToString", "([Ljava/lang/Object;)Ljava/lang/String;", "contentDeepToStringInternal", "", LovePlanetStage.result, "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "processed", "", "contentDeepToStringInternal$ArraysKt__ArraysKt", "([Ljava/lang/Object;Ljava/lang/StringBuilder;Ljava/util/List;)V", "kotlin-stdlib"}, m87233k = 5, m87234mv = {2, 2, 0}, m87236xi = 49, m87237xs = "kotlin/collections/ArraysKt")
@SourceDebugExtension
public class ArraysKt__ArraysKt extends ArraysKt__ArraysJVMKt {
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin
    @PublishedApi
    @JvmName
    public static <T> boolean contentDeepEquals(@Nullable T[] tArr, @Nullable T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == 0 || tArr2 == 0 || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            Object[] objArr = tArr[i];
            Object[] objArr2 = tArr2[i];
            if (objArr != objArr2) {
                if (objArr == 0 || objArr2 == 0) {
                    return false;
                }
                if ((objArr instanceof Object[]) && (objArr2 instanceof Object[])) {
                    if (!contentDeepEquals(objArr, objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof byte[]) && (objArr2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) objArr, (byte[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof short[]) && (objArr2 instanceof short[])) {
                    if (!Arrays.equals((short[]) objArr, (short[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof int[]) && (objArr2 instanceof int[])) {
                    if (!Arrays.equals((int[]) objArr, (int[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof long[]) && (objArr2 instanceof long[])) {
                    if (!Arrays.equals((long[]) objArr, (long[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof float[]) && (objArr2 instanceof float[])) {
                    if (!Arrays.equals((float[]) objArr, (float[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof double[]) && (objArr2 instanceof double[])) {
                    if (!Arrays.equals((double[]) objArr, (double[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof char[]) && (objArr2 instanceof char[])) {
                    if (!Arrays.equals((char[]) objArr, (char[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof boolean[]) && (objArr2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) objArr, (boolean[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof UByteArray) && (objArr2 instanceof UByteArray)) {
                    if (!UArraysKt.m224045contentEqualskV0jMPg(((UByteArray) objArr).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String(), ((UByteArray) objArr2).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String())) {
                        return false;
                    }
                } else if ((objArr instanceof UShortArray) && (objArr2 instanceof UShortArray)) {
                    if (!UArraysKt.m224043contentEqualsFGO6Aew(((UShortArray) objArr).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String(), ((UShortArray) objArr2).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String())) {
                        return false;
                    }
                } else if ((objArr instanceof UIntArray) && (objArr2 instanceof UIntArray)) {
                    if (!UArraysKt.m224044contentEqualsKJPZfPQ(((UIntArray) objArr).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String(), ((UIntArray) objArr2).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String())) {
                        return false;
                    }
                } else if ((objArr instanceof ULongArray) && (objArr2 instanceof ULongArray)) {
                    if (!UArraysKt.m224046contentEqualslec5QzE(((ULongArray) objArr).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String(), ((ULongArray) objArr2).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String())) {
                        return false;
                    }
                } else if (!Intrinsics.m87488d(objArr, objArr2)) {
                    return false;
                }
            }
        }
        return true;
    }

    @SinceKotlin
    @JvmName
    @NotNull
    @PublishedApi
    public static final <T> String contentDeepToString(@Nullable T[] tArr) {
        if (tArr == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder((C15167a.m87599e(tArr.length, 429496729) * 5) + 2);
        contentDeepToStringInternal$ArraysKt__ArraysKt(tArr, sb, new ArrayList());
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void contentDeepToStringInternal$ArraysKt__ArraysKt(T[] tArr, StringBuilder sb, List<Object[]> list) {
        if (list.contains(tArr)) {
            sb.append("[...]");
            return;
        }
        list.add(tArr);
        sb.append('[');
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            Object[] objArr = tArr[i];
            if (objArr == 0) {
                sb.append("null");
            } else if (objArr instanceof Object[]) {
                contentDeepToStringInternal$ArraysKt__ArraysKt(objArr, sb, list);
                Unit unit = Unit.INSTANCE;
            } else if (objArr instanceof byte[]) {
                String string = Arrays.toString((byte[]) objArr);
                string.getClass();
                sb.append(string);
            } else if (objArr instanceof short[]) {
                String string2 = Arrays.toString((short[]) objArr);
                string2.getClass();
                sb.append(string2);
            } else if (objArr instanceof int[]) {
                String string3 = Arrays.toString((int[]) objArr);
                string3.getClass();
                sb.append(string3);
            } else if (objArr instanceof long[]) {
                String string4 = Arrays.toString((long[]) objArr);
                string4.getClass();
                sb.append(string4);
            } else if (objArr instanceof float[]) {
                String string5 = Arrays.toString((float[]) objArr);
                string5.getClass();
                sb.append(string5);
            } else if (objArr instanceof double[]) {
                String string6 = Arrays.toString((double[]) objArr);
                string6.getClass();
                sb.append(string6);
            } else if (objArr instanceof char[]) {
                String string7 = Arrays.toString((char[]) objArr);
                string7.getClass();
                sb.append(string7);
            } else if (objArr instanceof boolean[]) {
                String string8 = Arrays.toString((boolean[]) objArr);
                string8.getClass();
                sb.append(string8);
            } else if (objArr instanceof UByteArray) {
                sb.append(UArraysKt.m224051contentToString2csIQuQ(((UByteArray) objArr).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String()));
            } else if (objArr instanceof UShortArray) {
                sb.append(UArraysKt.m224053contentToStringd6D3K8(((UShortArray) objArr).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String()));
            } else if (objArr instanceof UIntArray) {
                sb.append(UArraysKt.m224052contentToStringXUkPCBk(((UIntArray) objArr).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String()));
            } else if (objArr instanceof ULongArray) {
                sb.append(UArraysKt.m224054contentToStringuLth9ew(((ULongArray) objArr).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String()));
            } else {
                sb.append(objArr.toString());
            }
        }
        sb.append(']');
        list.remove(CollectionsKt__CollectionsKt.getLastIndex(list));
    }

    @NotNull
    public static final <T> List<T> flatten(@NotNull T[][] tArr) {
        tArr.getClass();
        int length = 0;
        for (T[] tArr2 : tArr) {
            length += tArr2.length;
        }
        ArrayList arrayList = new ArrayList(length);
        for (T[] tArr3 : tArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, tArr3);
        }
        return arrayList;
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    @SinceKotlin
    @InlineOnly
    private static final Object ifEmpty(Object[] objArr, Function0 function0) {
        function0.getClass();
        return objArr.length == 0 ? function0.invoke() : objArr;
    }

    @SinceKotlin
    @InlineOnly
    private static final boolean isNullOrEmpty(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    @NotNull
    public static final <T, R> Pair<List<T>, List<R>> unzip(@NotNull Pair<? extends T, ? extends R>[] pairArr) {
        pairArr.getClass();
        ArrayList arrayList = new ArrayList(pairArr.length);
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair<? extends T, ? extends R> pair : pairArr) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return TuplesKt.m87240a(arrayList, arrayList2);
    }
}
