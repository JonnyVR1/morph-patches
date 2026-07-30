package p149l;

import android.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001b\u0010\u0002\u001a\u00020\u0000*\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m87232d2 = {"", "fallback", "a", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "clevertap-core_release"}, m87233k = 2, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class he5 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m130620a(@Nullable String str, @NotNull String str2) {
        str2.getClass();
        if (!C15386d.m93483J(str2, "#", false, 2, null)) {
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
        if (str == null || !C15386d.m93483J(str, "#", false, 2, null)) {
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
