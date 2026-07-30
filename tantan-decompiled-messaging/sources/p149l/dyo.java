package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class dyo {

    /* JADX INFO: renamed from: l.dyo$a */
    public static /* synthetic */ class C16502a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f88411a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f88411a = iArr;
            try {
                iArr[Privilege.vip_unlimited_likes.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88411a[Privilege.tribe.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88411a[Privilege.vip_super_like.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88411a[Privilege.vip_undo.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f88411a[Privilege.vip_location.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f88411a[Privilege.vip_membership_search_gp.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f88411a[Privilege.vip_membership_active_time_gp.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f88411a[Privilege.vip_membership_remark_gp.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f88411a[Privilege.intl_no_ad.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f88411a[Privilege.vip_badge.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f88411a[Privilege.vip_message_block_gp.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f88411a[Privilege.see_not_match_guide.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f88411a[Privilege.see_who_likes_me.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f88411a[Privilege.intl_visitor.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f88411a[Privilege.picksMembership.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f88411a[Privilege.intl_advanced_filter.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f88411a[Privilege.premium_compliment.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f88411a[Privilege.liked_user.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f88411a[Privilege.boost.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f88411a[Privilege.message_read_state.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f88411a[Privilege.loveBuzz.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f88411a[Privilege.svip_badge.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f88411a[Privilege.svip_greet.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f88411a[Privilege.vip_letter_gp.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f88411a[Privilege.see_letter_gp.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f88411a[Privilege.unlimit_free_super_like.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f88411a[Privilege.full_boost.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f88411a[Privilege.immediately_match.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f88411a[Privilege.ultra_premium_badge.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static wx80 m114087a(Privilege privilege) {
        return m114088b(null, privilege);
    }

    /* JADX INFO: renamed from: b */
    public static wx80 m114088b(PurchaseType purchaseType, Privilege privilege) {
        int i;
        int i2;
        switch (C16502a.f88411a[privilege.ordinal()]) {
            case 1:
                String str = IntlCountryCodeController.m28126v() ? "https://auto.tancdn.com/v1/raw/1216f433-f408-44a2-add9-e3a9969270c611.webp" : "https://auto.tancdn.com/v1/raw/9e7625c5-4002-421b-bf5c-fb6ed0ea90ee11.webp";
                if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                    str = IntlCountryCodeController.m28126v() ? "https://auto.tancdn.com/v1/raw/8a46ab26-dd56-484a-bd09-43ee42fd5e1311.webp" : "https://auto.tancdn.com/v1/raw/406c7711-a037-4e25-8acf-db68636ebce010.webp";
                }
                int i3 = R$string.f27662y5;
                return xx80.m211444b().m211454k(privilege).m211453j(str).m211457n(i3).m211455l(IntlCountryCodeController.m28126v() ? R$string.f27607t5 : R$string.f27466h5).m211449f(IntlCountryCodeController.m28126v() ? R$string.f27454g5 : R$string.f27337W4).m211445a();
            case 2:
                return xx80.m211444b().m211454k(privilege).m211453j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjRDQzE3REQxNTdBNjRGRkNBNUFGRTg1Nzg5QUVENDM5IiwidyI6NzExLCJoIjozNzgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyOTE2MjEzOTkwOTY1OTU5ODIsInB0IjoyMDI1MDYxNzE1fQ.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ijc4NzFCRkFDMUZFQzQzMDc5RDMzMTFDQUMxMDY5MDJCIiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjY5MzIwNDEyNDEwMzU5Mzg4LCJwdCI6MjAyNTA2MTcxNX0.webp").m211457n(R$string.f27619u6).m211455l(R$string.f27619u6).m211449f(R$string.f27608t6).m211445a();
            case 3:
                String str2 = IntlCountryCodeController.m28126v() ? "https://auto.tancdn.com/v1/raw/4ad5dbbb-6860-4461-b45f-9a6209d7df6f11.webp" : "https://auto.tancdn.com/v1/raw/d81da4e9-8ed7-4917-a1fd-05a5446adab710.webp";
                PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                if (purchaseType == purchaseType2) {
                    str2 = IntlCountryCodeController.m28126v() ? "https://auto.tancdn.com/v1/raw/b8927b15-478d-4a2b-b514-2da53e084ae010.webp" : "https://auto.tancdn.com/v1/raw/0750872a-d3b6-4b59-afec-3ed32fbb5e5511.webp";
                }
                int i4 = IntlCountryCodeController.m28126v() ? R$string.f27151F5 : R$string.f27140E5;
                if (purchaseType == purchaseType2) {
                    i4 = IntlCountryCodeController.m28126v() ? R$string.f27216L4 : R$string.f27205K4;
                }
                int i5 = IntlCountryCodeController.m28126v() ? R$string.f27490j5 : R$string.f27478i5;
                boolean z = purchaseType == purchaseType2;
                boolean zMo33734Oi = ura.m195053e().m195057d().mo33734Oi();
                if (z && zMo33734Oi) {
                    i5 = IntlCountryCodeController.m28126v() ? R$string.f27464h3 : R$string.f27452g3;
                }
                xx80 xx80VarM211444b = xx80.m211444b();
                xx80VarM211444b.m211454k(privilege).m211453j(str2).m211457n(i4).m211455l(i5).m211449f(R$string.f27348X4);
                return xx80VarM211444b.m211445a();
            case 4:
                String str3 = IntlCountryCodeController.m28126v() ? "https://auto.tancdn.com/v1/raw/1c363bb1-527a-4e73-bf75-af3337532e8711.webp" : "https://auto.tancdn.com/v1/raw/efbb251e-8a64-450e-80e4-af960390eabd11.webp";
                PurchaseType purchaseType3 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                if (purchaseType == purchaseType3) {
                    str3 = IntlCountryCodeController.m28126v() ? "https://auto.tancdn.com/v1/raw/8e0c607c-ba1e-4754-8b7a-9ec6ceef9dfd11.webp" : "https://auto.tancdn.com/v1/raw/3e3a2ee9-7170-4b5b-92f7-d4f4dfca3dc311.webp";
                }
                int i6 = IntlCountryCodeController.m28126v() ? R$string.f27118C5 : R$string.f27107B5;
                if (purchaseType == purchaseType3) {
                    i6 = IntlCountryCodeController.m28126v() ? R$string.f27183I4 : R$string.f27172H4;
                }
                int i7 = IntlCountryCodeController.m28126v() ? R$string.f27514l5 : R$string.f27502k5;
                xx80 xx80VarM211444b2 = xx80.m211444b();
                xx80VarM211444b2.m211454k(privilege).m211453j(str3).m211457n(i6).m211455l(i7).m211450g(CoreModule.f17544b.getString(R$string.f27359Y4));
                return xx80VarM211444b2.m211445a();
            case 5:
                return xx80.m211444b().m211454k(privilege).m211453j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/raw/fad6222d-a1b8-4505-8537-48f54a09580111.webp" : "https://auto.tancdn.com/v1/raw/30a18977-468d-4e52-a7ff-c69087efcfa411.webp").m211457n(R$string.f27640w5).m211455l(R$string.f27526m5).m211449f(R$string.f27370Z4).m211445a();
            case 6:
                return xx80.m211444b().m211454k(privilege).m211453j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/images/eyJpZCI6IloyWFdESVVWRkNLUFhZNUFYNFZZRFBTTFRZUkhHRTEwIiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMTc2OTQyOTIzMjkwOTA4MTc0fQ.png" : "https://auto.tancdn.com/v1/raw/6375caf8-5b50-4426-be1f-a3b88a12fe6e11.webp").m211457n(R$string.f27129D5).m211455l(R$string.f27538n5).m211449f(R$string.f27382a5).m211445a();
            case 7:
                return xx80.m211444b().m211454k(privilege).m211453j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/raw/d4b2a799-22f7-4973-ac67-1b2084a0ea5310.webp" : "https://auto.tancdn.com/v1/raw/8a5d2dc5-4f66-4903-b7f7-eec6197d5b1711.webp").m211457n(R$string.f27651x5).m211455l(R$string.f27550o5).m211449f(R$string.f27394b5).m211445a();
            case 8:
                return xx80.m211444b().m211454k(privilege).m211453j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkhTU0dQRTZPTkRBRFpCSkdQQTJORExPVkc2Q0Y0RjEwIiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDIyODk1NTIzMzkwOTUwOTM0fQ.png" : "https://auto.tancdn.com/v1/raw/7b981e39-f2fa-4441-9cd3-7908c69650ab10.webp").m211457n(R$string.f27096A5).m211455l(R$string.f27562p5).m211449f(R$string.f27406c5).m211445a();
            case 9:
                return xx80.m211444b().m211454k(privilege).m211453j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/raw/7e9d55ce-e487-41fe-8dd2-7a0147470ef110.webp" : "https://auto.tancdn.com/v1/raw/55c2177d-65e6-4c75-801a-499403525f5e10.webp").m211457n(R$string.f27673z5).m211455l(R$string.f27574q5).m211449f(R$string.f27418d5).m211445a();
            case 10:
                int i8 = R$string.f27618u5;
                int i9 = R$string.f27585r5;
                int i10 = R$string.f27430e5;
                if (PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE != purchaseType) {
                    return xx80.m211444b().m211454k(privilege).m211453j("https://auto.tancdn.com/v1/raw/471883b1-4132-4349-a95a-5806d9df838510.webp").m211457n(i8).m211455l(i9).m211449f(i10).m211445a();
                }
                return xx80.m211444b().m211454k(privilege).m211453j("https://auto.tancdn.com/v1/raw/f6c163cb-aa67-455d-b289-5953e6d9b54411.webp").m211457n(R$string.f27106B4).m211455l(R$string.f27306T6).m211450g("").m211445a();
            case 11:
                return xx80.m211444b().m211454k(privilege).m211453j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/raw/be3eb17b-9d4e-48dc-b971-7d84414e73c811.webp" : "https://auto.tancdn.com/v1/raw/45513e7b-3754-4ca0-85f8-96f11d94b80710.webp").m211457n(R$string.f27629v5).m211455l(R$string.f27596s5).m211449f(R$string.f27442f5).m211445a();
            case 12:
            case 13:
                int i11 = R$string.f27194J4;
                return xx80.m211444b().m211454k(privilege).m211453j("https://auto.tancdn.com/v1/raw/9a4c7c22-b275-44ab-8ebb-aeebc7e0a84210.webp").m211457n(i11).m211455l(IntlCountryCodeController.m28126v() ? R$string.f27606t4 : R$string.f27595s4).m211449f(IntlCountryCodeController.m28126v() ? R$string.f27513l4 : R$string.f27501k4).m211445a();
            case 14:
                return xx80.m211444b().m211454k(privilege).m211453j(purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkVTVzVLVktJSDdKTUI2Mk1BSkdaMlZOVE1QRUk0MzE0IiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5ODM5Mzg4NzcxNjYwNzEzMDJ9.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlFFM0hMVTQ3M0haWklWVUk0MkdOSzRBQUxPRlQyRDE0IiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4Njg2NDcyMTQ2MTIwOTAzODJ9.png").m211458o(CoreModule.f17544b.getString(R$string.f27238N4)).m211456m(CoreModule.f17544b.getString(R$string.f27617u4)).m211450g(CoreModule.f17544b.getString(R$string.f27525m4)).m211445a();
            case 15:
                String string = CoreModule.f17544b.getString(R$string.f27150F4);
                return xx80.m211444b().m211454k(privilege).m211453j("https://auto.tancdn.com/v1/images/eyJpZCI6IjZEWklIQ0dUN0FKSUZSNU5WQ0lZNlRXN0I0NlFEWjE0IiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4Njg2Mzg0MzU2OTg5MzczNTh9.png").m211458o(string).m211456m(CoreModule.f17544b.getString(R$string.f27628v4)).m211450g(CoreModule.f17544b.getString(R$string.f27537n4)).m211445a();
            case 16:
                return xx80.m211444b().m211454k(privilege).m211453j("https://auto.tancdn.com/v1/raw/7e034371-9f6f-4254-95c6-16b0937f6d2b13.webp").m211458o(CoreModule.f17544b.getString(R$string.f27139E4)).m211456m(CoreModule.f17544b.getString(R$string.f27639w4)).m211450g(CoreModule.f17544b.getString(R$string.f27641w6)).m211445a();
            case 17:
                return xx80.m211444b().m211454k(privilege).m211453j("https://auto.tancdn.com/v1/images/eyJpZCI6IjY5NTcwM0Y2MjE1MTQ1NjI4QUExNTU0QjNCMjBERTVFIiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4Njc1MTI1MzU3OTIwOTQ3MzQsInB0IjoyMDI2MDIwMzE3fQ.png").m211458o(CoreModule.f17544b.getString(R$string.f27582r2)).m211456m(String.format(CoreModule.f17544b.getString(R$string.f27428e3), Integer.valueOf(xma.m210091r3()))).m211450g(CoreModule.f17544b.getString(R$string.f27416d3)).m211445a();
            case 18:
                return xx80.m211444b().m211454k(privilege).m211453j(IntlCountryCodeController.m28126v() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IktXQkVFRzZHMkZGQU8yRzdXTzNTN01SUlhDREhPSzEzIiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNjg5MzQ4ODQ5NzcyNzI5MTM5fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlNXNTNKU0ZKVFdNSk5HNU5YNDJGSkZJUlhRVldFUTE0IiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTkxNzY2MzgxNzc2MjgxMzk0fQ.png").m211458o(CoreModule.f17544b.getString(R$string.f27227M4)).m211456m(CoreModule.f17544b.getString(R$string.f27650x4)).m211450g(CoreModule.f17544b.getString(R$string.f27549o4)).m211445a();
            case 19:
                int i12 = R$string.f27544o;
                if (IntlCountryCodeController.m28126v()) {
                    i12 = R$string.f27117C4;
                }
                return xx80.m211444b().m211454k(privilege).m211453j("https://auto.tancdn.com/v1/raw/11c58ba4-4e09-4b06-907e-46899bf7117611.webp").m211457n(i12).m211455l(R$string.f27661y4).m211449f(R$string.f27561p4).m211445a();
            case 20:
                int i13 = R$string.f27161G4;
                return xx80.m211444b().m211454k(privilege).m211453j("https://auto.tancdn.com/v1/raw/1ed2b13c-d582-4afa-8c09-32d9fc4f2f9a10.webp").m211457n(i13).m211455l(R$string.f27672z4).m211449f(R$string.f27573q4).m211445a();
            case 21:
                return xx80.m211444b().m211454k(privilege).m211453j(CoreModule.m29935P().m94652b().mo35092Bs() ? "https://auto.tancdn.com/v1/raw/85663437-d130-4bc7-bba1-5821f0b7943c12.webp" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkZPVFE3SVBPRVJWSE1FQ1JSNklUUjdSUkk1M1pXVTEzIiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTE3NzE0NjExMDk3MjM5NzMxOH0.png").m211458o(CoreModule.f17544b.getString(R$string.f27128D4)).m211456m(CoreModule.f17544b.getString(R$string.f27095A4)).m211450g(CoreModule.f17544b.getString(R$string.f27584r4)).m211445a();
            case 22:
                return xx80.m211444b().m211454k(privilege).m211453j("https://auto.tancdn.com/v1/raw/f6c163cb-aa67-455d-b289-5953e6d9b54411.webp").m211457n(R$string.f27106B4).m211456m("").m211450g("").m211445a();
            case 23:
                String string2 = CoreModule.f17544b.getString(R$string.f27515l6);
                String string3 = CoreModule.f17544b.getString(R$string.f27503k6);
                return xx80.m211444b().m211454k(privilege).m211453j("https://auto.tancdn.com/v1/raw/1e055c6e-1294-4455-b39b-25165fc3c4a112.webp").m211458o(string2).m211456m(string3).m211450g(string3).m211445a();
            case 24:
                boolean zM221004u0 = zz6.m221004u0();
                return xx80.m211444b().m211454k(privilege).m211457n(zM221004u0 ? R$string.f27322V0 : R$string.f27311U0).m211455l(zM221004u0 ? R$string.f27300T0 : R$string.f27289S0).m211449f(zM221004u0 ? R$string.f27300T0 : R$string.f27289S0).m211452i(CoreModule.m29935P().m94651a().mo33502fo()).m211445a();
            case 25:
                User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
                if (NullChecker.m81303a(userM169527p9) && userM169527p9.isFemale()) {
                    i = R$string.f27524m3;
                } else {
                    i = CoreModule.m29935P().m94651a().mo33321G7() ? R$string.f27512l3 : R$string.f27536n3;
                }
                if (NullChecker.m81303a(userM169527p9) && userM169527p9.isFemale()) {
                    i2 = R$string.f27488j3;
                } else {
                    i2 = CoreModule.m29935P().m94651a().mo33321G7() ? R$string.f27476i3 : R$string.f27500k3;
                }
                return xx80.m211444b().m211454k(privilege).m211452i(d3c0.f83920f8).m211457n(i).m211455l(i2).m211449f(i2).m211445a();
            case 26:
                String str4 = IntlCountryCodeController.m28126v() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkZYNVRDT002NkdJNEJCR0w1U0EzUUVHTkFDVlpWSjE0IiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjMyMzI1Mzc0MzY3ODcwNzQ4fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlFEVE82RjRQMlQ3RzJONEpLUFdWQ081SkdPN0FHNDE0IiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDkyNzM5ODg3OTcwMjY2NjM4fQ.png";
                int i14 = IntlCountryCodeController.m28126v() ? R$string.f27431e6 : R$string.f27419d6;
                return xx80.m211444b().m211454k(privilege).m211453j(str4).m211457n(i14).m211455l(IntlCountryCodeController.m28126v() ? R$string.f27431e6 : R$string.f27419d6).m211449f(IntlCountryCodeController.m28126v() ? R$string.f27407c6 : R$string.f27395b6).m211445a();
            case 27:
                int i15 = IntlCountryCodeController.m28126v() ? R$string.f27338W5 : R$string.f27327V5;
                return xx80.m211444b().m211454k(privilege).m211453j("https://auto.tancdn.com/v1/images/eyJpZCI6IkVFNk01MlNIM0hXTFQ2NUdaWDdDU1JUQVNLUjJZRzE0IiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDI0MzQ4MTI4NTA5NTY5NTY2fQ.png").m211457n(i15).m211455l(IntlCountryCodeController.m28126v() ? R$string.f27338W5 : R$string.f27327V5).m211449f(IntlCountryCodeController.m28126v() ? R$string.f27316U5 : R$string.f27305T5).m211445a();
            case 28:
                int i16 = R$string.f27360Y5;
                return xx80.m211444b().m211454k(privilege).m211453j("https://auto.tancdn.com/v1/images/eyJpZCI6Ilk1S1dXSlBVMjJTRVZBNUtVQkhNVEs0VUs2NVpEUzE0IiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5MTE4OTg4NDA2MTk0MjExOTB9.png").m211457n(i16).m211455l(i16).m211449f(R$string.f27349X5).m211445a();
            case 29:
                return xx80.m211444b().m211454k(privilege).m211453j("https://auto.tancdn.com/v1/raw/f6c163cb-aa67-455d-b289-5953e6d9b54411.webp").m211457n(R$string.f27294S5).m211455l(R$string.f27294S5).m211449f(R$string.f27283R5).m211445a();
            default:
                return xx80.m211444b().m211454k(privilege).m211445a();
        }
    }

    /* JADX INFO: renamed from: c */
    public static List<Privilege> m114089c() {
        return vwb.m200324f0(Privilege.immediately_match, Privilege.full_boost, Privilege.unlimit_free_super_like, Privilege.ultra_premium_badge);
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList<Privilege> m114090d() {
        ArrayList<Privilege> arrayListM200324f0 = ura.m195053e().m195057d().mo33672Df(CoreModule.f17545c.f19639e0.m169527p9()) ? vwb.m200324f0(Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_location, Privilege.vip_membership_search_gp, Privilege.vip_membership_active_time_gp, Privilege.vip_membership_remark_gp, Privilege.vip_badge, Privilege.vip_message_block_gp) : vwb.m200324f0(Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_location, Privilege.vip_membership_search_gp, Privilege.vip_membership_active_time_gp, Privilege.vip_membership_remark_gp, Privilege.vip_badge);
        if (!IntlCountryCodeController.m28115k()) {
            arrayListM200324f0.add(7, Privilege.intl_no_ad);
        }
        if (ura.m195053e().m195057d().mo33734Oi()) {
            arrayListM200324f0.remove(Privilege.vip_super_like);
        }
        return arrayListM200324f0;
    }

    /* JADX INFO: renamed from: e */
    public static List<Privilege> m114091e() {
        ArrayList arrayListM200324f0 = vwb.m200324f0(Privilege.premium_compliment, Privilege.see_who_likes_me);
        if (ura.m195053e().m195057d().mo33854ir()) {
            arrayListM200324f0.add(Privilege.intl_visitor);
        }
        if (ura.m195053e().m195057d().mo33734Oi()) {
            arrayListM200324f0.add(Privilege.vip_super_like);
        }
        arrayListM200324f0.add(Privilege.boost);
        Privilege privilege = Privilege.liked_user;
        arrayListM200324f0.add(privilege);
        arrayListM200324f0.add(Privilege.picksMembership);
        arrayListM200324f0.add(Privilege.intl_advanced_filter);
        if (ura.m195053e().m195057d().mo33683F6()) {
            arrayListM200324f0.add(Privilege.tribe);
        }
        Privilege privilege2 = Privilege.message_read_state;
        arrayListM200324f0.add(privilege2);
        if (ura.m195053e().m195057d().mo33747Rk() && arrayListM200324f0.contains(privilege)) {
            int iIndexOf = arrayListM200324f0.indexOf(privilege);
            arrayListM200324f0.remove(privilege);
            if (iIndexOf == -1) {
                iIndexOf = 2;
            }
            arrayListM200324f0.add(iIndexOf, Privilege.svip_greet);
        }
        if (ura.m195053e().m195057d().mo33924t9()) {
            arrayListM200324f0.remove(privilege2);
        }
        if (ura.m195053e().m195057d().mo33745R8()) {
            arrayListM200324f0.add(Privilege.loveBuzz);
        }
        return arrayListM200324f0;
    }
}
