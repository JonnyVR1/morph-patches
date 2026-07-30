package p153l;

import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ProfileLikeType;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.holder.HomeCardExpandedType;
import com.p051p1.mobile.putong.data.ConversationStatus;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class vmf {

    /* JADX INFO: renamed from: l.vmf$a */
    public static /* synthetic */ class C20855a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f184711a;

        static {
            int[] iArr = new int[HomeCardExpandedType.values().length];
            f184711a = iArr;
            try {
                iArr[HomeCardExpandedType.AVATAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f184711a[HomeCardExpandedType.LIVE_ROOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f184711a[HomeCardExpandedType.ABOUT_ME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f184711a[HomeCardExpandedType.VERIFY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f184711a[HomeCardExpandedType.LIFE_PIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f184711a[HomeCardExpandedType.MOMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f184711a[HomeCardExpandedType.BASE_INFO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f184711a[HomeCardExpandedType.QUESTION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f184711a[HomeCardExpandedType.REPORT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f184711a[HomeCardExpandedType.CARD_NAME.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f184711a[HomeCardExpandedType.RELATIONSHIP_GOALS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f184711a[HomeCardExpandedType.INTERESTS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f184711a[HomeCardExpandedType.HASH_TAG.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f184711a[HomeCardExpandedType.ADMOB.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f184711a[HomeCardExpandedType.MEMBER.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f184711a[HomeCardExpandedType.LIKES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f184711a[HomeCardExpandedType.COMPLIMENT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f184711a[HomeCardExpandedType.COMPLIMENT_RECEIVED.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f184711a[HomeCardExpandedType.TANTANID.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static List<String> m201733c(boolean z) {
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
    public static List<pf60<HomeCardExpandedType, Integer>> m201734d(Act act, User user, CoreSuggested.UserInfo userInfo) {
        ArrayList arrayList = new ArrayList();
        Relationship relationship = user.localRelationship;
        if (relationship != null && TEnum.equals(relationship.conversationStatus, ConversationStatus.get("blocked"))) {
            arrayList.add(pf60.m172085a(HomeCardExpandedType.AVATAR, 0));
            arrayList.add(pf60.m172085a(HomeCardExpandedType.CARD_NAME, 0));
            arrayList.add(pf60.m172085a(HomeCardExpandedType.REPORT, 0));
            return arrayList;
        }
        if (user.isBanedOrInactivated() && userInfo.renderFrom == CardInfoRenderFrom.PROFILE) {
            arrayList.add(pf60.m172085a(HomeCardExpandedType.AVATAR, 0));
            return arrayList;
        }
        if (userInfo.renderFrom == CardInfoRenderFrom.PROFILE_PREVIEW) {
            arrayList.add(pf60.m172085a(HomeCardExpandedType.AVATAR, 0));
            return arrayList;
        }
        List<String> listM201733c = m201733c(g6v.m129273f().m129277i(userInfo.f20214id));
        int i = 1;
        int i2 = 0;
        while (i2 < listM201733c.size()) {
            HomeCardExpandedType typeByAlias = HomeCardExpandedType.getTypeByAlias(listM201733c.get(i2));
            i2++;
            if (typeByAlias != null) {
                if (typeByAlias == HomeCardExpandedType.LIFE_PIC) {
                    if (m201735e(act, user, userInfo, typeByAlias, i)) {
                        arrayList.add(pf60.m172085a(typeByAlias, Integer.valueOf(i)));
                    }
                    i++;
                } else if (typeByAlias == HomeCardExpandedType.QUESTION) {
                    int size = user.profile.answers.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        if (m201735e(act, user, userInfo, typeByAlias, i3)) {
                            arrayList.add(pf60.m172085a(typeByAlias, Integer.valueOf(i3)));
                            HomeCardExpandedType homeCardExpandedType = HomeCardExpandedType.LIFE_PIC;
                            if (m201735e(act, user, userInfo, homeCardExpandedType, i)) {
                                arrayList.add(pf60.m172085a(homeCardExpandedType, Integer.valueOf(i)));
                            }
                            i++;
                        }
                    }
                    while (i < user.pictures.size()) {
                        HomeCardExpandedType homeCardExpandedType2 = HomeCardExpandedType.LIFE_PIC;
                        if (m201735e(act, user, userInfo, homeCardExpandedType2, i)) {
                            arrayList.add(pf60.m172085a(homeCardExpandedType2, Integer.valueOf(i)));
                        }
                        i++;
                    }
                } else if (m201735e(act, user, userInfo, typeByAlias, 0)) {
                    arrayList.add(pf60.m172085a(typeByAlias, 0));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m201735e(Act act, User user, CoreSuggested.UserInfo userInfo, HomeCardExpandedType homeCardExpandedType, int i) {
        boolean zIsEmpty;
        switch (C20855a.f184711a[homeCardExpandedType.ordinal()]) {
            case 2:
                if (user.isMe()) {
                    return false;
                }
                bkj0<ValueObject, ValueObject, Boolean> bkj0VarM129275g = g6v.m129273f().m129275g(user.f56859id);
                if ((!NullChecker.m82486a(bkj0VarM129275g) || (bkj0VarM129275g.f77081a == null && bkj0VarM129275g.f77082b == null)) && bkj0VarM129275g != null && bkj0VarM129275g.f77083c.booleanValue()) {
                    return false;
                }
            case 1:
                return true;
            case 3:
                zIsEmpty = TextUtils.isEmpty(user.description);
                return !zIsEmpty;
            case 4:
                return m201739i(user);
            case 5:
                return user.pictures.size() > i;
            case 6:
                return m201742l(user, userInfo);
            case 7:
                return true;
            case 8:
                return (user.profile.answers.size() <= i || TextUtils.isEmpty(user.profile.answers.get(i).question) || TextUtils.isEmpty(user.profile.answers.get(i).value)) ? false : true;
            case 9:
                return (user.isMe() || user.isTeamAccount()) ? false : true;
            case 10:
                return true;
            case 11:
                zIsEmpty = jyb.m147479J(user.profile.extensions.basic.intlFriendPurposeV2);
                return !zIsEmpty;
            case 12:
                zIsEmpty = jyb.m147479J(jyb.m147522n(user.profile.tags, new qcj() { // from class: l.tmf
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(!TextUtils.equals(((Tag) obj).category, "personality"));
                    }
                }));
                return !zIsEmpty;
            case 13:
                zIsEmpty = jyb.m147479J(jyb.m147522n(user.profile.tags, new qcj() { // from class: l.umf
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((Tag) obj).category, "personality"));
                    }
                }));
                return !zIsEmpty;
            case 14:
                return true;
            case 15:
                return !m201739i(user) && m201738h(user);
            case 16:
                return m201737g(user);
            case 17:
                return m201741k(user);
            case 18:
                return m201740j(user);
            case 19:
                return TextUtils.equals(ABManager.m30350j0("ttt_profile_tantanid"), "test") && NullChecker.m82486a(user) && !TextUtils.isEmpty(user.publicId);
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m201736f(User user) {
        if (!d79.m114675e0() || !NullChecker.m82486a(user)) {
            return false;
        }
        p6w p6wVar = p6w.INSTANCE;
        if (p6wVar.m171055C(user.f56859id)) {
            return true;
        }
        if (!user.isLoveBuzz()) {
            return false;
        }
        Conversation conversationM34219zp = CoreModule.f18264c.f20384f0.m34219zp(user.f56859id);
        if (p6wVar.m171068o(conversationM34219zp)) {
            return p6wVar.m171055C(user.f56859id);
        }
        if (p6wVar.m171056D(conversationM34219zp)) {
            return false;
        }
        return p6wVar.m171066m(conversationM34219zp);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m201737g(User user) {
        return user.isMe() && NullChecker.m82486a(user.profile.receivedLikes) && !nmp.m163834c() && (pgj.m172244a() || user.profile.receivedLikes.longValue() >= 1);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m201738h(User user) {
        boolean zIsMe = user.isMe();
        if (CoreModule.f18264c.f20303E0.m141059A3(user)) {
            return false;
        }
        if (!pgj.m172246c() && !nmp.m163836e()) {
            return false;
        }
        if (zIsMe) {
            return true;
        }
        return user.isVIP() && !user.gpHideVip() && user.isVIP();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m201739i(User user) {
        User userMe_ = CoreModule.m30930K().me_();
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (user.isMe()) {
            return (NullChecker.m82486a(verificationCenterM32615k4) && NullChecker.m82487b(verificationCenterM32615k4.picVerificationInfo) && TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "verified")) ? false : true;
        }
        return user.isPicVerificationVerified() && !userMe_.isPicVerificationVerified();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m201740j(User user) {
        return (user == null || user.isMe() || user.isTeamAccount()) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m201741k(User user) {
        if (user == null || user.isMe() || user.isTeamAccount()) {
            return false;
        }
        return !br5.m106045p(user);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m201742l(User user, CoreSuggested.UserInfo userInfo) {
        if (tnt.m191965b(userInfo.from)) {
            return false;
        }
        if (CoreModule.m30934Q().mo68438a().mo134409a()) {
            user = CoreModule.m30934Q().getUserById(user.f56859id);
        }
        return user == null || !user.unilateralBlock();
    }
}
