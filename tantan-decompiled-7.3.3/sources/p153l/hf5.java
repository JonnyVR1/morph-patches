package p153l;

import android.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001b\u0010\u0002\u001a\u00020\u0000*\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m88121d2 = {"", "fallback", "a", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "clevertap-core_release"}, m88122k = 2, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class hf5 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m134686a(@Nullable String str, @NotNull String str2) {
        str2.getClass();
        if (!C15493d.m94374J(str2, "#", false, 2, null)) {
            str2 = null;
        }
        if (str2 != null) {
            try {
                Color.parseColor(str2);
            } catch (Exception unused) {
                str2 = null;
            }
        }
        if (str2 == null) {
            str2 = "#FFFFFF";
        }
        if (str == null || !C15493d.m94374J(str, "#", false, 2, null)) {
            return str2;
        }
        try {
            Color.parseColor(str);
            return str;
        } catch (Exception unused2) {
            return str2;
        }
    }
}
