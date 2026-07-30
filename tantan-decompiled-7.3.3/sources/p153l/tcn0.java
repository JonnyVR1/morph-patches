package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JE\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH&¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH&¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH&¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010$\u001a\u00020\r2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010%J%\u0010&\u001a\u00020\r2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\"\u001a\u00020\u001bH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\rH\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010\u001aJ\u0017\u0010-\u001a\u00020\r2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.¨\u0006/À\u0006\u0003"}, m88121d2 = {"Ll/tcn0;", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCall;", "call", "Lcom/p1/mobile/putong/live/base/data/BLiveMember;", "bLiveMember", "Ll/nsv;", "Ll/h64;", "user", "Ll/ixm0;", "presenter", "Ll/wao0;", "micEmojiUserInfo", "", "e", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCall;Lcom/p1/mobile/putong/live/base/data/BLiveMember;Ll/nsv;Ll/ixm0;Ll/wao0;)V", "", Constants.INAPP_POSITION, "f", "(ILl/ixm0;)V", "", "isClearAvatar", "h", "(IZLl/ixm0;)V", "c", "a", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCall;)V", "", "url", "g", "(Ljava/lang/String;)V", "", "Lcom/p1/mobile/longlink/msg/voicelivemessage/VoiceMicEmoji$EmojiPlayResult;", "emojiResult", "emojiType", BaseSei.MID, Constants.INAPP_DATA_TAG, "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "b", "(Ljava/util/List;Ljava/lang/String;)V", "j", "()V", "D", "", "progress", RXScreenCaptureService.KEY_INDEX, "(F)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public interface tcn0 {
    /* JADX INFO: renamed from: D */
    default void mo79135D(@NotNull BLiveVoiceCall call) {
        call.getClass();
    }

    /* JADX INFO: renamed from: a */
    void mo79140a(@NotNull BLiveVoiceCall call);

    /* JADX INFO: renamed from: b */
    default void mo79141b(@NotNull List<VoiceMicEmoji.EmojiPlayResult> emojiResult, @NotNull String emojiType) {
        emojiResult.getClass();
        emojiType.getClass();
    }

    /* JADX INFO: renamed from: c */
    void mo79142c(int pos, @NotNull ixm0<?> presenter);

    /* JADX INFO: renamed from: d */
    default void mo79143d(@NotNull List<VoiceMicEmoji.EmojiPlayResult> emojiResult, @NotNull String emojiType, @NotNull String mid) {
        emojiResult.getClass();
        emojiType.getClass();
        mid.getClass();
    }

    /* JADX INFO: renamed from: e */
    void mo79144e(@NotNull BLiveVoiceCall call, @Nullable BLiveMember bLiveMember, @NotNull nsv<h64> user, @NotNull ixm0<?> presenter, @Nullable wao0 micEmojiUserInfo);

    /* JADX INFO: renamed from: f */
    void mo79145f(int pos, @NotNull ixm0<?> presenter);

    /* JADX INFO: renamed from: h */
    void mo79147h(int pos, boolean isClearAvatar, @NotNull ixm0<?> presenter);

    /* JADX INFO: renamed from: g */
    default void mo79146g(@Nullable String url) {
    }

    /* JADX INFO: renamed from: i */
    default void mo79148i(float progress) {
    }

    /* JADX INFO: renamed from: j */
    default void mo79149j() {
    }
}
