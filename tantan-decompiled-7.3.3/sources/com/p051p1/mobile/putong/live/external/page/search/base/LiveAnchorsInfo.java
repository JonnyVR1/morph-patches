package com.p051p1.mobile.putong.live.external.page.search.base;

import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.bean.BaseLiveInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p153l.jyb;

/* JADX INFO: loaded from: classes9.dex */
public class LiveAnchorsInfo extends BaseLiveInfo {
    private final List<BLiveAnchor> anchorList;
    private final String searchText;

    public LiveAnchorsInfo(List<BLiveAnchor> list, List<BLiveAbsData> list2, List<BLiveAbsRoom> list3, List<User> list4, String str) {
        super(list2, list3, list4);
        ArrayList arrayList = new ArrayList();
        this.anchorList = arrayList;
        this.searchText = str;
        arrayList.addAll(list);
    }

    public static LiveAnchorsInfo emptyInfo() {
        List list = Collections.EMPTY_LIST;
        return new LiveAnchorsInfo(list, list, list, list);
    }

    public List<BLiveAnchor> getAnchorList() {
        return this.anchorList;
    }

    public String getSearchText() {
        return this.searchText;
    }

    public boolean isEmpty() {
        return jyb.m147479J(this.anchorList);
    }

    public LiveAnchorsInfo(List<BLiveAnchor> list, List<BLiveAbsData> list2, List<BLiveAbsRoom> list3, List<User> list4) {
        this(list, list2, list3, list4, "");
    }
}
