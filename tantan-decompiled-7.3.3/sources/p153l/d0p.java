package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class d0p {

    /* JADX INFO: renamed from: l.d0p$a */
    public static /* synthetic */ class C16410a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f84589a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f84589a = iArr;
            try {
                iArr[Privilege.vip_unlimited_likes.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f84589a[Privilege.tribe.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f84589a[Privilege.vip_super_like.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f84589a[Privilege.vip_undo.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f84589a[Privilege.vip_location.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f84589a[Privilege.vip_membership_search_gp.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f84589a[Privilege.vip_membership_active_time_gp.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f84589a[Privilege.vip_membership_remark_gp.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f84589a[Privilege.intl_no_ad.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f84589a[Privilege.vip_badge.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f84589a[Privilege.vip_message_block_gp.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f84589a[Privilege.see_not_match_guide.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f84589a[Privilege.see_who_likes_me.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f84589a[Privilege.intl_visitor.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f84589a[Privilege.picksMembership.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f84589a[Privilege.intl_advanced_filter.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f84589a[Privilege.premium_compliment.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f84589a[Privilege.liked_user.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f84589a[Privilege.boost.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f84589a[Privilege.message_read_state.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f84589a[Privilege.loveBuzz.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f84589a[Privilege.svip_badge.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f84589a[Privilege.svip_greet.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f84589a[Privilege.vip_letter_gp.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f84589a[Privilege.see_letter_gp.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f84589a[Privilege.unlimit_free_super_like.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f84589a[Privilege.full_boost.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f84589a[Privilege.immediately_match.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f84589a[Privilege.ultra_premium_badge.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static a690 m113419a(Privilege privilege) {
        return m113420b(null, privilege);
    }

    /* JADX INFO: renamed from: b */
    public static a690 m113420b(PurchaseType purchaseType, Privilege privilege) {
        int i;
        int i2;
        switch (C16410a.f84589a[privilege.ordinal()]) {
            case 1:
                String str = IntlCountryCodeController.m29125v() ? "https://auto.tancdn.com/v1/raw/1216f433-f408-44a2-add9-e3a9969270c611.webp" : "https://auto.tancdn.com/v1/raw/9e7625c5-4002-421b-bf5c-fb6ed0ea90ee11.webp";
                if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                    str = IntlCountryCodeController.m29125v() ? "https://auto.tancdn.com/v1/raw/8a46ab26-dd56-484a-bd09-43ee42fd5e1311.webp" : "https://auto.tancdn.com/v1/raw/406c7711-a037-4e25-8acf-db68636ebce010.webp";
                }
                int i3 = R$string.f28510y5;
                return b690.m102710b().m102720k(privilege).m102719j(str).m102723n(i3).m102721l(IntlCountryCodeController.m29125v() ? R$string.f28455t5 : R$string.f28314h5).m102715f(IntlCountryCodeController.m29125v() ? R$string.f28302g5 : R$string.f28185W4).m102711a();
            case 2:
                return b690.m102710b().m102720k(privilege).m102719j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjRDQzE3REQxNTdBNjRGRkNBNUFGRTg1Nzg5QUVENDM5IiwidyI6NzExLCJoIjozNzgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyOTE2MjEzOTkwOTY1OTU5ODIsInB0IjoyMDI1MDYxNzE1fQ.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ijc4NzFCRkFDMUZFQzQzMDc5RDMzMTFDQUMxMDY5MDJCIiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjY5MzIwNDEyNDEwMzU5Mzg4LCJwdCI6MjAyNTA2MTcxNX0.webp").m102723n(R$string.f28467u6).m102721l(R$string.f28467u6).m102715f(R$string.f28456t6).m102711a();
            case 3:
                String str2 = IntlCountryCodeController.m29125v() ? "https://auto.tancdn.com/v1/raw/4ad5dbbb-6860-4461-b45f-9a6209d7df6f11.webp" : "https://auto.tancdn.com/v1/raw/d81da4e9-8ed7-4917-a1fd-05a5446adab710.webp";
                PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                if (purchaseType == purchaseType2) {
                    str2 = IntlCountryCodeController.m29125v() ? "https://auto.tancdn.com/v1/raw/b8927b15-478d-4a2b-b514-2da53e084ae010.webp" : "https://auto.tancdn.com/v1/raw/0750872a-d3b6-4b59-afec-3ed32fbb5e5511.webp";
                }
                int i4 = IntlCountryCodeController.m29125v() ? R$string.f27999F5 : R$string.f27988E5;
                if (purchaseType == purchaseType2) {
                    i4 = IntlCountryCodeController.m29125v() ? R$string.f28064L4 : R$string.f28053K4;
                }
                int i5 = IntlCountryCodeController.m29125v() ? R$string.f28338j5 : R$string.f28326i5;
                boolean z = purchaseType == purchaseType2;
                boolean zMo34737Oi = gta.m132210e().m132214d().mo34737Oi();
                if (z && zMo34737Oi) {
                    i5 = IntlCountryCodeController.m29125v() ? R$string.f28312h3 : R$string.f28300g3;
                }
                b690 b690VarM102710b = b690.m102710b();
                b690VarM102710b.m102720k(privilege).m102719j(str2).m102723n(i4).m102721l(i5).m102715f(R$string.f28196X4);
                return b690VarM102710b.m102711a();
            case 4:
                String str3 = IntlCountryCodeController.m29125v() ? "https://auto.tancdn.com/v1/raw/1c363bb1-527a-4e73-bf75-af3337532e8711.webp" : "https://auto.tancdn.com/v1/raw/efbb251e-8a64-450e-80e4-af960390eabd11.webp";
                PurchaseType purchaseType3 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                if (purchaseType == purchaseType3) {
                    str3 = IntlCountryCodeController.m29125v() ? "https://auto.tancdn.com/v1/raw/8e0c607c-ba1e-4754-8b7a-9ec6ceef9dfd11.webp" : "https://auto.tancdn.com/v1/raw/3e3a2ee9-7170-4b5b-92f7-d4f4dfca3dc311.webp";
                }
                int i6 = IntlCountryCodeController.m29125v() ? R$string.f27966C5 : R$string.f27955B5;
                if (purchaseType == purchaseType3) {
                    i6 = IntlCountryCodeController.m29125v() ? R$string.f28031I4 : R$string.f28020H4;
                }
                int i7 = IntlCountryCodeController.m29125v() ? R$string.f28362l5 : R$string.f28350k5;
                b690 b690VarM102710b2 = b690.m102710b();
                b690VarM102710b2.m102720k(privilege).m102719j(str3).m102723n(i6).m102721l(i7).m102716g(CoreModule.f18263b.getString(R$string.f28207Y4));
                return b690VarM102710b2.m102711a();
            case 5:
                return b690.m102710b().m102720k(privilege).m102719j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/raw/fad6222d-a1b8-4505-8537-48f54a09580111.webp" : "https://auto.tancdn.com/v1/raw/30a18977-468d-4e52-a7ff-c69087efcfa411.webp").m102723n(R$string.f28488w5).m102721l(R$string.f28374m5).m102715f(R$string.f28218Z4).m102711a();
            case 6:
                return b690.m102710b().m102720k(privilege).m102719j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/images/eyJpZCI6IloyWFdESVVWRkNLUFhZNUFYNFZZRFBTTFRZUkhHRTEwIiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMTc2OTQyOTIzMjkwOTA4MTc0fQ.png" : "https://auto.tancdn.com/v1/raw/6375caf8-5b50-4426-be1f-a3b88a12fe6e11.webp").m102723n(R$string.f27977D5).m102721l(R$string.f28386n5).m102715f(R$string.f28230a5).m102711a();
            case 7:
                return b690.m102710b().m102720k(privilege).m102719j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/raw/d4b2a799-22f7-4973-ac67-1b2084a0ea5310.webp" : "https://auto.tancdn.com/v1/raw/8a5d2dc5-4f66-4903-b7f7-eec6197d5b1711.webp").m102723n(R$string.f28499x5).m102721l(R$string.f28398o5).m102715f(R$string.f28242b5).m102711a();
            case 8:
                return b690.m102710b().m102720k(privilege).m102719j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkhTU0dQRTZPTkRBRFpCSkdQQTJORExPVkc2Q0Y0RjEwIiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDIyODk1NTIzMzkwOTUwOTM0fQ.png" : "https://auto.tancdn.com/v1/raw/7b981e39-f2fa-4441-9cd3-7908c69650ab10.webp").m102723n(R$string.f27944A5).m102721l(R$string.f28410p5).m102715f(R$string.f28254c5).m102711a();
            case 9:
                return b690.m102710b().m102720k(privilege).m102719j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/raw/7e9d55ce-e487-41fe-8dd2-7a0147470ef110.webp" : "https://auto.tancdn.com/v1/raw/55c2177d-65e6-4c75-801a-499403525f5e10.webp").m102723n(R$string.f28521z5).m102721l(R$string.f28422q5).m102715f(R$string.f28266d5).m102711a();
            case 10:
                int i8 = R$string.f28466u5;
                int i9 = R$string.f28433r5;
                int i10 = R$string.f28278e5;
                if (PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE != purchaseType) {
                    return b690.m102710b().m102720k(privilege).m102719j("https://auto.tancdn.com/v1/raw/471883b1-4132-4349-a95a-5806d9df838510.webp").m102723n(i8).m102721l(i9).m102715f(i10).m102711a();
                }
                return b690.m102710b().m102720k(privilege).m102719j("https://auto.tancdn.com/v1/raw/f6c163cb-aa67-455d-b289-5953e6d9b54411.webp").m102723n(R$string.f27954B4).m102721l(R$string.f28154T6).m102716g("").m102711a();
            case 11:
                return b690.m102710b().m102720k(privilege).m102719j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/raw/be3eb17b-9d4e-48dc-b971-7d84414e73c811.webp" : "https://auto.tancdn.com/v1/raw/45513e7b-3754-4ca0-85f8-96f11d94b80710.webp").m102723n(R$string.f28477v5).m102721l(R$string.f28444s5).m102715f(R$string.f28290f5).m102711a();
            case 12:
            case 13:
                int i11 = R$string.f28042J4;
                return b690.m102710b().m102720k(privilege).m102719j("https://auto.tancdn.com/v1/raw/9a4c7c22-b275-44ab-8ebb-aeebc7e0a84210.webp").m102723n(i11).m102721l(IntlCountryCodeController.m29125v() ? R$string.f28454t4 : R$string.f28443s4).m102715f(IntlCountryCodeController.m29125v() ? R$string.f28361l4 : R$string.f28349k4).m102711a();
            case 14:
                return b690.m102710b().m102720k(privilege).m102719j(purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkVTVzVLVktJSDdKTUI2Mk1BSkdaMlZOVE1QRUk0MzE0IiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5ODM5Mzg4NzcxNjYwNzEzMDJ9.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlFFM0hMVTQ3M0haWklWVUk0MkdOSzRBQUxPRlQyRDE0IiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4Njg2NDcyMTQ2MTIwOTAzODJ9.png").m102724o(CoreModule.f18263b.getString(R$string.f28086N4)).m102722m(CoreModule.f18263b.getString(R$string.f28465u4)).m102716g(CoreModule.f18263b.getString(R$string.f28373m4)).m102711a();
            case 15:
                String string = CoreModule.f18263b.getString(R$string.f27998F4);
                return b690.m102710b().m102720k(privilege).m102719j("https://auto.tancdn.com/v1/images/eyJpZCI6IjZEWklIQ0dUN0FKSUZSNU5WQ0lZNlRXN0I0NlFEWjE0IiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4Njg2Mzg0MzU2OTg5MzczNTh9.png").m102724o(string).m102722m(CoreModule.f18263b.getString(R$string.f28476v4)).m102716g(CoreModule.f18263b.getString(R$string.f28385n4)).m102711a();
            case 16:
                return b690.m102710b().m102720k(privilege).m102719j("https://auto.tancdn.com/v1/raw/7e034371-9f6f-4254-95c6-16b0937f6d2b13.webp").m102724o(CoreModule.f18263b.getString(R$string.f27987E4)).m102722m(CoreModule.f18263b.getString(R$string.f28487w4)).m102716g(CoreModule.f18263b.getString(R$string.f28489w6)).m102711a();
            case 17:
                return b690.m102710b().m102720k(privilege).m102719j("https://auto.tancdn.com/v1/images/eyJpZCI6IjY5NTcwM0Y2MjE1MTQ1NjI4QUExNTU0QjNCMjBERTVFIiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4Njc1MTI1MzU3OTIwOTQ3MzQsInB0IjoyMDI2MDIwMzE3fQ.png").m102724o(CoreModule.f18263b.getString(R$string.f28430r2)).m102722m(String.format(CoreModule.f18263b.getString(R$string.f28276e3), Integer.valueOf(joa.m146406s3()))).m102716g(CoreModule.f18263b.getString(R$string.f28264d3)).m102711a();
            case 18:
                return b690.m102710b().m102720k(privilege).m102719j(IntlCountryCodeController.m29125v() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IktXQkVFRzZHMkZGQU8yRzdXTzNTN01SUlhDREhPSzEzIiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNjg5MzQ4ODQ5NzcyNzI5MTM5fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlNXNTNKU0ZKVFdNSk5HNU5YNDJGSkZJUlhRVldFUTE0IiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTkxNzY2MzgxNzc2MjgxMzk0fQ.png").m102724o(CoreModule.f18263b.getString(R$string.f28075M4)).m102722m(CoreModule.f18263b.getString(R$string.f28498x4)).m102716g(CoreModule.f18263b.getString(R$string.f28397o4)).m102711a();
            case 19:
                int i12 = R$string.f28392o;
                if (IntlCountryCodeController.m29125v()) {
                    i12 = R$string.f27965C4;
                }
                return b690.m102710b().m102720k(privilege).m102719j("https://auto.tancdn.com/v1/raw/11c58ba4-4e09-4b06-907e-46899bf7117611.webp").m102723n(i12).m102721l(R$string.f28509y4).m102715f(R$string.f28409p4).m102711a();
            case 20:
                int i13 = R$string.f28009G4;
                return b690.m102710b().m102720k(privilege).m102719j("https://auto.tancdn.com/v1/raw/1ed2b13c-d582-4afa-8c09-32d9fc4f2f9a10.webp").m102723n(i13).m102721l(R$string.f28520z4).m102715f(R$string.f28421q4).m102711a();
            case 21:
                return b690.m102710b().m102720k(privilege).m102719j(CoreModule.m30933P().m143406b().mo36095Bs() ? "https://auto.tancdn.com/v1/raw/85663437-d130-4bc7-bba1-5821f0b7943c12.webp" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkZPVFE3SVBPRVJWSE1FQ1JSNklUUjdSUkk1M1pXVTEzIiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTE3NzE0NjExMDk3MjM5NzMxOH0.png").m102724o(CoreModule.f18263b.getString(R$string.f27976D4)).m102722m(CoreModule.f18263b.getString(R$string.f27943A4)).m102716g(CoreModule.f18263b.getString(R$string.f28432r4)).m102711a();
            case 22:
                return b690.m102710b().m102720k(privilege).m102719j("https://auto.tancdn.com/v1/raw/f6c163cb-aa67-455d-b289-5953e6d9b54411.webp").m102723n(R$string.f27954B4).m102722m("").m102716g("").m102711a();
            case 23:
                String string2 = CoreModule.f18263b.getString(R$string.f28363l6);
                String string3 = CoreModule.f18263b.getString(R$string.f28351k6);
                return b690.m102710b().m102720k(privilege).m102719j("https://auto.tancdn.com/v1/raw/1e055c6e-1294-4455-b39b-25165fc3c4a112.webp").m102724o(string2).m102722m(string3).m102716g(string3).m102711a();
            case 24:
                boolean zM107528u0 = c17.m107528u0();
                return b690.m102710b().m102720k(privilege).m102723n(zM107528u0 ? R$string.f28170V0 : R$string.f28159U0).m102721l(zM107528u0 ? R$string.f28148T0 : R$string.f28137S0).m102715f(zM107528u0 ? R$string.f28148T0 : R$string.f28137S0).m102718i(CoreModule.m30933P().m143405a().mo34505fo()).m102711a();
            case 25:
                User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
                if (NullChecker.m82486a(userM116600p9) && userM116600p9.isFemale()) {
                    i = R$string.f28372m3;
                } else {
                    i = CoreModule.m30933P().m143405a().mo34324G7() ? R$string.f28360l3 : R$string.f28384n3;
                }
                if (NullChecker.m82486a(userM116600p9) && userM116600p9.isFemale()) {
                    i2 = R$string.f28336j3;
                } else {
                    i2 = CoreModule.m30933P().m143405a().mo34324G7() ? R$string.f28324i3 : R$string.f28348k3;
                }
                return b690.m102710b().m102720k(privilege).m102718i(jbc0.f119575f8).m102723n(i).m102721l(i2).m102715f(i2).m102711a();
            case 26:
                String str4 = IntlCountryCodeController.m29125v() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkZYNVRDT002NkdJNEJCR0w1U0EzUUVHTkFDVlpWSjE0IiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjMyMzI1Mzc0MzY3ODcwNzQ4fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlFEVE82RjRQMlQ3RzJONEpLUFdWQ081SkdPN0FHNDE0IiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDkyNzM5ODg3OTcwMjY2NjM4fQ.png";
                int i14 = IntlCountryCodeController.m29125v() ? R$string.f28279e6 : R$string.f28267d6;
                return b690.m102710b().m102720k(privilege).m102719j(str4).m102723n(i14).m102721l(IntlCountryCodeController.m29125v() ? R$string.f28279e6 : R$string.f28267d6).m102715f(IntlCountryCodeController.m29125v() ? R$string.f28255c6 : R$string.f28243b6).m102711a();
            case 27:
                int i15 = IntlCountryCodeController.m29125v() ? R$string.f28186W5 : R$string.f28175V5;
                return b690.m102710b().m102720k(privilege).m102719j("https://auto.tancdn.com/v1/images/eyJpZCI6IkVFNk01MlNIM0hXTFQ2NUdaWDdDU1JUQVNLUjJZRzE0IiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDI0MzQ4MTI4NTA5NTY5NTY2fQ.png").m102723n(i15).m102721l(IntlCountryCodeController.m29125v() ? R$string.f28186W5 : R$string.f28175V5).m102715f(IntlCountryCodeController.m29125v() ? R$string.f28164U5 : R$string.f28153T5).m102711a();
            case 28:
                int i16 = R$string.f28208Y5;
                return b690.m102710b().m102720k(privilege).m102719j("https://auto.tancdn.com/v1/images/eyJpZCI6Ilk1S1dXSlBVMjJTRVZBNUtVQkhNVEs0VUs2NVpEUzE0IiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5MTE4OTg4NDA2MTk0MjExOTB9.png").m102723n(i16).m102721l(i16).m102715f(R$string.f28197X5).m102711a();
            case 29:
                return b690.m102710b().m102720k(privilege).m102719j("https://auto.tancdn.com/v1/raw/f6c163cb-aa67-455d-b289-5953e6d9b54411.webp").m102723n(R$string.f28142S5).m102721l(R$string.f28142S5).m102715f(R$string.f28131R5).m102711a();
            default:
                return b690.m102710b().m102720k(privilege).m102711a();
        }
    }

    /* JADX INFO: renamed from: c */
    public static List<Privilege> m113421c() {
        return jyb.m147507f0(Privilege.immediately_match, Privilege.full_boost, Privilege.unlimit_free_super_like, Privilege.ultra_premium_badge);
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList<Privilege> m113422d() {
        ArrayList<Privilege> arrayListM147507f0 = gta.m132210e().m132214d().mo34675Df(CoreModule.f18264c.f20381e0.m116600p9()) ? jyb.m147507f0(Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_location, Privilege.vip_membership_search_gp, Privilege.vip_membership_active_time_gp, Privilege.vip_membership_remark_gp, Privilege.vip_badge, Privilege.vip_message_block_gp) : jyb.m147507f0(Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_location, Privilege.vip_membership_search_gp, Privilege.vip_membership_active_time_gp, Privilege.vip_membership_remark_gp, Privilege.vip_badge);
        if (!IntlCountryCodeController.m29114k()) {
            arrayListM147507f0.add(7, Privilege.intl_no_ad);
        }
        if (gta.m132210e().m132214d().mo34737Oi()) {
            arrayListM147507f0.remove(Privilege.vip_super_like);
        }
        return arrayListM147507f0;
    }

    /* JADX INFO: renamed from: e */
    public static List<Privilege> m113423e() {
        ArrayList arrayListM147507f0 = jyb.m147507f0(Privilege.premium_compliment, Privilege.see_who_likes_me);
        if (gta.m132210e().m132214d().mo34857ir()) {
            arrayListM147507f0.add(Privilege.intl_visitor);
        }
        if (gta.m132210e().m132214d().mo34737Oi()) {
            arrayListM147507f0.add(Privilege.vip_super_like);
        }
        arrayListM147507f0.add(Privilege.boost);
        Privilege privilege = Privilege.liked_user;
        arrayListM147507f0.add(privilege);
        arrayListM147507f0.add(Privilege.picksMembership);
        arrayListM147507f0.add(Privilege.intl_advanced_filter);
        if (gta.m132210e().m132214d().mo34686F6()) {
            arrayListM147507f0.add(Privilege.tribe);
        }
        Privilege privilege2 = Privilege.message_read_state;
        arrayListM147507f0.add(privilege2);
        if (gta.m132210e().m132214d().mo34750Rk() && arrayListM147507f0.contains(privilege)) {
            int iIndexOf = arrayListM147507f0.indexOf(privilege);
            arrayListM147507f0.remove(privilege);
            if (iIndexOf == -1) {
                iIndexOf = 2;
            }
            arrayListM147507f0.add(iIndexOf, Privilege.svip_greet);
        }
        if (gta.m132210e().m132214d().mo34927t9()) {
            arrayListM147507f0.remove(privilege2);
        }
        if (gta.m132210e().m132214d().mo34748R8()) {
            arrayListM147507f0.add(Privilege.loveBuzz);
        }
        return arrayListM147507f0;
    }
}
