package p153l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.validation.pipeline.ModificationReason;
import com.clevertap.android.sdk.validation.pipeline.RemovalReason;
import java.io.IOException;
import java.util.ArrayList;
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
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/l5f;", "", "", "Ll/y6b0;", "<init>", "()V", "input", "Ll/i0l0;", Constants.KEY_CONFIG, "a", "(Ljava/lang/String;Ll/i0l0;)Ll/y6b0;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class l5f {
    @NotNull
    /* JADX INFO: renamed from: a */
    public y6b0 m152943a(@Nullable String input, @NotNull i0l0 config) throws IOException {
        int iIntValue;
        String string;
        config.getClass();
        String strSubstring = "";
        String str = input == null ? "" : input;
        if (input != null && (string = StringsKt.m94324Z0(input).toString()) != null) {
            strSubstring = string;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (strSubstring.length() == 0) {
            return new y6b0(str, "", SetsKt.emptySet(), true, RemovalReason.EMPTY_KEY);
        }
        ArrayList arrayList = new ArrayList();
        Set<Character> setM137983f = config.m137983f();
        if (setM137983f != null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < strSubstring.length(); i++) {
                char cCharAt = strSubstring.charAt(i);
                if (!setM137983f.contains(Character.valueOf(cCharAt))) {
                    sb.append(cCharAt);
                }
            }
            String string2 = sb.toString();
            if (!Intrinsics.m88377d(string2, strSubstring)) {
                arrayList.add(ModificationReason.INVALID_CHARACTERS_REMOVED);
                strSubstring = string2;
            }
        }
        Integer maxKeyLength = config.getMaxKeyLength();
        if (maxKeyLength != null && strSubstring.length() > (iIntValue = maxKeyLength.intValue())) {
            arrayList.add(ModificationReason.TRUNCATED_TO_MAX_LENGTH);
            strSubstring = strSubstring.substring(0, iIntValue);
        }
        String string3 = StringsKt.m94324Z0(strSubstring).toString();
        if (string3.length() == 0) {
            return new y6b0(str, "", SetsKt.emptySet(), true, RemovalReason.EMPTY_KEY);
        }
        if (!Intrinsics.m88377d(string3, str) && !arrayList.isEmpty()) {
            linkedHashSet.add(new mzq(str, string3, arrayList));
        }
        return new y6b0(str, string3, linkedHashSet, false, null);
    }
}
