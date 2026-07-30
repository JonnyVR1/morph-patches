package com.p051p1.mobile.putong.core.newui.home;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.IdealInfo;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.ODiamondStatisticsType;
import com.p051p1.mobile.putong.core.data.SeeSwitchName;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p051p1.mobile.putong.core.p058ui.home.VirtualCard;
import com.p051p1.mobile.putong.data.IdealTag;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSAdCardInfo;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.SwipeExtraScData;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UssTags;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p137rx.subjects.C22507a;
import p153l.eui0;
import p153l.f1g0;
import p153l.fb0;
import p153l.gra;
import p153l.i4g0;
import p153l.ik4;
import p153l.jj40;
import p153l.jyb;
import p153l.ln40;
import p153l.pbl;
import p153l.pf60;
import p153l.psd0;
import p153l.q4f;
import p153l.q7m;
import p153l.sfj0;
import p153l.t7m;
import p153l.wj90;
import p153l.wql;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class HomeStatisticsHelper {

    /* JADX INFO: renamed from: a */
    public static long f22399a = 0;

    /* JADX INFO: renamed from: b */
    public static boolean f22400b = false;

    /* JADX INFO: renamed from: c */
    public static long f22401c = 0;

    /* JADX INFO: renamed from: d */
    public static boolean f22402d = false;

    /* JADX INFO: renamed from: e */
    public static boolean f22403e = false;

    /* JADX INFO: renamed from: f */
    public static long f22404f = 0;

    /* JADX INFO: renamed from: g */
    public static boolean f22405g = false;

    /* JADX INFO: renamed from: h */
    public static boolean f22406h = false;

    /* JADX INFO: renamed from: i */
    public static boolean f22407i = false;

    /* JADX INFO: renamed from: j */
    public static String f22408j = "launch";

    /* JADX INFO: renamed from: k */
    public static String f22409k = "loading";

    /* JADX INFO: renamed from: l */
    public static C22507a<Boolean> f22410l;

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
    public static /* synthetic */ class C8010a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22411a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f22412b;

        static {
            int[] iArr = new int[VirtualCardType.values().length];
            f22412b = iArr;
            try {
                iArr[VirtualCardType.OnlineMatchBroadcastCard.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22412b[VirtualCardType.FourSelectOneAdCard.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22412b[VirtualCardType.SuperlikeGuideCard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22412b[VirtualCardType.UndoGuideCard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22412b[VirtualCardType.ImpressSignalCard.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22412b[VirtualCardType.AdCard.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22412b[VirtualCardType.LiveLivingCard.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22412b[VirtualCardType.LiveVoiceCard.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22412b[VirtualCardType.LiveMultipleCard.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22412b[VirtualCardType.LiveVoiceNewCard.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22412b[VirtualCardType.LiveVoiceRoomCard.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22412b[VirtualCardType.IceBreakQuestionOfflineCard.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr2 = new int[SwipeDirection.values().length];
            f22411a = iArr2;
            try {
                iArr2[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22411a[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22411a[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    static {
        C22507a<Boolean> c22507aM222759c = C22507a.m222759c(Boolean.FALSE);
        f22410l = c22507aM222759c;
        c22507aM222759c.subscribe(psd0.m173596G(new y20() { // from class: l.qbl
            @Override // p153l.y20
            public final void call(Object obj) {
                HomeStatisticsHelper.m37698a((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A */
    public static void m37690A(C8145d c8145d, Throwable th) {
        if (th == null) {
            return;
        }
        if (th instanceof TantanException.Client.CoreService) {
            m37691B(c8145d, String.valueOf(((TantanException.Client.CoreService) th).code));
        } else {
            m37691B(c8145d, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m37691B(C8145d c8145d, String str) {
        if (c8145d == null) {
            return;
        }
        c8145d.m39469a(str);
        q4f q4fVar = new q4f();
        q4fVar.f155581s = "e_swipeaction";
        q4fVar.f155566d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
        q4fVar.f155576n = c8145d.m39476h();
        i4g0.m138517o(q4fVar, c8145d.m39480l());
    }

    /* JADX INFO: renamed from: C */
    public static void m37692C(boolean z) {
        f22406h = z;
    }

    /* JADX INFO: renamed from: D */
    public static void m37693D(boolean z) {
        f22410l.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: E */
    public static void m37694E(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f22409k = str;
    }

    /* JADX INFO: renamed from: F */
    public static void m37695F(String str) {
        if (f22403e) {
            f22408j = str;
        }
    }

    /* JADX INFO: renamed from: G */
    public static ScActionName m37696G(SwipeDirection swipeDirection) {
        int i = C8010a.f22411a[swipeDirection.ordinal()];
        if (i == 1) {
            return ScActionName.SUPER_LIKE;
        }
        if (i != 2) {
            return i != 3 ? ScActionName.UNKNOWN : ScActionName.DISLIKE;
        }
        return ScActionName.LIKE;
    }

    /* JADX INFO: renamed from: H */
    public static void m37697H(SwipeDirection swipeDirection, VirtualCard virtualCard) {
        String str;
        if (swipeDirection == null || virtualCard == null) {
            return;
        }
        CoreSuggested.UserInfo userInfoProxy = virtualCard.getUserInfoProxy();
        HashMap map = new HashMap();
        m37710m(userInfoProxy, map, null);
        int i = C8010a.f22411a[swipeDirection.ordinal()];
        if (i == 1) {
            str = "up";
        } else if (i != 2) {
            str = i != 3 ? "" : BLiveGiftBubblePopupTitlePosition.left;
        } else {
            str = "right";
        }
        boolean zIsEmpty = CoreModule.f18264c.f20405m0.f20144c2.isEmpty();
        map.put("swipe_directions", str);
        map.put("is_guided_action", !zIsEmpty ? "1" : "0");
        sfj0.m185599f(MatchScData.ModuleId.mid_e_card, "p_suggest_users_home_view", map);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m37698a(Boolean bool) {
        if (f22403e) {
            if (bool.booleanValue()) {
                f22406h = true;
                m37714q();
            } else {
                f22406h = false;
                m37713p();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C8145d m37699b(String str, User user, boolean z, boolean z2, LikeExtraData likeExtraData) {
        C8145d c8145dM39467E = new C8145d(str).m39467E(user == null ? "" : user.f56859id);
        c8145dM39467E.m39486r(ScActionFrom.FOLLOW).m39487s("click");
        if (z2) {
            c8145dM39467E.m39485q(ScActionName.SUPER_LIKE);
            c8145dM39467E.m39491w(MatchScData.ModuleId.mid_e_superlikeButton);
        } else if (z) {
            c8145dM39467E.m39485q(ScActionName.LIKE);
            c8145dM39467E.m39491w(MatchScData.ModuleId.mid_e_likeButton);
        } else {
            c8145dM39467E.m39485q(ScActionName.DISLIKE);
            c8145dM39467E.m39491w("e_dislikeButton");
        }
        if (NullChecker.m82486a(likeExtraData)) {
            SwipeExtraScData swipeExtraScData = likeExtraData.swipeExtraScData;
            c8145dM39467E.m39464B(swipeExtraScData.picUrl);
            c8145dM39467E.m39494z(swipeExtraScData.picNum);
            c8145dM39467E.m39463A(swipeExtraScData.picUploads);
        }
        return c8145dM39467E;
    }

    /* JADX INFO: renamed from: c */
    public static C8145d m37700c(User user, boolean z, boolean z2, SwipeDirection swipeDirection) {
        UssTags ussTags;
        String str = "";
        C8145d c8145d = new C8145d(z2 ? OMSDialogPositon.p_suggest_user_profile_info_view : "p_suggest_users_home_view", z2 ? ScActionFrom.PROFILE : ScActionFrom.SUGGEST, user == null ? "" : user.f56859id);
        if (user != null && (ussTags = user.ussTags) != null) {
            str = ussTags.eventInfo;
        }
        c8145d.m39490v(str);
        c8145d.m39485q(m37696G(swipeDirection));
        c8145d.m39487s(z ? "click" : "swipe");
        if (z2) {
            if (swipeDirection == SwipeDirection.RIGHT) {
                c8145d.m39491w(MatchScData.ModuleId.mid_e_likeButton);
                return c8145d;
            }
            if (swipeDirection == SwipeDirection.LEFT) {
                c8145d.m39491w("e_dislikeButton");
                return c8145d;
            }
            if (swipeDirection == SwipeDirection.UP) {
                c8145d.m39491w(MatchScData.ModuleId.mid_e_superlikeButton);
                return c8145d;
            }
        } else {
            if (!z) {
                c8145d.m39491w(MatchScData.ModuleId.mid_e_card);
                return c8145d;
            }
            if (swipeDirection == SwipeDirection.RIGHT) {
                c8145d.m39491w(MatchScData.ModuleId.mid_e_likeButton);
                return c8145d;
            }
            if (swipeDirection == SwipeDirection.LEFT) {
                c8145d.m39491w("e_dislikeButton");
                return c8145d;
            }
            if (swipeDirection == SwipeDirection.UP) {
                c8145d.m39491w(MatchScData.ModuleId.mid_e_superlikeButton);
            }
        }
        return c8145d;
    }

    /* JADX INFO: renamed from: d */
    public static C8145d m37701d(ik4 ik4Var, boolean z, boolean z2, SwipeDirection swipeDirection, f1g0 f1g0Var) {
        C8145d c8145dM37700c = m37700c(ik4Var == null ? null : ik4Var.m140259d(), z, z2, swipeDirection);
        c8145dM37700c.m39471c(f1g0Var, ik4Var);
        if (NullChecker.m82486a(ik4Var) && NullChecker.m82486a(ik4Var.m140257b()) && NullChecker.m82486a(ik4Var.m140257b().f115332d) && NullChecker.m82486a(ik4Var.m140259d())) {
            Media media = ik4Var.m140257b().f115332d;
            c8145dM37700c.m39463A(ik4Var.m140259d().pictures.size());
            c8145dM37700c.m39464B(media.url);
            c8145dM37700c.m39494z(ik4Var.m140259d().pictures.indexOf(media));
        }
        if (NullChecker.m82486a(ik4Var) && NullChecker.m82486a(ik4Var.m140260e())) {
            if (NullChecker.m82486a(ik4Var.m140260e().cityCData)) {
                c8145dM37700c.m39489u(true);
            }
            if (NullChecker.m82486a(ik4Var.m140260e().cardInfos) && !TextUtils.isEmpty(ik4Var.m140260e().cardInfos.cardName)) {
                c8145dM37700c.m39488t(ik4Var.m140260e().cardInfos.cardName);
            }
            if (NullChecker.m82486a(ik4Var.m140260e().cardInfos)) {
                CoreSuggested.UserInfo userInfoM140260e = ik4Var.m140260e();
                User userM140259d = ik4Var.m140259d();
                if (userM140259d == null) {
                    userM140259d = CoreModule.f18264c.f20381e0.m116597oa(userInfoM140260e.f20214id);
                }
                c8145dM37700c.m39492x(userInfoM140260e.cardInfos.onlineHighReplyRate && NullChecker.m82486a(userM140259d) && !userM140259d.location.isHideUpdateTime() && !CoreModule.f18264c.f20303E0.m141088w3(userM140259d));
            }
        }
        if (wj90.m206620c(ik4Var.m140259d())) {
            c8145dM37700c.m39493y(true);
        }
        if (ik4Var.m140257b() != null) {
            c8145dM37700c.m39465C(ik4Var.m140257b().f115334f);
        }
        pf60<String, String> pf60VarM37708k = m37708k(ik4Var.m140260e());
        c8145dM37700c.m39470b(pf60.m172085a("ideal_type", pf60VarM37708k.f152156a));
        c8145dM37700c.m39470b(pf60.m172085a("ideal_type_relate_profile", pf60VarM37708k.f152157b));
        return c8145dM37700c;
    }

    /* JADX INFO: renamed from: e */
    public static C8145d m37702e(String str, boolean z, boolean z2, boolean z3, User user) {
        String str2;
        ScActionName scActionName;
        C8145d c8145d = new C8145d(str);
        C8145d c8145dM39467E = c8145d.m39487s(z ? "click" : "swipe").m39467E(user == null ? "" : user.f56859id);
        if (!z) {
            str2 = MatchScData.ModuleId.mid_e_card;
        } else if (z3) {
            str2 = MatchScData.ModuleId.mid_e_superlikeButton;
        } else {
            str2 = z2 ? MatchScData.ModuleId.mid_e_likeButton : "e_dislikeButton";
        }
        C8145d c8145dM39486r = c8145dM39467E.m39491w(str2).m39486r(ScActionFrom.PICKS);
        if (z3) {
            scActionName = ScActionName.SUPER_LIKE;
        } else {
            scActionName = z2 ? ScActionName.LIKE : ScActionName.DISLIKE;
        }
        c8145dM39486r.m39485q(scActionName);
        if (NullChecker.m82487b(user)) {
            c8145d.m39464B(user.pictures.get(0).url);
            c8145d.m39463A(user.pictures.size());
            c8145d.m39494z(0);
        }
        return c8145d;
    }

    /* JADX INFO: renamed from: f */
    public static C8145d m37703f(String str, boolean z, boolean z2, boolean z3, User user) {
        String str2;
        ScActionName scActionName;
        C8145d c8145d = new C8145d(str);
        C8145d c8145dM39467E = c8145d.m39487s(z ? "click" : "swipe").m39467E(user == null ? "" : user.f56859id);
        if (!z) {
            str2 = MatchScData.ModuleId.mid_e_card;
        } else if (z3) {
            str2 = MatchScData.ModuleId.mid_e_superlikeButton;
        } else {
            str2 = z2 ? MatchScData.ModuleId.mid_e_likeButton : "e_dislikeButton";
        }
        C8145d c8145dM39486r = c8145dM39467E.m39491w(str2).m39486r(ScActionFrom.SEE);
        if (z3) {
            scActionName = ScActionName.SUPER_LIKE;
        } else {
            scActionName = z2 ? ScActionName.LIKE : ScActionName.DISLIKE;
        }
        c8145dM39486r.m39485q(scActionName);
        if (NullChecker.m82487b(user)) {
            c8145d.m39464B(user.pictures.get(0).url);
            c8145d.m39463A(user.pictures.size());
            c8145d.m39494z(0);
        }
        return c8145d;
    }

    /* JADX INFO: renamed from: g */
    public static C8145d m37704g(String str, String str2) {
        C8145d c8145d = new C8145d(str);
        c8145d.m39485q(ScActionName.UNDO).m39487s("click").m39486r(ScActionFrom.SUGGEST).m39467E(str2);
        c8145d.m39491w("e_undo_button");
        return c8145d;
    }

    /* JADX INFO: renamed from: h */
    public static C8145d m37705h(String str, String str2, f1g0 f1g0Var) {
        C8145d c8145dM37704g = m37704g(str, str2);
        c8145dM37704g.m39472d(f1g0Var);
        return c8145dM37704g;
    }

    /* JADX INFO: renamed from: i */
    public static void m37706i(CoreSuggested.UserInfo userInfo, String str) {
        if (NullChecker.m82486a(userInfo) && !TextUtils.isEmpty(userInfo.descriptionId) && userInfo.hasDescTagShow) {
            sfj0.m185601h("e_home_card_info_tag", str, sfj0.C20032a.m185615h("other_user_id", userInfo.f20214id), sfj0.C20032a.m185615h("tag_type", userInfo.descriptionId));
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m37707j(CoreSuggested.UserInfo userInfo, Map<String, Object> map) {
        if (!NullChecker.m82486a(userInfo) || !NullChecker.m82486a(userInfo.controlCardInfo) || TextUtils.isEmpty(userInfo.controlCardInfo.resourceKey) || TextUtils.isEmpty(userInfo.controlCardInfo.ruleKey) || TextUtils.isEmpty(userInfo.controlCardInfo.business) || TextUtils.isEmpty(userInfo.controlCardInfo.cardType)) {
            return;
        }
        map.put("ad_card_id", userInfo.controlCardInfo.cardType);
        map.put("ad_card_type", userInfo.controlCardInfo.business);
    }

    /* JADX INFO: renamed from: k */
    public static pf60<String, String> m37708k(CoreSuggested.UserInfo userInfo) {
        String strM171511a;
        String str = "none";
        if (NullChecker.m82486a(userInfo) && NullChecker.m82486a(userInfo.idealInfo)) {
            IdealInfo idealInfo = userInfo.idealInfo;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            if (!jyb.m147479J(idealInfo.fitIdeals)) {
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
            String strM171511a2 = !jyb.m147479J(arrayList) ? pbl.m171511a(Constants.SEPARATOR_COMMA, (CharSequence[]) arrayList.toArray(new String[arrayList.size()])) : "none";
            str = strM171511a2;
            strM171511a = jyb.m147479J(arrayList2) ? "none" : pbl.m171511a(Constants.SEPARATOR_COMMA, (CharSequence[]) arrayList2.toArray(new String[arrayList2.size()]));
        } else {
            strM171511a = "none";
        }
        return pf60.m172085a(str, strM171511a);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m37709l() {
        return f22402d;
    }

    /* JADX INFO: renamed from: m */
    public static void m37710m(CoreSuggested.UserInfo userInfo, Map<String, Object> map, q7m q7mVar) {
        if (userInfo == null) {
            return;
        }
        map.put("card_order", Integer.valueOf(CoreModule.f18264c.f20364Y0.m179743b()));
        if (gra.m131586J3()) {
            map.put("from_top_tab", jj40.m144998a(NewTanFragTag.ALREADY_AUTH) ? "verified" : "tantan");
        }
        if (gra.m131559E1()) {
            map.put("city_cover", Boolean.valueOf(NullChecker.m82486a(userInfo.cityCData)));
        }
        if (NullChecker.m82486a(userInfo) && !TextUtils.isEmpty(userInfo.f20214id) && wj90.m206620c(CoreModule.f18264c.f20381e0.m116503Pa(userInfo.f20214id))) {
            map.put("mystery_status", "mystery");
        } else {
            map.put("mystery_status", "normal");
        }
        pf60<String, String> pf60VarM37708k = m37708k(userInfo);
        map.put("ideal_type", pf60VarM37708k.f152156a);
        map.put("ideal_type_relate_profile", pf60VarM37708k.f152157b);
        if (!NullChecker.m82486a(userInfo) || !CoreSuggested.UserInfo.VIRTUAL_CARD.equals(userInfo.f20214id)) {
            boolean z = userInfo.coreMomentInfo != null;
            User userM116597oa = CoreModule.f18264c.f20381e0.m116597oa(userInfo.f20214id);
            boolean zM154960i = ln40.m154956f().m154960i(userInfo);
            String str = MessageType.normal_card;
            if (zM154960i) {
                map.put("card_name", "greeting_new");
            } else if (z) {
                map.put("card_name", "moment_card");
            } else if (!TextUtils.isEmpty(CoreModule.f18264c.f20405m0.f20180o2) && TextUtils.equals(CoreModule.f18264c.f20405m0.f20180o2, userInfo.f20214id)) {
                map.put("card_name", "anchor");
            } else if (NullChecker.m82486a(userInfo) && NullChecker.m82486a(userInfo.cardInfos) && userInfo.cardInfos.onlineHighReplyRate && NullChecker.m82486a(userM116597oa) && NullChecker.m82486a(userM116597oa.location) && !userM116597oa.location.isHideUpdateTime() && !CoreModule.f18264c.f20303E0.m141088w3(userM116597oa)) {
                map.put("card_name", "online_like");
            } else {
                map.put("card_name", MessageType.normal_card);
            }
            if (NullChecker.m82486a(userInfo) && NullChecker.m82486a(userInfo.cardInfos) && !TextUtils.isEmpty(userInfo.cardInfos.userId)) {
                if (!TextUtils.isEmpty(userInfo.cardInfos.cardName)) {
                    str = userInfo.cardInfos.cardName;
                }
                if (map.containsKey("card_name")) {
                    map.put("card_name", map.get("card_name") + Constants.SEPARATOR_COMMA + str);
                } else {
                    map.put("card_name", str);
                }
                if (jyb.m147479J(userInfo.cardInfos.cardTypes)) {
                    map.put("recommend_tag", "");
                    return;
                } else {
                    map.put("recommend_tag", jyb.m147490U(userInfo.cardInfos.cardTypes, Constants.SEPARATOR_COMMA));
                    return;
                }
            }
            return;
        }
        switch (C8010a.f22412b[userInfo.virtualCardType.ordinal()]) {
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
                if (NullChecker.m82486a(userInfo.impressSignalCardWrapper) && NullChecker.m82486a(userInfo.impressSignalCardWrapper.getPushCustom()) && !TextUtils.isEmpty(userInfo.impressSignalCardWrapper.getPushCustom().userId)) {
                    User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(userInfo.impressSignalCardWrapper.getPushCustom().userId);
                    if (NullChecker.m82486a(userM116503Pa)) {
                        map.put("moments_user_id", userM116503Pa.f56859id);
                    }
                    break;
                }
                break;
            case 6:
                if (fb0.m124808g(userInfo)) {
                    map.put("card_name", "add_tag");
                } else if (fb0.m124807f(userInfo)) {
                    map.put("card_name", "add_operation_tag");
                } else if (fb0.m124804c(userInfo)) {
                    map.put("card_name", "artwork");
                } else if (!fb0.m124805d(userInfo)) {
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
                if (NullChecker.m82486a(userInfo.cardInfos) && !TextUtils.isEmpty(userInfo.cardInfos.userId)) {
                    map.put("moments_user_id", userInfo.cardInfos.userId);
                    if (TextUtils.isEmpty(userInfo.cardInfos.cardName)) {
                        map.put("card_name", "");
                    } else {
                        map.put("card_name", userInfo.cardInfos.cardName);
                    }
                    if (!jyb.m147479J(userInfo.cardInfos.cardTypes)) {
                        map.put("recommend_tag", jyb.m147490U(userInfo.cardInfos.cardTypes, Constants.SEPARATOR_COMMA));
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
    public static boolean m37711n() {
        return PermissionHelper.m81064b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
    }

    /* JADX INFO: renamed from: o */
    public static void m37712o() {
        f22403e = true;
        f22406h = true;
    }

    /* JADX INFO: renamed from: p */
    public static void m37713p() {
        m37721x();
        m37719v();
        m37717t();
    }

    /* JADX INFO: renamed from: q */
    public static void m37714q() {
        if (f22409k.equals("no_lo")) {
            m37722y();
        } else if (f22409k.equals("loading")) {
            m37720w();
        } else {
            m37718u();
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m37715r(ik4 ik4Var, String str, String str2, boolean z) {
        m37716s(ik4Var, str, str2, z, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static void m37716s(ik4 ik4Var, String str, String str2, boolean z, @Nullable wql wqlVar) {
        CoreMomentInfo momentInfoThemeSlide;
        boolean zMo37872a0;
        int i = (NullChecker.m82486a(ik4Var) && NullChecker.m82486a(ik4Var.m140257b()) && NullChecker.m82486a(ik4Var.m140257b().f115329a)) ? !ik4Var.m140257b().f115329a.m222761e().booleanValue() ? 1 : 0 : 1;
        boolean zMo37812D = ik4Var.m140258c() instanceof q7m ? ((q7m) ik4Var.m140258c()).mo37812D("female_like_flag") : false;
        String str3 = zMo37812D ? "upper_right" : "null";
        if ((ik4Var.m140258c() instanceof q7m) && ((q7m) ik4Var.m140258c()).mo37812D("female_like_flag_lower_left")) {
            str3 = "lower_left";
            zMo37812D = true;
        }
        if (NullChecker.m82486a(ik4Var) && NullChecker.m82486a(ik4Var.m140260e()) && ik4Var.m140260e().isUserLikeMe()) {
            zMo37812D = true;
        }
        boolean z2 = (ik4Var.m140258c() instanceof q7m) && ((q7m) ik4Var.m140258c()).mo37812D("common_points_label_flag");
        CoreSuggested.UserInfo userInfoM140260e = NullChecker.m82486a(ik4Var) ? ik4Var.m140260e() : null;
        HashMap map = new HashMap();
        int i2 = i;
        boolean z3 = zMo37812D;
        boolean z4 = z2;
        if (!(ik4Var.m140258c() instanceof q7m) || !TextUtils.equals(str, "p_activity_momentcard_view")) {
            map.put("IsWhiteBlock", Integer.valueOf(i2));
            map.put("moments_user_id", str2);
            if (ik4Var.m140258c() instanceof t7m) {
                map.put("is_moment_card", ((t7m) ik4Var.m140258c()).mo37885e() ? "1" : "0");
            }
            map.put("is_first_picture", Boolean.valueOf(z && ik4Var.m140257b().m140266a() == 0));
            map.put("show_he_liked", Boolean.valueOf(z3));
            map.put("receiver_user_id", "");
            map.put("swipe_scene", "default");
            map.put("show_he_liked_position", str3);
            map.put("theme_card_ornot", Boolean.valueOf(NullChecker.m82486a(userInfoM140260e) && userInfoM140260e.isThemeCard));
            map.put("is_show_common_tag", Boolean.valueOf(z4));
            map.put("is_show_longtimenosee_tag", (gra.m131740r1() && NullChecker.m82486a(userInfoM140260e) && userInfoM140260e.meetAgain) ? "1" : "0");
            map.put("is_activity", Integer.valueOf((!NullChecker.m82486a(userInfoM140260e) || TextUtils.isEmpty(userInfoM140260e.operationUrl)) ? 0 : 1));
            m37707j(userInfoM140260e, map);
            m37710m(userInfoM140260e, map, null);
            i4g0.m138527y(MatchScData.ModuleId.mid_e_card, str, map);
            return;
        }
        q7m q7mVar = (q7m) ik4Var.m140258c();
        if (q7mVar instanceof t7m) {
            t7m t7mVar = (t7m) q7mVar;
            momentInfoThemeSlide = t7mVar.getMomentInfoThemeSlide();
            zMo37872a0 = t7mVar.mo37872a0();
        } else {
            momentInfoThemeSlide = userInfoM140260e == null ? null : userInfoM140260e.coreMomentInfo;
            zMo37872a0 = (userInfoM140260e == null || userInfoM140260e.coreMomentInfo == null) ? false : true;
        }
        CoreMomentInfo coreMomentInfo = momentInfoThemeSlide;
        boolean z5 = zMo37872a0;
        map.put("IsWhiteBlock", Integer.valueOf(i2));
        map.put("moments_user_id", str2);
        map.put("is_first_picture", Boolean.valueOf(z && ik4Var.m140257b().m140266a() == 0));
        map.put("show_he_liked", Boolean.valueOf(z3));
        map.put("swipe_scene", "default");
        map.put("show_he_liked_position", str3);
        map.put("theme_card_ornot", Boolean.valueOf(NullChecker.m82486a(userInfoM140260e) && userInfoM140260e.isThemeCard));
        map.put("is_moment_card", z5 ? "1" : "0");
        map.put("moment_id", coreMomentInfo != null ? coreMomentInfo.f56856id : "0");
        map.put("topic_key", eui0.m122571a());
        m37710m(userInfoM140260e, map, q7mVar);
        m37707j(userInfoM140260e, map);
        i4g0.m138527y(MatchScData.ModuleId.mid_e_card, str, map);
        if (userInfoM140260e.isCoreMomentThemeCard || userInfoM140260e.isCoreMomentCard) {
            sfj0.m185601h("e_moment", str, sfj0.C20032a.m185615h("moment_id", coreMomentInfo != null ? coreMomentInfo.f56856id : "0"), sfj0.C20032a.m185615h("owner_id", coreMomentInfo != null ? coreMomentInfo.owner : "0"), sfj0.C20032a.m185615h("recommend_reason", "more history like"));
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m37717t() {
        if (f22405g) {
            f22405g = false;
            q4f q4fVar = new q4f();
            q4fVar.f155581s = "e_suggest_users_home_status_end";
            q4fVar.f155566d = EventNameEnum.SYS_CHECK;
            q4fVar.f155576n = "p_suggest_users_home_view";
            i4g0.m138517o(q4fVar, new pf60(NotificationCompat.CATEGORY_STATUS, "card"), new pf60("view_appear", 1), new pf60(BLiveOperationTitleShowType.duration, Long.valueOf(SystemClock.uptimeMillis() - f22404f)), new pf60("loadingsource", ""));
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m37718u() {
        if (f22405g) {
            return;
        }
        f22404f = SystemClock.uptimeMillis();
        f22409k = "card";
        if (f22403e && f22406h) {
            f22405g = true;
            q4f q4fVar = new q4f();
            q4fVar.f155581s = "e_suggest_users_home_status_start";
            q4fVar.f155566d = EventNameEnum.SYS_CHECK;
            q4fVar.f155576n = "p_suggest_users_home_view";
            i4g0.m138517o(q4fVar, new pf60(NotificationCompat.CATEGORY_STATUS, "card"), new pf60("view_appear", 1));
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m37719v() {
        if (f22402d) {
            f22402d = false;
            if (f22403e) {
                q4f q4fVar = new q4f();
                q4fVar.f155581s = "e_suggest_users_home_status_end";
                q4fVar.f155566d = EventNameEnum.SYS_CHECK;
                q4fVar.f155576n = "p_suggest_users_home_view";
                i4g0.m138517o(q4fVar, new pf60(NotificationCompat.CATEGORY_STATUS, "loading"), new pf60("view_appear", Integer.valueOf(f22407i ? 1 : 0)), new pf60(BLiveOperationTitleShowType.duration, Long.valueOf(SystemClock.uptimeMillis() - f22401c)), new pf60("loadingsource", f22408j));
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m37720w() {
        if (f22402d) {
            return;
        }
        f22402d = true;
        f22409k = "loading";
        if (f22403e) {
            f22407i = f22406h;
            f22401c = SystemClock.uptimeMillis();
            q4f q4fVar = new q4f();
            q4fVar.f155581s = "e_suggest_users_home_status_start";
            q4fVar.f155566d = EventNameEnum.SYS_CHECK;
            q4fVar.f155576n = "p_suggest_users_home_view";
            i4g0.m138517o(q4fVar, new pf60(NotificationCompat.CATEGORY_STATUS, "loading"), new pf60("view_appear", Integer.valueOf(f22406h ? 1 : 0)));
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m37721x() {
        if (f22400b) {
            f22400b = false;
            if (m37711n()) {
                f22409k = "card";
            }
            q4f q4fVar = new q4f();
            q4fVar.f155581s = "e_suggest_users_home_status_end";
            q4fVar.f155566d = EventNameEnum.SYS_CHECK;
            q4fVar.f155576n = "p_suggest_users_home_view";
            i4g0.m138517o(q4fVar, new pf60(NotificationCompat.CATEGORY_STATUS, "no_lo"), new pf60("view_appear", 1), new pf60(BLiveOperationTitleShowType.duration, Long.valueOf(SystemClock.uptimeMillis() - f22399a)), new pf60("loadingsource", ""));
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m37722y() {
        if (f22400b) {
            return;
        }
        m37712o();
        f22399a = SystemClock.uptimeMillis();
        f22400b = true;
        f22409k = "no_lo";
        q4f q4fVar = new q4f();
        q4fVar.f155581s = "e_suggest_users_home_status_start";
        q4fVar.f155566d = EventNameEnum.SYS_CHECK;
        q4fVar.f155576n = "p_suggest_users_home_view";
        i4g0.m138517o(q4fVar, new pf60(NotificationCompat.CATEGORY_STATUS, "no_lo"), new pf60("view_appear", 1));
    }

    /* JADX INFO: renamed from: z */
    public static void m37723z() {
        f22403e = false;
        f22406h = false;
        f22408j = LiveRegionTag.others;
        f22409k = "loading";
        f22410l.onNext(Boolean.FALSE);
    }
}
