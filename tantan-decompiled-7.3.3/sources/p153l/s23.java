package p153l;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class s23 extends wej implements dfj {

    /* JADX INFO: renamed from: a */
    protected int[] f165854a;

    /* JADX INFO: renamed from: b */
    protected int[] f165855b;

    /* JADX INFO: renamed from: c */
    protected int[] f165856c;

    /* JADX INFO: renamed from: d */
    private InterfaceC19961a f165857d;

    /* JADX INFO: renamed from: l.s23$a */
    public interface InterfaceC19961a {
        /* JADX INFO: renamed from: a */
        void mo126860a(Bitmap bitmap);
    }

    public s23() {
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
        int[] iArr = this.f165854a;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f165854a = null;
        }
        int[] iArr2 = this.f165855b;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f165855b = null;
        }
        int[] iArr3 = this.f165856c;
        if (iArr3 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.f165856c = null;
        }
        int[] iArr4 = new int[1];
        this.f165854a = iArr4;
        this.f165855b = new int[1];
        this.f165856c = new int[1];
        GLES20.glGenFramebuffers(1, iArr4, 0);
        GLES20.glGenRenderbuffers(1, this.f165856c, 0);
        GLES20.glGenTextures(1, this.f165855b, 0);
        GLES20.glBindFramebuffer(36160, this.f165854a[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f165855b[0]);
        GLES20.glTexImage2D(3553, 0, 6408, getWidth(), getHeight(), 0, 6408, 5121, null);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f165855b[0], 0);
        GLES20.glBindRenderbuffer(36161, this.f165856c[0]);
        GLES20.glRenderbufferStorage(36161, 33189, getWidth(), getHeight());
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.f165856c[0]);
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        muf.m160142a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
    }

    /* JADX INFO: renamed from: Q1 */
    public void m184108Q1(InterfaceC19961a interfaceC19961a) {
        this.f165857d = interfaceC19961a;
    }

    @Override // p153l.wej
    public void destroy() {
        super.destroy();
        int[] iArr = this.f165854a;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f165854a = null;
        }
        int[] iArr2 = this.f165855b;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.f165855b = null;
        }
        int[] iArr3 = this.f165856c;
        if (iArr3 != null) {
            GLES20.glDeleteRenderbuffers(1, iArr3, 0);
            this.f165856c = null;
        }
    }

    @Override // p153l.wej
    public void drawFrame() {
        if (this.f165854a == null) {
            if (getWidth() == 0 || getHeight() == 0) {
                return;
            } else {
                initFBO();
            }
        }
        GLES20.glBindFramebuffer(36160, this.f165854a[0]);
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
        this.f165857d.mo126860a(Bitmap.createBitmap(iArr, getWidth(), getHeight(), Bitmap.Config.ARGB_8888));
    }

    @Override // p153l.wej
    public void handleSizeChange() {
        initFBO();
    }

    @Override // p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        this.texture_in = i;
        setWidth(gfjVar.getWidth());
        setHeight(gfjVar.getHeight());
        onDrawFrame();
    }
}
