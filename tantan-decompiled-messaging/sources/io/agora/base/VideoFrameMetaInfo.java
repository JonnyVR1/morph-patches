package io.agora.base;

import android.util.SparseArray;
import io.agora.base.internal.CalledByNative;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class VideoFrameMetaInfo {
    private Map<String, SparseArray<IMetaInfo>> mMetaMap;

    private Map<String, SparseArray<IMetaInfo>> getMetaMap() {
        if (this.mMetaMap == null) {
            this.mMetaMap = new HashMap();
        }
        return this.mMetaMap;
    }

    @CalledByNative
    public SparseArray<IMetaInfo> getCustomMetaInfo(String str) {
        if (!getMetaMap().containsKey(str)) {
            this.mMetaMap.put(str, new SparseArray<>());
        }
        return this.mMetaMap.get(str);
    }

    @CalledByNative
    public IMetaInfo getCustomMetaInfoAt(String str, int i) {
        if (!getMetaMap().containsKey(str) || getMetaMap().get(str).size() < i + 1) {
            return null;
        }
        return getMetaMap().get(str).get(i);
    }

    @CalledByNative
    public int getCustomMetaInfoSize(String str) {
        return getCustomMetaInfo(str).size();
    }

    public int setCustomMetaInfo(IMetaInfo[] iMetaInfoArr) {
        if (iMetaInfoArr == null || iMetaInfoArr.length == 0) {
            return -1;
        }
        SparseArray<IMetaInfo> customMetaInfo = getCustomMetaInfo(iMetaInfoArr[0].getTag());
        for (IMetaInfo iMetaInfo : iMetaInfoArr) {
            customMetaInfo.put(iMetaInfo.getId(), iMetaInfo);
        }
        return 0;
    }

    public String toString() {
        if (getMetaMap().isEmpty()) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("VideoFrameMetaInfo{\n");
        for (String str : getMetaMap().keySet()) {
            sb.append(str);
            sb.append(": [\n");
            for (int i = 0; i < getCustomMetaInfoSize(str); i++) {
                sb.append(str);
                sb.append(getCustomMetaInfoAt(str, i));
                sb.append(", \n");
            }
            sb.append(str);
            sb.append(": ]\n");
        }
        return sb.toString();
    }
}
