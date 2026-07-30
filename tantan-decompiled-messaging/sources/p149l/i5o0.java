package p149l;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.live.base.data.BLiveHeatVoiceRoomTask;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000b\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0011J'\u0010\u0015\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\rJ\u001f\u0010\u0018\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\rJ\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u001d¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m87232d2 = {"Ll/i5o0;", "", "<init>", "()V", "Ll/h4t;", "presenter", "Ll/h5o0;", "message", "", "e", "(Ll/h4t;Ll/h5o0;)V", Constants.INAPP_DATA_TAG, "h", "(Ll/h4t;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveHeatVoiceRoomTask;", Item.TYPE, RXScreenCaptureService.KEY_INDEX, "(Ll/h4t;Lcom/p1/mobile/putong/live/base/data/BLiveHeatVoiceRoomTask;)V", "c", "", "hasCallInvite", "f", "(Ll/h4t;Z)V", "j", "b", "isAnchor", "", "a", "(Z)Ljava/lang/String;", "Ll/syk;", "g", "(Ll/syk;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class i5o0 {

    @NotNull
    public static final i5o0 INSTANCE = new i5o0();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m134517b(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        ?? M206027E2 = presenter.m206027E2();
        M206027E2.getClass();
        zvf0.m220399u("e_audio_shareroom_button", "p_audio_management_panel", vwb.m200311Y("anchorId", M206027E2.m132140j0()), vwb.m200311Y("liveId", M206027E2.m149814k()), vwb.m200311Y("user_type", e0o0.m114325l(presenter)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m134518c(@NotNull h4t<?, ?> presenter, @NotNull BLiveHeatVoiceRoomTask item) {
        presenter.getClass();
        item.getClass();
        ?? M206027E2 = presenter.m206027E2();
        M206027E2.getClass();
        zvf0.m220399u("e_audio_roomheater_notify_fans", "p_audio_roomheater_panel", vwb.m200311Y("anchorId", M206027E2.m132140j0()), vwb.m200311Y("liveId", M206027E2.m149814k()), vwb.m200311Y(NotificationCompat.CATEGORY_STATUS, item.isDone() ? "notified" : "notify"), vwb.m200311Y("user_type", e0o0.m114325l(presenter)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m134519d(@NotNull h4t<?, ?> presenter, @NotNull h5o0 message) {
        presenter.getClass();
        message.getClass();
        ?? M206027E2 = presenter.m206027E2();
        M206027E2.getClass();
        zvf0.m220399u("e_audio_guide_message", INSTANCE.m134525a(M206027E2.mo97490p()), vwb.m200311Y("anchorId", M206027E2.m132140j0()), vwb.m200311Y("liveId", M206027E2.m149814k()), vwb.m200311Y("roomId", M206027E2.m149818o()), vwb.m200311Y("guide_type", message.m129440f()), vwb.m200311Y("user_type", e0o0.m114325l(presenter)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m134520e(@NotNull h4t<?, ?> presenter, @NotNull h5o0 message) {
        presenter.getClass();
        message.getClass();
        ?? M206027E2 = presenter.m206027E2();
        M206027E2.getClass();
        zvf0.m220368A("e_audio_guide_message", INSTANCE.m134525a(M206027E2.mo97490p()), vwb.m200311Y("anchorId", M206027E2.m132140j0()), vwb.m200311Y("liveId", M206027E2.m149814k()), vwb.m200311Y("guide_type", message.m129440f()), vwb.m200311Y("roomId", M206027E2.m149818o()), vwb.m200311Y("user_type", e0o0.m114325l(presenter)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m134521f(@NotNull h4t<?, ?> presenter, boolean hasCallInvite) {
        presenter.getClass();
        ?? M206027E2 = presenter.m206027E2();
        M206027E2.getClass();
        zvf0.m220399u("e_audio_roomheater_recall", "p_audio_roomheater_panel", vwb.m200311Y("anchorId", M206027E2.m132140j0()), vwb.m200311Y("liveId", M206027E2.m149814k()), vwb.m200311Y(NotificationCompat.CATEGORY_STATUS, hasCallInvite ? "recalled" : "recall"), vwb.m200311Y("user_type", e0o0.m114325l(presenter)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m134522h(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        ?? M206027E2 = presenter.m206027E2();
        M206027E2.getClass();
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.PAGE_VIEW;
        l3fVar.f125895n = "p_audio_roomheater_panel";
        zvf0.m220393o(l3fVar, vwb.m200311Y("anchorId", M206027E2.m132140j0()), vwb.m200311Y("liveId", M206027E2.m149814k()), vwb.m200311Y("user_type", e0o0.m114325l(presenter)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m134523i(@NotNull h4t<?, ?> presenter, @NotNull BLiveHeatVoiceRoomTask item) {
        String str;
        presenter.getClass();
        item.getClass();
        ?? M206027E2 = presenter.m206027E2();
        M206027E2.getClass();
        if (Intrinsics.m87488d("上麦", item.buttonName)) {
            str = "voice_apply";
        } else {
            str = Intrinsics.m87488d("已申请", item.buttonName) ? "voice_applied" : "voicing";
        }
        zvf0.m220399u("e_audio_roomheater_voice", "p_audio_roomheater_panel", vwb.m200311Y("anchorId", M206027E2.m132140j0()), vwb.m200311Y("liveId", M206027E2.m149814k()), vwb.m200311Y(NotificationCompat.CATEGORY_STATUS, str), vwb.m200311Y("user_type", e0o0.m114325l(presenter)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m134524j(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        ?? M206027E2 = presenter.m206027E2();
        M206027E2.getClass();
        zvf0.m220399u("e_audio_shareroom_button", "p_audio_roomheater_panel", vwb.m200311Y("anchorId", M206027E2.m132140j0()), vwb.m200311Y("liveId", M206027E2.m149814k()), vwb.m200311Y("user_type", e0o0.m114325l(presenter)));
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m134525a(boolean isAnchor) {
        return isAnchor ? "p_anchor_audio_room" : "p_user_audio_room";
    }

    /* JADX INFO: renamed from: g */
    public final void m134526g(@NotNull syk<?> presenter) {
        presenter.getClass();
    }
}
