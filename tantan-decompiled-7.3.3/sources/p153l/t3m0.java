package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ'\u0010\u0012\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\bJ\u001f\u0010\u0015\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\bJ\u001f\u0010\u0016\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\bJ\u001f\u0010\u0017\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\bJ\u001f\u0010\u0018\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\bJ\u001f\u0010\u0019\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\bJ\u001f\u0010\u001a\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\bJ\u001f\u0010\u001b\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\bJ\u001f\u0010\u001c\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\bJ\u001f\u0010\u001d\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\bJ\u001f\u0010\u001e\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\bJ'\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b!\u0010\"J/\u0010$\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001f2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b$\u0010%J'\u0010'\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010&\u001a\u00020\u001fH\u0007¢\u0006\u0004\b'\u0010(J'\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u001f2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b*\u0010\"J/\u0010/\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u001fH\u0007¢\u0006\u0004\b/\u00100J/\u00101\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u001fH\u0007¢\u0006\u0004\b1\u00100J\u001f\u00102\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b2\u0010\bJ\u001f\u00103\u001a\u00020\u001f2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b3\u00104¨\u00065"}, m88121d2 = {"Ll/t3m0;", "", "<init>", "()V", "Ll/i6t;", "presenter", "", "w", "(Ll/i6t;)V", "p", ResourceDirection.f39656v, "u", "", "isOpen", BLiveStormDanmakuGiftResourceType.f45294s, "(Z)V", Constants.KEY_T, "isApply", "g", "(Ll/i6t;Z)V", "f", BaseSei.f14625Y, BaseSei.f14624X, "e", "c", Constants.INAPP_DATA_TAG, "b", "k", "j", RXScreenCaptureService.KEY_INDEX, "h", "", "guestId", "n", "(Ljava/lang/String;Ll/i6t;)V", "clickArea", "m", "(Ljava/lang/String;Ljava/lang/String;Ll/i6t;)V", "eid", BaseSei.f14626Z, "(Ll/i6t;Ljava/lang/String;)V", "rankType", BLiveStormDanmakuGiftResourceType.f45292l, "receiverId", "anchorId", "roomId", "liveId", "r", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "q", "o", "a", "(Ll/i6t;)Ljava/lang/String;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class t3m0 {

    @NotNull
    public static final t3m0 INSTANCE = new t3m0();

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m189088b(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        pf60 pf60VarM147494Y = jyb.m147494Y("anchorId", presenter.m213810E2().m168526j0());
        BLiveAbsData bLiveAbsDataM168538n0 = presenter.m213810E2().m168538n0();
        i4g0.m138523u("e_live_audio_auto_msg", "p_user_audio_room", pf60VarM147494Y, jyb.m147494Y("liveId", bLiveAbsDataM168538n0 != null ? bLiveAbsDataM168538n0.f45171id : null), jyb.m147494Y("roomId", presenter.m213810E2().m202194o()), jyb.m147494Y("audio_message_type", "upgrade_clapping"), jyb.m147494Y("user_type", jkp0.m145876g(presenter)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m189089c(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        pf60 pf60VarM147494Y = jyb.m147494Y("anchorId", presenter.m213810E2().m168526j0());
        BLiveAbsData bLiveAbsDataM168538n0 = presenter.m213810E2().m168538n0();
        i4g0.m138523u("e_audio_owner_upgrade_pop", "p_anchor_audio_room", pf60VarM147494Y, jyb.m147494Y("liveId", bLiveAbsDataM168538n0 != null ? bLiveAbsDataM168538n0.f45171id : null), jyb.m147494Y("roomId", presenter.m213810E2().m202194o()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m189090d(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        pf60 pf60VarM147494Y = jyb.m147494Y("anchorId", presenter.m213810E2().m168526j0());
        BLiveAbsData bLiveAbsDataM168538n0 = presenter.m213810E2().m168538n0();
        i4g0.m138492A("e_audio_owner_upgrade_pop", "p_anchor_audio_room", pf60VarM147494Y, jyb.m147494Y("liveId", bLiveAbsDataM168538n0 != null ? bLiveAbsDataM168538n0.f45171id : null), jyb.m147494Y("roomId", presenter.m213810E2().m202194o()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m189091e(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        pf60 pf60VarM147494Y = jyb.m147494Y("anchorId", presenter.m213810E2().m168526j0());
        BLiveAbsData bLiveAbsDataM168538n0 = presenter.m213810E2().m168538n0();
        i4g0.m138523u("e_audio_room_owner_task_button", "p_anchor_audio_room", pf60VarM147494Y, jyb.m147494Y("liveId", bLiveAbsDataM168538n0 != null ? bLiveAbsDataM168538n0.f45171id : null), jyb.m147494Y("roomId", presenter.m213810E2().m202194o()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m189092f(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        i4g0.m138523u("e_audio_auction_apply", "p_user_audio_room", jyb.m147494Y("anchorId", presenter.m213810E2().m168526j0()), jyb.m147494Y("roomId", presenter.m213810E2().m202194o()), jyb.m147494Y("user_type", jkp0.m145876g(presenter)));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m189093g(@NotNull i6t<?, ?> presenter, boolean isApply) {
        presenter.getClass();
        i4g0.m138523u(isApply ? "e_audio_auction_bid" : "e_audio_auction_join", i9o0.m139137h(presenter) ? "p_anchor_audio_room" : "p_user_audio_room", jyb.m147494Y("anchorId", presenter.m213810E2().m168526j0()), jyb.m147494Y("roomId", presenter.m213810E2().m202194o()), jyb.m147494Y("user_type", jkp0.m145876g(presenter)));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m189094h(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        String str = i9o0.m139137h(presenter) ? "p_anchor_audio_room" : "p_user_audio_room";
        pf60 pf60VarM147494Y = jyb.m147494Y("anchorId", presenter.m213810E2().m168526j0());
        BLiveAbsData bLiveAbsDataM168538n0 = presenter.m213810E2().m168538n0();
        i4g0.m138523u("e_live_audio_auto_msg", str, pf60VarM147494Y, jyb.m147494Y("liveId", bLiveAbsDataM168538n0 != null ? bLiveAbsDataM168538n0.f45171id : null), jyb.m147494Y("roomId", presenter.m213810E2().m202194o()), jyb.m147494Y("audio_message_type", "check_auction_queue"), jyb.m147494Y("user_type", jkp0.m145876g(presenter)));
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m189095i(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        i4g0.m138520r("e_audio_auction_queue_red_dot", i9o0.m139137h(presenter) ? "p_anchor_audio_room" : "p_user_audio_room");
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m189096j(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        i4g0.m138526x("e_audio_auction_queue_red_dot", i9o0.m139137h(presenter) ? "p_anchor_audio_room" : "p_user_audio_room");
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m189097k(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        i4g0.m138526x("e_audio_auction_intro_bubble", i9o0.m139137h(presenter) ? "p_anchor_audio_room" : "p_user_audio_room");
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m189098l(@NotNull String rankType, @NotNull i6t<?, ?> presenter) {
        rankType.getClass();
        presenter.getClass();
        i4g0.m138492A("e_audio_auction_rank_list", "p_audio_auction_rank_list", jyb.m147494Y("rank_type", rankType));
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final void m189099m(@NotNull String guestId, @NotNull String clickArea, @NotNull i6t<?, ?> presenter) {
        guestId.getClass();
        clickArea.getClass();
        presenter.getClass();
        i4g0.m138523u("e_audio_auction_guest_avatar", i9o0.m139137h(presenter) ? "p_anchor_audio_room" : "p_user_audio_room", jyb.m147494Y("guest_user_id", guestId), jyb.m147494Y("avatar_type", clickArea));
    }

    @JvmStatic
    /* JADX INFO: renamed from: n */
    public static final void m189100n(@NotNull String guestId, @NotNull i6t<?, ?> presenter) {
        guestId.getClass();
        presenter.getClass();
        i4g0.m138492A("e_audio_auction_guest_avatar", i9o0.m139137h(presenter) ? "p_anchor_audio_room" : "p_user_audio_room", jyb.m147494Y("guest_user_id", guestId));
    }

    @JvmStatic
    /* JADX INFO: renamed from: o */
    public static final void m189101o(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        String strM207631D0 = zrv.f205799a.m207631D0();
        strM207631D0.getClass();
        i4g0.m138526x("e_audio_contribution", i9o0.m139143o(strM207631D0, presenter) ? "p_anchor_audio_room" : "p_user_audio_room");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final void m189102p(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        String strMo78457R2 = presenter.mo78457R2();
        pf60 pf60VarM147494Y = jyb.m147494Y("anchorId", presenter.m213810E2().m168526j0());
        BLiveAbsData bLiveAbsDataM168538n0 = presenter.m213810E2().m168538n0();
        i4g0.m138523u("e_audio_settle_apply_approve", strMo78457R2, pf60VarM147494Y, jyb.m147494Y("liveId", bLiveAbsDataM168538n0 != null ? bLiveAbsDataM168538n0.f45171id : null), jyb.m147494Y("scene", "message"), jyb.m147494Y("user_type", presenter.m213815L2() ? "anchor" : "manager"));
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final void m189103q(@NotNull String receiverId, @NotNull String anchorId, @NotNull String roomId, @NotNull String liveId) {
        receiverId.getClass();
        anchorId.getClass();
        roomId.getClass();
        liveId.getClass();
        i4g0.m138523u("e_audio_greeting", "p_user_audio_room", jyb.m147494Y("anchorId", anchorId), jyb.m147494Y("roomId", roomId), jyb.m147494Y("liveId", liveId), jyb.m147494Y("receiver_user_id", receiverId));
    }

    @JvmStatic
    /* JADX INFO: renamed from: r */
    public static final void m189104r(@NotNull String receiverId, @NotNull String anchorId, @NotNull String roomId, @NotNull String liveId) {
        receiverId.getClass();
        anchorId.getClass();
        roomId.getClass();
        liveId.getClass();
        i4g0.m138492A("e_audio_greeting", "p_user_audio_room", jyb.m147494Y("anchorId", anchorId), jyb.m147494Y("roomId", roomId), jyb.m147494Y("liveId", liveId), jyb.m147494Y("receiver_user_id", receiverId));
    }

    @JvmStatic
    /* JADX INFO: renamed from: s */
    public static final void m189105s(boolean isOpen) {
        i4g0.m138523u("e_audio_settle_audit_switch", "p_audio_room_profile", jyb.m147494Y("switch_type", isOpen ? "open" : "close"));
    }

    @JvmStatic
    /* JADX INFO: renamed from: t */
    public static final void m189106t(boolean isOpen) {
        i4g0.m138523u("e_audio_open_room_switch", "p_audio_room_profile", jyb.m147494Y("switch_type", isOpen ? "open" : "close"));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: u */
    public static final void m189107u(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        q4f q4fVar = new q4f();
        q4fVar.f155576n = "p_audio_room_profile";
        q4fVar.f155566d = EventNameEnum.MODULE_CLICK;
        q4fVar.f155581s = "e_audio_settle_button";
        pf60 pf60VarM147494Y = jyb.m147494Y("anchorId", presenter.m213810E2().m168526j0());
        BLiveAbsData bLiveAbsDataM168538n0 = presenter.m213810E2().m168538n0();
        i4g0.m138517o(q4fVar, pf60VarM147494Y, jyb.m147494Y("liveId", bLiveAbsDataM168538n0 != null ? bLiveAbsDataM168538n0.f45171id : null), jyb.m147494Y("roomId", presenter.m213810E2().m202194o()), jyb.m147494Y("live_settle_from", "room_profile"), jyb.m147494Y("user_type", INSTANCE.m189113a(presenter)));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: v */
    public static final void m189108v(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        q4f q4fVar = new q4f();
        q4fVar.f155576n = "p_audio_room_profile";
        q4fVar.f155566d = EventNameEnum.PAGE_VIEW;
        pf60 pf60VarM147494Y = jyb.m147494Y("anchorId", presenter.m213810E2().m168526j0());
        BLiveAbsData bLiveAbsDataM168538n0 = presenter.m213810E2().m168538n0();
        i4g0.m138517o(q4fVar, pf60VarM147494Y, jyb.m147494Y("liveId", bLiveAbsDataM168538n0 != null ? bLiveAbsDataM168538n0.f45171id : null), jyb.m147494Y("roomId", presenter.m213810E2().m202194o()), jyb.m147494Y("user_type", INSTANCE.m189113a(presenter)));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r5v1, types: [l.oo2] */
    @JvmStatic
    /* JADX INFO: renamed from: w */
    public static final void m189109w(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        boolean zM139137h = i9o0.m139137h(presenter);
        String strMo78457R2 = presenter.mo78457R2();
        pf60 pf60VarM147494Y = jyb.m147494Y("anchorId", presenter.m213810E2().m168526j0());
        BLiveAbsData bLiveAbsDataM168538n0 = presenter.m213810E2().m168538n0();
        i4g0.m138523u("e_audio_settle_button", strMo78457R2, pf60VarM147494Y, jyb.m147494Y("liveId", bLiveAbsDataM168538n0 != null ? bLiveAbsDataM168538n0.f45171id : null), jyb.m147494Y("live_settle_from", "top_button"), jyb.m147494Y("user_type", zM139137h ? "manager" : "passerby"));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: x */
    public static final void m189110x(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        pf60 pf60VarM147494Y = jyb.m147494Y("anchorId", presenter.m213810E2().m168526j0());
        BLiveAbsData bLiveAbsDataM168538n0 = presenter.m213810E2().m168538n0();
        i4g0.m138523u("e_audio_guide_drawer", "p_user_audio_room", pf60VarM147494Y, jyb.m147494Y("liveId", bLiveAbsDataM168538n0 != null ? bLiveAbsDataM168538n0.f45171id : null), jyb.m147494Y("roomId", presenter.m213810E2().m202194o()), jyb.m147494Y("drawer_type", "settle"));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: y */
    public static final void m189111y(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        pf60 pf60VarM147494Y = jyb.m147494Y("anchorId", presenter.m213810E2().m168526j0());
        BLiveAbsData bLiveAbsDataM168538n0 = presenter.m213810E2().m168538n0();
        i4g0.m138492A("e_audio_guide_drawer", "p_user_audio_room", pf60VarM147494Y, jyb.m147494Y("liveId", bLiveAbsDataM168538n0 != null ? bLiveAbsDataM168538n0.f45171id : null), jyb.m147494Y("roomId", presenter.m213810E2().m202194o()), jyb.m147494Y("drawer_type", "settle"));
    }

    @JvmStatic
    /* JADX INFO: renamed from: z */
    public static final void m189112z(@NotNull i6t<?, ?> presenter, @NotNull String eid) {
        presenter.getClass();
        eid.getClass();
        i4g0.m138520r(eid, i9o0.m139137h(presenter) ? "p_anchor_audio_room" : "p_user_audio_room");
    }

    /* JADX INFO: renamed from: a */
    public final String m189113a(i6t<?, ?> presenter) {
        if (i9o0.m139136g(presenter)) {
            return "anchor";
        }
        if (i9o0.m139137h(presenter)) {
            return "manager";
        }
        String strM207631D0 = zrv.f205799a.m207631D0();
        strM207631D0.getClass();
        return ((Boolean) presenter.m138856F3(new u3m0(strM207631D0))).booleanValue() ? "member" : "passerby";
    }
}
