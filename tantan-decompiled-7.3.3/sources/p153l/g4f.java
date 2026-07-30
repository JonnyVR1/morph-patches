package p153l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.validation.ValidationError;
import com.clevertap.android.sdk.validation.pipeline.ModificationReason;
import com.clevertap.android.sdk.validation.pipeline.RemovalReason;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JW\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0015J%\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m88121d2 = {"Ll/g4f;", "", "Ll/c4f;", "<init>", "()V", "Ll/b4f;", "metrics", "", "maxDepth", "maxArrayKeyCount", "maxObjectKeyCount", "maxArrayLength", "maxKVPairCount", "", "Ll/s0l0;", "errors", "", "c", "(Ll/b4f;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "maxKeyLength", "b", "(Ll/b4f;Ljava/lang/Integer;Ljava/util/List;)V", "maxValueLength", Constants.INAPP_DATA_TAG, "a", "(Ll/b4f;Ljava/util/List;)V", "input", "Ll/i0l0;", Constants.KEY_CONFIG, "Ll/j0l0;", "e", "(Ll/c4f;Ll/i0l0;)Ll/j0l0;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class g4f {

    /* JADX INFO: renamed from: l.g4f$a */
    @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    public /* synthetic */ class C17149a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f102169a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f102170b;

        static {
            int[] iArr = new int[ModificationReason.values().length];
            try {
                iArr[ModificationReason.INVALID_CHARACTERS_REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ModificationReason.TRUNCATED_TO_MAX_LENGTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f102169a = iArr;
            int[] iArr2 = new int[RemovalReason.values().length];
            try {
                iArr2[RemovalReason.NULL_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[RemovalReason.EMPTY_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RemovalReason.EMPTY_KEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[RemovalReason.NON_PRIMITIVE_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[RemovalReason.INVALID_PHONE_NUMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[RemovalReason.INVALID_COUNTRY_CODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[RemovalReason.RESTRICTED_KEY_NESTED_VALUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            f102170b = iArr2;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m128870a(b4f metrics, List<s0l0> errors) {
        s0l0 s0l0VarM188803a;
        String strMo88360s;
        for (dzc0 dzc0Var : metrics.m102447a()) {
            switch (C17149a.f102170b[dzc0Var.getCom.p1.mobile.putong.core.data.Reason.TYPE java.lang.String().ordinal()]) {
                case 1:
                    s0l0VarM188803a = t0l0.m188803a(ValidationError.NULL_VALUE_REMOVED, dzc0Var.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String());
                    break;
                case 2:
                    s0l0VarM188803a = t0l0.m188803a(ValidationError.EMPTY_VALUE_REMOVED, dzc0Var.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String());
                    break;
                case 3:
                    s0l0VarM188803a = t0l0.m188803a(ValidationError.EMPTY_KEY, dzc0Var.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String());
                    break;
                case 4:
                    ValidationError validationError = ValidationError.PROP_VALUE_NOT_PRIMITIVE;
                    String str = dzc0Var.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String();
                    Object originalValue = dzc0Var.getOriginalValue();
                    if (originalValue == null || (strMo88360s = Reflection.m88396b(originalValue.getClass()).mo88360s()) == null) {
                        strMo88360s = "null";
                    }
                    s0l0VarM188803a = t0l0.m188803a(validationError, str, strMo88360s);
                    break;
                case 5:
                    s0l0VarM188803a = t0l0.m188803a(ValidationError.INVALID_PHONE, new String[0]);
                    break;
                case 6:
                    s0l0VarM188803a = t0l0.m188803a(ValidationError.INVALID_COUNTRY_CODE, String.valueOf(dzc0Var.getOriginalValue()));
                    break;
                case 7:
                    s0l0VarM188803a = t0l0.m188803a(ValidationError.RESTRICTED_MULTI_VALUE_KEY, dzc0Var.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String());
                    break;
                default:
                    nbr.m162172a();
                    return;
            }
            errors.add(s0l0VarM188803a);
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m128871b(b4f metrics, Integer maxKeyLength, List<s0l0> errors) {
        s0l0 s0l0VarM188803a;
        for (mzq mzqVar : metrics.m102448b()) {
            Iterator<T> it = mzqVar.m160919c().iterator();
            while (it.hasNext()) {
                int i = C17149a.f102169a[((ModificationReason) it.next()).ordinal()];
                if (i == 1) {
                    s0l0VarM188803a = t0l0.m188803a(ValidationError.KEY_INVALID_CHARACTERS, mzqVar.getOriginalKey(), mzqVar.getCleanedKey());
                } else if (i != 2) {
                    nbr.m162172a();
                    return;
                } else if (maxKeyLength != null) {
                    s0l0VarM188803a = t0l0.m188803a(ValidationError.KEY_LENGTH_EXCEEDED, mzqVar.getOriginalKey(), String.valueOf(maxKeyLength.intValue()), mzqVar.getCleanedKey());
                    if (s0l0VarM188803a == null) {
                    }
                }
                errors.add(s0l0VarM188803a);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m128872c(b4f metrics, Integer maxDepth, Integer maxArrayKeyCount, Integer maxObjectKeyCount, Integer maxArrayLength, Integer maxKVPairCount, List<s0l0> errors) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        if (maxDepth != null && metrics.getMaxDepth() > (iIntValue5 = maxDepth.intValue())) {
            errors.add(t0l0.m188803a(ValidationError.DEPTH_LIMIT_EXCEEDED, String.valueOf(metrics.getMaxDepth()), String.valueOf(iIntValue5)));
        }
        if (maxArrayKeyCount != null && metrics.getMaxArrayKeyCount() > (iIntValue4 = maxArrayKeyCount.intValue())) {
            errors.add(t0l0.m188803a(ValidationError.ARRAY_KEY_COUNT_LIMIT_EXCEEDED, String.valueOf(metrics.getMaxArrayKeyCount()), String.valueOf(iIntValue4)));
        }
        if (maxObjectKeyCount != null && metrics.getMaxObjectKeyCount() > (iIntValue3 = maxObjectKeyCount.intValue())) {
            errors.add(t0l0.m188803a(ValidationError.OBJECT_KEY_COUNT_LIMIT_EXCEEDED, String.valueOf(metrics.getMaxObjectKeyCount()), String.valueOf(iIntValue3)));
        }
        if (maxArrayLength != null && metrics.getMaxArrayLength() > (iIntValue2 = maxArrayLength.intValue())) {
            errors.add(t0l0.m188803a(ValidationError.ARRAY_LENGTH_LIMIT_EXCEEDED, String.valueOf(metrics.getMaxArrayLength()), String.valueOf(iIntValue2)));
        }
        if (maxKVPairCount == null || metrics.getMaxKVPairCount() <= (iIntValue = maxKVPairCount.intValue())) {
            return;
        }
        errors.add(t0l0.m188803a(ValidationError.KV_PAIR_COUNT_LIMIT_EXCEEDED, String.valueOf(metrics.getMaxKVPairCount()), String.valueOf(iIntValue)));
    }

    /* JADX INFO: renamed from: d */
    private final void m128873d(b4f metrics, Integer maxValueLength, List<s0l0> errors) {
        s0l0 s0l0VarM188803a;
        for (y0l0 y0l0Var : metrics.m102454h()) {
            Iterator<T> it = y0l0Var.m213883d().iterator();
            while (it.hasNext()) {
                int i = C17149a.f102169a[((ModificationReason) it.next()).ordinal()];
                if (i == 1) {
                    s0l0VarM188803a = t0l0.m188803a(ValidationError.VALUE_INVALID_CHARACTERS, y0l0Var.getOriginalValue(), y0l0Var.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String(), y0l0Var.getCleanedValue());
                } else if (i != 2) {
                    nbr.m162172a();
                    return;
                } else if (maxValueLength != null) {
                    s0l0VarM188803a = t0l0.m188803a(ValidationError.VALUE_CHARS_LIMIT_EXCEEDED, y0l0Var.getOriginalValue(), y0l0Var.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String(), String.valueOf(maxValueLength.intValue()), y0l0Var.getCleanedValue());
                    if (s0l0VarM188803a == null) {
                    }
                }
                errors.add(s0l0VarM188803a);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public j0l0 m128874e(@NotNull c4f input, @NotNull i0l0 config) {
        input.getClass();
        config.getClass();
        ArrayList arrayList = new ArrayList();
        m128872c(input.getMetrics(), config.getMaxDepth(), config.getMaxArrayKeyCount(), config.getMaxObjectKeyCount(), config.getMaxArrayLength(), config.getMaxKVPairCount(), arrayList);
        m128871b(input.getMetrics(), config.getMaxKeyLength(), arrayList);
        m128873d(input.getMetrics(), config.getMaxValueLength(), arrayList);
        m128870a(input.getMetrics(), arrayList);
        return arrayList.isEmpty() ? new j0l0.C17840b(null, 1, null) : new j0l0.C17841c(arrayList);
    }
}
