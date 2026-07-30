package p149l;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class c23 extends ccj implements jcj {

    /* JADX INFO: renamed from: a */
    protected int[] f78324a;

    /* JADX INFO: renamed from: b */
    protected int[] f78325b;

    /* JADX INFO: renamed from: c */
    protected int[] f78326c;

    /* JADX INFO: renamed from: d */
    private InterfaceC16042a f78327d;

    /* JADX INFO: renamed from: l.c23$a */
    public interface InterfaceC16042a {
        /* JADX INFO: renamed from: a */
        void mo104905a(Bitmap bitmap);
    }

    public c23() {
        FloatBuffer[] floatBufferArr = new FloatBuffer[4];
        this.textureVertices = floatBufferArr;
        floatBufferArr[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[0].put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f}).position(0);
        this.textureVertices[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[1].put(new float[]{1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f}).position(0);
        this.textureVertices[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[2].put(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f}).position(0);
        this.textureVertices[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[3].put(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f}).position(0);
    }

    private void initFBO() {
        int[] iArr = this.f78324a;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f78324a = null;
        }
        int[] iArr2 = this.f78325b;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f78325b = null;
        }
        int[] iArr3 = this.f78326c;
        if (iArr3 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.f78326c = null;
        }
        int[] iArr4 = new int[1];
        this.f78324a = iArr4;
        this.f78325b = new int[1];
        this.f78326c = new int[1];
        GLES20.glGenFramebuffers(1, iArr4, 0);
        GLES20.glGenRenderbuffers(1, this.f78326c, 0);
        GLES20.glGenTextures(1, this.f78325b, 0);
        GLES20.glBindFramebuffer(36160, this.f78324a[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f78325b[0]);
        GLES20.glTexImage2D(3553, 0, 6408, getWidth(), getHeight(), 0, 6408, 5121, null);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f78325b[0], 0);
        GLES20.glBindRenderbuffer(36161, this.f78326c[0]);
        GLES20.glRenderbufferStorage(36161, 33189, getWidth(), getHeight());
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.f78326c[0]);
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        ysf.m215904a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
    }

    /* JADX INFO: renamed from: Q1 */
    public void m104904Q1(InterfaceC16042a interfaceC16042a) {
        this.f78327d = interfaceC16042a;
    }

    @Override // p149l.ccj
    public void destroy() {
        super.destroy();
        int[] iArr = this.f78324a;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f78324a = null;
        }
        int[] iArr2 = this.f78325b;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f78325b = null;
        }
        int[] iArr3 = this.f78326c;
        if (iArr3 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.f78326c = null;
        }
    }

    @Override // p149l.ccj
    public void drawFrame() {
        if (this.f78324a == null) {
            if (getWidth() == 0 || getHeight() == 0) {
                return;
            } else {
                initFBO();
            }
        }
        GLES20.glBindFramebuffer(36160, this.f78324a[0]);
        super.drawFrame();
        int width = getWidth() * getHeight();
        int[] iArr = new int[width];
        IntBuffer intBufferWrap = IntBuffer.wrap(iArr);
        intBufferWrap.position(0);
        GLES20.glReadPixels(0, 0, getWidth(), getHeight(), 6408, 5121, intBufferWrap);
        GLES20.glBindFramebuffer(36160, 0);
        for (int i = 0; i < width; i++) {
            int i2 = iArr[i];
            iArr[i] = ((i2 << 16) & 16711680) | ((-16711936) & i2) | ((i2 >> 16) & 255);
        }
        this.f78327d.mo104905a(Bitmap.createBitmap(iArr, getWidth(), getHeight(), Bitmap.Config.ARGB_8888));
    }

    @Override // p149l.ccj
    public void handleSizeChange() {
        initFBO();
    }

    @Override // p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        this.texture_in = i;
        setWidth(mcjVar.getWidth());
        setHeight(mcjVar.getHeight());
        onDrawFrame();
    }
}
