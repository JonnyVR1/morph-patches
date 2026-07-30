package p149l;

import android.annotation.SuppressLint;
import androidx.work.Data;
import androidx.work.WorkInfo;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.StudentVerRejectedReason;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0019\u0010\nJ\u001f\u0010\u001c\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH'¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH'¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\"\u0010\u0018J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b#\u0010\u0018J\u001f\u0010%\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0014H'¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b*\u0010+J#\u0010-\u001a\b\u0012\u0004\u0012\u00020)0\u000e2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH'¢\u0006\u0004\b-\u0010.J\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020)0\u000e2\u0006\u0010/\u001a\u00020\u0007H'¢\u0006\u0004\b0\u0010\u0011J\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020)0\u000e2\u0006\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b1\u0010\u0011J\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b2\u0010\u0011J\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010/\u001a\u00020\u0007H'¢\u0006\u0004\b3\u0010\u0011J\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b4\u0010\u0011J\u0015\u00105\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH'¢\u0006\u0004\b5\u00106J\u0015\u00109\u001a\b\u0012\u0004\u0012\u00020807H'¢\u0006\u0004\b9\u0010:J\u001f\u0010<\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u001eH'¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0014H'¢\u0006\u0004\b>\u0010?J\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010@\u001a\u00020\u0014H'¢\u0006\u0004\bA\u0010BJ\u0015\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\bC\u00106J\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010D\u001a\u00020\u0014H'¢\u0006\u0004\bE\u0010BJ\u0015\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\bF\u00106J\u0015\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\bG\u00106J\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010H\u001a\u00020\u001eH'¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0004H'¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\bM\u0010\u0006J\u000f\u0010N\u001a\u00020\u0014H'¢\u0006\u0004\bN\u0010?J\u001f\u0010P\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010O\u001a\u00020\u0014H'¢\u0006\u0004\bP\u0010&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006QÀ\u0006\u0001"}, m87232d2 = {"Ll/iaq0;", "", "Ll/haq0;", "workSpec", "", "o", "(Ll/haq0;)V", "", "id", RequestParameters.SUBRESOURCE_DELETE, "(Ljava/lang/String;)V", ResourceDirection.f38808v, "(Ljava/lang/String;)Ll/haq0;", AuthenticationTokenClaims.JSON_KEY_NAME, "", "Ll/haq0$b;", BaseSei.f13932Z, "(Ljava/lang/String;)Ljava/util/List;", "Landroidx/work/WorkInfo$State;", "state", "", "j", "(Landroidx/work/WorkInfo$State;Ljava/lang/String;)I", "e", "(Ljava/lang/String;)I", "r", "Landroidx/work/Data;", "output", b2s.C_ZONE, "(Ljava/lang/String;Landroidx/work/Data;)V", "", "enqueueTime", "k", "(Ljava/lang/String;J)V", "F", "n", "overrideGeneration", "q", "(Ljava/lang/String;I)V", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Landroidx/work/WorkInfo$State;", "Ll/haq0$c;", "u", "(Ljava/lang/String;)Ll/haq0$c;", "ids", "G", "(Ljava/util/List;)Ljava/util/List;", "tag", "E", "h", "g", "f", "c", BLiveStormDanmakuGiftResourceType.f44444l, "()Ljava/util/List;", "Ll/eri;", "", "A", "()Ll/eri;", StudentVerRejectedReason.startTime, BaseSei.f13931Y, "(Ljava/lang/String;J)I", "w", "()I", "schedulerLimit", "B", "(I)Ljava/util/List;", "m", "maxLimit", RXScreenCaptureService.KEY_INDEX, Constants.KEY_T, "D", "startingAt", BLiveStormDanmakuGiftResourceType.f44446s, "(J)Ljava/util/List;", "a", "()V", BaseSei.f13930X, "p", "stopReason", "b", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SuppressLint({"UnknownNullness"})
public interface iaq0 {
    @NotNull
    /* JADX INFO: renamed from: A */
    eri<Boolean> mo135162A();

    @NotNull
    /* JADX INFO: renamed from: B */
    List<haq0> mo135163B(int schedulerLimit);

    /* JADX INFO: renamed from: C */
    void mo135164C(@NotNull String id, @NotNull Data output);

    @NotNull
    /* JADX INFO: renamed from: D */
    List<haq0> mo135165D();

    @NotNull
    /* JADX INFO: renamed from: E */
    List<haq0.C17256c> mo135166E(@NotNull String tag);

    /* JADX INFO: renamed from: F */
    int mo135167F(@NotNull String id);

    @NotNull
    /* JADX INFO: renamed from: G */
    List<haq0.C17256c> mo135168G(@NotNull List<String> ids);

    /* JADX INFO: renamed from: a */
    void mo135169a();

    /* JADX INFO: renamed from: b */
    void mo135170b(@NotNull String id, int stopReason);

    @NotNull
    /* JADX INFO: renamed from: c */
    List<String> mo135171c(@NotNull String name);

    @Nullable
    /* JADX INFO: renamed from: d */
    WorkInfo.State mo135172d(@NotNull String id);

    void delete(@NotNull String id);

    /* JADX INFO: renamed from: e */
    int mo135173e(@NotNull String id);

    @NotNull
    /* JADX INFO: renamed from: f */
    List<String> mo135174f(@NotNull String tag);

    @NotNull
    /* JADX INFO: renamed from: g */
    List<Data> mo135175g(@NotNull String id);

    @NotNull
    /* JADX INFO: renamed from: h */
    List<haq0.C17256c> mo135176h(@NotNull String name);

    @NotNull
    /* JADX INFO: renamed from: i */
    List<haq0> mo135177i(int maxLimit);

    /* JADX INFO: renamed from: j */
    int mo135178j(@NotNull WorkInfo.State state, @NotNull String id);

    /* JADX INFO: renamed from: k */
    void mo135179k(@NotNull String id, long enqueueTime);

    @NotNull
    /* JADX INFO: renamed from: l */
    List<String> mo135180l();

    @NotNull
    /* JADX INFO: renamed from: m */
    List<haq0> mo135181m();

    /* JADX INFO: renamed from: n */
    int mo135182n(@NotNull String id);

    /* JADX INFO: renamed from: o */
    void mo135183o(@NotNull haq0 workSpec);

    /* JADX INFO: renamed from: p */
    int mo135184p();

    /* JADX INFO: renamed from: q */
    void mo135185q(@NotNull String id, int overrideGeneration);

    /* JADX INFO: renamed from: r */
    void mo135186r(@NotNull String id);

    @NotNull
    /* JADX INFO: renamed from: s */
    List<haq0> mo135187s(long startingAt);

    @NotNull
    /* JADX INFO: renamed from: t */
    List<haq0> mo135188t();

    @Nullable
    /* JADX INFO: renamed from: u */
    haq0.C17256c mo135189u(@NotNull String id);

    @Nullable
    /* JADX INFO: renamed from: v */
    haq0 mo135190v(@NotNull String id);

    /* JADX INFO: renamed from: w */
    int mo135191w();

    /* JADX INFO: renamed from: x */
    void mo135192x(@NotNull haq0 workSpec);

    /* JADX INFO: renamed from: y */
    int mo135193y(@NotNull String id, long startTime);

    @NotNull
    /* JADX INFO: renamed from: z */
    List<haq0.C17255b> mo135194z(@NotNull String name);
}
