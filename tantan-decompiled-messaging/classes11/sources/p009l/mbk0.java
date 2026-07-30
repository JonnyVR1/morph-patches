package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Map;
import l.j760;
import l.uqd0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class mbk0 implements cvv.InterfaceC0829c {

    /* JADX INFO: renamed from: a */
    public uqd0 f16791a = new uqd0("history_avatar", "");

    /* JADX INFO: renamed from: b */
    public String f16792b;

    /* JADX INFO: renamed from: c */
    public User f16793c;

    /* JADX INFO: renamed from: d */
    public User f16794d;

    /* JADX INFO: renamed from: e */
    public User f16795e;

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ Object m18342F() {
        List list = CoreModule.c.u0.r5().d;
        if (vwb.J(list)) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m18350h(User user) {
        if (CoreModule.c.u0.r5() == null) {
            return "0";
        }
        int i = CoreModule.c.u0.r5().b;
        return i > 98 ? "99+" : String.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ Object m18355l0() {
        if (NullChecker.a(this.f16792b)) {
            return CoreModule.c.e0.Pa(this.f16792b);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ Object m18357m0() {
        return this.f16793c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ Object m18359n0() {
        return this.f16794d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object m18361o0() {
        return this.f16795e;
    }

    /* JADX INFO: renamed from: I */
    public final String m18373I(Settings settings, boolean z) {
        if (settings != null) {
            String string = settings.getLookingFor().toString();
            string.getClass();
            if (string.equals("female")) {
                return m18375K(Gender.get("female"), z);
            }
            if (string.equals("male")) {
                return m18375K(Gender.get("male"), z);
            }
        }
        return m18375K(CoreModule.c.e0.p9().isFemale() ? Gender.get("male") : Gender.get("female"), z);
    }

    /* JADX INFO: renamed from: J */
    public final String m18374J(Settings settings, boolean z, boolean z2) {
        if (settings != null) {
            String string = settings.getLookingFor().toString();
            string.getClass();
            if (string.equals("female")) {
                return m18376L(Gender.get("female"), z, z2);
            }
            if (string.equals("male")) {
                return m18376L(Gender.get("male"), z, z2);
            }
        }
        return m18376L(CoreModule.c.e0.p9().isFemale() ? Gender.get("male") : Gender.get("female"), z, z2);
    }

    /* JADX INFO: renamed from: K */
    public final String m18375K(Gender gender, boolean z) {
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
    public final String m18376L(Gender gender, boolean z, boolean z2) {
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
    public final String m18395e0(User user) {
        j760 j760VarL4 = CoreModule.c.B0.l4();
        if (((Boolean) j760VarL4.a).booleanValue() && ((Boolean) j760VarL4.b).booleanValue()) {
            return user.isFemale() ? "完成真实头像和真人实名认证后，你可以设置优先推荐认证用户，更快遇见优质、靠谱的人" : "完成真实头像和真人实名认证后，会显著提升你给对方的安全感，更有可能被右滑喔";
        }
        if (!((Boolean) j760VarL4.a).booleanValue() && ((Boolean) j760VarL4.b).booleanValue()) {
            return user.isFemale() ? "你的真人实名认证还未完成，认证成功后你可以设置优先推荐认证用户，更快遇见优质、靠谱的人" : "你的真人实名认证还未完成，认证成功后会显著提升你给对方的安全感，更有可能被右滑喔";
        }
        if (!((Boolean) j760VarL4.a).booleanValue() || ((Boolean) j760VarL4.b).booleanValue()) {
            return "";
        }
        return user.isFemale() ? "你的真人实名认证还未激活，激活后你可以设置优先推荐认证用户，更快遇见优质、靠谱的人" : "你的真人实名认证还未激活，激活后会显著提升你给对方的安全感，更有可能被右滑喔";
    }

    /* JADX INFO: renamed from: N */
    public String m18378N() {
        User userP9 = CoreModule.c.e0.p9();
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (userP9.isIdCardVerified()) {
            return "verified";
        }
        return (NullChecker.a(verificationCenterK4) && NullChecker.a(verificationCenterK4.idCard)) ? verificationCenterK4.idCard.status.toString() : "unknown_";
    }

    /* JADX INFO: renamed from: O */
    public String m18379O() {
        User userP9 = CoreModule.c.e0.p9();
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (userP9.isPicVerificationVerified()) {
            return "verified";
        }
        return (NullChecker.a(verificationCenterK4) && NullChecker.a(verificationCenterK4.picVerificationInfo)) ? verificationCenterK4.picVerificationInfo.status.toString() : "unknown_";
    }

    /* JADX INFO: renamed from: P */
    public final Object m18380P() {
        return ((Boolean) CoreModule.c.B0.l4().a).booleanValue() ? "《真实头像认证协议》" : "《真人实名认证协议》";
    }

    /* JADX INFO: renamed from: Q */
    public final Object m18381Q() {
        return ((Boolean) CoreModule.c.B0.l4().a).booleanValue() ? "我同意腾讯、阿里、陌陌将采集我的面部信息并与头像比对，详见" : "我已阅读并同意，真人实名认证需要输入我的姓名和身份证号，并通过供应商腾讯、阿里和陌陌采集我的面部信息，来确保头像、身份证都是我本人，每个身份证只能认证一个探探账号，详见";
    }

    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final String m18394d0(User user) {
        return TEnum.equals(user.gender, "female") ? "怎么更快遇见靠谱的另一半？" : "怎样获得更多配对？";
    }

    /* JADX INFO: renamed from: S */
    public String m18383S() {
        return ((Boolean) CoreModule.c.B0.l4().a).booleanValue() ? "avatar_verification" : "id_verification";
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ Object m18384T(User user) {
        return m18376L(user.gender, true, false);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ Object m18385U(User user) {
        return m18374J(user.settings, true, false);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ Object m18386V(User user) {
        return m18374J(user.settings, false, false);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ Object m18387W(User user) {
        return m18373I(user.settings, true);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ Object m18388X(User user) {
        return m18373I(user.settings, false);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Object m18389Y(User user) {
        return m18374J(user.settings, true, true);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object m18390Z(User user) {
        return m18374J(null, true, false);
    }

    @Override // p009l.cvv.InterfaceC0829c
    /* JADX INFO: renamed from: a */
    public void mo11314a(Map<String, cvv.InterfaceC0828b<Object>> map) {
        map.put("me", new cvv.InterfaceC0828b() { // from class: l.yak0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return CoreModule.c.e0.p9();
            }
        });
        map.put("swipe_user", new cvv.InterfaceC0828b() { // from class: l.zak0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return this.f23538a.m18355l0();
            }
        });
        map.put("first_liker", new cvv.InterfaceC0828b() { // from class: l.abk0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return mbk0.m18342F();
            }
        });
        map.put("like_me_profile", new cvv.InterfaceC0828b() { // from class: l.bbk0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return this.f10000a.m18357m0();
            }
        });
        map.put("nearby_comment_me_profile", new cvv.InterfaceC0828b() { // from class: l.dbk0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return this.f11711a.m18359n0();
            }
        });
        map.put("nearby_user_profile", new cvv.InterfaceC0828b() { // from class: l.ebk0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return this.f12485a.m18361o0();
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ Object m18391a0(User user) {
        return m18374J(null, false, false);
    }

    @Override // p009l.cvv.InterfaceC0829c
    /* JADX INFO: renamed from: b */
    public void mo11315b(Map<String, cvv.InterfaceC0827a<Object>> map) {
        map.put("receiveLikes", new cvv.InterfaceC0827a() { // from class: l.gak0
            @Override // p009l.cvv.InterfaceC0827a
            /* JADX INFO: renamed from: a */
            public final Object mo12473a(User user) {
                return user.profile.receivedLikes;
            }
        });
        map.put("see_total_num", new cvv.InterfaceC0827a() { // from class: l.iak0
            @Override // p009l.cvv.InterfaceC0827a
            /* JADX INFO: renamed from: a */
            public final Object mo12473a(User user) {
                return mbk0.m18350h(user);
            }
        });
        map.put("history_avatar", new cvv.InterfaceC0827a() { // from class: l.pak0
            @Override // p009l.cvv.InterfaceC0827a
            /* JADX INFO: renamed from: a */
            public final Object mo12473a(User user) {
                return this.f18441a.m18401k0(user);
            }
        });
        map.put("name", new cvv.InterfaceC0827a() { // from class: l.qak0
            @Override // p009l.cvv.InterfaceC0827a
            /* JADX INFO: renamed from: a */
            public final Object mo12473a(User user) {
                return user.name;
            }
        });
        map.put("gender", new cvv.InterfaceC0827a() { // from class: l.sak0
            @Override // p009l.cvv.InterfaceC0827a
            /* JADX INFO: renamed from: a */
            public final Object mo12473a(User user) {
                return user.gender;
            }
        });
        map.put("gender_refer", new cvv.InterfaceC0827a() { // from class: l.tak0
            @Override // p009l.cvv.InterfaceC0827a
            /* JADX INFO: renamed from: a */
            public final Object mo12473a(User user) {
                return this.f20589a.m18384T(user);
            }
        });
        map.put("age", new cvv.InterfaceC0827a() { // from class: l.uak0
            @Override // p009l.cvv.InterfaceC0827a
            /* JADX INFO: renamed from: a */
            public final Object mo12473a(User user) {
                return user.age;
            }
        });
        map.put("city", new cvv.InterfaceC0827a() { // from class: l.vak0
            @Override // p009l.cvv.InterfaceC0827a
            /* JADX INFO: renamed from: a */
            public final Object mo12473a(User user) {
                return user.location.region.city;
            }
        });
        map.put("distance", new cvv.InterfaceC0827a() { // from class: l.wak0
            @Override // p009l.cvv.InterfaceC0827a
            /* JADX INFO: renamed from: a */
            public final Object mo12473a(User user) {
                return Integer.valueOf(user.location.distance);
            }
        });
        map.put("avatar", new cvv.InterfaceC0827a() { // from class: l.xak0
            @Override // p009l.cvv.InterfaceC0827a
            /* JADX INFO: renamed from: a */
            public final Object mo12473a(User user) {
                return ((Media) user.picture(0)).url;
            }
        });
        map.put("searching_gender_refer", new cvv.InterfaceC0827a() { // from class: l.rak0
            @Override // p009l.cvv.InterfaceC0827a
            /* JADX INFO: renamed from: a */
            public final Object mo12473a(User user) {
                return this.f19711a.m18385U(user);
            }
        });
        map.put("searching_genders_refer", new cvv.InterfaceC0827a() { // from class: l.cbk0
            @Override // p009l.cvv.InterfaceC0827a
            /* JADX INFO: renamed from: a */
            public final Object mo12473a(User user) {
                return this.f10495a.m18386V(user);
            }
        });
        map.put("searching_gender_sex1", new cvv.InterfaceC0827a() { // from class: l.fbk0
            @Override // p009l.cvv.InterfaceC0827a
            /* JADX INFO: renamed from: a */
            public final Object mo12473a(User user) {
                return this.f12905a.m18387W(user);
            }
        });
        map.put("searching_gender_sex2", new cvv.InterfaceC0827a() { // from class: l.gbk0
            @Override // p009l.cvv.InterfaceC0827a
            /* JADX INFO: renamed from: a */
            public final Object mo12473a(User user) {
                return this.f13402a.m18388X(user);
            }
        });
        map.put("searching_gender_nickname", new cvv.InterfaceC0827a() { // from class: l.hbk0
            @Override // p009l.cvv.InterfaceC0827a
            /* JADX INFO: renamed from: a */
            public final Object mo12473a(User user) {
                return this.f13942a.m18389Y(user);
            }
        });
        map.put("opposite_gender", new cvv.InterfaceC0827a() { // from class: l.ibk0
            @Override // p009l.cvv.InterfaceC0827a
            /* JADX INFO: renamed from: a */
            public final Object mo12473a(User user) {
                return this.f14472a.m18390Z(user);
            }
        });
        map.put("opposite_genders", new cvv.InterfaceC0827a() { // from class: l.jbk0
            @Override // p009l.cvv.InterfaceC0827a
            /* JADX INFO: renamed from: a */
            public final Object mo12473a(User user) {
                return this.f15041a.m18391a0(user);
            }
        });
        map.put("opposite_gender_sex1", new cvv.InterfaceC0827a() { // from class: l.kbk0
            @Override // p009l.cvv.InterfaceC0827a
            /* JADX INFO: renamed from: a */
            public final Object mo12473a(User user) {
                return this.f15591a.m18392b0(user);
            }
        });
        map.put("opposite_gender_sex2", new cvv.InterfaceC0827a() { // from class: l.lbk0
            @Override // p009l.cvv.InterfaceC0827a
            /* JADX INFO: renamed from: a */
            public final Object mo12473a(User user) {
                return this.f16043a.m18393c0(user);
            }
        });
        map.put("verification_title", new cvv.InterfaceC0827a() { // from class: l.hak0
            @Override // p009l.cvv.InterfaceC0827a
            /* JADX INFO: renamed from: a */
            public final Object mo12473a(User user) {
                return this.f13924a.m18394d0(user);
            }
        });
        map.put("verification_content", new cvv.InterfaceC0827a() { // from class: l.jak0
            @Override // p009l.cvv.InterfaceC0827a
            /* JADX INFO: renamed from: a */
            public final Object mo12473a(User user) {
                return this.f15027a.m18395e0(user);
            }
        });
        map.put("verification_merge_type", new cvv.InterfaceC0827a() { // from class: l.kak0
            @Override // p009l.cvv.InterfaceC0827a
            /* JADX INFO: renamed from: a */
            public final Object mo12473a(User user) {
                return this.f15567a.m18396f0(user);
            }
        });
        map.put("verification_avatar", new cvv.InterfaceC0827a() { // from class: l.lak0
            @Override // p009l.cvv.InterfaceC0827a
            /* JADX INFO: renamed from: a */
            public final Object mo12473a(User user) {
                return this.f16037a.m18397g0(user);
            }
        });
        map.put("verification_id", new cvv.InterfaceC0827a() { // from class: l.mak0
            @Override // p009l.cvv.InterfaceC0827a
            /* JADX INFO: renamed from: a */
            public final Object mo12473a(User user) {
                return this.f16780a.m18398h0(user);
            }
        });
        map.put("verification_protocol_prefix", new cvv.InterfaceC0827a() { // from class: l.nak0
            @Override // p009l.cvv.InterfaceC0827a
            /* JADX INFO: renamed from: a */
            public final Object mo12473a(User user) {
                return this.f17375a.m18399i0(user);
            }
        });
        map.put("verification_protocol", new cvv.InterfaceC0827a() { // from class: l.oak0
            @Override // p009l.cvv.InterfaceC0827a
            /* JADX INFO: renamed from: a */
            public final Object mo12473a(User user) {
                return this.f17887a.m18400j0(user);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ Object m18392b0(User user) {
        return m18373I(null, true);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ Object m18393c0(User user) {
        return m18373I(null, false);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ Object m18396f0(User user) {
        return m18383S();
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ Object m18397g0(User user) {
        return m18379O();
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ Object m18398h0(User user) {
        return m18378N();
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ Object m18399i0(User user) {
        return m18381Q();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ Object m18400j0(User user) {
        return m18380P();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ Object m18401k0(User user) {
        return this.f16791a.get();
    }
}
