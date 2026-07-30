package p153l;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.live.base.data.BLiveHeatVoiceRoomTask;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000b\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0011J'\u0010\u0015\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\rJ\u001f\u0010\u0018\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\rJ\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u001d¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m88121d2 = {"Ll/meo0;", "", "<init>", "()V", "Ll/i6t;", "presenter", "Ll/leo0;", "message", "", "e", "(Ll/i6t;Ll/leo0;)V", Constants.INAPP_DATA_TAG, "h", "(Ll/i6t;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveHeatVoiceRoomTask;", Item.TYPE, RXScreenCaptureService.KEY_INDEX, "(Ll/i6t;Lcom/p1/mobile/putong/live/base/data/BLiveHeatVoiceRoomTask;)V", "c", "", "hasCallInvite", "f", "(Ll/i6t;Z)V", "j", "b", "isAnchor", "", "a", "(Z)Ljava/lang/String;", "Ll/i1l;", "g", "(Ll/i1l;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class meo0 {

    @NotNull
    public static final meo0 INSTANCE = new meo0();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m158063b(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        ?? M213810E2 = presenter.m213810E2();
        M213810E2.getClass();
        i4g0.m138523u("e_audio_shareroom_button", "p_audio_management_panel", jyb.m147494Y("anchorId", M213810E2.m168526j0()), jyb.m147494Y("liveId", M213810E2.m202191k()), jyb.m147494Y("user_type", i9o0.m139140l(presenter)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m158064c(@NotNull i6t<?, ?> presenter, @NotNull BLiveHeatVoiceRoomTask item) {
        presenter.getClass();
        item.getClass();
        ?? M213810E2 = presenter.m213810E2();
        M213810E2.getClass();
        i4g0.m138523u("e_audio_roomheater_notify_fans", "p_audio_roomheater_panel", jyb.m147494Y("anchorId", M213810E2.m168526j0()), jyb.m147494Y("liveId", M213810E2.m202191k()), jyb.m147494Y(NotificationCompat.CATEGORY_STATUS, item.isDone() ? "notified" : "notify"), jyb.m147494Y("user_type", i9o0.m139140l(presenter)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m158065d(@NotNull i6t<?, ?> presenter, @NotNull leo0 message) {
        presenter.getClass();
        message.getClass();
        ?? M213810E2 = presenter.m213810E2();
        M213810E2.getClass();
        i4g0.m138523u("e_audio_guide_message", INSTANCE.m158071a(M213810E2.mo118373p()), jyb.m147494Y("anchorId", M213810E2.m168526j0()), jyb.m147494Y("liveId", M213810E2.m202191k()), jyb.m147494Y("roomId", M213810E2.m202194o()), jyb.m147494Y("guide_type", message.m153922f()), jyb.m147494Y("user_type", i9o0.m139140l(presenter)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m158066e(@NotNull i6t<?, ?> presenter, @NotNull leo0 message) {
        presenter.getClass();
        message.getClass();
        ?? M213810E2 = presenter.m213810E2();
        M213810E2.getClass();
        i4g0.m138492A("e_audio_guide_message", INSTANCE.m158071a(M213810E2.mo118373p()), jyb.m147494Y("anchorId", M213810E2.m168526j0()), jyb.m147494Y("liveId", M213810E2.m202191k()), jyb.m147494Y("guide_type", message.m153922f()), jyb.m147494Y("roomId", M213810E2.m202194o()), jyb.m147494Y("user_type", i9o0.m139140l(presenter)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m158067f(@NotNull i6t<?, ?> presenter, boolean hasCallInvite) {
        presenter.getClass();
        ?? M213810E2 = presenter.m213810E2();
        M213810E2.getClass();
        i4g0.m138523u("e_audio_roomheater_recall", "p_audio_roomheater_panel", jyb.m147494Y("anchorId", M213810E2.m168526j0()), jyb.m147494Y("liveId", M213810E2.m202191k()), jyb.m147494Y(NotificationCompat.CATEGORY_STATUS, hasCallInvite ? "recalled" : "recall"), jyb.m147494Y("user_type", i9o0.m139140l(presenter)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m158068h(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        ?? M213810E2 = presenter.m213810E2();
        M213810E2.getClass();
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.PAGE_VIEW;
        q4fVar.f155576n = "p_audio_roomheater_panel";
        i4g0.m138517o(q4fVar, jyb.m147494Y("anchorId", M213810E2.m168526j0()), jyb.m147494Y("liveId", M213810E2.m202191k()), jyb.m147494Y("user_type", i9o0.m139140l(presenter)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m158069i(@NotNull i6t<?, ?> presenter, @NotNull BLiveHeatVoiceRoomTask item) {
        String str;
        presenter.getClass();
        item.getClass();
        ?? M213810E2 = presenter.m213810E2();
        M213810E2.getClass();
        if (Intrinsics.m88377d("上麦", item.buttonName)) {
            str = "voice_apply";
        } else {
            str = Intrinsics.m88377d("已申请", item.buttonName) ? "voice_applied" : "voicing";
        }
        i4g0.m138523u("e_audio_roomheater_voice", "p_audio_roomheater_panel", jyb.m147494Y("anchorId", M213810E2.m168526j0()), jyb.m147494Y("liveId", M213810E2.m202191k()), jyb.m147494Y(NotificationCompat.CATEGORY_STATUS, str), jyb.m147494Y("user_type", i9o0.m139140l(presenter)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m158070j(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        ?? M213810E2 = presenter.m213810E2();
        M213810E2.getClass();
        i4g0.m138523u("e_audio_shareroom_button", "p_audio_roomheater_panel", jyb.m147494Y("anchorId", M213810E2.m168526j0()), jyb.m147494Y("liveId", M213810E2.m202191k()), jyb.m147494Y("user_type", i9o0.m139140l(presenter)));
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m158071a(boolean isAnchor) {
        return isAnchor ? "p_anchor_audio_room" : "p_user_audio_room";
    }

    /* JADX INFO: renamed from: g */
    public final void m158072g(@NotNull i1l<?> presenter) {
        presenter.getClass();
    }
}
