package tv.danmaku.ijk.media.processing;

import android.opengl.GLES20;
import p153l.dfj;
import p153l.gfj;
import p153l.pej;
import p153l.wej;

/* JADX INFO: loaded from: classes3.dex */
public class OutPutEndpoint extends wej implements dfj {

    /* JADX INFO: renamed from: a */
    private pej f209073a;

    /* JADX INFO: renamed from: b */
    private float f209074b;

    /* JADX INFO: renamed from: c */
    private int f209075c;

    @Override // p153l.wej
    public void destroy() {
        super.destroy();
    }

    @Override // p153l.wej
    public void drawFrame() {
        if (this.texture_in == 0) {
            return;
        }
        if (getHeight() / getWidth() != this.f209074b) {
            int width = (int) (getWidth() * this.f209074b);
            GLES20.glViewport(-((width - getWidth()) / 2), 0, width, getHeight());
        } else {
            GLES20.glViewport(0, 0, getWidth(), getHeight());
        }
        GLES20.glUseProgram(this.programHandle);
        GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
        passShaderValues();
        GLES20.glDrawArrays(5, 0, 4);
    }

    @Override // p153l.wej
    public void initWithGLContext() {
        setRenderSize(this.f209073a.m172023f() * this.f209075c, this.f209073a.m172022e() * this.f209075c);
        super.initWithGLContext();
    }

    @Override // p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        this.texture_in = i;
        setWidth(gfjVar.getWidth());
        setHeight(gfjVar.getHeight());
        if (this.curRotation % 2 == 1) {
            this.f209074b = gfjVar.getWidth() / gfjVar.getHeight();
        } else {
            this.f209074b = gfjVar.getHeight() / gfjVar.getWidth();
        }
        onDrawFrame();
        gfjVar.unlockRenderBuffer();
    }
}
