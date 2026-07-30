package com.momo.rtcbase;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import p153l.azk0;
import p153l.x3k;
import p153l.xmw;

/* JADX INFO: loaded from: classes8.dex */
public class GlShader {
    private static final String TAG = "GlShader";
    private int program;

    public GlShader(String str, String str2) {
        int iCompileShader = compileShader(35633, str);
        int iCompileShader2 = compileShader(35632, str2);
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.program = iGlCreateProgram;
        if (iGlCreateProgram == 0) {
            x3k.m209245a("glCreateProgram() failed. GLES20 error: ", GLES20.glGetError());
            throw null;
        }
        GLES20.glAttachShader(iGlCreateProgram, iCompileShader);
        GLES20.glAttachShader(this.program, iCompileShader2);
        GLES20.glLinkProgram(this.program);
        int[] iArr = {0};
        GLES20.glGetProgramiv(this.program, 35714, iArr, 0);
        if (iArr[0] == 1) {
            GLES20.glDeleteShader(iCompileShader);
            GLES20.glDeleteShader(iCompileShader2);
            GlUtil.checkNoGLES2Error("Creating GlShader");
        } else {
            Logging.m21197e(TAG, "Could not link program: " + GLES20.glGetProgramInfoLog(this.program));
            azk0.m101074a(GLES20.glGetProgramInfoLog(this.program));
            throw null;
        }
    }

    private static int compileShader(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader == 0) {
            x3k.m209245a("glCreateShader() failed. GLES20 error: ", GLES20.glGetError());
            return 0;
        }
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            GlUtil.checkNoGLES2Error("compileShader");
            return iGlCreateShader;
        }
        Logging.m21197e(TAG, "Compile error " + GLES20.glGetShaderInfoLog(iGlCreateShader) + " in shader:\n" + str);
        azk0.m101074a(GLES20.glGetShaderInfoLog(iGlCreateShader));
        return 0;
    }

    public int getAttribLocation(String str) {
        int i = this.program;
        if (i == -1) {
            azk0.m101074a("The program has been released");
            return 0;
        }
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, str);
        if (iGlGetAttribLocation >= 0) {
            return iGlGetAttribLocation;
        }
        xmw.m212069a("Could not locate '", str, "' in program");
        return 0;
    }

    public int getUniformLocation(String str) {
        int i = this.program;
        if (i == -1) {
            azk0.m101074a("The program has been released");
            return 0;
        }
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, str);
        if (iGlGetUniformLocation >= 0) {
            return iGlGetUniformLocation;
        }
        xmw.m212069a("Could not locate uniform '", str, "' in program");
        return 0;
    }

    public void release() {
        Logging.m21196d(TAG, "Deleting shader.");
        int i = this.program;
        if (i != -1) {
            GLES20.glDeleteProgram(i);
            this.program = -1;
        }
    }

    public void setVertexAttribArray(String str, int i, int i2, FloatBuffer floatBuffer) {
        if (this.program == -1) {
            azk0.m101074a("The program has been released");
            return;
        }
        int attribLocation = getAttribLocation(str);
        GLES20.glEnableVertexAttribArray(attribLocation);
        GLES20.glVertexAttribPointer(attribLocation, i, 5126, false, i2, (Buffer) floatBuffer);
        GlUtil.checkNoGLES2Error("setVertexAttribArray");
    }

    public void useProgram() {
        int i = this.program;
        if (i == -1) {
            azk0.m101074a("The program has been released");
        } else {
            GLES20.glUseProgram(i);
            GlUtil.checkNoGLES2Error("glUseProgram");
        }
    }

    public void setVertexAttribArray(String str, int i, FloatBuffer floatBuffer) {
        setVertexAttribArray(str, i, 0, floatBuffer);
    }
}
