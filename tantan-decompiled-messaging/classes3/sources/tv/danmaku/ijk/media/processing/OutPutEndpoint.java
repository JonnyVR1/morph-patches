package tv.danmaku.ijk.media.processing;

import android.opengl.GLES20;
import p003l.ccj;
import p003l.jcj;
import p003l.mcj;
import p003l.vbj;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class OutPutEndpoint extends ccj implements jcj {

    /* JADX INFO: renamed from: a */
    private vbj f11776a;

    /* JADX INFO: renamed from: b */
    private float f11777b;

    /* JADX INFO: renamed from: c */
    private int f11778c;

    @Override // p003l.ccj
    public void destroy() {
        super.destroy();
    }

    @Override // p003l.ccj
    public void drawFrame() {
        if (this.texture_in == 0) {
            return;
        }
        if (getHeight() / getWidth() != this.f11777b) {
            int width = (int) (getWidth() * this.f11777b);
            GLES20.glViewport(-((width - getWidth()) / 2), 0, width, getHeight());
        } else {
            GLES20.glViewport(0, 0, getWidth(), getHeight());
        }
        GLES20.glUseProgram(this.programHandle);
        GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
        passShaderValues();
        GLES20.glDrawArrays(5, 0, 4);
    }

    @Override // p003l.ccj
    public void initWithGLContext() {
        setRenderSize(this.f11776a.m8356f() * this.f11778c, this.f11776a.m8355e() * this.f11778c);
        super.initWithGLContext();
    }

    @Override // p003l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        this.texture_in = i;
        setWidth(mcjVar.getWidth());
        setHeight(mcjVar.getHeight());
        if (this.curRotation % 2 == 1) {
            this.f11777b = mcjVar.getWidth() / mcjVar.getHeight();
        } else {
            this.f11777b = mcjVar.getHeight() / mcjVar.getWidth();
        }
        onDrawFrame();
        mcjVar.unlockRenderBuffer();
    }
}
