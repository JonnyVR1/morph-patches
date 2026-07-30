package tv.danmaku.ijk.media.processing;

import android.opengl.GLES20;
import p149l.ccj;
import p149l.jcj;
import p149l.mcj;
import p149l.vbj;

/* JADX INFO: loaded from: classes3.dex */
public class OutPutEndpoint extends ccj implements jcj {

    /* JADX INFO: renamed from: a */
    private vbj f208151a;

    /* JADX INFO: renamed from: b */
    private float f208152b;

    /* JADX INFO: renamed from: c */
    private int f208153c;

    @Override // p149l.ccj
    public void destroy() {
        super.destroy();
    }

    @Override // p149l.ccj
    public void drawFrame() {
        if (this.texture_in == 0) {
            return;
        }
        if (getHeight() / getWidth() != this.f208152b) {
            int width = (int) (getWidth() * this.f208152b);
            GLES20.glViewport(-((width - getWidth()) / 2), 0, width, getHeight());
        } else {
            GLES20.glViewport(0, 0, getWidth(), getHeight());
        }
        GLES20.glUseProgram(this.programHandle);
        GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
        passShaderValues();
        GLES20.glDrawArrays(5, 0, 4);
    }

    @Override // p149l.ccj
    public void initWithGLContext() {
        setRenderSize(this.f208151a.m197717f() * this.f208153c, this.f208151a.m197716e() * this.f208153c);
        super.initWithGLContext();
    }

    @Override // p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        this.texture_in = i;
        setWidth(mcjVar.getWidth());
        setHeight(mcjVar.getHeight());
        if (this.curRotation % 2 == 1) {
            this.f208152b = mcjVar.getWidth() / mcjVar.getHeight();
        } else {
            this.f208152b = mcjVar.getHeight() / mcjVar.getWidth();
        }
        onDrawFrame();
        mcjVar.unlockRenderBuffer();
    }
}
