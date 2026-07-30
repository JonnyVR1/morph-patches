package com.p046p1.mobile.putong.core.newui.home;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.IdealInfo;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.ODiamondStatisticsType;
import com.p046p1.mobile.putong.core.data.SeeSwitchName;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p046p1.mobile.putong.core.p053ui.home.VirtualCard;
import com.p046p1.mobile.putong.data.IdealTag;
import com.p046p1.mobile.putong.data.LikeExtraData;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSAdCardInfo;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.SwipeExtraScData;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UssTags;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p133rx.subjects.C22392a;
import p149l.a5m;
import p149l.d5m;
import p149l.e30;
import p149l.eli0;
import p149l.j760;
import p149l.jb0;
import p149l.jj4;
import p149l.l3f;
import p149l.lol;
import p149l.mkd0;
import p149l.o6j0;
import p149l.sb90;
import p149l.upa;
import p149l.va40;
import p149l.vwb;
import p149l.wsf0;
import p149l.xe40;
import p149l.z8l;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class HomeStatisticsHelper {

    /* JADX INFO: renamed from: a */
    public static long f21657a = 0;

    /* JADX INFO: renamed from: b */
    public static boolean f21658b = false;

    /* JADX INFO: renamed from: c */
    public static long f21659c = 0;

    /* JADX INFO: renamed from: d */
    public static boolean f21660d = false;

    /* JADX INFO: renamed from: e */
    public static boolean f21661e = false;

    /* JADX INFO: renamed from: f */
    public static long f21662f = 0;

    /* JADX INFO: renamed from: g */
    public static boolean f21663g = false;

    /* JADX INFO: renamed from: h */
    public static boolean f21664h = false;

    /* JADX INFO: renamed from: i */
    public static boolean f21665i = false;

    /* JADX INFO: renamed from: j */
    public static String f21666j = "launch";

    /* JADX INFO: renamed from: k */
    public static String f21667k = "loading";

    /* JADX INFO: renamed from: l */
    public static C22392a<Boolean> f21668l;

    public enum ScActionFrom {
        SEE(SeeSwitchName.see_who_likes_me),
        SUGGEST("suggest_users_home"),
        PROFILE("suggest_user_profile_info"),
        SECRET("secret_crush"),
        HE_PAI("hepaidu_index"),
        TALK(ODiamondStatisticsType.talk),
        FOLLOW("follow"),
        QUICK_CHAT("quickchat"),
        WHO_I_LIKE("see_who_i_liked"),
        PICKS("picks"),
        MEET("meet"),
        KANKAN("kankan"),
        INTL_PICKS("intl_picks"),
        INTL_VISITOR(LikeFrom.intl_visitor),
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
    public static /* synthetic */ class C7859a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f21669a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f21670b;

        static {
            int[] iArr = new int[VirtualCardType.values().length];
            f21670b = iArr;
            try {
                iArr[VirtualCardType.OnlineMatchBroadcastCard.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21670b[VirtualCardType.FourSelectOneAdCard.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21670b[VirtualCardType.SuperlikeGuideCard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21670b[VirtualCardType.UndoGuideCard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21670b[VirtualCardType.ImpressSignalCard.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21670b[VirtualCardType.AdCard.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21670b[VirtualCardType.LiveLivingCard.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21670b[VirtualCardType.LiveVoiceCard.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21670b[VirtualCardType.LiveMultipleCard.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21670b[VirtualCardType.LiveVoiceNewCard.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21670b[VirtualCardType.LiveVoiceRoomCard.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21670b[VirtualCardType.IceBreakQuestionOfflineCard.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr2 = new int[SwipeDirection.values().length];
            f21669a = iArr2;
            try {
                iArr2[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21669a[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21669a[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    static {
        C22392a<Boolean> c22392aM221513c = C22392a.m221513c(Boolean.FALSE);
        f21668l = c22392aM221513c;
        c22392aM221513c.subscribe(mkd0.m154955G(new e30() { // from class: l.a9l
            @Override // p149l.e30
            public final void call(Object obj) {
                HomeStatisticsHelper.m36695a((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A */
    public static void m36687A(C7994d c7994d, Throwable th) {
        if (th == null) {
            return;
        }
        if (th instanceof TantanException.Client.CoreService) {
            m36688B(c7994d, String.valueOf(((TantanException.Client.CoreService) th).code));
        } else {
            m36688B(c7994d, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m36688B(C7994d c7994d, String str) {
        if (c7994d == null) {
            return;
        }
        c7994d.m38466a(str);
        l3f l3fVar = new l3f();
        l3fVar.f125900s = "e_swipeaction";
        l3fVar.f125885d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
        l3fVar.f125895n = c7994d.m38473h();
        zvf0.m220393o(l3fVar, c7994d.m38477l());
    }

    /* JADX INFO: renamed from: C */
    public static void m36689C(boolean z) {
        f21664h = z;
    }

    /* JADX INFO: renamed from: D */
    public static void m36690D(boolean z) {
        f21668l.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: E */
    public static void m36691E(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f21667k = str;
    }

    /* JADX INFO: renamed from: F */
    public static void m36692F(String str) {
        if (f21661e) {
            f21666j = str;
        }
    }

    /* JADX INFO: renamed from: G */
    public static ScActionName m36693G(SwipeDirection swipeDirection) {
        int i = C7859a.f21669a[swipeDirection.ordinal()];
        if (i == 1) {
            return ScActionName.SUPER_LIKE;
        }
        if (i != 2) {
            return i != 3 ? ScActionName.UNKNOWN : ScActionName.DISLIKE;
        }
        return ScActionName.LIKE;
    }

    /* JADX INFO: renamed from: H */
    public static void m36694H(SwipeDirection swipeDirection, VirtualCard virtualCard) {
        String str;
        if (swipeDirection == null || virtualCard == null) {
            return;
        }
        CoreSuggested.UserInfo userInfoProxy = virtualCard.getUserInfoProxy();
        HashMap map = new HashMap();
        m36707m(userInfoProxy, map, null);
        int i = C7859a.f21669a[swipeDirection.ordinal()];
        if (i == 1) {
            str = "up";
        } else if (i != 2) {
            str = i != 3 ? "" : BLiveGiftBubblePopupTitlePosition.left;
        } else {
            str = "right";
        }
        boolean zIsEmpty = CoreModule.f17545c.f19663m0.f19402c2.isEmpty();
        map.put("swipe_directions", str);
        map.put("is_guided_action", !zIsEmpty ? "1" : "0");
        o6j0.m162862f(MatchScData.ModuleId.mid_e_card, "p_suggest_users_home_view", map);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m36695a(Boolean bool) {
        if (f21661e) {
            if (bool.booleanValue()) {
                f21664h = true;
                m36711q();
            } else {
                f21664h = false;
                m36710p();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C7994d m36696b(String str, User user, boolean z, boolean z2, LikeExtraData likeExtraData) {
        C7994d c7994dM38464E = new C7994d(str).m38464E(user == null ? "" : user.f56011id);
        c7994dM38464E.m38483r(ScActionFrom.FOLLOW).m38484s("click");
        if (z2) {
            c7994dM38464E.m38482q(ScActionName.SUPER_LIKE);
            c7994dM38464E.m38488w(MatchScData.ModuleId.mid_e_superlikeButton);
        } else if (z) {
            c7994dM38464E.m38482q(ScActionName.LIKE);
            c7994dM38464E.m38488w(MatchScData.ModuleId.mid_e_likeButton);
        } else {
            c7994dM38464E.m38482q(ScActionName.DISLIKE);
            c7994dM38464E.m38488w("e_dislikeButton");
        }
        if (NullChecker.m81303a(likeExtraData)) {
            SwipeExtraScData swipeExtraScData = likeExtraData.swipeExtraScData;
            c7994dM38464E.m38461B(swipeExtraScData.picUrl);
            c7994dM38464E.m38491z(swipeExtraScData.picNum);
            c7994dM38464E.m38460A(swipeExtraScData.picUploads);
        }
        return c7994dM38464E;
    }

    /* JADX INFO: renamed from: c */
    public static C7994d m36697c(User user, boolean z, boolean z2, SwipeDirection swipeDirection) {
        UssTags ussTags;
        String str = "";
        C7994d c7994d = new C7994d(z2 ? OMSDialogPositon.p_suggest_user_profile_info_view : "p_suggest_users_home_view", z2 ? ScActionFrom.PROFILE : ScActionFrom.SUGGEST, user == null ? "" : user.f56011id);
        if (user != null && (ussTags = user.ussTags) != null) {
            str = ussTags.eventInfo;
        }
        c7994d.m38487v(str);
        c7994d.m38482q(m36693G(swipeDirection));
        c7994d.m38484s(z ? "click" : "swipe");
        if (z2) {
            if (swipeDirection == SwipeDirection.RIGHT) {
                c7994d.m38488w(MatchScData.ModuleId.mid_e_likeButton);
                return c7994d;
            }
            if (swipeDirection == SwipeDirection.LEFT) {
                c7994d.m38488w("e_dislikeButton");
                return c7994d;
            }
            if (swipeDirection == SwipeDirection.UP) {
                c7994d.m38488w(MatchScData.ModuleId.mid_e_superlikeButton);
                return c7994d;
            }
        } else {
            if (!z) {
                c7994d.m38488w(MatchScData.ModuleId.mid_e_card);
                return c7994d;
            }
            if (swipeDirection == SwipeDirection.RIGHT) {
                c7994d.m38488w(MatchScData.ModuleId.mid_e_likeButton);
                return c7994d;
            }
            if (swipeDirection == SwipeDirection.LEFT) {
                c7994d.m38488w("e_dislikeButton");
                return c7994d;
            }
            if (swipeDirection == SwipeDirection.UP) {
                c7994d.m38488w(MatchScData.ModuleId.mid_e_superlikeButton);
            }
        }
        return c7994d;
    }

    /* JADX INFO: renamed from: d */
    public static C7994d m36698d(jj4 jj4Var, boolean z, boolean z2, SwipeDirection swipeDirection, wsf0 wsf0Var) {
        C7994d c7994dM36697c = m36697c(jj4Var == null ? null : jj4Var.m141745d(), z, z2, swipeDirection);
        c7994dM36697c.m38468c(wsf0Var, jj4Var);
        if (NullChecker.m81303a(jj4Var) && NullChecker.m81303a(jj4Var.m141743b()) && NullChecker.m81303a(jj4Var.m141743b().f118236d) && NullChecker.m81303a(jj4Var.m141745d())) {
            Media media = jj4Var.m141743b().f118236d;
            c7994dM36697c.m38460A(jj4Var.m141745d().pictures.size());
            c7994dM36697c.m38461B(media.url);
            c7994dM36697c.m38491z(jj4Var.m141745d().pictures.indexOf(media));
        }
        if (NullChecker.m81303a(jj4Var) && NullChecker.m81303a(jj4Var.m141746e())) {
            if (NullChecker.m81303a(jj4Var.m141746e().cityCData)) {
                c7994dM36697c.m38486u(true);
            }
            if (NullChecker.m81303a(jj4Var.m141746e().cardInfos) && !TextUtils.isEmpty(jj4Var.m141746e().cardInfos.cardName)) {
                c7994dM36697c.m38485t(jj4Var.m141746e().cardInfos.cardName);
            }
            if (NullChecker.m81303a(jj4Var.m141746e().cardInfos)) {
                CoreSuggested.UserInfo userInfoM141746e = jj4Var.m141746e();
                User userM141745d = jj4Var.m141745d();
                if (userM141745d == null) {
                    userM141745d = CoreModule.f17545c.f19639e0.m169524oa(userInfoM141746e.f19472id);
                }
                c7994dM36697c.m38489x(userInfoM141746e.cardInfos.onlineHighReplyRate && NullChecker.m81303a(userM141745d) && !userM141745d.location.isHideUpdateTime() && !CoreModule.f17545c.f19561E0.m203800w3(userM141745d));
            }
        }
        if (sb90.m183207c(jj4Var.m141745d())) {
            c7994dM36697c.m38490y(true);
        }
        if (jj4Var.m141743b() != null) {
            c7994dM36697c.m38462C(jj4Var.m141743b().f118238f);
        }
        j760<String, String> j760VarM36705k = m36705k(jj4Var.m141746e());
        c7994dM36697c.m38467b(j760.m140076a("ideal_type", j760VarM36705k.f116564a));
        c7994dM36697c.m38467b(j760.m140076a("ideal_type_relate_profile", j760VarM36705k.f116565b));
        return c7994dM36697c;
    }

    /* JADX INFO: renamed from: e */
    public static C7994d m36699e(String str, boolean z, boolean z2, boolean z3, User user) {
        String str2;
        ScActionName scActionName;
        C7994d c7994d = new C7994d(str);
        C7994d c7994dM38464E = c7994d.m38484s(z ? "click" : "swipe").m38464E(user == null ? "" : user.f56011id);
        if (!z) {
            str2 = MatchScData.ModuleId.mid_e_card;
        } else if (z3) {
            str2 = MatchScData.ModuleId.mid_e_superlikeButton;
        } else {
            str2 = z2 ? MatchScData.ModuleId.mid_e_likeButton : "e_dislikeButton";
        }
        C7994d c7994dM38483r = c7994dM38464E.m38488w(str2).m38483r(ScActionFrom.PICKS);
        if (z3) {
            scActionName = ScActionName.SUPER_LIKE;
        } else {
            scActionName = z2 ? ScActionName.LIKE : ScActionName.DISLIKE;
        }
        c7994dM38483r.m38482q(scActionName);
        if (NullChecker.m81304b(user)) {
            c7994d.m38461B(user.pictures.get(0).url);
            c7994d.m38460A(user.pictures.size());
            c7994d.m38491z(0);
        }
        return c7994d;
    }

    /* JADX INFO: renamed from: f */
    public static C7994d m36700f(String str, boolean z, boolean z2, boolean z3, User user) {
        String str2;
        ScActionName scActionName;
        C7994d c7994d = new C7994d(str);
        C7994d c7994dM38464E = c7994d.m38484s(z ? "click" : "swipe").m38464E(user == null ? "" : user.f56011id);
        if (!z) {
            str2 = MatchScData.ModuleId.mid_e_card;
        } else if (z3) {
            str2 = MatchScData.ModuleId.mid_e_superlikeButton;
        } else {
            str2 = z2 ? MatchScData.ModuleId.mid_e_likeButton : "e_dislikeButton";
        }
        C7994d c7994dM38483r = c7994dM38464E.m38488w(str2).m38483r(ScActionFrom.SEE);
        if (z3) {
            scActionName = ScActionName.SUPER_LIKE;
        } else {
            scActionName = z2 ? ScActionName.LIKE : ScActionName.DISLIKE;
        }
        c7994dM38483r.m38482q(scActionName);
        if (NullChecker.m81304b(user)) {
            c7994d.m38461B(user.pictures.get(0).url);
            c7994d.m38460A(user.pictures.size());
            c7994d.m38491z(0);
        }
        return c7994d;
    }

    /* JADX INFO: renamed from: g */
    public static C7994d m36701g(String str, String str2) {
        C7994d c7994d = new C7994d(str);
        c7994d.m38482q(ScActionName.UNDO).m38484s("click").m38483r(ScActionFrom.SUGGEST).m38464E(str2);
        c7994d.m38488w("e_undo_button");
        return c7994d;
    }

    /* JADX INFO: renamed from: h */
    public static C7994d m36702h(String str, String str2, wsf0 wsf0Var) {
        C7994d c7994dM36701g = m36701g(str, str2);
        c7994dM36701g.m38469d(wsf0Var);
        return c7994dM36701g;
    }

    /* JADX INFO: renamed from: i */
    public static void m36703i(CoreSuggested.UserInfo userInfo, String str) {
        if (NullChecker.m81303a(userInfo) && !TextUtils.isEmpty(userInfo.descriptionId) && userInfo.hasDescTagShow) {
            o6j0.m162864h("e_home_card_info_tag", str, o6j0.C18854a.m162878h("other_user_id", userInfo.f19472id), o6j0.C18854a.m162878h("tag_type", userInfo.descriptionId));
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m36704j(CoreSuggested.UserInfo userInfo, Map<String, Object> map) {
        if (!NullChecker.m81303a(userInfo) || !NullChecker.m81303a(userInfo.controlCardInfo) || TextUtils.isEmpty(userInfo.controlCardInfo.resourceKey) || TextUtils.isEmpty(userInfo.controlCardInfo.ruleKey) || TextUtils.isEmpty(userInfo.controlCardInfo.business) || TextUtils.isEmpty(userInfo.controlCardInfo.cardType)) {
            return;
        }
        map.put("ad_card_id", userInfo.controlCardInfo.cardType);
        map.put("ad_card_type", userInfo.controlCardInfo.business);
    }

    /* JADX INFO: renamed from: k */
    public static j760<String, String> m36705k(CoreSuggested.UserInfo userInfo) {
        String strM217616a;
        String str = "none";
        if (NullChecker.m81303a(userInfo) && NullChecker.m81303a(userInfo.idealInfo)) {
            IdealInfo idealInfo = userInfo.idealInfo;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            if (!vwb.m200296J(idealInfo.fitIdeals)) {
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
            String strM217616a2 = !vwb.m200296J(arrayList) ? z8l.m217616a(Constants.SEPARATOR_COMMA, (CharSequence[]) arrayList.toArray(new String[arrayList.size()])) : "none";
            str = strM217616a2;
            strM217616a = vwb.m200296J(arrayList2) ? "none" : z8l.m217616a(Constants.SEPARATOR_COMMA, (CharSequence[]) arrayList2.toArray(new String[arrayList2.size()]));
        } else {
            strM217616a = "none";
        }
        return j760.m140076a(str, strM217616a);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m36706l() {
        return f21660d;
    }

    /* JADX INFO: renamed from: m */
    public static void m36707m(CoreSuggested.UserInfo userInfo, Map<String, Object> map, a5m a5mVar) {
        if (userInfo == null) {
            return;
        }
        map.put("card_order", Integer.valueOf(CoreModule.f17545c.f19622Y0.m119252b()));
        if (upa.m194655J3()) {
            map.put("from_top_tab", va40.m197619a(NewTanFragTag.ALREADY_AUTH) ? "verified" : "tantan");
        }
        if (upa.m194628E1()) {
            map.put("city_cover", Boolean.valueOf(NullChecker.m81303a(userInfo.cityCData)));
        }
        if (NullChecker.m81303a(userInfo) && !TextUtils.isEmpty(userInfo.f19472id) && sb90.m183207c(CoreModule.f17545c.f19639e0.m169430Pa(userInfo.f19472id))) {
            map.put("mystery_status", "mystery");
        } else {
            map.put("mystery_status", "normal");
        }
        j760<String, String> j760VarM36705k = m36705k(userInfo);
        map.put("ideal_type", j760VarM36705k.f116564a);
        map.put("ideal_type_relate_profile", j760VarM36705k.f116565b);
        if (!NullChecker.m81303a(userInfo) || !CoreSuggested.UserInfo.VIRTUAL_CARD.equals(userInfo.f19472id)) {
            boolean z = userInfo.coreMomentInfo != null;
            User userM169524oa = CoreModule.f17545c.f19639e0.m169524oa(userInfo.f19472id);
            boolean zM208513i = xe40.m208509f().m208513i(userInfo);
            String str = MessageType.normal_card;
            if (zM208513i) {
                map.put("card_name", "greeting_new");
            } else if (z) {
                map.put("card_name", "moment_card");
            } else if (!TextUtils.isEmpty(CoreModule.f17545c.f19663m0.f19438o2) && TextUtils.equals(CoreModule.f17545c.f19663m0.f19438o2, userInfo.f19472id)) {
                map.put("card_name", "anchor");
            } else if (NullChecker.m81303a(userInfo) && NullChecker.m81303a(userInfo.cardInfos) && userInfo.cardInfos.onlineHighReplyRate && NullChecker.m81303a(userM169524oa) && NullChecker.m81303a(userM169524oa.location) && !userM169524oa.location.isHideUpdateTime() && !CoreModule.f17545c.f19561E0.m203800w3(userM169524oa)) {
                map.put("card_name", "online_like");
            } else {
                map.put("card_name", MessageType.normal_card);
            }
            if (NullChecker.m81303a(userInfo) && NullChecker.m81303a(userInfo.cardInfos) && !TextUtils.isEmpty(userInfo.cardInfos.userId)) {
                if (!TextUtils.isEmpty(userInfo.cardInfos.cardName)) {
                    str = userInfo.cardInfos.cardName;
                }
                if (map.containsKey("card_name")) {
                    map.put("card_name", map.get("card_name") + Constants.SEPARATOR_COMMA + str);
                } else {
                    map.put("card_name", str);
                }
                if (vwb.m200296J(userInfo.cardInfos.cardTypes)) {
                    map.put("recommend_tag", "");
                    return;
                } else {
                    map.put("recommend_tag", vwb.m200307U(userInfo.cardInfos.cardTypes, Constants.SEPARATOR_COMMA));
                    return;
                }
            }
            return;
        }
        switch (C7859a.f21670b[userInfo.virtualCardType.ordinal()]) {
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
                if (NullChecker.m81303a(userInfo.impressSignalCardWrapper) && NullChecker.m81303a(userInfo.impressSignalCardWrapper.getPushCustom()) && !TextUtils.isEmpty(userInfo.impressSignalCardWrapper.getPushCustom().userId)) {
                    User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(userInfo.impressSignalCardWrapper.getPushCustom().userId);
                    if (NullChecker.m81303a(userM169430Pa)) {
                        map.put("moments_user_id", userM169430Pa.f56011id);
                    }
                    break;
                }
                break;
            case 6:
                if (jb0.m140729g(userInfo)) {
                    map.put("card_name", "add_tag");
                } else if (jb0.m140728f(userInfo)) {
                    map.put("card_name", "add_operation_tag");
                } else if (jb0.m140725c(userInfo)) {
                    map.put("card_name", "artwork");
                } else if (!jb0.m140726d(userInfo)) {
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
                if (NullChecker.m81303a(userInfo.cardInfos) && !TextUtils.isEmpty(userInfo.cardInfos.userId)) {
                    map.put("moments_user_id", userInfo.cardInfos.userId);
                    if (TextUtils.isEmpty(userInfo.cardInfos.cardName)) {
                        map.put("card_name", "");
                    } else {
                        map.put("card_name", userInfo.cardInfos.cardName);
                    }
                    if (!vwb.m200296J(userInfo.cardInfos.cardTypes)) {
                        map.put("recommend_tag", vwb.m200307U(userInfo.cardInfos.cardTypes, Constants.SEPARATOR_COMMA));
                    } else {
                        map.put("recommend_tag", "");
                    }
                    break;
                }
                break;
            case 9:
                map.put("card_name", "live_room_multiple");
                break;
            case 10:
            case 11:
                map.put("card_name", "live_audio_room");
                break;
            case 12:
                map.put("card_name", "male_love_sayhi");
                break;
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m36708n() {
        return PermissionHelper.m79881b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
    }

    /* JADX INFO: renamed from: o */
    public static void m36709o() {
        f21661e = true;
        f21664h = true;
    }

    /* JADX INFO: renamed from: p */
    public static void m36710p() {
        m36718x();
        m36716v();
        m36714t();
    }

    /* JADX INFO: renamed from: q */
    public static void m36711q() {
        if (f21667k.equals("no_lo")) {
            m36719y();
        } else if (f21667k.equals("loading")) {
            m36717w();
        } else {
            m36715u();
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m36712r(jj4 jj4Var, String str, String str2, boolean z) {
        m36713s(jj4Var, str, str2, z, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static void m36713s(jj4 jj4Var, String str, String str2, boolean z, @Nullable lol lolVar) {
        CoreMomentInfo momentInfoThemeSlide;
        boolean zMo36869a0;
        int i = (NullChecker.m81303a(jj4Var) && NullChecker.m81303a(jj4Var.m141743b()) && NullChecker.m81303a(jj4Var.m141743b().f118233a)) ? !jj4Var.m141743b().f118233a.m221515e().booleanValue() ? 1 : 0 : 1;
        boolean zMo36809D = jj4Var.m141744c() instanceof a5m ? ((a5m) jj4Var.m141744c()).mo36809D("female_like_flag") : false;
        String str3 = zMo36809D ? "upper_right" : "null";
        if ((jj4Var.m141744c() instanceof a5m) && ((a5m) jj4Var.m141744c()).mo36809D("female_like_flag_lower_left")) {
            str3 = "lower_left";
            zMo36809D = true;
        }
        if (NullChecker.m81303a(jj4Var) && NullChecker.m81303a(jj4Var.m141746e()) && jj4Var.m141746e().isUserLikeMe()) {
            zMo36809D = true;
        }
        boolean z2 = (jj4Var.m141744c() instanceof a5m) && ((a5m) jj4Var.m141744c()).mo36809D("common_points_label_flag");
        CoreSuggested.UserInfo userInfoM141746e = NullChecker.m81303a(jj4Var) ? jj4Var.m141746e() : null;
        HashMap map = new HashMap();
        int i2 = i;
        boolean z3 = zMo36809D;
        boolean z4 = z2;
        if (!(jj4Var.m141744c() instanceof a5m) || !TextUtils.equals(str, "p_activity_momentcard_view")) {
            map.put("IsWhiteBlock", Integer.valueOf(i2));
            map.put("moments_user_id", str2);
            if (jj4Var.m141744c() instanceof d5m) {
                map.put("is_moment_card", ((d5m) jj4Var.m141744c()).mo36882e() ? "1" : "0");
            }
            map.put("is_first_picture", Boolean.valueOf(z && jj4Var.m141743b().m141752a() == 0));
            map.put("show_he_liked", Boolean.valueOf(z3));
            map.put("receiver_user_id", "");
            map.put("swipe_scene", "default");
            map.put("show_he_liked_position", str3);
            map.put("theme_card_ornot", Boolean.valueOf(NullChecker.m81303a(userInfoM141746e) && userInfoM141746e.isThemeCard));
            map.put("is_show_common_tag", Boolean.valueOf(z4));
            map.put("is_show_longtimenosee_tag", (upa.m194809r1() && NullChecker.m81303a(userInfoM141746e) && userInfoM141746e.meetAgain) ? "1" : "0");
            map.put("is_activity", Integer.valueOf((!NullChecker.m81303a(userInfoM141746e) || TextUtils.isEmpty(userInfoM141746e.operationUrl)) ? 0 : 1));
            m36704j(userInfoM141746e, map);
            m36707m(userInfoM141746e, map, null);
            zvf0.m220403y(MatchScData.ModuleId.mid_e_card, str, map);
            return;
        }
        a5m a5mVar = (a5m) jj4Var.m141744c();
        if (a5mVar instanceof d5m) {
            d5m d5mVar = (d5m) a5mVar;
            momentInfoThemeSlide = d5mVar.getMomentInfoThemeSlide();
            zMo36869a0 = d5mVar.mo36869a0();
        } else {
            momentInfoThemeSlide = userInfoM141746e == null ? null : userInfoM141746e.coreMomentInfo;
            zMo36869a0 = (userInfoM141746e == null || userInfoM141746e.coreMomentInfo == null) ? false : true;
        }
        CoreMomentInfo coreMomentInfo = momentInfoThemeSlide;
        boolean z5 = zMo36869a0;
        map.put("IsWhiteBlock", Integer.valueOf(i2));
        map.put("moments_user_id", str2);
        map.put("is_first_picture", Boolean.valueOf(z && jj4Var.m141743b().m141752a() == 0));
        map.put("show_he_liked", Boolean.valueOf(z3));
        map.put("swipe_scene", "default");
        map.put("show_he_liked_position", str3);
        map.put("theme_card_ornot", Boolean.valueOf(NullChecker.m81303a(userInfoM141746e) && userInfoM141746e.isThemeCard));
        map.put("is_moment_card", z5 ? "1" : "0");
        map.put("moment_id", coreMomentInfo != null ? coreMomentInfo.f56008id : "0");
        map.put("topic_key", eli0.m117121a());
        m36707m(userInfoM141746e, map, a5mVar);
        m36704j(userInfoM141746e, map);
        zvf0.m220403y(MatchScData.ModuleId.mid_e_card, str, map);
        if (userInfoM141746e.isCoreMomentThemeCard || userInfoM141746e.isCoreMomentCard) {
            o6j0.m162864h("e_moment", str, o6j0.C18854a.m162878h("moment_id", coreMomentInfo != null ? coreMomentInfo.f56008id : "0"), o6j0.C18854a.m162878h("owner_id", coreMomentInfo != null ? coreMomentInfo.owner : "0"), o6j0.C18854a.m162878h("recommend_reason", "more history like"));
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m36714t() {
        if (f21663g) {
            f21663g = false;
            l3f l3fVar = new l3f();
            l3fVar.f125900s = "e_suggest_users_home_status_end";
            l3fVar.f125885d = EventNameEnum.SYS_CHECK;
            l3fVar.f125895n = "p_suggest_users_home_view";
            zvf0.m220393o(l3fVar, new j760(NotificationCompat.CATEGORY_STATUS, "card"), new j760("view_appear", 1), new j760(BLiveOperationTitleShowType.duration, Long.valueOf(SystemClock.uptimeMillis() - f21662f)), new j760("loadingsource", ""));
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m36715u() {
        if (f21663g) {
            return;
        }
        f21662f = SystemClock.uptimeMillis();
        f21667k = "card";
        if (f21661e && f21664h) {
            f21663g = true;
            l3f l3fVar = new l3f();
            l3fVar.f125900s = "e_suggest_users_home_status_start";
            l3fVar.f125885d = EventNameEnum.SYS_CHECK;
            l3fVar.f125895n = "p_suggest_users_home_view";
            zvf0.m220393o(l3fVar, new j760(NotificationCompat.CATEGORY_STATUS, "card"), new j760("view_appear", 1));
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m36716v() {
        if (f21660d) {
            f21660d = false;
            if (f21661e) {
                l3f l3fVar = new l3f();
                l3fVar.f125900s = "e_suggest_users_home_status_end";
                l3fVar.f125885d = EventNameEnum.SYS_CHECK;
                l3fVar.f125895n = "p_suggest_users_home_view";
                zvf0.m220393o(l3fVar, new j760(NotificationCompat.CATEGORY_STATUS, "loading"), new j760("view_appear", Integer.valueOf(f21665i ? 1 : 0)), new j760(BLiveOperationTitleShowType.duration, Long.valueOf(SystemClock.uptimeMillis() - f21659c)), new j760("loadingsource", f21666j));
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m36717w() {
        if (f21660d) {
            return;
        }
        f21660d = true;
        f21667k = "loading";
        if (f21661e) {
            f21665i = f21664h;
            f21659c = SystemClock.uptimeMillis();
            l3f l3fVar = new l3f();
            l3fVar.f125900s = "e_suggest_users_home_status_start";
            l3fVar.f125885d = EventNameEnum.SYS_CHECK;
            l3fVar.f125895n = "p_suggest_users_home_view";
            zvf0.m220393o(l3fVar, new j760(NotificationCompat.CATEGORY_STATUS, "loading"), new j760("view_appear", Integer.valueOf(f21664h ? 1 : 0)));
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m36718x() {
        if (f21658b) {
            f21658b = false;
            if (m36708n()) {
                f21667k = "card";
            }
            l3f l3fVar = new l3f();
            l3fVar.f125900s = "e_suggest_users_home_status_end";
            l3fVar.f125885d = EventNameEnum.SYS_CHECK;
            l3fVar.f125895n = "p_suggest_users_home_view";
            zvf0.m220393o(l3fVar, new j760(NotificationCompat.CATEGORY_STATUS, "no_lo"), new j760("view_appear", 1), new j760(BLiveOperationTitleShowType.duration, Long.valueOf(SystemClock.uptimeMillis() - f21657a)), new j760("loadingsource", ""));
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m36719y() {
        if (f21658b) {
            return;
        }
        m36709o();
        f21657a = SystemClock.uptimeMillis();
        f21658b = true;
        f21667k = "no_lo";
        l3f l3fVar = new l3f();
        l3fVar.f125900s = "e_suggest_users_home_status_start";
        l3fVar.f125885d = EventNameEnum.SYS_CHECK;
        l3fVar.f125895n = "p_suggest_users_home_view";
        zvf0.m220393o(l3fVar, new j760(NotificationCompat.CATEGORY_STATUS, "no_lo"), new j760("view_appear", 1));
    }

    /* JADX INFO: renamed from: z */
    public static void m36720z() {
        f21661e = false;
        f21664h = false;
        f21666j = LiveRegionTag.others;
        f21667k = "loading";
        f21668l.onNext(Boolean.FALSE);
    }
}
