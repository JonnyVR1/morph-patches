package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveEntrance;
import com.p046p1.mobile.putong.live.base.data.BLiveEntranceList;
import com.p046p1.mobile.putong.live.base.data.BLivePkPointList;
import com.tantanapp.common.data.ConvertedJsonAdapter;
import com.tantanapp.common.data.JsonAdapter;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class ys6 {

    /* JADX INFO: renamed from: a */
    public static final JsonAdapter<BLiveEntranceList> f199747a = new C21497a(JsonAdapter.MAP_ADAPTER(BLiveEntrance.JSON_ADAPTER));

    /* JADX INFO: renamed from: b */
    public static final JsonAdapter<BLivePkPointList> f199748b = new C21498b(JsonAdapter.MAP_ADAPTER(JsonAdapter.STRING_ADAPTER));

    /* JADX INFO: renamed from: l.ys6$a */
    public class C21497a extends ConvertedJsonAdapter<Map<String, BLiveEntrance>, BLiveEntranceList> {
        public C21497a(JsonAdapter jsonAdapter) {
            super(jsonAdapter);
        }

        @Override // com.tantanapp.common.data.ConvertedJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<String, BLiveEntrance> from(BLiveEntranceList bLiveEntranceList) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int i = 0; i < bLiveEntranceList.keyList.size(); i++) {
                linkedHashMap.put(bLiveEntranceList.keyList.get(i), bLiveEntranceList.entrances.get(i));
            }
            return linkedHashMap;
        }

        @Override // com.tantanapp.common.data.ConvertedJsonAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveEntranceList mo59726to(Map<String, BLiveEntrance> map) {
            BLiveEntranceList bLiveEntranceListNew_ = BLiveEntranceList.new_();
            for (Map.Entry<String, BLiveEntrance> entry : map.entrySet()) {
                bLiveEntranceListNew_.keyList.add(entry.getKey());
                bLiveEntranceListNew_.entrances.add(entry.getValue());
            }
            return bLiveEntranceListNew_;
        }
    }

    /* JADX INFO: renamed from: l.ys6$b */
    public class C21498b extends ConvertedJsonAdapter<Map<String, String>, BLivePkPointList> {
        public C21498b(JsonAdapter jsonAdapter) {
            super(jsonAdapter);
        }

        @Override // com.tantanapp.common.data.ConvertedJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<String, String> from(BLivePkPointList bLivePkPointList) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int i = 0; i < bLivePkPointList.userId.size(); i++) {
                linkedHashMap.put(bLivePkPointList.userId.get(i), bLivePkPointList.point.get(i));
            }
            return linkedHashMap;
        }

        @Override // com.tantanapp.common.data.ConvertedJsonAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLivePkPointList mo59726to(Map<String, String> map) {
            BLivePkPointList bLivePkPointListNew_ = BLivePkPointList.new_();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bLivePkPointListNew_.userId.add(entry.getKey());
                bLivePkPointListNew_.point.add(entry.getValue());
            }
            return bLivePkPointListNew_;
        }
    }
}
