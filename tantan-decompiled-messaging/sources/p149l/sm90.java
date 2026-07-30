package p149l;

import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.ProfileGoodcCatagory;
import com.p046p1.mobile.putong.core.data.ProfileGoodcCatagoryTestGroup;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p046p1.mobile.putong.remote_config.RemoteConfigException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class sm90 {

    /* JADX INFO: renamed from: a */
    public static sm90 f165334a;

    /* JADX INFO: renamed from: b */
    public static sm90 m184943b() {
        if (f165334a == null) {
            synchronized (sm90.class) {
                try {
                    if (f165334a == null) {
                        f165334a = new sm90();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f165334a;
    }

    /* JADX INFO: renamed from: a */
    public final int m184944a(List<UserStatus> list) {
        for (int i = 1; i <= 6; i++) {
            if (list.contains(UserStatus.get("RISK_TAG_GOOD_FACELESS_STATUS_3_" + i))) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public List<CoreSuggested.UserInfo> m184945c(User user, List<CoreSuggested.UserInfo> list, HashSet<String> hashSet, List<User> list2) {
        try {
            ProfileGoodcCatagory profileGoodcCatagory = (ProfileGoodcCatagory) RemoteConfig.m79298x().m79333v("intl_goodc_category_config", ProfileGoodcCatagory.JSON_ADAPTER);
            if (profileGoodcCatagory != null && profileGoodcCatagory.enabled) {
                profileGoodcCatagory.nullCheck();
                List<ProfileGoodcCatagoryTestGroup> list3 = profileGoodcCatagory.goodc_test_group;
                if (!vwb.m200296J(list3) && list3.size() >= 2) {
                    ArrayList arrayList = new ArrayList();
                    List<Integer> list4 = profileGoodcCatagory.goodc_num_config;
                    if (vwb.m200296J(list4)) {
                        return null;
                    }
                    int i = profileGoodcCatagory.goodc_total_num;
                    HashMap<String, Integer> map = new HashMap<>();
                    HashMap map2 = new HashMap();
                    for (User user2 : list2) {
                        map2.put(user2.f56011id, user2);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        CoreSuggested.UserInfo userInfo = list.get(i2);
                        User user3 = (User) map2.get(userInfo.f19472id);
                        if (user3 == null) {
                            arrayList.add(userInfo);
                        } else if (vwb.m200296J(user3.status)) {
                            arrayList.add(userInfo);
                        } else {
                            int iM184944a = m184944a(user3.status);
                            if (iM184944a == -1) {
                                arrayList.add(userInfo);
                            } else if (!m184946d(iM184944a, map, list4) || i <= 0) {
                                hashSet.remove(userInfo.f19472id);
                            } else {
                                arrayList2.add(userInfo);
                                i--;
                            }
                        }
                    }
                    return m184947e(arrayList, arrayList2);
                }
            }
        } catch (RemoteConfigException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m184946d(int i, HashMap<String, Integer> map, List<Integer> list) {
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
    public final List<CoreSuggested.UserInfo> m184947e(List<CoreSuggested.UserInfo> list, List<CoreSuggested.UserInfo> list2) {
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
