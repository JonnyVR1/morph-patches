package p003l;

import android.opengl.GLES20;
import l.ysf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class ndj0 extends ts2 {
    private int currentPass;
    protected rbj glFrameBufferFirst;

    public ndj0() {
        this.useCache = false;
    }

    @Override // p003l.mcj, p003l.ccj
    public void destroy() {
        super.destroy();
        rbj rbjVar = this.glFrameBufferFirst;
        if (rbjVar != null) {
            rbjVar.m7169e();
            this.glFrameBufferFirst = null;
        }
    }

    @Override // p003l.mcj, p003l.ccj
    public void drawFrame() {
        this.currentPass = 1;
        if (this.glFrameBufferFirst == null) {
            if (getWidth() == 0 || getHeight() == 0) {
                return;
            } else {
                initFBO();
            }
        }
        rbj rbjVar = this.glFrameBufferFirst;
        if (rbjVar != null && rbjVar.m7172h() == null) {
            if (getWidth() == 0 || getHeight() == 0) {
                return;
            } else {
                initFBO();
            }
        }
        GLES20.glBindFramebuffer(36160, this.glFrameBufferFirst.m7172h()[0]);
        if (this.texture_in == 0) {
            return;
        }
        GLES20.glViewport(0, 0, getWidth(), getHeight());
        GLES20.glUseProgram(this.programHandle);
        GLES20.glClear(16640);
        GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
        passShaderValues();
        GLES20.glDrawArrays(5, 0, 4);
        this.texture_in = this.glFrameBufferFirst.m7173i()[0];
        GLES20.glBindFramebuffer(36160, 0);
        this.currentPass = 2;
        super.drawFrame();
    }

    public int getCurrentPass() {
        return this.currentPass;
    }

    @Override // p003l.mcj
    public void initFBO() {
        super.initFBO();
        rbj rbjVar = this.glFrameBufferFirst;
        if (rbjVar != null) {
            rbjVar.m7169e();
        }
        rbj rbjVar2 = new rbj(getWidth(), getHeight());
        this.glFrameBufferFirst = rbjVar2;
        rbjVar2.m7166b(getWidth(), getHeight());
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        ysf.a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
    }
}
