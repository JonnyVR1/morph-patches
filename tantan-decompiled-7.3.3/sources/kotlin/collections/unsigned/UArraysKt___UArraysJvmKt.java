package kotlin.collections.unsigned;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.UnsignedKt;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u001f\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001c\u0010\u0000\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\u0000\u001a\u00020\u000b*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u0000\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014*\u00020\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014*\u00020\bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014*\u00020\fH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014*\u00020\u0010H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a/\u0010\u001d\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\"\u001a/\u0010\u001d\u001a\u00020\u0004*\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010$\u001a/\u0010\u001d\u001a\u00020\u0004*\u00020\f2\u0006\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b%\u0010&\u001a/\u0010\u001d\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u000f2\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b'\u0010(\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0004\b*\u0010+\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\u0007*\u00020\bH\u0007¢\u0006\u0004\b,\u0010-\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\u000b*\u00020\fH\u0007¢\u0006\u0004\b.\u0010/\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\u000f*\u00020\u0010H\u0007¢\u0006\u0004\b0\u00101\u001a=\u00102\u001a\u0004\u0018\u00010\u0001\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00022\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\b7\u00108\u001a=\u00102\u001a\u0004\u0018\u00010\u0007\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a=\u00102\u001a\u0004\u0018\u00010\u000b\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a=\u00102\u001a\u0004\u0018\u00010\u000f\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00102\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a1\u0010?\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0001`BH\u0007¢\u0006\u0004\bC\u0010D\u001a1\u0010?\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00070Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0007`BH\u0007¢\u0006\u0004\bE\u0010F\u001a1\u0010?\u001a\u0004\u0018\u00010\u000b*\u00020\f2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000b0Aj\n\u0012\u0006\b\u0000\u0012\u00020\u000b`BH\u0007¢\u0006\u0004\bG\u0010H\u001a1\u0010?\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000f0Aj\n\u0012\u0006\b\u0000\u0012\u00020\u000f`BH\u0007¢\u0006\u0004\bI\u0010J\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0004\bL\u0010+\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\u0007*\u00020\bH\u0007¢\u0006\u0004\bM\u0010-\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\u000b*\u00020\fH\u0007¢\u0006\u0004\bN\u0010/\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\u000f*\u00020\u0010H\u0007¢\u0006\u0004\bO\u00101\u001a=\u0010P\u001a\u0004\u0018\u00010\u0001\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00022\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\bQ\u00108\u001a=\u0010P\u001a\u0004\u0018\u00010\u0007\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\bR\u0010:\u001a=\u0010P\u001a\u0004\u0018\u00010\u000b\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\bS\u0010<\u001a=\u0010P\u001a\u0004\u0018\u00010\u000f\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00102\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\bT\u0010>\u001a1\u0010U\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0001`BH\u0007¢\u0006\u0004\bV\u0010D\u001a1\u0010U\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00070Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0007`BH\u0007¢\u0006\u0004\bW\u0010F\u001a1\u0010U\u001a\u0004\u0018\u00010\u000b*\u00020\f2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000b0Aj\n\u0012\u0006\b\u0000\u0012\u00020\u000b`BH\u0007¢\u0006\u0004\bX\u0010H\u001a1\u0010U\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000f0Aj\n\u0012\u0006\b\u0000\u0012\u00020\u000f`BH\u0007¢\u0006\u0004\bY\u0010J\u001a+\u0010Z\u001a\u00020[*\u00020\u00022\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0000¢\u0006\u0004\b\\\u0010]\u001a+\u0010Z\u001a\u00020[*\u00020\b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0000¢\u0006\u0004\b\\\u0010^\u001a+\u0010Z\u001a\u00020[*\u00020\f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0000¢\u0006\u0004\b\\\u0010_\u001a+\u0010Z\u001a\u00020[*\u00020\u00102\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0000¢\u0006\u0004\b\\\u0010`\u001a+\u0010Z\u001a\u00020a*\u00020\u00022\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020a06H\u0087\bø\u0001\u0000¢\u0006\u0004\bb\u0010c\u001a+\u0010Z\u001a\u00020a*\u00020\b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020a06H\u0087\bø\u0001\u0000¢\u0006\u0004\bb\u0010d\u001a+\u0010Z\u001a\u00020a*\u00020\f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020a06H\u0087\bø\u0001\u0000¢\u0006\u0004\bb\u0010e\u001a+\u0010Z\u001a\u00020a*\u00020\u00102\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020a06H\u0087\bø\u0001\u0000¢\u0006\u0004\bb\u0010f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006g"}, m88121d2 = {"elementAt", "Lkotlin/UInt;", "Lkotlin/UIntArray;", FirebaseAnalytics.Param.INDEX, "", "elementAt-qFRl0hI", "([II)I", "Lkotlin/ULong;", "Lkotlin/ULongArray;", "elementAt-r7IrZao", "([JI)J", "Lkotlin/UByte;", "Lkotlin/UByteArray;", "elementAt-PpDY95g", "([BI)B", "Lkotlin/UShort;", "Lkotlin/UShortArray;", "elementAt-nggk6HY", "([SI)S", "asList", "", "asList--ajY-9A", "([I)Ljava/util/List;", "asList-QwZRm1k", "([J)Ljava/util/List;", "asList-GBYM_sE", "([B)Ljava/util/List;", "asList-rL5Bavg", "([S)Ljava/util/List;", "binarySearch", "element", "fromIndex", "toIndex", "binarySearch-2fe2U9s", "([IIII)I", "binarySearch-K6DWlUc", "([JJII)I", "binarySearch-WpHrYlw", "([BBII)I", "binarySearch-EtDCXyQ", "([SSII)I", Constants.PRIORITY_MAX, "max--ajY-9A", "([I)Lkotlin/UInt;", "max-QwZRm1k", "([J)Lkotlin/ULong;", "max-GBYM_sE", "([B)Lkotlin/UByte;", "max-rL5Bavg", "([S)Lkotlin/UShort;", "maxBy", "R", "", "selector", "Lkotlin/Function1;", "maxBy-jgv0xPQ", "([ILkotlin/jvm/functions/Function1;)Lkotlin/UInt;", "maxBy-MShoTSo", "([JLkotlin/jvm/functions/Function1;)Lkotlin/ULong;", "maxBy-JOV_ifY", "([BLkotlin/jvm/functions/Function1;)Lkotlin/UByte;", "maxBy-xTcfx_M", "([SLkotlin/jvm/functions/Function1;)Lkotlin/UShort;", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "maxWith-YmdZ_VM", "([ILjava/util/Comparator;)Lkotlin/UInt;", "maxWith-zrEWJaI", "([JLjava/util/Comparator;)Lkotlin/ULong;", "maxWith-XMRcp5o", "([BLjava/util/Comparator;)Lkotlin/UByte;", "maxWith-eOHTfZs", "([SLjava/util/Comparator;)Lkotlin/UShort;", "min", "min--ajY-9A", "min-QwZRm1k", "min-GBYM_sE", "min-rL5Bavg", "minBy", "minBy-jgv0xPQ", "minBy-MShoTSo", "minBy-JOV_ifY", "minBy-xTcfx_M", "minWith", "minWith-YmdZ_VM", "minWith-zrEWJaI", "minWith-XMRcp5o", "minWith-eOHTfZs", "sumOf", "Ljava/math/BigDecimal;", "sumOfBigDecimal", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "Ljava/math/BigInteger;", "sumOfBigInteger", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "kotlin-stdlib"}, m88122k = 5, m88123mv = {2, 2, 0}, m88124pn = "kotlin.collections", m88125xi = 49, m88126xs = "kotlin/collections/unsigned/UArraysKt")
class UArraysKt___UArraysJvmKt {
    @SinceKotlin
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: asList--ajY-9A, reason: not valid java name */
    public static final List<UInt> m225189asListajY9A(@NotNull int[] iArr) {
        iArr.getClass();
        return new UArraysKt___UArraysJvmKt$asList$1(iArr);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: asList-GBYM_sE, reason: not valid java name */
    public static final List<UByte> m225190asListGBYM_sE(@NotNull byte[] bArr) {
        bArr.getClass();
        return new UArraysKt___UArraysJvmKt$asList$3(bArr);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: asList-QwZRm1k, reason: not valid java name */
    public static final List<ULong> m225191asListQwZRm1k(@NotNull long[] jArr) {
        jArr.getClass();
        return new UArraysKt___UArraysJvmKt$asList$2(jArr);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: asList-rL5Bavg, reason: not valid java name */
    public static final List<UShort> m225192asListrL5Bavg(@NotNull short[] sArr) {
        sArr.getClass();
        return new UArraysKt___UArraysJvmKt$asList$4(sArr);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: binarySearch-2fe2U9s, reason: not valid java name */
    public static final int m225193binarySearch2fe2U9s(@NotNull int[] iArr, int i, int i2, int i3) {
        iArr.getClass();
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i2, i3, UIntArray.m88166p(iArr));
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int iM88222a = UnsignedKt.m88222a(iArr[i5], i);
            if (iM88222a < 0) {
                i2 = i5 + 1;
            } else {
                if (iM88222a <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: binarySearch-2fe2U9s$default, reason: not valid java name */
    public static /* synthetic */ int m225194binarySearch2fe2U9s$default(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = UIntArray.m88166p(iArr);
        }
        return m225193binarySearch2fe2U9s(iArr, i, i2, i3);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: binarySearch-EtDCXyQ, reason: not valid java name */
    public static final int m225195binarySearchEtDCXyQ(@NotNull short[] sArr, short s, int i, int i2) {
        sArr.getClass();
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i, i2, UShortArray.m88212p(sArr));
        int i3 = s & 65535;
        int i4 = i2 - 1;
        while (i <= i4) {
            int i5 = (i + i4) >>> 1;
            int iM88222a = UnsignedKt.m88222a(sArr[i5], i3);
            if (iM88222a < 0) {
                i = i5 + 1;
            } else {
                if (iM88222a <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: binarySearch-EtDCXyQ$default, reason: not valid java name */
    public static /* synthetic */ int m225196binarySearchEtDCXyQ$default(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UShortArray.m88212p(sArr);
        }
        return m225195binarySearchEtDCXyQ(sArr, s, i, i2);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: binarySearch-K6DWlUc, reason: not valid java name */
    public static final int m225197binarySearchK6DWlUc(@NotNull long[] jArr, long j, int i, int i2) {
        jArr.getClass();
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i, i2, ULongArray.m88189p(jArr));
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iM88223b = UnsignedKt.m88223b(jArr[i4], j);
            if (iM88223b < 0) {
                i = i4 + 1;
            } else {
                if (iM88223b <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: binarySearch-K6DWlUc$default, reason: not valid java name */
    public static /* synthetic */ int m225198binarySearchK6DWlUc$default(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = ULongArray.m88189p(jArr);
        }
        return m225197binarySearchK6DWlUc(jArr, j, i, i2);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: binarySearch-WpHrYlw, reason: not valid java name */
    public static final int m225199binarySearchWpHrYlw(@NotNull byte[] bArr, byte b, int i, int i2) {
        bArr.getClass();
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i, i2, UByteArray.m88143p(bArr));
        int i3 = b & 255;
        int i4 = i2 - 1;
        while (i <= i4) {
            int i5 = (i + i4) >>> 1;
            int iM88222a = UnsignedKt.m88222a(bArr[i5], i3);
            if (iM88222a < 0) {
                i = i5 + 1;
            } else {
                if (iM88222a <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: binarySearch-WpHrYlw$default, reason: not valid java name */
    public static /* synthetic */ int m225200binarySearchWpHrYlw$default(byte[] bArr, byte b, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UByteArray.m88143p(bArr);
        }
        return m225199binarySearchWpHrYlw(bArr, b, i, i2);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: elementAt-PpDY95g, reason: not valid java name */
    private static final byte m225201elementAtPpDY95g(byte[] bArr, int i) {
        bArr.getClass();
        return UByteArray.m88142l(bArr, i);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: elementAt-nggk6HY, reason: not valid java name */
    private static final short m225202elementAtnggk6HY(short[] sArr, int i) {
        sArr.getClass();
        return UShortArray.m88211l(sArr, i);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: elementAt-qFRl0hI, reason: not valid java name */
    private static final int m225203elementAtqFRl0hI(int[] iArr, int i) {
        iArr.getClass();
        return UIntArray.m88165l(iArr, i);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: elementAt-r7IrZao, reason: not valid java name */
    private static final long m225204elementAtr7IrZao(long[] jArr, int i) {
        jArr.getClass();
        return ULongArray.m88188l(jArr, i);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @Deprecated
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: max--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ UInt m225205maxajY9A(int[] iArr) {
        iArr.getClass();
        return UArraysKt___UArraysKt.m225577maxOrNullajY9A(iArr);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @Deprecated
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: max-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ UByte m225206maxGBYM_sE(byte[] bArr) {
        bArr.getClass();
        return UArraysKt___UArraysKt.m225578maxOrNullGBYM_sE(bArr);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @Deprecated
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: max-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ ULong m225207maxQwZRm1k(long[] jArr) {
        jArr.getClass();
        return UArraysKt___UArraysKt.m225579maxOrNullQwZRm1k(jArr);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @Deprecated
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: max-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ UShort m225208maxrL5Bavg(short[] sArr) {
        sArr.getClass();
        return UArraysKt___UArraysKt.m225580maxOrNullrL5Bavg(sArr);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: maxBy-JOV_ifY, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UByte m225209maxByJOV_ifY(byte[] bArr, Function1<? super UByte, ? extends R> function1) {
        bArr.getClass();
        function1.getClass();
        if (UByteArray.m88145s(bArr)) {
            return null;
        }
        byte bM88142l = UByteArray.m88142l(bArr, 0);
        int lastIndex = ArraysKt.getLastIndex(bArr);
        if (lastIndex == 0) {
            return UByte.m88130a(bM88142l);
        }
        R rInvoke = function1.invoke(UByte.m88130a(bM88142l));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bM88142l2 = UByteArray.m88142l(bArr, i);
                R rInvoke2 = function1.invoke(UByte.m88130a(bM88142l2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    bM88142l = bM88142l2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UByte.m88130a(bM88142l);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: maxBy-MShoTSo, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> ULong m225210maxByMShoTSo(long[] jArr, Function1<? super ULong, ? extends R> function1) {
        jArr.getClass();
        function1.getClass();
        if (ULongArray.m88191s(jArr)) {
            return null;
        }
        long jM88188l = ULongArray.m88188l(jArr, 0);
        int lastIndex = ArraysKt.getLastIndex(jArr);
        if (lastIndex == 0) {
            return ULong.m88176a(jM88188l);
        }
        R rInvoke = function1.invoke(ULong.m88176a(jM88188l));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jM88188l2 = ULongArray.m88188l(jArr, i);
                R rInvoke2 = function1.invoke(ULong.m88176a(jM88188l2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    jM88188l = jM88188l2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return ULong.m88176a(jM88188l);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: maxBy-jgv0xPQ, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UInt m225211maxByjgv0xPQ(int[] iArr, Function1<? super UInt, ? extends R> function1) {
        iArr.getClass();
        function1.getClass();
        if (UIntArray.m88168s(iArr)) {
            return null;
        }
        int iM88165l = UIntArray.m88165l(iArr, 0);
        int lastIndex = ArraysKt.getLastIndex(iArr);
        if (lastIndex == 0) {
            return UInt.m88153a(iM88165l);
        }
        R rInvoke = function1.invoke(UInt.m88153a(iM88165l));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM88165l2 = UIntArray.m88165l(iArr, i);
                R rInvoke2 = function1.invoke(UInt.m88153a(iM88165l2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    iM88165l = iM88165l2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UInt.m88153a(iM88165l);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: maxBy-xTcfx_M, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UShort m225212maxByxTcfx_M(short[] sArr, Function1<? super UShort, ? extends R> function1) {
        sArr.getClass();
        function1.getClass();
        if (UShortArray.m88214s(sArr)) {
            return null;
        }
        short sM88211l = UShortArray.m88211l(sArr, 0);
        int lastIndex = ArraysKt.getLastIndex(sArr);
        if (lastIndex == 0) {
            return UShort.m88199a(sM88211l);
        }
        R rInvoke = function1.invoke(UShort.m88199a(sM88211l));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sM88211l2 = UShortArray.m88211l(sArr, i);
                R rInvoke2 = function1.invoke(UShort.m88199a(sM88211l2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    sM88211l = sM88211l2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UShort.m88199a(sM88211l);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @Deprecated
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: maxWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ UByte m225213maxWithXMRcp5o(byte[] bArr, Comparator comparator) {
        bArr.getClass();
        comparator.getClass();
        return UArraysKt___UArraysKt.m225585maxWithOrNullXMRcp5o(bArr, comparator);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @Deprecated
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: maxWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ UInt m225214maxWithYmdZ_VM(int[] iArr, Comparator comparator) {
        iArr.getClass();
        comparator.getClass();
        return UArraysKt___UArraysKt.m225586maxWithOrNullYmdZ_VM(iArr, comparator);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @Deprecated
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: maxWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ UShort m225215maxWitheOHTfZs(short[] sArr, Comparator comparator) {
        sArr.getClass();
        comparator.getClass();
        return UArraysKt___UArraysKt.m225587maxWithOrNulleOHTfZs(sArr, comparator);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @Deprecated
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: maxWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ ULong m225216maxWithzrEWJaI(long[] jArr, Comparator comparator) {
        jArr.getClass();
        comparator.getClass();
        return UArraysKt___UArraysKt.m225588maxWithOrNullzrEWJaI(jArr, comparator);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @Deprecated
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: min--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ UInt m225217minajY9A(int[] iArr) {
        iArr.getClass();
        return UArraysKt___UArraysKt.m225633minOrNullajY9A(iArr);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @Deprecated
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: min-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ UByte m225218minGBYM_sE(byte[] bArr) {
        bArr.getClass();
        return UArraysKt___UArraysKt.m225634minOrNullGBYM_sE(bArr);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @Deprecated
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: min-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ ULong m225219minQwZRm1k(long[] jArr) {
        jArr.getClass();
        return UArraysKt___UArraysKt.m225635minOrNullQwZRm1k(jArr);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @Deprecated
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: min-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ UShort m225220minrL5Bavg(short[] sArr) {
        sArr.getClass();
        return UArraysKt___UArraysKt.m225636minOrNullrL5Bavg(sArr);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: minBy-JOV_ifY, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UByte m225221minByJOV_ifY(byte[] bArr, Function1<? super UByte, ? extends R> function1) {
        bArr.getClass();
        function1.getClass();
        if (UByteArray.m88145s(bArr)) {
            return null;
        }
        byte bM88142l = UByteArray.m88142l(bArr, 0);
        int lastIndex = ArraysKt.getLastIndex(bArr);
        if (lastIndex == 0) {
            return UByte.m88130a(bM88142l);
        }
        R rInvoke = function1.invoke(UByte.m88130a(bM88142l));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte bM88142l2 = UByteArray.m88142l(bArr, i);
                R rInvoke2 = function1.invoke(UByte.m88130a(bM88142l2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    bM88142l = bM88142l2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UByte.m88130a(bM88142l);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: minBy-MShoTSo, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> ULong m225222minByMShoTSo(long[] jArr, Function1<? super ULong, ? extends R> function1) {
        jArr.getClass();
        function1.getClass();
        if (ULongArray.m88191s(jArr)) {
            return null;
        }
        long jM88188l = ULongArray.m88188l(jArr, 0);
        int lastIndex = ArraysKt.getLastIndex(jArr);
        if (lastIndex == 0) {
            return ULong.m88176a(jM88188l);
        }
        R rInvoke = function1.invoke(ULong.m88176a(jM88188l));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                long jM88188l2 = ULongArray.m88188l(jArr, i);
                R rInvoke2 = function1.invoke(ULong.m88176a(jM88188l2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    jM88188l = jM88188l2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return ULong.m88176a(jM88188l);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: minBy-jgv0xPQ, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UInt m225223minByjgv0xPQ(int[] iArr, Function1<? super UInt, ? extends R> function1) {
        iArr.getClass();
        function1.getClass();
        if (UIntArray.m88168s(iArr)) {
            return null;
        }
        int iM88165l = UIntArray.m88165l(iArr, 0);
        int lastIndex = ArraysKt.getLastIndex(iArr);
        if (lastIndex == 0) {
            return UInt.m88153a(iM88165l);
        }
        R rInvoke = function1.invoke(UInt.m88153a(iM88165l));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                int iM88165l2 = UIntArray.m88165l(iArr, i);
                R rInvoke2 = function1.invoke(UInt.m88153a(iM88165l2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    iM88165l = iM88165l2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UInt.m88153a(iM88165l);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: minBy-xTcfx_M, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UShort m225224minByxTcfx_M(short[] sArr, Function1<? super UShort, ? extends R> function1) {
        sArr.getClass();
        function1.getClass();
        if (UShortArray.m88214s(sArr)) {
            return null;
        }
        short sM88211l = UShortArray.m88211l(sArr, 0);
        int lastIndex = ArraysKt.getLastIndex(sArr);
        if (lastIndex == 0) {
            return UShort.m88199a(sM88211l);
        }
        R rInvoke = function1.invoke(UShort.m88199a(sM88211l));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                short sM88211l2 = UShortArray.m88211l(sArr, i);
                R rInvoke2 = function1.invoke(UShort.m88199a(sM88211l2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    sM88211l = sM88211l2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UShort.m88199a(sM88211l);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @Deprecated
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: minWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ UByte m225225minWithXMRcp5o(byte[] bArr, Comparator comparator) {
        bArr.getClass();
        comparator.getClass();
        return UArraysKt___UArraysKt.m225641minWithOrNullXMRcp5o(bArr, comparator);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @Deprecated
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: minWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ UInt m225226minWithYmdZ_VM(int[] iArr, Comparator comparator) {
        iArr.getClass();
        comparator.getClass();
        return UArraysKt___UArraysKt.m225642minWithOrNullYmdZ_VM(iArr, comparator);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @Deprecated
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: minWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ UShort m225227minWitheOHTfZs(short[] sArr, Comparator comparator) {
        sArr.getClass();
        comparator.getClass();
        return UArraysKt___UArraysKt.m225643minWithOrNulleOHTfZs(sArr, comparator);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @Deprecated
    @DeprecatedSinceKotlin
    /* JADX INFO: renamed from: minWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ ULong m225228minWithzrEWJaI(long[] jArr, Comparator comparator) {
        jArr.getClass();
        comparator.getClass();
        return UArraysKt___UArraysKt.m225644minWithOrNullzrEWJaI(jArr, comparator);
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(int[] iArr, Function1<? super UInt, ? extends BigDecimal> function1) {
        iArr.getClass();
        function1.getClass();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        bigDecimalValueOf.getClass();
        int iM88166p = UIntArray.m88166p(iArr);
        for (int i = 0; i < iM88166p; i++) {
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(UInt.m88153a(UIntArray.m88165l(iArr, i))));
            bigDecimalValueOf.getClass();
        }
        return bigDecimalValueOf;
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(int[] iArr, Function1<? super UInt, ? extends BigInteger> function1) {
        iArr.getClass();
        function1.getClass();
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        bigIntegerValueOf.getClass();
        int iM88166p = UIntArray.m88166p(iArr);
        for (int i = 0; i < iM88166p; i++) {
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(UInt.m88153a(UIntArray.m88165l(iArr, i))));
            bigIntegerValueOf.getClass();
        }
        return bigIntegerValueOf;
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(long[] jArr, Function1<? super ULong, ? extends BigDecimal> function1) {
        jArr.getClass();
        function1.getClass();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        bigDecimalValueOf.getClass();
        int iM88189p = ULongArray.m88189p(jArr);
        for (int i = 0; i < iM88189p; i++) {
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(ULong.m88176a(ULongArray.m88188l(jArr, i))));
            bigDecimalValueOf.getClass();
        }
        return bigDecimalValueOf;
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(long[] jArr, Function1<? super ULong, ? extends BigInteger> function1) {
        jArr.getClass();
        function1.getClass();
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        bigIntegerValueOf.getClass();
        int iM88189p = ULongArray.m88189p(jArr);
        for (int i = 0; i < iM88189p; i++) {
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(ULong.m88176a(ULongArray.m88188l(jArr, i))));
            bigIntegerValueOf.getClass();
        }
        return bigIntegerValueOf;
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(byte[] bArr, Function1<? super UByte, ? extends BigDecimal> function1) {
        bArr.getClass();
        function1.getClass();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        bigDecimalValueOf.getClass();
        int iM88143p = UByteArray.m88143p(bArr);
        for (int i = 0; i < iM88143p; i++) {
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(UByte.m88130a(UByteArray.m88142l(bArr, i))));
            bigDecimalValueOf.getClass();
        }
        return bigDecimalValueOf;
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(byte[] bArr, Function1<? super UByte, ? extends BigInteger> function1) {
        bArr.getClass();
        function1.getClass();
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        bigIntegerValueOf.getClass();
        int iM88143p = UByteArray.m88143p(bArr);
        for (int i = 0; i < iM88143p; i++) {
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(UByte.m88130a(UByteArray.m88142l(bArr, i))));
            bigIntegerValueOf.getClass();
        }
        return bigIntegerValueOf;
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(short[] sArr, Function1<? super UShort, ? extends BigDecimal> function1) {
        sArr.getClass();
        function1.getClass();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        bigDecimalValueOf.getClass();
        int iM88212p = UShortArray.m88212p(sArr);
        for (int i = 0; i < iM88212p; i++) {
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(UShort.m88199a(UShortArray.m88211l(sArr, i))));
            bigDecimalValueOf.getClass();
        }
        return bigDecimalValueOf;
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(short[] sArr, Function1<? super UShort, ? extends BigInteger> function1) {
        sArr.getClass();
        function1.getClass();
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        bigIntegerValueOf.getClass();
        int iM88212p = UShortArray.m88212p(sArr);
        for (int i = 0; i < iM88212p; i++) {
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(UShort.m88199a(UShortArray.m88211l(sArr, i))));
            bigIntegerValueOf.getClass();
        }
        return bigIntegerValueOf;
    }
}
