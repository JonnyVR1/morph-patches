package p153l;

import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.RankLevel;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.SeeTextDynamicParam;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class skk0 implements dxv.InterfaceC16648c {

    /* JADX INFO: renamed from: a */
    public wyd0 f169295a = new wyd0("history_avatar", "");

    /* JADX INFO: renamed from: b */
    public String f169296b;

    /* JADX INFO: renamed from: c */
    public User f169297c;

    /* JADX INFO: renamed from: d */
    public User f169298d;

    /* JADX INFO: renamed from: e */
    public User f169299e;

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ Object m186459F() {
        List<User> list = CoreModule.f18264c.f20429u0.m31479t5().f20014d;
        if (jyb.m147479J(list)) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m186467h(User user) {
        if (CoreModule.f18264c.f20429u0.m31479t5() == null) {
            return "0";
        }
        int i = CoreModule.f18264c.f20429u0.m31479t5().f20012b;
        return i > 98 ? "99+" : String.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ Object m186472l0() {
        if (NullChecker.m82486a(this.f169296b)) {
            return CoreModule.f18264c.f20381e0.m116503Pa(this.f169296b);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ Object m186474m0() {
        return this.f169297c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ Object m186476n0() {
        return this.f169298d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object m186478o0() {
        return this.f169299e;
    }

    /* JADX INFO: renamed from: I */
    public final String m186490I(Settings settings, boolean z) {
        if (settings != null) {
            String string = settings.getLookingFor().toString();
            string.getClass();
            if (string.equals("female")) {
                return m186492K(Gender.get("female"), z);
            }
            if (string.equals("male")) {
                return m186492K(Gender.get("male"), z);
            }
        }
        return m186492K(CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? Gender.get("male") : Gender.get("female"), z);
    }

    /* JADX INFO: renamed from: J */
    public final String m186491J(Settings settings, boolean z, boolean z2) {
        if (settings != null) {
            String string = settings.getLookingFor().toString();
            string.getClass();
            if (string.equals("female")) {
                return m186493L(Gender.get("female"), z, z2);
            }
            if (string.equals("male")) {
                return m186493L(Gender.get("male"), z, z2);
            }
        }
        return m186493L(CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? Gender.get("male") : Gender.get("female"), z, z2);
    }

    /* JADX INFO: renamed from: K */
    public final String m186492K(Gender gender, boolean z) {
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
    public final String m186493L(Gender gender, boolean z, boolean z2) {
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
    public final String m186512e0(User user) {
        pf60<Boolean, Boolean> pf60VarM32616l4 = CoreModule.f18264c.f20294B0.m32616l4();
        if (pf60VarM32616l4.f152156a.booleanValue() && pf60VarM32616l4.f152157b.booleanValue()) {
            return user.isFemale() ? "完成真实头像和真人实名认证后，你可以设置优先推荐认证用户，更快遇见优质、靠谱的人" : "完成真实头像和真人实名认证后，会显著提升你给对方的安全感，更有可能被右滑喔";
        }
        if (!pf60VarM32616l4.f152156a.booleanValue() && pf60VarM32616l4.f152157b.booleanValue()) {
            return user.isFemale() ? "你的真人实名认证还未完成，认证成功后你可以设置优先推荐认证用户，更快遇见优质、靠谱的人" : "你的真人实名认证还未完成，认证成功后会显著提升你给对方的安全感，更有可能被右滑喔";
        }
        if (!pf60VarM32616l4.f152156a.booleanValue() || pf60VarM32616l4.f152157b.booleanValue()) {
            return "";
        }
        return user.isFemale() ? "你的真人实名认证还未激活，激活后你可以设置优先推荐认证用户，更快遇见优质、靠谱的人" : "你的真人实名认证还未激活，激活后会显著提升你给对方的安全感，更有可能被右滑喔";
    }

    /* JADX INFO: renamed from: N */
    public String m186495N() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (userM116600p9.isIdCardVerified()) {
            return "verified";
        }
        return (NullChecker.m82486a(verificationCenterM32615k4) && NullChecker.m82486a(verificationCenterM32615k4.idCard)) ? verificationCenterM32615k4.idCard.status.toString() : "unknown_";
    }

    /* JADX INFO: renamed from: O */
    public String m186496O() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (userM116600p9.isPicVerificationVerified()) {
            return "verified";
        }
        return (NullChecker.m82486a(verificationCenterM32615k4) && NullChecker.m82486a(verificationCenterM32615k4.picVerificationInfo)) ? verificationCenterM32615k4.picVerificationInfo.status.toString() : "unknown_";
    }

    /* JADX INFO: renamed from: P */
    public final Object m186497P() {
        return CoreModule.f18264c.f20294B0.m32616l4().f152156a.booleanValue() ? "《真实头像认证协议》" : "《真人实名认证协议》";
    }

    /* JADX INFO: renamed from: Q */
    public final Object m186498Q() {
        return CoreModule.f18264c.f20294B0.m32616l4().f152156a.booleanValue() ? "我同意腾讯、阿里、陌陌将采集我的面部信息并与头像比对，详见" : "我已阅读并同意，真人实名认证需要输入我的姓名和身份证号，并通过供应商腾讯、阿里和陌陌采集我的面部信息，来确保头像、身份证都是我本人，每个身份证只能认证一个探探账号，详见";
    }

    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final String m186511d0(User user) {
        return TEnum.equals(user.gender, "female") ? "怎么更快遇见靠谱的另一半？" : "怎样获得更多配对？";
    }

    /* JADX INFO: renamed from: S */
    public String m186500S() {
        return CoreModule.f18264c.f20294B0.m32616l4().f152156a.booleanValue() ? "avatar_verification" : "id_verification";
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ Object m186501T(User user) {
        return m186493L(user.gender, true, false);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ Object m186502U(User user) {
        return m186491J(user.settings, true, false);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ Object m186503V(User user) {
        return m186491J(user.settings, false, false);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ Object m186504W(User user) {
        return m186490I(user.settings, true);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ Object m186505X(User user) {
        return m186490I(user.settings, false);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Object m186506Y(User user) {
        return m186491J(user.settings, true, true);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object m186507Z(User user) {
        return m186491J(null, true, false);
    }

    @Override // p153l.dxv.InterfaceC16648c
    /* JADX INFO: renamed from: a */
    public void mo110417a(Map<String, dxv.InterfaceC16647b<Object>> map) {
        map.put("me", new dxv.InterfaceC16647b() { // from class: l.ekk0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return CoreModule.f18264c.f20381e0.m116600p9();
            }
        });
        map.put("swipe_user", new dxv.InterfaceC16647b() { // from class: l.fkk0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return this.f99522a.m186472l0();
            }
        });
        map.put("first_liker", new dxv.InterfaceC16647b() { // from class: l.gkk0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return skk0.m186459F();
            }
        });
        map.put("like_me_profile", new dxv.InterfaceC16647b() { // from class: l.hkk0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return this.f110439a.m186474m0();
            }
        });
        map.put("nearby_comment_me_profile", new dxv.InterfaceC16647b() { // from class: l.jkk0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return this.f121423a.m186476n0();
            }
        });
        map.put("nearby_user_profile", new dxv.InterfaceC16647b() { // from class: l.kkk0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return this.f127211a.m186478o0();
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ Object m186508a0(User user) {
        return m186491J(null, false, false);
    }

    @Override // p153l.dxv.InterfaceC16648c
    /* JADX INFO: renamed from: b */
    public void mo110418b(Map<String, dxv.InterfaceC16646a<Object>> map) {
        map.put("receiveLikes", new dxv.InterfaceC16646a() { // from class: l.mjk0
            @Override // p153l.dxv.InterfaceC16646a
            /* JADX INFO: renamed from: a */
            public final Object mo98573a(User user) {
                return user.profile.receivedLikes;
            }
        });
        map.put("see_total_num", new dxv.InterfaceC16646a() { // from class: l.ojk0
            @Override // p153l.dxv.InterfaceC16646a
            /* JADX INFO: renamed from: a */
            public final Object mo98573a(User user) {
                return skk0.m186467h(user);
            }
        });
        map.put("history_avatar", new dxv.InterfaceC16646a() { // from class: l.vjk0
            @Override // p153l.dxv.InterfaceC16646a
            /* JADX INFO: renamed from: a */
            public final Object mo98573a(User user) {
                return this.f184405a.m186518k0(user);
            }
        });
        map.put(AuthenticationTokenClaims.JSON_KEY_NAME, new dxv.InterfaceC16646a() { // from class: l.wjk0
            @Override // p153l.dxv.InterfaceC16646a
            /* JADX INFO: renamed from: a */
            public final Object mo98573a(User user) {
                return user.name;
            }
        });
        map.put("gender", new dxv.InterfaceC16646a() { // from class: l.yjk0
            @Override // p153l.dxv.InterfaceC16646a
            /* JADX INFO: renamed from: a */
            public final Object mo98573a(User user) {
                return user.gender;
            }
        });
        map.put("gender_refer", new dxv.InterfaceC16646a() { // from class: l.zjk0
            @Override // p153l.dxv.InterfaceC16646a
            /* JADX INFO: renamed from: a */
            public final Object mo98573a(User user) {
                return this.f204675a.m186501T(user);
            }
        });
        map.put(SeeTextDynamicParam.age, new dxv.InterfaceC16646a() { // from class: l.akk0
            @Override // p153l.dxv.InterfaceC16646a
            /* JADX INFO: renamed from: a */
            public final Object mo98573a(User user) {
                return user.age;
            }
        });
        map.put(RankLevel.city, new dxv.InterfaceC16646a() { // from class: l.bkk0
            @Override // p153l.dxv.InterfaceC16646a
            /* JADX INFO: renamed from: a */
            public final Object mo98573a(User user) {
                return user.location.region.city;
            }
        });
        map.put("distance", new dxv.InterfaceC16646a() { // from class: l.ckk0
            @Override // p153l.dxv.InterfaceC16646a
            /* JADX INFO: renamed from: a */
            public final Object mo98573a(User user) {
                return Integer.valueOf(user.location.distance);
            }
        });
        map.put("avatar", new dxv.InterfaceC16646a() { // from class: l.dkk0
            @Override // p153l.dxv.InterfaceC16646a
            /* JADX INFO: renamed from: a */
            public final Object mo98573a(User user) {
                return user.picture(0).url;
            }
        });
        map.put("searching_gender_refer", new dxv.InterfaceC16646a() { // from class: l.xjk0
            @Override // p153l.dxv.InterfaceC16646a
            /* JADX INFO: renamed from: a */
            public final Object mo98573a(User user) {
                return this.f194585a.m186502U(user);
            }
        });
        map.put("searching_genders_refer", new dxv.InterfaceC16646a() { // from class: l.ikk0
            @Override // p153l.dxv.InterfaceC16646a
            /* JADX INFO: renamed from: a */
            public final Object mo98573a(User user) {
                return this.f115434a.m186503V(user);
            }
        });
        map.put("searching_gender_sex1", new dxv.InterfaceC16646a() { // from class: l.lkk0
            @Override // p153l.dxv.InterfaceC16646a
            /* JADX INFO: renamed from: a */
            public final Object mo98573a(User user) {
                return this.f132482a.m186504W(user);
            }
        });
        map.put("searching_gender_sex2", new dxv.InterfaceC16646a() { // from class: l.mkk0
            @Override // p153l.dxv.InterfaceC16646a
            /* JADX INFO: renamed from: a */
            public final Object mo98573a(User user) {
                return this.f137318a.m186505X(user);
            }
        });
        map.put("searching_gender_nickname", new dxv.InterfaceC16646a() { // from class: l.nkk0
            @Override // p153l.dxv.InterfaceC16646a
            /* JADX INFO: renamed from: a */
            public final Object mo98573a(User user) {
                return this.f142466a.m186506Y(user);
            }
        });
        map.put("opposite_gender", new dxv.InterfaceC16646a() { // from class: l.okk0
            @Override // p153l.dxv.InterfaceC16646a
            /* JADX INFO: renamed from: a */
            public final Object mo98573a(User user) {
                return this.f147761a.m186507Z(user);
            }
        });
        map.put("opposite_genders", new dxv.InterfaceC16646a() { // from class: l.pkk0
            @Override // p153l.dxv.InterfaceC16646a
            /* JADX INFO: renamed from: a */
            public final Object mo98573a(User user) {
                return this.f152847a.m186508a0(user);
            }
        });
        map.put("opposite_gender_sex1", new dxv.InterfaceC16646a() { // from class: l.qkk0
            @Override // p153l.dxv.InterfaceC16646a
            /* JADX INFO: renamed from: a */
            public final Object mo98573a(User user) {
                return this.f158145a.m186509b0(user);
            }
        });
        map.put("opposite_gender_sex2", new dxv.InterfaceC16646a() { // from class: l.rkk0
            @Override // p153l.dxv.InterfaceC16646a
            /* JADX INFO: renamed from: a */
            public final Object mo98573a(User user) {
                return this.f163628a.m186510c0(user);
            }
        });
        map.put("verification_title", new dxv.InterfaceC16646a() { // from class: l.njk0
            @Override // p153l.dxv.InterfaceC16646a
            /* JADX INFO: renamed from: a */
            public final Object mo98573a(User user) {
                return this.f142303a.m186511d0(user);
            }
        });
        map.put("verification_content", new dxv.InterfaceC16646a() { // from class: l.pjk0
            @Override // p153l.dxv.InterfaceC16646a
            /* JADX INFO: renamed from: a */
            public final Object mo98573a(User user) {
                return this.f152709a.m186512e0(user);
            }
        });
        map.put("verification_merge_type", new dxv.InterfaceC16646a() { // from class: l.qjk0
            @Override // p153l.dxv.InterfaceC16646a
            /* JADX INFO: renamed from: a */
            public final Object mo98573a(User user) {
                return this.f157995a.m186513f0(user);
            }
        });
        map.put("verification_avatar", new dxv.InterfaceC16646a() { // from class: l.rjk0
            @Override // p153l.dxv.InterfaceC16646a
            /* JADX INFO: renamed from: a */
            public final Object mo98573a(User user) {
                return this.f163463a.m186514g0(user);
            }
        });
        map.put("verification_id", new dxv.InterfaceC16646a() { // from class: l.sjk0
            @Override // p153l.dxv.InterfaceC16646a
            /* JADX INFO: renamed from: a */
            public final Object mo98573a(User user) {
                return this.f169026a.m186515h0(user);
            }
        });
        map.put("verification_protocol_prefix", new dxv.InterfaceC16646a() { // from class: l.tjk0
            @Override // p153l.dxv.InterfaceC16646a
            /* JADX INFO: renamed from: a */
            public final Object mo98573a(User user) {
                return this.f174594a.m186516i0(user);
            }
        });
        map.put("verification_protocol", new dxv.InterfaceC16646a() { // from class: l.ujk0
            @Override // p153l.dxv.InterfaceC16646a
            /* JADX INFO: renamed from: a */
            public final Object mo98573a(User user) {
                return this.f179222a.m186517j0(user);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ Object m186509b0(User user) {
        return m186490I(null, true);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ Object m186510c0(User user) {
        return m186490I(null, false);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ Object m186513f0(User user) {
        return m186500S();
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ Object m186514g0(User user) {
        return m186496O();
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ Object m186515h0(User user) {
        return m186495N();
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ Object m186516i0(User user) {
        return m186498Q();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ Object m186517j0(User user) {
        return m186497P();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ Object m186518k0(User user) {
        return this.f169295a.get();
    }
}
