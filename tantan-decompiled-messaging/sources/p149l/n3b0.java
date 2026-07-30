package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.data.BoostLimit;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m87231d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR(\u0010&\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010 \u0012\u0004\b%\u0010\u0003\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R0\u0010.\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010'8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010(\u0012\u0004\b-\u0010\u0003\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R*\u00107\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b0\u00101\u0012\u0004\b6\u0010\u0003\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u0010;\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000e\u00101\u0012\u0004\b:\u0010\u0003\u001a\u0004\b8\u00103\"\u0004\b9\u00105R*\u0010@\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b<\u00101\u0012\u0004\b?\u0010\u0003\u001a\u0004\b=\u00103\"\u0004\b>\u00105R*\u0010D\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b2\u00101\u0012\u0004\bC\u0010\u0003\u001a\u0004\bA\u00103\"\u0004\bB\u00105¨\u0006E"}, m87232d2 = {"Ll/n3b0;", "", "<init>", "()V", "Lcom/p1/mobile/putong/data/Counter;", Counter.TYPE, "", "r", "(Lcom/p1/mobile/putong/data/Counter;)Z", "counterAll", "u", "o", "()Z", "", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/data/Counter;)I", "p", "", "w", "", RXScreenCaptureService.KEY_INDEX, "()J", "g", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "h", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)I", "", "from", "b", "(Ljava/lang/String;)Z", "a", "I", BLiveStormDanmakuGiftResourceType.f44444l, "()I", BaseSei.f13932Z, "(I)V", "getSwipeNotMatchLikersNum$annotations", "swipeNotMatchLikersNum", "", "Ljava/util/List;", "k", "()Ljava/util/List;", BaseSei.f13931Y, "(Ljava/util/List;)V", "getSwipeNotMatchAvatarUrls$annotations", "swipeNotMatchAvatarUrls", "Lcom/p1/mobile/putong/data/User;", "c", "Lcom/p1/mobile/putong/data/User;", "f", "()Lcom/p1/mobile/putong/data/User;", BaseSei.f13930X, "(Lcom/p1/mobile/putong/data/User;)V", "getLikedUser$annotations", "likedUser", "m", "setUndoUser", "getUndoUser$annotations", "undoUser", "e", "j", "setSuperLikeUser", "getSuperLikeUser$annotations", "superLikeUser", "n", "setUnlimitedLikeUser", "getUnlimitedLikeUser$annotations", "unlimitedLikeUser", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class n3b0 {

    @NotNull
    public static final n3b0 INSTANCE = new n3b0();

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
    public static Boolean m157728a(String str, String str2) {
        return Boolean.valueOf(TextUtils.equals(str2, str));
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: c */
    public static final int m157729c() {
        return m157731e(null, 1, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: d */
    public static final int m157730d(@Nullable Counter counter) {
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
    public static /* synthetic */ int m157731e(Counter counter, int i, Object obj) {
        if ((i & 1) != 0) {
            counter = CoreModule.f17545c.m31484o3();
        }
        return m157730d(counter);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static final User m157732f() {
        return likedUser;
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final long m157733g() {
        if (NullChecker.m81303a(CoreModule.f17545c.m31484o3())) {
            return (long) CoreModule.f17545c.m31484o3().likersLimit.expiresTime;
        }
        return 0L;
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final long m157734i() {
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        if (counterM31484o3 == null) {
            return 0L;
        }
        double d = counterM31484o3.likersLimit.expiresTime;
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return (long) (d - qib0.f154693H.guessedCurrentServerTime());
        }
        return 0L;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static final User m157735j() {
        return superLikeUser;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static final List<String> m157736k() {
        return swipeNotMatchAvatarUrls;
    }

    /* JADX INFO: renamed from: l */
    public static final int m157737l() {
        return swipeNotMatchLikersNum;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public static final User m157738m() {
        return undoUser;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static final User m157739n() {
        return unlimitedLikeUser;
    }

    @JvmStatic
    /* JADX INFO: renamed from: o */
    public static final boolean m157740o() {
        return m157731e(null, 1, null) <= 0;
    }

    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final boolean m157741p() {
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        return NullChecker.m81303a(counterM31484o3) && counterM31484o3.boostLimits.size() > 0;
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: q */
    public static final boolean m157742q() {
        return m157744s(null, 1, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: r */
    public static final boolean m157743r(@Nullable Counter counter) {
        return counter == null || counter.likersLimit.remaining <= 0;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ boolean m157744s(Counter counter, int i, Object obj) {
        if ((i & 1) != 0) {
            counter = CoreModule.f17545c.m31484o3();
        }
        return m157743r(counter);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: t */
    public static final boolean m157745t() {
        return m157747v(null, 1, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: u */
    public static final boolean m157746u(@Nullable Counter counterAll) {
        if (!NullChecker.m81303a(counterAll != null ? counterAll.likeLimit : null)) {
            return true;
        }
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterAll != null ? counterAll.superLikeLimit : null;
        return (counterSuperlikeAndUndoLimit != null ? counterSuperlikeAndUndoLimit.remainToday() : 0) == 0;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ boolean m157747v(Counter counter, int i, Object obj) {
        if ((i & 1) != 0) {
            counter = CoreModule.f17545c.m31484o3();
        }
        return m157746u(counter);
    }

    @JvmStatic
    /* JADX INFO: renamed from: w */
    public static final void m157748w() {
        superLikeUser = null;
        undoUser = null;
        unlimitedLikeUser = null;
        fy80.m123703B(false);
    }

    /* JADX INFO: renamed from: x */
    public static final void m157749x(@Nullable User user) {
        likedUser = user;
    }

    /* JADX INFO: renamed from: y */
    public static final void m157750y(@Nullable List<String> list) {
        swipeNotMatchAvatarUrls = list;
    }

    /* JADX INFO: renamed from: z */
    public static final void m157751z(int i) {
        swipeNotMatchLikersNum = i;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m157752b(@NotNull final String from) {
        from.getClass();
        ArrayList arrayListM200324f0 = vwb.m200324f0("p_suggest_users_home_view,e_undo_button,click", "p_suggest_users_home_view,e_card,like_swipe", "p_home,likelimit", "NA,NA,salecountdown", "p_select_location_view,e_my_roam_location,click", "p_suggest_users_home_view,e_superlike,click", "p_select_location_view,e_manyou,click", "p_profile,superlike", "p_suggest_user_profile_info_view,e_profile_comment_button,click", "home_superlike_send_superlike", "p_auto_renew_subscriptions_management_view,e_auto_renew_subscriptions_change,click", "p_suggest_users_home_view,e_undo_reminder_toast,click", "p_suggest_users_home_view,e_see_reminder,click", "p_home_location,manyou", "p_settings_location,manyou", "p_home,undo", "p_home,superlike", "p_navigation_disliked,card_button_pull");
        arrayListM200324f0.getClass();
        if (CoreModule.m29935P().m94651a().mo33353Kj()) {
            arrayListM200324f0.add("p_home,verification_card");
        }
        return vwb.m200337m(arrayListM200324f0, new w9j() { // from class: l.m3b0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return n3b0.m157728a(from, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final int m157753h(@Nullable PurchaseType type) {
        return -1;
    }
}
