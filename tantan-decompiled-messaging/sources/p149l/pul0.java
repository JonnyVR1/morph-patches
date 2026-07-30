package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ'\u0010\u0012\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\bJ\u001f\u0010\u0015\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\bJ\u001f\u0010\u0016\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\bJ\u001f\u0010\u0017\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\bJ\u001f\u0010\u0018\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\bJ\u001f\u0010\u0019\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\bJ\u001f\u0010\u001a\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\bJ\u001f\u0010\u001b\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\bJ\u001f\u0010\u001c\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\bJ\u001f\u0010\u001d\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\bJ\u001f\u0010\u001e\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\bJ'\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b!\u0010\"J/\u0010$\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001f2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b$\u0010%J'\u0010'\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010&\u001a\u00020\u001fH\u0007¢\u0006\u0004\b'\u0010(J'\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u001f2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b*\u0010\"J/\u0010/\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u001fH\u0007¢\u0006\u0004\b/\u00100J/\u00101\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u001fH\u0007¢\u0006\u0004\b1\u00100J\u001f\u00102\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b2\u0010\bJ\u001f\u00103\u001a\u00020\u001f2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b3\u00104¨\u00065"}, m87232d2 = {"Ll/pul0;", "", "<init>", "()V", "Ll/h4t;", "presenter", "", "w", "(Ll/h4t;)V", "p", ResourceDirection.f38808v, "u", "", "isOpen", BLiveStormDanmakuGiftResourceType.f44446s, "(Z)V", Constants.KEY_T, "isApply", "g", "(Ll/h4t;Z)V", "f", BaseSei.f13931Y, BaseSei.f13930X, "e", "c", Constants.INAPP_DATA_TAG, "b", "k", "j", RXScreenCaptureService.KEY_INDEX, "h", "", "guestId", "n", "(Ljava/lang/String;Ll/h4t;)V", "clickArea", "m", "(Ljava/lang/String;Ljava/lang/String;Ll/h4t;)V", "eid", BaseSei.f13932Z, "(Ll/h4t;Ljava/lang/String;)V", "rankType", BLiveStormDanmakuGiftResourceType.f44444l, "receiverId", "anchorId", "roomId", "liveId", "r", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "q", "o", "a", "(Ll/h4t;)Ljava/lang/String;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class pul0 {

    @NotNull
    public static final pul0 INSTANCE = new pul0();

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m171444b(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        j760 j760VarM200311Y = vwb.m200311Y("anchorId", presenter.m206027E2().m132140j0());
        BLiveAbsData bLiveAbsDataM132152n0 = presenter.m206027E2().m132152n0();
        zvf0.m220399u("e_live_audio_auto_msg", "p_user_audio_room", j760VarM200311Y, vwb.m200311Y("liveId", bLiveAbsDataM132152n0 != null ? bLiveAbsDataM132152n0.f44323id : null), vwb.m200311Y("roomId", presenter.m206027E2().m149818o()), vwb.m200311Y("audio_message_type", "upgrade_clapping"), vwb.m200311Y("user_type", fbp0.m120391g(presenter)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m171445c(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        j760 j760VarM200311Y = vwb.m200311Y("anchorId", presenter.m206027E2().m132140j0());
        BLiveAbsData bLiveAbsDataM132152n0 = presenter.m206027E2().m132152n0();
        zvf0.m220399u("e_audio_owner_upgrade_pop", "p_anchor_audio_room", j760VarM200311Y, vwb.m200311Y("liveId", bLiveAbsDataM132152n0 != null ? bLiveAbsDataM132152n0.f44323id : null), vwb.m200311Y("roomId", presenter.m206027E2().m149818o()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m171446d(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        j760 j760VarM200311Y = vwb.m200311Y("anchorId", presenter.m206027E2().m132140j0());
        BLiveAbsData bLiveAbsDataM132152n0 = presenter.m206027E2().m132152n0();
        zvf0.m220368A("e_audio_owner_upgrade_pop", "p_anchor_audio_room", j760VarM200311Y, vwb.m200311Y("liveId", bLiveAbsDataM132152n0 != null ? bLiveAbsDataM132152n0.f44323id : null), vwb.m200311Y("roomId", presenter.m206027E2().m149818o()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m171447e(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        j760 j760VarM200311Y = vwb.m200311Y("anchorId", presenter.m206027E2().m132140j0());
        BLiveAbsData bLiveAbsDataM132152n0 = presenter.m206027E2().m132152n0();
        zvf0.m220399u("e_audio_room_owner_task_button", "p_anchor_audio_room", j760VarM200311Y, vwb.m200311Y("liveId", bLiveAbsDataM132152n0 != null ? bLiveAbsDataM132152n0.f44323id : null), vwb.m200311Y("roomId", presenter.m206027E2().m149818o()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m171448f(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        zvf0.m220399u("e_audio_auction_apply", "p_user_audio_room", vwb.m200311Y("anchorId", presenter.m206027E2().m132140j0()), vwb.m200311Y("roomId", presenter.m206027E2().m149818o()), vwb.m200311Y("user_type", fbp0.m120391g(presenter)));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m171449g(@NotNull h4t<?, ?> presenter, boolean isApply) {
        presenter.getClass();
        zvf0.m220399u(isApply ? "e_audio_auction_bid" : "e_audio_auction_join", e0o0.m114322h(presenter) ? "p_anchor_audio_room" : "p_user_audio_room", vwb.m200311Y("anchorId", presenter.m206027E2().m132140j0()), vwb.m200311Y("roomId", presenter.m206027E2().m149818o()), vwb.m200311Y("user_type", fbp0.m120391g(presenter)));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m171450h(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        String str = e0o0.m114322h(presenter) ? "p_anchor_audio_room" : "p_user_audio_room";
        j760 j760VarM200311Y = vwb.m200311Y("anchorId", presenter.m206027E2().m132140j0());
        BLiveAbsData bLiveAbsDataM132152n0 = presenter.m206027E2().m132152n0();
        zvf0.m220399u("e_live_audio_auto_msg", str, j760VarM200311Y, vwb.m200311Y("liveId", bLiveAbsDataM132152n0 != null ? bLiveAbsDataM132152n0.f44323id : null), vwb.m200311Y("roomId", presenter.m206027E2().m149818o()), vwb.m200311Y("audio_message_type", "check_auction_queue"), vwb.m200311Y("user_type", fbp0.m120391g(presenter)));
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m171451i(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        zvf0.m220396r("e_audio_auction_queue_red_dot", e0o0.m114322h(presenter) ? "p_anchor_audio_room" : "p_user_audio_room");
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m171452j(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        zvf0.m220402x("e_audio_auction_queue_red_dot", e0o0.m114322h(presenter) ? "p_anchor_audio_room" : "p_user_audio_room");
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m171453k(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        zvf0.m220402x("e_audio_auction_intro_bubble", e0o0.m114322h(presenter) ? "p_anchor_audio_room" : "p_user_audio_room");
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m171454l(@NotNull String rankType, @NotNull h4t<?, ?> presenter) {
        rankType.getClass();
        presenter.getClass();
        zvf0.m220368A("e_audio_auction_rank_list", "p_audio_auction_rank_list", vwb.m200311Y("rank_type", rankType));
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final void m171455m(@NotNull String guestId, @NotNull String clickArea, @NotNull h4t<?, ?> presenter) {
        guestId.getClass();
        clickArea.getClass();
        presenter.getClass();
        zvf0.m220399u("e_audio_auction_guest_avatar", e0o0.m114322h(presenter) ? "p_anchor_audio_room" : "p_user_audio_room", vwb.m200311Y("guest_user_id", guestId), vwb.m200311Y("avatar_type", clickArea));
    }

    @JvmStatic
    /* JADX INFO: renamed from: n */
    public static final void m171456n(@NotNull String guestId, @NotNull h4t<?, ?> presenter) {
        guestId.getClass();
        presenter.getClass();
        zvf0.m220368A("e_audio_auction_guest_avatar", e0o0.m114322h(presenter) ? "p_anchor_audio_room" : "p_user_audio_room", vwb.m200311Y("guest_user_id", guestId));
    }

    @JvmStatic
    /* JADX INFO: renamed from: o */
    public static final void m171457o(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        String strM199309D0 = ypv.f199493a.m199309D0();
        strM199309D0.getClass();
        zvf0.m220402x("e_audio_contribution", e0o0.m114328o(strM199309D0, presenter) ? "p_anchor_audio_room" : "p_user_audio_room");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final void m171458p(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        String strMo77274R2 = presenter.mo77274R2();
        j760 j760VarM200311Y = vwb.m200311Y("anchorId", presenter.m206027E2().m132140j0());
        BLiveAbsData bLiveAbsDataM132152n0 = presenter.m206027E2().m132152n0();
        zvf0.m220399u("e_audio_settle_apply_approve", strMo77274R2, j760VarM200311Y, vwb.m200311Y("liveId", bLiveAbsDataM132152n0 != null ? bLiveAbsDataM132152n0.f44323id : null), vwb.m200311Y("scene", "message"), vwb.m200311Y("user_type", presenter.m206032L2() ? "anchor" : "manager"));
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final void m171459q(@NotNull String receiverId, @NotNull String anchorId, @NotNull String roomId, @NotNull String liveId) {
        receiverId.getClass();
        anchorId.getClass();
        roomId.getClass();
        liveId.getClass();
        zvf0.m220399u("e_audio_greeting", "p_user_audio_room", vwb.m200311Y("anchorId", anchorId), vwb.m200311Y("roomId", roomId), vwb.m200311Y("liveId", liveId), vwb.m200311Y("receiver_user_id", receiverId));
    }

    @JvmStatic
    /* JADX INFO: renamed from: r */
    public static final void m171460r(@NotNull String receiverId, @NotNull String anchorId, @NotNull String roomId, @NotNull String liveId) {
        receiverId.getClass();
        anchorId.getClass();
        roomId.getClass();
        liveId.getClass();
        zvf0.m220368A("e_audio_greeting", "p_user_audio_room", vwb.m200311Y("anchorId", anchorId), vwb.m200311Y("roomId", roomId), vwb.m200311Y("liveId", liveId), vwb.m200311Y("receiver_user_id", receiverId));
    }

    @JvmStatic
    /* JADX INFO: renamed from: s */
    public static final void m171461s(boolean isOpen) {
        zvf0.m220399u("e_audio_settle_audit_switch", "p_audio_room_profile", vwb.m200311Y("switch_type", isOpen ? "open" : "close"));
    }

    @JvmStatic
    /* JADX INFO: renamed from: t */
    public static final void m171462t(boolean isOpen) {
        zvf0.m220399u("e_audio_open_room_switch", "p_audio_room_profile", vwb.m200311Y("switch_type", isOpen ? "open" : "close"));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: u */
    public static final void m171463u(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        l3f l3fVar = new l3f();
        l3fVar.f125895n = "p_audio_room_profile";
        l3fVar.f125885d = EventNameEnum.MODULE_CLICK;
        l3fVar.f125900s = "e_audio_settle_button";
        j760 j760VarM200311Y = vwb.m200311Y("anchorId", presenter.m206027E2().m132140j0());
        BLiveAbsData bLiveAbsDataM132152n0 = presenter.m206027E2().m132152n0();
        zvf0.m220393o(l3fVar, j760VarM200311Y, vwb.m200311Y("liveId", bLiveAbsDataM132152n0 != null ? bLiveAbsDataM132152n0.f44323id : null), vwb.m200311Y("roomId", presenter.m206027E2().m149818o()), vwb.m200311Y("live_settle_from", "room_profile"), vwb.m200311Y("user_type", INSTANCE.m171469a(presenter)));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: v */
    public static final void m171464v(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        l3f l3fVar = new l3f();
        l3fVar.f125895n = "p_audio_room_profile";
        l3fVar.f125885d = EventNameEnum.PAGE_VIEW;
        j760 j760VarM200311Y = vwb.m200311Y("anchorId", presenter.m206027E2().m132140j0());
        BLiveAbsData bLiveAbsDataM132152n0 = presenter.m206027E2().m132152n0();
        zvf0.m220393o(l3fVar, j760VarM200311Y, vwb.m200311Y("liveId", bLiveAbsDataM132152n0 != null ? bLiveAbsDataM132152n0.f44323id : null), vwb.m200311Y("roomId", presenter.m206027E2().m149818o()), vwb.m200311Y("user_type", INSTANCE.m171469a(presenter)));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r5v1, types: [l.ho2] */
    @JvmStatic
    /* JADX INFO: renamed from: w */
    public static final void m171465w(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        boolean zM114322h = e0o0.m114322h(presenter);
        String strMo77274R2 = presenter.mo77274R2();
        j760 j760VarM200311Y = vwb.m200311Y("anchorId", presenter.m206027E2().m132140j0());
        BLiveAbsData bLiveAbsDataM132152n0 = presenter.m206027E2().m132152n0();
        zvf0.m220399u("e_audio_settle_button", strMo77274R2, j760VarM200311Y, vwb.m200311Y("liveId", bLiveAbsDataM132152n0 != null ? bLiveAbsDataM132152n0.f44323id : null), vwb.m200311Y("live_settle_from", "top_button"), vwb.m200311Y("user_type", zM114322h ? "manager" : "passerby"));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: x */
    public static final void m171466x(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        j760 j760VarM200311Y = vwb.m200311Y("anchorId", presenter.m206027E2().m132140j0());
        BLiveAbsData bLiveAbsDataM132152n0 = presenter.m206027E2().m132152n0();
        zvf0.m220399u("e_audio_guide_drawer", "p_user_audio_room", j760VarM200311Y, vwb.m200311Y("liveId", bLiveAbsDataM132152n0 != null ? bLiveAbsDataM132152n0.f44323id : null), vwb.m200311Y("roomId", presenter.m206027E2().m149818o()), vwb.m200311Y("drawer_type", "settle"));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: y */
    public static final void m171467y(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        j760 j760VarM200311Y = vwb.m200311Y("anchorId", presenter.m206027E2().m132140j0());
        BLiveAbsData bLiveAbsDataM132152n0 = presenter.m206027E2().m132152n0();
        zvf0.m220368A("e_audio_guide_drawer", "p_user_audio_room", j760VarM200311Y, vwb.m200311Y("liveId", bLiveAbsDataM132152n0 != null ? bLiveAbsDataM132152n0.f44323id : null), vwb.m200311Y("roomId", presenter.m206027E2().m149818o()), vwb.m200311Y("drawer_type", "settle"));
    }

    @JvmStatic
    /* JADX INFO: renamed from: z */
    public static final void m171468z(@NotNull h4t<?, ?> presenter, @NotNull String eid) {
        presenter.getClass();
        eid.getClass();
        zvf0.m220396r(eid, e0o0.m114322h(presenter) ? "p_anchor_audio_room" : "p_user_audio_room");
    }

    /* JADX INFO: renamed from: a */
    public final String m171469a(h4t<?, ?> presenter) {
        if (e0o0.m114321g(presenter)) {
            return "anchor";
        }
        if (e0o0.m114322h(presenter)) {
            return "manager";
        }
        String strM199309D0 = ypv.f199493a.m199309D0();
        strM199309D0.getClass();
        return ((Boolean) presenter.m129297F3(new qul0(strM199309D0))).booleanValue() ? "member" : "passerby";
    }
}
