package p149l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f7j0 {
    public static int FILTER_BOTTOM_TO_TOP_INDEX = 7;
    public static int FILTER_DIFFUSION_INDEX = 5;
    public static int FILTER_RIGHT_TO_LEFT_INDEX = 6;
    protected fc90 processErrorListener;

    public ts2 getVideoProcessFilter() {
        return null;
    }

    public abstract void lockCoverFrame(Bitmap bitmap, p3j.InterfaceC19124a interfaceC19124a);

    public void destroy() {
    }

    public void reset() {
    }

    public void resetInternalStatusInEglThread() {
    }

    public void lockFrame(Bitmap bitmap) {
    }

    public void setFrameRate(int i) {
    }

    public void setProcessErrorListener(fc90 fc90Var) {
    }

    public void setTransFieldFilterListener(ug50 ug50Var) {
    }

    public void startPostWatermark(boolean z) {
    }

    public void startPreWatermark(boolean z) {
    }
}
