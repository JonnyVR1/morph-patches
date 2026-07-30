package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveExtraData;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSettleUser;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\fH&¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0004H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\fH&¢\u0006\u0004\b\u001a\u0010\u000fJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\fH&¢\u0006\u0004\b\u001b\u0010\u000fJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\fH&¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001e\u001a\u00020\u0004H&¢\u0006\u0004\b\u001e\u0010\u0018J\u000f\u0010\u001f\u001a\u00020\fH&¢\u0006\u0004\b\u001f\u0010 ¨\u0006!À\u0006\u0003"}, m88121d2 = {"Ll/wgp0;", "", "Lcom/p1/mobile/putong/live/base/data/BLiveExtraData;", "roomInfo", "", "d1", "(Lcom/p1/mobile/putong/live/base/data/BLiveExtraData;)V", "F", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceVirtualRoomSettleUser;", "userInfo", "B1", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceVirtualRoomSettleUser;)V", "", "isPersonal", "g2", "(Z)V", "isFreeSettle", "J1", "", "userId", "i0", "(Ljava/lang/String;)Z", "d0", "R", "()V", "b", "Q", "E0", "checked", "y0", "h1", "h2", "()Z", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public interface wgp0 {
    /* JADX INFO: renamed from: B1 */
    void mo149946B1(@NotNull BLiveVoiceVirtualRoomSettleUser userInfo);

    /* JADX INFO: renamed from: E0 */
    void mo149947E0(boolean b);

    /* JADX INFO: renamed from: F */
    void mo149948F(@NotNull BLiveExtraData roomInfo);

    /* JADX INFO: renamed from: J1 */
    void mo149949J1(boolean isFreeSettle);

    /* JADX INFO: renamed from: Q */
    void mo149950Q(boolean b);

    /* JADX INFO: renamed from: R */
    void mo149951R();

    /* JADX INFO: renamed from: d0 */
    boolean mo149952d0(@NotNull String userId);

    /* JADX INFO: renamed from: d1 */
    void mo149953d1(@NotNull BLiveExtraData roomInfo);

    /* JADX INFO: renamed from: g2 */
    void mo149954g2(boolean isPersonal);

    /* JADX INFO: renamed from: h1 */
    void mo149955h1();

    /* JADX INFO: renamed from: h2 */
    boolean mo149956h2();

    /* JADX INFO: renamed from: i0 */
    boolean mo149957i0(@NotNull String userId);

    /* JADX INFO: renamed from: y0 */
    void mo149967y0(boolean checked);
}
