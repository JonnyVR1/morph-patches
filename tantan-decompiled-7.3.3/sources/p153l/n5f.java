package p153l;

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
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/n5f;", "", "Ll/y6b0;", "<init>", "()V", "input", "Ll/i0l0;", Constants.KEY_CONFIG, "Ll/j0l0;", "a", "(Ll/y6b0;Ll/i0l0;)Ll/j0l0;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class n5f {

    /* JADX INFO: renamed from: l.n5f$a */
    @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    public /* synthetic */ class C18803a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f140331a;

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
            f140331a = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public j0l0 m161710a(@NotNull y6b0 input, @NotNull i0l0 config) {
        s0l0 s0l0VarM188803a;
        input.getClass();
        config.getClass();
        ArrayList arrayList = new ArrayList();
        if (input.getWasRemoved()) {
            arrayList.add(t0l0.m188803a(ValidationError.EMPTY_KEY_ABORT, new String[0]));
            return new j0l0.C17839a(arrayList, DropReason.EMPTY_KEY);
        }
        for (mzq mzqVar : input.m214447b()) {
            Iterator<T> it = mzqVar.m160919c().iterator();
            while (it.hasNext()) {
                int i = C18803a.f140331a[((ModificationReason) it.next()).ordinal()];
                if (i == 1) {
                    s0l0VarM188803a = t0l0.m188803a(ValidationError.KEY_INVALID_CHARACTERS, mzqVar.getOriginalKey(), mzqVar.getCleanedKey());
                } else {
                    if (i != 2) {
                        nbr.m162172a();
                        return null;
                    }
                    Integer maxKeyLength = config.getMaxKeyLength();
                    if (maxKeyLength != null) {
                        s0l0VarM188803a = t0l0.m188803a(ValidationError.KEY_LENGTH_EXCEEDED, mzqVar.getOriginalKey(), String.valueOf(maxKeyLength.intValue()), mzqVar.getCleanedKey());
                        if (s0l0VarM188803a == null) {
                        }
                    }
                }
                arrayList.add(s0l0VarM188803a);
            }
        }
        return arrayList.isEmpty() ? new j0l0.C17840b(null, 1, null) : new j0l0.C17841c(arrayList);
    }
}
