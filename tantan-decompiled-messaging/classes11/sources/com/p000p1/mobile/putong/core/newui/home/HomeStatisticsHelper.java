package com.p000p1.mobile.putong.core.newui.home;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p000p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.IdealInfo;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.ui.home.VirtualCard;
import com.p1.mobile.putong.data.IdealTag;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.OMSAdCardInfo;
import com.p1.mobile.putong.data.SwipeExtraScData;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UssTags;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import l.e30;
import l.j760;
import l.jb0;
import l.l3f;
import l.mkd0;
import l.o6j0;
import l.sb90;
import l.upa;
import l.vwb;
import l.zvf0;
import p009l.a5m;
import p009l.d5m;
import p009l.eli0;
import p009l.jj4;
import p009l.lol;
import p009l.va40;
import p009l.wsf0;
import p009l.xe40;
import p009l.z8l;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HomeStatisticsHelper {

    /* JADX INFO: renamed from: a */
    public static long f435a = 0;

    /* JADX INFO: renamed from: b */
    public static boolean f436b = false;

    /* JADX INFO: renamed from: c */
    public static long f437c = 0;

    /* JADX INFO: renamed from: d */
    public static boolean f438d = false;

    /* JADX INFO: renamed from: e */
    public static boolean f439e = false;

    /* JADX INFO: renamed from: f */
    public static long f440f = 0;

    /* JADX INFO: renamed from: g */
    public static boolean f441g = false;

    /* JADX INFO: renamed from: h */
    public static boolean f442h = false;

    /* JADX INFO: renamed from: i */
    public static boolean f443i = false;

    /* JADX INFO: renamed from: j */
    public static String f444j = "launch";

    /* JADX INFO: renamed from: k */
    public static String f445k = "loading";

    /* JADX INFO: renamed from: l */
    public static a<Boolean> f446l;

    public enum ScActionFrom {
        SEE("see_who_likes_me"),
        SUGGEST("suggest_users_home"),
        PROFILE("suggest_user_profile_info"),
        SECRET("secret_crush"),
        HE_PAI("hepaidu_index"),
        TALK("talk"),
        FOLLOW("follow"),
        QUICK_CHAT("quickchat"),
        WHO_I_LIKE("see_who_i_liked"),
        PICKS("picks"),
        MEET("meet"),
        KANKAN("kankan"),
        INTL_PICKS("intl_picks"),
        INTL_VISITOR("intl_visitor"),
        NEARBY("nearby"),
        INTL_RECOVERY_POP("intl_recovery_pop");

        String from;

        ScActionFrom(String str) {
            this.from = str;
        }

        public String getFrom() {
            return this.from;
        }
    }

    public enum ScActionName {
        LIKE("like"),
        SUPER_LIKE("superlike"),
        DISLIKE("dislike"),
        UNDO("undo"),
        UNKNOWN("unknown");

        String name;

        ScActionName(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.HomeStatisticsHelper$a */
    public static /* synthetic */ class C0023a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f447a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f448b;

        static {
            int[] iArr = new int[VirtualCardType.values().length];
            f448b = iArr;
            try {
                iArr[VirtualCardType.OnlineMatchBroadcastCard.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f448b[VirtualCardType.FourSelectOneAdCard.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f448b[VirtualCardType.SuperlikeGuideCard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f448b[VirtualCardType.UndoGuideCard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f448b[VirtualCardType.ImpressSignalCard.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f448b[VirtualCardType.AdCard.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f448b[VirtualCardType.LiveLivingCard.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f448b[VirtualCardType.LiveVoiceCard.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f448b[VirtualCardType.LiveMultipleCard.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f448b[VirtualCardType.LiveVoiceNewCard.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f448b[VirtualCardType.LiveVoiceRoomCard.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f448b[VirtualCardType.IceBreakQuestionOfflineCard.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr2 = new int[SwipeDirection.values().length];
            f447a = iArr2;
            try {
                iArr2[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f447a[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f447a[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    static {
        a<Boolean> aVarC = a.c(Boolean.FALSE);
        f446l = aVarC;
        aVarC.subscribe(mkd0.G(new e30() { // from class: l.a9l
            public final void call(Object obj) {
                HomeStatisticsHelper.m644a((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A */
    public static void m636A(C0158d c0158d, Throwable th) {
        if (th == null) {
            return;
        }
        if (th instanceof TantanException.Client.CoreService) {
            m637B(c0158d, String.valueOf(((TantanException.Client.CoreService) th).code));
        } else {
            m637B(c0158d, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m637B(C0158d c0158d, String str) {
        if (c0158d == null) {
            return;
        }
        c0158d.m2444a(str);
        l3f l3fVar = new l3f();
        l3fVar.s = "e_swipeaction";
        l3fVar.d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
        l3fVar.n = c0158d.m2451h();
        zvf0.o(l3fVar, c0158d.m2455l());
    }

    /* JADX INFO: renamed from: C */
    public static void m638C(boolean z) {
        f442h = z;
    }

    /* JADX INFO: renamed from: D */
    public static void m639D(boolean z) {
        f446l.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: E */
    public static void m640E(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f445k = str;
    }

    /* JADX INFO: renamed from: F */
    public static void m641F(String str) {
        if (f439e) {
            f444j = str;
        }
    }

    /* JADX INFO: renamed from: G */
    public static ScActionName m642G(SwipeDirection swipeDirection) {
        int i = C0023a.f447a[swipeDirection.ordinal()];
        if (i == 1) {
            return ScActionName.SUPER_LIKE;
        }
        if (i != 2) {
            return i != 3 ? ScActionName.UNKNOWN : ScActionName.DISLIKE;
        }
        return ScActionName.LIKE;
    }

    /* JADX INFO: renamed from: H */
    public static void m643H(SwipeDirection swipeDirection, VirtualCard virtualCard) {
        String str;
        if (swipeDirection == null || virtualCard == null) {
            return;
        }
        CoreSuggested.UserInfo userInfoProxy = virtualCard.getUserInfoProxy();
        HashMap map = new HashMap();
        m656m(userInfoProxy, map, null);
        int i = C0023a.f447a[swipeDirection.ordinal()];
        if (i == 1) {
            str = "up";
        } else if (i != 2) {
            str = i != 3 ? "" : "left";
        } else {
            str = "right";
        }
        boolean zIsEmpty = CoreModule.c.m0.c2.isEmpty();
        map.put("swipe_directions", str);
        map.put("is_guided_action", !zIsEmpty ? "1" : "0");
        o6j0.f("e_card", "p_suggest_users_home_view", map);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m644a(Boolean bool) {
        if (f439e) {
            if (bool.booleanValue()) {
                f442h = true;
                m660q();
            } else {
                f442h = false;
                m659p();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C0158d m645b(String str, User user, boolean z, boolean z2, LikeExtraData likeExtraData) {
        C0158d c0158dM2442E = new C0158d(str).m2442E(user == null ? "" : ((DbObject) user).id);
        c0158dM2442E.m2461r(ScActionFrom.FOLLOW).m2462s("click");
        if (z2) {
            c0158dM2442E.m2460q(ScActionName.SUPER_LIKE);
            c0158dM2442E.m2466w("e_superlikeButton");
        } else if (z) {
            c0158dM2442E.m2460q(ScActionName.LIKE);
            c0158dM2442E.m2466w("e_likeButton");
        } else {
            c0158dM2442E.m2460q(ScActionName.DISLIKE);
            c0158dM2442E.m2466w("e_dislikeButton");
        }
        if (NullChecker.a(likeExtraData)) {
            SwipeExtraScData swipeExtraScData = likeExtraData.swipeExtraScData;
            c0158dM2442E.m2439B(swipeExtraScData.picUrl);
            c0158dM2442E.m2469z(swipeExtraScData.picNum);
            c0158dM2442E.m2438A(swipeExtraScData.picUploads);
        }
        return c0158dM2442E;
    }

    /* JADX INFO: renamed from: c */
    public static C0158d m646c(User user, boolean z, boolean z2, SwipeDirection swipeDirection) {
        UssTags ussTags;
        String str = "";
        C0158d c0158d = new C0158d(z2 ? "p_suggest_user_profile_info_view" : "p_suggest_users_home_view", z2 ? ScActionFrom.PROFILE : ScActionFrom.SUGGEST, user == null ? "" : ((DbObject) user).id);
        if (user != null && (ussTags = user.ussTags) != null) {
            str = ussTags.eventInfo;
        }
        c0158d.m2465v(str);
        c0158d.m2460q(m642G(swipeDirection));
        c0158d.m2462s(z ? "click" : "swipe");
        if (z2) {
            if (swipeDirection == SwipeDirection.RIGHT) {
                c0158d.m2466w("e_likeButton");
                return c0158d;
            }
            if (swipeDirection == SwipeDirection.LEFT) {
                c0158d.m2466w("e_dislikeButton");
                return c0158d;
            }
            if (swipeDirection == SwipeDirection.UP) {
                c0158d.m2466w("e_superlikeButton");
                return c0158d;
            }
        } else {
            if (!z) {
                c0158d.m2466w("e_card");
                return c0158d;
            }
            if (swipeDirection == SwipeDirection.RIGHT) {
                c0158d.m2466w("e_likeButton");
                return c0158d;
            }
            if (swipeDirection == SwipeDirection.LEFT) {
                c0158d.m2466w("e_dislikeButton");
                return c0158d;
            }
            if (swipeDirection == SwipeDirection.UP) {
                c0158d.m2466w("e_superlikeButton");
            }
        }
        return c0158d;
    }

    /* JADX INFO: renamed from: d */
    public static C0158d m647d(jj4 jj4Var, boolean z, boolean z2, SwipeDirection swipeDirection, wsf0 wsf0Var) {
        C0158d c0158dM646c = m646c(jj4Var == null ? null : jj4Var.m17130d(), z, z2, swipeDirection);
        c0158dM646c.m2446c(wsf0Var, jj4Var);
        if (NullChecker.a(jj4Var) && NullChecker.a(jj4Var.m17128b()) && NullChecker.a(jj4Var.m17128b().f15204d) && NullChecker.a(jj4Var.m17130d())) {
            Media media = jj4Var.m17128b().f15204d;
            c0158dM646c.m2438A(jj4Var.m17130d().pictures.size());
            c0158dM646c.m2439B(media.url);
            c0158dM646c.m2469z(jj4Var.m17130d().pictures.indexOf(media));
        }
        if (NullChecker.a(jj4Var) && NullChecker.a(jj4Var.m17131e())) {
            if (NullChecker.a(jj4Var.m17131e().cityCData)) {
                c0158dM646c.m2464u(true);
            }
            if (NullChecker.a(jj4Var.m17131e().cardInfos) && !TextUtils.isEmpty(jj4Var.m17131e().cardInfos.cardName)) {
                c0158dM646c.m2463t(jj4Var.m17131e().cardInfos.cardName);
            }
            if (NullChecker.a(jj4Var.m17131e().cardInfos)) {
                CoreSuggested.UserInfo userInfoM17131e = jj4Var.m17131e();
                User userM17130d = jj4Var.m17130d();
                if (userM17130d == null) {
                    userM17130d = CoreModule.c.e0.oa(userInfoM17131e.id);
                }
                c0158dM646c.m2467x(userInfoM17131e.cardInfos.onlineHighReplyRate && NullChecker.a(userM17130d) && !userM17130d.location.isHideUpdateTime() && !CoreModule.c.E0.w3(userM17130d));
            }
        }
        if (sb90.c(jj4Var.m17130d())) {
            c0158dM646c.m2468y(true);
        }
        if (jj4Var.m17128b() != null) {
            c0158dM646c.m2440C(jj4Var.m17128b().f15206f);
        }
        j760<String, String> j760VarM654k = m654k(jj4Var.m17131e());
        c0158dM646c.m2445b(j760.a("ideal_type", j760VarM654k.a));
        c0158dM646c.m2445b(j760.a("ideal_type_relate_profile", j760VarM654k.b));
        return c0158dM646c;
    }

    /* JADX INFO: renamed from: e */
    public static C0158d m648e(String str, boolean z, boolean z2, boolean z3, User user) {
        String str2;
        ScActionName scActionName;
        C0158d c0158d = new C0158d(str);
        C0158d c0158dM2442E = c0158d.m2462s(z ? "click" : "swipe").m2442E(user == null ? "" : ((DbObject) user).id);
        if (!z) {
            str2 = "e_card";
        } else if (z3) {
            str2 = "e_superlikeButton";
        } else {
            str2 = z2 ? "e_likeButton" : "e_dislikeButton";
        }
        C0158d c0158dM2461r = c0158dM2442E.m2466w(str2).m2461r(ScActionFrom.PICKS);
        if (z3) {
            scActionName = ScActionName.SUPER_LIKE;
        } else {
            scActionName = z2 ? ScActionName.LIKE : ScActionName.DISLIKE;
        }
        c0158dM2461r.m2460q(scActionName);
        if (NullChecker.b(user)) {
            c0158d.m2439B(((Media) user.pictures.get(0)).url);
            c0158d.m2438A(user.pictures.size());
            c0158d.m2469z(0);
        }
        return c0158d;
    }

    /* JADX INFO: renamed from: f */
    public static C0158d m649f(String str, boolean z, boolean z2, boolean z3, User user) {
        String str2;
        ScActionName scActionName;
        C0158d c0158d = new C0158d(str);
        C0158d c0158dM2442E = c0158d.m2462s(z ? "click" : "swipe").m2442E(user == null ? "" : ((DbObject) user).id);
        if (!z) {
            str2 = "e_card";
        } else if (z3) {
            str2 = "e_superlikeButton";
        } else {
            str2 = z2 ? "e_likeButton" : "e_dislikeButton";
        }
        C0158d c0158dM2461r = c0158dM2442E.m2466w(str2).m2461r(ScActionFrom.SEE);
        if (z3) {
            scActionName = ScActionName.SUPER_LIKE;
        } else {
            scActionName = z2 ? ScActionName.LIKE : ScActionName.DISLIKE;
        }
        c0158dM2461r.m2460q(scActionName);
        if (NullChecker.b(user)) {
            c0158d.m2439B(((Media) user.pictures.get(0)).url);
            c0158d.m2438A(user.pictures.size());
            c0158d.m2469z(0);
        }
        return c0158d;
    }

    /* JADX INFO: renamed from: g */
    public static C0158d m650g(String str, String str2) {
        C0158d c0158d = new C0158d(str);
        c0158d.m2460q(ScActionName.UNDO).m2462s("click").m2461r(ScActionFrom.SUGGEST).m2442E(str2);
        c0158d.m2466w("e_undo_button");
        return c0158d;
    }

    /* JADX INFO: renamed from: h */
    public static C0158d m651h(String str, String str2, wsf0 wsf0Var) {
        C0158d c0158dM650g = m650g(str, str2);
        c0158dM650g.m2447d(wsf0Var);
        return c0158dM650g;
    }

    /* JADX INFO: renamed from: i */
    public static void m652i(CoreSuggested.UserInfo userInfo, String str) {
        if (NullChecker.a(userInfo) && !TextUtils.isEmpty(userInfo.descriptionId) && userInfo.hasDescTagShow) {
            o6j0.h("e_home_card_info_tag", str, new o6j0.a[]{o6j0.a.h("other_user_id", userInfo.id), o6j0.a.h("tag_type", userInfo.descriptionId)});
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m653j(CoreSuggested.UserInfo userInfo, Map<String, Object> map) {
        if (!NullChecker.a(userInfo) || !NullChecker.a(userInfo.controlCardInfo) || TextUtils.isEmpty(userInfo.controlCardInfo.resourceKey) || TextUtils.isEmpty(userInfo.controlCardInfo.ruleKey) || TextUtils.isEmpty(userInfo.controlCardInfo.business) || TextUtils.isEmpty(userInfo.controlCardInfo.cardType)) {
            return;
        }
        map.put("ad_card_id", userInfo.controlCardInfo.cardType);
        map.put("ad_card_type", userInfo.controlCardInfo.business);
    }

    /* JADX INFO: renamed from: k */
    public static j760<String, String> m654k(CoreSuggested.UserInfo userInfo) {
        String strM25624a;
        String str = "none";
        if (NullChecker.a(userInfo) && NullChecker.a(userInfo.idealInfo)) {
            IdealInfo idealInfo = userInfo.idealInfo;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            if (!vwb.J(idealInfo.fitIdeals)) {
                for (IdealTag idealTag : idealInfo.fitIdeals) {
                    for (String str2 : idealTag.fitIdealDetails) {
                        if (!TextUtils.isEmpty(str2) && !hashSet.contains(str2) && arrayList2.size() < 3) {
                            arrayList2.add(str2);
                            hashSet.add(str2);
                            arrayList.add(idealTag.name);
                            break;
                        }
                    }
                }
            }
            String strM25624a2 = !vwb.J(arrayList) ? z8l.m25624a(",", (CharSequence[]) arrayList.toArray(new String[arrayList.size()])) : "none";
            str = strM25624a2;
            strM25624a = vwb.J(arrayList2) ? "none" : z8l.m25624a(",", (CharSequence[]) arrayList2.toArray(new String[arrayList2.size()]));
        } else {
            strM25624a = "none";
        }
        return j760.a(str, strM25624a);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m655l() {
        return f438d;
    }

    /* JADX INFO: renamed from: m */
    public static void m656m(CoreSuggested.UserInfo userInfo, Map<String, Object> map, a5m a5mVar) {
        if (userInfo == null) {
            return;
        }
        map.put("card_order", Integer.valueOf(CoreModule.c.Y0.b()));
        if (upa.J3()) {
            map.put("from_top_tab", va40.m23330a(NewTanFragTag.ALREADY_AUTH) ? "verified" : "tantan");
        }
        if (upa.E1()) {
            map.put("city_cover", Boolean.valueOf(NullChecker.a(userInfo.cityCData)));
        }
        if (NullChecker.a(userInfo) && !TextUtils.isEmpty(userInfo.id) && sb90.c(CoreModule.c.e0.Pa(userInfo.id))) {
            map.put("mystery_status", "mystery");
        } else {
            map.put("mystery_status", "normal");
        }
        j760<String, String> j760VarM654k = m654k(userInfo);
        map.put("ideal_type", j760VarM654k.a);
        map.put("ideal_type_relate_profile", j760VarM654k.b);
        if (!NullChecker.a(userInfo) || !"VirtualCard".equals(userInfo.id)) {
            boolean z = userInfo.coreMomentInfo != null;
            User userOa = CoreModule.c.e0.oa(userInfo.id);
            if (xe40.m24830f().m24834i(userInfo)) {
                map.put("card_name", "greeting_new");
            } else if (z) {
                map.put("card_name", "moment_card");
            } else if (!TextUtils.isEmpty(CoreModule.c.m0.o2) && TextUtils.equals(CoreModule.c.m0.o2, userInfo.id)) {
                map.put("card_name", "anchor");
            } else if (NullChecker.a(userInfo) && NullChecker.a(userInfo.cardInfos) && userInfo.cardInfos.onlineHighReplyRate && NullChecker.a(userOa) && NullChecker.a(userOa.location) && !userOa.location.isHideUpdateTime() && !CoreModule.c.E0.w3(userOa)) {
                map.put("card_name", "online_like");
            } else {
                map.put("card_name", "normal_card");
            }
            if (NullChecker.a(userInfo) && NullChecker.a(userInfo.cardInfos) && !TextUtils.isEmpty(userInfo.cardInfos.userId)) {
                String str = TextUtils.isEmpty(userInfo.cardInfos.cardName) ? "normal_card" : userInfo.cardInfos.cardName;
                if (map.containsKey("card_name")) {
                    map.put("card_name", map.get("card_name") + "," + str);
                } else {
                    map.put("card_name", str);
                }
                if (vwb.J(userInfo.cardInfos.cardTypes)) {
                    map.put("recommend_tag", "");
                    return;
                } else {
                    map.put("recommend_tag", vwb.U(userInfo.cardInfos.cardTypes, ","));
                    return;
                }
            }
            return;
        }
        switch (C0023a.f448b[userInfo.virtualCardType.ordinal()]) {
            case 1:
                map.put("card_name", "quickchat");
                map.put("moments_user_id", userInfo.extraInfo);
                break;
            case 2:
                map.put("card_name", "choose");
                break;
            case 3:
                map.put("card_name", "newbieguide_superlike");
                break;
            case 4:
                map.put("card_name", "newbieguide_undo");
                break;
            case 5:
                map.put("card_name", "love_signal");
                if (NullChecker.a(userInfo.impressSignalCardWrapper) && NullChecker.a(userInfo.impressSignalCardWrapper.getPushCustom()) && !TextUtils.isEmpty(userInfo.impressSignalCardWrapper.getPushCustom().userId)) {
                    User userPa = CoreModule.c.e0.Pa(userInfo.impressSignalCardWrapper.getPushCustom().userId);
                    if (NullChecker.a(userPa)) {
                        map.put("moments_user_id", ((DbObject) userPa).id);
                    }
                    break;
                }
                break;
            case 6:
                if (jb0.g(userInfo)) {
                    map.put("card_name", "add_tag");
                } else if (jb0.f(userInfo)) {
                    map.put("card_name", "add_operation_tag");
                } else if (jb0.c(userInfo)) {
                    map.put("card_name", "artwork");
                } else if (!jb0.d(userInfo)) {
                    Object obj = userInfo.extensionObject;
                    if (obj instanceof OMSAdCardInfo) {
                        map.put("card_name", ((OMSAdCardInfo) obj).identifier);
                    }
                } else {
                    map.put("card_name", "artwork_multiple_choice");
                }
                break;
            case 7:
            case 8:
                if (NullChecker.a(userInfo.cardInfos) && !TextUtils.isEmpty(userInfo.cardInfos.userId)) {
                    map.put("moments_user_id", userInfo.cardInfos.userId);
                    if (TextUtils.isEmpty(userInfo.cardInfos.cardName)) {
                        map.put("card_name", "");
                    } else {
                        map.put("card_name", userInfo.cardInfos.cardName);
                    }
                    if (!vwb.J(userInfo.cardInfos.cardTypes)) {
                        map.put("recommend_tag", vwb.U(userInfo.cardInfos.cardTypes, ","));
                    } else {
                        map.put("recommend_tag", "");
                    }
                    break;
                }
                break;
            case MediaPickerParamsObject.FROM_JS_BRIDGE_SWIPE_CARD /* 9 */:
                map.put("card_name", "live_room_multiple");
                break;
            case 10:
            case MediaPickerParamsObject.FROM_CHAT_SWITCH_BACK_PIC /* 11 */:
                map.put("card_name", "live_audio_room");
                break;
            case MediaPickerParamsObject.FROM_PROFILE_WEALTH /* 12 */:
                map.put("card_name", "male_love_sayhi");
                break;
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m657n() {
        return PermissionHelper.m10210b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
    }

    /* JADX INFO: renamed from: o */
    public static void m658o() {
        f439e = true;
        f442h = true;
    }

    /* JADX INFO: renamed from: p */
    public static void m659p() {
        m667x();
        m665v();
        m663t();
    }

    /* JADX INFO: renamed from: q */
    public static void m660q() {
        if (f445k.equals("no_lo")) {
            m668y();
        } else if (f445k.equals("loading")) {
            m666w();
        } else {
            m664u();
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m661r(jj4 jj4Var, String str, String str2, boolean z) {
        m662s(jj4Var, str, str2, z, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static void m662s(jj4 jj4Var, String str, String str2, boolean z, @Nullable lol lolVar) {
        CoreMomentInfo momentInfoThemeSlide;
        boolean zMo830a0;
        int i = (NullChecker.a(jj4Var) && NullChecker.a(jj4Var.m17128b()) && NullChecker.a(jj4Var.m17128b().f15201a)) ? !((Boolean) jj4Var.m17128b().f15201a.e()).booleanValue() ? 1 : 0 : 1;
        boolean zMo765D = jj4Var.m17129c() instanceof a5m ? ((a5m) jj4Var.m17129c()).mo765D("female_like_flag") : false;
        String str3 = zMo765D ? "upper_right" : "null";
        if ((jj4Var.m17129c() instanceof a5m) && ((a5m) jj4Var.m17129c()).mo765D("female_like_flag_lower_left")) {
            str3 = "lower_left";
            zMo765D = true;
        }
        if (NullChecker.a(jj4Var) && NullChecker.a(jj4Var.m17131e()) && jj4Var.m17131e().isUserLikeMe()) {
            zMo765D = true;
        }
        boolean z2 = (jj4Var.m17129c() instanceof a5m) && ((a5m) jj4Var.m17129c()).mo765D("common_points_label_flag");
        CoreSuggested.UserInfo userInfoM17131e = NullChecker.a(jj4Var) ? jj4Var.m17131e() : null;
        HashMap map = new HashMap();
        int i2 = i;
        boolean z3 = zMo765D;
        boolean z4 = z2;
        if (!(jj4Var.m17129c() instanceof a5m) || !TextUtils.equals(str, "p_activity_momentcard_view")) {
            map.put("IsWhiteBlock", Integer.valueOf(i2));
            map.put("moments_user_id", str2);
            if (jj4Var.m17129c() instanceof d5m) {
                map.put("is_moment_card", ((d5m) jj4Var.m17129c()).mo843e() ? "1" : "0");
            }
            map.put("is_first_picture", Boolean.valueOf(z && jj4Var.m17128b().m17137a() == 0));
            map.put("show_he_liked", Boolean.valueOf(z3));
            map.put("receiver_user_id", "");
            map.put("swipe_scene", "default");
            map.put("show_he_liked_position", str3);
            map.put("theme_card_ornot", Boolean.valueOf(NullChecker.a(userInfoM17131e) && userInfoM17131e.isThemeCard));
            map.put("is_show_common_tag", Boolean.valueOf(z4));
            map.put("is_show_longtimenosee_tag", (upa.r1() && NullChecker.a(userInfoM17131e) && userInfoM17131e.meetAgain) ? "1" : "0");
            map.put("is_activity", Integer.valueOf((!NullChecker.a(userInfoM17131e) || TextUtils.isEmpty(userInfoM17131e.operationUrl)) ? 0 : 1));
            m653j(userInfoM17131e, map);
            m656m(userInfoM17131e, map, null);
            zvf0.y("e_card", str, map);
            return;
        }
        a5m a5mVar = (a5m) jj4Var.m17129c();
        if (a5mVar instanceof d5m) {
            d5m d5mVar = (d5m) a5mVar;
            momentInfoThemeSlide = d5mVar.getMomentInfoThemeSlide();
            zMo830a0 = d5mVar.mo830a0();
        } else {
            momentInfoThemeSlide = userInfoM17131e == null ? null : userInfoM17131e.coreMomentInfo;
            zMo830a0 = (userInfoM17131e == null || userInfoM17131e.coreMomentInfo == null) ? false : true;
        }
        CoreMomentInfo coreMomentInfo = momentInfoThemeSlide;
        boolean z5 = zMo830a0;
        map.put("IsWhiteBlock", Integer.valueOf(i2));
        map.put("moments_user_id", str2);
        map.put("is_first_picture", Boolean.valueOf(z && jj4Var.m17128b().m17137a() == 0));
        map.put("show_he_liked", Boolean.valueOf(z3));
        map.put("swipe_scene", "default");
        map.put("show_he_liked_position", str3);
        map.put("theme_card_ornot", Boolean.valueOf(NullChecker.a(userInfoM17131e) && userInfoM17131e.isThemeCard));
        map.put("is_moment_card", z5 ? "1" : "0");
        map.put("moment_id", coreMomentInfo != null ? ((CopyObject) coreMomentInfo).id : "0");
        map.put("topic_key", eli0.m13974a());
        m656m(userInfoM17131e, map, a5mVar);
        m653j(userInfoM17131e, map);
        zvf0.y("e_card", str, map);
        if (userInfoM17131e.isCoreMomentThemeCard || userInfoM17131e.isCoreMomentCard) {
            o6j0.h("e_moment", str, new o6j0.a[]{o6j0.a.h("moment_id", coreMomentInfo != null ? ((CopyObject) coreMomentInfo).id : "0"), o6j0.a.h("owner_id", coreMomentInfo != null ? coreMomentInfo.owner : "0"), o6j0.a.h("recommend_reason", "more history like")});
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m663t() {
        if (f441g) {
            f441g = false;
            l3f l3fVar = new l3f();
            l3fVar.s = "e_suggest_users_home_status_end";
            l3fVar.d = EventNameEnum.SYS_CHECK;
            l3fVar.n = "p_suggest_users_home_view";
            zvf0.o(l3fVar, new j760[]{new j760("status", "card"), new j760("view_appear", 1), new j760("duration", Long.valueOf(SystemClock.uptimeMillis() - f440f)), new j760("loadingsource", "")});
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m664u() {
        if (f441g) {
            return;
        }
        f440f = SystemClock.uptimeMillis();
        f445k = "card";
        if (f439e && f442h) {
            f441g = true;
            l3f l3fVar = new l3f();
            l3fVar.s = "e_suggest_users_home_status_start";
            l3fVar.d = EventNameEnum.SYS_CHECK;
            l3fVar.n = "p_suggest_users_home_view";
            zvf0.o(l3fVar, new j760[]{new j760("status", "card"), new j760("view_appear", 1)});
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m665v() {
        if (f438d) {
            f438d = false;
            if (f439e) {
                l3f l3fVar = new l3f();
                l3fVar.s = "e_suggest_users_home_status_end";
                l3fVar.d = EventNameEnum.SYS_CHECK;
                l3fVar.n = "p_suggest_users_home_view";
                zvf0.o(l3fVar, new j760[]{new j760("status", "loading"), new j760("view_appear", Integer.valueOf(f443i ? 1 : 0)), new j760("duration", Long.valueOf(SystemClock.uptimeMillis() - f437c)), new j760("loadingsource", f444j)});
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m666w() {
        if (f438d) {
            return;
        }
        f438d = true;
        f445k = "loading";
        if (f439e) {
            f443i = f442h;
            f437c = SystemClock.uptimeMillis();
            l3f l3fVar = new l3f();
            l3fVar.s = "e_suggest_users_home_status_start";
            l3fVar.d = EventNameEnum.SYS_CHECK;
            l3fVar.n = "p_suggest_users_home_view";
            zvf0.o(l3fVar, new j760[]{new j760("status", "loading"), new j760("view_appear", Integer.valueOf(f442h ? 1 : 0))});
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m667x() {
        if (f436b) {
            f436b = false;
            if (m657n()) {
                f445k = "card";
            }
            l3f l3fVar = new l3f();
            l3fVar.s = "e_suggest_users_home_status_end";
            l3fVar.d = EventNameEnum.SYS_CHECK;
            l3fVar.n = "p_suggest_users_home_view";
            zvf0.o(l3fVar, new j760[]{new j760("status", "no_lo"), new j760("view_appear", 1), new j760("duration", Long.valueOf(SystemClock.uptimeMillis() - f435a)), new j760("loadingsource", "")});
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m668y() {
        if (f436b) {
            return;
        }
        m658o();
        f435a = SystemClock.uptimeMillis();
        f436b = true;
        f445k = "no_lo";
        l3f l3fVar = new l3f();
        l3fVar.s = "e_suggest_users_home_status_start";
        l3fVar.d = EventNameEnum.SYS_CHECK;
        l3fVar.n = "p_suggest_users_home_view";
        zvf0.o(l3fVar, new j760[]{new j760("status", "no_lo"), new j760("view_appear", 1)});
    }

    /* JADX INFO: renamed from: z */
    public static void m669z() {
        f439e = false;
        f442h = false;
        f444j = "others";
        f445k = "loading";
        f446l.onNext(Boolean.FALSE);
    }
}
