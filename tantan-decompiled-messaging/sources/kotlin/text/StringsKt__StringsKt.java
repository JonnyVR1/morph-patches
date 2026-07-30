package kotlin.text;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.meituan.robust.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CharIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import p149l.ctq0;
import p149l.j6f;
import p149l.jck0;
import p149l.mmr;
import p149l.s0g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000l\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0019\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0011\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a#\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\n\u001a\u00020\t*\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\r\u001a\u00020\f*\u00020\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0014\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u0018\u001a\u00020\t*\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u001a\u001a\u00020\t*\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u001c\u001a\u00020\t*\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u0019\u001a#\u0010\u001d\u001a\u00020\t*\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u001b\u001a#\u0010\u001e\u001a\u00020\t*\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u0019\u001a#\u0010\u001f\u001a\u00020\t*\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\u001b\u001a#\u0010 \u001a\u00020\t*\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b \u0010\u0019\u001a#\u0010!\u001a\u00020\t*\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b!\u0010\u001b\u001a)\u0010%\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0000¢\u0006\u0004\b%\u0010&\u001a!\u0010'\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003¢\u0006\u0004\b'\u0010(\u001a\u0019\u0010*\u001a\u00020\t*\u00020\t2\u0006\u0010)\u001a\u00020\u0000¢\u0006\u0004\b*\u0010+\u001a\u0019\u0010-\u001a\u00020\t*\u00020\t2\u0006\u0010,\u001a\u00020\u0000¢\u0006\u0004\b-\u0010+\u001a;\u00102\u001a\u00020\f*\u00020\u00002\u0006\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u00101\u001a\u00020\fH\u0000¢\u0006\u0004\b2\u00103\u001a#\u00105\u001a\u00020\f*\u00020\u00002\u0006\u00104\u001a\u00020\u00052\b\b\u0002\u00101\u001a\u00020\f¢\u0006\u0004\b5\u00106\u001a#\u00107\u001a\u00020\f*\u00020\u00002\u0006\u00104\u001a\u00020\u00052\b\b\u0002\u00101\u001a\u00020\f¢\u0006\u0004\b7\u00106\u001a#\u00108\u001a\u00020\f*\u00020\u00002\u0006\u0010)\u001a\u00020\u00002\b\b\u0002\u00101\u001a\u00020\f¢\u0006\u0004\b8\u00109\u001a#\u0010:\u001a\u00020\f*\u00020\u00002\u0006\u0010,\u001a\u00020\u00002\b\b\u0002\u00101\u001a\u00020\f¢\u0006\u0004\b:\u00109\u001a-\u0010=\u001a\u00020\u0003*\u00020\u00002\u0006\u0010<\u001a\u00020;2\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\f¢\u0006\u0004\b=\u0010>\u001a-\u0010?\u001a\u00020\u0003*\u00020\u00002\u0006\u0010<\u001a\u00020;2\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\f¢\u0006\u0004\b?\u0010>\u001a=\u0010A\u001a\u00020\u0003*\u00020\u00002\u0006\u0010/\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u00101\u001a\u00020\f2\b\b\u0002\u0010@\u001a\u00020\fH\u0002¢\u0006\u0004\bA\u0010B\u001aG\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010E*\u00020\u00002\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\t0C2\u0006\u0010\"\u001a\u00020\u00032\u0006\u00101\u001a\u00020\f2\u0006\u0010@\u001a\u00020\fH\u0002¢\u0006\u0004\bF\u0010G\u001a-\u0010H\u001a\u00020\u0003*\u00020\u00002\u0006\u00104\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\f¢\u0006\u0004\bH\u0010I\u001a-\u0010K\u001a\u00020\u0003*\u00020\u00002\u0006\u0010J\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\f¢\u0006\u0004\bK\u0010L\u001a-\u0010M\u001a\u00020\u0003*\u00020\u00002\u0006\u00104\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\f¢\u0006\u0004\bM\u0010I\u001a-\u0010N\u001a\u00020\u0003*\u00020\u00002\u0006\u0010J\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\f¢\u0006\u0004\bN\u0010L\u001a&\u0010O\u001a\u00020\f*\u00020\u00002\u0006\u0010/\u001a\u00020\u00002\b\b\u0002\u00101\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\bO\u00109\u001a&\u0010P\u001a\u00020\f*\u00020\u00002\u0006\u00104\u001a\u00020\u00052\b\b\u0002\u00101\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\bP\u00106\u001a?\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00120S*\u00020\u00002\u0006\u0010Q\u001a\u00020;2\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\f2\b\b\u0002\u0010R\u001a\u00020\u0003H\u0002¢\u0006\u0004\bT\u0010U\u001aG\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00120S*\u00020\u00002\u000e\u0010Q\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0V2\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\f2\b\b\u0002\u0010R\u001a\u00020\u0003H\u0002¢\u0006\u0004\bW\u0010X\u001a\u0017\u0010Z\u001a\u00020Y2\u0006\u0010R\u001a\u00020\u0003H\u0000¢\u0006\u0004\bZ\u0010[\u001a?\u0010]\u001a\b\u0012\u0004\u0012\u00020\t0\\*\u00020\u00002\u0012\u0010Q\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0V\"\u00020\t2\b\b\u0002\u00101\u001a\u00020\f2\b\b\u0002\u0010R\u001a\u00020\u0003¢\u0006\u0004\b]\u0010^\u001a7\u0010_\u001a\b\u0012\u0004\u0012\u00020\t0\\*\u00020\u00002\n\u0010Q\u001a\u00020;\"\u00020\u00052\b\b\u0002\u00101\u001a\u00020\f2\b\b\u0002\u0010R\u001a\u00020\u0003¢\u0006\u0004\b_\u0010`\u001a1\u0010a\u001a\b\u0012\u0004\u0012\u00020\t0\\*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\t2\u0006\u00101\u001a\u00020\f2\u0006\u0010R\u001a\u00020\u0003H\u0002¢\u0006\u0004\ba\u0010b\u001a\u0017\u0010c\u001a\b\u0012\u0004\u0012\u00020\t0S*\u00020\u0000¢\u0006\u0004\bc\u0010d\u001a\u0017\u0010e\u001a\b\u0012\u0004\u0012\u00020\t0\\*\u00020\u0000¢\u0006\u0004\be\u0010f\"\u0015\u0010i\u001a\u00020\u0012*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bg\u0010h\"\u0015\u0010l\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bj\u0010k¨\u0006m"}, m87232d2 = {"", "Z0", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "", "length", "", "padChar", "n0", "(Ljava/lang/CharSequence;IC)Ljava/lang/CharSequence;", "", "o0", "(Ljava/lang/String;IC)Ljava/lang/String;", "", "e0", "(Ljava/lang/CharSequence;)Z", "Lkotlin/collections/CharIterator;", "f0", "(Ljava/lang/CharSequence;)Lkotlin/collections/CharIterator;", "Lkotlin/ranges/IntRange;", "range", "J0", "(Ljava/lang/CharSequence;Lkotlin/ranges/IntRange;)Ljava/lang/String;", RequestParameters.DELIMITER, "missingDelimiterValue", "S0", "(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;", "T0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "K0", "L0", "W0", "X0", "O0", "P0", "startIndex", "endIndex", "replacement", "z0", "(Ljava/lang/CharSequence;IILjava/lang/CharSequence;)Ljava/lang/CharSequence;", "x0", "(Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;", RequestParameters.PREFIX, "w0", "(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;", "suffix", "y0", "thisOffset", "other", "otherOffset", "ignoreCase", "v0", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z", Constants.CHAR, "F0", "(Ljava/lang/CharSequence;CZ)Z", "Q", "G0", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z", "R", "", "chars", "d0", "(Ljava/lang/CharSequence;[CIZ)I", "k0", "last", "Z", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I", "", "strings", "Lkotlin/Pair;", "U", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)Lkotlin/Pair;", "X", "(Ljava/lang/CharSequence;CIZ)I", "string", "Y", "(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I", "g0", "h0", "N", "M", "delimiters", com.clevertap.android.sdk.Constants.KEY_LIMIT, "Lkotlin/sequences/Sequence;", "p0", "(Ljava/lang/CharSequence;[CIZI)Lkotlin/sequences/Sequence;", "", "q0", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "", "A0", "(I)V", "", "C0", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "B0", "(Ljava/lang/CharSequence;[CZI)Ljava/util/List;", "D0", "(Ljava/lang/CharSequence;Ljava/lang/String;ZI)Ljava/util/List;", "l0", "(Ljava/lang/CharSequence;)Lkotlin/sequences/Sequence;", "m0", "(Ljava/lang/CharSequence;)Ljava/util/List;", j6f.GPS_MEASUREMENT_INTERRUPTED, "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "indices", "W", "(Ljava/lang/CharSequence;)I", "lastIndex", "kotlin-stdlib"}, m87233k = 5, m87234mv = {2, 2, 0}, m87236xi = 49, m87237xs = "kotlin/text/StringsKt")
@SourceDebugExtension
public class StringsKt__StringsKt extends C15386d {
    /* JADX INFO: renamed from: A0 */
    public static final void m93392A0(int i) {
        if (i >= 0) {
            return;
        }
        jck0.m140980a("Limit must be non-negative, but was ", i);
    }

    @NotNull
    /* JADX INFO: renamed from: B0 */
    public static final List<String> m93393B0(@NotNull CharSequence charSequence, @NotNull char[] cArr, boolean z, int i) {
        charSequence.getClass();
        cArr.getClass();
        if (cArr.length == 1) {
            return m93395D0(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable iterableM93307x = SequencesKt___SequencesKt.m93307x(m93451r0(charSequence, cArr, 0, z, i, 2, null));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableM93307x, 10));
        Iterator it = iterableM93307x.iterator();
        while (it.hasNext()) {
            arrayList.add(m93401J0(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public static final List<String> m93394C0(@NotNull CharSequence charSequence, @NotNull String[] strArr, boolean z, int i) {
        charSequence.getClass();
        strArr.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return m93395D0(charSequence, str, z, i);
            }
        }
        Iterable iterableM93307x = SequencesKt___SequencesKt.m93307x(m93452s0(charSequence, strArr, 0, z, i, 2, null));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableM93307x, 10));
        Iterator it = iterableM93307x.iterator();
        while (it.hasNext()) {
            arrayList.add(m93401J0(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: D0 */
    public static final List<String> m93395D0(CharSequence charSequence, String str, boolean z, int i) {
        m93392A0(i);
        int length = 0;
        int iM93430Y = m93430Y(charSequence, str, 0, z);
        if (iM93430Y == -1 || i == 1) {
            return CollectionsKt.listOf(charSequence.toString());
        }
        boolean z2 = i > 0;
        ArrayList arrayList = new ArrayList(z2 ? C15167a.m87599e(i, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iM93430Y).toString());
            length = str.length() + iM93430Y;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            iM93430Y = m93430Y(charSequence, str, length, z);
        } while (iM93430Y != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ List m93396E0(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m93393B0(charSequence, cArr, z, i);
    }

    /* JADX INFO: renamed from: F0 */
    public static final boolean m93397F0(@NotNull CharSequence charSequence, char c, boolean z) {
        charSequence.getClass();
        return charSequence.length() > 0 && C15383a.m93462d(charSequence.charAt(0), c, z);
    }

    /* JADX INFO: renamed from: G0 */
    public static final boolean m93398G0(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        return (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) ? C15386d.m93483J((String) charSequence, (String) charSequence2, false, 2, null) : m93455v0(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ boolean m93399H0(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m93397F0(charSequence, c, z);
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ boolean m93400I0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m93398G0(charSequence, charSequence2, z);
    }

    @NotNull
    /* JADX INFO: renamed from: J0 */
    public static final String m93401J0(@NotNull CharSequence charSequence, @NotNull IntRange intRange) {
        charSequence.getClass();
        intRange.getClass();
        return charSequence.subSequence(intRange.m87586l().intValue(), intRange.m87585j().intValue() + 1).toString();
    }

    @NotNull
    /* JADX INFO: renamed from: K0 */
    public static final String m93403K0(@NotNull String str, char c, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        int iM93435b0 = m93435b0(str, c, 0, false, 6, null);
        return iM93435b0 == -1 ? str2 : str.substring(iM93435b0 + 1, str.length());
    }

    @NotNull
    /* JADX INFO: renamed from: L0 */
    public static final String m93405L0(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int iM93436c0 = m93436c0(str, str2, 0, false, 6, null);
        return iM93436c0 == -1 ? str3 : str.substring(iM93436c0 + str2.length(), str.length());
    }

    /* JADX INFO: renamed from: M */
    public static final boolean m93406M(@NotNull CharSequence charSequence, char c, boolean z) {
        charSequence.getClass();
        return m93435b0(charSequence, c, 0, z, 2, null) >= 0;
    }

    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ String m93407M0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m93403K0(str, c, str2);
    }

    /* JADX INFO: renamed from: N */
    public static final boolean m93408N(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            return m93436c0(charSequence, (String) charSequence2, 0, z, 2, null) >= 0;
        }
        return m93434a0(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) >= 0;
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ String m93409N0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m93405L0(str, str2, str3);
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ boolean m93410O(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m93406M(charSequence, c, z);
    }

    @NotNull
    /* JADX INFO: renamed from: O0 */
    public static String m93411O0(@NotNull String str, char c, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        int iM93442i0 = m93442i0(str, c, 0, false, 6, null);
        return iM93442i0 == -1 ? str2 : str.substring(iM93442i0 + 1, str.length());
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ boolean m93412P(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m93408N(charSequence, charSequence2, z);
    }

    @NotNull
    /* JADX INFO: renamed from: P0 */
    public static final String m93413P0(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int iM93443j0 = m93443j0(str, str2, 0, false, 6, null);
        return iM93443j0 == -1 ? str3 : str.substring(iM93443j0 + str2.length(), str.length());
    }

    /* JADX INFO: renamed from: Q */
    public static final boolean m93414Q(@NotNull CharSequence charSequence, char c, boolean z) {
        charSequence.getClass();
        return charSequence.length() > 0 && C15383a.m93462d(charSequence.charAt(m93426W(charSequence)), c, z);
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ String m93415Q0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m93411O0(str, c, str2);
    }

    /* JADX INFO: renamed from: R */
    public static final boolean m93416R(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        return (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) ? C15386d.m93489w((String) charSequence, (String) charSequence2, false, 2, null) : m93455v0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ String m93417R0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m93413P0(str, str2, str3);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ boolean m93418S(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m93414Q(charSequence, c, z);
    }

    @NotNull
    /* JADX INFO: renamed from: S0 */
    public static final String m93419S0(@NotNull String str, char c, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        int iM93435b0 = m93435b0(str, c, 0, false, 6, null);
        return iM93435b0 == -1 ? str2 : str.substring(0, iM93435b0);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ boolean m93420T(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m93416R(charSequence, charSequence2, z);
    }

    @NotNull
    /* JADX INFO: renamed from: T0 */
    public static final String m93421T0(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int iM93436c0 = m93436c0(str, str2, 0, false, 6, null);
        return iM93436c0 == -1 ? str3 : str.substring(0, iM93436c0);
    }

    /* JADX INFO: renamed from: U */
    public static final Pair<Integer, String> m93422U(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        CharSequence charSequence2;
        Object next;
        boolean z3;
        Object next2;
        if (!z && collection.size() == 1) {
            String str = (String) CollectionsKt.single(collection);
            int iM93436c0 = !z2 ? m93436c0(charSequence, str, i, false, 4, null) : m93443j0(charSequence, str, i, false, 4, null);
            if (iM93436c0 < 0) {
                return null;
            }
            return TuplesKt.m87240a(Integer.valueOf(iM93436c0), str);
        }
        CharSequence charSequence3 = charSequence;
        IntProgression intRange = !z2 ? new IntRange(C15167a.m87596b(i, 0), charSequence3.length()) : C15167a.m87603i(C15167a.m87599e(i, m93426W(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int iM87578a = intRange.getFirst();
            int iM87579c = intRange.getLast();
            int iM87580f = intRange.getStep();
            if ((iM87580f > 0 && iM87578a <= iM87579c) || (iM87580f < 0 && iM87579c <= iM87578a)) {
                int i2 = iM87578a;
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z3 = z;
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        z3 = z;
                        if (C15386d.m93492z(str2, 0, (String) charSequence3, i2, str2.length(), z3)) {
                            break;
                        }
                        z = z3;
                    }
                    String str3 = (String) next2;
                    if (str3 != null) {
                        return TuplesKt.m87240a(Integer.valueOf(i2), str3);
                    }
                    if (i2 != iM87579c) {
                        i2 += iM87580f;
                        z = z3;
                    }
                }
            }
        } else {
            boolean z4 = z;
            int iM87578a2 = intRange.getFirst();
            int iM87579c2 = intRange.getLast();
            int iM87580f2 = intRange.getStep();
            if ((iM87580f2 > 0 && iM87578a2 <= iM87579c2) || (iM87580f2 < 0 && iM87579c2 <= iM87578a2)) {
                int i3 = iM87578a2;
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            charSequence2 = charSequence3;
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        boolean z5 = z4;
                        charSequence2 = charSequence3;
                        z4 = z5;
                        if (m93455v0(str4, 0, charSequence2, i3, str4.length(), z5)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) next;
                    if (str5 != null) {
                        return TuplesKt.m87240a(Integer.valueOf(i3), str5);
                    }
                    if (i3 != iM87579c2) {
                        i3 += iM87580f2;
                        charSequence3 = charSequence2;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ String m93423U0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m93419S0(str, c, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public static IntRange m93424V(@NotNull CharSequence charSequence) {
        charSequence.getClass();
        return new IntRange(0, charSequence.length() - 1);
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ String m93425V0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m93421T0(str, str2, str3);
    }

    /* JADX INFO: renamed from: W */
    public static int m93426W(@NotNull CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    @NotNull
    /* JADX INFO: renamed from: W0 */
    public static String m93427W0(@NotNull String str, char c, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        int iM93442i0 = m93442i0(str, c, 0, false, 6, null);
        return iM93442i0 == -1 ? str2 : str.substring(0, iM93442i0);
    }

    /* JADX INFO: renamed from: X */
    public static final int m93428X(@NotNull CharSequence charSequence, char c, int i, boolean z) {
        charSequence.getClass();
        return (z || !(charSequence instanceof String)) ? m93437d0(charSequence, new char[]{c}, i, z) : ((String) charSequence).indexOf(c, i);
    }

    @NotNull
    /* JADX INFO: renamed from: X0 */
    public static String m93429X0(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int iM93443j0 = m93443j0(str, str2, 0, false, 6, null);
        return iM93443j0 == -1 ? str3 : str.substring(0, iM93443j0);
    }

    /* JADX INFO: renamed from: Y */
    public static final int m93430Y(@NotNull CharSequence charSequence, @NotNull String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? m93434a0(charSequence, str, i, charSequence.length(), z, false, 16, null) : ((String) charSequence).indexOf(str, i);
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ String m93431Y0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m93429X0(str, str2, str3);
    }

    /* JADX INFO: renamed from: Z */
    public static final int m93432Z(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        IntProgression intRange = !z2 ? new IntRange(C15167a.m87596b(i, 0), C15167a.m87599e(i2, charSequence.length())) : C15167a.m87603i(C15167a.m87599e(i, m93426W(charSequence)), C15167a.m87596b(i2, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iM87578a = intRange.getFirst();
            int iM87579c = intRange.getLast();
            int iM87580f = intRange.getStep();
            if ((iM87580f <= 0 || iM87578a > iM87579c) && (iM87580f >= 0 || iM87579c > iM87578a)) {
                return -1;
            }
            int i3 = iM87578a;
            while (true) {
                String str = (String) charSequence2;
                boolean z3 = z;
                if (C15386d.m93492z(str, 0, (String) charSequence, i3, str.length(), z3)) {
                    return i3;
                }
                if (i3 == iM87579c) {
                    return -1;
                }
                i3 += iM87580f;
                z = z3;
            }
        } else {
            boolean z4 = z;
            int iM87578a2 = intRange.getFirst();
            int iM87579c2 = intRange.getLast();
            int iM87580f2 = intRange.getStep();
            if ((iM87580f2 <= 0 || iM87578a2 > iM87579c2) && (iM87580f2 >= 0 || iM87579c2 > iM87578a2)) {
                return -1;
            }
            int i4 = iM87578a2;
            while (true) {
                boolean z5 = z4;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z4 = z5;
                if (m93455v0(charSequence4, 0, charSequence3, i4, charSequence2.length(), z5)) {
                    return i4;
                }
                if (i4 == iM87579c2) {
                    return -1;
                }
                i4 += iM87580f2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: Z0 */
    public static CharSequence m93433Z0(@NotNull CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zM93332b = CharsKt__CharJVMKt.m93332b(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zM93332b) {
                    break;
                }
                length--;
            } else if (zM93332b) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ int m93434a0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return m93432Z(charSequence, charSequence2, i, i2, z, z2);
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ int m93435b0(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m93428X(charSequence, c, i, z);
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ int m93436c0(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m93430Y(charSequence, str, i, z);
    }

    /* JADX INFO: renamed from: d0 */
    public static final int m93437d0(@NotNull CharSequence charSequence, @NotNull char[] cArr, int i, boolean z) {
        charSequence.getClass();
        cArr.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ArraysKt.single(cArr), i);
        }
        int iM87596b = C15167a.m87596b(i, 0);
        int iM93426W = m93426W(charSequence);
        if (iM87596b > iM93426W) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iM87596b);
            for (char c : cArr) {
                if (C15383a.m93462d(c, cCharAt, z)) {
                    return iM87596b;
                }
            }
            if (iM87596b == iM93426W) {
                return -1;
            }
            iM87596b++;
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m93438e0(@NotNull CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!CharsKt__CharJVMKt.m93332b(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public static final CharIterator m93439f0(@NotNull final CharSequence charSequence) {
        charSequence.getClass();
        return new CharIterator() { // from class: kotlin.text.StringsKt__StringsKt$iterator$1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            public int index;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < charSequence.length();
            }

            @Override // kotlin.collections.CharIterator
            public char nextChar() {
                CharSequence charSequence2 = charSequence;
                int i = this.index;
                this.index = i + 1;
                return charSequence2.charAt(i);
            }
        };
    }

    /* JADX INFO: renamed from: g0 */
    public static final int m93440g0(@NotNull CharSequence charSequence, char c, int i, boolean z) {
        charSequence.getClass();
        return (z || !(charSequence instanceof String)) ? m93444k0(charSequence, new char[]{c}, i, z) : ((String) charSequence).lastIndexOf(c, i);
    }

    /* JADX INFO: renamed from: h0 */
    public static final int m93441h0(@NotNull CharSequence charSequence, @NotNull String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? m93432Z(charSequence, str, i, 0, z, true) : ((String) charSequence).lastIndexOf(str, i);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ int m93442i0(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m93426W(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m93440g0(charSequence, c, i, z);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ int m93443j0(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m93426W(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m93441h0(charSequence, str, i, z);
    }

    /* JADX INFO: renamed from: k0 */
    public static final int m93444k0(@NotNull CharSequence charSequence, @NotNull char[] cArr, int i, boolean z) {
        charSequence.getClass();
        cArr.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(ArraysKt.single(cArr), i);
        }
        for (int iM87599e = C15167a.m87599e(i, m93426W(charSequence)); -1 < iM87599e; iM87599e--) {
            char cCharAt = charSequence.charAt(iM87599e);
            for (char c : cArr) {
                if (C15383a.m93462d(c, cCharAt, z)) {
                    return iM87599e;
                }
            }
        }
        return -1;
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public static final Sequence<String> m93445l0(@NotNull final CharSequence charSequence) {
        charSequence.getClass();
        return new Sequence<String>() { // from class: kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<String> iterator() {
                return new mmr(charSequence);
            }
        };
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public static final List<String> m93446m0(@NotNull CharSequence charSequence) {
        charSequence.getClass();
        return SequencesKt___SequencesKt.m93302V(m93445l0(charSequence));
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public static final CharSequence m93447n0(@NotNull CharSequence charSequence, int i, char c) {
        charSequence.getClass();
        if (i < 0) {
            ctq0.m108694a("Desired length ", i, " is less than zero.");
            return null;
        }
        if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i);
        int length = i - charSequence.length();
        int i2 = 1;
        if (1 <= length) {
            while (true) {
                sb.append(c);
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        sb.append(charSequence);
        return sb;
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public static String m93448o0(@NotNull String str, int i, char c) {
        str.getClass();
        return m93447n0(str, i, c).toString();
    }

    /* JADX INFO: renamed from: p0 */
    public static final Sequence<IntRange> m93449p0(CharSequence charSequence, final char[] cArr, int i, final boolean z, int i2) {
        m93392A0(i2);
        return new DelimitedRangesSequence(charSequence, i, i2, new Function2() { // from class: kotlin.text.f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return StringsKt__StringsKt.m93453t0(cArr, z, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public static final Sequence<IntRange> m93450q0(CharSequence charSequence, String[] strArr, int i, final boolean z, int i2) {
        m93392A0(i2);
        final List listAsList = ArraysKt.asList(strArr);
        return new DelimitedRangesSequence(charSequence, i, i2, new Function2() { // from class: kotlin.text.e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return StringsKt__StringsKt.m93454u0(listAsList, z, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ Sequence m93451r0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m93449p0(charSequence, cArr, i, z, i2);
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ Sequence m93452s0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m93450q0(charSequence, strArr, i, z, i2);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m93394C0(charSequence, strArr, z, i);
    }

    /* JADX INFO: renamed from: t0 */
    public static final Pair m93453t0(char[] cArr, boolean z, CharSequence charSequence, int i) {
        charSequence.getClass();
        int iM93437d0 = m93437d0(charSequence, cArr, i, z);
        if (iM93437d0 < 0) {
            return null;
        }
        return TuplesKt.m87240a(Integer.valueOf(iM93437d0), 1);
    }

    /* JADX INFO: renamed from: u0 */
    public static final Pair m93454u0(List list, boolean z, CharSequence charSequence, int i) {
        charSequence.getClass();
        Pair<Integer, String> pairM93422U = m93422U(charSequence, list, i, z, false);
        if (pairM93422U != null) {
            return TuplesKt.m87240a(pairM93422U.getFirst(), Integer.valueOf(pairM93422U.getSecond().length()));
        }
        return null;
    }

    /* JADX INFO: renamed from: v0 */
    public static final boolean m93455v0(@NotNull CharSequence charSequence, int i, @NotNull CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C15383a.m93462d(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: w0 */
    public static String m93456w0(@NotNull String str, @NotNull CharSequence charSequence) {
        str.getClass();
        charSequence.getClass();
        return m93400I0(str, charSequence, false, 2, null) ? str.substring(charSequence.length()) : str;
    }

    @NotNull
    /* JADX INFO: renamed from: x0 */
    public static CharSequence m93457x0(@NotNull CharSequence charSequence, int i, int i2) {
        charSequence.getClass();
        if (i2 < i) {
            s0g0.m181862a("End index (", i2, ") is less than start index (", i);
            return null;
        }
        if (i2 == i) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(charSequence.length() - (i2 - i));
        sb.append(charSequence, 0, i);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    @NotNull
    /* JADX INFO: renamed from: y0 */
    public static String m93458y0(@NotNull String str, @NotNull CharSequence charSequence) {
        str.getClass();
        charSequence.getClass();
        return m93420T(str, charSequence, false, 2, null) ? str.substring(0, str.length() - charSequence.length()) : str;
    }

    @NotNull
    /* JADX INFO: renamed from: z0 */
    public static final CharSequence m93459z0(@NotNull CharSequence charSequence, int i, int i2, @NotNull CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < i) {
            s0g0.m181862a("End index (", i2, ") is less than start index (", i);
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }
}
