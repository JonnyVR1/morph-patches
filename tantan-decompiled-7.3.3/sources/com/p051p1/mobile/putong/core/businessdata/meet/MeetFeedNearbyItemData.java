package com.p051p1.mobile.putong.core.businessdata.meet;

import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class MeetFeedNearbyItemData extends AbsMeetListData {
    public final List<User> users;

    public MeetFeedNearbyItemData(List<User> list) {
        ArrayList arrayList = new ArrayList();
        this.users = arrayList;
        arrayList.addAll(list);
    }
}
