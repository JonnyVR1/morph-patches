package com.p000p1.mobile.putong.core.p001ui.profile.exploop.item;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopCustomHomeTownTypeData;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputHomeTown;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.putong.core.data.HometownChinaItem;
import com.p1.mobile.putong.core.data.HometownSuggest;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.e30;
import l.ura;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpLoopInputHomeTown extends ExpLoopInputType {
    public ExpLoopInputHomeTown() {
        super(19, "你来自哪里?", ExpLoopInputType.ICON_HOMETOWN, ExpLoopInputType.INPUT_CUSTOM_HOMETOWN);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1904a(List list, HashMap map, HometownChinaItem hometownChinaItem) {
        list.add(hometownChinaItem.region);
        map.put(hometownChinaItem.region, hometownChinaItem.subRegion);
    }

    public static boolean existFrom(User user) {
        if (!TextUtils.isEmpty(user.profile.hometown)) {
            return true;
        }
        if (!vwb.J(user.profile.extensions.basic.country) && !TextUtils.isEmpty((CharSequence) user.profile.extensions.basic.country.get(0))) {
            return true;
        }
        if (vwb.J(user.profile.extensions.basic.province) || TextUtils.isEmpty((CharSequence) user.profile.extensions.basic.province.get(0))) {
            return (vwb.J(user.profile.extensions.basic.city) || TextUtils.isEmpty((CharSequence) user.profile.extensions.basic.city.get(0))) ? false : true;
        }
        return true;
    }

    public static HometownSuggest getHometownSuggestions() {
        return ura.e().d().N6();
    }

    public static String getSelectItemStr(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        if (TextUtils.equals(str, "其他") || !TextUtils.equals(str, "海外")) {
            sb.append(str);
        }
        if (!TextUtils.isEmpty(sb) && !TextUtils.isEmpty(str2)) {
            sb.append("·");
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            sb.append("·");
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append(str3);
        }
        return sb.toString();
    }

    public static ArrayList<String> getUserHomeTownStrs(Profile profile) {
        if (profile == null) {
            return null;
        }
        String str = vwb.J(profile.extensions.basic.country) ? "" : (String) profile.extensions.basic.country.get(0);
        String str2 = vwb.J(profile.extensions.basic.province) ? "" : (String) profile.extensions.basic.province.get(0);
        String str3 = vwb.J(profile.extensions.basic.city) ? "" : (String) profile.extensions.basic.city.get(0);
        ArrayList<String> arrayList = new ArrayList<>();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!TextUtils.equals("中国", str)) {
            arrayList.add("海外");
            arrayList.add(str);
            arrayList.add(str2);
            return arrayList;
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        arrayList.add(str2);
        arrayList.add(str3);
        arrayList.add("");
        return arrayList;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        ExpProfileLoopCustomHomeTownTypeData expProfileLoopCustomHomeTownTypeData = new ExpProfileLoopCustomHomeTownTypeData();
        if (getHometownSuggestions() != null) {
            final ArrayList arrayList = new ArrayList();
            final HashMap<String, List<String>> map = new HashMap<>();
            vwb.z(getHometownSuggestions().china, new e30() { // from class: l.sef
                public final void call(Object obj) {
                    ExpLoopInputHomeTown.m1904a(arrayList, map, (HometownChinaItem) obj);
                }
            });
            Map<String, List<String>> map2 = getHometownSuggestions().overseas;
            List<String> listM1955Q = LoopFragmentFactory.m1955Q(vwb.D(map2));
            arrayList.add("海外");
            map.put("海外", listM1955Q);
            arrayList.add("其他");
            expProfileLoopCustomHomeTownTypeData.list = arrayList;
            expProfileLoopCustomHomeTownTypeData.firstMap = map;
            expProfileLoopCustomHomeTownTypeData.secondMap = map2;
            ArrayList<String> userHomeTownStrs = getUserHomeTownStrs(user.profile);
            if (vwb.J(userHomeTownStrs)) {
                String str = user.profile.hometown;
                userHomeTownStrs = (TextUtils.equals(str, "其他") || TextUtils.equals(str, "Other")) ? vwb.f0(new String[]{"其他", "", ""}) : vwb.f0(new String[]{"", "", ""});
            }
            if (!TextUtils.isEmpty(userHomeTownStrs.get(0))) {
                expProfileLoopCustomHomeTownTypeData.selectItem1 = userHomeTownStrs.get(0);
                expProfileLoopCustomHomeTownTypeData.selectItem2 = userHomeTownStrs.get(1);
                String str2 = userHomeTownStrs.get(2);
                expProfileLoopCustomHomeTownTypeData.selectItem3 = str2;
                String selectItemStr = getSelectItemStr(expProfileLoopCustomHomeTownTypeData.selectItem1, expProfileLoopCustomHomeTownTypeData.selectItem2, str2);
                expProfileLoopCustomHomeTownTypeData.selectStr = selectItemStr;
                arrayList.remove(selectItemStr);
                arrayList.add(0, expProfileLoopCustomHomeTownTypeData.selectStr);
            }
        }
        setData(expProfileLoopCustomHomeTownTypeData);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_hometown_selection_view";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "hometown";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return existFrom(user);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ExpProfileLoopCustomHomeTownTypeData customHomeTownType = getData().getCustomHomeTownType();
        Profile profile = user.profile;
        profile.hometown = "";
        profile.extensions.basic.country = vwb.f0(new String[0]);
        user.profile.extensions.basic.province = vwb.f0(new String[0]);
        user.profile.extensions.basic.city = vwb.f0(new String[0]);
        if ("其他".equals(customHomeTownType.selectItem1)) {
            user.profile.hometown = "其他";
            return;
        }
        if ("海外".equals(customHomeTownType.selectItem1)) {
            if (!TextUtils.isEmpty(customHomeTownType.selectItem2)) {
                user.profile.extensions.basic.country.add(customHomeTownType.selectItem2);
                user.profile.hometown = customHomeTownType.selectItem2;
            }
            if (TextUtils.isEmpty(customHomeTownType.selectItem3)) {
                return;
            }
            user.profile.extensions.basic.province.add(customHomeTownType.selectItem3);
            return;
        }
        user.profile.extensions.basic.country.add("中国");
        user.profile.hometown = "中国";
        if (!TextUtils.isEmpty(customHomeTownType.selectItem1)) {
            user.profile.extensions.basic.province.add(customHomeTownType.selectItem1);
        }
        if (TextUtils.isEmpty(customHomeTownType.selectItem2)) {
            return;
        }
        user.profile.extensions.basic.city.add(customHomeTownType.selectItem2);
    }
}
