package com.momo.mcamera.mask;

import java.util.Iterator;
import java.util.List;
import p153l.jt2;
import p153l.ogk;
import p153l.omw;

/* JADX INFO: loaded from: classes8.dex */
public class FaceAdjustFilterGroup extends ogk {
    private jt2 endFilter;
    private List<FaceDetectFilter> faceFilters;

    public FaceAdjustFilterGroup(List<FaceDetectFilter> list) {
        if (list.size() > 0) {
            FaceDetectFilter faceDetectFilter = list.get(0);
            FaceDetectFilter faceDetectFilter2 = list.get(list.size() - 1);
            registerInitialFilter(faceDetectFilter);
            FaceDetectFilter faceDetectFilter3 = null;
            for (int i = 0; i <= list.size() - 1; i++) {
                FaceDetectFilter faceDetectFilter4 = list.get(i);
                faceDetectFilter4.clearTarget();
                if (faceDetectFilter3 != null) {
                    faceDetectFilter3.addTarget(list.get(i));
                    list.get(i).parentFilter = faceDetectFilter3;
                }
                if (i > 0 && i < list.size() - 1) {
                    registerFilter(faceDetectFilter4);
                }
                faceDetectFilter3 = list.get(i);
            }
            faceDetectFilter2.addTarget(this);
            registerTerminalFilter(faceDetectFilter2);
            this.endFilter = faceDetectFilter2;
        }
        this.faceFilters = list;
    }

    public void setMMCVInfo(omw omwVar) {
        synchronized (getLockObject()) {
            try {
                Iterator<FaceDetectFilter> it = this.faceFilters.iterator();
                while (it.hasNext()) {
                    it.next().setMMCVInfo(omwVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
