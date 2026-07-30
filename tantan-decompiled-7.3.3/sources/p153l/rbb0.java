package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.data.BoostLimit;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR(\u0010&\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010 \u0012\u0004\b%\u0010\u0003\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R0\u0010.\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010'8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010(\u0012\u0004\b-\u0010\u0003\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R*\u00107\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b0\u00101\u0012\u0004\b6\u0010\u0003\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u0010;\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000e\u00101\u0012\u0004\b:\u0010\u0003\u001a\u0004\b8\u00103\"\u0004\b9\u00105R*\u0010@\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b<\u00101\u0012\u0004\b?\u0010\u0003\u001a\u0004\b=\u00103\"\u0004\b>\u00105R*\u0010D\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b2\u00101\u0012\u0004\bC\u0010\u0003\u001a\u0004\bA\u00103\"\u0004\bB\u00105¨\u0006E"}, m88121d2 = {"Ll/rbb0;", "", "<init>", "()V", "Lcom/p1/mobile/putong/data/Counter;", Counter.TYPE, "", "r", "(Lcom/p1/mobile/putong/data/Counter;)Z", "counterAll", "u", "o", "()Z", "", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/data/Counter;)I", "p", "", "w", "", RXScreenCaptureService.KEY_INDEX, "()J", "g", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "h", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)I", "", "from", "b", "(Ljava/lang/String;)Z", "a", "I", BLiveStormDanmakuGiftResourceType.f45292l, "()I", BaseSei.f14626Z, "(I)V", "getSwipeNotMatchLikersNum$annotations", "swipeNotMatchLikersNum", "", "Ljava/util/List;", "k", "()Ljava/util/List;", BaseSei.f14625Y, "(Ljava/util/List;)V", "getSwipeNotMatchAvatarUrls$annotations", "swipeNotMatchAvatarUrls", "Lcom/p1/mobile/putong/data/User;", "c", "Lcom/p1/mobile/putong/data/User;", "f", "()Lcom/p1/mobile/putong/data/User;", BaseSei.f14624X, "(Lcom/p1/mobile/putong/data/User;)V", "getLikedUser$annotations", "likedUser", "m", "setUndoUser", "getUndoUser$annotations", "undoUser", "e", "j", "setSuperLikeUser", "getSuperLikeUser$annotations", "superLikeUser", "n", "setUnlimitedLikeUser", "getUnlimitedLikeUser$annotations", "unlimitedLikeUser", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class rbb0 {

    @NotNull
    public static final rbb0 INSTANCE = new rbb0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static int swipeNotMatchLikersNum;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static List<String> swipeNotMatchAvatarUrls;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static User likedUser;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static User undoUser;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public static User superLikeUser;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public static User unlimitedLikeUser;

    /* JADX INFO: renamed from: a */
    public static Boolean m180730a(String str, String str2) {
        return Boolean.valueOf(TextUtils.equals(str2, str));
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: c */
    public static final int m180731c() {
        return m180733e(null, 1, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: d */
    public static final int m180732d(@Nullable Counter counter) {
        int i = 0;
        if (counter != null) {
            Iterator<BoostLimit> it = counter.boostLimits.iterator();
            while (it.hasNext()) {
                i += it.next().remaining;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m180733e(Counter counter, int i, Object obj) {
        if ((i & 1) != 0) {
            counter = CoreModule.f18264c.m32487o3();
        }
        return m180732d(counter);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static final User m180734f() {
        return likedUser;
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final long m180735g() {
        if (NullChecker.m82486a(CoreModule.f18264c.m32487o3())) {
            return (long) CoreModule.f18264c.m32487o3().likersLimit.expiresTime;
        }
        return 0L;
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final long m180736i() {
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        if (counterM32487o3 == null) {
            return 0L;
        }
        double d = counterM32487o3.likersLimit.expiresTime;
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return (long) (d - uqb0.f180376H.guessedCurrentServerTime());
        }
        return 0L;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static final User m180737j() {
        return superLikeUser;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static final List<String> m180738k() {
        return swipeNotMatchAvatarUrls;
    }

    /* JADX INFO: renamed from: l */
    public static final int m180739l() {
        return swipeNotMatchLikersNum;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public static final User m180740m() {
        return undoUser;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static final User m180741n() {
        return unlimitedLikeUser;
    }

    @JvmStatic
    /* JADX INFO: renamed from: o */
    public static final boolean m180742o() {
        return m180733e(null, 1, null) <= 0;
    }

    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final boolean m180743p() {
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        return NullChecker.m82486a(counterM32487o3) && counterM32487o3.boostLimits.size() > 0;
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: q */
    public static final boolean m180744q() {
        return m180746s(null, 1, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: r */
    public static final boolean m180745r(@Nullable Counter counter) {
        return counter == null || counter.likersLimit.remaining <= 0;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ boolean m180746s(Counter counter, int i, Object obj) {
        if ((i & 1) != 0) {
            counter = CoreModule.f18264c.m32487o3();
        }
        return m180745r(counter);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: t */
    public static final boolean m180747t() {
        return m180749v(null, 1, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: u */
    public static final boolean m180748u(@Nullable Counter counterAll) {
        if (!NullChecker.m82486a(counterAll != null ? counterAll.likeLimit : null)) {
            return true;
        }
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterAll != null ? counterAll.superLikeLimit : null;
        return (counterSuperlikeAndUndoLimit != null ? counterSuperlikeAndUndoLimit.remainToday() : 0) == 0;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ boolean m180749v(Counter counter, int i, Object obj) {
        if ((i & 1) != 0) {
            counter = CoreModule.f18264c.m32487o3();
        }
        return m180748u(counter);
    }

    @JvmStatic
    /* JADX INFO: renamed from: w */
    public static final void m180750w() {
        superLikeUser = null;
        undoUser = null;
        unlimitedLikeUser = null;
        j690.m143607B(false);
    }

    /* JADX INFO: renamed from: x */
    public static final void m180751x(@Nullable User user) {
        likedUser = user;
    }

    /* JADX INFO: renamed from: y */
    public static final void m180752y(@Nullable List<String> list) {
        swipeNotMatchAvatarUrls = list;
    }

    /* JADX INFO: renamed from: z */
    public static final void m180753z(int i) {
        swipeNotMatchLikersNum = i;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m180754b(@NotNull final String from) {
        from.getClass();
        ArrayList arrayListM147507f0 = jyb.m147507f0("p_suggest_users_home_view,e_undo_button,click", "p_suggest_users_home_view,e_card,like_swipe", "p_home,likelimit", "NA,NA,salecountdown", "p_select_location_view,e_my_roam_location,click", "p_suggest_users_home_view,e_superlike,click", "p_select_location_view,e_manyou,click", "p_profile,superlike", "p_suggest_user_profile_info_view,e_profile_comment_button,click", "home_superlike_send_superlike", "p_auto_renew_subscriptions_management_view,e_auto_renew_subscriptions_change,click", "p_suggest_users_home_view,e_undo_reminder_toast,click", "p_suggest_users_home_view,e_see_reminder,click", "p_home_location,manyou", "p_settings_location,manyou", "p_home,undo", "p_home,superlike", "p_navigation_disliked,card_button_pull");
        arrayListM147507f0.getClass();
        if (CoreModule.m30933P().m143405a().mo34356Kj()) {
            arrayListM147507f0.add("p_home,verification_card");
        }
        return jyb.m147520m(arrayListM147507f0, new qcj() { // from class: l.qbb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return rbb0.m180730a(from, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final int m180755h(@Nullable PurchaseType type) {
        return -1;
    }
}
