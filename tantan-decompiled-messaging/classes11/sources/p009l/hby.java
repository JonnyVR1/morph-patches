package p009l;

import com.tantanapp.foxstatistics.entity.EventNameEnum;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import l.j760;
import l.l3f;
import l.vwb;
import l.zvf0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\nJ7\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ll/hby;", "", "<init>", "()V", "", "anchorId", "liveId", "user_type", "", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "f", "", "isAgree", "isAnchor", "scene", "a", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "pid", "e", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "b", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "index", "d", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class hby {

    @NotNull
    public static final hby INSTANCE = new hby();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m15515a(boolean isAgree, boolean isAnchor, @NotNull String anchorId, @NotNull String liveId, @NotNull String scene) {
        anchorId.getClass();
        liveId.getClass();
        scene.getClass();
        zvf0.u(isAgree ? "e_audio_settle_apply_approve" : "e_audio_settle_apply_refuse", "p_audio_management_panel", new j760[]{vwb.Y("anchorId", anchorId), vwb.Y("scene", scene), vwb.Y("user_type", isAnchor ? "anchor" : "manager"), vwb.Y("liveId", liveId)});
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m15516b(boolean isAnchor, @NotNull String anchorId, @NotNull String liveId, @NotNull String scene) {
        anchorId.getClass();
        liveId.getClass();
        scene.getClass();
        zvf0.u("e_audio_anchor_invite_call", "p_audio_management_panel", new j760[]{vwb.Y("anchorId", anchorId), vwb.Y("scene", scene), vwb.Y("user_type", isAnchor ? "anchor" : "manager"), vwb.Y("liveId", liveId)});
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m15517c(@NotNull String anchorId, @NotNull String liveId, @NotNull String user_type) {
        anchorId.getClass();
        liveId.getClass();
        user_type.getClass();
        l3f l3fVar = new l3f();
        l3fVar.n = "p_audio_management_panel";
        l3fVar.d = EventNameEnum.PAGE_VIEW;
        zvf0.o(l3fVar, new j760[]{vwb.Y("anchorId", anchorId), vwb.Y("liveId", liveId), vwb.Y("user_type", user_type)});
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m15518d(int index, @NotNull String anchorId, @NotNull String liveId, @NotNull String user_type) {
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
        zvf0.A(str, "p_audio_management_panel", new j760[]{vwb.Y("anchorId", anchorId), vwb.Y("user_type", user_type), vwb.Y("liveId", liveId)});
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m15519e(@NotNull String pid, boolean isAnchor, @NotNull String anchorId, @NotNull String liveId, @NotNull String scene) {
        pid.getClass();
        anchorId.getClass();
        liveId.getClass();
        scene.getClass();
        zvf0.u("e_audio_recall_member_button", pid, new j760[]{vwb.Y("anchorId", anchorId), vwb.Y("scene", scene), vwb.Y("user_type", isAnchor ? "anchor" : "manager"), vwb.Y("liveId", liveId)});
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m15520f(@NotNull String anchorId, @NotNull String liveId, @NotNull String user_type) {
        anchorId.getClass();
        liveId.getClass();
        user_type.getClass();
        l3f l3fVar = new l3f();
        l3fVar.n = "p_audio_settle_member_list";
        l3fVar.d = EventNameEnum.PAGE_VIEW;
        zvf0.o(l3fVar, new j760[]{vwb.Y("anchorId", anchorId), vwb.Y("liveId", liveId), vwb.Y("user_type", user_type)});
    }
}
