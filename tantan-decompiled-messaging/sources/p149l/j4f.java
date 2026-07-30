package p149l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.validation.DropReason;
import com.clevertap.android.sdk.validation.ValidationError;
import com.clevertap.android.sdk.validation.pipeline.ModificationReason;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Ll/j4f;", "", "Ll/uya0;", "<init>", "()V", "input", "Ll/crk0;", Constants.KEY_CONFIG, "Ll/drk0;", "a", "(Ll/uya0;Ll/crk0;)Ll/drk0;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class j4f {

    /* JADX INFO: renamed from: l.j4f$a */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public /* synthetic */ class C17687a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f116186a;

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
            f116186a = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public drk0 m139681a(@NotNull uya0 input, @NotNull crk0 config) {
        mrk0 mrk0VarM160744a;
        input.getClass();
        config.getClass();
        ArrayList arrayList = new ArrayList();
        if (input.getWasRemoved()) {
            arrayList.add(nrk0.m160744a(ValidationError.EMPTY_KEY_ABORT, new String[0]));
            return new drk0.C16456a(arrayList, DropReason.EMPTY_KEY);
        }
        for (mxq mxqVar : input.m196263b()) {
            Iterator<T> it = mxqVar.m156919c().iterator();
            while (it.hasNext()) {
                int i = C17687a.f116186a[((ModificationReason) it.next()).ordinal()];
                if (i == 1) {
                    mrk0VarM160744a = nrk0.m160744a(ValidationError.KEY_INVALID_CHARACTERS, mxqVar.getOriginalKey(), mxqVar.getCleanedKey());
                } else {
                    if (i != 2) {
                        l9r.m149037a();
                        return null;
                    }
                    Integer maxKeyLength = config.getMaxKeyLength();
                    if (maxKeyLength != null) {
                        mrk0VarM160744a = nrk0.m160744a(ValidationError.KEY_LENGTH_EXCEEDED, mxqVar.getOriginalKey(), String.valueOf(maxKeyLength.intValue()), mxqVar.getCleanedKey());
                        if (mrk0VarM160744a == null) {
                        }
                    }
                }
                arrayList.add(mrk0VarM160744a);
            }
        }
        return arrayList.isEmpty() ? new drk0.C16457b(null, 1, null) : new drk0.C16458c(arrayList);
    }
}
