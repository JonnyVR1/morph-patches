package p149l;

import com.p046p1.mobile.putong.core.data.Item;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u000e"}, m87232d2 = {"Ll/qhf0;", j6f.GPS_DIRECTION_TRUE, "Ll/vii0;", "", "format", "<init>", "(Ljava/lang/String;)V", "", Item.TYPE, "a", "(Ljava/lang/Object;)Ljava/lang/String;", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/String;", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public class qhf0<T> implements vii0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String format;

    public /* synthetic */ qhf0(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "%s" : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.vii0
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo174537a(@Nullable Object item) {
        if (item == 0) {
            return "";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.getDefault(), this.format, Arrays.copyOf(new Object[]{m174538b(item)}, 1));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public Object m174538b(T item) {
        item.getClass();
        return item;
    }

    @JvmOverloads
    public qhf0(@NotNull String str) {
        str.getClass();
        this.format = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public qhf0() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
