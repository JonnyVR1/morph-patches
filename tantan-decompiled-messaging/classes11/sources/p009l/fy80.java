package p009l;

import com.p000p1.mobile.putong.core.pay.R$string;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import l.e30;
import l.g6a;
import l.sab0;
import l.t0g0;
import l.ura;
import l.vwb;
import l.wx80;
import l.xma;
import l.zz6;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class fy80 {

    /* JADX INFO: renamed from: a */
    public static boolean f13223a;

    /* JADX INFO: renamed from: l.fy80$a */
    public static /* synthetic */ class C0903a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13224a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f13224a = iArr;
            try {
                iArr[Privilege.superlike_pkg.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13224a[Privilege.likeNoLimit_pkg.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13224a[Privilege.roaming_pkg.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13224a[Privilege.undo_pkg.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13224a[Privilege.intl_no_ad.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13224a[Privilege.vip_super_like.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13224a[Privilege.vip_undo.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13224a[Privilege.vip_unlimited_likes.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13224a[Privilege.vip_location.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13224a[Privilege.vip_badge.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13224a[Privilege.vip_independent_super_like.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13224a[Privilege.boost.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f13224a[Privilege.see_not_match_guide.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f13224a[Privilege.see_who_likes_me.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f13224a[Privilege.online_match_tickets.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f13224a[Privilege.voice_quick_chat.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f13224a[Privilege.privacy_membership.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f13224a[Privilege.message_read_state.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f13224a[Privilege.recover_unmatches.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f13224a[Privilege.svip_badge.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f13224a[Privilege.letter.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f13224a[Privilege.greet.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f13224a[Privilege.top_like.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f13224a[Privilege.top_chat.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f13224a[Privilege.vip_greet.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f13224a[Privilege.svip_greet.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f13224a[Privilege.leave_message.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f13224a[Privilege.vip_letter_gp.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f13224a[Privilege.advanced_filter.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f13224a[Privilege.vip_membership_active_time_gp.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f13224a[Privilege.vip_membership_read_gp.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f13224a[Privilege.vip_membership_remark_gp.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f13224a[Privilege.vip_membership_search_gp.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f13224a[Privilege.liked_user.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f13224a[Privilege.vip_message_block_gp.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f13224a[Privilege.see_theme_unlock_more.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f13224a[Privilege.see_theme_unlock_pop.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f13224a[Privilege.see_theme_unlock_online.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f13224a[Privilege.see_letter_gp.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f13224a[Privilege.svipPicksMembership.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f13224a[Privilege.picksMembership.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f13224a[Privilege.oDiamondSvipExtra.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f13224a[Privilege.oDiamondSvipSkin.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f13224a[Privilege.oDiamondGreetings.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f13224a[Privilege.oDiamondVisitor.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f13224a[Privilege.loveBuzz.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f13224a[Privilege.intl_advanced_filter.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f13224a[Privilege.intl_visitor.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f13224a[Privilege.premium_compliment.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f13224a[Privilege.immediately_match.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f13224a[Privilege.live_entry_animation.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f13224a[Privilege.customer_service.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f13224a[Privilege.say_hi_pkg.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f13224a[Privilege.moment_boost.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f13224a[Privilege.accelerate_pairing.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f13224a[Privilege.city_topping.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f13224a[Privilege.personal_customization.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f13224a[Privilege.mysterious_mode.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f13224a[Privilege.nearby_people.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f13224a[Privilege.exclusive_dressing_up.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f13224a[Privilege.visitor_hide_footprint.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f13224a[Privilege.confession_first.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f13224a[Privilege.pick_tantan_credits_users.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f13224a[Privilege.unlock_learn_about_him_module.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f13224a[Privilege.ads_not_disturb.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f13224a[Privilege.block_harassing_words.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f13224a[Privilege.youth_roaming.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f13224a[Privilege.youth_find_partner.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f13224a[Privilege.youth_blind_box.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f13224a[Privilege.youth_superlike.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f13224a[Privilege.youth_message_read.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f13224a[Privilege.private_custom.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f13224a[Privilege.hide_me_from_nearby.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f13224a[Privilege.tribe.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public static ArrayList<Privilege> m14632A() {
        ArrayList<Privilege> arrayListM14660z = m14660z();
        ArrayList privilegeDataForGP = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP(CoreModule.c.e0.p9().gender);
        Privilege privilege = Privilege.svip_badge;
        List listC0 = vwb.c0(privilegeDataForGP, privilege);
        listC0.add(0, privilege);
        return (ArrayList) vwb.p(arrayListM14660z, listC0);
    }

    /* JADX INFO: renamed from: B */
    public static void m14633B(boolean z) {
        f13223a = z;
    }

    /* JADX INFO: renamed from: C */
    public static int m14634C() {
        return 14;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14635a(PurchaseType purchaseType, Privilege privilege, List list, Privilege privilege2) {
        wx80 wx80VarM14647m = m14647m(purchaseType, privilege2);
        wx80VarM14647m.Z(true);
        if (NullChecker.a(privilege) && privilege2 == privilege) {
            list.add(0, wx80VarM14647m);
        } else if (NullChecker.a(privilege2)) {
            list.add(wx80VarM14647m);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m14636b(Privilege privilege, List list, Privilege privilege2) {
        PurchaseType purchaseType = PurchaseType.TYPE_O_DIAMOND;
        wx80 wx80VarM14647m = m14647m(purchaseType, privilege2);
        wx80VarM14647m.Q(true);
        if (NullChecker.a(privilege) && privilege2 == privilege) {
            list.add(0, wx80VarM14647m);
        } else if (NullChecker.a(privilege) && !purchaseType.getPrivilegeData((Gender) null).contains(privilege) && privilege2 == Privilege.oDiamondSvipExtra) {
            list.add(0, wx80VarM14647m);
        } else {
            list.add(wx80VarM14647m);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m14637c(PurchaseType purchaseType, Privilege privilege, List list, Privilege privilege2) {
        wx80 wx80VarM14647m = m14647m(purchaseType, privilege2);
        wx80VarM14647m.e0(true);
        if (NullChecker.a(privilege) && privilege2 == privilege) {
            list.add(0, wx80VarM14647m);
        } else if (NullChecker.a(privilege2)) {
            list.add(wx80VarM14647m);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m14638d(List list, Privilege privilege, List list2, Privilege privilege2) {
        wx80 wx80VarM14646l = m14646l(privilege2);
        if (list.size() > 1) {
            wx80VarM14646l.d0(true);
        } else {
            wx80VarM14646l.S(true);
        }
        if (NullChecker.a(privilege) && privilege2 == privilege) {
            list2.add(0, wx80VarM14646l);
        } else if (NullChecker.a(privilege2)) {
            list2.add(wx80VarM14646l);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m14639e(Privilege privilege, List list, boolean z, PurchaseType purchaseType, Privilege privilege2) {
        if (NullChecker.a(privilege) && privilege2 == privilege) {
            list.add(z ? 1 : 0, m14647m(purchaseType, privilege2));
        } else if (NullChecker.a(privilege2)) {
            list.add(m14647m(purchaseType, privilege2));
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m14640f(Privilege privilege, List list, Privilege privilege2) {
        wx80 wx80VarM14647m = m14647m(PurchaseType.TYPE_O_PLATINUM, privilege2);
        wx80VarM14647m.T(true);
        if (NullChecker.a(privilege) && privilege2 == privilege) {
            list.add(0, wx80VarM14647m);
        } else if (NullChecker.a(privilege2)) {
            list.add(wx80VarM14647m);
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m14641g() {
        return CoreModule.b.getString(R$string.f6042P8);
    }

    /* JADX INFO: renamed from: h */
    public static int m14642h() {
        return CoreModule.P().b().Bs() ? R$string.f6135Y2 : R$string.f6124X2;
    }

    /* JADX INFO: renamed from: i */
    public static List<wx80> m14643i(List<Privilege> list, final Privilege privilege) {
        final ArrayList arrayList = new ArrayList();
        vwb.z(list, new e30() { // from class: l.dy80
            public final void call(Object obj) {
                fy80.m14636b(privilege, arrayList, (Privilege) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static List<wx80> m14644j(final List<Privilege> list, final Privilege privilege) {
        final ArrayList arrayList = new ArrayList();
        vwb.z(list, new e30() { // from class: l.by80
            public final void call(Object obj) {
                fy80.m14638d(list, privilege, arrayList, (Privilege) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public static List<wx80> m14645k(List<Privilege> list, final Privilege privilege) {
        final ArrayList arrayList = new ArrayList();
        vwb.z(list, new e30() { // from class: l.ey80
            public final void call(Object obj) {
                fy80.m14640f(privilege, arrayList, (Privilege) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public static wx80 m14646l(Privilege privilege) {
        return m14647m(null, privilege);
    }

    /* JADX INFO: renamed from: m */
    public static wx80 m14647m(PurchaseType purchaseType, Privilege privilege) {
        String str;
        String strWp;
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
        switch (C0903a.f13224a[privilege.ordinal()]) {
            case 1:
                int i5 = zz6.u0() ? R$string.f6216f1 : R$string.f6204e1;
                return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11183T9).m25039e(d3c0.f11554u9).m25042h(b1c0.f9849p0, b1c0.f9847o0).m25049o("每天3个超级喜欢").m25046l(i5).m25040f(i5).m25036a();
            case 2:
                String string = CoreModule.b.getString(R$string.f6324o1);
                return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11105Nc).m25039e(d3c0.f10979Ec).m25042h(b1c0.f9857t0, b1c0.f9855s0).m25048n(R$string.f6336p1).m25047m(string).m25041g(string).m25036a();
            case 3:
                return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11063Kc).m25039e(d3c0.f11557uc).m25042h(b1c0.f9843m0, b1c0.f9841l0).m25048n(R$string.f6122X0).m25046l(R$string.f6111W0).m25040f(R$string.f6111W0).m25036a();
            case 4:
                boolean zU0 = zz6.u0();
                return xx80.m25035b().m25045k(privilege).m25039e(d3c0.f10937Bc).m25042h(b1c0.f9853r0, b1c0.f9851q0).m25048n(R$string.f6312n1).m25046l(zU0 ? R$string.f5979K0 : R$string.f5968J0).m25040f(zU0 ? R$string.f5979K0 : R$string.f5968J0).m25036a();
            case 5:
                return xx80.m25035b().m25045k(privilege).m25044j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/raw/7e9d55ce-e487-41fe-8dd2-7a0147470ef110.webp" : "https://auto.tancdn.com/v1/raw/55c2177d-65e6-4c75-801a-499403525f5e10.webp").m25048n(R$string.f6375s6).m25046l(R$string.f6364r6).m25040f(R$string.f6364r6).m25036a();
            case 6:
                if (CoreModule.P().a().h5()) {
                    String string2 = CoreModule.b.getString(zz6.u0() ? R$string.f6216f1 : R$string.f6204e1);
                    String string3 = (sab0.i(purchaseType) || sab0.j(purchaseType)) ? "无限次超级喜欢" : CoreModule.b.getString(R$string.f6228g1);
                    if (sab0.u(purchaseType)) {
                        string3 = "无限次超级喜欢";
                        string2 = "无限次超级喜欢，使用后让你的喜欢脱颖而出！";
                    }
                    return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11183T9).m25039e(d3c0.f11554u9).m25042h(b1c0.f9849p0, b1c0.f9847o0).m25049o(string3).m25047m(string2).m25041g(string2).m25036a();
                }
                String string4 = CoreModule.b.getString(R$string.f6108V8);
                str = IntlCountryCodeController.v() ? "https://auto.tancdn.com/v1/raw/4ad5dbbb-6860-4461-b45f-9a6209d7df6f11.webp" : "https://auto.tancdn.com/v1/raw/d81da4e9-8ed7-4917-a1fd-05a5446adab710.webp";
                PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                if (purchaseType == purchaseType2) {
                    str = IntlCountryCodeController.v() ? "https://auto.tancdn.com/v1/raw/b8927b15-478d-4a2b-b514-2da53e084ae010.webp" : "https://auto.tancdn.com/v1/raw/0750872a-d3b6-4b59-afec-3ed32fbb5e5511.webp";
                }
                int i6 = R$string.f6141Y8;
                if (purchaseType == purchaseType2 && ura.e().d().Oi()) {
                    i6 = IntlCountryCodeController.v() ? R$string.f6242h3 : R$string.f6230g3;
                }
                xx80 xx80VarM25035b = xx80.m25035b();
                xx80VarM25035b.m25045k(privilege).m25044j(str).m25048n(i6).m25046l(R$string.f6108V8).m25041g(string4);
                return xx80VarM25035b.m25036a();
            case 7:
                if (!CoreModule.P().a().h5()) {
                    String str9 = IntlCountryCodeController.v() ? "https://auto.tancdn.com/v1/raw/1c363bb1-527a-4e73-bf75-af3337532e8711.webp" : "https://auto.tancdn.com/v1/raw/efbb251e-8a64-450e-80e4-af960390eabd11.webp";
                    if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                        str9 = IntlCountryCodeController.v() ? "https://auto.tancdn.com/v1/raw/8e0c607c-ba1e-4754-8b7a-9ec6ceef9dfd11.webp" : "https://auto.tancdn.com/v1/raw/3e3a2ee9-7170-4b5b-92f7-d4f4dfca3dc311.webp";
                    }
                    xx80 xx80VarM25035b2 = xx80.m25035b();
                    xx80VarM25035b2.m25045k(privilege).m25044j(str9).m25049o(CoreModule.b.getString(R$string.f6152Z8)).m25046l(R$string.f6086T8).m25041g(CoreModule.b.getString(R$string.f6086T8));
                    return xx80VarM25035b2.m25036a();
                }
                boolean zU1 = zz6.u0();
                xx80 xx80VarM25035b3 = xx80.m25035b();
                xx80VarM25035b3.m25045k(privilege).m25043i(d3c0.f11091Mc).m25039e(d3c0.f10937Bc).m25042h(b1c0.f9853r0, b1c0.f9851q0).m25048n(R$string.f6312n1).m25046l(zU1 ? R$string.f5979K0 : R$string.f5968J0).m25040f(zU1 ? R$string.f5979K0 : R$string.f5968J0);
                if (CoreModule.P().a().Vf()) {
                    xx80VarM25035b3.m25049o("反悔特权");
                    xx80VarM25035b3.m25047m(zz6.u0() ? "手滑啦？使用反悔特权，重新喜欢他！" : "手滑啦？使用反悔特权，重新喜欢她！");
                    xx80VarM25035b3.m25041g(zz6.u0() ? "手滑啦？使用反悔特权，重新喜欢他！" : "手滑啦？使用反悔特权，重新喜欢她！");
                }
                return xx80VarM25035b3.m25036a();
            case 8:
                if (CoreModule.P().a().h5()) {
                    String string5 = CoreModule.b.getString(R$string.f6324o1);
                    return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11105Nc).m25039e(d3c0.f10979Ec).m25042h(b1c0.f9857t0, b1c0.f9855s0).m25048n(R$string.f6336p1).m25047m(string5).m25041g(string5).m25036a();
                }
                String str10 = IntlCountryCodeController.v() ? "https://auto.tancdn.com/v1/raw/1216f433-f408-44a2-add9-e3a9969270c611.webp" : "https://auto.tancdn.com/v1/raw/9e7625c5-4002-421b-bf5c-fb6ed0ea90ee11.webp";
                if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                    str10 = IntlCountryCodeController.v() ? "https://auto.tancdn.com/v1/raw/8a46ab26-dd56-484a-bd09-43ee42fd5e1311.webp" : "https://auto.tancdn.com/v1/raw/406c7711-a037-4e25-8acf-db68636ebce010.webp";
                }
                return xx80.m25035b().m25045k(privilege).m25044j(str10).m25048n(R$string.f6119W8).m25047m(m14641g()).m25041g(m14641g()).m25036a();
            case MediaPickerParamsObject.FROM_JS_BRIDGE_SWIPE_CARD /* 9 */:
                if (CoreModule.P().a().h5()) {
                    return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11063Kc).m25039e(d3c0.f11557uc).m25042h(b1c0.f9843m0, b1c0.f9841l0).m25048n(R$string.f6122X0).m25046l(R$string.f6111W0).m25040f(R$string.f6111W0).m25036a();
                }
                return xx80.m25035b().m25045k(privilege).m25044j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/raw/fad6222d-a1b8-4505-8537-48f54a09580111.webp" : "https://auto.tancdn.com/v1/raw/30a18977-468d-4e52-a7ff-c69087efcfa411.webp").m25048n(R$string.f6122X0).m25046l(R$string.f6111W0).m25040f(R$string.f6053Q8).m25036a();
            case 10:
                if (CoreModule.P().a().h5()) {
                    return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11021Hc).m25039e(d3c0.f11459nc).m25042h(b1c0.f9835i0, b1c0.f9833h0).m25049o(m14658x()).m25047m(m14656v()).m25041g(m14656v()).m25036a();
                }
                int i7 = R$string.f6164a9;
                int i8 = R$string.f6097U8;
                if (PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE == purchaseType) {
                    i7 = R$string.f6095U6;
                    i8 = R$string.f6084T6;
                } else {
                    str6 = "https://auto.tancdn.com/v1/raw/471883b1-4132-4349-a95a-5806d9df838510.webp";
                }
                return xx80.m25035b().m25045k(privilege).m25044j(str6).m25048n(i7).m25046l(i8).m25040f(i8).m25036a();
            case MediaPickerParamsObject.FROM_CHAT_SWITCH_BACK_PIC /* 11 */:
                str = IntlCountryCodeController.v() ? "https://auto.tancdn.com/v1/raw/4ad5dbbb-6860-4461-b45f-9a6209d7df6f11.webp" : "https://auto.tancdn.com/v1/raw/d81da4e9-8ed7-4917-a1fd-05a5446adab710.webp";
                if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                    str = IntlCountryCodeController.v() ? "https://auto.tancdn.com/v1/raw/b8927b15-478d-4a2b-b514-2da53e084ae010.webp" : "https://auto.tancdn.com/v1/raw/0750872a-d3b6-4b59-afec-3ed32fbb5e5511.webp";
                }
                return xx80.m25035b().m25045k(privilege).m25044j(str).m25048n(R$string.f6141Y8).m25046l(R$string.f6075S8).m25040f(R$string.f6075S8).m25036a();
            case MediaPickerParamsObject.FROM_PROFILE_WEALTH /* 12 */:
                if (purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                    return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11035Ic).m25039e(d3c0.f11418l).m25042h(b1c0.f9820b, b1c0.f9818a).m25049o(CoreModule.b.getString(R$string.f6322o)).m25046l(R$string.f6262j).m25040f(R$string.f6262j).m25036a();
                }
                int i9 = R$string.f6341p6;
                int i10 = R$string.f6353q6;
                return xx80.m25035b().m25045k(privilege).m25044j("https://auto.tancdn.com/v1/raw/11c58ba4-4e09-4b06-907e-46899bf7117611.webp").m25048n(i9).m25046l(i10).m25040f(i10).m25036a();
            case MediaPickerParamsObject.FROM_CHAT_LIMIT_SHOOT_PIC /* 13 */:
            case MediaPickerParamsObject.FROM_CITY_CENTER_UPLOAD_PIC /* 14 */:
                return purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? xx80.m25035b().m25045k(privilege).m25044j("https://auto.tancdn.com/v1/raw/9a4c7c22-b275-44ab-8ebb-aeebc7e0a84210.webp").m25048n(R$string.f6387t7).m25047m(CoreModule.b.getResources().getString(R$string.f6409v7)).m25040f(R$string.f6409v7).m25036a() : xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11347fc).m25039e(d3c0.f11529sc).m25049o(CoreModule.b.getString(R$string.f6398u7)).m25047m(CoreModule.b.getResources().getString(R$string.f6409v7)).m25041g(CoreModule.b.getResources().getString(R$string.f6409v7)).m25036a();
            case MediaPickerParamsObject.FROM_PROFILE_GAME /* 15 */:
                if (!CoreModule.P().a().h5()) {
                    return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11279b0).m25048n(R$string.f6222f7).m25046l(R$string.f6150Z6).m25040f(R$string.f6150Z6).m25036a();
                }
                if (sab0.i(purchaseType) || sab0.j(purchaseType)) {
                    strWp = "无限次在线闪聊";
                } else {
                    strWp = sab0.u(purchaseType) ? "无限次闪聊匹配" : CoreModule.P().a().wp();
                }
                if (sab0.i(purchaseType) || sab0.j(purchaseType)) {
                    str2 = zz6.u0() ? "无限次在线闪聊匹配附近在线的小哥哥，无需相互喜欢，直接在线开聊" : "无限次在线闪聊匹配附近在线的小姐姐，无需相互喜欢，直接在线开聊";
                } else {
                    str2 = sab0.u(purchaseType) ? "无限次闪聊机会，无需配对，立即开聊！" : String.format(CoreModule.P().a().Il(), CoreModule.P().a().Jj());
                }
                return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11279b0).m25049o(strWp).m25047m(str2).m25041g(str2).m25036a();
            case MediaPickerParamsObject.FROM_DEFAULT /* 16 */:
                if (sab0.i(purchaseType) || sab0.j(purchaseType)) {
                    str3 = CoreModule.c.e0.p9().isFemale() ? "21" : "4";
                } else {
                    str3 = "1";
                }
                return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11278b).m25050p(b1c0.f9809R).m25049o("语音闪聊").m25047m(String.format("每天额外%s次语音闪聊，随时连线附近的%s", str3, zz6.u0() ? "小哥哥" : "小姐姐")).m25041g(String.format("每天额外%s次语音闪聊，随时连线附近的%s", str3, zz6.u0() ? "小哥哥" : "小姐姐")).m25036a();
            case MediaPickerParamsObject.FROM_PROFILE_PET /* 17 */:
                String string6 = CoreModule.b.getString(R$string.f6133Y0);
                String string7 = CoreModule.b.getString(R$string.f6133Y0);
                if (g6a.k() && sab0.g(purchaseType)) {
                    i = d3c0.f11523s6;
                    string6 = "一键开启冻结活跃时间和隐藏距离位置功能";
                    string7 = "一键开启冻结活跃时间和隐藏距离位置功能";
                } else {
                    if (CoreModule.P().a().z1()) {
                        string6 = "隐藏我的位置、最后活跃时间和年龄信息，隐私更有保障";
                        string7 = "隐藏我的位置、最后活跃时间和年龄信息，隐私更有保障";
                    }
                    i = 0;
                }
                if (CoreModule.P().i().N()) {
                    string6 = "只让你右滑的人看到你，还可隐藏年龄、位置等信息";
                    string7 = "只让你右滑的人看到你，还可隐藏年龄、位置等信息";
                }
                return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11077Lc).m25038d(i).m25048n(R$string.f6144Z0).m25047m(string7).m25041g(string6).m25036a();
            case 18:
                int i11 = R$string.f6168b1;
                int i12 = R$string.f6156a1;
                if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && CoreModule.P().a().Xi()) {
                    i11 = R$string.f6305m6;
                    i12 = R$string.f6317n6;
                }
                return xx80.m25035b().m25045k(privilege).m25044j("https://auto.tancdn.com/v1/raw/1ed2b13c-d582-4afa-8c09-32d9fc4f2f9a10.webp").m25048n(i11).m25046l(i12).m25040f(i12).m25036a();
            case 19:
                return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11062Kb).m25048n(R$string.f6192d1).m25046l(R$string.f6180c1).m25040f(R$string.f6180c1).m25036a();
            case 20:
                return CoreModule.P().a().h5() ? xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11333ec).m25049o(m14654t()).m25047m(m14653s(purchaseType)).m25041g(m14653s(purchaseType)).m25036a() : xx80.m25035b().m25045k(privilege).m25044j("https://auto.tancdn.com/v1/raw/f6c163cb-aa67-455d-b289-5953e6d9b54411.webp").m25049o(m14658x()).m25047m(m14656v()).m25041g(m14657w()).m25036a();
            case 21:
                boolean zU2 = zz6.u0();
                return xx80.m25035b().m25045k(privilege).m25048n(zU2 ? R$string.f6100V0 : R$string.f6089U0).m25043i(d3c0.f11034Ib).m25046l(zU2 ? R$string.f6078T0 : R$string.f6067S0).m25040f(zU2 ? R$string.f6078T0 : R$string.f6067S0).m25036a();
            case 22:
                return xx80.m25035b().m25045k(privilege).m25049o("专属礼物").m25043i(d3c0.f11359ga).m25038d(d3c0.f11447n0).m25047m(String.format("每天%s个免费礼物，用礼物表达心意", "2")).m25041g(String.format("每天%s个免费礼物，用礼物表达心意", "2")).m25036a();
            case 23:
                boolean zU3 = zz6.u0();
                String str11 = String.format("让%s第一个滑到你，每天3次抢占配对先机！", zU3 ? "他" : "她");
                int i13 = zU3 ? d3c0.f11503r0 : d3c0.f11489q0;
                int i14 = zU3 ? d3c0.f11415ka : d3c0.f11401ja;
                if (g6a.r()) {
                    str11 = String.format("让%s第一个滑到你的卡片，每天3次抢占配对先机！", zU3 ? "他" : "她");
                    i14 = CoreModule.c.e0.p9().isFemale() ? d3c0.f11166S5 : d3c0.f11179T5;
                    str4 = "卡片插队";
                } else {
                    str4 = "置顶喜欢";
                }
                return xx80.m25035b().m25045k(privilege).m25049o(str4).m25043i(i13).m25038d(i14).m25047m(str11).m25041g(str11).m25036a();
            case 24:
                boolean zU4 = zz6.u0();
                String str12 = zU4 ? "在他收到的消息中置顶，更快收到回复！" : "在她收到的消息中置顶，更快收到回复！";
                return xx80.m25035b().m25045k(privilege).m25049o(zU4 ? "成为他的置顶聊天" : "成为她的置顶聊天").m25043i(zU4 ? d3c0.f11475p0 : d3c0.f11461o0).m25038d(zU4 ? d3c0.f11387ia : d3c0.f11373ha).m25047m(str12).m25041g(str12).m25036a();
            case 25:
                return xx80.m25035b().m25045k(privilege).m25049o("会员专享礼物").m25043i(d3c0.f11429la).m25038d(d3c0.f11433m0).m25047m("每月专享10个礼物，向喜欢的人打招呼表达特别心意").m25041g("每月专享10个礼物，向喜欢的人打招呼表达特别心意").m25036a();
            case 26:
                String string8 = CoreModule.b.getString(R$string.f6293l6);
                String string9 = CoreModule.b.getString(R$string.f6281k6);
                return xx80.m25035b().m25045k(privilege).m25044j("https://auto.tancdn.com/v1/raw/1e055c6e-1294-4455-b39b-25165fc3c4a112.webp").m25049o(string8).m25047m(string9).m25041g(string9).m25036a();
            case 27:
                boolean zU5 = zz6.u0();
                return xx80.m25035b().m25045k(privilege).m25049o("每天5条\"资料留言\"").m25043i(!zU5 ? d3c0.f11527sa : d3c0.f11541ta).m25047m(String.format("让%s第一时间看到你，配对几率提升3倍", !zU5 ? "她" : "他")).m25041g(String.format("通过给资料留言，让%s第一时间看到你，配对几率提升3倍", zU5 ? "他" : "她")).m25036a();
            case 28:
                boolean zU6 = zz6.u0();
                return xx80.m25035b().m25045k(privilege).m25048n(zU6 ? R$string.f6100V0 : R$string.f6089U0).m25046l(zU6 ? R$string.f6078T0 : R$string.f6067S0).m25040f(zU6 ? R$string.f6078T0 : R$string.f6067S0).m25043i(CoreModule.P().a().fo()).m25036a();
            case 29:
                if (!CoreModule.P().a().h5()) {
                    return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11474p).m25049o("高级筛选").m25047m("更多筛选条件，遇见相似的人").m25041g(CoreModule.P().a().h5() ? "更多筛选条件，遇见相似的人" : "更多筛选条件\n遇见相似的人").m25036a();
                }
                String string10 = CoreModule.b.getString(R$string.f6034P0);
                String string11 = CoreModule.b.getString(R$string.f6034P0);
                if (CoreModule.P().a().z1()) {
                    string10 = "优先看真实头像认证、最受欢迎、当前在线的用户，只看我的理想型";
                    string11 = "优先看真实头像认证、最受欢迎、当前在线的用户，只看我的理想型";
                }
                return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11474p).m25048n(R$string.f6045Q0).m25047m(string11).m25041g(string10).m25036a();
            case 30:
                return xx80.m25035b().m25045k(privilege).m25044j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/raw/d4b2a799-22f7-4973-ac67-1b2084a0ea5310.webp" : "https://auto.tancdn.com/v1/raw/8a5d2dc5-4f66-4903-b7f7-eec6197d5b1711.webp").m25048n(R$string.f5937G2).m25046l(R$string.f5948H2).m25040f(R$string.f5959I2).m25036a();
            case 31:
                return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11515rc).m25039e(d3c0.f11501qc).m25042h(b1c0.f9839k0, b1c0.f9837j0).m25048n(R$string.f6080T2).m25046l(R$string.f6069S2).m25040f(R$string.f6069S2).m25036a();
            case 32:
                return xx80.m25035b().m25045k(privilege).m25044j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkhTU0dQRTZPTkRBRFpCSkdQQTJORExPVkc2Q0Y0RjEwIiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDIyODk1NTIzMzkwOTUwOTM0fQ.png" : "https://auto.tancdn.com/v1/raw/7b981e39-f2fa-4441-9cd3-7908c69650ab10.webp").m25048n(R$string.f5949H3).m25046l(R$string.f5960I3).m25040f(R$string.f5971J3).m25036a();
            case 33:
                return xx80.m25035b().m25045k(privilege).m25044j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/images/eyJpZCI6IloyWFdESVVWRkNLUFhZNUFYNFZZRFBTTFRZUkhHRTEwIiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMTc2OTQyOTIzMjkwOTA4MTc0fQ.png" : "https://auto.tancdn.com/v1/raw/6375caf8-5b50-4426-be1f-a3b88a12fe6e11.webp").m25048n(R$string.f5916E3).m25046l(R$string.f5927F3).m25040f(R$string.f5938G3).m25036a();
            case 34:
                return xx80.m25035b().m25045k(privilege).m25044j(IntlCountryCodeController.v() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IktXQkVFRzZHMkZGQU8yRzdXTzNTN01SUlhDREhPSzEzIiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNjg5MzQ4ODQ5NzcyNzI5MTM5fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlNXNTNKU0ZKVFdNSk5HNU5YNDJGSkZJUlhRVldFUTE0IiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTkxNzY2MzgxNzc2MjgxMzk0fQ.png").m25049o(CoreModule.b.getString(R$string.f6394u3)).m25047m(CoreModule.b.getString(R$string.f6147Z3)).m25041g(CoreModule.b.getString(R$string.f6147Z3)).m25036a();
            case 35:
                return xx80.m25035b().m25045k(privilege).m25044j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/raw/be3eb17b-9d4e-48dc-b971-7d84414e73c811.webp" : "https://auto.tancdn.com/v1/raw/45513e7b-3754-4ca0-85f8-96f11d94b80710.webp").m25048n(R$string.f6040P6).m25046l(R$string.f6029O6).m25040f(R$string.f6029O6).m25036a();
            case 36:
                User userP9 = CoreModule.c.e0.p9();
                if (NullChecker.a(userP9)) {
                    Settings settings = userP9.settings;
                    if (settings == null || !TEnum.equals(settings.lookingFor, "female")) {
                        i2 = (settings == null || !TEnum.equals(settings.lookingFor, "male")) ? R$string.f6307m8 : R$string.f6331o8;
                    } else {
                        i2 = R$string.f6319n8;
                    }
                } else {
                    i2 = R$string.f6307m8;
                }
                return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11371h8).m25048n(R$string.f6343p8).m25046l(i2).m25040f(i2).m25036a();
            case 37:
                int i15 = CoreModule.P().a().eg() ? R$string.f6366r8 : R$string.f6355q8;
                return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11399j8).m25048n(R$string.f6377s8).m25046l(i15).m25040f(i15).m25036a();
            case 38:
                int i16 = CoreModule.P().a().eg() ? R$string.f6399u8 : R$string.f6388t8;
                return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11385i8).m25048n(R$string.f6410v8).m25046l(i16).m25040f(i16).m25036a();
            case 39:
                User userP10 = CoreModule.c.e0.p9();
                if (NullChecker.a(userP10) && userP10.isFemale()) {
                    i3 = R$string.f6302m3;
                } else {
                    i3 = CoreModule.P().a().G7() ? R$string.f6290l3 : R$string.f6314n3;
                }
                if (NullChecker.a(userP10) && userP10.isFemale()) {
                    i4 = R$string.f6266j3;
                } else {
                    i4 = CoreModule.P().a().G7() ? R$string.f6254i3 : R$string.f6278k3;
                }
                return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11343f8).m25048n(i3).m25046l(i4).m25040f(i4).m25036a();
            case 40:
                String str13 = String.format("包含揭秘喜欢我的人、闪聊匹配、每月3次优先推荐等全部%s项特权", Integer.valueOf(m14634C()));
                return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11084M5).m25049o(String.format("SVIP全部%s项特权", Integer.valueOf(m14634C()))).m25047m(str13).m25041g(str13).m25036a();
            case 41:
                String string12 = CoreModule.b.getString(R$string.f6113W2);
                String string13 = CoreModule.b.getString(R$string.f6102V2);
                return xx80.m25035b().m25045k(privilege).m25044j("https://auto.tancdn.com/v1/images/eyJpZCI6IjZEWklIQ0dUN0FKSUZSNU5WQ0lZNlRXN0I0NlFEWjE0IiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4Njg2Mzg0MzU2OTg5MzczNTh9.png").m25049o(string12).m25047m(string13).m25041g(string13).m25036a();
            case 42:
                return xx80.m25035b().m25045k(privilege).m25038d(d3c0.f11312d5).m25043i(d3c0.f11326e5).m25049o("SVIP各项特权").m25047m("包含解密谁喜欢我、高级筛选、隐私保护等全部SVIP特权").m25041g("包含解密谁喜欢我、高级筛选、隐私保护等全部SVIP特权").m25036a();
            case 43:
                return xx80.m25035b().m25045k(privilege).m25049o("专属尊贵皮肤").m25047m("专属装扮边框，随时彰显与众不同").m25041g("专属装扮边框，随时彰显与众不同").m25036a();
            case 44:
                str7 = CoreModule.o.d().I5() ? "无需配对，直接向对方表达你的心意！" : zz6.u0() ? "无需送礼物，随时向他打招呼" : "无需送礼物，随时向她打招呼";
                return xx80.m25035b().m25045k(privilege).m25049o(CoreModule.o.d().I5() ? "无限抢先告白" : "无限打招呼").m25047m(str7).m25041g(str7).m25036a();
            case 45:
                return xx80.m25035b().m25045k(privilege).m25038d(zz6.u0() ? d3c0.f11391j0 : d3c0.f11377i0).m25049o("我的访客").m25047m("知晓谁看过我的资料和动态，不错过每个默默关心我的人").m25041g("知晓谁看过我的资料和动态，不错过每个默默关心我的人").m25036a();
            case 46:
                return xx80.m25035b().m25045k(privilege).m25044j(CoreModule.P().b().Bs() ? "https://auto.tancdn.com/v1/raw/85663437-d130-4bc7-bba1-5821f0b7943c12.webp" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkZPVFE3SVBPRVJWSE1FQ1JSNklUUjdSUkk1M1pXVTEzIiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTE3NzE0NjExMDk3MjM5NzMxOH0.png").m25049o(CoreModule.b.getString(R$string.f6146Z2)).m25047m(CoreModule.b.getString(m14642h())).m25041g(CoreModule.b.getString(m14642h())).m25036a();
            case 47:
                return xx80.m25035b().m25045k(privilege).m25044j("https://auto.tancdn.com/v1/raw/7e034371-9f6f-4254-95c6-16b0937f6d2b13.webp").m25049o(CoreModule.b.getString(R$string.f6326o3)).m25047m(CoreModule.b.getString(R$string.f6419w6)).m25041g(CoreModule.b.getString(R$string.f6419w6)).m25036a();
            case 48:
                return xx80.m25035b().m25045k(privilege).m25044j("https://auto.tancdn.com/v1/images/eyJpZCI6IlFFM0hMVTQ3M0haWklWVUk0MkdOSzRBQUxPRlQyRDE0IiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4Njg2NDcyMTQ2MTIwOTAzODJ9.png").m25049o(CoreModule.b.getString(R$string.f6361r3)).m25047m(CoreModule.b.getString(R$string.f6350q3)).m25041g(CoreModule.b.getString(R$string.f6350q3)).m25036a();
            case 49:
                return xx80.m25035b().m25045k(privilege).m25044j("https://auto.tancdn.com/v1/images/eyJpZCI6IjY5NTcwM0Y2MjE1MTQ1NjI4QUExNTU0QjNCMjBERTVFIiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4Njc1MTI1MzU3OTIwOTQ3MzQsInB0IjoyMDI2MDIwMzE3fQ.png").m25049o(String.format(CoreModule.b.getString(R$string.f6206e3), Integer.valueOf(xma.r3()))).m25047m(CoreModule.b.getString(R$string.f6194d3)).m25041g(CoreModule.b.getString(R$string.f6194d3)).m25036a();
            case 50:
                xx80 xx80VarM25049o = xx80.m25035b().m25045k(privilege).m25038d(zz6.u0() ? d3c0.f11363h0 : d3c0.f11349g0).m25043i(zz6.u0() ? d3c0.f11507r4 : d3c0.f11521s4).m25049o("一键配对");
                PurchaseType purchaseType3 = PurchaseType.TYPE_SUPREME_PARTNER;
                return xx80VarM25049o.m25047m(purchaseType == purchaseType3 ? String.format("一键开聊，无需等待，每天%s次开挂体验!", 5) : String.format("一键与理想型配对开聊，你的喜欢无需等待，尊享每天%s次开挂式体验", Integer.valueOf(yx80.m25534a()))).m25041g(purchaseType == purchaseType3 ? String.format("一键开聊，无需等待，每天%s次开挂体验!", 5) : String.format("一键与理想型配对开聊，你的喜欢无需等待，尊享每天%s次开挂式体验", Integer.valueOf(yx80.m25534a()))).m25036a();
            case 51:
                return xx80.m25035b().m25045k(privilege).m25038d(zz6.u0() ? d3c0.f11335f0 : d3c0.f11321e0).m25043i(zz6.u0() ? d3c0.f11307d0 : d3c0.f11293c0).m25049o("直播间徽章 入场特效").m25047m("专属徽章和入场特效，成为全场最闪亮的星").m25041g("专属徽章和入场特效，成为全场最闪亮的星").m25036a();
            case 52:
                xx80 xx80VarM25049o2 = xx80.m25035b().m25045k(privilege).m25049o("专属客服");
                PurchaseType purchaseType4 = PurchaseType.TYPE_SUPREME_PARTNER;
                return xx80VarM25049o2.m25047m(purchaseType == purchaseType4 ? "一对一专属客服，为您的体验保驾护航" : "一对一专属客服，为你的体验保驾护航").m25041g(purchaseType == purchaseType4 ? "一对一专属客服，为您的体验保驾护航" : "一对一专属客服，为你的体验保驾护航").m25036a();
            case 53:
                xx80 xx80VarM25049o3 = xx80.m25035b().m25045k(privilege).m25049o(CoreModule.o.d().I5() ? "每天3次抢先告白" : "每天3次打招呼");
                if (CoreModule.o.d().I5()) {
                    str5 = "无需配对，直接向对方表达你的心意！";
                } else {
                    str5 = String.format("向%s主动表白，真诚赢得对方的心", zz6.u0() ? "他" : "她");
                }
                xx80 xx80VarM25047m = xx80VarM25049o3.m25047m(str5);
                if (!CoreModule.o.d().I5()) {
                    str7 = String.format("向%s主动表白，真诚赢得对方的心", zz6.u0() ? "他" : "她");
                }
                return xx80VarM25047m.m25041g(str7).m25036a();
            case 54:
                String str14 = (sab0.i(purchaseType) || sab0.j(purchaseType)) ? "全程动态超级曝光" : String.format("每月%s次动态超级曝光", Integer.valueOf(CoreModule.N().h8()));
                String str15 = (sab0.i(purchaseType) || sab0.j(purchaseType)) ? "发布动态全程开启超级曝光，收获大量点赞互动" : "动态智能精准投放，收获大量浏览互动";
                return xx80.m25035b().m25045k(privilege).m25043i(zz6.u0() ? d3c0.f11419l0 : d3c0.f11405k0).m25049o(str14).m25047m(str15).m25041g(str15).m25036a();
            case 55:
                return xx80.m25035b().m25045k(Privilege.accelerate_pairing).m25049o(String.format("每月%s次加速配对", Integer.valueOf(CoreModule.P().e().x6()))).m25047m("30分钟内把你优先推荐给喜欢的人，斩获最多10倍配对！").m25041g("30分钟内把你优先推荐给喜欢的人，斩获最多10倍配对！").m25036a();
            case 56:
                return xx80.m25035b().m25045k(Privilege.city_topping).m25049o("城市置顶").m25047m("在线期间，您的资料会在第一位，曝光给所在城市中，全部符合您筛选要求的用户").m25041g("在线期间，您的资料会在第一位，曝光给所在城市中，全部符合您筛选要求的用户").m25036a();
            case 57:
                return xx80.m25035b().m25045k(Privilege.personal_customization).m25049o("私人定制").m25047m("根据您的喜好，筛选出符合您要求的用户，提升您的社交效率").m25041g("根据您的喜好，筛选出符合您要求的用户，提升您的社交效率").m25036a();
            case 58:
                return xx80.m25035b().m25045k(Privilege.mysterious_mode).m25049o("神秘模式").m25047m("神秘人模式，仍可斩获无限喜欢").m25041g("神秘人模式，仍可斩获无限喜欢").m25036a();
            case 59:
                return xx80.m25035b().m25045k(Privilege.nearby_people).m25049o("附近的人").m25047m("根据您的地理位置，为您精确搜索附近3公里内的用户").m25041g("根据您的地理位置，为您精确搜索附近3公里内的用户").m25036a();
            case 60:
                return xx80.m25035b().m25045k(Privilege.exclusive_dressing_up).m25049o("尊享装扮").m25047m("至尊合伙人独享卡片装扮").m25041g("至尊合伙人独享卡片装扮").m25036a();
            case 61:
                String str16 = String.format(Locale.getDefault(), "每月%d次机会，开启后访问其他人，对方将不会看到你的访问记录", Integer.valueOf(CoreModule.P().e().Xm()));
                return xx80.m25035b().m25045k(privilege).m25049o("隐藏我的访问足迹").m25047m(str16).m25041g(str16).m25036a();
            case 62:
                return xx80.m25035b().m25045k(privilege).m25049o(String.format("每天%s次抢先告白", Integer.valueOf(xma.t3()))).m25047m("无需配对，直接向对方表达你的心意！").m25041g("无需配对，直接向对方表达你的心意！").m25036a();
            case 63:
                return xx80.m25035b().m25045k(privilege).m25049o("精选展示男性用户探探信用分").m25047m("帮你通过真人认证，真实头像，举报记录等信息评估男性用户").m25041g("帮你通过真人认证，真实头像，举报记录等信息评估男性用户").m25043i(d3c0.f11106O).m25038d(d3c0.f11537t6).m25036a();
            case 64:
                if (sab0.q(purchaseType)) {
                    str8 = zz6.u0() ? "他" : "她";
                }
                return xx80.m25035b().m25049o(String.format("解锁更了解%s模块", str8)).m25047m(String.format("了解%s的性格，看%s是否和你合拍", str8, str8)).m25041g(String.format("了解%s的性格，看%s是否和你合拍", str8, str8)).m25045k(privilege).m25043i(zz6.u0() ? d3c0.f11120P : d3c0.f11031I8).m25038d(zz6.u0() ? d3c0.f11481p6 : d3c0.f11551u6).m25036a();
            case 65:
                return xx80.m25035b().m25045k(privilege).m25049o("广告免打扰").m25047m("一键关闭开屏广告，高效社交无需等待，24h后生效").m25041g("一键关闭开屏广告，高效社交无需等待，24h后生效").m25043i(d3c0.f11134Q).m25038d(d3c0.f11495q6).m25036a();
            case MediaPickerParamsObject.MEDIA_PICKER_REQUEST_CODE /* 66 */:
                return xx80.m25035b().m25045k(privilege).m25049o("直接屏蔽骚扰词").m25047m("帮你直接拦截骚扰词，聊天更安心").m25041g("帮你直接拦截骚扰词，聊天更安心").m25043i(d3c0.f11092N).m25038d(d3c0.f11509r6).m25036a();
            case MediaPickerParamsObject.MEDIA_PICKER_RESULT_CODE /* 67 */:
                return xx80.m25035b().m25045k(privilege).m25049o("任意修改定位").m25047m("前往学校附近、旅行目的地或任意地方交友").m25041g("前往学校附近、旅行目的地或任意地方交友").m25043i(d3c0.f11092N).m25038d(d3c0.f11509r6).m25036a();
            case 68:
                return xx80.m25035b().m25045k(privilege).m25049o(String.format("每天%s次免费找搭子特权", Integer.valueOf(CoreModule.c.Q1.R.I()))).m25047m("直接和你心仪的对象发起私聊，邀约无需等待").m25041g("直接和你心仪的对象发起私聊，邀约无需等待").m25043i(d3c0.f11612yb).m25036a();
            case 69:
                return xx80.m25035b().m25045k(privilege).m25049o(String.format("每天%s次额外免费盲盒", Integer.valueOf(CoreModule.c.Q1.R.H()))).m25047m("开启惊喜盲盒对象，认识有趣的新朋友").m25041g("开启惊喜盲盒对象，认识有趣的新朋友").m25043i(d3c0.f11626zb).m25036a();
            case 70:
                String str17 = zz6.u0() ? "优先让他看见你，知晓你的特别心意" : "优先让她看见你，知晓你的特别心意";
                return xx80.m25035b().m25045k(privilege).m25039e(d3c0.f11554u9).m25042h(b1c0.f9849p0, b1c0.f9847o0).m25049o("每天1个超级喜欢").m25047m(str17).m25041g(str17).m25036a();
            case 71:
                return xx80.m25035b().m25045k(privilege).m25049o("查看消息是否已读").m25047m("你发出的消息还没被看到？还是已读不回？").m25041g("你发出的消息还没被看到？还是已读不回？").m25043i(d3c0.f11361gc).m25036a();
            case 72:
                return xx80.m25035b().m25045k(privilege).m25049o("私人定制").m25047m("根据定制需求实时推送，开启专属社交体验").m25041g("根据定制需求实时推送，开启专属社交体验").m25043i(d3c0.f11410k5).m25036a();
            case 73:
                return xx80.m25035b().m25045k(privilege).m25049o("定向隐身").m25047m("不让距离太近的人看到我，随时保护隐私").m25041g("不让距离太近的人看到我，随时保护隐私").m25043i(d3c0.f11245Y6).m25036a();
            case 74:
                return xx80.m25035b().m25045k(privilege).m25044j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjRDQzE3REQxNTdBNjRGRkNBNUFGRTg1Nzg5QUVENDM5IiwidyI6NzExLCJoIjozNzgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyOTE2MjEzOTkwOTY1OTU5ODIsInB0IjoyMDI1MDYxNzE1fQ.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ijc4NzFCRkFDMUZFQzQzMDc5RDMzMTFDQUMxMDY5MDJCIiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjY5MzIwNDEyNDEwMzU5Mzg4LCJwdCI6MjAyNTA2MTcxNX0.webp").m25048n(R$string.f6397u6).m25046l(R$string.f6386t6).m25040f(R$string.f6386t6).m25036a();
            default:
                return xx80.m25035b().m25045k(privilege).m25036a();
        }
    }

    /* JADX INFO: renamed from: n */
    public static List<wx80> m14648n(final PurchaseType purchaseType, final Privilege privilege, final boolean z) {
        final ArrayList arrayList = new ArrayList();
        if (z && sab0.s(purchaseType)) {
            arrayList.add(m14652r());
            return arrayList;
        }
        vwb.z(purchaseType.getPrivilegeDataForGP(CoreModule.c.e0.p9().gender), new e30() { // from class: l.ay80
            public final void call(Object obj) {
                fy80.m14639e(privilege, arrayList, z, purchaseType, (Privilege) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public static wx80 m14649o(Privilege privilege) {
        int i = C0903a.f13224a[privilege.ordinal()];
        if (i == 1) {
            int i2 = zz6.u0() ? R$string.f6216f1 : R$string.f6204e1;
            return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11183T9).m25039e(d3c0.f11554u9).m25042h(b1c0.f9849p0, b1c0.f9847o0).m25049o("每天3个超级喜欢").m25046l(i2).m25040f(i2).m25036a();
        }
        if (i == 2) {
            String string = CoreModule.b.getString(R$string.f6324o1);
            return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11105Nc).m25039e(d3c0.f10979Ec).m25042h(b1c0.f9857t0, b1c0.f9855s0).m25048n(R$string.f6336p1).m25047m(string).m25041g(string).m25036a();
        }
        if (i == 3) {
            return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11063Kc).m25039e(d3c0.f11557uc).m25042h(b1c0.f9843m0, b1c0.f9841l0).m25048n(R$string.f6122X0).m25046l(R$string.f6111W0).m25040f(R$string.f6111W0).m25036a();
        }
        if (i == 4) {
            boolean zU0 = zz6.u0();
            return xx80.m25035b().m25045k(privilege).m25039e(d3c0.f10937Bc).m25042h(b1c0.f9853r0, b1c0.f9851q0).m25048n(R$string.f6312n1).m25046l(zU0 ? R$string.f6300m1 : R$string.f6288l1).m25040f(zU0 ? R$string.f6300m1 : R$string.f6288l1).m25036a();
        }
        if (i == 30) {
            return xx80.m25035b().m25045k(privilege).m25039e(d3c0.f11487pc).m25042h(b1c0.f9849p0, b1c0.f9847o0).m25049o("隐藏活跃时间").m25047m("隐藏活跃时间").m25041g("隐藏活跃时间").m25036a();
        }
        if (i == 34) {
            return xx80.m25035b().m25045k(privilege).m25049o(CoreModule.b.getString(R$string.f6159a4)).m25047m(CoreModule.b.getString(R$string.f6147Z3)).m25041g(CoreModule.b.getString(R$string.f6147Z3)).m25036a();
        }
        if (i == 52) {
            return xx80.m25035b().m25045k(privilege).m25049o("专属客服").m25047m("一对一专属客服，为你的体验保驾护航").m25041g("一对一专属客服，为你的体验保驾护航").m25036a();
        }
        if (i == 61) {
            String str = String.format(Locale.getDefault(), "每月%次机会，开启后访问其他人，对方将不会看到你的访问记录", Integer.valueOf(CoreModule.P().e().Xm()));
            return xx80.m25035b().m25045k(privilege).m25049o("隐藏我的访问足迹").m25047m(str).m25041g(str).m25036a();
        }
        if (i == 40) {
            return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11084M5).m25049o(String.format("SVIP全部%s项特权", Integer.valueOf(m14634C()))).m25047m(String.format("包含揭秘喜欢我的人、闪聊匹配、每月3次优先推荐等全部%s项特权", Integer.valueOf(m14634C()))).m25041g(String.format("包含揭秘喜欢我的人、闪聊匹配、每月3次优先推荐等全部%s项特权", Integer.valueOf(m14634C()))).m25036a();
        }
        if (i == 41) {
            String str2 = CoreModule.P().a().Tr() ? "每天定制推荐优质婚恋用户，助你早日脱单" : "每天更新10个优质认证用户，遇见你的心动";
            return xx80.m25035b().m25045k(privilege).m25043i(zz6.u0() ? d3c0.f11070L5 : d3c0.f11056K5).m25049o("每日心动").m25047m(str2).m25041g(str2).m25036a();
        }
        switch (i) {
            case 6:
                if (!CoreModule.P().a().h5()) {
                    return xx80.m25035b().m25045k(privilege).m25039e(d3c0.f11554u9).m25042h(b1c0.f9849p0, b1c0.f9847o0).m25048n(R$string.f5999L9).m25047m(CoreModule.b.getString(R$string.f5988K9)).m25041g(CoreModule.b.getString(R$string.f5988K9)).m25036a();
                }
                int i3 = zz6.u0() ? R$string.f6216f1 : R$string.f6204e1;
                return xx80.m25035b().m25045k(privilege).m25039e(d3c0.f11554u9).m25042h(b1c0.f9849p0, b1c0.f9847o0).m25048n(R$string.f6228g1).m25046l(i3).m25040f(i3).m25036a();
            case 7:
                if (!CoreModule.P().a().h5()) {
                    return xx80.m25035b().m25045k(privilege).m25039e(d3c0.f10937Bc).m25042h(b1c0.f9853r0, b1c0.f9851q0).m25048n(R$string.f6021N9).m25046l(R$string.f6010M9).m25040f(R$string.f5997L7).m25036a();
                }
                boolean zU1 = zz6.u0();
                xx80 xx80VarM25035b = xx80.m25035b();
                xx80VarM25035b.m25045k(privilege).m25039e(d3c0.f10937Bc).m25042h(b1c0.f9853r0, b1c0.f9851q0).m25048n(R$string.f6312n1).m25046l(zU1 ? R$string.f6300m1 : R$string.f6288l1).m25040f(zU1 ? R$string.f6300m1 : R$string.f6288l1);
                if (CoreModule.P().a().Vf()) {
                    xx80VarM25035b.m25049o("反悔特权");
                    xx80VarM25035b.m25047m(zz6.u0() ? "手滑啦？使用反悔特权，重新喜欢他！" : "手滑啦？使用反悔特权，重新喜欢她！");
                    xx80VarM25035b.m25041g(zz6.u0() ? "手滑啦？使用反悔特权，重新喜欢他！" : "手滑啦？使用反悔特权，重新喜欢她！");
                }
                return xx80VarM25035b.m25036a();
            case 8:
                if (!CoreModule.P().a().h5()) {
                    return xx80.m25035b().m25045k(privilege).m25039e(d3c0.f10979Ec).m25042h(b1c0.f9857t0, b1c0.f9855s0).m25049o(CoreModule.b.getString(R$string.f6043P9)).m25047m(m14655u()).m25041g(m14655u()).m25036a();
                }
                String string2 = CoreModule.b.getString(R$string.f6324o1);
                return xx80.m25035b().m25045k(privilege).m25039e(d3c0.f10979Ec).m25042h(b1c0.f9857t0, b1c0.f9855s0).m25048n(R$string.f6336p1).m25047m(string2).m25041g(string2).m25036a();
            case MediaPickerParamsObject.FROM_JS_BRIDGE_SWIPE_CARD /* 9 */:
                return CoreModule.P().a().h5() ? xx80.m25035b().m25045k(privilege).m25039e(d3c0.f11557uc).m25042h(b1c0.f9843m0, b1c0.f9841l0).m25048n(R$string.f6122X0).m25046l(R$string.f6111W0).m25040f(R$string.f6111W0).m25036a() : xx80.m25035b().m25045k(privilege).m25039e(d3c0.f11557uc).m25042h(b1c0.f9843m0, b1c0.f9841l0).m25048n(R$string.f5977J9).m25046l(R$string.f5966I9).m25040f(R$string.f6334p).m25036a();
            case 10:
                return CoreModule.P().a().h5() ? xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11021Hc).m25049o(m14658x()).m25047m(m14656v()).m25041g(m14656v()).m25036a() : xx80.m25035b().m25045k(privilege).m25039e(d3c0.f11459nc).m25042h(b1c0.f9835i0, b1c0.f9833h0).m25048n(R$string.f5944G9).m25046l(R$string.f5933F9).m25040f(R$string.f5933F9).m25036a();
            default:
                switch (i) {
                    case MediaPickerParamsObject.FROM_PROFILE_WEALTH /* 12 */:
                        String string3 = CoreModule.b.getString(R$string.f6322o);
                        String string4 = CoreModule.b.getString(R$string.f5955H9);
                        return xx80.m25035b().m25045k(privilege).m25043i(CoreModule.P().e().jn()).m25050p(b1c0.f9809R).m25049o(string3).m25047m(string4).m25041g(string4).m25036a();
                    case MediaPickerParamsObject.FROM_CHAT_LIMIT_SHOOT_PIC /* 13 */:
                        return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11224Wb).m25050p(b1c0.f9809R).m25049o(CoreModule.b.getString(R$string.f6260i9, t0g0.f(CoreModule.P().a().Y4()))).m25046l(R$string.f6248h9).m25040f(R$string.f6248h9).m25036a();
                    case MediaPickerParamsObject.FROM_CITY_CENTER_UPLOAD_PIC /* 14 */:
                        return xx80.m25035b().m25045k(privilege).m25043i(TEnum.equals(CoreModule.c.e0.p9().gender, "female") ? d3c0.f11224Wb : d3c0.f11237Xb).m25050p(b1c0.f9809R).m25049o(CoreModule.b.getString(R$string.f6387t7)).m25046l(R$string.f6409v7).m25040f(R$string.f6409v7).m25036a();
                    case MediaPickerParamsObject.FROM_PROFILE_GAME /* 15 */:
                        if (!CoreModule.P().a().h5()) {
                            return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11278b).m25050p(b1c0.f9809R).m25049o("在线闪聊").m25047m("使用在线闪聊功能立刻获得聊得来的神秘配对，蒙脸聊天一步步发现神秘头像背后的TA！").m25041g("使用在线闪聊功能立刻获得聊得来的神秘配对，蒙脸聊天一步步发现神秘头像背后的TA！").m25036a();
                        }
                        String strIl = CoreModule.P().a().Il();
                        return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11278b).m25050p(b1c0.f9809R).m25049o(CoreModule.P().a().wp()).m25047m(String.format(strIl, CoreModule.P().a().Jj())).m25041g(String.format(strIl, CoreModule.P().a().Jj())).m25036a();
                    case MediaPickerParamsObject.FROM_DEFAULT /* 16 */:
                        return xx80.m25035b().m25045k(privilege).m25043i(d3c0.f11278b).m25050p(b1c0.f9809R).m25049o("语音闪聊").m25047m(String.format("每天额外1次语音闪聊，随时连线附近的%s", zz6.u0() ? "小哥哥" : "小姐姐")).m25041g(String.format("每天额外1次语音闪聊，随时连线附近的%s", zz6.u0() ? "小哥哥" : "小姐姐")).m25036a();
                    default:
                        switch (i) {
                            case 46:
                                return xx80.m25035b().m25045k(privilege).m25049o(CoreModule.b.getString(R$string.f6146Z2)).m25047m(CoreModule.b.getString(m14642h())).m25041g(CoreModule.b.getString(m14642h())).m25036a();
                            case 47:
                                return xx80.m25035b().m25045k(privilege).m25049o(CoreModule.b.getString(R$string.f6326o3)).m25047m(CoreModule.b.getString(R$string.f6419w6)).m25041g(CoreModule.b.getString(R$string.f6419w6)).m25036a();
                            case 48:
                                return xx80.m25035b().m25045k(privilege).m25049o(CoreModule.b.getString(R$string.f6361r3)).m25047m(CoreModule.b.getString(R$string.f6350q3)).m25041g(CoreModule.b.getString(R$string.f6350q3)).m25036a();
                            case 49:
                                return xx80.m25035b().m25045k(privilege).m25049o(String.format(CoreModule.b.getString(R$string.f6206e3), Integer.valueOf(xma.r3()))).m25047m(CoreModule.b.getString(R$string.f6194d3)).m25041g(CoreModule.b.getString(R$string.f6194d3)).m25036a();
                            case 50:
                                return xx80.m25035b().m25045k(privilege).m25043i(zz6.u0() ? d3c0.f11507r4 : d3c0.f11521s4).m25049o("一键配对").m25047m(String.format("每天额外1次语音闪聊，随时连线附近的%s", zz6.u0() ? "小哥哥" : "小姐姐")).m25041g(String.format("每天额外1次语音闪聊，随时连线附近的%s", zz6.u0() ? "小哥哥" : "小姐姐")).m25036a();
                            default:
                                return null;
                        }
                }
        }
    }

    /* JADX INFO: renamed from: p */
    public static List<wx80> m14650p(final PurchaseType purchaseType, List<Privilege> list, final Privilege privilege) {
        final ArrayList arrayList = new ArrayList();
        vwb.z(list, new e30() { // from class: l.cy80
            public final void call(Object obj) {
                fy80.m14635a(purchaseType, privilege, arrayList, (Privilege) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    public static List<wx80> m14651q(List<Privilege> list, final Privilege privilege, final PurchaseType purchaseType) {
        final ArrayList arrayList = new ArrayList();
        vwb.z(list, new e30() { // from class: l.zx80
            public final void call(Object obj) {
                fy80.m14637c(purchaseType, privilege, arrayList, (Privilege) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: r */
    public static wx80 m14652r() {
        String string;
        CoreLikers.a aVarR5 = CoreModule.c.u0.r5();
        int i = aVarR5 == null ? 0 : aVarR5.b;
        xx80 xx80VarM25048n = xx80.m25035b().m25045k(null).m25043i(d3c0.f11571vc).m25048n(R$string.f6332o9);
        if (i > 0) {
            string = CoreModule.b.getString(R$string.f6320n9, i + "");
        } else {
            string = CoreModule.b.getString(R$string.f6308m9);
        }
        return xx80VarM25048n.m25047m(string).m25040f(R$string.f6296l9).m25036a();
    }

    /* JADX INFO: renamed from: s */
    public static String m14653s(PurchaseType purchaseType) {
        return sab0.o(purchaseType) ? "展示 白金会员 尊贵标识，或者低调地隐藏会员身份" : CoreModule.b.getString(R$string.f6252i1);
    }

    /* JADX INFO: renamed from: t */
    public static String m14654t() {
        return CoreModule.b.getString(R$string.f6264j1);
    }

    /* JADX INFO: renamed from: u */
    public static String m14655u() {
        return CoreModule.b.getString(R$string.f6032O9);
    }

    /* JADX INFO: renamed from: v */
    public static String m14656v() {
        return CoreModule.b.getString(R$string.f6359r1);
    }

    /* JADX INFO: renamed from: w */
    public static String m14657w() {
        return CoreModule.b.getString(R$string.f6348q1);
    }

    /* JADX INFO: renamed from: x */
    public static String m14658x() {
        return CoreModule.b.getString(R$string.f6370s1);
    }

    /* JADX INFO: renamed from: y */
    public static ArrayList<Privilege> m14659y() {
        return PurchaseType.TYPE_GET_VIP.getPrivilegeData(CoreModule.c.e0.p9().gender);
    }

    /* JADX INFO: renamed from: z */
    public static ArrayList<Privilege> m14660z() {
        return PurchaseType.TYPE_GET_VIP.getPrivilegeDataForGP(CoreModule.c.e0.p9().gender);
    }
}
