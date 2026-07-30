package p149l;

import android.app.Application;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m87232d2 = {"Ll/it0;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "processName", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class it0 {

    @NotNull
    public static final it0 INSTANCE = new it0();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m138096a() {
        String processName = Application.getProcessName();
        processName.getClass();
        return processName;
    }
}
