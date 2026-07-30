package com.p051p1.mobile.putong.core.util;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.LoopSelectFillData;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.gta;
import p153l.jyb;

/* JADX INFO: loaded from: classes12.dex */
public class FriendPurposeHelper {

    public enum DrinkType {
        social("仅在社交场合"),
        fan("酒精爱好者"),
        sometime("小酌怡情"),
        quit_drink("戒酒"),
        never("滴酒不沾"),
        not_reveal("暂不透露");

        final String value;

        DrinkType(String str) {
            this.value = str;
        }

        public static String getDes(String str) {
            for (DrinkType drinkType : values()) {
                if (TextUtils.equals(str, drinkType.name())) {
                    return drinkType.value;
                }
            }
            return "";
        }

        public static List<String> getList() {
            ArrayList arrayList = new ArrayList();
            for (DrinkType drinkType : values()) {
                arrayList.add(drinkType.name());
            }
            return arrayList;
        }
    }

    public enum FitnessType {
        habit("有健身习惯"),
        occasionally("偶尔健身"),
        no_habit("无健身习惯"),
        not_reveal("暂不透露");

        final String value;

        FitnessType(String str) {
            this.value = str;
        }

        public static String getDes(String str) {
            for (FitnessType fitnessType : values()) {
                if (TextUtils.equals(str, fitnessType.name())) {
                    return fitnessType.value;
                }
            }
            return "";
        }

        public static List<String> getList() {
            ArrayList arrayList = new ArrayList();
            for (FitnessType fitnessType : values()) {
                arrayList.add(fitnessType.name());
            }
            return arrayList;
        }
    }

    public enum SmokeType {
        social("仅在社交场合"),
        often("经常吸烟"),
        quit_smoke("戒烟"),
        never("不吸烟"),
        not_reveal("暂不透露");

        final String value;

        SmokeType(String str) {
            this.value = str;
        }

        public static String getDes(String str) {
            for (SmokeType smokeType : values()) {
                if (TextUtils.equals(str, smokeType.name())) {
                    return smokeType.value;
                }
            }
            return "";
        }

        public static List<String> getList() {
            ArrayList arrayList = new ArrayList();
            for (SmokeType smokeType : values()) {
                arrayList.add(smokeType.name());
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList<LoopSelectFillData> m60606a(User user) {
        return gta.m132210e().m132214d().mo34696Gp(user);
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList<LoopSelectFillData> m60607b(User user) {
        ArrayList<LoopSelectFillData> arrayList = new ArrayList<>();
        String str = (NullChecker.m82486a(user.profile.extensions) && NullChecker.m82486a(user.profile.extensions.physical) && !jyb.m147479J(user.profile.extensions.physical.drink)) ? user.profile.extensions.physical.drink.get(0) : "";
        List<String> list = DrinkType.getList();
        for (int i = 0; i < list.size(); i++) {
            String str2 = list.get(i);
            LoopSelectFillData loopSelectFillData = new LoopSelectFillData(str2, DrinkType.getDes(str2), LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT);
            loopSelectFillData.m52766i(TextUtils.equals(loopSelectFillData.m52759b(), str));
            arrayList.add(loopSelectFillData);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList<LoopSelectFillData> m60608c(User user) {
        ArrayList<LoopSelectFillData> arrayList = new ArrayList<>();
        String str = (NullChecker.m82486a(user.profile.extensions) && NullChecker.m82486a(user.profile.extensions.physical) && !jyb.m147479J(user.profile.extensions.physical.fitness)) ? user.profile.extensions.physical.fitness.get(0) : "";
        List<String> list = FitnessType.getList();
        for (int i = 0; i < list.size(); i++) {
            String str2 = list.get(i);
            LoopSelectFillData loopSelectFillData = new LoopSelectFillData(str2, FitnessType.getDes(str2), LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT);
            loopSelectFillData.m52766i(TextUtils.equals(loopSelectFillData.m52759b(), str));
            arrayList.add(loopSelectFillData);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList<LoopSelectFillData> m60609d(User user) {
        return gta.m132210e().m132214d().mo34836gf(user);
    }

    /* JADX INFO: renamed from: e */
    public static ArrayList<LoopSelectFillData> m60610e(User user) {
        return gta.m132210e().m132214d().mo34833g7(user);
    }

    /* JADX INFO: renamed from: f */
    public static ArrayList<LoopSelectFillData> m60611f(User user) {
        return gta.m132210e().m132214d().mo34842gt(user);
    }

    /* JADX INFO: renamed from: g */
    public static ArrayList<LoopSelectFillData> m60612g(User user) {
        return gta.m132210e().m132214d().mo34932tm(user);
    }

    /* JADX INFO: renamed from: h */
    public static ArrayList<LoopSelectFillData> m60613h(User user) {
        ArrayList<LoopSelectFillData> arrayList = new ArrayList<>();
        String str = (NullChecker.m82486a(user.profile.extensions) && NullChecker.m82486a(user.profile.extensions.physical) && !jyb.m147479J(user.profile.extensions.physical.smoke)) ? user.profile.extensions.physical.smoke.get(0) : "";
        List<String> list = SmokeType.getList();
        for (int i = 0; i < list.size(); i++) {
            String str2 = list.get(i);
            LoopSelectFillData loopSelectFillData = new LoopSelectFillData(str2, SmokeType.getDes(str2), LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT);
            loopSelectFillData.m52766i(TextUtils.equals(loopSelectFillData.m52759b(), str));
            arrayList.add(loopSelectFillData);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m60614i(String str) {
        return gta.m132210e().m132214d().mo34846hf(str);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m60615j(String str) {
        return gta.m132210e().m132214d().mo34930ti(str);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m60616k(List<String> list, List<String> list2) {
        return gta.m132210e().m132214d().mo34875kf(list, list2);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m60617l(String str) {
        return gta.m132210e().m132214d().mo34764Uo(str);
    }
}
