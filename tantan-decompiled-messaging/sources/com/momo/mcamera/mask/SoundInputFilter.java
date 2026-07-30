package com.momo.mcamera.mask;

import android.opengl.GLES20;
import com.core.glcore.util.TextureHelper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p149l.mcj;
import p149l.ts2;

/* JADX INFO: loaded from: classes7.dex */
public class SoundInputFilter extends ts2 {
    private static final String UNIFORM_IGLOBAL_TIME = "iGlobalTime";
    private static final String UNIFORM_ITIME_DELTA = "iTimeDelta";
    private static final String UNIFORM_PCM_FLAG = "pcmFlag";
    private boolean hasVoiceData;
    private int iGlobalTimeHandler;
    private int iPcmFlagHandler;
    private int iTimeDeltaHandler;
    private ByteBuffer mByteBuffer;
    private boolean needUpdate;

    public SoundInputFilter() {
        this.useCache = false;
    }

    private void deleteTexture() {
        int i = this.texture_in;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.texture_in = 0;
        }
    }

    private ByteBuffer getByteBuffer() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(2048).order(ByteOrder.nativeOrder());
        byteBufferOrder.position(0);
        return byteBufferOrder;
    }

    @Override // p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        ByteBuffer byteBuffer = this.mByteBuffer;
        if (byteBuffer != null) {
            byteBuffer.clear();
            this.mByteBuffer = null;
        }
        deleteTexture();
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float     iGlobalTime;           // shader playback time (in seconds)\nuniform float     iTimeDelta;            // render time (in seconds)\nuniform float     pcmFlag;            // flag\nvec3 B2_spline(vec3 x) { // returns 3 B-spline functions of degree 2\n    vec3 t = 3.0 * x;\n    vec3 b0 = step(0.0, t)     * step(0.0, 1.0-t);\n    vec3 b1 = step(0.0, t-1.0) * step(0.0, 2.0-t);\n    vec3 b2 = step(0.0, t-2.0) * step(0.0, 3.0-t);\n    return 0.5 * (\n      b0 * pow(t, vec3(2.0)) +\n      b1 * (-2.0*pow(t, vec3(2.0)) + 6.0*t - 3.0) + \n      b2 * pow(3.0-t,vec3(2.0))\n    );\n}\nvoid main(){\nif (pcmFlag < 1.0) {\n   gl_FragColor = texture2D(inputImageTexture0,textureCoordinate);\n   return;\n   }\n    // create pixel coordinates\n    vec2 uv =  textureCoordinate.xy;\n\n    float fVBars = 30.0;\n    float fHSpacing = 10.00;\n    \n    \n    float x = floor(uv.x * fVBars)/fVBars;\n    float fSample = texture2D(inputImageTexture0, vec2(abs(2.0 * x - 1.0), 0.25)).x;\n  \n    float squarewave = sign(mod(uv.x, 1.0/fVBars)-0.012);\n    float fft = squarewave * fSample* 0.5;\n    \n    float fHBars = 100.0;\n    float fVSpacing = 0.0;\n    float fVFreq = (uv.y * 3.14);\n    fVFreq = sign(sin(fVFreq * fHBars)+1.0-fVSpacing);\n\n    vec2 centered = vec2(1.0) * uv - vec2(1.0) ;\n    float t = iGlobalTime / 100.0;\n    float polychrome = 1.0;\n    vec3 spline_args = fract(vec3(polychrome*uv.x-t) + vec3(0.0, -1.0/3.0, -2.0/3.0));\n    vec3 spline = B2_spline(spline_args);\n    \n    float f = abs(centered.y);\n    vec3 base_color  = vec3(1.0, 1.0, 1.0);\n    vec3 flame_color = base_color;\n    \n    float tt = 0.5 - uv.y;\n    float df = sign(tt);\n    df = (df + 1.0)/0.5;\n    vec3 col = flame_color * vec3(1.0 - step(fft, abs(0.5-uv.y))) * vec3(fVFreq);\n    \n  // output final color\n  gl_FragColor = vec4(col, 1.0 - step(col,vec3(0.0,0.0,0.0)).x);\n}";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.iGlobalTimeHandler = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_IGLOBAL_TIME);
        this.iTimeDeltaHandler = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_ITIME_DELTA);
        this.iPcmFlagHandler = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_PCM_FLAG);
    }

    @Override // p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        this.inputFrameBuffer = mcjVar.glFrameBuffer;
        if (!this.hasVoiceData) {
            if (this.texture_in == 0) {
                this.texture_in = TextureHelper.byteToTexture(this.mByteBuffer, 256, 1);
            }
            super.newTextureReady(this.texture_in, mcjVar, z);
            return;
        }
        if (z) {
            markAsDirty();
        }
        if (this.needUpdate) {
            deleteTexture();
        }
        setWidth(mcjVar.getWidth());
        setHeight(mcjVar.getHeight());
        if (this.texture_in == 0 || this.needUpdate) {
            this.texture_in = TextureHelper.byteToTexture(this.mByteBuffer, 256, 1);
            this.needUpdate = false;
        }
        onDrawFrame();
        mcjVar.unlockRenderBuffer();
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        GLES20.glUniform1f(this.iGlobalTimeHandler, System.currentTimeMillis());
        GLES20.glUniform1f(this.iPcmFlagHandler, this.hasVoiceData ? 1.0f : 0.0f);
        super.passShaderValues();
    }

    public void setSoundBytes(byte[] bArr) {
        this.hasVoiceData = bArr != null;
        if (this.mByteBuffer == null) {
            this.mByteBuffer = getByteBuffer();
        }
        this.mByteBuffer.clear();
        if (bArr != null) {
            this.mByteBuffer.position(0);
            this.mByteBuffer.put(bArr);
            this.mByteBuffer.position(0);
            this.needUpdate = true;
        }
    }
}
