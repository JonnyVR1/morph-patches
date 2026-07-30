package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Ll/f760;", "", "<init>", "()V", "Companion", "a", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class f760 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public static c1f0 f97484a;

    /* JADX INFO: renamed from: b */
    public static long f97485b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static String f97486c = "";

    /* JADX INFO: renamed from: l.f760$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u0010J\u0015\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010\u0010J\u0015\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u0006¢\u0006\u0004\b$\u0010\u0018J\r\u0010%\u001a\u00020\u000b¢\u0006\u0004\b%\u0010\u0003J\r\u0010&\u001a\u00020\u000e¢\u0006\u0004\b&\u0010\u0010J\r\u0010'\u001a\u00020\u000e¢\u0006\u0004\b'\u0010\u0010J\u0015\u0010*\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.R\"\u0010/\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0016\"\u0004\b2\u0010\u0018R\u001e\u00104\u001a\u0004\u0018\u0001038B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, m88121d2 = {"Ll/f760$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "userId", "from", "", "type", "", "a", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/String;I)V", "", "m", "()Z", "", "time", "n", "(J)V", "g", "()Ljava/lang/String;", "q", "(Ljava/lang/String;)V", "f", "(Ljava/lang/String;)Ljava/lang/String;", "text", "p", "(Ljava/lang/String;Ljava/lang/String;)V", "e", "isRead", "o", "(Z)V", "r", "conVersionId", "b", "c", "j", BLiveStormDanmakuGiftResourceType.f45292l, "Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;", "otherInfo", "k", "(Lcom/p1/mobile/putong/core/api/CoreSuggested$UserInfo;)Z", "id", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)Z", "currentTopOutLikeCardId", "Ljava/lang/String;", Constants.INAPP_DATA_TAG, "setCurrentTopOutLikeCardId", "Ll/c1f0;", "shareDataManager", "Ll/c1f0;", "h", "()Ll/c1f0;", "LeastClickTime", "J", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m124354a(@Nullable Act act, @NotNull String userId, @Nullable String from, int type) {
            userId.getClass();
            if (act != null && System.currentTimeMillis() - f760.f97485b > 300) {
                f760.f97485b = System.currentTimeMillis();
                act.startActivityWithCustomTransition(CoreModule.m30933P().m143405a().mo34554n8(act, jyb.m147507f0(userId), type, new ArrayList<>(), from), CoreModule.m30933P().m143405a().mo34515hg(act));
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m124355b(@NotNull String conVersionId) {
            conVersionId.getClass();
            CoreModule.f18264c.f20350T1.m137305s3(conVersionId);
        }

        /* JADX INFO: renamed from: c */
        public final void m124356c() {
            CoreModule.f18264c.f20350T1.m137304o3();
            CoreModule.f18264c.f20350T1.m137302G3(null);
            m124370q("");
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final String m124357d() {
            return f760.f97486c;
        }

        /* JADX INFO: renamed from: e */
        public final boolean m124358e() {
            Boolean bool = new jxd0("core_receive_like_local_message_unread" + CoreModule.m30929H().userId(), Boolean.FALSE).get();
            bool.getClass();
            return bool.booleanValue();
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final String m124359f(@NotNull String userId) {
            userId.getClass();
            String str = new wyd0("core_receive_like_local_text" + userId, "").get();
            str.getClass();
            return str;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final String m124360g() {
            wyd0 wyd0VarM107609b;
            String str;
            c1f0 c1f0VarM124361h = m124361h();
            return (c1f0VarM124361h == null || (wyd0VarM107609b = c1f0VarM124361h.getLocalReceiveLikeUserId()) == null || (str = wyd0VarM107609b.get()) == null) ? "" : str;
        }

        /* JADX INFO: renamed from: h */
        public final c1f0 m124361h() {
            if (f760.f97484a == null) {
                f760.f97484a = new c1f0();
            }
            return f760.f97484a;
        }

        /* JADX INFO: renamed from: i */
        public final boolean m124362i(@NotNull String id) {
            id.getClass();
            return rs9.INSTANCE.m182944d() && TextUtils.equals(id, m124357d());
        }

        /* JADX INFO: renamed from: j */
        public final boolean m124363j() {
            return (ric0.INSTANCE.m181594b() && C21545y9.INSTANCE.m214797k()) ? false : true;
        }

        /* JADX INFO: renamed from: k */
        public final boolean m124364k(@NotNull CoreSuggested.UserInfo otherInfo) {
            otherInfo.getClass();
            Cfor cfor = Cfor.INSTANCE;
            String str = otherInfo.f20214id;
            str.getClass();
            return cfor.m126495f(str);
        }

        /* JADX INFO: renamed from: l */
        public final boolean m124365l() {
            return RemoteConfig.m80481x().m80513s("vas_enable_member_exclusive_liked_me_tag");
        }

        /* JADX INFO: renamed from: m */
        public final boolean m124366m() {
            return false;
        }

        /* JADX INFO: renamed from: n */
        public final void m124367n(long time) {
            byd0 byd0VarM107608a;
            c1f0 c1f0VarM124361h = m124361h();
            if (c1f0VarM124361h == null || (byd0VarM107608a = c1f0VarM124361h.getLeastLikedTime()) == null) {
                return;
            }
            byd0VarM107608a.put(Long.valueOf(time));
        }

        /* JADX INFO: renamed from: o */
        public final void m124368o(boolean isRead) {
            new jxd0("core_receive_like_local_message_unread" + CoreModule.m30929H().userId(), Boolean.FALSE).put(Boolean.valueOf(isRead));
        }

        /* JADX INFO: renamed from: p */
        public final void m124369p(@NotNull String text, @NotNull String userId) {
            text.getClass();
            userId.getClass();
            new wyd0("core_receive_like_local_text" + userId, "").put(text);
        }

        /* JADX INFO: renamed from: q */
        public final void m124370q(@NotNull String userId) {
            wyd0 wyd0VarM107609b;
            userId.getClass();
            c1f0 c1f0VarM124361h = m124361h();
            if (c1f0VarM124361h == null || (wyd0VarM107609b = c1f0VarM124361h.getLocalReceiveLikeUserId()) == null) {
                return;
            }
            wyd0VarM107609b.put(userId);
        }

        /* JADX INFO: renamed from: r */
        public final boolean m124371r() {
            return false;
        }

        public Companion() {
        }
    }
}
