package com.p046p1.mobile.putong.core.p053ui.messages.helper;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatHeat;
import com.p046p1.mobile.putong.core.data.Sticker;
import com.p046p1.mobile.putong.core.data.WarmingUpEmoItem;
import com.p046p1.mobile.putong.core.data.WarmingUpEmoResConfig;
import com.p046p1.mobile.putong.core.data.WarmingUpResConfig;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import p149l.c3c0;
import p149l.juk;
import p149l.vwb;

/* JADX INFO: loaded from: classes3.dex */
public class MessageWarmingUpHelper {

    public enum TempDownEnum {
        message("send_message", "发条消息，立刻回温"),
        photo("send_photo", "分享照片，立刻回温"),
        chuEmo("send_chuochuo_emoji", "戳%s一下，立刻回温"),
        friendEmo("send_friends_emoji", "发送表情，立刻回温");

        public String content = "";
        public String imageRes = "";
        public String key;
        public String title;

        TempDownEnum(String str, String str2) {
            this.key = str;
            this.title = str2;
        }
    }

    public enum WarmingUpLevel {
        not("", 0),
        first("", 1),
        second("chuochuo_emoji", 2),
        third("special_remind", 3),
        four("friends_emoji", 4),
        five("private_chat", 5);

        public String key;
        public int value;

        WarmingUpLevel(String str, int i) {
            this.key = str;
            this.value = i;
        }

        public WarmingUpLevel next() {
            int i = C8530a.f31818a[ordinal()];
            if (i == 1) {
                return second;
            }
            if (i == 2) {
                return third;
            }
            if (i == 3) {
                return four;
            }
            if (i == 4) {
                return five;
            }
            if (i != 6) {
                return null;
            }
            return first;
        }

        public WarmingUpLevel pre() {
            int i = C8530a.f31818a[ordinal()];
            if (i == 1) {
                return not;
            }
            if (i == 2) {
                return first;
            }
            if (i == 3) {
                return second;
            }
            if (i == 4) {
                return third;
            }
            if (i != 5) {
                return null;
            }
            return four;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.helper.MessageWarmingUpHelper$a */
    public static /* synthetic */ class C8530a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f31818a;

        static {
            int[] iArr = new int[WarmingUpLevel.values().length];
            f31818a = iArr;
            try {
                iArr[WarmingUpLevel.first.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31818a[WarmingUpLevel.second.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31818a[WarmingUpLevel.third.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31818a[WarmingUpLevel.four.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31818a[WarmingUpLevel.five.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31818a[WarmingUpLevel.not.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public static String m49170A(WarmingUpLevel warmingUpLevel) {
        WarmingUpResConfig warmingUpResConfigMo158325W1 = CoreModule.m29935P().m94658i().mo158325W1();
        int i = C8530a.f31818a[warmingUpLevel.ordinal()];
        if (i == 1) {
            if (TextUtils.isEmpty(warmingUpResConfigMo158325W1.core_warming_up_rq_0)) {
                return "https://auto.tancdn.com/v1/raw/1e0dfaaa-44ae-48e8-b429-f7ea9c78d5a313.svga";
            }
            return "https://auto.tancdn.com/v1/raw/" + warmingUpResConfigMo158325W1.core_warming_up_rq_0;
        }
        if (i == 2) {
            if (TextUtils.isEmpty(warmingUpResConfigMo158325W1.core_warming_up_rq_1)) {
                return "https://auto.tancdn.com/v1/raw/96212cc2-db38-4a85-bd5b-72c1dfc0d15010.svga";
            }
            return "https://auto.tancdn.com/v1/raw/" + warmingUpResConfigMo158325W1.core_warming_up_rq_1;
        }
        if (i == 3) {
            if (TextUtils.isEmpty(warmingUpResConfigMo158325W1.core_warming_up_rq_2)) {
                return "https://auto.tancdn.com/v1/raw/5926720d-b9c1-4a2b-b08a-b0e9c9cbb8d911.svga";
            }
            return "https://auto.tancdn.com/v1/raw/" + warmingUpResConfigMo158325W1.core_warming_up_rq_2;
        }
        if (i == 4) {
            if (TextUtils.isEmpty(warmingUpResConfigMo158325W1.core_warming_up_rq_3)) {
                return "https://auto.tancdn.com/v1/raw/22e435d4-c0b7-4ee5-a5bc-25d4c24677c411.svga";
            }
            return "https://auto.tancdn.com/v1/raw/" + warmingUpResConfigMo158325W1.core_warming_up_rq_3;
        }
        if (i != 5) {
            return "";
        }
        if (TextUtils.isEmpty(warmingUpResConfigMo158325W1.core_warming_up_rq_4)) {
            return "https://auto.tancdn.com/v1/raw/296b1d3b-f19a-4b4e-87f9-d6aa2264fce410.svga";
        }
        return "https://auto.tancdn.com/v1/raw/" + warmingUpResConfigMo158325W1.core_warming_up_rq_4;
    }

    /* JADX INFO: renamed from: a */
    public static HashMap<String, String> m49171a() {
        HashMap<String, String> map = new HashMap<>();
        WarmingUpEmoResConfig warmingUpEmoResConfigMo158408m0 = CoreModule.m29935P().m94658i().mo158408m0();
        map.put("在吗", TextUtils.isEmpty(warmingUpEmoResConfigMo158408m0.poke_sticker_svga_zaima) ? "https://auto.tancdn.com/v1/raw/4a7a48e4-d738-412a-b85a-1a0b43ed87fe12.svga" : warmingUpEmoResConfigMo158408m0.poke_sticker_svga_zaima);
        map.put("震惊", TextUtils.isEmpty(warmingUpEmoResConfigMo158408m0.poke_sticker_svga_jy) ? "https://auto.tancdn.com/v1/raw/666dc8ee-ebdf-4c4b-bf58-941b60d09c9512.svga" : warmingUpEmoResConfigMo158408m0.poke_sticker_svga_jy);
        map.put("大笑", TextUtils.isEmpty(warmingUpEmoResConfigMo158408m0.poke_sticker_svga_dx) ? "https://auto.tancdn.com/v1/raw/6b431924-e985-4bf2-94ef-06e43ab9c47b13.svga" : warmingUpEmoResConfigMo158408m0.poke_sticker_svga_dx);
        map.put("大哭", TextUtils.isEmpty(warmingUpEmoResConfigMo158408m0.poke_sticker_svga_dk) ? "https://auto.tancdn.com/v1/raw/3e21b430-83c2-4d65-a3e7-7ef1cb66117f12.svga" : warmingUpEmoResConfigMo158408m0.poke_sticker_svga_dk);
        map.put("比心", TextUtils.isEmpty(warmingUpEmoResConfigMo158408m0.poke_sticker_svga_bixin) ? "https://auto.tancdn.com/v1/raw/573b4443-72ec-4619-b5f1-ee6c2637a5f313.svga" : warmingUpEmoResConfigMo158408m0.poke_sticker_svga_bixin);
        map.put("晚安", TextUtils.isEmpty(warmingUpEmoResConfigMo158408m0.poke_sticker_svga_wanan) ? "https://auto.tancdn.com/v1/raw/5be8c9d1-e502-4ef4-9861-d5a469fe3abd13.svga" : warmingUpEmoResConfigMo158408m0.poke_sticker_svga_wanan);
        return map;
    }

    /* JADX INFO: renamed from: b */
    public static String m49172b(double d) {
        double dRound = Math.round(d * 10.0d) / 10.0d;
        return ((double) Math.round(dRound)) - d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? String.valueOf((long) dRound) : String.valueOf(dRound);
    }

    /* JADX INFO: renamed from: c */
    public static int m49173c(WarmingUpLevel warmingUpLevel) {
        int i = C8530a.f31818a[warmingUpLevel.ordinal()];
        if (i == 2) {
            return -2690561;
        }
        if (i == 3) {
            return -3114;
        }
        if (i != 4) {
            return i != 5 ? -4641 : -7714;
        }
        return -6191;
    }

    /* JADX INFO: renamed from: d */
    public static String m49174d() {
        return juk.m143323e() ? Constants.VIA_REPORT_TYPE_JOININ_GROUP : "2000013";
    }

    /* JADX INFO: renamed from: e */
    public static WarmingUpLevel m49175e(ChatHeat chatHeat) {
        return NullChecker.m81303a(chatHeat) ? m49188r(chatHeat.degree) : WarmingUpLevel.not;
    }

    /* JADX INFO: renamed from: f */
    public static WarmingUpLevel m49176f(double d) {
        if (d >= 20.0d) {
            return WarmingUpLevel.five;
        }
        if (d >= 15.0d) {
            return WarmingUpLevel.four;
        }
        if (d >= 10.0d) {
            return WarmingUpLevel.third;
        }
        if (d >= 5.0d) {
            return WarmingUpLevel.second;
        }
        return d >= 1.0d ? WarmingUpLevel.first : WarmingUpLevel.not;
    }

    /* JADX INFO: renamed from: g */
    public static double m49177g(WarmingUpLevel warmingUpLevel) {
        int i = C8530a.f31818a[warmingUpLevel.ordinal()];
        if (i == 1) {
            return 1.0d;
        }
        if (i == 2) {
            return 5.0d;
        }
        if (i == 3) {
            return 10.0d;
        }
        if (i == 4) {
            return 15.0d;
        }
        if (i != 5) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        return 20.0d;
    }

    /* JADX INFO: renamed from: h */
    public static double m49178h(WarmingUpLevel warmingUpLevel) {
        int i = C8530a.f31818a[warmingUpLevel.ordinal()];
        if (i == 1) {
            return 5.0d;
        }
        if (i == 2) {
            return 15.0d;
        }
        if (i == 3) {
            return 23.0d;
        }
        if (i == 4) {
            return 30.6d;
        }
        if (i != 5) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        return 34.0d;
    }

    /* JADX INFO: renamed from: i */
    public static int m49179i(WarmingUpLevel warmingUpLevel) {
        int i = C8530a.f31818a[warmingUpLevel.ordinal()];
        if (i == 2) {
            return -1837313;
        }
        if (i == 3) {
            return -1821;
        }
        if (i != 4) {
            return i != 5 ? -4641 : -5914;
        }
        return -4128;
    }

    /* JADX INFO: renamed from: j */
    public static int m49180j(WarmingUpLevel warmingUpLevel) {
        int i = C8530a.f31818a[warmingUpLevel.ordinal()];
        if (i == 1) {
            return -394759;
        }
        if (i == 2) {
            return -918785;
        }
        if (i == 3) {
            return -132370;
        }
        if (i != 4) {
            return i != 5 ? 0 : -133901;
        }
        return -132877;
    }

    /* JADX INFO: renamed from: k */
    public static int m49181k(WarmingUpLevel warmingUpLevel) {
        int i = C8530a.f31818a[warmingUpLevel.ordinal()];
        if (i == 1) {
            return c3c0.f78832p4;
        }
        if (i == 2) {
            return c3c0.f78895w4;
        }
        if (i == 3) {
            return c3c0.f78823o4;
        }
        if (i == 4) {
            return c3c0.f78821o2;
        }
        if (i != 5) {
            return 0;
        }
        return c3c0.f78624R3;
    }

    /* JADX INFO: renamed from: l */
    public static int m49182l(WarmingUpLevel warmingUpLevel) {
        int i = C8530a.f31818a[warmingUpLevel.ordinal()];
        if (i == 1) {
            return -98787;
        }
        if (i == 2) {
            return -10368257;
        }
        if (i == 3) {
            return -15314;
        }
        if (i != 4) {
            return i != 5 ? 0 : -31880;
        }
        return -24246;
    }

    /* JADX INFO: renamed from: m */
    public static int m49183m(WarmingUpLevel warmingUpLevel) {
        int i = C8530a.f31818a[warmingUpLevel.ordinal()];
        if (i == 2) {
            return -1640449;
        }
        if (i == 3) {
            return -1570;
        }
        if (i != 4) {
            return i != 5 ? -1 : -5914;
        }
        return -5157;
    }

    /* JADX INFO: renamed from: n */
    public static String m49184n() {
        return juk.m143323e() ? Constants.VIA_REPORT_TYPE_MAKE_FRIEND : "2000012";
    }

    /* JADX INFO: renamed from: o */
    public static String m49185o(Sticker sticker) {
        return m49171a().get(sticker.name);
    }

    /* JADX INFO: renamed from: p */
    public static double m49186p(WarmingUpLevel warmingUpLevel, double d) {
        if (d < 1.0d) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        if (d >= 20.0d) {
            return 34.0d;
        }
        WarmingUpLevel next = warmingUpLevel.next();
        if (!NullChecker.m81303a(next)) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        double dM49177g = m49177g(warmingUpLevel);
        double dM49177g2 = (d - dM49177g) / (m49177g(next) - dM49177g);
        double dM49178h = m49178h(warmingUpLevel);
        return dM49178h + ((m49178h(next) - dM49178h) * dM49177g2);
    }

    /* JADX INFO: renamed from: q */
    public static TempDownEnum m49187q(WarmingUpLevel warmingUpLevel, String str) {
        if (warmingUpLevel == null || TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        WarmingUpResConfig warmingUpResConfigMo158325W1 = CoreModule.m29935P().m94658i().mo158325W1();
        if (!vwb.m200296J(warmingUpResConfigMo158325W1.restore_heat_guide_text)) {
            WarmingUpEmoItem warmingUpEmoItem = warmingUpResConfigMo158325W1.restore_heat_guide_text.get(new Random().nextInt(warmingUpResConfigMo158325W1.restore_heat_guide_text.size()));
            TempDownEnum tempDownEnum = TempDownEnum.message;
            tempDownEnum.content = warmingUpEmoItem.key;
            tempDownEnum.imageRes = warmingUpEmoItem.value;
            arrayList.add(tempDownEnum);
        }
        TempDownEnum tempDownEnum2 = TempDownEnum.photo;
        tempDownEnum2.content = "选择照片";
        arrayList.add(tempDownEnum2);
        if (warmingUpLevel.value >= WarmingUpLevel.second.value && !vwb.m200296J(warmingUpResConfigMo158325W1.restore_heat_guide_poke_sticker)) {
            WarmingUpEmoItem warmingUpEmoItem2 = warmingUpResConfigMo158325W1.restore_heat_guide_poke_sticker.get(new Random().nextInt(warmingUpResConfigMo158325W1.restore_heat_guide_poke_sticker.size()));
            TempDownEnum tempDownEnum3 = TempDownEnum.chuEmo;
            tempDownEnum3.content = warmingUpEmoItem2.key;
            tempDownEnum3.imageRes = warmingUpEmoItem2.value;
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
            if (NullChecker.m81303a(userM169430Pa)) {
                tempDownEnum3.title = String.format(tempDownEnum3.title, userM169430Pa.isFemale() ? "她" : "他");
            }
            arrayList.add(tempDownEnum3);
        }
        if (warmingUpLevel.value >= WarmingUpLevel.four.value && !vwb.m200296J(warmingUpResConfigMo158325W1.restore_heat_guide_intimate_sticker)) {
            WarmingUpEmoItem warmingUpEmoItem3 = warmingUpResConfigMo158325W1.restore_heat_guide_intimate_sticker.get(new Random().nextInt(warmingUpResConfigMo158325W1.restore_heat_guide_intimate_sticker.size()));
            TempDownEnum tempDownEnum4 = TempDownEnum.friendEmo;
            tempDownEnum4.content = warmingUpEmoItem3.key;
            tempDownEnum4.imageRes = warmingUpEmoItem3.value;
            arrayList.add(tempDownEnum4);
        }
        return (TempDownEnum) arrayList.get(new Random().nextInt(arrayList.size()));
    }

    /* JADX INFO: renamed from: r */
    public static WarmingUpLevel m49188r(double d) {
        if (d >= 34.0d) {
            return WarmingUpLevel.five;
        }
        if (d >= 30.6d) {
            return WarmingUpLevel.four;
        }
        if (d >= 23.0d) {
            return WarmingUpLevel.third;
        }
        if (d >= 15.0d) {
            return WarmingUpLevel.second;
        }
        return d >= 5.0d ? WarmingUpLevel.first : WarmingUpLevel.not;
    }

    /* JADX INFO: renamed from: s */
    public static String m49189s(WarmingUpLevel warmingUpLevel) {
        int i = C8530a.f31818a[warmingUpLevel.ordinal()];
        if (i == 2) {
            return "已解锁戳戳表情";
        }
        if (i == 3) {
            return "已解锁特别提醒";
        }
        if (i != 4) {
            return i != 5 ? "" : "已解锁1v1专属聊天";
        }
        return "已解锁密友表情";
    }

    /* JADX INFO: renamed from: t */
    public static int m49190t(WarmingUpLevel warmingUpLevel) {
        int i = C8530a.f31818a[warmingUpLevel.ordinal()];
        if (i == 2) {
            return c3c0.f78651U6;
        }
        if (i == 3) {
            return c3c0.f78675X6;
        }
        if (i == 4) {
            return c3c0.f78659V6;
        }
        if (i != 5) {
            return 0;
        }
        return c3c0.f78643T6;
    }

    /* JADX INFO: renamed from: u */
    public static String m49191u(WarmingUpLevel warmingUpLevel) {
        int i = C8530a.f31818a[warmingUpLevel.ordinal()];
        if (i == 2) {
            return "你们已达到春天的温度";
        }
        if (i == 3) {
            return "你们已达到指尖的温度";
        }
        if (i != 4) {
            return i != 5 ? "" : "你们已达到拥抱的温度";
        }
        return "你们已达到掌心的温度";
    }

    /* JADX INFO: renamed from: v */
    public static void m49192v(String str) {
    }

    /* JADX INFO: renamed from: w */
    public static String m49193w(WarmingUpLevel warmingUpLevel) {
        WarmingUpResConfig warmingUpResConfigMo158325W1 = CoreModule.m29935P().m94658i().mo158325W1();
        int i = C8530a.f31818a[warmingUpLevel.ordinal()];
        if (i == 2) {
            if (TextUtils.isEmpty(warmingUpResConfigMo158325W1.core_down_left_bottom_1)) {
                return "https://auto.tancdn.com/v1/raw/d6494004-0b4b-4e5d-8088-21bb70dba00711.svga";
            }
            return "https://auto.tancdn.com/v1/raw/" + warmingUpResConfigMo158325W1.core_down_left_bottom_1;
        }
        if (i == 3) {
            if (TextUtils.isEmpty(warmingUpResConfigMo158325W1.core_down_left_bottom_2)) {
                return "https://auto.tancdn.com/v1/raw/0e25409e-210f-4307-8599-91b6b2d5fbd613.svga";
            }
            return "https://auto.tancdn.com/v1/raw/" + warmingUpResConfigMo158325W1.core_down_left_bottom_2;
        }
        if (i != 4) {
            return "";
        }
        if (TextUtils.isEmpty(warmingUpResConfigMo158325W1.core_down_left_bottom_3)) {
            return "https://auto.tancdn.com/v1/raw/b10b7fb0-ff13-47df-a490-c71086bb296310.svga";
        }
        return "https://auto.tancdn.com/v1/raw/" + warmingUpResConfigMo158325W1.core_down_left_bottom_3;
    }

    /* JADX INFO: renamed from: x */
    public static String m49194x() {
        WarmingUpResConfig warmingUpResConfigMo158325W1 = CoreModule.m29935P().m94658i().mo158325W1();
        if (TextUtils.isEmpty(warmingUpResConfigMo158325W1.core_temp_down_rq)) {
            return "https://auto.tancdn.com/v1/raw/dc2dde91-7f17-492e-b083-8be8eb85aae810.svga";
        }
        return "https://auto.tancdn.com/v1/raw/" + warmingUpResConfigMo158325W1.core_temp_down_rq;
    }

    /* JADX INFO: renamed from: y */
    public static String m49195y(WarmingUpLevel warmingUpLevel) {
        WarmingUpResConfig warmingUpResConfigMo158325W1 = CoreModule.m29935P().m94658i().mo158325W1();
        int i = C8530a.f31818a[warmingUpLevel.ordinal()];
        if (i == 2) {
            if (TextUtils.isEmpty(warmingUpResConfigMo158325W1.core_up_left_bottom_1)) {
                return "https://auto.tancdn.com/v1/raw/a40787d7-c5ef-4a6f-a9fd-cae2fc1865b710.svga";
            }
            return "https://auto.tancdn.com/v1/raw/" + warmingUpResConfigMo158325W1.core_up_left_bottom_1;
        }
        if (i == 3) {
            if (TextUtils.isEmpty(warmingUpResConfigMo158325W1.core_up_left_bottom_2)) {
                return "https://auto.tancdn.com/v1/raw/b06d00c5-9fab-401c-bc8b-5b9c292558bf11.svga";
            }
            return "https://auto.tancdn.com/v1/raw/" + warmingUpResConfigMo158325W1.core_up_left_bottom_2;
        }
        if (i == 4) {
            if (TextUtils.isEmpty(warmingUpResConfigMo158325W1.core_up_left_bottom_3)) {
                return "https://auto.tancdn.com/v1/raw/f036548c-76ce-411c-be48-bfde95b7c7b412.svga";
            }
            return "https://auto.tancdn.com/v1/raw/" + warmingUpResConfigMo158325W1.core_up_left_bottom_3;
        }
        if (i != 5) {
            return "";
        }
        if (TextUtils.isEmpty(warmingUpResConfigMo158325W1.core_up_left_bottom_4)) {
            return "https://auto.tancdn.com/v1/raw/9fbdde57-4a1d-4524-9898-8e0d46759d0211.svga";
        }
        return "https://auto.tancdn.com/v1/raw/" + warmingUpResConfigMo158325W1.core_up_left_bottom_4;
    }

    /* JADX INFO: renamed from: z */
    public static String m49196z(WarmingUpLevel warmingUpLevel) {
        WarmingUpResConfig warmingUpResConfigMo158325W1 = CoreModule.m29935P().m94658i().mo158325W1();
        int i = C8530a.f31818a[warmingUpLevel.ordinal()];
        if (i == 2) {
            if (TextUtils.isEmpty(warmingUpResConfigMo158325W1.core_love_heart_1)) {
                return "https://auto.tancdn.com/v1/raw/3b38b93c-11c7-410d-8604-0afde92bc6c611.svga";
            }
            return "https://auto.tancdn.com/v1/raw/" + warmingUpResConfigMo158325W1.core_love_heart_1;
        }
        if (i == 3) {
            if (TextUtils.isEmpty(warmingUpResConfigMo158325W1.core_love_heart_2)) {
                return "https://auto.tancdn.com/v1/raw/b3fc4229-dcf1-4e8b-985e-8cf014102b5c11.svga";
            }
            return "https://auto.tancdn.com/v1/raw/" + warmingUpResConfigMo158325W1.core_love_heart_2;
        }
        if (i == 4) {
            if (TextUtils.isEmpty(warmingUpResConfigMo158325W1.core_love_heart_3)) {
                return "https://auto.tancdn.com/v1/raw/5596492c-6f96-4bf3-a242-dfebec998f1510.svga";
            }
            return "https://auto.tancdn.com/v1/raw/" + warmingUpResConfigMo158325W1.core_love_heart_3;
        }
        if (i != 5) {
            return "";
        }
        if (TextUtils.isEmpty(warmingUpResConfigMo158325W1.core_love_heart_4)) {
            return "https://auto.tancdn.com/v1/raw/091f058c-fd0b-4267-8f01-5813bdbc4f5710.svga";
        }
        return "https://auto.tancdn.com/v1/raw/" + warmingUpResConfigMo158325W1.core_love_heart_4;
    }
}
