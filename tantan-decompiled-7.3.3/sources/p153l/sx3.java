package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sx3 extends jt2 {
    protected int currentPass;
    protected lej glFrameBufferFirst;

    @Override // p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        lej lejVar = this.glFrameBufferFirst;
        if (lejVar != null) {
            lejVar.m153898e();
            this.glFrameBufferFirst = null;
        }
    }

    @Override // p153l.gfj, p153l.wej
    public void drawFrame() {
        this.currentPass = 1;
        if (this.glFrameBufferFirst == null) {
            if (getWidth() == 0 || getHeight() == 0) {
                return;
            } else {
                initFBO();
            }
        }
        lej lejVar = this.glFrameBufferFirst;
        if (lejVar != null && lejVar.m153901h() == null) {
            if (getWidth() == 0 || getHeight() == 0) {
                return;
            } else {
                initFBO();
            }
        }
        GLES20.glBindFramebuffer(36160, this.glFrameBufferFirst.m153901h()[0]);
        if (this.texture_in == 0) {
            return;
        }
        drawSub();
        this.texture_in = this.glFrameBufferFirst.m153902i()[0];
        GLES20.glBindFramebuffer(36160, 0);
        this.currentPass = 2;
        super.drawFrame();
    }

    public int getCurrentPass() {
        return this.currentPass;
    }

    @Override // p153l.gfj
    public void initFBO() {
        super.initFBO();
        lej lejVar = this.glFrameBufferFirst;
        if (lejVar != null) {
            lejVar.m153898e();
        }
        lej lejVar2 = new lej(getWidth(), getHeight());
        this.glFrameBufferFirst = lejVar2;
        lejVar2.m153895b(getWidth(), getHeight());
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        muf.m160142a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
    }

    @Override // p153l.gfj, p153l.wej
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
    }
}
