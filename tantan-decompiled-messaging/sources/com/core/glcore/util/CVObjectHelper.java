package com.core.glcore.util;

import com.momo.xeengine.p044cv.bean.CVObjectInfo;
import com.momocv.MMBox;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CVObjectHelper {
    public static List<CVObjectInfo> transObjectInfos(MMBox[] mMBoxArr) {
        if (mMBoxArr == null) {
            XEEngineHelper.setObjectInfo(null);
            return null;
        }
        ArrayList arrayList = new ArrayList(mMBoxArr.length);
        for (MMBox mMBox : mMBoxArr) {
            if (mMBox != null) {
                CVObjectInfo cVObjectInfo = new CVObjectInfo();
                cVObjectInfo.setType(mMBox.class_name_);
                cVObjectInfo.setBounds(new float[]{mMBox.f14764x_, mMBox.f14765y_, mMBox.width_, mMBox.height_});
                cVObjectInfo.setScore(cVObjectInfo.getScore());
                arrayList.add(cVObjectInfo);
            }
        }
        XEEngineHelper.setObjectInfo(arrayList);
        return arrayList;
    }
}
