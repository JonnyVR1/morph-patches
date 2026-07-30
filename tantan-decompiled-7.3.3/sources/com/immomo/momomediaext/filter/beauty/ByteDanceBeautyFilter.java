package com.immomo.momomediaext.filter.beauty;

import android.content.Context;
import com.momo.mcamera.mask.FaceFilterPipeline;
import java.util.ArrayList;
import p153l.omw;

/* JADX INFO: loaded from: classes7.dex */
public class ByteDanceBeautyFilter extends FaceFilterPipeline {
    private ByteDanceFilter byteDanceFilter;
    private VerticalFlipFilter firstFlipFilter = new VerticalFlipFilter();
    private VerticalFlipFilter secondFlipFilter = new VerticalFlipFilter();

    public ByteDanceBeautyFilter(Context context, ByteDanceHelper.IBeautyErrorListener iBeautyErrorListener) {
        this.byteDanceFilter = new ByteDanceFilter(context, iBeautyErrorListener);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.firstFlipFilter);
        arrayList.add(this.byteDanceFilter);
        arrayList.add(this.secondFlipFilter);
        constructGroupFilter(arrayList);
    }

    @Override // p153l.ogk, p153l.gfj, p153l.wej
    public synchronized void destroy() {
        super.destroy();
    }

    public boolean forbidBeauty(boolean z) {
        ByteDanceFilter byteDanceFilter = this.byteDanceFilter;
        if (byteDanceFilter != null) {
            return byteDanceFilter.forbidBeauty(z);
        }
        return false;
    }

    public boolean isByteDanceBeautyEnable() {
        ByteDanceFilter byteDanceFilter = this.byteDanceFilter;
        if (byteDanceFilter != null) {
            return byteDanceFilter.isByteDanceBeautyEnable();
        }
        return false;
    }

    public void release() {
        ByteDanceFilter byteDanceFilter = this.byteDanceFilter;
        if (byteDanceFilter != null) {
            byteDanceFilter.release();
        }
    }

    public boolean removeBody(String str) {
        ByteDanceFilter byteDanceFilter = this.byteDanceFilter;
        if (byteDanceFilter != null) {
            return byteDanceFilter.removeBody(str);
        }
        return false;
    }

    public boolean removeMakeup(String str) {
        ByteDanceFilter byteDanceFilter = this.byteDanceFilter;
        if (byteDanceFilter != null) {
            return byteDanceFilter.removeMakeup(str);
        }
        return false;
    }

    public boolean removeMakeupStyle(String str, String str2) {
        ByteDanceFilter byteDanceFilter = this.byteDanceFilter;
        if (byteDanceFilter != null) {
            return byteDanceFilter.removeMakeupStyle(str, str2);
        }
        return false;
    }

    @Override // com.momo.mcamera.mask.FaceFilterPipeline, com.momo.mcamera.mask.FaceDetectGroupFilter, p153l.suf
    public void setMMCVInfo(omw omwVar) {
        ByteDanceFilter byteDanceFilter = this.byteDanceFilter;
        if (byteDanceFilter != null) {
            byteDanceFilter.setMMCVInfo(omwVar);
        }
    }

    public void setOnDetectCompleteListener(ByteDanceHelper.IFaceDetectCompleteListener iFaceDetectCompleteListener) {
        ByteDanceFilter byteDanceFilter = this.byteDanceFilter;
        if (byteDanceFilter != null) {
            byteDanceFilter.setOnDetectCompleteListener(iFaceDetectCompleteListener);
        }
    }

    public boolean updateBeautyBodyValue(String str, String str2, float f) {
        ByteDanceFilter byteDanceFilter = this.byteDanceFilter;
        if (byteDanceFilter != null) {
            return byteDanceFilter.updateBeautyBodyValue(str, str2, f);
        }
        return false;
    }

    public boolean updateFaceBeautyValue(String str, String str2, float f) {
        ByteDanceFilter byteDanceFilter = this.byteDanceFilter;
        if (byteDanceFilter != null) {
            return byteDanceFilter.updateFaceBeautyValue(str, str2, f);
        }
        return false;
    }

    public boolean updateMakeupStyleValue(String str, String str2, float f) {
        ByteDanceFilter byteDanceFilter = this.byteDanceFilter;
        if (byteDanceFilter != null) {
            return byteDanceFilter.updateMakeupStyleValue(str, str2, f);
        }
        return false;
    }

    public boolean updateMakeupValue(String str, String str2, float f) {
        ByteDanceFilter byteDanceFilter = this.byteDanceFilter;
        if (byteDanceFilter != null) {
            return byteDanceFilter.updateMakeupValue(str, str2, f);
        }
        return false;
    }
}
