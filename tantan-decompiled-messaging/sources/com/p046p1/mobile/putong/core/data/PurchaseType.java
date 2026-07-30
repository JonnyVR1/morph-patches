package com.p046p1.mobile.putong.core.data;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import java.util.ArrayList;
import p149l.ura;
import p149l.vwb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public abstract class PurchaseType {
    private static final /* synthetic */ PurchaseType[] $VALUES = $values();
    public static final PurchaseType TYPE_COMPLIMENT;
    public static final PurchaseType TYPE_FEMALE_VIP;
    public static final PurchaseType TYPE_GET_ACCELERATE_PAIRING;
    public static final PurchaseType TYPE_GET_BOOST;
    public static final PurchaseType TYPE_GET_COIN;
    public static final PurchaseType TYPE_GET_LETTER;
    public static final PurchaseType TYPE_GET_LETTER_INTL;
    public static final PurchaseType TYPE_GET_LIKERS;
    public static final PurchaseType TYPE_GET_NON_LIVE_COIN;
    public static final PurchaseType TYPE_GET_ONLINE_MATCH_TICKETS;
    public static final PurchaseType TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA;
    public static final PurchaseType TYPE_GET_PRIVILEGE_PACKAGE;
    public static final PurchaseType TYPE_GET_SEE_LETTER_INTL;
    public static final PurchaseType TYPE_GET_VIP;
    public static final PurchaseType TYPE_GET_VIP_SUPERLIKE;
    public static final PurchaseType TYPE_GET_VOICE_ONLINE_MATCH_TICKETS_EXTRA;
    public static final PurchaseType TYPE_INSTANT_CHAT;
    public static final PurchaseType TYPE_INTL_DIAMOND;
    public static final PurchaseType TYPE_INTL_READ_MESSAGE;
    public static final PurchaseType TYPE_INTL_TTT_COIN;
    public static final PurchaseType TYPE_INTL_TTT_LIVE_COIN;
    public static final PurchaseType TYPE_LIKENOLIMIT_PKG;
    public static final PurchaseType TYPE_LIMITED_TRIAL_SEE;
    public static final PurchaseType TYPE_MOMENT_COIN;
    public static final PurchaseType TYPE_NONE;
    public static final PurchaseType TYPE_O_DIAMOND;
    public static final PurchaseType TYPE_O_DIAMOND_PRIVATE_CUSTOM;
    public static final PurchaseType TYPE_O_PLATINUM;
    public static final PurchaseType TYPE_PICKS;
    public static final PurchaseType TYPE_PICKS_MEMBERSHIP;
    public static final PurchaseType TYPE_PRIVATE_CUSTOM;
    public static final PurchaseType TYPE_ROAMING_PKG;
    public static final PurchaseType TYPE_SAY_HI_PKG;
    public static final PurchaseType TYPE_SPOTLIGHT;
    public static final PurchaseType TYPE_SUPERLIKE_PKG;
    public static final PurchaseType TYPE_SUPREME_PARTNER;
    public static final PurchaseType TYPE_SVIP_PICKS_MEMBERSHIP;
    public static final PurchaseType TYPE_TTC_BOOST;
    public static final PurchaseType TYPE_ULTRA_PREMIUM;
    public static final PurchaseType TYPE_UNDO_PKG;
    public static final PurchaseType TYPE_YOUTH_VIP;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$1 */
    public final enum C70811 extends PurchaseType {
        private C70811(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.superboost);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$10 */
    public final enum C708210 extends PurchaseType {
        private C708210(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            return vwb.m200324f0(Privilege.online_match_tickets_extra);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("voiceQuickchatNum");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$11 */
    public final enum C708311 extends PurchaseType {
        private C708311(String str, int i) {
            super(str, i);
        }

        private Privilege getGreetPrivilege() {
            return isRevGreet() ? Privilege.greet : Privilege.letter;
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            Privilege privilege;
            if (!ura.m195053e().m195057d().mo33841h5()) {
                return new ArrayList<>();
            }
            Privilege privilege2 = Privilege.see_who_likes_me;
            Privilege privilege3 = Privilege.vip_unlimited_likes;
            Privilege privilege4 = Privilege.online_match_tickets;
            Privilege privilege5 = Privilege.voice_quick_chat;
            Privilege greetPrivilege = getGreetPrivilege();
            Privilege privilege6 = Privilege.vip_super_like;
            Privilege privilege7 = Privilege.liked_user;
            Privilege privilege8 = Privilege.boost;
            Privilege privilege9 = Privilege.advanced_filter;
            Privilege privilege10 = Privilege.message_read_state;
            Privilege privilege11 = Privilege.privacy_membership;
            Privilege privilege12 = Privilege.recover_unmatches;
            Privilege privilege13 = Privilege.vip_undo;
            Privilege privilege14 = privilege4;
            Privilege privilege15 = Privilege.vip_location;
            Privilege privilege16 = Privilege.svip_badge;
            ArrayList<Privilege> arrayListM200324f0 = vwb.m200324f0(privilege2, privilege3, privilege14, privilege5, greetPrivilege, privilege6, privilege7, privilege8, privilege9, privilege10, privilege11, privilege12, privilege13, privilege15, privilege16);
            if (CoreModule.m29934N().mo60329Vo()) {
                arrayListM200324f0.add(10, Privilege.moment_boost);
            }
            if (ura.m195053e().m195057d().mo33959z1() && CoreModule.f17545c.f19639e0.m169520na().isFemale()) {
                arrayListM200324f0 = vwb.m200324f0(privilege, privilege11, privilege9, privilege13, privilege10, privilege15, privilege8, privilege7, privilege12, privilege16, getGreetPrivilege(), privilege3, privilege6, privilege14, privilege5);
                if (CoreModule.m29934N().mo60329Vo()) {
                    privilege = privilege2;
                    privilege14 = privilege14;
                    arrayListM200324f0.add(5, Privilege.moment_boost);
                }
            } else {
                privilege = privilege2;
            }
            privilege = privilege2;
            privilege14 = privilege14;
            if (CoreModule.m29935P().m94656g().mo35004D9()) {
                arrayListM200324f0.add(arrayListM200324f0.indexOf(privilege) + 1, Privilege.nearby_people);
            }
            if (ura.m195053e().m195057d().mo33924t9()) {
                arrayListM200324f0.remove(privilege10);
            }
            if (CoreModule.m29935P().m94656g().mo35084xj()) {
                arrayListM200324f0.add(arrayListM200324f0.indexOf(privilege) + 1, Privilege.hide_me_from_nearby);
            }
            if (CoreModule.m29935P().m94656g().mo35054d9()) {
                arrayListM200324f0.add(arrayListM200324f0.indexOf(privilege14) + 1, Privilege.unlock_learn_about_him_module);
            }
            return arrayListM200324f0;
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeDataForGP(Gender gender) {
            if (!ura.m195053e().m195057d().mo33697Hg()) {
                return new ArrayList<>();
            }
            Privilege privilege = Privilege.premium_compliment;
            Privilege privilege2 = Privilege.intl_advanced_filter;
            Privilege privilege3 = Privilege.see_who_likes_me;
            Privilege privilege4 = Privilege.vip_unlimited_likes;
            Privilege privilege5 = Privilege.liked_user;
            ArrayList<Privilege> arrayListM200324f0 = vwb.m200324f0(privilege, privilege2, privilege3, privilege4, privilege5, Privilege.boost, Privilege.vip_super_like, Privilege.vip_undo, Privilege.intl_no_ad, Privilege.vip_membership_active_time_gp, Privilege.vip_membership_remark_gp, Privilege.vip_membership_search_gp, Privilege.vip_location, Privilege.vip_badge);
            if (IntlCountryCodeController.m28119o()) {
                arrayListM200324f0.add(Privilege.vip_message_block_gp);
            }
            Privilege privilege6 = Privilege.message_read_state;
            arrayListM200324f0.add(privilege6);
            if (ura.m195053e().m195057d().mo33854ir()) {
                arrayListM200324f0.add(1, Privilege.intl_visitor);
            }
            if (ura.m195053e().m195057d().mo33745R8()) {
                arrayListM200324f0.add(1, Privilege.loveBuzz);
                arrayListM200324f0.add(4, Privilege.picksMembership);
            } else {
                arrayListM200324f0.add(3, Privilege.picksMembership);
            }
            if (ura.m195053e().m195057d().mo33747Rk() && arrayListM200324f0.contains(privilege5)) {
                int iIndexOf = arrayListM200324f0.indexOf(privilege5);
                arrayListM200324f0.remove(privilege5);
                if (iIndexOf == -1) {
                    iIndexOf = 2;
                }
                arrayListM200324f0.add(iIndexOf, Privilege.svip_greet);
            }
            if (ura.m195053e().m195057d().mo33924t9()) {
                arrayListM200324f0.remove(privilege6);
            }
            if (ura.m195053e().m195057d().mo33683F6()) {
                arrayListM200324f0.add(0, Privilege.tribe);
            }
            return arrayListM200324f0;
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ura.m195053e().m195057d().mo33697Hg() ? ProductCategory.get(ProductCategory.tttSvipGoogleplay) : ProductCategory.get("svip");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$12 */
    public final enum C708412 extends PurchaseType {
        private C708412(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("letter");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$13 */
    public final enum C708513 extends PurchaseType {
        private C708513(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("letter");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$14 */
    public final enum C708614 extends PurchaseType {
        private C708614(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("letter");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$15 */
    public final enum C708715 extends PurchaseType {
        private C708715(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            return vwb.m200324f0(Privilege.picks);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("picks");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$16 */
    public final enum C708816 extends PurchaseType {
        private C708816(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            return vwb.m200324f0(Privilege.picksMembership);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("picksMembership");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$17 */
    public final enum C708917 extends PurchaseType {
        private C708917(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            return vwb.m200324f0(Privilege.svipPicksMembership, Privilege.picksMembership);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("svipPicksMembership");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$18 */
    public final enum C709018 extends PurchaseType {
        private C709018(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("intlReadMessage");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$19 */
    public final enum C709119 extends PurchaseType {
        private C709119(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            ArrayList<Privilege> arrayList = new ArrayList<>();
            arrayList.add(Privilege.immediately_match);
            arrayList.add(Privilege.oDiamondSvipSkin);
            arrayList.add(Privilege.oDiamondVisitor);
            if (ura.m195053e().m195057d().mo33812d4()) {
                arrayList.add(Privilege.visitor_hide_footprint);
            }
            arrayList.add(Privilege.customer_service);
            arrayList.add(Privilege.boost);
            if (CoreModule.m29935P().m94656g().mo35004D9()) {
                arrayList.add(Privilege.nearby_people);
            }
            arrayList.add(Privilege.vip_super_like);
            arrayList.add(Privilege.online_match_tickets);
            arrayList.add(Privilege.voice_quick_chat);
            arrayList.add(Privilege.oDiamondGreetings);
            arrayList.add(Privilege.live_entry_animation);
            if (CoreModule.m29934N().mo60329Vo()) {
                arrayList.add(Privilege.moment_boost);
            }
            arrayList.addAll(PurchaseType.TYPE_PICKS_MEMBERSHIP.getPrivilegeData(gender));
            arrayList.add(Privilege.oDiamondSvipExtra);
            return arrayList;
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("oDiamond");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$2 */
    public final enum C70922 extends PurchaseType {
        private C70922(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            ArrayList<Privilege> arrayListM200324f0;
            if (ura.m195053e().m195057d().mo33841h5()) {
                arrayListM200324f0 = CoreModule.m29935P().m94656g().mo35023Pc() ? vwb.m200324f0(Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_location, Privilege.message_read_state, Privilege.greet, Privilege.recover_unmatches, Privilege.vip_badge) : vwb.m200324f0(Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_location, Privilege.vip_badge);
            } else {
                arrayListM200324f0 = vwb.m200324f0(Privilege.vip_badge, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_location, Privilege.vip_unlimited_likes);
            }
            if (ura.m195053e().m195057d().mo33924t9()) {
                arrayListM200324f0.remove(Privilege.message_read_state);
            }
            return arrayListM200324f0;
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeDataForGP(Gender gender) {
            ArrayList<Privilege> arrayListM200324f0 = ura.m195053e().m195057d().mo33672Df(CoreModule.f17545c.f19639e0.m169527p9()) ? vwb.m200324f0(Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_membership_active_time_gp, Privilege.vip_membership_remark_gp, Privilege.vip_membership_search_gp, Privilege.vip_location, Privilege.vip_badge, Privilege.vip_message_block_gp) : vwb.m200324f0(Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_membership_active_time_gp, Privilege.vip_membership_remark_gp, Privilege.vip_membership_search_gp, Privilege.vip_location, Privilege.vip_badge);
            if (!IntlCountryCodeController.m28115k()) {
                arrayListM200324f0.add(4, Privilege.intl_no_ad);
            }
            if (ura.m195053e().m195057d().mo33734Oi()) {
                arrayListM200324f0.remove(Privilege.vip_super_like);
            }
            return arrayListM200324f0;
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.tttVip);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$20 */
    public final enum C709320 extends PurchaseType {
        private C709320(String str, int i) {
            super(str, i);
        }

        private Privilege getGreetPrivilege() {
            return isRevGreet() ? Privilege.greet : Privilege.letter;
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            ArrayList<Privilege> arrayList = new ArrayList<>();
            if (!CoreModule.m29935P().m94656g().mo35085xn()) {
                arrayList.add(Privilege.top_like);
            }
            if (CoreModule.m29935P().m94656g().mo35085xn()) {
                arrayList.add(Privilege.confession_first);
            }
            if (CoreModule.m29935P().m94656g().mo35078v9()) {
                arrayList.add(Privilege.accelerate_pairing);
            }
            arrayList.add(Privilege.top_chat);
            arrayList.add(Privilege.see_who_likes_me);
            if (CoreModule.m29935P().m94656g().mo35017Ki()) {
                arrayList.add(Privilege.nearby_people);
            }
            arrayList.add(Privilege.vip_unlimited_likes);
            arrayList.add(Privilege.online_match_tickets);
            arrayList.add(Privilege.voice_quick_chat);
            arrayList.add(Privilege.say_hi_pkg);
            arrayList.add(getGreetPrivilege());
            arrayList.add(Privilege.vip_super_like);
            arrayList.add(Privilege.liked_user);
            arrayList.add(Privilege.boost);
            arrayList.add(Privilege.advanced_filter);
            Privilege privilege = Privilege.message_read_state;
            arrayList.add(privilege);
            arrayList.add(Privilege.privacy_membership);
            arrayList.add(Privilege.recover_unmatches);
            arrayList.add(Privilege.vip_undo);
            arrayList.add(Privilege.vip_location);
            arrayList.add(Privilege.svip_badge);
            if (ura.m195053e().m195057d().mo33924t9()) {
                arrayList.remove(privilege);
            }
            return arrayList;
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("platinum");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$21 */
    public final enum C709421 extends PurchaseType {
        private C709421(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            ArrayList<Privilege> arrayList = new ArrayList<>();
            arrayList.add(Privilege.city_topping);
            arrayList.add(Privilege.personal_customization);
            arrayList.add(Privilege.mysterious_mode);
            arrayList.add(Privilege.immediately_match);
            arrayList.add(Privilege.nearby_people);
            arrayList.add(Privilege.exclusive_dressing_up);
            arrayList.add(Privilege.customer_service);
            arrayList.addAll(PurchaseType.TYPE_PICKS_MEMBERSHIP.getPrivilegeData(gender));
            arrayList.add(Privilege.vip_super_like);
            arrayList.add(Privilege.online_match_tickets);
            arrayList.add(Privilege.oDiamondSvipExtra);
            return arrayList;
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("unknown_");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$22 */
    public final enum C709522 extends PurchaseType {
        private C709522(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            return vwb.m200324f0(Privilege.superlike_pkg);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("superLikeMembership");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$23 */
    public final enum C709623 extends PurchaseType {
        private C709623(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            return vwb.m200324f0(Privilege.undo_pkg);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("undoMembership");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$24 */
    public final enum C709724 extends PurchaseType {
        private C709724(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            return vwb.m200324f0(Privilege.roaming_pkg);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("roaming");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$25 */
    public final enum C709825 extends PurchaseType {
        private C709825(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            return vwb.m200324f0(Privilege.likeNoLimit_pkg);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("unlimitedSwipes");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$26 */
    public final enum C709926 extends PurchaseType {
        private C709926(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.sayHiPkg);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$27 */
    public final enum C710027 extends PurchaseType {
        private C710027(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.momentCoin);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$28 */
    public final enum C710128 extends PurchaseType {
        private C710128(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            return vwb.m200324f0(Privilege.accelerate_pairing);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("acceleratePairing");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$29 */
    public final enum C710229 extends PurchaseType {
        private C710229(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            ArrayList<Privilege> arrayList = new ArrayList<>();
            arrayList.add(Privilege.pick_tantan_credits_users);
            arrayList.add(Privilege.unlock_learn_about_him_module);
            arrayList.add(Privilege.privacy_membership);
            arrayList.add(Privilege.ads_not_disturb);
            arrayList.add(Privilege.block_harassing_words);
            return arrayList;
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("femaleVip");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$3 */
    public final enum C71033 extends PurchaseType {
        private C71033(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            return vwb.m200324f0(Privilege.vip_independent_super_like);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("superLike");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$30 */
    public final enum C710430 extends PurchaseType {
        private C710430(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            ArrayList<Privilege> arrayList = new ArrayList<>();
            arrayList.add(Privilege.youth_roaming);
            arrayList.add(Privilege.youth_find_partner);
            arrayList.add(Privilege.youth_blind_box);
            arrayList.add(Privilege.youth_superlike);
            Privilege privilege = Privilege.youth_message_read;
            arrayList.add(privilege);
            if (ura.m195053e().m195057d().mo33924t9()) {
                arrayList.remove(privilege);
            }
            return arrayList;
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("youthVip");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$31 */
    public final enum C710531 extends PurchaseType {
        private C710531(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            ArrayList<Privilege> arrayList = new ArrayList<>();
            arrayList.add(Privilege.private_custom);
            arrayList.addAll(PurchaseType.TYPE_O_DIAMOND.getPrivilegeData(gender));
            return arrayList;
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.oDiamondPrivateCustom);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$32 */
    public final enum C710632 extends PurchaseType {
        private C710632(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            ArrayList<Privilege> arrayList = new ArrayList<>();
            arrayList.add(Privilege.private_custom);
            return arrayList;
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("privateCustom");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$33 */
    public final enum C710733 extends PurchaseType {
        private C710733(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            ArrayList<Privilege> arrayList = new ArrayList<>();
            arrayList.add(Privilege.immediately_match);
            arrayList.add(Privilege.full_boost);
            arrayList.add(Privilege.unlimit_free_super_like);
            arrayList.add(Privilege.ultra_premium_badge);
            arrayList.addAll(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeData(gender));
            return arrayList;
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.tttUltraPremium);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$34 */
    public final enum C710834 extends PurchaseType {
        private C710834(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            ArrayList<Privilege> arrayList = new ArrayList<>();
            arrayList.add(Privilege.limited_trial_see);
            return arrayList;
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("limitedTrialSee");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$35 */
    public final enum C710935 extends PurchaseType {
        private C710935(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            ArrayList<Privilege> arrayList = new ArrayList<>();
            arrayList.add(Privilege.immediately_match);
            return arrayList;
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.tttInstantChat);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$36 */
    public final enum C711036 extends PurchaseType {
        private C711036(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$37 */
    public final enum C711137 extends PurchaseType {
        private C711137(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.tttDiamond);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$38 */
    public final enum C711238 extends PurchaseType {
        private C711238(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.tttCoin);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$39 */
    public final enum C711339 extends PurchaseType {
        private C711339(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.tttLiveCoin);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$4 */
    public final enum C71144 extends PurchaseType {
        private C71144(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            ArrayList<Privilege> arrayListM200324f0 = vwb.m200324f0(Privilege.see_who_likes_me);
            if (!ura.m195053e().m195057d().mo33659B8().get().isEmpty()) {
                arrayListM200324f0.add(0, Privilege.see_chat_request_gp);
            }
            if (ura.m195053e().m195057d().mo33658B()) {
                arrayListM200324f0.add(Privilege.see_letter_gp);
            }
            return arrayListM200324f0;
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.tttSeeWhoLikedMe);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$40 */
    public final enum C711540 extends PurchaseType {
        private C711540(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.tttBoost);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$41 */
    public final enum C711641 extends PurchaseType {
        private C711641(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.tttCompliment);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$5 */
    public final enum C71175 extends PurchaseType {
        private C71175(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            return vwb.m200324f0(Privilege.boost);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("boost");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$6 */
    public final enum C71186 extends PurchaseType {
        private C71186(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            return vwb.m200324f0(Privilege.online_match_tickets);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("quickchatMembership");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$7 */
    public final enum C71197 extends PurchaseType {
        private C71197(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            return vwb.m200324f0(Privilege.online_match_tickets_extra);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("quickchatNumber");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$8 */
    public final enum C71208 extends PurchaseType {
        private C71208(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("coin");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$9 */
    public final enum C71219 extends PurchaseType {
        private C71219(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.noneLiveCoin);
        }
    }

    private static /* synthetic */ PurchaseType[] $values() {
        return new PurchaseType[]{TYPE_SPOTLIGHT, TYPE_GET_VIP, TYPE_GET_VIP_SUPERLIKE, TYPE_GET_LIKERS, TYPE_GET_BOOST, TYPE_GET_ONLINE_MATCH_TICKETS, TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA, TYPE_GET_COIN, TYPE_GET_NON_LIVE_COIN, TYPE_GET_VOICE_ONLINE_MATCH_TICKETS_EXTRA, TYPE_GET_PRIVILEGE_PACKAGE, TYPE_GET_LETTER, TYPE_GET_LETTER_INTL, TYPE_GET_SEE_LETTER_INTL, TYPE_PICKS, TYPE_PICKS_MEMBERSHIP, TYPE_SVIP_PICKS_MEMBERSHIP, TYPE_INTL_READ_MESSAGE, TYPE_O_DIAMOND, TYPE_O_PLATINUM, TYPE_SUPREME_PARTNER, TYPE_SUPERLIKE_PKG, TYPE_UNDO_PKG, TYPE_ROAMING_PKG, TYPE_LIKENOLIMIT_PKG, TYPE_SAY_HI_PKG, TYPE_MOMENT_COIN, TYPE_GET_ACCELERATE_PAIRING, TYPE_FEMALE_VIP, TYPE_YOUTH_VIP, TYPE_O_DIAMOND_PRIVATE_CUSTOM, TYPE_PRIVATE_CUSTOM, TYPE_ULTRA_PREMIUM, TYPE_LIMITED_TRIAL_SEE, TYPE_INSTANT_CHAT, TYPE_NONE, TYPE_INTL_DIAMOND, TYPE_INTL_TTT_COIN, TYPE_INTL_TTT_LIVE_COIN, TYPE_TTC_BOOST, TYPE_COMPLIMENT};
    }

    static {
        TYPE_SPOTLIGHT = new C70811("TYPE_SPOTLIGHT", 0);
        TYPE_GET_VIP = new C70922("TYPE_GET_VIP", 1);
        TYPE_GET_VIP_SUPERLIKE = new C71033("TYPE_GET_VIP_SUPERLIKE", 2);
        TYPE_GET_LIKERS = new C71144("TYPE_GET_LIKERS", 3);
        TYPE_GET_BOOST = new C71175("TYPE_GET_BOOST", 4);
        TYPE_GET_ONLINE_MATCH_TICKETS = new C71186("TYPE_GET_ONLINE_MATCH_TICKETS", 5);
        TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA = new C71197("TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA", 6);
        TYPE_GET_COIN = new C71208("TYPE_GET_COIN", 7);
        TYPE_GET_NON_LIVE_COIN = new C71219("TYPE_GET_NON_LIVE_COIN", 8);
        TYPE_GET_VOICE_ONLINE_MATCH_TICKETS_EXTRA = new C708210("TYPE_GET_VOICE_ONLINE_MATCH_TICKETS_EXTRA", 9);
        TYPE_GET_PRIVILEGE_PACKAGE = new C708311("TYPE_GET_PRIVILEGE_PACKAGE", 10);
        TYPE_GET_LETTER = new C708412("TYPE_GET_LETTER", 11);
        TYPE_GET_LETTER_INTL = new C708513("TYPE_GET_LETTER_INTL", 12);
        TYPE_GET_SEE_LETTER_INTL = new C708614("TYPE_GET_SEE_LETTER_INTL", 13);
        TYPE_PICKS = new C708715("TYPE_PICKS", 14);
        TYPE_PICKS_MEMBERSHIP = new C708816("TYPE_PICKS_MEMBERSHIP", 15);
        TYPE_SVIP_PICKS_MEMBERSHIP = new C708917("TYPE_SVIP_PICKS_MEMBERSHIP", 16);
        TYPE_INTL_READ_MESSAGE = new C709018("TYPE_INTL_READ_MESSAGE", 17);
        TYPE_O_DIAMOND = new C709119("TYPE_O_DIAMOND", 18);
        TYPE_O_PLATINUM = new C709320("TYPE_O_PLATINUM", 19);
        TYPE_SUPREME_PARTNER = new C709421("TYPE_SUPREME_PARTNER", 20);
        TYPE_SUPERLIKE_PKG = new C709522("TYPE_SUPERLIKE_PKG", 21);
        TYPE_UNDO_PKG = new C709623("TYPE_UNDO_PKG", 22);
        TYPE_ROAMING_PKG = new C709724("TYPE_ROAMING_PKG", 23);
        TYPE_LIKENOLIMIT_PKG = new C709825("TYPE_LIKENOLIMIT_PKG", 24);
        TYPE_SAY_HI_PKG = new C709926("TYPE_SAY_HI_PKG", 25);
        TYPE_MOMENT_COIN = new C710027("TYPE_MOMENT_COIN", 26);
        TYPE_GET_ACCELERATE_PAIRING = new C710128("TYPE_GET_ACCELERATE_PAIRING", 27);
        TYPE_FEMALE_VIP = new C710229("TYPE_FEMALE_VIP", 28);
        TYPE_YOUTH_VIP = new C710430("TYPE_YOUTH_VIP", 29);
        TYPE_O_DIAMOND_PRIVATE_CUSTOM = new C710531("TYPE_O_DIAMOND_PRIVATE_CUSTOM", 30);
        TYPE_PRIVATE_CUSTOM = new C710632("TYPE_PRIVATE_CUSTOM", 31);
        TYPE_ULTRA_PREMIUM = new C710733("TYPE_ULTRA_PREMIUM", 32);
        TYPE_LIMITED_TRIAL_SEE = new C710834("TYPE_LIMITED_TRIAL_SEE", 33);
        TYPE_INSTANT_CHAT = new C710935("TYPE_INSTANT_CHAT", 34);
        TYPE_NONE = new C711036("TYPE_NONE", 35);
        TYPE_INTL_DIAMOND = new C711137("TYPE_INTL_DIAMOND", 36);
        TYPE_INTL_TTT_COIN = new C711238("TYPE_INTL_TTT_COIN", 37);
        TYPE_INTL_TTT_LIVE_COIN = new C711339("TYPE_INTL_TTT_LIVE_COIN", 38);
        TYPE_TTC_BOOST = new C711540("TYPE_TTC_BOOST", 39);
        TYPE_COMPLIMENT = new C711641("TYPE_COMPLIMENT", 40);
    }

    public static PurchaseType valueOf(String str) {
        return (PurchaseType) Enum.valueOf(PurchaseType.class, str);
    }

    public static PurchaseType[] values() {
        return (PurchaseType[]) $VALUES.clone();
    }

    public ArrayList<Privilege> getPrivilegeData(Gender gender) {
        return vwb.m200324f0(null);
    }

    public ArrayList<Privilege> getPrivilegeDataForGP(Gender gender) {
        return getPrivilegeData(gender);
    }

    public boolean isRevGreet() {
        return CoreModule.m29934N().mo60267Co();
    }

    public abstract ProductCategory productCategory();

    private PurchaseType(String str, int i) {
        super(str, i);
    }
}
