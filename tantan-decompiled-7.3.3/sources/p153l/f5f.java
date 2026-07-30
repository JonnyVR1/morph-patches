package p153l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.validation.pipeline.ModificationReason;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/f5f;", "", "", "Ll/e5f;", "<init>", "()V", "input", "Ll/i0l0;", Constants.KEY_CONFIG, "a", "(Ljava/lang/String;Ll/i0l0;)Ll/e5f;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class f5f {
    @NotNull
    /* JADX INFO: renamed from: a */
    public e5f m124122a(@Nullable String input, @NotNull i0l0 config) throws IOException {
        int iIntValue;
        config.getClass();
        if (input == null) {
            return new e5f(null, "", SetsKt.emptySet());
        }
        String string = StringsKt.m94324Z0(input).toString();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Set<Character> setM137982e = config.m137982e();
        if (setM137982e != null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < string.length(); i++) {
                char cCharAt = string.charAt(i);
                if (!setM137982e.contains(Character.valueOf(cCharAt))) {
                    sb.append(cCharAt);
                }
            }
            String string2 = sb.toString();
            if (!Intrinsics.m88377d(string2, string)) {
                linkedHashSet.add(ModificationReason.INVALID_CHARACTERS_REMOVED);
                string = string2;
            }
        }
        Integer maxEventNameLength = config.getMaxEventNameLength();
        if (maxEventNameLength != null && string.length() > (iIntValue = maxEventNameLength.intValue())) {
            linkedHashSet.add(ModificationReason.TRUNCATED_TO_MAX_LENGTH);
            string = string.substring(0, iIntValue);
        }
        return new e5f(input, StringsKt.m94324Z0(string).toString(), linkedHashSet);
    }
}
