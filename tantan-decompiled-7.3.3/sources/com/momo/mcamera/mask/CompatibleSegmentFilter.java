package com.momo.mcamera.mask;

import android.opengl.GLES20;
import android.os.SystemClock;
import com.core.glcore.util.SegmentHelper;
import com.core.glcore.util.TextureHelper;
import p153l.omw;
import p153l.u6y;
import p153l.umw;

/* JADX INFO: loaded from: classes8.dex */
public class CompatibleSegmentFilter extends SegmentFilter {
    @Override // com.momo.mcamera.mask.SegmentFilter
    public void processSegment(int i, int i2) {
        int i3;
        int i4;
        omw omwVar = this.mmcvInfo;
        if (omwVar == null || omwVar.f148020g == null) {
            return;
        }
        int i5 = omwVar.f148016c / 90;
        if (i5 == 0 || i5 == 2) {
            i3 = omwVar.f148018e;
            i4 = omwVar.f148019f;
        } else {
            if (i5 != 1 && i5 != 3) {
                return;
            }
            i3 = omwVar.f148019f;
            i4 = omwVar.f148018e;
        }
        boolean zM168307v = omwVar.m168307v();
        umw umwVar = this.mmcvFrame;
        if (zM168307v) {
            umwVar.m196802h(17);
        } else {
            umwVar.m196802h(4);
            this.params.m154997E(false);
        }
        this.mmcvFrame.m196801g(this.mmcvInfo.f148020g);
        this.mmcvFrame.m196800f(this.mmcvInfo.f148020g.length);
        this.mmcvFrame.m196807m(this.mmcvInfo.m168305t());
        this.mmcvFrame.m196804j(this.mmcvInfo.m168298m());
        this.mmcvFrame.m196806l(this.mmcvInfo.m168305t());
        this.params.m155021p(SegmentHelper.isFrontCamera());
        this.params.m154993A(SegmentHelper.getRotateDegree());
        this.params.m155031z(SegmentHelper.getRestoreDegree());
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        byte[] bArrProcess = SegmentHelper.process(this.mmcvFrame, this.params, !this.mmcvInfo.m168307v());
        u6y.m194722F().m194773m0(SystemClock.elapsedRealtime() - jElapsedRealtime);
        GLES20.glActiveTexture(33987);
        int i6 = this.alphaTexture;
        if (i6 == 0) {
            this.alphaTexture = TextureHelper.byteToLuminanceTexture(bArrProcess, i3, i4, 1);
        } else {
            TextureHelper.byteToLuminanceTextureBytextureId(i6, bArrProcess, i3, i4);
        }
        GLES20.glUniform1i(this.alphaHandler, 3);
    }
}
