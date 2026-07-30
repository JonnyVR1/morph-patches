package com.momo.rtcbase;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes8.dex */
class GlGenericDrawer implements RendererCommon.GlDrawer {
    private static final String DEFAULT_VERTEX_SHADER_STRING = "varying vec2 tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\nuniform mat4 tex_mat;\nvoid main() {\n  gl_Position = in_pos;\n  tc = (tex_mat * in_tc).xy;\n}\n";
    private static final FloatBuffer FULL_RECTANGLE_BUFFER = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer FULL_RECTANGLE_TEXTURE_BUFFER = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    private static final String INPUT_TEXTURE_COORDINATE_NAME = "in_tc";
    private static final String INPUT_VERTEX_COORDINATE_NAME = "in_pos";
    private static final String TEXTURE_MATRIX_NAME = "tex_mat";
    private GlShader currentShader;
    private ShaderType currentShaderType;
    private final String genericFragmentSource;
    private int inPosLocation;
    private int inTcLocation;
    private final ShaderCallbacks shaderCallbacks;
    private int texMatrixLocation;
    private final String vertexShader;

    public interface ShaderCallbacks {
        void onNewShader(GlShader glShader);

        void onPrepareShader(GlShader glShader, float[] fArr, int i, int i2, int i3, int i4);
    }

    public enum ShaderType {
        OES,
        RGB,
        YUV
    }

    public GlGenericDrawer(String str, String str2, ShaderCallbacks shaderCallbacks) {
        this.vertexShader = str;
        this.genericFragmentSource = str2;
        this.shaderCallbacks = shaderCallbacks;
    }

    public static String createFragmentShaderString(String str, ShaderType shaderType) {
        StringBuilder sb = new StringBuilder();
        ShaderType shaderType2 = ShaderType.OES;
        if (shaderType == shaderType2) {
            sb.append("#extension GL_OES_EGL_image_external : require\n");
        }
        sb.append("precision mediump float;\nvarying vec2 tc;\n");
        if (shaderType == ShaderType.YUV) {
            sb.append("uniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nvec4 sample(vec2 p) {\n  float y = texture2D(y_tex, p).r * 1.16438;\n  float u = texture2D(u_tex, p).r;\n  float v = texture2D(v_tex, p).r;\n  return vec4(y + 1.59603 * v - 0.874202,\n    y - 0.391762 * u - 0.812968 * v + 0.531668,\n    y + 2.01723 * u - 1.08563, 1);\n}\n");
            sb.append(str);
        } else {
            String str2 = shaderType == shaderType2 ? "samplerExternalOES" : "sampler2D";
            sb.append("uniform ");
            sb.append(str2);
            sb.append(" tex;\n");
            sb.append(str.replace("sample(", "texture2D(tex, "));
        }
        return sb.toString();
    }

    private void prepareShader(ShaderType shaderType, float[] fArr, int i, int i2, int i3, int i4) {
        GlShader glShader;
        if (shaderType.equals(this.currentShaderType)) {
            if (this.currentShader == null) {
                this.currentShader = createShader(shaderType);
            }
            glShader = this.currentShader;
        } else {
            this.currentShaderType = shaderType;
            GlShader glShader2 = this.currentShader;
            if (glShader2 != null) {
                glShader2.release();
            }
            GlShader glShaderCreateShader = createShader(shaderType);
            this.currentShader = glShaderCreateShader;
            glShaderCreateShader.useProgram();
            if (shaderType == ShaderType.YUV) {
                GLES20.glUniform1i(glShaderCreateShader.getUniformLocation("y_tex"), 0);
                GLES20.glUniform1i(glShaderCreateShader.getUniformLocation("u_tex"), 1);
                GLES20.glUniform1i(glShaderCreateShader.getUniformLocation("v_tex"), 2);
            } else {
                GLES20.glUniform1i(glShaderCreateShader.getUniformLocation("tex"), 0);
            }
            GlUtil.checkNoGLES2Error("Create shader");
            this.shaderCallbacks.onNewShader(glShaderCreateShader);
            this.texMatrixLocation = glShaderCreateShader.getUniformLocation(TEXTURE_MATRIX_NAME);
            this.inPosLocation = glShaderCreateShader.getAttribLocation(INPUT_VERTEX_COORDINATE_NAME);
            this.inTcLocation = glShaderCreateShader.getAttribLocation(INPUT_TEXTURE_COORDINATE_NAME);
            glShader = glShaderCreateShader;
        }
        glShader.useProgram();
        GLES20.glEnableVertexAttribArray(this.inPosLocation);
        GLES20.glVertexAttribPointer(this.inPosLocation, 2, 5126, false, 0, (Buffer) FULL_RECTANGLE_BUFFER);
        GLES20.glEnableVertexAttribArray(this.inTcLocation);
        GLES20.glVertexAttribPointer(this.inTcLocation, 2, 5126, false, 0, (Buffer) FULL_RECTANGLE_TEXTURE_BUFFER);
        GLES20.glUniformMatrix4fv(this.texMatrixLocation, 1, false, fArr, 0);
        this.shaderCallbacks.onPrepareShader(glShader, fArr, i, i2, i3, i4);
        GlUtil.checkNoGLES2Error("Prepare shader");
    }

    public GlShader createShader(ShaderType shaderType) {
        return new GlShader(this.vertexShader, createFragmentShaderString(this.genericFragmentSource, shaderType));
    }

    @Override // com.momo.rtcbase.RendererCommon.GlDrawer
    public void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        prepareShader(ShaderType.OES, fArr, i2, i3, i6, i7);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glViewport(i4, i5, i6, i7);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(36197, 0);
    }

    @Override // com.momo.rtcbase.RendererCommon.GlDrawer
    public void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        prepareShader(ShaderType.RGB, fArr, i2, i3, i6, i7);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glViewport(i4, i5, i6, i7);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
    }

    @Override // com.momo.rtcbase.RendererCommon.GlDrawer
    public void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, int i5, int i6) {
        prepareShader(ShaderType.YUV, fArr, i, i2, i5, i6);
        for (int i7 = 0; i7 < 3; i7++) {
            GLES20.glActiveTexture(33984 + i7);
            GLES20.glBindTexture(3553, iArr[i7]);
        }
        GLES20.glViewport(i3, i4, i5, i6);
        GLES20.glDrawArrays(5, 0, 4);
        for (int i8 = 0; i8 < 3; i8++) {
            GLES20.glActiveTexture(i8 + 33984);
            GLES20.glBindTexture(3553, 0);
        }
    }

    @Override // com.momo.rtcbase.RendererCommon.GlDrawer
    public void release() {
        GlShader glShader = this.currentShader;
        if (glShader != null) {
            glShader.release();
            this.currentShader = null;
            this.currentShaderType = null;
        }
    }

    public GlGenericDrawer(String str, ShaderCallbacks shaderCallbacks) {
        this(DEFAULT_VERTEX_SHADER_STRING, str, shaderCallbacks);
    }
}
