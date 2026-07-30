package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class pdj0 extends ndj0 {
    protected static final String UNIFORM_TEXELHEIGHT = "texelHeightOffset";
    protected static final String UNIFORM_TEXELWIDTH = "texelWidthOffset";
    protected float texelHeight;
    private int texelHeightHandle;
    protected float texelWidth;
    private int texelWidthHandle;

    @Override // p003l.mcj, p003l.ccj
    public void handleSizeChange() {
        super.handleSizeChange();
        this.texelWidth = 1.0f / getWidth();
        this.texelHeight = 1.0f / getHeight();
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.texelWidthHandle = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_TEXELWIDTH);
        this.texelHeightHandle = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_TEXELHEIGHT);
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        if (getCurrentPass() == 1) {
            this.texelWidth = 1.0f / getWidth();
            this.texelHeight = 0.0f;
        } else {
            this.texelWidth = 0.0f;
            this.texelHeight = 1.0f / getHeight();
        }
        super.passShaderValues();
        GLES20.glUniform1f(this.texelWidthHandle, this.texelWidth);
        GLES20.glUniform1f(this.texelHeightHandle, this.texelHeight);
    }
}
