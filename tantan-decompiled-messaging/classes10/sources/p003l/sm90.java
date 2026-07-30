package p003l;

import com.p000p1.mobile.putong.core.data.ProfileGoodcCatagory;
import com.p000p1.mobile.putong.core.data.ProfileGoodcCatagoryTestGroup;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.remote_config.RemoteConfigException;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class sm90 {

    /* JADX INFO: renamed from: a */
    public static sm90 f7386a;

    /* JADX INFO: renamed from: b */
    public static sm90 m9362b() {
        if (f7386a == null) {
            synchronized (sm90.class) {
                try {
                    if (f7386a == null) {
                        f7386a = new sm90();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f7386a;
    }

    /* JADX INFO: renamed from: a */
    public final int m9363a(List<UserStatus> list) {
        for (int i = 1; i <= 6; i++) {
            if (list.contains(UserStatus.get("RISK_TAG_GOOD_FACELESS_STATUS_3_" + i))) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public List<CoreSuggested.UserInfo> m9364c(User user, List<CoreSuggested.UserInfo> list, HashSet<String> hashSet, List<User> list2) {
        try {
            ProfileGoodcCatagory profileGoodcCatagory = (ProfileGoodcCatagory) RemoteConfig.x().v("intl_goodc_category_config", ProfileGoodcCatagory.JSON_ADAPTER);
            if (profileGoodcCatagory != null && profileGoodcCatagory.enabled) {
                profileGoodcCatagory.nullCheck();
                List<ProfileGoodcCatagoryTestGroup> list3 = profileGoodcCatagory.goodc_test_group;
                if (!vwb.J(list3) && list3.size() >= 2) {
                    ArrayList arrayList = new ArrayList();
                    List<Integer> list4 = profileGoodcCatagory.goodc_num_config;
                    if (vwb.J(list4)) {
                        return null;
                    }
                    int i = profileGoodcCatagory.goodc_total_num;
                    HashMap<String, Integer> map = new HashMap<>();
                    HashMap map2 = new HashMap();
                    for (User user2 : list2) {
                        map2.put(((DbObject) user2).id, user2);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        CoreSuggested.UserInfo userInfo = list.get(i2);
                        User user3 = (User) map2.get(userInfo.id);
                        if (user3 == null) {
                            arrayList.add(userInfo);
                        } else if (vwb.J(user3.status)) {
                            arrayList.add(userInfo);
                        } else {
                            int iM9363a = m9363a(user3.status);
                            if (iM9363a == -1) {
                                arrayList.add(userInfo);
                            } else if (!m9365d(iM9363a, map, list4) || i <= 0) {
                                hashSet.remove(userInfo.id);
                            } else {
                                arrayList2.add(userInfo);
                                i--;
                            }
                        }
                    }
                    return m9366e(arrayList, arrayList2);
                }
            }
        } catch (RemoteConfigException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9365d(int i, HashMap<String, Integer> map, List<Integer> list) {
        String str = "RISK_TAG_GOOD_FACELESS_STATUS_3_" + i;
        Integer num = map.get(str);
        if (num == null) {
            num = 0;
        }
        if (list.get(i - 1).intValue() <= num.intValue()) {
            return false;
        }
        map.put(str, Integer.valueOf(num.intValue() + 1));
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final List<CoreSuggested.UserInfo> m9366e(List<CoreSuggested.UserInfo> list, List<CoreSuggested.UserInfo> list2) {
        for (CoreSuggested.UserInfo userInfo : list2) {
            int size = (list.size() * 2) / 3;
            int iRandom = (int) (((double) size) + (Math.random() * ((double) (list.size() - size))));
            if (iRandom > list.size()) {
                iRandom = list.size();
            }
            list.add(iRandom, userInfo);
        }
        return list;
    }
}
