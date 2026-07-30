package kotlin.time;

import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.PlaybackException;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\t\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007\"\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007\"\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007¨\u0006\u000e"}, m88121d2 = {"Lkotlin/time/Instant;", "instant", "", "b", "(Lkotlin/time/Instant;)Ljava/lang/String;", "", "a", "[I", "POWERS_OF_TEN", "asciiDigitPositionsInIsoStringAfterYear", "c", "colonsInIsoOffsetString", Constants.INAPP_DATA_TAG, "asciiDigitsInIsoOffsetString", "kotlin-stdlib"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class InstantKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final int[] f67335a = {1, 10, 100, 1000, 10000, LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY, PlaybackException.CUSTOM_ERROR_CODE_BASE, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final int[] f67336b = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final int[] f67337c = {3, 6};

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final int[] f67338d = {1, 2, 4, 5, 7, 8};

    @ExperimentalTime
    /* JADX INFO: renamed from: b */
    public static final String m94463b(Instant instant) throws IOException {
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        UnboundLocalDateTime unboundLocalDateTimeM94483a = UnboundLocalDateTime.INSTANCE.m94483a(instant);
        int iM94482g = unboundLocalDateTimeM94483a.getCom.p1.mobile.putong.core.data.MerchandiseTimeUnit.year java.lang.String();
        int i = 0;
        if (Math.abs(iM94482g) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (iM94482g >= 0) {
                sb2.append(iM94482g + 10000);
                sb2.deleteCharAt(0).getClass();
            } else {
                sb2.append(iM94482g - 10000);
                sb2.deleteCharAt(1).getClass();
            }
            sb.append((CharSequence) sb2);
        } else {
            if (iM94482g >= 10000) {
                sb.append('+');
            }
            sb.append(iM94482g);
        }
        sb.append('-');
        m94464c(sb, sb, unboundLocalDateTimeM94483a.getCom.p1.mobile.putong.core.data.MerchandiseTimeUnit.month java.lang.String());
        sb.append('-');
        m94464c(sb, sb, unboundLocalDateTimeM94483a.getDay());
        sb.append('T');
        m94464c(sb, sb, unboundLocalDateTimeM94483a.getHour());
        sb.append(':');
        m94464c(sb, sb, unboundLocalDateTimeM94483a.getMinute());
        sb.append(':');
        m94464c(sb, sb, unboundLocalDateTimeM94483a.getCom.p1.mobile.putong.core.data.MerchandiseTimeUnit.second java.lang.String());
        if (unboundLocalDateTimeM94483a.getNanosecond() != 0) {
            sb.append('.');
            while (true) {
                int iM94480e = unboundLocalDateTimeM94483a.getNanosecond();
                iArr = f67335a;
                int i2 = i + 1;
                if (iM94480e % iArr[i2] != 0) {
                    break;
                }
                i = i2;
            }
            int i3 = i - (i % 3);
            String strValueOf = String.valueOf((unboundLocalDateTimeM94483a.getNanosecond() / iArr[i3]) + iArr[9 - i3]);
            strValueOf.getClass();
            sb.append(strValueOf.substring(1));
        }
        sb.append(Matrix.MATRIX_TYPE_ZERO);
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static final void m94464c(Appendable appendable, StringBuilder sb, int i) throws IOException {
        if (i < 10) {
            appendable.append('0');
        }
        sb.append(i);
    }
}
