package p149l;

import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ProfileLikeType;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.holder.HomeCardExpandedType;
import com.p046p1.mobile.putong.data.ConversationStatus;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class plf {

    /* JADX INFO: renamed from: l.plf$a */
    public static /* synthetic */ class C19268a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f150128a;

        static {
            int[] iArr = new int[HomeCardExpandedType.values().length];
            f150128a = iArr;
            try {
                iArr[HomeCardExpandedType.AVATAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f150128a[HomeCardExpandedType.LIVE_ROOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f150128a[HomeCardExpandedType.ABOUT_ME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f150128a[HomeCardExpandedType.VERIFY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f150128a[HomeCardExpandedType.LIFE_PIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f150128a[HomeCardExpandedType.MOMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f150128a[HomeCardExpandedType.BASE_INFO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f150128a[HomeCardExpandedType.QUESTION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f150128a[HomeCardExpandedType.REPORT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f150128a[HomeCardExpandedType.CARD_NAME.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f150128a[HomeCardExpandedType.RELATIONSHIP_GOALS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f150128a[HomeCardExpandedType.INTERESTS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f150128a[HomeCardExpandedType.HASH_TAG.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f150128a[HomeCardExpandedType.ADMOB.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f150128a[HomeCardExpandedType.MEMBER.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f150128a[HomeCardExpandedType.LIKES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f150128a[HomeCardExpandedType.COMPLIMENT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f150128a[HomeCardExpandedType.COMPLIMENT_RECEIVED.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f150128a[HomeCardExpandedType.TANTANID.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static List<String> m170171c(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("avatar");
        arrayList.add("compliment_received");
        arrayList.add(AuthenticationTokenClaims.JSON_KEY_NAME);
        arrayList.add("verification");
        arrayList.add("member");
        arrayList.add("likes");
        arrayList.add("aboutMe");
        arrayList.add("relationship_goals");
        arrayList.add(ProfileLikeType.life_pic);
        arrayList.add("my_bio");
        arrayList.add(ProfileLikeType.life_pic);
        arrayList.add("moment");
        arrayList.add("interests");
        arrayList.add(ProfileLikeType.life_pic);
        arrayList.add("hash_tag");
        arrayList.add("questionAnswer");
        arrayList.add("compliment");
        arrayList.add("tantanid");
        arrayList.add("admob");
        arrayList.add("report");
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static List<j760<HomeCardExpandedType, Integer>> m170172d(Act act, User user, CoreSuggested.UserInfo userInfo) {
        ArrayList arrayList = new ArrayList();
        Relationship relationship = user.localRelationship;
        if (relationship != null && TEnum.equals(relationship.conversationStatus, ConversationStatus.get("blocked"))) {
            arrayList.add(j760.m140076a(HomeCardExpandedType.AVATAR, 0));
            arrayList.add(j760.m140076a(HomeCardExpandedType.CARD_NAME, 0));
            arrayList.add(j760.m140076a(HomeCardExpandedType.REPORT, 0));
            return arrayList;
        }
        if (user.isBanedOrInactivated() && userInfo.renderFrom == CardInfoRenderFrom.PROFILE) {
            arrayList.add(j760.m140076a(HomeCardExpandedType.AVATAR, 0));
            return arrayList;
        }
        if (userInfo.renderFrom == CardInfoRenderFrom.PROFILE_PREVIEW) {
            arrayList.add(j760.m140076a(HomeCardExpandedType.AVATAR, 0));
            return arrayList;
        }
        List<String> listM170171c = m170171c(f4v.m119459f().m119463i(userInfo.f19472id));
        int i = 1;
        int i2 = 0;
        while (i2 < listM170171c.size()) {
            HomeCardExpandedType typeByAlias = HomeCardExpandedType.getTypeByAlias(listM170171c.get(i2));
            i2++;
            if (typeByAlias != null) {
                if (typeByAlias == HomeCardExpandedType.LIFE_PIC) {
                    if (m170173e(act, user, userInfo, typeByAlias, i)) {
                        arrayList.add(j760.m140076a(typeByAlias, Integer.valueOf(i)));
                    }
                    i++;
                } else if (typeByAlias == HomeCardExpandedType.QUESTION) {
                    int size = user.profile.answers.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        if (m170173e(act, user, userInfo, typeByAlias, i3)) {
                            arrayList.add(j760.m140076a(typeByAlias, Integer.valueOf(i3)));
                            HomeCardExpandedType homeCardExpandedType = HomeCardExpandedType.LIFE_PIC;
                            if (m170173e(act, user, userInfo, homeCardExpandedType, i)) {
                                arrayList.add(j760.m140076a(homeCardExpandedType, Integer.valueOf(i)));
                            }
                            i++;
                        }
                    }
                    while (i < user.pictures.size()) {
                        HomeCardExpandedType homeCardExpandedType2 = HomeCardExpandedType.LIFE_PIC;
                        if (m170173e(act, user, userInfo, homeCardExpandedType2, i)) {
                            arrayList.add(j760.m140076a(homeCardExpandedType2, Integer.valueOf(i)));
                        }
                        i++;
                    }
                } else if (m170173e(act, user, userInfo, typeByAlias, 0)) {
                    arrayList.add(j760.m140076a(typeByAlias, 0));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m170173e(Act act, User user, CoreSuggested.UserInfo userInfo, HomeCardExpandedType homeCardExpandedType, int i) {
        boolean zIsEmpty;
        switch (C19268a.f150128a[homeCardExpandedType.ordinal()]) {
            case 2:
                if (user.isMe()) {
                    return false;
                }
                xaj0<ValueObject, ValueObject, Boolean> xaj0VarM119461g = f4v.m119459f().m119461g(user.f56011id);
                if ((!NullChecker.m81303a(xaj0VarM119461g) || (xaj0VarM119461g.f191751a == null && xaj0VarM119461g.f191752b == null)) && xaj0VarM119461g != null && xaj0VarM119461g.f191753c.booleanValue()) {
                    return false;
                }
            case 1:
                return true;
            case 3:
                zIsEmpty = TextUtils.isEmpty(user.description);
                return !zIsEmpty;
            case 4:
                return m170177i(user);
            case 5:
                return user.pictures.size() > i;
            case 6:
                return m170180l(user, userInfo);
            case 7:
                return true;
            case 8:
                return (user.profile.answers.size() <= i || TextUtils.isEmpty(user.profile.answers.get(i).question) || TextUtils.isEmpty(user.profile.answers.get(i).value)) ? false : true;
            case 9:
                return (user.isMe() || user.isTeamAccount()) ? false : true;
            case 10:
                return true;
            case 11:
                zIsEmpty = vwb.m200296J(user.profile.extensions.basic.intlFriendPurposeV2);
                return !zIsEmpty;
            case 12:
                zIsEmpty = vwb.m200296J(vwb.m200339n(user.profile.tags, new w9j() { // from class: l.nlf
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(!TextUtils.equals(((Tag) obj).category, "personality"));
                    }
                }));
                return !zIsEmpty;
            case 13:
                zIsEmpty = vwb.m200296J(vwb.m200339n(user.profile.tags, new w9j() { // from class: l.olf
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((Tag) obj).category, "personality"));
                    }
                }));
                return !zIsEmpty;
            case 14:
                return true;
            case 15:
                return !m170177i(user) && m170176h(user);
            case 16:
                return m170175g(user);
            case 17:
                return m170179k(user);
            case 18:
                return m170178j(user);
            case 19:
                return TextUtils.equals(ABManager.m29352j0("ttt_profile_tantanid"), "test") && NullChecker.m81303a(user) && !TextUtils.isEmpty(user.publicId);
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m170174f(User user) {
        if (!u59.m191823d0() || !NullChecker.m81303a(user)) {
            return false;
        }
        r4w r4wVar = r4w.INSTANCE;
        if (r4wVar.m177848C(user.f56011id)) {
            return true;
        }
        if (!user.isLoveBuzz()) {
            return false;
        }
        Conversation conversationM33216zp = CoreModule.f17545c.f19642f0.m33216zp(user.f56011id);
        if (r4wVar.m177861o(conversationM33216zp)) {
            return r4wVar.m177848C(user.f56011id);
        }
        if (r4wVar.m177849D(conversationM33216zp)) {
            return false;
        }
        return r4wVar.m177859m(conversationM33216zp);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m170175g(User user) {
        return user.isMe() && NullChecker.m81303a(user.profile.receivedLikes) && !nkp.m159984c() && (vdj.m197999a() || user.profile.receivedLikes.longValue() >= 1);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m170176h(User user) {
        boolean zIsMe = user.isMe();
        if (CoreModule.f17545c.f19561E0.m203771A3(user)) {
            return false;
        }
        if (!vdj.m198001c() && !nkp.m159986e()) {
            return false;
        }
        if (zIsMe) {
            return true;
        }
        return user.isVIP() && !user.gpHideVip() && user.isVIP();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m170177i(User user) {
        User userMe_ = CoreModule.m29932K().me_();
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (user.isMe()) {
            return (NullChecker.m81303a(verificationCenterM31612k4) && NullChecker.m81304b(verificationCenterM31612k4.picVerificationInfo) && TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "verified")) ? false : true;
        }
        return user.isPicVerificationVerified() && !userMe_.isPicVerificationVerified();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m170178j(User user) {
        return (user == null || user.isMe() || user.isTeamAccount()) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m170179k(User user) {
        if (user == null || user.isMe() || user.isTeamAccount()) {
            return false;
        }
        return !xp5.m210476p(user);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m170180l(User user, CoreSuggested.UserInfo userInfo) {
        if (rlt.m179881b(userInfo.from)) {
            return false;
        }
        if (CoreModule.m29936Q().mo67255a().mo124834a()) {
            user = CoreModule.m29936Q().getUserById(user.f56011id);
        }
        return user == null || !user.unilateralBlock();
    }
}
