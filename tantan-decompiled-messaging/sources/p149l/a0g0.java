package p149l;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\"\"\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u0012\u0004\b\f\u0010\r¨\u0006\u000f"}, m87232d2 = {"Ljava/lang/StringBuilder;", "b", "()Ljava/lang/StringBuilder;", "builder", "", "count", "", "a", "(Ljava/lang/StringBuilder;I)V", "", "", "[Ljava/lang/String;", "getEMPTY_STRING_ARRAY$annotations", "()V", "EMPTY_STRING_ARRAY", "room-runtime_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
@JvmName
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@SourceDebugExtension
public final class a0g0 {

    /* JADX INFO: renamed from: a */
    @JvmField
    @NotNull
    public static final String[] f67040a = new String[0];

    /* JADX INFO: renamed from: a */
    public static final void m94423a(@NotNull StringBuilder sb, int i) {
        sb.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(Constants.SEPARATOR_COMMA);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final StringBuilder m94424b() {
        return new StringBuilder();
    }
}
