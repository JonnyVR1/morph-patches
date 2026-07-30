package com.momo.mcamera.mask;

import android.opengl.GLES20;
import p149l.bt2;
import p149l.q7m;
import p149l.rbj;
import p149l.ysf;

/* JADX INFO: loaded from: classes7.dex */
public class MirrImageFrameFilter extends bt2 implements q7m {
    private static final String UNIFORM_BACKGROUND = "background";
    private static final String UNIFORM_FIRST_TIME = "firstTime";
    private static final String UNIFORM_ORDER = "order";
    private int backgroundHandle;
    private int firstHandle;
    private int orderHandle;
    private int mTexture0 = -1;
    private int mTexture0Handle = 0;
    private int mTexture1 = -1;
    private int mTexture1Handle = 0;
    private int mTexture2 = -1;
    private int mTexture2Handle = 0;
    private int mTexture3 = -1;
    private int mTexture3Handle = 0;
    private int mImageCount = 0;
    private float mOrder = 0.0f;
    private float mBackground = 0.0f;
    private float mFirst = 0.0f;
    private rbj mWindowsFrameOne = null;
    private rbj mWindowsFrameTwo = null;
    private rbj mWindowsFrameThree = null;
    private rbj mWindowsFrameFour = null;
    private long mTimeInterval = 30;
    private int mFourPalaceCount = 0;

    private rbj activityPalaceFrameBuffer(rbj rbjVar) {
        if (rbjVar == null) {
            if (getWidth() == 0 || getHeight() == 0) {
                return null;
            }
            rbjVar = initFrameBuffer(rbjVar);
        }
        if (rbjVar != null && rbjVar.m178609h() == null) {
            if (getWidth() == 0 || getHeight() == 0) {
                return null;
            }
            rbjVar = initFrameBuffer(rbjVar);
        }
        rbjVar.m178603b(this.width, this.height);
        return rbjVar;
    }

    private void generateFramebuffer() {
        rbj rbjVar = this.mWindowsFrameOne;
        if (rbjVar == null) {
            this.mWindowsFrameOne = activityPalaceFrameBuffer(rbjVar);
        }
        rbj rbjVar2 = this.mWindowsFrameTwo;
        if (rbjVar2 == null) {
            this.mWindowsFrameTwo = activityPalaceFrameBuffer(rbjVar2);
        }
        rbj rbjVar3 = this.mWindowsFrameThree;
        if (rbjVar3 == null) {
            this.mWindowsFrameThree = activityPalaceFrameBuffer(rbjVar3);
        }
        rbj rbjVar4 = this.mWindowsFrameFour;
        if (rbjVar4 == null) {
            this.mWindowsFrameFour = activityPalaceFrameBuffer(rbjVar4);
        }
    }

    private void releasePalaceFrameBuffer() {
        rbj rbjVar = this.mWindowsFrameOne;
        if (rbjVar != null) {
            rbjVar.m178606e();
            this.mWindowsFrameOne = null;
        }
        rbj rbjVar2 = this.mWindowsFrameTwo;
        if (rbjVar2 != null) {
            rbjVar2.m178606e();
            this.mWindowsFrameTwo = null;
        }
        rbj rbjVar3 = this.mWindowsFrameThree;
        if (rbjVar3 != null) {
            rbjVar3.m178606e();
            this.mWindowsFrameThree = null;
        }
        rbj rbjVar4 = this.mWindowsFrameFour;
        if (rbjVar4 != null) {
            rbjVar4.m178606e();
            this.mWindowsFrameFour = null;
        }
        this.mImageCount = 0;
        this.mOrder = 0.0f;
        this.mBackground = 0.0f;
        this.mFourPalaceCount = 0;
        this.isFirstTime = true;
    }

    @Override // p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        int i = this.mTexture0;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.mTexture0 = 0;
        }
        int i2 = this.mTexture1;
        if (i2 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i2}, 0);
            this.mTexture1 = 0;
        }
        int i3 = this.mTexture2;
        if (i3 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i3}, 0);
            this.mTexture2 = 0;
        }
        int i4 = this.mTexture3;
        if (i4 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i4}, 0);
            this.mTexture3 = 0;
        }
        releasePalaceFrameBuffer();
    }

    @Override // p149l.mcj, p149l.ccj
    public synchronized void drawFrame() {
        try {
            generateFramebuffer();
            for (int i = 0; i < this.mEffectTimeList.size(); i++) {
                if (this.isFirstTime || this.mTexture0 == -1 || this.mTexture1 == -1 || this.mTexture2 == -1 || this.mTexture3 == -1) {
                    this.mFirst = 1.0f;
                    super.drawFrame();
                    this.mFirst = 0.0f;
                    this.mFourPalaceCount = 0;
                    this.mImageCount = 0;
                    this.mOrder = 0.0f;
                    this.mBackground = 1.0f;
                    GLES20.glBindFramebuffer(36160, this.mWindowsFrameOne.m178609h()[0]);
                    drawSub();
                    GLES20.glBindFramebuffer(36160, this.mWindowsFrameTwo.m178609h()[0]);
                    drawSub();
                    GLES20.glBindFramebuffer(36160, this.mWindowsFrameThree.m178609h()[0]);
                    drawSub();
                    GLES20.glBindFramebuffer(36160, this.mWindowsFrameFour.m178609h()[0]);
                    drawSub();
                    this.mTexture0 = this.mWindowsFrameOne.m178610i()[0];
                    this.mTexture1 = this.mWindowsFrameTwo.m178610i()[0];
                    this.mTexture2 = this.mWindowsFrameThree.m178610i()[0];
                    this.mTexture3 = this.mWindowsFrameFour.m178610i()[0];
                    this.mFourPalaceCount++;
                } else {
                    this.mBackground = 0.0f;
                    super.drawFrame();
                    int i2 = this.mImageCount;
                    if (((long) i2) % this.mTimeInterval == 0 && i2 != 0) {
                        this.mBackground = 1.0f;
                        float f = this.mFourPalaceCount % 4;
                        this.mOrder = f;
                        int i3 = (int) (f - 1.0f);
                        if (i3 == -1) {
                            GLES20.glBindFramebuffer(36160, this.mWindowsFrameFour.m178609h()[0]);
                            drawSub();
                            this.mTexture3 = this.mWindowsFrameFour.m178610i()[0];
                        } else if (i3 == 0) {
                            GLES20.glBindFramebuffer(36160, this.mWindowsFrameOne.m178609h()[0]);
                            drawSub();
                            this.mTexture0 = this.mWindowsFrameOne.m178610i()[0];
                        } else if (i3 == 1) {
                            GLES20.glBindFramebuffer(36160, this.mWindowsFrameTwo.m178609h()[0]);
                            drawSub();
                            this.mTexture1 = this.mWindowsFrameTwo.m178610i()[0];
                        } else if (i3 == 2) {
                            GLES20.glBindFramebuffer(36160, this.mWindowsFrameThree.m178609h()[0]);
                            drawSub();
                            this.mTexture2 = this.mWindowsFrameThree.m178610i()[0];
                        }
                        this.mFourPalaceCount++;
                    }
                }
                this.mImageCount++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform sampler2D inputImageTexture2;\nuniform sampler2D inputImageTexture3;\nuniform sampler2D inputImageTexture4;\nuniform float order;\nuniform float background;\nuniform float firstTime;\nvarying vec2 textureCoordinate;\n float pick(float v)\n{    if(v > 0.5){\n      return (v - 0.5) * 2.0;\n    } return v * 2.0;\n}void main(){\n    vec2 uv = textureCoordinate;\n    vec4 color = vec4(0.0);\n    if (firstTime == 1.0) {\n    if(uv.x <= 0.5 && uv.y > 0.5)\n    {\n        color = texture2D(inputImageTexture0, vec2(pick(uv.x), pick(uv.y)));\n        float gray = color.r * 0.6 + color.g * 0.3 + color.b * 0.1;\n        color = vec4(gray, gray, gray, 1.0);\n    }\n    else if(uv.x > 0.5 && uv.y > 0.5)\n    {\n        color = texture2D(inputImageTexture0, vec2(pick(uv.x), pick(uv.y)));\n        float gray = color.r * 0.6 + color.g * 0.3 + color.b * 0.1;\n        color = vec4(gray, gray, gray, 1.0);\n    }\n    else if(uv.x > 0.5 && uv.y <= 0.5)\n    {\n        color = texture2D(inputImageTexture0, vec2(pick(uv.x), pick(uv.y)));\n        float gray = color.r * 0.6 + color.g * 0.3 + color.b * 0.1;\n        color = vec4(gray, gray, gray, 1.0);\n    }\n    else if(uv.x <= 0.5 && uv.y <= 0.5)\n    {\n        color = texture2D(inputImageTexture0, vec2(pick(uv.x), pick(uv.y)));\n        float gray = color.r * 0.6 + color.g * 0.3 + color.b * 0.1;\n        color = vec4(gray, gray, gray, 1.0);\n    }\n    } else {\n    if (background == 1.0) {        color = texture2D(inputImageTexture0, uv);\n    } else if(uv.x <= 0.5 && uv.y > 0.5)\n    {\n      if (order == 0.0) {        color = texture2D(inputImageTexture0, vec2(pick(uv.x), pick(uv.y)));\n      } else {\n        color = texture2D(inputImageTexture1, vec2(pick(uv.x), pick(uv.y)));\n        float gray = color.r * 0.6 + color.g * 0.3 + color.b * 0.1;\n        color = vec4(gray, gray, gray, 1.0);\n      }\n    }\n    else if(uv.x > 0.5 && uv.y > 0.5)\n    {\n      if (order == 1.0) {        color = texture2D(inputImageTexture0, vec2(pick(uv.x), pick(uv.y)));\n      } else {\n        color = texture2D(inputImageTexture2, vec2(pick(uv.x), pick(uv.y)));\n        float gray = color.r * 0.6 + color.g * 0.3 + color.b * 0.1;\n        color = vec4(gray, gray, gray, 1.0);\n      }\n    }\n    else if(uv.x > 0.5 && uv.y <= 0.5)\n    {\n      if (order == 2.0) {        color = texture2D(inputImageTexture0, vec2(pick(uv.x), pick(uv.y)));\n      } else {\n        color = texture2D(inputImageTexture3, vec2(pick(uv.x), pick(uv.y)));\n        float gray = color.r * 0.6 + color.g * 0.3 + color.b * 0.1;\n        color = vec4(gray, gray, gray, 1.0);\n      }\n    }\n    else if(uv.x <= 0.5 && uv.y <= 0.5)\n    {\n      if (order == 3.0) {        color = texture2D(inputImageTexture0, vec2(pick(uv.x), pick(uv.y)));\n      } else {\n        color = texture2D(inputImageTexture4, vec2(pick(uv.x), pick(uv.y)));\n        float gray = color.r * 0.6 + color.g * 0.3 + color.b * 0.1;\n        color = vec4(gray, gray, gray, 1.0);\n      }\n    }\n    } gl_FragColor = color;\n}\n";
    }

    @Override // p149l.mcj, p149l.ccj
    public synchronized void handleSizeChange() {
        super.handleSizeChange();
        releasePalaceFrameBuffer();
    }

    public rbj initFrameBuffer(rbj rbjVar) {
        if (rbjVar != null) {
            rbjVar.m178606e();
        }
        rbj rbjVar2 = new rbj(getWidth(), getHeight());
        rbjVar2.m178603b(getWidth(), getHeight());
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            return rbjVar2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        ysf.m215904a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
        return null;
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.mTexture0Handle = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture1");
        this.mTexture1Handle = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture2");
        this.mTexture2Handle = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture3");
        this.mTexture3Handle = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture4");
        this.orderHandle = GLES20.glGetUniformLocation(this.programHandle, "order");
        this.backgroundHandle = GLES20.glGetUniformLocation(this.programHandle, "background");
        this.firstHandle = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_FIRST_TIME);
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.mTexture0);
        GLES20.glUniform1i(this.mTexture0Handle, 1);
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, this.mTexture1);
        GLES20.glUniform1i(this.mTexture1Handle, 2);
        GLES20.glActiveTexture(33987);
        GLES20.glBindTexture(3553, this.mTexture2);
        GLES20.glUniform1i(this.mTexture2Handle, 3);
        GLES20.glActiveTexture(33988);
        GLES20.glBindTexture(3553, this.mTexture3);
        GLES20.glUniform1i(this.mTexture3Handle, 4);
        GLES20.glUniform1f(this.orderHandle, this.mOrder);
        GLES20.glUniform1f(this.backgroundHandle, this.mBackground);
        GLES20.glUniform1f(this.firstHandle, this.mFirst);
    }

    @Override // p149l.mcj, p149l.ccj
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        releasePalaceFrameBuffer();
    }

    public void setTimeInterval(long j) {
        this.mTimeInterval = j;
    }

    @Override // p149l.uff0, p149l.AbstractC17477i4, p149l.q7m
    public void setTimeStamp(long j) {
        super.setTimeStamp(j);
    }
}
