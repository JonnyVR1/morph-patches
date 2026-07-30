package p153l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.validation.DropReason;
import com.clevertap.android.sdk.validation.ValidationError;
import com.clevertap.android.sdk.validation.pipeline.ModificationReason;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JE\u0010\u0011\u001a\u00020\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\b2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\b2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m88121d2 = {"Ll/i5f;", "", "Ll/e5f;", "<init>", "()V", "", "Lcom/clevertap/android/sdk/validation/pipeline/ModificationReason;", "modifications", "", "originalName", "cleanedName", "", "maxEventNameLength", "", "Ll/s0l0;", "errors", "", Constants.INAPP_DATA_TAG, "(Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "restrictedEventNames", "", "b", "(Ljava/lang/String;Ljava/util/Set;)Z", "discardedEventNames", "a", "input", "Ll/i0l0;", Constants.KEY_CONFIG, "Ll/j0l0;", "c", "(Ll/e5f;Ll/i0l0;)Ll/j0l0;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class i5f {

    /* JADX INFO: renamed from: l.i5f$a */
    @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    public /* synthetic */ class C17654a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f113067a;

        static {
            int[] iArr = new int[ModificationReason.values().length];
            try {
                iArr[ModificationReason.TRUNCATED_TO_MAX_LENGTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ModificationReason.INVALID_CHARACTERS_REMOVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f113067a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    private final boolean m138698a(String cleanedName, Set<String> discardedEventNames) {
        if (discardedEventNames == null) {
            return false;
        }
        Set<String> set = discardedEventNames;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            if (Utils.m5958a(cleanedName, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private final boolean m138699b(String cleanedName, Set<String> restrictedEventNames) {
        if (restrictedEventNames == null) {
            return false;
        }
        Set<String> set = restrictedEventNames;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            if (Utils.m5958a(cleanedName, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    private final void m138700d(Set<? extends ModificationReason> modifications, String originalName, String cleanedName, Integer maxEventNameLength, List<s0l0> errors) {
        String string;
        Iterator<T> it = modifications.iterator();
        while (it.hasNext()) {
            int i = C17654a.f113067a[((ModificationReason) it.next()).ordinal()];
            if (i == 1) {
                ValidationError validationError = ValidationError.EVENT_NAME_TOO_LONG;
                if (maxEventNameLength == null || (string = maxEventNameLength.toString()) == null) {
                    string = "unknown";
                }
                errors.add(t0l0.m188803a(validationError, originalName, string, cleanedName));
            } else {
                if (i != 2) {
                    nbr.m162172a();
                    return;
                }
                errors.add(t0l0.m188803a(ValidationError.EVENT_NAME_INVALID_CHARACTERS, originalName, cleanedName));
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public j0l0 m138701c(@NotNull e5f input, @NotNull i0l0 config) {
        input.getClass();
        config.getClass();
        ArrayList arrayList = new ArrayList();
        if (input.getOriginalName() == null) {
            arrayList.add(t0l0.m188803a(ValidationError.EVENT_NAME_NULL, new String[0]));
            return new j0l0.C17839a(arrayList, DropReason.NULL_EVENT_NAME);
        }
        m138700d(input.m119531b(), input.getOriginalName(), input.getCleanedName(), config.getMaxEventNameLength(), arrayList);
        if (input.getCleanedName().length() == 0) {
            arrayList.add(t0l0.m188803a(ValidationError.EVENT_NAME_NULL, new String[0]));
            return new j0l0.C17839a(arrayList, DropReason.NULL_EVENT_NAME);
        }
        if (m138699b(input.getCleanedName(), config.m137993p())) {
            arrayList.add(t0l0.m188803a(ValidationError.RESTRICTED_EVENT_NAME, input.getCleanedName()));
            return new j0l0.C17839a(arrayList, DropReason.RESTRICTED_EVENT_NAME);
        }
        if (!m138698a(input.getCleanedName(), config.m137981d())) {
            return arrayList.isEmpty() ? new j0l0.C17840b(null, 1, null) : new j0l0.C17841c(arrayList);
        }
        arrayList.add(t0l0.m188803a(ValidationError.DISCARDED_EVENT_NAME, input.getCleanedName()));
        return new j0l0.C17839a(arrayList, DropReason.DISCARDED_EVENT_NAME);
    }
}
