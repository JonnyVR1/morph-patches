package p153l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jgj0 {
    public static int FILTER_BOTTOM_TO_TOP_INDEX = 7;
    public static int FILTER_DIFFUSION_INDEX = 5;
    public static int FILTER_RIGHT_TO_LEFT_INDEX = 6;
    protected jk90 processErrorListener;

    public jt2 getVideoProcessFilter() {
        return null;
    }

    public abstract void lockCoverFrame(Bitmap bitmap, k6j.InterfaceC18110a interfaceC18110a);

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

    public void setProcessErrorListener(jk90 jk90Var) {
    }

    public void setTransFieldFilterListener(ap50 ap50Var) {
    }

    public void startPostWatermark(boolean z) {
    }

    public void startPreWatermark(boolean z) {
    }
}
