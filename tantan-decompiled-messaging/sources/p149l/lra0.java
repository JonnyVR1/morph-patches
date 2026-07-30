package p149l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class lra0 {

    /* JADX INFO: renamed from: A */
    public static hpd0 f129473A;

    /* JADX INFO: renamed from: B */
    public static hpd0 f129474B;

    /* JADX INFO: renamed from: C */
    public static hpd0 f129475C;

    /* JADX INFO: renamed from: D */
    public static hpd0 f129476D;

    /* JADX INFO: renamed from: E */
    public static hpd0 f129477E;

    /* JADX INFO: renamed from: F */
    public static hpd0 f129478F;

    /* JADX INFO: renamed from: G */
    public static hpd0 f129479G;

    /* JADX INFO: renamed from: H */
    public static hpd0 f129480H;

    /* JADX INFO: renamed from: I */
    public static hpd0 f129481I;

    /* JADX INFO: renamed from: J */
    public static hpd0 f129482J;

    /* JADX INFO: renamed from: K */
    public static hpd0 f129483K;

    /* JADX INFO: renamed from: L */
    public static hpd0 f129484L;

    /* JADX INFO: renamed from: M */
    public static hpd0 f129485M;

    /* JADX INFO: renamed from: N */
    public static hpd0 f129486N;

    /* JADX INFO: renamed from: O */
    public static hpd0 f129487O;

    /* JADX INFO: renamed from: P */
    public static hpd0 f129488P;

    /* JADX INFO: renamed from: Q */
    public static hpd0 f129489Q;

    /* JADX INFO: renamed from: R */
    public static hpd0 f129490R;

    /* JADX INFO: renamed from: S */
    public static hpd0 f129491S;

    /* JADX INFO: renamed from: T */
    public static hpd0 f129492T;

    /* JADX INFO: renamed from: U */
    public static hpd0 f129493U;

    /* JADX INFO: renamed from: V */
    public static hpd0 f129494V;

    /* JADX INFO: renamed from: W */
    public static hpd0 f129495W;

    /* JADX INFO: renamed from: X */
    public static hpd0 f129496X;

    /* JADX INFO: renamed from: Y */
    public static hpd0 f129497Y;

    /* JADX INFO: renamed from: Z */
    public static hpd0 f129498Z;

    /* JADX INFO: renamed from: a */
    public static final hpd0 f129499a;

    /* JADX INFO: renamed from: a0 */
    public static hpd0 f129500a0;

    /* JADX INFO: renamed from: b */
    public static hpd0 f129501b;

    /* JADX INFO: renamed from: b0 */
    public static hpd0 f129502b0;

    /* JADX INFO: renamed from: c */
    public static hpd0 f129503c;

    /* JADX INFO: renamed from: c0 */
    public static hpd0 f129504c0;

    /* JADX INFO: renamed from: d */
    public static hpd0 f129505d;

    /* JADX INFO: renamed from: d0 */
    public static hpd0 f129506d0;

    /* JADX INFO: renamed from: e */
    public static hpd0 f129507e;

    /* JADX INFO: renamed from: e0 */
    public static hpd0 f129508e0;

    /* JADX INFO: renamed from: f */
    public static hpd0 f129509f;

    /* JADX INFO: renamed from: f0 */
    public static hpd0 f129510f0;

    /* JADX INFO: renamed from: g */
    public static hpd0 f129511g;

    /* JADX INFO: renamed from: g0 */
    public static hpd0 f129512g0;

    /* JADX INFO: renamed from: h */
    public static hpd0 f129513h;

    /* JADX INFO: renamed from: h0 */
    public static hpd0 f129514h0;

    /* JADX INFO: renamed from: i */
    public static hpd0 f129515i;

    /* JADX INFO: renamed from: i0 */
    public static hpd0 f129516i0;

    /* JADX INFO: renamed from: j */
    public static tpd0 f129517j;

    /* JADX INFO: renamed from: j0 */
    public static hpd0 f129518j0;

    /* JADX INFO: renamed from: k */
    public static kpd0 f129519k;

    /* JADX INFO: renamed from: k0 */
    public static hpd0 f129520k0;

    /* JADX INFO: renamed from: l */
    public static hpd0 f129521l;

    /* JADX INFO: renamed from: l0 */
    public static hpd0 f129522l0;

    /* JADX INFO: renamed from: m */
    public static hpd0 f129523m;

    /* JADX INFO: renamed from: m0 */
    public static hpd0 f129524m0;

    /* JADX INFO: renamed from: n */
    public static hpd0 f129525n;

    /* JADX INFO: renamed from: n0 */
    public static hpd0 f129526n0;

    /* JADX INFO: renamed from: o */
    public static hpd0 f129527o;

    /* JADX INFO: renamed from: o0 */
    public static zew<String, List<Media>> f129528o0;

    /* JADX INFO: renamed from: p */
    public static zpd0 f129529p;

    /* JADX INFO: renamed from: q */
    public static zpd0 f129530q;

    /* JADX INFO: renamed from: r */
    public static hpd0 f129531r;

    /* JADX INFO: renamed from: s */
    public static hpd0 f129532s;

    /* JADX INFO: renamed from: t */
    public static hpd0 f129533t;

    /* JADX INFO: renamed from: u */
    public static final int f129534u;

    /* JADX INFO: renamed from: v */
    public static boolean f129535v;

    /* JADX INFO: renamed from: w */
    public static boolean f129536w;

    /* JADX INFO: renamed from: x */
    public static hpd0 f129537x;

    /* JADX INFO: renamed from: y */
    public static hpd0 f129538y;

    /* JADX INFO: renamed from: z */
    public static String f129539z;

    static {
        Boolean bool = Boolean.FALSE;
        f129499a = new hpd0("debug_profile_refactor_no_about_me", bool);
        f129501b = new hpd0("debug_block_bottom_view_render_card", bool);
        f129503c = new hpd0("debug_block_bottom_about_me", bool);
        f129505d = new hpd0("debug_image_info_track", bool);
        f129507e = new hpd0("debug_image_origin_see", bool);
        f129509f = new hpd0("debug_disable_card_switch", bool);
        f129511g = new hpd0("debug_hyper_profile_pic_double_check", bool);
        f129513h = new hpd0("debug_pic_optimization_card_ratio", bool);
        f129515i = new hpd0("profile_pic_optimization_android_dynamic", bool);
        f129517j = new tpd0("debug_card_picture_show_size", 720);
        f129519k = new kpd0("debug_card_width_height_ratio", 0.67d);
        f129521l = new hpd0("isProfileRefactor", bool);
        f129523m = new hpd0("isProfileRefactorWithGuide", bool);
        f129525n = new hpd0("isProfileRedesignedControl", bool);
        f129527o = new hpd0("debug_show_all_pic_tag", bool);
        f129529p = new zpd0("last_profile_refactor_swipe_time", -1L);
        f129530q = new zpd0("today_has_about_me_swipe_count", 0L);
        f129531r = new hpd0("isCardSwipeGuideEnable", bool);
        f129532s = new hpd0("isProfileAnimDelayTimeFive", bool);
        f129533t = new hpd0("isProfileAnimDelayTimeTen", bool);
        f129534u = t100.m186890d(120.0f);
        f129535v = false;
        f129536w = false;
        f129537x = new hpd0("isProfileVerExp1", bool);
        f129538y = new hpd0("isProfileVerExp2", bool);
        f129539z = "";
        f129473A = new hpd0("has_shown_profile_back_guide", bool);
        f129474B = new hpd0("swipeAboutMe01", bool);
        f129475C = new hpd0("swipeAboutMeControl", bool);
        f129476D = new hpd0("showAllMultiTag", bool);
        f129477E = new hpd0("showFirstCardVideo", bool);
        f129478F = new hpd0("showPassByTag", bool);
        f129479G = new hpd0("dismissPassByTag", bool);
        f129480H = new hpd0("showProfileClickView", bool);
        f129481I = new hpd0("alwaysShowProfileCoverViewWhenBack", bool);
        f129482J = new hpd0("pushMsgExpEnable", bool);
        f129483K = new hpd0("swipeCardNewUi", bool);
        f129484L = new hpd0("showFakeItemNewUi", bool);
        f129485M = new hpd0("ageTooLarge", bool);
        f129486N = new hpd0("profileSuggestUser", bool);
        f129487O = new hpd0("showBlurBackgroundAlways", bool);
        f129488P = new hpd0("chatAppealTypeLocalExp", bool);
        f129489Q = new hpd0("chatAppealTypeLocalShuMei", bool);
        f129490R = new hpd0("showSuperLikeAnmi", bool);
        f129491S = new hpd0("showIntlSuperLikeStyle", bool);
        f129492T = new hpd0("profileShowMoment", bool);
        f129493U = new hpd0("profileShowSuperlike", bool);
        f129494V = new hpd0("profileShowGreeting", bool);
        f129495W = new hpd0("profileMessageMomentTextLong", bool);
        f129496X = new hpd0("messageActShowMoment", bool);
        f129497Y = new hpd0("pictureLikeExp1", bool);
        f129498Z = new hpd0("pictureLikeExp2", bool);
        f129500a0 = new hpd0("showSuperLikeRemain", bool);
        f129502b0 = new hpd0("liveProfileVideoOnline", bool);
        f129504c0 = new hpd0("liveProfileVideoOffline", bool);
        f129506d0 = new hpd0("liveProfileAudioOnline", bool);
        f129508e0 = new hpd0("liveProfileVideoOnline", bool);
        f129502b0 = new hpd0("liveProfileAudioOffline", bool);
        f129510f0 = new hpd0("liveShowTwoRoomInProfile", bool);
        f129512g0 = new hpd0("newMessageTab", bool);
        f129514h0 = new hpd0("cardTagOpti1", bool);
        f129516i0 = new hpd0("cardTagOpti2", bool);
        f129518j0 = new hpd0("cardTagOpti3", bool);
        f129520k0 = new hpd0("cardTagOpti4", bool);
        f129522l0 = new hpd0(CoreModule.m29931H().userId() + "cardTagOpti5", bool);
        f129524m0 = new hpd0("cardTagOptiMomentTag", bool);
        f129526n0 = new hpd0("isPhotoUpload", bool);
        f129528o0 = new zew<>(5);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m151142a(HashSet hashSet, int i) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setTranslationY(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m151143b(HashSet hashSet, int i) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setTranslationY(i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m151144c(x0m x0mVar, HashSet hashSet, ValueAnimator valueAnimator) {
        List<View> listMo52053B1 = x0mVar.mo52053B1();
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        for (View view : listMo52053B1) {
            if (view != null) {
                hashSet.add(view);
                view.setTranslationY(iIntValue);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m151145d(String str) {
        return TextUtils.isEmpty(str) ? "" : str;
    }

    /* JADX INFO: renamed from: e */
    public static Animator m151146e(final x0m x0mVar, int i, int i2, Interpolator interpolator, int i3, final int i4) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i3, i4);
        valueAnimatorOfInt.setStartDelay(i);
        valueAnimatorOfInt.setDuration(i2);
        valueAnimatorOfInt.setInterpolator(interpolator);
        final HashSet hashSet = new HashSet();
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ira0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                lra0.m151144c(x0mVar, hashSet, valueAnimator);
            }
        });
        bt0.m103734g(valueAnimatorOfInt, new Runnable() { // from class: l.jra0
            @Override // java.lang.Runnable
            public final void run() {
                lra0.m151143b(hashSet, i4);
            }
        }, new Runnable() { // from class: l.kra0
            @Override // java.lang.Runnable
            public final void run() {
                lra0.m151142a(hashSet, i4);
            }
        });
        return valueAnimatorOfInt;
    }

    /* JADX INFO: renamed from: f */
    public static void m151147f(String str) {
        o6j0.m162864h("e_profile_failed_toast", "p_edit_profile_view", o6j0.C18854a.m162878h("about_me_finish_failed_reason", str));
    }

    /* JADX INFO: renamed from: g */
    public static void m151148g(String str, boolean z, boolean z2, User user, String str2) {
        if (user == null) {
            return;
        }
        o6j0.m162859c("e_change_photo", str, o6j0.C18854a.m162878h("can_switch", z ? "true" : "false"), o6j0.C18854a.m162878h("card_hobby", str2), o6j0.C18854a.m162878h("change_photo_direction", z2 ? BLiveGiftBubblePopupTitlePosition.left : "right"), o6j0.C18854a.m162878h("receiver_user_id", user.f56011id), o6j0.C18854a.m162876f("photo_numbers", user.pictures.size()));
    }

    /* JADX INFO: renamed from: h */
    public static void m151149h(String str) {
        o6j0.m162859c("e_profile_back", OMSDialogPositon.p_suggest_user_profile_info_view, o6j0.C18854a.m162878h("profile_back_way", str));
    }

    /* JADX INFO: renamed from: i */
    public static void m151150i(Map<String, String> map) {
        o6j0.m162864h("e_card_hobby", "p_suggest_users_home_view", o6j0.C18854a.m162878h("hobby_book", m151145d(map.get("literature"))), o6j0.C18854a.m162878h("hobby_food", m151145d(map.get("food"))), o6j0.C18854a.m162878h("hobby_movie", m151145d(map.get("movies"))), o6j0.C18854a.m162878h("hobby_music", m151145d(map.get("music"))), o6j0.C18854a.m162878h("hobby_sport", m151145d(map.get("sports"))), o6j0.C18854a.m162878h("hobby_travel", m151145d(map.get("places"))), o6j0.C18854a.m162878h("moments_user_id", m151145d(map.get("userId"))));
    }
}
