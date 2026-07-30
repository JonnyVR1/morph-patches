package p149l;

import androidx.annotation.WorkerThread;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H'¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/aqm;", "", "", "Lorg/json/JSONObject;", "inApps", "", "a", "(Ljava/util/List;)V", "inApp", "c", "(Lorg/json/JSONObject;)V", "b", "()Lorg/json/JSONObject;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface aqm {
    @WorkerThread
    /* JADX INFO: renamed from: a */
    void mo98306a(@NotNull List<? extends JSONObject> inApps);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: b */
    JSONObject mo98307b();

    @WorkerThread
    /* JADX INFO: renamed from: c */
    void mo98308c(@NotNull JSONObject inApp);
}
