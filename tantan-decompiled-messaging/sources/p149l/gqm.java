package p149l;

import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH'¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Ll/gqm;", "", "", "Lorg/json/JSONObject;", "inApps", "", Constants.INAPP_DATA_TAG, "(Ljava/util/List;)Z", "", "id", "c", "(Ljava/lang/String;)Lorg/json/JSONObject;", "", "a", "(Ljava/lang/String;)V", "b", "()V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface gqm {
    @WorkerThread
    /* JADX INFO: renamed from: a */
    void mo127607a(@NotNull String id);

    @WorkerThread
    /* JADX INFO: renamed from: b */
    void mo127608b();

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: c */
    JSONObject mo127609c(@NotNull String id);

    @WorkerThread
    /* JADX INFO: renamed from: d */
    boolean mo127610d(@NotNull List<? extends JSONObject> inApps);
}
