package com.momo.mcamera.mask;

import android.opengl.GLES20;
import android.os.SystemClock;
import com.core.glcore.util.SegmentHelper;
import com.core.glcore.util.TextureHelper;
import p149l.pjw;
import p149l.vjw;
import p149l.xxx;

/* JADX INFO: loaded from: classes7.dex */
public class CompatibleSegmentFilter extends SegmentFilter {
    @Override // com.momo.mcamera.mask.SegmentFilter
    public void processSegment(int i, int i2) {
        int i3;
        int i4;
        pjw pjwVar = this.mmcvInfo;
        if (pjwVar == null || pjwVar.f149900g == null) {
            return;
        }
        int i5 = pjwVar.f149896c / 90;
        if (i5 == 0 || i5 == 2) {
            i3 = pjwVar.f149898e;
            i4 = pjwVar.f149899f;
        } else {
            if (i5 != 1 && i5 != 3) {
                return;
            }
            i3 = pjwVar.f149899f;
            i4 = pjwVar.f149898e;
        }
        boolean zM169958v = pjwVar.m169958v();
        vjw vjwVar = this.mmcvFrame;
        if (zM169958v) {
            vjwVar.m198695h(17);
        } else {
            vjwVar.m198695h(4);
            this.params.m155070E(false);
        }
        this.mmcvFrame.m198694g(this.mmcvInfo.f149900g);
        this.mmcvFrame.m198693f(this.mmcvInfo.f149900g.length);
        this.mmcvFrame.m198700m(this.mmcvInfo.m169956t());
        this.mmcvFrame.m198697j(this.mmcvInfo.m169949m());
        this.mmcvFrame.m198699l(this.mmcvInfo.m169956t());
        this.params.m155094p(SegmentHelper.isFrontCamera());
        this.params.m155066A(SegmentHelper.getRotateDegree());
        this.params.m155104z(SegmentHelper.getRestoreDegree());
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        byte[] bArrProcess = SegmentHelper.process(this.mmcvFrame, this.params, !this.mmcvInfo.m169958v());
        xxx.m211572F().m211623m0(SystemClock.elapsedRealtime() - jElapsedRealtime);
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
