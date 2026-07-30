package p153l;

import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Action;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H'¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/kud;", "", "", "Ll/mud;", "delayedInApps", "", Constants.INAPP_DATA_TAG, "(Ljava/util/List;)Z", "", "inAppId", Action.remove, "(Ljava/lang/String;)Z", "c", "(Ljava/lang/String;)Ljava/lang/String;", "b", "()Z", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface kud {
    @WorkerThread
    /* JADX INFO: renamed from: b */
    boolean mo151505b();

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: c */
    String mo151506c(@NotNull String inAppId);

    @WorkerThread
    /* JADX INFO: renamed from: d */
    boolean mo151507d(@NotNull List<mud> delayedInApps);

    @WorkerThread
    boolean remove(@NotNull String inAppId);
}
