package p009l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.bt0;
import l.hpd0;
import l.kpd0;
import l.o6j0;
import l.t100;
import l.tpd0;
import l.x0m;
import l.zew;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class lra0 {

    /* JADX INFO: renamed from: A */
    public static hpd0 f16312A;

    /* JADX INFO: renamed from: B */
    public static hpd0 f16313B;

    /* JADX INFO: renamed from: C */
    public static hpd0 f16314C;

    /* JADX INFO: renamed from: D */
    public static hpd0 f16315D;

    /* JADX INFO: renamed from: E */
    public static hpd0 f16316E;

    /* JADX INFO: renamed from: F */
    public static hpd0 f16317F;

    /* JADX INFO: renamed from: G */
    public static hpd0 f16318G;

    /* JADX INFO: renamed from: H */
    public static hpd0 f16319H;

    /* JADX INFO: renamed from: I */
    public static hpd0 f16320I;

    /* JADX INFO: renamed from: J */
    public static hpd0 f16321J;

    /* JADX INFO: renamed from: K */
    public static hpd0 f16322K;

    /* JADX INFO: renamed from: L */
    public static hpd0 f16323L;

    /* JADX INFO: renamed from: M */
    public static hpd0 f16324M;

    /* JADX INFO: renamed from: N */
    public static hpd0 f16325N;

    /* JADX INFO: renamed from: O */
    public static hpd0 f16326O;

    /* JADX INFO: renamed from: P */
    public static hpd0 f16327P;

    /* JADX INFO: renamed from: Q */
    public static hpd0 f16328Q;

    /* JADX INFO: renamed from: R */
    public static hpd0 f16329R;

    /* JADX INFO: renamed from: S */
    public static hpd0 f16330S;

    /* JADX INFO: renamed from: T */
    public static hpd0 f16331T;

    /* JADX INFO: renamed from: U */
    public static hpd0 f16332U;

    /* JADX INFO: renamed from: V */
    public static hpd0 f16333V;

    /* JADX INFO: renamed from: W */
    public static hpd0 f16334W;

    /* JADX INFO: renamed from: X */
    public static hpd0 f16335X;

    /* JADX INFO: renamed from: Y */
    public static hpd0 f16336Y;

    /* JADX INFO: renamed from: Z */
    public static hpd0 f16337Z;

    /* JADX INFO: renamed from: a */
    public static final hpd0 f16338a;

    /* JADX INFO: renamed from: a0 */
    public static hpd0 f16339a0;

    /* JADX INFO: renamed from: b */
    public static hpd0 f16340b;

    /* JADX INFO: renamed from: b0 */
    public static hpd0 f16341b0;

    /* JADX INFO: renamed from: c */
    public static hpd0 f16342c;

    /* JADX INFO: renamed from: c0 */
    public static hpd0 f16343c0;

    /* JADX INFO: renamed from: d */
    public static hpd0 f16344d;

    /* JADX INFO: renamed from: d0 */
    public static hpd0 f16345d0;

    /* JADX INFO: renamed from: e */
    public static hpd0 f16346e;

    /* JADX INFO: renamed from: e0 */
    public static hpd0 f16347e0;

    /* JADX INFO: renamed from: f */
    public static hpd0 f16348f;

    /* JADX INFO: renamed from: f0 */
    public static hpd0 f16349f0;

    /* JADX INFO: renamed from: g */
    public static hpd0 f16350g;

    /* JADX INFO: renamed from: g0 */
    public static hpd0 f16351g0;

    /* JADX INFO: renamed from: h */
    public static hpd0 f16352h;

    /* JADX INFO: renamed from: h0 */
    public static hpd0 f16353h0;

    /* JADX INFO: renamed from: i */
    public static hpd0 f16354i;

    /* JADX INFO: renamed from: i0 */
    public static hpd0 f16355i0;

    /* JADX INFO: renamed from: j */
    public static tpd0 f16356j;

    /* JADX INFO: renamed from: j0 */
    public static hpd0 f16357j0;

    /* JADX INFO: renamed from: k */
    public static kpd0 f16358k;

    /* JADX INFO: renamed from: k0 */
    public static hpd0 f16359k0;

    /* JADX INFO: renamed from: l */
    public static hpd0 f16360l;

    /* JADX INFO: renamed from: l0 */
    public static hpd0 f16361l0;

    /* JADX INFO: renamed from: m */
    public static hpd0 f16362m;

    /* JADX INFO: renamed from: m0 */
    public static hpd0 f16363m0;

    /* JADX INFO: renamed from: n */
    public static hpd0 f16364n;

    /* JADX INFO: renamed from: n0 */
    public static hpd0 f16365n0;

    /* JADX INFO: renamed from: o */
    public static hpd0 f16366o;

    /* JADX INFO: renamed from: o0 */
    public static zew<String, List<Media>> f16367o0;

    /* JADX INFO: renamed from: p */
    public static zpd0 f16368p;

    /* JADX INFO: renamed from: q */
    public static zpd0 f16369q;

    /* JADX INFO: renamed from: r */
    public static hpd0 f16370r;

    /* JADX INFO: renamed from: s */
    public static hpd0 f16371s;

    /* JADX INFO: renamed from: t */
    public static hpd0 f16372t;

    /* JADX INFO: renamed from: u */
    public static final int f16373u;

    /* JADX INFO: renamed from: v */
    public static boolean f16374v;

    /* JADX INFO: renamed from: w */
    public static boolean f16375w;

    /* JADX INFO: renamed from: x */
    public static hpd0 f16376x;

    /* JADX INFO: renamed from: y */
    public static hpd0 f16377y;

    /* JADX INFO: renamed from: z */
    public static String f16378z;

    static {
        Boolean bool = Boolean.FALSE;
        f16338a = new hpd0("debug_profile_refactor_no_about_me", bool);
        f16340b = new hpd0("debug_block_bottom_view_render_card", bool);
        f16342c = new hpd0("debug_block_bottom_about_me", bool);
        f16344d = new hpd0("debug_image_info_track", bool);
        f16346e = new hpd0("debug_image_origin_see", bool);
        f16348f = new hpd0("debug_disable_card_switch", bool);
        f16350g = new hpd0("debug_hyper_profile_pic_double_check", bool);
        f16352h = new hpd0("debug_pic_optimization_card_ratio", bool);
        f16354i = new hpd0("profile_pic_optimization_android_dynamic", bool);
        f16356j = new tpd0("debug_card_picture_show_size", 720);
        f16358k = new kpd0("debug_card_width_height_ratio", 0.67d);
        f16360l = new hpd0("isProfileRefactor", bool);
        f16362m = new hpd0("isProfileRefactorWithGuide", bool);
        f16364n = new hpd0("isProfileRedesignedControl", bool);
        f16366o = new hpd0("debug_show_all_pic_tag", bool);
        f16368p = new zpd0("last_profile_refactor_swipe_time", -1L);
        f16369q = new zpd0("today_has_about_me_swipe_count", 0L);
        f16370r = new hpd0("isCardSwipeGuideEnable", bool);
        f16371s = new hpd0("isProfileAnimDelayTimeFive", bool);
        f16372t = new hpd0("isProfileAnimDelayTimeTen", bool);
        f16373u = t100.d(120.0f);
        f16374v = false;
        f16375w = false;
        f16376x = new hpd0("isProfileVerExp1", bool);
        f16377y = new hpd0("isProfileVerExp2", bool);
        f16378z = "";
        f16312A = new hpd0("has_shown_profile_back_guide", bool);
        f16313B = new hpd0("swipeAboutMe01", bool);
        f16314C = new hpd0("swipeAboutMeControl", bool);
        f16315D = new hpd0("showAllMultiTag", bool);
        f16316E = new hpd0("showFirstCardVideo", bool);
        f16317F = new hpd0("showPassByTag", bool);
        f16318G = new hpd0("dismissPassByTag", bool);
        f16319H = new hpd0("showProfileClickView", bool);
        f16320I = new hpd0("alwaysShowProfileCoverViewWhenBack", bool);
        f16321J = new hpd0("pushMsgExpEnable", bool);
        f16322K = new hpd0("swipeCardNewUi", bool);
        f16323L = new hpd0("showFakeItemNewUi", bool);
        f16324M = new hpd0("ageTooLarge", bool);
        f16325N = new hpd0("profileSuggestUser", bool);
        f16326O = new hpd0("showBlurBackgroundAlways", bool);
        f16327P = new hpd0("chatAppealTypeLocalExp", bool);
        f16328Q = new hpd0("chatAppealTypeLocalShuMei", bool);
        f16329R = new hpd0("showSuperLikeAnmi", bool);
        f16330S = new hpd0("showIntlSuperLikeStyle", bool);
        f16331T = new hpd0("profileShowMoment", bool);
        f16332U = new hpd0("profileShowSuperlike", bool);
        f16333V = new hpd0("profileShowGreeting", bool);
        f16334W = new hpd0("profileMessageMomentTextLong", bool);
        f16335X = new hpd0("messageActShowMoment", bool);
        f16336Y = new hpd0("pictureLikeExp1", bool);
        f16337Z = new hpd0("pictureLikeExp2", bool);
        f16339a0 = new hpd0("showSuperLikeRemain", bool);
        f16341b0 = new hpd0("liveProfileVideoOnline", bool);
        f16343c0 = new hpd0("liveProfileVideoOffline", bool);
        f16345d0 = new hpd0("liveProfileAudioOnline", bool);
        f16347e0 = new hpd0("liveProfileVideoOnline", bool);
        f16341b0 = new hpd0("liveProfileAudioOffline", bool);
        f16349f0 = new hpd0("liveShowTwoRoomInProfile", bool);
        f16351g0 = new hpd0("newMessageTab", bool);
        f16353h0 = new hpd0("cardTagOpti1", bool);
        f16355i0 = new hpd0("cardTagOpti2", bool);
        f16357j0 = new hpd0("cardTagOpti3", bool);
        f16359k0 = new hpd0("cardTagOpti4", bool);
        f16361l0 = new hpd0(CoreModule.H().userId() + "cardTagOpti5", bool);
        f16363m0 = new hpd0("cardTagOptiMomentTag", bool);
        f16365n0 = new hpd0("isPhotoUpload", bool);
        f16367o0 = new zew<>(5);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m17987a(HashSet hashSet, int i) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setTranslationY(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m17988b(HashSet hashSet, int i) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setTranslationY(i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m17989c(x0m x0mVar, HashSet hashSet, ValueAnimator valueAnimator) {
        List<View> listB1 = x0mVar.B1();
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        for (View view : listB1) {
            if (view != null) {
                hashSet.add(view);
                view.setTranslationY(iIntValue);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m17990d(String str) {
        return TextUtils.isEmpty(str) ? "" : str;
    }

    /* JADX INFO: renamed from: e */
    public static Animator m17991e(final x0m x0mVar, int i, int i2, Interpolator interpolator, int i3, final int i4) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i3, i4);
        valueAnimatorOfInt.setStartDelay(i);
        valueAnimatorOfInt.setDuration(i2);
        valueAnimatorOfInt.setInterpolator(interpolator);
        final HashSet hashSet = new HashSet();
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ira0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                lra0.m17989c(x0mVar, hashSet, valueAnimator);
            }
        });
        bt0.g(valueAnimatorOfInt, new Runnable() { // from class: l.jra0
            @Override // java.lang.Runnable
            public final void run() {
                lra0.m17988b(hashSet, i4);
            }
        }, new Runnable() { // from class: l.kra0
            @Override // java.lang.Runnable
            public final void run() {
                lra0.m17987a(hashSet, i4);
            }
        });
        return valueAnimatorOfInt;
    }

    /* JADX INFO: renamed from: f */
    public static void m17992f(String str) {
        o6j0.h("e_profile_failed_toast", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("about_me_finish_failed_reason", str)});
    }

    /* JADX INFO: renamed from: g */
    public static void m17993g(String str, boolean z, boolean z2, User user, String str2) {
        if (user == null) {
            return;
        }
        o6j0.c("e_change_photo", str, new o6j0.a[]{o6j0.a.h("can_switch", z ? "true" : "false"), o6j0.a.h("card_hobby", str2), o6j0.a.h("change_photo_direction", z2 ? "left" : "right"), o6j0.a.h("receiver_user_id", ((DbObject) user).id), o6j0.a.f("photo_numbers", user.pictures.size())});
    }

    /* JADX INFO: renamed from: h */
    public static void m17994h(String str) {
        o6j0.c("e_profile_back", "p_suggest_user_profile_info_view", new o6j0.a[]{o6j0.a.h("profile_back_way", str)});
    }

    /* JADX INFO: renamed from: i */
    public static void m17995i(Map<String, String> map) {
        o6j0.h("e_card_hobby", "p_suggest_users_home_view", new o6j0.a[]{o6j0.a.h("hobby_book", m17990d(map.get("literature"))), o6j0.a.h("hobby_food", m17990d(map.get("food"))), o6j0.a.h("hobby_movie", m17990d(map.get("movies"))), o6j0.a.h("hobby_music", m17990d(map.get("music"))), o6j0.a.h("hobby_sport", m17990d(map.get("sports"))), o6j0.a.h("hobby_travel", m17990d(map.get("places"))), o6j0.a.h("moments_user_id", m17990d(map.get("userId")))});
    }
}
