package com.core.glcore.util;

import android.content.Context;
import android.util.Log;
import com.momo.xeengine.XE3DEngine;
import com.momo.xeengine.p049cv.bean.CVBodyInfo;
import com.momo.xeengine.p049cv.bean.CVExpressInfo;
import com.momo.xeengine.p049cv.bean.CVObjectInfo;
import com.momo.xeengine.p049cv.bean.CVSegmentInfo;
import com.momo.xeengine.p049cv.bean.XEFaceInfo;
import com.momo.xeengine.p049cv.bean.XEFaceSegmentInfo;
import com.momo.xeengine.p049cv.bean.XEHandInfo;
import com.momo.xeengine.xnative.XEEventDispatcher;
import java.util.ArrayList;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class XEEngineHelper {
    private static final String TAG = "XEEngineHelper";
    private static String sRootPath;
    private static XE3DEngine sXE3DEngine;

    private static void create(Context context, String str) {
        if (sRootPath == null) {
            wtq0.m207906a("请先配置rootPath");
        } else {
            if (sXE3DEngine != null) {
                wtq0.m207906a("上一个还没调用remove，就过来创建了？");
                return;
            }
            XE3DEngine xE3DEngine = new XE3DEngine(context, str);
            sXE3DEngine = xE3DEngine;
            xE3DEngine.setLibraryPath(sRootPath);
        }
    }

    public static void destroy() {
        XE3DEngine xE3DEngine = sXE3DEngine;
        if (xE3DEngine != null) {
            xE3DEngine.endEngine();
        }
        sXE3DEngine = null;
        sRootPath = null;
    }

    public static XE3DEngine get() {
        return sXE3DEngine;
    }

    public static String getLibraryPath() {
        return sRootPath;
    }

    public static void init(Context context, String str, String str2) {
        String str3 = sRootPath;
        if (str3 != null && !str3.equals(str)) {
            Log.e(TAG, "last root path :" + sRootPath + ",this root path :" + str);
            Log.e(TAG, "RootPath has been configured!!!!!!!!!!!!!!!!!⚠️⚠️⚠️");
            Log.e(TAG, "两种原因，上一次没remove，或者rootPath变动");
        }
        sRootPath = str;
        create(context, str2);
    }

    public static void loadScene(String str, String str2) {
        XE3DEngine xE3DEngine = sXE3DEngine;
        if (xE3DEngine != null) {
            xE3DEngine.loadSceneWithId(str, str2);
        } else {
            throwException("引擎为空！！！请检查逻辑 ");
        }
    }

    public static void queueEvent(Runnable runnable) {
        XE3DEngine xE3DEngine = sXE3DEngine;
        if (xE3DEngine != null) {
            xE3DEngine.queueEvent(runnable);
        }
    }

    public static void render(int i, int i2, String str) {
        XE3DEngine xE3DEngine = sXE3DEngine;
        if (xE3DEngine != null) {
            xE3DEngine.resizeWindow(i, i2);
            sXE3DEngine.render(str);
            return;
        }
        Log.e(TAG, "render: " + str + " 时sXE3DEngine = null");
        throwException("引擎为空！！！请检查逻辑 ");
    }

    public static void runEngine(int i, int i2, boolean z) {
        XE3DEngine xE3DEngine = sXE3DEngine;
        if (xE3DEngine == null) {
            throwException("引擎为空！！！请检查逻辑 ");
            return;
        }
        if (xE3DEngine.isRunning()) {
            throwException("引擎已经启动了！！！请检查逻辑 " + sXE3DEngine);
        } else {
            sXE3DEngine.runEngine(i, i2);
            sXE3DEngine.clearBackground();
            sXE3DEngine.enableClearColor(z);
        }
    }

    public static void setBodyInfos(ArrayList<CVBodyInfo> arrayList) {
        XEEventDispatcher eventDispatcher;
        XE3DEngine xE3DEngine = sXE3DEngine;
        if (xE3DEngine == null || (eventDispatcher = xE3DEngine.getEventDispatcher()) == null) {
            return;
        }
        eventDispatcher.dispatchBodyInfo(arrayList);
    }

    public static void setExpressionInfos(ArrayList<CVExpressInfo> arrayList) {
        XEEventDispatcher eventDispatcher;
        XE3DEngine xE3DEngine = sXE3DEngine;
        if (xE3DEngine == null || (eventDispatcher = xE3DEngine.getEventDispatcher()) == null) {
            return;
        }
        eventDispatcher.dispatchExpressInfo(arrayList);
    }

    public static void setFaceInfos(ArrayList<XEFaceInfo> arrayList) {
        XEEventDispatcher eventDispatcher;
        XE3DEngine xE3DEngine = sXE3DEngine;
        if (xE3DEngine == null || (eventDispatcher = xE3DEngine.getEventDispatcher()) == null) {
            return;
        }
        eventDispatcher.dispatchFaceInfo(arrayList);
    }

    public static void setFaceSegmentInfo(XEFaceSegmentInfo xEFaceSegmentInfo) {
        XEEventDispatcher eventDispatcher;
        XE3DEngine xE3DEngine = sXE3DEngine;
        if (xE3DEngine == null || (eventDispatcher = xE3DEngine.getEventDispatcher()) == null) {
            return;
        }
        eventDispatcher.dispatchFaceSegmentInfo(xEFaceSegmentInfo);
    }

    public static void setHandInfos(ArrayList<XEHandInfo> arrayList) {
        XEEventDispatcher eventDispatcher;
        XE3DEngine xE3DEngine = sXE3DEngine;
        if (xE3DEngine == null || (eventDispatcher = xE3DEngine.getEventDispatcher()) == null) {
            return;
        }
        eventDispatcher.dispatchHandInfo(arrayList);
    }

    public static void setObjectInfo(ArrayList<CVObjectInfo> arrayList) {
        XEEventDispatcher eventDispatcher;
        XE3DEngine xE3DEngine = sXE3DEngine;
        if (xE3DEngine == null || (eventDispatcher = xE3DEngine.getEventDispatcher()) == null) {
            return;
        }
        eventDispatcher.dispatchObjectInfo(arrayList);
    }

    public static void setSegmentInfo(CVSegmentInfo cVSegmentInfo) {
        XEEventDispatcher eventDispatcher;
        XE3DEngine xE3DEngine = sXE3DEngine;
        if (xE3DEngine == null || (eventDispatcher = xE3DEngine.getEventDispatcher()) == null) {
            return;
        }
        eventDispatcher.dispatchSegmentInfo(cVSegmentInfo);
    }

    private static void throwException(String str) {
    }

    public static void unloadScene(String str) {
        XE3DEngine xE3DEngine = sXE3DEngine;
        if (xE3DEngine == null) {
            throwException("引擎为空！！！请检查逻辑 ");
        } else {
            xE3DEngine.unloadScene(str);
            sXE3DEngine.render();
        }
    }

    public static void render(int i, int i2) {
        XE3DEngine xE3DEngine = sXE3DEngine;
        if (xE3DEngine != null) {
            xE3DEngine.resizeWindow(i, i2);
            sXE3DEngine.render();
        } else {
            Log.e(TAG, "render 时sXE3DEngine = null");
            throwException("引擎为空！！！请检查逻辑 ");
        }
    }

    public static void runEngine(int i, int i2) {
        runEngine(i, i2, false);
    }
}
