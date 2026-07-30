package p149l;

import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.RankLevel;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.SeeTextDynamicParam;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class mbk0 implements cvv.InterfaceC16252c {

    /* JADX INFO: renamed from: a */
    public uqd0 f133030a = new uqd0("history_avatar", "");

    /* JADX INFO: renamed from: b */
    public String f133031b;

    /* JADX INFO: renamed from: c */
    public User f133032c;

    /* JADX INFO: renamed from: d */
    public User f133033d;

    /* JADX INFO: renamed from: e */
    public User f133034e;

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ Object m153900F() {
        List<User> list = CoreModule.f17545c.f19687u0.m30471r5().f19272d;
        if (vwb.m200296J(list)) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m153908h(User user) {
        if (CoreModule.f17545c.f19687u0.m30471r5() == null) {
            return "0";
        }
        int i = CoreModule.f17545c.f19687u0.m30471r5().f19270b;
        return i > 98 ? "99+" : String.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ Object m153913l0() {
        if (NullChecker.m81303a(this.f133031b)) {
            return CoreModule.f17545c.f19639e0.m169430Pa(this.f133031b);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ Object m153915m0() {
        return this.f133032c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ Object m153917n0() {
        return this.f133033d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object m153919o0() {
        return this.f133034e;
    }

    /* JADX INFO: renamed from: I */
    public final String m153931I(Settings settings, boolean z) {
        if (settings != null) {
            String string = settings.getLookingFor().toString();
            string.getClass();
            if (string.equals("female")) {
                return m153933K(Gender.get("female"), z);
            }
            if (string.equals("male")) {
                return m153933K(Gender.get("male"), z);
            }
        }
        return m153933K(CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? Gender.get("male") : Gender.get("female"), z);
    }

    /* JADX INFO: renamed from: J */
    public final String m153932J(Settings settings, boolean z, boolean z2) {
        if (settings != null) {
            String string = settings.getLookingFor().toString();
            string.getClass();
            if (string.equals("female")) {
                return m153934L(Gender.get("female"), z, z2);
            }
            if (string.equals("male")) {
                return m153934L(Gender.get("male"), z, z2);
            }
        }
        return m153934L(CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? Gender.get("male") : Gender.get("female"), z, z2);
    }

    /* JADX INFO: renamed from: K */
    public final String m153933K(Gender gender, boolean z) {
        String string = gender.toString();
        string.getClass();
        if (string.equals("female")) {
            return z ? "女生" : "女性";
        }
        if (string.equals("male")) {
            return z ? "男生" : "男性";
        }
        return "";
    }

    /* JADX INFO: renamed from: L */
    public final String m153934L(Gender gender, boolean z, boolean z2) {
        if (z2) {
            String string = gender.toString();
            string.getClass();
            if (string.equals("female")) {
                return "小姐姐";
            }
            return !string.equals("male") ? "" : "小哥哥";
        }
        String string2 = gender.toString();
        string2.getClass();
        if (string2.equals("female")) {
            return z ? "她" : "她们";
        }
        if (string2.equals("male")) {
            return z ? "他" : "他们";
        }
        return "";
    }

    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final String m153953e0(User user) {
        j760<Boolean, Boolean> j760VarM31613l4 = CoreModule.f17545c.f19552B0.m31613l4();
        if (j760VarM31613l4.f116564a.booleanValue() && j760VarM31613l4.f116565b.booleanValue()) {
            return user.isFemale() ? "完成真实头像和真人实名认证后，你可以设置优先推荐认证用户，更快遇见优质、靠谱的人" : "完成真实头像和真人实名认证后，会显著提升你给对方的安全感，更有可能被右滑喔";
        }
        if (!j760VarM31613l4.f116564a.booleanValue() && j760VarM31613l4.f116565b.booleanValue()) {
            return user.isFemale() ? "你的真人实名认证还未完成，认证成功后你可以设置优先推荐认证用户，更快遇见优质、靠谱的人" : "你的真人实名认证还未完成，认证成功后会显著提升你给对方的安全感，更有可能被右滑喔";
        }
        if (!j760VarM31613l4.f116564a.booleanValue() || j760VarM31613l4.f116565b.booleanValue()) {
            return "";
        }
        return user.isFemale() ? "你的真人实名认证还未激活，激活后你可以设置优先推荐认证用户，更快遇见优质、靠谱的人" : "你的真人实名认证还未激活，激活后会显著提升你给对方的安全感，更有可能被右滑喔";
    }

    /* JADX INFO: renamed from: N */
    public String m153936N() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (userM169527p9.isIdCardVerified()) {
            return "verified";
        }
        return (NullChecker.m81303a(verificationCenterM31612k4) && NullChecker.m81303a(verificationCenterM31612k4.idCard)) ? verificationCenterM31612k4.idCard.status.toString() : "unknown_";
    }

    /* JADX INFO: renamed from: O */
    public String m153937O() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (userM169527p9.isPicVerificationVerified()) {
            return "verified";
        }
        return (NullChecker.m81303a(verificationCenterM31612k4) && NullChecker.m81303a(verificationCenterM31612k4.picVerificationInfo)) ? verificationCenterM31612k4.picVerificationInfo.status.toString() : "unknown_";
    }

    /* JADX INFO: renamed from: P */
    public final Object m153938P() {
        return CoreModule.f17545c.f19552B0.m31613l4().f116564a.booleanValue() ? "《真实头像认证协议》" : "《真人实名认证协议》";
    }

    /* JADX INFO: renamed from: Q */
    public final Object m153939Q() {
        return CoreModule.f17545c.f19552B0.m31613l4().f116564a.booleanValue() ? "我同意腾讯、阿里、陌陌将采集我的面部信息并与头像比对，详见" : "我已阅读并同意，真人实名认证需要输入我的姓名和身份证号，并通过供应商腾讯、阿里和陌陌采集我的面部信息，来确保头像、身份证都是我本人，每个身份证只能认证一个探探账号，详见";
    }

    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final String m153952d0(User user) {
        return TEnum.equals(user.gender, "female") ? "怎么更快遇见靠谱的另一半？" : "怎样获得更多配对？";
    }

    /* JADX INFO: renamed from: S */
    public String m153941S() {
        return CoreModule.f17545c.f19552B0.m31613l4().f116564a.booleanValue() ? "avatar_verification" : "id_verification";
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ Object m153942T(User user) {
        return m153934L(user.gender, true, false);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ Object m153943U(User user) {
        return m153932J(user.settings, true, false);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ Object m153944V(User user) {
        return m153932J(user.settings, false, false);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ Object m153945W(User user) {
        return m153931I(user.settings, true);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ Object m153946X(User user) {
        return m153931I(user.settings, false);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Object m153947Y(User user) {
        return m153932J(user.settings, true, true);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object m153948Z(User user) {
        return m153932J(null, true, false);
    }

    @Override // p149l.cvv.InterfaceC16252c
    /* JADX INFO: renamed from: a */
    public void mo95740a(Map<String, cvv.InterfaceC16251b<Object>> map) {
        map.put("me", new cvv.InterfaceC16251b() { // from class: l.yak0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return CoreModule.f17545c.f19639e0.m169527p9();
            }
        });
        map.put("swipe_user", new cvv.InterfaceC16251b() { // from class: l.zak0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return this.f202370a.m153913l0();
            }
        });
        map.put("first_liker", new cvv.InterfaceC16251b() { // from class: l.abk0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return mbk0.m153900F();
            }
        });
        map.put("like_me_profile", new cvv.InterfaceC16251b() { // from class: l.bbk0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return this.f74851a.m153915m0();
            }
        });
        map.put("nearby_comment_me_profile", new cvv.InterfaceC16251b() { // from class: l.dbk0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return this.f85323a.m153917n0();
            }
        });
        map.put("nearby_user_profile", new cvv.InterfaceC16251b() { // from class: l.ebk0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return this.f90359a.m153919o0();
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ Object m153949a0(User user) {
        return m153932J(null, false, false);
    }

    @Override // p149l.cvv.InterfaceC16252c
    /* JADX INFO: renamed from: b */
    public void mo95741b(Map<String, cvv.InterfaceC16250a<Object>> map) {
        map.put("receiveLikes", new cvv.InterfaceC16250a() { // from class: l.gak0
            @Override // p149l.cvv.InterfaceC16250a
            /* JADX INFO: renamed from: a */
            public final Object mo106017a(User user) {
                return user.profile.receivedLikes;
            }
        });
        map.put("see_total_num", new cvv.InterfaceC16250a() { // from class: l.iak0
            @Override // p149l.cvv.InterfaceC16250a
            /* JADX INFO: renamed from: a */
            public final Object mo106017a(User user) {
                return mbk0.m153908h(user);
            }
        });
        map.put("history_avatar", new cvv.InterfaceC16250a() { // from class: l.pak0
            @Override // p149l.cvv.InterfaceC16250a
            /* JADX INFO: renamed from: a */
            public final Object mo106017a(User user) {
                return this.f147987a.m153959k0(user);
            }
        });
        map.put(AuthenticationTokenClaims.JSON_KEY_NAME, new cvv.InterfaceC16250a() { // from class: l.qak0
            @Override // p149l.cvv.InterfaceC16250a
            /* JADX INFO: renamed from: a */
            public final Object mo106017a(User user) {
                return user.name;
            }
        });
        map.put("gender", new cvv.InterfaceC16250a() { // from class: l.sak0
            @Override // p149l.cvv.InterfaceC16250a
            /* JADX INFO: renamed from: a */
            public final Object mo106017a(User user) {
                return user.gender;
            }
        });
        map.put("gender_refer", new cvv.InterfaceC16250a() { // from class: l.tak0
            @Override // p149l.cvv.InterfaceC16250a
            /* JADX INFO: renamed from: a */
            public final Object mo106017a(User user) {
                return this.f169126a.m153942T(user);
            }
        });
        map.put(SeeTextDynamicParam.age, new cvv.InterfaceC16250a() { // from class: l.uak0
            @Override // p149l.cvv.InterfaceC16250a
            /* JADX INFO: renamed from: a */
            public final Object mo106017a(User user) {
                return user.age;
            }
        });
        map.put(RankLevel.city, new cvv.InterfaceC16250a() { // from class: l.vak0
            @Override // p149l.cvv.InterfaceC16250a
            /* JADX INFO: renamed from: a */
            public final Object mo106017a(User user) {
                return user.location.region.city;
            }
        });
        map.put("distance", new cvv.InterfaceC16250a() { // from class: l.wak0
            @Override // p149l.cvv.InterfaceC16250a
            /* JADX INFO: renamed from: a */
            public final Object mo106017a(User user) {
                return Integer.valueOf(user.location.distance);
            }
        });
        map.put("avatar", new cvv.InterfaceC16250a() { // from class: l.xak0
            @Override // p149l.cvv.InterfaceC16250a
            /* JADX INFO: renamed from: a */
            public final Object mo106017a(User user) {
                return user.picture(0).url;
            }
        });
        map.put("searching_gender_refer", new cvv.InterfaceC16250a() { // from class: l.rak0
            @Override // p149l.cvv.InterfaceC16250a
            /* JADX INFO: renamed from: a */
            public final Object mo106017a(User user) {
                return this.f158525a.m153943U(user);
            }
        });
        map.put("searching_genders_refer", new cvv.InterfaceC16250a() { // from class: l.cbk0
            @Override // p149l.cvv.InterfaceC16250a
            /* JADX INFO: renamed from: a */
            public final Object mo106017a(User user) {
                return this.f80162a.m153944V(user);
            }
        });
        map.put("searching_gender_sex1", new cvv.InterfaceC16250a() { // from class: l.fbk0
            @Override // p149l.cvv.InterfaceC16250a
            /* JADX INFO: renamed from: a */
            public final Object mo106017a(User user) {
                return this.f96734a.m153945W(user);
            }
        });
        map.put("searching_gender_sex2", new cvv.InterfaceC16250a() { // from class: l.gbk0
            @Override // p149l.cvv.InterfaceC16250a
            /* JADX INFO: renamed from: a */
            public final Object mo106017a(User user) {
                return this.f101859a.m153946X(user);
            }
        });
        map.put("searching_gender_nickname", new cvv.InterfaceC16250a() { // from class: l.hbk0
            @Override // p149l.cvv.InterfaceC16250a
            /* JADX INFO: renamed from: a */
            public final Object mo106017a(User user) {
                return this.f106942a.m153947Y(user);
            }
        });
        map.put("opposite_gender", new cvv.InterfaceC16250a() { // from class: l.ibk0
            @Override // p149l.cvv.InterfaceC16250a
            /* JADX INFO: renamed from: a */
            public final Object mo106017a(User user) {
                return this.f112370a.m153948Z(user);
            }
        });
        map.put("opposite_genders", new cvv.InterfaceC16250a() { // from class: l.jbk0
            @Override // p149l.cvv.InterfaceC16250a
            /* JADX INFO: renamed from: a */
            public final Object mo106017a(User user) {
                return this.f117196a.m153949a0(user);
            }
        });
        map.put("opposite_gender_sex1", new cvv.InterfaceC16250a() { // from class: l.kbk0
            @Override // p149l.cvv.InterfaceC16250a
            /* JADX INFO: renamed from: a */
            public final Object mo106017a(User user) {
                return this.f122249a.m153950b0(user);
            }
        });
        map.put("opposite_gender_sex2", new cvv.InterfaceC16250a() { // from class: l.lbk0
            @Override // p149l.cvv.InterfaceC16250a
            /* JADX INFO: renamed from: a */
            public final Object mo106017a(User user) {
                return this.f127303a.m153951c0(user);
            }
        });
        map.put("verification_title", new cvv.InterfaceC16250a() { // from class: l.hak0
            @Override // p149l.cvv.InterfaceC16250a
            /* JADX INFO: renamed from: a */
            public final Object mo106017a(User user) {
                return this.f106747a.m153952d0(user);
            }
        });
        map.put("verification_content", new cvv.InterfaceC16250a() { // from class: l.jak0
            @Override // p149l.cvv.InterfaceC16250a
            /* JADX INFO: renamed from: a */
            public final Object mo106017a(User user) {
                return this.f117098a.m153953e0(user);
            }
        });
        map.put("verification_merge_type", new cvv.InterfaceC16250a() { // from class: l.kak0
            @Override // p149l.cvv.InterfaceC16250a
            /* JADX INFO: renamed from: a */
            public final Object mo106017a(User user) {
                return this.f122130a.m153954f0(user);
            }
        });
        map.put("verification_avatar", new cvv.InterfaceC16250a() { // from class: l.lak0
            @Override // p149l.cvv.InterfaceC16250a
            /* JADX INFO: renamed from: a */
            public final Object mo106017a(User user) {
                return this.f127221a.m153955g0(user);
            }
        });
        map.put("verification_id", new cvv.InterfaceC16250a() { // from class: l.mak0
            @Override // p149l.cvv.InterfaceC16250a
            /* JADX INFO: renamed from: a */
            public final Object mo106017a(User user) {
                return this.f132934a.m153956h0(user);
            }
        });
        map.put("verification_protocol_prefix", new cvv.InterfaceC16250a() { // from class: l.nak0
            @Override // p149l.cvv.InterfaceC16250a
            /* JADX INFO: renamed from: a */
            public final Object mo106017a(User user) {
                return this.f137913a.m153957i0(user);
            }
        });
        map.put("verification_protocol", new cvv.InterfaceC16250a() { // from class: l.oak0
            @Override // p149l.cvv.InterfaceC16250a
            /* JADX INFO: renamed from: a */
            public final Object mo106017a(User user) {
                return this.f142810a.m153958j0(user);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ Object m153950b0(User user) {
        return m153931I(null, true);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ Object m153951c0(User user) {
        return m153931I(null, false);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ Object m153954f0(User user) {
        return m153941S();
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ Object m153955g0(User user) {
        return m153937O();
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ Object m153956h0(User user) {
        return m153936N();
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ Object m153957i0(User user) {
        return m153939Q();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ Object m153958j0(User user) {
        return m153938P();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ Object m153959k0(User user) {
        return this.f133030a.get();
    }
}
