package p153l;

import android.app.job.JobInfo;
import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Landroid/app/job/JobInfo$Builder;", "builder", "Landroid/net/NetworkRequest;", "networkRequest", "", "a", "(Landroid/app/job/JobInfo$Builder;Landroid/net/NetworkRequest;)V", "work-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class sph0 {
    /* JADX INFO: renamed from: a */
    public static final void m187343a(@NotNull JobInfo.Builder builder, @Nullable NetworkRequest networkRequest) {
        builder.getClass();
        builder.setRequiredNetwork(networkRequest);
    }
}
