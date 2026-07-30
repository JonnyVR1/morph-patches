package com.p046p1.mobile.putong.core.businessdata.meet;

import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class MeetFeedLikersItemData extends AbsMeetListData {
    public int likersTotalCount;
    public int newLikersCount;
    public final List<User> users;

    public MeetFeedLikersItemData(int i, List<User> list, int i2) {
        ArrayList arrayList = new ArrayList();
        this.users = arrayList;
        this.likersTotalCount = i;
        arrayList.addAll(list);
        this.newLikersCount = i2;
    }
}
