package p149l;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"", "Landroid/content/Context;", "context", "a", "(ILandroid/content/Context;)I", "total", "b", "(II)I", "clevertap-core_release"}, m87233k = 2, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class qpf {
    /* JADX INFO: renamed from: a */
    public static final int m175834a(int i, @NotNull Context context) {
        context.getClass();
        return gex.m125859b(i * context.getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: b */
    public static final int m175835b(int i, int i2) {
        return (int) ((i2 * i) / 100.0f);
    }
}
