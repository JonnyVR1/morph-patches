package com.p000p1.mobile.putong.core.data;

import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Gender;
import java.util.ArrayList;
import l.ura;
import l.vwb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
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
    public final enum C23131 extends PurchaseType {
        private C23131(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.superboost);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$10 */
    public final enum C231410 extends PurchaseType {
        private C231410(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            return vwb.f0(new Privilege[]{Privilege.online_match_tickets_extra});
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("voiceQuickchatNum");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$11 */
    public final enum C231511 extends PurchaseType {
        private C231511(String str, int i) {
            super(str, i);
        }

        private Privilege getGreetPrivilege() {
            return isRevGreet() ? Privilege.greet : Privilege.letter;
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            Privilege privilege;
            if (!ura.e().d().h5()) {
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
            ArrayList<Privilege> arrayListF0 = vwb.f0(new Privilege[]{privilege2, privilege3, privilege14, privilege5, greetPrivilege, privilege6, privilege7, privilege8, privilege9, privilege10, privilege11, privilege12, privilege13, privilege15, privilege16});
            if (CoreModule.N().Vo()) {
                arrayListF0.add(10, Privilege.moment_boost);
            }
            if (ura.e().d().z1() && CoreModule.c.e0.na().isFemale()) {
                arrayListF0 = vwb.f0(new Privilege[]{privilege, privilege11, privilege9, privilege13, privilege10, privilege15, privilege8, privilege7, privilege12, privilege16, getGreetPrivilege(), privilege3, privilege6, privilege14, privilege5});
                if (CoreModule.N().Vo()) {
                    privilege = privilege2;
                    privilege14 = privilege14;
                    arrayListF0.add(5, Privilege.moment_boost);
                }
            } else {
                privilege = privilege2;
            }
            privilege = privilege2;
            privilege14 = privilege14;
            if (CoreModule.P().g().D9()) {
                arrayListF0.add(arrayListF0.indexOf(privilege) + 1, Privilege.nearby_people);
            }
            if (ura.e().d().t9()) {
                arrayListF0.remove(privilege10);
            }
            if (CoreModule.P().g().xj()) {
                arrayListF0.add(arrayListF0.indexOf(privilege) + 1, Privilege.hide_me_from_nearby);
            }
            if (CoreModule.P().g().d9()) {
                arrayListF0.add(arrayListF0.indexOf(privilege14) + 1, Privilege.unlock_learn_about_him_module);
            }
            return arrayListF0;
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeDataForGP(Gender gender) {
            if (!ura.e().d().Hg()) {
                return new ArrayList<>();
            }
            Privilege privilege = Privilege.premium_compliment;
            Privilege privilege2 = Privilege.intl_advanced_filter;
            Privilege privilege3 = Privilege.see_who_likes_me;
            Privilege privilege4 = Privilege.vip_unlimited_likes;
            Privilege privilege5 = Privilege.liked_user;
            ArrayList<Privilege> arrayListF0 = vwb.f0(new Privilege[]{privilege, privilege2, privilege3, privilege4, privilege5, Privilege.boost, Privilege.vip_super_like, Privilege.vip_undo, Privilege.intl_no_ad, Privilege.vip_membership_active_time_gp, Privilege.vip_membership_remark_gp, Privilege.vip_membership_search_gp, Privilege.vip_location, Privilege.vip_badge});
            if (IntlCountryCodeController.o()) {
                arrayListF0.add(Privilege.vip_message_block_gp);
            }
            Privilege privilege6 = Privilege.message_read_state;
            arrayListF0.add(privilege6);
            if (ura.e().d().ir()) {
                arrayListF0.add(1, Privilege.intl_visitor);
            }
            if (ura.e().d().R8()) {
                arrayListF0.add(1, Privilege.loveBuzz);
                arrayListF0.add(4, Privilege.picksMembership);
            } else {
                arrayListF0.add(3, Privilege.picksMembership);
            }
            if (ura.e().d().Rk() && arrayListF0.contains(privilege5)) {
                int iIndexOf = arrayListF0.indexOf(privilege5);
                arrayListF0.remove(privilege5);
                if (iIndexOf == -1) {
                    iIndexOf = 2;
                }
                arrayListF0.add(iIndexOf, Privilege.svip_greet);
            }
            if (ura.e().d().t9()) {
                arrayListF0.remove(privilege6);
            }
            if (ura.e().d().F6()) {
                arrayListF0.add(0, Privilege.tribe);
            }
            return arrayListF0;
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ura.e().d().Hg() ? ProductCategory.get(ProductCategory.tttSvipGoogleplay) : ProductCategory.get("svip");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$12 */
    public final enum C231612 extends PurchaseType {
        private C231612(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("letter");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$13 */
    public final enum C231713 extends PurchaseType {
        private C231713(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("letter");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$14 */
    public final enum C231814 extends PurchaseType {
        private C231814(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("letter");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$15 */
    public final enum C231915 extends PurchaseType {
        private C231915(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            return vwb.f0(new Privilege[]{Privilege.picks});
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("picks");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$16 */
    public final enum C232016 extends PurchaseType {
        private C232016(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            return vwb.f0(new Privilege[]{Privilege.picksMembership});
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("picksMembership");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$17 */
    public final enum C232117 extends PurchaseType {
        private C232117(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            return vwb.f0(new Privilege[]{Privilege.svipPicksMembership, Privilege.picksMembership});
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("svipPicksMembership");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$18 */
    public final enum C232218 extends PurchaseType {
        private C232218(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("intlReadMessage");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$19 */
    public final enum C232319 extends PurchaseType {
        private C232319(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            ArrayList<Privilege> arrayList = new ArrayList<>();
            arrayList.add(Privilege.immediately_match);
            arrayList.add(Privilege.oDiamondSvipSkin);
            arrayList.add(Privilege.oDiamondVisitor);
            if (ura.e().d().d4()) {
                arrayList.add(Privilege.visitor_hide_footprint);
            }
            arrayList.add(Privilege.customer_service);
            arrayList.add(Privilege.boost);
            if (CoreModule.P().g().D9()) {
                arrayList.add(Privilege.nearby_people);
            }
            arrayList.add(Privilege.vip_super_like);
            arrayList.add(Privilege.online_match_tickets);
            arrayList.add(Privilege.voice_quick_chat);
            arrayList.add(Privilege.oDiamondGreetings);
            arrayList.add(Privilege.live_entry_animation);
            if (CoreModule.N().Vo()) {
                arrayList.add(Privilege.moment_boost);
            }
            arrayList.addAll(PurchaseType.TYPE_PICKS_MEMBERSHIP.getPrivilegeData(gender));
            arrayList.add(Privilege.oDiamondSvipExtra);
            return arrayList;
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("oDiamond");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$2 */
    public final enum C23242 extends PurchaseType {
        private C23242(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            ArrayList<Privilege> arrayListF0;
            if (ura.e().d().h5()) {
                arrayListF0 = CoreModule.P().g().Pc() ? vwb.f0(new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_location, Privilege.message_read_state, Privilege.greet, Privilege.recover_unmatches, Privilege.vip_badge}) : vwb.f0(new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_location, Privilege.vip_badge});
            } else {
                arrayListF0 = vwb.f0(new Privilege[]{Privilege.vip_badge, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_location, Privilege.vip_unlimited_likes});
            }
            if (ura.e().d().t9()) {
                arrayListF0.remove(Privilege.message_read_state);
            }
            return arrayListF0;
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeDataForGP(Gender gender) {
            ArrayList<Privilege> arrayListF0 = ura.e().d().Df(CoreModule.c.e0.p9()) ? vwb.f0(new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_membership_active_time_gp, Privilege.vip_membership_remark_gp, Privilege.vip_membership_search_gp, Privilege.vip_location, Privilege.vip_badge, Privilege.vip_message_block_gp}) : vwb.f0(new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_membership_active_time_gp, Privilege.vip_membership_remark_gp, Privilege.vip_membership_search_gp, Privilege.vip_location, Privilege.vip_badge});
            if (!IntlCountryCodeController.k()) {
                arrayListF0.add(4, Privilege.intl_no_ad);
            }
            if (ura.e().d().Oi()) {
                arrayListF0.remove(Privilege.vip_super_like);
            }
            return arrayListF0;
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.tttVip);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$20 */
    public final enum C232520 extends PurchaseType {
        private C232520(String str, int i) {
            super(str, i);
        }

        private Privilege getGreetPrivilege() {
            return isRevGreet() ? Privilege.greet : Privilege.letter;
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            ArrayList<Privilege> arrayList = new ArrayList<>();
            if (!CoreModule.P().g().xn()) {
                arrayList.add(Privilege.top_like);
            }
            if (CoreModule.P().g().xn()) {
                arrayList.add(Privilege.confession_first);
            }
            if (CoreModule.P().g().v9()) {
                arrayList.add(Privilege.accelerate_pairing);
            }
            arrayList.add(Privilege.top_chat);
            arrayList.add(Privilege.see_who_likes_me);
            if (CoreModule.P().g().Ki()) {
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
            if (ura.e().d().t9()) {
                arrayList.remove(privilege);
            }
            return arrayList;
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("platinum");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$21 */
    public final enum C232621 extends PurchaseType {
        private C232621(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
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

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("unknown_");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$22 */
    public final enum C232722 extends PurchaseType {
        private C232722(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            return vwb.f0(new Privilege[]{Privilege.superlike_pkg});
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("superLikeMembership");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$23 */
    public final enum C232823 extends PurchaseType {
        private C232823(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            return vwb.f0(new Privilege[]{Privilege.undo_pkg});
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("undoMembership");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$24 */
    public final enum C232924 extends PurchaseType {
        private C232924(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            return vwb.f0(new Privilege[]{Privilege.roaming_pkg});
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("roaming");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$25 */
    public final enum C233025 extends PurchaseType {
        private C233025(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            return vwb.f0(new Privilege[]{Privilege.likeNoLimit_pkg});
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("unlimitedSwipes");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$26 */
    public final enum C233126 extends PurchaseType {
        private C233126(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.sayHiPkg);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$27 */
    public final enum C233227 extends PurchaseType {
        private C233227(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.momentCoin);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$28 */
    public final enum C233328 extends PurchaseType {
        private C233328(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            return vwb.f0(new Privilege[]{Privilege.accelerate_pairing});
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("acceleratePairing");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$29 */
    public final enum C233429 extends PurchaseType {
        private C233429(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            ArrayList<Privilege> arrayList = new ArrayList<>();
            arrayList.add(Privilege.pick_tantan_credits_users);
            arrayList.add(Privilege.unlock_learn_about_him_module);
            arrayList.add(Privilege.privacy_membership);
            arrayList.add(Privilege.ads_not_disturb);
            arrayList.add(Privilege.block_harassing_words);
            return arrayList;
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("femaleVip");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$3 */
    public final enum C23353 extends PurchaseType {
        private C23353(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            return vwb.f0(new Privilege[]{Privilege.vip_independent_super_like});
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("superLike");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$30 */
    public final enum C233630 extends PurchaseType {
        private C233630(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            ArrayList<Privilege> arrayList = new ArrayList<>();
            arrayList.add(Privilege.youth_roaming);
            arrayList.add(Privilege.youth_find_partner);
            arrayList.add(Privilege.youth_blind_box);
            arrayList.add(Privilege.youth_superlike);
            Privilege privilege = Privilege.youth_message_read;
            arrayList.add(privilege);
            if (ura.e().d().t9()) {
                arrayList.remove(privilege);
            }
            return arrayList;
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("youthVip");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$31 */
    public final enum C233731 extends PurchaseType {
        private C233731(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            ArrayList<Privilege> arrayList = new ArrayList<>();
            arrayList.add(Privilege.private_custom);
            arrayList.addAll(PurchaseType.TYPE_O_DIAMOND.getPrivilegeData(gender));
            return arrayList;
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.oDiamondPrivateCustom);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$32 */
    public final enum C233832 extends PurchaseType {
        private C233832(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            ArrayList<Privilege> arrayList = new ArrayList<>();
            arrayList.add(Privilege.private_custom);
            return arrayList;
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("privateCustom");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$33 */
    public final enum C233933 extends PurchaseType {
        private C233933(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            ArrayList<Privilege> arrayList = new ArrayList<>();
            arrayList.add(Privilege.immediately_match);
            arrayList.add(Privilege.full_boost);
            arrayList.add(Privilege.unlimit_free_super_like);
            arrayList.add(Privilege.ultra_premium_badge);
            arrayList.addAll(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeData(gender));
            return arrayList;
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.tttUltraPremium);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$34 */
    public final enum C234034 extends PurchaseType {
        private C234034(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            ArrayList<Privilege> arrayList = new ArrayList<>();
            arrayList.add(Privilege.limited_trial_see);
            return arrayList;
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("limitedTrialSee");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$35 */
    public final enum C234135 extends PurchaseType {
        private C234135(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            ArrayList<Privilege> arrayList = new ArrayList<>();
            arrayList.add(Privilege.immediately_match);
            return arrayList;
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.tttInstantChat);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$36 */
    public final enum C234236 extends PurchaseType {
        private C234236(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$37 */
    public final enum C234337 extends PurchaseType {
        private C234337(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.tttDiamond);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$38 */
    public final enum C234438 extends PurchaseType {
        private C234438(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.tttCoin);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$39 */
    public final enum C234539 extends PurchaseType {
        private C234539(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.tttLiveCoin);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$4 */
    public final enum C23464 extends PurchaseType {
        private C23464(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            ArrayList<Privilege> arrayListF0 = vwb.f0(new Privilege[]{Privilege.see_who_likes_me});
            if (!((String) ura.e().d().B8().get()).isEmpty()) {
                arrayListF0.add(0, Privilege.see_chat_request_gp);
            }
            if (ura.e().d().B()) {
                arrayListF0.add(Privilege.see_letter_gp);
            }
            return arrayListF0;
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.tttSeeWhoLikedMe);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$40 */
    public final enum C234740 extends PurchaseType {
        private C234740(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.tttBoost);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$41 */
    public final enum C234841 extends PurchaseType {
        private C234841(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.tttCompliment);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$5 */
    public final enum C23495 extends PurchaseType {
        private C23495(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            return vwb.f0(new Privilege[]{Privilege.boost});
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("boost");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$6 */
    public final enum C23506 extends PurchaseType {
        private C23506(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            return vwb.f0(new Privilege[]{Privilege.online_match_tickets});
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("quickchatMembership");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$7 */
    public final enum C23517 extends PurchaseType {
        private C23517(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ArrayList<Privilege> getPrivilegeData(Gender gender) {
            return vwb.f0(new Privilege[]{Privilege.online_match_tickets_extra});
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("quickchatNumber");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$8 */
    public final enum C23528 extends PurchaseType {
        private C23528(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get("coin");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.data.PurchaseType$9 */
    public final enum C23539 extends PurchaseType {
        private C23539(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.core.data.PurchaseType
        public ProductCategory productCategory() {
            return ProductCategory.get(ProductCategory.noneLiveCoin);
        }
    }

    private static /* synthetic */ PurchaseType[] $values() {
        return new PurchaseType[]{TYPE_SPOTLIGHT, TYPE_GET_VIP, TYPE_GET_VIP_SUPERLIKE, TYPE_GET_LIKERS, TYPE_GET_BOOST, TYPE_GET_ONLINE_MATCH_TICKETS, TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA, TYPE_GET_COIN, TYPE_GET_NON_LIVE_COIN, TYPE_GET_VOICE_ONLINE_MATCH_TICKETS_EXTRA, TYPE_GET_PRIVILEGE_PACKAGE, TYPE_GET_LETTER, TYPE_GET_LETTER_INTL, TYPE_GET_SEE_LETTER_INTL, TYPE_PICKS, TYPE_PICKS_MEMBERSHIP, TYPE_SVIP_PICKS_MEMBERSHIP, TYPE_INTL_READ_MESSAGE, TYPE_O_DIAMOND, TYPE_O_PLATINUM, TYPE_SUPREME_PARTNER, TYPE_SUPERLIKE_PKG, TYPE_UNDO_PKG, TYPE_ROAMING_PKG, TYPE_LIKENOLIMIT_PKG, TYPE_SAY_HI_PKG, TYPE_MOMENT_COIN, TYPE_GET_ACCELERATE_PAIRING, TYPE_FEMALE_VIP, TYPE_YOUTH_VIP, TYPE_O_DIAMOND_PRIVATE_CUSTOM, TYPE_PRIVATE_CUSTOM, TYPE_ULTRA_PREMIUM, TYPE_LIMITED_TRIAL_SEE, TYPE_INSTANT_CHAT, TYPE_NONE, TYPE_INTL_DIAMOND, TYPE_INTL_TTT_COIN, TYPE_INTL_TTT_LIVE_COIN, TYPE_TTC_BOOST, TYPE_COMPLIMENT};
    }

    static {
        TYPE_SPOTLIGHT = new C23131("TYPE_SPOTLIGHT", 0);
        TYPE_GET_VIP = new C23242("TYPE_GET_VIP", 1);
        TYPE_GET_VIP_SUPERLIKE = new C23353("TYPE_GET_VIP_SUPERLIKE", 2);
        TYPE_GET_LIKERS = new C23464("TYPE_GET_LIKERS", 3);
        TYPE_GET_BOOST = new C23495("TYPE_GET_BOOST", 4);
        TYPE_GET_ONLINE_MATCH_TICKETS = new C23506("TYPE_GET_ONLINE_MATCH_TICKETS", 5);
        TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA = new C23517("TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA", 6);
        TYPE_GET_COIN = new C23528("TYPE_GET_COIN", 7);
        TYPE_GET_NON_LIVE_COIN = new C23539("TYPE_GET_NON_LIVE_COIN", 8);
        TYPE_GET_VOICE_ONLINE_MATCH_TICKETS_EXTRA = new C231410("TYPE_GET_VOICE_ONLINE_MATCH_TICKETS_EXTRA", 9);
        TYPE_GET_PRIVILEGE_PACKAGE = new C231511("TYPE_GET_PRIVILEGE_PACKAGE", 10);
        TYPE_GET_LETTER = new C231612("TYPE_GET_LETTER", 11);
        TYPE_GET_LETTER_INTL = new C231713("TYPE_GET_LETTER_INTL", 12);
        TYPE_GET_SEE_LETTER_INTL = new C231814("TYPE_GET_SEE_LETTER_INTL", 13);
        TYPE_PICKS = new C231915("TYPE_PICKS", 14);
        TYPE_PICKS_MEMBERSHIP = new C232016("TYPE_PICKS_MEMBERSHIP", 15);
        TYPE_SVIP_PICKS_MEMBERSHIP = new C232117("TYPE_SVIP_PICKS_MEMBERSHIP", 16);
        TYPE_INTL_READ_MESSAGE = new C232218("TYPE_INTL_READ_MESSAGE", 17);
        TYPE_O_DIAMOND = new C232319("TYPE_O_DIAMOND", 18);
        TYPE_O_PLATINUM = new C232520("TYPE_O_PLATINUM", 19);
        TYPE_SUPREME_PARTNER = new C232621("TYPE_SUPREME_PARTNER", 20);
        TYPE_SUPERLIKE_PKG = new C232722("TYPE_SUPERLIKE_PKG", 21);
        TYPE_UNDO_PKG = new C232823("TYPE_UNDO_PKG", 22);
        TYPE_ROAMING_PKG = new C232924("TYPE_ROAMING_PKG", 23);
        TYPE_LIKENOLIMIT_PKG = new C233025("TYPE_LIKENOLIMIT_PKG", 24);
        TYPE_SAY_HI_PKG = new C233126("TYPE_SAY_HI_PKG", 25);
        TYPE_MOMENT_COIN = new C233227("TYPE_MOMENT_COIN", 26);
        TYPE_GET_ACCELERATE_PAIRING = new C233328("TYPE_GET_ACCELERATE_PAIRING", 27);
        TYPE_FEMALE_VIP = new C233429("TYPE_FEMALE_VIP", 28);
        TYPE_YOUTH_VIP = new C233630("TYPE_YOUTH_VIP", 29);
        TYPE_O_DIAMOND_PRIVATE_CUSTOM = new C233731("TYPE_O_DIAMOND_PRIVATE_CUSTOM", 30);
        TYPE_PRIVATE_CUSTOM = new C233832("TYPE_PRIVATE_CUSTOM", 31);
        TYPE_ULTRA_PREMIUM = new C233933("TYPE_ULTRA_PREMIUM", 32);
        TYPE_LIMITED_TRIAL_SEE = new C234034("TYPE_LIMITED_TRIAL_SEE", 33);
        TYPE_INSTANT_CHAT = new C234135("TYPE_INSTANT_CHAT", 34);
        TYPE_NONE = new C234236("TYPE_NONE", 35);
        TYPE_INTL_DIAMOND = new C234337("TYPE_INTL_DIAMOND", 36);
        TYPE_INTL_TTT_COIN = new C234438("TYPE_INTL_TTT_COIN", 37);
        TYPE_INTL_TTT_LIVE_COIN = new C234539("TYPE_INTL_TTT_LIVE_COIN", 38);
        TYPE_TTC_BOOST = new C234740("TYPE_TTC_BOOST", 39);
        TYPE_COMPLIMENT = new C234841("TYPE_COMPLIMENT", 40);
    }

    public static PurchaseType valueOf(String str) {
        return (PurchaseType) Enum.valueOf(PurchaseType.class, str);
    }

    public static PurchaseType[] values() {
        return (PurchaseType[]) $VALUES.clone();
    }

    public ArrayList<Privilege> getPrivilegeData(Gender gender) {
        return vwb.f0(new Privilege[]{null});
    }

    public ArrayList<Privilege> getPrivilegeDataForGP(Gender gender) {
        return getPrivilegeData(gender);
    }

    public boolean isRevGreet() {
        return CoreModule.N().Co();
    }

    public abstract ProductCategory productCategory();

    private PurchaseType(String str, int i) {
        super(str, i);
    }
}
