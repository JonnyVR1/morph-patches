package p149l;

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
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JW\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0015J%\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m87232d2 = {"Ll/b3f;", "", "Ll/x2f;", "<init>", "()V", "Ll/w2f;", "metrics", "", "maxDepth", "maxArrayKeyCount", "maxObjectKeyCount", "maxArrayLength", "maxKVPairCount", "", "Ll/mrk0;", "errors", "", "c", "(Ll/w2f;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "maxKeyLength", "b", "(Ll/w2f;Ljava/lang/Integer;Ljava/util/List;)V", "maxValueLength", Constants.INAPP_DATA_TAG, "a", "(Ll/w2f;Ljava/util/List;)V", "input", "Ll/crk0;", Constants.KEY_CONFIG, "Ll/drk0;", "e", "(Ll/x2f;Ll/crk0;)Ll/drk0;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class b3f {

    /* JADX INFO: renamed from: l.b3f$a */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public /* synthetic */ class C15787a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f73207a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f73208b;

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
            f73207a = iArr;
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
            f73208b = iArr2;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m100057a(w2f metrics, List<mrk0> errors) {
        mrk0 mrk0VarM160744a;
        String strMo87471s;
        for (yqc0 yqc0Var : metrics.m201104a()) {
            switch (C15787a.f73208b[yqc0Var.getCom.p1.mobile.putong.core.data.Reason.TYPE java.lang.String().ordinal()]) {
                case 1:
                    mrk0VarM160744a = nrk0.m160744a(ValidationError.NULL_VALUE_REMOVED, yqc0Var.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String());
                    break;
                case 2:
                    mrk0VarM160744a = nrk0.m160744a(ValidationError.EMPTY_VALUE_REMOVED, yqc0Var.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String());
                    break;
                case 3:
                    mrk0VarM160744a = nrk0.m160744a(ValidationError.EMPTY_KEY, yqc0Var.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String());
                    break;
                case 4:
                    ValidationError validationError = ValidationError.PROP_VALUE_NOT_PRIMITIVE;
                    String str = yqc0Var.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String();
                    Object originalValue = yqc0Var.getOriginalValue();
                    if (originalValue == null || (strMo87471s = Reflection.m87507b(originalValue.getClass()).mo87471s()) == null) {
                        strMo87471s = "null";
                    }
                    mrk0VarM160744a = nrk0.m160744a(validationError, str, strMo87471s);
                    break;
                case 5:
                    mrk0VarM160744a = nrk0.m160744a(ValidationError.INVALID_PHONE, new String[0]);
                    break;
                case 6:
                    mrk0VarM160744a = nrk0.m160744a(ValidationError.INVALID_COUNTRY_CODE, String.valueOf(yqc0Var.getOriginalValue()));
                    break;
                case 7:
                    mrk0VarM160744a = nrk0.m160744a(ValidationError.RESTRICTED_MULTI_VALUE_KEY, yqc0Var.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String());
                    break;
                default:
                    l9r.m149037a();
                    return;
            }
            errors.add(mrk0VarM160744a);
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m100058b(w2f metrics, Integer maxKeyLength, List<mrk0> errors) {
        mrk0 mrk0VarM160744a;
        for (mxq mxqVar : metrics.m201105b()) {
            Iterator<T> it = mxqVar.m156919c().iterator();
            while (it.hasNext()) {
                int i = C15787a.f73207a[((ModificationReason) it.next()).ordinal()];
                if (i == 1) {
                    mrk0VarM160744a = nrk0.m160744a(ValidationError.KEY_INVALID_CHARACTERS, mxqVar.getOriginalKey(), mxqVar.getCleanedKey());
                } else if (i != 2) {
                    l9r.m149037a();
                    return;
                } else if (maxKeyLength != null) {
                    mrk0VarM160744a = nrk0.m160744a(ValidationError.KEY_LENGTH_EXCEEDED, mxqVar.getOriginalKey(), String.valueOf(maxKeyLength.intValue()), mxqVar.getCleanedKey());
                    if (mrk0VarM160744a == null) {
                    }
                }
                errors.add(mrk0VarM160744a);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m100059c(w2f metrics, Integer maxDepth, Integer maxArrayKeyCount, Integer maxObjectKeyCount, Integer maxArrayLength, Integer maxKVPairCount, List<mrk0> errors) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        if (maxDepth != null && metrics.getMaxDepth() > (iIntValue5 = maxDepth.intValue())) {
            errors.add(nrk0.m160744a(ValidationError.DEPTH_LIMIT_EXCEEDED, String.valueOf(metrics.getMaxDepth()), String.valueOf(iIntValue5)));
        }
        if (maxArrayKeyCount != null && metrics.getMaxArrayKeyCount() > (iIntValue4 = maxArrayKeyCount.intValue())) {
            errors.add(nrk0.m160744a(ValidationError.ARRAY_KEY_COUNT_LIMIT_EXCEEDED, String.valueOf(metrics.getMaxArrayKeyCount()), String.valueOf(iIntValue4)));
        }
        if (maxObjectKeyCount != null && metrics.getMaxObjectKeyCount() > (iIntValue3 = maxObjectKeyCount.intValue())) {
            errors.add(nrk0.m160744a(ValidationError.OBJECT_KEY_COUNT_LIMIT_EXCEEDED, String.valueOf(metrics.getMaxObjectKeyCount()), String.valueOf(iIntValue3)));
        }
        if (maxArrayLength != null && metrics.getMaxArrayLength() > (iIntValue2 = maxArrayLength.intValue())) {
            errors.add(nrk0.m160744a(ValidationError.ARRAY_LENGTH_LIMIT_EXCEEDED, String.valueOf(metrics.getMaxArrayLength()), String.valueOf(iIntValue2)));
        }
        if (maxKVPairCount == null || metrics.getMaxKVPairCount() <= (iIntValue = maxKVPairCount.intValue())) {
            return;
        }
        errors.add(nrk0.m160744a(ValidationError.KV_PAIR_COUNT_LIMIT_EXCEEDED, String.valueOf(metrics.getMaxKVPairCount()), String.valueOf(iIntValue)));
    }

    /* JADX INFO: renamed from: d */
    private final void m100060d(w2f metrics, Integer maxValueLength, List<mrk0> errors) {
        mrk0 mrk0VarM160744a;
        for (srk0 srk0Var : metrics.m201111h()) {
            Iterator<T> it = srk0Var.m185697d().iterator();
            while (it.hasNext()) {
                int i = C15787a.f73207a[((ModificationReason) it.next()).ordinal()];
                if (i == 1) {
                    mrk0VarM160744a = nrk0.m160744a(ValidationError.VALUE_INVALID_CHARACTERS, srk0Var.getOriginalValue(), srk0Var.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String(), srk0Var.getCleanedValue());
                } else if (i != 2) {
                    l9r.m149037a();
                    return;
                } else if (maxValueLength != null) {
                    mrk0VarM160744a = nrk0.m160744a(ValidationError.VALUE_CHARS_LIMIT_EXCEEDED, srk0Var.getOriginalValue(), srk0Var.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String(), String.valueOf(maxValueLength.intValue()), srk0Var.getCleanedValue());
                    if (mrk0VarM160744a == null) {
                    }
                }
                errors.add(mrk0VarM160744a);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public drk0 m100061e(@NotNull x2f input, @NotNull crk0 config) {
        input.getClass();
        config.getClass();
        ArrayList arrayList = new ArrayList();
        m100059c(input.getMetrics(), config.getMaxDepth(), config.getMaxArrayKeyCount(), config.getMaxObjectKeyCount(), config.getMaxArrayLength(), config.getMaxKVPairCount(), arrayList);
        m100058b(input.getMetrics(), config.getMaxKeyLength(), arrayList);
        m100060d(input.getMetrics(), config.getMaxValueLength(), arrayList);
        m100057a(input.getMetrics(), arrayList);
        return arrayList.isEmpty() ? new drk0.C16457b(null, 1, null) : new drk0.C16458c(arrayList);
    }
}
