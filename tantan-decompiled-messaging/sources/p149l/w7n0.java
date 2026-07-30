package p149l;

import com.clevertap.android.sdk.Constants;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ'\u0010\f\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\rJ'\u0010\u000f\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Ll/w7n0;", "", "<init>", "()V", "Ll/h4t;", "presenter", "", "b", "(Ll/h4t;)V", "e", "", "gameType", "f", "(Ll/h4t;Ljava/lang/String;)V", Constants.INAPP_DATA_TAG, "c", "", "isAnchor", "a", "(Z)Ljava/lang/String;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class w7n0 {

    @NotNull
    public static final w7n0 INSTANCE = new w7n0();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m202024a(boolean isAnchor) {
        return isAnchor ? "p_anchor_audio_room" : "p_user_audio_room";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m202025b(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        ?? M206027E2 = presenter.m206027E2();
        M206027E2.getClass();
        zvf0.m220368A("e_audio_guide_message", m202024a(M206027E2.mo97490p()), vwb.m200311Y("liveId", M206027E2.m149814k()), vwb.m200311Y("anchorId", M206027E2.m132140j0()), vwb.m200311Y("roomId", M206027E2.m149818o()), vwb.m200311Y("user_type", fbp0.m120391g(presenter)), vwb.m200311Y("guide_type", "game"));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m202026c(@NotNull h4t<?, ?> presenter, @NotNull String gameType) {
        presenter.getClass();
        gameType.getClass();
        ?? M206027E2 = presenter.m206027E2();
        M206027E2.getClass();
        zvf0.m220399u("e_audio_choose_games", "p_audio_multimedia_panel", vwb.m200311Y("liveId", M206027E2.m149814k()), vwb.m200311Y("anchorId", M206027E2.m132140j0()), vwb.m200311Y("roomId", M206027E2.m149818o()), vwb.m200311Y("user_type", fbp0.m120391g(presenter)), vwb.m200311Y("game_type", gameType));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m202027d(@NotNull h4t<?, ?> presenter, @NotNull String gameType) {
        presenter.getClass();
        gameType.getClass();
        ?? M206027E2 = presenter.m206027E2();
        M206027E2.getClass();
        zvf0.m220399u("e_audio_start_games_button", "p_audio_multimedia_panel", vwb.m200311Y("liveId", M206027E2.m149814k()), vwb.m200311Y("anchorId", M206027E2.m132140j0()), vwb.m200311Y("roomId", M206027E2.m149818o()), vwb.m200311Y("user_type", fbp0.m120391g(presenter)), vwb.m200311Y("game_type", gameType));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m202028e(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        l3f l3fVar = new l3f();
        ?? M206027E2 = presenter.m206027E2();
        M206027E2.getClass();
        l3fVar.f125885d = EventNameEnum.PAGE_VIEW;
        l3fVar.f125895n = "p_audio_multimedia_panel";
        zvf0.m220393o(l3fVar, vwb.m200311Y("liveId", M206027E2.m149814k()), vwb.m200311Y("anchorId", M206027E2.m132140j0()), vwb.m200311Y("roomId", M206027E2.m149818o()), vwb.m200311Y("user_type", fbp0.m120391g(presenter)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m202029f(@NotNull h4t<?, ?> presenter, @NotNull String gameType) {
        presenter.getClass();
        gameType.getClass();
        ?? M206027E2 = presenter.m206027E2();
        M206027E2.getClass();
        zvf0.m220399u("e_audio_choose_games", "p_audio_multimedia_panel", vwb.m200311Y("liveId", M206027E2.m149814k()), vwb.m200311Y("anchorId", M206027E2.m132140j0()), vwb.m200311Y("roomId", M206027E2.m149818o()), vwb.m200311Y("game_type", gameType), vwb.m200311Y("user_type", fbp0.m120391g(presenter)));
    }
}
