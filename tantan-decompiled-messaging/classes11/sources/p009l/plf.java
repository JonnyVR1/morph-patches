package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.holder.HomeCardExpandedType;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.ABManager;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.data.Answer;
import com.p1.mobile.putong.data.ConversationStatus;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.j760;
import l.nkp;
import l.r4w;
import l.u59;
import l.vdj;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.xp5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class plf {

    /* JADX INFO: renamed from: l.plf$a */
    public static /* synthetic */ class C1119a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f18780a;

        static {
            int[] iArr = new int[HomeCardExpandedType.values().length];
            f18780a = iArr;
            try {
                iArr[HomeCardExpandedType.AVATAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18780a[HomeCardExpandedType.LIVE_ROOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18780a[HomeCardExpandedType.ABOUT_ME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18780a[HomeCardExpandedType.VERIFY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18780a[HomeCardExpandedType.LIFE_PIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18780a[HomeCardExpandedType.MOMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18780a[HomeCardExpandedType.BASE_INFO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18780a[HomeCardExpandedType.QUESTION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18780a[HomeCardExpandedType.REPORT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f18780a[HomeCardExpandedType.CARD_NAME.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f18780a[HomeCardExpandedType.RELATIONSHIP_GOALS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f18780a[HomeCardExpandedType.INTERESTS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f18780a[HomeCardExpandedType.HASH_TAG.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f18780a[HomeCardExpandedType.ADMOB.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f18780a[HomeCardExpandedType.MEMBER.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f18780a[HomeCardExpandedType.LIKES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f18780a[HomeCardExpandedType.COMPLIMENT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f18780a[HomeCardExpandedType.COMPLIMENT_RECEIVED.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f18780a[HomeCardExpandedType.TANTANID.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static List<String> m20500c(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("avatar");
        arrayList.add("compliment_received");
        arrayList.add("name");
        arrayList.add("verification");
        arrayList.add("member");
        arrayList.add("likes");
        arrayList.add("aboutMe");
        arrayList.add("relationship_goals");
        arrayList.add("life_pic");
        arrayList.add("my_bio");
        arrayList.add("life_pic");
        arrayList.add("moment");
        arrayList.add("interests");
        arrayList.add("life_pic");
        arrayList.add("hash_tag");
        arrayList.add("questionAnswer");
        arrayList.add("compliment");
        arrayList.add("tantanid");
        arrayList.add("admob");
        arrayList.add("report");
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static List<j760<HomeCardExpandedType, Integer>> m20501d(Act act, User user, CoreSuggested.UserInfo userInfo) {
        ArrayList arrayList = new ArrayList();
        Relationship relationship = user.localRelationship;
        if (relationship != null && TEnum.equals(relationship.conversationStatus, ConversationStatus.get("blocked"))) {
            arrayList.add(j760.a(HomeCardExpandedType.AVATAR, 0));
            arrayList.add(j760.a(HomeCardExpandedType.CARD_NAME, 0));
            arrayList.add(j760.a(HomeCardExpandedType.REPORT, 0));
            return arrayList;
        }
        if (user.isBanedOrInactivated() && userInfo.renderFrom == CardInfoRenderFrom.PROFILE) {
            arrayList.add(j760.a(HomeCardExpandedType.AVATAR, 0));
            return arrayList;
        }
        if (userInfo.renderFrom == CardInfoRenderFrom.PROFILE_PREVIEW) {
            arrayList.add(j760.a(HomeCardExpandedType.AVATAR, 0));
            return arrayList;
        }
        List<String> listM20500c = m20500c(f4v.m14251f().m14255i(userInfo.id));
        int i = 1;
        int i2 = 0;
        while (i2 < listM20500c.size()) {
            HomeCardExpandedType typeByAlias = HomeCardExpandedType.getTypeByAlias(listM20500c.get(i2));
            i2++;
            if (typeByAlias != null) {
                if (typeByAlias == HomeCardExpandedType.LIFE_PIC) {
                    if (m20502e(act, user, userInfo, typeByAlias, i)) {
                        arrayList.add(j760.a(typeByAlias, Integer.valueOf(i)));
                    }
                    i++;
                } else if (typeByAlias == HomeCardExpandedType.QUESTION) {
                    int size = user.profile.answers.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        if (m20502e(act, user, userInfo, typeByAlias, i3)) {
                            arrayList.add(j760.a(typeByAlias, Integer.valueOf(i3)));
                            HomeCardExpandedType homeCardExpandedType = HomeCardExpandedType.LIFE_PIC;
                            if (m20502e(act, user, userInfo, homeCardExpandedType, i)) {
                                arrayList.add(j760.a(homeCardExpandedType, Integer.valueOf(i)));
                            }
                            i++;
                        }
                    }
                    while (i < user.pictures.size()) {
                        HomeCardExpandedType homeCardExpandedType2 = HomeCardExpandedType.LIFE_PIC;
                        if (m20502e(act, user, userInfo, homeCardExpandedType2, i)) {
                            arrayList.add(j760.a(homeCardExpandedType2, Integer.valueOf(i)));
                        }
                        i++;
                    }
                } else if (m20502e(act, user, userInfo, typeByAlias, 0)) {
                    arrayList.add(j760.a(typeByAlias, 0));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m20502e(Act act, User user, CoreSuggested.UserInfo userInfo, HomeCardExpandedType homeCardExpandedType, int i) {
        boolean zIsEmpty;
        switch (C1119a.f18780a[homeCardExpandedType.ordinal()]) {
            case 2:
                if (user.isMe()) {
                    return false;
                }
                xaj0<ValueObject, ValueObject, Boolean> xaj0VarM14253g = f4v.m14251f().m14253g(((DbObject) user).id);
                if ((!NullChecker.a(xaj0VarM14253g) || (xaj0VarM14253g.a == null && xaj0VarM14253g.b == null)) && xaj0VarM14253g != null && ((Boolean) xaj0VarM14253g.c).booleanValue()) {
                    return false;
                }
            case 1:
                return true;
            case 3:
                zIsEmpty = TextUtils.isEmpty(user.description);
                return !zIsEmpty;
            case 4:
                return m20506i(user);
            case 5:
                return user.pictures.size() > i;
            case 6:
                return m20509l(user, userInfo);
            case 7:
                return true;
            case 8:
                return (user.profile.answers.size() <= i || TextUtils.isEmpty(((Answer) user.profile.answers.get(i)).question) || TextUtils.isEmpty(((Answer) user.profile.answers.get(i)).value)) ? false : true;
            case MediaPickerParamsObject.FROM_JS_BRIDGE_SWIPE_CARD /* 9 */:
                return (user.isMe() || user.isTeamAccount()) ? false : true;
            case 10:
                return true;
            case MediaPickerParamsObject.FROM_CHAT_SWITCH_BACK_PIC /* 11 */:
                zIsEmpty = vwb.J(user.profile.extensions.basic.intlFriendPurposeV2);
                return !zIsEmpty;
            case MediaPickerParamsObject.FROM_PROFILE_WEALTH /* 12 */:
                zIsEmpty = vwb.J(vwb.n(user.profile.tags, new w9j() { // from class: l.nlf
                    public final Object call(Object obj) {
                        return Boolean.valueOf(!TextUtils.equals(((Tag) obj).category, "personality"));
                    }
                }));
                return !zIsEmpty;
            case MediaPickerParamsObject.FROM_CHAT_LIMIT_SHOOT_PIC /* 13 */:
                zIsEmpty = vwb.J(vwb.n(user.profile.tags, new w9j() { // from class: l.olf
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((Tag) obj).category, "personality"));
                    }
                }));
                return !zIsEmpty;
            case MediaPickerParamsObject.FROM_CITY_CENTER_UPLOAD_PIC /* 14 */:
                return true;
            case MediaPickerParamsObject.FROM_PROFILE_GAME /* 15 */:
                return !m20506i(user) && m20505h(user);
            case MediaPickerParamsObject.FROM_DEFAULT /* 16 */:
                return m20504g(user);
            case MediaPickerParamsObject.FROM_PROFILE_PET /* 17 */:
                return m20508k(user);
            case 18:
                return m20507j(user);
            case 19:
                return TextUtils.equals(ABManager.j0("ttt_profile_tantanid"), "test") && NullChecker.a(user) && !TextUtils.isEmpty(user.publicId);
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m20503f(User user) {
        if (!u59.d0() || !NullChecker.a(user)) {
            return false;
        }
        r4w r4wVar = r4w.INSTANCE;
        if (r4wVar.C(((DbObject) user).id)) {
            return true;
        }
        if (!user.isLoveBuzz()) {
            return false;
        }
        Conversation conversationZp = CoreModule.c.f0.zp(((DbObject) user).id);
        if (r4wVar.o(conversationZp)) {
            return r4wVar.C(((DbObject) user).id);
        }
        if (r4wVar.D(conversationZp)) {
            return false;
        }
        return r4wVar.m(conversationZp);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m20504g(User user) {
        return user.isMe() && NullChecker.a(user.profile.receivedLikes) && !nkp.c() && (vdj.a() || user.profile.receivedLikes.longValue() >= 1);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m20505h(User user) {
        boolean zIsMe = user.isMe();
        if (CoreModule.c.E0.A3(user)) {
            return false;
        }
        if (!vdj.c() && !nkp.e()) {
            return false;
        }
        if (zIsMe) {
            return true;
        }
        return user.isVIP() && !user.gpHideVip() && user.isVIP();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m20506i(User user) {
        User userMe_ = CoreModule.K().me_();
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (user.isMe()) {
            return (NullChecker.a(verificationCenterK4) && NullChecker.b(verificationCenterK4.picVerificationInfo) && TEnum.equals(verificationCenterK4.picVerificationInfo.status, "verified")) ? false : true;
        }
        return user.isPicVerificationVerified() && !userMe_.isPicVerificationVerified();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m20507j(User user) {
        return (user == null || user.isMe() || user.isTeamAccount()) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m20508k(User user) {
        if (user == null || user.isMe() || user.isTeamAccount()) {
            return false;
        }
        return !xp5.p(user);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m20509l(User user, CoreSuggested.UserInfo userInfo) {
        if (rlt.m21696b(userInfo.from)) {
            return false;
        }
        if (CoreModule.Q().m9040a().m14846a()) {
            user = CoreModule.Q().getUserById(((DbObject) user).id);
        }
        return user == null || !user.unilateralBlock();
    }
}
