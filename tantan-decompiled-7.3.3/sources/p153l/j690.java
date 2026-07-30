package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.spongycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes11.dex */
public class j690 {

    /* JADX INFO: renamed from: a */
    public static boolean f118534a;

    /* JADX INFO: renamed from: l.j690$a */
    public static /* synthetic */ class C17886a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f118535a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f118535a = iArr;
            try {
                iArr[Privilege.superlike_pkg.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f118535a[Privilege.likeNoLimit_pkg.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f118535a[Privilege.roaming_pkg.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f118535a[Privilege.undo_pkg.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f118535a[Privilege.intl_no_ad.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f118535a[Privilege.vip_super_like.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f118535a[Privilege.vip_undo.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f118535a[Privilege.vip_unlimited_likes.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f118535a[Privilege.vip_location.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f118535a[Privilege.vip_badge.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f118535a[Privilege.vip_independent_super_like.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f118535a[Privilege.boost.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f118535a[Privilege.see_not_match_guide.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f118535a[Privilege.see_who_likes_me.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f118535a[Privilege.online_match_tickets.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f118535a[Privilege.voice_quick_chat.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f118535a[Privilege.privacy_membership.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f118535a[Privilege.message_read_state.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f118535a[Privilege.recover_unmatches.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f118535a[Privilege.svip_badge.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f118535a[Privilege.letter.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f118535a[Privilege.greet.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f118535a[Privilege.top_like.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f118535a[Privilege.top_chat.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f118535a[Privilege.vip_greet.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f118535a[Privilege.svip_greet.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f118535a[Privilege.leave_message.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f118535a[Privilege.vip_letter_gp.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f118535a[Privilege.advanced_filter.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f118535a[Privilege.vip_membership_active_time_gp.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f118535a[Privilege.vip_membership_read_gp.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f118535a[Privilege.vip_membership_remark_gp.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f118535a[Privilege.vip_membership_search_gp.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f118535a[Privilege.liked_user.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f118535a[Privilege.vip_message_block_gp.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f118535a[Privilege.see_theme_unlock_more.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f118535a[Privilege.see_theme_unlock_pop.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f118535a[Privilege.see_theme_unlock_online.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f118535a[Privilege.see_letter_gp.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f118535a[Privilege.svipPicksMembership.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f118535a[Privilege.picksMembership.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f118535a[Privilege.oDiamondSvipExtra.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f118535a[Privilege.oDiamondSvipSkin.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f118535a[Privilege.oDiamondGreetings.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f118535a[Privilege.oDiamondVisitor.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f118535a[Privilege.loveBuzz.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f118535a[Privilege.intl_advanced_filter.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f118535a[Privilege.intl_visitor.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f118535a[Privilege.premium_compliment.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f118535a[Privilege.immediately_match.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f118535a[Privilege.live_entry_animation.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f118535a[Privilege.customer_service.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f118535a[Privilege.say_hi_pkg.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f118535a[Privilege.moment_boost.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f118535a[Privilege.accelerate_pairing.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f118535a[Privilege.city_topping.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f118535a[Privilege.personal_customization.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f118535a[Privilege.mysterious_mode.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f118535a[Privilege.nearby_people.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f118535a[Privilege.exclusive_dressing_up.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f118535a[Privilege.visitor_hide_footprint.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f118535a[Privilege.confession_first.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f118535a[Privilege.pick_tantan_credits_users.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f118535a[Privilege.unlock_learn_about_him_module.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f118535a[Privilege.ads_not_disturb.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f118535a[Privilege.block_harassing_words.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f118535a[Privilege.youth_roaming.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f118535a[Privilege.youth_find_partner.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f118535a[Privilege.youth_blind_box.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f118535a[Privilege.youth_superlike.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f118535a[Privilege.youth_message_read.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f118535a[Privilege.private_custom.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f118535a[Privilege.hide_me_from_nearby.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f118535a[Privilege.tribe.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public static ArrayList<Privilege> m143606A() {
        ArrayList<Privilege> arrayListM143634z = m143634z();
        ArrayList<Privilege> privilegeDataForGP = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP(CoreModule.f18264c.f20381e0.m116600p9().gender);
        Privilege privilege = Privilege.svip_badge;
        List listM147501c0 = jyb.m147501c0(privilegeDataForGP, privilege);
        listM147501c0.add(0, privilege);
        return (ArrayList) jyb.m147526p(arrayListM143634z, listM147501c0);
    }

    /* JADX INFO: renamed from: B */
    public static void m143607B(boolean z) {
        f118534a = z;
    }

    /* JADX INFO: renamed from: C */
    public static int m143608C() {
        return 14;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m143609a(PurchaseType purchaseType, Privilege privilege, List list, Privilege privilege2) {
        a690 a690VarM143621m = m143621m(purchaseType, privilege2);
        a690VarM143621m.m96287Z(true);
        if (NullChecker.m82486a(privilege) && privilege2 == privilege) {
            list.add(0, a690VarM143621m);
        } else if (NullChecker.m82486a(privilege2)) {
            list.add(a690VarM143621m);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m143610b(Privilege privilege, List list, Privilege privilege2) {
        PurchaseType purchaseType = PurchaseType.TYPE_O_DIAMOND;
        a690 a690VarM143621m = m143621m(purchaseType, privilege2);
        a690VarM143621m.m96278Q(true);
        if (NullChecker.m82486a(privilege) && privilege2 == privilege) {
            list.add(0, a690VarM143621m);
        } else if (NullChecker.m82486a(privilege) && !purchaseType.getPrivilegeData(null).contains(privilege) && privilege2 == Privilege.oDiamondSvipExtra) {
            list.add(0, a690VarM143621m);
        } else {
            list.add(a690VarM143621m);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m143611c(PurchaseType purchaseType, Privilege privilege, List list, Privilege privilege2) {
        a690 a690VarM143621m = m143621m(purchaseType, privilege2);
        a690VarM143621m.m96297e0(true);
        if (NullChecker.m82486a(privilege) && privilege2 == privilege) {
            list.add(0, a690VarM143621m);
        } else if (NullChecker.m82486a(privilege2)) {
            list.add(a690VarM143621m);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m143612d(List list, Privilege privilege, List list2, Privilege privilege2) {
        a690 a690VarM143620l = m143620l(privilege2);
        if (list.size() > 1) {
            a690VarM143620l.m96295d0(true);
        } else {
            a690VarM143620l.m96280S(true);
        }
        if (NullChecker.m82486a(privilege) && privilege2 == privilege) {
            list2.add(0, a690VarM143620l);
        } else if (NullChecker.m82486a(privilege2)) {
            list2.add(a690VarM143620l);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m143613e(Privilege privilege, List list, boolean z, PurchaseType purchaseType, Privilege privilege2) {
        if (NullChecker.m82486a(privilege) && privilege2 == privilege) {
            list.add(z ? 1 : 0, m143621m(purchaseType, privilege2));
        } else if (NullChecker.m82486a(privilege2)) {
            list.add(m143621m(purchaseType, privilege2));
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m143614f(Privilege privilege, List list, Privilege privilege2) {
        a690 a690VarM143621m = m143621m(PurchaseType.TYPE_O_PLATINUM, privilege2);
        a690VarM143621m.m96281T(true);
        if (NullChecker.m82486a(privilege) && privilege2 == privilege) {
            list.add(0, a690VarM143621m);
        } else if (NullChecker.m82486a(privilege2)) {
            list.add(a690VarM143621m);
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m143615g() {
        return CoreModule.f18263b.getString(R$string.f28112P8);
    }

    /* JADX INFO: renamed from: h */
    public static int m143616h() {
        return CoreModule.m30933P().m143406b().mo36095Bs() ? R$string.f28205Y2 : R$string.f28194X2;
    }

    /* JADX INFO: renamed from: i */
    public static List<a690> m143617i(List<Privilege> list, final Privilege privilege) {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(list, new y20() { // from class: l.h690
            @Override // p153l.y20
            public final void call(Object obj) {
                j690.m143610b(privilege, arrayList, (Privilege) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static List<a690> m143618j(final List<Privilege> list, final Privilege privilege) {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(list, new y20() { // from class: l.f690
            @Override // p153l.y20
            public final void call(Object obj) {
                j690.m143612d(list, privilege, arrayList, (Privilege) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public static List<a690> m143619k(List<Privilege> list, final Privilege privilege) {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(list, new y20() { // from class: l.i690
            @Override // p153l.y20
            public final void call(Object obj) {
                j690.m143614f(privilege, arrayList, (Privilege) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public static a690 m143620l(Privilege privilege) {
        return m143621m(null, privilege);
    }

    /* JADX INFO: renamed from: m */
    public static a690 m143621m(PurchaseType purchaseType, Privilege privilege) {
        String str;
        String strMo34624wp;
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
        switch (C17886a.f118535a[privilege.ordinal()]) {
            case 1:
                int i5 = c17.m107528u0() ? R$string.f28286f1 : R$string.f28274e1;
                return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119415T9).m102714e(jbc0.f119786u9).m102717h(h9c0.f108388p0, h9c0.f108386o0).m102724o("每天3个超级喜欢").m102721l(i5).m102715f(i5).m102711a();
            case 2:
                String string = CoreModule.f18263b.getString(R$string.f28394o1);
                return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119337Nc).m102714e(jbc0.f119211Ec).m102717h(h9c0.f108396t0, h9c0.f108394s0).m102723n(R$string.f28406p1).m102722m(string).m102716g(string).m102711a();
            case 3:
                return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119295Kc).m102714e(jbc0.f119789uc).m102717h(h9c0.f108382m0, h9c0.f108380l0).m102723n(R$string.f28192X0).m102721l(R$string.f28181W0).m102715f(R$string.f28181W0).m102711a();
            case 4:
                boolean zM107528u0 = c17.m107528u0();
                return b690.m102710b().m102720k(privilege).m102714e(jbc0.f119169Bc).m102717h(h9c0.f108392r0, h9c0.f108390q0).m102723n(R$string.f28382n1).m102721l(zM107528u0 ? R$string.f28049K0 : R$string.f28038J0).m102715f(zM107528u0 ? R$string.f28049K0 : R$string.f28038J0).m102711a();
            case 5:
                return b690.m102710b().m102720k(privilege).m102719j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/raw/7e9d55ce-e487-41fe-8dd2-7a0147470ef110.webp" : "https://auto.tancdn.com/v1/raw/55c2177d-65e6-4c75-801a-499403525f5e10.webp").m102723n(R$string.f28445s6).m102721l(R$string.f28434r6).m102715f(R$string.f28434r6).m102711a();
            case 6:
                if (CoreModule.m30933P().m143405a().mo34510h5()) {
                    String string2 = CoreModule.f18263b.getString(c17.m107528u0() ? R$string.f28286f1 : R$string.f28274e1);
                    String string3 = (wib0.m206565i(purchaseType) || wib0.m206566j(purchaseType)) ? "无限次超级喜欢" : CoreModule.f18263b.getString(R$string.f28298g1);
                    if (wib0.m206577u(purchaseType)) {
                        string3 = "无限次超级喜欢";
                        string2 = "无限次超级喜欢，使用后让你的喜欢脱颖而出！";
                    }
                    return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119415T9).m102714e(jbc0.f119786u9).m102717h(h9c0.f108388p0, h9c0.f108386o0).m102724o(string3).m102722m(string2).m102716g(string2).m102711a();
                }
                String string4 = CoreModule.f18263b.getString(R$string.f28178V8);
                str = IntlCountryCodeController.m29125v() ? "https://auto.tancdn.com/v1/raw/4ad5dbbb-6860-4461-b45f-9a6209d7df6f11.webp" : "https://auto.tancdn.com/v1/raw/d81da4e9-8ed7-4917-a1fd-05a5446adab710.webp";
                PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                if (purchaseType == purchaseType2) {
                    str = IntlCountryCodeController.m29125v() ? "https://auto.tancdn.com/v1/raw/b8927b15-478d-4a2b-b514-2da53e084ae010.webp" : "https://auto.tancdn.com/v1/raw/0750872a-d3b6-4b59-afec-3ed32fbb5e5511.webp";
                }
                int i6 = R$string.f28211Y8;
                if (purchaseType == purchaseType2 && gta.m132210e().m132214d().mo34737Oi()) {
                    i6 = IntlCountryCodeController.m29125v() ? R$string.f28312h3 : R$string.f28300g3;
                }
                b690 b690VarM102710b = b690.m102710b();
                b690VarM102710b.m102720k(privilege).m102719j(str).m102723n(i6).m102721l(R$string.f28178V8).m102716g(string4);
                return b690VarM102710b.m102711a();
            case 7:
                if (!CoreModule.m30933P().m143405a().mo34510h5()) {
                    String str9 = IntlCountryCodeController.m29125v() ? "https://auto.tancdn.com/v1/raw/1c363bb1-527a-4e73-bf75-af3337532e8711.webp" : "https://auto.tancdn.com/v1/raw/efbb251e-8a64-450e-80e4-af960390eabd11.webp";
                    if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                        str9 = IntlCountryCodeController.m29125v() ? "https://auto.tancdn.com/v1/raw/8e0c607c-ba1e-4754-8b7a-9ec6ceef9dfd11.webp" : "https://auto.tancdn.com/v1/raw/3e3a2ee9-7170-4b5b-92f7-d4f4dfca3dc311.webp";
                    }
                    b690 b690VarM102710b2 = b690.m102710b();
                    b690VarM102710b2.m102720k(privilege).m102719j(str9).m102724o(CoreModule.f18263b.getString(R$string.f28222Z8)).m102721l(R$string.f28156T8).m102716g(CoreModule.f18263b.getString(R$string.f28156T8));
                    return b690VarM102710b2.m102711a();
                }
                boolean zM107528u1 = c17.m107528u0();
                b690 b690VarM102710b3 = b690.m102710b();
                b690VarM102710b3.m102720k(privilege).m102718i(jbc0.f119323Mc).m102714e(jbc0.f119169Bc).m102717h(h9c0.f108392r0, h9c0.f108390q0).m102723n(R$string.f28382n1).m102721l(zM107528u1 ? R$string.f28049K0 : R$string.f28038J0).m102715f(zM107528u1 ? R$string.f28049K0 : R$string.f28038J0);
                if (CoreModule.m30933P().m143405a().mo34436Vf()) {
                    b690VarM102710b3.m102724o("反悔特权");
                    b690VarM102710b3.m102722m(c17.m107528u0() ? "手滑啦？使用反悔特权，重新喜欢他！" : "手滑啦？使用反悔特权，重新喜欢她！");
                    b690VarM102710b3.m102716g(c17.m107528u0() ? "手滑啦？使用反悔特权，重新喜欢他！" : "手滑啦？使用反悔特权，重新喜欢她！");
                }
                return b690VarM102710b3.m102711a();
            case 8:
                if (CoreModule.m30933P().m143405a().mo34510h5()) {
                    String string5 = CoreModule.f18263b.getString(R$string.f28394o1);
                    return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119337Nc).m102714e(jbc0.f119211Ec).m102717h(h9c0.f108396t0, h9c0.f108394s0).m102723n(R$string.f28406p1).m102722m(string5).m102716g(string5).m102711a();
                }
                String str10 = IntlCountryCodeController.m29125v() ? "https://auto.tancdn.com/v1/raw/1216f433-f408-44a2-add9-e3a9969270c611.webp" : "https://auto.tancdn.com/v1/raw/9e7625c5-4002-421b-bf5c-fb6ed0ea90ee11.webp";
                if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                    str10 = IntlCountryCodeController.m29125v() ? "https://auto.tancdn.com/v1/raw/8a46ab26-dd56-484a-bd09-43ee42fd5e1311.webp" : "https://auto.tancdn.com/v1/raw/406c7711-a037-4e25-8acf-db68636ebce010.webp";
                }
                return b690.m102710b().m102720k(privilege).m102719j(str10).m102723n(R$string.f28189W8).m102722m(m143615g()).m102716g(m143615g()).m102711a();
            case 9:
                if (CoreModule.m30933P().m143405a().mo34510h5()) {
                    return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119295Kc).m102714e(jbc0.f119789uc).m102717h(h9c0.f108382m0, h9c0.f108380l0).m102723n(R$string.f28192X0).m102721l(R$string.f28181W0).m102715f(R$string.f28181W0).m102711a();
                }
                return b690.m102710b().m102720k(privilege).m102719j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/raw/fad6222d-a1b8-4505-8537-48f54a09580111.webp" : "https://auto.tancdn.com/v1/raw/30a18977-468d-4e52-a7ff-c69087efcfa411.webp").m102723n(R$string.f28192X0).m102721l(R$string.f28181W0).m102715f(R$string.f28123Q8).m102711a();
            case 10:
                if (CoreModule.m30933P().m143405a().mo34510h5()) {
                    return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119253Hc).m102714e(jbc0.f119691nc).m102717h(h9c0.f108374i0, h9c0.f108372h0).m102724o(m143632x()).m102722m(m143630v()).m102716g(m143630v()).m102711a();
                }
                int i7 = R$string.f28234a9;
                int i8 = R$string.f28167U8;
                if (PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE == purchaseType) {
                    i7 = R$string.f28165U6;
                    i8 = R$string.f28154T6;
                } else {
                    str6 = "https://auto.tancdn.com/v1/raw/471883b1-4132-4349-a95a-5806d9df838510.webp";
                }
                return b690.m102710b().m102720k(privilege).m102719j(str6).m102723n(i7).m102721l(i8).m102715f(i8).m102711a();
            case 11:
                str = IntlCountryCodeController.m29125v() ? "https://auto.tancdn.com/v1/raw/4ad5dbbb-6860-4461-b45f-9a6209d7df6f11.webp" : "https://auto.tancdn.com/v1/raw/d81da4e9-8ed7-4917-a1fd-05a5446adab710.webp";
                if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                    str = IntlCountryCodeController.m29125v() ? "https://auto.tancdn.com/v1/raw/b8927b15-478d-4a2b-b514-2da53e084ae010.webp" : "https://auto.tancdn.com/v1/raw/0750872a-d3b6-4b59-afec-3ed32fbb5e5511.webp";
                }
                return b690.m102710b().m102720k(privilege).m102719j(str).m102723n(R$string.f28211Y8).m102721l(R$string.f28145S8).m102715f(R$string.f28145S8).m102711a();
            case 12:
                if (purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                    return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119267Ic).m102714e(jbc0.f119650l).m102717h(h9c0.f108359b, h9c0.f108357a).m102724o(CoreModule.f18263b.getString(R$string.f28392o)).m102721l(R$string.f28332j).m102715f(R$string.f28332j).m102711a();
                }
                int i9 = R$string.f28411p6;
                int i10 = R$string.f28423q6;
                return b690.m102710b().m102720k(privilege).m102719j("https://auto.tancdn.com/v1/raw/11c58ba4-4e09-4b06-907e-46899bf7117611.webp").m102723n(i9).m102721l(i10).m102715f(i10).m102711a();
            case 13:
            case 14:
                return purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? b690.m102710b().m102720k(privilege).m102719j("https://auto.tancdn.com/v1/raw/9a4c7c22-b275-44ab-8ebb-aeebc7e0a84210.webp").m102723n(R$string.f28457t7).m102722m(CoreModule.f18263b.getResources().getString(R$string.f28479v7)).m102715f(R$string.f28479v7).m102711a() : b690.m102710b().m102720k(privilege).m102718i(jbc0.f119579fc).m102714e(jbc0.f119761sc).m102724o(CoreModule.f18263b.getString(R$string.f28468u7)).m102722m(CoreModule.f18263b.getResources().getString(R$string.f28479v7)).m102716g(CoreModule.f18263b.getResources().getString(R$string.f28479v7)).m102711a();
            case 15:
                if (!CoreModule.m30933P().m143405a().mo34510h5()) {
                    return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119511b0).m102723n(R$string.f28292f7).m102721l(R$string.f28220Z6).m102715f(R$string.f28220Z6).m102711a();
                }
                if (wib0.m206565i(purchaseType) || wib0.m206566j(purchaseType)) {
                    strMo34624wp = "无限次在线闪聊";
                } else {
                    strMo34624wp = wib0.m206577u(purchaseType) ? "无限次闪聊匹配" : CoreModule.m30933P().m143405a().mo34624wp();
                }
                if (wib0.m206565i(purchaseType) || wib0.m206566j(purchaseType)) {
                    str2 = c17.m107528u0() ? "无限次在线闪聊匹配附近在线的小哥哥，无需相互喜欢，直接在线开聊" : "无限次在线闪聊匹配附近在线的小姐姐，无需相互喜欢，直接在线开聊";
                } else {
                    str2 = wib0.m206577u(purchaseType) ? "无限次闪聊机会，无需配对，立即开聊！" : String.format(CoreModule.m30933P().m143405a().mo34344Il(), CoreModule.m30933P().m143405a().mo34350Jj());
                }
                return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119511b0).m102724o(strMo34624wp).m102722m(str2).m102716g(str2).m102711a();
            case 16:
                if (wib0.m206565i(purchaseType) || wib0.m206566j(purchaseType)) {
                    str3 = CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? "21" : "4";
                } else {
                    str3 = "1";
                }
                return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119510b).m102725p(h9c0.f108348R).m102724o("语音闪聊").m102722m(String.format("每天额外%s次语音闪聊，随时连线附近的%s", str3, c17.m107528u0() ? "小哥哥" : "小姐姐")).m102716g(String.format("每天额外%s次语音闪聊，随时连线附近的%s", str3, c17.m107528u0() ? "小哥哥" : "小姐姐")).m102711a();
            case 17:
                String string6 = CoreModule.f18263b.getString(R$string.f28203Y0);
                String string7 = CoreModule.f18263b.getString(R$string.f28203Y0);
                if (s7a.m184982k() && wib0.m206563g(purchaseType)) {
                    i = jbc0.f119755s6;
                    string6 = "一键开启冻结活跃时间和隐藏距离位置功能";
                    string7 = "一键开启冻结活跃时间和隐藏距离位置功能";
                } else {
                    if (CoreModule.m30933P().m143405a().mo34634z1()) {
                        string6 = "隐藏我的位置、最后活跃时间和年龄信息，隐私更有保障";
                        string7 = "隐藏我的位置、最后活跃时间和年龄信息，隐私更有保障";
                    }
                    i = 0;
                }
                if (CoreModule.m30933P().m143412i().mo180364N()) {
                    string6 = "只让你右滑的人看到你，还可隐藏年龄、位置等信息";
                    string7 = "只让你右滑的人看到你，还可隐藏年龄、位置等信息";
                }
                return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119309Lc).m102713d(i).m102723n(R$string.f28214Z0).m102722m(string7).m102716g(string6).m102711a();
            case 18:
                int i11 = R$string.f28238b1;
                int i12 = R$string.f28226a1;
                if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && CoreModule.m30933P().m143405a().mo34445Xi()) {
                    i11 = R$string.f28375m6;
                    i12 = R$string.f28387n6;
                }
                return b690.m102710b().m102720k(privilege).m102719j("https://auto.tancdn.com/v1/raw/1ed2b13c-d582-4afa-8c09-32d9fc4f2f9a10.webp").m102723n(i11).m102721l(i12).m102715f(i12).m102711a();
            case 19:
                return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119294Kb).m102723n(R$string.f28262d1).m102721l(R$string.f28250c1).m102715f(R$string.f28250c1).m102711a();
            case 20:
                return CoreModule.m30933P().m143405a().mo34510h5() ? b690.m102710b().m102720k(privilege).m102718i(jbc0.f119565ec).m102724o(m143628t()).m102722m(m143627s(purchaseType)).m102716g(m143627s(purchaseType)).m102711a() : b690.m102710b().m102720k(privilege).m102719j("https://auto.tancdn.com/v1/raw/f6c163cb-aa67-455d-b289-5953e6d9b54411.webp").m102724o(m143632x()).m102722m(m143630v()).m102716g(m143631w()).m102711a();
            case 21:
                boolean zM107528u2 = c17.m107528u0();
                return b690.m102710b().m102720k(privilege).m102723n(zM107528u2 ? R$string.f28170V0 : R$string.f28159U0).m102718i(jbc0.f119266Ib).m102721l(zM107528u2 ? R$string.f28148T0 : R$string.f28137S0).m102715f(zM107528u2 ? R$string.f28148T0 : R$string.f28137S0).m102711a();
            case 22:
                return b690.m102710b().m102720k(privilege).m102724o("专属礼物").m102718i(jbc0.f119591ga).m102713d(jbc0.f119679n0).m102722m(String.format("每天%s个免费礼物，用礼物表达心意", "2")).m102716g(String.format("每天%s个免费礼物，用礼物表达心意", "2")).m102711a();
            case 23:
                boolean zM107528u3 = c17.m107528u0();
                String str11 = String.format("让%s第一个滑到你，每天3次抢占配对先机！", zM107528u3 ? "他" : "她");
                int i13 = zM107528u3 ? jbc0.f119735r0 : jbc0.f119721q0;
                int i14 = zM107528u3 ? jbc0.f119647ka : jbc0.f119633ja;
                if (s7a.m184989r()) {
                    str11 = String.format("让%s第一个滑到你的卡片，每天3次抢占配对先机！", zM107528u3 ? "他" : "她");
                    i14 = CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? jbc0.f119398S5 : jbc0.f119411T5;
                    str4 = "卡片插队";
                } else {
                    str4 = "置顶喜欢";
                }
                return b690.m102710b().m102720k(privilege).m102724o(str4).m102718i(i13).m102713d(i14).m102722m(str11).m102716g(str11).m102711a();
            case 24:
                boolean zM107528u4 = c17.m107528u0();
                String str12 = zM107528u4 ? "在他收到的消息中置顶，更快收到回复！" : "在她收到的消息中置顶，更快收到回复！";
                return b690.m102710b().m102720k(privilege).m102724o(zM107528u4 ? "成为他的置顶聊天" : "成为她的置顶聊天").m102718i(zM107528u4 ? jbc0.f119707p0 : jbc0.f119693o0).m102713d(zM107528u4 ? jbc0.f119619ia : jbc0.f119605ha).m102722m(str12).m102716g(str12).m102711a();
            case 25:
                return b690.m102710b().m102720k(privilege).m102724o("会员专享礼物").m102718i(jbc0.f119661la).m102713d(jbc0.f119665m0).m102722m("每月专享10个礼物，向喜欢的人打招呼表达特别心意").m102716g("每月专享10个礼物，向喜欢的人打招呼表达特别心意").m102711a();
            case 26:
                String string8 = CoreModule.f18263b.getString(R$string.f28363l6);
                String string9 = CoreModule.f18263b.getString(R$string.f28351k6);
                return b690.m102710b().m102720k(privilege).m102719j("https://auto.tancdn.com/v1/raw/1e055c6e-1294-4455-b39b-25165fc3c4a112.webp").m102724o(string8).m102722m(string9).m102716g(string9).m102711a();
            case 27:
                boolean zM107528u5 = c17.m107528u0();
                return b690.m102710b().m102720k(privilege).m102724o("每天5条\"资料留言\"").m102718i(!zM107528u5 ? jbc0.f119759sa : jbc0.f119773ta).m102722m(String.format("让%s第一时间看到你，配对几率提升3倍", !zM107528u5 ? "她" : "他")).m102716g(String.format("通过给资料留言，让%s第一时间看到你，配对几率提升3倍", zM107528u5 ? "他" : "她")).m102711a();
            case 28:
                boolean zM107528u6 = c17.m107528u0();
                return b690.m102710b().m102720k(privilege).m102723n(zM107528u6 ? R$string.f28170V0 : R$string.f28159U0).m102721l(zM107528u6 ? R$string.f28148T0 : R$string.f28137S0).m102715f(zM107528u6 ? R$string.f28148T0 : R$string.f28137S0).m102718i(CoreModule.m30933P().m143405a().mo34505fo()).m102711a();
            case 29:
                if (!CoreModule.m30933P().m143405a().mo34510h5()) {
                    return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119706p).m102724o("高级筛选").m102722m("更多筛选条件，遇见相似的人").m102716g(CoreModule.m30933P().m143405a().mo34510h5() ? "更多筛选条件，遇见相似的人" : "更多筛选条件\n遇见相似的人").m102711a();
                }
                String string10 = CoreModule.f18263b.getString(R$string.f28104P0);
                String string11 = CoreModule.f18263b.getString(R$string.f28104P0);
                if (CoreModule.m30933P().m143405a().mo34634z1()) {
                    string10 = "优先看真实头像认证、最受欢迎、当前在线的用户，只看我的理想型";
                    string11 = "优先看真实头像认证、最受欢迎、当前在线的用户，只看我的理想型";
                }
                return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119706p).m102723n(R$string.f28115Q0).m102722m(string11).m102716g(string10).m102711a();
            case 30:
                return b690.m102710b().m102720k(privilege).m102719j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/raw/d4b2a799-22f7-4973-ac67-1b2084a0ea5310.webp" : "https://auto.tancdn.com/v1/raw/8a5d2dc5-4f66-4903-b7f7-eec6197d5b1711.webp").m102723n(R$string.f28007G2).m102721l(R$string.f28018H2).m102715f(R$string.f28029I2).m102711a();
            case 31:
                return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119747rc).m102714e(jbc0.f119733qc).m102717h(h9c0.f108378k0, h9c0.f108376j0).m102723n(R$string.f28150T2).m102721l(R$string.f28139S2).m102715f(R$string.f28139S2).m102711a();
            case 32:
                return b690.m102710b().m102720k(privilege).m102719j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkhTU0dQRTZPTkRBRFpCSkdQQTJORExPVkc2Q0Y0RjEwIiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDIyODk1NTIzMzkwOTUwOTM0fQ.png" : "https://auto.tancdn.com/v1/raw/7b981e39-f2fa-4441-9cd3-7908c69650ab10.webp").m102723n(R$string.f28019H3).m102721l(R$string.f28030I3).m102715f(R$string.f28041J3).m102711a();
            case 33:
                return b690.m102710b().m102720k(privilege).m102719j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/images/eyJpZCI6IloyWFdESVVWRkNLUFhZNUFYNFZZRFBTTFRZUkhHRTEwIiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMTc2OTQyOTIzMjkwOTA4MTc0fQ.png" : "https://auto.tancdn.com/v1/raw/6375caf8-5b50-4426-be1f-a3b88a12fe6e11.webp").m102723n(R$string.f27986E3).m102721l(R$string.f27997F3).m102715f(R$string.f28008G3).m102711a();
            case 34:
                return b690.m102710b().m102720k(privilege).m102719j(IntlCountryCodeController.m29125v() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IktXQkVFRzZHMkZGQU8yRzdXTzNTN01SUlhDREhPSzEzIiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNjg5MzQ4ODQ5NzcyNzI5MTM5fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlNXNTNKU0ZKVFdNSk5HNU5YNDJGSkZJUlhRVldFUTE0IiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTkxNzY2MzgxNzc2MjgxMzk0fQ.png").m102724o(CoreModule.f18263b.getString(R$string.f28464u3)).m102722m(CoreModule.f18263b.getString(R$string.f28217Z3)).m102716g(CoreModule.f18263b.getString(R$string.f28217Z3)).m102711a();
            case 35:
                return b690.m102710b().m102720k(privilege).m102719j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/raw/be3eb17b-9d4e-48dc-b971-7d84414e73c811.webp" : "https://auto.tancdn.com/v1/raw/45513e7b-3754-4ca0-85f8-96f11d94b80710.webp").m102723n(R$string.f28110P6).m102721l(R$string.f28099O6).m102715f(R$string.f28099O6).m102711a();
            case 36:
                User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
                if (NullChecker.m82486a(userM116600p9)) {
                    Settings settings = userM116600p9.settings;
                    if (settings == null || !TEnum.equals(settings.lookingFor, "female")) {
                        i2 = (settings == null || !TEnum.equals(settings.lookingFor, "male")) ? R$string.f28377m8 : R$string.f28401o8;
                    } else {
                        i2 = R$string.f28389n8;
                    }
                } else {
                    i2 = R$string.f28377m8;
                }
                return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119603h8).m102723n(R$string.f28413p8).m102721l(i2).m102715f(i2).m102711a();
            case 37:
                int i15 = CoreModule.m30933P().m143405a().mo34494eg() ? R$string.f28436r8 : R$string.f28425q8;
                return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119631j8).m102723n(R$string.f28447s8).m102721l(i15).m102715f(i15).m102711a();
            case 38:
                int i16 = CoreModule.m30933P().m143405a().mo34494eg() ? R$string.f28469u8 : R$string.f28458t8;
                return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119617i8).m102723n(R$string.f28480v8).m102721l(i16).m102715f(i16).m102711a();
            case 39:
                User userM116600p10 = CoreModule.f18264c.f20381e0.m116600p9();
                if (NullChecker.m82486a(userM116600p10) && userM116600p10.isFemale()) {
                    i3 = R$string.f28372m3;
                } else {
                    i3 = CoreModule.m30933P().m143405a().mo34324G7() ? R$string.f28360l3 : R$string.f28384n3;
                }
                if (NullChecker.m82486a(userM116600p10) && userM116600p10.isFemale()) {
                    i4 = R$string.f28336j3;
                } else {
                    i4 = CoreModule.m30933P().m143405a().mo34324G7() ? R$string.f28324i3 : R$string.f28348k3;
                }
                return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119575f8).m102723n(i3).m102721l(i4).m102715f(i4).m102711a();
            case 40:
                String str13 = String.format("包含揭秘喜欢我的人、闪聊匹配、每月3次优先推荐等全部%s项特权", Integer.valueOf(m143608C()));
                return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119316M5).m102724o(String.format("SVIP全部%s项特权", Integer.valueOf(m143608C()))).m102722m(str13).m102716g(str13).m102711a();
            case 41:
                String string12 = CoreModule.f18263b.getString(R$string.f28183W2);
                String string13 = CoreModule.f18263b.getString(R$string.f28172V2);
                return b690.m102710b().m102720k(privilege).m102719j("https://auto.tancdn.com/v1/images/eyJpZCI6IjZEWklIQ0dUN0FKSUZSNU5WQ0lZNlRXN0I0NlFEWjE0IiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4Njg2Mzg0MzU2OTg5MzczNTh9.png").m102724o(string12).m102722m(string13).m102716g(string13).m102711a();
            case 42:
                return b690.m102710b().m102720k(privilege).m102713d(jbc0.f119544d5).m102718i(jbc0.f119558e5).m102724o("SVIP各项特权").m102722m("包含解密谁喜欢我、高级筛选、隐私保护等全部SVIP特权").m102716g("包含解密谁喜欢我、高级筛选、隐私保护等全部SVIP特权").m102711a();
            case 43:
                return b690.m102710b().m102720k(privilege).m102724o("专属尊贵皮肤").m102722m("专属装扮边框，随时彰显与众不同").m102716g("专属装扮边框，随时彰显与众不同").m102711a();
            case 44:
                str7 = CoreModule.f18276o.m132214d().mo34703I5() ? "无需配对，直接向对方表达你的心意！" : c17.m107528u0() ? "无需送礼物，随时向他打招呼" : "无需送礼物，随时向她打招呼";
                return b690.m102710b().m102720k(privilege).m102724o(CoreModule.f18276o.m132214d().mo34703I5() ? "无限抢先告白" : "无限打招呼").m102722m(str7).m102716g(str7).m102711a();
            case 45:
                return b690.m102710b().m102720k(privilege).m102713d(c17.m107528u0() ? jbc0.f119623j0 : jbc0.f119609i0).m102724o("我的访客").m102722m("知晓谁看过我的资料和动态，不错过每个默默关心我的人").m102716g("知晓谁看过我的资料和动态，不错过每个默默关心我的人").m102711a();
            case 46:
                return b690.m102710b().m102720k(privilege).m102719j(CoreModule.m30933P().m143406b().mo36095Bs() ? "https://auto.tancdn.com/v1/raw/85663437-d130-4bc7-bba1-5821f0b7943c12.webp" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkZPVFE3SVBPRVJWSE1FQ1JSNklUUjdSUkk1M1pXVTEzIiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTE3NzE0NjExMDk3MjM5NzMxOH0.png").m102724o(CoreModule.f18263b.getString(R$string.f28216Z2)).m102722m(CoreModule.f18263b.getString(m143616h())).m102716g(CoreModule.f18263b.getString(m143616h())).m102711a();
            case 47:
                return b690.m102710b().m102720k(privilege).m102719j("https://auto.tancdn.com/v1/raw/7e034371-9f6f-4254-95c6-16b0937f6d2b13.webp").m102724o(CoreModule.f18263b.getString(R$string.f28396o3)).m102722m(CoreModule.f18263b.getString(R$string.f28489w6)).m102716g(CoreModule.f18263b.getString(R$string.f28489w6)).m102711a();
            case 48:
                return b690.m102710b().m102720k(privilege).m102719j("https://auto.tancdn.com/v1/images/eyJpZCI6IlFFM0hMVTQ3M0haWklWVUk0MkdOSzRBQUxPRlQyRDE0IiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4Njg2NDcyMTQ2MTIwOTAzODJ9.png").m102724o(CoreModule.f18263b.getString(R$string.f28431r3)).m102722m(CoreModule.f18263b.getString(R$string.f28420q3)).m102716g(CoreModule.f18263b.getString(R$string.f28420q3)).m102711a();
            case 49:
                return b690.m102710b().m102720k(privilege).m102719j("https://auto.tancdn.com/v1/images/eyJpZCI6IjY5NTcwM0Y2MjE1MTQ1NjI4QUExNTU0QjNCMjBERTVFIiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4Njc1MTI1MzU3OTIwOTQ3MzQsInB0IjoyMDI2MDIwMzE3fQ.png").m102724o(String.format(CoreModule.f18263b.getString(R$string.f28276e3), Integer.valueOf(joa.m146406s3()))).m102722m(CoreModule.f18263b.getString(R$string.f28264d3)).m102716g(CoreModule.f18263b.getString(R$string.f28264d3)).m102711a();
            case 50:
                b690 b690VarM102724o = b690.m102710b().m102720k(privilege).m102713d(c17.m107528u0() ? jbc0.f119595h0 : jbc0.f119581g0).m102718i(c17.m107528u0() ? jbc0.f119739r4 : jbc0.f119753s4).m102724o("一键配对");
                PurchaseType purchaseType3 = PurchaseType.TYPE_SUPREME_PARTNER;
                return b690VarM102724o.m102722m(purchaseType == purchaseType3 ? String.format("一键开聊，无需等待，每天%s次开挂体验!", 5) : String.format("一键与理想型配对开聊，你的喜欢无需等待，尊享每天%s次开挂式体验", Integer.valueOf(c690.m108122a()))).m102716g(purchaseType == purchaseType3 ? String.format("一键开聊，无需等待，每天%s次开挂体验!", 5) : String.format("一键与理想型配对开聊，你的喜欢无需等待，尊享每天%s次开挂式体验", Integer.valueOf(c690.m108122a()))).m102711a();
            case 51:
                return b690.m102710b().m102720k(privilege).m102713d(c17.m107528u0() ? jbc0.f119567f0 : jbc0.f119553e0).m102718i(c17.m107528u0() ? jbc0.f119539d0 : jbc0.f119525c0).m102724o("直播间徽章 入场特效").m102722m("专属徽章和入场特效，成为全场最闪亮的星").m102716g("专属徽章和入场特效，成为全场最闪亮的星").m102711a();
            case 52:
                b690 b690VarM102724o2 = b690.m102710b().m102720k(privilege).m102724o("专属客服");
                PurchaseType purchaseType4 = PurchaseType.TYPE_SUPREME_PARTNER;
                return b690VarM102724o2.m102722m(purchaseType == purchaseType4 ? "一对一专属客服，为您的体验保驾护航" : "一对一专属客服，为你的体验保驾护航").m102716g(purchaseType == purchaseType4 ? "一对一专属客服，为您的体验保驾护航" : "一对一专属客服，为你的体验保驾护航").m102711a();
            case 53:
                b690 b690VarM102724o3 = b690.m102710b().m102720k(privilege).m102724o(CoreModule.f18276o.m132214d().mo34703I5() ? "每天3次抢先告白" : "每天3次打招呼");
                if (CoreModule.f18276o.m132214d().mo34703I5()) {
                    str5 = "无需配对，直接向对方表达你的心意！";
                } else {
                    str5 = String.format("向%s主动表白，真诚赢得对方的心", c17.m107528u0() ? "他" : "她");
                }
                b690 b690VarM102722m = b690VarM102724o3.m102722m(str5);
                if (!CoreModule.f18276o.m132214d().mo34703I5()) {
                    str7 = String.format("向%s主动表白，真诚赢得对方的心", c17.m107528u0() ? "他" : "她");
                }
                return b690VarM102722m.m102716g(str7).m102711a();
            case 54:
                String str14 = (wib0.m206565i(purchaseType) || wib0.m206566j(purchaseType)) ? "全程动态超级曝光" : String.format("每月%s次动态超级曝光", Integer.valueOf(CoreModule.m30932N().mo61539h8()));
                String str15 = (wib0.m206565i(purchaseType) || wib0.m206566j(purchaseType)) ? "发布动态全程开启超级曝光，收获大量点赞互动" : "动态智能精准投放，收获大量浏览互动";
                return b690.m102710b().m102720k(privilege).m102718i(c17.m107528u0() ? jbc0.f119651l0 : jbc0.f119637k0).m102724o(str14).m102722m(str15).m102716g(str15).m102711a();
            case 55:
                return b690.m102710b().m102720k(Privilege.accelerate_pairing).m102724o(String.format("每月%s次加速配对", Integer.valueOf(CoreModule.m30933P().m143408e().mo35994x6()))).m102722m("30分钟内把你优先推荐给喜欢的人，斩获最多10倍配对！").m102716g("30分钟内把你优先推荐给喜欢的人，斩获最多10倍配对！").m102711a();
            case 56:
                return b690.m102710b().m102720k(Privilege.city_topping).m102724o("城市置顶").m102722m("在线期间，您的资料会在第一位，曝光给所在城市中，全部符合您筛选要求的用户").m102716g("在线期间，您的资料会在第一位，曝光给所在城市中，全部符合您筛选要求的用户").m102711a();
            case 57:
                return b690.m102710b().m102720k(Privilege.personal_customization).m102724o("私人定制").m102722m("根据您的喜好，筛选出符合您要求的用户，提升您的社交效率").m102716g("根据您的喜好，筛选出符合您要求的用户，提升您的社交效率").m102711a();
            case 58:
                return b690.m102710b().m102720k(Privilege.mysterious_mode).m102724o("神秘模式").m102722m("神秘人模式，仍可斩获无限喜欢").m102716g("神秘人模式，仍可斩获无限喜欢").m102711a();
            case 59:
                return b690.m102710b().m102720k(Privilege.nearby_people).m102724o("附近的人").m102722m("根据您的地理位置，为您精确搜索附近3公里内的用户").m102716g("根据您的地理位置，为您精确搜索附近3公里内的用户").m102711a();
            case 60:
                return b690.m102710b().m102720k(Privilege.exclusive_dressing_up).m102724o("尊享装扮").m102722m("至尊合伙人独享卡片装扮").m102716g("至尊合伙人独享卡片装扮").m102711a();
            case 61:
                String str16 = String.format(Locale.getDefault(), "每月%d次机会，开启后访问其他人，对方将不会看到你的访问记录", Integer.valueOf(CoreModule.m30933P().m143408e().mo35979Xm()));
                return b690.m102710b().m102720k(privilege).m102724o("隐藏我的访问足迹").m102722m(str16).m102716g(str16).m102711a();
            case 62:
                return b690.m102710b().m102720k(privilege).m102724o(String.format("每天%s次抢先告白", Integer.valueOf(joa.m146408u3()))).m102722m("无需配对，直接向对方表达你的心意！").m102716g("无需配对，直接向对方表达你的心意！").m102711a();
            case 63:
                return b690.m102710b().m102720k(privilege).m102724o("精选展示男性用户探探信用分").m102722m("帮你通过真人认证，真实头像，举报记录等信息评估男性用户").m102716g("帮你通过真人认证，真实头像，举报记录等信息评估男性用户").m102718i(jbc0.f119338O).m102713d(jbc0.f119769t6).m102711a();
            case 64:
                if (wib0.m206573q(purchaseType)) {
                    str8 = c17.m107528u0() ? "他" : "她";
                }
                return b690.m102710b().m102724o(String.format("解锁更了解%s模块", str8)).m102722m(String.format("了解%s的性格，看%s是否和你合拍", str8, str8)).m102716g(String.format("了解%s的性格，看%s是否和你合拍", str8, str8)).m102720k(privilege).m102718i(c17.m107528u0() ? jbc0.f119352P : jbc0.f119263I8).m102713d(c17.m107528u0() ? jbc0.f119713p6 : jbc0.f119783u6).m102711a();
            case 65:
                return b690.m102710b().m102720k(privilege).m102724o("广告免打扰").m102722m("一键关闭开屏广告，高效社交无需等待，24h后生效").m102716g("一键关闭开屏广告，高效社交无需等待，24h后生效").m102718i(jbc0.f119366Q).m102713d(jbc0.f119727q6).m102711a();
            case 66:
                return b690.m102710b().m102720k(privilege).m102724o("直接屏蔽骚扰词").m102722m("帮你直接拦截骚扰词，聊天更安心").m102716g("帮你直接拦截骚扰词，聊天更安心").m102718i(jbc0.f119324N).m102713d(jbc0.f119741r6).m102711a();
            case 67:
                return b690.m102710b().m102720k(privilege).m102724o("任意修改定位").m102722m("前往学校附近、旅行目的地或任意地方交友").m102716g("前往学校附近、旅行目的地或任意地方交友").m102718i(jbc0.f119324N).m102713d(jbc0.f119741r6).m102711a();
            case 68:
                return b690.m102710b().m102720k(privilege).m102724o(String.format("每天%s次免费找搭子特权", Integer.valueOf(CoreModule.f18264c.f20340Q1.f20859R.m35758I()))).m102722m("直接和你心仪的对象发起私聊，邀约无需等待").m102716g("直接和你心仪的对象发起私聊，邀约无需等待").m102718i(jbc0.f119844yb).m102711a();
            case 69:
                return b690.m102710b().m102720k(privilege).m102724o(String.format("每天%s次额外免费盲盒", Integer.valueOf(CoreModule.f18264c.f20340Q1.f20859R.m35757H()))).m102722m("开启惊喜盲盒对象，认识有趣的新朋友").m102716g("开启惊喜盲盒对象，认识有趣的新朋友").m102718i(jbc0.f119858zb).m102711a();
            case 70:
                String str17 = c17.m107528u0() ? "优先让他看见你，知晓你的特别心意" : "优先让她看见你，知晓你的特别心意";
                return b690.m102710b().m102720k(privilege).m102714e(jbc0.f119786u9).m102717h(h9c0.f108388p0, h9c0.f108386o0).m102724o("每天1个超级喜欢").m102722m(str17).m102716g(str17).m102711a();
            case 71:
                return b690.m102710b().m102720k(privilege).m102724o("查看消息是否已读").m102722m("你发出的消息还没被看到？还是已读不回？").m102716g("你发出的消息还没被看到？还是已读不回？").m102718i(jbc0.f119593gc).m102711a();
            case 72:
                return b690.m102710b().m102720k(privilege).m102724o("私人定制").m102722m("根据定制需求实时推送，开启专属社交体验").m102716g("根据定制需求实时推送，开启专属社交体验").m102718i(jbc0.f119642k5).m102711a();
            case EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE /* 73 */:
                return b690.m102710b().m102720k(privilege).m102724o("定向隐身").m102722m("不让距离太近的人看到我，随时保护隐私").m102716g("不让距离太近的人看到我，随时保护隐私").m102718i(jbc0.f119477Y6).m102711a();
            case 74:
                return b690.m102710b().m102720k(privilege).m102719j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjRDQzE3REQxNTdBNjRGRkNBNUFGRTg1Nzg5QUVENDM5IiwidyI6NzExLCJoIjozNzgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyOTE2MjEzOTkwOTY1OTU5ODIsInB0IjoyMDI1MDYxNzE1fQ.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ijc4NzFCRkFDMUZFQzQzMDc5RDMzMTFDQUMxMDY5MDJCIiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjY5MzIwNDEyNDEwMzU5Mzg4LCJwdCI6MjAyNTA2MTcxNX0.webp").m102723n(R$string.f28467u6).m102721l(R$string.f28456t6).m102715f(R$string.f28456t6).m102711a();
            default:
                return b690.m102710b().m102720k(privilege).m102711a();
        }
    }

    /* JADX INFO: renamed from: n */
    public static List<a690> m143622n(final PurchaseType purchaseType, final Privilege privilege, final boolean z) {
        final ArrayList arrayList = new ArrayList();
        if (z && wib0.m206575s(purchaseType)) {
            arrayList.add(m143626r());
            return arrayList;
        }
        jyb.m147537z(purchaseType.getPrivilegeDataForGP(CoreModule.f18264c.f20381e0.m116600p9().gender), new y20() { // from class: l.e690
            @Override // p153l.y20
            public final void call(Object obj) {
                j690.m143613e(privilege, arrayList, z, purchaseType, (Privilege) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public static a690 m143623o(Privilege privilege) {
        int i = C17886a.f118535a[privilege.ordinal()];
        if (i == 1) {
            int i2 = c17.m107528u0() ? R$string.f28286f1 : R$string.f28274e1;
            return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119415T9).m102714e(jbc0.f119786u9).m102717h(h9c0.f108388p0, h9c0.f108386o0).m102724o("每天3个超级喜欢").m102721l(i2).m102715f(i2).m102711a();
        }
        if (i == 2) {
            String string = CoreModule.f18263b.getString(R$string.f28394o1);
            return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119337Nc).m102714e(jbc0.f119211Ec).m102717h(h9c0.f108396t0, h9c0.f108394s0).m102723n(R$string.f28406p1).m102722m(string).m102716g(string).m102711a();
        }
        if (i == 3) {
            return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119295Kc).m102714e(jbc0.f119789uc).m102717h(h9c0.f108382m0, h9c0.f108380l0).m102723n(R$string.f28192X0).m102721l(R$string.f28181W0).m102715f(R$string.f28181W0).m102711a();
        }
        if (i == 4) {
            boolean zM107528u0 = c17.m107528u0();
            return b690.m102710b().m102720k(privilege).m102714e(jbc0.f119169Bc).m102717h(h9c0.f108392r0, h9c0.f108390q0).m102723n(R$string.f28382n1).m102721l(zM107528u0 ? R$string.f28370m1 : R$string.f28358l1).m102715f(zM107528u0 ? R$string.f28370m1 : R$string.f28358l1).m102711a();
        }
        if (i == 30) {
            return b690.m102710b().m102720k(privilege).m102714e(jbc0.f119719pc).m102717h(h9c0.f108388p0, h9c0.f108386o0).m102724o("隐藏活跃时间").m102722m("隐藏活跃时间").m102716g("隐藏活跃时间").m102711a();
        }
        if (i == 34) {
            return b690.m102710b().m102720k(privilege).m102724o(CoreModule.f18263b.getString(R$string.f28229a4)).m102722m(CoreModule.f18263b.getString(R$string.f28217Z3)).m102716g(CoreModule.f18263b.getString(R$string.f28217Z3)).m102711a();
        }
        if (i == 52) {
            return b690.m102710b().m102720k(privilege).m102724o("专属客服").m102722m("一对一专属客服，为你的体验保驾护航").m102716g("一对一专属客服，为你的体验保驾护航").m102711a();
        }
        if (i == 61) {
            String str = String.format(Locale.getDefault(), "每月%次机会，开启后访问其他人，对方将不会看到你的访问记录", Integer.valueOf(CoreModule.m30933P().m143408e().mo35979Xm()));
            return b690.m102710b().m102720k(privilege).m102724o("隐藏我的访问足迹").m102722m(str).m102716g(str).m102711a();
        }
        if (i == 40) {
            return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119316M5).m102724o(String.format("SVIP全部%s项特权", Integer.valueOf(m143608C()))).m102722m(String.format("包含揭秘喜欢我的人、闪聊匹配、每月3次优先推荐等全部%s项特权", Integer.valueOf(m143608C()))).m102716g(String.format("包含揭秘喜欢我的人、闪聊匹配、每月3次优先推荐等全部%s项特权", Integer.valueOf(m143608C()))).m102711a();
        }
        if (i == 41) {
            String str2 = CoreModule.m30933P().m143405a().mo34426Tr() ? "每天定制推荐优质婚恋用户，助你早日脱单" : "每天更新10个优质认证用户，遇见你的心动";
            return b690.m102710b().m102720k(privilege).m102718i(c17.m107528u0() ? jbc0.f119302L5 : jbc0.f119288K5).m102724o("每日心动").m102722m(str2).m102716g(str2).m102711a();
        }
        switch (i) {
            case 6:
                if (!CoreModule.m30933P().m143405a().mo34510h5()) {
                    return b690.m102710b().m102720k(privilege).m102714e(jbc0.f119786u9).m102717h(h9c0.f108388p0, h9c0.f108386o0).m102723n(R$string.f28069L9).m102722m(CoreModule.f18263b.getString(R$string.f28058K9)).m102716g(CoreModule.f18263b.getString(R$string.f28058K9)).m102711a();
                }
                int i3 = c17.m107528u0() ? R$string.f28286f1 : R$string.f28274e1;
                return b690.m102710b().m102720k(privilege).m102714e(jbc0.f119786u9).m102717h(h9c0.f108388p0, h9c0.f108386o0).m102723n(R$string.f28298g1).m102721l(i3).m102715f(i3).m102711a();
            case 7:
                if (!CoreModule.m30933P().m143405a().mo34510h5()) {
                    return b690.m102710b().m102720k(privilege).m102714e(jbc0.f119169Bc).m102717h(h9c0.f108392r0, h9c0.f108390q0).m102723n(R$string.f28091N9).m102721l(R$string.f28080M9).m102715f(R$string.f28067L7).m102711a();
                }
                boolean zM107528u1 = c17.m107528u0();
                b690 b690VarM102710b = b690.m102710b();
                b690VarM102710b.m102720k(privilege).m102714e(jbc0.f119169Bc).m102717h(h9c0.f108392r0, h9c0.f108390q0).m102723n(R$string.f28382n1).m102721l(zM107528u1 ? R$string.f28370m1 : R$string.f28358l1).m102715f(zM107528u1 ? R$string.f28370m1 : R$string.f28358l1);
                if (CoreModule.m30933P().m143405a().mo34436Vf()) {
                    b690VarM102710b.m102724o("反悔特权");
                    b690VarM102710b.m102722m(c17.m107528u0() ? "手滑啦？使用反悔特权，重新喜欢他！" : "手滑啦？使用反悔特权，重新喜欢她！");
                    b690VarM102710b.m102716g(c17.m107528u0() ? "手滑啦？使用反悔特权，重新喜欢他！" : "手滑啦？使用反悔特权，重新喜欢她！");
                }
                return b690VarM102710b.m102711a();
            case 8:
                if (!CoreModule.m30933P().m143405a().mo34510h5()) {
                    return b690.m102710b().m102720k(privilege).m102714e(jbc0.f119211Ec).m102717h(h9c0.f108396t0, h9c0.f108394s0).m102724o(CoreModule.f18263b.getString(R$string.f28113P9)).m102722m(m143629u()).m102716g(m143629u()).m102711a();
                }
                String string2 = CoreModule.f18263b.getString(R$string.f28394o1);
                return b690.m102710b().m102720k(privilege).m102714e(jbc0.f119211Ec).m102717h(h9c0.f108396t0, h9c0.f108394s0).m102723n(R$string.f28406p1).m102722m(string2).m102716g(string2).m102711a();
            case 9:
                return CoreModule.m30933P().m143405a().mo34510h5() ? b690.m102710b().m102720k(privilege).m102714e(jbc0.f119789uc).m102717h(h9c0.f108382m0, h9c0.f108380l0).m102723n(R$string.f28192X0).m102721l(R$string.f28181W0).m102715f(R$string.f28181W0).m102711a() : b690.m102710b().m102720k(privilege).m102714e(jbc0.f119789uc).m102717h(h9c0.f108382m0, h9c0.f108380l0).m102723n(R$string.f28047J9).m102721l(R$string.f28036I9).m102715f(R$string.f28404p).m102711a();
            case 10:
                return CoreModule.m30933P().m143405a().mo34510h5() ? b690.m102710b().m102720k(privilege).m102718i(jbc0.f119253Hc).m102724o(m143632x()).m102722m(m143630v()).m102716g(m143630v()).m102711a() : b690.m102710b().m102720k(privilege).m102714e(jbc0.f119691nc).m102717h(h9c0.f108374i0, h9c0.f108372h0).m102723n(R$string.f28014G9).m102721l(R$string.f28003F9).m102715f(R$string.f28003F9).m102711a();
            default:
                switch (i) {
                    case 12:
                        String string3 = CoreModule.f18263b.getString(R$string.f28392o);
                        String string4 = CoreModule.f18263b.getString(R$string.f28025H9);
                        return b690.m102710b().m102720k(privilege).m102718i(CoreModule.m30933P().m143408e().mo35986jn()).m102725p(h9c0.f108348R).m102724o(string3).m102722m(string4).m102716g(string4).m102711a();
                    case 13:
                        return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119456Wb).m102725p(h9c0.f108348R).m102724o(CoreModule.f18263b.getString(R$string.f28330i9, a9g0.m96571f(CoreModule.m30933P().m143405a().mo34451Y4()))).m102721l(R$string.f28318h9).m102715f(R$string.f28318h9).m102711a();
                    case 14:
                        return b690.m102710b().m102720k(privilege).m102718i(TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().gender, "female") ? jbc0.f119456Wb : jbc0.f119469Xb).m102725p(h9c0.f108348R).m102724o(CoreModule.f18263b.getString(R$string.f28457t7)).m102721l(R$string.f28479v7).m102715f(R$string.f28479v7).m102711a();
                    case 15:
                        if (!CoreModule.m30933P().m143405a().mo34510h5()) {
                            return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119510b).m102725p(h9c0.f108348R).m102724o("在线闪聊").m102722m("使用在线闪聊功能立刻获得聊得来的神秘配对，蒙脸聊天一步步发现神秘头像背后的TA！").m102716g("使用在线闪聊功能立刻获得聊得来的神秘配对，蒙脸聊天一步步发现神秘头像背后的TA！").m102711a();
                        }
                        String strMo34344Il = CoreModule.m30933P().m143405a().mo34344Il();
                        return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119510b).m102725p(h9c0.f108348R).m102724o(CoreModule.m30933P().m143405a().mo34624wp()).m102722m(String.format(strMo34344Il, CoreModule.m30933P().m143405a().mo34350Jj())).m102716g(String.format(strMo34344Il, CoreModule.m30933P().m143405a().mo34350Jj())).m102711a();
                    case 16:
                        return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119510b).m102725p(h9c0.f108348R).m102724o("语音闪聊").m102722m(String.format("每天额外1次语音闪聊，随时连线附近的%s", c17.m107528u0() ? "小哥哥" : "小姐姐")).m102716g(String.format("每天额外1次语音闪聊，随时连线附近的%s", c17.m107528u0() ? "小哥哥" : "小姐姐")).m102711a();
                    default:
                        switch (i) {
                            case 46:
                                return b690.m102710b().m102720k(privilege).m102724o(CoreModule.f18263b.getString(R$string.f28216Z2)).m102722m(CoreModule.f18263b.getString(m143616h())).m102716g(CoreModule.f18263b.getString(m143616h())).m102711a();
                            case 47:
                                return b690.m102710b().m102720k(privilege).m102724o(CoreModule.f18263b.getString(R$string.f28396o3)).m102722m(CoreModule.f18263b.getString(R$string.f28489w6)).m102716g(CoreModule.f18263b.getString(R$string.f28489w6)).m102711a();
                            case 48:
                                return b690.m102710b().m102720k(privilege).m102724o(CoreModule.f18263b.getString(R$string.f28431r3)).m102722m(CoreModule.f18263b.getString(R$string.f28420q3)).m102716g(CoreModule.f18263b.getString(R$string.f28420q3)).m102711a();
                            case 49:
                                return b690.m102710b().m102720k(privilege).m102724o(String.format(CoreModule.f18263b.getString(R$string.f28276e3), Integer.valueOf(joa.m146406s3()))).m102722m(CoreModule.f18263b.getString(R$string.f28264d3)).m102716g(CoreModule.f18263b.getString(R$string.f28264d3)).m102711a();
                            case 50:
                                return b690.m102710b().m102720k(privilege).m102718i(c17.m107528u0() ? jbc0.f119739r4 : jbc0.f119753s4).m102724o("一键配对").m102722m(String.format("每天额外1次语音闪聊，随时连线附近的%s", c17.m107528u0() ? "小哥哥" : "小姐姐")).m102716g(String.format("每天额外1次语音闪聊，随时连线附近的%s", c17.m107528u0() ? "小哥哥" : "小姐姐")).m102711a();
                            default:
                                return null;
                        }
                }
        }
    }

    /* JADX INFO: renamed from: p */
    public static List<a690> m143624p(final PurchaseType purchaseType, List<Privilege> list, final Privilege privilege) {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(list, new y20() { // from class: l.g690
            @Override // p153l.y20
            public final void call(Object obj) {
                j690.m143609a(purchaseType, privilege, arrayList, (Privilege) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    public static List<a690> m143625q(List<Privilege> list, final Privilege privilege, final PurchaseType purchaseType) {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(list, new y20() { // from class: l.d690
            @Override // p153l.y20
            public final void call(Object obj) {
                j690.m143611c(purchaseType, privilege, arrayList, (Privilege) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: r */
    public static a690 m143626r() {
        String string;
        CoreLikers.C4870a c4870aM31479t5 = CoreModule.f18264c.f20429u0.m31479t5();
        int i = c4870aM31479t5 == null ? 0 : c4870aM31479t5.f20012b;
        b690 b690VarM102723n = b690.m102710b().m102720k(null).m102718i(jbc0.f119803vc).m102723n(R$string.f28402o9);
        if (i > 0) {
            string = CoreModule.f18263b.getString(R$string.f28390n9, i + "");
        } else {
            string = CoreModule.f18263b.getString(R$string.f28378m9);
        }
        return b690VarM102723n.m102722m(string).m102715f(R$string.f28366l9).m102711a();
    }

    /* JADX INFO: renamed from: s */
    public static String m143627s(PurchaseType purchaseType) {
        return wib0.m206571o(purchaseType) ? "展示 白金会员 尊贵标识，或者低调地隐藏会员身份" : CoreModule.f18263b.getString(R$string.f28322i1);
    }

    /* JADX INFO: renamed from: t */
    public static String m143628t() {
        return CoreModule.f18263b.getString(R$string.f28334j1);
    }

    /* JADX INFO: renamed from: u */
    public static String m143629u() {
        return CoreModule.f18263b.getString(R$string.f28102O9);
    }

    /* JADX INFO: renamed from: v */
    public static String m143630v() {
        return CoreModule.f18263b.getString(R$string.f28429r1);
    }

    /* JADX INFO: renamed from: w */
    public static String m143631w() {
        return CoreModule.f18263b.getString(R$string.f28418q1);
    }

    /* JADX INFO: renamed from: x */
    public static String m143632x() {
        return CoreModule.f18263b.getString(R$string.f28440s1);
    }

    /* JADX INFO: renamed from: y */
    public static ArrayList<Privilege> m143633y() {
        return PurchaseType.TYPE_GET_VIP.getPrivilegeData(CoreModule.f18264c.f20381e0.m116600p9().gender);
    }

    /* JADX INFO: renamed from: z */
    public static ArrayList<Privilege> m143634z() {
        return PurchaseType.TYPE_GET_VIP.getPrivilegeDataForGP(CoreModule.f18264c.f20381e0.m116600p9().gender);
    }
}
