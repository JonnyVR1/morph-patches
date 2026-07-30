package p149l;

import android.view.ViewGroup;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, m87232d2 = {"Ll/ptl;", "", "Lcom/p1/mobile/putong/data/User;", "k", "()Lcom/p1/mobile/putong/data/User;", "Landroid/view/ViewGroup;", BLiveStormDanmakuGiftResourceType.f44446s, "()Landroid/view/ViewGroup;", "clickedUser", "", "L", "(Lcom/p1/mobile/putong/data/User;)V", "", "getFrom", "()Ljava/lang/String;", "", "seeCount", "J", "(I)V", BLiveStormDanmakuGiftResourceType.f44444l, "()I", "P", "(I)Ljava/lang/String;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public interface ptl {
    /* JADX INFO: renamed from: J */
    void mo56681J(int seeCount);

    /* JADX INFO: renamed from: L */
    void mo56683L(@Nullable User clickedUser);

    @NotNull
    /* JADX INFO: renamed from: P */
    String mo56687P(int seeCount);

    @NotNull
    String getFrom();

    @Nullable
    /* JADX INFO: renamed from: k */
    User getClickedUser();

    /* JADX INFO: renamed from: l */
    int getSeeCount();

    @Nullable
    /* JADX INFO: renamed from: s */
    ViewGroup getClickedItem();
}
