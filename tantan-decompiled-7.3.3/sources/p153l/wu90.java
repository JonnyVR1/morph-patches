package p153l;

import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.ProfileGoodcCatagory;
import com.p051p1.mobile.putong.core.data.ProfileGoodcCatagoryTestGroup;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p051p1.mobile.putong.remote_config.RemoteConfigException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class wu90 {

    /* JADX INFO: renamed from: a */
    public static wu90 f190849a;

    /* JADX INFO: renamed from: b */
    public static wu90 m207939b() {
        if (f190849a == null) {
            synchronized (wu90.class) {
                try {
                    if (f190849a == null) {
                        f190849a = new wu90();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f190849a;
    }

    /* JADX INFO: renamed from: a */
    public final int m207940a(List<UserStatus> list) {
        for (int i = 1; i <= 6; i++) {
            if (list.contains(UserStatus.get("RISK_TAG_GOOD_FACELESS_STATUS_3_" + i))) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public List<CoreSuggested.UserInfo> m207941c(User user, List<CoreSuggested.UserInfo> list, HashSet<String> hashSet, List<User> list2) {
        try {
            ProfileGoodcCatagory profileGoodcCatagory = (ProfileGoodcCatagory) RemoteConfig.m80481x().m80516v("intl_goodc_category_config", ProfileGoodcCatagory.JSON_ADAPTER);
            if (profileGoodcCatagory != null && profileGoodcCatagory.enabled) {
                profileGoodcCatagory.nullCheck();
                List<ProfileGoodcCatagoryTestGroup> list3 = profileGoodcCatagory.goodc_test_group;
                if (!jyb.m147479J(list3) && list3.size() >= 2) {
                    ArrayList arrayList = new ArrayList();
                    List<Integer> list4 = profileGoodcCatagory.goodc_num_config;
                    if (jyb.m147479J(list4)) {
                        return null;
                    }
                    int i = profileGoodcCatagory.goodc_total_num;
                    HashMap<String, Integer> map = new HashMap<>();
                    HashMap map2 = new HashMap();
                    for (User user2 : list2) {
                        map2.put(user2.f56859id, user2);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        CoreSuggested.UserInfo userInfo = list.get(i2);
                        User user3 = (User) map2.get(userInfo.f20214id);
                        if (user3 == null) {
                            arrayList.add(userInfo);
                        } else if (jyb.m147479J(user3.status)) {
                            arrayList.add(userInfo);
                        } else {
                            int iM207940a = m207940a(user3.status);
                            if (iM207940a == -1) {
                                arrayList.add(userInfo);
                            } else if (!m207942d(iM207940a, map, list4) || i <= 0) {
                                hashSet.remove(userInfo.f20214id);
                            } else {
                                arrayList2.add(userInfo);
                                i--;
                            }
                        }
                    }
                    return m207943e(arrayList, arrayList2);
                }
            }
        } catch (RemoteConfigException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m207942d(int i, HashMap<String, Integer> map, List<Integer> list) {
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
    public final List<CoreSuggested.UserInfo> m207943e(List<CoreSuggested.UserInfo> list, List<CoreSuggested.UserInfo> list2) {
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
