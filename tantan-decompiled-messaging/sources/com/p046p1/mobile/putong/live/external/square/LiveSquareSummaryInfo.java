package com.p046p1.mobile.putong.live.external.square;

import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.bean.BaseLiveInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareSummary;
import java.util.ArrayList;
import java.util.List;
import p149l.vwb;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSquareSummaryInfo extends BaseLiveInfo {
    private List<BLiveSquareSummary> liveSquareSummaries;

    public LiveSquareSummaryInfo(List<BLiveAbsData> list, List<BLiveAbsRoom> list2, List<User> list3, List<BLiveSquareSummary> list4) {
        super(list, list2, list3);
        ArrayList arrayList = new ArrayList();
        this.liveSquareSummaries = arrayList;
        arrayList.addAll(list4);
    }

    @Nullable
    public BLiveSquareSummary getFirstLiveSquareSummary() {
        if (vwb.m200296J(this.liveSquareSummaries)) {
            return null;
        }
        return this.liveSquareSummaries.get(0);
    }
}
