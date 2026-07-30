package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\nJ7\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m88121d2 = {"Ll/eky;", "", "<init>", "()V", "", "anchorId", "liveId", "user_type", "", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "f", "", "isAgree", "isAnchor", "scene", "a", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "pid", "e", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "b", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", FirebaseAnalytics.Param.INDEX, Constants.INAPP_DATA_TAG, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class eky {

    @NotNull
    public static final eky INSTANCE = new eky();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m121088a(boolean isAgree, boolean isAnchor, @NotNull String anchorId, @NotNull String liveId, @NotNull String scene) {
        anchorId.getClass();
        liveId.getClass();
        scene.getClass();
        i4g0.m138523u(isAgree ? "e_audio_settle_apply_approve" : "e_audio_settle_apply_refuse", "p_audio_management_panel", jyb.m147494Y("anchorId", anchorId), jyb.m147494Y("scene", scene), jyb.m147494Y("user_type", isAnchor ? "anchor" : "manager"), jyb.m147494Y("liveId", liveId));
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m121089b(boolean isAnchor, @NotNull String anchorId, @NotNull String liveId, @NotNull String scene) {
        anchorId.getClass();
        liveId.getClass();
        scene.getClass();
        i4g0.m138523u("e_audio_anchor_invite_call", "p_audio_management_panel", jyb.m147494Y("anchorId", anchorId), jyb.m147494Y("scene", scene), jyb.m147494Y("user_type", isAnchor ? "anchor" : "manager"), jyb.m147494Y("liveId", liveId));
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m121090c(@NotNull String anchorId, @NotNull String liveId, @NotNull String user_type) {
        anchorId.getClass();
        liveId.getClass();
        user_type.getClass();
        q4f q4fVar = new q4f();
        q4fVar.f155576n = "p_audio_management_panel";
        q4fVar.f155566d = EventNameEnum.PAGE_VIEW;
        i4g0.m138517o(q4fVar, jyb.m147494Y("anchorId", anchorId), jyb.m147494Y("liveId", liveId), jyb.m147494Y("user_type", user_type));
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m121091d(int index, @NotNull String anchorId, @NotNull String liveId, @NotNull String user_type) {
        String str;
        anchorId.getClass();
        liveId.getClass();
        user_type.getClass();
        if (index == 0) {
            str = "e_audio_management_panel_online";
        } else if (index != 1) {
            str = index != 2 ? "e_audio_management_panel_voice_apply" : "e_audio_management_panel_settle_apply";
        } else {
            str = "e_audio_management_panel_settled";
        }
        i4g0.m138492A(str, "p_audio_management_panel", jyb.m147494Y("anchorId", anchorId), jyb.m147494Y("user_type", user_type), jyb.m147494Y("liveId", liveId));
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m121092e(@NotNull String pid, boolean isAnchor, @NotNull String anchorId, @NotNull String liveId, @NotNull String scene) {
        pid.getClass();
        anchorId.getClass();
        liveId.getClass();
        scene.getClass();
        i4g0.m138523u("e_audio_recall_member_button", pid, jyb.m147494Y("anchorId", anchorId), jyb.m147494Y("scene", scene), jyb.m147494Y("user_type", isAnchor ? "anchor" : "manager"), jyb.m147494Y("liveId", liveId));
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m121093f(@NotNull String anchorId, @NotNull String liveId, @NotNull String user_type) {
        anchorId.getClass();
        liveId.getClass();
        user_type.getClass();
        q4f q4fVar = new q4f();
        q4fVar.f155576n = "p_audio_settle_member_list";
        q4fVar.f155566d = EventNameEnum.PAGE_VIEW;
        i4g0.m138517o(q4fVar, jyb.m147494Y("anchorId", anchorId), jyb.m147494Y("liveId", liveId), jyb.m147494Y("user_type", user_type));
    }
}
