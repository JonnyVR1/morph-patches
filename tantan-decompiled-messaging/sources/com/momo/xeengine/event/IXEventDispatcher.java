package com.momo.xeengine.event;

import androidx.annotation.Keep;
import com.momo.xeengine.p044cv.bean.CVBodyInfo;
import com.momo.xeengine.p044cv.bean.CVExpressInfo;
import com.momo.xeengine.p044cv.bean.CVObjectInfo;
import com.momo.xeengine.p044cv.bean.CVSegmentInfo;
import com.momo.xeengine.p044cv.bean.XECartoonFaceInfo;
import com.momo.xeengine.p044cv.bean.XEFaceInfo;
import com.momo.xeengine.p044cv.bean.XEFaceSegmentInfo;
import com.momo.xeengine.p044cv.bean.XEHandInfo;
import com.momo.xeengine.p044cv.bean.XEMutableInfo;
import com.momo.xeengine.p044cv.bean.XETTHeartInfo;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public interface IXEventDispatcher extends ITouchEventHandler {
    @Deprecated
    void dispatchBodyInfo(List<CVBodyInfo> list);

    @Deprecated
    void dispatchBodyInfo(List<CVBodyInfo> list, boolean z);

    @Deprecated
    void dispatchCartoonFaceInfo(XECartoonFaceInfo xECartoonFaceInfo);

    @Deprecated
    void dispatchExpressInfo(List<CVExpressInfo> list);

    @Deprecated
    void dispatchFaceInfo(List<XEFaceInfo> list);

    @Deprecated
    void dispatchFaceSegmentInfo(XEFaceSegmentInfo xEFaceSegmentInfo);

    @Deprecated
    void dispatchHandInfo(List<XEHandInfo> list);

    @Deprecated
    void dispatchMutableInfo(List<XEMutableInfo> list);

    @Deprecated
    void dispatchObjectInfo(List<CVObjectInfo> list);

    @Deprecated
    void dispatchSegmentInfo(CVSegmentInfo cVSegmentInfo);

    @Deprecated
    void dispatchTTHeartInfo(XETTHeartInfo xETTHeartInfo);
}
