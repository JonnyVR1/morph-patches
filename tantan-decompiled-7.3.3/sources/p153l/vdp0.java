package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J;\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH&¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH&¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH&¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH&¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 À\u0006\u0003"}, m88121d2 = {"Ll/vdp0;", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCall;", "call", "Lcom/p1/mobile/putong/live/base/data/BLiveMember;", "bLiveMember", "Ll/nsv;", "Ll/h64;", "user", "Ll/scp0;", "presenter", "", "c", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCall;Lcom/p1/mobile/putong/live/base/data/BLiveMember;Ll/nsv;Ll/scp0;)V", "", Constants.INAPP_POSITION, "f", "(ILl/scp0;)V", "", "isClearAvatar", "b", "(IZLl/scp0;)V", "e", ShareConstants.RES_PATH, "setItemPlaceRes", "(I)V", "a", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCall;)V", "", "effectUrl", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public interface vdp0 {
    /* JADX INFO: renamed from: a */
    void mo78081a(@NotNull BLiveVoiceCall call);

    /* JADX INFO: renamed from: b */
    void mo78082b(int pos, boolean isClearAvatar, @NotNull scp0<?> presenter);

    /* JADX INFO: renamed from: c */
    void mo78083c(@NotNull BLiveVoiceCall call, @Nullable BLiveMember bLiveMember, @NotNull nsv<h64> user, @NotNull scp0<?> presenter);

    /* JADX INFO: renamed from: d */
    void mo78084d(@NotNull String effectUrl);

    /* JADX INFO: renamed from: e */
    void mo78085e(int pos, @NotNull scp0<?> presenter);

    /* JADX INFO: renamed from: f */
    void mo78086f(int pos, @NotNull scp0<?> presenter);

    default void setItemPlaceRes(int res) {
    }
}
