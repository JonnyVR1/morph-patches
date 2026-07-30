package com.momo.mcamera.mask.beauty;

import android.opengl.GLES20;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.mask.beauty.body.DrawBodyWarpSrcFilter;
import com.momo.mcamera.util.MDLogTag;
import com.momocv.MMBox;
import com.momocv.objectdetect.ObjectDetectInfo;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import p153l.omw;

/* JADX INFO: loaded from: classes8.dex */
public class DrawGestureFilter extends DrawBodyWarpSrcFilter {
    @Override // com.momo.mcamera.mask.beauty.body.DrawBodyWarpSrcFilter, p153l.gfj
    public void drawSub() {
        super.drawSub();
        GLES20.glUniform1i(this.colorHandle, 0);
        float[] fArr = this.data;
        if (fArr == null || fArr.length <= 0) {
            MDLog.m7445e(MDLogTag.MOMENT_RENDER_TAG, "Render no face!");
            return;
        }
        GLES20.glClearColor(1.0f, 0.0f, 0.0f, 1.0f);
        float width = ((this.data[0] / getWidth()) - 0.5f) * 2.0f;
        float height = ((this.data[1] / getHeight()) - 0.5f) * (-2.0f);
        float[] fArr2 = this.data;
        float width2 = (((fArr2[0] + fArr2[2]) / getWidth()) - 0.5f) * 2.0f;
        float[] fArr3 = this.data;
        float height2 = (((fArr3[1] + fArr3[3]) / getHeight()) - 0.5f) * (-2.0f);
        float[] fArr4 = {width, height, width, height2, width, height2, width2, height2, width2, height2, width2, height, width, height, width2, height};
        FloatBuffer floatBuffer = this.floatBuffer;
        if (floatBuffer == null || floatBuffer.capacity() != 16) {
            this.floatBuffer = ByteBuffer.allocateDirect(64).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.floatBuffer.put(fArr4);
        this.floatBuffer.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.floatBuffer);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        GLES20.glLineWidth(2.0f);
        GLES20.glDrawArrays(1, 0, 8);
    }

    @Override // com.momo.mcamera.mask.beauty.body.DrawBodyWarpSrcFilter
    public void updateFaceInfo(omw omwVar) {
        MMBox[] mMBoxArr;
        int iM168299n = omwVar.m168299n();
        if (iM168299n <= 0) {
            MDLog.m7443d(MDLogTag.MOMENT_RENDER_TAG, "No face");
            return;
        }
        for (int i = 0; i < iM168299n; i++) {
            ObjectDetectInfo objectDetectInfo = omwVar.f148009G;
            if (objectDetectInfo != null && (mMBoxArr = objectDetectInfo.detect_results_) != null && mMBoxArr.length >= 1) {
                if (this.data == null) {
                    this.data = new float[4];
                }
                float[] fArr = this.data;
                MMBox mMBox = mMBoxArr[0];
                fArr[0] = mMBox.f15483x_;
                fArr[1] = mMBox.f15484y_;
                fArr[2] = mMBox.width_;
                fArr[3] = mMBox.height_;
            }
        }
    }
}
