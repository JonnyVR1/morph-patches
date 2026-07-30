package p149l;

import android.content.Context;
import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0010H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH&¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\tH&¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\tH&¢\u0006\u0004\b#\u0010\u001cJ\u000f\u0010$\u001a\u00020\fH&¢\u0006\u0004\b$\u0010\u000e¨\u0006%À\u0006\u0003"}, m87232d2 = {"Ll/rsl;", "", "Landroid/content/Context;", "context", "Landroid/view/View;", "g", "(Landroid/content/Context;)Landroid/view/View;", "Ll/dfl;", "actionListener", "", "K", "(Ll/dfl;)V", "", "getDialogViewHeight", "()I", "", "Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;", "allLeaderboards", BLiveStormDanmakuGiftResourceType.f44444l, "(Ljava/util/List;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoard;", "leaderBoard", "H", "(Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoard;)V", "hourLeaderBoard", "Y", "(Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoardItem;)V", "G", "()V", RXScreenCaptureService.KEY_INDEX, "onDestroy", "", "show", "I", "(Z)V", "b", "getContentHeight", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public interface rsl {
    /* JADX INFO: renamed from: G */
    void mo74749G();

    /* JADX INFO: renamed from: H */
    void mo74750H(@NotNull BLiveHourLeaderBoard leaderBoard);

    /* JADX INFO: renamed from: I */
    void mo74751I(boolean show);

    /* JADX INFO: renamed from: K */
    void mo74752K(@NotNull dfl actionListener);

    /* JADX INFO: renamed from: Y */
    void mo74753Y(@NotNull BLiveHourLeaderBoardItem hourLeaderBoard);

    /* JADX INFO: renamed from: b */
    void mo74754b();

    @NotNull
    /* JADX INFO: renamed from: g */
    View mo74755g(@NotNull Context context);

    int getContentHeight();

    int getDialogViewHeight();

    /* JADX INFO: renamed from: i */
    void mo74756i();

    /* JADX INFO: renamed from: l */
    void mo74758l(@NotNull List<? extends BLiveHourLeaderBoardItem> allLeaderboards);

    void onDestroy();
}
