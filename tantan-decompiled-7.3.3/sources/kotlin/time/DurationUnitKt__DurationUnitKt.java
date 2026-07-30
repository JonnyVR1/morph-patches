package kotlin.time;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
import p153l.mpq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m88121d2 = {"Lkotlin/time/DurationUnit;", "", "c", "(Lkotlin/time/DurationUnit;)Ljava/lang/String;", "kotlin-stdlib"}, m88122k = 5, m88123mv = {2, 2, 0}, m88125xi = 49, m88126xs = "kotlin/time/DurationUnitKt")
public class DurationUnitKt__DurationUnitKt extends DurationUnitKt__DurationUnitJvmKt {

    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f67333a;

        static {
            int[] iArr = new int[DurationUnit.values().length];
            try {
                iArr[DurationUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DurationUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DurationUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DurationUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DurationUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DurationUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DurationUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f67333a = iArr;
        }
    }

    @SinceKotlin
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m94456c(@NotNull DurationUnit durationUnit) {
        durationUnit.getClass();
        switch (WhenMappings.f67333a[durationUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "us";
            case 3:
                return "ms";
            case 4:
                return BLiveStormDanmakuGiftResourceType.f45294s;
            case 5:
                return "m";
            case 6:
                return "h";
            case 7:
                return Constants.INAPP_DATA_TAG;
            default:
                mpq.m159379a("Unknown unit: ", durationUnit);
                return null;
        }
    }
}
