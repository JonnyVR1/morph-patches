package p153l;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class jfj extends gfj implements dfj {

    /* JADX INFO: renamed from: a */
    public boolean f120591a = false;

    /* JADX INFO: renamed from: b */
    private float f120592b;

    /* JADX INFO: renamed from: c */
    private float f120593c;

    /* JADX INFO: renamed from: d */
    private int f120594d;

    /* JADX INFO: renamed from: e */
    private int f120595e;

    private void drawIndeed() {
        if (this.texture_in == 0) {
            return;
        }
        GLES20.glViewport(0, 0, getWidth(), getHeight());
        GLES20.glUseProgram(this.programHandle);
        GLES20.glClear(16640);
        GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
        passShaderValues();
        GLES20.glDrawArrays(5, 0, 4);
    }

    @Override // p153l.gfj, p153l.wej
    public void drawFrame() {
        boolean z;
        if (this.glFrameBuffer == null) {
            if (getWidth() == 0 || getHeight() == 0) {
                return;
            } else {
                initFBO();
            }
        }
        lej lejVar = this.glFrameBuffer;
        if (lejVar != null && lejVar.m153901h() == null) {
            if (getWidth() == 0 || getHeight() == 0) {
                return;
            } else {
                initFBO();
            }
        }
        if (this.dirty) {
            lockRenderBuffer();
            GLES20.glBindFramebuffer(36160, this.glFrameBuffer.m153901h()[0]);
            GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
            GLES20.glClear(16640);
            drawIndeed();
            GLES20.glBindFramebuffer(36160, 0);
            unlockInputRenderBuffer();
            z = true;
        } else {
            z = false;
        }
        synchronized (this.listLock) {
            try {
                Iterator<dfj> it = this.targets.iterator();
                while (it.hasNext()) {
                    it.next().newTextureReady(this.glFrameBuffer.m153902i()[0], this, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        unlockRenderBuffer();
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvarying vec2 lefttopCoordinate;\nvarying vec2 rightbottomCoordinate; \nvarying vec2 righttopCoordinate;\nvarying vec2 leftbottomCoordinate;\nvoid main(){\nvec4 center = texture2D(inputImageTexture0,textureCoordinate); \nvec4 lt=texture2D(inputImageTexture0, clamp(lefttopCoordinate, 0.0, 1.0)); \nvec4 lb=texture2D(inputImageTexture0, clamp(leftbottomCoordinate, 0.0, 1.0)); \nvec4 rt=texture2D(inputImageTexture0, clamp(righttopCoordinate, 0.0, 1.0)); \nvec4 rb=texture2D(inputImageTexture0, clamp(rightbottomCoordinate, 0.0, 1.0)); \nvec4 l=texture2D(inputImageTexture0, clamp(vec2(lefttopCoordinate.x,textureCoordinate.y), 0.0, 1.0)); \nvec4 r=texture2D(inputImageTexture0, clamp(vec2(righttopCoordinate.x,textureCoordinate.y), 0.0, 1.0)); \nvec4 t=texture2D(inputImageTexture0, clamp(vec2(textureCoordinate.x, lefttopCoordinate.y), 0.0, 1.0)); \nvec4 b=texture2D(inputImageTexture0, clamp(vec2(textureCoordinate.x, rightbottomCoordinate.y), 0.0, 1.0)); \ngl_FragColor = clamp((center+lt+lb+rt+rb+l+t+b+r)/9.0, 0.0, 1.0); \n}\n";
    }

    @Override // p153l.wej
    public String getVertexShader() {
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform float imageWidthFactor; \nuniform float imageHeightFactor; \nvarying vec2 lefttopCoordinate;\nvarying vec2 rightbottomCoordinate; \nvarying vec2 righttopCoordinate;\nvarying vec2 leftbottomCoordinate;\nvoid main() {\n  textureCoordinate = inputTextureCoordinate;\nvec2 widthStep = vec2(imageWidthFactor, -imageHeightFactor);\nvec2 heightStep = vec2(imageWidthFactor, imageHeightFactor);\nlefttopCoordinate = inputTextureCoordinate.xy - widthStep;\nrightbottomCoordinate = inputTextureCoordinate.xy + widthStep;\nrighttopCoordinate = inputTextureCoordinate.xy + heightStep;\nleftbottomCoordinate = inputTextureCoordinate.xy - heightStep;\ngl_Position = position;\n}\n";
    }

    @Override // p153l.gfj
    public void initFBO() {
        lej lejVar = this.glFrameBuffer;
        if (lejVar != null) {
            lejVar.m153898e();
        }
        lej lejVarM185548c = sej.m185545d().m185548c(getWidth(), getHeight());
        this.glFrameBuffer = lejVarM185548c;
        lejVarM185548c.m153895b(getWidth(), getHeight());
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        muf.m160142a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        this.textureHandle = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture0");
        this.positionHandle = GLES20.glGetAttribLocation(this.programHandle, "position");
        this.texCoordHandle = GLES20.glGetAttribLocation(this.programHandle, "inputTextureCoordinate");
        this.f120594d = GLES20.glGetUniformLocation(this.programHandle, "imageWidthFactor");
        this.f120595e = GLES20.glGetUniformLocation(this.programHandle, "imageHeightFactor");
    }

    @Override // p153l.wej
    public void initWithGLContext() {
        super.initWithGLContext();
    }

    @Override // p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        if (z) {
            markAsDirty();
        }
        this.texture_in = i;
        this.f120592b = gfjVar.getWidth();
        this.f120593c = gfjVar.getHeight();
        setWidth(gfjVar.getWidth());
        setHeight(gfjVar.getHeight());
        onDrawFrame();
    }

    @Override // p153l.wej
    public void passShaderValues() {
        this.renderVertices.position(0);
        GLES20.glUniform1f(this.f120595e, 1.0f / this.f120592b);
        GLES20.glUniform1f(this.f120594d, 1.0f / this.f120593c);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        this.textureVertices[this.curRotation].position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.textureVertices[this.curRotation]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
    }
}
