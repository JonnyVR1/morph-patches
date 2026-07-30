package p006l;

import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.d3c0;
import l.vwb;
import l.xx80;
import l.zz6;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class dyo {

    /* JADX INFO: renamed from: l.dyo$a */
    public static /* synthetic */ class C0658a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10659a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f10659a = iArr;
            try {
                iArr[Privilege.vip_unlimited_likes.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10659a[Privilege.tribe.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10659a[Privilege.vip_super_like.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10659a[Privilege.vip_undo.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10659a[Privilege.vip_location.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10659a[Privilege.vip_membership_search_gp.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10659a[Privilege.vip_membership_active_time_gp.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10659a[Privilege.vip_membership_remark_gp.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10659a[Privilege.intl_no_ad.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10659a[Privilege.vip_badge.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10659a[Privilege.vip_message_block_gp.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10659a[Privilege.see_not_match_guide.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10659a[Privilege.see_who_likes_me.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10659a[Privilege.intl_visitor.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f10659a[Privilege.picksMembership.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f10659a[Privilege.intl_advanced_filter.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f10659a[Privilege.premium_compliment.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f10659a[Privilege.liked_user.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f10659a[Privilege.boost.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f10659a[Privilege.message_read_state.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f10659a[Privilege.loveBuzz.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f10659a[Privilege.svip_badge.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f10659a[Privilege.svip_greet.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f10659a[Privilege.vip_letter_gp.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f10659a[Privilege.see_letter_gp.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f10659a[Privilege.unlimit_free_super_like.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f10659a[Privilege.full_boost.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f10659a[Privilege.immediately_match.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f10659a[Privilege.ultra_premium_badge.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static wx80 m14314a(Privilege privilege) {
        return m14315b(null, privilege);
    }

    /* JADX INFO: renamed from: b */
    public static wx80 m14315b(PurchaseType purchaseType, Privilege privilege) {
        int i;
        int i2;
        switch (C0658a.f10659a[privilege.ordinal()]) {
            case 1:
                String str = IntlCountryCodeController.m21v() ? "https://auto.tancdn.com/v1/raw/1216f433-f408-44a2-add9-e3a9969270c611.webp" : "https://auto.tancdn.com/v1/raw/9e7625c5-4002-421b-bf5c-fb6ed0ea90ee11.webp";
                if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                    str = IntlCountryCodeController.m21v() ? "https://auto.tancdn.com/v1/raw/8a46ab26-dd56-484a-bd09-43ee42fd5e1311.webp" : "https://auto.tancdn.com/v1/raw/406c7711-a037-4e25-8acf-db68636ebce010.webp";
                }
                int i3 = R.string.y5;
                return xx80.b().k(privilege).j(str).n(i3).l(IntlCountryCodeController.m21v() ? R.string.t5 : R.string.h5).f(IntlCountryCodeController.m21v() ? R.string.g5 : R.string.W4).a();
            case 2:
                return xx80.b().k(privilege).j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjRDQzE3REQxNTdBNjRGRkNBNUFGRTg1Nzg5QUVENDM5IiwidyI6NzExLCJoIjozNzgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyOTE2MjEzOTkwOTY1OTU5ODIsInB0IjoyMDI1MDYxNzE1fQ.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ijc4NzFCRkFDMUZFQzQzMDc5RDMzMTFDQUMxMDY5MDJCIiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjY5MzIwNDEyNDEwMzU5Mzg4LCJwdCI6MjAyNTA2MTcxNX0.webp").n(R.string.u6).l(R.string.u6).f(R.string.t6).a();
            case CameraSticker.STATE_COMPLETE /* 3 */:
                String str2 = IntlCountryCodeController.m21v() ? "https://auto.tancdn.com/v1/raw/4ad5dbbb-6860-4461-b45f-9a6209d7df6f11.webp" : "https://auto.tancdn.com/v1/raw/d81da4e9-8ed7-4917-a1fd-05a5446adab710.webp";
                PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                if (purchaseType == purchaseType2) {
                    str2 = IntlCountryCodeController.m21v() ? "https://auto.tancdn.com/v1/raw/b8927b15-478d-4a2b-b514-2da53e084ae010.webp" : "https://auto.tancdn.com/v1/raw/0750872a-d3b6-4b59-afec-3ed32fbb5e5511.webp";
                }
                int i4 = IntlCountryCodeController.m21v() ? R.string.F5 : R.string.E5;
                if (purchaseType == purchaseType2) {
                    i4 = IntlCountryCodeController.m21v() ? R.string.L4 : R.string.K4;
                }
                int i5 = IntlCountryCodeController.m21v() ? R.string.j5 : R.string.i5;
                boolean z = purchaseType == purchaseType2;
                boolean zM5671Oi = ura.m25555e().m25559d().m5671Oi();
                if (z && zM5671Oi) {
                    i5 = IntlCountryCodeController.m21v() ? R.string.h3 : R.string.g3;
                }
                xx80 xx80VarB = xx80.b();
                xx80VarB.k(privilege).j(str2).n(i4).l(i5).f(R.string.X4);
                return xx80VarB.a();
            case CameraSticker.STATE_ERROR /* 4 */:
                String str3 = IntlCountryCodeController.m21v() ? "https://auto.tancdn.com/v1/raw/1c363bb1-527a-4e73-bf75-af3337532e8711.webp" : "https://auto.tancdn.com/v1/raw/efbb251e-8a64-450e-80e4-af960390eabd11.webp";
                PurchaseType purchaseType3 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                if (purchaseType == purchaseType3) {
                    str3 = IntlCountryCodeController.m21v() ? "https://auto.tancdn.com/v1/raw/8e0c607c-ba1e-4754-8b7a-9ec6ceef9dfd11.webp" : "https://auto.tancdn.com/v1/raw/3e3a2ee9-7170-4b5b-92f7-d4f4dfca3dc311.webp";
                }
                int i6 = IntlCountryCodeController.m21v() ? R.string.C5 : R.string.B5;
                if (purchaseType == purchaseType3) {
                    i6 = IntlCountryCodeController.m21v() ? R.string.I4 : R.string.H4;
                }
                int i7 = IntlCountryCodeController.m21v() ? R.string.l5 : R.string.k5;
                xx80 xx80VarB2 = xx80.b();
                xx80VarB2.k(privilege).j(str3).n(i6).l(i7).g(CoreModule.f1533b.getString(R.string.Y4));
                return xx80VarB2.a();
            case 5:
                return xx80.b().k(privilege).j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/raw/fad6222d-a1b8-4505-8537-48f54a09580111.webp" : "https://auto.tancdn.com/v1/raw/30a18977-468d-4e52-a7ff-c69087efcfa411.webp").n(R.string.w5).l(R.string.m5).f(R.string.Z4).a();
            case 6:
                return xx80.b().k(privilege).j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/images/eyJpZCI6IloyWFdESVVWRkNLUFhZNUFYNFZZRFBTTFRZUkhHRTEwIiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMTc2OTQyOTIzMjkwOTA4MTc0fQ.png" : "https://auto.tancdn.com/v1/raw/6375caf8-5b50-4426-be1f-a3b88a12fe6e11.webp").n(R.string.D5).l(R.string.n5).f(R.string.a5).a();
            case 7:
                return xx80.b().k(privilege).j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/raw/d4b2a799-22f7-4973-ac67-1b2084a0ea5310.webp" : "https://auto.tancdn.com/v1/raw/8a5d2dc5-4f66-4903-b7f7-eec6197d5b1711.webp").n(R.string.x5).l(R.string.o5).f(R.string.b5).a();
            case 8:
                return xx80.b().k(privilege).j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkhTU0dQRTZPTkRBRFpCSkdQQTJORExPVkc2Q0Y0RjEwIiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDIyODk1NTIzMzkwOTUwOTM0fQ.png" : "https://auto.tancdn.com/v1/raw/7b981e39-f2fa-4441-9cd3-7908c69650ab10.webp").n(R.string.A5).l(R.string.p5).f(R.string.c5).a();
            case 9:
                return xx80.b().k(privilege).j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/raw/7e9d55ce-e487-41fe-8dd2-7a0147470ef110.webp" : "https://auto.tancdn.com/v1/raw/55c2177d-65e6-4c75-801a-499403525f5e10.webp").n(R.string.z5).l(R.string.q5).f(R.string.d5).a();
            case 10:
                int i8 = R.string.u5;
                int i9 = R.string.r5;
                int i10 = R.string.e5;
                if (PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE != purchaseType) {
                    return xx80.b().k(privilege).j("https://auto.tancdn.com/v1/raw/471883b1-4132-4349-a95a-5806d9df838510.webp").n(i8).l(i9).f(i10).a();
                }
                return xx80.b().k(privilege).j("https://auto.tancdn.com/v1/raw/f6c163cb-aa67-455d-b289-5953e6d9b54411.webp").n(R.string.B4).l(R.string.T6).g("").a();
            case 11:
                return xx80.b().k(privilege).j(purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? "https://auto.tancdn.com/v1/raw/be3eb17b-9d4e-48dc-b971-7d84414e73c811.webp" : "https://auto.tancdn.com/v1/raw/45513e7b-3754-4ca0-85f8-96f11d94b80710.webp").n(R.string.v5).l(R.string.s5).f(R.string.f5).a();
            case 12:
            case 13:
                int i11 = R.string.J4;
                return xx80.b().k(privilege).j("https://auto.tancdn.com/v1/raw/9a4c7c22-b275-44ab-8ebb-aeebc7e0a84210.webp").n(i11).l(IntlCountryCodeController.m21v() ? R.string.t4 : R.string.s4).f(IntlCountryCodeController.m21v() ? R.string.l4 : R.string.k4).a();
            case 14:
                return xx80.b().k(privilege).j(purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkVTVzVLVktJSDdKTUI2Mk1BSkdaMlZOVE1QRUk0MzE0IiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5ODM5Mzg4NzcxNjYwNzEzMDJ9.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlFFM0hMVTQ3M0haWklWVUk0MkdOSzRBQUxPRlQyRDE0IiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4Njg2NDcyMTQ2MTIwOTAzODJ9.png").o(CoreModule.f1533b.getString(R.string.N4)).m(CoreModule.f1533b.getString(R.string.u4)).g(CoreModule.f1533b.getString(R.string.m4)).a();
            case 15:
                String string = CoreModule.f1533b.getString(R.string.F4);
                return xx80.b().k(privilege).j("https://auto.tancdn.com/v1/images/eyJpZCI6IjZEWklIQ0dUN0FKSUZSNU5WQ0lZNlRXN0I0NlFEWjE0IiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4Njg2Mzg0MzU2OTg5MzczNTh9.png").o(string).m(CoreModule.f1533b.getString(R.string.v4)).g(CoreModule.f1533b.getString(R.string.n4)).a();
            case 16:
                return xx80.b().k(privilege).j("https://auto.tancdn.com/v1/raw/7e034371-9f6f-4254-95c6-16b0937f6d2b13.webp").o(CoreModule.f1533b.getString(R.string.E4)).m(CoreModule.f1533b.getString(R.string.w4)).g(CoreModule.f1533b.getString(R.string.w6)).a();
            case 17:
                return xx80.b().k(privilege).j("https://auto.tancdn.com/v1/images/eyJpZCI6IjY5NTcwM0Y2MjE1MTQ1NjI4QUExNTU0QjNCMjBERTVFIiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4Njc1MTI1MzU3OTIwOTQ3MzQsInB0IjoyMDI2MDIwMzE3fQ.png").o(CoreModule.f1533b.getString(R.string.r2)).m(String.format(CoreModule.f1533b.getString(R.string.e3), Integer.valueOf(xma.m27399r3()))).g(CoreModule.f1533b.getString(R.string.d3)).a();
            case 18:
                return xx80.b().k(privilege).j(IntlCountryCodeController.m21v() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IktXQkVFRzZHMkZGQU8yRzdXTzNTN01SUlhDREhPSzEzIiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNjg5MzQ4ODQ5NzcyNzI5MTM5fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlNXNTNKU0ZKVFdNSk5HNU5YNDJGSkZJUlhRVldFUTE0IiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTkxNzY2MzgxNzc2MjgxMzk0fQ.png").o(CoreModule.f1533b.getString(R.string.M4)).m(CoreModule.f1533b.getString(R.string.x4)).g(CoreModule.f1533b.getString(R.string.o4)).a();
            case 19:
                int i12 = R.string.o;
                if (IntlCountryCodeController.m21v()) {
                    i12 = R.string.C4;
                }
                return xx80.b().k(privilege).j("https://auto.tancdn.com/v1/raw/11c58ba4-4e09-4b06-907e-46899bf7117611.webp").n(i12).l(R.string.y4).f(R.string.p4).a();
            case 20:
                int i13 = R.string.G4;
                return xx80.b().k(privilege).j("https://auto.tancdn.com/v1/raw/1ed2b13c-d582-4afa-8c09-32d9fc4f2f9a10.webp").n(i13).l(R.string.z4).f(R.string.q4).a();
            case 21:
                return xx80.b().k(privilege).j(CoreModule.m1854P().m11707b().mo7029Bs() ? "https://auto.tancdn.com/v1/raw/85663437-d130-4bc7-bba1-5821f0b7943c12.webp" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkZPVFE3SVBPRVJWSE1FQ1JSNklUUjdSUkk1M1pXVTEzIiwidyI6NzExLCJoIjozODEsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTE3NzE0NjExMDk3MjM5NzMxOH0.png").o(CoreModule.f1533b.getString(R.string.D4)).m(CoreModule.f1533b.getString(R.string.A4)).g(CoreModule.f1533b.getString(R.string.r4)).a();
            case 22:
                return xx80.b().k(privilege).j("https://auto.tancdn.com/v1/raw/f6c163cb-aa67-455d-b289-5953e6d9b54411.webp").n(R.string.B4).m("").g("").a();
            case 23:
                String string2 = CoreModule.f1533b.getString(R.string.l6);
                String string3 = CoreModule.f1533b.getString(R.string.k6);
                return xx80.b().k(privilege).j("https://auto.tancdn.com/v1/raw/1e055c6e-1294-4455-b39b-25165fc3c4a112.webp").o(string2).m(string3).g(string3).a();
            case 24:
                boolean zU0 = zz6.u0();
                return xx80.b().k(privilege).n(zU0 ? R.string.V0 : R.string.U0).l(zU0 ? R.string.T0 : R.string.S0).f(zU0 ? R.string.T0 : R.string.S0).i(CoreModule.m1854P().m11706a().m5439fo()).a();
            case 25:
                User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
                if (NullChecker.a(userM21490p9) && userM21490p9.isFemale()) {
                    i = R.string.m3;
                } else {
                    i = CoreModule.m1854P().m11706a().m5258G7() ? R.string.l3 : R.string.n3;
                }
                if (NullChecker.a(userM21490p9) && userM21490p9.isFemale()) {
                    i2 = R.string.j3;
                } else {
                    i2 = CoreModule.m1854P().m11706a().m5258G7() ? R.string.i3 : R.string.k3;
                }
                return xx80.b().k(privilege).i(d3c0.f8).n(i).l(i2).f(i2).a();
            case 26:
                String str4 = IntlCountryCodeController.m21v() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkZYNVRDT002NkdJNEJCR0w1U0EzUUVHTkFDVlpWSjE0IiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjMyMzI1Mzc0MzY3ODcwNzQ4fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlFEVE82RjRQMlQ3RzJONEpLUFdWQ081SkdPN0FHNDE0IiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDkyNzM5ODg3OTcwMjY2NjM4fQ.png";
                int i14 = IntlCountryCodeController.m21v() ? R.string.e6 : R.string.d6;
                return xx80.b().k(privilege).j(str4).n(i14).l(IntlCountryCodeController.m21v() ? R.string.e6 : R.string.d6).f(IntlCountryCodeController.m21v() ? R.string.c6 : R.string.b6).a();
            case 27:
                int i15 = IntlCountryCodeController.m21v() ? R.string.W5 : R.string.V5;
                return xx80.b().k(privilege).j("https://auto.tancdn.com/v1/images/eyJpZCI6IkVFNk01MlNIM0hXTFQ2NUdaWDdDU1JUQVNLUjJZRzE0IiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDI0MzQ4MTI4NTA5NTY5NTY2fQ.png").n(i15).l(IntlCountryCodeController.m21v() ? R.string.W5 : R.string.V5).f(IntlCountryCodeController.m21v() ? R.string.U5 : R.string.T5).a();
            case 28:
                int i16 = R.string.Y5;
                return xx80.b().k(privilege).j("https://auto.tancdn.com/v1/images/eyJpZCI6Ilk1S1dXSlBVMjJTRVZBNUtVQkhNVEs0VUs2NVpEUzE0IiwidyI6NDc0LCJoIjoyNTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5MTE4OTg4NDA2MTk0MjExOTB9.png").n(i16).l(i16).f(R.string.X5).a();
            case 29:
                return xx80.b().k(privilege).j("https://auto.tancdn.com/v1/raw/f6c163cb-aa67-455d-b289-5953e6d9b54411.webp").n(R.string.S5).l(R.string.S5).f(R.string.R5).a();
            default:
                return xx80.b().k(privilege).a();
        }
    }

    /* JADX INFO: renamed from: c */
    public static List<Privilege> m14316c() {
        return vwb.f0(new Privilege[]{Privilege.immediately_match, Privilege.full_boost, Privilege.unlimit_free_super_like, Privilege.ultra_premium_badge});
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList<Privilege> m14317d() {
        ArrayList<Privilege> arrayListF0 = ura.m25555e().m25559d().m5609Df(CoreModule.f1534c.f3628e0.m21490p9()) ? vwb.f0(new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_location, Privilege.vip_membership_search_gp, Privilege.vip_membership_active_time_gp, Privilege.vip_membership_remark_gp, Privilege.vip_badge, Privilege.vip_message_block_gp}) : vwb.f0(new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_location, Privilege.vip_membership_search_gp, Privilege.vip_membership_active_time_gp, Privilege.vip_membership_remark_gp, Privilege.vip_badge});
        if (!IntlCountryCodeController.m10k()) {
            arrayListF0.add(7, Privilege.intl_no_ad);
        }
        if (ura.m25555e().m25559d().m5671Oi()) {
            arrayListF0.remove(Privilege.vip_super_like);
        }
        return arrayListF0;
    }

    /* JADX INFO: renamed from: e */
    public static List<Privilege> m14318e() {
        ArrayList arrayListF0 = vwb.f0(new Privilege[]{Privilege.premium_compliment, Privilege.see_who_likes_me});
        if (ura.m25555e().m25559d().m5791ir()) {
            arrayListF0.add(Privilege.intl_visitor);
        }
        if (ura.m25555e().m25559d().m5671Oi()) {
            arrayListF0.add(Privilege.vip_super_like);
        }
        arrayListF0.add(Privilege.boost);
        Privilege privilege = Privilege.liked_user;
        arrayListF0.add(privilege);
        arrayListF0.add(Privilege.picksMembership);
        arrayListF0.add(Privilege.intl_advanced_filter);
        if (ura.m25555e().m25559d().m5620F6()) {
            arrayListF0.add(Privilege.tribe);
        }
        Privilege privilege2 = Privilege.message_read_state;
        arrayListF0.add(privilege2);
        if (ura.m25555e().m25559d().m5684Rk() && arrayListF0.contains(privilege)) {
            int iIndexOf = arrayListF0.indexOf(privilege);
            arrayListF0.remove(privilege);
            if (iIndexOf == -1) {
                iIndexOf = 2;
            }
            arrayListF0.add(iIndexOf, Privilege.svip_greet);
        }
        if (ura.m25555e().m25559d().m5861t9()) {
            arrayListF0.remove(privilege2);
        }
        if (ura.m25555e().m25559d().m5682R8()) {
            arrayListF0.add(Privilege.loveBuzz);
        }
        return arrayListF0;
    }
}
