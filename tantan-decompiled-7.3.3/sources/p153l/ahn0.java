package p153l;

import com.clevertap.android.sdk.Constants;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ'\u0010\f\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\rJ'\u0010\u000f\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Ll/ahn0;", "", "<init>", "()V", "Ll/i6t;", "presenter", "", "b", "(Ll/i6t;)V", "e", "", "gameType", "f", "(Ll/i6t;Ljava/lang/String;)V", Constants.INAPP_DATA_TAG, "c", "", "isAnchor", "a", "(Z)Ljava/lang/String;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ahn0 {

    @NotNull
    public static final ahn0 INSTANCE = new ahn0();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m97859a(boolean isAnchor) {
        return isAnchor ? "p_anchor_audio_room" : "p_user_audio_room";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m97860b(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        ?? M213810E2 = presenter.m213810E2();
        M213810E2.getClass();
        i4g0.m138492A("e_audio_guide_message", m97859a(M213810E2.mo118373p()), jyb.m147494Y("liveId", M213810E2.m202191k()), jyb.m147494Y("anchorId", M213810E2.m168526j0()), jyb.m147494Y("roomId", M213810E2.m202194o()), jyb.m147494Y("user_type", jkp0.m145876g(presenter)), jyb.m147494Y("guide_type", "game"));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m97861c(@NotNull i6t<?, ?> presenter, @NotNull String gameType) {
        presenter.getClass();
        gameType.getClass();
        ?? M213810E2 = presenter.m213810E2();
        M213810E2.getClass();
        i4g0.m138523u("e_audio_choose_games", "p_audio_multimedia_panel", jyb.m147494Y("liveId", M213810E2.m202191k()), jyb.m147494Y("anchorId", M213810E2.m168526j0()), jyb.m147494Y("roomId", M213810E2.m202194o()), jyb.m147494Y("user_type", jkp0.m145876g(presenter)), jyb.m147494Y("game_type", gameType));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m97862d(@NotNull i6t<?, ?> presenter, @NotNull String gameType) {
        presenter.getClass();
        gameType.getClass();
        ?? M213810E2 = presenter.m213810E2();
        M213810E2.getClass();
        i4g0.m138523u("e_audio_start_games_button", "p_audio_multimedia_panel", jyb.m147494Y("liveId", M213810E2.m202191k()), jyb.m147494Y("anchorId", M213810E2.m168526j0()), jyb.m147494Y("roomId", M213810E2.m202194o()), jyb.m147494Y("user_type", jkp0.m145876g(presenter)), jyb.m147494Y("game_type", gameType));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m97863e(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        q4f q4fVar = new q4f();
        ?? M213810E2 = presenter.m213810E2();
        M213810E2.getClass();
        q4fVar.f155566d = EventNameEnum.PAGE_VIEW;
        q4fVar.f155576n = "p_audio_multimedia_panel";
        i4g0.m138517o(q4fVar, jyb.m147494Y("liveId", M213810E2.m202191k()), jyb.m147494Y("anchorId", M213810E2.m168526j0()), jyb.m147494Y("roomId", M213810E2.m202194o()), jyb.m147494Y("user_type", jkp0.m145876g(presenter)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m97864f(@NotNull i6t<?, ?> presenter, @NotNull String gameType) {
        presenter.getClass();
        gameType.getClass();
        ?? M213810E2 = presenter.m213810E2();
        M213810E2.getClass();
        i4g0.m138523u("e_audio_choose_games", "p_audio_multimedia_panel", jyb.m147494Y("liveId", M213810E2.m202191k()), jyb.m147494Y("anchorId", M213810E2.m168526j0()), jyb.m147494Y("roomId", M213810E2.m202194o()), jyb.m147494Y("game_type", gameType), jyb.m147494Y("user_type", jkp0.m145876g(presenter)));
    }
}
