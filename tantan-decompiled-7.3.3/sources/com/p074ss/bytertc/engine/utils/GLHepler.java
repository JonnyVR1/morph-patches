package com.p074ss.bytertc.engine.utils;

import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.GlShader;
import com.bytedance.realx.video.GlUtil;
import com.bytedance.realx.video.VideoFrame;
import com.p074ss.bytertc.engine.utils.GLHepler;
import java.nio.FloatBuffer;
import java.util.concurrent.Callable;
import p153l.wtq0;

/* JADX INFO: loaded from: classes11.dex */
public class GLHepler {
    private static final FloatBuffer DEVICE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer TEXTURE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    private final String TAG;
    private int frameBufferId;
    private Handler handler;
    private boolean mBInit;
    private EglBase mEglBase;
    private final String mFragmentShader;
    private GlShader mGlShader;
    private final String mVertorShader;
    private boolean released;
    private GlShader shader;
    private VideoFrame.TextureBuffer.Type shaderTextureType;
    private final ThreadUtils.ThreadChecker threadChecker;

    private GLHepler(EGLContext eGLContext, Handler handler) {
        this.TAG = "GLHepler";
        this.mBInit = false;
        this.frameBufferId = 0;
        this.mVertorShader = "attribute vec4 vPosition;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\n\nvoid main(){gl_Position = vPosition;\ntextureCoordinate = inputTextureCoordinate;\n}\n";
        this.mFragmentShader = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES s_texture;\nvoid main() {  gl_FragColor = texture2D( s_texture, textureCoordinate );\n}";
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.released = false;
        this.handler = handler;
        EglBase eglBaseCreateEgl14 = EglBase.createEgl14(eGLContext, EglBase.CONFIG_PIXEL_BUFFER);
        this.mEglBase = eglBaseCreateEgl14;
        try {
            eglBaseCreateEgl14.createDummyPbufferSurface();
            this.mEglBase.makeCurrent();
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.frameBufferId = iArr[0];
            threadChecker.detachThread();
        } catch (RuntimeException e) {
            this.mEglBase.release();
            handler.getLooper().quit();
            throw e;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m82082a(GLHepler gLHepler, int i, int i2, int i3, int i4) {
        gLHepler.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        gLHepler.threadChecker.checkIsOnValidThread();
        if (gLHepler.released) {
            wtq0.m207906a("YuvConverter.convert called on released object");
            return;
        }
        if (!gLHepler.mBInit) {
            gLHepler.initShader(VideoFrame.TextureBuffer.Type.OES);
            gLHepler.shader.useProgram();
            GLES20.glBindFramebuffer(36160, gLHepler.frameBufferId);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        }
        gLHepler.shader.useProgram();
        GLES20.glBindFramebuffer(36160, gLHepler.frameBufferId);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i2);
        GLES20.glViewport(0, 0, i3, i4);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindTexture(36197, 0);
        LogUtil.m82086i("opnngl ToTexture2D", "usetime:" + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public static GLHepler create(final String str, final EGLContext eGLContext) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        return (GLHepler) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<GLHepler>() { // from class: com.ss.bytertc.engine.utils.GLHepler.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public GLHepler call() {
                try {
                    return new GLHepler(eGLContext, handler);
                } catch (RuntimeException e) {
                    LogUtil.m82085e("TextureHelper", str + " create failure", e);
                    return null;
                }
            }
        });
    }

    private void initShader(VideoFrame.TextureBuffer.Type type) {
        GlShader glShader = this.shader;
        if (glShader != null) {
            glShader.release();
        }
        if (this.mBInit) {
            return;
        }
        this.mBInit = true;
        this.shaderTextureType = type;
        GlShader glShader2 = new GlShader("attribute vec4 vPosition;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\n\nvoid main(){gl_Position = vPosition;\ntextureCoordinate = inputTextureCoordinate;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES s_texture;\nvoid main() {  gl_FragColor = texture2D( s_texture, textureCoordinate );\n}");
        this.shader = glShader2;
        glShader2.useProgram();
        GLES20.glUniform1i(this.shader.getUniformLocation("s_texture"), 0);
        GlUtil.checkNoGLES2Error("Initialize fragment shader uniform values.");
        this.shader.setVertexAttribArray("vPosition", 2, DEVICE_RECTANGLE);
        this.shader.setVertexAttribArray("inputTextureCoordinate", 2, TEXTURE_RECTANGLE);
    }

    public void deliverToTexture2D(final int i, final int i2, final int i3, final int i4, float[] fArr) {
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: l.nej
            @Override // java.lang.Runnable
            public final void run() {
                GLHepler.m82082a(this.f141657a, i4, i3, i, i2);
            }
        });
    }

    public void release() {
        this.threadChecker.checkIsOnValidThread();
        this.released = true;
        GlShader glShader = this.shader;
        if (glShader != null) {
            glShader.release();
        }
    }
}
