package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceLiveBullet;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0017\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0018\u0010\u0010J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0019\u0010\u0010J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001a\u0010\u0010¨\u0006\u001b"}, m87232d2 = {"Ll/vln0;", "", "<init>", "()V", "Lcom/p1/mobile/longlink/msg/voicelivemessage/VoiceLiveBullet$SystemVoiceLiveCommentsMsg;", "message", "Ll/und;", "defaultParam", "", "userId", "", "c", "(Lcom/p1/mobile/longlink/msg/voicelivemessage/VoiceLiveBullet$SystemVoiceLiveCommentsMsg;Ll/und;Ljava/lang/String;)V", "Ll/eln0;", "VoiceLiveBaseBullet", "a", "(Ll/eln0;)V", "", "isFirst", "Ljava/util/LinkedList;", "enqueue", "g", "(Ll/eln0;ZLjava/util/LinkedList;)V", Constants.INAPP_DATA_TAG, "e", "f", "b", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class vln0 {

    @NotNull
    public static final vln0 INSTANCE = new vln0();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m198815a(@NotNull eln0 VoiceLiveBaseBullet) {
        VoiceLiveBaseBullet.getClass();
        hfw.m130790a("[live]living_voice_bullet", "onBulletArrive = " + VoiceLiveBaseBullet.m117147e());
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m198816b(@NotNull eln0 VoiceLiveBaseBullet) {
        VoiceLiveBaseBullet.getClass();
        hfw.m130790a("[live]living_voice_bullet", "onBulletHide = " + VoiceLiveBaseBullet.m117147e());
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m198817c(@NotNull VoiceLiveBullet.SystemVoiceLiveCommentsMsg message, @NotNull und defaultParam, @NotNull String userId) {
        message.getClass();
        defaultParam.getClass();
        userId.getClass();
        VoiceLiveBullet.SystemVoiceLiveCommentBackground background = message.getBackground();
        String str = "headUrl = " + background.getHeaderImgUrl() + "  middleUrl = " + background.getMiddleImgUrl() + "  bottomUrl = " + background.getBottomImgUrl();
        hfw.m130790a("[live]living_voice_bullet", "onBulletMessageNotLegal iconUrl = " + message.getIconUrl() + "   startUrl " + message.getStartColor() + " endUrl = " + message.getEndColor() + "  specialMessage = " + str + "  userId = " + userId + "  roomId = " + message.getRoomID() + "  currentRomId = " + defaultParam.m194414a().room.f44419id + "  duration = " + message.getDisplayDuration());
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m198818d(@NotNull eln0 VoiceLiveBaseBullet) {
        VoiceLiveBaseBullet.getClass();
        hfw.m130790a("[live]living_voice_bullet", "onBulletRender = " + VoiceLiveBaseBullet.m117147e());
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m198819e(@NotNull eln0 VoiceLiveBaseBullet) {
        VoiceLiveBaseBullet.getClass();
        hfw.m130790a("[live]living_voice_bullet", "onBulletShow = " + VoiceLiveBaseBullet.m117147e());
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m198820f(@NotNull eln0 VoiceLiveBaseBullet) {
        VoiceLiveBaseBullet.getClass();
        hfw.m130790a("[live]living_voice_bullet", "onBulletStay = " + VoiceLiveBaseBullet.m117147e());
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m198821g(@NotNull eln0 VoiceLiveBaseBullet, boolean isFirst, @NotNull LinkedList<eln0> enqueue) {
        VoiceLiveBaseBullet.getClass();
        enqueue.getClass();
        hfw.m130790a("[live]living_voice_bullet", "onJoinBulletEnqueue isFirst = " + isFirst + " enqueueSize = " + enqueue.size() + " onBulletShow = " + VoiceLiveBaseBullet.m117147e());
    }
}
