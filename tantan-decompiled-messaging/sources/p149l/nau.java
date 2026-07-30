package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.ActivitySuggests;
import com.p046p1.mobile.putong.live.base.data.BLiveActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.random.Random;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, m87232d2 = {"Ll/nau;", "", "Lcom/p1/mobile/putong/live/base/data/ActivitySuggests;", "activitySuggests", "<init>", "(Lcom/p1/mobile/putong/live/base/data/ActivitySuggests;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveActivity;", "live", "", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/live/base/data/BLiveActivity;)Z", "", "b", "()V", "", "lives", "c", "(Ljava/util/List;)V", "Ljava/util/ArrayList;", "a", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "tempLives", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class nau {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<BLiveActivity> tempLives = new ArrayList<>();

    public nau(@Nullable ActivitySuggests activitySuggests) {
        if ((activitySuggests != null ? activitySuggests.liveActivities : null) != null) {
            List<BLiveActivity> list = activitySuggests.liveActivities;
            list.getClass();
            if (list.isEmpty()) {
                return;
            }
            List<BLiveActivity> list2 = activitySuggests.liveActivities;
            list2.getClass();
            m158718c(list2);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ArrayList<BLiveActivity> m158716a() {
        return this.tempLives;
    }

    /* JADX INFO: renamed from: b */
    public final void m158717b() {
        m158718c(new ArrayList(this.tempLives));
    }

    /* JADX INFO: renamed from: c */
    public final void m158718c(List<BLiveActivity> lives) {
        this.tempLives.clear();
        ArrayList arrayList = new ArrayList(lives);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.tempLives.add((BLiveActivity) arrayList.remove(C15167a.m87604j(C15167a.m87605k(0, arrayList.size()), Random.INSTANCE)));
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m158719d(@NotNull BLiveActivity live) {
        live.getClass();
        return this.tempLives.remove(live);
    }
}
