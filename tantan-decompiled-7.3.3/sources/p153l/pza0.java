package p153l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class pza0 {

    /* JADX INFO: renamed from: A */
    public static jxd0 f154733A;

    /* JADX INFO: renamed from: B */
    public static jxd0 f154734B;

    /* JADX INFO: renamed from: C */
    public static jxd0 f154735C;

    /* JADX INFO: renamed from: D */
    public static jxd0 f154736D;

    /* JADX INFO: renamed from: E */
    public static jxd0 f154737E;

    /* JADX INFO: renamed from: F */
    public static jxd0 f154738F;

    /* JADX INFO: renamed from: G */
    public static jxd0 f154739G;

    /* JADX INFO: renamed from: H */
    public static jxd0 f154740H;

    /* JADX INFO: renamed from: I */
    public static jxd0 f154741I;

    /* JADX INFO: renamed from: J */
    public static jxd0 f154742J;

    /* JADX INFO: renamed from: K */
    public static jxd0 f154743K;

    /* JADX INFO: renamed from: L */
    public static jxd0 f154744L;

    /* JADX INFO: renamed from: M */
    public static jxd0 f154745M;

    /* JADX INFO: renamed from: N */
    public static jxd0 f154746N;

    /* JADX INFO: renamed from: O */
    public static jxd0 f154747O;

    /* JADX INFO: renamed from: P */
    public static jxd0 f154748P;

    /* JADX INFO: renamed from: Q */
    public static jxd0 f154749Q;

    /* JADX INFO: renamed from: R */
    public static jxd0 f154750R;

    /* JADX INFO: renamed from: S */
    public static jxd0 f154751S;

    /* JADX INFO: renamed from: T */
    public static jxd0 f154752T;

    /* JADX INFO: renamed from: U */
    public static jxd0 f154753U;

    /* JADX INFO: renamed from: V */
    public static jxd0 f154754V;

    /* JADX INFO: renamed from: W */
    public static jxd0 f154755W;

    /* JADX INFO: renamed from: X */
    public static jxd0 f154756X;

    /* JADX INFO: renamed from: Y */
    public static jxd0 f154757Y;

    /* JADX INFO: renamed from: Z */
    public static jxd0 f154758Z;

    /* JADX INFO: renamed from: a */
    public static final jxd0 f154759a;

    /* JADX INFO: renamed from: a0 */
    public static jxd0 f154760a0;

    /* JADX INFO: renamed from: b */
    public static jxd0 f154761b;

    /* JADX INFO: renamed from: b0 */
    public static jxd0 f154762b0;

    /* JADX INFO: renamed from: c */
    public static jxd0 f154763c;

    /* JADX INFO: renamed from: c0 */
    public static jxd0 f154764c0;

    /* JADX INFO: renamed from: d */
    public static jxd0 f154765d;

    /* JADX INFO: renamed from: d0 */
    public static jxd0 f154766d0;

    /* JADX INFO: renamed from: e */
    public static jxd0 f154767e;

    /* JADX INFO: renamed from: e0 */
    public static jxd0 f154768e0;

    /* JADX INFO: renamed from: f */
    public static jxd0 f154769f;

    /* JADX INFO: renamed from: f0 */
    public static jxd0 f154770f0;

    /* JADX INFO: renamed from: g */
    public static jxd0 f154771g;

    /* JADX INFO: renamed from: g0 */
    public static jxd0 f154772g0;

    /* JADX INFO: renamed from: h */
    public static jxd0 f154773h;

    /* JADX INFO: renamed from: h0 */
    public static jxd0 f154774h0;

    /* JADX INFO: renamed from: i */
    public static jxd0 f154775i;

    /* JADX INFO: renamed from: i0 */
    public static jxd0 f154776i0;

    /* JADX INFO: renamed from: j */
    public static vxd0 f154777j;

    /* JADX INFO: renamed from: j0 */
    public static jxd0 f154778j0;

    /* JADX INFO: renamed from: k */
    public static mxd0 f154779k;

    /* JADX INFO: renamed from: k0 */
    public static jxd0 f154780k0;

    /* JADX INFO: renamed from: l */
    public static jxd0 f154781l;

    /* JADX INFO: renamed from: l0 */
    public static jxd0 f154782l0;

    /* JADX INFO: renamed from: m */
    public static jxd0 f154783m;

    /* JADX INFO: renamed from: m0 */
    public static jxd0 f154784m0;

    /* JADX INFO: renamed from: n */
    public static jxd0 f154785n;

    /* JADX INFO: renamed from: n0 */
    public static jxd0 f154786n0;

    /* JADX INFO: renamed from: o */
    public static jxd0 f154787o;

    /* JADX INFO: renamed from: o0 */
    public static xgw<String, List<Media>> f154788o0;

    /* JADX INFO: renamed from: p */
    public static byd0 f154789p;

    /* JADX INFO: renamed from: q */
    public static byd0 f154790q;

    /* JADX INFO: renamed from: r */
    public static jxd0 f154791r;

    /* JADX INFO: renamed from: s */
    public static jxd0 f154792s;

    /* JADX INFO: renamed from: t */
    public static jxd0 f154793t;

    /* JADX INFO: renamed from: u */
    public static final int f154794u;

    /* JADX INFO: renamed from: v */
    public static boolean f154795v;

    /* JADX INFO: renamed from: w */
    public static boolean f154796w;

    /* JADX INFO: renamed from: x */
    public static jxd0 f154797x;

    /* JADX INFO: renamed from: y */
    public static jxd0 f154798y;

    /* JADX INFO: renamed from: z */
    public static String f154799z;

    static {
        Boolean bool = Boolean.FALSE;
        f154759a = new jxd0("debug_profile_refactor_no_about_me", bool);
        f154761b = new jxd0("debug_block_bottom_view_render_card", bool);
        f154763c = new jxd0("debug_block_bottom_about_me", bool);
        f154765d = new jxd0("debug_image_info_track", bool);
        f154767e = new jxd0("debug_image_origin_see", bool);
        f154769f = new jxd0("debug_disable_card_switch", bool);
        f154771g = new jxd0("debug_hyper_profile_pic_double_check", bool);
        f154773h = new jxd0("debug_pic_optimization_card_ratio", bool);
        f154775i = new jxd0("profile_pic_optimization_android_dynamic", bool);
        f154777j = new vxd0("debug_card_picture_show_size", 720);
        f154779k = new mxd0("debug_card_width_height_ratio", 0.67d);
        f154781l = new jxd0("isProfileRefactor", bool);
        f154783m = new jxd0("isProfileRefactorWithGuide", bool);
        f154785n = new jxd0("isProfileRedesignedControl", bool);
        f154787o = new jxd0("debug_show_all_pic_tag", bool);
        f154789p = new byd0("last_profile_refactor_swipe_time", -1L);
        f154790q = new byd0("today_has_about_me_swipe_count", 0L);
        f154791r = new jxd0("isCardSwipeGuideEnable", bool);
        f154792s = new jxd0("isProfileAnimDelayTimeFive", bool);
        f154793t = new jxd0("isProfileAnimDelayTimeTen", bool);
        f154794u = qa00.m175859d(120.0f);
        f154795v = false;
        f154796w = false;
        f154797x = new jxd0("isProfileVerExp1", bool);
        f154798y = new jxd0("isProfileVerExp2", bool);
        f154799z = "";
        f154733A = new jxd0("has_shown_profile_back_guide", bool);
        f154734B = new jxd0("swipeAboutMe01", bool);
        f154735C = new jxd0("swipeAboutMeControl", bool);
        f154736D = new jxd0("showAllMultiTag", bool);
        f154737E = new jxd0("showFirstCardVideo", bool);
        f154738F = new jxd0("showPassByTag", bool);
        f154739G = new jxd0("dismissPassByTag", bool);
        f154740H = new jxd0("showProfileClickView", bool);
        f154741I = new jxd0("alwaysShowProfileCoverViewWhenBack", bool);
        f154742J = new jxd0("pushMsgExpEnable", bool);
        f154743K = new jxd0("swipeCardNewUi", bool);
        f154744L = new jxd0("showFakeItemNewUi", bool);
        f154745M = new jxd0("ageTooLarge", bool);
        f154746N = new jxd0("profileSuggestUser", bool);
        f154747O = new jxd0("showBlurBackgroundAlways", bool);
        f154748P = new jxd0("chatAppealTypeLocalExp", bool);
        f154749Q = new jxd0("chatAppealTypeLocalShuMei", bool);
        f154750R = new jxd0("showSuperLikeAnmi", bool);
        f154751S = new jxd0("showIntlSuperLikeStyle", bool);
        f154752T = new jxd0("profileShowMoment", bool);
        f154753U = new jxd0("profileShowSuperlike", bool);
        f154754V = new jxd0("profileShowGreeting", bool);
        f154755W = new jxd0("profileMessageMomentTextLong", bool);
        f154756X = new jxd0("messageActShowMoment", bool);
        f154757Y = new jxd0("pictureLikeExp1", bool);
        f154758Z = new jxd0("pictureLikeExp2", bool);
        f154760a0 = new jxd0("showSuperLikeRemain", bool);
        f154762b0 = new jxd0("liveProfileVideoOnline", bool);
        f154764c0 = new jxd0("liveProfileVideoOffline", bool);
        f154766d0 = new jxd0("liveProfileAudioOnline", bool);
        f154768e0 = new jxd0("liveProfileVideoOnline", bool);
        f154762b0 = new jxd0("liveProfileAudioOffline", bool);
        f154770f0 = new jxd0("liveShowTwoRoomInProfile", bool);
        f154772g0 = new jxd0("newMessageTab", bool);
        f154774h0 = new jxd0("cardTagOpti1", bool);
        f154776i0 = new jxd0("cardTagOpti2", bool);
        f154778j0 = new jxd0("cardTagOpti3", bool);
        f154780k0 = new jxd0("cardTagOpti4", bool);
        f154782l0 = new jxd0(CoreModule.m30929H().userId() + "cardTagOpti5", bool);
        f154784m0 = new jxd0("cardTagOptiMomentTag", bool);
        f154786n0 = new jxd0("isPhotoUpload", bool);
        f154788o0 = new xgw<>(5);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m174349a(HashSet hashSet, int i) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setTranslationY(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m174350b(HashSet hashSet, int i) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setTranslationY(i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m174351c(q3m q3mVar, HashSet hashSet, ValueAnimator valueAnimator) {
        List<View> listMo53236B1 = q3mVar.mo53236B1();
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        for (View view : listMo53236B1) {
            if (view != null) {
                hashSet.add(view);
                view.setTranslationY(iIntValue);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m174352d(String str) {
        return TextUtils.isEmpty(str) ? "" : str;
    }

    /* JADX INFO: renamed from: e */
    public static Animator m174353e(final q3m q3mVar, int i, int i2, Interpolator interpolator, int i3, final int i4) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i3, i4);
        valueAnimatorOfInt.setStartDelay(i);
        valueAnimatorOfInt.setDuration(i2);
        valueAnimatorOfInt.setInterpolator(interpolator);
        final HashSet hashSet = new HashSet();
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.mza0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                pza0.m174351c(q3mVar, hashSet, valueAnimator);
            }
        });
        gt0.m132161g(valueAnimatorOfInt, new Runnable() { // from class: l.nza0
            @Override // java.lang.Runnable
            public final void run() {
                pza0.m174350b(hashSet, i4);
            }
        }, new Runnable() { // from class: l.oza0
            @Override // java.lang.Runnable
            public final void run() {
                pza0.m174349a(hashSet, i4);
            }
        });
        return valueAnimatorOfInt;
    }

    /* JADX INFO: renamed from: f */
    public static void m174354f(String str) {
        sfj0.m185601h("e_profile_failed_toast", "p_edit_profile_view", sfj0.C20032a.m185615h("about_me_finish_failed_reason", str));
    }

    /* JADX INFO: renamed from: g */
    public static void m174355g(String str, boolean z, boolean z2, User user, String str2) {
        if (user == null) {
            return;
        }
        sfj0.m185596c("e_change_photo", str, sfj0.C20032a.m185615h("can_switch", z ? "true" : "false"), sfj0.C20032a.m185615h("card_hobby", str2), sfj0.C20032a.m185615h("change_photo_direction", z2 ? BLiveGiftBubblePopupTitlePosition.left : "right"), sfj0.C20032a.m185615h("receiver_user_id", user.f56859id), sfj0.C20032a.m185613f("photo_numbers", user.pictures.size()));
    }

    /* JADX INFO: renamed from: h */
    public static void m174356h(String str) {
        sfj0.m185596c("e_profile_back", OMSDialogPositon.p_suggest_user_profile_info_view, sfj0.C20032a.m185615h("profile_back_way", str));
    }

    /* JADX INFO: renamed from: i */
    public static void m174357i(Map<String, String> map) {
        sfj0.m185601h("e_card_hobby", "p_suggest_users_home_view", sfj0.C20032a.m185615h("hobby_book", m174352d(map.get("literature"))), sfj0.C20032a.m185615h("hobby_food", m174352d(map.get("food"))), sfj0.C20032a.m185615h("hobby_movie", m174352d(map.get("movies"))), sfj0.C20032a.m185615h("hobby_music", m174352d(map.get("music"))), sfj0.C20032a.m185615h("hobby_sport", m174352d(map.get("sports"))), sfj0.C20032a.m185615h("hobby_travel", m174352d(map.get("places"))), sfj0.C20032a.m185615h("moments_user_id", m174352d(map.get("userId"))));
    }
}
