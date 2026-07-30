package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.spongycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes11.dex */
public class fy80 {

    /* JADX INFO: renamed from: a */
    public static boolean f99841a;

    /* JADX INFO: renamed from: l.fy80$a */
    public static /* synthetic */ class C16959a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f99842a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f99842a = iArr;
            try {
                iArr[Privilege.superlike_pkg.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f99842a[Privilege.likeNoLimit_pkg.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f99842a[Privilege.roaming_pkg.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f99842a[Privilege.undo_pkg.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f99842a[Privilege.intl_no_ad.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f99842a[Privilege.vip_super_like.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f99842a[Privilege.vip_undo.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f99842a[Privilege.vip_unlimited_likes.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f99842a[Privilege.vip_location.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f99842a[Privilege.vip_badge.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f99842a[Privilege.vip_independent_super_like.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f99842a[Privilege.boost.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f99842a[Privilege.see_not_match_guide.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f99842a[Privilege.see_who_likes_me.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f99842a[Privilege.online_match_tickets.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f99842a[Privilege.voice_quick_chat.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f99842a[Privilege.privacy_membership.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f99842a[Privilege.message_read_state.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f99842a[Privilege.recover_unmatches.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f99842a[Privilege.svip_badge.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f99842a[Privilege.letter.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f99842a[Privilege.greet.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f99842a[Privilege.top_like.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f99842a[Privilege.top_chat.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f99842a[Privilege.vip_greet.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f99842a[Privilege.svip_greet.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f99842a[Privilege.leave_message.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f99842a[Privilege.vip_letter_gp.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f99842a[Privilege.advanced_filter.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f99842a[Privilege.vip_membership_active_time_gp.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f99842a[Privilege.vip_membership_read_gp.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f99842a[Privilege.vip_membership_remark_gp.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f99842a[Privilege.vip_membership_search_gp.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f99842a[Privilege.liked_user.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f99842a[Privilege.vip_message_block_gp.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f99842a[Privilege.see_theme_unlock_more.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f99842a[Privilege.see_theme_unlock_pop.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f99842a[Privilege.see_theme_unlock_online.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f99842a[Privilege.see_letter_gp.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f99842a[Privilege.svipPicksMembership.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f99842a[Privilege.picksMembership.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f99842a[Privilege.oDiamondSvipExtra.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f99842a[Privilege.oDiamondSvipSkin.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f99842a[Privilege.oDiamondGreetings.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f99842a[Privilege.oDiamondVisitor.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f99842a[Privilege.loveBuzz.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f99842a[Privilege.intl_advanced_filter.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f99842a[Privilege.intl_visitor.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f99842a[Privilege.premium_compliment.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f99842a[Privilege.immediately_match.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f99842a[Privilege.live_entry_animation.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f99842a[Privilege.customer_service.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f99842a[Privilege.say_hi_pkg.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f99842a[Privilege.moment_boost.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f99842a[Privilege.accelerate_pairing.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f99842a[Privilege.city_topping.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f99842a[Privilege.personal_customization.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f99842a[Privilege.mysterious_mode.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f99842a[Privilege.nearby_people.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f99842a[Privilege.exclusive_dressing_up.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f99842a[Privilege.visitor_hide_footprint.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f99842a[Privilege.confession_first.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f99842a[Privilege.pick_tantan_credits_users.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f99842a[Privilege.unlock_learn_about_him_module.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f99842a[Privilege.ads_not_disturb.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f99842a[Privilege.block_harassing_words.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f99842a[Privilege.youth_roaming.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f99842a[Privilege.youth_find_partner.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f99842a[Privilege.youth_blind_box.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f99842a[Privilege.youth_superlike.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f99842a[Privilege.youth_message_read.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f99842a[Privilege.private_custom.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f99842a[Privilege.hide_me_from_nearby.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f99842a[Privilege.tribe.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public static ArrayList<Privilege> m123702A() {
        ArrayList<Privilege> arrayListM123730z = m123730z();
        ArrayList<Privilege> privilegeDataForGP = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP(CoreModule.f17545c.f19639e0.m169527p9().gender);
        Privilege privilege = Privilege.svip_badge;
        List listM200318c0 = vwb.m200318c0(privilegeDataForGP, privilege);
        listM200318c0.add(0, privilege);
        return (ArrayList) vwb.m200343p(arrayListM123730z, listM200318c0);
    }

    /* JADX INFO: renamed from: B */
    public static void m123703B(boolean z) {
        f99841a = z;
    }

    /* JADX INFO: renamed from: C */
    public static int m123704C() {
        return 14;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m123705a(PurchaseType purchaseType, Privilege privilege, List list, Privilege privilege2) {
        wx80 wx80VarM123717m = m123717m(purchaseType, privilege2);
        wx80VarM123717m.m205941Z(true);
        if (NullChecker.m81303a(privilege) && privilege2 == privilege) {
            list.add(0, wx80VarM123717m);
        } else if (NullChecker.m81303a(privilege2)) {
            list.add(wx80VarM123717m);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m123706b(Privilege privilege, List list, Privilege privilege2) {
        PurchaseType purchaseType = PurchaseType.TYPE_O_DIAMOND;
        wx80 wx80VarM123717m = m123717m(purchaseType, privilege2);
        wx80VarM123717m.m205932Q(true);
        if (NullChecker.m81303a(privilege) && privilege2 == privilege) {
            list.add(0, wx80VarM123717m);
        } else if (NullChecker.m81303a(privilege) && !purchaseType.getPrivilegeData(null).contains(privilege) && privilege2 == Privilege.oDiamondSvipExtra) {
            list.add(0, wx80VarM123717m);
        } else {
            list.add(wx80VarM123717m);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m123707c(PurchaseType purchaseType, Privilege privilege, List list, Privilege privilege2) {
        wx80 wx80VarM123717m = m123717m(purchaseType, privilege2);
        wx80VarM123717m.m205951e0(true);
        if (NullChecker.m81303a(privilege) && privilege2 == privilege) {
            list.add(0, wx80VarM123717m);
        } else if (NullChecker.m81303a(privilege2)) {
            list.add(wx80VarM123717m);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m123708d(List list, Privilege privilege, List list2, Privilege privilege2) {
        wx80 wx80VarM123716l = m123716l(privilege2);
        if (list.size() > 1) {
            wx80VarM123716l.m205949d0(true);
        } else {
            wx80VarM123716l.m205934S(true);
        }
        if (NullChecker.m81303a(privilege) && privilege2 == privilege) {
            list2.add(0, wx80VarM123716l);
        } else if (NullChecker.m81303a(privilege2)) {
            list2.add(wx80VarM123716l);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m123709e(Privilege privilege, List list, boolean z, PurchaseType purchaseType, Privilege privilege2) {
        if (NullChecker.m81303a(privilege) && privilege2 == privilege) {
            list.add(z ? 1 : 0, m123717m(purchaseType, privilege2));
        } else if (NullChecker.m81303a(privilege2)) {
            list.add(m123717m(purchaseType, privilege2));
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m123710f(Privilege privilege, List list, Privilege privilege2) {
        wx80 wx80VarM123717m = m123717m(PurchaseType.TYPE_O_PLATINUM, privilege2);
        wx80VarM123717m.m205935T(true);
        if (NullChecker.m81303a(privilege) && privilege2 == privilege) {
            list.add(0, wx80VarM123717m);
        } else if (NullChecker.m81303a(privilege2)) {
            list.add(wx80VarM123717m);
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m123711g() {
        return CoreModule.f17544b.getString(R$string.f27264P8);
    }

    /* JADX INFO: renamed from: h */
    public static int m123712h() {
        return CoreModule.m29935P().m94652b().mo35092Bs() ? R$string.f27357Y2 : R$string.f27346X2;
    }

    /* JADX INFO: renamed from: i */
    public static List<wx80> m123713i(List<Privilege> list, final Privilege privilege) {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(list, new e30() { // from class: l.dy80
            @Override // p149l.e30
            public final void call(Object obj) {
                fy80.m123706b(privilege, arrayList, (Privilege) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static List<wx80> m123714j(final List<Privilege> list, final Privilege privilege) {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(list, new e30() { // from class: l.by80
            @Override // p149l.e30
            public final void call(Object obj) {
                fy80.m123708d(list, privilege, arrayList, (Privilege) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public static List<wx80> m123715k(List<Privilege> list, final Privilege privilege) {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(list, new e30() { // from class: l.ey80
            @Override // p149l.e30
            public final void call(Object obj) {
                fy80.m123710f(privilege, arrayList, (Privilege) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public static wx80 m123716l(Privilege privilege) {
        return m123717m(null, privilege);
    }

    /* JADX INFO: renamed from: m */
    public static wx80 m123717m(PurchaseType purchaseType, Privilege privilege) {
        String str;
        String strMo33621wp;
        String str2;
        String str3;
        int i;
        String str4;
        int i2;
        int i3;
        int i4;
        String str5;
        String str6 = "https://auto.tancdn.com/v1/raw/f6c163cb-aa67-455d-b289-5953e6d9b54411.webp";
        String str7 = "无需配对，直接向对方表达你的心意！";
        String str8 = "他";
        switch (C16959a.f99842a[privilege.ordinal()]) {
            case 1:
                int i5 = zz6.m221004u0() ? R$string.f27438f1 : R$string.f27426e1;
                return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83760T9).m211448e(d3c0.f84131u9).m211451h(b1c0.f72568p0, b1c0.f72566o0).m211458o("每天3个超级喜欢").m211455l(i5).m211449f(i5).m211445a();
            case 2:
                String string = CoreModule.f17544b.getString(R$string.f27546o1);
                return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83682Nc).m211448e(d3c0.f83556Ec).m211451h(b1c0.f72576t0, b1c0.f72574s0).m211457n(R$string.f27558p1).m211456m(string).m211450g(string).m211445a();
            case 3:
                return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83640Kc).m211448e(d3c0.f84134uc).m211451h(b1c0.f72562m0, b1c0.f72560l0).m211457n(R$string.f27344X0).m211455l(R$string.f27333W0).m211449f(R$string.f27333W0).m211445a();
            case 4:
                boolean zM221004u0 = zz6.m221004u0();
                return xx80.m211444b().m211454k(privilege).m211448e(d3c0.f83514Bc).m211451h(b1c0.f72572r0, b1c0.f72570q0).m211457n(R$string.f27534n1).m211455l(zM221004u0 ? R$string.f27201K0 : R$string.f27190J0).m211449f(zM221004u0 ? R$string.f27201K0 : R$string.f27190J0).m211445a();
            case 5:
                return xx80.m211444b().m211454k(privilege).m211453j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/raw/7e9d55ce-e487-41fe-8dd2-7a0147470ef110.webp" : "https://auto.tancdn.com/v1/raw/55c2177d-65e6-4c75-801a-499403525f5e10.webp").m211457n(R$string.f27597s6).m211455l(R$string.f27586r6).m211449f(R$string.f27586r6).m211445a();
            case 6:
                if (CoreModule.m29935P().m94651a().mo33507h5()) {
                    String string2 = CoreModule.f17544b.getString(zz6.m221004u0() ? R$string.f27438f1 : R$string.f27426e1);
                    String string3 = (sab0.m182891i(purchaseType) || sab0.m182892j(purchaseType)) ? "无限次超级喜欢" : CoreModule.f17544b.getString(R$string.f27450g1);
                    if (sab0.m182903u(purchaseType)) {
                        string3 = "无限次超级喜欢";
                        string2 = "无限次超级喜欢，使用后让你的喜欢脱颖而出！";
                    }
                    return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83760T9).m211448e(d3c0.f84131u9).m211451h(b1c0.f72568p0, b1c0.f72566o0).m211458o(string3).m211456m(string2).m211450g(string2).m211445a();
                }
                String string4 = CoreModule.f17544b.getString(R$string.f27330V8);
                str = IntlCountryCodeController.m28126v() ? "https://auto.tancdn.com/v1/raw/4ad5dbbb-6860-4461-b45f-9a6209d7df6f11.webp" : "https://auto.tancdn.com/v1/raw/d81da4e9-8ed7-4917-a1fd-05a5446adab710.webp";
                PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                if (purchaseType == purchaseType2) {
                    str = IntlCountryCodeController.m28126v() ? "https://auto.tancdn.com/v1/raw/b8927b15-478d-4a2b-b514-2da53e084ae010.webp" : "https://auto.tancdn.com/v1/raw/0750872a-d3b6-4b59-afec-3ed32fbb5e5511.webp";
                }
                int i6 = R$string.f27363Y8;
                if (purchaseType == purchaseType2 && ura.m195053e().m195057d().mo33734Oi()) {
                    i6 = IntlCountryCodeController.m28126v() ? R$string.f27464h3 : R$string.f27452g3;
                }
                xx80 xx80VarM211444b = xx80.m211444b();
                xx80VarM211444b.m211454k(privilege).m211453j(str).m211457n(i6).m211455l(R$string.f27330V8).m211450g(string4);
                return xx80VarM211444b.m211445a();
            case 7:
                if (!CoreModule.m29935P().m94651a().mo33507h5()) {
                    String str9 = IntlCountryCodeController.m28126v() ? "https://auto.tancdn.com/v1/raw/1c363bb1-527a-4e73-bf75-af3337532e8711.webp" : "https://auto.tancdn.com/v1/raw/efbb251e-8a64-450e-80e4-af960390eabd11.webp";
                    if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                        str9 = IntlCountryCodeController.m28126v() ? "https://auto.tancdn.com/v1/raw/8e0c607c-ba1e-4754-8b7a-9ec6ceef9dfd11.webp" : "https://auto.tancdn.com/v1/raw/3e3a2ee9-7170-4b5b-92f7-d4f4dfca3dc311.webp";
                    }
                    xx80 xx80VarM211444b2 = xx80.m211444b();
                    xx80VarM211444b2.m211454k(privilege).m211453j(str9).m211458o(CoreModule.f17544b.getString(R$string.f27374Z8)).m211455l(R$string.f27308T8).m211450g(CoreModule.f17544b.getString(R$string.f27308T8));
                    return xx80VarM211444b2.m211445a();
                }
                boolean zM221004u1 = zz6.m221004u0();
                xx80 xx80VarM211444b3 = xx80.m211444b();
                xx80VarM211444b3.m211454k(privilege).m211452i(d3c0.f83668Mc).m211448e(d3c0.f83514Bc).m211451h(b1c0.f72572r0, b1c0.f72570q0).m211457n(R$string.f27534n1).m211455l(zM221004u1 ? R$string.f27201K0 : R$string.f27190J0).m211449f(zM221004u1 ? R$string.f27201K0 : R$string.f27190J0);
                if (CoreModule.m29935P().m94651a().mo33433Vf()) {
                    xx80VarM211444b3.m211458o("反悔特权");
                    xx80VarM211444b3.m211456m(zz6.m221004u0() ? "手滑啦？使用反悔特权，重新喜欢他！" : "手滑啦？使用反悔特权，重新喜欢她！");
                    xx80VarM211444b3.m211450g(zz6.m221004u0() ? "手滑啦？使用反悔特权，重新喜欢他！" : "手滑啦？使用反悔特权，重新喜欢她！");
                }
                return xx80VarM211444b3.m211445a();
            case 8:
                if (CoreModule.m29935P().m94651a().mo33507h5()) {
                    String string5 = CoreModule.f17544b.getString(R$string.f27546o1);
                    return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83682Nc).m211448e(d3c0.f83556Ec).m211451h(b1c0.f72576t0, b1c0.f72574s0).m211457n(R$string.f27558p1).m211456m(string5).m211450g(string5).m211445a();
                }
                String str10 = IntlCountryCodeController.m28126v() ? "https://auto.tancdn.com/v1/raw/1216f433-f408-44a2-add9-e3a9969270c611.webp" : "https://auto.tancdn.com/v1/raw/9e7625c5-4002-421b-bf5c-fb6ed0ea90ee11.webp";
                if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                    str10 = IntlCountryCodeController.m28126v() ? "https://auto.tancdn.com/v1/raw/8a46ab26-dd56-484a-bd09-43ee42fd5e1311.webp" : "https://auto.tancdn.com/v1/raw/406c7711-a037-4e25-8acf-db68636ebce010.webp";
                }
                return xx80.m211444b().m211454k(privilege).m211453j(str10).m211457n(R$string.f27341W8).m211456m(m123711g()).m211450g(m123711g()).m211445a();
            case 9:
                if (CoreModule.m29935P().m94651a().mo33507h5()) {
                    return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83640Kc).m211448e(d3c0.f84134uc).m211451h(b1c0.f72562m0, b1c0.f72560l0).m211457n(R$string.f27344X0).m211455l(R$string.f27333W0).m211449f(R$string.f27333W0).m211445a();
                }
                return xx80.m211444b().m211454k(privilege).m211453j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/raw/fad6222d-a1b8-4505-8537-48f54a09580111.webp" : "https://auto.tancdn.com/v1/raw/30a18977-468d-4e52-a7ff-c69087efcfa411.webp").m211457n(R$string.f27344X0).m211455l(R$string.f27333W0).m211449f(R$string.f27275Q8).m211445a();
            case 10:
                if (CoreModule.m29935P().m94651a().mo33507h5()) {
                    return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83598Hc).m211448e(d3c0.f84036nc).m211451h(b1c0.f72554i0, b1c0.f72552h0).m211458o(m123728x()).m211456m(m123726v()).m211450g(m123726v()).m211445a();
                }
                int i7 = R$string.f27386a9;
                int i8 = R$string.f27319U8;
                if (PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE == purchaseType) {
                    i7 = R$string.f27317U6;
                    i8 = R$string.f27306T6;
                } else {
                    str6 = "https://auto.tancdn.com/v1/raw/471883b1-4132-4349-a95a-5806d9df838510.webp";
                }
                return xx80.m211444b().m211454k(privilege).m211453j(str6).m211457n(i7).m211455l(i8).m211449f(i8).m211445a();
            case 11:
                str = IntlCountryCodeController.m28126v() ? "https://auto.tancdn.com/v1/raw/4ad5dbbb-6860-4461-b45f-9a6209d7df6f11.webp" : "https://auto.tancdn.com/v1/raw/d81da4e9-8ed7-4917-a1fd-05a5446adab710.webp";
                if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                    str = IntlCountryCodeController.m28126v() ? "https://auto.tancdn.com/v1/raw/b8927b15-478d-4a2b-b514-2da53e084ae010.webp" : "https://auto.tancdn.com/v1/raw/0750872a-d3b6-4b59-afec-3ed32fbb5e5511.webp";
                }
                return xx80.m211444b().m211454k(privilege).m211453j(str).m211457n(R$string.f27363Y8).m211455l(R$string.f27297S8).m211449f(R$string.f27297S8).m211445a();
            case 12:
                if (purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                    return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83612Ic).m211448e(d3c0.f83995l).m211451h(b1c0.f72539b, b1c0.f72537a).m211458o(CoreModule.f17544b.getString(R$string.f27544o)).m211455l(R$string.f27484j).m211449f(R$string.f27484j).m211445a();
                }
                int i9 = R$string.f27563p6;
                int i10 = R$string.f27575q6;
                return xx80.m211444b().m211454k(privilege).m211453j("https://auto.tancdn.com/v1/raw/11c58ba4-4e09-4b06-907e-46899bf7117611.webp").m211457n(i9).m211455l(i10).m211449f(i10).m211445a();
            case 13:
            case 14:
                return purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? xx80.m211444b().m211454k(privilege).m211453j("https://auto.tancdn.com/v1/raw/9a4c7c22-b275-44ab-8ebb-aeebc7e0a84210.webp").m211457n(R$string.f27609t7).m211456m(CoreModule.f17544b.getResources().getString(R$string.f27631v7)).m211449f(R$string.f27631v7).m211445a() : xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83924fc).m211448e(d3c0.f84106sc).m211458o(CoreModule.f17544b.getString(R$string.f27620u7)).m211456m(CoreModule.f17544b.getResources().getString(R$string.f27631v7)).m211450g(CoreModule.f17544b.getResources().getString(R$string.f27631v7)).m211445a();
            case 15:
                if (!CoreModule.m29935P().m94651a().mo33507h5()) {
                    return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83856b0).m211457n(R$string.f27444f7).m211455l(R$string.f27372Z6).m211449f(R$string.f27372Z6).m211445a();
                }
                if (sab0.m182891i(purchaseType) || sab0.m182892j(purchaseType)) {
                    strMo33621wp = "无限次在线闪聊";
                } else {
                    strMo33621wp = sab0.m182903u(purchaseType) ? "无限次闪聊匹配" : CoreModule.m29935P().m94651a().mo33621wp();
                }
                if (sab0.m182891i(purchaseType) || sab0.m182892j(purchaseType)) {
                    str2 = zz6.m221004u0() ? "无限次在线闪聊匹配附近在线的小哥哥，无需相互喜欢，直接在线开聊" : "无限次在线闪聊匹配附近在线的小姐姐，无需相互喜欢，直接在线开聊";
                } else {
                    str2 = sab0.m182903u(purchaseType) ? "无限次闪聊机会，无需配对，立即开聊！" : String.format(CoreModule.m29935P().m94651a().mo33341Il(), CoreModule.m29935P().m94651a().mo33347Jj());
                }
                return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83856b0).m211458o(strMo33621wp).m211456m(str2).m211450g(str2).m211445a();
            case 16:
                if (sab0.m182891i(purchaseType) || sab0.m182892j(purchaseType)) {
                    str3 = CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? "21" : "4";
                } else {
                    str3 = "1";
                }
                return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83855b).m211459p(b1c0.f72528R).m211458o("语音闪聊").m211456m(String.format("每天额外%s次语音闪聊，随时连线附近的%s", str3, zz6.m221004u0() ? "小哥哥" : "小姐姐")).m211450g(String.format("每天额外%s次语音闪聊，随时连线附近的%s", str3, zz6.m221004u0() ? "小哥哥" : "小姐姐")).m211445a();
            case 17:
                String string6 = CoreModule.f17544b.getString(R$string.f27355Y0);
                String string7 = CoreModule.f17544b.getString(R$string.f27355Y0);
                if (g6a.m124562k() && sab0.m182889g(purchaseType)) {
                    i = d3c0.f84100s6;
                    string6 = "一键开启冻结活跃时间和隐藏距离位置功能";
                    string7 = "一键开启冻结活跃时间和隐藏距离位置功能";
                } else {
                    if (CoreModule.m29935P().m94651a().mo33631z1()) {
                        string6 = "隐藏我的位置、最后活跃时间和年龄信息，隐私更有保障";
                        string7 = "隐藏我的位置、最后活跃时间和年龄信息，隐私更有保障";
                    }
                    i = 0;
                }
                if (CoreModule.m29935P().m94658i().mo158272N()) {
                    string6 = "只让你右滑的人看到你，还可隐藏年龄、位置等信息";
                    string7 = "只让你右滑的人看到你，还可隐藏年龄、位置等信息";
                }
                return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83654Lc).m211447d(i).m211457n(R$string.f27366Z0).m211456m(string7).m211450g(string6).m211445a();
            case 18:
                int i11 = R$string.f27390b1;
                int i12 = R$string.f27378a1;
                if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && CoreModule.m29935P().m94651a().mo33442Xi()) {
                    i11 = R$string.f27527m6;
                    i12 = R$string.f27539n6;
                }
                return xx80.m211444b().m211454k(privilege).m211453j("https://auto.tancdn.com/v1/raw/1ed2b13c-d582-4afa-8c09-32d9fc4f2f9a10.webp").m211457n(i11).m211455l(i12).m211449f(i12).m211445a();
            case 19:
                return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83639Kb).m211457n(R$string.f27414d1).m211455l(R$string.f27402c1).m211449f(R$string.f27402c1).m211445a();
            case 20:
                return CoreModule.m29935P().m94651a().mo33507h5() ? xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83910ec).m211458o(m123724t()).m211456m(m123723s(purchaseType)).m211450g(m123723s(purchaseType)).m211445a() : xx80.m211444b().m211454k(privilege).m211453j("https://auto.tancdn.com/v1/raw/f6c163cb-aa67-455d-b289-5953e6d9b54411.webp").m211458o(m123728x()).m211456m(m123726v()).m211450g(m123727w()).m211445a();
            case 21:
                boolean zM221004u2 = zz6.m221004u0();
                return xx80.m211444b().m211454k(privilege).m211457n(zM221004u2 ? R$string.f27322V0 : R$string.f27311U0).m211452i(d3c0.f83611Ib).m211455l(zM221004u2 ? R$string.f27300T0 : R$string.f27289S0).m211449f(zM221004u2 ? R$string.f27300T0 : R$string.f27289S0).m211445a();
            case 22:
                return xx80.m211444b().m211454k(privilege).m211458o("专属礼物").m211452i(d3c0.f83936ga).m211447d(d3c0.f84024n0).m211456m(String.format("每天%s个免费礼物，用礼物表达心意", "2")).m211450g(String.format("每天%s个免费礼物，用礼物表达心意", "2")).m211445a();
            case 23:
                boolean zM221004u3 = zz6.m221004u0();
                String str11 = String.format("让%s第一个滑到你，每天3次抢占配对先机！", zM221004u3 ? "他" : "她");
                int i13 = zM221004u3 ? d3c0.f84080r0 : d3c0.f84066q0;
                int i14 = zM221004u3 ? d3c0.f83992ka : d3c0.f83978ja;
                if (g6a.m124569r()) {
                    str11 = String.format("让%s第一个滑到你的卡片，每天3次抢占配对先机！", zM221004u3 ? "他" : "她");
                    i14 = CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? d3c0.f83743S5 : d3c0.f83756T5;
                    str4 = "卡片插队";
                } else {
                    str4 = "置顶喜欢";
                }
                return xx80.m211444b().m211454k(privilege).m211458o(str4).m211452i(i13).m211447d(i14).m211456m(str11).m211450g(str11).m211445a();
            case 24:
                boolean zM221004u4 = zz6.m221004u0();
                String str12 = zM221004u4 ? "在他收到的消息中置顶，更快收到回复！" : "在她收到的消息中置顶，更快收到回复！";
                return xx80.m211444b().m211454k(privilege).m211458o(zM221004u4 ? "成为他的置顶聊天" : "成为她的置顶聊天").m211452i(zM221004u4 ? d3c0.f84052p0 : d3c0.f84038o0).m211447d(zM221004u4 ? d3c0.f83964ia : d3c0.f83950ha).m211456m(str12).m211450g(str12).m211445a();
            case 25:
                return xx80.m211444b().m211454k(privilege).m211458o("会员专享礼物").m211452i(d3c0.f84006la).m211447d(d3c0.f84010m0).m211456m("每月专享10个礼物，向喜欢的人打招呼表达特别心意").m211450g("每月专享10个礼物，向喜欢的人打招呼表达特别心意").m211445a();
            case 26:
                String string8 = CoreModule.f17544b.getString(R$string.f27515l6);
                String string9 = CoreModule.f17544b.getString(R$string.f27503k6);
                return xx80.m211444b().m211454k(privilege).m211453j("https://auto.tancdn.com/v1/raw/1e055c6e-1294-4455-b39b-25165fc3c4a112.webp").m211458o(string8).m211456m(string9).m211450g(string9).m211445a();
            case 27:
                boolean zM221004u5 = zz6.m221004u0();
                return xx80.m211444b().m211454k(privilege).m211458o("每天5条\"资料留言\"").m211452i(!zM221004u5 ? d3c0.f84104sa : d3c0.f84118ta).m211456m(String.format("让%s第一时间看到你，配对几率提升3倍", !zM221004u5 ? "她" : "他")).m211450g(String.format("通过给资料留言，让%s第一时间看到你，配对几率提升3倍", zM221004u5 ? "他" : "她")).m211445a();
            case 28:
                boolean zM221004u6 = zz6.m221004u0();
                return xx80.m211444b().m211454k(privilege).m211457n(zM221004u6 ? R$string.f27322V0 : R$string.f27311U0).m211455l(zM221004u6 ? R$string.f27300T0 : R$string.f27289S0).m211449f(zM221004u6 ? R$string.f27300T0 : R$string.f27289S0).m211452i(CoreModule.m29935P().m94651a().mo33502fo()).m211445a();
            case 29:
                if (!CoreModule.m29935P().m94651a().mo33507h5()) {
                    return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f84051p).m211458o("高级筛选").m211456m("更多筛选条件，遇见相似的人").m211450g(CoreModule.m29935P().m94651a().mo33507h5() ? "更多筛选条件，遇见相似的人" : "更多筛选条件\n遇见相似的人").m211445a();
                }
                String string10 = CoreModule.f17544b.getString(R$string.f27256P0);
                String string11 = CoreModule.f17544b.getString(R$string.f27256P0);
                if (CoreModule.m29935P().m94651a().mo33631z1()) {
                    string10 = "优先看真实头像认证、最受欢迎、当前在线的用户，只看我的理想型";
                    string11 = "优先看真实头像认证、最受欢迎、当前在线的用户，只看我的理想型";
                }
                return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f84051p).m211457n(R$string.f27267Q0).m211456m(string11).m211450g(string10).m211445a();
            case 30:
                return xx80.m211444b().m211454k(privilege).m211453j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/raw/d4b2a799-22f7-4973-ac67-1b2084a0ea5310.webp" : "https://auto.tancdn.com/v1/raw/8a5d2dc5-4f66-4903-b7f7-eec6197d5b1711.webp").m211457n(R$string.f27159G2).m211455l(R$string.f27170H2).m211449f(R$string.f27181I2).m211445a();
            case 31:
                return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f84092rc).m211448e(d3c0.f84078qc).m211451h(b1c0.f72558k0, b1c0.f72556j0).m211457n(R$string.f27302T2).m211455l(R$string.f27291S2).m211449f(R$string.f27291S2).m211445a();
            case 32:
                return xx80.m211444b().m211454k(privilege).m211453j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkhTU0dQRTZPTkRBRFpCSkdQQTJORExPVkc2Q0Y0RjEwIiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDIyODk1NTIzMzkwOTUwOTM0fQ.png" : "https://auto.tancdn.com/v1/raw/7b981e39-f2fa-4441-9cd3-7908c69650ab10.webp").m211457n(R$string.f27171H3).m211455l(R$string.f27182I3).m211449f(R$string.f27193J3).m211445a();
            case 33:
                return xx80.m211444b().m211454k(privilege).m211453j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/images/eyJpZCI6IloyWFdESVVWRkNLUFhZNUFYNFZZRFBTTFRZUkhHRTEwIiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMTc2OTQyOTIzMjkwOTA4MTc0fQ.png" : "https://auto.tancdn.com/v1/raw/6375caf8-5b50-4426-be1f-a3b88a12fe6e11.webp").m211457n(R$string.f27138E3).m211455l(R$string.f27149F3).m211449f(R$string.f27160G3).m211445a();
            case 34:
                return xx80.m211444b().m211454k(privilege).m211453j(IntlCountryCodeController.m28126v() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IktXQkVFRzZHMkZGQU8yRzdXTzNTN01SUlhDREhPSzEzIiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNjg5MzQ4ODQ5NzcyNzI5MTM5fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlNXNTNKU0ZKVFdNSk5HNU5YNDJGSkZJUlhRVldFUTE0IiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTkxNzY2MzgxNzc2MjgxMzk0fQ.png").m211458o(CoreModule.f17544b.getString(R$string.f27616u3)).m211456m(CoreModule.f17544b.getString(R$string.f27369Z3)).m211450g(CoreModule.f17544b.getString(R$string.f27369Z3)).m211445a();
            case 35:
                return xx80.m211444b().m211454k(privilege).m211453j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/raw/be3eb17b-9d4e-48dc-b971-7d84414e73c811.webp" : "https://auto.tancdn.com/v1/raw/45513e7b-3754-4ca0-85f8-96f11d94b80710.webp").m211457n(R$string.f27262P6).m211455l(R$string.f27251O6).m211449f(R$string.f27251O6).m211445a();
            case 36:
                User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
                if (NullChecker.m81303a(userM169527p9)) {
                    Settings settings = userM169527p9.settings;
                    if (settings == null || !TEnum.equals(settings.lookingFor, "female")) {
                        i2 = (settings == null || !TEnum.equals(settings.lookingFor, "male")) ? R$string.f27529m8 : R$string.f27553o8;
                    } else {
                        i2 = R$string.f27541n8;
                    }
                } else {
                    i2 = R$string.f27529m8;
                }
                return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83948h8).m211457n(R$string.f27565p8).m211455l(i2).m211449f(i2).m211445a();
            case 37:
                int i15 = CoreModule.m29935P().m94651a().mo33491eg() ? R$string.f27588r8 : R$string.f27577q8;
                return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83976j8).m211457n(R$string.f27599s8).m211455l(i15).m211449f(i15).m211445a();
            case 38:
                int i16 = CoreModule.m29935P().m94651a().mo33491eg() ? R$string.f27621u8 : R$string.f27610t8;
                return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83962i8).m211457n(R$string.f27632v8).m211455l(i16).m211449f(i16).m211445a();
            case 39:
                User userM169527p10 = CoreModule.f17545c.f19639e0.m169527p9();
                if (NullChecker.m81303a(userM169527p10) && userM169527p10.isFemale()) {
                    i3 = R$string.f27524m3;
                } else {
                    i3 = CoreModule.m29935P().m94651a().mo33321G7() ? R$string.f27512l3 : R$string.f27536n3;
                }
                if (NullChecker.m81303a(userM169527p10) && userM169527p10.isFemale()) {
                    i4 = R$string.f27488j3;
                } else {
                    i4 = CoreModule.m29935P().m94651a().mo33321G7() ? R$string.f27476i3 : R$string.f27500k3;
                }
                return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83920f8).m211457n(i3).m211455l(i4).m211449f(i4).m211445a();
            case 40:
                String str13 = String.format("包含揭秘喜欢我的人、闪聊匹配、每月3次优先推荐等全部%s项特权", Integer.valueOf(m123704C()));
                return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83661M5).m211458o(String.format("SVIP全部%s项特权", Integer.valueOf(m123704C()))).m211456m(str13).m211450g(str13).m211445a();
            case 41:
                String string12 = CoreModule.f17544b.getString(R$string.f27335W2);
                String string13 = CoreModule.f17544b.getString(R$string.f27324V2);
                return xx80.m211444b().m211454k(privilege).m211453j("https://auto.tancdn.com/v1/images/eyJpZCI6IjZEWklIQ0dUN0FKSUZSNU5WQ0lZNlRXN0I0NlFEWjE0IiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4Njg2Mzg0MzU2OTg5MzczNTh9.png").m211458o(string12).m211456m(string13).m211450g(string13).m211445a();
            case 42:
                return xx80.m211444b().m211454k(privilege).m211447d(d3c0.f83889d5).m211452i(d3c0.f83903e5).m211458o("SVIP各项特权").m211456m("包含解密谁喜欢我、高级筛选、隐私保护等全部SVIP特权").m211450g("包含解密谁喜欢我、高级筛选、隐私保护等全部SVIP特权").m211445a();
            case 43:
                return xx80.m211444b().m211454k(privilege).m211458o("专属尊贵皮肤").m211456m("专属装扮边框，随时彰显与众不同").m211450g("专属装扮边框，随时彰显与众不同").m211445a();
            case 44:
                str7 = CoreModule.f17557o.m195057d().mo33700I5() ? "无需配对，直接向对方表达你的心意！" : zz6.m221004u0() ? "无需送礼物，随时向他打招呼" : "无需送礼物，随时向她打招呼";
                return xx80.m211444b().m211454k(privilege).m211458o(CoreModule.f17557o.m195057d().mo33700I5() ? "无限抢先告白" : "无限打招呼").m211456m(str7).m211450g(str7).m211445a();
            case 45:
                return xx80.m211444b().m211454k(privilege).m211447d(zz6.m221004u0() ? d3c0.f83968j0 : d3c0.f83954i0).m211458o("我的访客").m211456m("知晓谁看过我的资料和动态，不错过每个默默关心我的人").m211450g("知晓谁看过我的资料和动态，不错过每个默默关心我的人").m211445a();
            case 46:
                return xx80.m211444b().m211454k(privilege).m211453j(CoreModule.m29935P().m94652b().mo35092Bs() ? "https://auto.tancdn.com/v1/raw/85663437-d130-4bc7-bba1-5821f0b7943c12.webp" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkZPVFE3SVBPRVJWSE1FQ1JSNklUUjdSUkk1M1pXVTEzIiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTE3NzE0NjExMDk3MjM5NzMxOH0.png").m211458o(CoreModule.f17544b.getString(R$string.f27368Z2)).m211456m(CoreModule.f17544b.getString(m123712h())).m211450g(CoreModule.f17544b.getString(m123712h())).m211445a();
            case 47:
                return xx80.m211444b().m211454k(privilege).m211453j("https://auto.tancdn.com/v1/raw/7e034371-9f6f-4254-95c6-16b0937f6d2b13.webp").m211458o(CoreModule.f17544b.getString(R$string.f27548o3)).m211456m(CoreModule.f17544b.getString(R$string.f27641w6)).m211450g(CoreModule.f17544b.getString(R$string.f27641w6)).m211445a();
            case 48:
                return xx80.m211444b().m211454k(privilege).m211453j("https://auto.tancdn.com/v1/images/eyJpZCI6IlFFM0hMVTQ3M0haWklWVUk0MkdOSzRBQUxPRlQyRDE0IiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4Njg2NDcyMTQ2MTIwOTAzODJ9.png").m211458o(CoreModule.f17544b.getString(R$string.f27583r3)).m211456m(CoreModule.f17544b.getString(R$string.f27572q3)).m211450g(CoreModule.f17544b.getString(R$string.f27572q3)).m211445a();
            case 49:
                return xx80.m211444b().m211454k(privilege).m211453j("https://auto.tancdn.com/v1/images/eyJpZCI6IjY5NTcwM0Y2MjE1MTQ1NjI4QUExNTU0QjNCMjBERTVFIiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4Njc1MTI1MzU3OTIwOTQ3MzQsInB0IjoyMDI2MDIwMzE3fQ.png").m211458o(String.format(CoreModule.f17544b.getString(R$string.f27428e3), Integer.valueOf(xma.m210091r3()))).m211456m(CoreModule.f17544b.getString(R$string.f27416d3)).m211450g(CoreModule.f17544b.getString(R$string.f27416d3)).m211445a();
            case 50:
                xx80 xx80VarM211458o = xx80.m211444b().m211454k(privilege).m211447d(zz6.m221004u0() ? d3c0.f83940h0 : d3c0.f83926g0).m211452i(zz6.m221004u0() ? d3c0.f84084r4 : d3c0.f84098s4).m211458o("一键配对");
                PurchaseType purchaseType3 = PurchaseType.TYPE_SUPREME_PARTNER;
                return xx80VarM211458o.m211456m(purchaseType == purchaseType3 ? String.format("一键开聊，无需等待，每天%s次开挂体验!", 5) : String.format("一键与理想型配对开聊，你的喜欢无需等待，尊享每天%s次开挂式体验", Integer.valueOf(yx80.m216433a()))).m211450g(purchaseType == purchaseType3 ? String.format("一键开聊，无需等待，每天%s次开挂体验!", 5) : String.format("一键与理想型配对开聊，你的喜欢无需等待，尊享每天%s次开挂式体验", Integer.valueOf(yx80.m216433a()))).m211445a();
            case 51:
                return xx80.m211444b().m211454k(privilege).m211447d(zz6.m221004u0() ? d3c0.f83912f0 : d3c0.f83898e0).m211452i(zz6.m221004u0() ? d3c0.f83884d0 : d3c0.f83870c0).m211458o("直播间徽章 入场特效").m211456m("专属徽章和入场特效，成为全场最闪亮的星").m211450g("专属徽章和入场特效，成为全场最闪亮的星").m211445a();
            case 52:
                xx80 xx80VarM211458o2 = xx80.m211444b().m211454k(privilege).m211458o("专属客服");
                PurchaseType purchaseType4 = PurchaseType.TYPE_SUPREME_PARTNER;
                return xx80VarM211458o2.m211456m(purchaseType == purchaseType4 ? "一对一专属客服，为您的体验保驾护航" : "一对一专属客服，为你的体验保驾护航").m211450g(purchaseType == purchaseType4 ? "一对一专属客服，为您的体验保驾护航" : "一对一专属客服，为你的体验保驾护航").m211445a();
            case 53:
                xx80 xx80VarM211458o3 = xx80.m211444b().m211454k(privilege).m211458o(CoreModule.f17557o.m195057d().mo33700I5() ? "每天3次抢先告白" : "每天3次打招呼");
                if (CoreModule.f17557o.m195057d().mo33700I5()) {
                    str5 = "无需配对，直接向对方表达你的心意！";
                } else {
                    str5 = String.format("向%s主动表白，真诚赢得对方的心", zz6.m221004u0() ? "他" : "她");
                }
                xx80 xx80VarM211456m = xx80VarM211458o3.m211456m(str5);
                if (!CoreModule.f17557o.m195057d().mo33700I5()) {
                    str7 = String.format("向%s主动表白，真诚赢得对方的心", zz6.m221004u0() ? "他" : "她");
                }
                return xx80VarM211456m.m211450g(str7).m211445a();
            case 54:
                String str14 = (sab0.m182891i(purchaseType) || sab0.m182892j(purchaseType)) ? "全程动态超级曝光" : String.format("每月%s次动态超级曝光", Integer.valueOf(CoreModule.m29934N().mo60355h8()));
                String str15 = (sab0.m182891i(purchaseType) || sab0.m182892j(purchaseType)) ? "发布动态全程开启超级曝光，收获大量点赞互动" : "动态智能精准投放，收获大量浏览互动";
                return xx80.m211444b().m211454k(privilege).m211452i(zz6.m221004u0() ? d3c0.f83996l0 : d3c0.f83982k0).m211458o(str14).m211456m(str15).m211450g(str15).m211445a();
            case 55:
                return xx80.m211444b().m211454k(Privilege.accelerate_pairing).m211458o(String.format("每月%s次加速配对", Integer.valueOf(CoreModule.m29935P().m94654e().mo34991x6()))).m211456m("30分钟内把你优先推荐给喜欢的人，斩获最多10倍配对！").m211450g("30分钟内把你优先推荐给喜欢的人，斩获最多10倍配对！").m211445a();
            case 56:
                return xx80.m211444b().m211454k(Privilege.city_topping).m211458o("城市置顶").m211456m("在线期间，您的资料会在第一位，曝光给所在城市中，全部符合您筛选要求的用户").m211450g("在线期间，您的资料会在第一位，曝光给所在城市中，全部符合您筛选要求的用户").m211445a();
            case 57:
                return xx80.m211444b().m211454k(Privilege.personal_customization).m211458o("私人定制").m211456m("根据您的喜好，筛选出符合您要求的用户，提升您的社交效率").m211450g("根据您的喜好，筛选出符合您要求的用户，提升您的社交效率").m211445a();
            case 58:
                return xx80.m211444b().m211454k(Privilege.mysterious_mode).m211458o("神秘模式").m211456m("神秘人模式，仍可斩获无限喜欢").m211450g("神秘人模式，仍可斩获无限喜欢").m211445a();
            case 59:
                return xx80.m211444b().m211454k(Privilege.nearby_people).m211458o("附近的人").m211456m("根据您的地理位置，为您精确搜索附近3公里内的用户").m211450g("根据您的地理位置，为您精确搜索附近3公里内的用户").m211445a();
            case 60:
                return xx80.m211444b().m211454k(Privilege.exclusive_dressing_up).m211458o("尊享装扮").m211456m("至尊合伙人独享卡片装扮").m211450g("至尊合伙人独享卡片装扮").m211445a();
            case 61:
                String str16 = String.format(Locale.getDefault(), "每月%d次机会，开启后访问其他人，对方将不会看到你的访问记录", Integer.valueOf(CoreModule.m29935P().m94654e().mo34976Xm()));
                return xx80.m211444b().m211454k(privilege).m211458o("隐藏我的访问足迹").m211456m(str16).m211450g(str16).m211445a();
            case 62:
                return xx80.m211444b().m211454k(privilege).m211458o(String.format("每天%s次抢先告白", Integer.valueOf(xma.m210093t3()))).m211456m("无需配对，直接向对方表达你的心意！").m211450g("无需配对，直接向对方表达你的心意！").m211445a();
            case 63:
                return xx80.m211444b().m211454k(privilege).m211458o("精选展示男性用户探探信用分").m211456m("帮你通过真人认证，真实头像，举报记录等信息评估男性用户").m211450g("帮你通过真人认证，真实头像，举报记录等信息评估男性用户").m211452i(d3c0.f83683O).m211447d(d3c0.f84114t6).m211445a();
            case 64:
                if (sab0.m182899q(purchaseType)) {
                    str8 = zz6.m221004u0() ? "他" : "她";
                }
                return xx80.m211444b().m211458o(String.format("解锁更了解%s模块", str8)).m211456m(String.format("了解%s的性格，看%s是否和你合拍", str8, str8)).m211450g(String.format("了解%s的性格，看%s是否和你合拍", str8, str8)).m211454k(privilege).m211452i(zz6.m221004u0() ? d3c0.f83697P : d3c0.f83608I8).m211447d(zz6.m221004u0() ? d3c0.f84058p6 : d3c0.f84128u6).m211445a();
            case 65:
                return xx80.m211444b().m211454k(privilege).m211458o("广告免打扰").m211456m("一键关闭开屏广告，高效社交无需等待，24h后生效").m211450g("一键关闭开屏广告，高效社交无需等待，24h后生效").m211452i(d3c0.f83711Q).m211447d(d3c0.f84072q6).m211445a();
            case 66:
                return xx80.m211444b().m211454k(privilege).m211458o("直接屏蔽骚扰词").m211456m("帮你直接拦截骚扰词，聊天更安心").m211450g("帮你直接拦截骚扰词，聊天更安心").m211452i(d3c0.f83669N).m211447d(d3c0.f84086r6).m211445a();
            case 67:
                return xx80.m211444b().m211454k(privilege).m211458o("任意修改定位").m211456m("前往学校附近、旅行目的地或任意地方交友").m211450g("前往学校附近、旅行目的地或任意地方交友").m211452i(d3c0.f83669N).m211447d(d3c0.f84086r6).m211445a();
            case 68:
                return xx80.m211444b().m211454k(privilege).m211458o(String.format("每天%s次免费找搭子特权", Integer.valueOf(CoreModule.f17545c.f19598Q1.f20117R.m34755I()))).m211456m("直接和你心仪的对象发起私聊，邀约无需等待").m211450g("直接和你心仪的对象发起私聊，邀约无需等待").m211452i(d3c0.f84189yb).m211445a();
            case 69:
                return xx80.m211444b().m211454k(privilege).m211458o(String.format("每天%s次额外免费盲盒", Integer.valueOf(CoreModule.f17545c.f19598Q1.f20117R.m34754H()))).m211456m("开启惊喜盲盒对象，认识有趣的新朋友").m211450g("开启惊喜盲盒对象，认识有趣的新朋友").m211452i(d3c0.f84203zb).m211445a();
            case 70:
                String str17 = zz6.m221004u0() ? "优先让他看见你，知晓你的特别心意" : "优先让她看见你，知晓你的特别心意";
                return xx80.m211444b().m211454k(privilege).m211448e(d3c0.f84131u9).m211451h(b1c0.f72568p0, b1c0.f72566o0).m211458o("每天1个超级喜欢").m211456m(str17).m211450g(str17).m211445a();
            case 71:
                return xx80.m211444b().m211454k(privilege).m211458o("查看消息是否已读").m211456m("你发出的消息还没被看到？还是已读不回？").m211450g("你发出的消息还没被看到？还是已读不回？").m211452i(d3c0.f83938gc).m211445a();
            case 72:
                return xx80.m211444b().m211454k(privilege).m211458o("私人定制").m211456m("根据定制需求实时推送，开启专属社交体验").m211450g("根据定制需求实时推送，开启专属社交体验").m211452i(d3c0.f83987k5).m211445a();
            case EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE /* 73 */:
                return xx80.m211444b().m211454k(privilege).m211458o("定向隐身").m211456m("不让距离太近的人看到我，随时保护隐私").m211450g("不让距离太近的人看到我，随时保护隐私").m211452i(d3c0.f83822Y6).m211445a();
            case 74:
                return xx80.m211444b().m211454k(privilege).m211453j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjRDQzE3REQxNTdBNjRGRkNBNUFGRTg1Nzg5QUVENDM5IiwidyI6NzExLCJoIjozNzgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyOTE2MjEzOTkwOTY1OTU5ODIsInB0IjoyMDI1MDYxNzE1fQ.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ijc4NzFCRkFDMUZFQzQzMDc5RDMzMTFDQUMxMDY5MDJCIiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjY5MzIwNDEyNDEwMzU5Mzg4LCJwdCI6MjAyNTA2MTcxNX0.webp").m211457n(R$string.f27619u6).m211455l(R$string.f27608t6).m211449f(R$string.f27608t6).m211445a();
            default:
                return xx80.m211444b().m211454k(privilege).m211445a();
        }
    }

    /* JADX INFO: renamed from: n */
    public static List<wx80> m123718n(final PurchaseType purchaseType, final Privilege privilege, final boolean z) {
        final ArrayList arrayList = new ArrayList();
        if (z && sab0.m182901s(purchaseType)) {
            arrayList.add(m123722r());
            return arrayList;
        }
        vwb.m200354z(purchaseType.getPrivilegeDataForGP(CoreModule.f17545c.f19639e0.m169527p9().gender), new e30() { // from class: l.ay80
            @Override // p149l.e30
            public final void call(Object obj) {
                fy80.m123709e(privilege, arrayList, z, purchaseType, (Privilege) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public static wx80 m123719o(Privilege privilege) {
        int i = C16959a.f99842a[privilege.ordinal()];
        if (i == 1) {
            int i2 = zz6.m221004u0() ? R$string.f27438f1 : R$string.f27426e1;
            return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83760T9).m211448e(d3c0.f84131u9).m211451h(b1c0.f72568p0, b1c0.f72566o0).m211458o("每天3个超级喜欢").m211455l(i2).m211449f(i2).m211445a();
        }
        if (i == 2) {
            String string = CoreModule.f17544b.getString(R$string.f27546o1);
            return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83682Nc).m211448e(d3c0.f83556Ec).m211451h(b1c0.f72576t0, b1c0.f72574s0).m211457n(R$string.f27558p1).m211456m(string).m211450g(string).m211445a();
        }
        if (i == 3) {
            return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83640Kc).m211448e(d3c0.f84134uc).m211451h(b1c0.f72562m0, b1c0.f72560l0).m211457n(R$string.f27344X0).m211455l(R$string.f27333W0).m211449f(R$string.f27333W0).m211445a();
        }
        if (i == 4) {
            boolean zM221004u0 = zz6.m221004u0();
            return xx80.m211444b().m211454k(privilege).m211448e(d3c0.f83514Bc).m211451h(b1c0.f72572r0, b1c0.f72570q0).m211457n(R$string.f27534n1).m211455l(zM221004u0 ? R$string.f27522m1 : R$string.f27510l1).m211449f(zM221004u0 ? R$string.f27522m1 : R$string.f27510l1).m211445a();
        }
        if (i == 30) {
            return xx80.m211444b().m211454k(privilege).m211448e(d3c0.f84064pc).m211451h(b1c0.f72568p0, b1c0.f72566o0).m211458o("隐藏活跃时间").m211456m("隐藏活跃时间").m211450g("隐藏活跃时间").m211445a();
        }
        if (i == 34) {
            return xx80.m211444b().m211454k(privilege).m211458o(CoreModule.f17544b.getString(R$string.f27381a4)).m211456m(CoreModule.f17544b.getString(R$string.f27369Z3)).m211450g(CoreModule.f17544b.getString(R$string.f27369Z3)).m211445a();
        }
        if (i == 52) {
            return xx80.m211444b().m211454k(privilege).m211458o("专属客服").m211456m("一对一专属客服，为你的体验保驾护航").m211450g("一对一专属客服，为你的体验保驾护航").m211445a();
        }
        if (i == 61) {
            String str = String.format(Locale.getDefault(), "每月%次机会，开启后访问其他人，对方将不会看到你的访问记录", Integer.valueOf(CoreModule.m29935P().m94654e().mo34976Xm()));
            return xx80.m211444b().m211454k(privilege).m211458o("隐藏我的访问足迹").m211456m(str).m211450g(str).m211445a();
        }
        if (i == 40) {
            return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83661M5).m211458o(String.format("SVIP全部%s项特权", Integer.valueOf(m123704C()))).m211456m(String.format("包含揭秘喜欢我的人、闪聊匹配、每月3次优先推荐等全部%s项特权", Integer.valueOf(m123704C()))).m211450g(String.format("包含揭秘喜欢我的人、闪聊匹配、每月3次优先推荐等全部%s项特权", Integer.valueOf(m123704C()))).m211445a();
        }
        if (i == 41) {
            String str2 = CoreModule.m29935P().m94651a().mo33423Tr() ? "每天定制推荐优质婚恋用户，助你早日脱单" : "每天更新10个优质认证用户，遇见你的心动";
            return xx80.m211444b().m211454k(privilege).m211452i(zz6.m221004u0() ? d3c0.f83647L5 : d3c0.f83633K5).m211458o("每日心动").m211456m(str2).m211450g(str2).m211445a();
        }
        switch (i) {
            case 6:
                if (!CoreModule.m29935P().m94651a().mo33507h5()) {
                    return xx80.m211444b().m211454k(privilege).m211448e(d3c0.f84131u9).m211451h(b1c0.f72568p0, b1c0.f72566o0).m211457n(R$string.f27221L9).m211456m(CoreModule.f17544b.getString(R$string.f27210K9)).m211450g(CoreModule.f17544b.getString(R$string.f27210K9)).m211445a();
                }
                int i3 = zz6.m221004u0() ? R$string.f27438f1 : R$string.f27426e1;
                return xx80.m211444b().m211454k(privilege).m211448e(d3c0.f84131u9).m211451h(b1c0.f72568p0, b1c0.f72566o0).m211457n(R$string.f27450g1).m211455l(i3).m211449f(i3).m211445a();
            case 7:
                if (!CoreModule.m29935P().m94651a().mo33507h5()) {
                    return xx80.m211444b().m211454k(privilege).m211448e(d3c0.f83514Bc).m211451h(b1c0.f72572r0, b1c0.f72570q0).m211457n(R$string.f27243N9).m211455l(R$string.f27232M9).m211449f(R$string.f27219L7).m211445a();
                }
                boolean zM221004u1 = zz6.m221004u0();
                xx80 xx80VarM211444b = xx80.m211444b();
                xx80VarM211444b.m211454k(privilege).m211448e(d3c0.f83514Bc).m211451h(b1c0.f72572r0, b1c0.f72570q0).m211457n(R$string.f27534n1).m211455l(zM221004u1 ? R$string.f27522m1 : R$string.f27510l1).m211449f(zM221004u1 ? R$string.f27522m1 : R$string.f27510l1);
                if (CoreModule.m29935P().m94651a().mo33433Vf()) {
                    xx80VarM211444b.m211458o("反悔特权");
                    xx80VarM211444b.m211456m(zz6.m221004u0() ? "手滑啦？使用反悔特权，重新喜欢他！" : "手滑啦？使用反悔特权，重新喜欢她！");
                    xx80VarM211444b.m211450g(zz6.m221004u0() ? "手滑啦？使用反悔特权，重新喜欢他！" : "手滑啦？使用反悔特权，重新喜欢她！");
                }
                return xx80VarM211444b.m211445a();
            case 8:
                if (!CoreModule.m29935P().m94651a().mo33507h5()) {
                    return xx80.m211444b().m211454k(privilege).m211448e(d3c0.f83556Ec).m211451h(b1c0.f72576t0, b1c0.f72574s0).m211458o(CoreModule.f17544b.getString(R$string.f27265P9)).m211456m(m123725u()).m211450g(m123725u()).m211445a();
                }
                String string2 = CoreModule.f17544b.getString(R$string.f27546o1);
                return xx80.m211444b().m211454k(privilege).m211448e(d3c0.f83556Ec).m211451h(b1c0.f72576t0, b1c0.f72574s0).m211457n(R$string.f27558p1).m211456m(string2).m211450g(string2).m211445a();
            case 9:
                return CoreModule.m29935P().m94651a().mo33507h5() ? xx80.m211444b().m211454k(privilege).m211448e(d3c0.f84134uc).m211451h(b1c0.f72562m0, b1c0.f72560l0).m211457n(R$string.f27344X0).m211455l(R$string.f27333W0).m211449f(R$string.f27333W0).m211445a() : xx80.m211444b().m211454k(privilege).m211448e(d3c0.f84134uc).m211451h(b1c0.f72562m0, b1c0.f72560l0).m211457n(R$string.f27199J9).m211455l(R$string.f27188I9).m211449f(R$string.f27556p).m211445a();
            case 10:
                return CoreModule.m29935P().m94651a().mo33507h5() ? xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83598Hc).m211458o(m123728x()).m211456m(m123726v()).m211450g(m123726v()).m211445a() : xx80.m211444b().m211454k(privilege).m211448e(d3c0.f84036nc).m211451h(b1c0.f72554i0, b1c0.f72552h0).m211457n(R$string.f27166G9).m211455l(R$string.f27155F9).m211449f(R$string.f27155F9).m211445a();
            default:
                switch (i) {
                    case 12:
                        String string3 = CoreModule.f17544b.getString(R$string.f27544o);
                        String string4 = CoreModule.f17544b.getString(R$string.f27177H9);
                        return xx80.m211444b().m211454k(privilege).m211452i(CoreModule.m29935P().m94654e().mo34983jn()).m211459p(b1c0.f72528R).m211458o(string3).m211456m(string4).m211450g(string4).m211445a();
                    case 13:
                        return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83801Wb).m211459p(b1c0.f72528R).m211458o(CoreModule.f17544b.getString(R$string.f27482i9, t0g0.m186865f(CoreModule.m29935P().m94651a().mo33448Y4()))).m211455l(R$string.f27470h9).m211449f(R$string.f27470h9).m211445a();
                    case 14:
                        return xx80.m211444b().m211454k(privilege).m211452i(TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().gender, "female") ? d3c0.f83801Wb : d3c0.f83814Xb).m211459p(b1c0.f72528R).m211458o(CoreModule.f17544b.getString(R$string.f27609t7)).m211455l(R$string.f27631v7).m211449f(R$string.f27631v7).m211445a();
                    case 15:
                        if (!CoreModule.m29935P().m94651a().mo33507h5()) {
                            return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83855b).m211459p(b1c0.f72528R).m211458o("在线闪聊").m211456m("使用在线闪聊功能立刻获得聊得来的神秘配对，蒙脸聊天一步步发现神秘头像背后的TA！").m211450g("使用在线闪聊功能立刻获得聊得来的神秘配对，蒙脸聊天一步步发现神秘头像背后的TA！").m211445a();
                        }
                        String strMo33341Il = CoreModule.m29935P().m94651a().mo33341Il();
                        return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83855b).m211459p(b1c0.f72528R).m211458o(CoreModule.m29935P().m94651a().mo33621wp()).m211456m(String.format(strMo33341Il, CoreModule.m29935P().m94651a().mo33347Jj())).m211450g(String.format(strMo33341Il, CoreModule.m29935P().m94651a().mo33347Jj())).m211445a();
                    case 16:
                        return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83855b).m211459p(b1c0.f72528R).m211458o("语音闪聊").m211456m(String.format("每天额外1次语音闪聊，随时连线附近的%s", zz6.m221004u0() ? "小哥哥" : "小姐姐")).m211450g(String.format("每天额外1次语音闪聊，随时连线附近的%s", zz6.m221004u0() ? "小哥哥" : "小姐姐")).m211445a();
                    default:
                        switch (i) {
                            case 46:
                                return xx80.m211444b().m211454k(privilege).m211458o(CoreModule.f17544b.getString(R$string.f27368Z2)).m211456m(CoreModule.f17544b.getString(m123712h())).m211450g(CoreModule.f17544b.getString(m123712h())).m211445a();
                            case 47:
                                return xx80.m211444b().m211454k(privilege).m211458o(CoreModule.f17544b.getString(R$string.f27548o3)).m211456m(CoreModule.f17544b.getString(R$string.f27641w6)).m211450g(CoreModule.f17544b.getString(R$string.f27641w6)).m211445a();
                            case 48:
                                return xx80.m211444b().m211454k(privilege).m211458o(CoreModule.f17544b.getString(R$string.f27583r3)).m211456m(CoreModule.f17544b.getString(R$string.f27572q3)).m211450g(CoreModule.f17544b.getString(R$string.f27572q3)).m211445a();
                            case 49:
                                return xx80.m211444b().m211454k(privilege).m211458o(String.format(CoreModule.f17544b.getString(R$string.f27428e3), Integer.valueOf(xma.m210091r3()))).m211456m(CoreModule.f17544b.getString(R$string.f27416d3)).m211450g(CoreModule.f17544b.getString(R$string.f27416d3)).m211445a();
                            case 50:
                                return xx80.m211444b().m211454k(privilege).m211452i(zz6.m221004u0() ? d3c0.f84084r4 : d3c0.f84098s4).m211458o("一键配对").m211456m(String.format("每天额外1次语音闪聊，随时连线附近的%s", zz6.m221004u0() ? "小哥哥" : "小姐姐")).m211450g(String.format("每天额外1次语音闪聊，随时连线附近的%s", zz6.m221004u0() ? "小哥哥" : "小姐姐")).m211445a();
                            default:
                                return null;
                        }
                }
        }
    }

    /* JADX INFO: renamed from: p */
    public static List<wx80> m123720p(final PurchaseType purchaseType, List<Privilege> list, final Privilege privilege) {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(list, new e30() { // from class: l.cy80
            @Override // p149l.e30
            public final void call(Object obj) {
                fy80.m123705a(purchaseType, privilege, arrayList, (Privilege) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    public static List<wx80> m123721q(List<Privilege> list, final Privilege privilege, final PurchaseType purchaseType) {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(list, new e30() { // from class: l.zx80
            @Override // p149l.e30
            public final void call(Object obj) {
                fy80.m123707c(purchaseType, privilege, arrayList, (Privilege) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: r */
    public static wx80 m123722r() {
        String string;
        CoreLikers.C4719a c4719aM30471r5 = CoreModule.f17545c.f19687u0.m30471r5();
        int i = c4719aM30471r5 == null ? 0 : c4719aM30471r5.f19270b;
        xx80 xx80VarM211457n = xx80.m211444b().m211454k(null).m211452i(d3c0.f84148vc).m211457n(R$string.f27554o9);
        if (i > 0) {
            string = CoreModule.f17544b.getString(R$string.f27542n9, i + "");
        } else {
            string = CoreModule.f17544b.getString(R$string.f27530m9);
        }
        return xx80VarM211457n.m211456m(string).m211449f(R$string.f27518l9).m211445a();
    }

    /* JADX INFO: renamed from: s */
    public static String m123723s(PurchaseType purchaseType) {
        return sab0.m182897o(purchaseType) ? "展示 白金会员 尊贵标识，或者低调地隐藏会员身份" : CoreModule.f17544b.getString(R$string.f27474i1);
    }

    /* JADX INFO: renamed from: t */
    public static String m123724t() {
        return CoreModule.f17544b.getString(R$string.f27486j1);
    }

    /* JADX INFO: renamed from: u */
    public static String m123725u() {
        return CoreModule.f17544b.getString(R$string.f27254O9);
    }

    /* JADX INFO: renamed from: v */
    public static String m123726v() {
        return CoreModule.f17544b.getString(R$string.f27581r1);
    }

    /* JADX INFO: renamed from: w */
    public static String m123727w() {
        return CoreModule.f17544b.getString(R$string.f27570q1);
    }

    /* JADX INFO: renamed from: x */
    public static String m123728x() {
        return CoreModule.f17544b.getString(R$string.f27592s1);
    }

    /* JADX INFO: renamed from: y */
    public static ArrayList<Privilege> m123729y() {
        return PurchaseType.TYPE_GET_VIP.getPrivilegeData(CoreModule.f17545c.f19639e0.m169527p9().gender);
    }

    /* JADX INFO: renamed from: z */
    public static ArrayList<Privilege> m123730z() {
        return PurchaseType.TYPE_GET_VIP.getPrivilegeDataForGP(CoreModule.f17545c.f19639e0.m169527p9().gender);
    }
}
