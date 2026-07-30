package p149l;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class pcj extends mcj implements jcj {

    /* JADX INFO: renamed from: a */
    public boolean f148176a = false;

    /* JADX INFO: renamed from: b */
    private float f148177b;

    /* JADX INFO: renamed from: c */
    private float f148178c;

    /* JADX INFO: renamed from: d */
    private int f148179d;

    /* JADX INFO: renamed from: e */
    private int f148180e;

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

    @Override // p149l.mcj, p149l.ccj
    public void drawFrame() {
        boolean z;
        if (this.glFrameBuffer == null) {
            if (getWidth() == 0 || getHeight() == 0) {
                return;
            } else {
                initFBO();
            }
        }
        rbj rbjVar = this.glFrameBuffer;
        if (rbjVar != null && rbjVar.m178609h() == null) {
            if (getWidth() == 0 || getHeight() == 0) {
                return;
            } else {
                initFBO();
            }
        }
        if (this.dirty) {
            lockRenderBuffer();
            GLES20.glBindFramebuffer(36160, this.glFrameBuffer.m178609h()[0]);
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
                Iterator<jcj> it = this.targets.iterator();
                while (it.hasNext()) {
                    it.next().newTextureReady(this.glFrameBuffer.m178610i()[0], this, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        unlockRenderBuffer();
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvarying vec2 lefttopCoordinate;\nvarying vec2 rightbottomCoordinate; \nvarying vec2 righttopCoordinate;\nvarying vec2 leftbottomCoordinate;\nvoid main(){\nvec4 center = texture2D(inputImageTexture0,textureCoordinate); \nvec4 lt=texture2D(inputImageTexture0, clamp(lefttopCoordinate, 0.0, 1.0)); \nvec4 lb=texture2D(inputImageTexture0, clamp(leftbottomCoordinate, 0.0, 1.0)); \nvec4 rt=texture2D(inputImageTexture0, clamp(righttopCoordinate, 0.0, 1.0)); \nvec4 rb=texture2D(inputImageTexture0, clamp(rightbottomCoordinate, 0.0, 1.0)); \nvec4 l=texture2D(inputImageTexture0, clamp(vec2(lefttopCoordinate.x,textureCoordinate.y), 0.0, 1.0)); \nvec4 r=texture2D(inputImageTexture0, clamp(vec2(righttopCoordinate.x,textureCoordinate.y), 0.0, 1.0)); \nvec4 t=texture2D(inputImageTexture0, clamp(vec2(textureCoordinate.x, lefttopCoordinate.y), 0.0, 1.0)); \nvec4 b=texture2D(inputImageTexture0, clamp(vec2(textureCoordinate.x, rightbottomCoordinate.y), 0.0, 1.0)); \ngl_FragColor = clamp((center+lt+lb+rt+rb+l+t+b+r)/9.0, 0.0, 1.0); \n}\n";
    }

    @Override // p149l.ccj
    public String getVertexShader() {
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform float imageWidthFactor; \nuniform float imageHeightFactor; \nvarying vec2 lefttopCoordinate;\nvarying vec2 rightbottomCoordinate; \nvarying vec2 righttopCoordinate;\nvarying vec2 leftbottomCoordinate;\nvoid main() {\n  textureCoordinate = inputTextureCoordinate;\nvec2 widthStep = vec2(imageWidthFactor, -imageHeightFactor);\nvec2 heightStep = vec2(imageWidthFactor, imageHeightFactor);\nlefttopCoordinate = inputTextureCoordinate.xy - widthStep;\nrightbottomCoordinate = inputTextureCoordinate.xy + widthStep;\nrighttopCoordinate = inputTextureCoordinate.xy + heightStep;\nleftbottomCoordinate = inputTextureCoordinate.xy - heightStep;\ngl_Position = position;\n}\n";
    }

    @Override // p149l.mcj
    public void initFBO() {
        rbj rbjVar = this.glFrameBuffer;
        if (rbjVar != null) {
            rbjVar.m178606e();
        }
        rbj rbjVarM213956c = ybj.m213953d().m213956c(getWidth(), getHeight());
        this.glFrameBuffer = rbjVarM213956c;
        rbjVarM213956c.m178603b(getWidth(), getHeight());
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        ysf.m215904a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        this.textureHandle = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture0");
        this.positionHandle = GLES20.glGetAttribLocation(this.programHandle, "position");
        this.texCoordHandle = GLES20.glGetAttribLocation(this.programHandle, "inputTextureCoordinate");
        this.f148179d = GLES20.glGetUniformLocation(this.programHandle, "imageWidthFactor");
        this.f148180e = GLES20.glGetUniformLocation(this.programHandle, "imageHeightFactor");
    }

    @Override // p149l.ccj
    public void initWithGLContext() {
        super.initWithGLContext();
    }

    @Override // p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        if (z) {
            markAsDirty();
        }
        this.texture_in = i;
        this.f148177b = mcjVar.getWidth();
        this.f148178c = mcjVar.getHeight();
        setWidth(mcjVar.getWidth());
        setHeight(mcjVar.getHeight());
        onDrawFrame();
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        this.renderVertices.position(0);
        GLES20.glUniform1f(this.f148180e, 1.0f / this.f148177b);
        GLES20.glUniform1f(this.f148179d, 1.0f / this.f148178c);
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
